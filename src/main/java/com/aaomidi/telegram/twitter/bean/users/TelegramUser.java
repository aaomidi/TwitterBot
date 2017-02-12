package com.aaomidi.telegram.twitter.bean.users;

public class TelegramUser implements User {
    @Override
    public UserType getUserType() {
        return UserType.TELEGRAM;
    }
}
