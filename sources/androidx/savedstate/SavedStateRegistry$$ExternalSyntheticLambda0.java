package androidx.savedstate;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01U;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;

public final /* synthetic */ class SavedStateRegistry$$ExternalSyntheticLambda0 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass01U A00;

    public /* synthetic */ SavedStateRegistry$$ExternalSyntheticLambda0(AnonymousClass01U r1) {
        this.A00 = r1;
    }

    public final void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        AnonymousClass01U r2 = this.A00;
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass00C.A0D(r4, 2);
        if (r4 == AnonymousClass05R.ON_START) {
            r2.A02 = true;
        } else if (r4 == AnonymousClass05R.ON_STOP) {
            r2.A02 = false;
        }
    }
}
