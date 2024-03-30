package X;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.math.BigDecimal;

/* renamed from: X.80K  reason: invalid class name */
public final class AnonymousClass80K extends AnonymousClass0D3 implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9ID A02;

    public void onClick(View view) {
        Intent intent;
        AnonymousClass16X r0;
        AnonymousClass16X r02;
        String str;
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass9ID r2 = this.A02;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        C21668AUl aUl = (C21668AUl) r2.A01.get(i);
        PaymentSettingsFragment paymentSettingsFragment = r2.A00;
        AnonymousClass01I A0h = paymentSettingsFragment.A0h();
        if (A0h != null) {
            intent = A0h.getIntent();
        } else {
            intent = null;
        }
        boolean z = paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment;
        if (z) {
            AF7 af7 = ((IndiaUpiPaymentSettingsFragment) paymentSettingsFragment).A0M;
            Integer A0i = C36361kB.A0i();
            if (intent != null) {
                str = intent.getStringExtra("referral_screen");
            } else {
                str = null;
            }
            af7.BOm(A0i, 149, "payment_home", str);
        }
        if (!aUl.A06) {
            UserJid userJid = aUl.A04;
            if (paymentSettingsFragment.A0d.A06(userJid) == 2) {
                C18740tg.A06(userJid);
                synchronized (aUl) {
                    r02 = aUl.A02;
                }
                BigDecimal bigDecimal = r02.A00;
                if (bigDecimal != null) {
                    AnonymousClass16U A012 = paymentSettingsFragment.A0c.A01();
                    C18740tg.A06(A012);
                    AnonymousClass16V r03 = (AnonymousClass16V) A012;
                    String A022 = AnonymousClass6US.A02(paymentSettingsFragment.A01, r03.A02, r03.A03, bigDecimal, false);
                    if (z) {
                        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) paymentSettingsFragment;
                        AnonymousClass17Y r10 = indiaUpiPaymentSettingsFragment.A0D;
                        AnonymousClass1EU r11 = indiaUpiPaymentSettingsFragment.A0e;
                        C199549fV r7 = new C199549fV(indiaUpiPaymentSettingsFragment.A0h(), (C225014r) indiaUpiPaymentSettingsFragment.A0i(), r10, r11, indiaUpiPaymentSettingsFragment.A0Q, new C1502374m(indiaUpiPaymentSettingsFragment, userJid, A022, 9), new AVb(indiaUpiPaymentSettingsFragment, userJid, 43), true);
                        if (r7.A02()) {
                            String str2 = null;
                            if (intent != null) {
                                str2 = intent.getStringExtra("referral_screen");
                            }
                            r7.A01(userJid, new B9Z(indiaUpiPaymentSettingsFragment, 0), str2);
                            return;
                        }
                    }
                    paymentSettingsFragment.A1p(userJid, A022);
                    return;
                }
                return;
            }
            return;
        }
        C175708av r72 = aUl.A03;
        synchronized (aUl) {
            r0 = aUl.A02;
        }
        BigDecimal bigDecimal2 = r0.A00;
        if (z) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment2 = (IndiaUpiPaymentSettingsFragment) paymentSettingsFragment;
            C175928bI r73 = (C175928bI) r72;
            C135086c7 A0P = C165617ti.A0P(C146356vT.A00(), String.class, r73.A0O, "paymentHandle");
            Intent A013 = indiaUpiPaymentSettingsFragment2.A0F.A01(indiaUpiPaymentSettingsFragment2.A1D(), false, true);
            A013.putExtra("extra_payment_handle", A0P);
            A013.putExtra("extra_payee_name", r73.A0A);
            A013.putExtra("extra_payment_upi_number", (Parcelable) null);
            A013.putExtra("extra_transaction_token", r73.A0U);
            indiaUpiPaymentSettingsFragment2.A0p.A01(A013);
            A013.putExtra("extra_payment_preset_amount", bigDecimal2);
            A013.putExtra("referral_screen", "send_again_contact");
            indiaUpiPaymentSettingsFragment2.A1C(A013);
        }
    }

    public AnonymousClass80K(View view, AnonymousClass9ID r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C36361kB.A0M(view, R.id.contact_icon);
        this.A01 = C36361kB.A0R(view, R.id.contact_image);
        this.A0H.setOnClickListener(this);
    }
}
