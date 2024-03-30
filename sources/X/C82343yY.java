package X;

import com.whatsapp.settings.SettingsNetworkUsage;
import java.util.TimerTask;

/* renamed from: X.3yY  reason: invalid class name and case insensitive filesystem */
public class C82343yY extends TimerTask {
    public final /* synthetic */ SettingsNetworkUsage A00;

    public C82343yY(SettingsNetworkUsage settingsNetworkUsage) {
        this.A00 = settingsNetworkUsage;
    }

    public void run() {
        SettingsNetworkUsage settingsNetworkUsage = this.A00;
        settingsNetworkUsage.A00.post(new C81163wZ((Object) settingsNetworkUsage, 27));
    }
}
