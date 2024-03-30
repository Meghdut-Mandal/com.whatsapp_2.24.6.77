package X;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.73J  reason: invalid class name */
public class AnonymousClass73J implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass73J(Object obj, String str, int i, int i2, boolean z) {
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public final void run() {
        if (this.A04 != 0) {
            Activity activity = (Activity) this.A01;
            boolean z = this.A03;
            int i = this.A00;
            String str = this.A02;
            View A0B = C03570Gk.A0B(activity, R.id.live_location_card);
            TextView A0H = C36401kF.A0H(activity, R.id.live_location_info);
            if (i != 0 || z) {
                A0B.setVisibility(0);
                if (!z || i != 0) {
                    int i2 = R.string.f12nameremoved;
                    if (z) {
                        i2 = R.string.f12nameremoved;
                    }
                    C36341k9.A0s(activity, A0H, new Object[]{str}, i2);
                    return;
                }
                A0H.setText(R.string.f12nameremoved);
                return;
            }
            A0B.setVisibility(8);
            return;
        }
        AnonymousClass6YM r3 = (AnonymousClass6YM) this.A01;
        boolean z2 = this.A03;
        String str2 = this.A02;
        int i3 = this.A00;
        if (z2) {
            C90464aC.A14(r3);
        }
        int previewCallLink = Voip.previewCallLink(str2, z2);
        if (previewCallLink == 0) {
            r3.A15 = Integer.valueOf(i3);
        } else {
            C36321k7.A1S("voip/actionPreviewCallLink failed error: ", AnonymousClass000.A0u(), previewCallLink);
        }
    }
}
