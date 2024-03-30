package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass07B;
import X.B7Z;
import X.C131606Ps;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C173858Tk;
import X.C175748az;
import X.C176658cT;
import X.C179008it;
import X.C18800tq;
import X.C18830tt;
import X.C207289ur;
import X.C207359uy;
import X.C23141B7b;
import X.C24611Dc;
import X.C27111My;
import X.C33511fU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C67203Yx;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Calendar;

public class IndiaUpiDebitCardVerificationActivity extends C179008it {
    public int A00;
    public int A01;
    public TextView A02;
    public WaEditText A03;
    public WaEditText A04;
    public C175748az A05;
    public WDSButton A06;
    public String A07;
    public String A08;
    public String A09;
    public WaEditText A0A;
    public WaEditText A0B;
    public Integer A0C;
    public boolean A0D;
    public final C24611Dc A0E;

    public static void A10(IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        indiaUpiDebitCardVerificationActivity.A02.startAnimation(alphaAnimation);
        indiaUpiDebitCardVerificationActivity.A02.setVisibility(0);
    }

    public static int A0z(IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity) {
        if (TextUtils.isEmpty(C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A0A)) || C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A0A).length() != 2 || TextUtils.isEmpty(C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A0B)) || C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A0B).length() != 4) {
            return 1;
        }
        return 0;
    }

    public static void A11(IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity) {
        if (A12(indiaUpiDebitCardVerificationActivity, indiaUpiDebitCardVerificationActivity.A00, indiaUpiDebitCardVerificationActivity.A01, true)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A0A));
            indiaUpiDebitCardVerificationActivity.A09 = AnonymousClass000.A0q(C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A0B), A0u);
            indiaUpiDebitCardVerificationActivity.A07 = C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A03);
            indiaUpiDebitCardVerificationActivity.A08 = C36331k8.A0f(indiaUpiDebitCardVerificationActivity.A04);
            indiaUpiDebitCardVerificationActivity.A4L(indiaUpiDebitCardVerificationActivity.A05);
        }
        C176658cT A042 = indiaUpiDebitCardVerificationActivity.A0S.A04(1, C36371kC.A0p(), "enter_debit_card", indiaUpiDebitCardVerificationActivity.A0e);
        A042.A0Y = indiaUpiDebitCardVerificationActivity.A0b;
        A042.A0E = indiaUpiDebitCardVerificationActivity.A0C;
        indiaUpiDebitCardVerificationActivity.A0C.Bly(A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
        if (r7 > 12) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        if (r5 >= r10) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A12(com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r8, int r9, int r10, boolean r11) {
        /*
            com.whatsapp.WaEditText r2 = r8.A03
            com.whatsapp.WaEditText r1 = r8.A04
            r6 = -1
            java.lang.String r0 = X.C36331k8.A0f(r1)     // Catch:{ NumberFormatException -> 0x002e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002e }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = X.C36331k8.A0f(r1)     // Catch:{ NumberFormatException -> 0x002e }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002e }
            goto L_0x0019
        L_0x0018:
            r5 = -1
        L_0x0019:
            java.lang.String r0 = X.C36331k8.A0f(r2)     // Catch:{ NumberFormatException -> 0x002c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002c }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = X.C36331k8.A0f(r2)     // Catch:{ NumberFormatException -> 0x002c }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002c }
            goto L_0x0038
        L_0x002c:
            r2 = move-exception
            goto L_0x0030
        L_0x002e:
            r2 = move-exception
            r5 = -1
        L_0x0030:
            X.1Dc r1 = r8.A0E
            java.lang.String r0 = "IndiaUpiDebitCardVerifActivity checkMonthYear threw: "
            r1.A0A(r0, r2)
        L_0x0037:
            r7 = -1
        L_0x0038:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r4 = 1
            int r0 = r0.get(r4)
            int r0 = r0 + 50
            int r3 = r0 % 100
            r1 = 12
            r2 = 0
            if (r5 == r6) goto L_0x0114
            if (r7 == r6) goto L_0x0114
            r0 = 3
            if (r5 < r10) goto L_0x0133
            if (r5 != r10) goto L_0x0109
            if (r7 < r9) goto L_0x0056
            if (r7 > r1) goto L_0x0056
            r0 = 0
        L_0x0056:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x005e:
            android.util.Pair r3 = X.C36441kJ.A0Q(r1, r0)
        L_0x0062:
            int r0 = A0z(r8)
            r2 = 3
            r4 = 0
            if (r0 == 0) goto L_0x007c
            android.widget.TextView r1 = r8.A02
            r0 = 2131888637(0x7f1209fd, float:1.9411915E38)
            r1.setText(r0)
            A10(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0079:
            r8.A0C = r0
            return r4
        L_0x007c:
            int r1 = X.C36381kD.A04(r3)
            if (r1 == r2) goto L_0x00fc
            int r3 = X.C36381kD.A03(r3)
            if (r3 == r2) goto L_0x00fc
            r0 = 2
            if (r1 != r0) goto L_0x009e
            if (r3 != r0) goto L_0x009e
            android.widget.TextView r1 = r8.A02
            r0 = 2131888632(0x7f1209f8, float:1.9411905E38)
            r1.setText(r0)
            A10(r8)
            r0 = 5
        L_0x0099:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0079
        L_0x009e:
            r2 = 0
            if (r1 == 0) goto L_0x00d8
            android.widget.TextView r1 = r8.A02
            if (r3 == 0) goto L_0x00c1
            r0 = 2131888634(0x7f1209fa, float:1.9411909E38)
            r1.setText(r0)
            A10(r8)
            if (r11 == 0) goto L_0x00bf
            com.whatsapp.WaEditText r0 = r8.A03
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A04
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A03
            r0.requestFocus()
        L_0x00bf:
            r0 = 6
            goto L_0x0099
        L_0x00c1:
            r0 = 2131888635(0x7f1209fb, float:1.941191E38)
            r1.setText(r0)
            A10(r8)
            if (r11 == 0) goto L_0x00d6
            com.whatsapp.WaEditText r0 = r8.A03
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A03
            r0.requestFocus()
        L_0x00d6:
            r0 = 7
            goto L_0x0099
        L_0x00d8:
            if (r3 != 0) goto L_0x00e2
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.A0C = r0
            return r1
        L_0x00e2:
            android.widget.TextView r1 = r8.A02
            r0 = 2131888636(0x7f1209fc, float:1.9411913E38)
            r1.setText(r0)
            A10(r8)
            if (r11 == 0) goto L_0x00f9
            com.whatsapp.WaEditText r0 = r8.A04
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A04
            r0.requestFocus()
        L_0x00f9:
            r0 = 8
            goto L_0x0099
        L_0x00fc:
            android.widget.TextView r1 = r8.A02
            r0 = 2131888633(0x7f1209f9, float:1.9411907E38)
            r1.setText(r0)
            A10(r8)
            r0 = 4
            goto L_0x0099
        L_0x0109:
            if (r7 < r4) goto L_0x010e
            r0 = 0
            if (r7 <= r1) goto L_0x010f
        L_0x010e:
            r0 = 1
        L_0x010f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x011d
        L_0x0114:
            r0 = 2
            if (r5 == r6) goto L_0x0126
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r5 < r10) goto L_0x0120
        L_0x011d:
            if (r5 > r3) goto L_0x0120
            r4 = 0
        L_0x0120:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x005e
        L_0x0126:
            if (r7 != r6) goto L_0x0133
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r0)
            goto L_0x0062
        L_0x0133:
            if (r7 < r4) goto L_0x0138
            if (r7 > r1) goto L_0x0138
            r4 = 0
        L_0x0138:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.A12(com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity, int, int, boolean):boolean");
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            C173858Tk.A0k(A0L, r2, r1, this);
        }
    }

    public IndiaUpiDebitCardVerificationActivity(int i) {
        this.A0D = false;
        B7Z.A00(this, 11);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A08((C131606Ps) null, C36361kB.A0i(), C36371kC.A0n(), this.A0b, "enter_debit_card", this.A0e);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C165567td.A0j(this);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B A0F = C173858Tk.A0F(this);
        if (A0F != null) {
            A0F.A0I(R.string.f12nameremoved);
            A0F.A0U(true);
        }
        C175748az r0 = (C175748az) C173858Tk.A07(this);
        if (r0 == null) {
            this.A0E.A05("Bank account info is null, finishing");
            finish();
            return;
        }
        this.A05 = r0;
        TextView A0Q = C36391kE.A0Q(this, R.id.add_card_number_label);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.verify_debit_card_title);
        TextView A0Q3 = C36391kE.A0Q(this, R.id.card_type_label);
        TextView A0Q4 = C36391kE.A0Q(this, R.id.add_card_security_text);
        String A042 = this.A0N.A04(this.A05);
        if ("CREDIT".equals(this.A0a)) {
            A0Q2.setText(R.string.f12nameremoved);
            C36341k9.A0s(this, A0Q, new Object[]{A042}, R.string.f12nameremoved);
            A0Q3.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else {
            A0Q2.setText(R.string.f12nameremoved);
            C36341k9.A0s(this, A0Q, new Object[]{A042}, R.string.f12nameremoved);
            A0Q3.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        }
        A0Q4.setText(i);
        ImageView A0Q5 = C36411kG.A0Q(this, R.id.issuer_bank_logo);
        Bitmap A0A2 = this.A05.A0A();
        if (A0A2 != null) {
            A0Q5.setImageBitmap(A0A2);
        } else {
            A0Q5.setImageResource(R.drawable.bank_logo_placeholder);
        }
        WDSButton wDSButton = (WDSButton) findViewById(R.id.confirm_button);
        this.A06 = wDSButton;
        wDSButton.setEnabled(false);
        C207359uy.A00(this.A06, this, 13);
        this.A0A = (WaEditText) findViewById(R.id.add_card_number1);
        this.A0B = (WaEditText) findViewById(R.id.add_card_number2);
        this.A03 = (WaEditText) findViewById(R.id.add_card_month);
        this.A04 = (WaEditText) findViewById(R.id.add_card_year);
        C33511fU.A03(this.A0A);
        C33511fU.A03(this.A0B);
        C33511fU.A03(this.A03);
        C33511fU.A03(this.A04);
        this.A02 = C36391kE.A0Q(this, R.id.payments_send_payment_error_text);
        Calendar instance = Calendar.getInstance();
        this.A00 = instance.get(2) + 1;
        this.A01 = instance.get(1) % 100;
        this.A0A.addTextChangedListener(new C207289ur(this.A0B, this, 2));
        this.A0A.setOnKeyListener(new C67203Yx((EditText) null, this.A0B));
        this.A0B.addTextChangedListener(new C207289ur(this.A03, this, 4));
        this.A0B.setOnKeyListener(new C67203Yx(this.A0A, this.A03));
        this.A03.addTextChangedListener(new C207289ur(this.A04, this, 2));
        this.A03.setOnKeyListener(new C67203Yx(this.A0B, this.A04));
        this.A04.addTextChangedListener(new C207289ur((EditText) null, this, 2));
        this.A04.setOnKeyListener(new C67203Yx(this.A03, (EditText) null));
        this.A04.setOnEditorActionListener(new C23141B7b(this, 0));
        this.A0A.requestFocus();
        this.A0S.A08((C131606Ps) null, 0, (Integer) null, this.A0b, "enter_debit_card", this.A0e);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A43(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            A41(R.string.f12nameremoved, "enter_debit_card", "payments:enter-card");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A08((C131606Ps) null, 1, C36371kC.A0n(), this.A0b, "enter_debit_card", this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        this.A0C.A01(findViewById(R.id.add_card_year));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("debitLast6SavedInst")) {
            this.A09 = bundle.getString("debitLast6SavedInst");
        }
        if (bundle.containsKey("debitExpiryMonthSavedInst")) {
            this.A07 = bundle.getString("debitExpiryMonthSavedInst");
        }
        if (bundle.containsKey("debitExpiryYearSavedInst")) {
            this.A08 = bundle.getString("debitExpiryYearSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A09;
        if (str != null) {
            bundle.putString("debitLast6SavedInst", str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            bundle.putString("debitExpiryMonthSavedInst", str2);
        }
        String str3 = this.A08;
        if (str3 != null) {
            bundle.putString("debitExpiryYearSavedInst", str3);
        }
    }

    public IndiaUpiDebitCardVerificationActivity() {
        this(0);
        this.A0E = C165607th.A0b("IndiaUpiDebitCardVerificationActivity");
    }
}
