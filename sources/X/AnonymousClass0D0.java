package X;

import android.view.View;
import java.util.List;

/* renamed from: X.0D0  reason: invalid class name */
public class AnonymousClass0D0 {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06 = true;
    public int A07;
    public int A08;
    public int A09 = 0;
    public int A0A;
    public List A0B = null;

    public View A00(C02760Bu r7) {
        List list = this.A0B;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((AnonymousClass0D3) this.A0B.get(i)).A0H;
                AnonymousClass0D2 r2 = (AnonymousClass0D2) view.getLayoutParams();
                if ((r2.A00.A00 & 8) == 0 && this.A08 == r2.A01()) {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View A022 = r7.A02(this.A08);
        this.A08 += this.A0A;
        return A022;
    }

    public void A01(View view) {
        int i;
        int A012;
        int size = this.A0B.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                View view3 = ((AnonymousClass0D3) this.A0B.get(i3)).A0H;
                AnonymousClass0D2 r1 = (AnonymousClass0D2) view3.getLayoutParams();
                if (view3 != view && (r1.A00.A00 & 8) == 0 && (A012 = (r1.A01() - this.A08) * this.A0A) >= 0 && A012 < i2) {
                    view2 = view3;
                    if (A012 == 0) {
                        break;
                    }
                    i2 = A012;
                }
                i3++;
            } else if (view2 == null) {
                i = -1;
            }
        }
        i = ((AnonymousClass0D2) view2.getLayoutParams()).A01();
        this.A08 = i;
    }
}
