package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0UU  reason: invalid class name */
public class AnonymousClass0UU {
    public long A00 = -1;
    public Interpolator A01;
    public C17190qs A02;
    public boolean A03;
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final C09770cu A05 = new AnonymousClass0Gw(this);

    public void A00() {
        if (this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0V7) it.next()).A00();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        if (!this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                AnonymousClass0V7 r5 = (AnonymousClass0V7) it.next();
                long j = this.A00;
                if (j >= 0) {
                    r5.A07(j);
                }
                Interpolator interpolator = this.A01;
                if (interpolator != null) {
                    r5.A08(interpolator);
                }
                if (this.A02 != null) {
                    r5.A09(this.A05);
                }
                r5.A01();
            }
            this.A03 = true;
        }
    }
}
