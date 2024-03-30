package X;

import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.7S5  reason: invalid class name */
public final class AnonymousClass7S5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessApiBrowseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7S5(BusinessApiBrowseFragment businessApiBrowseFragment) {
        super(1);
        this.this$0 = businessApiBrowseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<AnonymousClass5EQ> list = (List) obj;
        BusinessApiBrowseFragment businessApiBrowseFragment = this.this$0;
        AnonymousClass5DU r0 = businessApiBrowseFragment.A02;
        if (r0 != null) {
            r0.A0M(list);
            if (list == null) {
                Log.e("BusinessApiBrowseFragment/getTotalNumberOfBusinessProfileShown searchListItems cannot be null");
            } else {
                boolean z = C007103b.A0N(list) instanceof AnonymousClass5E0;
                int size = list.size();
                if (!z) {
                    size--;
                }
                if (size != 0) {
                    C1255760k r1 = businessApiBrowseFragment.A01;
                    if (r1 == null) {
                        throw C36331k8.A0d("businessApiSearchLoggingEligibility");
                    } else if (r1.A00(businessApiBrowseFragment.A05)) {
                        AnonymousClass6OF r4 = businessApiBrowseFragment.A03;
                        if (r4 != null) {
                            long j = (long) size;
                            int i = 0;
                            for (AnonymousClass5EQ r12 : list) {
                                if ((r12 instanceof AnonymousClass5E0) && ((AnonymousClass5E0) r12).A00.A08 == 2) {
                                    i++;
                                }
                            }
                            r4.A02(1, j, (long) i);
                        } else {
                            throw C36331k8.A0d("businessApiSearchAnalyticsManager");
                        }
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("listAdapter");
    }
}
