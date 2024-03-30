package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.CatalogImageListActivity;

/* renamed from: X.3aK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67693aK implements C010904r {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ C41231ws A01;
    public final /* synthetic */ CatalogImageListActivity A02;

    public /* synthetic */ C67693aK(LinearLayoutManager linearLayoutManager, C41231ws r2, CatalogImageListActivity catalogImageListActivity) {
        this.A02 = catalogImageListActivity;
        this.A01 = r2;
        this.A00 = linearLayoutManager;
    }

    public final AnonymousClass09H BRE(View view, AnonymousClass09H r7) {
        CatalogImageListActivity catalogImageListActivity = this.A02;
        C41231ws r3 = this.A01;
        LinearLayoutManager linearLayoutManager = this.A00;
        C36331k8.A1G(linearLayoutManager, 2, r7);
        catalogImageListActivity.A01 = r7.A05() + C36391kE.A02(catalogImageListActivity);
        int A022 = r7.A02();
        int i = catalogImageListActivity.A01;
        r3.A01 = i;
        r3.A00 = A022;
        int i2 = catalogImageListActivity.A00;
        if (i2 > 0) {
            linearLayoutManager.A1g(i2, i);
        }
        return r7;
    }
}
