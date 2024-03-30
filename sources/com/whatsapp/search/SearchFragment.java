package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass02K;
import X.AnonymousClass04H;
import X.AnonymousClass04S;
import X.AnonymousClass08S;
import X.AnonymousClass0UE;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass143;
import X.AnonymousClass15O;
import X.AnonymousClass165;
import X.AnonymousClass16A;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass196;
import X.AnonymousClass1A4;
import X.AnonymousClass1A5;
import X.AnonymousClass1A6;
import X.AnonymousClass1AO;
import X.AnonymousClass1AW;
import X.AnonymousClass1CF;
import X.AnonymousClass1CR;
import X.AnonymousClass1DU;
import X.AnonymousClass1EL;
import X.AnonymousClass1EM;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1HX;
import X.AnonymousClass1K3;
import X.AnonymousClass1KK;
import X.AnonymousClass1LI;
import X.AnonymousClass1LU;
import X.AnonymousClass1LV;
import X.AnonymousClass1MK;
import X.AnonymousClass1NC;
import X.AnonymousClass1NG;
import X.AnonymousClass1P5;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QH;
import X.AnonymousClass1RA;
import X.AnonymousClass1RC;
import X.AnonymousClass1RY;
import X.AnonymousClass1T1;
import X.AnonymousClass1T4;
import X.AnonymousClass1TA;
import X.AnonymousClass1V6;
import X.AnonymousClass1X4;
import X.AnonymousClass1X7;
import X.AnonymousClass1Y3;
import X.AnonymousClass1YI;
import X.AnonymousClass1YR;
import X.AnonymousClass2XH;
import X.AnonymousClass2XJ;
import X.AnonymousClass3L5;
import X.AnonymousClass4W0;
import X.AnonymousClass4YE;
import X.AnonymousClass67J;
import X.AnonymousClass6TR;
import X.AnonymousClass6YD;
import X.C001600r;
import X.C001700s;
import X.C111555cT;
import X.C115905jd;
import X.C115915je;
import X.C115925jf;
import X.C117805mr;
import X.C124155xg;
import X.C132056Ry;
import X.C134786bb;
import X.C142926ph;
import X.C1512578v;
import X.C162317oO;
import X.C162517oi;
import X.C162747p5;
import X.C162797pA;
import X.C165077sq;
import X.C165087sr;
import X.C165187t1;
import X.C165197t2;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19630wG;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C20230xE;
import X.C20350xQ;
import X.C20430xY;
import X.C20500xf;
import X.C20810yC;
import X.C20830yE;
import X.C21060yb;
import X.C220412q;
import X.C220712t;
import X.C226815j;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C24511Cs;
import X.C24521Ct;
import X.C24541Cv;
import X.C24801Dv;
import X.C25851Hx;
import X.C26171Jd;
import X.C26421Kc;
import X.C27121Mz;
import X.C27731Pn;
import X.C27951Qm;
import X.C28041Ra;
import X.C28141Rm;
import X.C28271Rz;
import X.C28361Si;
import X.C28371Sj;
import X.C29411Wn;
import X.C32001cn;
import X.C32251dE;
import X.C32621dv;
import X.C32641dx;
import X.C32661dz;
import X.C32731e6;
import X.C32811eE;
import X.C32831eG;
import X.C32931eR;
import X.C33051ed;
import X.C33191es;
import X.C33231ew;
import X.C33431fJ;
import X.C33761ft;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C61343Bm;
import X.C65383Rv;
import X.C65963Ud;
import X.C65973Ue;
import X.C81163wZ;
import X.C81333wq;
import X.C90494aF;
import X.C96154ms;
import X.C99304t3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.search.views.ProgressView;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.List;

public class SearchFragment extends Hilt_SearchFragment {
    public ValueAnimator A00;
    public View A01;
    public ViewGroup A02;
    public Toolbar A03;
    public AnonymousClass04S A04;
    public RecyclerView A05;
    public C99304t3 A06;
    public C19460v5 A07;
    public C19460v5 A08;
    public C19460v5 A09;
    public C19460v5 A0A;
    public C19460v5 A0B;
    public C19460v5 A0C;
    public C19460v5 A0D;
    public AnonymousClass1NC A0E;
    public C24801Dv A0F;
    public C32621dv A0G;
    public C19700wN A0H;
    public C33231ew A0I;
    public C61343Bm A0J;
    public C115905jd A0K;
    public C115915je A0L;
    public C115925jf A0M;
    public AnonymousClass17Y A0N;
    public C19730wQ A0O;
    public AnonymousClass1T1 A0P;
    public AnonymousClass1LI A0Q;
    public AnonymousClass1X4 A0R;
    public C29411Wn A0S;
    public AnonymousClass1KK A0T;
    public C26421Kc A0U;
    public AnonymousClass1NG A0V;
    public AnonymousClass1K3 A0W;
    public AnonymousClass1HX A0X;
    public C124155xg A0Y;
    public AnonymousClass1MK A0Z;
    public C24361Cd A0a;
    public AnonymousClass1AO A0b;
    public AnonymousClass3L5 A0c;
    public AnonymousClass1T4 A0d;
    public AnonymousClass1LV A0e;
    public C20230xE A0f;
    public AnonymousClass196 A0g;
    public AnonymousClass1Pp A0h;
    public AnonymousClass16D A0i;
    public AnonymousClass16I A0j;
    public AnonymousClass171 A0k;
    public AnonymousClass16K A0l;
    public C27731Pn A0m;
    public C65383Rv A0n;
    public C20430xY A0o;
    public AnonymousClass1Y3 A0p;
    public AnonymousClass1A6 A0q;
    public AnonymousClass1V6 A0r;
    public C21060yb A0s;
    public C19970wo A0t;
    public C19630wG A0u;
    public C20830yE A0v;
    public C19420v0 A0w;
    public C18820ts A0x;
    public C25851Hx A0y;
    public AnonymousClass1HJ A0z;
    public C220712t A10;
    public C220412q A11;
    public AnonymousClass1A5 A12;
    public C24381Cf A13;
    public AnonymousClass165 A14;
    public AnonymousClass1A4 A15;
    public AnonymousClass1QH A16;
    public AnonymousClass17X A17;
    public AnonymousClass1HO A18;
    public C24541Cv A19;
    public C32731e6 A1A;
    public AnonymousClass1YR A1B;
    public C26171Jd A1C;
    public AnonymousClass1LU A1D;
    public AnonymousClass1TA A1E;
    public C20810yC A1F;
    public C20500xf A1G;
    public C20350xQ A1H;
    public C233117z A1I;
    public AnonymousClass1EL A1J;
    public AnonymousClass1CF A1K;
    public C33761ft A1L;
    public AnonymousClass190 A1M;
    public C32931eR A1N;
    public C32831eG A1O;
    public AnonymousClass11F A1P;
    public AnonymousClass1DU A1Q;
    public AnonymousClass1P5 A1R;
    public AnonymousClass2XH A1S;
    public C28371Sj A1T;
    public C32641dx A1U;
    public C33191es A1V;
    public C28361Si A1W;
    public AnonymousClass1EV A1X;
    public AnonymousClass1EU A1Y;
    public AnonymousClass1FR A1Z;
    public C19890wg A1a;
    public AnonymousClass1AW A1b;
    public C96154ms A1c;
    public SearchViewModel A1d;
    public ProgressView A1e;
    public TokenizedSearchInput A1f;
    public AnonymousClass1CR A1g;
    public C32251dE A1h;
    public StatusesViewModel A1i;
    public AnonymousClass1X7 A1j;
    public C32661dz A1k;
    public C32811eE A1l;
    public C33051ed A1m;
    public AnonymousClass1EM A1n;
    public AnonymousClass13J A1o;
    public C19770wU A1p;
    public AnonymousClass1YI A1q;
    public AnonymousClass005 A1r;
    public AnonymousClass005 A1s;
    public AnonymousClass005 A1t;
    public Runnable A1u;
    public AnonymousClass1RY A1v;
    public C33431fJ A1w;
    public IteratingPlayer A1x;
    public AnonymousClass2XJ A1y;
    public C27951Qm A1z = C27951Qm.GONE;
    public boolean A20;
    public final AnonymousClass0UE A21 = new C162517oi(this, 15);
    public final AnonymousClass16A A22 = new C142926ph(this);
    public final C32001cn A23 = new AnonymousClass4W0(this, 15);
    public final C226815j A24 = new C162747p5(this, 7);
    public final C24521Ct A25 = new AnonymousClass4YE(this, 19);
    public final C24511Cs A26 = new C162797pA(this, 2);

    private void A03(Bundle bundle) {
        C27951Qm r0;
        WDSToolbar wDSToolbar;
        int i;
        if (bundle == null || (i = bundle.getInt("toolbar_divider_state", -1)) <= 0) {
            Toolbar toolbar = this.A03;
            AnonymousClass00C.A0D(toolbar, 0);
            if (!(toolbar instanceof WDSToolbar) || (wDSToolbar = (WDSToolbar) toolbar) == null || (r0 = wDSToolbar.A06) == null) {
                r0 = C27951Qm.GONE;
            }
        } else {
            r0 = C27951Qm.values()[i];
        }
        this.A1z = r0;
    }

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        SearchViewModel searchViewModel = this.A1d;
        AnonymousClass01I A0i2 = A0i();
        C165197t2.A01(A0i2, searchViewModel.A0i, searchViewModel, 2);
        C165197t2.A01(A0i2, searchViewModel.A02, searchViewModel, 8);
        C165197t2.A01(A0i2, searchViewModel.A0g, searchViewModel, 4);
        C165197t2.A01(A0i2, searchViewModel.A0Y, searchViewModel, 3);
        C165197t2.A01(A0i2, searchViewModel.A0X, searchViewModel, 6);
        C165197t2.A01(A0i2, searchViewModel.A0Z, searchViewModel, 9);
        C165197t2.A01(A0i2, searchViewModel.A0W, searchViewModel, 7);
        A03(bundle);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null && bundle2.containsKey("INBOX_FILTER")) {
            String string = this.A0A.getString("INBOX_FILTER");
            switch (string.hashCode()) {
                case -1730152220:
                    if (string.equals("CONTACTS_FILTER")) {
                        A00();
                        this.A1d.A0n(new C134786bb(0, R.id.search_contact_filter, R.string.f12nameremoved, R.drawable.smart_filter_contacts));
                        return;
                    }
                    return;
                case 72525144:
                    if (string.equals("GROUP_FILTER")) {
                        A00();
                        SearchViewModel searchViewModel2 = this.A1d;
                        searchViewModel2.A10.A00(2, (Integer) null, (String) null, 114);
                        searchViewModel2.A0n(new C134786bb(4, R.id.search_group_filter, R.string.f12nameremoved, R.drawable.smart_filter_group));
                        searchViewModel2.A02.A0D(new C1512578v(searchViewModel2.A0p, searchViewModel2.A0r, searchViewModel2.A0w));
                        return;
                    }
                    return;
                case 1827283464:
                    if (string.equals("UNREAD_FILTER")) {
                        A00();
                        this.A1d.A0e();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private void A00() {
        LinearLayout linearLayout;
        View view;
        View view2 = this.A0F;
        if (view2 != null && (linearLayout = (LinearLayout) view2.getParent()) != null) {
            C81163wZ r3 = new C81163wZ((Object) this, 0);
            ViewParent parent = linearLayout.getParent();
            ValueAnimator valueAnimator = null;
            if ((parent instanceof FrameLayout) && (view = (View) parent) != null) {
                valueAnimator = C111555cT.A00(linearLayout, new C81333wq(linearLayout, (Runnable) r3), view.getHeight());
            }
            this.A00 = valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public static void A05(AnonymousClass11F r4, SearchFragment searchFragment) {
        C96154ms r3 = searchFragment.A1c;
        if (r3 != null) {
            int i = 0;
            while (true) {
                C1512578v r1 = r3.A0O;
                if (i < r1.size()) {
                    if (r4.equals(((C132056Ry) r1.get(i)).A01)) {
                        r3.A07(i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static void A08(SearchFragment searchFragment) {
        if (!searchFragment.A0r.A0C()) {
            searchFragment.A0r.A06();
        }
    }

    public static void A09(SearchFragment searchFragment) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) searchFragment.A05.getLayoutManager();
        if (linearLayoutManager != null) {
            SearchViewModel searchViewModel = searchFragment.A1d;
            Integer valueOf = Integer.valueOf(linearLayoutManager.A1S() + 6);
            C001700s r1 = searchViewModel.A0h;
            if (!C90494aF.A1U(r1, valueOf)) {
                r1.A0C(valueOf);
            }
            SearchViewModel searchViewModel2 = searchFragment.A1d;
            Integer valueOf2 = Integer.valueOf(linearLayoutManager.A1U());
            C001700s r12 = searchViewModel2.A0i;
            if (!C90494aF.A1U(r12, valueOf2)) {
                r12.A0C(valueOf2);
            }
        }
    }

    public static void A0B(SearchFragment searchFragment, Runnable runnable, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        String str;
        Bundle bundle = searchFragment.A0A;
        if (bundle != null) {
            if (z) {
                i5 = 500;
                str = "enter_duration_ms";
            } else {
                i5 = 250;
                str = "exit_duration_ms";
            }
            int i6 = bundle.getInt(str, i5);
            AnonymousClass02K r6 = new AnonymousClass02K();
            if (searchFragment.A02 != null) {
                int i7 = bundle.getInt("x", 0);
                int i8 = bundle.getInt("y", 0);
                float hypot = (float) Math.hypot((double) (i3 - i), (double) (i4 - i2));
                float f = 0.0f;
                if (!z) {
                    f = hypot;
                    hypot = 0.0f;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(searchFragment.A02, i7, i8, f, hypot);
                createCircularReveal.setDuration((long) i6);
                createCircularReveal.setInterpolator(r6);
                createCircularReveal.addListener(new C162317oO(searchFragment, runnable, 0));
                createCircularReveal.start();
            }
        }
    }

    public void A1R(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A15.A00);
        bundle.putInt("toolbar_divider_state", this.A1z.ordinal());
    }

    public boolean A1W(MenuItem menuItem) {
        if (!this.A1w.A02(menuItem, this, A0i())) {
            return false;
        }
        A08(this);
        return true;
    }

    public static void A06(Jid jid, SearchFragment searchFragment) {
        if (AnonymousClass143.A0I(jid) && searchFragment.A1F.A0E(4178)) {
            Log.w(AnonymousClass000.A0l(jid, "Click on LID from search; jid = ", AnonymousClass000.A0u()), new Throwable());
        }
    }

    public static void A07(SearchFragment searchFragment) {
        AnonymousClass15O r2 = (AnonymousClass15O) searchFragment.A0h();
        searchFragment.A1d.A0g(2);
        if (r2 != null && !r2.isFinishing()) {
            HomeActivity homeActivity = (HomeActivity) r2;
            homeActivity.A0I.setBackgroundResource(R.drawable.search_background);
            homeActivity.A0D.setVisibility(4);
        }
    }

    public static void A0A(SearchFragment searchFragment, Object obj) {
        A08(searchFragment);
        if (obj != null && !obj.equals(C36381kD.A0m()) && !obj.equals("")) {
            if (C90494aF.A1U(searchFragment.A1d.A0V, C36361kB.A0j())) {
                searchFragment.A00();
            }
        }
    }

    public void A1B() {
        C36321k7.A1K(this, "SearchFragment/onStop ", AnonymousClass000.A0u());
        super.A1B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d8, code lost:
        if (r7.A02(r4) != false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r53, android.view.LayoutInflater r54, android.view.ViewGroup r55) {
        /*
            r52 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "SearchFragment/onCreateView "
            r0 = r52
            X.C36321k7.A1K(r0, r1, r2)
            X.0wG r1 = r0.A0u     // Catch:{ IOException -> 0x0012 }
            android.content.Context r1 = r1.A00     // Catch:{ IOException -> 0x0012 }
            X.AnonymousClass10B.A00(r1)     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            r1 = 2131626085(0x7f0e0865, float:1.8879396E38)
            r3 = r54
            r2 = r55
            android.view.View r2 = X.C36361kB.A0E(r3, r2, r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.A02 = r2
            r1 = 2131433415(0x7f0b17c7, float:1.8488615E38)
            android.view.View r1 = r2.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.A05 = r1
            android.view.ViewGroup r2 = r0.A02
            r1 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r1 = r2.findViewById(r1)
            r0.A01 = r1
            com.whatsapp.search.SearchViewModel r4 = r0.A1d
            X.0wU r3 = r4.A1C     // Catch:{ Exception -> 0x0046 }
            r2 = 35
            X.1jA r1 = new X.1jA     // Catch:{ Exception -> 0x0046 }
            r1.<init>((com.whatsapp.search.SearchViewModel) r4, (int) r2)     // Catch:{ Exception -> 0x0046 }
            r3.Boy(r1)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0063
        L_0x0046:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "SearchViewModel/warmContacts/"
            r2.append(r1)
            X.0wU r1 = r4.A1C
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            X.1S6 r1 = r4.A0z
            java.lang.String r1 = X.AnonymousClass000.A0o(r1, r2)
            com.whatsapp.util.Log.e(r1, r3)
        L_0x0063:
            boolean r1 = r0.A20
            r2 = 1
            if (r1 != 0) goto L_0x0099
            android.view.ViewGroup r1 = r0.A02
            if (r1 == 0) goto L_0x0097
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            if (r1 == 0) goto L_0x0073
            r1.A0g(r2)
        L_0x0073:
            X.0wU r6 = r0.A1p
            r4 = 50
            X.3wZ r3 = new X.3wZ
            r3.<init>((java.lang.Object) r0, (int) r2)
            java.lang.String r1 = "SearchFragment/setupAnimation"
            X.1jE r1 = r6.BpM(r3, r1, r4)
            r0.A1u = r1
            X.0yC r4 = r0.A1F
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            X.0yV r3 = X.C21000yV.A01
            r1 = 8013(0x1f4d, float:1.1229E-41)
            boolean r1 = X.C20800yB.A01(r3, r4, r1)
            if (r1 == 0) goto L_0x02ae
            A07(r0)
        L_0x0097:
            r0.A20 = r2
        L_0x0099:
            X.17Y r4 = r0.A0N
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            com.whatsapp.search.IteratingPlayer r3 = new com.whatsapp.search.IteratingPlayer
            r3.<init>(r1, r4)
            r0.A1x = r3
            X.01N r1 = r0.A0P
            r1.A04(r3)
            X.01N r3 = r0.A0P
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            r3.A04(r1)
            X.3Bm r3 = r0.A0J
            X.0wU r1 = r0.A1p
            X.2kb r1 = X.AnonymousClass2XJ.A01(r1)
            X.2XJ r1 = r3.A00(r1)
            r0.A1y = r1
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            X.6YD r1 = r1.A03
            if (r1 != 0) goto L_0x02a6
            r11 = 0
        L_0x00c5:
            X.0yC r4 = r0.A1F
            X.6TR r7 = X.AnonymousClass6YD.A0P
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            boolean r1 = r7.A03(r4)
            if (r1 != 0) goto L_0x00da
            boolean r4 = r7.A02(r4)
            r1 = 0
            if (r4 == 0) goto L_0x00db
        L_0x00da:
            r1 = 1
        L_0x00db:
            if (r1 == 0) goto L_0x0161
            if (r11 == 0) goto L_0x0161
            X.5je r4 = r0.A0L
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            X.6YD r1 = r1.A03
            if (r1 == 0) goto L_0x02a3
            X.6Pa r1 = X.AnonymousClass6YD.A00(r1)
            X.6qs r1 = r1.A05
            X.6Th r1 = r1.A02
            X.1Rs r10 = r1.A04
            X.AnonymousClass00C.A08(r10)
        L_0x00f4:
            X.1ds r5 = r4.A00
            X.0tq r4 = r5.A02
            X.0yC r21 = X.C36341k9.A0V(r4)
            X.0yE r20 = X.C36351kA.A0X(r4)
            X.0tt r6 = r4.A00
            X.004 r1 = r6.A1C
            java.lang.Object r9 = r1.get()
            X.32W r9 = (X.AnonymousClass32W) r9
            X.004 r1 = r4.A7A
            java.lang.Object r8 = r1.get()
            X.0zE r8 = (X.C21430zE) r8
            X.1My r1 = r5.A00
            X.61p r15 = X.C27111My.A0l(r1)
            X.004 r1 = r6.A0m
            java.lang.Object r5 = r1.get()
            X.5DQ r5 = (X.AnonymousClass5DQ) r5
            X.004 r1 = r6.A0g
            java.lang.Object r4 = r1.get()
            X.6pC r4 = (X.C142636pC) r4
            X.004 r1 = r6.A0h
            java.lang.Object r1 = r1.get()
            X.5t5 r1 = (X.C121405t5) r1
            X.6qn r6 = new X.6qn
            r12 = r6
            r13 = r0
            r14 = r10
            r16 = r4
            r17 = r1
            r18 = r11
            r19 = r5
            r22 = r9
            r23 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.whatsapp.search.SearchViewModel r5 = r0.A1d
            java.util.Objects.requireNonNull(r6)
            r1 = 45
            X.7t1 r4 = new X.7t1
            r4.<init>(r6, r1)
            X.6YD r1 = r5.A03
            if (r1 == 0) goto L_0x0161
            X.6Pa r1 = X.AnonymousClass6YD.A00(r1)
            X.6qs r1 = r1.A05
            X.6Th r1 = r1.A02
            X.1Rs r1 = r1.A04
            r1.A08(r0, r4)
        L_0x0161:
            X.5jf r4 = r0.A0M
            com.whatsapp.search.IteratingPlayer r1 = r0.A1x
            r44 = r1
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            r45 = r1
            X.1RY r1 = r0.A1v
            r22 = r1
            X.01I r17 = r0.A0h()
            X.01N r1 = r0.A0P
            r21 = r1
            X.2XJ r1 = r0.A1y
            r18 = r1
            X.1ds r5 = r4.A00
            X.0tq r1 = r5.A02
            X.0yC r37 = X.C36341k9.A0V(r1)
            X.004 r4 = r1.A4o
            java.lang.Object r16 = r4.get()
            r4 = r16
            X.1X7 r4 = (X.AnonymousClass1X7) r4
            r16 = r4
            X.17Y r23 = X.C36351kA.A0M(r1)
            X.0wN r20 = X.C36391kE.A0V(r1)
            X.0wU r48 = X.C36341k9.A0Z(r1)
            X.0wG r31 = X.C36351kA.A0W(r1)
            X.190 r38 = X.C36351kA.A0h(r1)
            X.004 r4 = r1.A4T
            java.lang.Object r15 = r4.get()
            X.1DU r15 = (X.AnonymousClass1DU) r15
            X.1X4 r25 = X.C36361kB.A0T(r1)
            X.004 r4 = r1.A0x
            java.lang.Object r14 = r4.get()
            X.1K3 r14 = (X.AnonymousClass1K3) r14
            X.1Dv r19 = X.C36351kA.A0J(r1)
            X.2XH r41 = X.C36411kG.A0m(r1)
            X.1Pp r28 = X.C36361kB.A0V(r1)
            X.0ts r33 = X.C36341k9.A0T(r1)
            X.004 r4 = r1.A6S
            java.lang.Object r13 = r4.get()
            X.1e6 r13 = (X.C32731e6) r13
            X.004 r4 = r1.A7h
            java.lang.Object r12 = r4.get()
            X.1TA r12 = (X.AnonymousClass1TA) r12
            X.0yE r32 = X.C36351kA.A0X(r1)
            X.0tt r4 = r1.A00
            X.004 r6 = r4.A0n
            java.lang.Object r11 = r6.get()
            X.5xg r11 = (X.C124155xg) r11
            X.1A5 r34 = X.C36371kC.A0X(r1)
            X.004 r6 = r1.A6f
            java.lang.Object r10 = r6.get()
            X.1Dj r10 = (X.C24681Dj) r10
            X.1P5 r40 = X.C36411kG.A0l(r1)
            X.004 r6 = r4.A1P
            java.lang.Object r9 = r6.get()
            X.1es r9 = (X.C33191es) r9
            X.1LI r24 = X.C36361kB.A0S(r1)
            X.1dr r6 = r5.A01
            X.004 r6 = r6.A0m
            java.lang.Object r8 = r6.get()
            X.5jd r8 = (X.C115905jd) r8
            X.13J r47 = X.C36351kA.A0q(r1)
            X.004 r1 = r4.A2M
            java.lang.Object r6 = r1.get()
            X.3Rv r6 = (X.C65383Rv) r6
            X.1My r1 = r5.A00
            X.004 r1 = r1.A0f
            java.lang.Object r4 = r1.get()
            X.1ez r4 = (X.C33261ez) r4
            X.4ms r1 = new X.4ms
            r26 = r14
            r27 = r11
            r29 = r22
            r30 = r6
            r35 = r13
            r36 = r12
            r39 = r15
            r42 = r9
            r43 = r10
            r46 = r16
            r49 = r18
            r18 = r21
            r21 = r4
            r22 = r8
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r0.A1c = r1
            r9 = 39
            X.7t1 r4 = new X.7t1
            r4.<init>(r0, r9)
            r0.A04 = r4
            X.1dE r4 = r0.A1h
            r8 = 1
            X.AnonymousClass00C.A0D(r4, r3)
            com.whatsapp.status.viewmodels.StatusesViewModel r4 = X.C68073bI.A00(r0, r4, r2)
            r0.A1i = r4
            X.00s r6 = r4.A04
            X.0Ab r5 = r0.A0m()
            X.7t4 r4 = new X.7t4
            r4.<init>(r1, r0, r2)
            r6.A08(r5, r4)
            X.01N r4 = r0.A0P
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = r0.A1i
            r4.A04(r1)
            X.4ms r6 = r0.A1c
            android.content.Context r4 = r0.A1D()
            r1 = 2131100317(0x7f06029d, float:1.7813012E38)
            int r5 = X.AnonymousClass00F.A00(r4, r1)
            android.content.Context r4 = r0.A1D()
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = X.C65103Qt.A01(r4, r1)
            X.4nF r4 = new X.4nF
            r4.<init>(r6, r5, r1)
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            r1.A0t(r4)
            X.0v5 r4 = r0.A0B
            boolean r1 = r4.A05()
            if (r1 == 0) goto L_0x02b7
            r4.A02()
            java.lang.String r0 = "generateNewSession"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02a3:
            r10 = 0
            goto L_0x00f4
        L_0x02a6:
            X.6Pa r1 = X.AnonymousClass6YD.A00(r1)
            X.6qs r11 = r1.A05
            goto L_0x00c5
        L_0x02ae:
            android.view.ViewGroup r3 = r0.A02
            r1 = 10
            X.C163327q1.A00(r3, r0, r1)
            goto L_0x0097
        L_0x02b7:
            android.content.Context r10 = r0.A0a()
            X.4ms r1 = r0.A1c
            com.whatsapp.search.SearchGridLayoutManager r4 = new com.whatsapp.search.SearchGridLayoutManager
            r4.<init>(r10, r1)
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            r1.A0U = r2
            r1.setLayoutManager(r4)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A05
            X.4ms r1 = r0.A1c
            r2.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r4 = r0.A05
            com.whatsapp.search.IteratingPlayer r2 = r0.A1x
            java.util.List r1 = r4.A0P
            if (r1 != 0) goto L_0x02de
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r4.A0P = r1
        L_0x02de:
            r1.add(r2)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A05
            X.0ts r4 = r0.A0x
            android.content.res.Resources r2 = X.C36341k9.A0G(r0)
            r1 = 2131168163(0x7f070ba3, float:1.795062E38)
            int r2 = r2.getDimensionPixelSize(r1)
            X.1wq r1 = new X.1wq
            r1.<init>(r4, r2)
            r5.A0t(r1)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A05
            X.4ms r4 = r0.A1c
            X.6os r2 = new X.6os
            r2.<init>(r0)
            X.4nC r1 = new X.4nC
            r1.<init>(r10, r5, r2, r4)
            r5.A0t(r1)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A05
            r1 = 0
            r2.setItemAnimator(r1)
            X.1ew r2 = r0.A0I
            X.6sO r1 = new X.6sO
            r1.<init>(r0)
            X.1fH r29 = r2.A00(r10, r1)
            android.content.Context r13 = r0.A1D()
            X.0wo r11 = r0.A0t
            X.17Y r6 = r0.A0N
            X.0wU r5 = r0.A1p
            X.12t r4 = r0.A10
            X.1CR r2 = r0.A1g
            X.1A6 r1 = r0.A0q
            X.1fI r28 = new X.1fI
            r12 = r28
            r14 = r6
            r15 = r1
            r16 = r29
            r17 = r11
            r18 = r4
            r19 = r2
            r20 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            X.01z r1 = r0.A0M
            r51 = r1
            X.0wo r1 = r0.A0t
            r30 = r1
            X.0v5 r1 = r0.A0C
            r50 = r1
            X.17Y r1 = r0.A0N
            r49 = r1
            X.0wQ r1 = r0.A0O
            r48 = r1
            X.0wU r1 = r0.A1p
            r43 = r1
            X.12q r1 = r0.A11
            r32 = r1
            X.0v5 r1 = r0.A0D
            r47 = r1
            X.1X4 r1 = r0.A0R
            r46 = r1
            X.0xf r1 = r0.A1G
            r34 = r1
            X.16D r1 = r0.A0i
            r25 = r1
            X.13J r1 = r0.A1o
            r42 = r1
            X.1dx r1 = r0.A1U
            r37 = r1
            X.0xQ r1 = r0.A1H
            r35 = r1
            X.0v5 r1 = r0.A09
            r45 = r1
            X.1dz r1 = r0.A1k
            r40 = r1
            X.1CR r1 = r0.A1g
            r19 = r1
            X.1Wn r1 = r0.A0S
            r18 = r1
            X.1eE r1 = r0.A1l
            r17 = r1
            X.0xY r1 = r0.A0o
            r16 = r1
            X.1Si r15 = r0.A1W
            X.0v0 r14 = r0.A0w
            X.1LV r13 = r0.A0e
            X.1KK r12 = r0.A0T
            X.1T4 r11 = r0.A0d
            X.1Y3 r6 = r0.A0p
            X.0xE r5 = r0.A0f
            X.17X r4 = r0.A17
            X.1CF r2 = r0.A1K
            X.1fJ r1 = new X.1fJ
            r44 = 1
            r20 = r18
            r21 = r12
            r22 = r11
            r23 = r13
            r24 = r5
            r26 = r16
            r27 = r6
            r31 = r14
            r33 = r4
            r36 = r2
            r38 = r15
            r39 = r19
            r41 = r17
            r11 = r1
            r12 = r10
            r13 = r51
            r14 = r50
            r15 = r47
            r16 = r45
            r17 = r49
            r18 = r48
            r19 = r46
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A1w = r1
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            r1.setOnCreateContextMenuListener(r0)
            android.view.ViewGroup r2 = r0.A02
            r1 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r4 = r2.findViewById(r1)
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            r0.A03 = r4
            X.0ts r2 = r0.A0x
            r1 = 2131102135(0x7f0609b7, float:1.78167E38)
            X.AnonymousClass3UF.A0D(r10, r4, r2, r1)
            androidx.appcompat.widget.Toolbar r2 = r0.A03
            r1 = 2131896334(0x7f12280e, float:1.9427526E38)
            r2.setNavigationContentDescription((int) r1)
            androidx.appcompat.widget.Toolbar r4 = r0.A03
            r2 = 30
            X.3Yq r1 = new X.3Yq
            r1.<init>((java.lang.Object) r0, (int) r2)
            r4.setNavigationOnClickListener(r1)
            androidx.appcompat.widget.Toolbar r4 = r0.A03
            android.content.res.Resources r2 = X.C36341k9.A0G(r0)
            r1 = 2131168175(0x7f070baf, float:1.7950644E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r4.setContentInsetStartWithNavigation(r1)
            androidx.appcompat.widget.Toolbar r2 = r0.A03
            r1 = 2131433621(0x7f0b1895, float:1.8489033E38)
            android.view.View r10 = r2.findViewById(r1)
            com.whatsapp.search.views.TokenizedSearchInput r10 = (com.whatsapp.search.views.TokenizedSearchInput) r10
            r0.A1f = r10
            X.0Ab r5 = r0.A0m()
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            r10.A0G = r1
            r10.A06 = r5
            com.google.android.material.chip.Chip r12 = r10.A0V
            r2 = 34
            X.3Yq r1 = new X.3Yq
            r1.<init>((com.whatsapp.search.views.TokenizedSearchInput) r10, (int) r2)
            r12.setOnClickListener(r1)
            com.google.android.material.chip.Chip r6 = r10.A0T
            r2 = 35
            X.3Yq r1 = new X.3Yq
            r1.<init>((com.whatsapp.search.views.TokenizedSearchInput) r10, (int) r2)
            r6.setOnClickListener(r1)
            com.google.android.material.chip.Chip r11 = r10.A0U
            r2 = 36
            X.3Yq r1 = new X.3Yq
            r1.<init>((com.whatsapp.search.views.TokenizedSearchInput) r10, (int) r2)
            r11.setOnClickListener(r1)
            com.google.android.material.chip.Chip r4 = r10.A07
            if (r4 == 0) goto L_0x045e
            r2 = 37
            X.3Yq r1 = new X.3Yq
            r1.<init>((com.whatsapp.search.views.TokenizedSearchInput) r10, (int) r2)
            r4.setOnClickListener(r1)
            X.05b r1 = r10.A05
            X.C012005e.A0V(r4, r1)
        L_0x045e:
            X.05b r1 = r10.A05
            X.C012005e.A0V(r12, r1)
            X.C012005e.A0V(r6, r1)
            X.C012005e.A0V(r11, r1)
            com.whatsapp.search.SearchViewModel r4 = r10.A0G
            r1 = 14
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.00r r1 = r4.A0Y
            r1.A08(r5, r2)
            com.whatsapp.search.SearchViewModel r4 = r10.A0G
            r1 = 16
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.00r r1 = r4.A0X
            r1.A08(r5, r2)
            com.whatsapp.search.SearchViewModel r4 = r10.A0G
            r1 = 15
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.08S r1 = r4.A0g
            r1.A08(r5, r2)
            com.whatsapp.search.SearchViewModel r4 = r10.A0G
            r1 = 13
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.00s r1 = r4.A0j
            r1.A08(r5, r2)
            com.whatsapp.search.SearchViewModel r4 = r10.A0G
            r1 = 10
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.00r r1 = r4.A0Z
            r1.A08(r5, r2)
            com.whatsapp.search.SearchViewModel r4 = r10.A0G
            r1 = 17
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.0yC r1 = r4.A0v
            boolean r1 = r7.A02(r1)
            if (r1 == 0) goto L_0x04c5
            X.00r r1 = r4.A0W
            r1.A08(r5, r2)
        L_0x04c5:
            com.whatsapp.text.FinalBackspaceAwareEntry r5 = r10.A0Y
            r2 = 38
            X.3Yq r1 = new X.3Yq
            r1.<init>((com.whatsapp.search.views.TokenizedSearchInput) r10, (int) r2)
            r5.setOnClickListener(r1)
            X.0ts r1 = r10.A0C
            boolean r1 = X.C36351kA.A1Y(r1)
            if (r1 == 0) goto L_0x04dc
            r5.setSingleLine(r8)
        L_0x04dc:
            android.text.InputFilter[] r4 = new android.text.InputFilter[r8]
            r2 = 1024(0x400, float:1.435E-42)
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r1.<init>(r2)
            r4[r3] = r1
            r5.setFilters(r4)
            X.5mr r2 = r10.A0J
            java.util.List r1 = r5.A00
            if (r1 != 0) goto L_0x04f6
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r5.A00 = r1
        L_0x04f6:
            r1.add(r2)
            r1 = 31
            X.3Ud r4 = new X.3Ud
            r4.<init>(r5, r1)
            com.whatsapp.search.views.TokenizedSearchInput r2 = r2.A00
            com.whatsapp.search.SearchViewModel r1 = r2.A0G
            if (r1 == 0) goto L_0x050d
            X.012 r2 = r2.A06
            X.08S r1 = r1.A0g
            r1.A08(r2, r4)
        L_0x050d:
            android.view.View$OnFocusChangeListener r1 = r10.A0S
            r5.setOnFocusChangeListener(r1)
            r1 = 3
            r5.setInputEnterAction(r1)
            android.widget.TextView$OnEditorActionListener r1 = r10.A04
            r5.setOnEditorActionListener(r1)
            android.view.View$OnKeyListener r1 = r10.A03
            r5.setOnKeyListener(r1)
            boolean r1 = r10.A0P
            if (r1 != 0) goto L_0x053d
            r1 = 2131430928(0x7f0b0e10, float:1.848357E38)
            android.view.ViewGroup r5 = X.C36411kG.A0O(r10, r1)
            android.animation.LayoutTransition r4 = new android.animation.LayoutTransition
            r4.<init>()
            r2 = 2
            r1 = 0
            r4.setAnimator(r2, r1)
            r1 = 100
            r4.setDuration(r1)
            r5.setLayoutTransition(r4)
        L_0x053d:
            com.whatsapp.WaImageView r2 = r10.A0X
            android.view.View$OnClickListener r1 = r10.A02
            r2.setOnClickListener(r1)
            com.whatsapp.search.SearchViewModel r1 = r10.A0G
            int r1 = r1.A0U()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A0L = r1
            com.whatsapp.search.SearchViewModel r1 = r10.A0G
            com.whatsapp.jid.UserJid r1 = r1.A0Y()
            r10.A0E = r1
            com.whatsapp.search.SearchViewModel r1 = r10.A0G
            java.lang.String r1 = r1.A0b()
            r10.A0M = r1
            com.whatsapp.search.SearchViewModel r1 = r10.A0G
            X.6bb r1 = r1.A0a()
            r10.A0H = r1
            com.whatsapp.search.SearchViewModel r1 = r10.A0G
            X.6bf r1 = r1.A0Z()
            r10.A0F = r1
            com.whatsapp.search.views.TokenizedSearchInput.A0A(r10)
            com.whatsapp.search.views.TokenizedSearchInput.A09(r10)
            com.whatsapp.search.views.TokenizedSearchInput.A08(r10)
            com.whatsapp.jid.UserJid r4 = r10.A0E
            if (r4 == 0) goto L_0x0588
            X.171 r2 = r10.A0A
            X.16D r1 = r10.A09
            java.lang.String r1 = X.C36381kD.A0u(r1, r2, r4)
            r6.setText(r1)
        L_0x0588:
            com.whatsapp.search.views.TokenizedSearchInput.A07(r10)
            com.whatsapp.search.views.TokenizedSearchInput.A06(r10)
            com.whatsapp.search.SearchViewModel r1 = r10.A0G
            X.C18740tg.A06(r1)
            com.whatsapp.search.views.TokenizedSearchInput.A03(r10)
            com.whatsapp.WaImageButton r2 = r10.A0W
            X.3Yq r1 = new X.3Yq
            r1.<init>((com.whatsapp.search.views.TokenizedSearchInput) r10, (int) r9)
            r2.setOnClickListener(r1)
            com.whatsapp.search.SearchViewModel r5 = r10.A0G
            X.012 r4 = r10.A06
            r1 = 11
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.08S r1 = r5.A0c
            r1.A08(r4, r2)
            com.whatsapp.search.SearchViewModel r5 = r10.A0G
            X.012 r4 = r10.A06
            r1 = 12
            X.7t2 r2 = new X.7t2
            r2.<init>(r10, r1)
            X.08S r1 = r5.A0b
            r1.A08(r4, r2)
            r4 = 2131102972(0x7f060cfc, float:1.7818397E38)
            androidx.appcompat.widget.Toolbar r2 = r0.A03
            android.content.Context r1 = r0.A0a()
            X.C36341k9.A0q(r1, r2, r4)
            r1 = r53
            r0.A03(r1)
            androidx.appcompat.widget.Toolbar r2 = r0.A03
            X.1Qm r1 = X.C27951Qm.GONE
            X.AnonymousClass1RA.A01(r2, r1)
            X.0yC r1 = r0.A1F
            boolean r10 = X.C129336Gn.A00(r1)
            android.content.Context r2 = r0.A0a()
            X.2nI r1 = X.C51112nI.NORMAL
            X.3GV r5 = new X.3GV
            r5.<init>(r2, r1)
            if (r10 != 0) goto L_0x05f4
            androidx.appcompat.widget.Toolbar r2 = r0.A03
            X.05l r1 = r5.A01()
            X.C011504z.A04(r1, r2)
        L_0x05f4:
            android.content.Context r9 = r0.A0a()
            androidx.appcompat.widget.Toolbar r6 = r0.A03
            X.AnonymousClass00C.A0D(r6, r8)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131169051(0x7f070f1b, float:1.7952421E38)
            int r8 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131169052(0x7f070f1c, float:1.7952423E38)
            int r7 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131169050(0x7f070f1a, float:1.795242E38)
            int r4 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131169053(0x7f070f1d, float:1.7952425E38)
            int r2 = r2.getDimensionPixelSize(r1)
            X.3QI r1 = new X.3QI
            r1.<init>(r8, r2, r7, r4)
            X.C65723Tf.A02(r6, r1)
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131169054(0x7f070f1e, float:1.7952427E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r4.height = r1
            r6.requestLayout()
            androidx.appcompat.widget.Toolbar r1 = r0.A03
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            android.graphics.drawable.Drawable r2 = r5.A00(r1)
            androidx.appcompat.widget.Toolbar r1 = r0.A03
            r1.setNavigationIcon((android.graphics.drawable.Drawable) r2)
            androidx.appcompat.widget.Toolbar r1 = r0.A03
            r1.setContentInsetStartWithNavigation(r3)
            if (r10 != 0) goto L_0x0662
            android.view.View r2 = r0.A01
            r1 = 8
            r2.setVisibility(r1)
        L_0x0662:
            android.view.ViewGroup r2 = r0.A02
            r1 = 2131434165(0x7f0b1ab5, float:1.8490136E38)
            X.C36351kA.A1A(r2, r1, r3)
            android.content.Context r2 = r0.A0a()
            r1 = 2131102765(0x7f060c2d, float:1.7817977E38)
            android.content.res.ColorStateList r2 = X.AnonymousClass00F.A04(r2, r1)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A1f
            com.whatsapp.WaImageView r1 = r1.A0X
            r1.setImageTintList(r2)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A1f
            com.whatsapp.WaImageButton r1 = r1.A0W
            r1.setImageTintList(r2)
            android.view.ViewGroup r2 = r0.A02
            r1 = 2131433000(0x7f0b1628, float:1.8487773E38)
            android.view.View r1 = X.C012005e.A02(r2, r1)
            com.whatsapp.search.views.ProgressView r1 = (com.whatsapp.search.views.ProgressView) r1
            r0.A1e = r1
            androidx.recyclerview.widget.RecyclerView r2 = r0.A05
            X.0UE r1 = r0.A21
            r2.A0v(r1)
            X.1MK r1 = r0.A0Z
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x06a9
            X.01I r2 = r0.A0i()
            r1 = 2131100114(0x7f0601d2, float:1.78126E38)
            X.AnonymousClass1RC.A05(r2, r1)
        L_0x06a9:
            android.view.ViewGroup r0 = r0.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchFragment.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1H() {
        C36321k7.A1K(this, "SearchFragment/onDestroy ", AnonymousClass000.A0u());
        if (this.A0i) {
            this.A16.A03((AnonymousClass11F) null, AnonymousClass000.A0k(this));
        }
        this.A0j.unregisterObserver(this.A24);
        this.A0a.unregisterObserver(this.A23);
        this.A13.unregisterObserver(this.A25);
        this.A0U.unregisterObserver(this.A22);
        this.A1I.unregisterObserver(this.A26);
        super.A1H();
    }

    public void A1J() {
        C36321k7.A1K(this, "SearchFragment/onDestroyView ", AnonymousClass000.A0u());
        Toolbar toolbar = this.A03;
        if (toolbar != null) {
            AnonymousClass1RA.A01(toolbar, this.A1z);
        }
        Runnable runnable = this.A1u;
        if (runnable != null) {
            this.A1p.Bnx(runnable);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        A08(this);
        TokenizedSearchInput tokenizedSearchInput = this.A1f;
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Y;
        C117805mr r1 = tokenizedSearchInput.A0J;
        List list = finalBackspaceAwareEntry.A00;
        if (list != null) {
            list.remove(r1);
        }
        finalBackspaceAwareEntry.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        finalBackspaceAwareEntry.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        finalBackspaceAwareEntry.setOnKeyListener((View.OnKeyListener) null);
        RecyclerView recyclerView = this.A05;
        IteratingPlayer iteratingPlayer = this.A1x;
        List list2 = recyclerView.A0P;
        if (list2 != null) {
            list2.remove(iteratingPlayer);
        }
        this.A05.A0w(this.A21);
        this.A0P.A05(this.A1x);
        this.A1v.A02();
        this.A1y.A0A();
        this.A02 = null;
        super.A1J();
    }

    public void A1K() {
        C36321k7.A1K(this, "SearchFragment/onPause ", AnonymousClass000.A0u());
        SearchViewModel searchViewModel = this.A1d;
        searchViewModel.A02.A0B(this.A04);
        super.A1K();
    }

    public void A1L() {
        C36321k7.A1K(this, "SearchFragment/onResume ", AnonymousClass000.A0u());
        SearchViewModel searchViewModel = this.A1d;
        searchViewModel.A02.A08(this, this.A04);
        super.A1L();
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        C33431fJ r1 = this.A1w;
        if (r1.A00 != null && i == r1.A01) {
            r1.A00();
        }
    }

    public void A1O(Context context) {
        super.A1O(context);
        this.A1v = this.A0m.A05(context.getApplicationContext(), "search-fragment");
    }

    public void A1Q(Bundle bundle) {
        C36321k7.A1K(this, "SearchFragment/onCreate ", AnonymousClass000.A0u());
        Bundle bundle2 = bundle;
        super.A1Q(bundle2);
        this.A20 = AnonymousClass000.A1V(bundle2);
        AnonymousClass15O r5 = (AnonymousClass15O) A0h();
        if (r5 != null && !r5.isFinishing()) {
            AnonymousClass1A4 r4 = this.A15;
            if (bundle != null) {
                r4.A00 = bundle2.getLong("ephemeral_session_start", -1);
            }
            this.A16.A02((AnonymousClass11F) null, AnonymousClass000.A0k(this));
            HomeActivity homeActivity = (HomeActivity) r5;
            SearchViewModel searchViewModel = (SearchViewModel) new AnonymousClass04H(new C28041Ra(homeActivity, homeActivity.A0g, this.A1v), homeActivity).A00(SearchViewModel.class);
            this.A1d = searchViewModel;
            searchViewModel.A0d.A08(this, new C165187t1(this, 41));
            SearchViewModel searchViewModel2 = this.A1d;
            searchViewModel2.A0a.A08(this, new C165197t2(this, 1));
            C165187t1.A00(this, this.A1d.A0e, 47);
            this.A0j.registerObserver(this.A24);
            this.A0a.registerObserver(this.A23);
            this.A13.registerObserver(this.A25);
            this.A0U.registerObserver(this.A22);
            this.A1I.registerObserver(this.A26);
            this.A1d.A0V.A08(this, new C65973Ue(this, 45));
            C165187t1.A00(this, this.A1d.A0f, 42);
            SearchViewModel searchViewModel3 = this.A1d;
            searchViewModel3.A1B.A08(this, new C65963Ud(this, 0));
            SearchViewModel searchViewModel4 = this.A1d;
            searchViewModel4.A17.A08(this, new C65973Ue(this, 42));
            SearchViewModel searchViewModel5 = this.A1d;
            searchViewModel5.A12.A08(this, new C65973Ue(this, 47));
            SearchViewModel searchViewModel6 = this.A1d;
            searchViewModel6.A14.A08(this, new C65973Ue(this, 48));
            SearchViewModel searchViewModel7 = this.A1d;
            searchViewModel7.A13.A08(this, new C65973Ue(this, 49));
            SearchViewModel searchViewModel8 = this.A1d;
            searchViewModel8.A16.A08(this, new C165187t1(this, 44));
            SearchViewModel searchViewModel9 = this.A1d;
            searchViewModel9.A0Y.A08(this, new C165187t1(this, 43));
            SearchViewModel searchViewModel10 = this.A1d;
            searchViewModel10.A0g.A08(this, new C165187t1(this, 46));
            SearchViewModel searchViewModel11 = this.A1d;
            searchViewModel11.A0X.A08(this, new C165187t1(this, 49));
            SearchViewModel searchViewModel12 = this.A1d;
            searchViewModel12.A0Z.A08(this, new C165187t1(this, 40));
            SearchViewModel searchViewModel13 = this.A1d;
            C165197t2 r1 = new C165197t2(this, 0);
            C20810yC r0 = searchViewModel13.A0v;
            AnonymousClass6TR r2 = AnonymousClass6YD.A0P;
            if (r2.A02(r0)) {
                searchViewModel13.A0W.A08(this, r1);
            }
            SearchViewModel searchViewModel14 = this.A1d;
            searchViewModel14.A15.A08(this, new C165187t1(this, 48));
            SearchViewModel searchViewModel15 = this.A1d;
            searchViewModel15.A18.A08(this, new C65973Ue(this, 44));
            SearchViewModel searchViewModel16 = this.A1d;
            searchViewModel16.A1A.A08(this, new C65973Ue(this, 46));
            SearchViewModel searchViewModel17 = this.A1d;
            searchViewModel17.A19.A08(this, new C65973Ue(this, 43));
            SearchViewModel searchViewModel18 = this.A1d;
            if (searchViewModel18.A03 == null) {
                C20810yC r12 = searchViewModel18.A0v;
                AnonymousClass00C.A0D(r12, 0);
                if (r2.A03(r12) || r2.A02(r12)) {
                    C28141Rm r13 = searchViewModel18.A0n;
                    AnonymousClass08S r35 = searchViewModel18.A0g;
                    C001600r r15 = searchViewModel18.A0Y;
                    C001600r r14 = searchViewModel18.A0X;
                    C001600r r132 = searchViewModel18.A0Z;
                    C165087sr r7 = new C165087sr(searchViewModel18, 7);
                    C165087sr r6 = new C165087sr(searchViewModel18, 8);
                    C165077sq r52 = new C165077sq(searchViewModel18, 8);
                    C001700s r122 = searchViewModel18.A0i;
                    C001700s r11 = searchViewModel18.A0x.A03;
                    AnonymousClass08S r42 = searchViewModel18.A02;
                    C001700s r9 = searchViewModel18.A0y.A02;
                    C27121Mz r02 = r13.A00;
                    C18800tq r16 = r02.A01;
                    C19970wo A0V2 = C36351kA.A0V(r16);
                    C20810yC A0V3 = C36341k9.A0V(r16);
                    C19770wU A0Z2 = C36341k9.A0Z(r16);
                    C18820ts A0T2 = C36341k9.A0T(r16);
                    AnonymousClass17Y A0M2 = C36351kA.A0M(r16);
                    C18830tt r17 = r16.A00;
                    C28271Rz r27 = (C28271Rz) r17.A2a.get();
                    C001700s r21 = r9;
                    C001700s r19 = r11;
                    AnonymousClass08S r20 = r42;
                    C001600r r172 = r132;
                    C001700s r18 = r122;
                    C001600r r162 = r14;
                    AnonymousClass08S r142 = r35;
                    AnonymousClass6YD r133 = new AnonymousClass6YD(r142, r15, r162, r172, r18, r19, r20, r21, A0M2, (AnonymousClass67J) r17.A3d.get(), A0V2, A0T2, A0V3, r27, A0Z2, C18840tu.A00(r17.A0l), C18840tu.A00(r17.A0f), r02.A00.A30, r52, r7, r6);
                    searchViewModel18.A03 = r133;
                    r42.A0F(r133.A06, new C165197t2(searchViewModel18, 5));
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.A0Z.A00()) {
            AnonymousClass1RC.A05(A0i(), R.color.f6nameremoved);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AnonymousClass11F r2 = this.A1P;
        if (r2 != null) {
            this.A1w.A01(contextMenu, r2, true, true);
        }
    }
}
