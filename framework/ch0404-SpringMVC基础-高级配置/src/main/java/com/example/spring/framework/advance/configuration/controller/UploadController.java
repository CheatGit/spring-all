package com.example.spring.framework.advance.configuration.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * ①使用MultipartFile file 接受上传的文件。
 * ②使用FileUtils. writeByteArrayToFile 快速写文件到磁盘。
 * Author: 王俊超
 * Date: 2017-07-12 07:56
 * All Rights Reserved !!!
 */
@Controller
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody
    String upload(MultipartFile file) { // 1
        try {
            FileUtils.writeByteArrayToFile(
                    new File("e:/upload/" + file.getOriginalFilename()),
                    file.getBytes()); // 2
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
