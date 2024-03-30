package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass07B;
import X.AnonymousClass088;
import X.AnonymousClass09T;
import X.AnonymousClass11F;
import X.AnonymousClass15L;
import X.AnonymousClass22B;
import X.AnonymousClass2UK;
import X.AnonymousClass2UO;
import X.AnonymousClass2XU;
import X.AnonymousClass2XV;
import X.AnonymousClass2bU;
import X.AnonymousClass3CG;
import X.AnonymousClass3DR;
import X.AnonymousClass3U9;
import X.AnonymousClass3XV;
import X.AnonymousClass4R6;
import X.AnonymousClass4ZQ;
import X.AnonymousClass755;
import X.C011004s;
import X.C012005e;
import X.C02460Ak;
import X.C135466ck;
import X.C18740tg;
import X.C19550w8;
import X.C207269up;
import X.C20830yE;
import X.C222013h;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C51022n1;
import X.C74963mS;
import X.C88804Uc;
import X.C88934Up;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.components.InsetsDrawingView;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

public abstract class MediaViewBaseFragment extends WaFragment implements AnonymousClass4R6 {
    public Bundle A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public TextView A05;
    public TextEmojiLabel A06;
    public InsetsDrawingView A07;
    public AnonymousClass2UK A08;
    public AnonymousClass4R6 A09;
    public AnonymousClass3U9 A0A;
    public AnonymousClass3DR A0B;
    public Runnable A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = true;
    public AnonymousClass22B A0H;
    public boolean A0I = false;
    public OutOfMemoryError A0J;

    public PhotoView A1a(ViewGroup viewGroup) {
        PhotoView A1a;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof PhotoView) {
                return (PhotoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (A1a = A1a((ViewGroup) childAt)) != null) {
                return A1a;
            }
        }
        return null;
    }

    public PhotoView A1b(Object obj) {
        if (obj != null) {
            View findViewWithTag = this.A08.findViewWithTag(obj);
            if (findViewWithTag instanceof ViewGroup) {
                return A1a((ViewGroup) findViewWithTag);
            }
        }
        return null;
    }

    public static void A03(Activity activity) {
        if (AnonymousClass3U9.A00) {
            Window window = activity.getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
    }

    public void A1H() {
        if (this.A08 != null) {
            for (int i = 0; i < this.A08.getChildCount(); i++) {
                View childAt = this.A08.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A07();
                        }
                        i2++;
                    }
                }
            }
        }
        super.A1H();
    }

    public void A1J() {
        this.A04.removeView(this.A08);
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A07 = null;
        super.A1J();
    }

    public C20830yE A1Z() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A0i;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            return ((LinkedAccountMediaViewFragment) this).A0B;
        }
        C20830yE r0 = ((CatalogMediaViewFragment) this).A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("permissionsHelper");
    }

    public Object A1c() {
        if (this instanceof MediaViewFragment) {
            AnonymousClass2bU r0 = ((MediaViewFragment) this).A1R;
            if (r0 == null) {
                return null;
            }
            return r0.A1J;
        } else if (!(this instanceof LinkedAccountMediaViewFragment)) {
            return ((CatalogMediaViewFragment) this).A09;
        } else {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            return ((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(linkedAccountMediaViewFragment.A03)).A01.A04;
        }
    }

    public Object A1d() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A1Q;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            return ((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(linkedAccountMediaViewFragment.A03)).A01.A04;
        }
        CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
        C207269up r0 = catalogMediaViewFragment.A03;
        if (r0 == null) {
            throw C36331k8.A0d("product");
        }
        String str = r0.A0F;
        String A0r = AnonymousClass000.A0r("_", AnonymousClass000.A0v(str), catalogMediaViewFragment.A00);
        AnonymousClass00C.A08(A0r);
        return A0r;
    }

    public Object A1e(int i) {
        if (this instanceof MediaViewFragment) {
            AnonymousClass2bU A072 = MediaViewFragment.A07((MediaViewFragment) this, i);
            if (A072 != null) {
                return A072.A1J;
            }
            return null;
        } else if (this instanceof LinkedAccountMediaViewFragment) {
            return ((AnonymousClass3XV) ((LinkedAccountMediaViewFragment) this).A0G.get(i)).A01.A04;
        } else {
            C207269up r0 = ((CatalogMediaViewFragment) this).A03;
            if (r0 == null) {
                throw C36331k8.A0d("product");
            }
            String A0r = AnonymousClass000.A0r("_", AnonymousClass000.A0v(r0.A0F), i);
            AnonymousClass00C.A08(A0r);
            return A0r;
        }
    }

    public void A1i() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            AnonymousClass755 r1 = mediaViewFragment.A0A;
            if (r1 != null) {
                r1.A03 = true;
                ((Thread) r1.A02).interrupt();
                mediaViewFragment.A0A = null;
            }
            C88934Up r0 = mediaViewFragment.A1C;
            if (r0 != null) {
                r0.Bv6();
            }
            mediaViewFragment.A1f();
            return;
        }
        A1f();
    }

    public void A1j() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            if (mediaViewFragment.A1R != null) {
                mediaViewFragment.A1f();
            } else {
                mediaViewFragment.A1g();
            }
        } else {
            A1i();
        }
    }

    public void A1k() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            if (mediaViewFragment.A13 == null || (mediaViewFragment.A1y && mediaViewFragment.A1R != null)) {
                mediaViewFragment.A1i();
                return;
            }
            mediaViewFragment.A1R = null;
            Context A0a = mediaViewFragment.A0a();
            AnonymousClass11F r3 = mediaViewFragment.A13;
            Intent A0D2 = C36431kI.A0D();
            C36331k8.A0v(A0D2, r3, A0a.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
            mediaViewFragment.A1C(A0D2);
            mediaViewFragment.A1g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (com.whatsapp.mediaview.MediaViewFragment) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1l(int r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x0036
            r2 = r3
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            X.01I r0 = r2.A0h()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0036
            X.4Up r0 = r2.A1C
            if (r0 == 0) goto L_0x001a
            r0.getCount()
        L_0x001a:
            r2.A03 = r4
            r2.A1h()
            X.2UK r1 = r2.A08
            r0 = 0
            r1.A0J(r4, r0)
            com.whatsapp.mediaview.MediaViewFragment.A0K(r2, r4, r5)
            X.01I r0 = r2.A0i()
            r0.invalidateOptionsMenu()
            android.view.View r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.A1l(int, boolean):void");
    }

    public void A1m(C88804Uc r3) {
        AnonymousClass22B r1 = new AnonymousClass22B(r3, this);
        this.A0H = r1;
        this.A08.setAdapter(r1);
        this.A08.A0J(0, false);
    }

    public void A1n(boolean z, int i) {
        AlphaAnimation alphaAnimation;
        int childCount = this.A08.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = this.A08.getChildAt(i2).findViewById(R.id.footer);
            int visibility = findViewById.getVisibility();
            if (z) {
                if (visibility != 0) {
                    alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    findViewById.setVisibility(0);
                }
            } else if (visibility != 4) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                findViewById.setVisibility(4);
            }
            if (i > 0) {
                alphaAnimation.setDuration((long) i);
                findViewById.startAnimation(alphaAnimation);
            }
        }
    }

    public void A1o(boolean z, boolean z2) {
        AlphaAnimation alphaAnimation;
        AnonymousClass01I A0h;
        if (!this.A0D && this.A0G != z) {
            this.A0G = z;
            A1n(z, 400);
            int i = 4;
            if (this.A0G) {
                i = 0;
            }
            if (!z) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(250);
            if (this.A02.getVisibility() != i) {
                this.A02.setVisibility(i);
                this.A02.startAnimation(alphaAnimation);
            }
            if (this.A03.getVisibility() != i) {
                this.A03.setVisibility(i);
                this.A03.startAnimation(alphaAnimation);
            }
            if (this.A07.getVisibility() != i) {
                this.A07.setVisibility(i);
                this.A07.startAnimation(alphaAnimation);
            }
            if (z2 && (A0h = A0h()) != null) {
                boolean z3 = this.A0G;
                int i2 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
                if (!z3) {
                    i2 = 1285;
                }
                int i3 = i2 | EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH | 512;
                if (!z3) {
                    i3 |= 2;
                }
                C36361kB.A0C(A0h).setSystemUiVisibility(i3);
            }
        }
    }

    public void Bjb(boolean z) {
        Runnable runnable = this.A0C;
        if (runnable != null && z) {
            runnable.run();
        }
        this.A0D = false;
        AnonymousClass4R6 r0 = this.A09;
        if (r0 != null) {
            r0.Bjb(z);
            this.A09 = null;
        }
        if (this.A0E && this.A0I) {
            A1o(true, true);
        }
    }

    public static void A05(View view, MediaViewBaseFragment mediaViewBaseFragment) {
        AnonymousClass3DR r6;
        View findViewById = view.findViewById(R.id.footer);
        if (findViewById != null && (r6 = mediaViewBaseFragment.A0B) != null) {
            AnonymousClass09T r4 = r6.A01;
            AnonymousClass09T A002 = AnonymousClass09T.A00(r4.A01, 0, r4.A02, 0);
            AnonymousClass09T A003 = r6.A00();
            AnonymousClass09T A004 = AnonymousClass09T.A00(A003.A01, 0, A003.A02, 0);
            AnonymousClass09T A005 = AnonymousClass09T.A00(0, 0, 0, AnonymousClass09T.A02(r6.A00, r4).A00);
            ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(findViewById);
            A0K.leftMargin = A002.A01;
            A0K.topMargin = A002.A03;
            A0K.rightMargin = A002.A02;
            A0K.bottomMargin = A002.A00;
            findViewById.setLayoutParams(A0K);
            AnonymousClass09T A006 = AnonymousClass09T.A00(A004.A01 + A005.A01, A004.A03 + A005.A03, A004.A02 + A005.A02, A004.A00 + A005.A00);
            findViewById.setPadding(A006.A01, A006.A03, A006.A02, A006.A00);
        }
    }

    public void A1B() {
        super.A1B();
        A1o(true, true);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        } catch (OutOfMemoryError e) {
            this.A0J = e;
            return null;
        }
    }

    public void A1L() {
        super.A1L();
        if (!this.A0F) {
            if (!RequestPermissionActivity.A0B.A0J(A0a(), A1Z())) {
                this.A0F = true;
                A1g();
            }
        }
        A1o(true, true);
    }

    public void A1O(Context context) {
        super.A1O(context);
        if ((this instanceof MediaViewFragment) || (this instanceof LinkedAccountMediaViewFragment) || ((CatalogMediaViewFragment) this).A01 != null) {
            C24801Dv.A04(C36431kI.A0N(this));
            return;
        }
        throw C36331k8.A0d("androidActivityUtils");
    }

    public void A1Q(Bundle bundle) {
        AnonymousClass3U9 r0;
        AnonymousClass3CG r1 = new AnonymousClass3CG(A0i());
        if (AnonymousClass3U9.A00) {
            r0 = new AnonymousClass2XV(r1, this);
        } else {
            r0 = new AnonymousClass2XU(this);
        }
        this.A0A = r0;
        super.A1Q(bundle);
        if (!this.A0F) {
            if (!RequestPermissionActivity.A0B.A0J(A0a(), A1Z())) {
                this.A0F = true;
                A1g();
            }
        }
        this.A08 = new AnonymousClass2UK(A0a(), this);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null) {
            A1g();
        } else {
            this.A00 = bundle2.getBundle("animation_bundle");
        }
    }

    public void A1S(Bundle bundle, View view) {
        ViewGroup A0O = C36411kG.A0O(A0d(), R.id.toolbar_container);
        this.A03 = A0O;
        A0O.setFitsSystemWindows(false);
        Toolbar toolbar = (Toolbar) C012005e.A02(this.A03, R.id.toolbar);
        toolbar.A0F();
        ((AnonymousClass01L) A0i()).setSupportActionBar(toolbar);
        AnonymousClass07B A0O2 = C36381kD.A0O((AnonymousClass01L) A0i());
        A0O2.A0X(false);
        A0O2.A0U(true);
        toolbar.setNavigationOnClickListener(new C135466ck(this, 40));
        View A0J2 = C36431kI.A0J(LayoutInflater.from(((AnonymousClass01L) A0i()).getSupportActionBar().A0A()), R.layout.f9nameremoved);
        View A022 = C012005e.A02(A0J2, R.id.title_holder);
        A022.setClickable(true);
        A022.setOnClickListener(new C135466ck(this, 41));
        this.A06 = C36401kF.A0O(A022, R.id.contact_name);
        this.A05 = C36391kE.A0O(A022, R.id.date_time);
        if ((this instanceof MediaViewFragment) || (this instanceof LinkedAccountMediaViewFragment) || ((CatalogMediaViewFragment) this).A07 != null) {
            if (C222013h.A0C) {
                AnonymousClass088.A06(this.A06, R.style.f13nameremoved);
                AnonymousClass088.A06(this.A05, R.style.f13nameremoved);
                int A002 = AnonymousClass00F.A00(A0a(), C51022n1.A00.A00);
                this.A06.setTextColor(A002);
                this.A05.setTextColor(A002);
            }
            this.A01 = C012005e.A02(A0J2, R.id.progress_bar);
            A0O2.A0V(true);
            A0O2.A0N(A0J2);
            this.A07 = (InsetsDrawingView) C012005e.A02(view, R.id.insets_view);
            this.A02 = C012005e.A02(view, R.id.title_protection);
            ViewGroup A0O3 = C36411kG.A0O(view, R.id.pager_container);
            this.A04 = A0O3;
            A0O3.addView(this.A08);
            C36361kB.A0C(A0i()).setSystemUiVisibility(1792);
            View view2 = C36431kI.A0U(this).A00;
            C18740tg.A04(view2);
            C011004s.A07(view2, new AnonymousClass4ZQ(this, 2));
            View findViewById = view.findViewById(R.id.background);
            findViewById.setBackground(new ColorDrawable(-16777216));
            AnonymousClass2UO r1 = new AnonymousClass2UO(A0a(), this);
            r1.A01 = 0.5f;
            r1.A07 = true;
            r1.A05 = new C74963mS(findViewById, this);
            ((C02460Ak) this.A04.getLayoutParams()).A00(r1);
            onConfigurationChanged(C36341k9.A0G(this).getConfiguration());
            this.A0I = true;
            return;
        }
        throw C36331k8.A0d("props");
    }

    public void A1f() {
        AnonymousClass15L r0 = (AnonymousClass15L) A0h();
        if (r0 != null) {
            r0.BVx();
        }
        Bundle bundle = this.A00;
        if (bundle != null) {
            this.A0D = true;
            this.A0A.A0C(bundle);
            return;
        }
        A1g();
    }

    public void A1g() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null && !A0h.isFinishing()) {
            if (A0i() instanceof AnonymousClass15L) {
                ((AnonymousClass15L) A0i()).Ban();
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("mediaview/finish called from non-host activity: ");
            C36321k7.A1Z(A0u, A0i().getLocalClassName());
            A0i().finish();
        }
    }

    public void A1h() {
        AnonymousClass22B r0;
        if (A0h() != null && (r0 = this.A0H) != null) {
            r0.A09();
        }
    }

    public boolean A1p() {
        AnonymousClass01I A0h = A0h();
        if (!(A0h instanceof AnonymousClass15L) || !((AnonymousClass15L) A0h).Bta()) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Window A0N = C36431kI.A0N(this);
        A0N.setStatusBarColor(0);
        A0N.setNavigationBarColor(0);
        if (C19550w8.A06()) {
            A0N.setStatusBarContrastEnforced(false);
            A0N.setNavigationBarContrastEnforced(false);
        }
        A0N.addFlags(Integer.MIN_VALUE);
    }
}
