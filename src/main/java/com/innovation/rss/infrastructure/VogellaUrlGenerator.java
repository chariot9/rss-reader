package com.innovation.rss.infrastructure;

import java.net.MalformedURLException;
import java.net.URL;

public class VogellaUrlGenerator implements UrlGenerator {

    public URL generate() throws MalformedURLException {
        return new URL("http://www.vogella.com/article.rss");
    }
}
