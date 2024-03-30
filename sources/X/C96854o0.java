package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4o0  reason: invalid class name and case insensitive filesystem */
public final class C96854o0 extends AnonymousClass0D3 {
    public final View A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final AnonymousClass1RY A03;
    public final C19970wo A04;
    public final C18820ts A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96854o0(View view, AnonymousClass1RY r3, C19970wo r4, C18820ts r5) {
        super(view);
        C36321k7.A11(r4, r5, r3);
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
        this.A00 = C36361kB.A0G(view, R.id.poll_results_user_main_layout);
        this.A01 = C90474aD.A0P(view, R.id.poll_results_user_picture);
        this.A02 = C36341k9.A0Q(view, R.id.poll_results_primary_name);
    }
}
