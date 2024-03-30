package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass000;
import X.C012005e;
import X.C19730wQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ContactQrMyCodeFragment extends Hilt_ContactQrMyCodeFragment {
    public C19730wQ A00;
    public ContactQrContactCardView A01;
    public String A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) C012005e.A02(inflate, R.id.contact_qr_card);
        this.A01 = contactQrContactCardView;
        contactQrContactCardView.setStyle(0);
        ContactQrContactCardView contactQrContactCardView2 = this.A01;
        C19730wQ r0 = this.A00;
        r0.A0G();
        contactQrContactCardView2.A02(r0.A0E, true);
        this.A01.setPrompt(A0n(R.string.f12nameremoved));
        ContactQrContactCardView contactQrContactCardView3 = this.A01;
        if (!(contactQrContactCardView3 == null || (str = this.A02) == null)) {
            contactQrContactCardView3.setQrCode(AnonymousClass000.A0p("https://wa.me/qr/", str, AnonymousClass000.A0u()));
        }
        return inflate;
    }
}
