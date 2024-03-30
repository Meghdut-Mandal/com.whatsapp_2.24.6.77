package X;

import android.text.TextUtils;

/* renamed from: X.9le  reason: invalid class name and case insensitive filesystem */
public abstract class C202359le {
    public static String A01(AnonymousClass3T1 r1) {
        AnonymousClass37E A00;
        if (!r1.A1R(8) || (A00 = C61583Cq.A00(r1)) == null) {
            return null;
        }
        String str = A00.A00;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    public static void A03(AnonymousClass8N3 r7, AnonymousClass37E r8) {
        AnonymousClass90Y r0;
        if (r8 != null) {
            String str = r8.A00;
            if (str != null) {
                C173308Re A06 = AnonymousClass8NN.A06(r7);
                A06.bitField0_ |= 32;
                A06.contentText_ = str;
            }
            String str2 = r8.A01;
            if (str2 != null) {
                C173308Re A062 = AnonymousClass8NN.A06(r7);
                A062.bitField0_ |= 64;
                A062.footerText_ = str2;
            }
            for (AnonymousClass3EY r5 : r8.A02) {
                AnonymousClass8NN A0p = C173078Qh.DEFAULT_INSTANCE.A0p();
                String str3 = r5.A04;
                C173078Qh r1 = (C173078Qh) C90524aI.A0H(A0p);
                str3.getClass();
                r1.bitField0_ |= 1;
                r1.buttonId_ = str3;
                int i = r5.A01;
                if (i == 2) {
                    r0 = AnonymousClass90Y.NATIVE_FLOW;
                } else if (i == 1) {
                    r0 = AnonymousClass90Y.RESPONSE;
                } else {
                    r0 = AnonymousClass90Y.UNKNOWN;
                }
                C173078Qh r12 = (C173078Qh) C90524aI.A0H(A0p);
                r12.type_ = r0.value;
                r12.bitField0_ |= 4;
                AnonymousClass8NN A0p2 = C172298Nh.DEFAULT_INSTANCE.A0p();
                String str4 = r5.A03;
                C172298Nh r13 = (C172298Nh) C90524aI.A0H(A0p2);
                str4.getClass();
                r13.bitField0_ |= 1;
                r13.displayText_ = str4;
                C172298Nh r02 = (C172298Nh) A0p2.A0R();
                C173078Qh r14 = (C173078Qh) C90524aI.A0H(A0p);
                r02.getClass();
                r14.buttonText_ = r02;
                r14.bitField0_ |= 2;
                C170918Hz A0R = A0p.A0R();
                C173308Re A063 = AnonymousClass8NN.A06(r7);
                A0R.getClass();
                C23122B6c b6c = A063.buttons_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    A063.buttons_ = b6c;
                }
                b6c.add(A0R);
            }
        }
    }

    public static boolean A04(AnonymousClass3T1 r1) {
        if (!r1.A1R(8) || C61583Cq.A00(r1) == null) {
            return false;
        }
        return true;
    }

    public static String A00(AnonymousClass3T1 r3) {
        String A01 = A01(r3);
        if (TextUtils.isEmpty(A01)) {
            return null;
        }
        StringBuilder A0i = C90524aI.A0i(A01);
        String str = C61583Cq.A00(r3).A01;
        if (!TextUtils.isEmpty(str)) {
            A0i.append("\n");
            A0i.append(str);
        }
        return A0i.toString();
    }

    public static String A02(AnonymousClass37E r4, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        if (r4 != null) {
            if (!TextUtils.isEmpty(str)) {
                A0u.append(str);
            }
            String str2 = r4.A00;
            if (!TextUtils.isEmpty(str2)) {
                if (A0u.length() > 0) {
                    A0u.append("\n");
                }
                A0u.append(str2);
            }
            String str3 = r4.A01;
            if (!TextUtils.isEmpty(str3)) {
                if (A0u.length() > 0) {
                    A0u.append("\n");
                }
                A0u.append(str3);
            }
        }
        return A0u.toString();
    }
}
