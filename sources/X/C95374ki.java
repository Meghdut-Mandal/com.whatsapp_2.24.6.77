package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ki  reason: invalid class name and case insensitive filesystem */
public final class C95374ki extends AnonymousClass08X implements C158137fr {
    public String A00;
    public boolean A01;
    public final AnonymousClass08S A02;
    public final C121355t0 A03;
    public final C134986bw A04;
    public final C132406Tm A05;
    public final C28201Rs A06 = C36441kJ.A0t();
    public final String A07;
    public final C1254960a A08;
    public final C1255760k A09;
    public final C1265264j A0A;
    public final AnonymousClass6OF A0B;
    public final String A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95374ki(Application application, C1254960a r6, C1255760k r7, C1265264j r8, C121355t0 r9, C134986bw r10, AnonymousClass6OF r11, String str, String str2) {
        super(application);
        C36321k7.A17(application, r11, r7, 1);
        AnonymousClass00C.A0D(r6, 9);
        this.A0A = r8;
        this.A03 = r9;
        this.A0B = r11;
        this.A09 = r7;
        this.A0C = str;
        this.A04 = r10;
        this.A07 = str2;
        this.A08 = r6;
        AnonymousClass08S r3 = new AnonymousClass08S();
        this.A02 = r3;
        r8.A00 = r9;
        C165157sy.A01(r9.A00, r3, AnonymousClass5X0.A02(this, 14), 6);
        C132406Tm A002 = r6.A00(this.A04 != null ? 741480633 : 741478382);
        this.A05 = A002;
        A002.A05();
    }

    public /* bridge */ /* synthetic */ void BfU(C105205Dt r6) {
        this.A01 = true;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass08S r3 = this.A02;
        List A0w = C36401kF.A0w(r3);
        if (A0w != null) {
            A0I.addAll(A0w.subList(0, C36421kH.A06(A0w, 1)));
        }
        A0I.add(new AnonymousClass5EQ(66));
        r3.A0C(A0I);
        A0S(this.A04);
    }

    public void A0R() {
        this.A0A.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
        if (r3.A01 != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(X.C134986bw r17) {
        /*
            r16 = this;
            r3 = r16
            X.5t0 r0 = r3.A03
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            X.6Kb r0 = (X.C130186Kb) r0
            if (r0 == 0) goto L_0x00bd
            X.6AS r2 = r0.A03
        L_0x0010:
            r0 = 1
            r4 = 0
            r11 = 0
            r5 = r17
            if (r17 != 0) goto L_0x007d
            X.08S r2 = r3.A02
            X.5EQ[] r1 = new X.AnonymousClass5EQ[r0]
            X.5Dn r0 = new X.5Dn
            r0.<init>()
            r1[r4] = r0
            java.util.ArrayList r0 = X.AnonymousClass6XV.newArrayList(r1)
            r2.A0C(r0)
        L_0x0029:
            X.64j r0 = r3.A0A
            java.lang.String r15 = r3.A07
            X.60a r4 = r3.A08
            X.6bw r2 = r3.A04
            r1 = 741478382(0x2c320fee, float:2.5304164E-12)
            if (r2 == 0) goto L_0x0039
            r1 = 741480633(0x2c3218b9, float:2.5309045E-12)
        L_0x0039:
            X.6Tm r12 = r4.A00(r1)
            r0.A00()
            X.5kI r2 = r0.A05
            X.5m0 r1 = r0.A06
            X.64l r10 = r1.A00
            r1 = 1
            X.7tX r9 = new X.7tX
            r9.<init>(r0, r1)
            X.0w7 r1 = r2.A00
            X.0tq r2 = r1.A00
            X.0wN r3 = X.C36391kE.A0V(r2)
            X.0wU r14 = X.C36341k9.A0Z(r2)
            X.0ts r7 = X.C36341k9.A0T(r2)
            X.0tt r1 = r2.A00
            X.7fQ r4 = X.C18830tt.A13(r1)
            X.17Z r6 = X.C36411kG.A0c(r2)
            X.004 r1 = r1.A1C
            java.lang.Object r13 = r1.get()
            X.32W r13 = (X.AnonymousClass32W) r13
            X.0yC r8 = X.C36341k9.A0V(r2)
            X.5DP r2 = new X.5DP
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A0B()
            r0.A03 = r2
        L_0x007c:
            return
        L_0x007d:
            if (r2 != 0) goto L_0x0098
            X.08S r2 = r3.A02
            X.5EQ[] r1 = new X.AnonymousClass5EQ[r0]
            X.5Dn r0 = new X.5Dn
            r0.<init>()
            r1[r4] = r0
            java.util.ArrayList r0 = X.AnonymousClass6XV.newArrayList(r1)
            r2.A0C(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0029
        L_0x0095:
            r3.A01 = r4
            goto L_0x0029
        L_0x0098:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0029
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x00aa
            r1 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = r3.A00
            X.6AS r11 = new X.6AS
            r11.<init>(r1, r0)
            goto L_0x0095
        L_0x00aa:
            java.lang.String r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007c
            int r0 = r2.A00
            X.6AS r11 = new X.6AS
            r11.<init>(r0, r1)
            r3.A00 = r1
            goto L_0x0029
        L_0x00bd:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95374ki.A0S(X.6bw):void");
    }

    public static final void A01(C95374ki r9, int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (r9.A09.A00(r9.A0C)) {
            r9.A0B.A02(1, -1, -1);
        }
        AnonymousClass08S r4 = r9.A02;
        List A0w = C36401kF.A0w(r4);
        if (A0w != null) {
            if (((AnonymousClass5EQ) C007103b.A0N(A0w)).A00 == 66) {
                A0I.addAll(A0w.subList(0, C36431kI.A07(A0w)));
            }
            A0I.add(new C1025350o(r9, i));
        }
        r4.A0C(A0I);
    }
}
