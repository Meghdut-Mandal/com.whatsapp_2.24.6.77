package androidx.activity;

import X.AnonymousClass012;
import X.AnonymousClass01G;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;

public class ComponentActivity$4 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass01G A00;

    public ComponentActivity$4(AnonymousClass01G r1) {
        this.A00 = r1;
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        if (r4 == AnonymousClass05R.ON_DESTROY) {
            AnonymousClass01G r2 = this.A00;
            r2.A03.A01 = null;
            if (!r2.isChangingConfigurations()) {
                r2.BJ7().A00();
            }
        }
    }
}
