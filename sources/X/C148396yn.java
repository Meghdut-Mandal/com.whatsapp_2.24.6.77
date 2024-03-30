package X;

import android.net.Uri;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.6yn  reason: invalid class name and case insensitive filesystem */
public class C148396yn implements C160507l7 {
    public C1265864p A00;
    public int A01 = 0;
    public AnonymousClass65F A02;
    public final long A03;
    public final AnonymousClass1BU A04;
    public final AnonymousClass1BX A05;
    public final C21320z1 A06;
    public final String A07;
    public final String A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final AnonymousClass19J A0C;
    public final AnonymousClass65F A0D;
    public final AnonymousClass65F A0E;
    public final AnonymousClass1BS A0F;
    public final C24451Cm A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r45 != 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r35 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r35 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r4.A0E(2648) != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C148396yn A01(X.C19700wN r33, X.AnonymousClass19J r34, X.C19970wo r35, X.C20810yC r36, X.AnonymousClass1BU r37, X.AnonymousClass1BX r38, X.AnonymousClass1BS r39, X.C124815yq r40, X.C21320z1 r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, int r46, long r47, boolean r49, boolean r50) {
        /*
            r1 = 1
            r4 = r36
            if (r49 != 0) goto L_0x000f
            r0 = 2648(0xa58, float:3.71E-42)
            boolean r0 = r4.A0E(r0)
            r30 = 0
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r30 = 1
        L_0x0011:
            r0 = 256(0x100, float:3.59E-43)
            boolean r0 = r4.A0E(r0)
            r2 = r45
            if (r0 == 0) goto L_0x004b
            if (r45 != 0) goto L_0x004b
            r0 = 258(0x102, float:3.62E-43)
            int r24 = r4.A07(r0)
        L_0x0023:
            r5 = 257(0x101, float:3.6E-43)
            r15 = r37
            r27 = r47
            r14 = r34
            r16 = r38
            r19 = r39
            r9 = r40
            r20 = r41
            if (r40 != 0) goto L_0x004e
            r17 = 0
            r25 = 0
            int r23 = 4 - r46
            boolean r29 = r4.A0E(r5)
            X.6yn r13 = new X.6yn
            r21 = r17
            r22 = r17
            r18 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)
            return r13
        L_0x004b:
            r24 = 0
            goto L_0x0023
        L_0x004e:
            long r11 = r9.A04
            java.lang.String r13 = r9.A08
            int r41 = 4 - r46
            if (r1 != r2) goto L_0x00bd
            int r0 = r9.A00
        L_0x0058:
            int r41 = r0 + 1
            r6 = 1
            if (r45 == 0) goto L_0x005e
        L_0x005d:
            r6 = 0
        L_0x005e:
            java.util.List r3 = r9.A0A
            java.lang.String r0 = "fallback"
            r2 = 0
            r8 = r42
            X.65F r36 = A00(r0, r8, r2, r3, r6)
            java.lang.String r1 = "primary"
            r0 = r2
            if (r6 != 0) goto L_0x0095
            r7 = r44
            r0 = r50
            r10 = r35
            java.lang.String r0 = A03(r10, r4, r7, r8, r0)
            if (r0 != 0) goto L_0x0084
            r7 = r43
            if (r43 == 0) goto L_0x0084
            r0 = r33
            java.lang.String r0 = A02(r0, r4, r9, r7)
        L_0x0084:
            r7 = 0
            if (r0 == 0) goto L_0x008d
            X.65F r35 = A00(r1, r8, r0, r3, r7)
            if (r35 != 0) goto L_0x009d
        L_0x008d:
            java.lang.String r9 = "0"
            X.65F r35 = A00(r1, r8, r9, r3, r7)
            if (r35 != 0) goto L_0x009d
        L_0x0095:
            X.65F r35 = A00(r1, r8, r2, r3, r6)
            if (r35 != 0) goto L_0x009d
            r35 = r36
        L_0x009d:
            boolean r47 = r4.A0E(r5)
            X.6yn r31 = new X.6yn
            r43 = r11
            r32 = r14
            r33 = r15
            r34 = r16
            r37 = r19
            r38 = r20
            r39 = r13
            r40 = r0
            r42 = r24
            r45 = r27
            r48 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r48)
            return r31
        L_0x00bd:
            if (r45 == 0) goto L_0x00cc
            r0 = 2
            if (r0 == r2) goto L_0x00cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Mms4RouteSupplier/invalid mode = "
            X.C36321k7.A1S(r0, r1, r2)
            goto L_0x005d
        L_0x00cc:
            int r0 = r9.A01
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148396yn.A01(X.0wN, X.19J, X.0wo, X.0yC, X.1BU, X.1BX, X.1BS, X.5yq, X.0z1, java.lang.String, java.lang.String, java.lang.String, int, int, long, boolean, boolean):X.6yn");
    }

    public static boolean A05(String str) {
        try {
            return C90524aI.A0j(AnonymousClass000.A0p("https://", str, AnonymousClass000.A0u())).getHost().endsWith(".whatsapp.net");
        } catch (MalformedURLException e) {
            Log.e("Mms4RouteSupplier/isAcceptableHostname/", e);
            return false;
        }
    }

    public void BWu(boolean z, int i) {
        if (i != -1) {
            this.A0F.A0E(i);
        }
        this.A01++;
        A04(z);
    }

    public static String A02(C19700wN r6, C20810yC r7, C124815yq r8, String str) {
        long j;
        if (!r7.A0E(2134)) {
            return null;
        }
        long j2 = r8.A06;
        if (j2 <= 0) {
            return null;
        }
        try {
            j = new BigInteger(1, Base64.decode(str, 2)).mod(BigInteger.valueOf(Math.abs(j2))).longValue();
        } catch (IllegalArgumentException e) {
            C90464aC.A1L("routesupplier/bigMod/could not parse hash: ", str, AnonymousClass000.A0u(), e);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("hash=");
            A0u.append(str);
            r6.A0E("routesupplier/hash not parsed", AnonymousClass000.A0l(e, " error=", A0u), true);
            j = 0;
        }
        return Long.toString(j + 100);
    }

    public static String A03(C19970wo r9, C20810yC r10, String str, String str2, boolean z) {
        Long l;
        if (!z && !str2.startsWith("newsletter")) {
            long A072 = C36371kC.A07(r10.A07(2136));
            if (A072 > 0) {
                String queryParameter = Uri.parse(C90474aD.A0b(new Uri.Builder().encodedPath(str))).getQueryParameter("_nc_hot");
                if (queryParameter == null) {
                    l = null;
                } else {
                    try {
                        l = Long.valueOf(Long.parseLong(queryParameter) * 1000);
                    } catch (NumberFormatException unused) {
                        C36321k7.A1P("catv1/cannot parse hot timestamp: ", queryParameter, AnonymousClass000.A0u());
                        l = null;
                    }
                }
                long A002 = C19970wo.A00(r9);
                if (l == null || A002 - l.longValue() >= A072) {
                    return null;
                }
            }
            return null;
        }
        return "1";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r5.A0C.A05 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r7 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r7.A0C == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r5.A0H != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r4 >= 3) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r6 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r4 == 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if (r4 < 2) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r5.A0H != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        if (r7 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007f, code lost:
        if (r21 == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0081, code lost:
        r14 = r7.A00;
        X.C18740tg.A06(r14);
        r15 = r7.A01;
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008a, code lost:
        r6 = "fna";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0096, code lost:
        if (r14.toLowerCase(java.util.Locale.ROOT).contains(r6) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0098, code lost:
        r6 = "pop";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009b, code lost:
        if (r8 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        if (r2 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a0, code lost:
        r14 = r7.A04;
        r15 = r7.A05;
        r2 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r8 = java.net.InetAddress.getByName(r2).getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1 = X.C90484aE.A0p();
        r1.append(r2);
        r1.append("]");
        r15 = r1.toString();
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c1, code lost:
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c3, code lost:
        r3 = r5.A05;
        r2 = r3.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c9, code lost:
        if (r2 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00cb, code lost:
        r2 = X.AnonymousClass099.A0L(r2, new java.lang.String[]{":"}, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e8, code lost:
        r11 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00fc, code lost:
        r5.A06.A01(r2, r14);
        r15 = X.C36381kD.A10(X.C36331k8.A0k(r2, ":"), r3.A00());
        r4 = X.AnonymousClass3RW.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0111, code lost:
        r2 = r7.A08;
        r1 = r5.A07;
        X.C18740tg.A06(r1);
        r16 = r1;
        r13 = new X.C1265864p(r14, r15, r16, r6, r5.A08, r2, r4, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012b, code lost:
        if (r13 == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0135, code lost:
        r5.A06.A01(r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013a, code lost:
        if (r4 != 2) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013c, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x013e, code lost:
        r15 = r14;
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(boolean r23) {
        /*
            r22 = this;
            r5 = r22
            int r1 = r5.A01
            int r9 = r5.A0A
            if (r1 < r9) goto L_0x0015
            if (r23 == 0) goto L_0x000f
            int r0 = r5.A09
            int r9 = r9 + r0
            if (r1 < r9) goto L_0x0014
        L_0x000f:
            r13 = 0
            r5.A02 = r13
        L_0x0012:
            r5.A00 = r13
        L_0x0014:
            return
        L_0x0015:
            if (r23 != 0) goto L_0x0014
            X.1BU r10 = r5.A04
            X.0yC r1 = r10.A02
            r0 = 59
            boolean r0 = r1.A0E(r0)
            r8 = 0
            r1 = 1
            if (r0 == 0) goto L_0x002c
            X.19J r0 = r5.A0C
            boolean r0 = r0.A05
            r6 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            int r4 = r5.A01
            r3 = 3
            if (r4 > r1) goto L_0x0057
            X.65F r7 = r5.A0E
            r5.A02 = r7
        L_0x0036:
            r21 = 0
            if (r7 == 0) goto L_0x003e
        L_0x003a:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0044
        L_0x003e:
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x0055
            if (r4 >= r3) goto L_0x0055
        L_0x0044:
            r13 = 1
        L_0x0045:
            if (r6 == 0) goto L_0x0051
            if (r4 == 0) goto L_0x004c
            r0 = 2
            if (r4 < r0) goto L_0x0051
        L_0x004c:
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x0051
            r8 = 1
        L_0x0051:
            if (r7 != 0) goto L_0x007f
            r13 = 0
            goto L_0x0012
        L_0x0055:
            r13 = 0
            goto L_0x0045
        L_0x0057:
            X.65F r2 = r5.A0D
            if (r2 == 0) goto L_0x0069
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x0069
            X.65F r7 = r5.A02
            if (r7 != r2) goto L_0x0069
            r0 = 4
            if (r4 != r0) goto L_0x0069
        L_0x0066:
            r21 = 1
            goto L_0x003a
        L_0x0069:
            int r9 = r9 - r1
            if (r4 == r9) goto L_0x007b
            if (r4 == r3) goto L_0x007b
            X.65F r1 = r5.A0E
            if (r1 == 0) goto L_0x007b
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x007b
            X.65F r7 = r5.A02
            if (r7 != r1) goto L_0x007b
            goto L_0x0066
        L_0x007b:
            r5.A02 = r2
            r7 = r2
            goto L_0x0036
        L_0x007f:
            if (r21 == 0) goto L_0x00a0
            java.lang.String r14 = r7.A00
            X.C18740tg.A06(r14)
            java.lang.String r15 = r7.A01
            java.lang.String r2 = r7.A02
        L_0x008a:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r14.toLowerCase(r0)
            java.lang.String r6 = "fna"
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x009a
            java.lang.String r6 = "pop"
        L_0x009a:
            r9 = 2
            if (r8 == 0) goto L_0x00c1
            if (r2 == 0) goto L_0x00c1
            goto L_0x00a7
        L_0x00a0:
            java.lang.String r14 = r7.A04
            java.lang.String r15 = r7.A05
            java.lang.String r2 = r7.A06
            goto L_0x008a
        L_0x00a7:
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r2)     // Catch:{ UnknownHostException -> 0x00c1 }
            java.lang.String r8 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00c1 }
            java.lang.StringBuilder r1 = X.C90484aE.A0p()     // Catch:{ UnknownHostException -> 0x00c2 }
            r1.append(r2)     // Catch:{ UnknownHostException -> 0x00c2 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00c2 }
            java.lang.String r15 = r1.toString()     // Catch:{ UnknownHostException -> 0x00c2 }
            r4 = 2
            goto L_0x00c3
        L_0x00c1:
            r8 = r15
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            X.1BX r3 = r5.A05
            java.lang.String r2 = r3.A01()
            if (r2 == 0) goto L_0x012b
            java.lang.String r1 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r1}
            r11 = 0
            java.util.List r2 = X.AnonymousClass099.A0L(r2, r0, r11)
            int r0 = r2.size()
            if (r0 != r9) goto L_0x012b
            java.lang.String r2 = X.C36401kF.A0s(r2, r11)
            if (r2 == 0) goto L_0x012b
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x012b
            X.0yC r11 = r3.A00
            X.0yV r12 = X.C21000yV.A01
            r0 = 3641(0xe39, float:5.102E-42)
            boolean r0 = X.C20800yB.A01(r12, r11, r0)
            if (r0 == 0) goto L_0x012b
            r0 = 4073(0xfe9, float:5.707E-42)
            boolean r0 = r11.A0E(r0)
            if (r0 == 0) goto L_0x012b
            X.0z1 r0 = r5.A06
            r0.A01(r2, r14)
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r1)
            int r0 = r3.A00()
            java.lang.String r15 = X.C36381kD.A10(r1, r0)
            boolean r4 = X.AnonymousClass3RW.A00(r2)
        L_0x0111:
            java.lang.String r2 = r7.A08
            java.lang.String r1 = r5.A07
            X.C18740tg.A06(r1)
            java.lang.String r0 = r5.A08
            X.64p r13 = new X.64p
            r18 = r0
            r19 = r2
            r20 = r4
            r17 = r6
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0012
        L_0x012b:
            if (r13 == 0) goto L_0x013e
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x013e
            if (r15 == 0) goto L_0x013e
            X.0z1 r0 = r5.A06
            r0.A01(r8, r14)
            if (r4 == r9) goto L_0x0111
            r4 = 1
            goto L_0x0111
        L_0x013e:
            r15 = r14
            r4 = 0
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148396yn.A04(boolean):void");
    }

    public long B8k() {
        C24451Cm r2 = this.A0G;
        if (r2 != null && this.A01 >= this.A0A) {
            Long A002 = r2.A00();
            if (A002 != null) {
                return A002.longValue();
            }
            Log.e("Mms4RouteSupplier/getBackoffTime unexpected exponential backoff of null");
        }
        return this.A0B;
    }

    public C148396yn(AnonymousClass19J r8, AnonymousClass1BU r9, AnonymousClass1BX r10, AnonymousClass65F r11, AnonymousClass65F r12, AnonymousClass1BS r13, C21320z1 r14, String str, String str2, int i, int i2, long j, long j2, boolean z, boolean z2) {
        C24451Cm r1;
        this.A0F = r13;
        this.A0E = r11;
        this.A0D = r12;
        this.A07 = str;
        this.A03 = j;
        this.A08 = str2;
        this.A06 = r14;
        this.A0C = r8;
        this.A05 = r10;
        this.A04 = r9;
        this.A0A = i;
        int i3 = i2;
        this.A09 = i3;
        this.A0B = j2;
        if (i2 <= 0 || !z) {
            r1 = null;
        } else {
            r1 = new C24451Cm(new Random(), (long) i3, 3000);
        }
        this.A0G = r1;
        this.A0H = z2;
        A04(false);
    }

    public static AnonymousClass65F A00(String str, String str2, String str3, Collection collection, boolean z) {
        Set set;
        Set set2;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass65F r2 = (AnonymousClass65F) it.next();
            String str4 = r2.A00;
            if (A05(r2.A04) && ((str4 == null || A05(str4)) && str.equals(r2.A08))) {
                if (z) {
                    set = r2.A0B;
                } else {
                    set = r2.A09;
                }
                if ((set == null || set.contains(str2)) && (str3 == null || ((set2 = r2.A0A) != null && set2.contains(str3)))) {
                    return r2;
                }
            }
        }
        return null;
    }

    public C1265864p BAg() {
        return this.A00;
    }
}
