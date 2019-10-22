package com.in28minutes.springbasics.springin5steps.xml;

import org.springframework.stereotype.Component;

@Component
public class XmlItemDAO {

    XmlJdbcConnectionItem xmlJdbcConnectionItem;

    public XmlJdbcConnectionItem getXmlJdbcConnectionItem() {
        return xmlJdbcConnectionItem;
    }

    public void setXmlJdbcConnectionItem(XmlJdbcConnectionItem xmlJdbcConnectionItem) {
        this.xmlJdbcConnectionItem = xmlJdbcConnectionItem;
    }
}
