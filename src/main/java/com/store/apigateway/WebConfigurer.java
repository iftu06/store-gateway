//package com.store.apigateway;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.config.CorsRegistry;
//import org.springframework.web.reactive.config.EnableWebFlux;
//import org.springframework.web.reactive.config.WebFluxConfigurer;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import org.springframework.web.server.WebExceptionHandler;
//import reactor.core.publisher.Mono;
//
//import java.net.URI;
//import java.util.Optional;
//
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RouterFunctions.route;
//
//
///**
// * Configuration of web application with Servlet 3.0 APIs.
// */
//@EnableWebFlux
//@Configuration
//public class WebConfigurer implements WebFluxConfigurer {
//
//    private final Logger log = LoggerFactory.getLogger(WebConfigurer.class);
//
//    @Bean
//    RouterFunction<ServerResponse> routerFunction(GatewayHandler gatewayHandler) {
//        return route(GET("/promoter/facebook/login"), gatewayHandler::getPrivate);
//    }
//
//    @Component
//    class GatewayHandler {
//
//        public Mono<ServerResponse> getPrivate(ServerRequest serverRequest) {
//            Optional<String> code = serverRequest.queryParam("code");
//            String token = serverRequest.headers().firstHeader("Authorization");
////            WebClient.RequestBodySpec spec = (WebClient.RequestBodySpec) WebClient.builder().build().get()
////                    .uri(uriBuilder -> {
////                        return uriBuilder
////                                .scheme("http")
////                                .host("localhost:8095")
////                                .path("/promoter/facebook/login")
////                                .queryParam("code", code.get())
////                                .build();
////                    });
//
//            WebClient.RequestBodySpec spec = (WebClient.RequestBodySpec) WebClient.builder().build().get()
//                    .uri("http://localhost:8095/promoter/facebook/login?code="+code.get());
//           return  spec.retrieve()
//                    .bodyToMono(Object.class)
//                    .flatMap(o -> ServerResponse.temporaryRedirect(URI.create("/media")).build());
////            return ServerResponse.temporaryRedirect(URI.create("/media")).build();
//        }
//
//
//    }
//
//}
