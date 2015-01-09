
import instances.ResponseHandler;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExample {

    public static void main(String[] args) {

        ResponseHandler RH = new ResponseHandler();
        RH.setId(1);
        RH.setLocation("outside");
        RH.setQuery("hello");
        RH.setResponse("hey");

        try {

            File file = new File("C:\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ResponseHandler.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(RH, file);
            jaxbMarshaller.marshal(RH, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
