package com.jxnu.service;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface IFileService {
    List<String>  uploadFile(MultipartFile[] files) throws IOException;
}
