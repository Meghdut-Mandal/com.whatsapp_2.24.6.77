package X;

import android.os.Bundle;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.group.GroupPermissionsActivity;

/* renamed from: X.BAh  reason: case insensitive filesystem */
public class C23225BAh implements AnonymousClass05T {
    public Object A00;
    public final int A01;

    public C23225BAh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYP(String str, Bundle bundle) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                CatalogSearchFragment.A03(bundle, (CatalogSearchFragment) obj);
                return;
            case 1:
                GroupPermissionsActivity.A01(bundle, (GroupPermissionsActivity) obj);
                return;
            case 2:
                GroupPermissionsActivity.A0F(bundle, (GroupPermissionsActivity) obj);
                return;
            default:
                GroupPermissionsActivity.A07(bundle, (GroupPermissionsActivity) obj);
                return;
        }
    }
}
