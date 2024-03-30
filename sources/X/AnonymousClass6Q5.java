package X;

import java.util.Map;

/* renamed from: X.6Q5  reason: invalid class name */
public abstract class AnonymousClass6Q5 {
    public C161677nI A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public final C161677nI A04;
    public final Map A05 = AnonymousClass001.A0J();

    public static final void A00(AnonymousClass5h8 r7, AnonymousClass6Q5 r8, C94894iy r9, int i) {
        long A0B;
        boolean z;
        float A002;
        loop0:
        while (true) {
            float f = (float) i;
            A0B = C90464aC.A0B(f, f);
            long j = C133206Xf.A03;
            do {
                z = r8 instanceof C94794in;
                if (z) {
                    C94924j1 A0N = r9.A0N();
                    AnonymousClass00C.A0B(A0N);
                    long j2 = A0N.A00;
                    A0B = C133206Xf.A03(C90464aC.A0B((float) C90494aF.A08(j2), (float) C90474aD.A03(j2)), A0B);
                } else {
                    A0B = r9.A0K(A0B);
                }
                r9 = r9.A06;
                AnonymousClass00C.A0B(r9);
                if (AnonymousClass00C.A0J(r9, r8.A04.BCj())) {
                    break loop0;
                }
            } while (!r8.A01(r9).containsKey(r7));
            if (z) {
                C94924j1 A0N2 = r9.A0N();
                AnonymousClass00C.A0B(A0N2);
                i = A0N2.A0G(r7);
            } else {
                i = r9.A0G(r7);
            }
        }
        if (r7 instanceof C94694id) {
            A002 = C133206Xf.A01(A0B);
        } else {
            A002 = C133206Xf.A00(A0B);
        }
        int A012 = C14960mT.A01(A002);
        Map map = r8.A05;
        if (map.containsKey(r7)) {
            A012 = AnonymousClass000.A0I(r7.A00.invoke(Integer.valueOf(AnonymousClass000.A0I(C000200c.A00(r7, map))), Integer.valueOf(A012)));
        }
        C36421kH.A1M(r7, map, A012);
    }

    public final void A02() {
        this.A01 = true;
        C161677nI r2 = this.A04;
        C161677nI BF3 = r2.BF3();
        if (BF3 != null) {
            if (this.A03) {
                r2.BoL();
            }
            if (this.A02) {
                r2.requestLayout();
            }
            BF3.B8S().A02();
        }
    }

    public Map A01(C94894iy r2) {
        C160287kl A0H;
        if (this instanceof C94794in) {
            C94924j1 A0N = r2.A0N();
            AnonymousClass00C.A0B(A0N);
            A0H = A0N.A0H();
        } else {
            A0H = r2.A0H();
        }
        return A0H.B8T();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r1.A02 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        r0 = r0.B8S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r3.A02 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r3 = this;
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0009
            boolean r1 = r3.A02
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.7nI r2 = r3.A04
            if (r0 != 0) goto L_0x0028
            X.7nI r0 = r2.BF3()
            if (r0 == 0) goto L_0x002a
            X.6Q5 r0 = r0.B8S()
            X.7nI r2 = r0.A00
            if (r2 == 0) goto L_0x002b
            X.6Q5 r1 = r2.B8S()
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x002b
        L_0x0028:
            r3.A00 = r2
        L_0x002a:
            return
        L_0x002b:
            X.7nI r2 = r3.A00
            if (r2 == 0) goto L_0x002a
            X.6Q5 r1 = r2.B8S()
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x002a
            X.7nI r0 = r2.BF3()
            if (r0 == 0) goto L_0x004a
            X.6Q5 r0 = r0.B8S()
            if (r0 == 0) goto L_0x004a
            r0.A03()
        L_0x004a:
            X.7nI r0 = r2.BF3()
            if (r0 == 0) goto L_0x0059
            X.6Q5 r0 = r0.B8S()
            if (r0 == 0) goto L_0x0059
            X.7nI r2 = r0.A00
            goto L_0x0028
        L_0x0059:
            r2 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Q5.A03():void");
    }

    public AnonymousClass6Q5(C161677nI r2) {
        this.A04 = r2;
    }
}
