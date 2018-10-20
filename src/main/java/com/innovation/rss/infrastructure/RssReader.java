package com.innovation.rss.infrastructure;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;

public class RssReader implements Reader, RssHelper {

    private UrlGenerator urlGenerator;

    public RssReader(UrlGenerator urlGenerator) {
        this.urlGenerator = urlGenerator;
    }

    public void read() {
        // TODO: Call readURL and get data from RSS, pass to object
    }

    public InputStream readUrl() throws IOException {
        return urlGenerator.generate().openStream();
    }

    public String getCharacter(XMLEvent event, XMLEventReader eventReader) throws XMLStreamException {
        String result = "";
        event = eventReader.nextEvent();
        if (event instanceof Characters) {
            result = event.asCharacters().getData();
        }
        return result;
    }
}
