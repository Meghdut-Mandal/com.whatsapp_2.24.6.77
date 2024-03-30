package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7X5  reason: invalid class name */
public final class AnonymousClass7X5 extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7X5 A00 = new AnonymousClass7X5();

    public AnonymousClass7X5() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList A0r = C36361kB.A0r(A0m);
        int size = A0m.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = A0m.get(i);
            AnonymousClass7bL r2 = AnonymousClass6JC.A07;
            Object obj3 = null;
            if (!C36371kC.A1X(obj2, false) && obj2 != null) {
                obj3 = C137206fl.A00(r2, obj2);
            }
            AnonymousClass00C.A0B(obj3);
            A0r.add(obj3);
        }
        return new AnonymousClass75Q(A0r);
    }
}
