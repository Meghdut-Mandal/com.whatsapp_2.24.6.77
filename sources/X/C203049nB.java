package X;

/* renamed from: X.9nB  reason: invalid class name and case insensitive filesystem */
public abstract class C203049nB {
    public static C131606Ps A01(C19970wo r7, AnonymousClass16X r8, AnonymousClass6O3 r9, String str, boolean z) {
        C131606Ps[] r0;
        C198299dE r6;
        int A00;
        if (r9 == null || (r6 = r9.A01) == null || (A00 = r9.A00(C36371kC.A09(r7))) == 0 || A00 == 3) {
            r0 = new C131606Ps[0];
        } else {
            C178558gj r5 = new C178558gj();
            r5.A04("is_ended_early", AnonymousClass000.A1S(A00, 4));
            if (z) {
                r5.A04("is_sender_receiver_eligible", AnonymousClass000.A1Q(r9.A00));
            }
            AnonymousClass16X r02 = r6.A09.A00.A02;
            if (r8 != null) {
                r5.A04("is_amount_low", C36431kI.A1P(r8.A00.compareTo(r02.A00)));
            }
            r0 = new C131606Ps[]{r5};
        }
        C131606Ps r1 = new C131606Ps((String) null, r0);
        if (str != null) {
            r1.A03("section", str);
        }
        if (r1.A01.length() > 0) {
            return r1;
        }
        return null;
    }

    public static C131606Ps A02(C19970wo r2, AnonymousClass16X r3, AnonymousClass6O3 r4, boolean z) {
        C131606Ps A01 = A01(r2, r3, r4, (String) null, true);
        if (A01 == null) {
            A01 = C165567td.A0F();
        }
        A01.A04("is_p2m_buyer_initiated", z);
        return A01;
    }

    public static void A03(C131606Ps r2, C23075B3f b3f, Integer num, String str, String str2, int i) {
        C23075B3f b3f2 = b3f;
        C18740tg.A06(b3f);
        if (r2 != null) {
            b3f2.BOp(r2, Integer.valueOf(i), num, str, str2);
        } else {
            b3f.BOm(Integer.valueOf(i), num, str, str2);
        }
    }

    public static void A04(C131606Ps r6, C23075B3f b3f, String str, String str2) {
        A03(r6, b3f, (Integer) null, str, str2, 0);
    }

    public static C131606Ps A00() {
        C131606Ps A0F = C165567td.A0F();
        A0F.A03("product_flow", "p2m");
        return A0F;
    }
}
