package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.0C3  reason: invalid class name */
public class AnonymousClass0C3 implements AnonymousClass0C2 {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public void A00(RecyclerView recyclerView, boolean z) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AnonymousClass0CP r3 = recyclerView.A0I;
        AnonymousClass0CZ r1 = recyclerView.A0G;
        if (r1 != null && r3 != null) {
            if (z) {
                if (recyclerView.A0D.A04.size() <= 0) {
                    r3.A0l(this, r1.A0J());
                }
            } else if (!recyclerView.A12()) {
                r3.A1C(this, recyclerView.A0y, this.A01, this.A02);
            }
            int i = this.A00;
            if (i > r3.A02) {
                r3.A02 = i;
                r3.A0B = z;
                recyclerView.A0x.A05();
            }
        }
    }

    public void B0g(int i, int i2) {
        if (i2 >= 0) {
            int i3 = this.A00 * 2;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 2)];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.A00++;
            return;
        }
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    }
}
