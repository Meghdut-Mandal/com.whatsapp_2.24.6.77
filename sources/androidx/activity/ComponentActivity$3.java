package androidx.activity;

import X.AnonymousClass012;
import X.AnonymousClass01G;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import android.view.View;
import android.view.Window;

public class ComponentActivity$3 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass01G A00;

    public ComponentActivity$3(AnonymousClass01G r1) {
        this.A00 = r1;
    }

    public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
        Window window;
        View peekDecorView;
        if (r2 == AnonymousClass05R.ON_STOP && (window = this.A00.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }
}
