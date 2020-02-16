package com.southwind.repository;

import com.southwind.entity.Admin;
import com.southwind.entity.User;

public interface AdminRepository {
    public Admin login(String username, String password);
}
