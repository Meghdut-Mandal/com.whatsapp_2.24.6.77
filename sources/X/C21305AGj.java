package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* renamed from: X.AGj  reason: case insensitive filesystem */
public final /* synthetic */ class C21305AGj implements C22984Aza {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C21305AGj(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public final void Bda(BottomSheetDialogFragment bottomSheetDialogFragment) {
        Context context = this.A00;
        String str = this.A01;
        bottomSheetDialogFragment.A1b();
        Intent A0F = C165597tg.A0F(context);
        A0F.putExtra("screen_name", str);
        A0F.putExtra("hide_send_payment_cta", true);
        C1025050g.A01(A0F, "onboarding_context", "p2p_context");
        C1025050g.A01(A0F, "referral_screen", "receive_flow");
        context.startActivity(A0F);
    }
}
