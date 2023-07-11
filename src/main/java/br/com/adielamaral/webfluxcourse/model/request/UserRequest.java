package br.com.adielamaral.webfluxcourse.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
