package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.7q3  reason: invalid class name and case insensitive filesystem */
public class C163347q3 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public C163347q3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        Window window;
        int i;
        switch (this.A01) {
            case 0:
                C99374tB r1 = (C99374tB) this.A00;
                C99374tB.A00(r1, C99374tB.A01(r1));
                return;
            case 1:
                C99384tC r2 = (C99384tC) this.A00;
                r2.A06 = z;
                r2.A02.A09(false);
                if (!z) {
                    C99384tC.A01(r2, false);
                    r2.A05 = false;
                    return;
                }
                return;
            case 2:
                AnonymousClass02E r0 = (AnonymousClass02E) this.A00;
                if (!z) {
                    ((InputMethodManager) r0.A0a().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 3:
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                if (z) {
                    AnonymousClass00T r02 = catalogSearchFragment.A0Q;
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r02.getValue();
                    C207109uZ r12 = catalogSearchFragment.A0C;
                    String str = (String) ((CatalogSearchViewModel) r02.getValue()).A00.A04();
                    if (str == null) {
                        str = "";
                    }
                    catalogSearchViewModel.A0T(r12, str);
                    return;
                }
                return;
            case 4:
                View view2 = (View) this.A00;
                if (z) {
                    view2.requestLayout();
                    return;
                }
                return;
            case 5:
                AnonymousClass6SU r22 = (AnonymousClass6SU) this.A00;
                Drawable background = r22.A0A.getBackground();
                int i2 = 204;
                if (z) {
                    i2 = 230;
                }
                background.setAlpha(i2);
                AnonymousClass1N2 r03 = r22.A0E;
                if (z) {
                    r03.A02(view);
                    window = r22.A02.getWindow();
                    i = 5;
                } else {
                    r03.A01(view);
                    window = r22.A02.getWindow();
                    i = 3;
                }
                window.setSoftInputMode(i);
                return;
            case 6:
                View.OnFocusChangeListener onFocusChangeListener = ((C144326s0) this.A00).A00;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                    return;
                }
                return;
            default:
                ((TokenizedSearchInput) this.A00).A0G.A0r(z);
                return;
        }
    }
}
