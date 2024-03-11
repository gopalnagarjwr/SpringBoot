package com.fileuplodingproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fileuplodingproject.file.FileProcess;

@RestController
public class FileController {
       
	@Autowired
	private FileProcess fp;
	
	@RequestMapping("/fileUplode")
	public ResponseEntity<String> fileUploding(@RequestParam("file") MultipartFile ml){
		try {
			if(ml.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("file not found!");
			}
			
			boolean fu = fp.fileUplode(ml);
			if(fu) {
				return ResponseEntity.ok("file uploding sucucessfuly...");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something error servers!");
		
	}
	
}
