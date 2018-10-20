package com.innovation.rss.infrastructure;

import java.net.MalformedURLException;
import java.net.URL;

public interface UrlGenerator {

    URL generate() throws MalformedURLException;
}
