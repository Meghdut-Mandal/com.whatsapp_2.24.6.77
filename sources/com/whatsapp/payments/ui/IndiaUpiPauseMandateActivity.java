package com.whatsapp.payments.ui;

import X.AnonymousClass16S;
import X.B7Z;
import X.BA9;
import X.C03570Gk;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C173858Tk;
import X.C179098jA;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C202059ky;
import X.C202319lY;
import X.C202939my;
import X.C203889p7;
import X.C206289t2;
import X.C207359uy;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C93154fy;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class IndiaUpiPauseMandateActivity extends C179098jA {
    public DatePicker A00;
    public DatePicker A01;
    public TextInputLayout A02;
    public TextInputLayout A03;
    public C202939my A04;
    public IndiaUpiPauseMandateViewModel A05;
    public String A06;
    public Button A07;
    public boolean A08;

    private DatePicker A10(EditText editText, long j) {
        DateFormat dateInstance = DateFormat.getDateInstance(2, C36401kF.A0x(this.A00));
        C165597tg.A13(editText, dateInstance, j);
        Calendar instance = Calendar.getInstance();
        C93154fy r3 = new C93154fy(new C203889p7(editText, this, dateInstance, 0), this, (Calendar) null, R.style.f13nameremoved, instance.get(1), instance.get(2), instance.get(5));
        C207359uy.A00(editText, r3, 30);
        return r3.A01;
    }

    public void BgO(C202059ky r1) {
    }

    public boolean Btt() {
        return true;
    }

    public void onBackPressed() {
        setResult(0);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (android.text.TextUtils.isEmpty(r11.A02.getError()) == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A11(com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r11) {
        /*
            android.widget.DatePicker r0 = r11.A01
            long r2 = A0z(r0)
            com.google.android.material.textfield.TextInputLayout r5 = r11.A03
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r4 = r11.A05
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.AnonymousClass6XI.A00(r2, r0)
            if (r0 >= 0) goto L_0x00a9
            X.0wG r1 = r4.A05
            r0 = 2131895470(0x7f1224ae, float:1.9425774E38)
            java.lang.String r0 = r1.A01(r0)
        L_0x001d:
            r5.setError(r0)
            android.widget.DatePicker r0 = r11.A00
            long r0 = A0z(r0)
            com.google.android.material.textfield.TextInputLayout r9 = r11.A02
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r10 = r11.A05
            X.0ts r4 = r10.A06
            java.util.Locale r5 = X.C36401kF.A0x(r4)
            r4 = 2
            java.text.DateFormat r8 = java.text.DateFormat.getDateInstance(r4, r5)
            int r2 = X.AnonymousClass6XI.A00(r0, r2)
            if (r2 > 0) goto L_0x0069
            X.0wG r0 = r10.A05
            android.content.Context r1 = r0.A00
            r0 = 2131895468(0x7f1224ac, float:1.942577E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0046:
            r9.setError(r0)
            android.widget.Button r2 = r11.A07
            com.google.android.material.textfield.TextInputLayout r0 = r11.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0064
            com.google.android.material.textfield.TextInputLayout r0 = r11.A02
            java.lang.CharSequence r0 = r0.getError()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r2.setEnabled(r0)
            return
        L_0x0069:
            X.9lY r2 = r10.A01
            X.8bI r2 = X.C202319lY.A00(r2)
            X.9jw r2 = r2.A0G
            X.C18740tg.A06(r2)
            long r4 = r2.A01
            java.lang.String r2 = "Asia/Kolkata"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r4 = r4 - r2
            int r0 = X.AnonymousClass6XI.A00(r0, r4)
            if (r0 <= 0) goto L_0x00a7
            X.0wG r0 = r10.A05
            android.content.Context r7 = r0.A00
            r6 = 2131895467(0x7f1224ab, float:1.9425768E38)
            java.lang.Object[] r3 = X.AnonymousClass001.A0L()
            r2 = 0
            X.0wo r0 = r10.A04
            long r0 = r0.A08(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r8.format(r0)
            java.lang.String r0 = X.C36391kE.A0v(r7, r0, r3, r2, r6)
            goto L_0x0046
        L_0x00a7:
            r0 = 0
            goto L_0x0046
        L_0x00a9:
            r0 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity.A11(com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity):void");
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
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
            this.A04 = (AnonymousClass16S) r2.A6x.get();
            C173858Tk.A0l(r2, r1, C36361kB.A0V(r2), this);
            this.A04 = r1.A7n();
        }
    }

    public IndiaUpiPauseMandateActivity(int i) {
        this.A08 = false;
        B7Z.A00(this, 21);
    }

    public static long A0z(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        A3y(R.drawable.onboarding_actionbar_home_close, R.id.scroll_view);
        C36321k7.A0P(this);
        TextInputLayout textInputLayout = (TextInputLayout) C03570Gk.A0B(this, R.id.start_date);
        this.A03 = textInputLayout;
        long currentTimeMillis = System.currentTimeMillis();
        EditText editText = textInputLayout.A0B;
        C18740tg.A04(editText);
        this.A01 = A10(editText, currentTimeMillis);
        TextInputLayout textInputLayout2 = (TextInputLayout) C03570Gk.A0B(this, R.id.end_date);
        this.A02 = textInputLayout2;
        EditText editText2 = textInputLayout2.A0B;
        C18740tg.A04(editText2);
        this.A00 = A10(editText2, currentTimeMillis);
        Button button = (Button) C03570Gk.A0B(this, R.id.continue_button);
        this.A07 = button;
        C207359uy.A00(button, this, 31);
        this.A06 = C173858Tk.A0J(this);
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = (IndiaUpiPauseMandateViewModel) C36441kJ.A0b(this).A00(IndiaUpiPauseMandateViewModel.class);
        this.A05 = indiaUpiPauseMandateViewModel;
        indiaUpiPauseMandateViewModel.A02.A08(this, new BA9(this, 30));
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel2 = this.A05;
        C202319lY r2 = ((C206289t2) getIntent().getParcelableExtra("extra_transaction_detail_data")).A00;
        indiaUpiPauseMandateViewModel2.A01 = r2;
        C36391kE.A1S(indiaUpiPauseMandateViewModel2.A0A, indiaUpiPauseMandateViewModel2, r2, 14);
    }

    public IndiaUpiPauseMandateActivity() {
        this(0);
    }
}
