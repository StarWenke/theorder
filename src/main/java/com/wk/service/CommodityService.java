package com.wk.service;

import com.wk.dto.CartDTO;
import com.wk.entity.Commodity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
public interface CommodityService extends IService<Commodity> {

    //查询单个商品信息
//    Commodity findOne(Integer commodityId);

//    //查询所有在架商品列表，
//    List<Commodity> findUpAll();
//
//    Page<Commodity> findAll(Pageable pageable);

    void increaseStock(List<CartDTO> cartDTOList);
}
