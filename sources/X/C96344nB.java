package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nB  reason: invalid class name and case insensitive filesystem */
public final class C96344nB extends C02910Cj {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final AnonymousClass5SZ A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96344nB) {
                C96344nB r5 = (C96344nB) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A04, (C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A01), this.A02), this.A00) + this.A03) * 31);
    }

    public C96344nB(AnonymousClass5SZ r1, float f, float f2, float f3, int i) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = r1;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r14, RecyclerView recyclerView) {
        C95984mb r9;
        int height;
        int height2;
        boolean A1a = C36331k8.A1a(rect, view);
        AnonymousClass00C.A0D(recyclerView, 2);
        AnonymousClass0CZ r92 = recyclerView.A0G;
        String str = null;
        if ((r92 instanceof C95984mb) && (r9 = (C95984mb) r92) != null) {
            int A002 = RecyclerView.A00(view);
            int size = r9.A03.size();
            if (A002 != -1 && A002 < size) {
                AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
                AnonymousClass00C.A0E(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int i = 0;
                boolean A1S = AnonymousClass000.A1S(AnonymousClass04F.A01(layoutManager.A07), A1a ? 1 : 0);
                C140456lc r3 = ((C118815om) r9.A03.get(A002)).A01;
                AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
                C140456lc A0B = C140456lc.A0B(r3);
                if (A0B != null) {
                    str = C140456lc.A0O(A0B);
                }
                AnonymousClass5SZ A003 = AnonymousClass5Y1.A00(this.A04, str);
                int i2 = this.A03;
                if (i2 == A1a) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                C130326Kq A012 = ((C118815om) r9.A03.get(A002)).A00.A01();
                if (A012 != null) {
                    Rect rect2 = A012.A02.A02.A03;
                    if (i2 == A1a) {
                        height2 = rect2.width();
                    } else {
                        height2 = rect2.height();
                    }
                    int i3 = height - height2;
                    int ordinal = A003.ordinal();
                    if (ordinal == A1a) {
                        i = C14960mT.A00(((double) i3) / 2.0d);
                    } else if (ordinal == 2) {
                        i = i3;
                    }
                    if (i2 != A1a) {
                        rect.top = i;
                    } else if (A1S) {
                        rect.right = i;
                    } else {
                        rect.left = i;
                    }
                }
                if (A002 == 0) {
                    int i4 = (int) this.A01;
                    if (i2 == A1a) {
                        rect.top = i4;
                    } else if (A1S) {
                        rect.right = i4;
                    } else {
                        rect.left = i4;
                    }
                }
                int i5 = size - A1a;
                if (A002 < i5) {
                    int i6 = (int) this.A02;
                    if (i2 == A1a) {
                        rect.bottom = i6;
                    } else if (A1S) {
                        rect.left = i6;
                    } else {
                        rect.right = i6;
                    }
                }
                if (A002 == i5) {
                    int i7 = (int) this.A00;
                    if (i2 == A1a) {
                        rect.bottom = i7;
                    } else if (A1S) {
                        rect.left = i7;
                    } else {
                        rect.right = i7;
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ItemDecoration(spacingBefore=");
        A0u.append(this.A01);
        A0u.append(", spacingBetween=");
        A0u.append(this.A02);
        A0u.append(", spacingAfter=");
        A0u.append(this.A00);
        A0u.append(", orientation=");
        A0u.append(this.A03);
        A0u.append(", alignItems=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
