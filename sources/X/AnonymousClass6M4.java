package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.6M4  reason: invalid class name */
public final class AnonymousClass6M4 {
    public static final AnonymousClass6M4 A00 = new AnonymousClass6M4();

    public final C123625wo A00(Context context, C140456lc r15) {
        Integer num;
        int i;
        int i2;
        int i3;
        float A01;
        int i4;
        float A012;
        Integer valueOf;
        Integer valueOf2;
        Rect rect;
        C140456lc A0W = r15.A0W(94);
        if (A0W != null) {
            int A002 = AnonymousClass5Y2.A00(r15);
            int i5 = A0W.A04;
            if (i5 == 16373) {
                num = C023109s.A00;
            } else if (i5 == 16483) {
                num = C023109s.A01;
            } else {
                throw AnonymousClass000.A0d("GridCommonUtils: Grid type is unknown for style ", AnonymousClass000.A0u(), i5);
            }
            int intValue = num.intValue();
            int i6 = 41;
            if (intValue != 0) {
                i6 = 40;
            }
            int A0T = A0W.A0T(i6, -1);
            if (A0T != -1) {
                if (intValue != 0) {
                    i = 36;
                    i2 = 35;
                } else {
                    i = 38;
                    i2 = 36;
                }
                AnonymousClass011 A19 = C36441kJ.A19(i, i2);
                int A0H = C90484aE.A0H(A19);
                int A08 = C90474aD.A08(A19);
                String str = (String) C140456lc.A0I(A0W, A0H);
                if (str == null) {
                    A01 = 0.0f;
                } else {
                    try {
                        A01 = AnonymousClass6Y7.A01(str);
                    } catch (AnonymousClass5R5 unused) {
                        AnonymousClass6RS.A01("GridCommonUtils", AnonymousClass000.A0p("Invalid pixel format for grid spacing ", str, AnonymousClass000.A0u()));
                        i3 = (int) 0.0f;
                    }
                }
                i3 = (int) A01;
                String str2 = (String) C140456lc.A0I(A0W, A08);
                if (str2 == null) {
                    A012 = 0.0f;
                } else {
                    try {
                        A012 = AnonymousClass6Y7.A01(str2);
                    } catch (AnonymousClass5R5 unused2) {
                        AnonymousClass6RS.A01("GridCommonUtils", AnonymousClass000.A0p("Invalid pixel format for grid spacing ", str2, AnonymousClass000.A0u()));
                        i4 = (int) 0.0f;
                    }
                }
                i4 = (int) A012;
                if (A002 == 1) {
                    valueOf = Integer.valueOf(i4);
                    valueOf2 = Integer.valueOf(i3);
                } else {
                    valueOf = Integer.valueOf(i3);
                    valueOf2 = Integer.valueOf(i4);
                }
                AnonymousClass011 A192 = C36441kJ.A19(valueOf, valueOf2);
                int A0H2 = C90484aE.A0H(A192);
                int A082 = C90474aD.A08(A192);
                int i7 = 40;
                if (intValue != 0) {
                    i7 = 38;
                }
                C140456lc A0W2 = A0W.A0W(i7);
                if (A0W2 == null) {
                    rect = AnonymousClass001.A06();
                } else {
                    int A003 = (int) AnonymousClass6Qn.A00(A0W2, 42);
                    int A004 = (int) AnonymousClass6Qn.A00(A0W2, 40);
                    int A005 = (int) AnonymousClass6Qn.A00(A0W2, 41);
                    int A006 = (int) AnonymousClass6Qn.A00(A0W2, 35);
                    int A007 = (int) AnonymousClass6Qn.A00(A0W2, 36);
                    int A008 = (int) AnonymousClass6Qn.A00(A0W2, 38);
                    if (AnonymousClass5ZC.A00(context)) {
                        if (A005 == 0) {
                            A005 = A007;
                        }
                        if (A003 == 0) {
                            A003 = A008;
                        }
                        rect = new Rect(A005, A004, A003, A006);
                    } else {
                        if (A003 == 0) {
                            A003 = A007;
                        }
                        if (A005 == 0) {
                            A005 = A008;
                        }
                        rect = new Rect(A003, A004, A005, A006);
                    }
                }
                return new C123625wo(rect, A0W, A002, A0T, A0H2, A082);
            }
            throw AnonymousClass001.A08("GridCommonUtils: span-count is required for grids");
        }
        throw AnonymousClass001.A08("GridCommonUtils: grid layout config should be defined");
    }
}
