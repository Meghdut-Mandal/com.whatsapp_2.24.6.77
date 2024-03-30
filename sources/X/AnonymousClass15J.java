package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.HomeActivity;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Collections;
import java.util.List;

/* renamed from: X.15J  reason: invalid class name */
public abstract class AnonymousClass15J extends AnonymousClass15H implements AnonymousClass15I {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public AnonymousClass1R8 A03;
    public PagerSlidingTabStrip A04;
    public C25841Hw A05;
    public AnonymousClass1NA A06;
    public C225915a A07 = C225915a.UNDEFINED;
    public AnonymousClass1NB A08;
    public C19650wI A09;
    public AnonymousClass13J A0A;
    public AnonymousClass1RJ A0B;
    public AnonymousClass1RJ A0C;
    public boolean A0D;
    public final AnonymousClass026 A0E = new C36101jl(this, 2);

    public AnonymousClass1RK A3o() {
        HomeActivity homeActivity = (HomeActivity) this;
        C31921ce A0M = HomeActivity.A0M(homeActivity, HomeActivity.A0G(homeActivity.A03));
        if (A0M instanceof AnonymousClass1RK) {
            return (AnonymousClass1RK) A0M;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r3.hasMessages(0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r3.sendEmptyMessageDelayed(0, 250);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3q() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.0yC r2 = r4.A0D
            r1 = 4286(0x10be, float:6.006E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            monitor-enter(r4)
            if (r0 != 0) goto L_0x0030
            X.0wk r2 = r4.A19     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x001e
            X.0wU r1 = r4.A04     // Catch:{ all -> 0x0058 }
            r0 = 0
            X.0wk r2 = new X.0wk     // Catch:{ all -> 0x0058 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0058 }
            r4.A19 = r2     // Catch:{ all -> 0x0058 }
        L_0x001e:
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0058 }
            monitor-exit(r4)
            r2.A02()
            r1 = 30
            X.1j1 r0 = new X.1j1
            r0.<init>((com.whatsapp.HomeActivity) r4, (int) r1)
            r2.execute(r0)
            return
        L_0x0030:
            android.os.Handler r3 = r4.A0C     // Catch:{ all -> 0x0058 }
            if (r3 != 0) goto L_0x0047
            X.19W r0 = r4.A1D     // Catch:{ all -> 0x0058 }
            android.os.Looper r2 = r0.A00()     // Catch:{ all -> 0x0058 }
            r1 = 0
            X.1jk r0 = new X.1jk     // Catch:{ all -> 0x0058 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0058 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0058 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0058 }
            r4.A0C = r3     // Catch:{ all -> 0x0058 }
        L_0x0047:
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x0058 }
            monitor-exit(r4)
            r2 = 0
            boolean r0 = r3.hasMessages(r2)
            if (r0 != 0) goto L_0x0057
            r0 = 250(0xfa, double:1.235E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
        L_0x0057:
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15J.A3q():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (X.C222013h.A0A == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r1.length() == 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r1 = r3.getString(com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r2.A0Q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r0 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r3.A07 == X.C225915a.A03) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3r() {
        /*
            r6 = this;
            r3 = r6
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.07B r2 = r3.getSupportActionBar()
            if (r2 == 0) goto L_0x0056
            r1 = 8
            r3.A05 = r1
            android.view.ViewGroup r0 = r3.A0J
            if (r0 == 0) goto L_0x0014
            r0.setVisibility(r1)
        L_0x0014:
            com.whatsapp.WaTextView r0 = r3.A0l
            if (r0 == 0) goto L_0x001b
            r0.setVisibility(r1)
        L_0x001b:
            int r5 = r3.A03
            r4 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.C222013h.A05
            if (r0 == 0) goto L_0x0028
            boolean r1 = X.C222013h.A0A
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r5 == r4) goto L_0x0057
            if (r0 == 0) goto L_0x005d
            X.15a r1 = r3.A07
            X.15a r0 = X.C225915a.BOTTOM
            if (r1 == r0) goto L_0x0037
            X.15a r0 = X.C225915a.RAIL
            if (r1 != r0) goto L_0x0059
        L_0x0037:
            androidx.appcompat.widget.Toolbar r0 = r3.A0M
            com.whatsapp.wds.components.topbar.WDSToolbar r0 = (com.whatsapp.wds.components.topbar.WDSToolbar) r0
            r0.A0K()
        L_0x003e:
            X.1RF r1 = r3.A0j
            int r0 = r3.A03
            java.lang.String r1 = r1.A0N(r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0053
        L_0x004c:
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x0053:
            r2.A0Q(r1)
        L_0x0056:
            return
        L_0x0057:
            if (r0 == 0) goto L_0x005d
        L_0x0059:
            com.whatsapp.HomeActivity.A0u(r2, r3)
            return
        L_0x005d:
            X.15a r1 = r3.A07
            X.15a r0 = X.C225915a.RAIL
            if (r1 != r0) goto L_0x004c
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15J.A3r():void");
    }

    public final View A3n() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        AnonymousClass00C.A0G("rootView");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass1NB A3p() {
        AnonymousClass1NB r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("navBarHelper");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3s() {
        /*
            r15 = this;
            X.15a r3 = r15.A07
            int r1 = r3.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x027c
            r0 = 3
            if (r1 == r0) goto L_0x0273
            X.15a r0 = X.C225915a.BOTTOM
        L_0x000e:
            r15.A3t(r0)
            X.15a r0 = X.C225915a.RAIL
        L_0x0013:
            r15.A3t(r0)
            int r0 = r3.ordinal()
            r6 = 2
            if (r0 == r6) goto L_0x0218
            r1 = 3
            if (r0 == r1) goto L_0x01ae
            android.view.View r2 = r15.A3n()
            r1 = 2131434798(0x7f0b1d2e, float:1.849142E38)
            android.view.View r1 = X.C012005e.A02(r2, r1)
            com.whatsapp.PagerSlidingTabStrip r1 = (com.whatsapp.PagerSlidingTabStrip) r1
            r15.A04 = r1
            boolean r1 = X.C222013h.A05
            if (r1 == 0) goto L_0x0048
            r2 = 2130971215(0x7f040a4f, float:1.7551162E38)
            r1 = 2131102777(0x7f060c39, float:1.7818002E38)
            int r1 = X.C224514j.A00(r15, r2, r1)
            int r2 = X.AnonymousClass00F.A00(r15, r1)
            com.whatsapp.PagerSlidingTabStrip r1 = r15.A04
            if (r1 == 0) goto L_0x0048
            r1.setUnderlineColor(r2)
        L_0x0048:
            X.1RK r4 = r15.A3o()
            if (r4 == 0) goto L_0x0058
            X.1R8 r2 = r15.A03
            if (r2 == 0) goto L_0x02c1
            r1 = 1
            r2.A03 = r1
            X.AnonymousClass1R8.A02(r4, r2)
        L_0x0058:
            X.15a r1 = X.C225915a.RAIL
            if (r3 != r1) goto L_0x0171
            X.1NB r1 = r15.A3p()
            X.07V r2 = r1.A01
            java.lang.String r1 = "null cannot be cast to non-null type com.google.android.material.navigationrail.NavigationRailView"
            X.AnonymousClass00C.A0E(r2, r1)
            com.google.android.material.navigationrail.NavigationRailView r2 = (com.google.android.material.navigationrail.NavigationRailView) r2
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x009d
            X.0wo r9 = r15.A07
            X.0yC r12 = r15.A0D
            X.0ts r11 = r15.A00
            X.1NA r13 = r15.A06
            if (r13 == 0) goto L_0x029a
            X.0wI r14 = r15.A09
            if (r14 == 0) goto L_0x028d
            X.0v0 r10 = r15.A09
            r1 = 2131430724(0x7f0b0d44, float:1.8483157E38)
            android.view.View r6 = r15.findViewById(r1)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 2131430725(0x7f0b0d45, float:1.848316E38)
            android.view.View r7 = r15.findViewById(r1)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5 = 0
            X.1R8 r4 = new X.1R8
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r4.A00 = r1
            r4.A02 = r3
            r15.A03 = r4
        L_0x009d:
            X.1RK r3 = r15.A3o()
            if (r3 == 0) goto L_0x00ad
            X.1R8 r2 = r15.A03
            if (r2 == 0) goto L_0x0280
            r1 = 0
            r2.A03 = r1
            X.AnonymousClass1R8.A02(r3, r2)
        L_0x00ad:
            r2 = r15
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            r1 = 3
            if (r0 == r1) goto L_0x00df
            r1 = 2
            if (r0 == r1) goto L_0x00df
            com.whatsapp.PagerSlidingTabStrip r4 = r2.A04
            if (r4 == 0) goto L_0x00db
            r3 = 0
            r4.setVisibility(r3)
            X.C011504z.A06(r4, r1)
            X.AnonymousClass04F.A05(r4, r3)
            com.whatsapp.HomeActivity$TabsPager r0 = r2.A0i
            r4.setViewPager(r0)
            X.15h r0 = r2.A2L
            r4.A03 = r0
            java.util.List r0 = com.whatsapp.HomeActivity.A2Y
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x00d8
            r3 = 8
        L_0x00d8:
            r4.setVisibility(r3)
        L_0x00db:
            r15.A3r()
            return
        L_0x00df:
            X.1NB r0 = r2.A08
            X.07V r3 = r0.A01
            android.view.View r0 = r2.A00
            if (r3 == 0) goto L_0x00db
            if (r0 == 0) goto L_0x00db
            X.07b r5 = r3.A03
            boolean r0 = r5.hasVisibleItems()
            if (r0 != 0) goto L_0x0153
            java.util.List r0 = com.whatsapp.HomeActivity.A2Y
            java.util.Iterator r8 = r0.iterator()
        L_0x00f7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r1 = r8.next()
            java.lang.Number r1 = (java.lang.Number) r1
            X.1RF r0 = r2.A0j
            int r7 = r1.intValue()
            java.lang.String r1 = r0.A0N(r7)
            r0 = 0
            android.view.MenuItem r4 = r5.add((int) r0, (int) r7, (int) r0, (java.lang.CharSequence) r1)
            X.1NB r6 = r2.A08
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 2131231738(0x7f0803fa, float:1.8079565E38)
            if (r7 == r0) goto L_0x0134
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 == r0) goto L_0x0142
            r0 = 400(0x190, float:5.6E-43)
            r1 = 2131231736(0x7f0803f8, float:1.8079561E38)
            if (r7 == r0) goto L_0x0134
            r0 = 600(0x258, float:8.41E-43)
            r1 = 2131231739(0x7f0803fb, float:1.8079568E38)
            if (r7 == r0) goto L_0x0134
            r0 = 700(0x2bc, float:9.81E-43)
            if (r7 != r0) goto L_0x00f7
            r1 = 2131231735(0x7f0803f7, float:1.807956E38)
        L_0x0134:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00f7
            int r0 = r0.intValue()
            r4.setIcon(r0)
            goto L_0x00f7
        L_0x0142:
            X.1GQ r1 = r6.A06
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = X.AnonymousClass1GQ.A01(r1, r0)
            r1 = 2131231740(0x7f0803fc, float:1.807957E38)
            if (r0 == 0) goto L_0x0134
            r1 = 2131231741(0x7f0803fd, float:1.8079572E38)
            goto L_0x0134
        L_0x0153:
            X.02I r0 = r2.A2K
            r3.A01 = r0
            X.02L r0 = r2.A2J
            r3.A00 = r0
            r0 = 0
            com.whatsapp.HomeActivity.A12(r2, r0)
            com.whatsapp.HomeActivity$TabsPager r0 = r2.A0i
            java.util.List r0 = r0.A0E
            if (r0 == 0) goto L_0x0168
            r0.clear()
        L_0x0168:
            com.whatsapp.HomeActivity$TabsPager r1 = r2.A0i
            X.15h r0 = r2.A2L
            r1.A0K(r0)
            goto L_0x00db
        L_0x0171:
            X.0wo r6 = r15.A07
            X.0yC r9 = r15.A0D
            X.0ts r8 = r15.A00
            X.1NA r10 = r15.A06
            if (r10 == 0) goto L_0x02b4
            X.0wI r11 = r15.A09
            if (r11 == 0) goto L_0x02a7
            X.0v0 r7 = r15.A09
            r1 = 2131430217(0x7f0b0b49, float:1.8482129E38)
            android.view.View r3 = r15.findViewById(r1)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1 = 2131430219(0x7f0b0b4b, float:1.8482133E38)
            android.view.View r4 = r15.findViewById(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 2131430218(0x7f0b0b4a, float:1.848213E38)
            android.view.View r5 = r15.findViewById(r1)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 2131430221(0x7f0b0b4d, float:1.8482137E38)
            android.view.View r2 = r15.findViewById(r1)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            X.1R8 r1 = new X.1R8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.A03 = r1
            goto L_0x009d
        L_0x01ae:
            X.1RJ r2 = r15.A0C
            if (r2 != 0) goto L_0x01c2
            android.view.View r2 = r15.A3n()
            r1 = 2131431891(0x7f0b11d3, float:1.8485524E38)
            android.view.View r1 = X.C012005e.A02(r2, r1)
            X.1RJ r2 = new X.1RJ
            r2.<init>(r1)
        L_0x01c2:
            r15.A0C = r2
            android.view.View r1 = r2.A01()
            r15.A00 = r1
            android.view.View r2 = r2.A01()
            r1 = 2131431879(0x7f0b11c7, float:1.84855E38)
            android.view.View r7 = X.C012005e.A02(r2, r1)
            X.AnonymousClass00C.A08(r7)
            com.google.android.material.navigationrail.NavigationRailView r7 = (com.google.android.material.navigationrail.NavigationRailView) r7
            X.1NB r5 = r15.A3p()
            r1 = 0
            X.AnonymousClass00C.A0D(r7, r1)
            r5.A01 = r7
            android.view.ViewGroup r4 = r15.A02
            if (r4 != 0) goto L_0x01f5
            java.lang.String r0 = "mainContainer"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01f5:
            android.view.View r2 = r15.A00
            X.056 r1 = r5.A04
            X.AnonymousClass00C.A0D(r1, r6)
            if (r2 == 0) goto L_0x0207
            r1.A09(r2)
            r1.A08(r2)
            X.C018607y.A02(r4, r1)
        L_0x0207:
            android.view.View r1 = r7.A00
            if (r1 != 0) goto L_0x0048
            r2 = 2131625149(0x7f0e04bd, float:1.8877498E38)
            r1 = 0
            android.view.View r1 = android.view.View.inflate(r15, r2, r1)
            r7.A01(r1)
            goto L_0x0048
        L_0x0218:
            X.1RJ r2 = r15.A0B
            if (r2 != 0) goto L_0x022c
            android.view.View r2 = r15.A3n()
            r1 = 2131428165(0x7f0b0345, float:1.8477967E38)
            android.view.View r1 = X.C012005e.A02(r2, r1)
            X.1RJ r2 = new X.1RJ
            r2.<init>(r1)
        L_0x022c:
            r15.A0B = r2
            android.view.View r1 = r2.A01()
            r15.A00 = r1
            android.view.View r2 = r2.A01()
            r1 = 2131428160(0x7f0b0340, float:1.8477957E38)
            android.view.View r2 = X.C012005e.A02(r2, r1)
            X.AnonymousClass00C.A08(r2)
            X.07V r2 = (X.AnonymousClass07V) r2
            X.1NB r5 = r15.A3p()
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            r5.A01 = r2
            android.view.ViewGroup r4 = r15.A02
            if (r4 != 0) goto L_0x025f
            java.lang.String r0 = "mainContainer"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x025f:
            android.view.View r2 = r15.A00
            X.056 r1 = r5.A03
            X.AnonymousClass00C.A0D(r1, r6)
            if (r2 == 0) goto L_0x0048
            r1.A09(r2)
            r1.A08(r2)
            X.C018607y.A02(r4, r1)
            goto L_0x0048
        L_0x0273:
            X.15a r0 = X.C225915a.TAB
            r15.A3t(r0)
            X.15a r0 = X.C225915a.BOTTOM
            goto L_0x0013
        L_0x027c:
            X.15a r0 = X.C225915a.TAB
            goto L_0x000e
        L_0x0280:
            java.lang.String r0 = "homeFabManager"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x028d:
            java.lang.String r0 = "mainThreadHandler"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x029a:
            java.lang.String r0 = "bottomNavHelper"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            java.lang.String r0 = "mainThreadHandler"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02b4:
            java.lang.String r0 = "bottomNavHelper"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02c1:
            java.lang.String r0 = "homeFabManager"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15J.A3s():void");
    }

    public static final boolean A01(AnonymousClass15J r3) {
        C225915a r1;
        int i;
        int i2;
        if (r3.A3p().A08) {
            C25841Hw r0 = r3.A05;
            if (r0 != null) {
                if (!r0.A01()) {
                    if (r3.A07.A08() && r3.A0D) {
                        i = VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT;
                        i2 = 600;
                    } else if (r3.A07.A09()) {
                        i = VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT;
                        i2 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
                    }
                    if (AnonymousClass1R1.A05(r3, new C62263Fl(i2).A00, i)) {
                        r1 = C225915a.RAIL;
                    }
                }
                r1 = C225915a.BOTTOM;
            } else {
                AnonymousClass00C.A0G("deviceUtils");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            if (!r3.A3p().A07) {
                r1 = C225915a.TAB;
            }
            r1 = C225915a.BOTTOM;
        }
        if (r3.A07 == r1) {
            return false;
        }
        r3.A07 = r1;
        return true;
    }

    public void A3t(C225915a r4) {
        View view;
        int ordinal = r4.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            view = this.A00;
        } else {
            view = this.A04;
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HomeActivity homeActivity = (HomeActivity) this;
        List list = HomeActivity.A2Y;
        list.clear();
        if (homeActivity.A18.A01()) {
            list.add(600);
        }
        list.add(200);
        list.add(300);
        int i = 400;
        if (C20800yB.A01(C21000yV.A02, ((AnonymousClass1QW) homeActivity.A1W.get()).A03, 2358)) {
            i = 800;
        }
        list.add(Integer.valueOf(i));
        Collections.sort(list, new AnonymousClass1QX(homeActivity));
        if (!homeActivity.A3p().A07 && !(!C18820ts.A00(homeActivity.A00).A06)) {
            Collections.reverse(list);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        boolean z = A3p().A07;
        int i2 = R.layout.f9nameremoved;
        if (z) {
            i2 = R.layout.f9nameremoved;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null, false);
        AnonymousClass00C.A08(inflate);
        this.A01 = inflate;
        setContentView(A3n());
        View findViewById = A3n().findViewById(R.id.main_container);
        AnonymousClass00C.A08(findViewById);
        this.A02 = (ViewGroup) findViewById;
        this.A04 = A3n();
        this.A00 = R.id.conversation_view_host;
        this.A01 = R.id.conversation_list_view_host;
        this.A05 = this;
        this.A07.A04(this);
        boolean A092 = this.A07.A09();
        this.A08 = A092;
        if (A092) {
            A3l();
        }
        A01(this);
        View A3n = A3n();
        AnonymousClass00C.A0E(A3n, "null cannot be cast to non-null type android.view.ViewGroup");
        AnonymousClass1R1.A04((ViewGroup) A3n, new C36101jl(this, 1));
        C19970wo r5 = this.A07;
        C20810yC r8 = this.A0D;
        C18820ts r7 = this.A00;
        AnonymousClass1NA r9 = this.A06;
        if (r9 != null) {
            C19650wI r10 = this.A09;
            if (r10 != null) {
                this.A03 = new AnonymousClass1R8((ViewStub) null, (ImageView) findViewById(R.id.fab), (ImageView) findViewById(R.id.fab_second), (MaterialButton) findViewById(R.id.fabText), r5, this.A09, r7, r8, r9, r10);
                return;
            }
            AnonymousClass00C.A0G("mainThreadHandler");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass00C.A0G("bottomNavHelper");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void onStart() {
        super.onStart();
        this.A07.A05(this, this.A0E);
    }

    public void onStop() {
        super.onStop();
        this.A07.A06(this.A0E);
    }
}
