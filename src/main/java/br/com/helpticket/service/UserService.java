package br.com.helpticket.service;

import br.com.helpticket.dto.UserExibicaoDto;
import br.com.helpticket.model.User;
import br.com.helpticket.model.UserAtivo;
import br.com.helpticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserExibicaoDto save(User user){

        if(user.getUserAtivo() == null){
            user.setUserAtivo(UserAtivo.ATIVO);
        }
        return new UserExibicaoDto(userRepository.save(user));

    }

    public UserExibicaoDto find(UUID id){
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()){
            return new UserExibicaoDto(userOptional.get());
        }else{
            throw new RuntimeException("Usuário não encontrado");
        }
    }

}
