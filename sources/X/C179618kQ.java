package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8kQ  reason: invalid class name and case insensitive filesystem */
public class C179618kQ extends AnonymousClass80E {
    public final LinearLayout A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final AnonymousClass1EV A08;
    public final AnonymousClass1RJ A09;
    public final WaImageView A0A;
    public final C18820ts A0B;

    public static void A00(C202319lY r8, C179618kQ r9) {
        if (r8 != null && r8.A06 > 0 && r8.A0G()) {
            WaTextView waTextView = r9.A06;
            waTextView.setVisibility(0);
            Resources resources = r9.A0H.getResources();
            boolean A0L = r8.A0L();
            int i = R.string.f12nameremoved;
            if (A0L) {
                i = R.string.f12nameremoved;
            }
            waTextView.setText(C36411kG.A0w(resources, C20040wv.A05(r9.A0B, r8.A06), AnonymousClass001.A0L(), 0, i));
        }
    }

    public C179618kQ(View view, C18820ts r3, AnonymousClass1EV r4) {
        super(view);
        this.A0B = r3;
        this.A08 = r4;
        this.A04 = C36401kF.A0Q(view, R.id.additional_note);
        this.A00 = C90514aH.A0U(view, R.id.additional_note_container);
        this.A02 = C90514aH.A0U(view, R.id.payment_details);
        this.A01 = C90514aH.A0U(view, R.id.message_biz);
        this.A03 = C36431kI.A0X(view, R.id.payment_currency_symbol_icon);
        this.A06 = C36401kF.A0Q(view, R.id.payment_details_status);
        this.A05 = C36401kF.A0Q(view, R.id.message_biz_title);
        this.A09 = C36341k9.A0X(view, R.id.payment_support_container);
        this.A0A = C36431kI.A0X(view, R.id.payment_support_icon);
        this.A07 = C36401kF.A0Q(view, R.id.payment_support_title);
    }
}
