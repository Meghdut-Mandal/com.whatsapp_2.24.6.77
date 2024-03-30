package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0CI  reason: invalid class name */
public class AnonymousClass0CI {
    public final AnonymousClass0CJ A00 = new AnonymousClass0CJ();
    public final AnonymousClass0CG A01;
    public final List A02 = new ArrayList();

    private int A00(int i) {
        if (i >= 0) {
            int childCount = ((AnonymousClass0CH) this.A01).A00.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                AnonymousClass0CJ r1 = this.A00;
                int A012 = i - (i2 - r1.A01(i2));
                if (A012 != 0) {
                    i2 += A012;
                } else {
                    while (r1.A06(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void A01(View view, AnonymousClass0CI r3) {
        r3.A02.add(view);
        AnonymousClass0CH r0 = (AnonymousClass0CH) r3.A01;
        AnonymousClass0D3 A04 = RecyclerView.A04(view);
        if (A04 != null) {
            RecyclerView recyclerView = r0.A00;
            int i = A04.A03;
            if (i == -1) {
                i = C011504z.A00(A04.A0H);
            }
            A04.A06 = i;
            if (recyclerView.A07 > 0) {
                A04.A03 = 4;
                recyclerView.A14.add(A04);
                return;
            }
            C011504z.A06(A04.A0H, 4);
        }
    }

    public static void A02(View view, AnonymousClass0CI r2) {
        if (r2.A02.remove(view)) {
            r2.A01.BZc(view);
        }
    }

    public int A03() {
        return ((AnonymousClass0CH) this.A01).A00.getChildCount() - this.A02.size();
    }

    public int A04() {
        return ((AnonymousClass0CH) this.A01).A00.getChildCount();
    }

    public int A05(View view) {
        int indexOfChild = ((AnonymousClass0CH) this.A01).A00.indexOfChild(view);
        if (indexOfChild != -1) {
            AnonymousClass0CJ r1 = this.A00;
            if (!r1.A06(indexOfChild)) {
                return indexOfChild - r1.A01(indexOfChild);
            }
        }
        return -1;
    }

    public View A07(int i) {
        return ((AnonymousClass0CH) this.A01).A00.getChildAt(i);
    }

    public void A0A(View view, int i, boolean z) {
        int A002;
        if (i < 0) {
            A002 = ((AnonymousClass0CH) this.A01).A00.getChildCount();
        } else {
            A002 = A00(i);
        }
        this.A00.A05(A002, z);
        if (z) {
            A01(view, this);
        }
        RecyclerView recyclerView = ((AnonymousClass0CH) this.A01).A00;
        recyclerView.addView(view, A002);
        AnonymousClass0D3 A04 = RecyclerView.A04(view);
        AnonymousClass0CZ r0 = recyclerView.A0G;
        if (!(r0 == null || A04 == null)) {
            r0.A0F(A04);
        }
        List list = recyclerView.A0P;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C17060qe) recyclerView.A0P.get(size)).BTV(view);
                } else {
                    return;
                }
            }
        }
    }

    public void A0B(View view, ViewGroup.LayoutParams layoutParams, int i, boolean z) {
        int A002;
        if (i < 0) {
            A002 = ((AnonymousClass0CH) this.A01).A00.getChildCount();
        } else {
            A002 = A00(i);
        }
        this.A00.A05(A002, z);
        if (z) {
            A01(view, this);
        }
        AnonymousClass0CH r3 = (AnonymousClass0CH) this.A01;
        AnonymousClass0D3 A04 = RecyclerView.A04(view);
        if (A04 != null) {
            int i2 = A04.A00;
            if ((i2 & 256) != 0 || A04.A09()) {
                A04.A00 = i2 & -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(A04);
                sb.append(r3.A00.A0T());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        r3.A00.attachViewToParent(view, A002, layoutParams);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.toString());
        sb.append(", hidden list:");
        sb.append(this.A02.size());
        return sb.toString();
    }

    public AnonymousClass0CI(AnonymousClass0CG r2) {
        this.A01 = r2;
    }

    public View A06(int i) {
        return ((AnonymousClass0CH) this.A01).A00.getChildAt(A00(i));
    }

    public void A08(int i) {
        AnonymousClass0D3 A04;
        int A002 = A00(i);
        this.A00.A07(A002);
        RecyclerView recyclerView = ((AnonymousClass0CH) this.A01).A00;
        View childAt = recyclerView.getChildAt(A002);
        if (!(childAt == null || (A04 = RecyclerView.A04(childAt)) == null)) {
            int i2 = A04.A00;
            if ((i2 & 256) == 0 || A04.A09()) {
                A04.A00 = 256 | i2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(A04);
                sb.append(recyclerView.A0T());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        recyclerView.detachViewFromParent(A002);
    }

    public void A09(int i) {
        int A002 = A00(i);
        RecyclerView recyclerView = ((AnonymousClass0CH) this.A01).A00;
        View childAt = recyclerView.getChildAt(A002);
        if (childAt != null) {
            if (this.A00.A07(A002)) {
                A02(childAt, this);
            }
            View childAt2 = recyclerView.getChildAt(A002);
            if (childAt2 != null) {
                recyclerView.A0r(childAt2);
                childAt2.clearAnimation();
            }
            recyclerView.removeViewAt(A002);
        }
    }
}
