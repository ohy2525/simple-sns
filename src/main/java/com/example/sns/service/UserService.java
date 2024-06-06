package com.example.sns.service;

import com.example.sns.exception.SnsApplicationException;
import com.example.sns.model.Entity.UserEntity;
import com.example.sns.model.User;
import com.example.sns.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityRepository userEntityRepository;

    public User join(String userName, String password) {
        // username 중복 체크
        Optional<UserEntity> userEntity = userEntityRepository.findByUserName(userName);

        // user 등록
        userEntityRepository.save(new UserEntity());
        return new User();
    }

    // jwt 토큰 반환
    public String login(String userName, String password) {
        // 회원가입 여부 체크
        UserEntity userEntity = userEntityRepository.findByUserName(userName).orElseThrow(() -> new SnsApplicationException());

        // 비밀번호 체크
        if (!userEntity.getPassword().equals(password)) {
            throw new SnsApplicationException();
        }

        // 토큰 생성

        return "";
    }
}
