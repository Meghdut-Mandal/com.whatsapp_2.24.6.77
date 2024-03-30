package androidx.lifecycle;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.C003101g;

public class FullLifecycleObserverAdapter implements AnonymousClass01Y {
    public final C003101g A00;
    public final AnonymousClass01Y A01;

    public FullLifecycleObserverAdapter(C003101g r1, AnonymousClass01Y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        switch (r3.ordinal()) {
            case 1:
                this.A00.BhA(r4);
                break;
            case 2:
                this.A00.BfS(r4);
                break;
            case 3:
                this.A00.BcJ(r4);
                break;
            case 4:
                this.A00.Bhq(r4);
                break;
            case 5:
                this.A00.BVQ(r4);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        AnonymousClass01Y r0 = this.A01;
        if (r0 != null) {
            r0.BhM(r3, r4);
        }
    }
}
