package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3D0  reason: invalid class name */
public final class AnonymousClass3D0 {
    public static volatile C61003Ae A01;
    public static volatile boolean A02;
    public final Map A00;

    public AnonymousClass3D0(Map map) {
        AnonymousClass00C.A0D(map, 1);
        this.A00 = map;
    }

    public final C61003Ae A01() {
        if (!A02) {
            A02 = true;
            if (A01 == null) {
                try {
                    C585630e r0 = (C585630e) C36371kC.A0r(this.A00, 0);
                    if (r0 != null) {
                        A01 = r0.A00;
                    }
                } catch (Exception e) {
                    Log.e("wfs-bridge-factory", e);
                    return null;
                }
            }
        }
        return A01;
    }

    public static C61003Ae A00(AnonymousClass005 r0) {
        C61003Ae A012 = ((AnonymousClass3D0) r0.get()).A01();
        C18740tg.A06(A012);
        return A012;
    }
}
