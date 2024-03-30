package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.B7t  reason: case insensitive filesystem */
public class C23159B7t implements C22981AzX {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23159B7t(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BU9(PaymentBottomSheet paymentBottomSheet) {
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (this.A03 != 0) {
            C179048iy r1 = (C179048iy) this.A00;
            C207119ua r2 = (C207119ua) this.A01;
            Object obj = this.A02;
            AnonymousClass73N r6 = new AnonymousClass73N(r1, paymentBottomSheet, r2, obj, 4);
            r1.A4r(r2, new C23159B7t(obj, r2, r1, 2), new B9W(paymentBottomSheet, r1, 0), paymentBottomSheet2, r6, C21680AWa.A00);
            return;
        }
        ((C179068j0) this.A00).A4k((C175758b0) this.A02, (C207119ua) this.A01, paymentBottomSheet);
    }
}
