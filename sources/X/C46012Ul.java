package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Ul  reason: invalid class name and case insensitive filesystem */
public final class C46012Ul extends AnonymousClass66O {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        AnonymousClass00C.A0D(map, 0);
        ArrayList A14 = C36441kJ.A14(map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            A14.add(C36351kA.A0u(A0y).toString());
        }
        return C36381kD.A0x("\n", A14);
    }
}
