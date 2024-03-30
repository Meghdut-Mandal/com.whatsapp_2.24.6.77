package X;

import android.view.MenuItem;
import com.whatsapp.HomeActivity;

/* renamed from: X.15k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C226915k implements AnonymousClass02I {
    public final /* synthetic */ HomeActivity A00;

    public /* synthetic */ C226915k(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public final boolean BbN(MenuItem menuItem) {
        HomeActivity homeActivity = this.A00;
        homeActivity.A03 = menuItem.getItemId();
        homeActivity.A0i.A0J(HomeActivity.A0G(menuItem.getItemId()), false);
        homeActivity.A3q();
        C19420v0.A00(homeActivity.A06.A00).putBoolean("bottom_nav_tooltip_seen", true).apply();
        AnonymousClass1RJ r1 = homeActivity.A1B;
        if (r1 != null) {
            r1.A03(8);
        }
        return true;
    }
}
