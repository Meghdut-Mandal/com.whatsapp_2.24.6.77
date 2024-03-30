package X;

import java.util.List;

/* renamed from: X.68b  reason: invalid class name and case insensitive filesystem */
public class C1273868b {
    public final List A00 = AnonymousClass001.A0I();

    public static C1273868b A02(Object obj) {
        C1273868b r0 = new C1273868b();
        r0.A09(obj, 0);
        return r0;
    }

    public static C1273868b A00() {
        return new C1273868b();
    }

    public static C1273868b A01(Object obj) {
        C1273868b r1 = new C1273868b();
        r1.A09(obj, 0);
        return r1;
    }

    public static C1273868b A03(Object obj) {
        C1273868b r1 = new C1273868b();
        r1.A0A(obj, 0);
        return r1;
    }

    public static void A06(C1271967i r2, C140456lc r3, C1273868b r4, C160377ku r5) {
        C131756Qk.A02(r2, r3, new AnonymousClass6MO(r4.A00), r5);
    }

    public static void A07(C100674vP r2, C1273868b r3, C160377ku r4) {
        AnonymousClass6JI.A00(r2, new AnonymousClass6MO(r3.A00), r4);
    }

    public AnonymousClass6MO A08() {
        return new AnonymousClass6MO(this.A00);
    }

    public void A09(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw AnonymousClass001.A08("Arguments must be continuous");
    }

    @Deprecated
    public void A0A(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw AnonymousClass001.A08("Arguments must be continuous");
    }

    public static AnonymousClass6MO A04(C1273868b r0, Object obj, int i) {
        r0.A0A(obj, i);
        return new AnonymousClass6MO(r0.A00);
    }

    public static AnonymousClass6MO A05(C1273868b r0, Object obj, int i) {
        r0.A09(obj, i);
        return new AnonymousClass6MO(r0.A00);
    }
}
