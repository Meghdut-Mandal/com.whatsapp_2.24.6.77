package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$updateFavoritesOrder$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vO  reason: invalid class name and case insensitive filesystem */
public final class C40371vO extends AnonymousClass0XI {
    public final C87084Nk A00;

    public void A03(AnonymousClass0D3 r3, int i) {
        View view;
        if (i == 2 && r3 != null && (view = r3.A0H) != null) {
            view.setAlpha(0.8f);
        }
    }

    public void A04(AnonymousClass0D3 r7, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        super.A04(r7, recyclerView);
        r7.A0H.setAlpha(1.0f);
        FavoriteCallListActivity favoriteCallListActivity = (FavoriteCallListActivity) this.A00;
        FavoriteCallListViewModel favoriteCallListViewModel = (FavoriteCallListViewModel) favoriteCallListActivity.A0B.getValue();
        C40941wM r0 = favoriteCallListActivity.A03;
        if (r0 == null) {
            throw C36331k8.A0Y();
        }
        List list = r0.A00;
        AnonymousClass00C.A0D(list, 0);
        ArrayList<C69743e1> A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (next instanceof C69743e1) {
                A0I.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0I);
        for (C69743e1 r02 : A0I) {
            A0J.add(r02.A01);
        }
        AnonymousClass05L r1 = favoriteCallListViewModel.A0A;
        do {
        } while (!r1.B3B(r1.getValue(), A0J));
        C36381kD.A1R(favoriteCallListViewModel.A08, new FavoriteCallListViewModel$updateFavoritesOrder$1(favoriteCallListViewModel, A0J, (C023509x) null), C109325Xd.A00(favoriteCallListViewModel));
    }

    public boolean A05() {
        return false;
    }

    public boolean A06() {
        return false;
    }

    public boolean A08(AnonymousClass0D3 r7, AnonymousClass0D3 r8, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        AnonymousClass0CZ r0 = recyclerView.A0G;
        if (r0 != null) {
            int A0J = r0.A0J();
            int A04 = r7.A04();
            int A042 = r8.A04();
            if (A042 < A0J && A042 >= 0 && A04 < A0J && A04 >= 0) {
                C40941wM r2 = ((FavoriteCallListActivity) this.A00).A03;
                if (r2 == null) {
                    throw C36331k8.A0Y();
                }
                r2.A00.add(A042, r2.A00.remove(A04));
                r2.A01.A01(A04, A042);
                return true;
            }
        }
        return false;
    }

    public int A01(AnonymousClass0D3 r4, RecyclerView recyclerView) {
        return (3 << 16) | (48 << 8) | (51 << 0);
    }

    public C40371vO(C87084Nk r1) {
        this.A00 = r1;
    }
}
