package com.aaomidi.telegram.twitter;


import com.aaomidi.telegram.twitter.bean.config.BotConfig;
import com.aaomidi.telegram.twitter.engine.TelegramHandler;
import lombok.Getter;
import twitter4j.Logger;

public class TwitterBot {
    private final static int NUMBER_OF_ARGS = 1;

    @Getter
    private final BotConfig botConfig;
    @Getter
    private final TelegramHandler telegramHandler;

    private Logger log = Logger.getLogger(this.getClass());

    public TwitterBot(String... args) {
        if (args.length != NUMBER_OF_ARGS) {
            log.error("Not enough arguments");
            System.exit(-1);
        }
        String configPath = args[0];

        botConfig = null;
        telegramHandler = new TelegramHandler(this);
    }

    public static void main(String... args) {
        new TwitterBot(args);
    }
}
