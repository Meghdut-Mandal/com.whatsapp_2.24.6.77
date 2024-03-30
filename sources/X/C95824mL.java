package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mL  reason: invalid class name and case insensitive filesystem */
public final class C95824mL extends C02920Ck {
    public AnonymousClass1AP A00;
    public C19770wU A01;
    public boolean A02;
    public final AnonymousClass17Y A03;
    public final C20810yC A04;
    public final C63563Kn A05;
    public final AnonymousClass3XM A06;
    public final AnonymousClass1HA A07;
    public final List A08 = AnonymousClass001.A0I();
    public final C006302t A09;
    public final C006302t A0A;
    public final C006302t A0B;
    public final C009003v A0C;
    public final C019408g A0D;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0J = C36341k9.A0J(viewGroup, 0);
        int i2 = R.layout.f9nameremoved;
        if (i == 1) {
            i2 = R.layout.f9nameremoved;
        }
        return new C96844nz(C36371kC.A0J(A0J, viewGroup, i2, false), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
        r12 = (X.AnonymousClass56V) r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r17, int r18) {
        /*
            r16 = this;
            r2 = r17
            X.4nz r2 = (X.C96844nz) r2
            r8 = 0
            X.AnonymousClass00C.A0D(r2, r8)
            r0 = r16
            r14 = r18
            java.lang.Object r12 = r0.A0L(r14)
            X.5b9 r12 = (X.C110735b9) r12
            if (r12 == 0) goto L_0x0058
            boolean r0 = r12 instanceof X.AnonymousClass56U
            if (r0 == 0) goto L_0x005b
            X.56U r12 = (X.AnonymousClass56U) r12
            android.view.View r6 = r2.A03
            r0 = 2131433022(0x7f0b163e, float:1.8487818E38)
            android.view.View r5 = X.C012005e.A02(r6, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.AnonymousClass00C.A0E(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.4mL r4 = r2.A05
            java.lang.String r3 = r12.A01
            r5.setText(r3)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x0059
            r1 = 2131889726(0x7f120e3e, float:1.9414124E38)
            r0 = 1
            java.lang.String r1 = X.C36351kA.A0w(r2, r3, r0, r1)
        L_0x003f:
            r0 = 17
            X.AnonymousClass3YG.A00(r5, r4, r12, r0)
            r5.setText(r1)
            r0 = 2131428847(0x7f0b05ef, float:1.847935E38)
            android.view.View r1 = X.C012005e.A02(r6, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaImageView"
            X.AnonymousClass00C.A0E(r1, r0)
            r0 = 16
            X.AnonymousClass3YG.A00(r1, r4, r12, r0)
        L_0x0058:
            return
        L_0x0059:
            r1 = 0
            goto L_0x003f
        L_0x005b:
            android.view.View r1 = r2.A03
            r0 = 2131434079(0x7f0b1a5f, float:1.8489962E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r2.A00 = r0
            r0 = 2131430442(0x7f0b0c2a, float:1.8482585E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            com.whatsapp.stickers.StickerView r1 = (com.whatsapp.stickers.StickerView) r1
            r2.A01 = r1
            boolean r0 = r12 instanceof X.AnonymousClass56W
            if (r0 != 0) goto L_0x00ec
            X.56V r12 = (X.AnonymousClass56V) r12
            X.6c4 r9 = r12.A02
            if (r9 == 0) goto L_0x00ec
            int r0 = r18 + 1
            java.lang.String r7 = java.lang.String.valueOf(r0)
            X.4mL r11 = r2.A05
            int r0 = r11.A0J()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            X.3XM r0 = r11.A06
            r1 = 0
            if (r0 == 0) goto L_0x0096
            java.lang.String r5 = r0.A02
            if (r5 != 0) goto L_0x0098
        L_0x0096:
            java.lang.String r5 = ""
        L_0x0098:
            com.whatsapp.stickers.StickerView r0 = r2.A01
            if (r0 == 0) goto L_0x00b3
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto L_0x00b3
            r3 = 2131894593(0x7f122141, float:1.9423995E38)
            java.lang.Object[] r1 = X.C36441kJ.A1Q()
            r1[r8] = r7
            r0 = 1
            X.C36411kG.A1Q(r6, r5, r1, r0)
            java.lang.String r1 = r4.getString(r3, r1)
        L_0x00b3:
            com.whatsapp.stickers.StickerView r0 = r2.A01
            if (r0 == 0) goto L_0x00ba
            r0.setContentDescription(r1)
        L_0x00ba:
            com.whatsapp.stickers.StickerView r0 = r2.A01
            if (r0 == 0) goto L_0x00c8
            r15 = 2
            X.6cs r10 = new X.6cs
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r0.setOnClickListener(r10)
        L_0x00c8:
            com.whatsapp.stickers.StickerView r1 = r2.A01
            if (r1 == 0) goto L_0x00d4
            X.6d9 r0 = new X.6d9
            r0.<init>(r11, r12, r9, r14)
            r1.setOnLongClickListener(r0)
        L_0x00d4:
            boolean r0 = r12.A04
            com.whatsapp.stickers.StickerView r8 = r2.A01
            if (r8 == 0) goto L_0x0058
            X.1HA r7 = r11.A07
            int r11 = r9.A03
            int r12 = r9.A02
            r13 = r0 ^ 1
            X.6z0 r10 = new X.6z0
            r10.<init>(r2, r0)
            r14 = 0
            r7.A09(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x00ec:
            if (r1 == 0) goto L_0x00f6
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1
            r1.A02 = r0
        L_0x00f6:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A00
            if (r0 == 0) goto L_0x0058
            r0.setVisibility(r8)
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95824mL.BSE(X.0D3, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95824mL(AnonymousClass17Y r5, C20810yC r6, C63563Kn r7, AnonymousClass3XM r8, AnonymousClass1HA r9, AnonymousClass1AP r10, C19770wU r11, C006302t r12, C006302t r13, C006302t r14, C009003v r15, C019408g r16) {
        super((C02830Cb) new C95644lx());
        C36321k7.A11(r6, r5, r11);
        AnonymousClass00C.A0D(r7, 4);
        C36341k9.A1F(r10, r9);
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r11;
        this.A05 = r7;
        this.A00 = r10;
        this.A07 = r9;
        this.A06 = r8;
        this.A0B = r12;
        this.A0D = r16;
        this.A0C = r15;
        this.A09 = r13;
        this.A0A = r14;
        int i = 0;
        do {
            this.A08.add(AnonymousClass56W.A00);
            i++;
        } while (i < 4);
    }

    public int getItemViewType(int i) {
        return A0L(i) instanceof AnonymousClass56U ? 1 : 0;
    }
}
