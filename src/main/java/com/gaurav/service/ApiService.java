package com.gaurav.service;

import com.gaurav.model.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
