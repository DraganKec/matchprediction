package org.mp.xmlparser;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;

/**
 * Created by Dragan on 30/01/17.
 */
@Component
public class XmlParser {

    public void Parse(String xmlUrl)  {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(xmlUrl).openStream());

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("event");


            for (int i= 0; i < nList.getLength(); i++) {

                Node nNode = nList.item(i);

                System.out.println("Current Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Staff id : " + eElement.getAttribute("id"));
                    System.out.println("Staff id : " + eElement.getAttribute("name"));
//                    System.out.println("Last Name : " + eElement.getElementsByTagName("start_date").item(0).getTextContent());
//                    System.out.println("Nick Name : " + eElement.getElementsByTagName("live_id").item(0).getTextContent());

                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
