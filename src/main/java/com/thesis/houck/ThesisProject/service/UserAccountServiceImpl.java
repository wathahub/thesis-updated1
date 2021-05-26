package com.thesis.houck.ThesisProject.service;

import com.thesis.houck.ThesisProject.beans.LoginBean;
import com.thesis.houck.ThesisProject.beans.UserAccountBean;
import com.thesis.houck.ThesisProject.model.UserAccount;
import com.thesis.houck.ThesisProject.repository.UserAccountRepository;
import com.thesis.houck.ThesisProject.specification.UserAccountSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserAccount createUserAccount(UserAccountBean userAccountBean) {
        UserAccount user = new UserAccount();
        user.setFirstName(userAccountBean.getFirstName());
        user.setMiddleName(userAccountBean.getMiddleName());
        user.setLastName(userAccountBean.getLastName());
        user.setUsername(userAccountBean.getUsername());
        user.setPassword(userAccountBean.getPassword());
        user.setPhone(userAccountBean.getPhone());
        user.setEmail(userAccountBean.getEmail());
        return userAccountRepository.save(user);
    }

    @Override
    public Boolean findByUsernameAndPassword(LoginBean bean) {
        List<UserAccount> userAccountList = userAccountRepository.findAll(UserAccountSpecification.findByUsernameAndPassword(bean.getUsername(), bean.getPassword()));
        return userAccountList.isEmpty() ? false : true;
    }


}
