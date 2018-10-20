package com.innovation.rss.infrastructure;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;

public interface RssHelper {

    InputStream readUrl() throws IOException;

    String getCharacter(XMLEvent event, XMLEventReader eventReader) throws XMLStreamException;

}
