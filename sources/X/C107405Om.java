package X;

import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5Om  reason: invalid class name and case insensitive filesystem */
public class C107405Om extends C107415On {
    public C107405Om(C18820ts r4, WaBloksActivity waBloksActivity) {
        super(r4, waBloksActivity);
        Window window;
        int A00;
        if (C19550w8.A01() || !C222013h.A05) {
            window = waBloksActivity.getWindow();
            A00 = C224314h.A00(waBloksActivity);
        } else {
            window = waBloksActivity.getWindow();
            A00 = R.color.f6nameremoved;
        }
        AnonymousClass1RB.A00(window, AnonymousClass00F.A00(waBloksActivity, A00), true);
    }
}
