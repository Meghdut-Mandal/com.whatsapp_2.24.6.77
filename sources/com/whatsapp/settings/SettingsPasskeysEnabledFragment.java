package com.whatsapp.settings;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3EF;
import X.AnonymousClass3Y8;
import X.AnonymousClass4HA;
import X.C019308f;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import X.C84464Di;
import X.C84474Dj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPasskeysEnabledFragment extends Hilt_SettingsPasskeysEnabledFragment {
    public AnonymousClass3EF A00;
    public final AnonymousClass00T A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0B(inflate);
        TextEmojiLabel A0R = C36361kB.A0R(inflate, R.id.passkey_create_screen_info_text);
        AnonymousClass3EF r1 = this.A00;
        if (r1 != null) {
            r1.A00(A0a(), A0R);
            AnonymousClass3Y8.A00(C36361kB.A0F(inflate, R.id.settings_passkeys_box_revoke_button), this, 11);
            return inflate;
        }
        throw C36331k8.A0d("descriptionHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.settings.SettingsPasskeysEnabledFragment r7, X.C023509x r8) {
        /*
            boolean r0 = r8 instanceof X.C82753zD
            if (r0 == 0) goto L_0x008e
            r6 = r8
            X.3zD r6 = (X.C82753zD) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r4) goto L_0x0095
            java.lang.Object r3 = r6.L$1
            java.lang.Object r2 = r6.L$0
            X.3Ec r2 = (X.C61943Ec) r2
            X.AnonymousClass0AN.A00(r1)
        L_0x0026:
            X.97X r1 = (X.AnonymousClass97X) r1
            boolean r0 = r1 instanceof X.C182148oc
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r0 = 15
            r2.A00(r0, r1)
            r1 = 30
        L_0x0039:
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.C132926Vv.A01(r0)
        L_0x0041:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0044:
            boolean r0 = r1 instanceof X.C182138ob
            if (r0 == 0) goto L_0x0041
            X.8ob r1 = (X.C182138ob) r1
            java.lang.Object r1 = r1.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/error"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 16
            r2.A00(r0, r1)
            r1 = 29
            goto L_0x0039
        L_0x005b:
            X.AnonymousClass0AN.A00(r1)
            java.lang.String r0 = "SettingsPasskeys/revokePasskey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00T r1 = r7.A01
            X.3Ec r2 = X.C36381kD.A0g(r1)
            X.01I r3 = r7.A0h()
            if (r3 != 0) goto L_0x0074
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0074:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r3, r0)
            if (r3 == 0) goto L_0x0041
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            r6.L$0 = r2
            r6.L$1 = r3
            r6.label = r4
            java.lang.Object r1 = r0.A0T(r6)
            if (r1 != r5) goto L_0x0026
            return r5
        L_0x008e:
            X.3zD r6 = new X.3zD
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysEnabledFragment.A00(com.whatsapp.settings.SettingsPasskeysEnabledFragment, X.09x):java.lang.Object");
    }

    public SettingsPasskeysEnabledFragment() {
        C019308f A1A = C36441kJ.A1A(SettingsPasskeysViewModel.class);
        this.A01 = C36441kJ.A0a(new C84464Di(this), new C84474Dj(this), new AnonymousClass4HA(this), A1A);
    }
}
