package X;

import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.8qt  reason: invalid class name and case insensitive filesystem */
public class C183498qt extends C132446Tt {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;
    public final /* synthetic */ String A01;

    public C183498qt(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str) {
        this.A00 = indiaUpiDeviceBindStepActivity;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        if (indiaUpiDeviceBindStepActivity.A0B.A07.contains("upi-get-challenge") || indiaUpiDeviceBindStepActivity.A0M.A09().A00 != null) {
            return null;
        }
        indiaUpiDeviceBindStepActivity.A0B.A01("upi-get-challenge");
        C19630wG r15 = indiaUpiDeviceBindStepActivity.A05;
        AnonymousClass17Y r14 = indiaUpiDeviceBindStepActivity.A05;
        C19700wN r13 = indiaUpiDeviceBindStepActivity.A03;
        C19730wQ r12 = indiaUpiDeviceBindStepActivity.A02;
        C19770wU r11 = indiaUpiDeviceBindStepActivity.A04;
        AnonymousClass9YX r10 = indiaUpiDeviceBindStepActivity.A0B;
        AnonymousClass19A r9 = indiaUpiDeviceBindStepActivity.A0H;
        C29131Vl r8 = indiaUpiDeviceBindStepActivity.A0O;
        C24601Db r7 = indiaUpiDeviceBindStepActivity.A0P;
        C29121Vk r6 = indiaUpiDeviceBindStepActivity.A0M;
        C24641Df r5 = indiaUpiDeviceBindStepActivity.A0C;
        AFC afc = indiaUpiDeviceBindStepActivity.A0I;
        C24651Dg r3 = indiaUpiDeviceBindStepActivity.A0L;
        AF7 af7 = indiaUpiDeviceBindStepActivity.A0S;
        C29221Vu r1 = indiaUpiDeviceBindStepActivity.A0K;
        C29121Vk r28 = r6;
        C24641Df r29 = r5;
        C24651Dg r26 = r3;
        C24601Db r27 = r7;
        C29221Vu r24 = r1;
        AnonymousClass9YX r25 = r10;
        AE0 ae0 = indiaUpiDeviceBindStepActivity.A0M;
        AnonymousClass19A r21 = r9;
        C19630wG r20 = r15;
        C19730wQ r19 = r12;
        AnonymousClass17Y r18 = r14;
        C19700wN r17 = r13;
        new C195049Sg(r17, r18, r19, r20, r21, ae0, IndiaUpiDeviceBindStepActivity.A0i, r24, r25, r26, r27, r28, r29, af7, afc, r8, r11).A00();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        IndiaUpiDeviceBindStepActivity.A1E(this.A00, this.A01);
    }
}
