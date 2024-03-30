package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.TypedValue;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.14p  reason: invalid class name and case insensitive filesystem */
public abstract class C224914p extends AnonymousClass14o {
    public C18820ts A00;
    public C20810yC A01;
    public AnonymousClass11e A02;
    public C21430zE A03;
    public C19770wU A04;
    public boolean A05 = true;
    public MessageQueue.IdleHandler A06 = null;
    public Toolbar A07;
    public C18770tn A08;
    public C167657yW A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C = true;
    public C228816i A0D;
    public C21690ze A0E;
    public AnonymousClass13J A0F;
    public AnonymousClass005 A0G;

    public void A2W() {
    }

    public void A2X() {
    }

    public boolean A2f() {
        return false;
    }

    public boolean A2g() {
        return false;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            C18860tw.A03(intent);
            if (i != -1) {
                if (C20800yB.A01(C21000yV.A02, this.A01, 5831)) {
                    AnonymousClass6K5 r4 = (AnonymousClass6K5) this.A0G.get();
                    String name = getClass().getName();
                    AnonymousClass00C.A0D(name, 0);
                    AnonymousClass00C.A0D(intent, 1);
                    r4.A00.execute(new C1502374m(r4, intent, name, 26));
                }
            }
        }
        super.startActivityForResult(intent, i);
    }

    private void A0N() {
        C167657yW r1 = this.A09;
        if (r1 != null && this.A06 != null && r1.A0V()) {
            r1.A0U(false);
            Looper.myQueue().addIdleHandler(this.A06);
        }
    }

    private void A0O() {
        C167657yW r1 = this.A09;
        if (r1 != null && this.A06 != null) {
            r1.A0U(true);
            Looper.myQueue().removeIdleHandler(this.A06);
        }
    }

    public static void A0P(C224914p r4) {
        if (r4.A09 != null && !r4.isFinishing()) {
            C167657yW r1 = r4.A09;
            if (r1.A0V()) {
                r1.A0T();
                new Handler(Looper.getMainLooper()).postDelayed(new C35671j4(r4, 0), (long) r4.A09.A0S());
            }
        }
    }

    public /* synthetic */ void A2a() {
        if (!this.A09.A0W() && this.A06 != null) {
            Looper.myQueue().addIdleHandler(this.A06);
        }
    }

    public void A2c(boolean z) {
        this.A0B = z;
        if (z) {
            Toolbar toolbar = this.A07;
            if ((toolbar instanceof WDSToolbar) && C222013h.A05) {
                AnonymousClass1RA.A00(getWindow(), toolbar);
            }
        }
    }

    public /* synthetic */ boolean A2h() {
        this.A04.Bp1(new C35671j4(this, 1));
        return false;
    }

    public /* synthetic */ boolean A2i() {
        this.A04.Bp1(new C35671j4(this, 2));
        return false;
    }

    public AnonymousClass0V9 But(C021809f r3) {
        if ((this.A07 instanceof WDSToolbar) && C222013h.A05) {
            r3 = new C67473Zy(r3, AnonymousClass00F.A00(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved)));
        }
        return super.But(r3);
    }

    public void attachBaseContext(Context context) {
        C18800tq r4 = (C18800tq) C18810tr.A00(context, C18800tq.class);
        this.A00 = r4.BxU();
        C18830tt r3 = r4.AfI.A00;
        C228916j A0Z = C18830tt.A0Z(r3);
        this.A0D = A0Z;
        super.attachBaseContext(new C229016k(context, A0Z, this.A00));
        this.A01 = r4.Azp();
        this.A02 = (AnonymousClass11e) r4.A7u.get();
        this.A0F = (AnonymousClass13J) r4.A6z.get();
        C21700zf r1 = this.A00.A01;
        this.A03 = r1.A06;
        this.A0E = r1.A05;
        this.A0G = C18840tu.A00(r3.A4P);
    }

    public Resources getResources() {
        C18770tn r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        if (this.A00 == null) {
            Log.i("wabaseappcompatactivity/get resources object/returning super resources");
            return super.getResources();
        }
        C18770tn A022 = C18770tn.A02(super.getBaseContext(), this.A00);
        this.A08 = A022;
        return A022;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            r0.A0O();
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.A00.A0O();
        if (this.A0C) {
            if (AnonymousClass1MI.A02(this.A01, (C21000yV) null, 4864)) {
                getTheme().applyStyle(R.style.f13nameremoved, true);
            }
            A2Y();
            C224314h.A02(false, getResources().getConfiguration());
        }
        super.onCreate(bundle);
        if (this.A05 && C222013h.A05) {
            try {
                TypedValue typedValue = new TypedValue();
                TypedValue typedValue2 = new TypedValue();
                Resources.Theme theme = getTheme();
                if (theme != null) {
                    theme.resolveAttribute(16842836, typedValue, true);
                }
                Resources.Theme theme2 = getTheme();
                if (theme2 != null) {
                    theme2.resolveAttribute(R.attr.f4nameremoved, typedValue2, true);
                }
                int i = typedValue.resourceId;
                int i2 = typedValue2.resourceId;
                if (i == i2) {
                    getWindow().setBackgroundDrawableResource(i2);
                }
            } catch (Exception unused) {
                Log.w("Can't resolve windowBackground resource");
            }
            Window window = getWindow();
            AnonymousClass00C.A0D(window, 0);
            Context context = this;
            if (this instanceof ContextWrapper) {
                context = getBaseContext();
            }
            if (window.getStatusBarColor() == AnonymousClass00F.A00(context, R.color.f6nameremoved)) {
                AnonymousClass1RB.A00(window, AnonymousClass00F.A00(this, C224314h.A00(this)), true);
            }
        }
        if (C20800yB.A01(C21000yV.A02, this.A01, 6581)) {
            C207899xI r2 = (C207899xI) ((C18800tq) C18810tr.A00(this, C18800tq.class)).AfI.A00.A20.get();
            r2.A00 = getClass();
            C167657yW r0 = (C167657yW) new AnonymousClass04H(r2, this).A00(C167657yW.class);
            this.A09 = r0;
            if (r0 != null && r0.A0V()) {
                this.A06 = new C164647s9(this, 0);
            }
        }
    }

    public C224914p(int i) {
        super(i);
    }

    public void A2Y() {
        Resources.Theme theme = getTheme();
        C20810yC r3 = this.A01;
        AnonymousClass13J r2 = this.A0F;
        AnonymousClass00C.A0D(theme, 0);
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        if (C222013h.A05) {
            theme.applyStyle(R.style.f13nameremoved, true);
            if (C222013h.A06) {
                theme.applyStyle(R.style.f13nameremoved, true);
            }
        }
    }

    public /* synthetic */ void A2Z() {
        A0P(this);
    }

    public C21430zE getQuickPerformanceLogger() {
        return this.A03;
    }

    public AnonymousClass11e getStartupTracker() {
        return this.A02;
    }

    public C19770wU getWaWorkers() {
        return this.A04;
    }

    public C18820ts getWhatsAppLocale() {
        return this.A00;
    }

    public void onPause() {
        super.onPause();
        A0O();
    }

    public void onResume() {
        super.onResume();
        A0N();
    }

    public void onStart() {
        super.onStart();
        if (!this.A0A) {
            if (A2f()) {
                if (C20800yB.A01(C21000yV.A01, this.A01, 6327)) {
                    Looper.myQueue().addIdleHandler(new C28881Ul(this));
                } else {
                    this.A04.Bp1(new C35671j4(this, 1));
                }
            }
            this.A0A = true;
        }
        if (A2g()) {
            if (C20800yB.A01(C21000yV.A01, this.A01, 6327)) {
                Looper.myQueue().addIdleHandler(new C164647s9(this, 1));
            } else {
                this.A04.Bp1(new C35671j4(this, 2));
            }
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        this.A07 = toolbar;
        if (toolbar != null && AnonymousClass1MI.A02(this.A01, (C21000yV) null, 4864)) {
            toolbar.setPopupTheme(R.style.f13nameremoved);
        }
        A2c(this.A0B);
    }

    public void startActivity(Intent intent) {
        C18860tw.A03(intent);
        if (C20800yB.A01(C21000yV.A02, this.A01, 5831)) {
            AnonymousClass6K5 r4 = (AnonymousClass6K5) this.A0G.get();
            String name = getClass().getName();
            AnonymousClass00C.A0D(name, 0);
            AnonymousClass00C.A0D(intent, 1);
            r4.A00.execute(new C1502374m(r4, intent, name, 26));
        }
        super.startActivity(intent);
    }

    public void A2b(C19770wU r1) {
        this.A04 = r1;
    }

    public void A2d(boolean z) {
        this.A0C = z;
    }

    public void A2e(boolean z) {
        this.A05 = z;
    }

    public C224914p() {
    }
}
