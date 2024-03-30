package com.whatsapp.settings;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3EF;
import X.AnonymousClass3Y8;
import X.AnonymousClass4H9;
import X.C007403e;
import X.C019308f;
import X.C222013h;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36441kJ;
import X.C61833Dp;
import X.C84444Dg;
import X.C84454Dh;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPasskeysDisabledFragment extends Hilt_SettingsPasskeysDisabledFragment {
    public C61833Dp A00;
    public AnonymousClass3EF A01;
    public C007403e A02;
    public final AnonymousClass00T A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0B(inflate);
        TextEmojiLabel A0R = C36361kB.A0R(inflate, R.id.passkey_create_screen_info_text);
        AnonymousClass3EF r1 = this.A01;
        if (r1 != null) {
            r1.A00(A0a(), A0R);
            AnonymousClass3Y8.A00(C36361kB.A0F(inflate, R.id.passkey_create_screen_create_button), this, 10);
            if (C222013h.A07) {
                C36381kD.A18(inflate, R.id.passkey_create_screen_wrapper);
                C36341k9.A10(inflate, R.id.passkey_create_screen_passkeys_alt, 0);
            }
            return inflate;
        }
        throw C36331k8.A0d("descriptionHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.settings.SettingsPasskeysDisabledFragment r6, X.C023509x r7) {
        /*
            boolean r0 = r7 instanceof X.C82743zC
            if (r0 == 0) goto L_0x0076
            r5 = r7
            X.3zC r5 = (X.C82743zC) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x007c
            java.lang.Object r1 = r5.L$1
            java.lang.Object r6 = r5.L$0
            X.AnonymousClass0AN.A00(r4)
        L_0x0024:
            boolean r0 = r4 instanceof X.C182148oc
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "SettingsPasskeys/createPasskey/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 28
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r1, (int) r2)
        L_0x0034:
            X.C132926Vv.A01(r0)
        L_0x0037:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x003a:
            boolean r0 = r4 instanceof X.C182138ob
            if (r0 == 0) goto L_0x0037
            r0 = 48
            X.3vC r0 = X.C80313vC.A00(r6, r4, r0)
            goto L_0x0034
        L_0x0045:
            X.AnonymousClass0AN.A00(r4)
            java.lang.String r0 = "SettingsPasskeys/createPasskey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r1 = r6.A0h()
            if (r1 != 0) goto L_0x0058
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0058:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r1, r0)
            X.01L r1 = (X.AnonymousClass01L) r1
            if (r1 == 0) goto L_0x0037
            X.00T r0 = r6.A03
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            r5.L$0 = r6
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r4 = r0.A0S(r1, r5)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0076:
            X.3zC r5 = new X.3zC
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysDisabledFragment.A00(com.whatsapp.settings.SettingsPasskeysDisabledFragment, X.09x):java.lang.Object");
    }

    public SettingsPasskeysDisabledFragment() {
        C019308f A1A = C36441kJ.A1A(SettingsPasskeysViewModel.class);
        this.A03 = C36441kJ.A0a(new C84444Dg(this), new C84454Dh(this), new AnonymousClass4H9(this), A1A);
    }
}
