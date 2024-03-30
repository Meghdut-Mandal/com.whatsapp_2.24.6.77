package X;

import android.view.View;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.3Mc  reason: invalid class name and case insensitive filesystem */
public abstract class C63963Mc {
    public static final Map A00 = C36431kI.A1G();

    public static final C129136Fi A00(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof C129136Fi) {
            return (C129136Fi) tag;
        }
        return null;
    }
}
