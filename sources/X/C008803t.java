package X;

/* renamed from: X.03t  reason: invalid class name and case insensitive filesystem */
public abstract class C008803t {
    public static C005202i A00(C005202i r1, C005902p r2) {
        AnonymousClass00C.A0D(r2, 1);
        if (!AnonymousClass00C.A0J(r1.getKey(), r2)) {
            return null;
        }
        return r1;
    }

    public static C005102h A01(C005202i r1, C005902p r2) {
        AnonymousClass00C.A0D(r2, 1);
        boolean A0J = AnonymousClass00C.A0J(r1.getKey(), r2);
        Object obj = r1;
        if (A0J) {
            obj = C008903u.A00;
        }
        return (C005102h) obj;
    }

    public static C005102h A02(C005202i r1, C005102h r2) {
        AnonymousClass00C.A0D(r2, 1);
        if (r2 != C008903u.A00) {
            return (C005102h) r2.fold(r1, C009103w.A00);
        }
        return r1;
    }
}
