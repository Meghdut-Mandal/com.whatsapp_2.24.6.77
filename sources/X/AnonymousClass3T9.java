package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.3T9  reason: invalid class name */
public abstract class AnonymousClass3T9 {
    public static boolean A03(C20810yC r1, AnonymousClass3T1 r2) {
        if (!r1.A0E(2579) || r2 == null) {
            return false;
        }
        if ((r2 instanceof AnonymousClass2bV) || (r2 instanceof AnonymousClass2bI) || (r2 instanceof C46882bp) || (r2 instanceof C181798o3) || (r2 instanceof C181788o2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 != 6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r1 = com.whatsapp.R.drawable.msg_status_waiting;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if ((r9.A0I + 86400000) < X.C19970wo.A00(r8)) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.C36401kF.A1U(X.AnonymousClass3TJ.A00(r9.A0D, 4)) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(android.content.Context r7, X.C19970wo r8, X.AnonymousClass3T1 r9) {
        /*
            boolean r0 = X.C66013Ui.A0n(r9)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r3 = 4
            r2 = 0
            if (r0 == 0) goto L_0x001e
            X.3Qa r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001e
            int r0 = r9.A0D
            int r0 = X.AnonymousClass3TJ.A00(r0, r3)
            boolean r0 = X.C36401kF.A1U(r0)
            if (r0 == 0) goto L_0x0056
        L_0x001d:
            return r2
        L_0x001e:
            X.3Qa r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001d
            int r1 = r9.A0D
            if (r1 == 0) goto L_0x0056
            r0 = 8
            if (r1 == r0) goto L_0x004f
            r0 = 13
            if (r1 == r0) goto L_0x004f
            r0 = 20
            if (r1 == r0) goto L_0x0061
            if (r1 == r3) goto L_0x004b
            r0 = 5
            if (r1 == r0) goto L_0x0047
            r0 = 6
            if (r1 == r0) goto L_0x001d
        L_0x003c:
            r1 = 2131233283(0x7f080a03, float:1.80827E38)
        L_0x003f:
            r0 = 2131101697(0x7f060801, float:1.781581E38)
        L_0x0042:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r7, r1, r0)
            return r0
        L_0x0047:
            r1 = 2131233220(0x7f0809c4, float:1.8082571E38)
            goto L_0x003f
        L_0x004b:
            r1 = 2131233267(0x7f0809f3, float:1.8082667E38)
            goto L_0x003f
        L_0x004f:
            r1 = 2131233220(0x7f0809c4, float:1.8082571E38)
            r0 = 2131101696(0x7f060800, float:1.7815809E38)
            goto L_0x0042
        L_0x0056:
            long r3 = r9.A0I
            long r3 = r3 + r5
            long r1 = X.C19970wo.A00(r8)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
        L_0x0061:
            r0 = 2131233232(0x7f0809d0, float:1.8082596E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T9.A00(android.content.Context, X.0wo, X.3T1):android.graphics.drawable.Drawable");
    }

    public static String A01(Context context, C46882bp r3) {
        String A01 = C202359le.A01(r3);
        if (!TextUtils.isEmpty(A01)) {
            return A01;
        }
        if (AnonymousClass2bU.A02(r3) || C202359le.A04(r3)) {
            return context.getString(R.string.f12nameremoved);
        }
        return r3.A1a();
    }

    public static String A02(Context context, C181798o3 r3) {
        String A01 = C202359le.A01(r3);
        if (!TextUtils.isEmpty(A01)) {
            return A01;
        }
        if (AnonymousClass2bU.A02(r3) || C202359le.A04(r3)) {
            return context.getString(R.string.f12nameremoved);
        }
        return r3.A1a();
    }
}
