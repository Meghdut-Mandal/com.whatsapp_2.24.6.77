package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

/* renamed from: X.2Vi  reason: invalid class name and case insensitive filesystem */
public final class C46172Vi extends C39381sB implements AnonymousClass1RE {
    public final PagerSlidingTabStrip A00;
    public final C595734l[] A01 = new C595734l[this.A00];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46172Vi(Context context, AnonymousClass01z r9, PagerSlidingTabStrip pagerSlidingTabStrip, String str, boolean z) {
        super(context, r9, str, z, true);
        AnonymousClass00C.A0D(pagerSlidingTabStrip, 4);
        this.A00 = pagerSlidingTabStrip;
    }

    public View BF1(int i) {
        C595734l[] r4 = this.A01;
        C595734l r3 = r4[i];
        if (r3 == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            r3 = new C595734l(C36371kC.A0J(C36351kA.A0C(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.f9nameremoved, false));
            CharSequence A0F = A0F(i);
            AnonymousClass00C.A0D(A0F, 0);
            r3.A01.setText(A0F);
            r4[i] = r3;
        }
        return r3.A00;
    }
}
