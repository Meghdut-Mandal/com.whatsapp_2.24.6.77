package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.6wD  reason: invalid class name and case insensitive filesystem */
public class C146816wD implements C88934Up {
    public final /* synthetic */ SearchViewModel A00;

    public AnonymousClass2bU BE2(int i) {
        if (i == -2) {
            return null;
        }
        SearchViewModel searchViewModel = this.A00;
        if (i < searchViewModel.A07.A01.size()) {
            return (AnonymousClass2bU) searchViewModel.A07.A01.get(i);
        }
        return null;
    }

    public int BG5(C64933Qa r4) {
        int i = 0;
        while (true) {
            SearchViewModel searchViewModel = this.A00;
            if (i >= searchViewModel.A07.A01.size()) {
                return -2;
            }
            if (C1901797e.A00(r4, ((AnonymousClass3T1) searchViewModel.A07.A01.get(i)).A1J)) {
                return i;
            }
            i++;
        }
    }

    public void BuW() {
    }

    public void Bv6() {
    }

    public void close() {
    }

    public C146816wD(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public void BbL() {
        this.A00.A0f(2);
    }

    public void Bqj(Runnable runnable) {
        this.A00.A0G = runnable;
    }

    public void Bwc(int i) {
        SearchViewModel searchViewModel = this.A00;
        int A0X = searchViewModel.A0X((AnonymousClass2bU) searchViewModel.A07.A01.get(i));
        if (A0X >= 0 && A0X <= SearchViewModel.A02(searchViewModel).size()) {
            C36341k9.A17(searchViewModel.A16, A0X);
        }
    }

    public int getCount() {
        return this.A00.A07.A01.size();
    }
}
