package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;

/* renamed from: X.9uq  reason: invalid class name and case insensitive filesystem */
public final class C207279uq implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiAadhaarCardVerificationActivity A02;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2 != 2) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity r2 = r4.A02
            com.whatsapp.wds.components.button.WDSButton r3 = r2.A04
            if (r3 != 0) goto L_0x0011
            java.lang.String r0 = "confirmButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0011:
            android.widget.EditText r0 = r2.A00
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "aadhaarNumber1"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x001c:
            android.text.Editable r0 = r0.getText()
            int r1 = r0.length()
            r0 = 4
            if (r1 != r0) goto L_0x003e
            android.widget.EditText r0 = r2.A01
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "aadhaarNumber2"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0032:
            android.text.Editable r0 = r0.getText()
            int r2 = r0.length()
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r3.setEnabled(r0)
            int r1 = r5.length()
            int r0 = r4.A00
            if (r1 < r0) goto L_0x004f
            android.widget.EditText r0 = r4.A01
            r0.requestFocus()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207279uq.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public C207279uq(EditText editText, IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity, int i) {
        this.A02 = indiaUpiAadhaarCardVerificationActivity;
        this.A00 = i;
        this.A01 = editText;
    }
}
