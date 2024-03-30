package com.whatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass1M4;
import X.AnonymousClass1N4;
import X.AnonymousClass22g;
import X.AnonymousClass3UF;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C37811nF;
import X.C39591sn;
import X.C65993Ug;
import X.C88354Sj;
import X.C89354Wf;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public class CountryPicker extends AnonymousClass22g implements C88354Sj {
    public View A00;
    public View A01;
    public Toolbar A02;
    public AnonymousClass1N4 A03;
    public C37811nF A04;
    public AnonymousClass1M4 A05;
    public C39591sn A06;
    public boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00df, code lost:
        if (X.C201129iv.A00(r2, r1) == false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            super.onCreate(r0)
            X.C36331k8.A0n(r15)
            r0 = 2131893045(0x7f121b35, float:1.9420855E38)
            r4 = 2131893045(0x7f121b35, float:1.9420855E38)
            r15.setTitle(r0)
            r0 = 2131624751(0x7f0e032f, float:1.887669E38)
            r15.setContentView((int) r0)
            X.C36331k8.A0n(r15)
            r0 = 2131434753(0x7f0b1d01, float:1.8491329E38)
            android.view.View r0 = r15.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r15.A02 = r0
            android.content.Context r0 = r15.getApplicationContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r1 = r0.hasPermanentMenuKey()
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r15.setSupportActionBar(r0)
            r5 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0045
            X.07B r0 = X.C36381kD.A0O(r15)
            r0.A0U(r3)
            r0.A0X(r5)
        L_0x0045:
            X.0ts r2 = r15.A00
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r15, r0)
            X.4vb r1 = new X.4vb
            r1.<init>(r0, r2)
            r0 = 2131101102(0x7f0605ae, float:1.7814604E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A04(r15, r1, r0)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r1)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setTitle((int) r4)
            X.1M4 r1 = r15.A05
            X.0ts r0 = r15.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r0 = X.C26621Kw.A05(r0)
            java.util.List r1 = X.AnonymousClass1M4.A02(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0086
            X.1M4 r1 = r15.A05
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.C26621Kw.A05(r0)
            java.util.List r1 = X.AnonymousClass1M4.A02(r1, r0)
        L_0x0086:
            java.util.ArrayList r14 = X.C36361kB.A0r(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x008e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r2 = r9.next()
            X.35o r2 = (X.C598635o) r2
            X.1N4 r0 = r15.A03
            java.lang.String r7 = r2.A00
            X.3O9 r8 = r0.A02(r7)
            if (r8 != 0) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "countrypicker/oncreate saw unknown country "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            X.C36341k9.A1O(r1, r0)
            goto L_0x008e
        L_0x00bb:
            java.lang.String r6 = r2.A01
            java.lang.String r4 = r8.A03
            boolean r0 = r6.equals(r4)
            if (r0 != 0) goto L_0x00e1
            X.9iv r0 = X.C201129iv.A04
            int r1 = r4.codePointAt(r5)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L_0x00e2
            X.9iv r2 = X.C201129iv.A05
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L_0x00f1
            char r0 = (char) r1
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x00db:
            boolean r0 = X.C201129iv.A00(r2, r1)
            if (r0 != 0) goto L_0x00e2
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            int r0 = r8.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.3EW r0 = new X.3EW
            r0.<init>(r6, r4, r1, r7)
            r14.add(r0)
            goto L_0x008e
        L_0x00f1:
            char[] r0 = java.lang.Character.toChars(r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x00db
        L_0x00fb:
            X.0ts r0 = r15.A00
            java.util.Locale r1 = X.C36401kF.A0x(r0)
            X.3xA r0 = new X.3xA
            r0.<init>(r15, r1)
            java.util.Collections.sort(r14, r0)
            X.0yb r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            if (r0 == 0) goto L_0x0135
            java.lang.String r4 = r0.getSimCountryIso()
            if (r4 == 0) goto L_0x0135
            java.util.Iterator r2 = r14.iterator()
        L_0x011b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r1 = r2.next()
            X.3EW r1 = (X.AnonymousClass3EW) r1
            java.lang.String r0 = r1.A03
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x011b
            r2.remove()
            r14.add(r5, r1)
        L_0x0135:
            android.widget.ListView r2 = r15.getListView()
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_iso"
            java.lang.String r12 = r1.getStringExtra(r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_display_name"
            java.lang.String r13 = r1.getStringExtra(r0)
            X.1nF r9 = new X.1nF
            r11 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A04 = r9
            r15.A3i(r9)
            r0 = 10
            X.C89594Xd.A00(r2, r15, r0)
            r2.setFastScrollEnabled(r3)
            r2.setScrollbarFadingEnabled(r3)
            r2.setFastScrollAlwaysVisible(r3)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2.setScrollBarStyle(r0)
            X.0ts r0 = r15.A00
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 == 0) goto L_0x0189
            r2.setVerticalScrollbarPosition(r3)
        L_0x0176:
            r0 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A01 = r0
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A00 = r0
            return
        L_0x0189:
            r0 = 2
            r2.setVerticalScrollbarPosition(r0)
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryPicker.onCreate(android.os.Bundle):void");
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass22g.A0l(this);
            this.A05 = C36361kB.A0f(A0B);
            this.A03 = C36351kA.A0K(A0B);
        }
    }

    public CountryPicker(int i) {
        this.A07 = false;
        C89354Wf.A00(this, 11);
    }

    public static void A0u(CountryPicker countryPicker) {
        AnonymousClass01z supportFragmentManager = countryPicker.getSupportFragmentManager();
        if (!supportFragmentManager.A0r()) {
            AnonymousClass02E A0N = supportFragmentManager.A0N("search_fragment");
            if (A0N != null) {
                ((WDSSearchViewFragment) A0N).A1Z();
            }
            countryPicker.getSupportFragmentManager().A0n("search_fragment", 1);
            C36341k9.A0y(countryPicker.A01);
            countryPicker.A02.setVisibility(0);
            countryPicker.A00.setVisibility(0);
            C36331k8.A0n(countryPicker);
        }
    }

    public static boolean A0v(CountryPicker countryPicker) {
        AnonymousClass02E A0N;
        AnonymousClass01z supportFragmentManager = countryPicker.getSupportFragmentManager();
        if (supportFragmentManager.A0I() != 1 || (A0N = supportFragmentManager.A0N("search_fragment")) == null || !A0N.A15()) {
            return false;
        }
        return true;
    }

    public C39591sn BH4() {
        return this.A06;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onBackPressed() {
        if (A0v(this)) {
            A0u(this);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        C36411kG.A0I(menu).setIcon(AnonymousClass3UF.A04(this, C36381kD.A0H(this, R.drawable.ic_action_search_teal), R.color.f6nameremoved)).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("item.getItemId()");
        A0u.append(menuItem.getItemId());
        C36331k8.A1S(A0u, AnonymousClass000.A1S(menuItem.getItemId(), R.id.menuitem_search));
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
        } else if (itemId == R.id.menuitem_search) {
            if (!A0v(this)) {
                if (this.A06 == null) {
                    C39591sn r2 = (C39591sn) C36441kJ.A0b(this).A00(C39591sn.class);
                    this.A06 = r2;
                    r2.A00.A08(this, new C65993Ug(this, 28));
                    C39591sn r22 = this.A06;
                    r22.A01.A08(this, new C65993Ug(this, 29));
                }
                this.A02.setVisibility(8);
                this.A00.setVisibility(8);
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                    this.A01.setElevation(0.0f);
                }
                AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
                WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) supportFragmentManager.A0N("search_fragment");
                if (wDSSearchViewFragment == null) {
                    wDSSearchViewFragment = new WDSSearchViewFragment();
                    AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
                    r1.A0G = true;
                    r1.A0F(wDSSearchViewFragment, "search_fragment", R.id.search_holder);
                    r1.A0J("search_fragment");
                    r1.A01();
                    supportFragmentManager.A0T();
                }
                WDSConversationSearchView wDSConversationSearchView = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A02();
                }
                WDSConversationSearchView wDSConversationSearchView2 = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView2 != null) {
                    wDSConversationSearchView2.setHint((int) R.string.f12nameremoved);
                }
                return true;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.A02.getHeight()), 0.0f);
            translateAnimation.setDuration(250);
            this.A01.clearAnimation();
            this.A01.startAnimation(translateAnimation);
            return true;
        }
        return false;
    }

    public CountryPicker() {
        this(0);
    }
}
