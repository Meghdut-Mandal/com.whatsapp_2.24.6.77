package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3Gn  reason: invalid class name and case insensitive filesystem */
public final class C62533Gn {
    public AnonymousClass141 A00;
    public boolean A01;
    public final Context A02;
    public final TextView A03;
    public final C65383Rv A04;
    public final TextView A05;

    public final void A00() {
        this.A00 = null;
        this.A01 = false;
        this.A05.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public final void A01(AnonymousClass141 r3, String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = r3;
        this.A01 = true;
        TextView textView = this.A05;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public C62533Gn(Context context, View view, C65383Rv r4) {
        this.A02 = context;
        this.A04 = r4;
        this.A05 = C36341k9.A0M(view, R.id.number_on_whatsapp_message);
        this.A03 = C36341k9.A0M(view, R.id.number_on_whatsapp_action);
    }
}
