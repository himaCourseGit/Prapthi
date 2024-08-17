package com.prapthi.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.prapthi.entity.Prapthi;
import com.prapthi.repository.IPrapthirepository;
@Service
public class PrapthiServiceImpl implements IPrapthiservice  {
	@Autowired
private IPrapthirepository   repository;

	@Override
	public List<Prapthi> readFile(String supplier, Character Delimeter, String invoice, MultipartFile file)
			throws IOException {
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
			String line="";
			line=reader.readLine();
			List<Prapthi> prapthi=new ArrayList<>();
			
			while((line=reader.readLine())!=null) {
				String data[]=line.split(""+Delimeter);
				System.out.println(Arrays.toString(data));
				Prapthi prapthi1=new Prapthi();
				prapthi1.setSupplier(data[0]);
	            prapthi1.setBillno(data[1]);
				prapthi1.setDate(data[2]);
				prapthi1.setCompany(data[3]);
				prapthi1.setProduct(data[4]);
				prapthi1.setPacking(data[5]);
				prapthi1.setBatchno(data[6]);
				prapthi1.setExpiry(data[7]);
				prapthi1.setPtr(Double.parseDouble(data[8]));;
				prapthi1.setMrp(Double.parseDouble(data[9]));;
				prapthi1.setDiscount(Double.parseDouble(data[10]));
				prapthi1.setQty(Double.parseDouble(data[11]));
				prapthi1.setFreeqty(Double.parseDouble(data[12]));
				prapthi1.setStock(Double.parseDouble(data[13]));
				prapthi1.setSgst(Double.parseDouble(data[14]));;
	            prapthi1.setCgst(Double.parseDouble(data[15]));
	            prapthi1.setHsncode(Double.parseDouble(data[16]));
	            prapthi.add(prapthi1);
			}
		return repository.saveAll(prapthi);
	}
}

