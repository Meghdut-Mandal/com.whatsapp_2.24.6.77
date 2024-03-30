package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Set;

/* renamed from: X.4nN  reason: invalid class name and case insensitive filesystem */
public abstract class C96464nN extends AnonymousClass0UE {
    public int A00;
    public final Set A01 = C36441kJ.A17();

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3;
        AnonymousClass6AS r0;
        int i4;
        C143516qg r02;
        C46482Xv r03;
        AnonymousClass00C.A0D(recyclerView, 0);
        AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int A1S = linearLayoutManager.A1S();
            int A1U = linearLayoutManager.A1U();
            if (A1S <= A1U) {
                while (true) {
                    Set set = this.A01;
                    if (!AnonymousClass000.A1Z(set, A1S) && (r03 = (C46482Xv) recyclerView.A0Q(A1S)) != null) {
                        r03.A0D();
                        set.add(Integer.valueOf(A1S));
                    }
                    if (A1S == A1U) {
                        break;
                    }
                    A1S++;
                }
            }
            boolean z = this instanceof C162877pI;
            if (z) {
                C162877pI r04 = (C162877pI) this;
                int i5 = r04.A01;
                Object obj = r04.A00;
                if (i5 != 0) {
                    C95394km r2 = ((BusinessDirectorySearchFragment) obj).A0B;
                    int i6 = r2.A02;
                    if (i6 == 1 || i6 == 4 || C95394km.A0P(r2)) {
                        C143466qb r22 = r2.A0N;
                        AnonymousClass6QG r05 = r22.A00.A01;
                        if (r05 == null || "country_default".equals(r05.A08) || !r22.A09()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = ((BusinessDirectoryContextualSearchFragment) obj).A08;
                    if (businessDirectoryContextualSearchViewModel.A01 != 1 || !businessDirectoryContextualSearchViewModel.A0V.A09()) {
                        return;
                    }
                }
            }
            int i7 = A1U - this.A00;
            if (z) {
                C162877pI r06 = (C162877pI) this;
                int i8 = r06.A01;
                Object obj2 = r06.A00;
                if (i8 != 0) {
                    r02 = ((BusinessDirectorySearchFragment) obj2).A0B.A0J;
                } else {
                    r02 = ((BusinessDirectoryContextualSearchFragment) obj2).A08.A0R;
                }
                int i9 = r02.A05;
                i3 = 5;
                if (i9 == 0) {
                    i3 = 14;
                }
            } else {
                i3 = 5;
            }
            if (i7 < i3) {
                AnonymousClass0CP layoutManager2 = recyclerView.getLayoutManager();
                if ((layoutManager2 instanceof LinearLayoutManager) && recyclerView.A0G != null) {
                    int A1V = ((LinearLayoutManager) layoutManager2).A1V();
                    AnonymousClass0CZ r07 = recyclerView.A0G;
                    if (r07 != null) {
                        i4 = r07.A0J();
                    } else {
                        i4 = 0;
                    }
                    if (A1V != i4 - 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (z) {
                C162877pI r4 = (C162877pI) this;
                int i10 = r4.A01;
                Object obj3 = r4.A00;
                if (i10 != 0) {
                    ((BusinessDirectorySearchFragment) obj3).A0B.A0U();
                } else {
                    ((BusinessDirectoryContextualSearchFragment) obj3).A08.A0S();
                }
            } else {
                C95374ki r08 = BusinessApiBrowseFragment.A08;
                if (r08 == null) {
                    throw C36331k8.A0d("viewModel");
                }
                C130186Kb r09 = (C130186Kb) r08.A03.A00.A04();
                if (!(r09 == null || (r0 = r09.A03) == null || r0.A01 == null)) {
                    C95374ki r1 = BusinessApiBrowseFragment.A08;
                    if (r1 == null) {
                        throw C36331k8.A0d("viewModel");
                    }
                    r1.A0S(BusinessApiBrowseFragment.A09);
                }
            }
            this.A00 = A1U;
        }
    }
}
