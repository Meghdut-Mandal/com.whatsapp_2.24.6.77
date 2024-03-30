package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.4mI  reason: invalid class name and case insensitive filesystem */
public final class C95794mI extends C02920Ck {
    public final StickerExpressionsFragment A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        int i2 = R.layout.f9nameremoved;
        if (i == 1) {
            i2 = R.layout.f9nameremoved;
        }
        return new C96824nx(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, i2));
    }

    public C95794mI(StickerExpressionsFragment stickerExpressionsFragment) {
        super((C02830Cb) new C95654ly());
        this.A00 = stickerExpressionsFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        if (((X.AnonymousClass566) r3).A00.A08 != false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r14, int r15) {
        /*
            r13 = this;
            X.4nx r14 = (X.C96824nx) r14
            r6 = 0
            X.AnonymousClass00C.A0D(r14, r6)
            java.lang.Object r7 = r13.A0L(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickers.packlist.StickerPackListViewData"
            X.AnonymousClass00C.A0E(r7, r0)
            X.68t r7 = (X.C1275568t) r7
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r5 = r13.A00
            boolean r4 = X.C36341k9.A1a(r7, r5)
            boolean r3 = r7 instanceof X.C1036956n
            java.lang.String r2 = "starred"
            java.lang.String r1 = "recent"
            if (r3 == 0) goto L_0x00f9
            r0 = r7
            X.56n r0 = (X.C1036956n) r0
            java.lang.String r0 = r0.A03
        L_0x0024:
            com.google.android.material.imageview.ShapeableImageView r8 = r14.A02
            if (r0 == 0) goto L_0x00f3
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r8.setImageURI(r0)
        L_0x002f:
            com.google.android.material.imageview.ShapeableImageView r11 = r14.A02
            boolean r12 = r7.A01()
            r11.setSelected(r12)
            android.view.View r10 = r14.A01
            r0 = 18
            X.AnonymousClass3YG.A00(r10, r5, r7, r0)
            com.whatsapp.WaImageView r8 = r14.A03
            r9 = 0
            int r0 = X.C36351kA.A00(r12)
            r8.setVisibility(r0)
            boolean r8 = r7 instanceof X.C1036856m
            if (r8 == 0) goto L_0x00cd
            r0 = r7
            X.56m r0 = (X.C1036856m) r0
            java.lang.String r0 = r0.A01
        L_0x0052:
            r11.setContentDescription(r0)
            boolean r0 = r7 instanceof X.C1037056o
            if (r0 == 0) goto L_0x0067
            android.view.View r3 = r14.A00
            r0 = r7
            X.56o r0 = (X.C1037056o) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0064
            r9 = 8
        L_0x0064:
            r3.setVisibility(r9)
        L_0x0067:
            if (r8 != 0) goto L_0x0082
            boolean r0 = r7 instanceof X.C1036756l
            if (r0 == 0) goto L_0x00c5
            X.5zp r3 = r7.A00()
            boolean r0 = r3 instanceof X.AnonymousClass566
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.StickerSection.Pack"
            X.AnonymousClass00C.A0E(r3, r0)
            X.566 r3 = (X.AnonymousClass566) r3
            X.68B r0 = r3.A00
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00c5
        L_0x0082:
            X.1RJ r0 = r14.A04
            r0.A03(r6)
        L_0x0087:
            X.5zp r7 = r7.A00()
            boolean r0 = r7 instanceof X.AnonymousClass568
            if (r0 == 0) goto L_0x016f
            r0 = r7
            X.568 r0 = (X.AnonymousClass568) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x016f
            android.content.Context r3 = X.C36441kJ.A0F(r14)
            r0 = 2131101065(0x7f060589, float:1.781453E38)
            int r0 = X.AnonymousClass00F.A00(r3, r0)
            r11.setColorFilter(r0)
            java.lang.String r3 = r7.A00()
            boolean r0 = X.AnonymousClass00C.A0J(r3, r1)
            if (r0 == 0) goto L_0x00b7
            X.3Y2 r0 = new X.3Y2
            r0.<init>(r5, r6)
        L_0x00b3:
            r10.setOnClickListener(r0)
            return
        L_0x00b7:
            boolean r0 = X.AnonymousClass00C.A0J(r3, r2)
            if (r0 == 0) goto L_0x00c3
            X.3Y2 r0 = new X.3Y2
            r0.<init>(r5, r4)
            goto L_0x00b3
        L_0x00c3:
            r0 = 0
            goto L_0x00b3
        L_0x00c5:
            X.1RJ r3 = r14.A04
            r0 = 8
            r3.A03(r0)
            goto L_0x0087
        L_0x00cd:
            boolean r0 = r7 instanceof X.C1036756l
            if (r0 == 0) goto L_0x00d8
            r0 = r7
            X.56l r0 = (X.C1036756l) r0
            java.lang.String r0 = r0.A01
            goto L_0x0052
        L_0x00d8:
            boolean r0 = r7 instanceof X.C1037056o
            if (r0 == 0) goto L_0x00e3
            r0 = r7
            X.56o r0 = (X.C1037056o) r0
            java.lang.String r0 = r0.A01
            goto L_0x0052
        L_0x00e3:
            if (r3 == 0) goto L_0x00ec
            r0 = r7
            X.56n r0 = (X.C1036956n) r0
            java.lang.String r0 = r0.A02
            goto L_0x0052
        L_0x00ec:
            r0 = r7
            X.56k r0 = (X.AnonymousClass56k) r0
            java.lang.String r0 = r0.A02
            goto L_0x0052
        L_0x00f3:
            r0 = 0
            r8.setImageDrawable(r0)
            goto L_0x002f
        L_0x00f9:
            boolean r0 = r7 instanceof X.AnonymousClass56k
            if (r0 == 0) goto L_0x014e
            com.google.android.material.imageview.ShapeableImageView r9 = r14.A02
            r0 = r7
            X.56k r0 = (X.AnonymousClass56k) r0
            int r0 = r0.A00
            r9.setImageResource(r0)
            boolean r0 = r7.A01()
            r8 = 2131101065(0x7f060589, float:1.781453E38)
            if (r0 == 0) goto L_0x0113
            r8 = 2131102668(0x7f060bcc, float:1.781778E38)
        L_0x0113:
            android.view.View r0 = r14.A0H
            int r0 = X.C36381kD.A05(r0, r8)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.AnonymousClass06T.A00(r0, r9)
            X.5zp r0 = r7.A00()
            java.lang.String r8 = r0.A00()
            boolean r0 = X.AnonymousClass00C.A0J(r8, r1)
            if (r0 != 0) goto L_0x0134
            boolean r0 = X.AnonymousClass00C.A0J(r8, r2)
            if (r0 == 0) goto L_0x002f
        L_0x0134:
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x002f
            android.content.res.Resources r8 = X.C36341k9.A0F(r9)
            r0 = 2131165368(0x7f0700b8, float:1.7944951E38)
            int r8 = r8.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            r0.width = r8
            X.C36411kG.A1A(r9, r8)
            goto L_0x002f
        L_0x014e:
            boolean r0 = r7 instanceof X.C1037056o
            if (r0 == 0) goto L_0x0159
            r0 = r7
            X.56o r0 = (X.C1037056o) r0
            java.lang.String r0 = r0.A02
            goto L_0x0024
        L_0x0159:
            boolean r0 = r7 instanceof X.C1036756l
            if (r0 == 0) goto L_0x0164
            r0 = r7
            X.56l r0 = (X.C1036756l) r0
            java.lang.String r0 = r0.A02
            goto L_0x0024
        L_0x0164:
            boolean r0 = r7 instanceof X.C1036856m
            if (r0 == 0) goto L_0x002f
            r0 = r7
            X.56m r0 = (X.C1036856m) r0
            java.lang.String r0 = r0.A02
            goto L_0x0024
        L_0x016f:
            r11.clearColorFilter()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794mI.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        Object A0L = A0L(i);
        if ((A0L instanceof C1036956n) || (A0L instanceof C1036756l) || (A0L instanceof C1037056o) || (A0L instanceof C1036856m)) {
            return 0;
        }
        if (A0L instanceof AnonymousClass56k) {
            return 1;
        }
        throw C36441kJ.A18();
    }
}
