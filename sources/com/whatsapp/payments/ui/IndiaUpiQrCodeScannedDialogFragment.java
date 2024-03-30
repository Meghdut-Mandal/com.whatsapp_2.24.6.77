package com.whatsapp.payments.ui;

import X.AE0;
import X.AED;
import X.AF7;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass076;
import X.AnonymousClass11F;
import X.AnonymousClass1EV;
import X.AnonymousClass1EZ;
import X.B1D;
import X.B6s;
import X.C165587tf;
import X.C165617ti;
import X.C167617yQ;
import X.C18740tg;
import X.C18820ts;
import X.C19630wG;
import X.C19970wo;
import X.C202699mR;
import X.C202759mb;
import X.C203479o6;
import X.C20810yC;
import X.C21100yf;
import X.C22827Awc;
import X.C24611Dc;
import X.C24631De;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiQrCodeScannedDialogFragment extends Hilt_IndiaUpiQrCodeScannedDialogFragment {
    public View A00;
    public View A01;
    public Button A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C21100yf A0B;
    public C19970wo A0C;
    public C19630wG A0D;
    public C18820ts A0E;
    public C20810yC A0F;
    public AnonymousClass11F A0G;
    public AED A0H;
    public AE0 A0I;
    public AnonymousClass1EZ A0J;
    public C24631De A0K;
    public AnonymousClass1EV A0L;
    public AF7 A0M;
    public C202699mR A0N;
    public C167617yQ A0O;
    public String A0P;
    public final C24611Dc A0Q = C165587tf.A0X("IndiaUpiQrCodeScannedDialogFragment");

    public void A1P(Bundle bundle) {
        this.A0Y = true;
        Bundle A0b = A0b();
        this.A0G = C36351kA.A0i(A0b, "ARG_JID");
        this.A0O = (C167617yQ) C165617ti.A0A(new B6s(this, A0b.getString("ARG_URL"), A0b.getString("external_payment_source"), 0), this).A00(C167617yQ.class);
        AE0 ae0 = this.A0I;
        this.A0H = new AED(this.A0B, this.A0F, ae0, this.A0M, this.A0N);
        C36421kH.A13(this.A02, this, 12);
    }

    public static IndiaUpiQrCodeScannedDialogFragment A03(AnonymousClass11F r4, String str, String str2, String str3) {
        String str4;
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = new IndiaUpiQrCodeScannedDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("ARG_URL", str);
        if (r4 != null) {
            str4 = r4.getRawString();
        } else {
            str4 = "";
        }
        A072.putString("ARG_JID", str4);
        A072.putString("external_payment_source", str2);
        A072.putString("referral_screen", str3);
        indiaUpiQrCodeScannedDialogFragment.A17(A072);
        return indiaUpiQrCodeScannedDialogFragment;
    }

    public static void A05(IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment) {
        AED aed;
        AnonymousClass01I A0i;
        String str;
        AnonymousClass11F r5;
        String str2;
        String str3;
        B1D b1d;
        boolean z;
        int i;
        Object A042 = indiaUpiQrCodeScannedDialogFragment.A0O.A06.A04();
        C18740tg.A06(A042);
        C203479o6 r2 = (C203479o6) A042;
        String str4 = indiaUpiQrCodeScannedDialogFragment.A0P;
        if ("main_qr_code_gallery".equals(str4) || "main_qr_code_camera".equals(str4)) {
            aed = indiaUpiQrCodeScannedDialogFragment.A0H;
            A0i = indiaUpiQrCodeScannedDialogFragment.A0i();
            str = r2.A08;
            C18740tg.A06(str);
            r5 = indiaUpiQrCodeScannedDialogFragment.A0G;
            str2 = r2.A02;
            str3 = indiaUpiQrCodeScannedDialogFragment.A0P;
            b1d = null;
            z = true;
            i = 1025;
        } else {
            aed = indiaUpiQrCodeScannedDialogFragment.A0H;
            A0i = indiaUpiQrCodeScannedDialogFragment.A0i();
            str = r2.A08;
            C18740tg.A06(str);
            r5 = indiaUpiQrCodeScannedDialogFragment.A0G;
            str2 = r2.A02;
            str3 = indiaUpiQrCodeScannedDialogFragment.A0P;
            b1d = null;
            z = false;
            i = 0;
        }
        aed.A00(A0i, r5, b1d, str, str2, str3, i, z);
        indiaUpiQrCodeScannedDialogFragment.A1b();
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0Q.A06("scanned payment QR code deep link");
        View inflate = A0i().getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
        this.A01 = inflate;
        this.A07 = (ProgressBar) inflate.findViewById(R.id.progress);
        this.A03 = C36441kJ.A0U(this.A01, R.id.details_row);
        this.A09 = C36391kE.A0P(this.A01, R.id.contact_info_title);
        this.A08 = C36391kE.A0P(this.A01, R.id.contact_info_subtitle);
        this.A0A = C36391kE.A0P(this.A01, R.id.error_desc);
        this.A02 = (Button) this.A01.findViewById(R.id.positive_button);
        this.A04 = C36441kJ.A0U(this.A01, R.id.prefill_amount);
        this.A05 = C36441kJ.A0U(this.A01, R.id.qr_code_secure_info_container);
        this.A00 = this.A01.findViewById(R.id.qr_code_secure_info_container_divider);
        for (Drawable drawable : C36391kE.A0O(this.A01, R.id.warning_text).getCompoundDrawables()) {
            if (drawable != null) {
                AnonymousClass076.A06(drawable, C36341k9.A0G(this).getColor(R.color.f6nameremoved));
            }
        }
        ProgressBar progressBar = (ProgressBar) this.A01.findViewById(R.id.button_progress_bar);
        this.A06 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(AnonymousClass00F.A00(A1D(), C36411kG.A01(A1D())), PorterDuff.Mode.SRC_IN);
        String string = A0b().getString("referral_screen");
        this.A0P = string;
        this.A0M.BOm(0, (Integer) null, "qr_code_scan_prompt", string);
        return this.A01;
    }

    public void A19() {
        super.A19();
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof C22827Awc) {
            C36411kG.A1N((C22827Awc) A0h);
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 1001) {
            if (this.A0J.A0E() || this.A0J.A0F()) {
                if (!this.A0F.A0E(1933) || !C202759mb.A05(this.A0P)) {
                    Bundle A0b = A0b();
                    this.A0O.A0S(A0b.getString("ARG_URL"), A0b.getString("external_payment_source"));
                    return;
                }
                A05(this);
                return;
            }
        } else if (i == 1002) {
            AnonymousClass01I A0h = A0h();
            if (A0h instanceof C22827Awc) {
                ((Activity) ((C22827Awc) A0h)).setResult(i2, intent);
            }
        } else {
            return;
        }
        A1b();
    }
}
