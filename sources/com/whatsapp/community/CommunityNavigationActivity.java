package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass196;
import X.AnonymousClass1A6;
import X.AnonymousClass1CR;
import X.AnonymousClass1LV;
import X.AnonymousClass1N6;
import X.AnonymousClass1RY;
import X.AnonymousClass1X4;
import X.AnonymousClass1Y3;
import X.AnonymousClass1YR;
import X.AnonymousClass3QV;
import X.AnonymousClass3UF;
import X.AnonymousClass4WC;
import X.AnonymousClass4YE;
import X.AnonymousClass4ZD;
import X.C010804n;
import X.C012005e;
import X.C02800By;
import X.C03570Gk;
import X.C174508Xh;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19770wU;
import X.C19970wo;
import X.C20350xQ;
import X.C220412q;
import X.C220712t;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C24521Ct;
import X.C26421Kc;
import X.C26801Lo;
import X.C27111My;
import X.C27541Op;
import X.C27731Pn;
import X.C27751Pr;
import X.C28361Si;
import X.C28431Sq;
import X.C32021cp;
import X.C32641dx;
import X.C33051ed;
import X.C33231ew;
import X.C33411fH;
import X.C33421fI;
import X.C33511fU;
import X.C34361gu;
import X.C34381gw;
import X.C34421h1;
import X.C34471h6;
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
import X.C36441kJ;
import X.C40051uf;
import X.C43132Eh;
import X.C55422ub;
import X.C56992xU;
import X.C65533Sl;
import X.C66933Xw;
import X.C71003g4;
import X.C81323wp;
import X.C87854Qk;
import X.C89324Wc;
import X.C89584Xc;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class CommunityNavigationActivity extends AnonymousClass155 {
    public TextView A00;
    public C19460v5 A01;
    public C56992xU A02;
    public C34361gu A03;
    public C34381gw A04;
    public C33231ew A05;
    public TextEmojiLabel A06;
    public AnonymousClass1X4 A07;
    public WaImageView A08;
    public C26421Kc A09;
    public C24361Cd A0A;
    public AnonymousClass1LV A0B;
    public C28431Sq A0C;
    public C40051uf A0D;
    public C34421h1 A0E;
    public AnonymousClass196 A0F;
    public AnonymousClass16D A0G;
    public AnonymousClass16I A0H;
    public AnonymousClass171 A0I;
    public AnonymousClass1RY A0J;
    public C27731Pn A0K;
    public AnonymousClass1Y3 A0L;
    public AnonymousClass1A6 A0M;
    public C34471h6 A0N;
    public C33421fI A0O;
    public C33411fH A0P;
    public C220712t A0Q;
    public C220412q A0R;
    public C24381Cf A0S;
    public AnonymousClass17X A0T;
    public AnonymousClass1YR A0U;
    public AnonymousClass141 A0V;
    public C27751Pr A0W;
    public C20350xQ A0X;
    public C27541Op A0Y;
    public C233117z A0Z;
    public C26801Lo A0a;
    public AnonymousClass11F A0b;
    public AnonymousClass147 A0c;
    public C32641dx A0d;
    public C28361Si A0e;
    public AnonymousClass1CR A0f;
    public AnonymousClass1N6 A0g;
    public C33051ed A0h;
    public boolean A0i;
    public boolean A0j;
    public final C24521Ct A0k;
    public final C87854Qk A0l;
    public final C32021cp A0m;

    public static void A01(CommunityNavigationActivity communityNavigationActivity, String str) {
        if (!(!communityNavigationActivity.A0E) && !communityNavigationActivity.A0j) {
            Intent A032 = AnonymousClass190.A03(communityNavigationActivity);
            A032.putExtra("snackbar_message", str);
            C36381kD.A15(communityNavigationActivity, A032);
            communityNavigationActivity.A0j = true;
        }
    }

    public void A2F() {
        if (!this.A0i) {
            this.A0i = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0R = C36351kA.A0a(r2);
            this.A0Q = (C220712t) r2.A1b.get();
            this.A0F = (AnonymousClass196) r2.A8N.get();
            this.A07 = C36361kB.A0T(r2);
            this.A0K = C36351kA.A0T(r2);
            this.A0G = C36341k9.A0R(r2);
            this.A0M = C36401kF.A0V(r2);
            this.A0I = C36341k9.A0S(r2);
            this.A0d = (C32641dx) r3.A4F.get();
            this.A0H = C36351kA.A0S(r2);
            this.A0X = C36361kB.A0a(r2);
            this.A01 = C19470v6.A00;
            this.A0f = C36371kC.A0j(r2);
            this.A0A = C36371kC.A0T(r2);
            this.A0C = C36391kE.A0b(r2);
            this.A0U = (AnonymousClass1YR) r2.A8e.get();
            this.A0W = C36381kD.A0b(r2);
            this.A0e = C36371kC.A0g(r2);
            this.A0B = C36361kB.A0U(r2);
            this.A0a = C36431kI.A0f(r2);
            this.A0S = C36371kC.A0Y(r2);
            this.A0L = (AnonymousClass1Y3) r2.A2N.get();
            this.A03 = (C34361gu) A0L2.A0g.get();
            this.A09 = (C26421Kc) r2.A1A.get();
            this.A0h = C36411kG.A0p(r3);
            this.A0T = C36351kA.A0b(r2);
            this.A0Y = C36381kD.A0c(r2);
            this.A0Z = C36371kC.A0c(r2);
            this.A0g = C36361kB.A0e(r2);
            this.A02 = (C56992xU) A0L2.A0Y.get();
            this.A04 = (C34381gw) A0L2.A0h.get();
            this.A05 = (C33231ew) A0L2.A0i.get();
        }
    }

    public void A2X() {
        this.A0g.A03((AnonymousClass11F) null, 7);
        super.A2X();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0J = this.A0K.A05(this, "community-navigation");
        AnonymousClass147 A002 = C65533Sl.A00(C36431kI.A0F(this, R.layout.f9nameremoved), "parent_group_jid");
        C18740tg.A06(A002);
        this.A0c = A002;
        AnonymousClass141 A082 = this.A0G.A08(A002);
        this.A0V = A082;
        if (A082 == null || this.A0R.A0R(this.A0c)) {
            A01(this, getString(R.string.f12nameremoved));
            return;
        }
        this.A0a.registerObserver(this.A0m);
        this.A08 = (WaImageView) C03570Gk.A0B(this, R.id.community_navigation_communityPhoto);
        this.A00 = C36401kF.A0H(this, R.id.community_navigation_communityStatus);
        TextEmojiLabel A0e2 = C36441kJ.A0e(this, R.id.community_navigation_communityName);
        this.A06 = A0e2;
        C33511fU.A03(A0e2);
        C012005e.A0a(this.A06, true);
        C36421kH.A11(this.A06, this, 3);
        Toolbar toolbar = (Toolbar) C03570Gk.A0B(this, R.id.community_navigation_toolbar);
        setSupportActionBar(toolbar);
        C36341k9.A0N(this).A0X(false);
        AnonymousClass3UF.A0D(this, toolbar, this.A00, R.color.f6nameremoved);
        AppBarLayout appBarLayout = (AppBarLayout) C03570Gk.A0B(this, R.id.community_navigation_app_bar);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        C18820ts r11 = this.A00;
        WaImageView waImageView = this.A08;
        TextEmojiLabel textEmojiLabel = this.A06;
        TextView textView = this.A00;
        C36391kE.A19(this, supportActionBar);
        supportActionBar.A0V(true);
        View A0B2 = supportActionBar.A0B();
        C18740tg.A04(A0B2);
        C174508Xh r6 = new C174508Xh(A0B2, waImageView, textView, textEmojiLabel, r11);
        appBarLayout.setExpanded(true);
        appBarLayout.A02(r6);
        textView.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.community_navigation_subgroup_recycler_view);
        C36351kA.A1F(recyclerView, 1);
        recyclerView.setItemAnimator((C02800By) null);
        C34421h1 A003 = this.A03.A00(this.A0J, new C43132Eh(this, this.A01, this, this.A0C), 6);
        this.A0E = A003;
        recyclerView.setAdapter(A003);
        C34421h1 r9 = this.A0E;
        AnonymousClass16I r10 = this.A0H;
        C34471h6 r62 = new C34471h6(this.A09, this.A0A, r9, r10, this.A0S, this.A0Z);
        this.A0N = r62;
        r62.A00();
        AnonymousClass3QV r12 = new AnonymousClass3QV(true, true, false, true, true);
        r12.A07 = false;
        r12.A04 = false;
        r12.A02 = true;
        r12.A03 = true;
        r12.A0E = true;
        r12.A06 = false;
        r12.A05 = false;
        r12.A08 = false;
        r12.A0C = false;
        r12.A0A = true;
        r12.A09 = true;
        r12.A0B = false;
        r12.A01 = true;
        this.A0D = (C40051uf) AnonymousClass4ZD.A00(this, this.A0c, this.A02, r12, 0).A00(C40051uf.class);
        WDSButton wDSButton = (WDSButton) C03570Gk.A0B(this, R.id.community_navigation_add_group_button);
        wDSButton.setIcon((Drawable) C010804n.A00(getTheme(), getResources(), R.drawable.vec_plus_group));
        C66933Xw.A00(wDSButton, this, 36);
        this.A0D.A0n.A08(this, new C55422ub(wDSButton, 48));
        C55422ub.A01(this, this.A0D.A0G, 42);
        C55422ub.A01(this, this.A0D.A0E, 46);
        C55422ub.A01(this, this.A0D.A0o, 44);
        C55422ub.A01(this, this.A0D.A0s, 47);
        this.A0S.registerObserver(this.A0k);
        this.A0Y.A00(this.A0l);
        C55422ub.A01(this, this.A0D.A0v, 45);
        C55422ub.A01(this, this.A0D.A0u, 43);
        C33411fH A004 = this.A05.A00(this, new C71003g4(this));
        this.A0P = A004;
        C19970wo r92 = this.A07;
        AnonymousClass17Y r63 = this.A05;
        C19770wU r122 = this.A04;
        this.A0O = new C33421fI(this, r63, this.A0M, A004, r92, this.A0Q, this.A0f, r122);
    }

    public void onDestroy() {
        AnonymousClass1RY r0 = this.A0J;
        if (r0 != null) {
            r0.A02();
        }
        C26801Lo r1 = this.A0a;
        if (r1 != null) {
            r1.unregisterObserver(this.A0m);
        }
        C24381Cf r12 = this.A0S;
        if (r12 != null) {
            r12.unregisterObserver(this.A0k);
        }
        C34471h6 r02 = this.A0N;
        if (r02 != null) {
            r02.A01();
        }
        C27541Op r13 = this.A0Y;
        if (r13 != null) {
            r13.A01(this.A0l);
        }
        super.onDestroy();
    }

    public void onStop() {
        C40051uf r2 = this.A0D;
        if (r2 != null) {
            C36321k7.A1K(r2, "CommunitySubgroupsViewModel/updateActivitySeen: ", AnonymousClass000.A0u());
            C81323wp.A00(r2.A0t, r2, 42);
        }
        super.onStop();
    }

    public CommunityNavigationActivity(int i) {
        this.A0i = false;
        C89324Wc.A00(this, 7);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        if (!this.A0T.A0D(this.A0c)) {
            return true;
        }
        menu.add(0, R.id.community_navigation_menu_invite_members, 0, getString(R.string.f12nameremoved));
        if (this.A0D.A0E(3829)) {
            menu.add(0, R.id.community_navigation_menu_community_settings, 0, getString(R.string.f12nameremoved));
        }
        menu.findItem(R.id.community_navigation_menu_view_members).setVisible(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.community_navigation_menu_view_members) {
            this.A01.A08(this, AnonymousClass190.A0h(this, this.A0c, false), "communityNavigation");
            return true;
        } else if (menuItem.getItemId() == R.id.community_navigation_menu_community_info) {
            this.A0C.Bkx(this, this.A00, this.A0c);
            return true;
        } else if (menuItem.getItemId() == R.id.community_navigation_menu_community_settings) {
            this.A01.A06(this, AnonymousClass190.A0s(this, this.A0c));
            return true;
        } else if (menuItem.getItemId() != R.id.community_navigation_menu_invite_members) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass147 r1 = this.A0c;
            AnonymousClass00C.A0D(r1, 0);
            Log.i("CommunityAddMembersBottomSheet/newInstance");
            CommunityAddMembersBottomSheet communityAddMembersBottomSheet = new CommunityAddMembersBottomSheet();
            Bundle A072 = AnonymousClass001.A07();
            A072.putString("parent_jid", r1.getRawString());
            communityAddMembersBottomSheet.A17(A072);
            Btl(communityAddMembersBottomSheet, "CommunityAddMembersBottomSheet/");
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0R.A0R(this.A0c)) {
            A01(this, getString(R.string.f12nameremoved));
        }
    }

    public CommunityNavigationActivity() {
        this(0);
        this.A0m = new AnonymousClass4WC(this, 1);
        this.A0k = new AnonymousClass4YE(this, 3);
        this.A0l = new C89584Xc(this, 2);
    }
}
