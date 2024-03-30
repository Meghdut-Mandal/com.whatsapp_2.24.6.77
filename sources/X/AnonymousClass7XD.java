package X;

import java.util.List;

/* renamed from: X.7XD  reason: invalid class name */
public final class AnonymousClass7XD extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7XD A00 = new AnonymousClass7XD();

    public AnonymousClass7XD() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6WI r0;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        AnonymousClass6P5 r02 = AnonymousClass6P5.A02;
        Object obj2 = A0m.get(0);
        AnonymousClass68V[] r03 = AnonymousClass6WI.A02;
        AnonymousClass7bL r5 = AnonymousClass6JC.A0G;
        AnonymousClass6WI r1 = null;
        if (AnonymousClass00C.A0J(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass6WI) C137206fl.A00(r5, obj2);
        }
        AnonymousClass00C.A0B(r0);
        long j = r0.A00;
        Object A0r = C90514aH.A0r(A0m);
        if (!AnonymousClass00C.A0J(A0r, false) && A0r != null) {
            r1 = (AnonymousClass6WI) C137206fl.A00(r5, A0r);
        }
        AnonymousClass00C.A0B(r1);
        return new AnonymousClass6P5(j, r1.A00);
    }
}
