package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.whatsapp.R;

/* renamed from: X.1qN  reason: invalid class name and case insensitive filesystem */
public class C38881qN extends PopupWindow {
    public int A00 = -1;
    public int A01 = -1;
    public final Resources A02;
    public final LinearLayout A03;
    public final C64913Px A04;
    public final AnonymousClass4QU A05;
    public final AnonymousClass1H2 A06;
    public final int[] A07;
    public final Context A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r9 == -1) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r6, int[] r7, int r8, int r9) {
        /*
            r5 = 0
            r4 = 1
            r1 = -1
            if (r8 == r1) goto L_0x0008
            r0 = 0
            if (r9 != r1) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C18740tg.A0C(r0)
            java.lang.String r3 = X.C63873Lt.A01(r7)
            r0 = 2
            if (r8 == r1) goto L_0x0023
            r2 = 2131889090(0x7f120bc2, float:1.9412834E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r8)
        L_0x001e:
            java.lang.String r0 = X.C36341k9.A0e(r6, r1, r0, r4, r2)
            return r0
        L_0x0023:
            if (r9 == r1) goto L_0x0031
            r2 = 2131889091(0x7f120bc3, float:1.9412836E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r9)
            goto L_0x001e
        L_0x0031:
            r0 = 2131889092(0x7f120bc4, float:1.9412838E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38881qN.A03(android.content.Context, int[], int, int):java.lang.String");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C38881qN(android.view.View r25, X.AnonymousClass4QU r26, X.AnonymousClass1H2 r27, int[] r28, boolean r29) {
        /*
            r24 = this;
            r2 = r25
            android.content.Context r0 = r2.getContext()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r0 = -2
            r3 = r24
            r3.<init>(r1, r0, r0)
            r0 = -1
            r3.A00 = r0
            r3.A01 = r0
            android.view.View r5 = r3.getContentView()
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r3.A03 = r5
            android.content.Context r7 = r2.getContext()
            r3.A08 = r7
            r6 = r27
            r3.A06 = r6
            android.content.res.Resources r0 = r7.getResources()
            r3.A02 = r0
            java.lang.Object r1 = r28.clone()
            int[] r1 = (int[]) r1
            int[] r4 = X.AnonymousClass3UO.A05(r28)
            X.3Px r0 = new X.3Px
            r0.<init>(r4)
            java.util.List r8 = r0.A01
            java.util.ArrayList r9 = X.C36361kB.A0r(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x0047:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C36381kD.A03(r0)
            if (r0 <= 0) goto L_0x0047
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r9.add(r0)
            goto L_0x0047
        L_0x0061:
            int r0 = r9.size()
            r13 = 2
            r9 = 0
            r4 = 1
            if (r0 != r13) goto L_0x008e
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x019d
            java.lang.Object r0 = r8.get(r9)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C36381kD.A03(r0)
        L_0x007a:
            r3.A00 = r0
            int r0 = r8.size()
            if (r4 >= r0) goto L_0x019a
            java.lang.Object r0 = r8.get(r4)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C36381kD.A03(r0)
        L_0x008c:
            r3.A01 = r0
        L_0x008e:
            int[] r0 = X.AnonymousClass3UO.A07(r1)
            r3.A07 = r0
            int[] r1 = X.AnonymousClass3UO.A05(r0)
            X.3Px r0 = new X.3Px
            r0.<init>(r1)
            r3.A04 = r0
            r0 = r26
            r3.A05 = r0
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r8 = X.C21060yb.A02(r7, r0)
            android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
            X.C18740tg.A06(r8)
            r0 = 2131625569(0x7f0e0661, float:1.887835E38)
            r8.inflate(r0, r5, r4)
            r5.setOrientation(r4)
            r0 = 2131434117(0x7f0b1a85, float:1.8490039E38)
            android.view.ViewGroup r7 = X.C36411kG.A0P(r5, r0)
            X.C18740tg.A04(r7)
            int[] r17 = X.AnonymousClass3UO.A05
            r0 = r17[r9]
            android.graphics.drawable.BitmapDrawable r5 = r3.A01(r0)
            if (r5 != 0) goto L_0x018b
            r10 = 0
        L_0x00cc:
            r3.A0A = r10
            r0 = r17[r9]
            android.graphics.drawable.BitmapDrawable r5 = r3.A02(r0)
            if (r5 != 0) goto L_0x017c
            r0 = 0
        L_0x00d7:
            r3.A0B = r0
            X.C18740tg.A06(r10)
            X.C18740tg.A06(r0)
            X.3Px r0 = r3.A04
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r9)
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = X.C129276Gg.A01(r0)
            X.2M9 r11 = new X.2M9
            r11.<init>(r0)
            long r0 = X.C1898996a.A00(r11, r9)
            X.1H2 r10 = r3.A06
            android.content.res.Resources r5 = r3.A02
            android.graphics.drawable.BitmapDrawable r0 = r10.A05(r5, r11, r0)
            r3.A09 = r0
            r11 = 5
            java.util.ArrayList r12 = X.C36441kJ.A14(r11)
            r10 = 0
        L_0x0106:
            r0 = 3
            if (r10 >= r11) goto L_0x01a0
            r5 = r17[r10]
            r1 = 2131625570(0x7f0e0662, float:1.8878352E38)
            android.view.View r1 = r8.inflate(r1, r7, r9)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.BitmapDrawable r16 = r3.A01(r5)
            X.C18740tg.A06(r16)
            android.graphics.drawable.Drawable r14 = r3.A09
            if (r14 != 0) goto L_0x0171
            android.graphics.drawable.Drawable[] r15 = new android.graphics.drawable.Drawable[r13]
            r15[r9] = r16
            android.graphics.drawable.Drawable r0 = r3.A0B
            r15[r4] = r0
        L_0x0127:
            android.content.Context r14 = r3.A08
            int[] r4 = r3.A07
            r0 = -1
            java.lang.String r4 = A03(r14, r4, r5, r0)
            android.content.res.Resources r14 = r3.A02
            android.graphics.Bitmap r15 = X.C54202sZ.A00(r15)
            if (r15 == 0) goto L_0x016f
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r14, r15)
        L_0x013d:
            r1.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            r1.setContentDescription(r4)
            int r0 = r3.A00
            boolean r0 = X.AnonymousClass000.A1S(r5, r0)
            r1.setSelected(r0)
            X.2iA r0 = new X.2iA
            r23 = 0
            r22 = r5
            r19 = r3
            r20 = r12
            r21 = r1
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r1.setOnClickListener(r0)
            r7.addView(r1)
            r12.add(r1)
            int r10 = r10 + 1
            r4 = 1
            goto L_0x0106
        L_0x016f:
            r0 = 0
            goto L_0x013d
        L_0x0171:
            android.graphics.drawable.Drawable[] r15 = new android.graphics.drawable.Drawable[r0]
            r15[r9] = r16
            android.graphics.drawable.Drawable r0 = r3.A0B
            r15[r4] = r0
            r15[r13] = r14
            goto L_0x0127
        L_0x017c:
            android.widget.LinearLayout r0 = r3.A03
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131100347(0x7f0602bb, float:1.7813073E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A06(r1, r5, r0)
            goto L_0x00d7
        L_0x018b:
            android.widget.LinearLayout r0 = r3.A03
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131100347(0x7f0602bb, float:1.7813073E38)
            android.graphics.drawable.Drawable r10 = X.AnonymousClass3UF.A06(r1, r5, r0)
            goto L_0x00cc
        L_0x019a:
            r0 = -1
            goto L_0x008c
        L_0x019d:
            r0 = -1
            goto L_0x007a
        L_0x01a0:
            java.util.ArrayList r12 = X.C36441kJ.A14(r11)
            r10 = 0
        L_0x01a5:
            r5 = r17[r10]
            r1 = 2131625570(0x7f0e0662, float:1.8878352E38)
            android.view.View r4 = r8.inflate(r1, r7, r9)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.graphics.drawable.BitmapDrawable r15 = r3.A02(r5)
            X.C18740tg.A06(r15)
            android.graphics.drawable.Drawable r14 = r3.A09
            if (r14 != 0) goto L_0x0268
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r13]
            android.graphics.drawable.Drawable r0 = r3.A0A
            r13[r9] = r0
            r1 = 1
            r13[r1] = r15
        L_0x01c4:
            android.content.Context r15 = r3.A08
            int[] r14 = r3.A07
            r0 = -1
            java.lang.String r14 = A03(r15, r14, r0, r5)
            android.content.res.Resources r15 = r3.A02
            android.graphics.Bitmap r13 = X.C54202sZ.A00(r13)
            if (r13 == 0) goto L_0x0265
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r15, r13)
        L_0x01da:
            r4.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r4.setScaleType(r0)
            r4.setContentDescription(r14)
            int r0 = r3.A01
            boolean r0 = X.AnonymousClass000.A1S(r5, r0)
            r4.setSelected(r0)
            X.2iA r0 = new X.2iA
            r23 = 1
            r22 = r5
            r19 = r3
            r20 = r12
            r21 = r4
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r4.setOnClickListener(r0)
            r7.addView(r4)
            r12.add(r4)
            int r10 = r10 + 1
            r0 = 3
            r13 = 2
            if (r10 < r11) goto L_0x01a5
            android.widget.LinearLayout r4 = r3.A03
            r0 = 2131429432(0x7f0b0838, float:1.8480537E38)
            android.widget.ImageView r5 = X.C36391kE.A0N(r4, r0)
            X.C18740tg.A04(r5)
            android.content.res.Resources r7 = r2.getResources()
            r10 = -1
            int[] r4 = r3.A07
            X.2M9 r0 = new X.2M9
            r0.<init>(r4)
            r9 = 1065353216(0x3f800000, float:1.0)
            r8 = r0
            android.graphics.drawable.Drawable r0 = r6.A06(r7, r8, r9, r10)
            r5.setImageDrawable(r0)
            int[] r0 = r3.A07
            java.lang.String r0 = X.C63873Lt.A01(r0)
            r5.setContentDescription(r0)
            X.C48732hx.A00(r5, r3, r1)
            A04(r3)
            android.widget.LinearLayout r0 = r3.A03
            r0.setFocusableInTouchMode(r1)
            android.widget.LinearLayout r0 = r3.A03
            r0.setFocusable(r1)
            android.widget.LinearLayout r0 = r3.A03
            X.C36331k8.A0x(r0)
            r0 = r29
            android.graphics.drawable.Drawable r0 = X.C36401kF.A0B(r2, r3, r0)
            r3.setBackgroundDrawable(r0)
            android.widget.LinearLayout r0 = r3.A03
            r0.requestFocus()
            android.view.ViewParent r0 = r2.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            return
        L_0x0265:
            r0 = 0
            goto L_0x01da
        L_0x0268:
            r1 = 1
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r0]
            android.graphics.drawable.Drawable r0 = r3.A0A
            r13[r9] = r0
            X.C36411kG.A1Q(r15, r14, r13, r1)
            goto L_0x01c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38881qN.<init>(android.view.View, X.4QU, X.1H2, int[], boolean):void");
    }

    private BitmapDrawable A01(int i) {
        C64913Px A002 = this.A04.A00(1, i);
        String str = AnonymousClass3PG.A00;
        AnonymousClass2M9 r4 = new AnonymousClass2M9(A002.A01());
        return this.A06.A05(this.A02, r4, C1898996a.A00(r4, false));
    }

    private BitmapDrawable A02(int i) {
        C64913Px A002 = this.A04.A00(2, i);
        String str = AnonymousClass3PG.A00;
        AnonymousClass2M9 r4 = new AnonymousClass2M9(A002.A01());
        return this.A06.A05(this.A02, r4, C1898996a.A00(r4, false));
    }

    public static void A04(C38881qN r7) {
        Drawable A012;
        Drawable A022;
        BitmapDrawable bitmapDrawable;
        String A032;
        int i;
        ImageView A0N = C36391kE.A0N(r7.A03, R.id.selected_emoji);
        C18740tg.A04(A0N);
        Drawable drawable = r7.A09;
        int i2 = 2;
        if (drawable != null) {
            i2 = 3;
        }
        Drawable[] drawableArr = new Drawable[i2];
        int i3 = r7.A00;
        if (i3 == -1) {
            A012 = r7.A0A;
        } else {
            A012 = r7.A01(i3);
        }
        drawableArr[0] = A012;
        int i4 = r7.A01;
        if (i4 == -1) {
            A022 = r7.A0B;
        } else {
            A022 = r7.A02(i4);
        }
        drawableArr[1] = A022;
        if (drawable != null) {
            drawableArr[2] = drawable;
        }
        Resources resources = r7.A02;
        Bitmap A002 = C54202sZ.A00(drawableArr);
        if (A002 != null) {
            bitmapDrawable = new BitmapDrawable(resources, A002);
        } else {
            bitmapDrawable = null;
        }
        A0N.setImageDrawable(bitmapDrawable);
        A0N.setBackgroundResource(R.drawable.multi_skin_tone_emoji_selector);
        int i5 = r7.A00;
        if (i5 == -1 || (i = r7.A01) == -1) {
            A0N.setOnClickListener((View.OnClickListener) null);
            A032 = A03(r7.A08, r7.A07, r7.A00, r7.A01);
        } else {
            int[] A013 = r7.A04.A00(1, i5).A00(2, i).A01();
            A0N.setOnClickListener(new C48932iI(A013, r7, A0N, 0));
            A032 = C63873Lt.A01(A013);
        }
        A0N.setContentDescription(A032);
    }

    public static int A00(int i) {
        switch (i) {
            case 127995:
                return R.string.f12nameremoved;
            case 127996:
                return R.string.f12nameremoved;
            case 127997:
                return R.string.f12nameremoved;
            case 127998:
                return R.string.f12nameremoved;
            case 127999:
                return R.string.f12nameremoved;
            default:
                throw AnonymousClass000.A0d("Invalid skin tone: ", AnonymousClass000.A0u(), i);
        }
    }
}
