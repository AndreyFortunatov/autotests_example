package helpers;

public class Environment {

    public final static String
            isHeadless = System.getProperty("isHeadless", "true"),
            selenoid_url = System.getProperty("selenoid_url"),
            yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru/"),
            yandexMarketItemName = System.getProperty("yandexMarketItem", "iphone"),
            instagramUrl = System.getProperty("instagramUrl", "https://www.instagram.com/"),
            instagramLogin = System.getProperty("instagramLogin"),
            instagramPassword = System.getProperty("instagramPass"),
            tinkoffUrl = System.getProperty("tinkoffUrl", "https://tinkoff.ru/"),
            railcontinentUrl = System.getProperty("railcontinentUrl", "https://www.railcontinent.ru/");
}
