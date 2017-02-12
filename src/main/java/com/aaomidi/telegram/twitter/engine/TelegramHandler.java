package com.aaomidi.telegram.twitter.engine;

import com.aaomidi.telegram.twitter.TwitterBot;
import pro.zackpollard.telegrambot.api.TelegramBot;

public class TelegramHandler {
    private final TwitterBot instance;
    private final TelegramBot bot;

    public TelegramHandler(TwitterBot instance) {
        this.instance = instance;

        bot = TelegramBot.login(instance.getBotConfig().getTelegramToken());
    }
}
