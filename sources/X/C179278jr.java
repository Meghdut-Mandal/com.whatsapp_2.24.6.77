package X;

import android.content.Context;
import android.widget.Button;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8jr  reason: invalid class name and case insensitive filesystem */
public class C179278jr extends C21130A9q {
    public void A00(Context context, List list) {
        Button button;
        int i;
        super.A00(context, list);
        String str = this.A0G;
        if ("chat".equals(str) || "payment_composer_icon".equals(str)) {
            this.A0B.setText(R.string.f12nameremoved);
            button = this.A0B;
            i = 0;
        } else {
            button = this.A0B;
            i = 8;
        }
        button.setVisibility(i);
    }

    public C179278jr(AnonymousClass16D r1, AnonymousClass185 r2, AnonymousClass171 r3, C27731Pn r4, String str, boolean z) {
        super(r1, r2, r3, r4, str, z);
    }
}
