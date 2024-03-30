package com.whatsapp.wabloks.commerce.ui.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass17Z;
import X.AnonymousClass2Uv;
import X.C007103b;
import X.C128206Bi;
import X.C19600wD;
import X.C20810yC;
import X.C28201Rs;
import X.C36321k7;
import X.C36441kJ;
import X.C95474lE;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class WaBkExtensionsLayoutViewModel extends C95474lE {
    public final C19600wD A00;
    public final C20810yC A01;
    public final C28201Rs A02 = C36441kJ.A0t();
    public final AnonymousClass17Z A03;
    public final C28201Rs A04 = C36441kJ.A0t();
    public final C28201Rs A05 = C36441kJ.A0t();
    public final C28201Rs A06 = C36441kJ.A0t();
    public final C28201Rs A07 = C36441kJ.A0t();
    public final C28201Rs A08 = C36441kJ.A0t();

    public final void A0V(AnonymousClass2Uv r5, String str, String str2, String str3, boolean z) {
        int i;
        Map map;
        Set keySet;
        C28201Rs r3;
        C28201Rs r32;
        Object r0;
        Map map2;
        Collection values;
        if (str2 == null || str2.length() == 0) {
            String str4 = null;
            if (str != null) {
                r32 = this.A07;
                r0 = C36441kJ.A19(str, "extensions-invalid-flow-token-error");
            } else {
                if (!(r5 == null || (map2 = r5.A00) == null || (values = map2.values()) == null || values.isEmpty())) {
                    str4 = C007103b.A0H(values).toString();
                }
                if (!this.A00.A09()) {
                    i = R.string.f12nameremoved;
                    str3 = "extensions-no-network-error";
                } else if (r5 == null || (map = r5.A00) == null || (keySet = map.keySet()) == null || !AnonymousClass000.A1Z(keySet, 2498058)) {
                    i = R.string.f12nameremoved;
                } else {
                    i = R.string.f12nameremoved;
                    str3 = "extensions-timeout-error";
                }
                AnonymousClass17Z r02 = AnonymousClass17Z.$redex_init_class;
                if (z) {
                    r3 = this.A02;
                } else {
                    r3 = this.A06;
                }
                r0 = new C128206Bi(i, str3, str4);
            }
        } else {
            if (z) {
                r32 = this.A08;
            } else {
                r32 = this.A05;
            }
            r0 = C36441kJ.A19(str2, str3);
        }
        r32.A0D(r0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkExtensionsLayoutViewModel(C19600wD r2, AnonymousClass17Z r3, C20810yC r4, AnonymousClass005 r5) {
        super(r5);
        C36321k7.A18(r5, r2, r3, r4);
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
