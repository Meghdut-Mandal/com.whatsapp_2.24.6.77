package androidx.lifecycle;

import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass01U;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass08M;

public final class SavedStateHandleController implements AnonymousClass01Y {
    public boolean A00 = false;
    public final AnonymousClass08M A01;
    public final String A02;

    public void A00(AnonymousClass01M r3, AnonymousClass01U r4) {
        if (!this.A00) {
            this.A00 = true;
            r3.A04(this);
            r4.A03(this.A01.A00, this.A02);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
        if (r2 == AnonymousClass05R.ON_DESTROY) {
            this.A00 = false;
            r3.getLifecycle().A05(this);
        }
    }

    public SavedStateHandleController(AnonymousClass08M r2, String str) {
        this.A02 = str;
        this.A01 = r2;
    }
}
