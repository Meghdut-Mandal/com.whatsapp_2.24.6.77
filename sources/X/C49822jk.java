package X;

import com.whatsapp.R;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2jk  reason: invalid class name and case insensitive filesystem */
public class C49822jk extends C132446Tt {
    public final AtomicBoolean A00 = C36431kI.A1H();
    public final /* synthetic */ SettingsDataUsageActivity A01;

    public C49822jk(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A01 = settingsDataUsageActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.i("settings-data-usage-activity/load storage size task/background");
        if (this.A00.get()) {
            return null;
        }
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        return Long.valueOf(AnonymousClass1V2.A00(settingsDataUsageActivity.A04, settingsDataUsageActivity.A0Q));
    }

    public void A0A() {
        Log.i("settings-data-usage-activity/load storage size task/started");
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        if (settingsDataUsageActivity.A03 == -1) {
            settingsDataUsageActivity.A0D.setText(R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Number number = (Number) obj;
        Log.i("settings-data-usage-activity/load storage size task/fetch completed");
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
            long longValue = number.longValue();
            settingsDataUsageActivity.A03 = longValue;
            AnonymousClass3TF.A05(settingsDataUsageActivity.A0D, settingsDataUsageActivity.A00, longValue);
        }
    }
}
