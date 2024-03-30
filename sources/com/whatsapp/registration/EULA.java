package com.whatsapp.registration;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass13J;
import X.AnonymousClass155;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass3D0;
import X.AnonymousClass3GZ;
import X.AnonymousClass3KB;
import X.AnonymousClass3LX;
import X.AnonymousClass3MI;
import X.AnonymousClass3SJ;
import X.AnonymousClass3SY;
import X.AnonymousClass3TX;
import X.AnonymousClass3UF;
import X.AnonymousClass3UV;
import X.AnonymousClass4YC;
import X.AnonymousClass66E;
import X.AnonymousClass6OK;
import X.AnonymousClass9XW;
import X.AnonymousClass9ZR;
import X.C129886Iv;
import X.C18740tg;
import X.C18750th;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19460v5;
import X.C19470v6;
import X.C20010ws;
import X.C201419jW;
import X.C20720y3;
import X.C207739wu;
import X.C20830yE;
import X.C21360z5;
import X.C21430zE;
import X.C224314h;
import X.C224514j;
import X.C27111My;
import X.C27651Pc;
import X.C28361Si;
import X.C29341Wg;
import X.C29411Wn;
import X.C29501Ww;
import X.C31161bN;
import X.C31171bO;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C37851nJ;
import X.C48762i0;
import X.C48902iF;
import X.C590732n;
import X.C62623Gw;
import X.C64123Ms;
import X.C65283Rl;
import X.C65983Uf;
import X.C67273Ze;
import X.C87964Qw;
import X.C89354Wf;
import X.C89734Xr;
import X.C90104Zc;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class EULA extends AnonymousClass155 implements C87964Qw {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public int A01;
    public View A02;
    public NestedScrollView A03;
    public C19460v5 A04;
    public C19460v5 A05;
    public C19460v5 A06;
    public C19460v5 A07;
    public C21360z5 A08;
    public C29411Wn A09;
    public AnonymousClass1RU A0A;
    public C27651Pc A0B;
    public C20830yE A0C;
    public C18820ts A0D;
    public C207739wu A0E;
    public C201419jW A0F;
    public AnonymousClass6OK A0G;
    public C65283Rl A0H;
    public AnonymousClass9XW A0I;
    public AnonymousClass3GZ A0J;
    public C20720y3 A0K;
    public C28361Si A0L;
    public C29341Wg A0M;
    public C64123Ms A0N;
    public AnonymousClass3KB A0O;
    public C62623Gw A0P;
    public AnonymousClass3UV A0Q;
    public C29501Ww A0R;
    public AnonymousClass1X8 A0S;
    public AnonymousClass1QE A0T;
    public AnonymousClass1QD A0U;
    public C590732n A0V;
    public AnonymousClass3TX A0W;
    public AnonymousClass13J A0X;
    public C31171bO A0Y;
    public C31161bN A0Z;
    public C129886Iv A0a;
    public AnonymousClass005 A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final C20010ws A0f;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0d = false;
        this.A0c = this.A0A.A0F(false);
        this.A0U.A02();
        if (this.A06.A05()) {
            AnonymousClass3MI.A00(getApplicationContext(), this.A09, this.A04);
            this.A06.A02();
            throw AnonymousClass001.A0A("getSmbEulaLayoutId");
        }
        if (((AnonymousClass3D0) this.A0b.get()).A01() != null && AnonymousClass3D0.A00(this.A0b).A02) {
            AnonymousClass6OK r1 = this.A0G;
            AnonymousClass00C.A0D(r1, 1);
            if (AnonymousClass3LX.A00(this) || AnonymousClass3LX.A01(this, r1)) {
                AnonymousClass66E r2 = AnonymousClass3D0.A00(this.A0b).A04;
                if (r2.A00) {
                    r2.A01.markerDrop(551497305);
                    r2.A00 = false;
                }
                r2.A00 = true;
                C21430zE r22 = r2.A01;
                r22.BPO(551497305, true);
                r22.markerAnnotate(551497305, "is_debug_build", false);
                C29501Ww.A02(this.A0R, 1, true);
                C18740tg.A06(((AnonymousClass3D0) this.A0b.get()).A01());
                Intent A0D2 = C36431kI.A0D();
                A0D2.setClassName(getPackageName(), "com.whatsapp.bridge.wfs.ui.LinkedUsersActivity");
                startActivity(A0D2);
                finish();
                return;
            }
        }
        C18820ts r0 = this.A0D;
        r0.A09.add(this.A0f);
        if (C36331k8.A06(this).getBoolean("is_ls_shown_during_reg", false) || this.A0c) {
            setContentView((int) R.layout.f9nameremoved);
            findViewById(R.id.eula_layout).startAnimation(AnimationUtils.loadAnimation(getBaseContext(), R.anim.f1nameremoved));
            A01(this);
            C65983Uf.A0M(this.A00, this, this.A0D, R.id.eula_toolbar, false, this.A0c, false);
            A07(this);
        } else {
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass3GZ r23 = this.A0J;
            r23.A03 = true;
            r23.A00 = System.currentTimeMillis();
            ImageView A0Q2 = C36411kG.A0Q(this, R.id.next_button);
            C36321k7.A0L(this, A0Q2, this.A0D, R.drawable.ic_fab_next);
            C48762i0.A00(A0Q2, this, 16);
            BottomSheetListView bottomSheetListView = (BottomSheetListView) findViewById(R.id.language_selector_listview);
            C18820ts r3 = this.A0D;
            bottomSheetListView.setAdapter(new C37851nJ(this, r3, AnonymousClass3SY.A01(this.A02, this.A08, r3, this.A0X), AnonymousClass3SY.A03()));
            bottomSheetListView.setOnItemClickListener(new AnonymousClass4YC(bottomSheetListView, this, 3));
            bottomSheetListView.setOnScrollListener(new C67273Ze(bottomSheetListView, this));
            ImageView A0Q3 = C36411kG.A0Q(this, R.id.eula_logo);
            LayerDrawable layerDrawable = (LayerDrawable) A0Q3.getDrawable();
            layerDrawable.setDrawableByLayerId(R.id.logo, AnonymousClass3UF.A06(getResources(), layerDrawable.findDrawableByLayerId(R.id.logo), C224314h.A01(this, R.attr.f4nameremoved)));
            A0Q3.setImageDrawable(layerDrawable);
        }
        boolean z = this.A0c;
        if (z) {
            C65983Uf.A0M(this.A00, this, this.A0D, R.id.eula_toolbar, false, z, false);
            C36391kE.A0Q(this, R.id.title).setText(R.string.f12nameremoved);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
        r2.A0e(new X.AnonymousClass4XV(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c8, code lost:
        X.C39001qm.A0C(r2, r6, r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r7) {
        /*
            r6 = this;
            r4 = 1
            if (r7 == r4) goto L_0x00e2
            r0 = 2
            if (r7 == r0) goto L_0x00cc
            r5 = 0
            switch(r7) {
                case 5: goto L_0x000f;
                case 6: goto L_0x0065;
                case 7: goto L_0x0088;
                case 8: goto L_0x00a6;
                case 9: goto L_0x00f2;
                default: goto L_0x000a;
            }
        L_0x000a:
            android.app.Dialog r0 = super.onCreateDialog(r7)
            return r0
        L_0x000f:
            X.1bO r0 = r6.A0Y
            if (r0 == 0) goto L_0x0045
            java.util.Set r0 = r0.A00
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            X.1bO r0 = r6.A0Y
            java.util.Set r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.3GA r1 = (X.AnonymousClass3GA) r1
            r0 = 9
            r3.append(r0)
            java.lang.CharSequence r0 = r1.A00
            r3.append(r0)
            r0 = 10
            r3.append(r0)
            goto L_0x0029
        L_0x0045:
            java.lang.String r1 = ""
            goto L_0x0054
        L_0x0048:
            int r0 = r3.length()
            int r0 = r0 - r4
            r3.setLength(r0)
            java.lang.String r1 = r3.toString()
        L_0x0054:
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r0 = 2131894894(0x7f12226e, float:1.9424606E38)
            java.lang.String r0 = X.C36351kA.A0w(r6, r1, r4, r0)
            r2.A0p(r0)
            r1 = 16
            goto L_0x009d
        L_0x0065:
            r6.A01 = r4
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r0 = 2131886460(0x7f12017c, float:1.94075E38)
            r2.A0d(r0)
            r0 = 2131894893(0x7f12226d, float:1.9424604E38)
            r2.A0c(r0)
            r2.A0r(r5)
            r1 = 2131888825(0x7f120ab9, float:1.9412296E38)
            r0 = 13
            X.C39001qm.A0D(r2, r6, r0, r1)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 14
            goto L_0x00c8
        L_0x0088:
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r3 = 2131888600(0x7f1209d8, float:1.941184E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r0 = X.C36341k9.A0e(r6, r1, r0, r5, r3)
            r2.A0p(r0)
            r1 = 17
        L_0x009d:
            X.4XV r0 = new X.4XV
            r0.<init>(r6, r1)
            r2.A0e(r0)
            goto L_0x010a
        L_0x00a6:
            r6.A01 = r0
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r0 = 2131886460(0x7f12017c, float:1.94075E38)
            r2.A0d(r0)
            r0 = 2131888599(0x7f1209d7, float:1.9411838E38)
            r2.A0c(r0)
            r2.A0r(r5)
            r1 = 2131888825(0x7f120ab9, float:1.9412296E38)
            r0 = 15
            X.C39001qm.A0D(r2, r6, r0, r1)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 16
        L_0x00c8:
            X.C39001qm.A0C(r2, r6, r0, r1)
            goto L_0x010a
        L_0x00cc:
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r0 = 2131886460(0x7f12017c, float:1.94075E38)
            r2.A0d(r0)
            r0 = 2131893494(0x7f121cf6, float:1.9421766E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 12
            goto L_0x0107
        L_0x00e2:
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r0 = 2131893403(0x7f121c9b, float:1.9421582E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 11
            goto L_0x0107
        L_0x00f2:
            X.1qm r2 = X.AnonymousClass3LW.A00(r6)
            r0 = 2131886460(0x7f12017c, float:1.94075E38)
            r2.A0d(r0)
            r0 = 2131887910(0x7f120726, float:1.941044E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 10
        L_0x0107:
            X.C39001qm.A0D(r2, r6, r0, r1)
        L_0x010a:
            X.0FM r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.onCreateDialog(int):android.app.Dialog");
    }

    private boolean A0F(String str) {
        if (this.A0G.A02(7228) && "CA".equalsIgnoreCase(str)) {
            String A062 = this.A0D.A06();
            List list = C64123Ms.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0C2 = AnonymousClass001.A0C(it);
                    if (A0C2 != null && A0C2.equalsIgnoreCase(A062)) {
                        return true;
                    }
                }
            }
        }
        List list2 = C129886Iv.A01;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String A0C3 = AnonymousClass001.A0C(it2);
            if (A0C3 == null) {
                if (str == null) {
                }
            } else if (A0C3.equalsIgnoreCase(str)) {
            }
            String A063 = this.A0D.A06();
            List list3 = C64123Ms.A01;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                return false;
            }
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                String A0C4 = AnonymousClass001.A0C(it3);
                if (A0C4 != null && A0C4.equalsIgnoreCase(A063)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void A2F() {
        if (!this.A0e) {
            this.A0e = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            C19470v6 r4 = C19470v6.A00;
            this.A05 = r4;
            this.A0a = (C129886Iv) r2.AGe.get();
            this.A0N = (C64123Ms) r1.A7D.get();
            this.A08 = C36401kF.A0N(r2);
            this.A06 = r4;
            this.A07 = r4;
            this.A0Z = (C31161bN) r2.A8Y.get();
            this.A0W = C36431kI.A0u(r1);
            this.A04 = C36391kE.A0S(r2);
            this.A0G = (AnonymousClass6OK) r2.A9r.get();
            this.A0K = C36401kF.A0c(r2);
            this.A0X = C36351kA.A0q(r2);
            this.A0D = C36341k9.A0T(r2);
            this.A0A = C36351kA.A0R(r2);
            this.A0M = (C29341Wg) r2.A8q.get();
            this.A09 = (C29411Wn) r2.A9H.get();
            this.A0P = C27111My.A38(A0L2);
            this.A0L = C36371kC.A0g(r2);
            this.A0R = C36401kF.A0d(r2);
            this.A0C = C36351kA.A0X(r2);
            this.A0H = (C65283Rl) r2.AG9.get();
            this.A0F = new C201419jW();
            this.A0S = C36391kE.A0o(r2);
            this.A0T = (AnonymousClass1QE) r2.AFr.get();
            this.A0O = (AnonymousClass3KB) r1.AAz.get();
            this.A0I = (AnonymousClass9XW) r2.AYZ.get();
            this.A0V = C27111My.A3B(A0L2);
            this.A0Q = C36431kI.A0t(r2);
            this.A0E = C27111My.A22(A0L2);
            this.A0B = (C27651Pc) r2.A1w.get();
            this.A0U = (AnonymousClass1QD) r2.A4G.get();
            this.A0J = (AnonymousClass3GZ) r1.A9O.get();
            this.A0b = C18840tu.A00(r1.A4M);
        }
    }

    public C37851nJ B8G() {
        C18820ts r3 = this.A0D;
        return new C37851nJ(this, r3, AnonymousClass3SY.A01(this.A02, this.A08, r3, this.A0X), AnonymousClass3SY.A03());
    }

    public void onBackPressed() {
        if (this.A0c) {
            Log.i("EULA/onBackPressed/is adding new account");
            C65983Uf.A0F(this, this.A0A, this.A09, this.A0A);
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        this.A0P.A00();
        C18820ts r0 = this.A0D;
        r0.A09.remove(this.A0f);
        super.onDestroy();
    }

    public void onPause() {
        C201419jW r2 = this.A0F;
        C207739wu r1 = this.A0E;
        AnonymousClass00C.A0D(r1, 0);
        r2.A00.remove(r1);
        this.A0F.A00();
        super.onPause();
    }

    public EULA(int i) {
        this.A0e = false;
        C89354Wf.A00(this, 42);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r7 != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.whatsapp.registration.EULA r21) {
        /*
            r0 = 2131430030(0x7f0b0a8e, float:1.848175E38)
            r12 = r21
            android.view.View r11 = r12.findViewById(r0)
            r0 = 2131430033(0x7f0b0a91, float:1.8481756E38)
            android.view.View r0 = r12.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r12.A03 = r0
            X.0v0 r0 = r12.A09
            r0.A0v()
            X.0wx r0 = r12.A08
            r5 = 10000000(0x989680, double:4.9406565E-317)
            long r1 = r0.A02()
            r4 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0034
            android.content.Intent r1 = X.AnonymousClass190.A0M(r12, r5)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r12.startActivity(r0)
        L_0x0034:
            int r0 = X.C36441kJ.A08(r12)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EULA/create/wrong-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.C36351kA.A12(r12)
            return
        L_0x0043:
            X.0wU r1 = r12.A04
            X.2iU r0 = new X.2iU
            r0.<init>(r12)
            X.C36391kE.A1Q(r0, r1)
            X.0yb r0 = r12.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            if (r0 == 0) goto L_0x01f0
            java.lang.String r5 = r0.getSimCountryIso()
        L_0x0059:
            java.lang.String r0 = "gb"
            boolean r7 = r0.equalsIgnoreCase(r5)
            java.util.List r0 = X.C129886Iv.A00
            boolean r3 = X.C007103b.A0j(r0, r5)
            if (r3 != 0) goto L_0x006a
            r10 = 0
            if (r7 == 0) goto L_0x006b
        L_0x006a:
            r10 = 1
        L_0x006b:
            boolean r9 = r12.A0F(r5)
            r0 = 2131889352(0x7f120cc8, float:1.9413365E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 1
            if (r10 == 0) goto L_0x01dc
            r0 = 2131889355(0x7f120ccb, float:1.9413371E38)
        L_0x007c:
            java.lang.String r20 = X.C36351kA.A0w(r12, r2, r1, r0)
        L_0x0080:
            r0 = 2131889353(0x7f120cc9, float:1.9413367E38)
            java.lang.String r18 = r12.getString(r0)
            r0 = 2131430036(0x7f0b0a94, float:1.8481762E38)
            com.whatsapp.TextEmojiLabel r5 = X.C36441kJ.A0e(r12, r0)
            r0 = 2131430032(0x7f0b0a90, float:1.8481754E38)
            com.whatsapp.TextEmojiLabel r15 = X.C36421kH.A0I(r12, r0)
            java.util.HashMap r6 = X.AnonymousClass001.A0J()
            X.1N3 r2 = r12.A04
            X.6OK r0 = r12.A0G
            r8 = 7519(0x1d5f, float:1.0536E-41)
            boolean r1 = r0.A02(r8)
            java.lang.String r0 = "https://www.whatsapp.com/legal/privacy-policy"
            android.net.Uri r1 = r2.A01(r0, r7, r3, r1)
            java.lang.String r0 = "privacy-policy"
            r6.put(r0, r1)
            X.1N3 r2 = r12.A04
            java.lang.String r1 = "https://www.whatsapp.com/legal/terms-of-service"
            X.6OK r0 = r12.A0G
            boolean r0 = r0.A02(r8)
            android.net.Uri r1 = r2.A01(r1, r7, r3, r0)
            java.lang.String r0 = "terms-and-privacy-policy"
            r6.put(r0, r1)
            if (r9 == 0) goto L_0x00e9
            if (r15 == 0) goto L_0x00e9
            X.1N3 r1 = r12.A04
            java.lang.String r0 = "https://faq.whatsapp.com/227626810186044"
            android.net.Uri r1 = r1.A01(r0, r4, r4, r4)
            java.lang.String r0 = "manage-data"
            r6.put(r0, r1)
            X.0yC r1 = r12.A0D
            X.17Y r14 = r12.A05
            X.1Dv r13 = r12.A01
            X.0yb r0 = r12.A08
            r19 = r6
            r16 = r0
            r17 = r1
            X.AnonymousClass6YV.A0G(r12, r13, r14, r15, r16, r17, r18, r19)
            r15.setVisibility(r4)
            r15.setHighlightColor(r4)
        L_0x00e9:
            if (r10 == 0) goto L_0x00f8
            X.1N3 r1 = r12.A04
            java.lang.String r0 = "https://www.whatsapp.com/legal/information-for-people-who-dont-use-whatsapp"
            android.net.Uri r1 = r1.A00(r0)
            java.lang.String r0 = "learn-more"
            r6.put(r0, r1)
        L_0x00f8:
            X.0yC r3 = r12.A0D
            X.17Y r2 = r12.A05
            X.1Dv r1 = r12.A01
            X.0yb r0 = r12.A08
            r14 = r12
            r15 = r1
            r16 = r2
            r17 = r5
            r18 = r0
            r19 = r3
            r21 = r6
            X.AnonymousClass6YV.A0G(r14, r15, r16, r17, r18, r19, r20, r21)
            r5.setHighlightColor(r4)
            if (r10 == 0) goto L_0x0122
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168102(0x7f070b66, float:1.7950496E38)
            float r0 = r1.getDimension(r0)
            r5.setTextSize(r4, r0)
        L_0x0122:
            if (r9 == 0) goto L_0x012b
            X.0wU r1 = r12.A04
            r0 = 8
            X.C81143wX.A01(r1, r12, r0)
        L_0x012b:
            android.view.WindowManager r0 = r12.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = r0.getHeight()
            int r1 = X.C36341k9.A04(r12)
            r0 = 1
            if (r1 != r0) goto L_0x0165
            r0 = 2131430031(0x7f0b0a8f, float:1.8481751E38)
            android.view.View r6 = r12.findViewById(r0)
            int r5 = r2 / 10
            if (r6 == 0) goto L_0x0159
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass000.A0a(r6)
            int r2 = r3.leftMargin
            int r1 = r3.rightMargin
            int r0 = r3.bottomMargin
            r3.setMargins(r2, r5, r1, r0)
            r6.setLayoutParams(r3)
        L_0x0159:
            androidx.core.widget.NestedScrollView r2 = r12.A03
            if (r2 == 0) goto L_0x0165
            r1 = 1
            X.4Y3 r0 = new X.4Y3
            r0.<init>(r12, r1)
            r2.A0A = r0
        L_0x0165:
            androidx.core.widget.NestedScrollView r0 = r12.A03
            if (r0 == 0) goto L_0x0172
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 28
            X.C90104Zc.A00(r1, r12, r0)
        L_0x0172:
            r0 = 2131430028(0x7f0b0a8c, float:1.8481745E38)
            android.view.View r1 = X.C03570Gk.A0B(r12, r0)
            r0 = 19
            X.AnonymousClass3Y6.A00(r1, r12, r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "show_registration_first_dlg"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x018e
            r0 = 1
            X.AnonymousClass3SJ.A01(r12, r0)
        L_0x018e:
            X.1Ww r1 = r12.A0R
            r0 = 1
            X.C29501Ww.A02(r1, r4, r0)
            X.0z5 r0 = r12.A08
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = "EULA/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0y3 r1 = r12.A0K
            X.1Si r0 = r12.A0L
            X.AnonymousClass3SK.A02(r12, r1, r0)
        L_0x01a8:
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r12)
            java.lang.String r0 = "input_enter_send"
            X.C36331k8.A0w(r1, r0, r4)
            r0 = 2131430031(0x7f0b0a8f, float:1.8481751E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A02 = r0
            if (r11 == 0) goto L_0x01c5
            android.view.ViewTreeObserver r1 = r11.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r12.A00
            r1.addOnGlobalLayoutListener(r0)
        L_0x01c5:
            X.1Wn r0 = r12.A09
            r0.A02()
            android.content.SharedPreferences r0 = X.C36331k8.A06(r12)
            java.lang.String r3 = "is_eula_loaded_once"
            boolean r0 = r0.getBoolean(r3, r4)
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = "EULA/retrieveBackupToken/EULA was already loaded before, skip retrieving token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01dc:
            boolean r0 = r12.A0F(r5)
            if (r0 == 0) goto L_0x01eb
            r0 = 2131889356(0x7f120ccc, float:1.9413373E38)
            java.lang.String r20 = r12.getString(r0)
            goto L_0x0080
        L_0x01eb:
            r0 = 2131889354(0x7f120cca, float:1.941337E38)
            goto L_0x007c
        L_0x01f0:
            r5 = 0
            goto L_0x0059
        L_0x01f3:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0212
            int r0 = X.C34201gc.A00(r12)
            if (r0 != 0) goto L_0x0212
            X.0JI r2 = new X.0JI
            r2.<init>((android.app.Activity) r12)
        L_0x0204:
            X.0wU r1 = r12.A04
            r0 = 20
            X.C80313vC.A01(r1, r12, r2, r0)
            X.0v0 r1 = r12.A09
            r0 = 1
            X.C36331k8.A18(r1, r3, r0)
            return
        L_0x0212:
            r2 = 0
            goto L_0x0204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.A01(com.whatsapp.registration.EULA):void");
    }

    public static void A07(EULA eula) {
        TextView A0Q2 = C36391kE.A0Q(eula, R.id.language_picker);
        A0Q2.setText(AnonymousClass3SY.A00(AnonymousClass9ZR.A01(Locale.getDefault())));
        A0Q2.setOnClickListener(new C48902iF(eula, A0Q2, 23));
        AnonymousClass3UF.A0F(A0Q2, eula.getResources().getColor(C224514j.A00(eula, R.attr.f4nameremoved, R.color.f6nameremoved)));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0S.A02("eula");
            this.A0P.A01(this, this.A0S, "eula");
            return true;
        } else if (itemId == 1) {
            C18750th.A09(this);
            return true;
        } else if (itemId != 2) {
            return false;
        } else {
            C36331k8.A0w(C36421kH.A0A(this), "is_ls_shown_during_reg", false);
            recreate();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        int i = this.A01;
        int i2 = 6;
        if (i != 1) {
            if (i == 2) {
                i2 = 8;
            }
            this.A0F.A02(this.A0E);
            this.A0F.A01(this);
        }
        AnonymousClass3SJ.A01(this, i2);
        this.A0F.A02(this.A0E);
        this.A0F.A01(this);
    }

    public EULA() {
        this(0);
        this.A01 = 0;
        this.A02 = null;
        this.A0c = false;
        this.A00 = new C90104Zc(this, 27);
        this.A0f = new C89734Xr(this, 0);
    }
}
