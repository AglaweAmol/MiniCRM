package com.minicrm.service;

import com.minicrm.payload.DealDTO;

public interface DealService {



        DealDTO creatDeal(DealDTO dealDTO);

        DealDTO getDealById(Long id);

        DealDTO updateDealById(DealDTO dealDTO,Long id);

        DealDTO dealDeleteById(Long id);


}
