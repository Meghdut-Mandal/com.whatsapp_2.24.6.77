package X;

import androidx.preference.Preference;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;

public class B8H implements C22848Awx {
    public Object A00;
    public final int A01;

    public B8H(SettingsChatHistoryFragment settingsChatHistoryFragment, int i) {
        this.A01 = i;
        this.A00 = settingsChatHistoryFragment;
    }

    public final boolean BdH(Preference preference) {
        int i;
        int i2 = this.A01;
        C100834vr r1 = ((WaPreferenceFragment) this.A00).A00;
        switch (i2) {
            case 0:
                i = 4;
                break;
            case 1:
                i = 3;
                break;
            default:
                i = 5;
                break;
        }
        AnonymousClass3SJ.A01(r1, i);
        return true;
    }
}
