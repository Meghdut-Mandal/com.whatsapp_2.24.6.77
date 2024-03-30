package X;

import java.util.Map;

/* renamed from: X.62h  reason: invalid class name and case insensitive filesystem */
public final class C1260362h {
    public final AnonymousClass66E A00;
    public final C115465iv A01;
    public final Map A02;

    public final void A00(C119195pO r18, C119205pP r19, C1274268g r20, boolean z) {
        int i;
        String str;
        String str2;
        C119195pO r4 = r18;
        C119205pP r3 = r19;
        C36321k7.A0z(r3, r4);
        int i2 = 1;
        C18740tg.A0C(!C224714l.A02());
        Object A0r = C36371kC.A0r(this.A02, 551495536);
        if (A0r != null) {
            AnonymousClass1UN r0 = (AnonymousClass1UN) A0r;
            if (z) {
                i = 4;
                str = "XFAM_NTA";
            } else {
                i = 3;
                str = "XFAM_WFS";
            }
            C1274268g r10 = r20;
            Object A002 = C131886Rd.A00(new C153187Nj(r10, str), i);
            String str3 = (String) C131886Rd.A00(new C153177Ni(r10, str), i);
            r0.A05("FETCH_PHONE_NUMBER_START", 551495536);
            r0.A01(true, "is_re_reg");
            C188598zq r7 = C188598zq.A04;
            if (A002 == r7 || A002 == C188598zq.A05) {
                str2 = "ig";
            } else {
                str2 = "fb";
            }
            r0.A01(str2, "source_app");
            C115465iv r6 = this.A01;
            if (!(A002 == r7 || A002 == C188598zq.A05)) {
                i2 = 0;
            }
            C27121Mz r5 = r6.A00;
            C18800tq r62 = r5.A01;
            C20810yC A0V = C36341k9.A0V(r62);
            C20020wt A0X = C90504aG.A0X(r62);
            C20050ww A0U = C36381kD.A0U(r62);
            C19420v0 A0Y = C36351kA.A0Y(r62);
            AnonymousClass005 A0i = C90514aH.A0i(r62);
            C27111My r52 = r5.A00;
            C119205pP r9 = r3;
            C119195pO r8 = r4;
            new AnonymousClass5P9(A0U, A0Y, A0V, C90484aE.A0Y(r62), A0X, A0i, str3, r52.A3T, r52.A3U, i2).Blp(new C165547tb(r8, r9, this, r0, A002, 0));
            return;
        }
        throw C36381kD.A0l();
    }

    public C1260362h(C115465iv r1, AnonymousClass66E r2, Map map) {
        C36321k7.A11(r2, r1, map);
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = map;
    }
}
