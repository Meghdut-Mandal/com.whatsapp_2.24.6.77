package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import java.util.Collection;

/* renamed from: X.2H2  reason: invalid class name */
public final class AnonymousClass2H2 extends AnonymousClass28f implements AnonymousClass1JB {
    public static final C52512pY A0F = C52512pY.NEWSLETTER_THREAD;
    public Menu A00;
    public WaButtonWithLoader A01;
    public AnonymousClass3IZ A02;
    public AnonymousClass3ZU A03;
    public boolean A04 = true;
    public boolean A05;
    public final C21060yb A06;
    public final C19970wo A07;
    public final AnonymousClass1GQ A08;
    public final C32241dD A09;
    public final NewsletterViewModel A0A;
    public final C19460v5 A0B;
    public final AnonymousClass1DP A0C;
    public final AnonymousClass2EJ A0D;
    public final AnonymousClass3G3 A0E;

    private final void A05(Menu menu, int i, int i2) {
        MenuItem add = menu.add(0, i2, 0, i);
        View A0R = C36441kJ.A0R(add, R.layout.f9nameremoved);
        if (A0R != null) {
            WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) A0R.findViewById(R.id.joinable_label);
            this.A01 = waButtonWithLoader;
            if (waButtonWithLoader != null) {
                waButtonWithLoader.setButtonText(i);
                waButtonWithLoader.A00 = new AnonymousClass3YF(this, add, 1);
                waButtonWithLoader.setSize(C34271gk.SMALL);
                waButtonWithLoader.setVariant(C27981Qp.TONAL);
                waButtonWithLoader.findViewById(R.id.button_view).getLayoutParams().width = -2;
            }
            C36331k8.A0q(this.A05, A0R, i);
        }
        AnonymousClass28f.A01(add, this, i, true);
    }

    public void BQH(AnonymousClass11F r1) {
    }

    public void BQI() {
    }

    public void BQJ(AnonymousClass11F r2, boolean z) {
        AnonymousClass00C.A0D(r2, 0);
        if (AnonymousClass00C.A0J(this.A0G, r2)) {
            A03();
        }
    }

    public void BQK(AnonymousClass11F r1, Collection collection, int i) {
    }

    public void BQL(AnonymousClass11F r1) {
    }

    public void BQM(AnonymousClass11F r1) {
    }

    public boolean Bbx(MenuItem menuItem) {
        int i;
        int i2;
        String str;
        int i3;
        if (menuItem == null) {
            return super.Bbx((MenuItem) null);
        }
        switch (menuItem.getItemId()) {
            case 53:
                A08(this, false);
                return true;
            case 54:
                A09(this, false);
                return true;
            case 55:
                A06(this);
                return true;
            case 56:
            case 59:
                AnonymousClass01L r4 = this.A05;
                AnonymousClass00C.A07(r4);
                C39001qm A002 = AnonymousClass3LW.A00(r4);
                A002.A0p(C36381kD.A0r(r4, AnonymousClass3IZ.A00(this.A0A).A0K, new Object[1], R.string.f12nameremoved));
                A002.A0l(r4, C67873ay.A00, R.string.f12nameremoved);
                A002.A0m(r4, new C88554Td(this, 18), R.string.f12nameremoved);
                C36341k9.A11(A002);
                return true;
            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                Intent A0B2 = C36431kI.A0B();
                NewsletterViewModel newsletterViewModel = this.A0A;
                boolean A1V = AnonymousClass000.A1V(AnonymousClass3IZ.A00(newsletterViewModel).A0I);
                C44072La A003 = AnonymousClass3IZ.A00(newsletterViewModel);
                if (A1V) {
                    str = A003.A0I;
                    i3 = R.string.f12nameremoved;
                } else {
                    str = A003.A0J;
                    i3 = R.string.f12nameremoved;
                }
                AnonymousClass01L r5 = this.A05;
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = AnonymousClass3IZ.A00(newsletterViewModel).A0K;
                String A0x = C36351kA.A0x(r5, str, A0M, 1, i3);
                A0B2.putExtra("android.intent.extra.TEXT", A0x);
                this.A09.A08(A0J(), (C52512pY) null, 3, 3);
                C36371kC.A18(A0B2, "text/plain");
                r5.startActivity(Intent.createChooser(A0B2, A0x));
                return true;
            case 58:
                AnonymousClass01L r42 = this.A05;
                Intent intent = r42.getIntent();
                if (intent != null) {
                    i = intent.getIntExtra("mat_entry_point", 0);
                } else {
                    i = 0;
                }
                Intent intent2 = r42.getIntent();
                if (intent2 != null) {
                    i2 = intent2.getIntExtra("extra_forwarded_message_thread_type", -1);
                } else {
                    i2 = -1;
                }
                Intent A0n = AnonymousClass190.A0n(r42, AnonymousClass3IZ.A00(this.A0A).A06(), (Long) null, i, i2, true);
                Bundle A004 = AnonymousClass3CG.A00(r42, C36361kB.A0H(r42, R.id.transition_start), this.A09);
                C36351kA.A1J(A0J(), A0F, 1);
                AnonymousClass3M9.A00(A0n, r42);
                C05290Pd.A00(r42, A0n, A004);
                return true;
            case 61:
                AnonymousClass01L r2 = this.A05;
                Intent A0r = AnonymousClass190.A0r(r2, AnonymousClass3IZ.A00(this.A0A).A0J(), C52512pY.NEWSLETTER_THREAD.value);
                AnonymousClass3M9.A00(A0r, r2);
                C05290Pd.A00(r2, A0r, (Bundle) null);
                return true;
            case 62:
                AnonymousClass01L r43 = this.A05;
                C28981Uw A0J = A0J();
                Intent A0D2 = C36431kI.A0D();
                C36331k8.A0u(A0D2, A0J, r43.getPackageName(), "com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity");
                r43.startActivity(A0D2);
                return true;
            default:
                super.Bbx(menuItem);
                return true;
        }
    }

    public boolean BdM(Menu menu) {
        int i;
        MenuItem findItem;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        if (menu == null || menu.size() == 0) {
            return false;
        }
        if (A0A()) {
            i = 55;
        } else {
            NewsletterViewModel newsletterViewModel = this.A0A;
            if (AnonymousClass3IZ.A00(newsletterViewModel).A0O) {
                i = 54;
            } else {
                boolean z = AnonymousClass3IZ.A00(newsletterViewModel).A0O;
                i = -1;
                if (!z) {
                    i = 53;
                }
            }
        }
        if (this.A04 && (findItem = menu.findItem(i)) != null) {
            AnonymousClass4I2 r3 = AnonymousClass4I2.A00;
            View actionView = findItem.getActionView();
            if (actionView != null) {
                actionView.setAlpha(0.0f);
            }
            View actionView2 = findItem.getActionView();
            if (!(actionView2 == null || (animate = actionView2.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200)) == null || (withEndAction = duration.withEndAction(C80223v3.A00(r3, 37))) == null)) {
                withEndAction.start();
            }
        }
        this.A04 = true;
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityCreated(activity, bundle);
        this.A0C.registerObserver(this);
        NewsletterViewModel newsletterViewModel = this.A0A;
        C88554Td.A00((AnonymousClass014) activity, newsletterViewModel.A01, new C85954Jb(this), 20);
        AnonymousClass012 r6 = (AnonymousClass012) activity;
        C88554Td.A00(r6, newsletterViewModel.A00, new C85964Jc(this), 21);
        C88554Td.A00(r6, newsletterViewModel.A0U(), new C85974Jd(this), 19);
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityDestroyed(activity);
        this.A0C.unregisterObserver(this);
        ((AnonymousClass01G) activity).A06.A05(this.A0A);
    }

    public void onActivityResumed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        this.A0A.A0U().A04();
        A03();
        super.onActivityResumed(activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0.isVisible() != true) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r1 == A0B()) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isVisible() != true) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r5 = this;
            android.view.Menu r1 = r5.A00
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = "menu"
            r0 = 55
            android.view.MenuItem r0 = r1.findItem(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isVisible()
            r2 = 1
            if (r0 == r3) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            android.view.Menu r1 = r5.A00
            if (r1 != 0) goto L_0x0065
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0020:
            android.view.Menu r0 = r5.A00
            if (r0 == 0) goto L_0x0086
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r4 = r5.A0A
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r3 = r0.A0N
            android.view.Menu r1 = r5.A00
            java.lang.String r2 = "menu"
            if (r1 != 0) goto L_0x0037
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0037:
            r0 = 53
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0049
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0O
            if (r0 != 0) goto L_0x0081
            if (r3 != 0) goto L_0x0081
        L_0x0049:
            android.view.Menu r1 = r5.A00
            if (r1 != 0) goto L_0x0052
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0052:
            r0 = 54
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0086
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x0081
            if (r3 == 0) goto L_0x0086
            goto L_0x0081
        L_0x0065:
            r0 = 59
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isVisible()
            r1 = 1
            if (r0 == r3) goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            boolean r0 = r5.A0A()
            if (r2 != r0) goto L_0x0081
            boolean r0 = r5.A0B()
            if (r1 == r0) goto L_0x0020
        L_0x0081:
            X.01L r0 = r5.A05
            r0.invalidateOptionsMenu()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H2.A03():void");
    }

    private final void A04(int i) {
        Menu menu = this.A00;
        if (menu == null) {
            throw C36331k8.A0d("menu");
        }
        MenuItem findItem = menu.findItem(60);
        if (findItem != null) {
            findItem.setVisible(true);
        }
        Menu menu2 = this.A00;
        if (menu2 == null) {
            throw C36331k8.A0d("menu");
        }
        MenuItem findItem2 = menu2.findItem(i);
        if (findItem2 != null) {
            findItem2.setVisible(false);
        }
    }

    public static final void A06(AnonymousClass2H2 r9) {
        WaButtonWithLoader waButtonWithLoader = r9.A01;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A02();
        }
        NewsletterViewModel newsletterViewModel = r9.A0A;
        C28981Uw A0J = r9.A0J();
        AnonymousClass00C.A0D(A0J, 0);
        newsletterViewModel.A04.A09(A0J);
        AnonymousClass01L r1 = r9.A05;
        r9.A09.A0C(r9.A0J(), C65903Tx.A00(r1.getIntent()), A0F, r9.A0B.getSimilarChannelsSessionId(), (String) null, C65903Tx.A01(r1), -1);
    }

    public static final void A07(AnonymousClass2H2 r15) {
        Menu menu = r15.A00;
        if (menu == null) {
            throw C36331k8.A0d("menu");
        }
        MenuItem findItem = menu.findItem(53);
        if (findItem != null) {
            findItem.setVisible(false);
        }
        MenuItem findItem2 = menu.findItem(54);
        if (findItem2 != null) {
            findItem2.setVisible(false);
        }
        MenuItem findItem3 = menu.findItem(1);
        if (findItem3 != null) {
            findItem3.setVisible(false);
        }
        MenuItem findItem4 = menu.findItem(59);
        if (findItem4 != null) {
            findItem4.setVisible(false);
        }
        r15.A04(56);
        NewsletterViewModel newsletterViewModel = r15.A0A;
        newsletterViewModel.A0S(r15.A0J());
        AnonymousClass01L r4 = r15.A05;
        r15.A09.A0D(r15.A0J(), C65903Tx.A00(r4.getIntent()), A0F, r15.A0B.getSimilarChannelsSessionId(), (String) null, C65903Tx.A01(r4), -1);
        C33521fV.A00(r4, r15.A06, C36391kE.A0v(r4, AnonymousClass3IZ.A00(newsletterViewModel).A0K, AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
    }

    public static final void A08(AnonymousClass2H2 r8, boolean z) {
        r8.A04(53);
        NewsletterViewModel newsletterViewModel = r8.A0A;
        C28981Uw A0J = r8.A0J();
        AnonymousClass00C.A0D(A0J, 0);
        newsletterViewModel.A04.A08(A0J);
        AnonymousClass01L r1 = r8.A05;
        r8.A09.A0A(r8.A0J(), C65903Tx.A00(r1.getIntent()), A0F, r8.A0B.getSimilarChannelsSessionId(), C65903Tx.A01(r1));
        r8.A05 = z;
    }

    public static final void A09(AnonymousClass2H2 r8, boolean z) {
        r8.A04(54);
        r8.A0A.A0T(r8.A0J());
        AnonymousClass01L r1 = r8.A05;
        r8.A09.A0B(r8.A0J(), C65903Tx.A00(r1.getIntent()), A0F, r8.A0B.getSimilarChannelsSessionId(), C65903Tx.A01(r1));
        r8.A05 = z;
    }

    private final boolean A0A() {
        NewsletterViewModel newsletterViewModel = this.A0A;
        if (!AnonymousClass3IZ.A00(newsletterViewModel).A0N() || AnonymousClass3IZ.A00(newsletterViewModel).A0N) {
            return false;
        }
        return true;
    }

    private final boolean A0B() {
        NewsletterViewModel newsletterViewModel = this.A0A;
        if (!AnonymousClass3IZ.A00(newsletterViewModel).A0M()) {
            return false;
        }
        if (this.A0E.A00(AnonymousClass3IZ.A00(newsletterViewModel)) || AnonymousClass3IZ.A00(newsletterViewModel).A0N) {
            return true;
        }
        return false;
    }

    public final C28981Uw A0J() {
        AnonymousClass11F r1 = this.A00.A0H;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        return (C28981Uw) r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUv(android.view.Menu r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0069
            boolean r0 = r6 instanceof X.C016307a
            if (r0 == 0) goto L_0x0014
            X.0yC r0 = r5.A0F
            boolean r0 = X.C36361kB.A1Y(r0)
            if (r0 == 0) goto L_0x0014
            r1 = r6
            X.07a r1 = (X.C016307a) r1
            r0 = 1
            r1.A0C = r0
        L_0x0014:
            r5.A00 = r6
            java.lang.String r1 = ""
            r4 = 0
            r0 = 60
            android.view.MenuItem r3 = r6.add(r4, r0, r4, r1)
            r0 = 2131623996(0x7f0e003c, float:1.887516E38)
            android.view.View r2 = X.C36441kJ.A0R(r3, r0)
            if (r2 == 0) goto L_0x0030
            X.01L r1 = r5.A05
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            X.C36331k8.A0q(r1, r2, r0)
        L_0x0030:
            r0 = 2
            r3.setShowAsAction(r0)
            r3.setVisible(r4)
            X.3G3 r1 = r5.A0E
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r4 = r5.A0A
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r3 = r1.A00(r0)
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r2 = r0.A0N
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x0057
            r1 = 2131895194(0x7f12239a, float:1.9425214E38)
            r0 = 59
            r5.A05(r6, r1, r0)
        L_0x0057:
            if (r3 != 0) goto L_0x0069
            if (r2 != 0) goto L_0x0069
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x006a
            r1 = 2131889674(0x7f120e0a, float:1.9414018E38)
            r0 = 55
            r5.A05(r6, r1, r0)
        L_0x0069:
            return
        L_0x006a:
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0099
            r2 = 2131891562(0x7f12156a, float:1.9417848E38)
            r1 = 2131231812(0x7f080444, float:1.8079716E38)
            r0 = 61
            android.view.MenuItem r1 = r5.A0D(r6, r0, r2, r1)
            r0 = 2131625646(0x7f0e06ae, float:1.8878506E38)
            r1.setActionView(r0)
            r0 = 1
            X.AnonymousClass28f.A01(r1, r5, r2, r0)
            boolean r0 = X.C19550w8.A03()
            if (r0 == 0) goto L_0x0099
            X.01L r0 = r5.A05
            java.lang.String r0 = r0.getString(r2)
            r1.setContentDescription(r0)
        L_0x0099:
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x010f
            r1 = 2131889674(0x7f120e0a, float:1.9414018E38)
            r0 = 55
            r5.A05(r6, r1, r0)
        L_0x00a7:
            r2 = 58
            r1 = 2131891554(0x7f121562, float:1.9417831E38)
            r0 = 2131234154(0x7f080d6a, float:1.8084466E38)
            r5.A0D(r6, r2, r1, r0)
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x00d3
            X.2La r1 = X.AnonymousClass3IZ.A00(r4)
            X.1GQ r0 = r5.A08
            boolean r0 = r1.A0R(r0)
            if (r0 != 0) goto L_0x00d3
            r2 = 62
            r1 = 2131891496(0x7f121528, float:1.9417714E38)
            r0 = 2131232765(0x7f0807fd, float:1.8081648E38)
            r5.A0D(r6, r2, r1, r0)
        L_0x00d3:
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x00ee
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x00ee
            r2 = 56
            r1 = 2131895194(0x7f12239a, float:1.9425214E38)
            r0 = 2131232274(0x7f080612, float:1.8080653E38)
            r5.A0D(r6, r2, r1, r0)
        L_0x00ee:
            r2 = 57
            r1 = 2131894318(0x7f12202e, float:1.9423437E38)
            r0 = 2131232787(0x7f080813, float:1.8081693E38)
            r5.A0D(r6, r2, r1, r0)
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0069
            r2 = 9
            r1 = 2131893610(0x7f121d6a, float:1.9422001E38)
            r0 = 2131232812(0x7f08082c, float:1.8081744E38)
            r5.A0D(r6, r2, r1, r0)
            return
        L_0x010f:
            X.2La r1 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r1.A0N
            if (r0 != 0) goto L_0x0164
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.ADMIN
            if (r1 != r0) goto L_0x0164
            X.1GQ r0 = r5.A08
            X.0yC r1 = r0.A00
        L_0x0121:
            r0 = 7245(0x1c4d, float:1.0152E-41)
            boolean r0 = r1.A0E(r0)
        L_0x0127:
            if (r0 == 0) goto L_0x00a7
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x0151
            r3 = 2131891002(0x7f12133a, float:1.9416712E38)
            r1 = 2131231857(0x7f080471, float:1.8079807E38)
            r0 = 54
            android.view.MenuItem r2 = r5.A0D(r6, r0, r3, r1)
            r0 = 2131626395(0x7f0e099b, float:1.8880025E38)
        L_0x0140:
            android.view.View r1 = X.C36441kJ.A0R(r2, r0)
            if (r1 == 0) goto L_0x014b
            X.01L r0 = r5.A05
            X.C36331k8.A0q(r0, r1, r3)
        L_0x014b:
            r0 = 1
            X.AnonymousClass28f.A01(r2, r5, r3, r0)
            goto L_0x00a7
        L_0x0151:
            r2 = 2131890985(0x7f121329, float:1.9416677E38)
            r3 = 2131890985(0x7f121329, float:1.9416677E38)
            r1 = 2131231814(0x7f080446, float:1.807972E38)
            r0 = 53
            android.view.MenuItem r2 = r5.A0D(r6, r0, r2, r1)
            r0 = 2131625581(0x7f0e066d, float:1.8878374E38)
            goto L_0x0140
        L_0x0164:
            X.2La r0 = X.AnonymousClass3IZ.A00(r4)
            boolean r0 = r0.A0O()
            X.2La r1 = X.AnonymousClass3IZ.A00(r4)
            if (r0 == 0) goto L_0x0180
            X.1GQ r2 = r5.A08
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r1 = r1.A00
            r0 = 1
            if (r1 <= r0) goto L_0x00a7
            X.0yC r1 = r2.A00
            goto L_0x0121
        L_0x0180:
            boolean r0 = r1.A0M()
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H2.BUv(android.view.Menu):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2H2(X.AnonymousClass01L r59, X.C19460v5 r60, X.C19460v5 r61, X.C19460v5 r62, X.C19460v5 r63, X.C57572yS r64, X.C57582yT r65, X.AnonymousClass3C4 r66, X.AnonymousClass3C5 r67, X.C58012zB r68, X.C225014r r69, X.AnonymousClass17Y r70, X.C19730wQ r71, X.C21100yf r72, X.AnonymousClass1X4 r73, X.AnonymousClass3CG r74, X.AnonymousClass1MK r75, X.C24361Cd r76, X.AnonymousClass1AO r77, X.AnonymousClass16I r78, X.AnonymousClass4V7 r79, X.AnonymousClass1NM r80, X.C21060yb r81, X.C19970wo r82, X.C19420v0 r83, X.C18820ts r84, X.AnonymousClass1DP r85, X.C220412q r86, X.AnonymousClass1A5 r87, X.AnonymousClass141 r88, X.C236419g r89, X.C20810yC r90, X.C20500xf r91, X.C233117z r92, X.AnonymousClass11F r93, X.C32641dx r94, X.AnonymousClass1GQ r95, X.C32241dD r96, X.AnonymousClass3G3 r97, X.AnonymousClass1CR r98, X.C26371Jx r99, X.C19770wU r100) {
        /*
            r58 = this;
            r5 = 1
            r20 = r90
            r0 = r20
            X.AnonymousClass00C.A0D(r0, r5)
            r23 = r86
            r49 = r70
            r6 = r100
            r25 = r71
            r2 = r25
            r1 = r23
            r0 = r49
            X.C36321k7.A19(r0, r2, r6, r1)
            r29 = r75
            r56 = r60
            r19 = r91
            r26 = r72
            r27 = r73
            r4 = r26
            r3 = r27
            r2 = r19
            r1 = r29
            r0 = r56
            X.C36321k7.A1C(r0, r4, r3, r2, r1)
            r1 = 11
            r24 = r84
            r0 = r24
            X.AnonymousClass00C.A0D(r0, r1)
            r34 = r80
            r32 = r78
            r31 = r77
            r30 = r76
            r16 = r98
            r4 = r31
            r3 = r32
            r2 = r34
            r1 = r16
            r0 = r30
            X.C36321k7.A1D(r4, r3, r2, r1, r0)
            r35 = r83
            r21 = r89
            r55 = r61
            r53 = r66
            r52 = r67
            r4 = r35
            r3 = r21
            r2 = r55
            r1 = r53
            r0 = r52
            X.C36321k7.A1E(r4, r2, r3, r1, r0)
            r1 = 22
            r22 = r87
            r0 = r22
            X.AnonymousClass00C.A0D(r0, r1)
            r54 = r62
            r18 = r92
            r10 = r64
            r51 = r68
            r3 = r99
            r2 = r18
            r1 = r51
            r0 = r54
            X.C36331k8.A1K(r3, r2, r1, r0, r10)
            r0 = 28
            r13 = r65
            X.AnonymousClass00C.A0D(r13, r0)
            r1 = 29
            r17 = r94
            r0 = r17
            X.AnonymousClass00C.A0D(r0, r1)
            r0 = 30
            r11 = r82
            X.AnonymousClass00C.A0D(r11, r0)
            r9 = r85
            r12 = r81
            r4 = r95
            r2 = r96
            r1 = r97
            X.C36361kB.A1N(r9, r2, r12, r1, r4)
            r0 = 36
            r14 = r63
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = 37
            r7 = r93
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 38
            r8 = r88
            X.AnonymousClass00C.A0D(r8, r0)
            r15 = 39
            r57 = r59
            r0 = r57
            X.AnonymousClass00C.A0D(r0, r15)
            r15 = 40
            r50 = r69
            r0 = r50
            X.AnonymousClass00C.A0D(r0, r15)
            r15 = 43
            r0 = r79
            X.AnonymousClass00C.A0D(r0, r15)
            r15 = r58
            r28 = r74
            r33 = r0
            r36 = r24
            r37 = r23
            r38 = r22
            r39 = r8
            r40 = r21
            r41 = r20
            r42 = r19
            r43 = r18
            r44 = r7
            r45 = r17
            r46 = r16
            r47 = r3
            r48 = r6
            r16 = r57
            r17 = r56
            r18 = r55
            r19 = r54
            r20 = r53
            r21 = r52
            r22 = r51
            r23 = r50
            r24 = r49
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r15.A07 = r11
            r15.A0C = r9
            r15.A09 = r2
            r15.A06 = r12
            r15.A0E = r1
            r15.A08 = r4
            r15.A0B = r14
            r15.A04 = r5
            X.01L r3 = r15.A05
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r3, r1)
            r2 = r3
            X.14u r2 = (X.C225314u) r2
            X.1Uw r0 = r15.A0J()
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r5 = X.C54902tk.A00(r10, r2, r0)
            r15.A0A = r5
            X.AnonymousClass00C.A0E(r3, r1)
            X.1Uw r1 = r15.A0J()
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A08(r1)
            r0 = 5
            X.04H r1 = X.AnonymousClass4ZD.A00(r2, r1, r8, r13, r0)
            java.lang.Class<X.2EJ> r0 = X.AnonymousClass2EJ.class
            X.04R r6 = r1.A00(r0)
            X.2EJ r6 = (X.AnonymousClass2EJ) r6
            r15.A0D = r6
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r15.A0A
            X.2La r0 = X.AnonymousClass3IZ.A00(r0)
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x0175
            X.0yC r1 = r4.A00
            r0 = 7245(0x1c4d, float:1.0152E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0175
            X.1Uw r3 = r15.A0J()
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.040 r2 = X.C109325Xd.A00(r6)
            r1 = 0
            com.whatsapp.newsletter.NewsletterInfoViewModel$fetchAdminCount$1 r0 = new com.whatsapp.newsletter.NewsletterInfoViewModel$fetchAdminCount$1
            r0.<init>(r3, r6, r1)
            X.C36331k8.A1T(r0, r2)
        L_0x0175:
            X.08S r0 = r5.A0U()
            java.lang.Object r0 = r0.A04()
            X.3IZ r0 = (X.AnonymousClass3IZ) r0
            r2 = 0
            if (r0 == 0) goto L_0x018b
            X.2La r1 = r0.A00
            boolean r0 = r0.A01
            X.3IZ r2 = new X.3IZ
            r2.<init>(r1, r0)
        L_0x018b:
            r15.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H2.<init>(X.01L, X.0v5, X.0v5, X.0v5, X.0v5, X.2yS, X.2yT, X.3C4, X.3C5, X.2zB, X.14r, X.17Y, X.0wQ, X.0yf, X.1X4, X.3CG, X.1MK, X.1Cd, X.1AO, X.16I, X.4V7, X.1NM, X.0yb, X.0wo, X.0v0, X.0ts, X.1DP, X.12q, X.1A5, X.141, X.19g, X.0yC, X.0xf, X.17z, X.11F, X.1dx, X.1GQ, X.1dD, X.3G3, X.1CR, X.1Jx, X.0wU):void");
    }
}
