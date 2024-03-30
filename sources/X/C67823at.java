package X;

import android.widget.CheckBox;
import com.whatsapp.WaEditText;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;

/* renamed from: X.3at  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67823at implements AnonymousClass04S {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ WaEditText A01;
    public final /* synthetic */ SettingsSetupUserProxyActivity A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C67823at(CheckBox checkBox, WaEditText waEditText, SettingsSetupUserProxyActivity settingsSetupUserProxyActivity, boolean z) {
        this.A01 = waEditText;
        this.A02 = settingsSetupUserProxyActivity;
        this.A00 = checkBox;
        this.A03 = z;
    }

    public final void BTH(Object obj) {
        int intValue;
        String str;
        String str2;
        int i;
        WaEditText waEditText = this.A01;
        SettingsSetupUserProxyActivity settingsSetupUserProxyActivity = this.A02;
        CheckBox checkBox = this.A00;
        boolean z = this.A03;
        Integer A032 = AnonymousClass097.A03(C36421kH.A0Z(waEditText));
        if (A032 == null) {
            C19700wN r2 = settingsSetupUserProxyActivity.A03;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("input: ");
            A0u.append(waEditText.getText());
            r2.A0E("unblocking/changeport failed to parse port as int", AnonymousClass000.A0q(". Verify whether this is a pattern for this locale or device or android version.", A0u), false);
            return;
        }
        boolean isChecked = checkBox.isChecked();
        SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) settingsSetupUserProxyActivity.A05.getValue();
        if (z) {
            i = A032.intValue();
            AnonymousClass3QR A0S = settingsSetupUserProxyViewModel.A0S();
            str = A0S.A02;
            str2 = A0S.A05;
            intValue = A0S.A00;
            isChecked = A0S.A06;
        } else {
            intValue = A032.intValue();
            AnonymousClass3QR A0S2 = settingsSetupUserProxyViewModel.A0S();
            str = A0S2.A02;
            str2 = A0S2.A05;
            i = A0S2.A01;
        }
        SettingsSetupUserProxyViewModel.A01(new AnonymousClass3QR(str, str2, intValue, i, isChecked), settingsSetupUserProxyViewModel);
    }
}
