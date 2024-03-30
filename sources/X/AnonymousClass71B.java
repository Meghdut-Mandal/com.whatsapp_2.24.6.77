package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.71B  reason: invalid class name */
public final class AnonymousClass71B implements C158717hx {
    public final AnonymousClass6PZ A00;
    public final C20810yC A01;

    public void BlS(Activity activity, C594233w r9, Map map) {
        Boolean bool;
        if (map != null) {
            String A0a = C90464aC.A0a("screen_id", map);
            int A0C = C90484aE.A0C(map.get("screen_length"), "null cannot be cast to non-null type kotlin.Int");
            if (this.A01.A0E(7077)) {
                Object obj = map.get("is_success_screen");
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                    this.A00.A01(bool, C36441kJ.A0y(A0C), A0a, (String) null, (String) null, (String) null);
                }
            }
            bool = null;
            this.A00.A01(bool, C36441kJ.A0y(A0C), A0a, (String) null, (String) null, (String) null);
        }
    }

    public AnonymousClass71B(AnonymousClass6PZ r1, C20810yC r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
