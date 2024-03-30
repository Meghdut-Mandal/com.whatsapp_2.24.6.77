package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;
import java.util.Set;

/* renamed from: X.1hI  reason: invalid class name and case insensitive filesystem */
public final class C34591hI extends C02920Ck {
    public C32501di A00;
    public C32461de A01;
    public C32471df A02;
    public C32481dg A03;
    public C32511dj A04;
    public C32521dk A05;
    public AnonymousClass1RY A06;
    public AnonymousClass1RY A07;
    public Runnable A08;
    public Set A09 = C004702c.A00;
    public AnonymousClass00S A0A;
    public AnonymousClass00S A0B;
    public final C20810yC A0C;
    public final AnonymousClass00T A0D = C001400p.A00(C000800j.NONE, new C34611hK(this));
    public final C34481h7 A0E;
    public final C34491h8 A0F;
    public final C34501h9 A0G;
    public final C34511hA A0H;
    public final C34521hB A0I;
    public final C34531hC A0J;
    public final C34541hD A0K;
    public final C34551hE A0L;
    public final C34561hF A0M;
    public final C34571hG A0N;
    public final C34581hH A0O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34591hI(C34481h7 r3, C34491h8 r4, C34501h9 r5, C34511hA r6, C34521hB r7, C34531hC r8, C34541hD r9, C34551hE r10, C34561hF r11, C34571hG r12, C34581hH r13, C20810yC r14) {
        super((C02830Cb) new C34601hJ());
        AnonymousClass00C.A0D(r14, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r8, 7);
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass00C.A0D(r10, 9);
        AnonymousClass00C.A0D(r11, 10);
        AnonymousClass00C.A0D(r12, 11);
        AnonymousClass00C.A0D(r13, 12);
        this.A0C = r14;
        this.A0E = r3;
        this.A0F = r4;
        this.A0G = r5;
        this.A0H = r6;
        this.A0I = r7;
        this.A0J = r8;
        this.A0K = r9;
        this.A0L = r10;
        this.A0M = r11;
        this.A0N = r12;
        this.A0O = r13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.809} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.4o2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: X.809} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: X.809} */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x05e6, code lost:
        if (X.C007103b.A0j(r13.A09, r0.A03()) == false) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0302, code lost:
        r0 = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0317, code lost:
        r2 = new X.C135446ci(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x031c, code lost:
        r4.setOnClickListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x031f, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x03d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            int r0 = r13.A0J()
            if (r15 < r0) goto L_0x001f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder no item exists at position "
        L_0x0011:
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = r1.toString()
        L_0x001b:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r3 = r13.A0L(r15)
            X.1hj r3 = (X.C34841hj) r3
            if (r3 != 0) goto L_0x002f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder null item at position "
            goto L_0x0011
        L_0x002f:
            double r4 = (double) r15
            double r1 = (double) r0
            r6 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r1 = r1 * r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            X.1dk r0 = r13.A05
            if (r0 == 0) goto L_0x005c
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = r0.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r0.A0F
            X.1hN r1 = r0.A0M
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x005c
            X.5Lt r0 = r1.A02
            if (r0 != 0) goto L_0x005c
            X.5Lt r2 = new X.5Lt
            r2.<init>(r1)
            r1.A02 = r2
            X.0wU r1 = r1.A0S
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Bp0(r2, r0)
        L_0x005c:
            int r15 = r3.BD8()
            switch(r15) {
                case 0: goto L_0x006b;
                case 1: goto L_0x018e;
                case 2: goto L_0x0320;
                case 3: goto L_0x01fe;
                case 4: goto L_0x05cf;
                case 5: goto L_0x001e;
                case 6: goto L_0x001e;
                case 7: goto L_0x05d5;
                case 8: goto L_0x0240;
                case 9: goto L_0x0306;
                case 10: goto L_0x030f;
                default: goto L_0x0063;
            }
        L_0x0063:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "callsHistoryAdapter/onBindViewHolder failed to match type to bind: "
            goto L_0x0011
        L_0x006b:
            X.4nn r14 = (X.C96724nn) r14
            X.1hl r3 = (X.C34861hl) r3
            X.0yC r7 = r13.A0C
            r8 = 0
            X.AnonymousClass00C.A0D(r3, r8)
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            X.00T r9 = r14.A02
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r5 = r0.getResources()
            X.AnonymousClass00C.A0B(r5)
            r0 = 4574(0x11de, float:6.41E-42)
            X.0yV r6 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r6, r7, r0)
            java.lang.Object r1 = r9.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r0 == 0) goto L_0x0148
            r0 = 2132083057(0x7f150171, float:1.9806246E38)
            X.AnonymousClass088.A06(r1, r0)
            java.lang.Object r10 = r9.getValue()
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getPaddingLeft()
            r0 = 2131165623(0x7f0701b7, float:1.7945468E38)
            int r2 = r5.getDimensionPixelSize(r0)
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getPaddingRight()
            r0 = 2131165622(0x7f0701b6, float:1.7945466E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r10.setPadding(r4, r2, r1, r0)
        L_0x00c9:
            java.lang.Object r1 = r9.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r3.A00
            r1.setText(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0174
            X.00T r2 = r14.A01
            java.lang.Object r0 = r2.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r8)
            java.lang.Object r0 = r2.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r4 = r0.A01()
            X.AnonymousClass00C.A08(r4)
            java.lang.Object r0 = r2.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0126
            java.lang.Object r0 = r2.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r1 = r0.A01()
            r0 = 2131431033(0x7f0b0e79, float:1.8483784E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A01
            r1.setText(r0)
            java.lang.Object r0 = r2.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r2 = r0.A01()
            r1 = 43
            X.6ci r0 = new X.6ci
            r0.<init>(r14, r1)
            r2.setOnClickListener(r0)
        L_0x0126:
            r0 = 4574(0x11de, float:6.41E-42)
            boolean r0 = X.C20800yB.A01(r6, r7, r0)
            if (r0 == 0) goto L_0x0743
            int r3 = r4.getPaddingLeft()
            r0 = 2131165623(0x7f0701b7, float:1.7945468E38)
            int r2 = r5.getDimensionPixelSize(r0)
            int r1 = r4.getPaddingRight()
            r0 = 2131165622(0x7f0701b6, float:1.7945466E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r4.setPadding(r3, r2, r1, r0)
            return
        L_0x0148:
            r0 = 2132083058(0x7f150172, float:1.9806248E38)
            X.AnonymousClass088.A06(r1, r0)
            r0 = 2131168202(0x7f070bca, float:1.79507E38)
            int r4 = r5.getDimensionPixelSize(r0)
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getPaddingLeft()
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getPaddingRight()
            r2.setPadding(r1, r4, r0, r4)
            goto L_0x00c9
        L_0x0174:
            X.00T r1 = r14.A01
            java.lang.Object r0 = r1.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            int r0 = r0.A00()
            if (r0 != 0) goto L_0x001e
            java.lang.Object r1 = r1.getValue()
            X.1RJ r1 = (X.AnonymousClass1RJ) r1
            r0 = 8
            r1.A03(r0)
            return
        L_0x018e:
            X.4o1 r14 = (X.C96864o1) r14
            X.3dw r3 = (X.C69693dw) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.16D r1 = r14.A01
            com.whatsapp.jid.UserJid r0 = r3.A00
            X.141 r5 = r1.A0D(r0)
            X.1RY r1 = r14.A02
            X.00T r4 = r14.A04
            java.lang.Object r0 = r4.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r5)
            X.00T r0 = r14.A03
            java.lang.Object r1 = r0.getValue()
            X.3SF r1 = (X.AnonymousClass3SF) r1
            java.util.List r0 = r3.A01
            r1.A08(r5, r0)
            X.AnonymousClass00C.A0B(r5)
            X.1de r0 = r14.A00
            if (r0 == 0) goto L_0x0302
            android.view.View r2 = r14.A0H
            r1 = 45
            X.6co r0 = new X.6co
            r0.<init>(r14, r3, r1)
            r2.setOnClickListener(r0)
            X.00T r0 = r14.A06
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 16
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r3, (java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
            X.00T r0 = r14.A05
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 17
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r3, (java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
            java.lang.Object r4 = r4.getValue()
            android.view.View r4 = (android.view.View) r4
            r0 = 22
            X.2i6 r2 = new X.2i6
            r2.<init>(r14, r3, r0)
            goto L_0x031c
        L_0x01fe:
            boolean r0 = r14 instanceof X.C96874o2
            if (r0 == 0) goto L_0x0220
            X.4o2 r14 = (X.C96874o2) r14
            X.6rO r3 = (X.C143956rO) r3
            r9 = 0
            X.AnonymousClass00C.A0D(r3, r9)
            X.72P r0 = r3.A00
            X.AnonymousClass00C.A08(r0)
            X.9Uj r2 = r3.A01
            X.AnonymousClass00C.A08(r2)
            java.util.ArrayList r1 = r0.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0756
            java.lang.String r0 = "CallsHistoryLiveOngoingJoinableCallViewHolder/bindCall no calls registered"
            goto L_0x001b
        L_0x0220:
            X.809 r14 = (X.AnonymousClass809) r14
            X.6rO r3 = (X.C143956rO) r3
            r7 = 0
            X.AnonymousClass00C.A0D(r3, r7)
            r14.A00 = r3
            X.72P r0 = r3.A00
            X.AnonymousClass00C.A08(r0)
            X.9Uj r9 = r3.A01
            X.AnonymousClass00C.A08(r9)
            java.util.ArrayList r1 = r0.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0856
            java.lang.String r0 = "CallsHistoryOngoingJoinableCallViewHolder/bindCall no calls registered"
            goto L_0x001b
        L_0x0240:
            X.4o5 r14 = (X.C96904o5) r14
            X.3dx r3 = (X.C69703dx) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.16D r0 = r14.A02
            com.whatsapp.jid.GroupJid r8 = r3.A00
            X.141 r6 = r0.A0D(r8)
            X.1RY r1 = r14.A03
            X.00T r5 = r14.A07
            java.lang.Object r0 = r5.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r6)
            X.00T r0 = r14.A06
            java.lang.Object r1 = r0.getValue()
            X.3SF r1 = (X.AnonymousClass3SF) r1
            java.util.List r0 = r3.A01
            r1.A08(r6, r0)
            X.00T r2 = r14.A09
            java.lang.Object r0 = r2.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r7 = r0.getContext()
            X.0yC r4 = r14.A05
            X.0wQ r1 = r14.A00
            X.17X r0 = r14.A04
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r8)
            boolean r0 = X.C34681hT.A0C(r1, r4, r0)
            java.lang.Object r1 = r2.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r0 == 0) goto L_0x02ee
            r0 = 2131891822(0x7f12166e, float:1.9418375E38)
            java.lang.String r0 = r7.getString(r0)
            r1.setContentDescription(r0)
            java.lang.Object r1 = r2.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131234349(0x7f080e2d, float:1.8084861E38)
        L_0x02a1:
            r1.setImageResource(r0)
            X.1de r4 = r14.A01
            if (r4 == 0) goto L_0x0302
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 19
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r3, (java.lang.Object) r6, (int) r1)
            r2.setOnClickListener(r0)
            X.00T r0 = r14.A08
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 20
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r3, (java.lang.Object) r6, (int) r1)
            r2.setOnClickListener(r0)
            android.view.View r2 = r14.A0H
            r1 = 46
            X.6co r0 = new X.6co
            r0.<init>(r14, r3, r1)
            r2.setOnClickListener(r0)
            java.lang.Object r2 = r5.getValue()
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r5.getValue()
            com.whatsapp.components.button.ThumbnailButton r1 = (com.whatsapp.components.button.ThumbnailButton) r1
            X.AnonymousClass00C.A08(r1)
            X.2iI r0 = new X.2iI
            r0.<init>(r3, r4, r1)
            r2.setOnClickListener(r0)
            return
        L_0x02ee:
            r0 = 2131886548(0x7f1201d4, float:1.9407678E38)
            java.lang.String r0 = r7.getString(r0)
            r1.setContentDescription(r0)
            java.lang.Object r1 = r2.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            goto L_0x02a1
        L_0x0302:
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty"
            goto L_0x001b
        L_0x0306:
            X.00S r1 = r13.A0A
            if (r1 == 0) goto L_0x001e
            android.view.View r4 = r14.A0H
            r0 = 40
            goto L_0x0317
        L_0x030f:
            X.00S r1 = r13.A0B
            if (r1 == 0) goto L_0x001e
            android.view.View r4 = r14.A0H
            r0 = 44
        L_0x0317:
            X.6ci r2 = new X.6ci
            r2.<init>(r1, r0)
        L_0x031c:
            r4.setOnClickListener(r2)
            return
        L_0x0320:
            X.6rN r3 = (X.C143946rN) r3
            X.52e r14 = (X.C1028452e) r14
            java.util.Set r1 = r13.A09
            X.72P r0 = r3.A01
            java.lang.String r0 = r0.A03()
            boolean r5 = X.C007103b.A0j(r1, r0)
            r14.A00 = r3
            X.689 r6 = r3.A02
            X.AnonymousClass00C.A08(r6)
            X.00T r9 = r14.A0C
            java.lang.Object r1 = r9.getValue()
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = r6.A0D
            X.C011004s.A08(r1, r0)
            boolean r8 = r6.A0H
            X.00T r7 = r14.A0E
            java.lang.Object r1 = r7.getValue()
            android.view.View r1 = (android.view.View) r1
            X.AnonymousClass00C.A08(r1)
            r4 = 0
            r0 = 8
            if (r8 == 0) goto L_0x0357
            r0 = 0
        L_0x0357:
            r1.setVisibility(r0)
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            X.AnonymousClass00C.A08(r2)
            r1 = r8 ^ 1
            r0 = 8
            if (r1 == 0) goto L_0x036a
            r0 = 0
        L_0x036a:
            r2.setVisibility(r0)
            java.lang.String r3 = "Required value was null."
            if (r8 == 0) goto L_0x0567
            X.00T r0 = r14.A0B
            java.lang.Object r2 = r0.getValue()
            X.3SF r2 = (X.AnonymousClass3SF) r2
            X.3Bc r1 = r6.A0B
            if (r1 == 0) goto L_0x05c3
            android.view.View r0 = r14.A0H
            android.content.Context r0 = r0.getContext()
            java.lang.CharSequence r1 = r1.A00(r0)
            r0 = 0
            r2.A09(r0, r1)
            java.lang.Object r7 = r7.getValue()
            com.whatsapp.calling.views.MultiContactThumbnail r7 = (com.whatsapp.calling.views.MultiContactThumbnail) r7
            java.util.List r2 = r6.A0E
            X.1RY r1 = r14.A03
            X.4Sz r0 = X.C65473Sf.A00
            r7.A00(r0, r1, r2)
        L_0x039a:
            X.00T r1 = r14.A0F
            java.lang.Object r0 = r1.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x03b5
            java.lang.Object r0 = r1.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r1 = r0.A01()
            r0 = 8
            r1.setVisibility(r0)
        L_0x03b5:
            X.00T r11 = r14.A0B
            java.lang.Object r2 = r11.getValue()
            X.3SF r2 = (X.AnonymousClass3SF) r2
            android.view.View r7 = r14.A0H
            android.content.Context r1 = r7.getContext()
            int r0 = r6.A05
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            r0.setTextColor(r1)
            java.lang.Object r2 = r11.getValue()
            X.3SF r2 = (X.AnonymousClass3SF) r2
            X.3Bc r1 = r6.A0B
            if (r1 == 0) goto L_0x05bd
            android.content.Context r0 = r7.getContext()
            java.lang.CharSequence r1 = r1.A00(r0)
            r0 = 0
            r2.A09(r0, r1)
            X.0ts r2 = r14.A06
            long r0 = r6.A09
            java.lang.String r1 = X.AnonymousClass3UY.A0B(r2, r0)
            X.AnonymousClass00C.A08(r1)
            r6.A0C = r1
            X.00T r0 = r14.A0D
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            int r9 = r6.A00
            int r8 = r6.A01
            int r3 = r6.A05
            r10 = 1
            if (r9 > r10) goto L_0x0523
            X.00T r0 = r14.A09
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
        L_0x0412:
            X.00T r3 = r14.A0A
            java.lang.Object r1 = r3.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r6.A03
            r1.setImageResource(r0)
            java.lang.Object r2 = r3.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r7.getContext()
            int r0 = r6.A04
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            X.AnonymousClass3UF.A0E(r2, r0)
            java.lang.Object r2 = r3.getValue()
            android.view.View r2 = (android.view.View) r2
            android.content.Context r1 = r7.getContext()
            int r0 = r6.A02
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            int r10 = r6.A08
            int r9 = r6.A07
            int r3 = r6.A06
            r2 = 0
            r8 = 8
            if (r10 == 0) goto L_0x0516
            X.00T r1 = r14.A0H
            java.lang.Object r0 = r1.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r10)
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
        L_0x0464:
            X.00T r1 = r14.A0G
            java.lang.Object r0 = r1.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r9 == 0) goto L_0x0511
            r0.setImageResource(r9)
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
        L_0x047a:
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r3 == 0) goto L_0x050e
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r0.getString(r3)
        L_0x048a:
            r1.setContentDescription(r0)
            boolean r3 = r6.A0G
            X.00T r7 = r14.A0K
            java.lang.Object r0 = r7.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3UE.A08(r0, r3)
            X.00T r1 = r14.A0J
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3UE.A08(r0, r3)
            boolean r3 = r6.A0I
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            X.AnonymousClass00C.A08(r1)
            r0 = 8
            if (r3 == 0) goto L_0x04b5
            r0 = 0
        L_0x04b5:
            r1.setVisibility(r0)
            java.lang.Object r1 = r7.getValue()
            android.view.View r1 = (android.view.View) r1
            X.AnonymousClass00C.A08(r1)
            r0 = r3 ^ 1
            if (r0 != 0) goto L_0x04c7
            r4 = 8
        L_0x04c7:
            r1.setVisibility(r4)
            if (r3 != 0) goto L_0x04f6
            java.lang.Object r0 = r7.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r3 = r0.getContext()
            boolean r0 = r6.A0J
            java.lang.Object r1 = r7.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r0 == 0) goto L_0x04fa
            r0 = 2131891822(0x7f12166e, float:1.9418375E38)
            java.lang.String r0 = r3.getString(r0)
            r1.setContentDescription(r0)
            java.lang.Object r1 = r7.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131234349(0x7f080e2d, float:1.8084861E38)
        L_0x04f3:
            r1.setImageResource(r0)
        L_0x04f6:
            r14.A0D(r5, r2, r2)
            return
        L_0x04fa:
            r0 = 2131886548(0x7f1201d4, float:1.9407678E38)
            java.lang.String r0 = r3.getString(r0)
            r1.setContentDescription(r0)
            java.lang.Object r1 = r7.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            goto L_0x04f3
        L_0x050e:
            r0 = 0
            goto L_0x048a
        L_0x0511:
            r0.setVisibility(r8)
            goto L_0x047a
        L_0x0516:
            X.00T r0 = r14.A0H
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r8)
            goto L_0x0464
        L_0x0523:
            X.00T r2 = r14.A09
            java.lang.Object r0 = r2.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            java.lang.Object r1 = r2.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r7.getContext()
            int r0 = X.AnonymousClass00F.A00(r0, r3)
            r1.setTextColor(r0)
            java.lang.Object r0 = r11.getValue()
            X.3SF r0 = (X.AnonymousClass3SF) r0
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setEllipsize(r1)
            java.lang.Object r3 = r2.getValue()
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r2 = r7.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r4] = r0
            java.lang.String r0 = r2.getString(r8, r1)
            r3.setText(r0)
            goto L_0x0412
        L_0x0567:
            X.141 r7 = r6.A0A
            if (r7 == 0) goto L_0x05c9
            X.1RY r1 = r14.A04
            java.lang.Object r0 = r9.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r7)
            boolean r0 = r7.A0G()
            if (r0 != 0) goto L_0x039a
            X.3IL r0 = r7.A0F
            if (r0 != 0) goto L_0x039a
            X.0yC r2 = r14.A07
            r1 = 4094(0xffe, float:5.737E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x039a
            X.171 r0 = r14.A02
            java.lang.String r2 = r0.A0O(r7)
            if (r2 == 0) goto L_0x039a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x039a
            X.00T r1 = r14.A0F
            java.lang.Object r0 = r1.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r4)
            java.lang.Object r0 = r1.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r1 = r0.A01()
            r0 = 2131433045(0x7f0b1655, float:1.8487865E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            goto L_0x03b5
        L_0x05bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x05c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x05c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x05cf:
            X.1i7 r14 = (X.C35081i7) r14
            r14.A0B()
            return
        L_0x05d5:
            X.72P r0 = r3.B9E()
            if (r0 == 0) goto L_0x05e8
            java.util.Set r1 = r13.A09
            java.lang.String r0 = r0.A03()
            boolean r0 = X.C007103b.A0j(r1, r0)
            r7 = 1
            if (r0 != 0) goto L_0x05e9
        L_0x05e8:
            r7 = 0
        L_0x05e9:
            X.52d r14 = (X.C1028352d) r14
            X.6rM r3 = (X.C143936rM) r3
            X.1dj r6 = r13.A04
            r5 = 0
            X.AnonymousClass00C.A0D(r3, r5)
            X.681 r4 = r3.A03
            X.AnonymousClass00C.A08(r4)
            X.16D r1 = r14.A07
            X.11F r0 = r3.A04
            X.141 r9 = r1.A0D(r0)
            r14.A05 = r9
            boolean r0 = r4.A09
            r14.A06 = r0
            long r0 = r3.A01
            r14.A01 = r0
            int r0 = r4.A01
            r14.A00 = r0
            X.72P r0 = r3.A02
            r14.A02 = r0
            r14.A03 = r3
            X.1RY r1 = r14.A08
            java.lang.String r2 = "Required value was null."
            X.00T r8 = r14.A0A
            java.lang.Object r0 = r8.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r9)
            android.view.View r3 = r14.A0H
            r0 = 2131433548(0x7f0b184c, float:1.8488885E38)
            android.view.View r1 = X.C012005e.A02(r3, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r4.A07
            r1.setText(r0)
            X.00T r0 = r14.A0B
            java.lang.Object r1 = r0.getValue()
            X.3SF r1 = (X.AnonymousClass3SF) r1
            X.141 r0 = r14.A05
            if (r0 == 0) goto L_0x073d
            r1.A05(r0)
            int r2 = r14.A00
            r1 = 1
            X.00T r0 = r14.A0C
            if (r2 != r1) goto L_0x06f9
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r5)
            X.00T r0 = r14.A0D
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
        L_0x065f:
            X.00T r9 = r14.A09
            java.lang.Object r2 = r9.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r3.getContext()
            int r0 = r4.A04
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            r2.setImageDrawable(r0)
            java.lang.Object r2 = r9.getValue()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r3.getContext()
            int r0 = r4.A05
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r2.setColorFilter(r0)
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            android.content.Context r1 = r3.getContext()
            int r0 = r4.A03
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            java.lang.Object r1 = r8.getValue()
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = r4.A08
            X.C011004s.A08(r1, r0)
            if (r6 != 0) goto L_0x06c4
            r1 = 0
            r3.setOnClickListener(r1)
            r3.setOnLongClickListener(r1)
            java.lang.Object r0 = r8.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setOnClickListener(r1)
        L_0x06c0:
            r14.A0D(r7, r5, r5)
            return
        L_0x06c4:
            r14.A04 = r6
            r1 = 24
            X.2iE r0 = new X.2iE
            r0.<init>(r14, r1)
            r3.setOnClickListener(r0)
            X.3Z2 r0 = new X.3Z2
            r0.<init>(r6, r14)
            r3.setOnLongClickListener(r0)
            java.lang.Object r2 = r8.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 23
            X.2iE r0 = new X.2iE
            r0.<init>(r14, r1)
            r2.setOnClickListener(r0)
            java.lang.Object r2 = r9.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 47
            X.6co r0 = new X.6co
            r0.<init>(r14, r6, r1)
            r2.setOnClickListener(r0)
            goto L_0x06c0
        L_0x06f9:
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            X.00T r0 = r14.A0D
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r5)
            r0 = 2131428434(0x7f0b0452, float:1.8478512E38)
            android.view.View r2 = X.C012005e.A02(r3, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r3.getContext()
            int r0 = r4.A00
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r2.setColorFilter(r0)
            r0 = 2131433547(0x7f0b184b, float:1.8488883E38)
            android.view.View r2 = X.C012005e.A02(r3, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.3Bc r1 = r4.A06
            android.content.Context r0 = r3.getContext()
            java.lang.CharSequence r0 = r1.A00(r0)
            r2.setText(r0)
            goto L_0x065f
        L_0x073d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0743:
            r0 = 2131168202(0x7f070bca, float:1.79507E38)
            int r2 = r5.getDimensionPixelSize(r0)
            int r1 = r4.getPaddingLeft()
            int r0 = r4.getPaddingRight()
            r4.setPadding(r1, r2, r0, r2)
            return
        L_0x0756:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            java.lang.Object r6 = r0.get(r9)
            X.141 r4 = r3.A02
            if (r4 == 0) goto L_0x076f
            X.1RY r1 = r14.A01
            X.00T r0 = r14.A04
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A08(r0, r4)
        L_0x076f:
            android.view.View r5 = r14.A0H
            android.content.Context r8 = r5.getContext()
            X.3Bc r0 = r2.A05
            java.lang.CharSequence r0 = r0.A00(r8)
            java.lang.String r7 = r0.toString()
            X.00T r0 = r14.A02
            java.lang.Object r1 = r0.getValue()
            X.3SF r1 = (X.AnonymousClass3SF) r1
            java.util.List r0 = r3.A04
            r1.A09(r0, r7)
            X.3Bc r4 = r2.A06
            if (r4 == 0) goto L_0x079f
            X.00T r0 = r14.A06
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r0 = r4.A00(r8)
            r1.setText(r0)
        L_0x079f:
            X.00T r4 = r14.A06
            java.lang.Object r1 = r4.getValue()
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            int r0 = r2.A00
            r1.setIcon((int) r0)
            X.00T r0 = r14.A07
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.3Bc r0 = r2.A07
            java.lang.CharSequence r0 = r0.A00(r8)
            r1.setText(r0)
            X.3Bc r12 = r2.A04
            r1 = 8
            if (r12 == 0) goto L_0x0828
            X.00T r11 = r14.A08
            java.lang.Object r0 = r11.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r9)
            java.lang.Object r0 = r11.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r10 = r0.A01()
            com.whatsapp.TextEmojiLabel r10 = (com.whatsapp.TextEmojiLabel) r10
            java.lang.CharSequence r0 = r12.A00(r8)
            r10.A0I(r0)
            java.lang.Object r0 = r11.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r11 = r0.A01()
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10 = 2130971112(0x7f0409e8, float:1.7550953E38)
            r0 = 2131102523(0x7f060b3b, float:1.7817486E38)
            int r0 = X.C224514j.A00(r8, r10, r0)
            int r0 = X.AnonymousClass00F.A00(r8, r0)
            r11.setTextColor(r0)
        L_0x07fe:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0987
            java.util.List r0 = r2.A0A
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x0810:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0834
            java.lang.Object r1 = r11.next()
            X.141 r1 = (X.AnonymousClass141) r1
            X.AnonymousClass00C.A0B(r1)
            X.3ds r0 = new X.3ds
            r0.<init>(r1)
            r10.add(r0)
            goto L_0x0810
        L_0x0828:
            X.00T r0 = r14.A08
            java.lang.Object r0 = r0.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r1)
            goto L_0x07fe
        L_0x0834:
            X.3Bc r1 = r2.A08
            if (r1 == 0) goto L_0x0840
            X.3dt r0 = new X.3dt
            r0.<init>(r1)
            r10.add(r0)
        L_0x0840:
            X.00T r1 = r14.A03
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r9)
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.calling.PeerAvatarLayout r0 = (com.whatsapp.calling.PeerAvatarLayout) r0
            r0.A16(r10)
            goto L_0x0992
        L_0x0856:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            java.lang.Object r6 = r0.get(r7)
            boolean r10 = r9.A0D
            X.00T r5 = r14.A09
            java.lang.Object r2 = r5.getValue()
            android.view.View r2 = (android.view.View) r2
            X.AnonymousClass00C.A08(r2)
            r1 = r10 ^ 1
            r8 = 8
            r0 = 8
            if (r1 == 0) goto L_0x0874
            r0 = 0
        L_0x0874:
            r2.setVisibility(r0)
            X.00T r4 = r14.A05
            java.lang.Object r1 = r4.getValue()
            android.view.View r1 = (android.view.View) r1
            X.AnonymousClass00C.A08(r1)
            r0 = 8
            if (r10 == 0) goto L_0x0887
            r0 = 0
        L_0x0887:
            r1.setVisibility(r0)
            if (r10 == 0) goto L_0x095b
            X.1RY r2 = r14.A03
            X.141 r1 = r3.A02
            X.C18740tg.A06(r1)
            java.lang.Object r0 = r4.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A08(r0, r1)
        L_0x089c:
            android.view.View r5 = r14.A0H
            android.content.Context r2 = r5.getContext()
            X.3Bc r0 = r9.A05
            java.lang.CharSequence r0 = r0.A00(r2)
            java.lang.String r4 = r0.toString()
            X.00T r10 = r14.A08
            java.lang.Object r1 = r10.getValue()
            X.3SF r1 = (X.AnonymousClass3SF) r1
            java.util.List r0 = r3.A04
            r1.A09(r0, r4)
            int r0 = r9.A03
            r1 = 2131102523(0x7f060b3b, float:1.7817486E38)
            if (r0 != r1) goto L_0x08c7
            r0 = 2130971112(0x7f0409e8, float:1.7550953E38)
            int r0 = X.C224514j.A00(r2, r0, r1)
        L_0x08c7:
            int r1 = X.AnonymousClass00F.A00(r2, r0)
            X.3Bc r11 = r9.A04
            if (r11 == 0) goto L_0x094f
            X.00T r8 = r14.A0B
            java.lang.Object r0 = r8.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r7)
            java.lang.Object r0 = r8.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r4 = r0.A01()
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r0 = r11.A00(r2)
            r4.setText(r0)
            java.lang.Object r0 = r8.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            android.view.View r0 = r0.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
        L_0x08fc:
            X.00T r0 = r14.A07
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
            X.00T r0 = r14.A04
            java.lang.Object r1 = r0.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r9.A00
            r1.setImageResource(r0)
            X.00T r0 = r14.A0A
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.3Bc r0 = r9.A07
            java.lang.CharSequence r0 = r0.A00(r2)
            r1.setText(r0)
            int r8 = r9.A02
            int r4 = r9.A01
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r10.getValue()
            X.3SF r0 = (X.AnonymousClass3SF) r0
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            java.lang.CharSequence r0 = r0.getText()
            r1[r7] = r0
            java.lang.String r1 = r2.getString(r8, r1)
            java.lang.String r0 = r2.getString(r4)
            X.AnonymousClass3UE.A06(r5, r1, r0)
            X.AnonymousClass00C.A0B(r6)
            X.1df r0 = r14.A01
            if (r0 != 0) goto L_0x0974
            java.lang.String r0 = "CallsHistoryOngoingJoinableCallViewHolder/setEventListeners event listener empty"
            goto L_0x09af
        L_0x094f:
            X.00T r0 = r14.A0B
            java.lang.Object r0 = r0.getValue()
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r0.A03(r8)
            goto L_0x08fc
        L_0x095b:
            java.util.List r0 = r9.A0A
            int r0 = r0.size()
            if (r0 == 0) goto L_0x089c
            java.lang.Object r4 = r5.getValue()
            com.whatsapp.calling.views.MultiContactThumbnail r4 = (com.whatsapp.calling.views.MultiContactThumbnail) r4
            java.util.List r2 = r9.A0A
            X.1RY r1 = r14.A02
            X.4Sz r0 = X.C65473Sf.A00
            r4.A00(r0, r1, r2)
            goto L_0x089c
        L_0x0974:
            X.00T r0 = r14.A06
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 23
        L_0x097e:
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r6, (java.lang.Object) r3, (int) r1)
            r2.setOnClickListener(r0)
            goto L_0x09b2
        L_0x0987:
            X.00T r0 = r14.A03
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
        L_0x0992:
            int r1 = r2.A02
            int r2 = r2.A01
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r7
            java.lang.String r1 = r8.getString(r1, r0)
            java.lang.String r0 = r8.getString(r2)
            X.AnonymousClass3UE.A06(r5, r1, r0)
            X.AnonymousClass00C.A0B(r6)
            X.1df r0 = r14.A00
            if (r0 != 0) goto L_0x09b6
            java.lang.String r0 = "CallsHistoryLiveOngoingJoinableCallViewHolder/setEventListeners event listener empty"
        L_0x09af:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x09b2:
            X.C34081gQ.A02(r5)
            return
        L_0x09b6:
            X.00T r0 = r14.A05
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 22
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r6, (java.lang.Object) r3, (int) r1)
            r2.setOnClickListener(r0)
            java.lang.Object r2 = r4.getValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 21
            goto L_0x097e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34591hI.BSE(X.0D3, int):void");
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass00C.A0D(viewGroup2, 0);
        Context context = viewGroup2.getContext();
        int i2 = i;
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate);
                inflate.setEnabled(false);
                return new C96724nn(inflate, this.A00);
            case 1:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate2);
                C34501h9 r1 = this.A0G;
                AnonymousClass1RY r9 = this.A07;
                if (r9 != null) {
                    C32461de r7 = this.A01;
                    List list = AnonymousClass0D3.A0I;
                    C18800tq r12 = r1.A00.A02;
                    return new C96864o1(inflate2, (AnonymousClass1LI) r12.A3Q.get(), r7, (AnonymousClass16D) r12.A2A.get(), r9);
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate3);
                C34491h8 r13 = this.A0F;
                AnonymousClass1RY r10 = this.A07;
                if (r10 != null) {
                    AnonymousClass1RY r92 = this.A06;
                    if (r92 != null) {
                        C32481dg r72 = this.A03;
                        List list2 = AnonymousClass0D3.A0I;
                        C18800tq r14 = r13.A00.A02;
                        AnonymousClass1LI r6 = (AnonymousClass1LI) r14.A3Q.get();
                        C19970wo r11 = (C19970wo) r14.A8b.get();
                        C20810yC r132 = (C20810yC) r14.A02.get();
                        return new C1028452e(inflate3, r6, r72, (AnonymousClass171) r14.A90.get(), r92, r10, r11, (C18820ts) r14.A9X.get(), r132, (AnonymousClass13J) r14.A6z.get());
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
                boolean booleanValue = ((Boolean) this.A0D.getValue()).booleanValue();
                LayoutInflater from = LayoutInflater.from(context);
                if (booleanValue) {
                    View inflate4 = from.inflate(R.layout.f9nameremoved, viewGroup2, false);
                    AnonymousClass00C.A08(inflate4);
                    C34561hF r5 = this.A0M;
                    AnonymousClass1RY r3 = this.A07;
                    if (r3 != null) {
                        C32471df r15 = this.A02;
                        List list3 = AnonymousClass0D3.A0I;
                        return new C96874o2(inflate4, (AnonymousClass1LI) r5.A00.A02.A3Q.get(), r15, r3);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                View inflate5 = from.inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate5);
                C34551hE r16 = this.A0L;
                AnonymousClass1RY r93 = this.A07;
                if (r93 != null) {
                    AnonymousClass1RY r8 = this.A06;
                    if (r8 != null) {
                        C32471df r73 = this.A02;
                        List list4 = AnonymousClass0D3.A0I;
                        return new AnonymousClass809(inflate5, (AnonymousClass1LI) r16.A00.A02.A3Q.get(), r73, r8, r93);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 4:
                View inflate6 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate6);
                C34511hA r17 = this.A0H;
                List list5 = AnonymousClass0D3.A0I;
                C18800tq r18 = r17.A00.A02;
                return new C35081i7(inflate6, (AnonymousClass17Y) r18.A3e.get(), (C19600wD) r18.A24.get(), (C20810yC) r18.A02.get(), (AnonymousClass13J) r18.A6z.get());
            case 5:
                boolean A012 = C20800yB.A01(C21000yV.A02, this.A0C, 7724);
                LayoutInflater from2 = LayoutInflater.from(context);
                int i3 = R.layout.f9nameremoved;
                if (A012) {
                    i3 = R.layout.f9nameremoved;
                }
                View inflate7 = from2.inflate(i3, viewGroup2, false);
                AnonymousClass00C.A08(inflate7);
                C34531hC r19 = this.A0J;
                Runnable runnable = this.A08;
                if (runnable != null) {
                    List list6 = AnonymousClass0D3.A0I;
                    C18800tq r2 = r19.A00.A02;
                    return new C41341x3(inflate7, (C20810yC) r2.A02.get(), (C32681e1) r2.A00.A2Y.get(), runnable);
                }
                throw new IllegalStateException("Required value was null.");
            case 6:
                View inflate8 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate8);
                C34521hB r110 = this.A0I;
                List list7 = AnonymousClass0D3.A0I;
                C18800tq r32 = r110.A00.A02;
                return new C41331x2(inflate8, (C20810yC) r32.A02.get(), (AnonymousClass13J) r32.A6z.get(), C18840tu.A00(r32.A00.A3n));
            case 7:
                View inflate9 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate9);
                C34541hD r111 = this.A0K;
                AnonymousClass1RY r33 = this.A07;
                if (r33 != null) {
                    List list8 = AnonymousClass0D3.A0I;
                    C18800tq r22 = r111.A00.A02;
                    return new C1028352d(inflate9, (AnonymousClass1LI) r22.A3Q.get(), (AnonymousClass16D) r22.A2A.get(), r33);
                }
                throw new IllegalStateException("Required value was null.");
            case 8:
                View inflate10 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate10);
                C34481h7 r112 = this.A0E;
                AnonymousClass1RY r102 = this.A07;
                if (r102 != null) {
                    C32461de r82 = this.A01;
                    List list9 = AnonymousClass0D3.A0I;
                    C18800tq r113 = r112.A00.A02;
                    return new C96904o5(inflate10, (C19730wQ) r113.A4g.get(), (AnonymousClass1LI) r113.A3Q.get(), r82, (AnonymousClass16D) r113.A2A.get(), r102, (AnonymousClass17X) r113.A3v.get(), (C20810yC) r113.A02.get());
                }
                throw new IllegalStateException("Required value was null.");
            case 9:
                View inflate11 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate11);
                return new C41321x1(inflate11);
            case 10:
                View inflate12 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
                AnonymousClass00C.A08(inflate12);
                return new C41351x4(inflate12);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("callsHistoryAdapter/onCreateViewHolder type mismatch: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public int getItemViewType(int i) {
        return ((C34841hj) A0L(i)).BD8();
    }
}
