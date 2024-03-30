package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0CC  reason: invalid class name */
public class AnonymousClass0CC implements AnonymousClass0CB {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass0CC(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(C02990Cr r6) {
        int i = r6.A00;
        if (i == 1) {
            RecyclerView recyclerView = this.A00;
            recyclerView.A0I.A1I(recyclerView, r6.A02, r6.A01);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.A00;
            recyclerView2.A0I.A1J(recyclerView2, r6.A02, r6.A01);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.A00;
            recyclerView3.A0I.A1L(recyclerView3, r6.A03, r6.A02, r6.A01);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.A00;
            recyclerView4.A0I.A1K(recyclerView4, r6.A02, r6.A01, 1);
        }
    }

    public void BP8(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        AnonymousClass0CI r3 = recyclerView.A0E;
        int A04 = r3.A04();
        int i5 = i + i2;
        for (int i6 = 0; i6 < A04; i6++) {
            View A07 = r3.A07(i6);
            AnonymousClass0D3 A042 = RecyclerView.A04(A07);
            if (A042 != null && !A042.A09() && (i4 = A042.A04) >= i && i4 < i5) {
                int i7 = 2 | A042.A00;
                A042.A00 = i7;
                if (obj == null) {
                    A042.A00 = 1024 | i7;
                } else if ((1024 & i7) == 0) {
                    if (A042.A0D == null) {
                        ArrayList arrayList = new ArrayList();
                        A042.A0D = arrayList;
                        A042.A0E = Collections.unmodifiableList(arrayList);
                    }
                    A042.A0D.add(obj);
                }
                ((AnonymousClass0D2) A07.getLayoutParams()).A01 = true;
            }
        }
        C02760Bu r5 = recyclerView.A0x;
        ArrayList arrayList2 = r5.A06;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass0D3 r2 = (AnonymousClass0D3) arrayList2.get(size);
                if (r2 != null && (i3 = r2.A04) >= i && i3 < i5) {
                    r2.A00 = 2 | r2.A00;
                    r5.A06(size);
                }
            } else {
                recyclerView.A03 = true;
                return;
            }
        }
    }

    public void BQT(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        AnonymousClass0CI r6 = recyclerView.A0E;
        int A04 = r6.A04();
        for (int i3 = 0; i3 < A04; i3++) {
            AnonymousClass0D3 A042 = RecyclerView.A04(r6.A07(i3));
            if (A042 != null && !A042.A09() && A042.A04 >= i) {
                A042.A07(i2, false);
                recyclerView.A0y.A0C = true;
            }
        }
        ArrayList arrayList = recyclerView.A0x.A06;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnonymousClass0D3 r1 = (AnonymousClass0D3) arrayList.get(i4);
            if (r1 != null && r1.A04 >= i) {
                r1.A07(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0W = true;
    }

    public void BQU(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.A00;
        AnonymousClass0CI r10 = recyclerView.A0E;
        int A04 = r10.A04();
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (i < i2) {
            i6 = -1;
            i5 = i;
            i4 = i2;
        }
        for (int i7 = 0; i7 < A04; i7++) {
            AnonymousClass0D3 A042 = RecyclerView.A04(r10.A07(i7));
            if (A042 != null && (i3 = A042.A04) >= i5 && i3 <= i4) {
                if (i3 == i) {
                    A042.A07(i2 - i, false);
                } else {
                    A042.A07(i6, false);
                }
                recyclerView.A0y.A0C = true;
            }
        }
        C02760Bu r0 = recyclerView.A0x;
        int i8 = 1;
        int i9 = i;
        int i10 = i2;
        if (i < i2) {
            i8 = -1;
            i10 = i;
            i9 = i2;
        }
        ArrayList arrayList = r0.A06;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnonymousClass0D3 r1 = (AnonymousClass0D3) arrayList.get(i11);
            if (r1 != null && r1.A04 >= i10 && r1.A04 <= i9) {
                if (r1.A04 == i) {
                    r1.A07(i2 - i, false);
                } else {
                    r1.A07(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0W = true;
    }
}
