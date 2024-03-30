package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass19A;
import X.AnonymousClass8gC;
import X.AnonymousClass8gD;
import X.AnonymousClass9FX;
import X.AnonymousClass9I1;
import X.AnonymousClass9Q3;
import X.AnonymousClass9YX;
import X.B7M;
import X.B7O;
import X.C001700s;
import X.C135086c7;
import X.C165577te;
import X.C165607th;
import X.C185978vD;
import X.C199919gG;
import X.C200169gl;
import X.C202059ky;
import X.C203399nx;
import X.C206719tr;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class IndiaUpiNumberSettingsViewModel extends AnonymousClass04R {
    public final C001700s A00;
    public final C200169gl A01;

    public IndiaUpiNumberSettingsViewModel(C200169gl r9) {
        AnonymousClass00C.A0D(r9, 1);
        this.A01 = r9;
        C001700s A0S = C36431kI.A0S();
        this.A00 = A0S;
        A0S.A0D(new C199919gG((C202059ky) null, (C202059ky) null, false, false, false, false));
    }

    public final void A0S(C135086c7 r16, C135086c7 r17, C206719tr r18, AnonymousClass8gC r19, String str, String str2) {
        AnonymousClass8gC r0 = r19;
        AnonymousClass00C.A0D(r0, 0);
        C135086c7 r5 = r17;
        C206719tr r3 = r18;
        C36331k8.A1G(r3, 1, r5);
        this.A00.A0D(new C199919gG((C202059ky) null, (C202059ky) null, true, false, false, false));
        String str3 = (String) C135086c7.A00(r5);
        AnonymousClass9FX r13 = new AnonymousClass9FX(this);
        AnonymousClass00C.A0D(str3, 3);
        Log.i("PAY: updateAlias called");
        AnonymousClass19A r1 = r0.A02;
        String A09 = r1.A09();
        ArrayList arrayList = C185978vD.A00;
        C185978vD r32 = new C185978vD(A09, r0.A04.A01(), C165607th.A0s(r3.A00), r3.A01, C165607th.A0s(r16), str, str3, r3.A03, str2);
        AnonymousClass9YX r12 = r0.A00;
        if (r12 != null) {
            r12.A02("update-alias");
        }
        C203399nx r2 = r32.A00;
        AnonymousClass00C.A08(r2);
        C165577te.A19(r1, new B7M(r0.A00, r0.A01, r0.A03, r12, r13, r32), r2, A09);
    }

    public final void A0T(C135086c7 r17, C206719tr r18, AnonymousClass8gD r19, String str) {
        C206719tr r5 = r18;
        AnonymousClass8gD r8 = r19;
        this.A00.A0D(new C199919gG((C202059ky) null, (C202059ky) null, false, C36341k9.A1a(r8, r5), false, false));
        AnonymousClass9Q3 r9 = new AnonymousClass9Q3(this);
        Log.i("PAY: deregisterAlias called");
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("alias_id", r5.A01, A0I);
        C36381kD.A1M("alias_value", (String) r5.A00.A00, A0I);
        C36381kD.A1M("alias_type", r5.A03, A0I);
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            C36381kD.A1M("vpa_id", str2, A0I);
        }
        C36381kD.A1M("vpa", (String) r17.A00, A0I);
        ArrayList A0I2 = AnonymousClass001.A0I();
        C36381kD.A1M("action", "deregister-alias", A0I2);
        C36381kD.A1M("device_id", r8.A05.A01(), A0I2);
        AnonymousClass9YX A04 = AnonymousClass9I1.A04(r8, "deregister-alias");
        r8.A01.A0H(new B7O(r8.A00, r8.A01, r5, r8.A02, A04, r8, r9), new C203399nx(C203399nx.A04("alias", C165577te.A1a(A0I, 0)), "account", C165577te.A1a(A0I2, 0)), "set", 0);
    }
}
