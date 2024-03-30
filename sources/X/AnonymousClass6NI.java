package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;

/* renamed from: X.6NI  reason: invalid class name */
public class AnonymousClass6NI {
    public Location A00;
    public C114605hW A01;
    public boolean A02;
    public boolean A03;
    public AnonymousClass6NI A04;
    public final C160307kn A05;
    public final Context A06;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1 <= 200) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.location.Location r7, android.location.Location r8) {
        /*
            r6 = 0
            if (r7 == 0) goto L_0x0055
            r5 = 1
            if (r8 == 0) goto L_0x004f
            long r3 = r7.getTime()
            long r0 = r8.getTime()
            long r3 = r3 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004f
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r0)
            float r1 = r7.getAccuracy()
            float r0 = r8.getAccuracy()
            float r1 = r1 - r0
            int r1 = (int) r1
            r3 = 1
            if (r1 <= 0) goto L_0x0038
            r3 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 1
            if (r1 > r0) goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            java.lang.String r1 = r7.getProvider()
            java.lang.String r0 = r8.getProvider()
            if (r1 != 0) goto L_0x0050
            boolean r0 = X.AnonymousClass000.A1W(r0)
        L_0x0047:
            if (r3 != 0) goto L_0x004f
            if (r4 == 0) goto L_0x0055
            if (r2 != 0) goto L_0x0055
            if (r0 == 0) goto L_0x0055
        L_0x004f:
            return r5
        L_0x0050:
            boolean r0 = r1.equals(r0)
            goto L_0x0047
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NI.A00(android.location.Location, android.location.Location):boolean");
    }

    public void A01(boolean z) {
        if (this.A04 == null) {
            this.A04 = this;
        }
        this.A03 = z;
        if (z && Build.VERSION.SDK_INT >= 23) {
            Context context = this.A06;
            if (!(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)) {
                synchronized (AnonymousClass6TY.A0I) {
                }
                return;
            }
        }
        boolean z2 = this.A03;
        AnonymousClass6NI r5 = this.A04;
        if (!z2) {
            r5.A02 = false;
            r5.A05.BwM();
        } else if (!r5.A02) {
            r5.A02 = true;
            Location location = r5.A00;
            C160307kn r6 = r5.A05;
            Location BAd = r6.BAd();
            if (A00(BAd, location)) {
                location = BAd;
            }
            if (location == null || System.currentTimeMillis() - location.getTime() >= -1389934592) {
                r5.A00 = null;
            } else {
                r5.A00 = location;
                C114605hW r0 = r5.A01;
                if (r0 != null) {
                    r0.A00.A0Q.invalidate();
                }
            }
            r6.BnF(r5, AnonymousClass6NI.class.getName());
        }
    }

    public AnonymousClass6NI(Context context) {
        C160307kn r1;
        this.A06 = context;
        try {
            C112705eK.A00(context);
            r1 = C112705eK.A00.B3h();
        } catch (AnonymousClass78J unused) {
            AnonymousClass6TY.A07.A03();
            r1 = new C139296jY(this);
            this.A03 = false;
            this.A02 = false;
        }
        this.A05 = r1;
    }
}
