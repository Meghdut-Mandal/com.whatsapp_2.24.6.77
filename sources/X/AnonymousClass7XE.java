package X;

import java.util.List;

/* renamed from: X.7XE  reason: invalid class name */
public final class AnonymousClass7XE extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7XE A00 = new AnonymousClass7XE();

    public AnonymousClass7XE() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object A0t = C36391kE.A0t(A0m);
        Number number2 = null;
        if (A0t != null) {
            number = (Number) A0t;
        } else {
            number = null;
        }
        int A07 = C36411kG.A07(number);
        Object A0r = C90514aH.A0r(A0m);
        if (A0r != null) {
            number2 = (Number) A0r;
        }
        return new AnonymousClass6TT(AnonymousClass5XQ.A00(A07, C36411kG.A07(number2)));
    }
}
