package X;

import android.content.Intent;
import java.util.Set;

/* renamed from: X.80Y  reason: invalid class name */
public final class AnonymousClass80Y extends AnonymousClass80Z {
    public final Intent A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof AnonymousClass80Y) && super.equals(obj)) {
                AnonymousClass80Y r5 = (AnonymousClass80Y) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80Y(Intent intent, Set set, int i, int i2) {
        super(i, i2);
        AnonymousClass00C.A0D(intent, 2);
        if (i < 0) {
            throw AnonymousClass001.A08("minWidth must be non-negative");
        } else if (i2 >= 0) {
            double d = (double) 0.4f;
            boolean z = false;
            if (0.0d <= d && d <= 1.0d) {
                z = true;
            }
            AnonymousClass0YM.A03(z, "splitRatio must be in 0.0..1.0 range");
            this.A01 = C007103b.A0f(set);
            this.A00 = intent;
        } else {
            throw AnonymousClass001.A08("minSmallestWidth must be non-negative");
        }
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (((C36351kA.A05(this.A00, super.hashCode() * 31) + 1237) * 31) + 1) * 31);
    }
}
