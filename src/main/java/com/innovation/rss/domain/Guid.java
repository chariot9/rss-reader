package com.innovation.rss.domain;

import lombok.Getter;

@Getter
public class Guid {

    private String _isLink;
    private String __text;

    @Override
    public String toString() {
        return "Guid{" +
                "_isLink='" + _isLink + '\'' +
                ", __text='" + __text + '\'' +
                '}';
    }
}
