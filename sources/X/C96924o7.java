package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4o7  reason: invalid class name and case insensitive filesystem */
public final class C96924o7 extends AnonymousClass0D3 {
    public final View A00;
    public final C19730wQ A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass1RY A07;
    public final C19970wo A08;
    public final C18820ts A09;
    public final AnonymousClass7d1 A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96924o7(View view, C19730wQ r3, AnonymousClass16D r4, AnonymousClass1RY r5, C19970wo r6, C18820ts r7, AnonymousClass7d1 r8) {
        super(view);
        C36321k7.A1B(r6, r3, r4, r7, r5);
        AnonymousClass00C.A0D(r8, 6);
        this.A08 = r6;
        this.A01 = r3;
        this.A06 = r4;
        this.A09 = r7;
        this.A07 = r5;
        this.A0A = r8;
        this.A00 = C36361kB.A0G(view, R.id.poll_results_user_main_layout);
        this.A02 = C90474aD.A0P(view, R.id.poll_results_user_picture);
        this.A03 = C36341k9.A0Q(view, R.id.poll_results_primary_name);
        this.A04 = C36341k9.A0Q(view, R.id.poll_results_secondary_name);
        this.A05 = C36341k9.A0Q(view, R.id.poll_results_timestamp);
    }
}
