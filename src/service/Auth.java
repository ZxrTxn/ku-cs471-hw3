/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

package service;

import java.util.List;
import java.util.Arrays;

import model.User;

import core.constant.RegEx;

import util.StringUtil;

public class Auth {
    public boolean register(User user) {
        if (StringUtil.isEmpty(user.getName())) {
            throw new IllegalArgumentException("Name should not empty");
        }

        if (StringUtil.isEmpty(user.getEmail())) {
            throw new IllegalArgumentException("Email should not empty");
        }

        if (!user.getName().matches(RegEx.NAME)) {
            throw new IllegalArgumentException("Name is wrong format");
        }

        if (!user.getEmail().matches(RegEx.EMAIL)) {
            throw new IllegalArgumentException("Email is wrong format");
        }

        List<String> notAllowDomains = Arrays.asList("dom1.cc", "dom2.cc", "dom3.cc");

        if (notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }

        if (user.getAge() > 20) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }

        return true;
    }
}
