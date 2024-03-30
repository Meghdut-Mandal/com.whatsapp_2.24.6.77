package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass0FM;
import X.AnonymousClass155;
import X.AnonymousClass1KK;
import X.AnonymousClass1KP;
import X.AnonymousClass1N6;
import X.AnonymousClass1NM;
import X.AnonymousClass3L6;
import X.AnonymousClass3LW;
import X.AnonymousClass4PE;
import X.AnonymousClass95K;
import X.AnonymousClass9Y1;
import X.B76;
import X.B7Y;
import X.B83;
import X.BA6;
import X.BAD;
import X.C02800By;
import X.C02810Bz;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C167487y7;
import X.C167497y9;
import X.C168177zp;
import X.C178358fo;
import X.C18800tq;
import X.C18830tt;
import X.C191489Dd;
import X.C191499De;
import X.C193039Jp;
import X.C194289Oy;
import X.C196089Xp;
import X.C203499oB;
import X.C206819u1;
import X.C207909xJ;
import X.C208039xX;
import X.C20810yC;
import X.C22909AyL;
import X.C23137B6w;
import X.C27111My;
import X.C33521fV;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C41151wk;
import X.C48732hx;
import X.C61223Ba;
import X.C90504aG;
import X.C99304t3;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public class ProductListActivity extends AnonymousClass155 {
    public View A00;
    public AnonymousClass0FM A01;
    public AnonymousClass0FM A02;
    public RecyclerView A03;
    public C99304t3 A04;
    public C191489Dd A05;
    public C191499De A06;
    public C22909AyL A07;
    public AnonymousClass1KK A08;
    public C178358fo A09;
    public AnonymousClass4PE A0A;
    public C167497y9 A0B;
    public C193039Jp A0C;
    public AnonymousClass9Y1 A0D;
    public C196089Xp A0E;
    public C168177zp A0F;
    public C167487y7 A0G;
    public AnonymousClass1KP A0H;
    public AnonymousClass1NM A0I;
    public UserJid A0J;
    public C61223Ba A0K;
    public AnonymousClass3L6 A0L;
    public AnonymousClass1N6 A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public WDSButton A0R;
    public boolean A0S;
    public final C194289Oy A0T;

    public boolean A2g() {
        return true;
    }

    public static void A01(ProductListActivity productListActivity) {
        View findViewById;
        int i;
        if (productListActivity.A0O) {
            findViewById = productListActivity.findViewById(R.id.shadow_bottom);
            i = 8;
        } else {
            boolean canScrollVertically = productListActivity.A03.canScrollVertically(1);
            findViewById = productListActivity.findViewById(R.id.shadow_bottom);
            i = 4;
            if (canScrollVertically) {
                i = 0;
            }
        }
        findViewById.setVisibility(i);
    }

    public static void A07(ProductListActivity productListActivity) {
        WDSButton wDSButton = productListActivity.A0R;
        Object[] A0L2 = AnonymousClass001.A0L();
        A0L2[0] = productListActivity.A0N;
        C36341k9.A0s(productListActivity, wDSButton, A0L2, R.string.f12nameremoved);
        if (productListActivity.A0O || !productListActivity.A0F.A02) {
            productListActivity.A0R.setVisibility(8);
        } else {
            productListActivity.A0R.setVisibility(0);
        }
    }

    public void A2F() {
        if (!this.A0S) {
            this.A0S = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C165567td.A11(r2, this);
            C18830tt r3 = r2.A00;
            C165567td.A0v(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0L = C165597tg.A0U(r2);
            this.A09 = (C178358fo) r2.ADJ.get();
            this.A0K = C165607th.A0V(r3);
            this.A0I = (AnonymousClass1NM) r2.A1c.get();
            this.A0E = (C196089Xp) A0L2.A0L.get();
            this.A0D = C165607th.A0P(r2);
            this.A0A = (AnonymousClass4PE) A0L2.A1N.get();
            this.A05 = (C191489Dd) A0L2.A24.get();
            this.A08 = C165587tf.A0L(r2);
            this.A0H = C18800tq.A2v(r2);
            this.A07 = (C22909AyL) A0L2.A1Z.get();
            this.A0M = C90504aG.A0V(r2);
            this.A06 = (C191499De) A0L2.A25.get();
        }
    }

    public void A2X() {
        if (this.A0D.A0E(6715)) {
            this.A0M.A03(this.A0J, 60);
        }
        super.A2X();
    }

    public void onResume() {
        this.A0G.A0S();
        this.A0G.A04.A00();
        super.onResume();
    }

    public ProductListActivity(int i) {
        this.A0S = false;
        B7Y.A00(this, 6);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0L.A00(774777097, "plm_details_view_tag", "ProductListActivity");
        String stringExtra = C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("message_title");
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0Q(stringExtra);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0r(false);
        A002.A0c(R.string.f12nameremoved);
        B83.A01(A002, this, 3, R.string.f12nameremoved);
        this.A01 = A002.create();
        C39001qm A003 = AnonymousClass3LW.A00(this);
        A003.A0r(false);
        A003.A0c(R.string.f12nameremoved);
        B83.A01(A003, this, 4, R.string.f12nameremoved);
        this.A02 = A003.create();
        this.A09.registerObserver(this.A0T);
        C206819u1 r6 = (C206819u1) getIntent().getParcelableExtra("message_content");
        UserJid userJid = r6.A00;
        this.A0J = userJid;
        C167487y7 r1 = (C167487y7) C165617ti.A0A(new C207909xJ(this.A05, this.A07.B3r(userJid), userJid, this.A0K, r6), this).A00(C167487y7.class);
        this.A0G = r1;
        BA6.A00(this, r1.A04.A03, 47);
        this.A0B = (C167497y9) C165577te.A0M(this, this.A0A, this.A0J);
        this.A00 = findViewById(R.id.no_internet_container);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        this.A00.setPadding(dimensionPixelOffset, getResources().getDimensionPixelOffset(R.dimen.f7nameremoved), dimensionPixelOffset, 0);
        C36421kH.A10(findViewById(R.id.no_internet_retry_button), this, 40);
        WDSButton wDSButton = (WDSButton) findViewById(R.id.view_cart);
        this.A0R = wDSButton;
        C36421kH.A10(wDSButton, this, 41);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.product_list);
        this.A03 = recyclerView;
        C02800By r2 = recyclerView.A0H;
        if (r2 instanceof C02810Bz) {
            ((C02810Bz) r2).A00 = false;
        }
        recyclerView.A0t(new C41151wk());
        C191499De r22 = this.A06;
        AnonymousClass95K r62 = new AnonymousClass95K(this, 1);
        UserJid userJid2 = this.A0J;
        C196089Xp r4 = this.A0E;
        C18800tq r12 = r22.A00.A01;
        C20810yC A0V = C36341k9.A0V(r12);
        C168177zp r23 = new C168177zp(C36351kA.A0N(r12), r4, C18800tq.A2v(r12), r62, C36341k9.A0T(r12), A0V, userJid2);
        this.A0F = r23;
        this.A03.setAdapter(r23);
        this.A03.A0M = C208039xX.A00;
        BA6.A00(this, this.A0G.A00, 46);
        BA6.A00(this, this.A0G.A01, 45);
        this.A03.A0v(new C23137B6w(this, 2));
        this.A03.setOnTouchListener(new C203499oB(this, 0));
        this.A0P = false;
        this.A0I.A0D(this.A0J, 0);
        this.A0C = this.A0D.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        menu.findItem(R.id.menu_share).setVisible(false);
        findItem.setVisible(false);
        MenuItem findItem2 = menu.findItem(R.id.menu_cart);
        findItem2.setVisible(false);
        C33521fV.A02(C36441kJ.A0R(findItem2, R.layout.f9nameremoved));
        C48732hx.A00(findItem2.getActionView(), this, 38);
        TextView A0P2 = C36391kE.A0P(findItem2.getActionView(), R.id.cart_total_quantity);
        String str = this.A0N;
        if (str != null) {
            A0P2.setText(str);
        }
        this.A0B.A00.A08(this, new BAD(findItem2, this, 1));
        this.A0B.A0T();
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.unregisterObserver(this.A0T);
        this.A0L.A05("plm_details_view_tag", false);
    }

    public void onStop() {
        super.onStop();
        this.A0P = false;
    }

    public ProductListActivity() {
        this(0);
        this.A0O = true;
        this.A0T = new B76(this, 1);
    }
}
