package dzwdz.chat_heads.fabric.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dzwdz.chat_heads.config.ChatHeadsConfigData;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ModMenuImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        // Mod Menu 2.0.14+ handles missing classes by disabling the config screen (and printing a warning)
        return parent -> AutoConfig.getConfigScreen(ChatHeadsConfigData.class, parent).get();
    }
}