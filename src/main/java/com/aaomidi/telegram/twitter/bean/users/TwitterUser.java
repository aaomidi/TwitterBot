package com.aaomidi.telegram.twitter.bean.users;

public class TwitterUser implements User {
    @Override
    public UserType getUserType() {
        return UserType.TWITTER;
    }
}
