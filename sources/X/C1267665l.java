package X;

import android.location.Location;

/* renamed from: X.65l  reason: invalid class name and case insensitive filesystem */
public class C1267665l {
    public final Location A00;

    public Long A00() {
        long time = this.A00.getTime();
        if (time == 0) {
            return null;
        }
        return Long.valueOf(time);
    }

    public String toString() {
        return this.A00.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r6.getLongitude() != 0.0d) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1267665l(android.location.Location r6) {
        /*
            r5 = this;
            r5.<init>()
            double r1 = r6.getLatitude()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            double r1 = r6.getLongitude()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.String r0 = "location must have latitude/longitude"
            if (r1 == 0) goto L_0x001e
            r5.A00 = r6
            return
        L_0x001e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1267665l.<init>(android.location.Location):void");
    }
}
