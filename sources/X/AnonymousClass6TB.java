package X;

import java.net.DatagramPacket;

/* renamed from: X.6TB  reason: invalid class name */
public class AnonymousClass6TB {
    public final byte[] A00 = new byte[48];
    public volatile DatagramPacket A01;

    public synchronized DatagramPacket A02() {
        if (this.A01 == null) {
            this.A01 = new DatagramPacket(this.A00, 48);
            this.A01.setPort(123);
        }
        return this.A01;
    }

    private int A00(int i) {
        byte[] bArr = this.A00;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static AnonymousClass72Y A01(AnonymousClass6TB r5, int i) {
        byte[] bArr = r5.A00;
        return new AnonymousClass72Y((((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8) | ((long) (bArr[i + 7] & 255)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0077, code lost:
        if (r6 == 4) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[version:"
            r2.append(r0)
            byte[] r4 = r8.A00
            r3 = 0
            byte r0 = r4[r3]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 >> 3
            r0 = r0 & 7
            r2.append(r0)
            java.lang.String r0 = ", mode:"
            r2.append(r0)
            int r1 = r1 >> r3
            r0 = r1 & 7
            r2.append(r0)
            java.lang.String r0 = ", poll:"
            r2.append(r0)
            r0 = 2
            byte r0 = r4[r0]
            r2.append(r0)
            java.lang.String r0 = ", precision:"
            r2.append(r0)
            r0 = 3
            byte r0 = r4[r0]
            r2.append(r0)
            java.lang.String r0 = ", delay:"
            r2.append(r0)
            r0 = 4
            int r0 = r8.A00(r0)
            r2.append(r0)
            java.lang.String r0 = ", dispersion(ms):"
            r2.append(r0)
            r0 = 8
            int r0 = r8.A00(r0)
            double r5 = (double) r0
            r0 = 4634312102955297276(0x4050624dd2f1a9fc, double:65.536)
            double r5 = r5 / r0
            r2.append(r5)
            java.lang.String r0 = ", id:"
            r2.append(r0)
            r7 = 0
            byte r0 = r4[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> 3
            r6 = r0 & 7
            r5 = 1
            byte r0 = r4[r5]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            r3 = 3
            if (r6 == r3) goto L_0x0073
            if (r6 != r0) goto L_0x00da
        L_0x0073:
            if (r1 == 0) goto L_0x00c2
            if (r1 == r5) goto L_0x00c2
            if (r6 != r0) goto L_0x00da
        L_0x0079:
            r0 = 12
            int r0 = r8.A00(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
        L_0x0083:
            r2.append(r0)
            java.lang.String r0 = ", xmitTime:"
            r2.append(r0)
            r0 = 40
            X.72Y r5 = A01(r8, r0)
            java.text.DateFormat r0 = r5.simpleFormatter
            if (r0 != 0) goto L_0x00a7
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = "EEE, MMM dd yyyy HH:mm:ss.SSS"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r3)
            r5.simpleFormatter = r1
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            r1.setTimeZone(r0)
        L_0x00a7:
            long r0 = r5.ntpTime
            long r3 = X.AnonymousClass72Y.A00(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            java.text.DateFormat r0 = r5.simpleFormatter
            java.lang.String r0 = r0.format(r1)
            r2.append(r0)
            java.lang.String r0 = " ]"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            return r0
        L_0x00c2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
        L_0x00c6:
            int r0 = r7 + 12
            byte r0 = r4[r0]
            char r0 = (char) r0
            if (r0 == 0) goto L_0x00d5
            r1.append(r0)
            int r7 = r7 + 1
            if (r7 > r3) goto L_0x00d5
            goto L_0x00c6
        L_0x00d5:
            java.lang.String r0 = r1.toString()
            goto L_0x0083
        L_0x00da:
            r0 = 2
            if (r1 < r0) goto L_0x0079
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            r0 = 12
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
            java.lang.String r1 = "."
            r3.append(r1)
            r0 = 13
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
            r3.append(r1)
            r0 = 14
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
            r3.append(r1)
            r0 = 15
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = X.C36381kD.A10(r3, r0)
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TB.toString():java.lang.String");
    }
}
