package X;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9y1  reason: invalid class name and case insensitive filesystem */
public class C208309y1 implements B5O, C22853Ax3 {
    public boolean A00;
    public final C165737u4 A01;
    public final Path A02 = C36441kJ.A0M();
    public final AnonymousClass9P7 A03 = new AnonymousClass9P7();
    public final C1684780t A04;
    public final boolean A05;

    public void BkC() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    public void Bqe(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            B0T b0t = (B0T) list.get(i);
            if (b0t instanceof C208289xz) {
                C208289xz r2 = (C208289xz) b0t;
                if (r2.A03 == C023109s.A00) {
                    this.A03.A00.add(r2);
                    r2.A04.add(this);
                }
            }
            if (b0t instanceof C208279xy) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0I();
                }
                arrayList.add(b0t);
            }
        }
        this.A04.A00 = arrayList;
    }

    public Path BFG() {
        boolean z = this.A00;
        Path path = this.A02;
        if (!z) {
            path.reset();
            if (!this.A05) {
                Path path2 = (Path) this.A04.A05();
                if (path2 != null) {
                    path.set(path2);
                    path.setFillType(Path.FillType.EVEN_ODD);
                    this.A03.A00(path);
                }
            }
            this.A00 = true;
        }
        return path;
    }

    public C208309y1(C165737u4 r3, C208559yS r4, C208409yC r5) {
        this.A05 = r4.A02;
        this.A01 = r3;
        C1684780t r0 = new C1684780t(r4.A00.A00);
        this.A04 = r0;
        r5.A0C(r0);
        r0.A09(this);
    }

    public String getName() {
        throw null;
    }
}
