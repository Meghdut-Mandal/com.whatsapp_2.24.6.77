package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.6Wg  reason: invalid class name and case insensitive filesystem */
public final class C133016Wg {
    public static final C133016Wg A00 = new C133016Wg();

    public static final AnonymousClass6WB A01(C1271967i r20, C100674vP r21, C140456lc r22) {
        C134916bo r1;
        C134916bo r12;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        C140456lc r0 = r22;
        if (r22 != null) {
            int i = r0.A04;
            C1271967i r9 = r20;
            C100674vP r4 = r21;
            if (i == 14059) {
                boolean A0f = r0.A0f(36, false);
                String A0P = C140456lc.A0P(r0, "FULL_SHEET", 40);
                try {
                    if (A0P.equals("FULL_SHEET")) {
                        num = C023109s.A00;
                    } else if (A0P.equals("HALF_SHEET")) {
                        num = C023109s.A01;
                    } else {
                        throw AnonymousClass001.A08(A0P);
                    }
                } catch (IllegalArgumentException e) {
                    AnonymousClass6RS.A02("CdsOpenScreenConfig", e);
                    num = C023109s.A00;
                }
                String A0P2 = C140456lc.A0P(r0, "NEVER_ANIMATED", 46);
                try {
                    if (A0P2.equals("ALWAYS_ANIMATED")) {
                        num2 = C023109s.A00;
                    } else if (A0P2.equals("DISABLED")) {
                        num2 = C023109s.A01;
                    } else if (A0P2.equals("NEVER_ANIMATED")) {
                        num2 = C023109s.A0C;
                    } else if (A0P2.equals("ONLY_ANIMATED_WHILE_LOADING")) {
                        num2 = C023109s.A0G;
                    } else {
                        throw AnonymousClass001.A08(A0P2);
                    }
                } catch (IllegalArgumentException e2) {
                    AnonymousClass6RS.A02("CdsOpenScreenConfig", e2);
                    num2 = C023109s.A0C;
                }
                C160377ku A0X = r0.A0X(42);
                if (A0f) {
                    num3 = C023109s.A0C;
                } else {
                    num3 = C023109s.A01;
                }
                Integer num5 = C023109s.A00;
                Integer num6 = num5;
                if (num != num5) {
                    num5 = C023109s.A01;
                }
                int intValue = num2.intValue();
                if (intValue == 0) {
                    num4 = C023109s.A01;
                } else if (intValue == 1) {
                    num4 = C023109s.A0R;
                } else if (intValue != 3) {
                    num4 = num6;
                } else {
                    num4 = C023109s.A0C;
                }
                return new AnonymousClass6WB(r9, new C134476b6(new C142336oi(r9, r4, r0, A0X)), (C134916bo) null, (C134596bI) null, (C134596bI) null, num3, num5, num4, num6, (Integer) null, (Integer) null, (String) null, 16542, false, false, false);
            } else if (i == 16085) {
                Integer A002 = AnonymousClass6IM.A00(C140456lc.A0P(r0, "auto", 36));
                Integer A003 = AnonymousClass6RW.A00(C140456lc.A0P(r0, "full_sheet", 38));
                AnonymousClass00C.A08(A003);
                Integer A004 = AnonymousClass6RU.A00(C140456lc.A0P(r0, "static", 35));
                AnonymousClass00C.A08(A004);
                Integer A005 = AnonymousClass6RV.A00(C140456lc.A0P(r0, "auto", 43));
                AnonymousClass00C.A08(A005);
                C134596bI A03 = A03(r0.A0W(55));
                Integer A006 = C109535Xy.A00(r0.A0a(45, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
                C134596bI A02 = A02(r0.A0W(57));
                C140456lc A0W = r0.A0W(58);
                if (A0W == null) {
                    r12 = null;
                } else {
                    r12 = new C134916bo(A00(A0W, 36), A00(A0W, 40), A00(A0W, 38), A00(A0W, 35));
                }
                C160377ku A0X2 = r0.A0X(40);
                return new AnonymousClass6WB(r9, new C134476b6(new C142336oi(r9, r4, r0, A0X2)), r12, A03, A02, A002, A003, A004, A005, (Integer) null, A006, (String) null, 16542, r0.A0f(48, false), false, false);
            } else if (i == 16542) {
                Integer A007 = AnonymousClass6RW.A00(C140456lc.A0P(r0, "full_sheet", 35));
                AnonymousClass00C.A08(A007);
                Integer A008 = AnonymousClass6IM.A00(C140456lc.A0P(r0, "auto", 38));
                String A0P3 = C140456lc.A0P(r0, "adjust_pan", 40);
                int hashCode = A0P3.hashCode();
                int i2 = 32;
                if (hashCode != -1009740956) {
                    if (hashCode == -205076707 && A0P3.equals("adjust_nothing")) {
                        i2 = 48;
                    }
                } else if (A0P3.equals("adjust_resize")) {
                    i2 = 16;
                }
                Integer A009 = C109535Xy.A00(r0.A0a(41, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
                C134596bI A032 = A03(r0.A0W(52));
                C134596bI A022 = A02(r0.A0W(54));
                C140456lc A0W2 = r0.A0W(55);
                if (A0W2 == null) {
                    r1 = null;
                } else {
                    r1 = new C134916bo(A00(A0W2, 36), A00(A0W2, 40), A00(A0W2, 38), A00(A0W2, 35));
                }
                Integer num7 = C023109s.A00;
                return new AnonymousClass6WB(r9, (C134476b6) null, r1, A032, A022, A008, A007, num7, num7, Integer.valueOf(i2), A009, (String) null, 16542, false, false, false);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Error matching OpenCDSSCreenConfig from options styleId: ");
                AnonymousClass6RS.A01("CdsOpenScreenConfig", AnonymousClass000.A0o(C140456lc.A0B(r0), A0u));
            }
        }
        return new AnonymousClass6WB((C1271967i) null, (C134476b6) null, (C134916bo) null, (C134596bI) null, (C134596bI) null, AnonymousClass6WB.A0I, AnonymousClass6WB.A0J, AnonymousClass6WB.A0G, AnonymousClass6WB.A0H, (Integer) null, (Integer) null, (String) null, 16542, false, false, false);
    }

    public static final C134596bI A02(C140456lc r2) {
        int A04;
        int A042;
        if (r2 == null) {
            return null;
        }
        String A0K = C140456lc.A0K(r2);
        if (A0K == null) {
            A04 = 16777215;
        } else {
            A04 = AnonymousClass6Y7.A04(A0K);
        }
        String A0J = C140456lc.A0J(r2);
        if (A0J == null) {
            A042 = 16777215;
        } else {
            A042 = AnonymousClass6Y7.A04(A0J);
        }
        return new C134596bI(A04, A042);
    }

    public static final C134596bI A03(C140456lc r2) {
        int A04;
        int A042;
        if (r2 == null) {
            return null;
        }
        String A0K = C140456lc.A0K(r2);
        if (A0K == null) {
            A04 = -1728053248;
        } else {
            A04 = AnonymousClass6Y7.A04(A0K);
        }
        String A0J = C140456lc.A0J(r2);
        if (A0J == null) {
            A042 = -1728053248;
        } else {
            A042 = AnonymousClass6Y7.A04(A0J);
        }
        return new C134596bI(A04, A042);
    }

    public static final int A00(C140456lc r5, int i) {
        String str;
        StringBuilder A0u;
        float A01;
        String str2 = (String) C140456lc.A0I(r5, i);
        if (str2 == null) {
            A01 = 4.0f;
        } else {
            try {
                A01 = AnonymousClass6Y7.A01(str2);
            } catch (AnonymousClass5R5 unused) {
                if (i != 35) {
                    if (i == 36) {
                        str = "left";
                    } else if (i == 38) {
                        str = "right";
                    } else if (i != 40) {
                        A0u = AnonymousClass000.A0u();
                        A0u.append("Invalid BottomSheetMargin prop constant: ");
                        A0u.append(i);
                    } else {
                        str = "top";
                    }
                    A0u = AnonymousClass000.A0u();
                    A0u.append("Invalid format for bottom-sheet-margin prop ");
                    A0u.append(str);
                    A0u.append(" : ");
                    A0u.append(str2);
                } else {
                    str = "bottom";
                    A0u = AnonymousClass000.A0u();
                    A0u.append("Invalid format for bottom-sheet-margin prop ");
                    A0u.append(str);
                    A0u.append(" : ");
                    A0u.append(str2);
                }
                AnonymousClass6RS.A01("BloksCdsOpenScreenConfig", A0u.toString());
                return 0;
            }
        }
        return (int) A01;
    }
}
