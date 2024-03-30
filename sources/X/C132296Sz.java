package X;

import com.whatsapp.Me;

/* renamed from: X.6Sz  reason: invalid class name and case insensitive filesystem */
public final class C132296Sz {
    public AnonymousClass6QG A00;
    public final C19700wN A01;
    public final C122305ud A02;
    public final AnonymousClass5DR A03;
    public final C129006Eo A04;
    public final AnonymousClass64E A05;
    public final C19630wG A06;
    public final C18820ts A07;
    public final AnonymousClass1QW A08;
    public final C132406Tm A09;
    public final AnonymousClass1M4 A0A;
    public final C1254960a A0B;
    public final C19730wQ A0C;
    public final AnonymousClass17Z A0D;

    public static final String A01(C132296Sz r5) {
        C19730wQ r0 = r5.A0C;
        r0.A0G();
        Me me = r0.A00;
        if (me == null) {
            r5.A01.A0E("directory_country_code_resolve_error", "Me object from MeManager is null", false);
        } else {
            String A012 = AnonymousClass1M4.A01(me.cc, me.number);
            AnonymousClass00C.A08(A012);
            if (!A012.equals("ZZ")) {
                return A012;
            }
        }
        return "XX";
    }

    public static final AnonymousClass6QG A00(C132296Sz r12) {
        C132406Tm r2 = r12.A09;
        r2.A06("country_default_start");
        String A012 = A01(r12);
        String A032 = r12.A0A.A03(r12.A07, A012);
        if (A032 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Localized name for country code ");
            A0u.append(A012);
            C36321k7.A1Z(A0u, " is null!");
        }
        AnonymousClass6QG r3 = new AnonymousClass6QG((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, A032, A012, "country_default");
        r2.A06("country_default_end");
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0176, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017a, code lost:
        r7 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017b, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6QG A02() {
        /*
            r13 = this;
            X.6Tm r6 = r13.A09
            r6.A05()
            X.1QW r0 = r13.A08
            X.0yC r1 = r0.A03
            boolean r0 = X.C90494aF.A1X(r1)
            if (r0 == 0) goto L_0x0205
            r0 = 3788(0xecc, float:5.308E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0205
            java.lang.String r0 = "approx_default_location_start"
            r6.A06(r0)
            X.6Eo r10 = r13.A04
            X.5DR r5 = r10.A03     // Catch:{ Exception -> 0x0075 }
            X.9Qj r9 = r5.A03     // Catch:{ Exception -> 0x0075 }
            android.content.SharedPreferences r3 = r9.A00()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = "default_location_last_updated"
            r0 = -1
            long r3 = r3.getLong(r2, r0)     // Catch:{ Exception -> 0x0075 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x007b
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x007b
            long r7 = X.C36441kJ.A0A(r3)     // Catch:{ Exception -> 0x0075 }
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            X.0yC r1 = r10.A04     // Catch:{ Exception -> 0x0075 }
            r0 = 3857(0xf11, float:5.405E-42)
            long r1 = X.C36441kJ.A0B(r1, r0)     // Catch:{ Exception -> 0x0075 }
            long r1 = r1 * r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007b
            android.content.SharedPreferences r2 = r9.A00()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r1 = "default_search_location"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ Exception -> 0x0075 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0075 }
            if (r0 != 0) goto L_0x007b
            X.133 r1 = r5.A02     // Catch:{ Exception -> 0x0075 }
            X.0wN r0 = r5.A00     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = X.AnonymousClass6RZ.A00(r0, r1, r2)     // Catch:{ Exception -> 0x0075 }
            X.6QG r1 = X.AnonymousClass6QG.A01(r0)     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x007b
            r13.A00 = r1
            java.lang.String r0 = "approx_default_location_end"
            r6.A06(r0)
            goto L_0x0209
        L_0x0075:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationRepository/readDefaultSearchLocation: Failed to fetch the default search location"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x007b:
            java.lang.String r0 = "approx_default_generation_start"
            r6.A06(r0)
            X.5ud r5 = r13.A02
            r4 = 0
            java.util.HashMap r7 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x01c3 }
            X.16r r0 = r5.A03     // Catch:{ Exception -> 0x01c3 }
            X.1M0 r8 = r0.get()     // Catch:{ Exception -> 0x01c3 }
            X.14e r10 = r8.A02     // Catch:{ all -> 0x015d }
            java.lang.String r9 = "SELECT latitude, longitude FROM wa_biz_profiles WHERE latitude IS NOT NULL AND longitude IS NOT NULL AND jid LIKE ?"
            java.lang.String[] r3 = X.C36441kJ.A1R()     // Catch:{ all -> 0x015d }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x015d }
            X.0wQ r0 = r5.A01     // Catch:{ all -> 0x015d }
            r0.A0G()     // Catch:{ all -> 0x015d }
            com.whatsapp.Me r1 = r0.A00     // Catch:{ all -> 0x015d }
            r0 = 0
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = r1.cc     // Catch:{ all -> 0x015d }
        L_0x00a5:
            r2.append(r0)     // Catch:{ all -> 0x015d }
            r0 = 37
            java.lang.String r0 = X.AnonymousClass000.A0t(r2, r0)     // Catch:{ all -> 0x015d }
            r3[r4] = r0     // Catch:{ all -> 0x015d }
            java.lang.String r0 = "DIRECTORY_GET_BUSINESS_PROFILES_SQL"
            android.database.Cursor r10 = r10.A09(r9, r0, r3)     // Catch:{ all -> 0x015d }
            X.AnonymousClass00C.A0B(r10)     // Catch:{ all -> 0x0156 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "latitude"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "longitude"
            int r9 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
        L_0x00c9:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x00df
            double r2 = r10.getDouble(r11)     // Catch:{ all -> 0x0156 }
            double r0 = r10.getDouble(r9)     // Catch:{ all -> 0x0156 }
            com.google.android.gms.maps.model.LatLng r0 = X.C90524aI.A0F(r2, r0)     // Catch:{ all -> 0x0156 }
            r12.add(r0)     // Catch:{ all -> 0x0156 }
            goto L_0x00c9
        L_0x00df:
            r10.close()     // Catch:{ all -> 0x015d }
            r8.close()     // Catch:{ Exception -> 0x01c3 }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ Exception -> 0x01c3 }
            r9 = 0
            r8 = 0
        L_0x00eb:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x01c3 }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x01c3 }
            com.google.android.gms.maps.model.LatLng r0 = (com.google.android.gms.maps.model.LatLng) r0     // Catch:{ Exception -> 0x01c3 }
            double r2 = r0.A00     // Catch:{ Exception -> 0x01c3 }
            double r0 = r0.A01     // Catch:{ Exception -> 0x01c3 }
            r10 = 10
            java.util.ArrayList r0 = X.C132796Vh.A03(r2, r0, r10)     // Catch:{ Exception -> 0x01c3 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object r0 = X.C90514aH.A0r(r0)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r3 = X.C132796Vh.A02(r1, r0, r10)     // Catch:{ Exception -> 0x01c3 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ Exception -> 0x01c3 }
            boolean r0 = r7.containsKey(r3)     // Catch:{ Exception -> 0x01c3 }
            if (r0 != 0) goto L_0x0120
            X.C36341k9.A1K(r3, r7, r4)     // Catch:{ Exception -> 0x01c3 }
        L_0x0120:
            java.lang.Object r0 = r7.get(r3)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01c3 }
            if (r0 == 0) goto L_0x0131
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01c3 }
            int r0 = r0 + 1
            X.C36341k9.A1K(r3, r7, r0)     // Catch:{ Exception -> 0x01c3 }
        L_0x0131:
            java.lang.Object r0 = r7.get(r3)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01c3 }
            if (r0 == 0) goto L_0x00eb
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x01c3 }
            if (r8 >= r2) goto L_0x00eb
            X.0yC r1 = r5.A02     // Catch:{ Exception -> 0x01c3 }
            r0 = 3830(0xef6, float:5.367E-42)
            int r0 = r1.A07(r0)     // Catch:{ Exception -> 0x01c3 }
            if (r2 < r0) goto L_0x00eb
            r8 = r2
            r9 = r3
            goto L_0x00eb
        L_0x014c:
            if (r9 == 0) goto L_0x01cf
            int r8 = r9.length()     // Catch:{ Exception -> 0x01c3 }
            r3 = 0
            r2 = r8
            r7 = 0
            goto L_0x017d
        L_0x0156:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x015d }
            throw r0     // Catch:{ all -> 0x015d }
        L_0x015d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x0176
        L_0x0164:
            int r1 = r2 + -1
            int r0 = r0 << r1
            int r1 = r8 - r2
            char r1 = r9.charAt(r1)     // Catch:{ Exception -> 0x01c3 }
            switch(r1) {
                case 48: goto L_0x017b;
                case 49: goto L_0x0177;
                case 50: goto L_0x017a;
                case 51: goto L_0x0179;
                default: goto L_0x0170;
            }     // Catch:{ Exception -> 0x01c3 }
        L_0x0170:
            java.lang.String r0 = "Invalid Quadkey"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ Exception -> 0x01c3 }
        L_0x0176:
            throw r0     // Catch:{ Exception -> 0x01c3 }
        L_0x0177:
            int r3 = r3 + r0
            goto L_0x017b
        L_0x0179:
            int r3 = r3 + r0
        L_0x017a:
            int r7 = r7 + r0
        L_0x017b:
            int r2 = r2 + -1
        L_0x017d:
            r0 = 1
            if (r2 < r0) goto L_0x0181
            goto L_0x0164
        L_0x0181:
            long r2 = (long) r3     // Catch:{ Exception -> 0x01c3 }
            long r0 = (long) r7     // Catch:{ Exception -> 0x01c3 }
            java.util.ArrayList r3 = X.C132796Vh.A04(r8, r2, r0)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ Exception -> 0x01c3 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x01c3 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x01c3 }
            double r0 = X.C90504aG.A01(r0)     // Catch:{ Exception -> 0x01c3 }
            r2 = 1
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Exception -> 0x01c3 }
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x01c3 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x01c3 }
            com.google.android.gms.maps.model.LatLng r8 = X.C90484aE.A0S(r2, r0)     // Catch:{ Exception -> 0x01c3 }
            double r2 = r8.A00     // Catch:{ Exception -> 0x01c3 }
            double r0 = r8.A01     // Catch:{ Exception -> 0x01c3 }
            r7 = 10
            java.util.ArrayList r0 = X.C132796Vh.A03(r2, r0, r7)     // Catch:{ Exception -> 0x01c3 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x01c3 }
            double r0 = X.C132796Vh.A01(r0, r7)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x01c3 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x01c3 }
            X.011 r1 = X.C36441kJ.A19(r8, r0)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01d0
        L_0x01c3:
            r0 = move-exception
            X.0wN r2 = r5.A00
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "DirectoryApproxDefaultLocationManager/getApproxDefaultLocation : exception while generating approx location"
            r2.A0E(r0, r1, r4)
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            java.lang.String r0 = "approx_default_generation_end"
            r6.A06(r0)
            if (r1 == 0) goto L_0x0200
            X.64E r5 = r13.A05
            java.lang.Object r0 = r1.first
            com.google.android.gms.maps.model.LatLng r0 = (com.google.android.gms.maps.model.LatLng) r0
            double r6 = r0.A00
            double r8 = r0.A01
            r0 = 1
            X.7rw r4 = new X.7rw
            r4.<init>(r1, r13, r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r4)
            r5.A00 = r0
            android.os.Handler r3 = r5.A01
            java.lang.Runnable r2 = r5.A05
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r2, r0)
            X.0wU r0 = r5.A04
            X.73A r3 = new X.73A
            r3.<init>(r4, r5, r6, r8)
            r0.Boy(r3)
        L_0x0200:
            X.6QG r1 = A00(r13)
            return r1
        L_0x0205:
            X.6QG r1 = A00(r13)
        L_0x0209:
            r6.A04()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132296Sz.A02():X.6QG");
    }

    public C132296Sz(C19700wN r2, C1254960a r3, C19730wQ r4, C122305ud r5, AnonymousClass5DR r6, C129006Eo r7, AnonymousClass64E r8, C19630wG r9, AnonymousClass17Z r10, C18820ts r11, AnonymousClass1QW r12, AnonymousClass1M4 r13) {
        C36321k7.A1B(r4, r2, r9, r11, r13);
        AnonymousClass00C.A0D(r12, 7);
        C36321k7.A14(r7, r3, r6);
        C36341k9.A1G(r10, r5);
        this.A0C = r4;
        this.A01 = r2;
        this.A06 = r9;
        this.A07 = r11;
        this.A0A = r13;
        this.A05 = r8;
        this.A08 = r12;
        this.A04 = r7;
        this.A0B = r3;
        this.A03 = r6;
        this.A0D = r10;
        this.A02 = r5;
        this.A09 = r3.A00(871827416);
    }
}
