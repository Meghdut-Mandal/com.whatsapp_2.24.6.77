package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;

/* renamed from: X.2tq  reason: invalid class name and case insensitive filesystem */
public abstract class C54962tq {
    public static final BrazilPaymentIncomeCollectionBottomSheet A00(C23075B3f b3f, AnonymousClass4TR r3, String str) {
        AnonymousClass00C.A0D(b3f, 1);
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("referral_screen", str);
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = new BrazilPaymentIncomeCollectionBottomSheet();
        brazilPaymentIncomeCollectionBottomSheet.A17(A07);
        brazilPaymentIncomeCollectionBottomSheet.A01 = r3;
        brazilPaymentIncomeCollectionBottomSheet.A00 = b3f;
        return brazilPaymentIncomeCollectionBottomSheet;
    }
}
