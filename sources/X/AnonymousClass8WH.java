package X;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.biz.product.view.fragment.ProductMoreInfoFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.8WH  reason: invalid class name */
public abstract class AnonymousClass8WH extends C173818Tg implements C159227j1 {
    public int A00 = 0;
    public int A01;
    public ObjectAnimator A02;
    public View A03;
    public View A04;
    public View A05;
    public ScrollView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public FragmentContainerView A0A;
    public C99304t3 A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public AnonymousClass1X4 A0E;
    public WaTextView A0F;
    public C22909AyL A0G;
    public C63553Km A0H;
    public AnonymousClass1KK A0I;
    public AnonymousClass9XI A0J;
    public C178358fo A0K;
    public AnonymousClass6VE A0L;
    public AnonymousClass9ZJ A0M;
    public AnonymousClass9UA A0N;
    public AnonymousClass4PE A0O;
    public C167497y9 A0P;
    public C64723Pe A0Q;
    public C31771cM A0R;
    public C29461Ws A0S;
    public C207269up A0T;
    public C207269up A0U;
    public AnonymousClass9Y1 A0V;
    public C202279lS A0W;
    public C195119So A0X;
    public C196089Xp A0Y;
    public CatalogCarouselDetailImageView A0Z;
    public CatalogMediaCard A0a;
    public EllipsizedTextEmojiLabel A0b;
    public VariantsCarouselFragment A0c;
    public C64183Mz A0d;
    public C198909eO A0e;
    public QuantitySelector A0f;
    public AnonymousClass9N7 A0g;
    public C167647yU A0h;
    public AnonymousClass6W7 A0i;
    public AnonymousClass9UB A0j;
    public AnonymousClass16D A0k;
    public C27261Nn A0l;
    public AnonymousClass185 A0m;
    public AnonymousClass171 A0n;
    public AnonymousClass1NM A0o;
    public AnonymousClass190 A0p;
    public UserJid A0q;
    public C61223Ba A0r;
    public AnonymousClass3L6 A0s;
    public AnonymousClass9R1 A0t;
    public WDSButton A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public List A10 = null;
    public boolean A11 = true;
    public ViewTreeObserver.OnScrollChangedListener A12;
    public C193039Jp A13;
    public WDSButton A14;
    public boolean A15;
    public boolean A16 = false;
    public View A17;
    public boolean A18;
    public final C194289Oy A19 = new B76(this, 2);

    public void onActivityResult(int i, int i2, Intent intent) {
        C207269up r1;
        int i3 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i3, intent2);
        if (i3 == -1 && (r1 = this.A0U) != null) {
            if (i == 3) {
                ArrayList A062 = AnonymousClass143.A06(AnonymousClass11F.class, intent2.getStringArrayListExtra("jids"));
                File A0S2 = C90524aI.A0S(intent2.getStringExtra("file_path"));
                AnonymousClass1X4 r8 = this.A0E;
                C207269up r9 = this.A0U;
                UserJid userJid = this.A0q;
                r8.A1J.Boy(new C35451ii(Uri.fromFile(A0S2), r8, r9, userJid, (AnonymousClass3T1) null, (List) A062));
                if (A062.size() == 1) {
                    this.A01.A07(this, new AnonymousClass190().A1W(this, this.A0k.A0D((AnonymousClass11F) A062.get(0))));
                } else {
                    Bvu(A062);
                }
            } else if (i == 66) {
                this.A0Q.A01(this, this.A0Y, (AnonymousClass11F) null, this.A0q, Collections.singletonList(r1), 3, 0, 0);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean A0T2 = this.A0h.A0T(this.A0U, this.A00);
        boolean z = this.A0q instanceof PhoneUserJid;
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        MenuItem findItem2 = menu.findItem(R.id.menu_share);
        MenuItem findItem3 = menu.findItem(R.id.menu_forward);
        MenuItem findItem4 = menu.findItem(R.id.menu_more_info);
        boolean z2 = false;
        findItem.setVisible(false);
        findItem3.setVisible(A0T2);
        if (A0T2 && z) {
            z2 = true;
        }
        findItem2.setVisible(z2);
        findItem4.setVisible(this.A0i.A04(this.A0q));
        C33521fV.A02(C36441kJ.A0R(findItem, R.layout.f9nameremoved));
        C48732hx.A00(findItem.getActionView(), this, 48);
        TextView A0P2 = C36391kE.A0P(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0v;
        if (str != null) {
            A0P2.setText(str);
        }
        this.A0P.A00.A08(this, new BA5(findItem3, findItem2, findItem, this, 0));
        return super.onCreateOptionsMenu(menu);
    }

    public static void A0F(AnonymousClass8WH r4) {
        C193039Jp r0;
        Boolean bool;
        if (!r4.A15 && (r0 = r4.A13) != null) {
            AnonymousClass9Y1 r3 = r4.A0V;
            C195209Sx r2 = new C195209Sx();
            C193039Jp.A00(r2, r0, r3);
            C36401kF.A1F(r2, 12);
            C36411kG.A1G(r2, 31);
            r2.A0G = r4.A0y;
            C207269up r02 = r4.A0U;
            if (r02 != null) {
                bool = Boolean.valueOf(AnonymousClass000.A1V(r02.A0B));
            } else {
                bool = null;
            }
            r2.A01(bool);
            r2.A00 = r4.A0q;
            r2.A01 = (Boolean) r4.A0P.A00.A04();
            r2.A0C = r4.A0x;
            r2.A0H = r4.A0z;
            r2.A0B = r4.A0w;
            r3.A03(r2);
            r4.A15 = true;
            r4.A13 = null;
        }
    }

    public static void A0G(AnonymousClass8WH r4, String str) {
        Set A002;
        r4.A0y = str;
        if (r4.A11 || !r4.A16) {
            A002 = AnonymousClass96V.A00();
        } else {
            A002 = C36441kJ.A16();
        }
        r4.A0j.A01(r4.A0q, A002, new AZD(r4, str));
        r4.A00 = AnonymousClass000.A1W(r4.A0U) ? 1 : 0;
    }

    public static void A0H(AnonymousClass8WH r5, List list) {
        long j;
        WDSButton wDSButton;
        int i;
        C207269up r0 = r5.A0U;
        if (r0 != null) {
            j = r0.A09;
        } else {
            j = 99;
        }
        long A012 = C167497y9.A01(r5.A0y, list);
        r5.A0f.A04(A012, j);
        int i2 = (A012 > 0 ? 1 : (A012 == 0 ? 0 : -1));
        QuantitySelector quantitySelector = r5.A0f;
        if (i2 > 0) {
            quantitySelector.setVisibility(0);
            wDSButton = r5.A0u;
            i = 5;
        } else {
            quantitySelector.setVisibility(8);
            wDSButton = r5.A0u;
            i = 4;
        }
        C36361kB.A18(wDSButton, r5, i);
    }

    public void A3i() {
        BA7.A00(this, this.A0P.A00, 7);
        this.A14.setVisibility(C36351kA.A00(this.A0h.A0T(this.A0U, this.A00) ? 1 : 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r6 == 404) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXn(java.lang.String r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0y
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0056
            A0F(r4)
            r0 = 3
            r4.A00 = r0
            X.1cM r0 = r4.A0R
            java.util.Iterator r3 = X.C36361kB.A0s(r0)
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r3.next()
            X.9Ux r1 = (X.C195559Ux) r1
            X.B77 r1 = (X.B77) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0014
            java.lang.Object r2 = r1.A00
            X.8WH r2 = (X.AnonymousClass8WH) r2
            java.lang.String r0 = r2.A0y
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 406(0x196, float:5.69E-43)
            if (r6 == r0) goto L_0x003d
            r1 = 404(0x194, float:5.66E-43)
            r0 = 3
            if (r6 != r1) goto L_0x003e
        L_0x003d:
            r0 = 2
        L_0x003e:
            r2.A00 = r0
            r2.A3i()
            goto L_0x0014
        L_0x0044:
            X.9eO r1 = r4.A0e
            X.AlC r0 = new X.AlC
            r0.<init>(r1)
            X.C198909eO.A00(r1, r0)
            X.3L6 r2 = r4.A0s
            r1 = 0
            java.lang.String r0 = "view_product_tag"
            r2.A05(r0, r1)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WH.BXn(java.lang.String, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXo(X.AnonymousClass9NZ r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = r6.A0y
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r2 = 1
            r6.A16 = r2
            r4 = 0
            r6.A00 = r4
            X.1cM r0 = r6.A0R
            java.util.Iterator r5 = X.C36361kB.A0s(r0)
        L_0x0014:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r1 = r5.next()
            X.9Ux r1 = (X.C195559Ux) r1
            X.B77 r1 = (X.B77) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x004c;
                case 2: goto L_0x003d;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.Object r1 = r1.A00
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r1 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r1
            X.1Ws r0 = r1.A06
            if (r0 == 0) goto L_0x0094
            X.9up r3 = X.C165617ti.A0N(r0, r8)
            if (r3 == 0) goto L_0x0014
            X.8VI r0 = r1.A1Z()
        L_0x0039:
            r0.A0S(r3)
            goto L_0x0014
        L_0x003d:
            java.lang.Object r1 = r1.A00
            X.8Wd r1 = (X.C174338Wd) r1
            X.1Ws r0 = r1.A0C
            X.9up r3 = X.C165617ti.A0N(r0, r8)
            if (r3 == 0) goto L_0x0014
            X.8VI r0 = r1.A0I
            goto L_0x0039
        L_0x004c:
            java.lang.Object r3 = r1.A00
            X.8WH r3 = (X.AnonymousClass8WH) r3
            X.1Ws r1 = r3.A0S
            com.whatsapp.jid.UserJid r0 = r3.A0q
            X.9up r1 = r1.A06(r0, r8)
            java.lang.String r0 = r3.A0y
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0014
            X.9up r0 = r3.A0U
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0014
        L_0x006a:
            r3.A00 = r4
            java.lang.String r0 = r3.A0y
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x007e
            X.1Ws r1 = r3.A0S
            com.whatsapp.jid.UserJid r0 = r3.A0q
            X.9up r0 = r1.A06(r0, r8)
            r3.A0U = r0
        L_0x007e:
            r3.A3i()
            goto L_0x0014
        L_0x0082:
            java.lang.Object r3 = r1.A00
            X.8W7 r3 = (X.AnonymousClass8W7) r3
            X.1Ws r0 = r3.A0B
            X.9up r1 = X.C165617ti.A0N(r0, r8)
            if (r1 == 0) goto L_0x0014
            X.8VJ r0 = r3.A0H
            r0.A0T(r1)
            goto L_0x0014
        L_0x0094:
            java.lang.String r0 = "catalogCacheManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009b:
            X.1Ws r0 = r6.A0S
            X.9up r0 = X.C165617ti.A0N(r0, r8)
            if (r0 == 0) goto L_0x00d5
            X.6bW r0 = r0.A0B
            if (r0 == 0) goto L_0x00cd
            X.6bD r0 = r0.A00
            if (r0 == 0) goto L_0x00d5
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d5
            X.9eO r1 = r6.A0e
            X.An3 r0 = new X.An3
            r0.<init>(r1, r4)
        L_0x00bc:
            X.C198909eO.A00(r1, r0)
            X.3L6 r1 = r6.A0s
            java.lang.String r0 = "view_product_tag"
            r1.A05(r0, r2)
            X.9N7 r1 = r6.A0g
            com.whatsapp.jid.UserJid r0 = r6.A0q
            r1.A00 = r0
        L_0x00cc:
            return
        L_0x00cd:
            X.9eO r1 = r6.A0e
            X.An4 r0 = new X.An4
            r0.<init>(r1, r4)
            goto L_0x00bc
        L_0x00d5:
            X.9eO r1 = r6.A0e
            X.AlC r0 = new X.AlC
            r0.<init>(r1)
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WH.BXo(X.9NZ, java.lang.String):void");
    }

    public void onCreate(Bundle bundle) {
        String str;
        C134736bW r0;
        C134546bD r02;
        List list;
        C64013Mh.A00(this);
        super.onCreate(bundle);
        this.A0s.A00(774775607, "view_product_tag", "ProductBaseActivity");
        this.A01 = getIntent().getIntExtra("view_product_origin", 0);
        this.A0K.registerObserver(this.A19);
        UserJid A0l2 = C36431kI.A0l(C36341k9.A0d(this));
        C18740tg.A06(A0l2);
        this.A0q = A0l2;
        String stringExtra = getIntent().getStringExtra("product");
        C18740tg.A06(stringExtra);
        this.A0y = stringExtra;
        this.A18 = getIntent().getBooleanExtra("disable_report", false);
        this.A0x = getIntent().getStringExtra("collection_index");
        this.A0z = getIntent().getStringExtra("product_index");
        this.A0w = getIntent().getStringExtra("collection_id");
        setContentView((int) R.layout.f9nameremoved);
        this.A0Z = (CatalogCarouselDetailImageView) findViewById(R.id.catalog_carousel_detail_image_view);
        this.A0D = C36421kH.A0I(this, R.id.catalog_detail_title);
        this.A08 = C36391kE.A0Q(this, R.id.catalog_detail_price);
        this.A0b = (EllipsizedTextEmojiLabel) findViewById(R.id.catalog_detail_description);
        this.A07 = C36391kE.A0Q(this, R.id.catalog_detail_link);
        this.A09 = C36391kE.A0Q(this, R.id.catalog_detail_sku);
        this.A0C = C36421kH.A0I(this, R.id.loading_product_text);
        this.A0a = (CatalogMediaCard) findViewById(R.id.product_message_catalog_media_card);
        this.A0F = (WaTextView) findViewById(R.id.product_availability_label);
        this.A0u = (WDSButton) findViewById(R.id.pdp_action_button);
        this.A06 = (ScrollView) findViewById(R.id.pdp_scroll_view);
        this.A05 = findViewById(R.id.shadow_bottom);
        this.A04 = findViewById(R.id.loading_indicator);
        this.A0A = (FragmentContainerView) findViewById(R.id.catalog_variants_carousel_fragment);
        View findViewById = findViewById(R.id.quantity_selector_cart_container);
        this.A03 = findViewById;
        this.A12 = new C163387q7(this, 1);
        findViewById.setVisibility(8);
        QuantitySelector quantitySelector = (QuantitySelector) findViewById(R.id.pdp_quantity_selector);
        this.A0f = quantitySelector;
        quantitySelector.A03 = new C23228BAk(this, 0);
        quantitySelector.A04 = new C163537qM(this, 0);
        View findViewById2 = findViewById(R.id.request_report_btn_container);
        this.A17 = findViewById2;
        findViewById2.setVisibility(8);
        C36361kB.A18(findViewById(R.id.report_btn), this, 3);
        C48732hx r1 = new C48732hx(this, 46);
        WDSButton wDSButton = (WDSButton) findViewById(R.id.message_business_btn);
        this.A14 = wDSButton;
        wDSButton.setVisibility(8);
        this.A14.setOnClickListener(r1);
        Toolbar toolbar = (Toolbar) C03570Gk.A0B(this, R.id.product_detail_image_toolbar);
        toolbar.setTitle((CharSequence) "");
        toolbar.A0F();
        AnonymousClass07B A0Q2 = C36431kI.A0Q(this, toolbar);
        if (A0Q2 != null) {
            A0Q2.A0U(true);
        }
        toolbar.setNavigationIcon((Drawable) C91364bt.A00(this, this.A00, R.drawable.ic_back_shadow));
        this.A0U = this.A0S.A06(this.A0q, this.A0y);
        C196089Xp r03 = this.A0Y;
        if (r03 != null) {
            r03.A00();
        }
        this.A0Y = new C196089Xp(this.A0X, this.A0t);
        this.A0W.A0N.add(this);
        if (this.A01 == 6) {
            AVW.A00(this.A04, this, 22);
        }
        this.A0P = (C167497y9) C165577te.A0M(this, this.A0O, this.A0q);
        AI7 A062 = this.A0I.A06(this.A03, this.A0q, (String) null);
        C195419Uf B3r = this.A0G.B3r(this.A0q);
        UserJid userJid = this.A0q;
        C19770wU r6 = this.A04;
        C21104A8p a8p = new C21104A8p(this.A0I, A062, userJid, r6);
        AnonymousClass171 r19 = this.A0n;
        C19600wD r18 = this.A07;
        C61223Ba r15 = this.A0r;
        C63553Km r4 = this.A0H;
        C64183Mz r3 = this.A0d;
        AnonymousClass9ZJ r2 = this.A0M;
        int i = this.A01;
        C63553Km r17 = r4;
        AnonymousClass9ZJ r182 = r2;
        AnonymousClass9UA r192 = this.A0N;
        C64183Mz r20 = r3;
        C167647yU r04 = (C167647yU) C165617ti.A0A(new C207939xM(B3r, r17, r182, r192, r20, a8p, r18, r19, userJid, r15, r6, i), this).A00(C167647yU.class);
        this.A0h = r04;
        r04.A0A.A08(this, new C165147sx(this, 39));
        this.A0h.A07.A08(this, new C165147sx(this, 38));
        this.A0h.A09.A08(this, new C165147sx(this, 40));
        BA7.A00(this, this.A0h.A0C.A03, 8);
        BA7.A00(this, this.A0h.A0B, 6);
        boolean z = true;
        this.A0s.A04("view_product_tag", "IsConsumer", !this.A02.A0M(this.A0q));
        AnonymousClass3L6 r12 = this.A0s;
        if (this.A0U == null) {
            z = false;
        }
        r12.A04("view_product_tag", "Cached", z);
        int i2 = this.A01;
        switch (i2) {
            case 1:
            case 7:
                str = "Message";
                break;
            case 2:
                str = "EditProduct";
                break;
            case 3:
                str = "Catalog";
                break;
            case 4:
                str = "ContactInfo";
                break;
            case 5:
                str = "Product";
                break;
            case 6:
                str = "Deeplink";
                break;
            case 8:
                str = "Cart";
                break;
            case 9:
                str = "Order";
                break;
            case 10:
                str = "TrustCard";
                break;
            default:
                throw C90464aC.A0R("ProductDetailActivity/startViewProductQpl/Unexpected value: ", AnonymousClass000.A0u(), i2);
        }
        this.A0s.A03("view_product_tag", "EntryPoint", str);
        this.A13 = this.A0V.A00();
        AnonymousClass9N7 r22 = this.A0g;
        UserJid userJid2 = this.A0q;
        AnonymousClass00C.A0D(this.A0y, 1);
        r22.A00 = userJid2;
        if (bundle == null) {
            AnonymousClass09Y A0O2 = C36341k9.A0O(this);
            A0O2.A0G = true;
            UserJid userJid3 = this.A0q;
            AnonymousClass00C.A0D(userJid3, 0);
            VariantsCarouselFragment variantsCarouselFragment = new VariantsCarouselFragment();
            Bundle A072 = AnonymousClass001.A07();
            A072.putParcelable("extra_product_owner_jid", userJid3);
            variantsCarouselFragment.A17(A072);
            A0O2.A0E(variantsCarouselFragment, (String) null, R.id.catalog_variants_carousel_fragment);
            A0O2.A03();
        }
        FragmentContainerView fragmentContainerView = this.A0A;
        if (fragmentContainerView != null) {
            this.A0c = (VariantsCarouselFragment) fragmentContainerView.getFragment();
        }
        this.A0e.A01(this.A0q);
        C207269up r05 = this.A0U;
        if (r05 != null && (r0 = r05.A0B) != null && (r02 = r0.A00) != null && (list = r02.A00) != null && list.isEmpty()) {
            C198909eO r13 = this.A0e;
            C198909eO.A00(r13, new C22464An3(r13, true));
        }
    }

    public void onDestroy() {
        this.A0K.unregisterObserver(this.A19);
        CatalogMediaCard catalogMediaCard = this.A0a;
        if (catalogMediaCard != null) {
            catalogMediaCard.A01();
        }
        this.A0W.A0N.remove(this);
        C196089Xp r0 = this.A0Y;
        if (r0 != null) {
            r0.A00();
        }
        this.A0s.A05("view_product_tag", false);
        this.A0s.A05("cart_add_tag", false);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (16908332 == menuItem2.getItemId()) {
            onBackPressed();
        } else if (R.id.menu_more_info == menuItem2.getItemId()) {
            if (!A3I()) {
                UserJid userJid = this.A0q;
                String str = this.A0y;
                ProductMoreInfoFragment productMoreInfoFragment = new ProductMoreInfoFragment();
                Bundle A072 = AnonymousClass001.A07();
                A072.putParcelable("product_owner_jid", userJid);
                A072.putString("product_id", str);
                productMoreInfoFragment.A17(A072);
                Btm(productMoreInfoFragment);
                return true;
            }
        } else if (R.id.menu_forward == menuItem2.getItemId()) {
            C167647yU r2 = this.A0h;
            int i = this.A00;
            C207269up r1 = this.A0U;
            if (r2.A0T(r1, i)) {
                this.A0Q.A01(this, this.A0Y, (AnonymousClass11F) null, this.A0q, Collections.singletonList(r1), 3, 0, 0);
                return true;
            }
        } else if (R.id.menu_share != menuItem2.getItemId()) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            UserJid userJid2 = this.A0q;
            String str2 = this.A0y;
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(getPackageName(), "com.whatsapp.ShareProductLinkActivity");
            A0D2.setAction("android.intent.action.VIEW");
            A0D2.putExtra("jid", userJid2.getRawString());
            A0D2.putExtra("product_id", str2);
            startActivity(A0D2);
            return true;
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.A12 != null) {
            this.A06.getViewTreeObserver().removeOnScrollChangedListener(this.A12);
        }
    }

    public void onResume() {
        super.onResume();
        A3i();
        this.A0h.A0C.A00();
        if (this.A12 != null) {
            this.A06.getViewTreeObserver().addOnScrollChangedListener(this.A12);
        }
    }

    public void onStart() {
        super.onStart();
        A0G(this, this.A0y);
    }
}
