package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.3SX  reason: invalid class name */
public abstract class AnonymousClass3SX {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (A03(r7, r0) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r7, X.C19970wo r8, X.AnonymousClass141 r9) {
        /*
            r0 = 1
            X.AnonymousClass00C.A0D(r8, r0)
            r6 = 0
            if (r9 == 0) goto L_0x0017
            java.lang.String r5 = r9.A0Y
            if (r5 != 0) goto L_0x0018
            java.lang.String r0 = r9.A0X
            if (r0 == 0) goto L_0x0048
            if (r7 == 0) goto L_0x0048
            boolean r0 = A03(r7, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0017:
            return r6
        L_0x0018:
            long r3 = r9.A0D
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            return r6
        L_0x0029:
            java.lang.String r0 = r9.A0X
            if (r0 == 0) goto L_0x0047
            boolean r0 = X.AnonymousClass14B.A0F(r5)
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r9.A0Y
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r9.A0X
            java.lang.String r5 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0047:
            return r5
        L_0x0048:
            java.lang.String r5 = r9.A0X
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SX.A01(android.content.Context, X.0wo, X.141):java.lang.String");
    }

    public static final Drawable A00(Resources resources, AnonymousClass1H2 r7, String str) {
        return r7.A06(resources, new AnonymousClass2MA(str), 1.0f, -1);
    }

    public static final String A02(Context context, C19970wo r2, AnonymousClass141 r3, C20810yC r4) {
        C36321k7.A0w(r4, r2);
        if (C36431kI.A1X(r4)) {
            String A01 = A01(context, r2, r3);
            if (A01 == null || AnonymousClass098.A06(A01)) {
                return null;
            }
            return A01;
        }
        String str = r3.A0X;
        if (str != null && !AnonymousClass098.A06(str)) {
            return r3.A0X;
        }
        return null;
    }

    public static final boolean A03(Context context, String str) {
        if (str != null && !AnonymousClass098.A06(str) && !str.equals(context.getString(R.string.f12nameremoved))) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.f3nameremoved);
            AnonymousClass00C.A08(obtainTypedArray);
            int length = obtainTypedArray.length();
            int i = 0;
            while (i < length) {
                String string = obtainTypedArray.getString(i);
                if (string == null || !string.equals(str)) {
                    i++;
                } else {
                    obtainTypedArray.recycle();
                }
            }
            obtainTypedArray.recycle();
            return true;
        }
        return false;
    }
}
