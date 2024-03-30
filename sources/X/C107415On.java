package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5On  reason: invalid class name and case insensitive filesystem */
public abstract class C107415On extends C101084wy {
    public C158077fl A00;

    public void A02(Intent intent, Bundle bundle) {
        if (intent != null) {
            this.A01 = intent.getStringExtra("bk_phoenix_navbar_title");
            intent.getStringExtra("bk_phoenix_navbar_leading_button_icon");
        }
        A04();
    }

    public void A04() {
        WaBloksActivity waBloksActivity = this.A03;
        C101084wy.A00(waBloksActivity, this);
        Toolbar toolbar = (Toolbar) C03570Gk.A0B(waBloksActivity, R.id.wabloks_screen_toolbar);
        C100744vb r0 = new C100744vb(AnonymousClass3UF.A08(waBloksActivity.getResources().getDrawable(R.drawable.ic_back), waBloksActivity.getResources().getColor(R.color.f6nameremoved)), this.A02);
        r0.clearColorFilter();
        toolbar.setNavigationIcon((Drawable) r0);
        C36391kE.A1C(waBloksActivity.getResources(), toolbar, C224314h.A00(waBloksActivity));
        toolbar.setTitleTextColor(waBloksActivity.getResources().getColor(C224514j.A00(waBloksActivity, R.attr.f4nameremoved, R.color.f6nameremoved)));
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            Drawable A01 = AnonymousClass08I.A01(overflowIcon);
            AnonymousClass076.A06(A01.mutate(), waBloksActivity.getResources().getColor(R.color.f6nameremoved));
            toolbar.setOverflowIcon(A01);
        }
    }

    public void A03(C158057fj r4) {
        try {
            this.A01 = C140456lc.A0K(r4.B7w());
            C122895vb A002 = C122895vb.A00(r4);
            if (AnonymousClass14B.A0F(this.A01)) {
                this.A01 = A002.A03;
            }
            if (A002.A00 != null) {
                this.A00 = C164197rQ.A00(A002, 41);
            }
            A04();
        } catch (ClassCastException e) {
            C36321k7.A1J(e, "Bloks: Invalid navigation bar type", AnonymousClass000.A0u());
        }
    }

    public C107415On(C18820ts r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }
}
