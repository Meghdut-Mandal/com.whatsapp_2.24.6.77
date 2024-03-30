package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.4wy  reason: invalid class name and case insensitive filesystem */
public abstract class C101084wy extends AnonymousClass18Q {
    public Toolbar A00;
    public String A01;
    public final C18820ts A02;
    public final WaBloksActivity A03;

    public abstract void A02(Intent intent, Bundle bundle);

    public abstract void A03(C158057fj r1);

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C100744vb A002;
        WaBloksActivity waBloksActivity = this.A03;
        C18740tg.A0C(C36361kB.A1a(activity, waBloksActivity));
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        Toolbar toolbar = (Toolbar) C03570Gk.A0B(waBloksActivity, R.id.wabloks_screen_toolbar);
        this.A00 = toolbar;
        toolbar.setTitle((CharSequence) "");
        Toolbar toolbar2 = this.A00;
        toolbar2.A0F();
        AnonymousClass07B A0Q = C36431kI.A0Q(waBloksActivity, toolbar2);
        C18740tg.A06(A0Q);
        A0Q.A0U(true);
        Toolbar toolbar3 = this.A00;
        if (this instanceof C107385Ok) {
            A002 = ((C107385Ok) this).A00.A00();
        } else {
            A002 = C91364bt.A00(waBloksActivity, this.A02, R.drawable.ic_back);
            C90484aE.A15(waBloksActivity.getResources(), A002, C224514j.A00(activity, R.attr.f4nameremoved, R.color.f6nameremoved));
        }
        toolbar3.setNavigationIcon((Drawable) A002);
        C36391kE.A1C(waBloksActivity.getResources(), this.A00, C224514j.A00(this.A00.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A00.setNavigationOnClickListener(new C135476cl(activity, 27));
        A02(activity.getIntent(), bundle);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public C101084wy(C18820ts r1, WaBloksActivity waBloksActivity) {
        this.A02 = r1;
        this.A03 = waBloksActivity;
    }

    public static void A00(AnonymousClass01L r1, C101084wy r2) {
        AnonymousClass07B supportActionBar = r1.getSupportActionBar();
        C18740tg.A06(supportActionBar);
        supportActionBar.A0Q(r2.A01);
    }
}
