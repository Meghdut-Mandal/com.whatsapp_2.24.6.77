package X;

import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;

/* renamed from: X.6os  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142436os implements AnonymousClass7fO {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C142436os(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    public final boolean Bhm() {
        SearchViewModel searchViewModel = this.A00.A1d;
        if (searchViewModel.A03 == null || searchViewModel.A0Z() == null) {
            return true;
        }
        AnonymousClass6YD r3 = searchViewModel.A03;
        C143636qs r2 = AnonymousClass6YD.A00(r3).A05;
        AnonymousClass6Th r0 = r2.A02;
        AnonymousClass6QG r1 = r0.A00;
        if (r0.A03() && r1 != null && !r1.A04() && !r2.A00) {
            return true;
        }
        AnonymousClass6YD.A05(r3);
        AnonymousClass6YD.A01(r3).A04(r3.A0B());
        return true;
    }
}
