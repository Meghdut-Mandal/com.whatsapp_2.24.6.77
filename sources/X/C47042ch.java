package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;

/* renamed from: X.2ch  reason: invalid class name and case insensitive filesystem */
public abstract class C47042ch extends AnonymousClass24Q {
    public View A00;
    public View A01;
    public TextView A02;
    public AnonymousClass1MK A03;
    public C20830yE A04;
    public WaQrScannerView A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            finish();
        } else {
            this.A05.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean A1I;
        A28(5);
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false));
        C36321k7.A0O(this);
        if (this instanceof P2pTransferQrScannerActivity) {
            A1I = false;
        } else {
            A1I = C36441kJ.A1I(C36331k8.A06(this), "qr_education");
        }
        this.A07 = A1I;
        this.A00 = findViewById(R.id.overlay);
        this.A05 = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
        this.A01 = findViewById(R.id.shade);
        this.A02 = C36391kE.A0Q(this, R.id.hint);
        this.A05.setQrScannerCallback(new AnonymousClass3MA(this, 2));
        View findViewById = findViewById(R.id.ok);
        View findViewById2 = findViewById(R.id.education);
        AnonymousClass3YH.A00(findViewById, this, findViewById2, 26);
        if (this.A07) {
            findViewById2.setVisibility(0);
            this.A05.setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        findViewById2.setVisibility(8);
        A3i();
    }

    public void A3i() {
        int A022 = this.A04.A02("android.permission.CAMERA");
        WaQrScannerView waQrScannerView = this.A05;
        if (A022 == 0) {
            waQrScannerView.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
            return;
        }
        waQrScannerView.setVisibility(8);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        AnonymousClass3FM A002 = AnonymousClass3FM.A00(this);
        int[] iArr = {R.string.f12nameremoved};
        A002.A02 = R.string.f12nameremoved;
        A002.A0A = iArr;
        int[] iArr2 = {R.string.f12nameremoved};
        A002.A03 = R.string.f12nameremoved;
        A002.A08 = iArr2;
        AnonymousClass3FM.A01(A002, "android.permission.CAMERA");
        A002.A06 = true;
        if ((this instanceof IndiaUpiQrCodeScanActivity) || (this instanceof P2pTransferQrScannerActivity)) {
            int[] iArr3 = {R.string.f12nameremoved};
            A002.A02 = R.string.f12nameremoved;
            A002.A0A = iArr3;
            int[] iArr4 = {R.string.f12nameremoved};
            A002.A03 = R.string.f12nameremoved;
            A002.A08 = iArr4;
        }
        startActivityForResult(A002.A02(), 1);
    }

    public void A3j(String str) {
        Log.i("QrScannerActivity/result");
        if (str == null || str.equals(this.A06)) {
            this.A05.BoN();
        } else {
            this.A06 = str;
            if (this instanceof DevicePairQrScannerActivity) {
                DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this;
                devicePairQrScannerActivity.A05.A0G(devicePairQrScannerActivity.A0K);
                devicePairQrScannerActivity.A05.Bp3(new C81133wW((Object) devicePairQrScannerActivity, 32));
            } else if (this instanceof IndiaUpiQrCodeScanActivity) {
                Vibrator A0H = this.A08.A0H();
                if (A0H != null) {
                    A0H.vibrate(75);
                }
                Intent A0H2 = C36441kJ.A0H(this, IndiaUpiPaymentLauncherActivity.class);
                A0H2.putExtra("intent_source", true);
                C36421kH.A0n(A0H2, this.A06);
                startActivity(A0H2);
                finish();
            } else {
                Intent A0D = C36431kI.A0D();
                A0D.putExtra("qr_code_key", this.A06);
                C36331k8.A0o(this, A0D);
            }
        }
        C36331k8.A0w(C19420v0.A00(this.A09), "qr_education", false);
    }

    public void onPause() {
        super.onPause();
        if (this.A05.getVisibility() == 0) {
            this.A05.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A05.getVisibility() == 4) {
            this.A05.setVisibility(0);
        }
    }
}
