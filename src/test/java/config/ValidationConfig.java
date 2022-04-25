package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:validation.properties"
})
public interface ValidationConfig extends Config {

    @Key("app")
    String app();

    @Key("url")
    String url();

    @Key("user")
    String user();

    @Key("password")
    String password();

}
