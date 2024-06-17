package br.com.helpticket.dto;

import br.com.helpticket.model.User;
import br.com.helpticket.model.UserAtivo;

import java.util.UUID;

public record UserExibicaoDto(
        UUID id,
        String name,
        String email,
        UserAtivo userAtivo
)
{
    public UserExibicaoDto(User user){
        this(user.getId(), user.getName(), user.getEmail(), user.getUserAtivo());
    }
}
