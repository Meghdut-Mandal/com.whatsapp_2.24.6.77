package X;

import android.text.TextUtils;
import androidx.preference.Preference;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.settings.SettingsJidNotificationFragment;

public class B86 implements C22847Aww {
    public Object A00;
    public Object A01;
    public final int A02;

    public B86(WaRingtonePreference waRingtonePreference, SettingsJidNotificationFragment settingsJidNotificationFragment, int i) {
        this.A02 = i;
        this.A00 = settingsJidNotificationFragment;
        this.A01 = waRingtonePreference;
    }

    public final boolean BdG(Preference preference, Object obj) {
        if (this.A02 != 0) {
            SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) this.A00;
            WaRingtonePreference waRingtonePreference = (WaRingtonePreference) this.A01;
            String obj2 = obj.toString();
            waRingtonePreference.A01 = obj2;
            waRingtonePreference.A0H(C20600xp.A06(preference.A05, obj2));
            AnonymousClass1CR r2 = settingsJidNotificationFragment.A06;
            AnonymousClass3LI A0d = C36361kB.A0d(settingsJidNotificationFragment.A05, r2);
            if (TextUtils.equals(obj2, A0d.A09)) {
                return true;
            }
            A0d.A09 = obj2;
            AnonymousClass1CR.A06(A0d, r2);
            return true;
        }
        SettingsJidNotificationFragment settingsJidNotificationFragment2 = (SettingsJidNotificationFragment) this.A00;
        WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) this.A01;
        String obj3 = obj.toString();
        waRingtonePreference2.A01 = obj3;
        waRingtonePreference2.A0H(C20600xp.A06(preference.A05, obj3));
        AnonymousClass1CR.A09(settingsJidNotificationFragment2.A06, settingsJidNotificationFragment2.A05.getRawString(), obj3);
        return true;
    }
}
