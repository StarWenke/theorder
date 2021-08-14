package com.wk.repository;

import com.wk.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CommodityRepository extends JpaRepository<Commodity, String> {
    Commodity findBycId(Integer cId);
//    List<Commodity> findByStatus(Integer orderStatus);
}
