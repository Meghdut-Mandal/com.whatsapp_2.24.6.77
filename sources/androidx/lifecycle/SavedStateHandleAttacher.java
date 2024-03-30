package androidx.lifecycle;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.C003901s;

public final class SavedStateHandleAttacher implements AnonymousClass01Y {
    public final C003901s A00;

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass00C.A0D(r4, 1);
        if (r4 == AnonymousClass05R.ON_CREATE) {
            r5.getLifecycle().A05(this);
            C003901s r2 = this.A00;
            if (!r2.A01) {
                r2.A00 = r2.A02.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
                r2.A01 = true;
                r2.A03.getValue();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Next event must be ON_CREATE, it was ");
        sb.append(r4);
        throw new IllegalStateException(sb.toString());
    }

    public SavedStateHandleAttacher(C003901s r1) {
        this.A00 = r1;
    }
}
