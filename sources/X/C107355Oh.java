package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5Oh  reason: invalid class name and case insensitive filesystem */
public final class C107355Oh extends C107375Oj {
    public void A03(C158057fj r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.A03(r2);
        this.A01 = C140456lc.A0K(r2.B7w());
        C101084wy.A00(this.A03, this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityCreated(activity, bundle);
        AnonymousClass1RC.A04(activity, C224314h.A00(activity));
        WaBloksActivity waBloksActivity = this.A03;
        View A0B = C03570Gk.A0B(waBloksActivity, R.id.wabloks_screen_toolbar);
        AnonymousClass00C.A08(A0B);
        Toolbar toolbar = (Toolbar) A0B;
        C100744vb A00 = C91364bt.A00(waBloksActivity, this.A02, R.drawable.ic_back);
        A00.setColorFilter(AnonymousClass00F.A00(activity, R.color.f6nameremoved), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) A00);
        toolbar.setTitleTextColor(C36351kA.A01(activity, R.attr.f4nameremoved, R.color.f6nameremoved));
        C36341k9.A0q(activity, toolbar, C224314h.A00(activity));
    }

    public void A02(Intent intent, Bundle bundle) {
        WaBloksActivity waBloksActivity = this.A03;
        C101084wy.A00(waBloksActivity, this);
        C101084wy.A00(waBloksActivity, this);
    }

    public C107355Oh(C18820ts r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }
}
