package androidx.viewpager2.adapter;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass0Hz;
import X.AnonymousClass0IF;
import X.C011304x;

public class FragmentStateAdapter$2 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass0Hz A00;
    public final /* synthetic */ AnonymousClass0IF A01;

    public FragmentStateAdapter$2(AnonymousClass0Hz r1, AnonymousClass0IF r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        AnonymousClass0Hz r2 = this.A00;
        if (!r2.A06.A0r()) {
            r5.getLifecycle().A05(this);
            AnonymousClass0IF r1 = this.A01;
            if (C011304x.A02(r1.A0H)) {
                r2.A0N(r1);
            }
        }
    }
}
