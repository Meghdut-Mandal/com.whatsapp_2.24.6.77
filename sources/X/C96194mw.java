package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;

/* renamed from: X.4mw  reason: invalid class name and case insensitive filesystem */
public class C96194mw extends C02740Bs {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchFragment A01;

    public C96194mw(RecyclerView recyclerView, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        this.A01 = businessDirectoryContextualSearchFragment;
        this.A00 = recyclerView;
    }

    public void A03(int i, int i2) {
        AnonymousClass0CP layoutManager;
        if (i == 0 && (layoutManager = this.A00.getLayoutManager()) != null) {
            ((LinearLayoutManager) layoutManager).A1g(0, 0);
        }
    }
}
