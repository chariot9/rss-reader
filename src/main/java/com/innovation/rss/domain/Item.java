package com.innovation.rss.domain;

import lombok.Getter;

@Getter
public class Item {

    private String title;
    private String link;
    private String description;
    private String pubDate;
    private Guid guid;
    private Category category;
    private Enclosure enclosure;

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", guid=" + guid +
                ", category=" + category +
                ", enclosure=" + enclosure +
                '}';
    }
}
