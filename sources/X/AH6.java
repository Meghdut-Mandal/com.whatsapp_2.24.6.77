package X;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import java.util.Iterator;
import java.util.Map;

public class AH6 implements C34121gU {
    public boolean A00 = false;
    public boolean A01 = true;
    public Integer A02;
    public final C21430zE A03;
    public final Map A04 = AnonymousClass001.A0J();
    public final C23010B0a A05;
    public final C21010yW A06;

    public void Bfv(Window window, int i, boolean z, boolean z2) {
        this.A00 = z2;
        this.A01 = z;
        if (z2 || z) {
            this.A05.B6P(window);
            this.A02 = Integer.valueOf(i);
        }
    }

    public void Bfw(Window window) {
        Integer num = this.A02;
        if (num != null) {
            this.A05.B5P(window, num.intValue());
        }
        this.A02 = null;
    }

    public void report() {
        if (this.A01) {
            Map map = this.A04;
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                C176308bu r8 = new C176308bu();
                C193569Lz r10 = (C193569Lz) A11.getValue();
                r8.A03 = Long.valueOf(r10.A03);
                r8.A02 = (Integer) A11.getKey();
                long j = r10.A03;
                if (j > 0) {
                    double d = (double) j;
                    r8.A00 = Double.valueOf((r10.A01 * 60000.0d) / d);
                    r8.A01 = Double.valueOf((r10.A00 * 60000.0d) / d);
                }
                this.A06.Bly(r8);
            }
            map.clear();
        }
    }

    public AH6(Activity activity, AnonymousClass1JJ r5, C21010yW r6, C21430zE r7) {
        C23010B0a a14;
        this.A03 = r7;
        this.A06 = r6;
        C194719Qy r2 = new C194719Qy(this, r7);
        if (Build.VERSION.SDK_INT < 26) {
            a14 = new A13(activity, r5, r2);
        } else {
            a14 = new A14(r2);
        }
        this.A05 = a14;
    }
}
