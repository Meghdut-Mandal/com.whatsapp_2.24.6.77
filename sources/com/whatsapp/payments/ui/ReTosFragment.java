package com.whatsapp.payments.ui;

import X.AWM;
import X.AWN;
import X.AWO;
import X.AWP;
import X.AWQ;
import X.AWR;
import X.AWS;
import X.AWT;
import X.AnonymousClass001;
import X.C012005e;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C178438fw;
import X.C202939my;
import X.C203399nx;
import X.C20810yC;
import X.C21060yb;
import X.C23168B8c;
import X.C24611Dc;
import X.C29121Vk;
import X.C36331k8;
import X.C36361kB;
import X.C36401kF;
import X.C36421kH;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

public abstract class ReTosFragment extends Hilt_ReTosFragment {
    public Button A00;
    public ProgressBar A01;
    public C21060yb A02;
    public C20810yC A03;
    public C29121Vk A04;
    public C202939my A05;
    public final C24611Dc A06 = C165607th.A0c("ReTosFragment", "onboarding");

    public void A1p() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("is_consumer", true);
        A07.putBoolean("is_merchant", false);
        A17(A07);
    }

    public /* synthetic */ void A1q() {
        A1g(false);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        C29121Vk r5 = this.A04;
        boolean z = A0b().getBoolean("is_consumer");
        boolean z2 = A0b().getBoolean("is_merchant");
        C23168B8c b8c = new C23168B8c(this, 6);
        ArrayList A0I = AnonymousClass001.A0I();
        C165587tf.A1N("version", A0I, 2);
        if (z) {
            C165587tf.A1N("consumer", A0I, 1);
        }
        if (z2) {
            C165587tf.A1N("merchant", A0I, 1);
        }
        C203399nx A042 = C203399nx.A04("accept_pay", C165577te.A1a(A0I, 0));
        r5.A0I(new C178438fw(r5.A03.A00, b8c, r5.A08, r5, r5.A00, z, z2), A042, "set", "urn:xmpp:whatsapp:account", 0);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        SpannableString A012;
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        TextEmojiLabel A0O = C36401kF.A0O(A0E, R.id.retos_bottom_sheet_desc);
        C36331k8.A16(A0O, this.A02);
        C36331k8.A1A(this.A03, A0O);
        Context context = A0O.getContext();
        BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) this;
        if (brazilReTosFragment.A0b().getBoolean("is_merchant")) {
            String[] strArr = {C165597tg.A0k(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/merchant-terms/"), C165597tg.A0k(brazilReTosFragment.A00, "https://www.facebook.com/legal/commerce_product_merchant_agreement"), C165597tg.A0k(brazilReTosFragment.A00, "https://www.cielo.com.br/contrato-de-credenciamento-consolidado/")};
            A012 = brazilReTosFragment.A01.A01(context, brazilReTosFragment.A0n(R.string.f12nameremoved), new Runnable[]{AWM.A00, AWN.A00, AWO.A00}, new String[]{"wa-merchant-terms", "fb-merchant-agreement", "cielo-merchant-agreement"}, strArr);
        } else {
            String[] strArr2 = {C165597tg.A0k(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments"), C165597tg.A0k(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments-privacy-policy"), C165597tg.A0k(brazilReTosFragment.A00, "https://www.facebook.com/payments_terms"), C165597tg.A0k(brazilReTosFragment.A00, "https://www.facebook.com/policy.php"), C165597tg.A0k(brazilReTosFragment.A00, "https://www.cielo.com.br/termos-fb-pay")};
            A012 = brazilReTosFragment.A01.A01(context, brazilReTosFragment.A0n(R.string.f12nameremoved), new Runnable[]{AWP.A00, AWQ.A00, AWR.A00, AWS.A00, AWT.A00}, new String[]{"wa-terms", "wa-privacy-policy", "fb-payments-terms", "fb-privacy-policy", "cielo-terms-and-privacy-policy"}, strArr2);
        }
        A0O.setText(A012);
        this.A01 = (ProgressBar) C012005e.A02(A0E, R.id.progress_bar);
        Button button = (Button) C012005e.A02(A0E, R.id.retos_bottom_sheet_button);
        this.A00 = button;
        C36421kH.A13(button, this, 44);
        return A0E;
    }
}
