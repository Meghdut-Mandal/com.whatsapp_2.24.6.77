package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass141;
import X.AnonymousClass16A;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1KK;
import X.AnonymousClass1KP;
import X.AnonymousClass1N6;
import X.AnonymousClass1NG;
import X.AnonymousClass1NM;
import X.AnonymousClass2ZL;
import X.AnonymousClass3LW;
import X.AnonymousClass4PE;
import X.AnonymousClass6VE;
import X.AnonymousClass8VJ;
import X.AnonymousClass8W7;
import X.AnonymousClass8WM;
import X.AnonymousClass9DS;
import X.AnonymousClass9R0;
import X.AnonymousClass9R1;
import X.AnonymousClass9RM;
import X.AnonymousClass9RN;
import X.AnonymousClass9ZO;
import X.B7Y;
import X.B83;
import X.B8F;
import X.B93;
import X.B9J;
import X.BA6;
import X.BAP;
import X.C131496Pg;
import X.C157967fa;
import X.C165567td;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C167507yA;
import X.C167637yT;
import X.C178358fo;
import X.C18800tq;
import X.C18830tt;
import X.C191469Db;
import X.C191479Dc;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C195119So;
import X.C199439fJ;
import X.C207109uZ;
import X.C22909AyL;
import X.C22919AyV;
import X.C23026B0w;
import X.C26421Kc;
import X.C27111My;
import X.C27261Nn;
import X.C29461Ws;
import X.C31771cM;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C48732hx;
import X.C61223Ba;
import X.C65443Sb;
import X.C90504aG;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public class CatalogListActivity extends AnonymousClass8W7 implements C157967fa, C23026B0w, C22919AyV {
    public C19460v5 A00;
    public C19460v5 A01;
    public C191469Db A02;
    public C191479Dc A03;
    public WaTextView A04;
    public WaTextView A05;
    public C167637yT A06;
    public AnonymousClass9RM A07;
    public PostcodeChangeBottomSheet A08;
    public AnonymousClass9RN A09;
    public C199439fJ A0A;
    public AnonymousClass1NG A0B;
    public C131496Pg A0C;
    public AnonymousClass9ZO A0D;
    public AnonymousClass16D A0E;
    public AnonymousClass171 A0F;
    public AnonymousClass1NM A0G;
    public C61223Ba A0H;
    public AnonymousClass1N6 A0I;
    public WDSButton A0J;
    public boolean A0K;
    public final AnonymousClass16A A0L;

    public boolean A2g() {
        return true;
    }

    public void Bd7() {
        this.A08 = null;
    }

    public static void A01(CatalogListActivity catalogListActivity) {
        if (catalogListActivity.A0H.A00.size() > 0) {
            catalogListActivity.A0H.A00.clear();
            catalogListActivity.A0H.A06();
            catalogListActivity.A0H.A0Q();
        }
        AnonymousClass8VJ r3 = catalogListActivity.A0H;
        int i = 0;
        do {
            List list = r3.A00;
            list.add(new AnonymousClass8WM());
            r3.A08(C36431kI.A07(list));
            i++;
        } while (i < 3);
        C167507yA r32 = catalogListActivity.A0I;
        UserJid userJid = catalogListActivity.A0L;
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass1KK r1 = r32.A0F;
        if ((r1.A03.A00() & 128) > 0) {
            r1.A0B(r32, userJid);
        } else {
            r32.Bbk((C207109uZ) null);
        }
        catalogListActivity.A0I.A0E.A00();
    }

    public static void A0F(CatalogListActivity catalogListActivity) {
        if (catalogListActivity.A0H.A07.isEmpty() || !catalogListActivity.A0H.B9S()) {
            catalogListActivity.A0J.setVisibility(8);
            return;
        }
        catalogListActivity.A0J.setVisibility(0);
        C167507yA r3 = catalogListActivity.A0I;
        UserJid userJid = catalogListActivity.A0L;
        AnonymousClass00C.A0D(userJid, 0);
        C36391kE.A1R(r3.A0S, r3, userJid, 39);
    }

    public static void A0G(CatalogListActivity catalogListActivity, boolean z) {
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(catalogListActivity, z);
        catalogListActivity.A08 = postcodeChangeBottomSheet;
        C167637yT.A01(catalogListActivity.A06, postcodeChangeBottomSheet, (String) catalogListActivity.A06.A04.A04());
        PostcodeChangeBottomSheet postcodeChangeBottomSheet2 = catalogListActivity.A08;
        postcodeChangeBottomSheet2.A0B = catalogListActivity.A0L;
        C65443Sb.A00(postcodeChangeBottomSheet2, catalogListActivity);
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C165567td.A11(r1, this);
            C18830tt r3 = r1.A00;
            C165567td.A0v(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A0M = C165597tg.A0U(r1);
            this.A06 = (AnonymousClass6VE) r1.A1Q.get();
            this.A05 = (C178358fo) r1.ADJ.get();
            this.A0E = C165607th.A0Q(r1);
            this.A0F = (C195119So) r3.A0y.get();
            this.A09 = (AnonymousClass2ZL) r1.ADO.get();
            this.A0J = C165587tf.A0M(r1);
            this.A0A = (C31771cM) r1.A6p.get();
            this.A0B = (C29461Ws) r1.A1S.get();
            this.A01 = (AnonymousClass9DS) A0L2.A1k.get();
            this.A07 = (AnonymousClass4PE) A0L2.A1N.get();
            this.A04 = (C26421Kc) r1.A1A.get();
            this.A0K = (C27261Nn) r1.AQN.get();
            this.A0N = (AnonymousClass9R0) r1.A1U.get();
            this.A0O = (AnonymousClass9R1) r3.A0z.get();
            this.A03 = C165587tf.A0L(r1);
            this.A0D = C165607th.A0P(r1);
            this.A02 = (C22909AyL) A0L2.A1Z.get();
            this.A01 = C19470v6.A00;
            this.A00 = C36391kE.A0S(r1);
            this.A0E = C36341k9.A0R(r1);
            this.A0H = C165607th.A0V(r3);
            this.A0F = C36341k9.A0S(r1);
            this.A0B = C36381kD.A0V(r1);
            this.A02 = (C191469Db) A0L2.A1v.get();
            this.A0G = (AnonymousClass1NM) r1.A1c.get();
            this.A0C = (C131496Pg) r3.A10.get();
            this.A07 = C27111My.A0G(A0L2);
            this.A0D = new AnonymousClass9ZO();
            this.A03 = (C191479Dc) A0L2.A3I.get();
            this.A0A = (C199439fJ) r1.A17.get();
            this.A0I = C90504aG.A0V(r1);
        }
    }

    public void A2X() {
        if (this.A0D.A0E(6715)) {
            this.A0I.A03(this.A0L, 59);
        }
        super.A2X();
    }

    public void BTC() {
        this.A0I.A0E.A00();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 106) {
            return super.onCreateDialog(i);
        }
        AnonymousClass141 A0D2 = this.A0E.A0D(this.A0L);
        C39001qm A002 = AnonymousClass3LW.A00(this);
        Object[] A0L2 = AnonymousClass001.A0L();
        C36361kB.A1F(this.A0F, A0D2, A0L2, 0);
        C165587tf.A0t(this, A002, A0L2, R.string.f12nameremoved);
        A002.A0h(new B8F(A0D2, this, 0), R.string.f12nameremoved);
        B83.A00(A002, this, 2, R.string.f12nameremoved);
        return A002.create();
    }

    public void onDestroy() {
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = this.A08;
        if (postcodeChangeBottomSheet != null) {
            try {
                postcodeChangeBottomSheet.A1b();
            } catch (IllegalStateException e) {
                Log.w(C36331k8.A0i("IllegalStateException dismiss PostcodeChangeBottomSheet: ", AnonymousClass000.A0u(), e));
            }
        }
        this.A04.unregisterObserver(this.A0L);
        super.onDestroy();
    }

    public CatalogListActivity(int i) {
        this.A0K = false;
        B7Y.A00(this, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A00.canScrollVertically(1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(com.whatsapp.biz.catalog.view.activity.CatalogListActivity r3) {
        /*
            r0 = 2131434019(0x7f0b1a23, float:1.848984E38)
            android.view.View r2 = r3.findViewById(r0)
            X.8VJ r0 = r3.A0H
            java.util.List r0 = r0.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r0 = 8
        L_0x001d:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A07(com.whatsapp.biz.catalog.view.activity.CatalogListActivity):void");
    }

    public void A3i(List list) {
        super.A3i(list);
        A0F(this);
        A07(this);
    }

    public void Bd8(String str) {
        Bu1(R.string.f12nameremoved);
        this.A06.A0T(str);
    }

    public void onBackPressed() {
        AnonymousClass02E A0N = getSupportFragmentManager().A0N("CatalogSearchFragmentTag");
        if (A0N == null || !(A0N instanceof CatalogSearchFragment) || !((CatalogSearchFragment) A0N).A1a()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass9RN r0;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 && (r0 = this.A09) != null) {
            r0.A00();
            this.A09 = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WDSButton wDSButton = (WDSButton) findViewById(R.id.view_cart);
        this.A0J = wDSButton;
        C36421kH.A10(wDSButton, this, 39);
        this.A0G.A0D(this.A0L, 0);
        C191479Dc r3 = this.A03;
        UserJid userJid = this.A0L;
        C36331k8.A1I(r3, userJid);
        C167637yT r0 = (C167637yT) C165617ti.A0A(new B9J(r3, userJid, 0), this).A00(C167637yT.class);
        this.A06 = r0;
        BA6.A00(this, r0.A04, 33);
        BA6.A00(this, this.A06.A03, 35);
        BA6.A00(this, this.A06.A02, 42);
        BA6.A00(this, this.A0I.A0R, 37);
        BA6.A00(this, this.A0I.A08, 40);
        BA6.A00(this, this.A0I.A07, 36);
        BA6.A00(this, this.A0I.A0A, 38);
        BA6.A00(this, this.A0I.A06, 34);
        BA6.A00(this, this.A0I.A0C, 39);
        BA6.A00(this, this.A08.A00, 41);
        this.A04.registerObserver(this.A0L);
        this.A07.A00(new B93(this, 1), this.A0L);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        MenuItem findItem2 = menu.findItem(R.id.menu_share);
        C36331k8.A0q(this, C36441kJ.A0R(findItem2, R.layout.f9nameremoved), R.string.f12nameremoved);
        findItem2.setVisible(this.A0Q);
        C33521fV.A02(findItem2.getActionView());
        C48732hx.A00(findItem2.getActionView(), this, 36);
        findItem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            onBackPressed();
            return true;
        }
        if (R.id.menu_edit == itemId) {
            C19460v5 r1 = this.A00;
            if (r1.A05()) {
                r1.A02();
                throw AnonymousClass001.A0A("getCatalogListActivity");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        C167637yT r5 = this.A06;
        if (AnonymousClass1KP.A00(r5.A09, r5.A00, "postcode", true)) {
            Object A042 = r5.A04.A04();
            C19420v0 r4 = r5.A0A;
            UserJid userJid = r5.A0B;
            String A0l = r4.A0l(userJid.getRawString());
            if (A042 != null && A0l != null && !A042.equals(A0l)) {
                r5.A07.A0D(A0l);
                String A0t = C36371kC.A0t(C36341k9.A0E(r4), AnonymousClass000.A0p("dc_location_name_", userJid.getRawString(), AnonymousClass000.A0u()));
                if (A0t != null) {
                    r5.A06.A0D(A0t);
                }
                if (this.A0B.A0G(this.A0L)) {
                    this.A0B.A0D(this.A0L);
                }
                this.A0C.A03(this.A0L);
                A01(this);
            }
        }
    }

    public void setPostcodeAndLocationViews(View view) {
        this.A05 = C36401kF.A0Q(view, R.id.postcode_item_text);
        this.A04 = C36401kF.A0Q(view, R.id.postcode_item_location_name);
    }

    public CatalogListActivity() {
        this(0);
        this.A0L = new BAP(this, 2);
    }
}
