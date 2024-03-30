package X;

import android.os.Bundle;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.1zZ  reason: invalid class name and case insensitive filesystem */
public final class C42831zZ extends AnonymousClass0Hz {
    public C62743Hj A00;

    public int A0J() {
        C62743Hj r0 = this.A00;
        if (r0 != null) {
            return r0.A00.size();
        }
        return 0;
    }

    public AnonymousClass02E A0L(int i) {
        BonsaiDiscoveryFragment bonsaiDiscoveryFragment = new BonsaiDiscoveryFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("position", i);
        bonsaiDiscoveryFragment.A17(A07);
        return bonsaiDiscoveryFragment;
    }

    public C42831zZ(BonsaiDiscoveryActivity bonsaiDiscoveryActivity) {
        super(bonsaiDiscoveryActivity.getSupportFragmentManager(), bonsaiDiscoveryActivity.A06);
    }
}
