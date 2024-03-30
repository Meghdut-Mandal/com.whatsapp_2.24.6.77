package X;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Objects;

/* renamed from: X.8Wd  reason: invalid class name and case insensitive filesystem */
public abstract class C174338Wd extends C173828Th {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public C22909AyL A03;
    public AnonymousClass1KK A04;
    public C178358fo A05;
    public AnonymousClass6VE A06;
    public AnonymousClass9ZJ A07;
    public AnonymousClass9UA A08;
    public AnonymousClass4PE A09;
    public C167497y9 A0A;
    public C31771cM A0B;
    public C29461Ws A0C;
    public C198849eI A0D;
    public AnonymousClass9Y1 A0E;
    public C202279lS A0F;
    public C196089Xp A0G;
    public C95364kf A0H;
    public AnonymousClass8VI A0I;
    public AnonymousClass16D A0J;
    public AnonymousClass185 A0K;
    public AnonymousClass171 A0L;
    public UserJid A0M;
    public C61223Ba A0N;
    public AnonymousClass3L6 A0O;
    public WDSButton A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public final C194289Oy A0U = new B76(this, 4);
    public final C195559Ux A0V = new B77(this, 2);

    public static void A07(C174338Wd r4) {
        WDSButton wDSButton;
        int i;
        C95364kf r3 = r4.A0H;
        C1501874h.A01(r3.A07, r3, r4.A0M, 22);
        if (r4.A0I.A07.isEmpty() || !r4.A0I.B9S()) {
            wDSButton = r4.A0P;
            i = 8;
        } else {
            wDSButton = r4.A0P;
            i = 0;
        }
        wDSButton.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent A0F2 = C36431kI.A0F(this, R.layout.f9nameremoved);
        UserJid A0l = C36431kI.A0l(A0F2.getStringExtra("cache_jid"));
        C18740tg.A06(A0l);
        this.A0M = A0l;
        String stringExtra = A0F2.getStringExtra("collection_id");
        C18740tg.A06(stringExtra);
        this.A0R = stringExtra;
        String stringExtra2 = A0F2.getStringExtra("collection_name");
        C18740tg.A06(stringExtra2);
        this.A0T = stringExtra2;
        this.A0S = A0F2.getStringExtra("collection_index");
        this.A00 = A0F2.getIntExtra("category_browsing_entry_point", -1);
        this.A01 = A0F2.getIntExtra("category_level", -1);
        if (!this.A0R.equals("catalog_products_all_items_collection_id")) {
            this.A0O.A00(774780089, "view_collection_details_tag", "CollectionProductListBaseActivity");
            boolean z = true;
            this.A0O.A04("view_collection_details_tag", "IsConsumer", !this.A02.A0M(this.A0M));
            AnonymousClass3L6 r4 = this.A0O;
            if (this.A0C.A05(this.A0M, this.A0R) == null) {
                z = false;
            }
            r4.A04("view_collection_details_tag", "Cached", z);
        }
        WDSButton wDSButton = (WDSButton) findViewById(R.id.view_cart);
        this.A0P = wDSButton;
        C36361kB.A18(wDSButton, this, 29);
        String str = this.A0T;
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            if (str != null) {
                supportActionBar.A0Q(str);
            }
        }
        this.A02 = (RecyclerView) findViewById(R.id.product_list);
        CollectionProductListActivity collectionProductListActivity = (CollectionProductListActivity) this;
        C20810yC r16 = collectionProductListActivity.A0D;
        C24801Dv r31 = collectionProductListActivity.A01;
        C202279lS r30 = collectionProductListActivity.A0F;
        AnonymousClass16D r21 = collectionProductListActivity.A0J;
        AnonymousClass17Y r29 = collectionProductListActivity.A05;
        C19730wQ r15 = collectionProductListActivity.A02;
        AnonymousClass185 r14 = collectionProductListActivity.A0K;
        AnonymousClass171 r13 = collectionProductListActivity.A0L;
        C18820ts r12 = collectionProductListActivity.A00;
        C143176q7 r11 = new C143176q7(collectionProductListActivity);
        C143166q6 r9 = new C143166q6(collectionProductListActivity);
        AnonymousClass1KP r8 = collectionProductListActivity.A01;
        String str2 = collectionProductListActivity.A0S;
        String str3 = collectionProductListActivity.A0R;
        int i = 897451937;
        if (collectionProductListActivity.A00 != -1) {
            i = 897451370;
        }
        AnonymousClass9ED r5 = new AnonymousClass9ED(i);
        C24801Dv r122 = r31;
        AnonymousClass17Y r132 = r29;
        C19730wQ r142 = r15;
        C202279lS r152 = r30;
        collectionProductListActivity.A0I = new AnonymousClass8Wg(r122, r132, r142, r152, r5, collectionProductListActivity.A0G, r8, r9, r11, r21, r14, r13, r12, r16, collectionProductListActivity.A0M, str2, str3);
        this.A02.setAdapter(this.A0I);
        RecyclerView recyclerView = this.A02;
        recyclerView.A0M = C208049xY.A00;
        C36321k7.A0Q(recyclerView);
        C02800By r3 = this.A02.A0H;
        if (r3 instanceof C02810Bz) {
            ((C02810Bz) r3).A00 = false;
        }
        this.A0B.registerObserver(this.A0V);
        this.A0A = (C167497y9) C165577te.A0M(this, this.A09, this.A0M);
        UserJid userJid = this.A0M;
        Application application = getApplication();
        C202279lS r82 = this.A0F;
        C195419Uf B3r = this.A03.B3r(this.A0M);
        C61223Ba r10 = this.A0N;
        this.A0H = (C95364kf) C165617ti.A0A(new C138536iG(application, B3r, this.A07, this.A08, r82, userJid, r10, this.A04), this).A00(C95364kf.class);
        this.A05.registerObserver(this.A0U);
        BA7.A00(this, this.A0H.A02.A03, 24);
        BA7.A00(this, this.A0H.A04.A03, 22);
        C001700s r42 = this.A0H.A04.A05;
        AnonymousClass8VI r32 = this.A0I;
        Objects.requireNonNull(r32);
        BA7.A01(this, r42, r32, 25);
        BA7.A00(this, this.A0H.A01, 23);
        C95364kf r6 = this.A0H;
        r6.A04.A03(r6.A00, this.A0M, this.A0R, C36381kD.A1U(this.A00, -1));
        this.A02.A0v(new C162517oi(this, 5));
    }

    public void onDestroy() {
        this.A05.unregisterObserver(this.A0U);
        this.A0B.unregisterObserver(this.A0V);
        this.A0G.A00();
        C36341k9.A18(this.A0F.A05, false);
        this.A0O.A05("view_collection_details_tag", false);
        super.onDestroy();
    }

    public void onResume() {
        this.A0H.A02.A00();
        super.onResume();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A02.canScrollVertically(1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C174338Wd r3) {
        /*
            r0 = 2131434019(0x7f0b1a23, float:1.848984E38)
            android.view.View r2 = r3.findViewById(r0)
            X.8VI r0 = r3.A0I
            java.util.List r0 = r0.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r1 = r3.A02
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
        throw new UnsupportedOperationException("Method not decompiled: X.C174338Wd.A01(X.8Wd):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setVisible(false);
        C33521fV.A02(C36441kJ.A0R(findItem, R.layout.f9nameremoved));
        C48892iE.A00(findItem.getActionView(), this, 5);
        TextView A0P2 = C36391kE.A0P(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0Q;
        if (str != null) {
            A0P2.setText(str);
        }
        this.A0A.A00.A08(this, new BAD(findItem, this, 3));
        this.A0A.A0T();
        return super.onCreateOptionsMenu(menu);
    }
}
