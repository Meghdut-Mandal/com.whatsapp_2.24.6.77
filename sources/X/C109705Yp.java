package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.5Yp  reason: invalid class name and case insensitive filesystem */
public abstract class C109705Yp {
    public static C98624rj A00(AnonymousClass6QD r6, C114995iA r7, C115005iB r8, AnonymousClass65W r9) {
        HashMap A0J = AnonymousClass001.A0J();
        Objects.requireNonNull(r6);
        Iterator A10 = C36371kC.A10(r6.A02(AnonymousClass5TE.VIDEO));
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            A11.getKey();
            Iterator A13 = C90514aH.A13(A11.getValue());
            if (A13.hasNext()) {
                A13.next();
                throw AnonymousClass001.A0A("getMediaEffect");
            }
        }
        HashMap A0J2 = AnonymousClass001.A0J();
        Iterator A102 = C36371kC.A10(A0J);
        if (!A102.hasNext()) {
            return new C98624rj(r7, r8, r9, A0J2, A0J);
        }
        AnonymousClass000.A11(A102).getValue();
        throw AnonymousClass001.A0A("getStartTime");
    }
}
