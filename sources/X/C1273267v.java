package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.67v  reason: invalid class name and case insensitive filesystem */
public class C1273267v {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C19420v0 A05;
    public final C20810yC A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r10.startsWith(r8.A00) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r10.startsWith(r8.A03) == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x000b
            java.lang.String r0 = r8.A03
            boolean r1 = r10.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r7 = 0
            if (r0 != 0) goto L_0x0029
            X.0v0 r0 = r8.A05
            boolean r0 = r0.A2E()
            if (r0 != 0) goto L_0x002a
            if (r10 == 0) goto L_0x002a
            java.lang.String r0 = r8.A04
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r8.A02
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r7
        L_0x002a:
            X.0yC r3 = r8.A06
            r0 = 1239(0x4d7, float:1.736E-42)
            long r5 = X.C36441kJ.A0B(r3, r0)
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r1
            r0 = 1240(0x4d8, float:1.738E-42)
            long r3 = X.C36441kJ.A0B(r3, r0)
            long r3 = r3 * r1
            if (r10 == 0) goto L_0x0048
            java.lang.String r0 = r8.A00
            boolean r1 = r10.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            long r1 = r9.length()
            if (r0 == 0) goto L_0x0050
            r5 = r3
        L_0x0050:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive-util/should-backup/too-large "
            X.C90464aC.A1A(r9, r0, r1)
            java.lang.String r0 = " size:"
            X.C90464aC.A19(r9, r0, r1)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x006a:
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "."
            int r2 = r1.lastIndexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0080
            int r1 = r1.length()
            r0 = 1
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x0080
            return r0
        L_0x0080:
            r9.getAbsolutePath()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1273267v.A00(java.io.File, java.lang.String):boolean");
    }

    public boolean A01(String str) {
        if (str == null || !str.startsWith(this.A07)) {
            return false;
        }
        return true;
    }

    public C1273267v(C20690y0 r3, C19420v0 r4, C20810yC r5) {
        this.A06 = r5;
        this.A05 = r4;
        try {
            File file = r3.A08().A02;
            C20690y0.A07(file, false);
            this.A00 = file.getCanonicalPath();
            File file2 = r3.A08().A0M;
            C20690y0.A07(file2, false);
            this.A03 = file2.getCanonicalPath();
            this.A01 = r3.A08().A05.getCanonicalPath();
            this.A07 = r3.A0H().getCanonicalPath();
            this.A04 = r3.A08().A0N.getCanonicalPath();
            this.A02 = r3.A08().A0G.getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
