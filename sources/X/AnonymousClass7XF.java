package X;

import java.util.List;

/* renamed from: X.7XF  reason: invalid class name */
public final class AnonymousClass7XF extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7XF A00 = new AnonymousClass7XF();

    public AnonymousClass7XF() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object A0t = C36391kE.A0t(A0m);
        AnonymousClass68V r1 = null;
        if (A0t != null) {
            number = (Number) A0t;
        } else {
            number = null;
        }
        AnonymousClass00C.A0B(number);
        float floatValue = number.floatValue();
        Object A0r = C90514aH.A0r(A0m);
        if (A0r != null) {
            r1 = (AnonymousClass68V) A0r;
        }
        AnonymousClass00C.A0B(r1);
        return new AnonymousClass6WI(AnonymousClass6U3.A01(floatValue, r1.A00));
    }
}
