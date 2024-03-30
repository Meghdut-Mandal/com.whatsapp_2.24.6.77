package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mM  reason: invalid class name and case insensitive filesystem */
public final class C95834mM extends C02920Ck {
    public int A00;
    public C134626bL A01;
    public boolean A02;
    public final int A03;
    public final C24041Av A04;
    public final C123795x6 A05;
    public final C20810yC A06;
    public final AnonymousClass1HA A07;
    public final C88234Rx A08;
    public final AnonymousClass00S A09;
    public final AnonymousClass00S A0A;
    public final AnonymousClass00S A0B;
    public final AnonymousClass00S A0C;
    public final AnonymousClass00S A0D;
    public final C006302t A0E;
    public final C006302t A0F;
    public final C006302t A0G;
    public final C009003v A0H;
    public final boolean A0I;
    public final boolean A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95834mM(C24041Av r3, C134626bL r4, C123795x6 r5, C20810yC r6, AnonymousClass1HA r7, C88234Rx r8, AnonymousClass00S r9, AnonymousClass00S r10, AnonymousClass00S r11, AnonymousClass00S r12, AnonymousClass00S r13, C006302t r14, C006302t r15, C006302t r16, C009003v r17, int i, boolean z, boolean z2) {
        super((C02830Cb) new C95634lw());
        C009003v r1 = r17;
        C36361kB.A1J(r6, 1, r1);
        this.A06 = r6;
        this.A0I = z;
        this.A0J = z2;
        this.A07 = r7;
        this.A04 = r3;
        this.A03 = i;
        this.A08 = r8;
        this.A0H = r1;
        this.A05 = r5;
        this.A0F = r14;
        this.A0A = r9;
        this.A09 = r10;
        this.A0C = r11;
        this.A0D = r12;
        this.A0B = r13;
        this.A0G = r15;
        this.A0E = r16;
        this.A01 = r4;
        A0B(r6.A0E(6344));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        switch (i) {
            case 0:
                return new AnonymousClass56B(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1:
                return new AnonymousClass56C(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 2:
                View A0I2 = C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                int i2 = this.A03;
                return new AnonymousClass56I(A0I2, this.A04, this.A07, this.A08, this.A0H, i2);
            case 3:
                int dimensionPixelOffset = C36341k9.A0F(viewGroup).getDimensionPixelOffset(R.dimen.f7nameremoved);
                int dimensionPixelOffset2 = C36341k9.A0F(viewGroup).getDimensionPixelOffset(R.dimen.f7nameremoved);
                C95094jn r2 = new C95094jn(C36371kC.A0B(viewGroup));
                LinearLayout.LayoutParams A0N = C36381kD.A0N();
                A0N.setMargins(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
                r2.setLayoutParams(A0N);
                return new AnonymousClass56E(r2, this.A0A, this.A09);
            case 4:
                return new AnonymousClass569(this.A0C, C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 5:
                return new AnonymousClass56F(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0C, this.A0B);
            case 6:
                return new AnonymousClass56G(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A05, new C154467Sh(this));
            case 7:
                View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
                List list = AnonymousClass0D3.A0I;
                boolean z = this.A0I;
                AnonymousClass00C.A0B(inflate);
                return new AnonymousClass56A(inflate, this.A0D, z);
            case 8:
                return new AnonymousClass56H(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0D, this.A0B, this.A0I);
            case 9:
                return new AnonymousClass56D(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0E);
            default:
                throw AnonymousClass001.A08("Unsupported view type for StickerGrid adapter");
        }
    }

    public long A0E(int i) {
        if (this.A06.A0E(6344)) {
            return (long) ((C1266865b) A0L(i)).A03().hashCode();
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        C96524nT r32 = (C96524nT) r3;
        AnonymousClass00C.A0D(r32, 0);
        if (r32 instanceof AnonymousClass56I) {
            AnonymousClass56I r33 = (AnonymousClass56I) r32;
            r33.A0B(false);
            r33.A0C(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.56H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.56E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.56F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.56E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.56E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.56E} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r18, int r19) {
        /*
            r17 = this;
            r4 = r18
            X.4nT r4 = (X.C96524nT) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r0 = r4 instanceof X.AnonymousClass56C
            r2 = r17
            r1 = r19
            if (r0 == 0) goto L_0x003e
            java.lang.Object r3 = r2.A0L(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerGridViewItem.Title"
            X.AnonymousClass00C.A0E(r3, r0)
            X.55x r3 = (X.C1035555x) r3
            X.56C r4 = (X.AnonymousClass56C) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            java.lang.Integer r0 = r3.A01
            com.whatsapp.WaTextView r1 = r4.A00
            if (r0 == 0) goto L_0x0038
            int r0 = r0.intValue()
            r1.setText(r0)
        L_0x002e:
            X.02t r1 = r2.A0F
            if (r1 == 0) goto L_0x0037
            X.5zp r0 = r3.A00
            r1.invoke(r0)
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = r3.A03
            r1.setText(r0)
            goto L_0x002e
        L_0x003e:
            boolean r0 = r4 instanceof X.AnonymousClass56I
            r15 = 1
            if (r0 == 0) goto L_0x0107
            X.56I r4 = (X.AnonymousClass56I) r4
            java.lang.Object r6 = r2.A0L(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerGridViewItem.StickerLocal"
            X.AnonymousClass00C.A0E(r6, r0)
            X.55v r6 = (X.C1035355v) r6
            int r12 = r2.A00
            r7 = 0
            X.AnonymousClass00C.A0D(r6, r7)
            X.6c4 r10 = r6.A01
            android.view.View r5 = r4.A0H
            r5.setEnabled(r7)
            java.lang.String r3 = r10.A0E
            if (r3 == 0) goto L_0x00b0
            java.lang.String r0 = "loading-hash"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 0
            r5.setOnClickListener(r0)
            r5.setClickable(r7)
        L_0x0070:
            r0 = 2131233671(0x7f080b87, float:1.8083486E38)
            r5.setBackgroundResource(r0)
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = X.AnonymousClass3RT.A00(r0, r10)
            r5.setContentDescription(r0)
            com.whatsapp.stickers.StickerView r9 = r4.A05
            android.content.res.Resources r1 = X.C36341k9.A0F(r9)
            r0 = 2131166530(0x7f070542, float:1.7947308E38)
            int r13 = r1.getDimensionPixelSize(r0)
            r9.A02 = r15
            X.1HA r8 = r4.A03
            X.6yz r11 = new X.6yz
            r11.<init>(r4, r10)
            r16 = 1
            r14 = r13
            r8.A08(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00ae
        L_0x00a5:
            r4.A0C(r15)
            boolean r0 = r2.A02
            r4.A0B(r0)
            return
        L_0x00ae:
            r15 = 0
            goto L_0x00a5
        L_0x00b0:
            X.5zp r8 = r6.A00
            boolean r9 = r8 instanceof X.AnonymousClass565
            if (r9 == 0) goto L_0x00c3
            r0 = r8
            X.565 r0 = (X.AnonymousClass565) r0
            X.5zs r3 = r0.A00
            X.5IC r0 = X.AnonymousClass5IC.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 != 0) goto L_0x00d3
        L_0x00c3:
            boolean r7 = r8 instanceof X.AnonymousClass568
            if (r7 == 0) goto L_0x00e5
            java.lang.String r3 = r8.A00()
            java.lang.String r0 = "recent"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x00e5
        L_0x00d3:
            r3 = 3
        L_0x00d4:
            X.5Lk r0 = new X.5Lk
            r0.<init>(r4, r10, r3, r1)
            r5.setOnClickListener(r0)
            X.6d8 r0 = new X.6d8
            r0.<init>(r6, r4, r10)
            r5.setOnLongClickListener(r0)
            goto L_0x0070
        L_0x00e5:
            if (r9 == 0) goto L_0x00f4
            r0 = r8
            X.565 r0 = (X.AnonymousClass565) r0
            X.5zs r3 = r0.A00
            X.5IE r0 = X.AnonymousClass5IE.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 != 0) goto L_0x0102
        L_0x00f4:
            if (r7 == 0) goto L_0x0104
            java.lang.String r3 = r8.A00()
            java.lang.String r0 = "starred"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0104
        L_0x0102:
            r3 = 4
            goto L_0x00d4
        L_0x0104:
            int r3 = r4.A02
            goto L_0x00d4
        L_0x0107:
            boolean r0 = r4 instanceof X.AnonymousClass56B
            if (r0 != 0) goto L_0x0037
            boolean r0 = r4 instanceof X.AnonymousClass56A
            if (r0 != 0) goto L_0x0037
            boolean r0 = r4 instanceof X.AnonymousClass569
            if (r0 != 0) goto L_0x0037
            boolean r0 = r4 instanceof X.AnonymousClass56F
            if (r0 == 0) goto L_0x0128
            X.56F r4 = (X.AnonymousClass56F) r4
            android.view.View r1 = r4.A0H
            r0 = 33
            X.AnonymousClass3Y1.A00(r1, r4, r0)
            android.view.View r1 = r4.A00
            r0 = 34
        L_0x0124:
            X.AnonymousClass3Y1.A00(r1, r4, r0)
            return
        L_0x0128:
            boolean r0 = r4 instanceof X.AnonymousClass56H
            if (r0 == 0) goto L_0x0151
            X.56H r4 = (X.AnonymousClass56H) r4
            com.whatsapp.WaTextView r1 = r4.A02
            r0 = 2131894564(0x7f122124, float:1.9423936E38)
            r1.setText(r0)
            boolean r0 = r4.A05
            r1 = 2131894567(0x7f122127, float:1.9423942E38)
            if (r0 == 0) goto L_0x0140
            r1 = 2131894568(0x7f122128, float:1.9423944E38)
        L_0x0140:
            com.whatsapp.WaTextView r0 = r4.A01
            r0.setText(r1)
            android.view.View r1 = r4.A0H
            r0 = 36
            X.AnonymousClass3Y1.A00(r1, r4, r0)
            android.view.View r1 = r4.A00
            r0 = 35
            goto L_0x0124
        L_0x0151:
            boolean r0 = r4 instanceof X.AnonymousClass56E
            if (r0 == 0) goto L_0x0163
            X.56E r4 = (X.AnonymousClass56E) r4
            android.view.View r1 = r4.A0H
            r0 = 29
            X.AnonymousClass3Y1.A00(r1, r4, r0)
            android.view.View r1 = r4.A00
            r0 = 30
            goto L_0x0124
        L_0x0163:
            boolean r0 = r4 instanceof X.AnonymousClass56D
            if (r0 == 0) goto L_0x019e
            X.56D r4 = (X.AnonymousClass56D) r4
            java.lang.Object r7 = r2.A0L(r1)
            boolean r0 = r7 instanceof X.C1035455w
            if (r0 == 0) goto L_0x0037
            X.55w r7 = (X.C1035455w) r7
            if (r7 == 0) goto L_0x0037
            com.whatsapp.WaTextView r6 = r4.A00
            android.content.Context r5 = r6.getContext()
            r3 = 2131894594(0x7f122142, float:1.9423997E38)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r2 = r7.A01
            r0 = 0
            r1[r0] = r2
            X.C36341k9.A0s(r5, r6, r1, r3)
            r0 = 7
            X.C48902iF.A00(r6, r7, r4, r0)
            X.C33521fV.A02(r6)
            android.content.Context r1 = r6.getContext()
            r0 = 2131894595(0x7f122143, float:1.9424E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r2, r15, r0)
            r6.setContentDescription(r0)
            return
        L_0x019e:
            boolean r0 = r4 instanceof X.AnonymousClass56G
            if (r0 == 0) goto L_0x0037
            X.56G r4 = (X.AnonymousClass56G) r4
            java.lang.Object r1 = r2.A0L(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerGridViewItem.ShapeSticker"
            X.AnonymousClass00C.A0E(r1, r0)
            X.55u r1 = (X.C1035255u) r1
            X.6AC r3 = r1.A01
            X.6bL r2 = r2.A01
            android.view.View r1 = r4.A0H
            r0 = 15
            X.AnonymousClass3YG.A00(r1, r4, r3, r0)
            X.5x6 r6 = r4.A01
            X.6Ft r8 = r3.A01
            android.widget.ImageView r7 = r4.A00
            X.AnonymousClass00C.A07(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "shape_"
            java.lang.String r0 = X.C90464aC.A0W(r8, r0, r1)
            X.68s r5 = new X.68s
            r5.<init>(r0)
            java.lang.Object r0 = r7.getTag()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            r4 = 0
            if (r0 != 0) goto L_0x01e0
            r7.setImageDrawable(r4)
        L_0x01e0:
            r7.setTag(r5)
            java.util.HashMap r3 = r6.A03
            java.lang.Object r0 = r3.remove(r5)
            X.03e r0 = (X.C007403e) r0
            if (r0 == 0) goto L_0x01f0
            r0.B2S(r4)
        L_0x01f0:
            boolean r0 = r8.A0N()
            if (r0 == 0) goto L_0x01fd
            if (r2 == 0) goto L_0x01fd
            int r0 = r2.A01
            r8.A0G(r0)
        L_0x01fd:
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x020d
            if (r2 == 0) goto L_0x020d
            float r1 = r2.A00
            r0 = 2
            float r0 = (float) r0
            float r1 = r1 / r0
            r8.A0F(r1)
        L_0x020d:
            X.6BO r2 = new X.6BO
            r2.<init>(r7, r5, r8)
            X.040 r1 = r6.A00
            if (r1 != 0) goto L_0x0235
            X.00T r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            X.AnonymousClass00C.A08(r0)
            X.02o r1 = new X.02o
            r1.<init>(r0)
            X.03h r0 = new X.03h
            r0.<init>(r4)
            X.02h r0 = X.C008803t.A02(r1, r0)
            X.041 r1 = X.C009403z.A02(r0)
            r6.A00 = r1
        L_0x0235:
            com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1 r0 = new com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1
            r0.<init>(r2, r6, r4)
            X.0A6 r0 = X.C36391kE.A12(r0, r1)
            r3.put(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95834mM.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        if (i >= A0J()) {
            return 0;
        }
        Object A0L = A0L(i);
        if (A0L instanceof C1035155t) {
            return 0;
        }
        if (A0L instanceof C1035555x) {
            return 1;
        }
        if (A0L instanceof C1035355v) {
            return 2;
        }
        if (A0L instanceof C1034755o) {
            return 3;
        }
        if (A0L instanceof C1034855p) {
            return 4;
        }
        if (A0L instanceof C1034955q) {
            return 5;
        }
        if (A0L instanceof C1035255u) {
            return 6;
        }
        if (A0L instanceof AnonymousClass55r) {
            return 7;
        }
        if (A0L instanceof C1035055s) {
            return 8;
        }
        if (A0L instanceof C1035455w) {
            return 9;
        }
        throw C36441kJ.A18();
    }
}
