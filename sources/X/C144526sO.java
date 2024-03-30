package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.6sO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144526sO implements C33391fF {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C144526sO(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    public final void B03(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        SearchFragment searchFragment = this.A00;
        View view = searchFragment.A0F;
        if (searchFragment.A1D() != null && view != null) {
            C99304t3 A02 = C99304t3.A02(view.findViewById(R.id.search_fragment), charSequence, 0);
            A02.A0Z(charSequence2, onClickListener);
            A02.A0X(C36351kA.A02(searchFragment.A1D(), searchFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
            A02.A0V(new C162627ot(searchFragment, 0));
            searchFragment.A06 = A02;
            A02.A0P();
        }
    }
}
