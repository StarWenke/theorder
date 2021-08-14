package com.wk.service.impl;

import com.wk.dto.CartDTO;
import com.wk.entity.Commodity;
import com.wk.enums.ResultEnum;
import com.wk.exception.SellException;
import com.wk.mapper.CommodityMapper;
import com.wk.repository.CommodityRepository;
import com.wk.service.CommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;

//    @Override
//    public Commodity findOne(Integer commodityId) {
//        return null;
//    }

//    @Override
//    public List<Commodity> findUpAll() {
//        return null;
//    }
//
//    @Override
//    public Page<Commodity> findAll(Pageable pageable) {
//        return null;
//    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

        for (CartDTO cartDTO: cartDTOList){
            Commodity commodity = commodityRepository.findBycId(cartDTO.getCommodityId());
            if (commodity == null){
                throw new SellException(ResultEnum.COMMODITY_NOT_EXIST);
            }
            Integer result = commodity.getCNum() + cartDTO.getCommodityQuantity();
            commodity.setCNum(result);
            commodityRepository.save(commodity);
        }
    }


}
