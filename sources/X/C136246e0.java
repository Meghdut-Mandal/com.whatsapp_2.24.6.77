package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6e0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136246e0 implements AnonymousClass08V {
    public static final /* synthetic */ C136246e0 A00 = new C136246e0();

    public final Object apply(Object obj) {
        AnonymousClass6X2 r7;
        List<AnonymousClass6DQ> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList A0J = C36321k7.A0J(list);
        for (AnonymousClass6DQ r2 : list) {
            List list2 = r2.A04;
            if (C36401kF.A1a(list2)) {
                r7 = (AnonymousClass6X2) C36391kE.A0t(list2);
            } else {
                r7 = AnonymousClass6X2.A01;
            }
            UUID fromString = UUID.fromString(r2.A03);
            A0J.add(new AnonymousClass6DP(r2.A01, r7, r2.A02, r2.A05, fromString, r2.A00, r2.A06));
        }
        return A0J;
    }
}
