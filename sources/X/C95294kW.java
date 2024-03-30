package X;

import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;
import java.util.List;

/* renamed from: X.4kW  reason: invalid class name and case insensitive filesystem */
public class C95294kW extends AnonymousClass07T implements AnonymousClass1RE {
    public int A00;
    public List A01 = AnonymousClass001.A0I();
    public final /* synthetic */ IndiaUpiQrTabActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95294kW(AnonymousClass01z r2, IndiaUpiQrTabActivity indiaUpiQrTabActivity, int i) {
        super(r2, 0);
        this.A02 = indiaUpiQrTabActivity;
        this.A00 = i;
    }

    public CharSequence A0F(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A02;
        int i2 = R.string.f12nameremoved;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass001.A08("The item position is not defined");
            }
            i2 = R.string.f12nameremoved;
        }
        return indiaUpiQrTabActivity.getString(i2);
    }

    public AnonymousClass02E A0M(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A02;
        if (i == 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = new IndiaUpiScanQrCodeFragment();
            indiaUpiScanQrCodeFragment.A17(C36371kC.A0H(indiaUpiQrTabActivity));
            return indiaUpiScanQrCodeFragment;
        } else if (i == 1) {
            return IndiaUpiMyQrFragment.A00(IndiaUpiQrTabActivity.A0H);
        } else {
            throw AnonymousClass001.A08("The item position is not defined");
        }
    }

    public View BF1(int i) {
        List list = this.A01;
        if (C36431kI.A07(list) < i) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A02.A00;
            AnonymousClass35O r2 = new AnonymousClass35O(C36361kB.A0E(C36351kA.A0C(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.f9nameremoved));
            CharSequence A0F = A0F(i);
            C18740tg.A06(A0F);
            r2.A01.setText(A0F);
            list.add(r2);
        }
        return ((AnonymousClass35O) list.get(i)).A00;
    }

    public int A0H() {
        return this.A00;
    }
}
