package X;

import android.util.Log;
import java.util.Locale;

/* renamed from: X.0UT  reason: invalid class name */
public class AnonymousClass0UT {
    public final int A00;
    public final String A01;
    public final AnonymousClass0SR A02;
    public final String A03;

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[LOOP:0: B:4:0x0015->B:7:0x0020, LOOP_START, PHI: r1 
      PHI: (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:3:0x0005, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0UT(java.lang.String r5, java.lang.String... r6) {
        /*
            r4 = this;
            int r0 = r6.length
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = ""
        L_0x0005:
            r4.<init>()
            r4.A01 = r0
            r4.A03 = r5
            r1 = 0
            X.0SR r0 = new X.0SR
            r0.<init>(r5, r1)
            r4.A02 = r0
            r1 = 2
        L_0x0015:
            java.lang.String r0 = r4.A03
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x0045
            int r1 = r1 + 1
            r0 = 7
            if (r1 > r0) goto L_0x0045
            goto L_0x0015
        L_0x0023:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            r0 = 91
            r3.append(r0)
            r0 = 0
            r2 = r6[r0]
            int r1 = r3.length()
            r0 = 1
            if (r1 <= r0) goto L_0x003b
            java.lang.String r0 = ","
            r3.append(r0)
        L_0x003b:
            r3.append(r2)
            java.lang.String r0 = "] "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            goto L_0x0005
        L_0x0045:
            r4.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UT.<init>(java.lang.String, java.lang.String[]):void");
    }

    public void A00(String str) {
        if (this.A00 <= 3) {
            Log.d(this.A03, this.A01.concat(str));
        }
    }

    public void A01(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.w("Auth", this.A01.concat(str));
    }
}
