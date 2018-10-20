package com.innovation.rss.domain;

import lombok.Getter;

@Getter
public enum ContentType {

    TITLE("title"),
    DESCRIPTION("description"),
    CHANNEL("channel"),
    LANGUAGE("language"),
    COPYRIGHT("copyright"),
    LINK("link"),
    AUTHOR("author"),
    ITEM("item"),
    PUB_DATE("pubDate"),
    GUID("guid");


    private String type;

    ContentType(String type) {
        this.type = type;
    }
}
