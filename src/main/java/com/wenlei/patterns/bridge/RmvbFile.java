package com.wenlei.patterns.bridge;

/**
 * @version v1.0
 * @ClassName: RmvbFile
 * @Description: rmvb视频文件（具体的实现化角色）
 * @Author: wxl
 */
public class RmvbFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("rmvb视频文件 ：" + fileName);
    }
}
