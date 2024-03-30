package X;

import com.whatsapp.settings.SettingsDataUsageActivity;
import java.util.TimerTask;

/* renamed from: X.3yX  reason: invalid class name and case insensitive filesystem */
public class C82333yX extends TimerTask {
    public final /* synthetic */ SettingsDataUsageActivity A00;

    public C82333yX(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A00 = settingsDataUsageActivity;
    }

    public void run() {
        SettingsDataUsageActivity settingsDataUsageActivity = this.A00;
        settingsDataUsageActivity.A04.post(new C81163wZ((Object) settingsDataUsageActivity, 25));
    }
}
