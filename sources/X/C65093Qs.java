package X;

/* renamed from: X.3Qs  reason: invalid class name and case insensitive filesystem */
public abstract class C65093Qs {
    public static void A01(C24541Cv r6, C20500xf r7, C21010yW r8, AnonymousClass11F r9, C19770wU r10, Integer num, Integer num2, int i) {
        AnonymousClass11F r5 = r9;
        if (AnonymousClass3M3.A01(r7, r9)) {
            Integer num3 = num;
            r10.Boy(new C81273wk(num3, r8, r6, num2, r5, i, 1));
        }
    }

    public static String A00(AnonymousClass3T1 r3) {
        String str = r3.A1J.A01;
        if (!AnonymousClass14B.A0F(str)) {
            String[] split = str.split("-");
            if (split.length >= 2) {
                return split[0];
            }
        }
        return null;
    }

    public static void A02(C20500xf r3, C21010yW r4, AnonymousClass3T1 r5, int i) {
        if (r5 != null) {
            C64933Qa r2 = r5.A1J;
            if (AnonymousClass3M3.A01(r3, r2.A00)) {
                AnonymousClass2QD r1 = new AnonymousClass2QD();
                r1.A03 = r2.A01;
                r1.A02 = A00(r5);
                r1.A00 = Integer.valueOf(AnonymousClass3T1.A04(r5));
                r1.A01 = Integer.valueOf(i);
                r4.Bly(r1);
            }
        }
    }
}
