package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8kq  reason: invalid class name and case insensitive filesystem */
public class C179878kq extends AnonymousClass80F {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final C20810yC A04;
    public final C29931Yo A05;

    public C179878kq(View view, C20810yC r3, C29931Yo r4) {
        super(view);
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = C36391kE.A0O(view, R.id.display_payment_amount);
        this.A02 = C36391kE.A0O(view, R.id.payment_amount_subtext);
        this.A00 = C012005e.A02(view, R.id.payment_expressive_background_container);
        this.A01 = C36401kF.A0G(view, R.id.payment_expressive_background);
    }
}
