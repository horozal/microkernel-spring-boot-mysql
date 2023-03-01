package plugin;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(PluginConfiguration.class)
@Configuration
public @interface Plugin {
	
}