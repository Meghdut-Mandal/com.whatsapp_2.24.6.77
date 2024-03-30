package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.6Qo  reason: invalid class name and case insensitive filesystem */
public abstract class C131776Qo {
    public static int A00(C1271967i r3, C140456lc r4) {
        C140456lc A0W = r4.A0W(38);
        if (A0W != null) {
            return AnonymousClass5Z8.A00(r3, A0W);
        }
        try {
            String str = (String) C140456lc.A0I(r4, 36);
            if (str == null) {
                return -16777216;
            }
            return AnonymousClass6Y7.A04(str);
        } catch (AnonymousClass5R5 e) {
            AnonymousClass6RS.A00(r3, "ColorDrawableUtils", "Error parsing border color in BoxDecoration", e);
            return 0;
        }
    }

    public static C91154bY A01(C1271967i r8, C140456lc r9, int i) {
        float A01;
        int A00;
        int A002;
        float A012;
        float[] A02;
        float A013;
        C91154bY r2 = new C91154bY();
        if (r9 == null) {
            A01 = 0.0f;
            A00 = 0;
            A002 = 0;
            A012 = 0.0f;
            A02 = null;
        } else {
            String str = (String) C140456lc.A0I(r9, 46);
            if (str == null) {
                A01 = 0.0f;
            } else {
                A01 = AnonymousClass6Y7.A01(str);
            }
            A00 = C131796Qq.A00(r9.A0d(56), 0);
            A002 = A00(r8, r9);
            String A0M = C140456lc.A0M(r9);
            if (A0M == null) {
                A012 = 0.0f;
            } else {
                A012 = AnonymousClass6Y7.A01(A0M);
            }
            A02 = A02(r9.A0d(62));
            String str2 = (String) C140456lc.A0I(r9, 63);
            if (str2 != null) {
                A013 = AnonymousClass6Y7.A01(str2);
                r2.A05.setColor(i);
                Paint paint = r2.A04;
                paint.setColor(A002);
                paint.setStrokeWidth(A012);
                if (A012 > 0.0f && A02 != null) {
                    paint.setPathEffect(new DashPathEffect(A02, A013));
                }
                r2.A02 = A01;
                r2.A03 = A00;
                float f = A012 / 2.0f;
                r2.A00 = f;
                r2.A01 = A01 - f;
                return r2;
            }
        }
        A013 = 0.0f;
        r2.A05.setColor(i);
        Paint paint2 = r2.A04;
        paint2.setColor(A002);
        paint2.setStrokeWidth(A012);
        paint2.setPathEffect(new DashPathEffect(A02, A013));
        r2.A02 = A01;
        r2.A03 = A00;
        float f2 = A012 / 2.0f;
        r2.A00 = f2;
        r2.A01 = A01 - f2;
        return r2;
    }

    public static float[] A02(List list) {
        float A01;
        if (list == null || list.size() == 0) {
            return null;
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String A0s = C36401kF.A0s(list, i);
            if (A0s == null) {
                A01 = 0.0f;
            } else {
                A01 = AnonymousClass6Y7.A01(A0s);
            }
            fArr[i] = A01;
        }
        return fArr;
    }
}
