package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.search.SearchViewModel;
import java.util.List;

/* renamed from: X.7sw  reason: invalid class name and case insensitive filesystem */
public class C165137sw implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C165137sw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTH(Object obj) {
        if (this.A01 != 0) {
            SearchViewModel searchViewModel = (SearchViewModel) this.A00;
            searchViewModel.A0I = (List) obj;
            SearchViewModel.A07(searchViewModel);
            return;
        }
        ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
        RecyclerView recyclerView = conversationsFragment.A0G;
        C18820ts r2 = conversationsFragment.A1i;
        recyclerView.setAdapter(new C95974ma(new C33401fG(conversationsFragment), r2, (List) obj));
        C110495al r4 = conversationsFragment.A1b.A00;
        if (r4 != null) {
            C95974ma r3 = (C95974ma) conversationsFragment.A0G.A0G;
            int i = 0;
            if (r4 instanceof AnonymousClass54J) {
                int indexOf = r3.A01.indexOf(r4);
                if (indexOf != -1) {
                    i = indexOf;
                }
                r3.A0L(i);
                conversationsFragment.A0G.A0i(i);
                return;
            }
            throw C36441kJ.A18();
        }
    }
}
