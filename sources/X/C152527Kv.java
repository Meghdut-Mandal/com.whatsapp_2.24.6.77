package X;

import android.os.Parcelable;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.7Kv  reason: invalid class name and case insensitive filesystem */
public final class C152527Kv extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152527Kv(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable = this.this$0.A0b().getParcelable("category_biz_id");
        if (parcelable != null) {
            return parcelable;
        }
        throw C36381kD.A0l();
    }
}
