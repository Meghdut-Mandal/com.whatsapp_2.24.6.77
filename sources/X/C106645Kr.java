package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5Kr  reason: invalid class name and case insensitive filesystem */
public class C106645Kr extends C147396x9 {
    public final AnonymousClass1HA A00;
    public final C88234Rx A01;
    public final C95494lK A02;

    public C106645Kr(Context context, LayoutInflater layoutInflater, C20810yC r9, AnonymousClass1HA r10, C88234Rx r11, C95494lK r12, int i, int i2) {
        super(context, layoutInflater, r9, i, i2);
        this.A00 = r10;
        this.A01 = r11;
        this.A02 = r12;
    }

    public void A03(View view) {
        C001700s r1 = this.A02.A02;
        if (r1.A04() != null && !C36401kF.A0w(r1).isEmpty()) {
            C012005e.A02(view, R.id.empty).setVisibility(8);
            C36341k9.A10(view, R.id.empty_text, 8);
        }
    }
}
