package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.List;

/* renamed from: X.7S7  reason: invalid class name */
public final class AnonymousClass7S7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7S7(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        RecyclerView recyclerView = this.this$0.A02;
        if (recyclerView == null) {
            throw C36331k8.A0d("horizontalBusinessListView");
        }
        if (recyclerView.getVisibility() != 0) {
            RecyclerView recyclerView2 = this.this$0.A02;
            if (recyclerView2 == null) {
                throw C36331k8.A0d("horizontalBusinessListView");
            }
            recyclerView2.setVisibility(4);
        }
        AnonymousClass5DV r0 = this.this$0.A06;
        if (r0 != null) {
            r0.A0M(list);
            BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
            RecyclerView recyclerView3 = businessDirectorySERPMapViewActivity.A02;
            if (recyclerView3 == null) {
                throw C36331k8.A0d("horizontalBusinessListView");
            }
            recyclerView3.post(new C1501874h(businessDirectorySERPMapViewActivity, list, 24));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("horizontalBusinessListAdapter");
    }
}
