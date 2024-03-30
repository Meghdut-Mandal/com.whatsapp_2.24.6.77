package X;

import android.os.Handler;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.6Th  reason: invalid class name */
public final class AnonymousClass6Th {
    public static final AnonymousClass6Th $redex_init_class = null;
    public AnonymousClass6QG A00;
    public final Handler A01 = new Handler();
    public final C001700s A02 = C36431kI.A0S();
    public final C122355ui A03;
    public final C28201Rs A04 = C36441kJ.A0t();
    public final C19770wU A05;
    public final Runnable A06 = new C1497172m(this, 31);
    public final C132296Sz A07;
    public final C20830yE A08;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[Catch:{ Exception -> 0x002c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r6 = this;
            X.5ui r4 = r6.A03
            X.6Sz r5 = r6.A07
            monitor-enter(r4)
            X.6QG r0 = r4.A00     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x003d
            X.5DQ r3 = r4.A03     // Catch:{ all -> 0x004e }
            X.9Qj r0 = r3.A03     // Catch:{ Exception -> 0x002c }
            android.content.SharedPreferences r2 = r0.A00()     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = "current_search_location"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ Exception -> 0x002c }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x002c }
            if (r0 != 0) goto L_0x0032
            X.133 r1 = r3.A02     // Catch:{ Exception -> 0x002c }
            X.0wN r0 = r3.A00     // Catch:{ Exception -> 0x002c }
            java.lang.String r0 = X.AnonymousClass6RZ.A00(r0, r1, r2)     // Catch:{ Exception -> 0x002c }
            X.6QG r0 = X.AnonymousClass6QG.A01(r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x0033
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "BusinessSearchSharedPrefs/readBusinessSearchLocation: Failed to fetch the search location"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x004e }
        L_0x0032:
            r0 = 0
        L_0x0033:
            r4.A00 = r0     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x003d
            X.6QG r0 = r5.A02()     // Catch:{ all -> 0x004e }
            r4.A00 = r0     // Catch:{ all -> 0x004e }
        L_0x003d:
            monitor-exit(r4)
            r6.A00 = r0
            boolean r0 = r0.A04()
            int r1 = X.C90484aE.A04(r0)
            X.00s r0 = r6.A02
            X.C36341k9.A17(r0, r1)
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Th.A00():void");
    }

    public final void A01() {
        this.A01.removeCallbacks(this.A06);
        C001700s r2 = this.A02;
        Number A0z = C36441kJ.A0z(r2);
        if (A0z != null && A0z.intValue() == 7) {
            C36341k9.A17(this.A04, 7);
        }
        C36341k9.A17(r2, 6);
    }

    public final boolean A03() {
        AnonymousClass5DQ r1 = this.A03.A03;
        if (!r1.A03.A00().getBoolean("location_access_granted", r1.A00.A0E(6328)) || !this.A08.A05()) {
            return false;
        }
        return true;
    }

    public AnonymousClass6Th(C132296Sz r3, C122355ui r4, C20830yE r5, C19770wU r6) {
        C36321k7.A18(r6, r5, r4, r3);
        this.A05 = r6;
        this.A08 = r5;
        this.A03 = r4;
        this.A07 = r3;
    }

    public final void A02() {
        if (A03()) {
            C36341k9.A17(this.A02, 7);
            C36341k9.A17(this.A04, 0);
            this.A01.postDelayed(this.A06, 20000);
        }
    }

    static {
        LatLng A0F = C90524aI.A0F(4.712389579797669d, -74.08223951357645d);
        double random = Math.random();
        double sqrt = ((0.0d + 800.0d) / 111320.0d) * Math.sqrt(random);
        double d = random * 6.283185307179586d;
        double d2 = A0F.A00;
        new LatLng(d2 + (sqrt * Math.sin(d)), A0F.A01 + ((Math.cos(d) * sqrt) / Math.cos(Math.toRadians(d2))));
    }
}
