package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.search.SearchViewModel;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public class C36191ju implements AnonymousClass00P, AnonymousClass00S {
    public Object A00;
    public final int A01;

    public C36191ju(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        switch (this.A01) {
            case 0:
                return ((AnonymousClass02E) this.A00).A0d();
            case 1:
                ((ConversationsFragment) this.A00).A1b.A0S();
                break;
            default:
                SearchViewModel searchViewModel = (SearchViewModel) this.A00;
                searchViewModel.A1A.A0C((Object) null);
                searchViewModel.A0p(false);
                break;
        }
        return AnonymousClass0AJ.A00;
    }
}
