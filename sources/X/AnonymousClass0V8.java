package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.0V8  reason: invalid class name */
public class AnonymousClass0V8 {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = 0;
    public ArrayList A03 = AnonymousClass001.A0I();
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;

    public View A05(int i, int i2) {
        View view = null;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i2 != -1) {
            while (i3 >= 0) {
                View A0Z = AnonymousClass000.A0Z(arrayList, i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if (staggeredGridLayoutManager.A0D && AnonymousClass0CP.A02(A0Z) >= i) {
                    break;
                } else if (staggeredGridLayoutManager.A0D || AnonymousClass0CP.A02(A0Z) > i) {
                    if (!A0Z.hasFocusable()) {
                        break;
                    }
                    i3--;
                    view = A0Z;
                } else {
                    return view;
                }
            }
        } else {
            int i4 = 0;
            while (i4 < size) {
                View A0Z2 = AnonymousClass000.A0Z(arrayList, i4);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if ((staggeredGridLayoutManager2.A0D && AnonymousClass0CP.A02(A0Z2) <= i) || ((!staggeredGridLayoutManager2.A0D && AnonymousClass0CP.A02(A0Z2) >= i) || !A0Z2.hasFocusable())) {
                    break;
                }
                i4++;
                view = A0Z2;
            }
        }
        return view;
    }

    public AnonymousClass0V8(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    public int A00() {
        int i;
        int size;
        if (this.A05.A0D) {
            i = this.A03.size() - 1;
            size = -1;
        } else {
            i = 0;
            size = this.A03.size();
        }
        return A04(i, size);
    }

    public int A01() {
        int size;
        int i;
        if (this.A05.A0D) {
            size = 0;
            i = this.A03.size();
        } else {
            size = this.A03.size() - 1;
            i = -1;
        }
        return A04(size, i);
    }

    public int A02(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A06();
        return this.A00;
    }

    public int A03(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A07();
        return this.A01;
    }

    public int A04(int i, int i2) {
        AnonymousClass0CY r8 = this.A05.A07;
        int A042 = r8.A04();
        int A022 = r8.A02();
        int i3 = -1;
        if (i2 > i) {
            i3 = 1;
        }
        while (i != i2) {
            View A0Z = AnonymousClass000.A0Z(this.A03, i);
            int A09 = r8.A09(A0Z);
            int A06 = r8.A06(A0Z);
            boolean z = false;
            boolean z2 = false;
            if (A09 <= A022) {
                z2 = true;
            }
            if (A06 >= A042) {
                z = true;
            }
            if (z2 && z && (A09 < A042 || A06 > A022)) {
                return AnonymousClass0CP.A02(A0Z);
            }
            i += i3;
        }
        return -1;
    }

    public void A06() {
        C08810bM A012;
        int i;
        ArrayList arrayList = this.A03;
        View A0Z = AnonymousClass000.A0Z(arrayList, arrayList.size() - 1);
        AnonymousClass0I8 r2 = (AnonymousClass0I8) A0Z.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A06(A0Z);
        if (r2.A01 && (A012 = staggeredGridLayoutManager.A09.A01(r2.A01())) != null && A012.A00 == 1) {
            int i2 = this.A00;
            int i3 = this.A04;
            int[] iArr = A012.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A00 = i2 + i;
        }
    }

    public void A07() {
        C08810bM A012;
        int i;
        View A0Z = AnonymousClass000.A0Z(this.A03, 0);
        AnonymousClass0I8 r2 = (AnonymousClass0I8) A0Z.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A09(A0Z);
        if (r2.A01 && (A012 = staggeredGridLayoutManager.A09.A01(r2.A01())) != null && A012.A00 == -1) {
            int i2 = this.A01;
            int i3 = this.A04;
            int[] iArr = A012.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A01 = i2 - i;
        }
    }

    public void A08() {
        this.A03.clear();
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = 0;
    }

    public void A09() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        AnonymousClass0I8 r1 = (AnonymousClass0I8) view.getLayoutParams();
        r1.A00 = null;
        int i = r1.A00.A00;
        if (!((i & 8) == 0 && (i & 2) == 0)) {
            this.A02 -= this.A05.A07.A07(view);
        }
        if (size == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        this.A00 = Integer.MIN_VALUE;
    }

    public void A0A() {
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.remove(0);
        AnonymousClass0I8 r1 = (AnonymousClass0I8) view.getLayoutParams();
        r1.A00 = null;
        if (arrayList.size() == 0) {
            this.A00 = Integer.MIN_VALUE;
        }
        int i = r1.A00.A00;
        if (!((i & 8) == 0 && (i & 2) == 0)) {
            this.A02 -= this.A05.A07.A07(view);
        }
        this.A01 = Integer.MIN_VALUE;
    }

    public void A0B(View view) {
        AnonymousClass0I8 r3 = (AnonymousClass0I8) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        int i = r3.A00.A00;
        if ((i & 8) != 0 || (i & 2) != 0) {
            this.A02 += this.A05.A07.A07(view);
        }
    }

    public void A0C(View view) {
        AnonymousClass0I8 r3 = (AnonymousClass0I8) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A00 = Integer.MIN_VALUE;
        }
        int i = r3.A00.A00;
        if ((i & 8) != 0 || (i & 2) != 0) {
            this.A02 += this.A05.A07.A07(view);
        }
    }
}
