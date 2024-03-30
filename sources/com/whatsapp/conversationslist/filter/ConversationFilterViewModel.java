package com.whatsapp.conversationslist.filter;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass54J;
import X.C007103b;
import X.C023409w;
import X.C110495al;
import X.C19460v5;
import X.C19630wG;
import X.C20800yB;
import X.C21000yV;
import X.C28101Ri;
import X.C33271f1;
import com.whatsapp.R;
import java.util.Arrays;
import java.util.List;

public final class ConversationFilterViewModel extends AnonymousClass04R {
    public C110495al A00;
    public C19460v5 A01;
    public final C33271f1 A02;
    public final C19630wG A03;
    public final C28101Ri A04;
    public final AnonymousClass05L A05;
    public final AnonymousClass05K A06;

    public ConversationFilterViewModel(C19460v5 r2, C33271f1 r3, C19630wG r4, C28101Ri r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        AnonymousClass05N A002 = AnonymousClass05E.A00(C023409w.A00);
        this.A05 = A002;
        this.A06 = A002;
    }

    public final void A0S() {
        C19630wG r4 = this.A03;
        String A012 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A012);
        String A013 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A013);
        String A014 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A014);
        String A015 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A015);
        List asList = Arrays.asList(new AnonymousClass54J[]{new AnonymousClass54J("ALL_FILTER", A012), new AnonymousClass54J("UNREAD_FILTER", A013), new AnonymousClass54J("CONTACTS_FILTER", A014), new AnonymousClass54J("GROUP_FILTER", A015)});
        AnonymousClass00C.A08(asList);
        String A016 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A016);
        String A017 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A017);
        String A018 = r4.A01(R.string.f12nameremoved);
        AnonymousClass00C.A08(A018);
        List asList2 = Arrays.asList(new AnonymousClass54J[]{new AnonymousClass54J("ALL_FILTER", A016), new AnonymousClass54J("UNREAD_FILTER", A017), new AnonymousClass54J("GROUP_FILTER", A018)});
        AnonymousClass00C.A08(asList2);
        AnonymousClass05L r3 = this.A05;
        C28101Ri r1 = this.A04;
        if (r1.A00()) {
            if (C20800yB.A01(C21000yV.A01, r1.A00, 7769)) {
                asList = asList2;
            }
        }
        r3.setValue(asList);
    }

    public final void A0T(List list) {
        Object A0M = C007103b.A0M(C007103b.A0V(list));
        C19460v5 r1 = this.A01;
        if (r1.A05() && A0M != null) {
            r1.A02();
            throw new NullPointerException("getPredefinedIdByName");
        }
    }
}
