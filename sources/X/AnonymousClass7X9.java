package X;

import java.util.List;

/* renamed from: X.7X9  reason: invalid class name */
public final class AnonymousClass7X9 extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7X9 A00 = new AnonymousClass7X9();

    public AnonymousClass7X9() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C133336Xx r0;
        C133206Xf r02;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        AnonymousClass6PD r03 = AnonymousClass6PD.A03;
        Object obj2 = A0m.get(0);
        long j = C133336Xx.A01;
        AnonymousClass7bL r1 = AnonymousClass6JC.A04;
        Number number = null;
        if (AnonymousClass00C.A0J(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (C133336Xx) C137206fl.A00(r1, obj2);
        }
        AnonymousClass00C.A0B(r0);
        long j2 = r0.A00;
        Object A0r = C90514aH.A0r(A0m);
        long j3 = C133206Xf.A03;
        AnonymousClass7bL r12 = AnonymousClass6JC.A08;
        if (AnonymousClass00C.A0J(A0r, false) || A0r == null) {
            r02 = null;
        } else {
            r02 = (C133206Xf) C137206fl.A00(r12, A0r);
        }
        AnonymousClass00C.A0B(r02);
        long j4 = r02.A00;
        Object obj3 = A0m.get(2);
        if (obj3 != null) {
            number = (Number) obj3;
        }
        AnonymousClass00C.A0B(number);
        return new AnonymousClass6PD(number.floatValue(), j2, j4);
    }
}
