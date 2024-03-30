package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: X.0U8  reason: invalid class name */
public class AnonymousClass0U8 {
    public boolean A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public int[] A05;
    public final /* synthetic */ StaggeredGridLayoutManager A06;

    public void A00() {
        this.A02 = -1;
        this.A01 = Integer.MIN_VALUE;
        this.A04 = false;
        this.A03 = false;
        this.A00 = false;
        int[] iArr = this.A05;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public AnonymousClass0U8(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.A06 = staggeredGridLayoutManager;
        A00();
    }
}
