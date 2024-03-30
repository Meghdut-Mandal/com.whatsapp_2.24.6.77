package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.8i2  reason: invalid class name and case insensitive filesystem */
public abstract class C178878i2 extends C173878Tm {
    public PayToolbar A00;
    public RecyclerView A01;
    public final C168027za A02 = new C168027za(this);
    public final C24611Dc A03 = C165607th.A0c("PaymentComponentListActivity", "infra");

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        this.A03.A04(AnonymousClass000.A0r("Create view holder for ", AnonymousClass000.A0u(), i));
        switch (i) {
            case 100:
                return new AnonymousClass5Gn(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 102:
                layoutInflater = C36331k8.A09(viewGroup);
                i2 = R.layout.f9nameremoved;
                break;
            case 103:
                layoutInflater = C36331k8.A09(viewGroup);
                i2 = R.layout.f9nameremoved;
                break;
            case 104:
                return new AnonymousClass5Gq(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            default:
                throw C90514aH.A0s(C24611Dc.A01("PaymentComponentListActivity", AnonymousClass000.A0r("no valid mapping for: ", AnonymousClass000.A0u(), i)));
        }
        return new C179718ka(C36361kB.A0E(layoutInflater, viewGroup, i2));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((this instanceof PaymentTransactionDetailsListActivity) || (this instanceof IndiaUpiMandateHistoryActivity)) {
            setContentView((int) R.layout.f9nameremoved);
        } else {
            setContentView((int) R.layout.f9nameremoved);
            int A002 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
            PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
            this.A00 = payToolbar;
            AnonymousClass07B A0Q = C36431kI.A0Q(this, payToolbar);
            if (A0Q != null) {
                C165577te.A10(A0Q, R.string.f12nameremoved);
                C165607th.A17(this, A0Q, A002);
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.payment_component_list);
        this.A01 = recyclerView;
        C36321k7.A0Q(recyclerView);
        this.A01.setAdapter(this.A02);
    }
}
