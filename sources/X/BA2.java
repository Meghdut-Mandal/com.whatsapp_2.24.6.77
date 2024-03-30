package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;

public class BA2 implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public BA2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        if (this.A01 == 0) {
            C167767ym r3 = ((PostcodeChangeBottomSheet) this.A00).A08;
            r3.A02 = C167767ym.A02(editable.toString());
            if (AnonymousClass00C.A0J(r3.A03, "cep") && (str = r3.A02) != null && str.length() > 5) {
                StringBuilder A0i = C90524aI.A0i(str);
                A0i.insert(5, '-');
                r3.A02 = A0i.toString();
            }
            C167767ym.A03(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1.matches("^[a-zA-Z0-9\\s]*$") == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.A01
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = r7.toString()
            java.lang.Object r5 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            java.lang.String r0 = r5.A0B
            boolean r0 = r0.equals(r1)
            r4 = 1
            r3 = r0 ^ 1
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = "^[a-zA-Z0-9\\s]*$"
            boolean r0 = r1.matches(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            com.whatsapp.WaTextView r1 = r5.A02
            r0 = 0
            if (r2 == 0) goto L_0x0027
            r0 = 4
        L_0x0027:
            r1.setVisibility(r0)
            if (r2 != 0) goto L_0x0034
            com.whatsapp.WaTextView r1 = r5.A02
            r0 = 2131892177(0x7f1217d1, float:1.9419095E38)
            r1.setText(r0)
        L_0x0034:
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0A
            if (r3 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
        L_0x003a:
            r0.setEnabled(r4)
        L_0x003d:
            return
        L_0x003e:
            r4 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BA2.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
