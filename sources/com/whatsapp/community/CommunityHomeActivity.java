package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1C4;
import X.AnonymousClass1CR;
import X.AnonymousClass1EM;
import X.AnonymousClass1LV;
import X.AnonymousClass1N6;
import X.AnonymousClass1RC;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.AnonymousClass2VT;
import X.AnonymousClass3C9;
import X.AnonymousClass3H1;
import X.AnonymousClass3H3;
import X.AnonymousClass3QK;
import X.AnonymousClass3QV;
import X.AnonymousClass3RF;
import X.AnonymousClass3UW;
import X.AnonymousClass4O9;
import X.AnonymousClass4WC;
import X.AnonymousClass4YE;
import X.AnonymousClass4ZD;
import X.AnonymousClass4ZG;
import X.C012005e;
import X.C03570Gk;
import X.C1273167u;
import X.C174518Xi;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19550w8;
import X.C20350xQ;
import X.C20380xT;
import X.C20510xg;
import X.C20810yC;
import X.C21060yb;
import X.C21100yf;
import X.C21710zg;
import X.C220412q;
import X.C24381Cf;
import X.C24521Ct;
import X.C24801Dv;
import X.C26801Lo;
import X.C27111My;
import X.C27541Op;
import X.C27731Pn;
import X.C28081Rg;
import X.C28431Sq;
import X.C32021cp;
import X.C32681e1;
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
import X.C39511sY;
import X.C39811tr;
import X.C39881u5;
import X.C39971uO;
import X.C40051uf;
import X.C42841za;
import X.C48892iE;
import X.C53582rY;
import X.C53842ry;
import X.C55422ub;
import X.C56972xS;
import X.C56982xT;
import X.C56992xU;
import X.C63433Ka;
import X.C63883Lu;
import X.C65533Sl;
import X.C66933Xw;
import X.C68403bq;
import X.C70013eS;
import X.C80263v7;
import X.C81323wp;
import X.C87114Nn;
import X.C87494Pa;
import X.C87854Qk;
import X.C89324Wc;
import X.C89584Xc;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.communityInfo.CAGInfoFragment;
import com.whatsapp.community.communityInfo.CommunityHomeFragment;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.util.List;

public class CommunityHomeActivity extends AnonymousClass155 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public Space A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public SearchView A0D;
    public ViewPager2 A0E;
    public AppBarLayout A0F;
    public C56972xS A0G;
    public C56982xT A0H;
    public C56992xU A0I;
    public AnonymousClass3C9 A0J;
    public TextEmojiLabel A0K;
    public TextEmojiLabel A0L;
    public C174518Xi A0M;
    public C87494Pa A0N;
    public AnonymousClass1LV A0O;
    public C87114Nn A0P;
    public CommunityMembersViewModel A0Q;
    public C28431Sq A0R;
    public C40051uf A0S;
    public AnonymousClass3H3 A0T;
    public AnonymousClass16D A0U;
    public AnonymousClass171 A0V;
    public AnonymousClass1RY A0W;
    public C27731Pn A0X;
    public C220412q A0Y;
    public C24381Cf A0Z;
    public AnonymousClass17X A0a;
    public AnonymousClass141 A0b;
    public AnonymousClass4O9 A0c;
    public C39811tr A0d;
    public C63433Ka A0e;
    public C20350xQ A0f;
    public C27541Op A0g;
    public C20510xg A0h;
    public C26801Lo A0i;
    public AnonymousClass190 A0j;
    public AnonymousClass147 A0k;
    public AnonymousClass147 A0l;
    public AnonymousClass1C4 A0m;
    public AnonymousClass1CR A0n;
    public C20380xT A0o;
    public AnonymousClass1N6 A0p;
    public C28081Rg A0q;
    public AnonymousClass1EM A0r;
    public C32681e1 A0s;
    public AnonymousClass1RJ A0t;
    public AnonymousClass1RJ A0u;
    public boolean A0v;
    public long A0w;
    public C39971uO A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public final C24521Ct A11;
    public final C87854Qk A12;
    public final C32021cp A13;

    public int A2I() {
        return 579544921;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onStop() {
        this.A0y = true;
        C40051uf r2 = this.A0S;
        if (r2 != null) {
            C36321k7.A1K(r2, "CommunitySubgroupsViewModel/updateActivitySeen: ", AnonymousClass000.A0u());
            C81323wp.A00(r2.A0t, r2, 42);
        }
        super.onStop();
    }

    public static void A01(CommunityHomeActivity communityHomeActivity, int i) {
        communityHomeActivity.A00 = i;
        if (communityHomeActivity.A0v) {
            communityHomeActivity.A0B.setText(R.string.f12nameremoved);
            communityHomeActivity.A0A.setText(R.string.f12nameremoved);
            return;
        }
        TextView textView = communityHomeActivity.A0B;
        Resources resources = communityHomeActivity.getResources();
        Integer valueOf = Integer.valueOf(i);
        C36351kA.A16(resources, textView, new Object[]{valueOf}, R.plurals.f10nameremoved, i);
        TextView textView2 = communityHomeActivity.A0A;
        C36351kA.A16(communityHomeActivity.getResources(), textView2, new Object[]{valueOf}, R.plurals.f10nameremoved, i);
    }

    public static void A07(CommunityHomeActivity communityHomeActivity, String str) {
        if (!(!communityHomeActivity.A0E) && !communityHomeActivity.A10) {
            Intent A032 = AnonymousClass190.A03(communityHomeActivity);
            A032.putExtra("snackbar_message", str);
            C36381kD.A15(communityHomeActivity, A032);
            communityHomeActivity.A10 = true;
        }
    }

    public void A2F() {
        if (!this.A0z) {
            this.A0z = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0s = C36351kA.A0p(r3);
            this.A0j = C36351kA.A0h(r2);
            this.A0Y = C36351kA.A0a(r2);
            this.A0m = C36421kH.A0Q(r2);
            this.A0X = C36351kA.A0T(r2);
            this.A0U = C36341k9.A0R(r2);
            this.A0o = C36331k8.A0I(r2);
            this.A0V = C36341k9.A0S(r2);
            this.A0r = C36371kC.A0l(r2);
            this.A0f = C36361kB.A0a(r2);
            this.A0h = C36431kI.A0e(r2);
            this.A0q = C18800tq.ALZ(r2);
            this.A0n = C36371kC.A0j(r2);
            this.A0R = C36391kE.A0b(r2);
            this.A0O = C36361kB.A0U(r2);
            this.A0i = C36431kI.A0f(r2);
            this.A0Z = C36371kC.A0Y(r2);
            this.A0g = C36381kD.A0c(r2);
            this.A0a = C36351kA.A0b(r2);
            this.A0G = (C56972xS) A0L2.A2h.get();
            this.A0p = C36361kB.A0e(r2);
            this.A0H = (C56982xT) A0L2.A2i.get();
            this.A0J = (AnonymousClass3C9) r2.ALS.get();
            this.A0P = (C87114Nn) A0L2.A2j.get();
            this.A0I = (C56992xU) A0L2.A0Y.get();
            this.A0c = (AnonymousClass4O9) A0L2.A0a.get();
            this.A0N = (C87494Pa) A0L2.A0c.get();
        }
    }

    public void A2X() {
        this.A0p.A03(this.A0l, 2);
        super.A2X();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 16) {
            C36331k8.A13(((C39511sY) C36441kJ.A0b(this).A00(C39511sY.class)).A00);
        } else if (i == 123) {
            if (intent != null && i2 == -1 && this.A0e.A01(true) && this.A0b != null) {
                String stringExtra = intent.getStringExtra("extra_community_name");
                if (stringExtra != null) {
                    C63433Ka r5 = this.A0e;
                    int A002 = C63883Lu.A00(stringExtra);
                    int A042 = r5.A04.A04(C21100yf.A1v);
                    if (A002 <= A042) {
                        C40051uf r2 = this.A0S;
                        AnonymousClass147 r52 = this.A0l;
                        r2.A08 = stringExtra;
                        C36331k8.A13(r2.A0r);
                        r2.A0d.A0B(new AnonymousClass2VT(r2, r2.A0V, r2.A0c, r52, r2.A08));
                    } else {
                        r5.A03.A0E(C36331k8.A0g(r5.A06, A042, 0, R.plurals.f10nameremoved), 0);
                    }
                }
                String stringExtra2 = intent.getStringExtra("extra_community_description");
                if (stringExtra2 != null) {
                    C40051uf r3 = this.A0S;
                    AnonymousClass141 r22 = this.A0b;
                    r3.A07 = stringExtra2;
                    C36331k8.A13(r3.A0q);
                    C80263v7.A00(r3.A0y, r3, r22, 6);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (C36351kA.A1W(this.A0S.A02.A03)) {
            C70013eS r2 = this.A0S.A02;
            C36341k9.A18(r2.A03, false);
            r2.A01.accept(Integer.valueOf(r2.A00));
            r2.A04.run();
        } else if (this.A0y) {
            C24801Dv r22 = this.A0R.A01;
            Intent A032 = AnonymousClass190.A03(this);
            A032.setFlags(67108864);
            r22.A06(this, A032);
        } else {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        AnonymousClass1RY r0 = this.A0W;
        if (r0 != null) {
            r0.A02();
        }
        C27541Op r1 = this.A0g;
        if (r1 != null) {
            r1.A01(this.A12);
        }
        C26801Lo r12 = this.A0i;
        if (r12 != null) {
            r12.unregisterObserver(this.A13);
        }
        C24381Cf r13 = this.A0Z;
        if (r13 != null) {
            r13.unregisterObserver(this.A11);
        }
        super.onDestroy();
    }

    public CommunityHomeActivity(int i) {
        this.A0z = false;
        C89324Wc.A00(this, 4);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        A2K.A04 = true;
        A2K.A00((String) null, 9);
        return A2K;
    }

    public void onCreate(Bundle bundle) {
        Drawable navigationIcon;
        this.A0w = SystemClock.uptimeMillis();
        super.onCreate(bundle);
        A2T("render_community_home");
        AnonymousClass147 A002 = C65533Sl.A00(getIntent(), "parent_group_jid");
        C18740tg.A06(A002);
        this.A0l = A002;
        AnonymousClass3QK A0L2 = C36421kH.A0L(this.A0O, A002);
        if (A0L2 != null) {
            this.A0k = (AnonymousClass147) A0L2.A02;
        }
        this.A0W = this.A0X.A05(this, "community-home");
        setContentView((int) R.layout.f9nameremoved);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        this.A0E = (ViewPager2) findViewById(R.id.pager);
        C42841za r6 = new C42841za(this);
        AnonymousClass147 r4 = this.A0l;
        AnonymousClass00C.A0D(r4, 0);
        CommunityHomeFragment communityHomeFragment = new CommunityHomeFragment();
        communityHomeFragment.A17(C36351kA.A0B(r4, "parentJid"));
        String string = getString(R.string.f12nameremoved);
        List list = r6.A00;
        list.add(communityHomeFragment);
        List list2 = r6.A01;
        list2.add(string);
        AnonymousClass147 r42 = this.A0k;
        if (r42 != null) {
            CAGInfoFragment cAGInfoFragment = new CAGInfoFragment();
            cAGInfoFragment.A17(C36351kA.A0B(r42, "cagJid"));
            String string2 = getString(R.string.f12nameremoved);
            list.add(cAGInfoFragment);
            list2.add(string2);
        }
        int intExtra = getIntent().getIntExtra("tab_start_position", 0);
        this.A0E.setAdapter(r6);
        this.A0E.setCurrentItem(intExtra);
        this.A0E.setUserInputEnabled(false);
        new C1273167u(this.A0E, tabLayout, new C68403bq(r6, this)).A01();
        C81323wp.A01(this.A04, this, 30);
        AnonymousClass141 A082 = this.A0U.A08(this.A0l);
        this.A0b = A082;
        if (A082 == null || this.A0Y.A0R(this.A0l)) {
            A07(this, getString(R.string.f12nameremoved));
            return;
        }
        this.A0i.registerObserver(this.A13);
        AnonymousClass3QV r43 = new AnonymousClass3QV();
        r43.A00 = 10;
        r43.A0D = true;
        r43.A08 = true;
        r43.A0B = true;
        r43.A0C = true;
        r43.A0A = false;
        this.A0S = (C40051uf) AnonymousClass4ZD.A00(this, this.A0l, this.A0I, r43, 0).A00(C40051uf.class);
        this.A0x = (C39971uO) AnonymousClass4ZG.A00(this, this.A0l, this.A0H, 2).A00(C39971uO.class);
        this.A08 = C36431kI.A0P(this, R.id.communityPhoto);
        this.A0L = C36441kJ.A0e(this, R.id.communityName);
        this.A0K = C36441kJ.A0e(this, R.id.collapsedCommunityName);
        this.A0A = C36401kF.A0H(this, R.id.collapsedCommunityStatus);
        this.A0B = C36401kF.A0H(this, R.id.communityStatus);
        this.A06 = C03570Gk.A0B(this, R.id.change_subject_and_desription_progress);
        this.A05 = C03570Gk.A0B(this, R.id.headerView);
        Toolbar A0N2 = C36361kB.A0N(this);
        setSupportActionBar(A0N2);
        AnonymousClass07B A0N3 = C36341k9.A0N(this);
        A0N3.A0X(false);
        if (!AnonymousClass1RC.A0A(this) && (navigationIcon = A0N2.getNavigationIcon()) != null) {
            navigationIcon.setColorFilter(getResources().getColor(R.color.f6nameremoved), PorterDuff.Mode.SRC_ATOP);
            A0N2.setNavigationIcon(navigationIcon);
        }
        if (C19550w8.A00()) {
            for (int i = 0; i < A0N2.getChildCount(); i++) {
                View childAt = A0N2.getChildAt(i);
                if (childAt != null) {
                    childAt.setAccessibilityTraversalBefore(R.id.communityPhoto);
                }
            }
            this.A0K.setAccessibilityTraversalAfter(R.id.communityPhoto);
            this.A0A.setAccessibilityTraversalAfter(R.id.communityPhoto);
        }
        this.A0F = (AppBarLayout) C03570Gk.A0B(this, R.id.app_bar);
        C36391kE.A19(this, A0N3);
        A0N3.A0V(true);
        C18740tg.A04(A0N3.A0B());
        SearchView searchView = (SearchView) C03570Gk.A0B(this, R.id.search_view);
        this.A0D = searchView;
        TextView A0O2 = C36391kE.A0O(searchView, R.id.search_src_text);
        this.A0C = A0O2;
        C36321k7.A0M(this, A0O2, R.attr.f4nameremoved, R.color.f6nameremoved);
        View findViewById = findViewById(R.id.search_edit_frame);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.setMarginStart(0);
                findViewById.setLayoutParams(marginLayoutParams);
            } else {
                C18740tg.A0D(false, "Unexpected LayoutParams for search edit frame. Margins not updated.");
            }
        }
        this.A0D.setQueryHint(getString(R.string.f12nameremoved));
        this.A0D.setIconifiedByDefault(false);
        this.A0D.A06 = new C53842ry(this, 2);
        this.A0t = C36361kB.A0h(this, R.id.community_home_header_bottom_divider_admin);
        this.A0u = C36361kB.A0h(this, R.id.community_home_header_bottom_divider_non_admin);
        this.A03 = ((ViewStub) C03570Gk.A0B(this, R.id.community_home_header_actions)).inflate();
        this.A09 = (Space) C03570Gk.A0B(this, R.id.community_home_header_bottom_space);
        View A022 = C012005e.A02(this.A03, R.id.action_share_link);
        this.A07 = A022;
        C48892iE.A00(A022, this, 44);
        View A023 = C012005e.A02(this.A03, R.id.action_add_group);
        this.A01 = A023;
        C48892iE.A00(A023, this, 45);
        C55422ub.A01(this, this.A0S.A0n, 34);
        this.A02 = C012005e.A02(this.A03, R.id.action_add_members);
        this.A0T = this.A0J.A00(this.A0l);
        ((WDSActionTile) this.A02).setText((int) R.string.f12nameremoved);
        C48892iE.A00(this.A02, this, 46);
        C55422ub.A01(this, this.A0S.A0n, 35);
        C55422ub.A01(this, this.A0S.A0o, 29);
        C55422ub.A01(this, this.A0S.A0G, 36);
        C55422ub.A01(this, this.A0S.A0E, 33);
        getSupportFragmentManager().A0l(new AnonymousClass3RF(this, 2), this, "NewCommunityAdminBottomSheetFragment");
        C39881u5 r2 = (C39881u5) AnonymousClass4ZG.A00(this, this.A0G, this.A0b, 7).A00(C39881u5.class);
        if (bundle != null) {
            this.A0v = Boolean.TRUE.equals(r2.A03.A04());
        }
        C55422ub.A01(this, r2.A03, 39);
        this.A0g.A00(this.A12);
        this.A0Z.registerObserver(this.A11);
        C55422ub.A01(this, this.A0S.A0x, 38);
        C55422ub.A01(this, this.A0S.A0w, 37);
        C55422ub.A01(this, this.A0S.A0v, 31);
        C55422ub.A01(this, this.A0S.A0D, 30);
        C55422ub.A01(this, this.A0S.A0F, 32);
        C55422ub.A01(this, this.A0S.A0C, 28);
        C55422ub.A01(this, this.A0S.A02.A03, 27);
        this.A0Q = C53582rY.A00(this, this.A0P, this.A0l);
        C66933Xw.A00(this.A08, this, 31);
        C20810yC r62 = this.A0D;
        AnonymousClass147 r5 = this.A0l;
        AnonymousClass17Y r10 = this.A05;
        AnonymousClass1C4 r44 = this.A0m;
        C21100yf r11 = this.A06;
        C18820ts r15 = this.A00;
        AnonymousClass171 r14 = this.A0V;
        AnonymousClass16D r13 = this.A0U;
        C20350xQ r3 = this.A0f;
        C20510xg r22 = this.A0h;
        this.A0e = new C63433Ka((View) null, this, r10, r11, this.A07, r13, r14, r15, this.A0Z, this.A0a, r62, r3, r22, r5, r44);
        AnonymousClass147 r32 = this.A0k;
        if (r32 != null) {
            this.A0d = (C39811tr) AnonymousClass4ZD.A00(this, this.A00, this.A0c, r32, 4).A00(C39811tr.class);
        }
        C32681e1 r0 = this.A0s;
        AnonymousClass190 r142 = this.A0j;
        C24801Dv r8 = this.A01;
        AnonymousClass16D r112 = this.A0U;
        C20380xT r152 = this.A0o;
        C21060yb r132 = this.A08;
        this.A0Q.A03.A08(this, new AnonymousClass3UW(new AnonymousClass3H1(r8, this, this.A0Q, r112, this.A0V, r132, r142, r152, r0), this, 5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_manage_groups) {
            startActivity(AnonymousClass190.A0c(this, this.A0l));
            return true;
        } else if (menuItem.getItemId() == R.id.menu_edit_community) {
            startActivityForResult(C36401kF.A06(this, this.A0l), 123);
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == R.id.menu_view_members) {
            this.A01.A08(this, AnonymousClass190.A0h(this, this.A0l, false), "communityHome");
            return true;
        } else {
            super.onOptionsItemSelected(menuItem);
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0Y.A0R(this.A0l)) {
            A07(this, getString(R.string.f12nameremoved));
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0w > 0) {
            A2S("render_community_home");
            BPG(2);
            this.A0q.A00(9, SystemClock.uptimeMillis() - this.A0w);
            this.A0w = 0;
        }
    }

    public CommunityHomeActivity() {
        this(0);
        this.A12 = new C89584Xc(this, 0);
        this.A13 = new AnonymousClass4WC(this, 0);
        this.A11 = new AnonymousClass4YE(this, 2);
    }
}
