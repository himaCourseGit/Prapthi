package com.prapthi.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.prapthi.entity.Prapthi;
public interface IPrapthiservice {
	public List<Prapthi> readFile(String supplier, Character Delimeter,String invoice, MultipartFile file)throws IOException;
}
