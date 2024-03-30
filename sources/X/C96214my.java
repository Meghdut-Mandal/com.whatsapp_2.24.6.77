package X;

import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import java.util.List;

/* renamed from: X.4my  reason: invalid class name and case insensitive filesystem */
public final class C96214my extends C02740Bs {
    public final /* synthetic */ StickyHeadersLinearLayoutManager A00;

    public C96214my(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = stickyHeadersLinearLayoutManager;
    }

    public void A01() {
        int i;
        List list;
        C118815om r0;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list2 = stickyHeadersLinearLayoutManager.A05;
        list2.clear();
        C95984mb r02 = stickyHeadersLinearLayoutManager.A04;
        if (r02 != null) {
            i = r02.A03.size();
        } else {
            i = 0;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C95984mb r03 = stickyHeadersLinearLayoutManager.A04;
            if (!(r03 == null || (list = r03.A03) == null || (r0 = (C118815om) list.get(i2)) == null || !AnonymousClass5Y4.A00(r0.A01))) {
                C90504aG.A10(i2, list2);
                if (i2 == stickyHeadersLinearLayoutManager.A02) {
                    z = false;
                }
            }
        }
        if (stickyHeadersLinearLayoutManager.A03 != null && z) {
            StickyHeadersLinearLayoutManager.A0I((C02760Bu) null, stickyHeadersLinearLayoutManager);
        }
    }

    public void A03(int i, int i2) {
        List list;
        C118815om r0;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list2 = stickyHeadersLinearLayoutManager.A05;
        int size = list2.size();
        int A0C = StickyHeadersLinearLayoutManager.A0C(stickyHeadersLinearLayoutManager, i);
        if (size > 0 && A0C != -1) {
            while (A0C < size) {
                list2.set(A0C, Integer.valueOf(C36351kA.A06(list2, A0C) + i2));
                A0C++;
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            C95984mb r02 = stickyHeadersLinearLayoutManager.A04;
            if (!(r02 == null || (list = r02.A03) == null || (r0 = (C118815om) list.get(i)) == null || !AnonymousClass5Y4.A00(r0.A01))) {
                int A0C2 = StickyHeadersLinearLayoutManager.A0C(stickyHeadersLinearLayoutManager, i);
                if (A0C2 != -1) {
                    list2.add(A0C2, Integer.valueOf(i));
                } else {
                    C90504aG.A10(i, list2);
                }
            }
            i++;
        }
    }

    public void A04(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size();
        if (size > 0) {
            boolean z = false;
            int i3 = i + i2;
            int i4 = i3 - 1;
            if (i <= i4) {
                while (true) {
                    int A0I = C90514aH.A0I(list, i4);
                    if (A0I >= 0) {
                        list.remove(Integer.valueOf(A0I));
                        size--;
                        if (A0I == stickyHeadersLinearLayoutManager.A02) {
                            z = true;
                        }
                    }
                    if (i4 == i) {
                        break;
                    }
                    i4--;
                }
            }
            if (stickyHeadersLinearLayoutManager.A03 != null && z) {
                StickyHeadersLinearLayoutManager.A0I((C02760Bu) null, stickyHeadersLinearLayoutManager);
            }
            int A0C = StickyHeadersLinearLayoutManager.A0C(stickyHeadersLinearLayoutManager, i3);
            if (A0C != -1) {
                while (A0C < size) {
                    list.set(A0C, Integer.valueOf(-i2));
                    A0C++;
                }
            }
        }
    }
}
