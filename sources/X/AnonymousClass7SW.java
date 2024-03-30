package X;

import android.widget.TextView;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.7SW  reason: invalid class name */
public final class AnonymousClass7SW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SW(CatalogSearchFragment catalogSearchFragment) {
        super(1);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        TextView textView = this.this$0.A05;
        if (textView != null) {
            textView.setText(str);
        }
        return AnonymousClass0AJ.A00;
    }
}
