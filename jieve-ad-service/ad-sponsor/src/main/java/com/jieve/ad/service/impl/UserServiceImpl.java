package com.jieve.ad.service.impl;


import com.jieve.ad.constant.Constants;
import com.jieve.ad.dao.AdUserRepository;
import com.jieve.ad.entity.AdUser;
import com.jieve.ad.exception.AdException;
import com.jieve.ad.service.IUserService;
import com.jieve.ad.utils.CommonUtils;
import com.jieve.ad.vo.CreateUserRequest;
import com.jieve.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jieve
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    private final AdUserRepository userRepository;

    @Autowired
    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {

        if (!request.validate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser oldUser = userRepository.findByUsername(request.getUsername());

        if (null != oldUser) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser newUser = userRepository.save(new AdUser(request.getUsername(), CommonUtils.md5(request.getUsername())));

        return new CreateUserResponse(newUser.getId(), newUser.getName(), newUser.getToken(), newUser.getCreateTime(),newUser.getUpdateTime());
    }
}
