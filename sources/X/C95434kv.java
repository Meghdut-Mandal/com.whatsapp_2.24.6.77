package X;

import android.os.Handler;

/* renamed from: X.4kv  reason: invalid class name and case insensitive filesystem */
public class C95434kv extends C001600r {
    public int A00 = 0;
    public AnonymousClass6QG A01;
    public final Handler A02 = new Handler();
    public final AnonymousClass5DR A03;
    public final C129006Eo A04;
    public final C132296Sz A05;
    public final AnonymousClass4PO A06;
    public final AnonymousClass1QW A07;
    public final C19770wU A08;
    public final Runnable A09 = new C1497172m(this, 27);
    public final C159377jG A0A;
    public final C20830yE A0B;

    public static AnonymousClass5EQ A00(C95434kv r4) {
        String str = null;
        switch (r4.A00) {
            case 0:
                return new C105155Do(new C48892iE(r4, 7));
            case 1:
                return new C105115Dk();
            case 2:
                AnonymousClass6QG r2 = r4.A01;
                if (r2 != null) {
                    return new C105265Dz(r2, new C48892iE(r4, 9));
                }
                break;
            case 4:
                break;
            case 7:
                if (r4.A07.A05()) {
                    return new AnonymousClass5EF(r4.A0A, (String) null);
                }
                String str2 = r4.A01.A07;
                C18740tg.A06(str2);
                return new C105185Dr(new C48892iE(r4, 8), str2);
            default:
                return new C105105Dj();
        }
        AnonymousClass6QG r0 = r4.A01;
        if (r0 != null) {
            str = r0.A07;
        }
        return new C105255Dy(new C48892iE(r4, 10), str);
    }

    public int A0E() {
        switch (this.A00) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public void A0F() {
        long j;
        if (this.A0B.A05()) {
            AnonymousClass5DR r1 = this.A03;
            if (r1.A03.A00().getBoolean("location_access_granted", r1.A00.A07())) {
                this.A00 = 1;
                Handler handler = this.A02;
                Runnable runnable = this.A09;
                if (this.A07.A04()) {
                    j = AnonymousClass6X5.A0L;
                } else {
                    j = 60000;
                }
                handler.postDelayed(runnable, j);
                A03(this);
            }
        }
        C132296Sz r2 = this.A05;
        AnonymousClass6QG A022 = r2.A02();
        this.A01 = A022;
        if (A022.A04()) {
            int i = 4;
            if (r2.A08.A00().contains(C132296Sz.A01(r2))) {
                i = 7;
            }
            this.A00 = i;
        } else {
            this.A00 = 0;
        }
        A03(this);
    }

    public C95434kv(AnonymousClass5DR r3, C129006Eo r4, C132296Sz r5, AnonymousClass4PO r6, C159377jG r7, C20830yE r8, AnonymousClass1QW r9, C19770wU r10) {
        this.A08 = r10;
        this.A0B = r8;
        this.A07 = r9;
        this.A04 = r4;
        this.A06 = r6;
        this.A0A = r7;
        this.A03 = r3;
        this.A05 = r5;
        C1497172m.A00(r10, this, 26);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r2.A08.A00().contains(r1) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass6QG r9, X.C95434kv r10) {
        /*
            boolean r0 = r9.A04()
            if (r0 == 0) goto L_0x001f
            X.6Sz r0 = r10.A05
            java.lang.String r1 = X.C132296Sz.A01(r0)
            X.1QW r0 = r0.A08
            java.util.HashSet r0 = r0.A00()
            boolean r1 = r0.contains(r1)
            r0 = 7
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 4
        L_0x001a:
            r10.A00 = r0
            r10.A01 = r9
            return
        L_0x001f:
            X.1QW r0 = r10.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x006b
            X.6Sz r2 = r10.A05
            com.google.android.gms.maps.model.LatLng r3 = X.AnonymousClass6QG.A00(r9)
            X.0wG r0 = r2.A06
            android.content.Context r1 = r0.A00
            X.0ts r0 = r2.A07
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            double r4 = r3.A00
            double r6 = r3.A01
            android.location.Geocoder r3 = new android.location.Geocoder
            r3.<init>(r1, r0)
            r8 = 1
            java.util.List r1 = r3.getFromLocation(r4, r6, r8)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0058 }
            if (r0 != 0) goto L_0x005e
            java.lang.Object r0 = X.C36391kE.A0t(r1)     // Catch:{ Exception -> 0x0058 }
            android.location.Address r0 = (android.location.Address) r0     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r0.getCountryCode()     // Catch:{ Exception -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateCountryCodeFromLatLng/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x005e:
            r1 = 0
        L_0x005f:
            X.1QW r0 = r2.A08
            java.util.HashSet r0 = r0.A00()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0019
        L_0x006b:
            r0 = 2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95434kv.A02(X.6QG, X.4kv):void");
    }

    public static void A03(C95434kv r2) {
        AnonymousClass5EQ A002 = A00(r2);
        Object A042 = r2.A04();
        if (A042 == null || !A042.equals(A002)) {
            r2.A0C(A002);
        }
    }
}
