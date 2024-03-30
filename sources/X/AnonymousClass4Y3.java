package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;
import com.whatsapp.greenalert.GreenAlertActivity;

/* renamed from: X.4Y3  reason: invalid class name */
public class AnonymousClass4Y3 implements C16720pz {
    public Object A00;
    public final int A01;

    public AnonymousClass4Y3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bfu(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        int i5 = this.A01;
        Object obj = this.A00;
        if (i5 != 0) {
            View findViewById = ((AnonymousClass01L) obj).findViewById(R.id.fade_view);
            if (findViewById != null) {
                int i6 = 8;
                if (i2 > 0) {
                    i6 = 0;
                }
                findViewById.setVisibility(i6);
                return;
            }
            return;
        }
        GreenAlertActivity greenAlertActivity = (GreenAlertActivity) obj;
        GreenAlertActivity.A0F(greenAlertActivity, greenAlertActivity.A02.getCurrentLogicalItem());
    }
}
