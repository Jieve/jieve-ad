package com.jieve.ad.constant;

import lombok.Getter;

/**
 * @author Jieve
 */
@Getter
public enum MaterialType {

    JPG(1,"jpg"),
    BMP(2,"bmp"),

    MP4(3,"mp4"),
    AVI(4,"avi"),

    TXT(5,"txt")
    ;

    private Integer type;

    private String desc;

    MaterialType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
