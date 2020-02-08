package otherTutorials.interfaceTutorials;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainProcessorInterface {
    private static void main(String[] args) throws MalformedURLException, IOException {
        URLProcessor urlProcessor = new URLProcessorImpl();

        urlProcessor.process(new URL("http://jenkov.com"));
    }
}