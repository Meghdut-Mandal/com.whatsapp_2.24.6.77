package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3gz  reason: invalid class name and case insensitive filesystem */
public final class C71573gz implements C159417jK {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C19630wG A03;
    public final C220412q A04;
    public final AnonymousClass1LW A05;
    public final AnonymousClass17X A06;
    public final C20810yC A07;

    public void BV1() {
        if (this.A07.A0E(6645)) {
            LinkedHashMap A1G = C36431kI.A1G();
            Collection A0F = this.A04.A0F();
            ArrayList A13 = C36411kG.A13(A0F);
            for (Object next : A0F) {
                if (((C65073Qp) next).A06() instanceof AnonymousClass147) {
                    A13.add(next);
                }
            }
            ArrayList<C65073Qp> A0I = AnonymousClass001.A0I();
            for (Object next2 : A13) {
                AnonymousClass141 A0A = this.A01.A0A(((C65073Qp) next2).A06());
                if (A0A != null && A0A.A0G()) {
                    String A0J = A0A.A0J();
                    if (A0J == null || A0J.length() == 0) {
                        A0I.add(next2);
                    }
                }
            }
            for (C65073Qp r1 : A0I) {
                C19630wG r7 = this.A03;
                C19730wQ r4 = this.A00;
                AnonymousClass16D r5 = this.A01;
                AnonymousClass171 r6 = this.A02;
                AnonymousClass17X r8 = this.A06;
                AnonymousClass11F A062 = r1.A06();
                AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A1G.put(AnonymousClass3SP.A00(r4, r5, r6, r7, r8, (AnonymousClass144) A062), r1);
            }
            Iterator A0y = AnonymousClass000.A0y(A1G);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                this.A05.A02(((C65073Qp) A11.getValue()).A06(), (String) A11.getKey());
            }
        }
    }

    public C71573gz(C19730wQ r1, AnonymousClass16D r2, AnonymousClass171 r3, C19630wG r4, C220412q r5, AnonymousClass1LW r6, AnonymousClass17X r7, C20810yC r8) {
        C36321k7.A1B(r8, r4, r1, r5, r6);
        C36321k7.A13(r2, r3, r7);
        this.A07 = r8;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
    }
}
