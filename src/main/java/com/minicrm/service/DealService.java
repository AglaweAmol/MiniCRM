package com.minicrm.service;

import com.minicrm.payload.DealDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DealService {



        DealDTO creatDeal(DealDTO dealDTO);

        DealDTO getDealById(Long id);

        DealDTO updateDealById(DealDTO dealDTO,Long id);

        DealDTO dealDeleteById(Long id);

        Page<DealDTO> getAllDeals(Pageable pageable);
}
