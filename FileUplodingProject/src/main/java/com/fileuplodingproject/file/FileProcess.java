package com.fileuplodingproject.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileProcess {
//	   String uplode_path="C:\\abc\\SpringBoot\\FileUplodingProject\\src\\main\\resources\\static\\image";
	
	public final String dynamicUploade_path=new ClassPathResource("static/image/").getFile().getAbsolutePath();
	
	public FileProcess()throws IOException {
		
	}
	
	
       public boolean fileUplode(MultipartFile multipartfile) {

    	   boolean f=false;
    	   try {
//    		   Files.copy(multipartfile.getInputStream(), Paths.get(uplode_path+File.separator+multipartfile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
    		   
    		   Files.copy(multipartfile.getInputStream(), Paths.get(dynamicUploade_path+File.separator+multipartfile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
    		   f=true;
    		   
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return f;
       }
}
