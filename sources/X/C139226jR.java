package X;

import android.widget.ImageView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.6jR  reason: invalid class name and case insensitive filesystem */
public final class C139226jR implements C158997ia {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A00;
    public final /* synthetic */ C1274368h A01;

    public void BT0() {
    }

    public C139226jR(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity, C1274368h r2) {
        this.A01 = r2;
        this.A00 = businessDirectorySERPMapViewActivity;
    }

    public void BY0() {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.A00;
        ImageView imageView = businessDirectorySERPMapViewActivity.A00;
        if (imageView == null) {
            throw C36331k8.A0d("myLocationBtn");
        }
        imageView.post(new C1497172m(businessDirectorySERPMapViewActivity, 24));
    }
}
