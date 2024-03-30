package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4o6  reason: invalid class name and case insensitive filesystem */
public final class C96914o6 extends AnonymousClass0D3 {
    public final View A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C21060yb A06;
    public final C18820ts A07;
    public final AnonymousClass1H2 A08;
    public final C19890wg A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96914o6(View view, C21060yb r5, C18820ts r6, AnonymousClass1H2 r7, C19890wg r8) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        C36321k7.A19(r7, r6, r5, r8);
        this.A08 = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A09 = r8;
        LinearLayout linearLayout = (LinearLayout) C36361kB.A0G(view, R.id.poll_results_option_main_layout);
        this.A02 = linearLayout;
        this.A05 = C36341k9.A0Q(view, R.id.poll_results_option);
        this.A04 = C36341k9.A0Q(view, R.id.poll_results_option_count);
        this.A03 = C90474aD.A0P(view, R.id.poll_results_option_count_star);
        this.A01 = (LinearLayout) C36361kB.A0G(view, R.id.poll_results_option_count_layout);
        this.A00 = C36361kB.A0G(view, R.id.poll_results_divider);
        C33521fV.A07(linearLayout, true);
    }
}
