package androidx.fragment.app;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass02E;
import X.AnonymousClass05R;
import android.view.View;

public class Fragment$6 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass02E A00;

    public Fragment$6(AnonymousClass02E r1) {
        this.A00 = r1;
    }

    public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
        View view;
        if (r2 == AnonymousClass05R.ON_STOP && (view = this.A00.A0F) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
