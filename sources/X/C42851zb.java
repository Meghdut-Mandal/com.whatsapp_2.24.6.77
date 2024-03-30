package X;

import android.os.Bundle;
import com.whatsapp.base.WaFragment;
import com.whatsapp.status.grid.StatusGridPageFragment;
import java.util.List;

/* renamed from: X.1zb  reason: invalid class name and case insensitive filesystem */
public final class C42851zb extends AnonymousClass0Hz {
    public List A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(AnonymousClass4IG.A00);

    public int A0J() {
        int i;
        List list = this.A00;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i / C36331k8.A02(this.A01);
    }

    public AnonymousClass02E A0L(int i) {
        StatusGridPageFragment statusGridPageFragment = new StatusGridPageFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("page_index", i);
        statusGridPageFragment.A17(A07);
        return statusGridPageFragment;
    }

    public C42851zb(WaFragment waFragment) {
        super(waFragment.A0k(), waFragment.A0P);
    }
}
