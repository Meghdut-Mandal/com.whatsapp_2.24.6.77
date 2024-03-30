package X;

import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.1RA  reason: invalid class name */
public abstract class AnonymousClass1RA {
    public static final void A00(Window window, Toolbar toolbar) {
        Integer num;
        AnonymousClass00C.A0D(toolbar, 0);
        AnonymousClass00C.A0D(window, 1);
        if ((toolbar instanceof WDSToolbar) && (num = ((WDSToolbar) toolbar).A08.A02) != null) {
            AnonymousClass1RB.A00(window, num.intValue(), true);
        }
    }

    public static final void A01(Toolbar toolbar, C27951Qm r2) {
        WDSToolbar wDSToolbar;
        AnonymousClass00C.A0D(toolbar, 0);
        AnonymousClass00C.A0D(r2, 1);
        if ((toolbar instanceof WDSToolbar) && (wDSToolbar = (WDSToolbar) toolbar) != null) {
            wDSToolbar.setDividerVisibility(r2);
        }
    }
}
