package X;

import java.util.List;

/* renamed from: X.7X8  reason: invalid class name */
public final class AnonymousClass7X8 extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7X8 A00 = new AnonymousClass7X8();

    public AnonymousClass7X8() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C131266Oj r0;
        C131276Ok r02;
        AnonymousClass6WI r03;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = A0m.get(0);
        AnonymousClass6P5 r5 = null;
        if (obj2 != null) {
            r0 = (C131266Oj) obj2;
        } else {
            r0 = null;
        }
        AnonymousClass00C.A0B(r0);
        int i = r0.A00;
        Object A0r = C90514aH.A0r(A0m);
        if (A0r != null) {
            r02 = (C131276Ok) A0r;
        } else {
            r02 = null;
        }
        AnonymousClass00C.A0B(r02);
        int i2 = r02.A00;
        Object obj3 = A0m.get(2);
        AnonymousClass68V[] r04 = AnonymousClass6WI.A02;
        AnonymousClass7bL r1 = AnonymousClass6JC.A0G;
        if (AnonymousClass00C.A0J(obj3, false) || obj3 == null) {
            r03 = null;
        } else {
            r03 = (AnonymousClass6WI) C137206fl.A00(r1, obj3);
        }
        AnonymousClass00C.A0B(r03);
        long j = r03.A00;
        Object obj4 = A0m.get(3);
        AnonymousClass6P5 r05 = AnonymousClass6P5.A02;
        AnonymousClass7bL r12 = AnonymousClass6JC.A0E;
        if (!AnonymousClass00C.A0J(obj4, false) && obj4 != null) {
            r5 = (AnonymousClass6P5) C137206fl.A00(r12, obj4);
        }
        return new C129026Eq((C131236Og) null, r5, (AnonymousClass6P7) null, i, i2, 0, Integer.MIN_VALUE, j);
    }
}
