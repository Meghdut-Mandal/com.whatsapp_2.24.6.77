package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ng  reason: invalid class name and case insensitive filesystem */
public final class C64253Ng {
    public final AnonymousClass3P0 A00;
    public final C52342pH A01;
    public final AnonymousClass3EJ A02;

    public C64253Ng(AnonymousClass3P0 r1, C52342pH r2, AnonymousClass3EJ r3) {
        C36321k7.A0z(r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final List A00(C64253Ng r5, List list, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3EJ.A00(C36441kJ.A0h(it), r5.A02, A0I, false, z);
        }
        return A0I;
    }
}
