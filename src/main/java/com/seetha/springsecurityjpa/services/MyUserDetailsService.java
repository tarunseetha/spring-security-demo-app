package com.seetha.springsecurityjpa.services;

import com.seetha.springsecurityjpa.entity.UserMaster;
import com.seetha.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<UserMaster> userMaster = userRepository.findByUserName(userName);

        userMaster.orElseThrow(() -> new UsernameNotFoundException("User not found:" + userName));

        return userMaster.map(MyUserDetails::new).get();
    }
}
