package com.prapthi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prapthi.entity.Prapthi;

@Repository
public interface IPrapthirepository extends JpaRepository<Prapthi,Integer >{
	//List<Prapthi> getsupplierdata(String SUPPLIER,String BillNO);

}
