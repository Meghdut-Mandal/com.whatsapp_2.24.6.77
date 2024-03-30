package X;

import android.text.TextUtils;
import com.whatsapp.Me;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.1De  reason: invalid class name and case insensitive filesystem */
public class C24631De {
    public C202159l8 A00;
    public boolean A01;
    public final C24611Dc A02 = C24611Dc.A00("PaymentsCountryManager", "infra", "COMMON");
    public final C19730wQ A03;
    public final AnonymousClass16T A04;
    public final C20810yC A05;
    public final C24651Dg A06;
    public final C24641Df A07;

    public synchronized AnonymousClass16U A01() {
        AnonymousClass16U r0;
        if (!this.A01) {
            A00();
        }
        C202159l8 r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A02;
        } else {
            r0 = null;
        }
        return r0;
    }

    public synchronized C202159l8 A02() {
        if (!this.A01) {
            A00();
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r1 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0008
            r2.A00()     // Catch:{ all -> 0x0014 }
        L_0x0008:
            X.9l8 r0 = r2.A00     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A06     // Catch:{ all -> 0x0014 }
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24631De.A03():boolean");
    }

    private synchronized void A00() {
        String str;
        String A002;
        String[] strArr;
        synchronized (this) {
            C24611Dc r3 = this.A02;
            String str2 = null;
            C24611Dc.A02(r3, (String) null, "tryInitFromMock: no mockedCountry");
            C19730wQ r4 = this.A03;
            r4.A0G();
            Me me = r4.A00;
            if (me != null) {
                str2 = me.number;
                str = me.cc;
            } else {
                str = null;
            }
            r4.A0G();
            if (r4.A03 == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("phoneNumber:");
                sb.append(str2);
                sb.append(" countryCode:");
                sb.append(str);
                r3.A06(sb.toString());
            } else {
                C202159l8 A012 = C202159l8.A01(str);
                C202159l8 r42 = C202159l8.A0G;
                if (A012 == r42) {
                    if (!(str == null || (A002 = AnonymousClass1M4.A00(str)) == null || (strArr = (String[]) C190899At.A02.A01(A002)) == null || strArr.length <= 0)) {
                        String str3 = strArr[0];
                        HashMap hashMap = C196719aQ.A00;
                        if (hashMap.isEmpty()) {
                            hashMap.put("USD", C196719aQ.A00("USD", "$", "D", "d", 2));
                            hashMap.put("PEN", C196719aQ.A00("PEN", "S/", "@", "@", 2));
                            hashMap.put("MXN", C196719aQ.A00("MXN", "Mex$", "@", "@", 2));
                            hashMap.put("COP", C196719aQ.A00("COP", "Col$", "@", "@", 2));
                            hashMap.put("ARS", C196719aQ.A00("ARS", "Arg$", "@", "@", 2));
                            hashMap.put("CLP", C196719aQ.A00("CLP", "$", "@", "@", 0));
                            hashMap.put("IDR", C196719aQ.A00("IDR", "Rp", "@", "@", 2));
                            hashMap.put("ILS", C196719aQ.A00("ILS", "₪", "@", "@", 2));
                            hashMap.put("AED", C196719aQ.A00("AED", "د.إ", "@", "@", 2));
                            hashMap.put("TRY", C196719aQ.A00("TRY", "₺", "@", "@", 2));
                            hashMap.put("HKD", C196719aQ.A00("HKD", "HK$", "@", "@", 2));
                            hashMap.put("ZAR", C196719aQ.A00("ZAR", "R", "@", "@", 2));
                            hashMap.put("SAR", C196719aQ.A00("SAR", "ر.س", "@", "@", 2));
                            hashMap.put("LKR", C196719aQ.A00("LKR", "රු.", "@", "@", 2));
                            hashMap.put("VES", C196719aQ.A00("VES", "Bs.S", "@", "@", 2));
                            hashMap.put("BOB", C196719aQ.A00("BOB", "Bs", "@", "@", 2));
                            hashMap.put("MAD", C196719aQ.A00("MAD", "د.م.", "@", "@", 2));
                            hashMap.put("XOF", C196719aQ.A00("XOF", "CFA", "@", "@", 0));
                            hashMap.put("GTQ", C196719aQ.A00("GTQ", "Q", "@", "@", 2));
                        }
                        if (hashMap.containsKey(str3)) {
                            AnonymousClass16U r11 = (AnonymousClass16U) hashMap.get(str3);
                            A012 = new C202159l8(r11, A002, str, new LinkedHashSet(Collections.singletonList(r11)), (int[]) null, (int[]) null, (C24851Ea[]) null, (C24851Ea[]) null, new C24851Ea[0], 0, 0, false, true, false);
                        }
                    }
                    A012 = r42;
                }
                if (A012 == r42) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("not enabled with unsupported country code: ");
                    sb2.append(str);
                    C24611Dc.A02(r3, (String) null, sb2.toString());
                    this.A00 = null;
                } else {
                    this.A00 = A012;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("init enabled for country: ");
                    sb3.append(A012.A03);
                    sb3.append(" and default currency: ");
                    sb3.append(((AnonymousClass16W) A012.A02).A02);
                    r3.A06(sb3.toString());
                }
                this.A01 = true;
            }
        }
    }

    public C24631De(C19730wQ r4, AnonymousClass16T r5, C20810yC r6, C24651Dg r7, C24641Df r8) {
        this.A05 = r6;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
    }
}
