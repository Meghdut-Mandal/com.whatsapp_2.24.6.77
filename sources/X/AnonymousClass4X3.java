package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import java.util.ArrayList;

/* renamed from: X.4X3  reason: invalid class name */
public class AnonymousClass4X3 implements AnonymousClass4TR {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4X3(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BWY() {
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet;
        AnonymousClass4TR r0;
        if (this.A02 != 0) {
            brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A01;
            ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
            r0 = brazilPaymentIncomeCollectionBottomSheet.A01;
            if (r0 == null) {
                throw C36331k8.A0d("incomeCollectionCallback");
            }
        } else {
            ((WaButtonWithLoader) this.A00).A01();
            brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A01;
            ArrayList arrayList2 = BrazilPaymentIncomeCollectionBottomSheet.A05;
            r0 = brazilPaymentIncomeCollectionBottomSheet.A01;
            if (r0 == null) {
                throw C36331k8.A0d("incomeCollectionCallback");
            }
        }
        r0.BWY();
        brazilPaymentIncomeCollectionBottomSheet.A1b();
    }

    public void BZ8() {
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet;
        AnonymousClass4TR r0;
        if (this.A02 != 0) {
            brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A01;
            ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
            r0 = brazilPaymentIncomeCollectionBottomSheet.A01;
            if (r0 == null) {
                throw C36331k8.A0d("incomeCollectionCallback");
            }
        } else {
            ((WaButtonWithLoader) this.A00).A01();
            brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A01;
            ArrayList arrayList2 = BrazilPaymentIncomeCollectionBottomSheet.A05;
            r0 = brazilPaymentIncomeCollectionBottomSheet.A01;
            if (r0 == null) {
                throw C36331k8.A0d("incomeCollectionCallback");
            }
        }
        r0.BZ8();
        brazilPaymentIncomeCollectionBottomSheet.A1b();
    }
}
