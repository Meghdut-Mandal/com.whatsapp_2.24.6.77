package X;

import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment;
import java.util.List;

/* renamed from: X.7SF  reason: invalid class name */
public final class AnonymousClass7SF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessDirectoryPopularApiBusinessesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SF(BusinessDirectoryPopularApiBusinessesFragment businessDirectoryPopularApiBusinessesFragment) {
        super(1);
        this.this$0 = businessDirectoryPopularApiBusinessesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C95884mR r0 = this.this$0.A01;
        if (r0 != null) {
            r0.A0M(list);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("directoryListAdapter");
    }
}
