package androidx.core.view;

import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass01S;
import X.AnonymousClass01Y;
import X.AnonymousClass027;
import X.AnonymousClass05R;

public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda1 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass01S A00;
    public final /* synthetic */ AnonymousClass027 A01;
    public final /* synthetic */ AnonymousClass01P A02;

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda1(AnonymousClass01S r1, AnonymousClass027 r2, AnonymousClass01P r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void BhM(AnonymousClass05R r6, AnonymousClass012 r7) {
        AnonymousClass05R r0;
        AnonymousClass01S r4 = this.A00;
        AnonymousClass01P r3 = this.A02;
        AnonymousClass027 r2 = this.A01;
        int ordinal = r3.ordinal();
        if (ordinal == 2) {
            r0 = AnonymousClass05R.ON_CREATE;
        } else if (ordinal == 3) {
            r0 = AnonymousClass05R.ON_START;
        } else if (ordinal != 4) {
            r0 = null;
        } else {
            r0 = AnonymousClass05R.ON_RESUME;
        }
        if (r6 == r0) {
            r4.A02.add(r2);
        } else if (r6 == AnonymousClass05R.ON_DESTROY) {
            r4.A00(r2);
            return;
        } else if (r6 == AnonymousClass05R.A00(r3)) {
            r4.A02.remove(r2);
        } else {
            return;
        }
        r4.A00.run();
    }
}
