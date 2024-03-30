package X;

import android.text.TextUtils;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.6UC  reason: invalid class name */
public class AnonymousClass6UC implements C17020qa {
    public Object A00;
    public final int A01;

    public AnonymousClass6UC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean Be1(String str) {
        switch (this.A01) {
            case 0:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A00).A03;
                if (businessApiHomeFragment == null) {
                    return true;
                }
                businessApiHomeFragment.A03.A0S(str);
                return true;
            case 1:
                BusinessDirectoryActivity.A0G((BusinessDirectoryActivity) this.A00, str);
                return true;
            case 2:
                AnonymousClass00C.A0D(str, 0);
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                ((CatalogSearchViewModel) catalogSearchFragment.A0Q.getValue()).A0T(catalogSearchFragment.A0C, str);
                return true;
            default:
                return false;
        }
    }

    public boolean Be2(String str) {
        switch (this.A01) {
            case 0:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A00).A03;
                if (businessApiHomeFragment == null) {
                    return false;
                }
                businessApiHomeFragment.A03.A0S(str);
                return false;
            case 1:
                BusinessDirectoryActivity businessDirectoryActivity = (BusinessDirectoryActivity) this.A00;
                BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = businessDirectoryActivity.A05;
                if (businessDirectoryContextualSearchFragment != null) {
                    BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = businessDirectoryContextualSearchFragment.A08;
                    String trim = str.trim();
                    if (!TextUtils.isEmpty(trim) && trim.length() >= businessDirectoryContextualSearchViewModel.A0X.A03.A07(4556)) {
                        businessDirectoryContextualSearchViewModel.A0M.A09(C129006Eo.A00(businessDirectoryContextualSearchViewModel), true);
                        BusinessDirectoryContextualSearchViewModel.A0F(businessDirectoryContextualSearchViewModel, trim, BusinessDirectoryContextualSearchViewModel.A01(businessDirectoryContextualSearchViewModel, str));
                    }
                }
                SearchView searchView = businessDirectoryActivity.A04.A00;
                if (searchView == null) {
                    return false;
                }
                searchView.clearFocus();
                return false;
            case 2:
                AnonymousClass00C.A0D(str, 0);
                CatalogSearchFragment.A06((CatalogSearchFragment) this.A00, str);
                return true;
            default:
                WebImagePicker.A0v((WebImagePicker) this.A00);
                return true;
        }
    }
}
