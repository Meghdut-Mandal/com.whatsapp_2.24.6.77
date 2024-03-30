package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass17Y;
import X.AnonymousClass1JZ;
import X.AnonymousClass3YM;
import X.AnonymousClass6YV;
import X.B7Z;
import X.C012005e;
import X.C131606Ps;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C199849g7;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.Objects;

public class IndiaUpiPinPrimerFullSheetActivity extends C179128jE {
    public int A00;
    public C175748az A01;
    public C199849g7 A02;
    public String A03;
    public String A04;
    public boolean A05;

    public static void A10(IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity) {
        String str;
        int i;
        IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity2 = indiaUpiPinPrimerFullSheetActivity;
        if (indiaUpiPinPrimerFullSheetActivity.A0N.A05(indiaUpiPinPrimerFullSheetActivity.A01)) {
            C012005e.A02(indiaUpiPinPrimerFullSheetActivity.A00, R.id.account_divider_top).setVisibility(8);
            C36351kA.A1A(indiaUpiPinPrimerFullSheetActivity.A00, R.id.account_divider_bottom, 8);
            C36351kA.A1A(indiaUpiPinPrimerFullSheetActivity.A00, R.id.account_layout, 8);
            View A012 = C36341k9.A0X(indiaUpiPinPrimerFullSheetActivity.A00, R.id.verification_options).A01();
            PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C012005e.A02(A012, R.id.debit_card_option);
            PaymentMethodRow paymentMethodRow2 = (PaymentMethodRow) C012005e.A02(A012, R.id.aadhaar_card_option);
            paymentMethodRow.A02.setText("Debit card");
            paymentMethodRow.A00.setImageResource(R.drawable.av_card);
            ImageView imageView = paymentMethodRow.A00;
            AnonymousClass1JZ.A03(imageView, 0, AnonymousClass000.A0a(imageView).rightMargin);
            paymentMethodRow.A00();
            paymentMethodRow.A05(false);
            paymentMethodRow.setOnClickListener(new AnonymousClass3YM(indiaUpiPinPrimerFullSheetActivity, paymentMethodRow2, paymentMethodRow, 13));
            paymentMethodRow2.A02.setText("Aadhaar number");
            paymentMethodRow2.A00.setImageResource(R.drawable.ic_aadhaar_card_icon);
            ImageView imageView2 = paymentMethodRow2.A00;
            AnonymousClass1JZ.A03(imageView2, 0, AnonymousClass000.A0a(imageView2).rightMargin);
            paymentMethodRow2.A00();
            paymentMethodRow2.setRadioButtonChecked(true);
            indiaUpiPinPrimerFullSheetActivity.A00 = 1;
            paymentMethodRow2.A05(false);
            paymentMethodRow2.setOnClickListener(new AnonymousClass3YM(indiaUpiPinPrimerFullSheetActivity, paymentMethodRow, paymentMethodRow2, 14));
            A012.setVisibility(0);
        } else {
            C175818b6 r4 = (C175818b6) indiaUpiPinPrimerFullSheetActivity.A01.A08;
            View findViewById = indiaUpiPinPrimerFullSheetActivity.findViewById(R.id.account_layout);
            C012005e.A02(findViewById, R.id.progress).setVisibility(8);
            C36351kA.A1A(findViewById, R.id.divider, 8);
            C36351kA.A1A(findViewById, R.id.radio_button, 8);
            C173858Tk.A0O(findViewById, indiaUpiPinPrimerFullSheetActivity.A01);
            C36391kE.A0O(findViewById, R.id.account_number).setText(indiaUpiPinPrimerFullSheetActivity.A02.A02(indiaUpiPinPrimerFullSheetActivity.A01, false));
            C165607th.A1A(C36391kE.A0O(findViewById, R.id.account_name), C165577te.A0g(r4.A02));
            C36391kE.A0O(findViewById, R.id.account_type).setText(r4.A0B());
        }
        if (Objects.equals(indiaUpiPinPrimerFullSheetActivity.A04, "CREDIT")) {
            str = "https://faq.whatsapp.com/797709544841009";
        } else {
            str = "https://faq.whatsapp.com/general/payments/about-payments-data";
        }
        Uri parse = Uri.parse(str);
        C20810yC r12 = indiaUpiPinPrimerFullSheetActivity.A0D;
        AnonymousClass17Y r9 = indiaUpiPinPrimerFullSheetActivity.A05;
        C24801Dv r8 = indiaUpiPinPrimerFullSheetActivity.A01;
        C21060yb r11 = indiaUpiPinPrimerFullSheetActivity.A08;
        TextEmojiLabel A0I = C36421kH.A0I(indiaUpiPinPrimerFullSheetActivity, R.id.note);
        if (Objects.equals(indiaUpiPinPrimerFullSheetActivity.A04, "CREDIT")) {
            i = R.string.f12nameremoved;
        } else {
            boolean A052 = indiaUpiPinPrimerFullSheetActivity.A0N.A05(indiaUpiPinPrimerFullSheetActivity.A01);
            i = R.string.f12nameremoved;
            if (A052) {
                i = R.string.f12nameremoved;
            }
        }
        AnonymousClass6YV.A0E(indiaUpiPinPrimerFullSheetActivity2, parse, r8, r9, A0I, r11, r12, C36391kE.A0v(indiaUpiPinPrimerFullSheetActivity2, "learn-more", AnonymousClass001.A0L(), 0, i), "learn-more");
        C36421kH.A13(indiaUpiPinPrimerFullSheetActivity2.findViewById(R.id.continue_button), indiaUpiPinPrimerFullSheetActivity2, 3);
    }

    public static Intent A0z(Context context, C175748az r2, String str, boolean z) {
        String str2;
        Intent A0I = C165577te.A0I(context, r2, IndiaUpiPinPrimerFullSheetActivity.class);
        A0I.putExtra("extra_payment_method_type", str);
        if (z) {
            str2 = "forgot_pin";
        } else {
            str2 = "setup_pin";
        }
        A0I.putExtra("event_screen", str2);
        return A0I;
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A02 = C165607th.A0e(r2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls;
        if (i != 1012) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent != null && intent.hasExtra("extra_bank_account")) {
                C175748az r0 = (C175748az) intent.getParcelableExtra("extra_bank_account");
                this.A01 = r0;
                this.A0A = r0;
            }
            switch (this.A02) {
                case 0:
                    Intent A0D = C36431kI.A0D();
                    A0D.putExtra("extra_bank_account", this.A01);
                    setResult(-1, A0D);
                    finish();
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    if (this.A0l) {
                        A3v();
                        cls = IndiaUpiPaymentsAccountSetupActivity.class;
                    } else {
                        cls = IndiaUpiBankAccountAddedLandingActivity.class;
                    }
                    Intent A0H = C36441kJ.A0H(this, cls);
                    C165597tg.A0z(A0H, this.A03);
                    A42(A0H);
                    C165587tf.A0u(A0H, this, "extra_previous_screen", "enter_debit_card");
                    return;
                default:
                    return;
            }
        }
    }

    public IndiaUpiPinPrimerFullSheetActivity(int i) {
        this.A05 = false;
        B7Z.A00(this, 33);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A08((C131606Ps) null, C36361kB.A0i(), C36371kC.A0n(), this.A0b, this.A03, this.A0e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.Window r1 = r7.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.addFlags(r0)
            super.onCreate(r8)
            r0 = 2131625248(0x7f0e0520, float:1.8877699E38)
            android.content.Intent r1 = X.C36431kI.A0F(r7, r0)
            java.lang.String r0 = "event_screen"
            java.lang.String r2 = r1.getStringExtra(r0)
            android.os.Parcelable r0 = X.C173858Tk.A07(r7)
            X.8az r0 = (X.C175748az) r0
            r7.A01 = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_payment_method_type"
            java.lang.String r0 = r1.getStringExtra(r0)
            r7.A04 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0035
            r7.A03 = r2
        L_0x0035:
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.widget.TextView r4 = X.C36391kE.A0Q(r7, r0)
            r0 = 2131429494(0x7f0b0876, float:1.8480662E38)
            android.widget.TextView r3 = X.C36391kE.A0Q(r7, r0)
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "CREDIT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008f
            r0 = 2131895308(0x7f12240c, float:1.9425445E38)
            r4.setText(r0)
            r1 = 2131895307(0x7f12240b, float:1.9425443E38)
        L_0x0056:
            r3.setText(r1)
        L_0x0059:
            X.07B r1 = X.C173858Tk.A0F(r7)
            if (r1 == 0) goto L_0x0065
            r0 = 2131896908(0x7f122a4c, float:1.942869E38)
            X.C165577te.A10(r1, r0)
        L_0x0065:
            X.8az r0 = r7.A01
            if (r0 == 0) goto L_0x0082
            X.8bF r0 = r0.A08
            if (r0 == 0) goto L_0x0082
            A10(r7)
        L_0x0070:
            X.AF7 r0 = r7.A0S
            java.lang.Integer r2 = X.C36381kD.A0m()
            r1 = 0
            java.lang.String r4 = r7.A0b
            java.lang.String r5 = r7.A03
            java.lang.String r6 = r7.A0e
            r3 = r1
            r0.A08(r1, r2, r3, r4, r5, r6)
            return
        L_0x0082:
            java.lang.String r0 = "Screen called without account, fetching account from local db to setup pin"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0wU r1 = r7.A04
            r0 = 16
            X.AVY.A00(r1, r7, r0)
            goto L_0x0070
        L_0x008f:
            X.9k4 r1 = r7.A0N
            X.8az r0 = r7.A01
            boolean r2 = r1.A05(r0)
            java.lang.String r1 = "forgot_pin"
            java.lang.String r0 = r7.A03
            boolean r0 = r0.equals(r1)
            if (r2 == 0) goto L_0x00b0
            r1 = 2131895277(0x7f1223ed, float:1.9425382E38)
            if (r0 == 0) goto L_0x0056
            r0 = 2131892404(0x7f1218b4, float:1.9419555E38)
            r4.setText(r0)
            r1 = 2131895276(0x7f1223ec, float:1.942538E38)
            goto L_0x0056
        L_0x00b0:
            if (r0 == 0) goto L_0x0059
            r0 = 2131892404(0x7f1218b4, float:1.9419555E38)
            r4.setText(r0)
            r1 = 2131892403(0x7f1218b3, float:1.9419553E38)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A43(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            A41(R.string.f12nameremoved, this.A03, "payments:setup-pin");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A08((C131606Ps) null, 1, C36371kC.A0n(), this.A0b, this.A03, this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiPinPrimerFullSheetActivity() {
        this(0);
        this.A03 = "setup_pin";
        this.A00 = 0;
    }
}
