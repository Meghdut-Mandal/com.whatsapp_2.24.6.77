package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1Dj  reason: invalid class name and case insensitive filesystem */
public class C24681Dj {
    public Object A00 = new Object();
    public Object A01 = new Object();
    public final C21390zA A02;
    public final C20810yC A03;
    public final C24751Dq A04;
    public final C24741Dp A05;
    public final C24701Dl A06;
    public final C24711Dm A07;
    public final C24721Dn A08;
    public final C19770wU A09;
    public volatile int A0A = 0;
    public volatile int A0B = 0;
    public volatile boolean A0C = false;
    public volatile boolean A0D = false;
    public volatile boolean A0E = false;

    public static void A00(C24681Dj r1) {
        if (!r1.A0E) {
            r1.A0E = true;
            r1.A06.A00 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r4.A00 == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.List r7, boolean r8) {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r7.iterator()
        L_0x0009:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r3 = r4.next()
            X.1Dl r0 = r6.A06
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            java.lang.Object r2 = r0.get(r3)
            X.1gr r2 = (X.C34331gr) r2
            if (r2 == 0) goto L_0x0009
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0009
            int r1 = r2.A01
            if (r1 < r0) goto L_0x002d
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x002d
            goto L_0x0009
        L_0x002d:
            r5.add(r3)
            goto L_0x0009
        L_0x0031:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0052
            X.0zA r4 = r6.A02
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0053
            r2 = 10000(0x2710, double:4.9407E-320)
        L_0x003f:
            if (r8 == 0) goto L_0x004c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x004c
            boolean r0 = r4.A00
            r1 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            X.1Dm r0 = r6.A07
            r0.A01(r5, r2, r1)
        L_0x0052:
            return
        L_0x0053:
            r2 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24681Dj.A03(java.util.List, boolean):void");
    }

    public void A04(C65613Su[] r21) {
        C24701Dl r6 = this.A06;
        for (int i = 0; i < r21.length; i++) {
            if (r21[i].A02 == 2) {
                C34331gr r5 = (C34331gr) r6.A04.get(Integer.valueOf(r21[i].A01));
                C65613Su r1 = r21[i];
                if (r5 == null) {
                    r6.A04(r1.A01, 0, 2, r1.A03, 1);
                } else {
                    int i2 = r1.A03;
                    int i3 = r5.A03;
                    if (i2 > i3 && r5.A00 == 1) {
                        C65613Su r12 = r21[i];
                        r6.A05(Integer.valueOf(r12.A03), (String) null, (String) null, r12.A01, 0, -1, false);
                    } else if (r5.A00 == 0) {
                        C24701Dl r122 = r6;
                        r122.A05(Integer.valueOf(i3), r5.A07, r5.A06, r21[i].A01, r5.A01, 1, false);
                    }
                }
            }
        }
    }

    public boolean A06(int i) {
        C24701Dl r0 = this.A06;
        C24701Dl.A02(r0);
        C34331gr r02 = (C34331gr) r0.A04.get(Integer.valueOf(i));
        if (r02 == null) {
            throw new IllegalArgumentException("Disclosure is not eligible for current user");
        } else if (r02.A01 == 5) {
            return true;
        } else {
            return false;
        }
    }

    public C24681Dj(C21390zA r3, C20810yC r4, C24751Dq r5, C24741Dp r6, C24701Dl r7, C24711Dm r8, C24721Dn r9, C19770wU r10) {
        this.A03 = r4;
        this.A09 = r10;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        if (r2 >= 12) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0081, code lost:
        if (r6.get(r5) != null) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(int r12) {
        /*
            r11 = this;
            A00(r11)
            X.1Dl r7 = r11.A06
            X.C24701Dl.A02(r7)
            java.util.concurrent.ConcurrentHashMap r6 = r7.A04
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            java.lang.Object r0 = r6.get(r5)
            X.1gr r0 = (X.C34331gr) r0
            if (r0 != 0) goto L_0x002e
            r4 = 0
        L_0x0017:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x009c
            java.lang.Object r1 = r6.get(r5)
            r0 = 1
            if (r1 != 0) goto L_0x0027
            r0 = 0
        L_0x0027:
            r2 = 1
            if (r0 != 0) goto L_0x007b
            java.lang.Object r3 = r11.A01
            monitor-enter(r3)
            goto L_0x0031
        L_0x002e:
            java.lang.String r4 = r0.A06
            goto L_0x0017
        L_0x0031:
            boolean r0 = r11.A0D     // Catch:{ all -> 0x0078 }
            r8 = 0
            if (r0 == 0) goto L_0x0038
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            goto L_0x0083
        L_0x0038:
            r11.A0D = r2     // Catch:{ all -> 0x0078 }
            r11.A0B = r12     // Catch:{ all -> 0x0078 }
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            A00(r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0054
            X.0zA r0 = r11.A02
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0054
        L_0x004c:
            X.1Dn r0 = r11.A08
            r0.A01(r2, r12)
            monitor-enter(r3)
            r2 = 0
            goto L_0x0056
        L_0x0054:
            r2 = 0
            goto L_0x004c
        L_0x0056:
            boolean r1 = r11.A0D     // Catch:{ all -> 0x0075 }
            r0 = 12
            if (r1 == 0) goto L_0x0066
            if (r2 >= r0) goto L_0x006a
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0063 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0066:
            if (r2 >= r0) goto L_0x006a
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x007d
        L_0x006a:
            r11.A0D = r8     // Catch:{ all -> 0x0075 }
            r11.A0B = r8     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "PrivacyDisclosureDataManager/isEligibleForDisclosure timed out"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0075 }
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0083
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            throw r0
        L_0x0078:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            r0 = 1
            goto L_0x0084
        L_0x007d:
            java.lang.Object r0 = r6.get(r5)
            if (r0 != 0) goto L_0x007b
        L_0x0083:
            r0 = 0
        L_0x0084:
            if (r0 != 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PrivacyDisclosureDataManager/getDisclosureById not eligible "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x009c:
            java.lang.Object r3 = r11.A00
            monitor-enter(r3)
            boolean r0 = r11.A0C     // Catch:{ all -> 0x00f0 }
            r8 = 0
            if (r0 == 0) goto L_0x00a6
            monitor-exit(r3)     // Catch:{ all -> 0x00f0 }
            goto L_0x00ea
        L_0x00a6:
            r0 = 1
            r11.A0C = r0     // Catch:{ all -> 0x00f0 }
            r11.A0A = r12     // Catch:{ all -> 0x00f0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f0 }
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r5)
            X.1Dm r9 = r11.A07
            r0 = 10000(0x2710, double:4.9407E-320)
            r2 = 1
            r9.A01(r10, r0, r2)
            monitor-enter(r3)
            r9 = 0
            r2 = 0
        L_0x00bf:
            boolean r1 = r11.A0C     // Catch:{ all -> 0x00ed }
            r0 = 20
            if (r1 == 0) goto L_0x00cf
            if (r2 >= r0) goto L_0x00cf
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x00cc }
        L_0x00cc:
            int r2 = r2 + 1
            goto L_0x00bf
        L_0x00cf:
            if (r2 < r0) goto L_0x00dc
            r11.A0C = r9     // Catch:{ all -> 0x00ed }
            r11.A0A = r9     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "PrivacyDisclosureDataManager/downloadDisclosureById timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)     // Catch:{ all -> 0x00ed }
            goto L_0x00ea
        L_0x00dc:
            monitor-exit(r3)     // Catch:{ all -> 0x00ed }
            X.C24701Dl.A02(r7)
            java.lang.Object r0 = r6.get(r5)
            X.1gr r0 = (X.C34331gr) r0
            if (r0 == 0) goto L_0x00ea
            java.lang.String r8 = r0.A06
        L_0x00ea:
            if (r8 == 0) goto L_0x00f3
            return r8
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ed }
            throw r0
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f0 }
            throw r0
        L_0x00f3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24681Dj.A01(int):java.lang.String");
    }

    public void A02(int i, int i2) {
        A00(this);
        C24701Dl r5 = this.A06;
        C24701Dl.A02(r5);
        int i3 = i;
        C34331gr r2 = (C34331gr) r5.A04.get(Integer.valueOf(i));
        if (r2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("PrivacyDisclosureDataManager/savedisclosureresult disclosure does not exist id = ");
            sb.append(i);
            Log.e(sb.toString());
            return;
        }
        int i4 = r2.A01;
        int i5 = i2;
        if (i4 != i2 && i2 <= 1000) {
            List list = C34391gx.A01;
            Integer valueOf = Integer.valueOf(i4);
            if (!list.contains(valueOf)) {
                if (i4 < 400 ? i4 != 145 : i4 > 499) {
                    if ((!(!list.contains(valueOf)) || !list.contains(Integer.valueOf(i2))) && (!(i4 == 162 && i2 == 160) && i4 >= i2)) {
                        return;
                    }
                }
                r5.A05((Integer) null, (String) null, (String) null, i3, i5, -1, false);
                this.A08.A00(i, r2.A01);
            }
        }
    }

    public boolean A05() {
        try {
            if (this.A06.A03(20240306) == 160) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
