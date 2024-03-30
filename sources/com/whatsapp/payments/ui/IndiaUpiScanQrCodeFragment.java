package com.whatsapp.payments.ui;

import X.AE0;
import X.AF7;
import X.AnonymousClass01I;
import X.AnonymousClass17Y;
import X.AnonymousClass1EU;
import X.AnonymousClass1MK;
import X.AnonymousClass1RJ;
import X.AnonymousClass3GQ;
import X.AnonymousClass9v2;
import X.C012005e;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C21617ASj;
import X.C21683AWd;
import X.C225314u;
import X.C24601Db;
import X.C32681e1;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36421kH;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiScanQrCodeFragment extends Hilt_IndiaUpiScanQrCodeFragment {
    public AnonymousClass17Y A00;
    public AnonymousClass1MK A01;
    public AE0 A02;
    public AnonymousClass1EU A03;
    public AF7 A04;
    public AnonymousClass3GQ A05;
    public WaQrScannerView A06;
    public C32681e1 A07;
    public String A08;
    public boolean A09 = true;
    public View A0A;
    public ImageView A0B;
    public QrScannerOverlay A0C;
    public AnonymousClass1RJ A0D;

    public static void A00(IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment) {
        boolean BvN = indiaUpiScanQrCodeFragment.A06.BvN();
        ImageView imageView = indiaUpiScanQrCodeFragment.A0B;
        if (BvN) {
            imageView.setVisibility(0);
            boolean BNS = indiaUpiScanQrCodeFragment.A06.BNS();
            ImageView imageView2 = indiaUpiScanQrCodeFragment.A0B;
            int i = R.drawable.flash_off;
            if (BNS) {
                i = R.drawable.flash_on;
            }
            imageView2.setImageResource(i);
            ImageView imageView3 = indiaUpiScanQrCodeFragment.A0B;
            int i2 = R.string.f12nameremoved;
            if (!BNS) {
                i2 = R.string.f12nameremoved;
            }
            imageView3.setContentDescription(indiaUpiScanQrCodeFragment.A0n(i2));
            return;
        }
        imageView.setVisibility(8);
    }

    public void A1Z() {
        this.A0C.setVisibility(8);
        this.A0A.setBackgroundColor(C36341k9.A0G(this).getColor(R.color.f6nameremoved));
        this.A0A.setVisibility(0);
    }

    public void A1a() {
        this.A06.setVisibility(8);
        this.A0C.setVisibility(8);
        this.A0A.setVisibility(0);
    }

    public void A1b() {
        this.A06.setVisibility(0);
        QrScannerOverlay qrScannerOverlay = this.A0C;
        qrScannerOverlay.A02 = this.A03.A02("p2p_context").A0D();
        qrScannerOverlay.invalidate();
        this.A0C.setVisibility(0);
        this.A0A.setVisibility(8);
    }

    public void A1c() {
        this.A0D.A03(8);
        Bundle bundle = this.A0A;
        if (bundle != null) {
            int i = bundle.getInt("extra_payments_entry_type");
            QrScannerOverlay qrScannerOverlay = this.A0C;
            qrScannerOverlay.A02 = this.A03.A02("p2p_context").A0D();
            qrScannerOverlay.invalidate();
            Context A1D = A1D();
            if (i == 14 && !this.A03.A02("p2p_context").A0D()) {
                String string = A0b().getString("referral_screen");
                if (this.A02.A0P()) {
                    String A0n = A0n(R.string.f12nameremoved);
                    WaTextView waTextView = (WaTextView) this.A0D.A01();
                    waTextView.setText(this.A07.A02(A1D, C21683AWd.A00, A0n, "learn-more"));
                    waTextView.setOnClickListener(new AnonymousClass9v2(waTextView, this, string));
                    this.A0D.A03(0);
                    return;
                }
                AE0 ae0 = this.A02;
                synchronized (ae0) {
                    try {
                        C24601Db r2 = ae0.A01;
                        JSONObject A0h = C165567td.A0h(r2);
                        A0h.put("chatListQrScanOnboardingSheetDismissed", true);
                        C165577te.A1B(r2, A0h);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeChatListQrScanOnboardingSheetDismissed threw: ", e);
                    }
                }
                AnonymousClass01I A0h2 = A0h();
                if (A0h2 instanceof IndiaUpiQrTabActivity) {
                    Intent A0G = C165597tg.A0G(A1D);
                    A0G.putExtra("extra_payments_entry_type", i);
                    A0G.putExtra("referral_screen", string);
                    A0G.putExtra("extra_referral_screen", string);
                    A0G.putExtra("extra_skip_value_props_display", false);
                    A0G.putExtra("extra_show_bottom_sheet_props", true);
                    A0G.putExtra("extra_scan_qr_onboarding_only", true);
                    ((C225314u) A0h2).BuO(A0G, 1025);
                    return;
                }
                return;
            }
            return;
        }
        return;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1K() {
        super.A1K();
        if (this.A06.getVisibility() == 0) {
            this.A06.setVisibility(4);
        }
        this.A05.A01(4);
    }

    public void A1L() {
        AnonymousClass01I A0h;
        super.A1L();
        if (this.A06.getVisibility() == 4 && (A0h = A0h()) != null && !A0h.isFinishing()) {
            this.A06.setVisibility(0);
        }
    }

    public void A1S(Bundle bundle, View view) {
        this.A0C = (QrScannerOverlay) C012005e.A02(view, R.id.overlay);
        this.A06 = (WaQrScannerView) C012005e.A02(view, R.id.qr_scanner_view);
        this.A0A = C012005e.A02(view, R.id.shade);
        this.A0D = C36341k9.A0X(view, R.id.hint);
        this.A06.setQrScannerCallback(new C21617ASj(this));
        View A022 = C012005e.A02(view, R.id.qr_scan_from_gallery);
        A022.setVisibility(0);
        C36421kH.A13(A022, this, 13);
        ImageView A0G = C36401kF.A0G(view, R.id.qr_scan_flash);
        this.A0B = A0G;
        C36421kH.A13(A0G, this, 14);
        if (!(!this.A02.A0P())) {
            A1c();
        }
        A1a();
    }
}
