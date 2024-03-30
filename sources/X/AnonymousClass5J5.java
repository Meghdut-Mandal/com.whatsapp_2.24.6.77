package X;

import java.util.List;

/* renamed from: X.5J5  reason: invalid class name */
public class AnonymousClass5J5 extends C106255Iy {
    public AnonymousClass5J5(C64933Qa r2, long j) {
        super(r2, 10, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A1X() {
        /*
            r4 = this;
            java.util.List r1 = r4.A00
            boolean r0 = r1.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r1.get(r2)
            X.5Nh r0 = (X.C107265Nh) r0
            boolean r0 = r0.A0M()
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r4.A1Y()
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0021
            r3 = 3
        L_0x0021:
            return r3
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            r2 = 2
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5J5.A1X():int");
    }

    public boolean A1Y() {
        List list = this.A00;
        if (list.isEmpty()) {
            return false;
        }
        return ((C107265Nh) C36391kE.A0t(list)).A0K;
    }
}
