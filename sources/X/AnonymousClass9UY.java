package X;

import java.util.List;

/* renamed from: X.9UY  reason: invalid class name */
public class AnonymousClass9UY {
    public int A00 = 0;
    public long A01;
    public AnonymousClass9XZ A02;
    public List A03 = null;
    public final C199579fY A04 = new C199579fY();
    public final /* synthetic */ C202979n2 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r4, int r5) {
        /*
            r3 = this;
            r0 = 3
            if (r5 != r0) goto L_0x0012
            X.9n2 r1 = r3.A05
            X.9Xa r0 = r1.A08
            if (r0 == 0) goto L_0x0012
            X.9um r0 = r0.A0F
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0012
            X.C202979n2.A02(r1)
        L_0x0012:
            X.9n2 r0 = r3.A05
            java.util.List r0 = r0.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            X.B3J r1 = (X.B3J) r1
            r0 = 0
            r1.Bct(r5, r4, r0)
            goto L_0x001a
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UY.A01(boolean, int):void");
    }

    public AnonymousClass9UY(C202979n2 r2) {
        this.A05 = r2;
    }

    public void A00(int i) {
        C202979n2 r1 = this.A05;
        C195979Xa r0 = r1.A08;
        if (r0 != null && r0.A0F.A0R) {
            C202979n2.A02(r1);
        }
        if (r1.A0O.improveLooping) {
            for (B3J Bcy : r1.A0P) {
                Bcy.Bcy(i);
            }
        }
    }
}
