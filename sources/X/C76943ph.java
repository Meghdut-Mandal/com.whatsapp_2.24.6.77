package X;

import java.util.HashMap;

/* renamed from: X.3ph  reason: invalid class name and case insensitive filesystem */
public class C76943ph implements C236119d {
    public HashMap A00 = AnonymousClass001.A0J();
    public final C19970wo A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final C589431q A04;
    public final AnonymousClass19A A05;

    private void A00(AnonymousClass38M r6, boolean z) {
        AnonymousClass2R9 r4 = new AnonymousClass2R9();
        r4.A01 = Integer.valueOf(C36431kI.A01(r6.A02 ? 1 : 0));
        r4.A00 = Boolean.valueOf(z);
        r4.A03 = Long.valueOf(C19970wo.A00(this.A01) - r6.A00);
        AnonymousClass147 r2 = r6.A01;
        String str = r2.user;
        C65533Sl r0 = AnonymousClass147.A01;
        if (C65533Sl.A05(str)) {
            r4.A04 = r2.getRawString();
        }
        this.A03.Bly(r4);
    }

    public void A01(AnonymousClass147 r17, boolean z) {
        String str;
        AnonymousClass19A r6 = this.A05;
        String A09 = r6.A09();
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[1];
        boolean z2 = z;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        boolean A1Y = C36371kC.A1Y("state", str, r3);
        C203399nx r32 = new C203399nx(new C203399nx("group_join", r3), "membership_approval_mode", (AnonymousClass1AL[]) null);
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
        C36341k9.A1S(r2, A1Y ? 1 : 0);
        C36331k8.A1R(A09, r2, 1);
        AnonymousClass147 r12 = r17;
        C36331k8.A1B(r12, "set", r2, 2);
        C203399nx A0m = C36391kE.A0m(r32, r2);
        this.A00.put(A09, new AnonymousClass38M(this, r12, C19970wo.A00(this.A01), z2));
        r6.A0K(this, A0m, A09, 337, 20000);
    }

    public void BVN(String str) {
        C20350xQ r1 = this.A04.A00.A0Q;
        r1.A0T(1008, (Object) null);
        r1.A0T(3012, (Object) null);
        AnonymousClass38M r12 = (AnonymousClass38M) this.A00.get(str);
        if (r12 != null) {
            A00(r12, false);
        }
    }

    public void BiM(C203399nx r3, String str) {
        AnonymousClass38M r1 = (AnonymousClass38M) this.A00.get(str);
        if (r1 != null) {
            A00(r1, true);
        }
    }

    public C76943ph(C19970wo r2, C20810yC r3, C21010yW r4, C589431q r5, AnonymousClass19A r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r1 != 500) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWw(X.C203399nx r5, java.lang.String r6) {
        /*
            r4 = this;
            int r1 = X.C36371kC.A04(r5)
            X.31q r3 = r4.A04
            r0 = -2
            r2 = 0
            if (r1 == r0) goto L_0x004d
            r0 = -1
            if (r1 == r0) goto L_0x0044
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x003a
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0030
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x004d
        L_0x0021:
            java.util.HashMap r0 = r4.A00
            java.lang.Object r1 = r0.get(r6)
            X.38M r1 = (X.AnonymousClass38M) r1
            if (r1 == 0) goto L_0x002f
            r0 = 0
            r4.A00(r1, r0)
        L_0x002f:
            return
        L_0x0030:
            X.1uw r0 = r3.A00
            X.0xQ r1 = r0.A0Q
            r0 = 3011(0xbc3, float:4.22E-42)
            r1.A0T(r0, r2)
            goto L_0x0021
        L_0x003a:
            X.1uw r0 = r3.A00
            X.0xQ r1 = r0.A0Q
            r0 = 3010(0xbc2, float:4.218E-42)
            r1.A0T(r0, r2)
            goto L_0x0021
        L_0x0044:
            X.1uw r0 = r3.A00
            X.0xQ r1 = r0.A0Q
            r0 = 1008(0x3f0, float:1.413E-42)
            r1.A0T(r0, r2)
        L_0x004d:
            X.1uw r0 = r3.A00
            X.0xQ r1 = r0.A0Q
            r0 = 3012(0xbc4, float:4.221E-42)
            r1.A0T(r0, r2)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76943ph.BWw(X.9nx, java.lang.String):void");
    }
}
