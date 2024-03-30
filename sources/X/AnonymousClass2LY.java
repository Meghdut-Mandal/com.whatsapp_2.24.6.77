package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.2LY  reason: invalid class name */
public final class AnonymousClass2LY extends AnonymousClass16R {
    public final AnonymousClass2aM A00;
    public final AnonymousClass005 A01;
    public final C19970wo A02;

    public void A01(AnonymousClass9TX r1, UserJid userJid) {
    }

    public void A02(UserJid userJid) {
    }

    public void A03(UserJid userJid, long j) {
    }

    public void A00() {
        AnonymousClass2aM r7 = this.A00;
        Iterator it = r7.A09().iterator();
        while (it.hasNext()) {
            AnonymousClass3Q5 r5 = (AnonymousClass3Q5) it.next();
            if (System.currentTimeMillis() - r5.A00 > AnonymousClass3Q5.A03) {
                C222813r r0 = UserJid.Companion;
                r7.A0B(C222813r.A01(r5.A02));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r4.A03 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r7 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r3.A03 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass3T1 r10) {
        /*
            r9 = this;
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.3Qa r0 = r10.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r0)
            if (r5 == 0) goto L_0x0089
            X.2aM r7 = r9.A00
            X.3Q5 r8 = r7.A08(r5)
            if (r8 == 0) goto L_0x0089
            X.9YF r3 = r8.A01
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x0024
            int r1 = r3.A00
            r0 = 3
            if (r1 != r0) goto L_0x0024
            boolean r0 = r3.A03
            r6 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            X.9Su r1 = r3.A00()
            int r0 = r3.A00
            if (r2 == 0) goto L_0x002f
            int r0 = r0 + 1
        L_0x002f:
            r1.A00 = r0
            r0 = 0
            r1.A02 = r0
            X.9YF r4 = r1.A00()
            java.lang.String r3 = r8.A02
            long r1 = java.lang.System.currentTimeMillis()
            X.3Q5 r0 = new X.3Q5
            r0.<init>(r4, r3, r1)
            r7.A0A(r0)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0054
            int r1 = r4.A00
            r0 = 3
            if (r1 != r0) goto L_0x0054
            boolean r1 = r4.A03
            r0 = 1
            if (r1 == 0) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r6 != 0) goto L_0x0089
            if (r0 == 0) goto L_0x0089
            X.005 r0 = r9.A01
            java.lang.Object r0 = X.C36411kG.A0v(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0065:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r4.next()
            X.32H r0 = (X.AnonymousClass32H) r0
            X.3Al r3 = r0.A00
            X.2nH r2 = X.C51102nH.A02
            X.3DE r0 = r3.A03
            X.0yC r1 = r0.A01
            r0 = 3981(0xf8d, float:5.579E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0065
            X.0wU r1 = r3.A08
            r0 = 47
            X.C80403vL.A01(r1, r3, r5, r2, r0)
            goto L_0x0065
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LY.A05(X.3T1):void");
    }

    public void A06(AnonymousClass3T1 r7) {
        C195179Su A002;
        C222813r r0 = UserJid.Companion;
        UserJid A003 = C222813r.A00(r7.A1J.A00);
        if (A003 != null) {
            AnonymousClass2aM r5 = this.A00;
            AnonymousClass3Q5 A08 = r5.A08(A003);
            if (A08 == null) {
                AnonymousClass9TX r1 = r7.A0K;
                if ((r1 instanceof C175418aS) && r1 != null) {
                    A002 = new C195179Su();
                } else {
                    return;
                }
            } else {
                A002 = A08.A01.A00();
            }
            A002.A02 = true;
            r5.A0A(new AnonymousClass3Q5(A002.A00(), A003.getRawString(), System.currentTimeMillis()));
        }
    }

    public AnonymousClass2LY(C19970wo r1, AnonymousClass2aM r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
