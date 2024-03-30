package com.whatsapp.payments.ui.mapper.register;

import X.AE0;
import X.AnonymousClass00C;
import X.AnonymousClass08X;
import X.AnonymousClass8gN;
import X.B7X;
import X.C135086c7;
import X.C146356vT;
import X.C165617ti;
import X.C19730wQ;
import X.C200169gl;
import X.C28201Rs;
import X.C36321k7;
import X.C36361kB;
import X.C36441kJ;
import android.app.Application;
import com.whatsapp.Me;
import com.whatsapp.R;

public final class IndiaUpiMapperLinkViewModel extends AnonymousClass08X {
    public AE0 A00;
    public C19730wQ A01;
    public final Application A02;
    public final AnonymousClass8gN A03;
    public final C200169gl A04;
    public final C28201Rs A05 = C36441kJ.A0t();
    public final String A06;
    public final String A07;
    public final String A08;

    public final void A0S(boolean z) {
        String str;
        String str2;
        AnonymousClass8gN r4 = this.A03;
        AE0 ae0 = this.A00;
        String A0E = ae0.A0E();
        if (A0E == null) {
            A0E = "";
        }
        C135086c7 A082 = ae0.A08();
        C146356vT A002 = C146356vT.A00();
        Class<String> cls = String.class;
        C19730wQ r0 = this.A01;
        r0.A0G();
        Me me = r0.A00;
        if (me != null) {
            str = me.number;
        } else {
            str = null;
        }
        C135086c7 A0P = C165617ti.A0P(A002, cls, str, "upiAlias");
        if (z) {
            str2 = "port";
        } else {
            str2 = "add";
        }
        r4.A01(A082, A0P, new B7X(this, 1), A0E, "mobile_number", str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiMapperLinkViewModel(Application application, C19730wQ r3, AE0 ae0, AnonymousClass8gN r5, C200169gl r6) {
        super(application);
        C36321k7.A11(application, ae0, r3);
        AnonymousClass00C.A0D(r6, 5);
        this.A02 = application;
        this.A00 = ae0;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = C36361kB.A0m(application, R.string.f12nameremoved);
        this.A06 = C36361kB.A0m(application, R.string.f12nameremoved);
        this.A08 = C36361kB.A0m(application, R.string.f12nameremoved);
    }
}
