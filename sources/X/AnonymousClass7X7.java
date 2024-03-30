package X;

import java.util.List;

/* renamed from: X.7X7  reason: invalid class name */
public final class AnonymousClass7X7 extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7X7 A00 = new AnonymousClass7X7();

    public AnonymousClass7X7() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A0B;
        if (C36371kC.A1X(obj, false)) {
            A0B = C133206Xf.A02;
        } else {
            List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = A0m.get(0);
            Number number2 = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            AnonymousClass00C.A0B(number);
            float floatValue = number.floatValue();
            Object A0r = C90514aH.A0r(A0m);
            if (A0r != null) {
                number2 = (Number) A0r;
            }
            AnonymousClass00C.A0B(number2);
            A0B = C90464aC.A0B(floatValue, number2.floatValue());
        }
        return new C133206Xf(A0B);
    }
}
