/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generator;

import instances.Moods;
import instances.ResponseHandler;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Fairlyn
 */
public class ReadFromXML {

    String query, response, location;
    int i = 1;
    ArrayList<ResponseHandler> upBeat = new ArrayList<>();
    ResponseHandler resp = new ResponseHandler();

    public void loadXML() throws JAXBException {
        System.out.println("loading");
        parseXmlFile();
    }

    private void parseXmlFile() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Moods.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            //We had written this file in marshalling example
        //mood is the new Arraylist
        Moods mood = (Moods) jaxbUnmarshaller.unmarshal(new File("build/classes/Generator/Mainxml.xml"));
        System.out.println("number of responses is: " + mood.getResponseHandler());
        for (ResponseHandler resp : mood.getResponseHandler()) {
            System.out.println("query: " + resp.getQuery());
            System.out.println("answer: " + resp.getResponses());
        }

    }
}
