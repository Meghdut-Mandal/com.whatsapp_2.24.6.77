package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass17Y;
import X.AnonymousClass1MK;
import X.AnonymousClass3MA;
import X.AnonymousClass3Y6;
import X.C19420v0;
import X.C33521fV;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C65443Sb;
import X.C81133wW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;

public class QrScanCodeFragment extends Hilt_QrScanCodeFragment {
    public AnonymousClass17Y A00;
    public AnonymousClass1MK A01;
    public C19420v0 A02;
    public WaQrScannerView A03;
    public String A04;
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public View A09;
    public ImageView A0A;
    public QrScannerOverlay A0B;
    public final Runnable A0C = new C81133wW((Object) this, 44);
    public final Runnable A0D = new C81133wW((Object) this, 45);

    public static void A00(QrScanCodeFragment qrScanCodeFragment) {
        boolean BvN = qrScanCodeFragment.A03.A01.BvN();
        ImageView imageView = qrScanCodeFragment.A0A;
        if (BvN) {
            imageView.setVisibility(0);
            boolean BNS = qrScanCodeFragment.A03.A01.BNS();
            ImageView imageView2 = qrScanCodeFragment.A0A;
            int i = R.drawable.flash_off;
            if (BNS) {
                i = R.drawable.flash_on;
            }
            imageView2.setImageResource(i);
            ImageView imageView3 = qrScanCodeFragment.A0A;
            int i2 = R.string.f12nameremoved;
            if (!BNS) {
                i2 = R.string.f12nameremoved;
            }
            C36421kH.A0z(imageView3, qrScanCodeFragment, i2);
            return;
        }
        imageView.setVisibility(8);
    }

    public static void A03(QrScanCodeFragment qrScanCodeFragment) {
        WaQrScannerView waQrScannerView = qrScanCodeFragment.A03;
        if (waQrScannerView != null) {
            int i = 0;
            waQrScannerView.setVisibility(C36351kA.A00(qrScanCodeFragment.A08 ? 1 : 0));
            QrScannerOverlay qrScannerOverlay = qrScanCodeFragment.A0B;
            if (!qrScanCodeFragment.A08) {
                i = 8;
            }
            qrScannerOverlay.setVisibility(i);
        }
    }

    public void A1H() {
        this.A00.A0G(this.A0C);
        super.A1H();
    }

    public void A1Z() {
        this.A00.A0G(this.A0D);
        this.A08 = true;
        A03(this);
        AnonymousClass17Y r0 = this.A00;
        Runnable runnable = this.A0C;
        r0.A0G(runnable);
        if (this.A06) {
            if (A15()) {
                C65443Sb.A02(new QrEducationDialogFragment(), A0k());
                this.A05 = true;
            }
        } else if (!this.A07) {
            this.A00.A0I(runnable, 15000);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A03 = (WaQrScannerView) A0E.findViewById(R.id.qr_scanner_view);
        this.A0B = (QrScannerOverlay) A0E.findViewById(R.id.overlay);
        this.A09 = A0E.findViewById(R.id.qr_scan_from_gallery);
        this.A0A = C36391kE.A0N(A0E, R.id.qr_scan_flash);
        this.A06 = C36441kJ.A1I(C36341k9.A0E(this.A02), "contact_qr_education");
        AnonymousClass3Y6.A00(this.A0A, this, 3);
        AnonymousClass3Y6.A00(this.A09, this, 4);
        WaQrScannerView waQrScannerView = this.A03;
        waQrScannerView.setQrScannerCallback(new AnonymousClass3MA(this, 3));
        C36421kH.A0z(waQrScannerView, this, R.string.f12nameremoved);
        C33521fV.A03(this.A03, R.string.f12nameremoved);
        AnonymousClass3Y6.A00(this.A03, this, 5);
        A03(this);
        return A0E;
    }

    public void A1K() {
        super.A1K();
        this.A00.A0G(this.A0C);
    }

    public void A1L() {
        super.A1L();
        if (this.A08 && !this.A07 && !this.A06) {
            this.A00.A0I(this.A0C, 15000);
        }
    }
}
