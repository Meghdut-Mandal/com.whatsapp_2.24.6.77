package com.whatsapp.wabloks.base;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass65A;
import X.C123165w3;
import X.C134906bn;
import X.C28201Rs;
import X.C36441kJ;
import X.C95474lE;

public final class GenericBkLayoutViewModelWithReload extends C95474lE {
    public C123165w3 A00 = null;
    public final C28201Rs A01;
    public final AnonymousClass005 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenericBkLayoutViewModelWithReload(AnonymousClass005 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
        this.A01 = C36441kJ.A0t();
    }

    public void A0T(AnonymousClass65A r14, C134906bn r15, String str, String str2, String str3) {
        if (!this.A02) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            super.A0T(r14, r15, str4, str5, str6);
            this.A00 = new C123165w3(r14, r15, str4, str5, str6);
        }
    }
}
