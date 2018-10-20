package com.innovation.rss.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Feed {

    private String title;
    private String link;
    private String description;
    private String language;
    private String copyright;
    private String pubDate;

    private List<Item> items;
}
