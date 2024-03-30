package X;

import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.Iterator;

/* renamed from: X.AVw  reason: case insensitive filesystem */
public class C21676AVw implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public String A06;
    public final int A07;

    public C21676AVw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = str;
        this.A06 = str2;
    }

    public void run() {
        if (this.A07 != 0) {
            P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
            String str = this.A05;
            String str2 = this.A06;
            P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment = (P2mLiteConfirmLegalNameBottomSheetFragment) this.A01;
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A02;
            PaymentBottomSheet paymentBottomSheet2 = (PaymentBottomSheet) this.A03;
            AnonymousClass2bZ r8 = (AnonymousClass2bZ) this.A04;
            C36321k7.A0z(str2, p2mLiteConfirmLegalNameBottomSheetFragment);
            AnonymousClass00C.A0D(paymentBottomSheet, 4);
            C195389Uc r1 = p2mLiteOrderDetailsActivity.A0F;
            if (r1 != null) {
                r1.A01(new C21269AEz(p2mLiteConfirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, paymentBottomSheet2, r8, str2), str, "p2m-lite-buyer-check");
                return;
            }
            throw C36331k8.A0d("paymentsComplianceManager");
        }
        Iterator it = ((C20990A2e) this.A00).A00.iterator();
        while (it.hasNext()) {
            C207019uQ r5 = (C207019uQ) this.A01;
            ((C161067m6) it.next()).Bcn((C118655oW) this.A03, (C200889iQ) this.A04, r5, (C207179ug) this.A02, this.A05, this.A06);
        }
    }
}
