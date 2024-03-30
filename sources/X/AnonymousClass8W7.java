package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8W7  reason: invalid class name */
public abstract class AnonymousClass8W7 extends C173808Tf {
    public RecyclerView A00;
    public AnonymousClass9DS A01;
    public C22909AyL A02;
    public AnonymousClass1KK A03;
    public C26421Kc A04;
    public C178358fo A05;
    public AnonymousClass6VE A06;
    public AnonymousClass4PE A07;
    public C167497y9 A08;
    public AnonymousClass2ZL A09;
    public C31771cM A0A;
    public C29461Ws A0B;
    public C193039Jp A0C;
    public AnonymousClass9Y1 A0D;
    public C202279lS A0E;
    public C195119So A0F;
    public C196089Xp A0G;
    public AnonymousClass8VJ A0H;
    public C167507yA A0I;
    public AnonymousClass16I A0J;
    public C27261Nn A0K;
    public UserJid A0L;
    public AnonymousClass3L6 A0M;
    public AnonymousClass9R0 A0N;
    public AnonymousClass9R1 A0O;
    public String A0P;
    public boolean A0Q;
    public boolean A0R;
    public C226815j A0S = new B79(this, 2);
    public final AnonymousClass16A A0T = new BAP(this, 3);
    public final C194289Oy A0U = new B76(this, 0);
    public final C88364Sk A0V = new C21110A8v(this);
    public final C195559Ux A0W = new B77(this, 0);

    public static void A0H(AnonymousClass8W7 r4) {
        AnonymousClass9Y1 r2 = r4.A0D;
        C195209Sx A032 = C36321k7.A03(r2);
        C36321k7.A0p(A032, r4.A0D);
        C36401kF.A1F(A032, 32);
        C36411kG.A1G(A032, 50);
        C195209Sx.A00(r4.A0I.A0E.A03, A032);
        A032.A00 = r4.A0L;
        r2.A03(A032);
        C167507yA r0 = r4.A0I;
        r4.Btm(r0.A0P.A00(r0.A0O, (String) null, 0));
    }

    public static void A0I(Object obj, Object obj2) {
        AnonymousClass8W7 r2 = (AnonymousClass8W7) obj;
        if (r2.A0L.equals(obj2) && !r2.A02.A0M(r2.A0L)) {
            AnonymousClass8VJ r3 = r2.A0H;
            List list = r3.A00;
            if (list.size() > 0 && (list.get(0) instanceof AnonymousClass8WL)) {
                r3.A07(0);
            }
        }
    }

    public void A3i(List list) {
        this.A0P = this.A08.A0S(this.A00, list);
        HashSet A022 = C167497y9.A02(this.A0H.A07, list);
        List list2 = this.A0H.A07;
        list2.clear();
        list2.addAll(list);
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            this.A0A.A00(AnonymousClass001.A0C(it));
        }
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3000) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null && intent.getIntExtra("get_collection_error_code", -1) == 404) {
            this.A0I.A0S(this.A0L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = r28
            r4 = r29
            super.onCreate(r4)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_prefetched_catalog"
            r1 = 0
            boolean r2 = r3.getBooleanExtra(r2, r1)
            if (r2 != 0) goto L_0x0020
            X.3L6 r6 = r0.A0M
            r5 = 774781666(0x2e2e3ae2, float:3.9615318E-11)
            java.lang.String r3 = "catalog_collections_view_tag"
            java.lang.String r2 = "CatalogListBaseActivity"
            r6.A00(r5, r3, r2)
        L_0x0020:
            X.8fo r3 = r0.A05
            X.9Oy r2 = r0.A0U
            r3.registerObserver(r2)
            X.9So r5 = r0.A0F
            X.9R1 r3 = r0.A0O
            X.9Xp r2 = new X.9Xp
            r2.<init>(r5, r3)
            r0.A0G = r2
            r2 = 2131624262(0x7f0e0146, float:1.8875699E38)
            r0.setContentView((int) r2)
            r2 = 2131434427(0x7f0b1bbb, float:1.8490668E38)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r2.inflate()
            X.C36341k9.A12(r0)
            r2 = 2131428296(0x7f0b03c8, float:1.8478232E38)
            android.view.View r3 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0.A00 = r3
            X.9xW r2 = X.C208029xW.A00
            r3.A0M = r2
            X.07B r3 = r0.getSupportActionBar()
            if (r3 == 0) goto L_0x0066
            r2 = 1
            r3.A0U(r2)
            r2 = 2131887266(0x7f1204a2, float:1.9409134E38)
            r3.A0I(r2)
        L_0x0066:
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "cache_jid"
            java.lang.String r2 = r3.getStringExtra(r2)
            com.whatsapp.jid.UserJid r2 = X.C36431kI.A0l(r2)
            X.C18740tg.A06(r2)
            r0.A0L = r2
            X.1cM r3 = r0.A0A
            X.9Ux r2 = r0.A0W
            r3.registerObserver(r2)
            X.2ZL r3 = r0.A09
            X.4Sk r2 = r0.A0V
            r3.registerObserver(r2)
            com.whatsapp.jid.UserJid r3 = r0.A0L
            X.4PE r2 = r0.A07
            X.04R r2 = X.C165577te.A0M(r0, r2, r3)
            X.7y9 r2 = (X.C167497y9) r2
            r0.A08 = r2
            com.whatsapp.jid.UserJid r6 = r0.A0L
            X.AyL r2 = r0.A02
            X.9Uf r5 = r2.B3r(r6)
            X.9DS r3 = r0.A01
            X.9xF r2 = new X.9xF
            r2.<init>(r3, r5, r6)
            X.04H r3 = X.C165617ti.A0A(r2, r0)
            java.lang.Class<X.7yA> r2 = X.C167507yA.class
            X.04R r2 = r3.A00(r2)
            X.7yA r2 = (X.C167507yA) r2
            r0.A0I = r2
            X.9lS r2 = r2.A0L
            X.00s r3 = r2.A04
            r2 = 43
            X.BA6.A00(r0, r3, r2)
            X.7yA r10 = r0.A0I
            com.whatsapp.jid.UserJid r9 = r0.A0L
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "entry_point"
            int r8 = r3.getIntExtra(r2, r1)
            X.AnonymousClass00C.A0D(r9, r1)
            X.3L6 r7 = r10.A0Q
            X.0wQ r2 = r10.A0D
            boolean r2 = r2.A0M(r9)
            r6 = 1
            r3 = r2 ^ 1
            java.lang.String r5 = "catalog_collections_view_tag"
            java.lang.String r2 = "IsConsumer"
            r7.A04(r5, r2, r3)
            X.1Ws r3 = r10.A0I
            boolean r2 = r3.A0I(r9)
            if (r2 != 0) goto L_0x00eb
            boolean r2 = r3.A0H(r9)
            if (r2 != 0) goto L_0x00eb
            r6 = 0
        L_0x00eb:
            java.lang.String r2 = "Cached"
            r7.A04(r5, r2, r6)
            switch(r8) {
                case 1: goto L_0x0259;
                case 2: goto L_0x0256;
                case 3: goto L_0x0253;
                case 4: goto L_0x0250;
                case 5: goto L_0x024d;
                case 6: goto L_0x024a;
                case 7: goto L_0x0247;
                case 8: goto L_0x0244;
                case 9: goto L_0x0241;
                case 10: goto L_0x023e;
                case 11: goto L_0x023b;
                case 12: goto L_0x0238;
                case 13: goto L_0x0235;
                case 14: goto L_0x0232;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            r9 = r0
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r9 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r9
            X.9Db r2 = r9.A02
            com.whatsapp.jid.UserJid r7 = r9.A0L
            X.9Xp r15 = r9.A0G
            X.7yA r6 = r9.A0I
            X.95K r5 = new X.95K
            r5.<init>(r9, r1)
            X.1Mz r2 = r2.A00
            X.0tq r2 = r2.A01
            X.0yC r25 = X.C36341k9.A0V(r2)
            X.1Dv r10 = X.C36351kA.A0J(r2)
            X.004 r3 = r2.A1S
            java.lang.Object r13 = r3.get()
            X.1Ws r13 = (X.C29461Ws) r13
            X.9lS r14 = X.C165607th.A0Q(r2)
            X.16D r20 = X.C36341k9.A0R(r2)
            X.0wQ r11 = X.C36351kA.A0N(r2)
            X.004 r3 = r2.A7b
            java.lang.Object r12 = r3.get()
            X.3DY r12 = (X.AnonymousClass3DY) r12
            X.004 r3 = r2.A8K
            java.lang.Object r3 = r3.get()
            X.1CF r3 = (X.AnonymousClass1CF) r3
            X.171 r22 = X.C36341k9.A0S(r2)
            X.0ts r24 = X.C36341k9.A0T(r2)
            X.185 r21 = X.C36371kC.A0U(r2)
            X.0v0 r23 = X.C36351kA.A0Y(r2)
            X.1KP r18 = X.C18800tq.A2v(r2)
            X.9Oz r16 = new X.9Oz
            r16.<init>()
            X.8VJ r8 = new X.8VJ
            r19 = r5
            r26 = r3
            r27 = r7
            r17 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9.A0H = r8
            X.7yA r2 = r9.A0I
            X.00s r5 = r2.A0B
            X.0yC r3 = r8.A0J
            r2 = 1514(0x5ea, float:2.122E-42)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x016e
            r2 = 48
            X.BA6.A01(r9, r5, r8, r2)
        L_0x016e:
            if (r29 != 0) goto L_0x0228
            X.0wQ r3 = r0.A02
            com.whatsapp.jid.UserJid r2 = r0.A0L
            boolean r2 = r3.A0M(r2)
            X.7yA r5 = r0.A0I
            com.whatsapp.jid.UserJid r4 = r0.A0L
            if (r2 == 0) goto L_0x020e
            X.AnonymousClass00C.A0D(r4, r1)
            r5.A0S(r4)
            X.9lS r3 = r5.A0L
            int r2 = r5.A05
            r3.A08(r4, r2)
        L_0x018b:
            X.8VJ r2 = r0.A0H
            r2.A0R()
        L_0x0190:
            androidx.recyclerview.widget.RecyclerView r3 = r0.A00
            X.8VJ r2 = r0.A0H
            r3.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A00
            r5 = 1
            X.C36351kA.A1F(r2, r5)
            androidx.recyclerview.widget.RecyclerView r4 = r0.A00
            X.0By r3 = r4.A0H
            boolean r2 = r3 instanceof X.C02810Bz
            if (r2 == 0) goto L_0x01a9
            X.0Bz r3 = (X.C02810Bz) r3
            r3.A00 = r1
        L_0x01a9:
            X.B6w r2 = new X.B6w
            r2.<init>(r0, r5)
            r4.A0v(r2)
            X.16I r3 = r0.A0J
            X.15j r2 = r0.A0S
            r3.registerObserver(r2)
            X.1Kc r3 = r0.A04
            X.16A r2 = r0.A0T
            r3.registerObserver(r2)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "source"
            java.io.Serializable r2 = r3.getSerializableExtra(r2)
            if (r2 == 0) goto L_0x01d2
            X.0wU r3 = r0.A04
            r2 = 15
            X.AVW.A00(r3, r0, r2)
        L_0x01d2:
            X.7yA r2 = r0.A0I
            X.9Uf r2 = r2.A0E
            X.00r r3 = r2.A03
            r2 = 44
            X.BA6.A00(r0, r3, r2)
            com.whatsapp.jid.UserJid r9 = r0.A0L
            if (r9 == 0) goto L_0x0205
            X.9R0 r8 = r0.A0N
            java.util.concurrent.atomic.AtomicInteger r2 = r8.A00
            int r2 = r2.get()
            r7 = -1
            if (r2 == r7) goto L_0x0200
            X.6TX r6 = r8.A01
            r5 = 897464270(0x357e37ce, float:9.470358E-7)
            java.util.concurrent.atomic.AtomicInteger r2 = r8.A00
            int r4 = r2.get()
            r3 = 0
            X.5vO r2 = new X.5vO
            r2.<init>(r9, r3, r1, r1)
            r6.A04(r2, r5, r4)
        L_0x0200:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.A00
            r1.set(r7)
        L_0x0205:
            X.9Y1 r1 = r0.A0D
            X.9Jp r1 = r1.A00()
            r0.A0C = r1
            return
        L_0x020e:
            X.AnonymousClass00C.A0D(r4, r1)
            X.1KK r3 = r5.A0F
            X.1KL r2 = r3.A03
            int r2 = r2.A00()
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 <= 0) goto L_0x0222
            r3.A0B(r5, r4)
            goto L_0x018b
        L_0x0222:
            r2 = 0
            r5.Bbk(r2)
            goto L_0x018b
        L_0x0228:
            java.lang.String r2 = "catalog_loaded"
            boolean r2 = r4.getBoolean(r2, r1)
            r0.A0Q = r2
            goto L_0x0190
        L_0x0232:
            java.lang.String r3 = "Cart"
            goto L_0x025b
        L_0x0235:
            java.lang.String r3 = "Product"
            goto L_0x025b
        L_0x0238:
            java.lang.String r3 = "ChatHeader"
            goto L_0x025b
        L_0x023b:
            java.lang.String r3 = "Deeplink"
            goto L_0x025b
        L_0x023e:
            java.lang.String r3 = "Attachment"
            goto L_0x025b
        L_0x0241:
            java.lang.String r3 = "ContactInfo"
            goto L_0x025b
        L_0x0244:
            java.lang.String r3 = "Profile"
            goto L_0x025b
        L_0x0247:
            java.lang.String r3 = "CatalogHomeEdit"
            goto L_0x025b
        L_0x024a:
            java.lang.String r3 = "ConversationHomeBanner"
            goto L_0x025b
        L_0x024d:
            java.lang.String r3 = "ContentChooser"
            goto L_0x025b
        L_0x0250:
            java.lang.String r3 = "ToolsMenu"
            goto L_0x025b
        L_0x0253:
            java.lang.String r3 = "BusinessHome"
            goto L_0x025b
        L_0x0256:
            java.lang.String r3 = "CatalogShare"
            goto L_0x025b
        L_0x0259:
            java.lang.String r3 = "Onboarding"
        L_0x025b:
            java.lang.String r2 = "EntryPoint"
            r7.A03(r5, r2, r3)
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8W7.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        this.A05.unregisterObserver(this.A0U);
        this.A09.unregisterObserver(this.A0V);
        this.A0A.unregisterObserver(this.A0W);
        this.A0J.unregisterObserver(this.A0S);
        this.A04.unregisterObserver(this.A0T);
        this.A0G.A00();
        this.A0M.A05("catalog_collections_view_tag", false);
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            AnonymousClass8VJ r3 = this.A0H;
            List list = r3.A00;
            if (list.size() > 0 && (list.get(0) instanceof AnonymousClass8WL)) {
                list.remove(0);
                r3.A09(0);
                return;
            }
            return;
        }
        this.A0H.A0Q();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setVisible(false);
        C33521fV.A02(C36441kJ.A0R(findItem, R.layout.f9nameremoved));
        C48732hx.A00(findItem.getActionView(), this, 37);
        TextView A0P2 = C36391kE.A0P(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0P;
        if (str != null) {
            A0P2.setText(str);
        }
        this.A08.A00.A08(this, new BAD(findItem, this, 0));
        this.A08.A0T();
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            onBackPressed();
            return true;
        } else if (R.id.menu_share == itemId) {
            UserJid userJid = this.A0L;
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(getPackageName(), "com.whatsapp.ShareCatalogLinkActivity");
            A0D2.setAction("android.intent.action.VIEW");
            A0D2.putExtra("jid", userJid.getRawString());
            startActivity(A0D2);
            return true;
        } else if (R.id.menu_cart != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A0H(this);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A0H.A0R();
        this.A0I.A0E.A00();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("catalog_loaded", this.A0Q);
    }

    public void onStop() {
        super.onStop();
    }
}
