package X;

import androidx.preference.Preference;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsChatHistoryFragment;

/* renamed from: X.6iJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138556iJ implements C22848Awx {
    public final /* synthetic */ SettingsChatHistoryFragment A00;

    public /* synthetic */ C138556iJ(SettingsChatHistoryFragment settingsChatHistoryFragment) {
        this.A00 = settingsChatHistoryFragment;
    }

    public final boolean BdH(Preference preference) {
        SettingsChatHistoryFragment settingsChatHistoryFragment = this.A00;
        if (settingsChatHistoryFragment.A07.A02()) {
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            C100834vr r0 = settingsChatHistoryFragment.A00;
            if (r0 != null) {
                r0.BO5(i);
            }
            return true;
        }
        AnonymousClass3OM r1 = new AnonymousClass3OM(settingsChatHistoryFragment.A1D());
        r1.A08 = true;
        settingsChatHistoryFragment.startActivityForResult(AnonymousClass3OM.A02(r1, "com.whatsapp.contact.picker.ContactPicker"), 10);
        return true;
    }
}
