package X;

import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import java.util.List;

/* renamed from: X.4Kt  reason: invalid class name and case insensitive filesystem */
public final class C86394Kt extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CountrySelectorBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86394Kt(CountrySelectorBottomSheet countrySelectorBottomSheet) {
        super(1);
        this.this$0 = countrySelectorBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        C40451vZ r2 = this.this$0.A05;
        if (r2 != null && !list.isEmpty()) {
            r2.A02 = list;
            r2.A01 = list;
            ((AnonymousClass36Z) list.get(0)).A00 = true;
            r2.A00 = (AnonymousClass36Z) r2.A02.get(0);
            r2.A0M(list);
        }
        return AnonymousClass0AJ.A00;
    }
}
