package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.0z5  reason: invalid class name and case insensitive filesystem */
public class C21360z5 {
    public Date A00;
    public boolean A01;
    public final C19420v0 A02;
    public final C19730wQ A03;

    public static boolean A00() {
        if (!"chromium".equals(Build.MANUFACTURER) || !"chromium".equals(Build.BRAND)) {
            return false;
        }
        return true;
    }

    public Date A01() {
        AnonymousClass005 r5 = this.A02.A00;
        long j = ((SharedPreferences) r5.get()).getLong("software_forced_expiration", 0);
        long j2 = 0;
        if (j <= 0) {
            j = ((SharedPreferences) r5.get()).getLong("client_expiration_time", 0);
            if (j <= 0) {
                C19730wQ r0 = this.A03;
                r0.A0G();
                Me me = r0.A00;
                int i = -1;
                if (me != null) {
                    try {
                        if (!TextUtils.isEmpty(me.number)) {
                            i = (int) (Long.valueOf(me.number).longValue() % 14);
                        }
                    } catch (NumberFormatException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("number format not valid: ");
                        sb.append(me.number);
                        Log.w(sb.toString(), e);
                    }
                }
                if (i >= 0 && i <= 13) {
                    j2 = (long) (i - 6);
                }
                return new Date(1711380747000L + ((90 + j2) * 86400000));
            }
        }
        return new Date(j);
    }

    public boolean A02() {
        if (this.A01) {
            return true;
        }
        boolean after = new Date().after(A01());
        this.A01 = after;
        return after;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r4.after(new java.util.Date(A01().getTime() + 31536000000L));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r5 = this;
            java.util.Date r0 = r5.A00
            r3 = 1
            if (r0 != 0) goto L_0x0035
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            r1 = 1711207947000(0x18e6bf11af8, double:8.45449059503E-312)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            boolean r0 = r4.before(r0)
            if (r0 != 0) goto L_0x0033
            java.util.Date r0 = r5.A01()
            long r2 = r0.getTime()
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            boolean r3 = r4.after(r0)
            if (r3 == 0) goto L_0x0035
        L_0x0033:
            r5.A00 = r4
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21360z5.A03():boolean");
    }

    public C21360z5(C19730wQ r1, C19420v0 r2) {
        this.A03 = r1;
        this.A02 = r2;
    }
}
