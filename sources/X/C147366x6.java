package X;

import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.6x6  reason: invalid class name and case insensitive filesystem */
public final class C147366x6 implements C23033B1e {
    public final /* synthetic */ P2mLiteConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ AnonymousClass2bZ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public void BT0() {
    }

    public void BUa(PaymentBottomSheet paymentBottomSheet, String str) {
        String str2 = str;
        AnonymousClass00C.A0D(str2, 1);
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        Integer A0p = C36371kC.A0p();
        String str3 = this.A05;
        AnonymousClass2bZ r6 = this.A03;
        P2mLiteOrderDetailsActivity.A07(AnonymousClass9ZG.A00(), p2mLiteOrderDetailsActivity, r6, A0p, "enter_name", str3, 1);
        C19770wU r0 = p2mLiteOrderDetailsActivity.A04;
        String str4 = this.A04;
        r0.Boy(new C21676AVw(p2mLiteOrderDetailsActivity, this.A02, this.A00, paymentBottomSheet, r6, str2, str4, 1));
    }

    public C147366x6(P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass2bZ r4, String str, String str2) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A03 = r4;
        this.A04 = str2;
        this.A00 = p2mLiteConfirmLegalNameBottomSheetFragment;
        this.A02 = paymentBottomSheet;
    }
}
