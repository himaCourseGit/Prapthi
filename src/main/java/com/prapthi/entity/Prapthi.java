package com.prapthi.entity;

import org.springframework.data.relational.core.mapping.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="PRAPTHI")
@AllArgsConstructor
@NoArgsConstructor
public class Prapthi {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(value="SUPPLIER")
	private String supplier;
	
	@Column(value="Billing")
	private String billno;
	
	@Column(value="DATE")
	private String date;
	
	@Column(value="COMPANY")
	private String company;
	
	@Column(value="PRODUCT")
	private String product;
	
	@Column(value="PACKING")
	private String packing;
	
	@Column(value="BATCHNO")
	private String batchno;
	
	@Column(value="EXPIRY")
	private String expiry;
	
	@Column(value="P.T.R")
	private Double ptr;
	
	@Column(value="MRP")
	private Double mrp;
	
	@Column(value="DISCOUNT")
	private Double discount;
	
	@Column(value="QTY")
	private Double qty;
	
	@Column(value="FREEQTY")
	private Double freeqty;
	
	@Column(value="STOCK")
	private Double stock;
	
	@Column(value="SGST")
	private Double sgst;
	
	@Column(value="CGST")
	private Double cgst;
	
	@Column(value="HSNCODE")
	private Double hsncode;
}
