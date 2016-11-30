package ua.tests.raml;


import org.raml.v2.api.RamlModelBuilder;
import org.raml.v2.api.RamlModelResult;

public class Main {

    public static void main(String... args) {
        RamlModelResult ramlModelResult = new RamlModelBuilder()
                .buildApi("api.raml");

        if (ramlModelResult.hasErrors()) {
            throw new RuntimeException();
        }
    }
}
