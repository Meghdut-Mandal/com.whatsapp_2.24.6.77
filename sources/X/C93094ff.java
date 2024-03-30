package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4ff  reason: invalid class name and case insensitive filesystem */
public final class C93094ff extends LinearLayout implements C18700tb {
    public int A00;
    public int A01;
    public C32691e2 A02;
    public C18820ts A03;
    public AnonymousClass7d2 A04;
    public C123435wU A05;
    public C1262663f A06;
    public AnonymousClass1Z5 A07;
    public C33041ec A08;
    public AnonymousClass1QZ A09;
    public boolean A0A;
    public ImageView A0B;
    public C134856bi A0C;
    public final AnonymousClass01z A0D;
    public final ViewStub A0E;
    public final LinearLayout A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final Toolbar A0J;
    public final AppBarLayout A0K;
    public final WDSButton A0L;
    public final WDSButton A0M;

    public C93094ff(Context context, AnonymousClass01z r7) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            C27861Qc r3 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r4 = r3.A0M;
            this.A02 = (C32691e2) r4.A4R.get();
            this.A03 = C36341k9.A0T(r4);
            this.A06 = (C1262663f) r3.A0G.get();
            C18830tt r2 = r4.A00;
            this.A05 = (C123435wU) r2.AB3.get();
            this.A07 = (AnonymousClass1Z5) r4.A6i.get();
            this.A08 = (C33041ec) r2.A4G.get();
            this.A04 = (AnonymousClass7d2) r3.A05.get();
        }
        this.A0D = r7;
        this.A00 = -1;
        this.A01 = -1;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        this.A0E = (ViewStub) C36361kB.A0F(this, R.id.privacy_disclosure_head_icon_view_stub);
        TextView A0F2 = C36351kA.A0F(this, R.id.title);
        this.A0I = A0F2;
        this.A0G = C36351kA.A0F(this, R.id.body);
        this.A0L = (WDSButton) C36361kB.A0F(this, R.id.button_primary);
        this.A0M = (WDSButton) C36361kB.A0F(this, R.id.button_secondary);
        this.A0H = C36351kA.A0F(this, R.id.footer);
        this.A0K = (AppBarLayout) C36361kB.A0F(this, R.id.appbar);
        this.A0J = (Toolbar) C36361kB.A0F(this, R.id.toolbar);
        this.A0F = (LinearLayout) C36361kB.A0F(this, R.id.privacy_disclosure_bullets);
        C33521fV.A07(A0F2, true);
    }

    public static final void setupToolBarAndTopView$lambda$5$lambda$3(C93094ff r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        C55062u0.A00(r1.A0D, C52002oj.RESULT_BACK);
    }

    public final void setBulletViewFactory(AnonymousClass7d2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setImageLoader(C123435wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkLauncher(C32691e2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setPrivacyDisclosureLogger(AnonymousClass1Z5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setUiUtils(C1262663f r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setUserNoticeActionHandler(C33041ec r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    private final void setupToolBarAndTopView(C134566bF r7, AppBarLayout appBarLayout, Toolbar toolbar, View view) {
        Context context;
        boolean z;
        int i;
        if (view != null && (context = getContext()) != null) {
            getUiUtils();
            C18820ts whatsAppLocale = getWhatsAppLocale();
            AnonymousClass3Y5 r4 = new AnonymousClass3Y5(this, 15);
            C36331k8.A1G(appBarLayout, 3, toolbar);
            if (r7 == null || !r7.A00) {
                appBarLayout.setVisibility(8);
                toolbar.setVisibility(8);
                z = false;
            } else {
                appBarLayout.setVisibility(0);
                toolbar.setVisibility(0);
                C100744vb A002 = C91364bt.A00(context, whatsAppLocale, R.drawable.ic_close);
                C90484aE.A15(context.getResources(), A002, R.color.f6nameremoved);
                toolbar.setNavigationIcon((Drawable) A002);
                toolbar.setNavigationOnClickListener(r4);
                z = true;
            }
            AnonymousClass3QI A012 = C65723Tf.A01(view);
            if (!z) {
                i = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            } else {
                i = 0;
            }
            A012.A03 = i;
            C65723Tf.A02(view, A012);
        }
    }

    public final void A00(C134856bi r36, int i, int i2) {
        String str;
        String str2;
        C134816be r2;
        View inflate;
        int i3;
        int i4 = i;
        this.A00 = i4;
        this.A01 = i2;
        ViewStub viewStub = this.A0E;
        C134856bi r1 = r36;
        if (!(viewStub.getParent() == null || (r2 = r1.A02) == null)) {
            if (AnonymousClass00C.A0J(r2.A04, "lottie")) {
                viewStub.setLayoutResource(R.layout.f9nameremoved);
                inflate = viewStub.inflate();
                i3 = R.id.privacy_disclosure_head_icon_animation_view;
            } else {
                viewStub.setLayoutResource(R.layout.f9nameremoved);
                inflate = viewStub.inflate();
                i3 = R.id.privacy_disclosure_head_icon_view;
            }
            ImageView A0G2 = C36401kF.A0G(inflate, i3);
            AnonymousClass00C.A0B(A0G2);
            if (A0G2 != null) {
                this.A0B = A0G2;
            }
        }
        setupToolBarAndTopView(r1.A03, this.A0K, this.A0J, this.A0B);
        C1262663f uiUtils = getUiUtils();
        Context A0B2 = C36371kC.A0B(this);
        C134816be r4 = r1.A02;
        ImageView imageView = this.A0B;
        if (imageView != null) {
            if (r4 != null) {
                if (AnonymousClass1RC.A0A(A0B2)) {
                    str2 = r4.A02;
                } else {
                    str2 = r4.A03;
                }
                if (str2 != null) {
                    AnonymousClass6TW A002 = C111325c6.A00(A0B2, r4.A00, r4.A01);
                    int i5 = R.dimen.f7nameremoved;
                    if (A002 == null) {
                        i5 = R.dimen.f7nameremoved;
                    }
                    int A032 = C36371kC.A03(imageView, i5);
                    C123425wT r10 = uiUtils.A00;
                    String str3 = r4.A04;
                    AnonymousClass6AV r9 = new AnonymousClass6AV(C108035Rx.HEAD, 0);
                    Resources resources = imageView.getResources();
                    r10.A03.A03(new AnonymousClass74I(A0B2, resources, imageView, r9, r10, A002, str2, str3, i4, A032, A032), AnonymousClass19R.A01);
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        getUiUtils().A00(C36371kC.A0B(this), this.A0I, getUserNoticeActionHandler(), r1.A08);
        getUiUtils().A00(C36371kC.A0B(this), this.A0G, getUserNoticeActionHandler(), r1.A05);
        getUiUtils();
        Context A0B3 = C36371kC.A0B(this);
        LinearLayout linearLayout = this.A0F;
        C134706bT[] r92 = r1.A09;
        AnonymousClass7d2 bulletViewFactory = getBulletViewFactory();
        AnonymousClass00C.A0D(linearLayout, 2);
        int length = r92.length;
        int i6 = 0;
        if (length == 0) {
            i6 = 8;
        }
        linearLayout.setVisibility(i6);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            C134706bT r5 = r92[i7];
            int i9 = i8 + 1;
            C27871Qd r42 = ((C147516xL) bulletViewFactory).A00;
            C27861Qc r3 = r42.A02;
            C92994fM r29 = new C92994fM(A0B3, (C123425wT) r3.A0F.get(), (C1262663f) r3.A0G.get(), (C33041ec) r42.A01.A00.A4G.get(), i8);
            C134816be r11 = r5.A00;
            if (r11 != null) {
                if (AnonymousClass1RC.A0A(A0B3)) {
                    str = r11.A02;
                } else {
                    str = r11.A03;
                }
                String str4 = r11.A04;
                int dimensionPixelSize = r29.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                if (str != null) {
                    C123425wT r15 = r29.A04;
                    Context A0B4 = C36371kC.A0B(r29);
                    WaImageView waImageView = r29.A00;
                    AnonymousClass6AV r13 = new AnonymousClass6AV(C108035Rx.BULLET, r29.A03);
                    AnonymousClass00C.A0D(waImageView, 1);
                    Resources resources2 = waImageView.getResources();
                    r15.A03.A03(new AnonymousClass74I(A0B4, resources2, waImageView, r13, r15, (AnonymousClass6TW) null, str, str4, i4, dimensionPixelSize, dimensionPixelSize), AnonymousClass19R.A01);
                }
            }
            r29.setText(r5.A01);
            r29.setSecondaryText(r5.A02);
            r29.setItemPaddingIfNeeded(AnonymousClass000.A1T(i8, length - 1));
            linearLayout.addView(r29);
            i7++;
            i8 = i9;
        }
        getUiUtils().A00(C36371kC.A0B(this), this.A0H, getUserNoticeActionHandler(), r1.A06);
        C134636bM r52 = r1.A00;
        WDSButton wDSButton = this.A0L;
        wDSButton.setVisibility(0);
        wDSButton.setText(r52.A01);
        wDSButton.setOnClickListener(new AnonymousClass3YK(this, r52, 2, false));
        C134636bM r53 = r1.A01;
        if (r53 != null) {
            WDSButton wDSButton2 = this.A0M;
            wDSButton2.setVisibility(0);
            wDSButton2.setText(r53.A01);
            wDSButton2.setOnClickListener(new AnonymousClass3YK(this, r53, 2, true));
        }
        this.A0C = r1;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass7d2 getBulletViewFactory() {
        AnonymousClass7d2 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("bulletViewFactory");
    }

    public final C123435wU getImageLoader() {
        C123435wU r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("imageLoader");
    }

    public final C32691e2 getLinkLauncher() {
        C32691e2 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkLauncher");
    }

    public final AnonymousClass1Z5 getPrivacyDisclosureLogger() {
        AnonymousClass1Z5 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("privacyDisclosureLogger");
    }

    public final C1262663f getUiUtils() {
        C1262663f r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("uiUtils");
    }

    public final C33041ec getUserNoticeActionHandler() {
        C33041ec r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("userNoticeActionHandler");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }
}
