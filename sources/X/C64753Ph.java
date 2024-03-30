package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3Ph  reason: invalid class name and case insensitive filesystem */
public class C64753Ph {
    public float A00;
    public int A01 = -1;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public RelativeLayout A06;
    public AnonymousClass2bU A07;
    public final LinearLayout A08;
    public final C65633Sw A09;
    public final StickerView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final /* synthetic */ AnonymousClass2IM A0D;

    public C64753Ph(LinearLayout linearLayout, AnonymousClass2IM r21) {
        AnonymousClass2IM r4 = r21;
        this.A0D = r4;
        LinearLayout linearLayout2 = linearLayout;
        this.A0A = (StickerView) linearLayout2.findViewById(R.id.sticker_image);
        this.A0C = C36391kE.A0P(linearLayout2, R.id.date);
        this.A0B = C36391kE.A0N(linearLayout2, R.id.status);
        C20810yC r11 = r4.A0G;
        AnonymousClass1XY r7 = r4.A0U;
        AnonymousClass1X4 r8 = r4.A0Z;
        C23981Ap r14 = r4.A03;
        C18820ts r10 = r4.A0E;
        AnonymousClass17Y r6 = r4.A0R;
        C19770wU r3 = r4.A21;
        AnonymousClass1SV r1 = r4.A1y;
        this.A09 = new C65633Sw(linearLayout2, r6, r7, r8, r4.A00, r10, r11, r4.A01, r4.A02, r14, r4.A04, r4.A05, r1, r3);
        this.A08 = C36441kJ.A0U(linearLayout2, R.id.date_wrapper);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        LinearLayout.LayoutParams A0N = C36371kC.A0N();
        A0N.gravity = 8388613;
        AnonymousClass2IM r32 = this.A0D;
        A0N.topMargin = -C36411kG.A05(r32);
        boolean A1Y = C36351kA.A1Y(r32.A0E);
        int A052 = C36411kG.A05(r32);
        if (A1Y) {
            A0N.rightMargin = A052;
        } else {
            A0N.leftMargin = A052;
        }
        if (this.A06 == null) {
            RelativeLayout relativeLayout = new RelativeLayout(r32.getContext());
            this.A06 = relativeLayout;
            linearLayout2.addView(relativeLayout, A0N);
            this.A06.bringToFront();
        }
    }

    public static void A00(C64753Ph r4) {
        View view = r4.A02;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        C37481mR r1 = new C37481mR(r4.A0D.getContext(), r4);
        r4.A02 = r1;
        r1.setClickable(true);
        C66953Xy.A00(r4.A02, r4, 45);
        ((ViewGroup) r4.A0A.getParent()).addView(r4.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r5 == -1) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass2bU r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r2 = r20
            r0.A07 = r2
            X.2IM r1 = r0.A0D
            boolean r5 = X.C37541mm.A07(r1)
            android.view.View r3 = r1.A08
            r4 = -2
            if (r5 == 0) goto L_0x0012
            r4 = -1
        L_0x0012:
            X.C36411kG.A19(r3, r4)
            android.view.View r3 = r1.A07
            X.C36411kG.A19(r3, r4)
            X.4Uw r7 = r1.A0c
            if (r7 == 0) goto L_0x02a7
            boolean r3 = r7.BK6()
            if (r3 == 0) goto L_0x02a7
            A00(r0)
            android.view.View r4 = r0.A02
            boolean r3 = r7.BMT(r2)
            r4.setSelected(r3)
        L_0x0030:
            r3 = 0
            if (r20 == 0) goto L_0x02ae
            r9 = r21
            if (r21 == 0) goto L_0x0050
            r8 = 0
            if (r7 == 0) goto L_0x004c
            boolean r8 = r7.BNW(r2)
            X.3Sw r4 = r0.A09
            com.whatsapp.stickers.StickerView r6 = r4.A0G
            if (r8 == 0) goto L_0x02a3
            r5 = 1
            X.4Vl r4 = new X.4Vl
            r4.<init>(r0, r2, r5)
            r6.A01 = r4
        L_0x004c:
            X.3Sw r4 = r0.A09
            r4.A02 = r8
        L_0x0050:
            X.3Sw r4 = r0.A09
            r18 = r4
            r5 = r2
            X.2bx r5 = (X.C46962bx) r5
            r4.A05(r3, r5, r9)
            X.2bU r11 = r0.A07
            int r5 = r0.A01
            if (r7 == 0) goto L_0x0264
            X.3Tm r6 = r1.A0A
            int r4 = r7.getContainerType()
            boolean r4 = r6.A05(r11, r4)
            if (r4 == 0) goto L_0x0264
            X.1Xg r6 = r1.A0a
            r4 = 56
            r6.A01(r11, r3, r4)
            X.4Uq r9 = r11.A0J
            X.3Kx r7 = r1.A1T(r11)
            X.3Tm r10 = r1.A0A
            android.widget.RelativeLayout r8 = r0.A06
            if (r9 != 0) goto L_0x008a
            X.0wQ r6 = r1.A0T
            java.util.List r4 = java.util.Collections.emptyList()
            X.3cm r9 = new X.3cm
            r9.<init>(r6, r4)
        L_0x008a:
            boolean r17 = r1.A1F()
            X.4Ux r14 = r1.getRowCustomizer()
            r4 = 28
            if (r5 == r4) goto L_0x009a
            r4 = -1
            r13 = 0
            if (r5 != r4) goto L_0x009b
        L_0x009a:
            r13 = 1
        L_0x009b:
            r4 = 5
            X.3v9 r12 = new X.3v9
            r12.<init>(r0, r11, r4)
            r4 = 6
            X.3v9 r6 = new X.3v9
            r6.<init>(r0, r11, r4)
            X.3wM r5 = X.C81033wM.A00
            r4 = 0
            X.C36341k9.A1E(r8, r4, r14)
            r4 = 7
            X.AnonymousClass00C.A0D(r5, r4)
            X.C65793Tm.A01(r8, r9, r10, r11, r12, r13)
            X.C65793Tm.A03(r8, r10, r7, r6)
            r12 = r8
            r13 = r10
            r15 = r11
            r16 = r5
            X.C65793Tm.A02(r12, r13, r14, r15, r16, r17)
        L_0x00bf:
            X.3Qj r13 = X.AnonymousClass2bU.A00(r2)
            android.widget.TextView r6 = r0.A0C
            X.0ts r5 = r1.A0E
            X.0wo r4 = r1.A19
            X.AnonymousClass3T1.A07(r6, r4, r5, r2)
            android.widget.LinearLayout r12 = r0.A08
            if (r12 == 0) goto L_0x01f6
            boolean r14 = r2.A15
            r16 = 3
            r11 = 4
            r10 = 16
            r9 = 8
            r8 = 2
            r7 = 1
            r6 = -2
            r5 = 0
            android.widget.ImageView r4 = r0.A05
            if (r14 == 0) goto L_0x025d
            if (r4 != 0) goto L_0x011a
            android.widget.ImageView r4 = X.C36361kB.A0L(r1)
            r0.A05 = r4
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r6, r6)
            r14.gravity = r10
            android.widget.ImageView r4 = r0.A05
            r4.setLayoutParams(r14)
            X.0ts r15 = r1.A0E
            android.widget.ImageView r14 = r0.A05
            int r4 = X.C36371kC.A02(r1)
            X.AnonymousClass1JZ.A05(r14, r15, r5, r4)
            android.widget.ImageView r14 = r0.A05
            android.view.View[] r15 = new android.view.View[r11]
            r15[r5] = r14
            android.widget.ImageView r4 = r0.A03
            r15[r7] = r4
            android.widget.ImageView r4 = r0.A04
            r15[r8] = r4
            r15[r16] = r3
            int r4 = X.C63773Lj.A00(r15, r5)
            r12.addView(r14, r4)
            r12.setClipChildren(r5)
        L_0x011a:
            android.widget.ImageView r4 = r0.A05
            r17 = r4
            android.content.Context r15 = r1.getContext()
            X.AnonymousClass00C.A0D(r15, r5)
            r14 = 2131233199(0x7f0809af, float:1.8082529E38)
            r4 = 2131101682(0x7f0607f2, float:1.781578E38)
            android.graphics.drawable.Drawable r14 = X.AnonymousClass3UF.A02(r15, r14, r4)
            r4 = r17
            r4.setImageDrawable(r14)
            android.widget.ImageView r4 = r0.A05
            r4.setVisibility(r5)
        L_0x0139:
            boolean r14 = X.C65453Sc.A03(r2)
            android.widget.ImageView r4 = r0.A03
            if (r14 == 0) goto L_0x0256
            if (r4 != 0) goto L_0x017a
            android.widget.ImageView r4 = X.C36361kB.A0L(r1)
            r0.A03 = r4
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r6, r6)
            r14.gravity = r10
            android.widget.ImageView r4 = r0.A03
            r4.setLayoutParams(r14)
            X.0ts r15 = r1.A0E
            android.widget.ImageView r14 = r0.A03
            int r4 = X.C36371kC.A02(r1)
            X.AnonymousClass1JZ.A05(r14, r15, r5, r4)
            android.widget.ImageView r14 = r0.A03
            android.view.View[] r15 = new android.view.View[r11]
            android.widget.ImageView r4 = r0.A05
            r15[r5] = r4
            r15[r7] = r14
            android.widget.ImageView r4 = r0.A04
            r15[r8] = r4
            r15[r16] = r3
            int r4 = X.C63773Lj.A00(r15, r7)
            r12.addView(r14, r4)
            r12.setClipChildren(r5)
        L_0x017a:
            android.widget.ImageView r4 = r0.A03
            r17 = r4
            android.content.Context r15 = r1.getContext()
            X.AnonymousClass00C.A0D(r15, r5)
            r14 = 2131233060(0x7f080924, float:1.8082247E38)
            r4 = 2131101682(0x7f0607f2, float:1.781578E38)
            android.graphics.drawable.Drawable r14 = X.AnonymousClass3UF.A02(r15, r14, r4)
            r4 = r17
            r4.setImageDrawable(r14)
            android.widget.ImageView r4 = r0.A03
            r4.setVisibility(r5)
        L_0x0199:
            X.5J2 r4 = r2.A1V
            if (r4 != 0) goto L_0x0252
            r14 = 0
        L_0x019e:
            android.widget.ImageView r4 = r0.A04
            if (r14 != r7) goto L_0x024c
            if (r4 != 0) goto L_0x01db
            android.widget.ImageView r4 = X.C36361kB.A0L(r1)
            r0.A04 = r4
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r6, r6)
            r9.gravity = r10
            android.widget.ImageView r4 = r0.A04
            r4.setLayoutParams(r9)
            X.0ts r9 = r1.A0E
            android.widget.ImageView r6 = r0.A04
            int r4 = X.C36371kC.A02(r1)
            X.AnonymousClass1JZ.A05(r6, r9, r5, r4)
            android.widget.ImageView r9 = r0.A04
            android.view.View[] r6 = new android.view.View[r11]
            android.widget.ImageView r4 = r0.A05
            r6[r5] = r4
            android.widget.ImageView r4 = r0.A03
            r6[r7] = r4
            r6[r8] = r9
            r6[r16] = r3
            int r4 = X.C63773Lj.A00(r6, r8)
            r12.addView(r9, r4)
            r12.setClipChildren(r5)
        L_0x01db:
            android.widget.ImageView r8 = r0.A04
            android.content.Context r7 = r1.getContext()
            X.AnonymousClass00C.A0D(r7, r5)
            r6 = 2131234374(0x7f080e46, float:1.8084912E38)
            r4 = 2131101682(0x7f0607f2, float:1.781578E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass3UF.A02(r7, r6, r4)
            r8.setImageDrawable(r4)
            android.widget.ImageView r4 = r0.A04
            r4.setVisibility(r5)
        L_0x01f6:
            X.3Qa r7 = r2.A1J
            boolean r6 = r7.A02
            if (r6 == 0) goto L_0x021c
            android.widget.ImageView r8 = r0.A0B
            if (r8 == 0) goto L_0x021c
            int r4 = r2.A0D
            int r5 = r1.A1Q(r4)
            int r4 = r2.A0D
            int r4 = r1.A1R(r4)
            if (r4 == 0) goto L_0x0216
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = X.AnonymousClass00F.A04(r1, r4)
        L_0x0216:
            X.AnonymousClass06T.A00(r3, r8)
            r8.setImageResource(r5)
        L_0x021c:
            boolean r1 = r13.A0f
            if (r1 == 0) goto L_0x022e
            boolean r1 = r13.A0d
            if (r1 != 0) goto L_0x022e
            r18.A03()
        L_0x0227:
            com.whatsapp.stickers.StickerView r3 = r0.A0A
            r1 = 6
            X.AnonymousClass4Y7.A00(r3, r0, r2, r1)
            return
        L_0x022e:
            boolean r1 = r13.A0V
            if (r1 == 0) goto L_0x0238
            boolean r1 = r13.A0c
            if (r1 == 0) goto L_0x0244
            if (r6 != 0) goto L_0x0244
        L_0x0238:
            boolean r1 = r2.A10
            if (r1 == 0) goto L_0x0248
            if (r6 == 0) goto L_0x0248
            X.11F r1 = r7.A00
            boolean r1 = r1 instanceof X.C177618e5
            if (r1 != 0) goto L_0x0248
        L_0x0244:
            r18.A04()
            goto L_0x0227
        L_0x0248:
            r18.A02()
            goto L_0x0227
        L_0x024c:
            if (r4 == 0) goto L_0x01f6
            r4.setVisibility(r9)
            goto L_0x01f6
        L_0x0252:
            int r14 = r4.A00
            goto L_0x019e
        L_0x0256:
            if (r4 == 0) goto L_0x0199
            r4.setVisibility(r9)
            goto L_0x0199
        L_0x025d:
            if (r4 == 0) goto L_0x0139
            r4.setVisibility(r9)
            goto L_0x0139
        L_0x0264:
            android.widget.RelativeLayout r8 = r0.A06
            if (r8 == 0) goto L_0x00bf
            X.3Tm r10 = r1.A0A
            X.0wQ r5 = r1.A0T
            java.util.List r4 = java.util.Collections.emptyList()
            X.3cm r9 = new X.3cm
            r9.<init>(r5, r4)
            boolean r17 = r1.A1F()
            r7 = 1
            X.4Ux r14 = r1.getRowCustomizer()
            r6 = 3
            X.3v9 r12 = new X.3v9
            r12.<init>(r0, r11, r6)
            r4 = 4
            X.3v9 r5 = new X.3v9
            r5.<init>(r0, r11, r4)
            X.3wL r4 = X.C81023wL.A00
            r13 = 0
            X.AnonymousClass00C.A0D(r11, r7)
            X.C36381kD.A1K(r14, r6, r4)
            X.C65793Tm.A01(r8, r9, r10, r11, r12, r13)
            X.C65793Tm.A03(r8, r10, r3, r5)
            r12 = r8
            r13 = r10
            r15 = r11
            r16 = r4
            X.C65793Tm.A02(r12, r13, r14, r15, r16, r17)
            goto L_0x00bf
        L_0x02a3:
            r6.A01 = r3
            goto L_0x004c
        L_0x02a7:
            android.view.View r3 = r0.A02
            X.C36341k9.A0y(r3)
            goto L_0x0030
        L_0x02ae:
            com.whatsapp.stickers.StickerView r0 = r0.A0A
            r0.setImageDrawable(r3)
            r0.setOnLongClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64753Ph.A01(X.2bU, boolean):void");
    }
}
