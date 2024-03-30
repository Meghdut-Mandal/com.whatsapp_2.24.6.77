package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.62I  reason: invalid class name */
public abstract class AnonymousClass62I {
    public final boolean A00;
    public final boolean A01;

    public static AnonymousClass3AO A00(Resources resources, AnonymousClass3NG r3) {
        AnonymousClass3AO r1 = r3.A00;
        r1.A06 = true;
        r1.A01 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        r1.A02 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        r1.A00 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        r1.A03 = R.color.f6nameremoved;
        return r1;
    }

    public void A01(Resources resources, AnonymousClass3NG r5) {
        AnonymousClass3AO A002;
        C61253Bd r0;
        if (this instanceof AnonymousClass5Q3) {
            A002 = A00(resources, r5);
            r0 = ((AnonymousClass5Q3) this).A00;
        } else if (this instanceof AnonymousClass5Q6) {
            return;
        } else {
            if (this instanceof AnonymousClass5Q4) {
                AnonymousClass5Q4 r2 = (AnonymousClass5Q4) this;
                int i = -1;
                if (r2.A00.A02()) {
                    i = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                }
                A002 = r5.A00;
                A002.A01 = i;
                r0 = r2.A01;
            } else {
                A002 = A00(resources, r5);
                r0 = C50772lY.A00;
                A002.A05 = r0;
            }
        }
        A002.A04 = r0;
        A002.A05 = r0;
    }

    public AnonymousClass62I(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
