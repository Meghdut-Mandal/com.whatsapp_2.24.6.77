package X;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import java.util.Locale;
import java.util.Objects;

/* renamed from: X.2Fm  reason: invalid class name */
public class AnonymousClass2Fm extends C65043Qm {
    public TextWatcher A00;
    public String A01;
    public final TextView A02;
    public final TextInputLayout A03;
    public final WaEditText A04;
    public final C70283eu A05;
    public final C62533Gn A06;
    public final C61733Df A07;
    public final EditText A08;
    public final String A09;

    public void A08(int i, Intent intent) {
        InputMethodManager inputMethodManager;
        if (i == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("iso");
            String stringExtra2 = intent.getStringExtra("cc");
            if (!(stringExtra == null || stringExtra2 == null)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(stringExtra.toUpperCase(Locale.US));
                this.A08.setText(AnonymousClass000.A0p(" +", stringExtra2, A0u));
                A05(stringExtra);
            }
            C70283eu r4 = this.A05;
            r4.A00();
            this.A06.A00();
            Editable text = this.A04.getText();
            Objects.requireNonNull(text);
            if (!A09(text.toString()) && AnonymousClass3U2.A00(this.A07, A01(), C65043Qm.A00(this)) == 1) {
                String A022 = A02();
                r4.A02 = A022;
                r4.A07.A00();
                C49472jB r1 = new C49472jB(r4.A04, r4.A06, r4, A022);
                r4.A00 = r1;
                C36331k8.A1F(r1, r4.A0A);
            }
        }
        WaEditText waEditText = this.A04;
        waEditText.requestFocus();
        if (waEditText.getText() != null) {
            waEditText.setSelection(C36381kD.A06(waEditText));
        }
        Object systemService = this.A06.getSystemService("input_method");
        if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null && !inputMethodManager.isAcceptingText()) {
            inputMethodManager.toggleSoftInput(1, 1);
        }
    }

    public boolean A09(CharSequence charSequence) {
        String A032;
        if (charSequence == null || (A032 = AnonymousClass3U2.A03(this.A09)) == null) {
            return false;
        }
        return A032.equals(AnonymousClass3U2.A03(AnonymousClass000.A0l(charSequence, A01(), AnonymousClass000.A0u())));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Fm(android.app.Activity r17, android.view.View r18, X.AnonymousClass1N4 r19, X.AnonymousClass17Y r20, X.C87524Pd r21, X.C70283eu r22, X.C62533Gn r23, X.C61733Df r24, X.C21060yb r25, X.C18820ts r26, X.AnonymousClass1M4 r27, X.C19770wU r28, java.lang.String r29) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r29
            r6.A09 = r0
            r0 = r22
            r6.A05 = r0
            r0 = r24
            r6.A07 = r0
            r0 = r23
            r6.A06 = r0
            r0 = 2131432667(0x7f0b14db, float:1.8487098E38)
            android.view.View r5 = X.C012005e.A02(r8, r0)
            com.whatsapp.WaEditText r5 = (com.whatsapp.WaEditText) r5
            r6.A04 = r5
            r0 = 2131432668(0x7f0b14dc, float:1.84871E38)
            android.widget.TextView r4 = X.C36391kE.A0O(r8, r0)
            r6.A02 = r4
            r0 = 2131432671(0x7f0b14df, float:1.8487106E38)
            android.view.View r3 = X.C012005e.A02(r8, r0)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            r6.A03 = r3
            r0 = 2131429288(0x7f0b07a8, float:1.8480244E38)
            android.view.View r2 = X.C012005e.A02(r8, r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r6.A08 = r2
            r0 = 2131428683(0x7f0b054b, float:1.8479017E38)
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r8, r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.C36321k7.A12(r3, r2, r1)
            r6.A05 = r5
            r6.A03 = r4
            r6.A01 = r2
            r6.A04 = r3
            r6.A02 = r1
            android.app.Activity r0 = r6.A06
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131892998(0x7f121b06, float:1.942076E38)
            java.lang.String r0 = r0.getString(r1)
            r3.setHint((java.lang.CharSequence) r0)
            java.lang.String r0 = X.C36401kF.A0o(r7, r1)
            r3.setHint((java.lang.CharSequence) r0)
            r0 = 2131429289(0x7f0b07a9, float:1.8480247E38)
            android.view.View r2 = X.C012005e.A02(r8, r0)
            com.google.android.material.textfield.TextInputLayout r2 = (com.google.android.material.textfield.TextInputLayout) r2
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131888509(0x7f12097d, float:1.9411655E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint((java.lang.CharSequence) r0)
            r6.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Fm.<init>(android.app.Activity, android.view.View, X.1N4, X.17Y, X.4Pd, X.3eu, X.3Gn, X.3Df, X.0yb, X.0ts, X.1M4, X.0wU, java.lang.String):void");
    }
}
