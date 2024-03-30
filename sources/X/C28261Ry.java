package X;

import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Ry  reason: invalid class name and case insensitive filesystem */
public class C28261Ry implements C28251Rx {
    public final /* synthetic */ SearchViewModel A00;

    public void B2q() {
    }

    public AnonymousClass11F BCP() {
        return null;
    }

    public boolean Bnh(Jid jid) {
        return false;
    }

    public C28261Ry(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public List BFy() {
        return this.A00.A0z.A0G.A03();
    }

    public Set BHD() {
        return new HashSet();
    }

    public void BTh(ViewHolder viewHolder, AnonymousClass11F r3, int i) {
        this.A00.A0i(r3);
    }

    public void BTi(View view, ViewHolder viewHolder, ViewHolder viewHolder2, AnonymousClass11F r7, int i, int i2) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0j.A0D(false);
        if (r7 != null) {
            searchViewModel.A14.A0D(r7);
        }
    }

    public void BTj(ViewHolder viewHolder, AnonymousClass3T1 r3) {
        this.A00.A0m(r3);
    }

    public void BTm(AnonymousClass146 r2) {
        Log.e("SearchViewModel/pending group in search results");
    }

    public boolean BaP(ViewHolder viewHolder, ViewHolder viewHolder2, AnonymousClass11F r4, int i) {
        this.A00.A13.A0D(r4);
        return true;
    }

    public /* synthetic */ View.OnCreateContextMenuListener BEe() {
        return null;
    }

    public /* synthetic */ boolean BLN(AnonymousClass11F r2) {
        return false;
    }
}
