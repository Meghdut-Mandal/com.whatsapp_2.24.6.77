package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0zU  reason: invalid class name and case insensitive filesystem */
public class C21590zU {
    public final int A00;
    public final C21540zP A01;
    public final Random A02 = new Random();
    public final Set A03;
    public final C21450zG A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if ((java.lang.Math.abs((r11.A04.A00() ^ ((long) X.C20800yB.A00(X.C21000yV.A02, r10.A00, 225))) ^ ((long) r12)) % r3) != 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C21590zU r11, int r12) {
        /*
            X.0zP r10 = r11.A01
            X.0zQ r0 = X.C21540zP.A00(r10, r12)
            long r3 = r0.A01
            r8 = 0
            r7 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            X.0zG r0 = r11.A04
            long r5 = r0.A00()
            X.0yC r2 = r10.A00
            r1 = 225(0xe1, float:3.15E-43)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            long r0 = (long) r0
            long r5 = r5 ^ r0
            long r0 = (long) r12
            long r5 = r5 ^ r0
            long r1 = java.lang.Math.abs(r5)
            long r1 = r1 % r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            return r7
        L_0x0033:
            java.util.Set r1 = r11.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 == 0) goto L_0x004c
            java.util.Random r1 = r11.A02
            int r0 = r11.A00
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x0032
            r7 = 1
            return r7
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21590zU.A00(X.0zU, int):boolean");
    }

    public boolean A01(int i) {
        long nextLong;
        C21540zP r1 = this.A01;
        if (C21540zP.A00(r1, i).A03) {
            return A00(this, i);
        }
        long j = C21540zP.A00(r1, i).A01;
        if (j == 0) {
            return false;
        }
        if (this.A03.contains(Integer.valueOf(i))) {
            nextLong = this.A02.nextLong();
            j = Math.max(j, (long) this.A00);
        } else if (j == 1) {
            return true;
        } else {
            nextLong = this.A02.nextLong();
        }
        if (nextLong % j == 0) {
            return true;
        }
        return false;
    }

    public C21590zU(C21540zP r3, C21450zG r4) {
        this.A01 = r3;
        this.A04 = r4;
        this.A03 = Collections.unmodifiableSet(new HashSet());
        this.A00 = this.A02.nextInt(901) + 100;
    }
}
