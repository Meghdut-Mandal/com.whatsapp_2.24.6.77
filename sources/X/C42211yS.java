package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.R;

/* renamed from: X.1yS  reason: invalid class name and case insensitive filesystem */
public final class C42211yS extends AnonymousClass0D3 {
    public boolean A00;
    public final ImageView A01;
    public final AnonymousClass3CG A02;
    public final /* synthetic */ CatalogImageListActivity A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42211yS(View view, CatalogImageListActivity catalogImageListActivity, AnonymousClass3CG r4) {
        super(view);
        C36321k7.A0z(r4, view);
        this.A03 = catalogImageListActivity;
        this.A02 = r4;
        this.A01 = C36361kB.A0M(view, R.id.catalog_image_list_image_view);
    }
}
