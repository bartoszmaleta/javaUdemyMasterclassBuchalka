package otherTutorials.abstractionTutorials;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainProcessorURL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URLProcessorImpl urlProcessor = new URLProcessorImpl();

        urlProcessor.process(new URL("http://jenkov.com"));
    }
}