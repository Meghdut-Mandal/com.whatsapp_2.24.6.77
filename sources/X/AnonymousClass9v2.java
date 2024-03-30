package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

/* renamed from: X.9v2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9v2 implements View.OnClickListener {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ IndiaUpiScanQrCodeFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass9v2(WaTextView waTextView, IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment, String str) {
        this.A01 = indiaUpiScanQrCodeFragment;
        this.A02 = str;
        this.A00 = waTextView;
    }

    public final void onClick(View view) {
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A01;
        String str = this.A02;
        WaTextView waTextView = this.A00;
        indiaUpiScanQrCodeFragment.A04.BOm(1, 196, "scan_qr_code", str);
        AnonymousClass01I A0h = indiaUpiScanQrCodeFragment.A0h();
        if (A0h instanceof IndiaUpiQrTabActivity) {
            Intent A0G = C165597tg.A0G(waTextView.getContext());
            A0G.putExtra("extra_payments_entry_type", 14);
            C165597tg.A0z(A0G, str);
            A0G.putExtra("extra_referral_screen", str);
            A0G.putExtra("extra_skip_value_props_display", false);
            A0G.putExtra("extra_scan_qr_onboarding_only", true);
            ((C225314u) A0h).BuO(A0G, 1025);
        }
    }
}
