package X;

import java.util.List;

/* renamed from: X.7XJ  reason: invalid class name */
public final class AnonymousClass7XJ extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7XJ A00 = new AnonymousClass7XJ();

    public AnonymousClass7XJ() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass72L r0;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object obj2 = A0m.get(0);
        AnonymousClass7bL r2 = AnonymousClass6JC.A00;
        AnonymousClass6TT r1 = null;
        if (AnonymousClass00C.A0J(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass72L) C137206fl.A00(r2, obj2);
        }
        AnonymousClass00C.A0B(r0);
        Object A0r = C90514aH.A0r(A0m);
        AnonymousClass7bL r3 = AnonymousClass6JC.A0F;
        if (!AnonymousClass00C.A0J(A0r, false) && A0r != null) {
            r1 = (AnonymousClass6TT) C137206fl.A00(r3, A0r);
        }
        AnonymousClass00C.A0B(r1);
        return new AnonymousClass6P4(r0, r1.A00);
    }
}
