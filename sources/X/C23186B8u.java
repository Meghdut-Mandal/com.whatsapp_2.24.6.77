package X;

import android.content.DialogInterface;

/* renamed from: X.B8u  reason: case insensitive filesystem */
public class C23186B8u implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public C23186B8u(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r2.BOn(r3, r4, r5, r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        r1.overridePendingTransition(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.finish();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss(android.content.DialogInterface r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 1: goto L_0x0022;
                case 2: goto L_0x000d;
                case 3: goto L_0x0022;
                case 4: goto L_0x0022;
                case 5: goto L_0x002a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0035;
                case 8: goto L_0x003f;
                case 9: goto L_0x0049;
                case 10: goto L_0x005f;
                case 11: goto L_0x0005;
                case 12: goto L_0x007b;
                case 13: goto L_0x0005;
                case 14: goto L_0x0097;
                case 15: goto L_0x0005;
                case 16: goto L_0x00a3;
                case 17: goto L_0x0005;
                case 18: goto L_0x00b7;
                case 19: goto L_0x00bc;
                case 20: goto L_0x00b7;
                case 21: goto L_0x001b;
                case 22: goto L_0x00c8;
                case 23: goto L_0x0022;
                case 24: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0009:
            r0.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r8.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x000c
            r1.A1c()
            return
        L_0x001b:
            java.lang.Object r0 = r8.A00
            X.AGg r0 = (X.C21302AGg) r0
            X.155 r0 = r0.A01
            goto L_0x0009
        L_0x0022:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x002a:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r0
            com.whatsapp.CodeInputField r1 = r0.A04
            r0 = 0
            r1.setText(r0)
            return
        L_0x0035:
            java.lang.Object r1 = r8.A00
            X.8jA r1 = (X.C179098jA) r1
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r1.A09
            r1.A4N(r0)
            return
        L_0x003f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            X.7yZ r0 = r0.A03
            X.C167687yZ.A02(r0)
            return
        L_0x0049:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            r0.finish()
            X.AF7 r2 = r0.A0S
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r4 = X.C36371kC.A0n()
            java.lang.String r6 = r0.A04
            java.lang.String r5 = "approve_mandate_prompt"
            goto L_0x0076
        L_0x005f:
            java.lang.Object r1 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.7yZ r0 = r1.A03
            X.C167687yZ.A02(r0)
            X.AF7 r2 = r1.A0S
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r4 = X.C36371kC.A0n()
            java.lang.String r6 = r1.A04
            java.lang.String r5 = "decline_mandate_dialogue"
        L_0x0076:
            r7 = 1
            r2.BOn(r3, r4, r5, r6, r7)
            return
        L_0x007b:
            java.lang.Object r1 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.7yZ r0 = r1.A03
            X.C167687yZ.A02(r0)
            X.AF7 r0 = r1.A0S
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0n()
            java.lang.String r3 = "approve_mandate_update_request_prompt"
            java.lang.String r4 = "payment_transaction_details"
            r5 = 1
            r0.BOn(r1, r2, r3, r4, r5)
            return
        L_0x0097:
            java.lang.Object r1 = r8.A00
            X.8jG r1 = (X.C179148jG) r1
            r0 = 7
            r1.A01 = r0
            r0 = 0
            r1.A3s(r0)
            return
        L_0x00a3:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.7yl r2 = r0.A06
            boolean r0 = r2.A02
            r1 = 0
            if (r0 != 0) goto L_0x00b4
            X.1Rs r0 = r2.A00
            X.C193699Mm.A00(r0, r1)
            return
        L_0x00b4:
            r2.A02 = r1
            return
        L_0x00b7:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x00c3
        L_0x00bc:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
        L_0x00c3:
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x00c8:
            java.lang.Object r0 = r8.A00
            X.B8c r0 = (X.C23168B8c) r0
            java.lang.Object r0 = r0.A00
            X.C36431kI.A1N(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23186B8u.onDismiss(android.content.DialogInterface):void");
    }
}
