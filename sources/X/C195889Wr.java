package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9Wr  reason: invalid class name and case insensitive filesystem */
public final class C195889Wr {
    public int A00;
    public long A01;
    public long A02;
    public C197299bT A03 = C197299bT.A01;
    public Object A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C195889Wr r7 = (C195889Wr) obj;
            if (!(Util.A0E(this.A04, r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02 && Util.A0E(this.A03, r7.A03))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(long r10) {
        /*
            r9 = this;
            X.9bT r8 = r9.A03
            r7 = 0
        L_0x0003:
            long[] r6 = r8.A00
            int r5 = r6.length
            if (r7 >= r5) goto L_0x0020
            r3 = r6[r7]
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            r1 = r6[r7]
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            java.lang.String r0 = "hasUnplayedAds"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x001d:
            int r7 = r7 + 1
            goto L_0x0003
        L_0x0020:
            if (r7 < r5) goto L_0x0023
            r7 = -1
        L_0x0023:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195889Wr.A00(long):int");
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C165577te.A04(this.A02, C165577te.A04(this.A01, (((6727 + C36411kG.A09(this.A04)) * 31) + this.A00) * 31)) * 31);
    }
}
