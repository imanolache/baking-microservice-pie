package org.bakingpie.book.client;

import feign.Feign;
import feign.Logger;
import feign.slf4j.Slf4jLogger;
import org.bakingpie.book.client.api.NumbersApi;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
// tag::adocSnippet[]
public class ApiClient {
    // tag::adocSkip[]
    public interface Api {
    }
    // end::adocSkip[]

    private String basePath = "http://localhost:8084/number-api/api";

    public NumbersApi buildNumberApiClient() {
        return Feign.builder()
            .logger(new Slf4jLogger(NumbersApi.class))
            .logLevel(Logger.Level.FULL)
            .target(NumbersApi.class, basePath);
    }
}
// end::adocSnippet[]
