/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import Generator.ReadFromXML;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Fairlyn
 */
public class testClass {
    public static void main(String [ ] args) throws JAXBException{
        ReadFromXML read = new ReadFromXML();
        read.loadXML();
    }
}
