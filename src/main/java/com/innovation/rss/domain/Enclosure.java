package com.innovation.rss.domain;

import lombok.Getter;

@Getter
public class Enclosure {

    private String _url;
    private String _type;
    private String _length;

    @Override
    public String toString() {
        return "Enclosure{" +
                "_url='" + _url + '\'' +
                ", _type='" + _type + '\'' +
                ", _length='" + _length + '\'' +
                '}';
    }
}
