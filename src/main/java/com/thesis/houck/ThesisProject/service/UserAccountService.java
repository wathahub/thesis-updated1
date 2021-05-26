package com.thesis.houck.ThesisProject.service;

import com.thesis.houck.ThesisProject.beans.LoginBean;
import com.thesis.houck.ThesisProject.beans.UserAccountBean;
import com.thesis.houck.ThesisProject.model.UserAccount;

public interface UserAccountService {

    public UserAccount createUserAccount(UserAccountBean userAccountBean);

    public Boolean findByUsernameAndPassword(LoginBean bean);

}
