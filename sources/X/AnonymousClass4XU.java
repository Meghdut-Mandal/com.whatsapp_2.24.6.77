package X;

import android.view.View;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.4XU  reason: invalid class name */
public class AnonymousClass4XU implements AnonymousClass4S9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XU(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final boolean BTf() {
        if (this.A02 != 0) {
            ((View.OnClickListener) this.A00).onClick(((WDSBannerCompact) this.A01).A00);
            return true;
        }
        C47592fB r2 = (C47592fB) this.A00;
        ((AnonymousClass3BK) this.A01).A0F.setExpanded(true);
        r2.A0G();
        C47592fB.A03(r2);
        return true;
    }
}
