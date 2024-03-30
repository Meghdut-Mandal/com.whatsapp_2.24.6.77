package X;

import android.widget.CompoundButton;

/* renamed from: X.B7z  reason: case insensitive filesystem */
public class C23165B7z implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23165B7z(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCheckedChanged(android.widget.CompoundButton r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            if (r0 == 0) goto L_0x0067
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.widget.MultiExclusionChipGroup r5 = (com.whatsapp.payments.ui.widget.MultiExclusionChipGroup) r5
            java.lang.Object r4 = r8.A01
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            java.util.Map r2 = r5.A02
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L_0x008d
            boolean r1 = r4.isChecked()
            r0 = 2131167868(0x7f070a7c, float:1.7950022E38)
            if (r1 == 0) goto L_0x0020
            r0 = 2131167865(0x7f070a79, float:1.7950016E38)
        L_0x0020:
            r4.setChipStrokeWidthResource(r0)
            boolean r1 = r4.isChecked()
            r0 = 2131167869(0x7f070a7d, float:1.7950024E38)
            if (r1 == 0) goto L_0x002f
            r0 = 2131167866(0x7f070a7a, float:1.7950018E38)
        L_0x002f:
            r4.setTextStartPaddingResource(r0)
            java.util.List r3 = X.C90524aI.A0o(r4, r2)
            if (r3 == 0) goto L_0x008d
            r2 = 0
        L_0x0039:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x008d
            java.lang.Object r1 = r3.get(r2)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            if (r1 == r4) goto L_0x0064
            boolean r0 = r4.isChecked()
            r0 = r0 ^ 1
            r1.setClickable(r0)
            boolean r0 = r4.isChecked()
            r0 = r0 ^ 1
            r1.setCheckable(r0)
            boolean r0 = r4.isChecked()
            int r0 = X.C36381kD.A00(r0)
            r1.setVisibility(r0)
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0067:
            java.lang.Object r2 = r8.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            if (r2 == 0) goto L_0x0085
            java.lang.Object r1 = r8.A00
            X.AGR r1 = (X.AGR) r1
            X.8hw r0 = r1.A06
            X.9tz r0 = r0.A0U
            if (r0 == 0) goto L_0x0085
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r1.A05
            boolean r1 = r2.isChecked()
        L_0x007d:
            com.whatsapp.wds.components.button.WDSButton r0 = r0.A0N
            if (r0 == 0) goto L_0x00d2
            r0.setEnabled(r1)
            return
        L_0x0085:
            java.lang.Object r0 = r8.A00
            X.AGR r0 = (X.AGR) r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r0.A05
            r1 = 1
            goto L_0x007d
        L_0x008d:
            java.util.Set r7 = r5.A03
            if (r10 == 0) goto L_0x00d3
            r7.add(r4)
        L_0x0094:
            X.Awg r0 = r5.A00
            if (r0 == 0) goto L_0x00d2
            X.AH1 r0 = (X.AH1) r0
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r6 = r0.A00
            com.whatsapp.payments.ui.widget.MultiExclusionChip r5 = r0.A01
            com.whatsapp.payments.ui.widget.MultiExclusionChip r4 = r0.A02
            com.whatsapp.payments.ui.widget.MultiExclusionChip r3 = r0.A03
            com.whatsapp.payments.ui.widget.MultiExclusionChip r2 = r0.A04
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x00bd
            X.9Nh r1 = r6.A0X
            boolean r0 = r7.contains(r5)
            r1.A06 = r0
            boolean r0 = r7.contains(r4)
            if (r0 == 0) goto L_0x00bd
            X.978 r0 = new X.978
            r0.<init>()
            r1.A00 = r0
        L_0x00bd:
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x00cf
            X.9Nh r1 = r6.A0X
            boolean r0 = r7.contains(r3)
            r1.A02 = r0
            boolean r0 = r7.contains(r2)
            r1.A03 = r0
        L_0x00cf:
            r6.A3i()
        L_0x00d2:
            return
        L_0x00d3:
            r7.remove(r4)
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23165B7z.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
