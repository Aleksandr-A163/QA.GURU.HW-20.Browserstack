package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:Auth.properties"
})
public interface AuthConfig extends Config {
    String username();
    String password();
}
