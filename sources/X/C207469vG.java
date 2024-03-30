package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;

/* renamed from: X.9vG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207469vG implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ListView A01;
    public final /* synthetic */ PaymentMethodsListPickerFragment A02;

    public /* synthetic */ C207469vG(View view, ListView listView, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A02 = paymentMethodsListPickerFragment;
        this.A01 = listView;
        this.A00 = view;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A02;
        ListView listView = this.A01;
        View view2 = this.A00;
        if (view2 == null || i != listView.getPositionForView(view2)) {
            AnonymousClass02E A022 = AnonymousClass02E.A02(paymentMethodsListPickerFragment, true);
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) paymentMethodsListPickerFragment.A0I;
            C207249un r1 = (C207249un) paymentMethodsListPickerFragment.A06.A00.get(i - listView.getHeaderViewsCount());
            C23078B3k b3k = paymentMethodsListPickerFragment.A07;
            if (b3k != null && !b3k.Bt7(r1)) {
                if (A022 instanceof C22978AzU) {
                    ((C22978AzU) A022).BcR(r1);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A1n(A022);
                        return;
                    }
                    return;
                }
                C22978AzU azU = paymentMethodsListPickerFragment.A04;
                if (azU != null) {
                    azU.BcR(r1);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A1m();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C23078B3k b3k2 = paymentMethodsListPickerFragment.A07;
        if (b3k2 != null) {
            b3k2.BQp();
        }
    }
}
