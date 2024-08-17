package com.prapthi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prapthi.entity.Prapthi;
import com.prapthi.service.IPrapthiservice;

@RestController
@RequestMapping
public class PrapthiController {
	@Autowired
	private IPrapthiservice prapthiservice;
	@PostMapping(value = "get",consumes = "multipart/form-data")
	public ResponseEntity<List<Prapthi>> readFile(
			@RequestParam String supplier,
			@RequestParam Character delimeter ,
			@RequestParam String fileType,
			@RequestParam("file") MultipartFile file) throws IOException{
		List<Prapthi> response = prapthiservice.readFile(supplier, delimeter, fileType, file);
		return new ResponseEntity<List<Prapthi>>(response,HttpStatus.OK);
		
	}
}
