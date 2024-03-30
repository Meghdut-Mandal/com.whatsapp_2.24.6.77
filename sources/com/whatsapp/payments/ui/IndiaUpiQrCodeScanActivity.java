package com.whatsapp.payments.ui;

import X.AnonymousClass07B;
import X.AnonymousClass3GQ;
import X.AnonymousClass3MA;
import X.C18800tq;
import X.C18830tt;
import X.C24611Dc;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C47042ch;
import X.C89344We;
import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.qrcode.WaQrScannerView;

public final class IndiaUpiQrCodeScanActivity extends C47042ch {
    public AnonymousClass3GQ A00;
    public boolean A01;
    public final C24611Dc A02;

    public void onCreate(Bundle bundle) {
        A28(5);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false));
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        C36381kD.A0O(this).A0U(true);
        WaQrScannerView waQrScannerView = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
        this.A05 = waQrScannerView;
        waQrScannerView.setQrScannerCallback(new AnonymousClass3MA(this, 1));
        C36341k9.A13(this, R.id.overlay, 0);
        A3i();
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36381kD.A0W(A0B);
            this.A04 = C36351kA.A0X(A0B);
            this.A00 = (AnonymousClass3GQ) r1.ABb.get();
        }
    }

    public IndiaUpiQrCodeScanActivity(int i) {
        this.A01 = false;
        C89344We.A00(this, 49);
    }

    public void onPause() {
        super.onPause();
        this.A00.A01(4);
    }

    public IndiaUpiQrCodeScanActivity() {
        this(0);
        this.A02 = C24611Dc.A00("IndiaUpiQrCodeScanActivity", "payment", "IN");
    }
}
