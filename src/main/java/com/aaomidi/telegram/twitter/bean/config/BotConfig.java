package com.aaomidi.telegram.twitter.bean.config;

import lombok.Data;

@Data
public class BotConfig {
    private final String telegramToken;
    private final String ownerID;
}
