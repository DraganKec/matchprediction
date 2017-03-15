package org.mp.controller;

import org.mp.xmlparser.XmlParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dragan on 25/01/17.
 */

@RestController
public class Parser {


    private XmlParser xmlParser;

    @Autowired
    public Parser(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @RequestMapping("/getXml")
    public void  GetXml() {
    xmlParser.Parse("http://xml.cdn.betclic.com/odds_en.xml");
    }
}
