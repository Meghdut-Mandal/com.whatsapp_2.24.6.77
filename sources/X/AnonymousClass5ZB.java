package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.5ZB  reason: invalid class name */
public abstract class AnonymousClass5ZB {
    public static final AnonymousClass69R A00(C129996Jh r4, List list) {
        C115195iU r0;
        C115185iT r02;
        C124915z0 r03;
        HashMap A0J = AnonymousClass001.A0J();
        for (C118855oq r04 : r4.A01) {
            String str = r04.A01;
            if (!(str == null || (r0 = r04.A00) == null || (r02 = r0.A00) == null || (r03 = r02.A00) == null)) {
                A0J.put(str, AnonymousClass6XK.A02(r03, list));
            }
        }
        return new AnonymousClass69R(r4.A00, A0J);
    }
}
