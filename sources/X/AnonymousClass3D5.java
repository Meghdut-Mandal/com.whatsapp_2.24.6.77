package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.3D5  reason: invalid class name */
public final class AnonymousClass3D5 {
    public final Button A00;
    public final Button A01;

    public final void A00(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        boolean z = true;
        if (configuration.smallestScreenWidthDp < 360 || configuration.orientation != 1) {
            z = false;
        }
        int i = 0;
        this.A00.setVisibility(C36381kD.A09(z));
        Button button = this.A01;
        if (z) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public AnonymousClass3D5(Activity activity, View view) {
        this.A01 = (Button) C36361kB.A0G(view, R.id.save_button);
        this.A00 = (Button) C36361kB.A0G(view, R.id.keyboard_aware_save_button);
        Configuration A0U = AnonymousClass000.A0U(activity);
        AnonymousClass00C.A08(A0U);
        A00(A0U);
    }
}
