package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1N6;
import X.AnonymousClass1NC;
import X.AnonymousClass1Pp;
import X.AnonymousClass1Q6;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RW;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1V9;
import X.AnonymousClass1WR;
import X.AnonymousClass1YZ;
import X.AnonymousClass1Z8;
import X.AnonymousClass2MZ;
import X.AnonymousClass2Mw;
import X.AnonymousClass2N0;
import X.AnonymousClass3HF;
import X.AnonymousClass3LR;
import X.AnonymousClass3PI;
import X.AnonymousClass3SY;
import X.AnonymousClass3TR;
import X.AnonymousClass3TS;
import X.AnonymousClass3UR;
import X.AnonymousClass4TI;
import X.AnonymousClass4W3;
import X.AnonymousClass753;
import X.C02800By;
import X.C02810Bz;
import X.C129036Er;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C18950u5;
import X.C19430v1;
import X.C19460v5;
import X.C19470v6;
import X.C19730wQ;
import X.C19770wU;
import X.C20010ws;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21010yW;
import X.C226815j;
import X.C24631De;
import X.C27111My;
import X.C27731Pn;
import X.C27761Ps;
import X.C32601dt;
import X.C32611du;
import X.C32671e0;
import X.C33081eg;
import X.C35731jA;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C37851nJ;
import X.C40401vU;
import X.C44142Ma;
import X.C44462Np;
import X.C44482Nr;
import X.C48762i0;
import X.C61633Cv;
import X.C63343Jr;
import X.C64873Pt;
import X.C67133Yq;
import X.C81163wZ;
import X.C87964Qw;
import X.C87984Qy;
import X.C88894Ul;
import X.C89364Wg;
import X.C89734Xr;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.List;

public class Settings extends AnonymousClass155 implements AnonymousClass4TI, C87964Qw, C87984Qy {
    public int A00;
    public long A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public RecyclerView A05;
    public C19460v5 A06;
    public C19460v5 A07;
    public C19460v5 A08;
    public C19460v5 A09;
    public C19460v5 A0A;
    public C19460v5 A0B;
    public C19460v5 A0C;
    public C19460v5 A0D;
    public C19460v5 A0E;
    public AnonymousClass1WR A0F;
    public AnonymousClass1NC A0G;
    public C32601dt A0H;
    public TextEmojiLabel A0I;
    public TextEmojiLabel A0J;
    public WaImageView A0K;
    public AnonymousClass1Q6 A0L;
    public C129036Er A0M;
    public AnonymousClass1Pp A0N;
    public AnonymousClass16D A0O;
    public AnonymousClass16I A0P;
    public AnonymousClass171 A0Q;
    public AnonymousClass1RY A0R;
    public AnonymousClass1RY A0S;
    public C27731Pn A0T;
    public C27761Ps A0U;
    public C32611du A0V;
    public AnonymousClass3HF A0W;
    public AnonymousClass1V6 A0X;
    public C33081eg A0Y;
    public C32671e0 A0Z;
    public AnonymousClass141 A0a;
    public AnonymousClass1YZ A0b;
    public C63343Jr A0c;
    public C21010yW A0d;
    public AnonymousClass190 A0e;
    public C24631De A0f;
    public AnonymousClass1EV A0g;
    public AnonymousClass1EU A0h;
    public AnonymousClass1FR A0i;
    public AnonymousClass3TS A0j;
    public C61633Cv A0k;
    public C64873Pt A0l;
    public AnonymousClass3TR A0m;
    public AnonymousClass3PI A0n;
    public C40401vU A0o;
    public AnonymousClass1N6 A0p;
    public AnonymousClass13J A0q;
    public AnonymousClass1RJ A0r;
    public AnonymousClass1RJ A0s;
    public C88894Ul A0t;
    public WDSSearchBar A0u;
    public AnonymousClass005 A0v;
    public AnonymousClass005 A0w;
    public AnonymousClass005 A0x;
    public AnonymousClass005 A0y;
    public AnonymousClass005 A0z;
    public AnonymousClass005 A10;
    public AnonymousClass005 A11;
    public AnonymousClass005 A12;
    public String A13;
    public String A14;
    public List A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public LinearLayout A19;
    public TextEmojiLabel A1A;
    public AnonymousClass1RW A1B;
    public boolean A1C;
    public boolean A1D;
    public final C226815j A1E;
    public final C20010ws A1F;

    private void A01() {
        if (this.A17 && this.A16 && this.A0s != null) {
            Log.i("Settings/updatePushName");
            TextEmojiLabel A0I2 = C36421kH.A0I(this, R.id.me_tab_profile_info_name_second_line);
            this.A1A = A0I2;
            C129036Er r4 = this.A0M;
            TextEmojiLabel textEmojiLabel = this.A0J;
            AnonymousClass1RJ r5 = this.A0s;
            C36321k7.A11(textEmojiLabel, A0I2, r5);
            textEmojiLabel.post(new AnonymousClass753(this, textEmojiLabel, A0I2, r4, r5, 6));
        }
    }

    public boolean A2g() {
        return true;
    }

    public void finish() {
        WDSSearchBar wDSSearchBar = this.A0u;
        if (wDSSearchBar == null || !AnonymousClass000.A1Q(wDSSearchBar.A07.getVisibility())) {
            super.finish();
            return;
        }
        this.A0u.A02(true);
        A0F(this);
    }

    public static void A0F(Settings settings) {
        C40401vU r1 = settings.A0o;
        if (r1 != null) {
            r1.A0M((List) null);
        }
        C36341k9.A0y(settings.A05);
        LinearLayout linearLayout = settings.A19;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public static void A0G(Settings settings) {
        C63343Jr r3;
        int i = 8;
        settings.A0I.setVisibility(8);
        if (settings.A17) {
            View findViewById = settings.findViewById(R.id.me_tab_add_text_status_button);
            settings.A03 = findViewById;
            AnonymousClass17Y r4 = settings.A05;
            C19770wU r7 = settings.A04;
            r3 = new C44142Ma(r4, settings.A00, settings.A0C, r7, AnonymousClass001.A0F(findViewById));
        } else {
            View A0K2 = C36341k9.A0K(settings, R.id.text_status);
            settings.A03 = A0K2;
            AnonymousClass17Y r42 = settings.A05;
            C19770wU r72 = settings.A04;
            r3 = new AnonymousClass2MZ(r42, settings.A00, settings.A0C, r72, AnonymousClass001.A0F(A0K2));
        }
        settings.A0c = r3;
        View view = settings.A03;
        if (view != null) {
            view.setVisibility(0);
            C48762i0.A00(settings.A03, settings, 28);
        }
        View findViewById2 = settings.findViewById(R.id.text_status_divider);
        if (settings.A03 != null && !settings.A17) {
            i = 0;
        }
        findViewById2.setVisibility(i);
    }

    public static void A0H(Settings settings) {
        settings.A0d.Bly(new AnonymousClass2Mw());
        settings.A0d.Bly(new AnonymousClass2N0());
        LanguageSelectorBottomSheet languageSelectorBottomSheet = new LanguageSelectorBottomSheet();
        languageSelectorBottomSheet.A05 = settings;
        languageSelectorBottomSheet.A06 = settings;
        languageSelectorBottomSheet.A04 = new AnonymousClass3LR(languageSelectorBottomSheet, settings, 1);
        settings.Btm(languageSelectorBottomSheet);
    }

    public static void A0I(Settings settings) {
        AnonymousClass141 r2 = settings.A0a;
        if (r2 != null) {
            AnonymousClass1RY r1 = settings.A0R;
            if (r1 != null) {
                r1.A08(settings.A04, r2);
                return;
            }
            return;
        }
        settings.A0N.A05(settings.A04, -1.0f, R.drawable.avatar_contact, settings.A00);
    }

    public static void A0J(Settings settings) {
        WDSSearchBar wDSSearchBar = settings.A0u;
        if (wDSSearchBar == null || !AnonymousClass000.A1Q(wDSSearchBar.A07.getVisibility()) || settings.A13.isEmpty()) {
            A0F(settings);
            return;
        }
        C36341k9.A0y(settings.A19);
        C40401vU r1 = settings.A0o;
        if (r1 != null) {
            r1.A0M(settings.A15);
        }
        RecyclerView recyclerView = settings.A05;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
            settings.A05.A0H(new C81163wZ(settings, 17));
        }
    }

    public static void A0K(Settings settings, Integer num) {
        int i = 0;
        if (settings.A17) {
            i = 4;
        }
        settings.A0k.A00(num.intValue(), Integer.valueOf(i));
    }

    public static void A0L(Settings settings, String str) {
        int i;
        String str2 = settings.A14;
        boolean equals = str.equals(str2);
        if (equals) {
            i = 1;
        } else {
            i = 0;
            if (settings.A17) {
                i = 4;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (str2 == null || equals) {
            settings.A0k.A00(settings.A0n.A01(str), valueOf);
        }
    }

    public void A2F() {
        if (!this.A1C) {
            this.A1C = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0F = (AnonymousClass1WR) r2.A03.get();
            this.A0e = C36351kA.A0h(r2);
            this.A0G = C36401kF.A0J(r2);
            C19470v6 r1 = C19470v6.A00;
            this.A0B = r1;
            this.A0A = r1;
            this.A0d = C36351kA.A0g(r2);
            this.A0H = (C32601dt) r3.A46.get();
            this.A0b = (AnonymousClass1YZ) r2.ATq.get();
            this.A0k = (C61633Cv) r3.ACA.get();
            this.A09 = r1;
            this.A0T = C36351kA.A0T(r2);
            this.A0i = C36431kI.A0p(r2);
            this.A08 = C36391kE.A0S(r2);
            this.A0N = C36361kB.A0V(r2);
            this.A0O = C36341k9.A0R(r2);
            this.A0Z = C18830tt.A4I(r3);
            this.A0m = (AnonymousClass3TR) r3.ACB.get();
            this.A0q = C36351kA.A0q(r2);
            this.A0Q = C36341k9.A0S(r2);
            this.A0h = C36381kD.A0f(r2);
            this.A0P = C36351kA.A0S(r2);
            this.A0V = (C32611du) r3.A2N.get();
            this.A12 = C18840tu.A00(r3.ADH);
            this.A11 = C18840tu.A00(r2.A9U);
            this.A0l = (C64873Pt) r3.A9Y.get();
            this.A0j = (AnonymousClass3TS) r3.A30.get();
            this.A0n = C27111My.A3F(A0L2);
            this.A0v = C18840tu.A00(r2.A08);
            this.A0g = C36371kC.A0h(r2);
            this.A0f = (C24631De) r2.A6J.get();
            this.A0M = (C129036Er) A0L2.A01.get();
            this.A0D = r1;
            this.A0z = C18840tu.A00(r3.AB1);
            this.A0W = (AnonymousClass3HF) r3.A2h.get();
            this.A0U = C36361kB.A0W(r2);
            this.A0X = (AnonymousClass1V6) r2.A4v.get();
            this.A0p = C36361kB.A0e(r2);
            this.A0Y = (C33081eg) A0L2.A0S.get();
            this.A07 = r1;
            this.A0y = C18840tu.A00(r3.A35);
            this.A0L = (AnonymousClass1Q6) r3.A28.get();
            this.A10 = C18840tu.A00(r3.A3o);
            this.A0C = r1;
            this.A0E = r1;
            this.A0w = C18840tu.A00(r2.A1u);
            this.A0x = C18840tu.A00(r2.A3f);
            this.A06 = r1;
        }
    }

    public void A2X() {
        this.A0p.A03((AnonymousClass11F) null, 22);
        super.A2X();
    }

    public C37851nJ B8G() {
        C18820ts r3 = this.A00;
        return new C37851nJ(this, r3, AnonymousClass3SY.A01(this.A02, this.A08, r3, this.A0q), AnonymousClass3SY.A03());
    }

    public void BZY() {
        if (this.A01 > 0) {
            C44462Np r6 = new C44462Np();
            r6.A00 = Long.valueOf(System.currentTimeMillis() - this.A01);
            this.A0d.Bly(r6);
            this.A01 = 0;
        }
    }

    public void BZZ() {
        if (this.A18) {
            this.A18 = false;
            finish();
            startActivity(getIntent());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200 && i2 == -1) {
            this.A08.A02();
            throw AnonymousClass001.A0A("getSubscriptionManagementIntent");
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0296, code lost:
        if (r6.A0g.A0G() != false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r1 == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            boolean r0 = X.AnonymousClass3U9.A00
            r6 = r20
            if (r0 == 0) goto L_0x000f
            android.view.Window r1 = r6.getWindow()
            r0 = 12
            r1.requestFeature(r0)
        L_0x000f:
            r0 = r21
            super.onCreate(r0)
            X.0yC r0 = r6.A0D
            r2 = 4023(0xfb7, float:5.637E-42)
            boolean r0 = r0.A0E(r2)
            r6.A17 = r0
            X.005 r0 = r6.A0v
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            boolean r0 = r0.A0B()
            r6.A16 = r0
            boolean r0 = r6.A17
            r3 = 2131896978(0x7f122a92, float:1.9428833E38)
            if (r0 == 0) goto L_0x0036
            r3 = 2131896981(0x7f122a95, float:1.9428839E38)
        L_0x0036:
            r6.setTitle(r3)
            X.0yC r1 = r6.A0D
            if (r1 == 0) goto L_0x0048
            r0 = 7766(0x1e56, float:1.0882E-41)
            boolean r1 = r1.A0E(r0)
            r0 = 2131625934(0x7f0e07ce, float:1.887909E38)
            if (r1 != 0) goto L_0x004b
        L_0x0048:
            r0 = 2131625907(0x7f0e07b3, float:1.8879035E38)
        L_0x004b:
            r6.setContentView((int) r0)
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.A19 = r0
            androidx.appcompat.widget.Toolbar r0 = X.C36361kB.A0N(r6)
            r6.setSupportActionBar(r0)
            X.07B r0 = X.C36381kD.A0O(r6)
            r0.A0I(r3)
            r5 = 1
            r0.A0U(r5)
            X.3TR r0 = r6.A0m
            r0.A04()
            r0 = 2131435329(0x7f0b1f41, float:1.8492497E38)
            android.view.View r0 = r6.findViewById(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = (com.whatsapp.wds.components.search.WDSSearchBar) r0
            r6.A0u = r0
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A07
            r9 = 5
            X.4Xq r0 = new X.4Xq
            r0.<init>(r6, r9)
            r1.setOnQueryTextChangeListener(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r6.A0u
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A07
            X.2mt r0 = X.C50942mt.A00
            r1.setTrailingButtonIcon(r0)
            r0 = 14
            X.1vp r1 = new X.1vp
            r1.<init>(r6, r0)
            X.1vU r0 = new X.1vU
            r0.<init>(r1)
            r6.A0o = r0
            X.142 r0 = X.C36431kI.A0V(r6)
            r6.A0a = r0
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "Settings/onCreate/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass190.A09(r6)
            r6.startActivity(r0)
            r6.finish()
        L_0x00b4:
            return
        L_0x00b5:
            X.3Pt r3 = r6.A0l
            boolean r0 = r6.A17
            X.2Nq r1 = new X.2Nq
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.0yW r0 = r3.A01
            r0.Bly(r1)
            boolean r8 = r6.A17
            r0 = 2131435068(0x7f0b1e3c, float:1.8491968E38)
            android.view.View r12 = r6.findViewById(r0)
            r0 = 2131432964(0x7f0b1604, float:1.84877E38)
            android.view.View r7 = r6.findViewById(r0)
            r0 = 2131434009(0x7f0b1a19, float:1.848982E38)
            android.view.View r13 = r6.findViewById(r0)
            boolean r0 = r6.A16
            if (r0 == 0) goto L_0x013c
            X.005 r0 = r6.A0v
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            boolean r0 = r0.A0A()
            r4 = 0
            if (r0 == 0) goto L_0x0111
            X.0ts r1 = r6.A00
            X.0wQ r0 = r6.A02
            X.142 r0 = X.C36381kD.A0T(r0)
            java.lang.String r1 = X.AnonymousClass3U8.A02(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0111
            r0 = 2131432982(0x7f0b1616, float:1.8487737E38)
            android.view.View r0 = X.C36341k9.A0K(r6, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L_0x0111:
            r0 = 2131427441(0x7f0b0071, float:1.8476498E38)
            X.1RJ r3 = X.C36351kA.A0r(r6, r0)
            r3.A03(r4)
            r1 = 2
            X.3Y7 r0 = new X.3Y7
            r0.<init>(r6, r1)
            r3.A05(r0)
            android.view.View r1 = r3.A01()
            r0 = 2131431859(0x7f0b11b3, float:1.848546E38)
            X.1RJ r0 = X.C36341k9.A0Y(r1, r0)
            r6.A0r = r0
            X.0wU r3 = r6.A04
            r1 = 4
            X.4WP r0 = new X.4WP
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.C36391kE.A1Q(r0, r3)
        L_0x013c:
            java.lang.String r11 = "settings-activity-contact-photo"
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 8
            r3 = 0
            if (r8 != 0) goto L_0x03a0
            r7.setVisibility(r3)
            r12.setVisibility(r4)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167949(0x7f070acd, float:1.7950186E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r6.A00 = r1
            X.1Pn r0 = r6.A0T
            X.1RY r0 = r0.A06(r11, r10, r1)
            r6.A0R = r0
            r0 = 2131432968(0x7f0b1608, float:1.8487708E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r6, r0)
            r6.A04 = r0
            r0.setVisibility(r3)
            r0 = 2131432966(0x7f0b1606, float:1.8487704E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36421kH.A0I(r6, r0)
            r6.A0J = r0
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r1 = r6.A0J
            java.lang.String r0 = X.C36391kE.A0w(r6)
            r1.A0I(r0)
            r0 = 2131432971(0x7f0b160b, float:1.8487715E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36421kH.A0I(r6, r0)
            r6.A0I = r0
        L_0x018a:
            X.0yC r1 = r6.A0D
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01a4
            A0G(r6)
            X.1YZ r0 = r6.A0b
            X.3Jg r1 = r0.A00()
            if (r1 == 0) goto L_0x0388
            X.3Jr r0 = r6.A0c
            r0.A01(r1)
        L_0x01a4:
            if (r8 != 0) goto L_0x0371
            r0 = 2131432969(0x7f0b1609, float:1.848771E38)
            android.view.View r0 = r6.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r6.A0K = r0
        L_0x01b1:
            boolean r1 = X.C36421kH.A1V(r6)
            com.whatsapp.WaImageView r0 = r6.A0K
            if (r1 != 0) goto L_0x036c
            X.AnonymousClass3Y7.A00(r0, r6, r5)
            com.whatsapp.WaImageView r0 = r6.A0K
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r1 = r6.A0K
            r0 = 2131894258(0x7f121ff2, float:1.9423316E38)
            X.C36331k8.A0q(r6, r1, r0)
            if (r8 != 0) goto L_0x01da
            com.whatsapp.WaImageView r2 = r6.A0K
            r1 = 2130969812(0x7f0404d4, float:1.7548316E38)
            r0 = 2131101064(0x7f060588, float:1.7814527E38)
            int r0 = X.C36351kA.A01(r6, r1, r0)
            X.AnonymousClass3UF.A0E(r2, r0)
        L_0x01da:
            r1 = 17
            X.2i4 r0 = new X.2i4
            r0.<init>(r6, r3, r1)
            r7.setOnClickListener(r0)
            A0I(r6)
            X.16I r1 = r6.A0P
            X.15j r0 = r6.A1E
            r1.registerObserver(r0)
            if (r8 == 0) goto L_0x0308
            r0 = 2131433972(0x7f0b19f4, float:1.8489745E38)
            android.view.View r8 = r6.findViewById(r0)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 2131427504(0x7f0b00b0, float:1.8476626E38)
            android.view.View r10 = r6.findViewById(r0)
            r2 = 25
            r1 = 17
            X.2i4 r0 = new X.2i4
            r0.<init>(r6, r2, r1)
            r10.setOnClickListener(r0)
            r0 = 2131427503(0x7f0b00af, float:1.8476624E38)
            android.view.View r2 = r6.findViewById(r0)
            r0 = 29
            X.C48762i0.A00(r2, r6, r0)
            r0 = 2131427502(0x7f0b00ae, float:1.8476622E38)
            android.view.View r7 = r6.findViewById(r0)
            r0 = 30
            X.C48762i0.A00(r7, r6, r0)
            X.0yC r1 = r6.A0D
            r0 = 5903(0x170f, float:8.272E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x023b
            r8.removeView(r10)
            r8.removeView(r2)
            r8.addView(r2, r3)
            r0 = 2
            r8.addView(r10, r0)
        L_0x023b:
            float r1 = X.AnonymousClass1R1.A01(r6)
            float r0 = X.C36341k9.A00(r6)
            float r1 = r1 / r0
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r2)
            if (r0 == 0) goto L_0x034c
            r8.setOrientation(r5)
            r2.setMarginStart(r3)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r7)
            r0.setMarginStart(r3)
        L_0x025f:
            r0 = 2131432913(0x7f0b15d1, float:1.8487597E38)
            X.C36341k9.A13(r6, r0, r4)
            r0 = 2131433936(0x7f0b19d0, float:1.8489672E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 31
            X.C48762i0.A00(r1, r6, r0)
            r0 = 2131433921(0x7f0b19c1, float:1.8489641E38)
            android.view.View r1 = r6.findViewById(r0)
            boolean r0 = X.C36421kH.A1V(r6)
            if (r0 == 0) goto L_0x0345
            r1.setVisibility(r4)
        L_0x0281:
            X.1EV r0 = r6.A0g
            boolean r0 = r0.A04(r3)
            if (r0 != 0) goto L_0x0298
            X.1EV r0 = r6.A0g
            X.1De r0 = r0.A04
            r0.A02()
            X.1EV r0 = r6.A0g
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x02c9
        L_0x0298:
            boolean r0 = X.C36421kH.A1V(r6)
            if (r0 != 0) goto L_0x02c9
            r0 = 2131433928(0x7f0b19c8, float:1.8489656E38)
            android.view.View r4 = r6.findViewById(r0)
            X.4Ul r4 = (X.C88894Ul) r4
            r4.setVisibility(r3)
            r1 = 33
            X.2i0 r0 = new X.2i0
            r0.<init>(r6, r1)
            r4.setOnClickListener(r0)
            X.1FR r3 = r6.A0i
            r2 = 2131102239(0x7f060a1f, float:1.781691E38)
            r1 = 2131168998(0x7f070ee6, float:1.7952314E38)
            X.1De r0 = r6.A0f
            X.9l8 r0 = r0.A02()
            X.1lL r0 = r3.A0K(r6, r0, r2, r1)
            r4.setIcon((android.graphics.drawable.Drawable) r0)
        L_0x02c9:
            r1 = 2131433944(0x7f0b19d8, float:1.8489688E38)
            r0 = 2131234288(0x7f080df0, float:1.8084738E38)
            r6.A07(r1, r0)
            r1 = 2131433950(0x7f0b19de, float:1.84897E38)
            r0 = 2131234066(0x7f080d12, float:1.8084287E38)
            r6.A07(r1, r0)
            r1 = 2131433975(0x7f0b19f7, float:1.848975E38)
            r0 = 2131234294(0x7f080df6, float:1.808475E38)
            r6.A07(r1, r0)
            r1 = 2131433951(0x7f0b19df, float:1.8489702E38)
            r0 = 2131234282(0x7f080dea, float:1.8084725E38)
            r6.A07(r1, r0)
            r1 = 2131433970(0x7f0b19f2, float:1.848974E38)
            r0 = 2131234290(0x7f080df2, float:1.8084742E38)
            r6.A07(r1, r0)
            r1 = 2131433969(0x7f0b19f1, float:1.8489739E38)
            r0 = 2131234284(0x7f080dec, float:1.808473E38)
            r6.A07(r1, r0)
            r1 = 2131433940(0x7f0b19d4, float:1.848968E38)
            r0 = 2131234286(0x7f080dee, float:1.8084733E38)
            r6.A07(r1, r0)
        L_0x0308:
            r0 = 2131433969(0x7f0b19f1, float:1.8489739E38)
            android.view.View r3 = r6.findViewById(r0)
            X.4Ul r3 = (X.C88894Ul) r3
            r1 = 38
            X.2i0 r0 = new X.2i0
            r0.<init>(r6, r1)
            r3.setOnClickListener(r0)
            X.0ts r2 = r6.A00
            r0 = 2131232720(0x7f0807d0, float:1.8081557E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r6, r0)
            X.4vc r0 = new X.4vc
            r0.<init>(r1, r2)
            r3.setIcon((android.graphics.drawable.Drawable) r0)
            r0 = 2131433940(0x7f0b19d4, float:1.848968E38)
            android.view.View r1 = r6.findViewById(r0)
            r2 = 8
            r0 = 46
            X.C67133Yq.A00(r1, r6, r0)
            X.005 r0 = r6.A0z
            java.lang.Object r4 = r0.get()
            X.39P r4 = (X.AnonymousClass39P) r4
            r7 = 0
            goto L_0x0525
        L_0x0345:
            r0 = 32
            X.C48762i0.A00(r1, r6, r0)
            goto L_0x0281
        L_0x034c:
            r8.setOrientation(r3)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168266(0x7f070c0a, float:1.7950829E38)
            float r1 = r1.getDimension(r0)
            float r0 = X.C36341k9.A00(r6)
            float r1 = r1 / r0
            int r1 = (int) r1
            r2.setMarginStart(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r7)
            r0.setMarginStart(r1)
            goto L_0x025f
        L_0x036c:
            r0.setVisibility(r4)
            goto L_0x01da
        L_0x0371:
            r0 = 2131431465(0x7f0b1029, float:1.848466E38)
            android.view.View r0 = r6.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r6.A0K = r0
            r0 = 2131431466(0x7f0b102a, float:1.8484662E38)
            android.view.View r0 = r6.findViewById(r0)
            X.AnonymousClass3Y7.A00(r0, r6, r3)
            goto L_0x01b1
        L_0x0388:
            X.0wU r2 = r6.A04
            r1 = 18
            X.3wZ r0 = new X.3wZ
            r0.<init>((com.whatsapp.settings.Settings) r6, (int) r1)
            r2.Bp1(r0)
            boolean r0 = r6.A17
            if (r0 != 0) goto L_0x01a4
            X.3Jr r1 = r6.A0c
            r0 = 0
            r1.A01(r0)
            goto L_0x01a4
        L_0x03a0:
            r0 = 2131431469(0x7f0b102d, float:1.8484668E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            X.1eg r0 = r6.A0Y
            X.0yC r1 = r0.A01
            boolean r0 = r1.A0E(r2)
            if (r0 == 0) goto L_0x051e
            r0 = 5235(0x1473, float:7.336E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x051e
            X.1eg r0 = r6.A0Y
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences r14 = X.C36341k9.A0E(r0)
            java.lang.String r2 = "create_group_banner_creation_time"
            r0 = 0
            long r18 = r14.getLong(r2, r0)
            int r14 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            boolean r17 = X.AnonymousClass000.A1Q(r14)
            long r15 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r0 = r14.toMillis(r0)
            long r18 = r18 + r0
            int r1 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x03e8
            r0 = 1
        L_0x03e8:
            if (r17 != 0) goto L_0x03ec
            if (r0 == 0) goto L_0x051b
        L_0x03ec:
            X.1eg r0 = r6.A0Y
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "create_group_banner_dismissed"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x051b
            X.1eg r0 = r6.A0Y
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "create_group_tool_tip_perm_dismissed"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x051b
            java.lang.String r0 = "Settings/shouldShowGroupCreationBanner/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1eg r0 = r6.A0Y
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences r14 = X.C36341k9.A0E(r0)
            r0 = 0
            long r15 = r14.getLong(r2, r0)
            int r14 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0437
            java.lang.String r0 = "Settings/setupProfileSection/create group banner never created"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1eg r14 = r6.A0Y
            long r0 = java.lang.System.currentTimeMillis()
            X.0v0 r14 = r14.A00
            android.content.SharedPreferences$Editor r14 = X.C19420v0.A00(r14)
            X.C36341k9.A0w(r14, r2, r0)
        L_0x0437:
            r0 = 2131431458(0x7f0b1022, float:1.8484646E38)
            android.view.View r2 = r6.findViewById(r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r2.inflate()
            r14 = 2131896856(0x7f122a18, float:1.9428585E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r15 = 2130970388(0x7f040714, float:1.7549485E38)
            r0 = 2131102006(0x7f060936, float:1.7816438E38)
            int r0 = X.C224514j.A00(r6, r15, r0)
            java.lang.String r0 = X.AnonymousClass14B.A03(r6, r0)
            r1[r3] = r0
            android.text.Spanned r1 = X.AnonymousClass14B.A01(r6, r1, r14)
            r0 = 2131429309(0x7f0b07bd, float:1.8480287E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r6, r0)
            r0.setText(r1)
            r0 = 2131429306(0x7f0b07ba, float:1.848028E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 3
            X.AnonymousClass3Y7.A00(r1, r6, r0)
            r0 = 2131429305(0x7f0b07b9, float:1.8480279E38)
            android.view.View r0 = r6.findViewById(r0)
            X.AnonymousClass3YC.A00(r0, r6, r2, r9)
        L_0x047b:
            r7.setVisibility(r4)
            r12.setVisibility(r4)
            r13.setVisibility(r3)
            r0 = 2131431464(0x7f0b1028, float:1.8484658E38)
            r2 = 2131431464(0x7f0b1028, float:1.8484658E38)
            android.view.View r7 = r6.findViewById(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167943(0x7f070ac7, float:1.7950174E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r6.A00 = r1
            X.1Pn r0 = r6.A0T
            X.1RY r0 = r0.A06(r11, r10, r1)
            r6.A0R = r0
            android.widget.ImageView r0 = X.C36411kG.A0Q(r6, r2)
            r6.A04 = r0
            r0 = 2131431461(0x7f0b1025, float:1.8484652E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36421kH.A0I(r6, r0)
            r6.A0J = r1
            java.lang.String r0 = X.C36391kE.A0w(r6)
            r1.A0I(r0)
            r0 = 2131432980(0x7f0b1614, float:1.8487733E38)
            android.widget.TextView r2 = X.C36391kE.A0Q(r6, r0)
            X.0ts r1 = r6.A00
            X.0wQ r0 = r6.A02
            X.142 r0 = X.C36381kD.A0T(r0)
            java.lang.String r0 = X.AnonymousClass3U8.A02(r1, r0)
            r2.setText(r0)
            r0 = 2131431467(0x7f0b102b, float:1.8484664E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36421kH.A0I(r6, r0)
            r6.A0I = r0
            boolean r0 = r6.A16
            if (r0 == 0) goto L_0x018a
            X.6Er r2 = r6.A0M
            com.whatsapp.TextEmojiLabel r1 = r6.A0J
            r0 = 28
            r2.A01(r6, r1, r0)
            r0 = 2131431456(0x7f0b1020, float:1.8484642E38)
            X.1RJ r0 = X.C36351kA.A0r(r6, r0)
            r6.A0s = r0
            r0.A03(r3)
            r0 = 2131431462(0x7f0b1026, float:1.8484654E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 4
            X.AnonymousClass3Y7.A00(r1, r6, r0)
            X.1RJ r0 = r6.A0s
            android.view.View r1 = r0.A01()
            r0 = 2131431455(0x7f0b101f, float:1.848464E38)
            X.1RJ r0 = X.C36341k9.A0Y(r1, r0)
            r6.A0r = r0
            X.0wU r2 = r6.A04
            r1 = 4
            X.4WP r0 = new X.4WP
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.C36391kE.A1Q(r0, r2)
            r6.A01()
            goto L_0x018a
        L_0x051b:
            java.lang.String r0 = "Settings/shouldShowGroupCreationBanner/false"
            goto L_0x0520
        L_0x051e:
            java.lang.String r0 = "Settings/shouldShowGroupCreationBanner/isCreateGroupBannerEnabled is false"
        L_0x0520:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x047b
        L_0x0525:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ Exception -> 0x0569 }
            X.60F r0 = new X.60F     // Catch:{ Exception -> 0x0569 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0569 }
            X.33h r3 = r0.A00()     // Catch:{ Exception -> 0x0569 }
            if (r3 == 0) goto L_0x05c5
            r1 = 24
            boolean r0 = r3.A01     // Catch:{ Exception -> 0x0569 }
            if (r0 == 0) goto L_0x05c5
            int r0 = r3.A00     // Catch:{ Exception -> 0x0569 }
            if (r0 < r1) goto L_0x05c5
            android.content.pm.PackageManager r8 = r6.getPackageManager()     // Catch:{ Exception -> 0x0569 }
            if (r8 == 0) goto L_0x05c5
            X.60F r0 = new X.60F     // Catch:{ Exception -> 0x0569 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0569 }
            X.33h r3 = r0.A00()     // Catch:{ Exception -> 0x0569 }
            if (r3 == 0) goto L_0x05c5
            r1 = 18
            boolean r0 = r3.A01     // Catch:{ Exception -> 0x0569 }
            if (r0 == 0) goto L_0x05c5
            int r0 = r3.A00     // Catch:{ Exception -> 0x0569 }
            if (r0 < r1) goto L_0x05c5
            java.lang.String r3 = X.C113705fy.A00     // Catch:{ Exception -> 0x0569 }
            java.lang.String r1 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x0569 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0569 }
            int r0 = r8.getComponentEnabledSetting(r0)     // Catch:{ Exception -> 0x0569 }
            if (r0 != r5) goto L_0x05c5
            goto L_0x0574
        L_0x0569:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PreloadsManager/isSettingsEnabled Exception: "
            X.C36321k7.A1J(r3, r0, r1)
            goto L_0x05c5
        L_0x0574:
            X.0wU r3 = r4.A04
            r0 = 36
            X.72v r1 = new X.72v
            r1.<init>(r4, r6, r0)
            java.lang.String r0 = "PreloadsManager/syncFirstPartySettings"
            r3.Boz(r1, r0)
            X.3NR r0 = r4.A02
            android.content.SharedPreferences r1 = X.AnonymousClass3NR.A00(r0)
            java.lang.String r0 = "first_party_settings_restricted_mode"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x05c5
            X.3NR r0 = r4.A02
            android.content.SharedPreferences r1 = X.AnonymousClass3NR.A00(r0)
            java.lang.String r0 = "first_party_settings_managed"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x05c5
            X.3NR r0 = r4.A02
            android.content.SharedPreferences r1 = X.AnonymousClass3NR.A00(r0)
            java.lang.String r0 = "first_party_settings_updates_enabled"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x05c5
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            android.view.View r3 = X.C03570Gk.A0B(r6, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.3NR r0 = r4.A02
            android.content.SharedPreferences r1 = X.AnonymousClass3NR.A00(r0)
            java.lang.String r0 = "tos_state"
            int r0 = r1.getInt(r0, r7)
            if (r0 == r5) goto L_0x0830
            if (r0 == r9) goto L_0x0830
        L_0x05c5:
            r4 = 0
            X.005 r0 = r6.A11
            r0.get()
            r0 = 2131428370(0x7f0b0412, float:1.8478383E38)
            android.view.View r1 = r6.findViewById(r0)
            X.4Ul r1 = (X.C88894Ul) r1
            r0 = 2131428371(0x7f0b0413, float:1.8478385E38)
            android.view.View r0 = r6.findViewById(r0)
            r1.setVisibility(r2)
            r0.setVisibility(r2)
            boolean r1 = r6.A17
            r0 = 2131432913(0x7f0b15d1, float:1.8487597E38)
            android.view.View r7 = r6.findViewById(r0)
            X.4Ul r7 = (X.C88894Ul) r7
            r0 = 2131435067(0x7f0b1e3b, float:1.8491966E38)
            android.view.View r3 = r6.findViewById(r0)
            if (r1 != 0) goto L_0x082b
            r7.setVisibility(r4)
            r1 = 42
            X.2i0 r0 = new X.2i0
            r0.<init>(r6, r1)
            r7.setOnClickListener(r0)
        L_0x0602:
            r3.setVisibility(r2)
            r0 = 2131433950(0x7f0b19de, float:1.84897E38)
            android.view.View r3 = r6.findViewById(r0)
            X.4Ul r3 = (X.C88894Ul) r3
            r1 = 39
            X.2i0 r0 = new X.2i0
            r0.<init>(r6, r1)
            r3.setOnClickListener(r0)
            r0 = 2131896403(0x7f122853, float:1.9427666E38)
            java.lang.String r0 = r6.getString(r0)
            r3.setSubText(r0)
            r0 = 2131433951(0x7f0b19df, float:1.8489702E38)
            android.view.View r3 = X.C03570Gk.A0B(r6, r0)
            X.4Ul r3 = (X.C88894Ul) r3
            r0 = 2131894274(0x7f122002, float:1.9423348E38)
            r3.setText(r0)
            r1 = 40
            X.2i0 r0 = new X.2i0
            r0.<init>(r6, r1)
            r3.setOnClickListener(r0)
            r0 = 2131433975(0x7f0b19f7, float:1.848975E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 41
            X.C48762i0.A00(r1, r6, r0)
            boolean r0 = X.C36421kH.A1V(r6)
            if (r0 == 0) goto L_0x0816
            r0 = 2131429000(0x7f0b0688, float:1.847966E38)
            android.view.View r3 = r6.findViewById(r0)
            X.4Ul r3 = (X.C88894Ul) r3
            r3.setVisibility(r4)
            r1 = 47
            X.3Yq r0 = new X.3Yq
            r0.<init>((java.lang.Object) r6, (int) r1)
            r3.setOnClickListener(r0)
            r0 = 2131433944(0x7f0b19d8, float:1.8489688E38)
            X.C36341k9.A13(r6, r0, r2)
            X.005 r0 = r6.A0w
            java.lang.Object r0 = r0.get()
            X.1Pe r0 = (X.C27661Pe) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x06c4
            boolean r0 = r6.A17
            if (r0 == 0) goto L_0x0808
            r0 = 2131431459(0x7f0b1023, float:1.8484648E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            r0 = 2131431211(0x7f0b0f2b, float:1.8484145E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 17
            r1.gravity = r0
        L_0x0698:
            X.0yC r10 = r6.A0D
            X.17Y r9 = r6.A05
            X.1Dv r8 = r6.A01
            X.0yb r7 = r6.A08
            r0 = 2131431211(0x7f0b0f2b, float:1.8484145E38)
            com.whatsapp.TextEmojiLabel r15 = X.C36421kH.A0I(r6, r0)
            r3 = 2131894194(0x7f121fb2, float:1.9423186E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "learn-more"
            java.lang.String r18 = X.C36391kE.A0v(r6, r1, r0, r4, r3)
            java.lang.String r0 = "https://faq.whatsapp.com/378279804439436"
            android.net.Uri r12 = android.net.Uri.parse(r0)
            r11 = r6
            r13 = r8
            r14 = r9
            r16 = r7
            r17 = r10
            r19 = r1
            X.AnonymousClass6YV.A0E(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x06c4:
            boolean r0 = X.C36421kH.A1V(r6)
            if (r0 != 0) goto L_0x070b
            X.0yC r1 = r6.A0D
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x070b
            boolean r1 = r6.A17
            r0 = 2131433946(0x7f0b19da, float:1.8489692E38)
            android.view.View r3 = r6.findViewById(r0)
            X.4Ul r3 = (X.C88894Ul) r3
            r0 = 2131894102(0x7f121f56, float:1.9423E38)
            r3.setText(r0)
            r0 = 2131894103(0x7f121f57, float:1.9423001E38)
            java.lang.String r0 = r6.getString(r0)
            r3.setSubText(r0)
            r0 = 2131232675(0x7f0807a3, float:1.8081466E38)
            if (r1 == 0) goto L_0x06f7
            r0 = 2131232775(0x7f080807, float:1.8081669E38)
        L_0x06f7:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r6, r0)
            r3.setIcon((android.graphics.drawable.Drawable) r0)
            r1 = 34
            X.2i0 r0 = new X.2i0
            r0.<init>(r6, r1)
            r3.setOnClickListener(r0)
            r3.setVisibility(r4)
        L_0x070b:
            X.0yC r1 = r6.A0D
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0724
            r0 = 2131433987(0x7f0b1a03, float:1.8489775E38)
            android.view.View r1 = r6.findViewById(r0)
            r1.setVisibility(r4)
            r0 = 35
            X.C48762i0.A00(r1, r6, r0)
        L_0x0724:
            r0 = 2131433970(0x7f0b19f2, float:1.848974E38)
            android.view.View r0 = r6.findViewById(r0)
            X.4Ul r0 = (X.C88894Ul) r0
            r6.A0t = r0
            com.whatsapp.Me r3 = X.C36401kF.A0M(r6)
            X.4Ul r0 = r6.A0t
            if (r3 != 0) goto L_0x07d1
            r0.setVisibility(r2)
        L_0x073a:
            r6.A18 = r4
            X.0ts r0 = r6.A00
            X.0ws r1 = r6.A1F
            java.util.Set r0 = r0.A09
            r0.add(r1)
            r6.A1D = r5
            boolean r0 = r6.A16
            if (r0 == 0) goto L_0x0757
            X.28W r1 = new X.28W
            r1.<init>(r6)
            r6.A1B = r1
            X.1Q6 r0 = r6.A0L
            r0.registerObserver(r1)
        L_0x0757:
            android.content.Intent r3 = r6.getIntent()
            if (r3 == 0) goto L_0x0773
            java.lang.String r2 = "page"
            java.lang.String r1 = r3.getStringExtra(r2)
            if (r1 == 0) goto L_0x0773
            java.lang.String r0 = "language"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0773
            A0H(r6)
            r3.removeExtra(r2)
        L_0x0773:
            android.content.Intent r3 = r6.getIntent()
            if (r3 == 0) goto L_0x00b4
            java.lang.String r0 = "account_switcher"
            boolean r2 = r3.getBooleanExtra(r0, r4)
            java.lang.String r0 = "account_switcher_add_account"
            boolean r1 = r3.getBooleanExtra(r0, r4)
            X.6Er r0 = r6.A0M
            r0.A00()
            boolean r0 = r6.A16
            if (r0 == 0) goto L_0x07b4
            if (r2 == 0) goto L_0x07a6
            r1 = 7
            java.lang.String r0 = "source"
            int r1 = r3.getIntExtra(r0, r1)
            java.lang.String r0 = "Settings/showAccountSwitcher"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "settings"
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C53222qy.A00(r0, r1)
        L_0x07a2:
            r6.Btm(r0)
            return
        L_0x07a6:
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = "Settings/showAccountSwitcherAddAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "settings"
            com.whatsapp.accountswitching.ui.AddAccountBottomSheet r0 = X.C53232qz.A00(r0, r5)
            goto L_0x07a2
        L_0x07b4:
            if (r2 == 0) goto L_0x00b4
            X.005 r0 = r6.A0v
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            X.0wQ r0 = r0.A05
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0850
            java.lang.String r0 = "Settings/showAccountSwitcherNotAvailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r0 = new com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment
            r0.<init>()
            goto L_0x07a2
        L_0x07d1:
            r0.setVisibility(r4)
            boolean r0 = X.AnonymousClass3SY.A03()
            if (r0 == 0) goto L_0x07ff
            r2 = 2131888798(0x7f120a9e, float:1.9412241E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.0ts r0 = r6.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r0 = X.AnonymousClass9ZR.A01(r0)
            java.lang.String r1 = X.C36391kE.A0v(r6, r0, r1, r4, r2)
        L_0x07ed:
            X.4Ul r0 = r6.A0t
            r0.setSubText(r1)
            X.4Ul r2 = r6.A0t
            r1 = 6
            X.3YC r0 = new X.3YC
            r0.<init>(r6, r3, r1)
            r2.setOnClickListener(r0)
            goto L_0x073a
        L_0x07ff:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = X.AnonymousClass9ZR.A01(r0)
            goto L_0x07ed
        L_0x0808:
            r0 = 2131431210(0x7f0b0f2a, float:1.8484143E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            goto L_0x0698
        L_0x0816:
            r0 = 2131433944(0x7f0b19d8, float:1.8489688E38)
            android.view.View r3 = r6.findViewById(r0)
            X.4Ul r3 = (X.C88894Ul) r3
            r1 = 48
            X.3Yq r0 = new X.3Yq
            r0.<init>((java.lang.Object) r6, (int) r1)
            r3.setOnClickListener(r0)
            goto L_0x06c4
        L_0x082b:
            r7.setVisibility(r2)
            goto L_0x0602
        L_0x0830:
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624124(0x7f0e00bc, float:1.8875419E38)
            android.view.View r1 = r1.inflate(r0, r3, r7)
            r0 = 15
            X.AnonymousClass3YH.A00(r1, r4, r6, r0)
            r0 = 2131430426(0x7f0b0c1a, float:1.8482553E38)
            android.view.View r0 = X.C012005e.A02(r3, r0)
            int r0 = r3.indexOfChild(r0)
            r3.addView(r1, r0)
            goto L_0x05c5
        L_0x0850:
            r0 = 2131890544(0x7f121170, float:1.9415783E38)
            r6.BO5(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.Settings.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0D.A0E(7066)) {
            menu.add(0, R.id.menuitem_thunderstorm, 0, R.string.f12nameremoved).setIcon(AnonymousClass00E.A00(this, R.drawable.vec_ic_person)).setShowAsAction(1);
        }
        C36411kG.A0I(menu).setIcon(AnonymousClass00E.A00(this, R.drawable.ic_action_search)).setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    public void onResume() {
        String A0w2;
        String A0u2;
        if (this.A18) {
            this.A18 = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A0a = C36431kI.A0V(this);
        if (!this.A17 || !this.A16) {
            Log.i("Settings/onResume/not eligible for updatePushName");
            this.A0J.A0I(C36391kE.A0w(this));
        } else {
            TextEmojiLabel textEmojiLabel = this.A1A;
            if (textEmojiLabel == null || textEmojiLabel.getVisibility() != 0) {
                Log.i("Settings/onResume/pushNameSecondLine null or is GONE");
                A0w2 = C36391kE.A0w(this);
                A0u2 = C36371kC.A0u(this.A0J);
            } else {
                Log.i("Settings/onResume/pushNameSecondLine not null and is VISIBLE");
                A0w2 = C36391kE.A0w(this);
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append(C36371kC.A0u(this.A0J));
                A0u2 = AnonymousClass000.A0q(C36371kC.A0u(this.A1A), A0u3);
            }
            if (!A0w2.equals(A0u2)) {
                Log.i("Settings/onResume/name changed, need to update pushName components");
                this.A0J.A0I(C36391kE.A0w(this));
                A01();
            }
        }
        if (!this.A0D.A0E(4921)) {
            this.A0I.A0I(this.A0F.A00());
        }
        boolean z = C36431kI.A0o(this.A0y).A03;
        View view = this.A00;
        if (z) {
            C20810yC r15 = this.A0D;
            AnonymousClass17Y r13 = this.A05;
            C19730wQ r12 = this.A02;
            C19770wU r11 = this.A04;
            C27731Pn r10 = this.A0T;
            AnonymousClass16D r9 = this.A0O;
            AnonymousClass171 r8 = this.A0Q;
            C18820ts r7 = this.A00;
            AnonymousClass3HF r6 = this.A0W;
            AnonymousClass1V6 r5 = this.A0X;
            AnonymousClass005 r4 = this.A0y;
            AnonymousClass005 r3 = this.A10;
            View view2 = this.A02;
            AnonymousClass1RY r1 = this.A0S;
            AnonymousClass1V6 r24 = r5;
            AnonymousClass3HF r23 = r6;
            C27731Pn r22 = r10;
            AnonymousClass1RY r21 = r1;
            AnonymousClass171 r20 = r8;
            AnonymousClass16D r19 = r9;
            C19730wQ r18 = r12;
            AnonymousClass17Y r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass3UR.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, this.A09, r7, r15, r11, r4, r3, "settings-activity");
            this.A02 = (View) A002.first;
            this.A0S = (AnonymousClass1RY) A002.second;
        } else if (AnonymousClass1V9.A00(view)) {
            AnonymousClass3UR.A04(this.A00, this.A0X, this.A0y);
        }
        C36421kH.A1I(this.A0y);
        boolean A042 = this.A0j.A04();
        C88894Ul r14 = (C88894Ul) findViewById(R.id.settings_help);
        if (A042) {
            if (r14 != null) {
                r14.setBadgeIcon(AnonymousClass00E.A00(this, R.drawable.ic_settings_row_badge));
            } else {
                Log.e("Settings/showBadge cannot find help view");
            }
            AnonymousClass3TS r32 = this.A0j;
            C20810yC r2 = r32.A03;
            AnonymousClass00C.A0D(r2, 0);
            if (C20800yB.A01(C21000yV.A01, r2, 1799)) {
                AnonymousClass1Z8 r25 = r32.A05;
                r25.A00.execute(new C35731jA((Object) r25, 11));
            }
        } else if (r14 != null) {
            r14.setBadgeIcon((Drawable) null);
        } else {
            Log.e("Settings/clearBadge cannot find help view");
        }
        this.A0m.A04();
    }

    public boolean onSearchRequested() {
        View findViewById;
        C44482Nr r1 = new C44482Nr();
        r1.A00 = Integer.valueOf(this.A17 ? 1 : 0);
        this.A0d.Blv(r1);
        WDSSearchBar wDSSearchBar = this.A0u;
        if (wDSSearchBar != null) {
            wDSSearchBar.A01();
        }
        WDSSearchBar wDSSearchBar2 = this.A0u;
        if (wDSSearchBar2 != null) {
            findViewById = wDSSearchBar2.A07.A07;
        } else {
            findViewById = findViewById(R.id.search_back);
        }
        C67133Yq.A00(findViewById, this, 49);
        ViewStub viewStub = (ViewStub) findViewById(R.id.settings_search_results_list_stub);
        if (viewStub != null && viewStub.findViewById(R.id.settings_search_results_list_view) == null) {
            RecyclerView recyclerView = (RecyclerView) viewStub.inflate();
            this.A05 = recyclerView;
            recyclerView.setAdapter(this.A0o);
            C02800By r12 = this.A05.A0H;
            if (r12 instanceof C02810Bz) {
                ((C02810Bz) r12).A00 = false;
            }
        }
        A0J(this);
        return false;
    }

    public Settings(int i) {
        this.A1C = false;
        C89364Wg.A00(this, 19);
    }

    private void A07(int i, int i2) {
        C88894Ul r0 = (C88894Ul) findViewById(i);
        if (r0 != null) {
            r0.setIcon(i2);
        }
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void BZa() {
        this.A01 = System.currentTimeMillis();
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            Intent A032 = AnonymousClass190.A03(this);
            finishAndRemoveTask();
            startActivity(A032);
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A1D) {
            this.A0P.unregisterObserver(this.A1E);
            AnonymousClass1RY r0 = this.A0R;
            if (r0 != null) {
                r0.A02();
            }
            C18820ts r02 = this.A00;
            r02.A09.remove(this.A1F);
        }
        AnonymousClass3UR.A02(this.A02, this.A0X);
        AnonymousClass1RY r03 = this.A0S;
        if (r03 != null) {
            r03.A02();
            this.A0S = null;
        }
        AnonymousClass1RW r1 = this.A1B;
        if (r1 != null) {
            this.A0L.unregisterObserver(r1);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_thunderstorm) {
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(getPackageName(), "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity");
            startActivity(A0D2);
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_search) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onSearchRequested();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        AnonymousClass3UR.A07(this.A0X);
        C36431kI.A0o(this.A0y).A01(this.A00);
    }

    public Settings() {
        this(0);
        this.A01 = 0;
        this.A15 = AnonymousClass001.A0I();
        this.A13 = "";
        this.A14 = null;
        this.A1E = AnonymousClass4W3.A00(this, 34);
        this.A1F = new C89734Xr(this, 1);
        this.A1B = null;
    }
}
