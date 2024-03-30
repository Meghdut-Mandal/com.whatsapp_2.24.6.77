package X;

/* renamed from: X.6Xs  reason: invalid class name and case insensitive filesystem */
public class C133296Xs {
    public static final AnonymousClass6Um A00 = new AnonymousClass6Um();

    public static C140456lc A03(C157827ek r2) {
        if (!(r2 instanceof C140456lc)) {
            return null;
        }
        C140456lc r22 = (C140456lc) r2;
        if (C140456lc.A0B(r22) == null || C140456lc.A0B(r22).A04 != 13368) {
            return null;
        }
        return C140456lc.A0B(r22);
    }

    public static float A00(C140456lc r2, float f, int i, boolean z) {
        String str = (String) C140456lc.A0I(r2, i);
        if (str == null || (z && str.equals("auto"))) {
            return Float.NaN;
        }
        try {
            if (C90514aH.A1Z(str)) {
                return AnonymousClass6Y7.A00(str) * 0.01f * f;
            }
            return AnonymousClass6Y7.A01(str);
        } catch (AnonymousClass5R5 e) {
            AnonymousClass6RS.A00((C1271967i) null, "BloksFlexLayoutProvider", "Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static float A01(C140456lc r3, int i) {
        String str = (String) C140456lc.A0I(r3, i);
        if (str == null) {
            return Float.NaN;
        }
        try {
            return AnonymousClass6Y7.A01(str);
        } catch (AnonymousClass5R5 e) {
            AnonymousClass6RS.A00((C1271967i) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
            return Float.NaN;
        }
    }

    public static int A02(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public static void A04(C132136Sh r5, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (C90514aH.A1Z(str)) {
                A01 = AnonymousClass6Y7.A00(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    C132136Sh.A00(r5, 3);
                    fArr = r5.A01;
                    int i2 = r5.A00;
                    int i3 = i2 + 1;
                    r5.A00 = i3;
                    fArr[i2] = (float) 8;
                    i = i3 + 1;
                    r5.A00 = i;
                    fArr[i3] = (float) A02(num);
                } else {
                    return;
                }
            } else {
                A01 = AnonymousClass6Y7.A01(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    C132136Sh.A00(r5, 3);
                    fArr = r5.A01;
                    int i4 = r5.A00;
                    int i5 = i4 + 1;
                    r5.A00 = i5;
                    fArr[i4] = (float) 7;
                    i = i5 + 1;
                    r5.A00 = i;
                    fArr[i5] = (float) A02(num);
                } else {
                    return;
                }
            }
            r5.A00 = i + 1;
            fArr[i] = A01;
        } catch (AnonymousClass5R5 e) {
            AnonymousClass6RS.A00((C1271967i) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
        }
    }

    public static void A05(AnonymousClass6Um r5, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (C90514aH.A1Z(str)) {
                A01 = AnonymousClass6Y7.A00(str);
                if (!AnonymousClass6Um.A01(A01)) {
                    AnonymousClass6Um.A00(r5, 3);
                    fArr = r5.A01;
                    int i2 = r5.A00;
                    int i3 = i2 + 1;
                    r5.A00 = i3;
                    fArr[i2] = (float) 25;
                    i = i3 + 1;
                    r5.A00 = i;
                    fArr[i3] = (float) A02(num);
                } else {
                    return;
                }
            } else if (str.equals("auto")) {
                float[] A02 = AnonymousClass6Um.A02(r5);
                int i4 = r5.A00;
                int i5 = i4 + 1;
                r5.A00 = i5;
                A02[i4] = (float) 26;
                r5.A00 = i5 + 1;
                A02[i5] = (float) A02(num);
                return;
            } else {
                A01 = AnonymousClass6Y7.A01(str);
                if (!AnonymousClass6Um.A01(A01)) {
                    AnonymousClass6Um.A00(r5, 3);
                    fArr = r5.A01;
                    int i6 = r5.A00;
                    int i7 = i6 + 1;
                    r5.A00 = i7;
                    fArr[i6] = (float) 24;
                    i = i7 + 1;
                    r5.A00 = i;
                    fArr[i7] = (float) A02(num);
                } else {
                    return;
                }
            }
            r5.A00 = i + 1;
            fArr[i] = A01;
        } catch (AnonymousClass5R5 e) {
            AnonymousClass6RS.A00((C1271967i) null, "BloksFlexLayoutProvider", "Error parsing margin value", e);
        }
    }

    public static void A06(AnonymousClass6Um r5, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (C90514aH.A1Z(str)) {
                A01 = AnonymousClass6Y7.A00(str);
                if (!AnonymousClass6Um.A01(A01)) {
                    AnonymousClass6Um.A00(r5, 3);
                    fArr = r5.A01;
                    int i2 = r5.A00;
                    int i3 = i2 + 1;
                    r5.A00 = i3;
                    fArr[i2] = (float) 28;
                    i = i3 + 1;
                    r5.A00 = i;
                    fArr[i3] = (float) A02(num);
                } else {
                    return;
                }
            } else {
                A01 = AnonymousClass6Y7.A01(str);
                if (!AnonymousClass6Um.A01(A01)) {
                    AnonymousClass6Um.A00(r5, 3);
                    fArr = r5.A01;
                    int i4 = r5.A00;
                    int i5 = i4 + 1;
                    r5.A00 = i5;
                    fArr[i4] = (float) 27;
                    i = i5 + 1;
                    r5.A00 = i;
                    fArr[i5] = (float) A02(num);
                } else {
                    return;
                }
            }
            r5.A00 = i + 1;
            fArr[i] = A01;
        } catch (AnonymousClass5R5 e) {
            AnonymousClass6RS.A00((C1271967i) null, "BloksFlexLayoutProvider", "Error parsing position value", e);
        }
    }
}
