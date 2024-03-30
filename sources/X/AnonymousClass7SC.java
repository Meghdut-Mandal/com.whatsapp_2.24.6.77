package X;

import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.7SC  reason: invalid class name */
public final class AnonymousClass7SC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SC(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CardView cardView;
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
        int A07 = C36411kG.A07((Number) obj);
        if (A07 == 0) {
            ViewGroup viewGroup = businessDirectorySERPMapViewActivity.A00;
            if (viewGroup == null) {
                throw C36331k8.A0d("progressBarContainer");
            }
            viewGroup.setVisibility(8);
            cardView = businessDirectorySERPMapViewActivity.A01;
            if (cardView == null) {
                throw C36331k8.A0d("mapViewChip");
            }
        } else if (A07 == 1 || A07 == 2) {
            ViewGroup viewGroup2 = businessDirectorySERPMapViewActivity.A00;
            if (viewGroup2 == null) {
                throw C36331k8.A0d("progressBarContainer");
            }
            viewGroup2.setVisibility(0);
            cardView = businessDirectorySERPMapViewActivity.A01;
            if (cardView == null) {
                throw C36331k8.A0d("mapViewChip");
            }
        } else {
            if (A07 == 3) {
                ViewGroup viewGroup3 = businessDirectorySERPMapViewActivity.A00;
                if (viewGroup3 == null) {
                    throw C36331k8.A0d("progressBarContainer");
                }
                viewGroup3.setVisibility(8);
                CardView cardView2 = businessDirectorySERPMapViewActivity.A01;
                if (cardView2 == null) {
                    throw C36331k8.A0d("mapViewChip");
                }
                cardView2.setVisibility(0);
            }
            return AnonymousClass0AJ.A00;
        }
        cardView.setVisibility(8);
        return AnonymousClass0AJ.A00;
    }
}
