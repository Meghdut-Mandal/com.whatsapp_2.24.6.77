package com.whatsapp.stickers.store.preview;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0UE;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1AP;
import X.AnonymousClass1BB;
import X.AnonymousClass1BF;
import X.AnonymousClass1HA;
import X.AnonymousClass337;
import X.AnonymousClass3K7;
import X.AnonymousClass3UF;
import X.AnonymousClass5M3;
import X.AnonymousClass68B;
import X.AnonymousClass6CV;
import X.AnonymousClass6O1;
import X.AnonymousClass6WF;
import X.AnonymousClass7d5;
import X.C117905n1;
import X.C129016Ep;
import X.C129156Fn;
import X.C148576z5;
import X.C148606z8;
import X.C161317mY;
import X.C162517oi;
import X.C162897pK;
import X.C163037pY;
import X.C164107rH;
import X.C164757sK;
import X.C18800tq;
import X.C18830tt;
import X.C19680wL;
import X.C23871Ae;
import X.C24121Be;
import X.C24171Bj;
import X.C24251Bs;
import X.C24341Cb;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C48772i1;
import X.C50142kH;
import X.C67103Yn;
import X.C81183wb;
import X.C87334Oj;
import X.C90464aC;
import X.C90494aF;
import X.C96144mr;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Map;

public class StickerStorePackPreviewActivity extends AnonymousClass155 implements C19680wL, AnonymousClass7d5, C87334Oj {
    public int A00;
    public View A01;
    public ImageView A02;
    public GridLayoutManager A03;
    public RecyclerView A04;
    public C24341Cb A05;
    public AnonymousClass6O1 A06;
    public C129016Ep A07;
    public AnonymousClass190 A08;
    public AnonymousClass1BF A09;
    public AnonymousClass6WF A0A;
    public C24251Bs A0B;
    public C23871Ae A0C;
    public C24121Be A0D;
    public AnonymousClass1HA A0E;
    public AnonymousClass1BB A0F;
    public AnonymousClass68B A0G;
    public AnonymousClass1AP A0H;
    public StickerView A0I;
    public C24171Bj A0J;
    public StickerPackDownloader A0K;
    public C96144mr A0L;
    public C50142kH A0M;
    public WDSButton A0N;
    public String A0O;
    public Map A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public View A0W;
    public View A0X;
    public View A0Y;
    public ImageView A0Z;
    public TextView A0a;
    public TextView A0b;
    public TextView A0c;
    public WDSButton A0d;
    public WDSButton A0e;
    public boolean A0f;
    public final AnonymousClass337 A0g;
    public final ViewTreeObserver.OnGlobalLayoutListener A0h;
    public final AnonymousClass0UE A0i;
    public final C161317mY A0j;
    public final C129156Fn A0k;

    private void A01(AnonymousClass68B r5) {
        String A0p;
        if (!r5.A0S) {
            String str = r5.A0M;
            if (!TextUtils.isEmpty(str) && (A0p = AnonymousClass000.A0p("https://static.whatsapp.net/sticker?img=", str, AnonymousClass000.A0u())) != null) {
                String A012 = this.A0D.A01(AnonymousClass000.A0q(this.A0D.A09(6785), AnonymousClass000.A0v(A0p)));
                if (A012 != null) {
                    if (this.A0D.A0E(7296)) {
                        C36421kH.A1H(this.A04, this, A012, 28);
                        return;
                    } else {
                        this.A0H.A04().A01(this.A02, A012);
                        return;
                    }
                }
            }
        }
        this.A0H.A0B(r5, new C148606z8(this.A02, r5.A0F));
    }

    public static void A07(AnonymousClass68B r4, StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        stickerStorePackPreviewActivity.A0G = r4;
        stickerStorePackPreviewActivity.A0V = true;
        AnonymousClass5M3 r3 = new AnonymousClass5M3(stickerStorePackPreviewActivity.A0H, new C117905n1(stickerStorePackPreviewActivity));
        stickerStorePackPreviewActivity.A04.Box(r3, r4);
    }

    public static void A0F(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        if (stickerStorePackPreviewActivity.A0D.A0E(7755)) {
            stickerStorePackPreviewActivity.startActivity(AnonymousClass190.A11(stickerStorePackPreviewActivity, "sticker_store_pack_preview"));
        } else {
            stickerStorePackPreviewActivity.A0A.A04("sticker_store_pack_preview", AnonymousClass001.A0F(stickerStorePackPreviewActivity));
        }
    }

    public static void A0H(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, boolean z) {
        AnonymousClass68B r0 = stickerStorePackPreviewActivity.A0G;
        if (r0 != null && r0.A05 != null) {
            stickerStorePackPreviewActivity.A02.setImageResource(R.drawable.sticker_empty);
            C96144mr r2 = stickerStorePackPreviewActivity.A0L;
            for (AnonymousClass6CV r02 : C96144mr.A00(r2)) {
                r02.A00 = z;
            }
            r2.A06();
        }
    }

    public static boolean A0I(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        String str;
        if (stickerStorePackPreviewActivity.A02.A0L() || !stickerStorePackPreviewActivity.A0D.A0E(1396) || (str = stickerStorePackPreviewActivity.A0O) == null || !str.equals("meta-avatar")) {
            return false;
        }
        return true;
    }

    public void A2F() {
        if (!this.A0f) {
            this.A0f = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A08 = C36351kA.A0h(r2);
            this.A0C = (C23871Ae) r2.A0V.get();
            this.A07 = C27111My.A28(A0L2);
            this.A0F = (AnonymousClass1BB) r2.A85.get();
            this.A05 = C36431kI.A0a(r2);
            this.A0H = (AnonymousClass1AP) r2.A89.get();
            this.A09 = (AnonymousClass1BF) r2.A0Q.get();
            this.A0K = (StickerPackDownloader) r2.A87.get();
            this.A0E = (AnonymousClass1HA) r2.A84.get();
            this.A0A = (AnonymousClass6WF) A0L2.A04.get();
            this.A0D = (C24121Be) r2.Ab7.get();
            this.A0B = (C24251Bs) r2.AAn.get();
            this.A0J = (C24171Bj) r2.AbR.get();
            this.A06 = C36351kA.A0c(r1);
        }
    }

    public void BUP(AnonymousClass3K7 r2) {
        if (r2.A02) {
            A0G(this);
            C96144mr r0 = this.A0L;
            if (r0 != null) {
                r0.A06();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C129016Ep r2 = this.A07;
        String str = this.A0O;
        AnonymousClass00C.A0D(str, 0);
        if (!AnonymousClass00C.A0J(r2.A01(), str) && !this.A0O.contains(" ")) {
            getMenuInflater().inflate(R.menu.f11nameremoved, menu);
            MenuItem findItem = menu.findItem(R.id.menu_sticker_pack_share);
            Drawable icon = findItem.getIcon();
            icon.mutate();
            icon.setColorFilter(getResources().getColor(R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
            findItem.setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public StickerStorePackPreviewActivity(int i) {
        this.A0f = false;
        C163037pY.A00(this, 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r2.A0S != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        if (r2.A01() == false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r8) {
        /*
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x0083
            X.68B r2 = r8.A0G
            r5 = 8
            r3 = 0
            if (r2 == 0) goto L_0x017c
            android.view.View r0 = r8.A0Y
            r0.setVisibility(r5)
            android.view.View r0 = r8.A0W
            r0.setVisibility(r3)
            android.widget.TextView r1 = r8.A0b
            java.lang.String r0 = r2.A0H
            r1.setText(r0)
            android.widget.TextView r1 = r8.A0a
            java.lang.String r0 = r2.A0B
            r1.setText(r0)
            android.widget.TextView r7 = r8.A0c
            r6 = 2131894633(0x7f122169, float:1.9424076E38)
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r2.A0J
            r1[r3] = r0
            X.C36341k9.A0s(r8, r7, r1, r6)
            android.widget.ImageView r1 = r8.A0Z
            boolean r0 = r8.A0U
            if (r0 != 0) goto L_0x0175
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0179
        L_0x003e:
            r0 = 8
        L_0x0040:
            r1.setVisibility(r0)
            r8.A01(r2)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8.A0R
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8.A0V
            if (r0 != 0) goto L_0x018d
            boolean r0 = A0I(r8)
            if (r0 == 0) goto L_0x0084
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setVisibility(r5)
            android.view.View r0 = r8.A0X
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0e
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0e
            r0.setClickable(r4)
            A0H(r8, r3)
            r8.A01(r2)
        L_0x0077:
            r0 = 2131431592(0x7f0b10a8, float:1.8484918E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0083
            X.C33521fV.A02(r0)
        L_0x0083:
            return
        L_0x0084:
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x008d
            boolean r0 = r2.A0S
            r1 = 0
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r1 = 1
        L_0x008e:
            android.view.View r0 = r8.A0X
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0e
            r0.setVisibility(r5)
            if (r1 == 0) goto L_0x00f1
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setVisibility(r5)
            long r1 = r2.A02
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            X.0ts r0 = r8.A00
            java.lang.String r2 = X.AnonymousClass3TF.A02(r0, r1)
            r0 = 2131894545(0x7f122111, float:1.9423898E38)
            java.lang.String r1 = X.C36351kA.A0w(r8, r2, r4, r0)
            r0 = 2131894623(0x7f12215f, float:1.9424056E38)
            java.lang.String r0 = X.C36351kA.A0w(r8, r2, r4, r0)
        L_0x00bb:
            X.00I r0 = X.C36441kJ.A0W(r1, r0)
            java.lang.Object r2 = r0.A00
            X.C18740tg.A06(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            X.C18740tg.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setText(r2)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setContentDescription(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setClickable(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
        L_0x00de:
            r0.setVisibility(r3)
            goto L_0x0077
        L_0x00e2:
            r0 = 2131894544(0x7f122110, float:1.9423896E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894622(0x7f12215e, float:1.9424054E38)
            java.lang.String r0 = r8.getString(r0)
            goto L_0x00bb
        L_0x00f1:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setVisibility(r5)
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0101
            boolean r0 = r2.A01()
            r7 = 1
            if (r0 != 0) goto L_0x0102
        L_0x0101:
            r7 = 0
        L_0x0102:
            long r1 = r2.A02
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r7 == 0) goto L_0x0153
            if (r0 == 0) goto L_0x0148
            X.0ts r0 = r8.A00
            java.lang.String r2 = X.AnonymousClass3TF.A02(r0, r1)
            r0 = 2131894585(0x7f122139, float:1.9423979E38)
            java.lang.String r1 = X.C36351kA.A0w(r8, r2, r4, r0)
            r0 = 2131894586(0x7f12213a, float:1.942398E38)
        L_0x0120:
            java.lang.String r0 = X.C36351kA.A0w(r8, r2, r4, r0)
        L_0x0124:
            X.00I r0 = X.C36441kJ.A0W(r1, r0)
            java.lang.Object r2 = r0.A00
            X.C18740tg.A06(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            X.C18740tg.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setText(r2)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setContentDescription(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setClickable(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            goto L_0x00de
        L_0x0148:
            r0 = 2131894583(0x7f122137, float:1.9423975E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894584(0x7f122138, float:1.9423977E38)
            goto L_0x0170
        L_0x0153:
            if (r0 == 0) goto L_0x0166
            X.0ts r0 = r8.A00
            java.lang.String r2 = X.AnonymousClass3TF.A02(r0, r1)
            r0 = 2131894550(0x7f122116, float:1.9423908E38)
            java.lang.String r1 = X.C36351kA.A0w(r8, r2, r4, r0)
            r0 = 2131894627(0x7f122163, float:1.9424064E38)
            goto L_0x0120
        L_0x0166:
            r0 = 2131894550(0x7f122116, float:1.9423908E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894626(0x7f122162, float:1.9424062E38)
        L_0x0170:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x0124
        L_0x0175:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x003e
        L_0x0179:
            r0 = 0
            goto L_0x0040
        L_0x017c:
            android.view.View r1 = r8.A0Y
            if (r1 == 0) goto L_0x0083
            android.view.View r0 = r8.A0W
            if (r0 == 0) goto L_0x0083
            r1.setVisibility(r3)
            android.view.View r0 = r8.A0W
            r0.setVisibility(r5)
            return
        L_0x018d:
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x0195
            A0H(r8, r4)
            return
        L_0x0195:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            java.lang.String r1 = ""
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setClickable(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0d
            r0.setClickable(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0e
            r0.setClickable(r3)
            android.view.View r0 = r8.A0X
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0G(com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 28) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A0O = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra = getIntent().getStringExtra("sticker_pack_preview_source");
        this.A0U = "sticker_store_my_tab".equals(stringExtra);
        this.A0S = "deeplink".equals(stringExtra);
        this.A0T = "info_dialog".equals(stringExtra);
        this.A0F.registerObserver(this.A0k);
        if (A0I(this)) {
            this.A0B.registerObserver(this.A0j);
        }
        this.A0H.A0C(new C148576z5(this), this.A0O, true);
        if (this.A0O == null) {
            Log.e("StickerStorePackPreviewActivity/onCreate no pack id passed");
            finish();
        }
        View view = this.A00;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        AnonymousClass3UF.A0D(this, toolbar, this.A00, R.color.f6nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        toolbar.setNavigationContentDescription((int) R.string.f12nameremoved);
        toolbar.setNavigationOnClickListener(new C67103Yn((Object) this, 24));
        setSupportActionBar(toolbar);
        this.A0W = view.findViewById(R.id.details_container);
        this.A0Y = view.findViewById(R.id.loading_progress);
        this.A0b = C36391kE.A0P(view, R.id.pack_preview_title);
        this.A0c = C36391kE.A0P(view, R.id.pack_preview_publisher);
        this.A0a = C36391kE.A0P(view, R.id.pack_preview_description);
        this.A0X = view.findViewById(R.id.pack_download_progress);
        this.A02 = C36391kE.A0N(view, R.id.pack_tray_icon);
        this.A01 = view.findViewById(R.id.divider);
        this.A0N = (WDSButton) view.findViewById(R.id.download_btn);
        this.A0d = (WDSButton) view.findViewById(R.id.delete_btn);
        this.A0e = (WDSButton) view.findViewById(R.id.edit_avatar_btn);
        this.A0Z = C36391kE.A0N(view, R.id.sticker_pack_animation_icon);
        C48772i1.A00(this.A0N, this, 27);
        C48772i1.A00(this.A0d, this, 28);
        C48772i1.A00(this.A0e, this, 29);
        this.A03 = new GridLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_preview_recycler);
        this.A04 = recyclerView;
        recyclerView.setLayoutManager(this.A03);
        this.A04.A0v(this.A0i);
        this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A0h);
        StickerView stickerView = (StickerView) view.findViewById(R.id.sticker_preview_expanded_sticker);
        this.A0I = stickerView;
        stickerView.A02 = true;
        this.A07.registerObserver(this);
        if (A0I(this)) {
            if (this.A0S) {
                this.A0C.A01(8);
            }
            this.A0C.A03((Boolean) null, 16);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.unregisterObserver(this.A0k);
        AnonymousClass1HA r0 = this.A0E;
        if (r0 != null) {
            r0.A06();
        }
        this.A07.unregisterObserver(this);
        C50142kH r1 = this.A0M;
        if (r1 != null) {
            r1.A0D(true);
            this.A0M = null;
        }
        Map map = this.A0P;
        if (map != null) {
            this.A04.Boy(new C81183wb(C90494aF.A0g(map), 6));
            this.A0P.clear();
            this.A0P = null;
        }
        if (A0I(this)) {
            this.A0B.unregisterObserver(this.A0j);
            if (this.A0S) {
                this.A0C.A00(8);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_sticker_pack_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A02(31, 1, 8);
        startActivity(AnonymousClass190.A12(this, String.format("https://wa.me/stickerpack/%s", new Object[]{this.A0O})));
        return true;
    }

    public StickerStorePackPreviewActivity() {
        this(0);
        this.A0k = new C162897pK(this, 5);
        this.A0j = new C164107rH(this, 3);
        this.A0V = true;
        this.A0Q = false;
        this.A0i = new C162517oi(this, 18);
        this.A0g = new AnonymousClass337(this);
        this.A0h = new C164757sK(this, 24);
    }
}
