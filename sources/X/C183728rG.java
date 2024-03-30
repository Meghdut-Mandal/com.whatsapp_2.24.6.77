package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8rG  reason: invalid class name and case insensitive filesystem */
public class C183728rG extends C132446Tt {
    public final C64933Qa A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public C183728rG(IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, C64933Qa r2) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C207219uk r0;
        C207199ui r02;
        AnonymousClass2bZ r03 = (AnonymousClass2bZ) this.A01.A0e.A03(this.A00);
        if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A01) == null) {
            return null;
        }
        return r02.A0I;
    }

    public void A0A() {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        AtomicInteger atomicInteger = indiaUpiCheckOrderDetailsActivity.A0q;
        if (atomicInteger.get() == 0) {
            indiaUpiCheckOrderDetailsActivity.Bu1(R.string.f12nameremoved);
        }
        atomicInteger.incrementAndGet();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        if (indiaUpiCheckOrderDetailsActivity.A0q.decrementAndGet() == 0) {
            indiaUpiCheckOrderDetailsActivity.Bnv();
        }
        indiaUpiCheckOrderDetailsActivity.A0B = list;
    }
}
