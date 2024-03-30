package X;

import java.util.List;
import java.util.Objects;

/* renamed from: X.6MO  reason: invalid class name */
public class AnonymousClass6MO {
    public static final AnonymousClass6MO A01 = new AnonymousClass6MO(C1273868b.A00().A00);
    public final List A00;

    public static Object A01(AnonymousClass6MO r2, Object obj) {
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass00C.A0D(obj, 1);
        return r2.A04(0);
    }

    public static Object A00(AnonymousClass6MO r0, int i) {
        return r0.A00.get(i);
    }

    public static String A02(AnonymousClass6MO r0, int i) {
        return (String) r0.A00.get(i);
    }

    public AnonymousClass6MO(List list) {
        this.A00 = list;
    }

    public static String A03(AnonymousClass6MO r0, int i) {
        Object A04 = r0.A04(i);
        AnonymousClass00C.A0E(A04, "null cannot be cast to non-null type kotlin.String");
        return (String) A04;
    }

    public Object A04(int i) {
        Object A002 = A00(this, i);
        Objects.requireNonNull(A002);
        return A002;
    }
}
