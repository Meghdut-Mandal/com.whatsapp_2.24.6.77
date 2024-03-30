package X;

import com.whatsapp.R;
import com.whatsapp.settings.SettingsPasskeys;
import com.whatsapp.settings.SettingsPasskeysDisabledFragment;
import com.whatsapp.settings.SettingsPasskeysEnabledFragment;

/* renamed from: X.4LG  reason: invalid class name */
public final class AnonymousClass4LG extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SettingsPasskeys this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LG(SettingsPasskeys settingsPasskeys) {
        super(1);
        this.this$0 = settingsPasskeys;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass02E settingsPasskeysDisabledFragment;
        Boolean bool = (Boolean) obj;
        C36321k7.A1K(bool, "SettingsPasskeys/updated passkeyExists from view model: ", AnonymousClass000.A0u());
        AnonymousClass00C.A0B(bool);
        if (bool.booleanValue()) {
            settingsPasskeysDisabledFragment = new SettingsPasskeysEnabledFragment();
        } else {
            settingsPasskeysDisabledFragment = new SettingsPasskeysDisabledFragment();
        }
        AnonymousClass09Y A0O = C36341k9.A0O(this.this$0);
        A0O.A0B(settingsPasskeysDisabledFragment, R.id.settings_passkeys_fragment);
        A0O.A01();
        return AnonymousClass0AJ.A00;
    }
}
