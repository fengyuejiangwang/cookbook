package com.jxnu.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import com.jxnu.service.IFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements IFileService {
    @Value("${server.port}")
    private String port;
    private static final String ip = "http://localhost";
    @Override
    public List<String> uploadFile(MultipartFile[] files) throws IOException{
        List<String> urlList = new ArrayList<>();
        for (MultipartFile file : files) {
            //获取源文件名称
            String originalFilename = file.getOriginalFilename();
            //定义文件的唯一标识（前缀）UUID
            String flag = IdUtil.fastSimpleUUID();
            //获取上传的路径
            String rootFilePath = System.getProperty("user.dir") + "/server/src/main/resources/files/" + flag + "_" + originalFilename;
            //把文件写入到上传的路径
            FileUtil.writeBytes(file.getBytes(), rootFilePath);
            //返回结果：url
            String url = ip + ":" + port + "/files/" + flag;
            urlList.add(url);
        }
        return urlList;
        }
}
