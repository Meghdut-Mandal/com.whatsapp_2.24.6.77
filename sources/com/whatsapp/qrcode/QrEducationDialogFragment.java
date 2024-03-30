package com.whatsapp.qrcode;

import X.AnonymousClass02E;
import X.AnonymousClass3Y6;
import X.C19420v0;
import X.C36331k8;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

public class QrEducationDialogFragment extends Hilt_QrEducationDialogFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        ((QrEducationView) inflate.findViewById(R.id.education)).A0B = false;
        AnonymousClass3Y6.A00(inflate.findViewById(R.id.ok), this, 1);
        return inflate;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(2, R.style.f13nameremoved);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass02E r5 = this.A0I;
        if (r5 instanceof QrScanCodeFragment) {
            QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) r5;
            if (qrScanCodeFragment.A06) {
                qrScanCodeFragment.A06 = false;
                C36331k8.A0w(C19420v0.A00(qrScanCodeFragment.A02), "contact_qr_education", false);
                qrScanCodeFragment.A00.A0I(qrScanCodeFragment.A0C, 15000);
            }
            qrScanCodeFragment.A05 = false;
            qrScanCodeFragment.A03.BoN();
        }
    }
}
