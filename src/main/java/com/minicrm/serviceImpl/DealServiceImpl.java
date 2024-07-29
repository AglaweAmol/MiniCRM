package com.minicrm.serviceImpl;


import com.minicrm.entity.Contact;
import com.minicrm.entity.Deals;
import com.minicrm.exception.ResourceNotFoundException;
import com.minicrm.payload.ContactDTO;
import com.minicrm.payload.DealDTO;
import com.minicrm.repository.DealRepository;
import com.minicrm.service.DealService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DealServiceImpl implements DealService {



    private DealRepository dealRepository;

    private ModelMapper mapper;

    public DealServiceImpl(DealRepository dealRepository, ModelMapper mapper) {
        this.dealRepository = dealRepository;
        this.mapper = mapper;
    }

    @Override
    public DealDTO creatDeal(DealDTO dealDTO) {

        Deals deals=mapToEntity(dealDTO);
        Deals createDeals=dealRepository.save(deals);
        DealDTO dealDTO1=mapToDto(createDeals);
        return dealDTO1;
    }

    @Override
    public DealDTO getDealById(Long id) {

        Deals deals=dealRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));

        return mapToDto(deals);
    }

    @Override
    public DealDTO updateDealById(DealDTO dealDTO, Long id) {
        Deals deals=dealRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
       deals.setDealName(dealDTO.getDealName());
       deals.setDealStage(dealDTO.getDealStage());
       deals.setAccountName(dealDTO.getAccountName());
       deals.setAmount(dealDTO.getAmount());
       deals.setClosingDate(dealDTO.getClosingDate());
       deals.setContactName(dealDTO.getContactName());
       deals.setDescription(dealDTO.getDescription());
       deals.setLeadSource(dealDTO.getLeadSource());
       deals.setType(dealDTO.getType());

       Deals updateDeals=dealRepository.save(deals);

        return mapToDto(updateDeals);
    }

    @Override
    public DealDTO dealDeleteById(Long id) {
        Deals deals=dealRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        dealRepository.delete(deals);
        return mapToDto(deals);
    }



    private DealDTO mapToDto(Deals Deals)
    {
        DealDTO dealDTO=mapper.map(Deals,DealDTO.class);
        return dealDTO;
    }

    private Deals mapToEntity(DealDTO dealDTO)
    {
        Deals Deals=mapper.map(dealDTO,Deals.class);
        return  Deals;
    }



}
