package X;

/* renamed from: X.1Wj  reason: invalid class name and case insensitive filesystem */
public class C29371Wj {
    public final C29361Wi A00;
    public final C21010yW A01;

    public static void A00(C29371Wj r3, C65613Su r4, Integer num) {
        if (r4 != null) {
            AnonymousClass2R8 r2 = new AnonymousClass2R8();
            r2.A04 = Long.valueOf((long) r4.A01);
            r2.A03 = Long.valueOf((long) r4.A03);
            r2.A02 = num;
            r2.A01 = Integer.valueOf(r4.A02);
            r3.A01.Bly(r2);
        }
    }

    public static void A01(C29371Wj r1, Integer num) {
        A00(r1, r1.A00.A01(), num);
    }

    public static void A02(C29371Wj r4, Integer num) {
        C65613Su A012 = r4.A00.A01();
        if (A012 != null) {
            AnonymousClass2QY r2 = new AnonymousClass2QY();
            r2.A03 = Long.valueOf((long) A012.A01);
            r2.A02 = Long.valueOf((long) A012.A03);
            r2.A01 = num;
            r4.A01.Bly(r2);
        }
    }

    public C29371Wj(C21010yW r1, C29361Wi r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
