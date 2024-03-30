package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.719  reason: invalid class name */
public final class AnonymousClass719 implements C158717hx {
    public void BlS(Activity activity, C594233w r6, Map map) {
        boolean z = false;
        if (map != null) {
            if (map.containsKey("is_intermediate_screen")) {
                AnonymousClass00C.A0E(map.get("is_intermediate_screen"), "null cannot be cast to non-null type kotlin.Boolean");
            }
            if (map.containsKey("show_loading")) {
                z = C90474aD.A1W(map, "show_loading");
            }
        }
        if (activity instanceof AnonymousClass7i0) {
            ((AnonymousClass7i0) activity).BsW(z);
        }
    }
}
