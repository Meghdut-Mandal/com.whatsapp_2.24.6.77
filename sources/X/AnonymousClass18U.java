package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.18U  reason: invalid class name */
public final class AnonymousClass18U {
    public Boolean A00;
    public final C19630wG A01;
    public final C19420v0 A02;
    public final C20810yC A03;
    public final C19770wU A04;
    public final AnonymousClass00T A05 = new AnonymousClass00U(new AnonymousClass18V(this));
    public final AnonymousClass00T A06 = new AnonymousClass00U(new AnonymousClass18X(this));
    public final C19970wo A07;
    public final AnonymousClass00T A08 = new AnonymousClass00U(new AnonymousClass18Y(this));

    public AnonymousClass18U(C19970wo r3, C19630wG r4, C19420v0 r5, C20810yC r6, C19770wU r7) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r5, 5);
        this.A07 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
    }

    public static final AnonymousClass4UJ A00(AnonymousClass18U r3) {
        AnonymousClass4UJ r0;
        if (C20800yB.A01(C21000yV.A02, r3.A03, 266)) {
            r0 = (C68573c7) r3.A05.getValue();
        } else {
            r0 = (C142356ok) r3.A06.getValue();
        }
        return r0;
    }

    public final void A02(boolean z) {
        Boolean bool = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        if (!AnonymousClass00C.A0J(bool, valueOf)) {
            this.A00 = valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append("AppAuthManager/setIsAuthenticationNeeded: ");
            sb.append(z);
            Log.i(sb.toString());
            C19420v0.A00(this.A02).putBoolean("fingerprint_authentication_needed", z).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (A00(r3).BJr() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r3 = this;
            X.0yC r2 = r3.A03
            r1 = 266(0x10a, float:3.73E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0029
            X.4UJ r0 = A00(r3)
            boolean r2 = r0.BJr()
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AppAuthManager/hasEnrolledBiometrics: enrolled: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0029:
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x003a
            X.4UJ r0 = A00(r3)
            boolean r0 = r0.BJr()
            r2 = 1
            if (r0 != 0) goto L_0x0014
        L_0x003a:
            r2 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18U.A03():boolean");
    }

    public final boolean A05() {
        return ((Boolean) this.A08.getValue()).booleanValue();
    }

    public final boolean A06() {
        C19420v0 r9 = this.A02;
        boolean z = !r9.A2K();
        AnonymousClass005 r5 = r9.A00;
        boolean z2 = !((SharedPreferences) r5.get()).getBoolean("fingerprint_authentication_needed", false);
        boolean z3 = !A03();
        if (z3 || z || z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("AppAuthManager/shouldShowAuthPrompt: No prompt: ");
            sb.append(z3);
            sb.append(" || ");
            sb.append(z);
            sb.append(" || ");
            sb.append(z2);
            Log.i(sb.toString());
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ((SharedPreferences) r5.get()).getLong("app_background_time", 0);
        long A0P = r9.A0P();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AppAuthManager/shouldShowAuthPrompt: show prompt if necessary: ");
        int i = ((j + A0P) > elapsedRealtime ? 1 : ((j + A0P) == elapsedRealtime ? 0 : -1));
        boolean z4 = false;
        if (i < 0) {
            z4 = true;
        }
        sb2.append(z4);
        Log.i(sb2.toString());
        if (i >= 0) {
            return false;
        }
        return true;
    }

    public final void A01(Activity activity) {
        if (C19550w8.A09()) {
            AnonymousClass3OR.A00.A00(activity, this.A02, new AnonymousClass00U(new AnonymousClass483(this)));
        } else if (C19550w8.A03()) {
            AnonymousClass1QV.A00(activity, new AnonymousClass00U(new AnonymousClass1QU(this)));
        }
    }

    public final boolean A04() {
        if (!C19550w8.A01() || !this.A02.A2K() || !A00(this).B2K()) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        if (!A04() || ((SharedPreferences) this.A02.A00.get()).getBoolean("privacy_fingerprint_show_notification_content", true)) {
            return true;
        }
        return false;
    }
}
