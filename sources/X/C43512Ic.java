package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2Ic  reason: invalid class name and case insensitive filesystem */
public class C43512Ic extends C38721pd {
    public int A00;
    public int A01;
    public int A02;
    public C18820ts A03;
    public C20810yC A04;
    public C64633Ov A05;
    public List A06;
    public List A07;
    public boolean A08 = true;
    public boolean A09 = false;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C88944Uq A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r7.BGT() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C88944Uq r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r4 = r17
            r0 = r19
            r4.A0B = r0
            r0 = r20
            r4.A0D = r0
            X.4Uq r7 = r4.A0E
            if (r7 == 0) goto L_0x0015
            int r1 = r7.BGT()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r4.A0C = r0
            X.0yC r1 = r4.A04
            java.lang.String[] r0 = X.C65753Ti.A03
            r0 = 2378(0x94a, float:3.332E-42)
            boolean r0 = r1.A0E(r0)
            r6 = 3
            if (r0 == 0) goto L_0x0026
            r6 = 4
        L_0x0026:
            r8 = r18
            if (r18 != 0) goto L_0x0094
            r5 = 0
            r0 = 0
        L_0x002c:
            r4.A0E = r0
            java.util.List r10 = r4.A07
            if (r10 == 0) goto L_0x00e2
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00e2
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            if (r5 == 0) goto L_0x00e3
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00e3
            r6 = 0
        L_0x0045:
            int r0 = r5.size()
            if (r6 >= r0) goto L_0x00e3
            java.lang.String r3 = X.C36421kH.A0e(r5, r6)
            r2 = 0
            if (r18 == 0) goto L_0x005a
            X.3uy r0 = r8.B8N(r3)
            if (r0 == 0) goto L_0x005a
            int r2 = r0.A00
        L_0x005a:
            r1 = 0
            if (r7 == 0) goto L_0x0065
            X.3uy r0 = r7.B8N(r3)
            if (r0 == 0) goto L_0x0065
            int r1 = r0.A00
        L_0x0065:
            if (r2 <= r1) goto L_0x0071
            java.lang.Object r3 = r5.get(r6)
        L_0x006b:
            r9.add(r3)
        L_0x006e:
            int r6 = r6 + 1
            goto L_0x0045
        L_0x0071:
            r2 = 0
            if (r18 == 0) goto L_0x007e
            X.3uy r0 = r8.B8N(r3)
            if (r0 == 0) goto L_0x007e
            int r2 = r0.A00()
        L_0x007e:
            r1 = 0
            if (r7 == 0) goto L_0x008b
            X.3uy r0 = r7.B8N(r3)
            if (r0 == 0) goto L_0x008b
            int r1 = r0.A00()
        L_0x008b:
            if (r2 <= r1) goto L_0x006e
            boolean r0 = r10.contains(r3)
            if (r0 != 0) goto L_0x006e
            goto L_0x006b
        L_0x0094:
            boolean r0 = r8 instanceof X.C68973cl
            if (r0 == 0) goto L_0x00a2
            r0 = 1
            java.util.ArrayList r5 = X.C65753Ti.A04(r8, r6, r0)
        L_0x009d:
            X.4Uq r0 = r8.B4P()
            goto L_0x002c
        L_0x00a2:
            int r0 = r8.B8P()
            int r0 = java.lang.Math.min(r0, r6)
            java.util.ArrayList r5 = X.C36441kJ.A14(r0)
            java.util.Iterator r3 = r8.B8O()
        L_0x00b2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009d
            if (r6 <= 0) goto L_0x009d
            java.lang.Object r2 = r3.next()
            X.3uy r2 = (X.C80173uy) r2
            java.lang.String r1 = X.AnonymousClass3PG.A00
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d0
            r5.add(r1)
        L_0x00cd:
            int r6 = r6 + -1
            goto L_0x00b2
        L_0x00d0:
            java.util.TreeSet r0 = r2.A04
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r0 = r0.next()
            X.3uv r0 = (X.C80143uv) r0
            java.lang.String r0 = r0.A05
            r5.add(r0)
            goto L_0x00cd
        L_0x00e2:
            r9 = r5
        L_0x00e3:
            r4.A06 = r9
            if (r18 == 0) goto L_0x016e
            int r8 = r8.BGT()
        L_0x00eb:
            if (r5 != 0) goto L_0x0169
            r2 = 0
        L_0x00ee:
            int r1 = r4.A01
            r0 = 2
            r10 = 0
            r11 = 1
            boolean r1 = X.C36371kC.A1T(r1, r0)
            r3 = 2
            boolean r0 = X.C36371kC.A1T(r8, r0)
            if (r1 == 0) goto L_0x011e
            if (r0 != 0) goto L_0x0108
            int r0 = r4.getChildCount()
            int r0 = r0 - r11
            r4.removeViewAt(r0)
        L_0x0108:
            java.util.List r0 = r4.A07
            int r6 = X.C36371kC.A06(r0)
            if (r6 == r2) goto L_0x0111
            r10 = 1
        L_0x0111:
            r4.A09 = r10
            if (r6 <= r2) goto L_0x0171
            int r6 = r6 - r11
        L_0x0116:
            if (r6 < r2) goto L_0x0186
            r4.removeViewAt(r6)
            int r6 = r6 + -1
            goto L_0x0116
        L_0x011e:
            if (r0 == 0) goto L_0x0108
            android.content.Context r0 = r4.getContext()
            X.23E r9 = new X.23E
            r9.<init>(r0)
            r1 = -2
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r1, r1)
            r9.setLayoutParams(r0)
            int r0 = r4.A02
            r9.A01 = r0
            r9.A02 = r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            int r0 = r1.getColor(r0)
            r9.setTextColor(r0)
            int r1 = r4.A00
            android.graphics.Rect r0 = r9.A0A
            r0.setEmpty()
            com.whatsapp.TextEmojiLabel r0 = r9.A07
            float r1 = (float) r1
            r0.setTextSize(r10, r1)
            com.whatsapp.TextEmojiLabel r0 = r9.A08
            r0.setTextSize(r10, r1)
            r6 = 200(0xc8, double:9.9E-322)
            r0 = 300(0x12c, double:1.48E-321)
            r9.A04 = r6
            r9.A03 = r0
            android.view.animation.Interpolator r0 = X.C65753Ti.A01
            r9.setAnimationInterpolator(r0)
            r4.addView(r9)
            goto L_0x0108
        L_0x0169:
            int r2 = r5.size()
            goto L_0x00ee
        L_0x016e:
            r8 = 0
            goto L_0x00eb
        L_0x0171:
            if (r2 <= r6) goto L_0x0186
        L_0x0173:
            if (r6 >= r2) goto L_0x0186
            android.content.Context r1 = r4.getContext()
            r0 = 2131625995(0x7f0e080b, float:1.8879214E38)
            android.view.View r0 = X.C36421kH.A0D(r1, r0)
            r4.addView(r0, r6)
            int r6 = r6 + 1
            goto L_0x0173
        L_0x0186:
            r4.A07 = r5
            r4.A01 = r8
            if (r5 == 0) goto L_0x0413
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0413
            r6 = 0
            r4.setVisibility(r6)
            r8 = 0
        L_0x0197:
            java.util.List r0 = r4.A07
            int r0 = r0.size()
            r2 = 1
            if (r8 >= r0) goto L_0x032b
            int r0 = r4.getChildCount()
            if (r8 >= r0) goto L_0x032b
            android.view.View r7 = r4.getChildAt(r8)
            com.whatsapp.TextEmojiLabel r7 = (com.whatsapp.TextEmojiLabel) r7
            java.util.List r0 = r4.A07
            java.lang.String r5 = X.C36401kF.A0s(r0, r8)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0327
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0327
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0327
            java.util.List r0 = r4.A06
            if (r0 == 0) goto L_0x0327
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0327
            r4.A0A = r2
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x022a
            android.animation.AnimatorSet r11 = X.C36441kJ.A0C()
            float[] r0 = new float[r3]
            r0 = {0, 1066192077} // fill-array
            java.lang.String r9 = "scaleX"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r4, r9, r0)
            float[] r0 = new float[r3]
            r0 = {0, 1066192077} // fill-array
            java.lang.String r13 = "scaleY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r13, r0)
            r1 = 130(0x82, double:6.4E-322)
            r11.setDuration(r1)
            android.view.animation.Interpolator r12 = X.C65753Ti.A01
            r11.setInterpolator(r12)
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r10, r0, r3)
            r11.playTogether(r0)
            android.animation.AnimatorSet r10 = X.C36441kJ.A0C()
            float[] r0 = new float[r3]
            r0 = {1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r4, r9, r0)
            float[] r0 = new float[r3]
            r0 = {1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r13, r0)
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r9, r0, r3)
            r10.playTogether(r0)
            r11.setDuration(r1)
            r11.setInterpolator(r12)
            android.animation.AnimatorSet r1 = X.C36441kJ.A0C()
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r11, r10, r3)
            r1.playSequentially(r0)
            r1.start()
        L_0x022a:
            java.lang.CharSequence r16 = r7.getText()
            android.animation.AnimatorSet r14 = X.C36441kJ.A0C()
            float[] r0 = new float[r3]
            r0 = {0, 1067030938} // fill-array
            java.lang.String r9 = "scaleX"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r7, r9, r0)
            float[] r0 = new float[r3]
            r0 = {0, 1067030938} // fill-array
            java.lang.String r2 = "scaleY"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r7, r2, r0)
            r0 = 100
            r14.setDuration(r0)
            android.view.animation.Interpolator r12 = X.C65753Ti.A00
            r14.setInterpolator(r12)
            android.animation.Animator[] r10 = X.C36441kJ.A1P(r11, r10, r3)
            r14.playTogether(r10)
            android.animation.AnimatorSet r13 = X.C36441kJ.A0C()
            float[] r10 = new float[r3]
            r10 = {1067030938, 1064346583} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r7, r9, r10)
            float[] r10 = new float[r3]
            r10 = {1067030938, 1064346583} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r7, r2, r10)
            r13.setDuration(r0)
            r13.setStartDelay(r0)
            r13.setInterpolator(r12)
            android.animation.Animator[] r10 = X.C36441kJ.A1P(r11, r10, r3)
            r13.playTogether(r10)
            android.animation.AnimatorSet r10 = X.C36441kJ.A0C()
            float[] r11 = new float[r3]
            r11 = {1064346583, 1065353216} // fill-array
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r7, r9, r11)
            float[] r11 = new float[r3]
            r11 = {1064346583, 1065353216} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r7, r2, r11)
            r10.setDuration(r0)
            r10.setStartDelay(r0)
            r10.setInterpolator(r12)
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r15, r11, r3)
            r10.playTogether(r0)
            android.animation.AnimatorSet r11 = X.C36441kJ.A0C()
            r0 = 3
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r14, r13, r0)
            r0[r3] = r10
            r11.playSequentially(r0)
            X.1kO r0 = new X.1kO
            r0.<init>(r7, r4, r5)
            r11.addListener(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x0323
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0323
            android.animation.AnimatorSet r10 = X.C36441kJ.A0C()
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r7, r9, r0)
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r2, r0)
            r0 = 100
            r10.setDuration(r0)
            r10.setInterpolator(r12)
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r9, r2, r3)
            r10.playTogether(r0)
            android.animation.AnimatorSet r1 = X.C36441kJ.A0C()
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r10, r11, r3)
            r1.playSequentially(r0)
            r1.start()
        L_0x02f8:
            java.lang.String r1 = X.C65753Ti.A02(r5)
            java.lang.String[] r0 = X.C65753Ti.A03
            boolean r0 = X.AnonymousClass0QN.A00(r1, r0)
            if (r0 == 0) goto L_0x031c
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168059(0x7f070b3b, float:1.795041E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r7)
            r0.bottomMargin = r1
        L_0x0315:
            r7.setLayoutParams(r0)
            int r8 = r8 + 1
            goto L_0x0197
        L_0x031c:
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r7)
            r0.bottomMargin = r6
            goto L_0x0315
        L_0x0323:
            r11.start()
            goto L_0x02f8
        L_0x0327:
            r7.A0I(r5)
            goto L_0x02f8
        L_0x032b:
            int r0 = r4.A01
            if (r0 < r3) goto L_0x0385
            int r0 = r4.getChildCount()
            int r0 = r0 - r2
            android.view.View r1 = r4.getChildAt(r0)
            boolean r0 = r1 instanceof com.whatsapp.RollingCounterView
            if (r0 == 0) goto L_0x03f9
            r5 = 0
            int r7 = r4.A01
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0350
            X.3Ov r0 = r4.A05
            int r7 = X.C64633Ov.A00(r0, r7)
            java.lang.String r5 = r0.A01(r7)
            X.AnonymousClass00C.A0D(r5, r2)
        L_0x0350:
            com.whatsapp.RollingCounterView r1 = (com.whatsapp.RollingCounterView) r1
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x035b
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x035b
            r6 = 1
        L_0x035b:
            r1.A09 = r5
            if (r6 == 0) goto L_0x03f3
            long r9 = r1.A04
            long r11 = r1.A03
        L_0x0363:
            if (r5 == 0) goto L_0x0371
            java.lang.String r0 = r1.getPrimaryText()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0371
            r11 = 0
        L_0x0371:
            X.37j r0 = r1.A05
            if (r0 != 0) goto L_0x03e3
            int r0 = r1.A00
            if (r7 == r0) goto L_0x0385
            r8 = -1
            if (r0 >= r7) goto L_0x037d
            r8 = 1
        L_0x037d:
            X.37j r6 = new X.37j
            r6.<init>(r7, r8, r9, r11)
            com.whatsapp.RollingCounterView.A01(r6, r1)
        L_0x0385:
            java.util.List r0 = r4.A07
            if (r0 == 0) goto L_0x041d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x041d
            java.util.List r1 = r4.A07
            r7 = 0
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r7]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = ", "
            java.lang.String r6 = X.AnonymousClass14B.A08(r0, r1)
            java.util.List r0 = r4.A07
            int r0 = r0.size()
            if (r0 != r2) goto L_0x03b7
            android.content.Context r5 = r4.getContext()
            r1 = 2131893341(0x7f121c5d, float:1.9421456E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r7] = r6
        L_0x03b3:
            X.C36371kC.A14(r5, r4, r0, r1)
            return
        L_0x03b7:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x03d6
            X.3Ov r1 = r4.A05
            int r0 = r4.A01
            int r0 = X.C64633Ov.A00(r1, r0)
            java.lang.String r0 = r1.A01(r0)
            X.AnonymousClass00C.A0D(r0, r2)
        L_0x03ca:
            android.content.Context r5 = r4.getContext()
            r1 = 2131893340(0x7f121c5c, float:1.9421454E38)
            java.lang.Object[] r0 = X.C36431kI.A1a(r6, r0, r3)
            goto L_0x03b3
        L_0x03d6:
            X.0ts r2 = r4.A03
            android.content.Context r1 = r4.getContext()
            int r0 = r4.A01
            java.lang.String r0 = X.C65753Ti.A01(r1, r2, r0)
            goto L_0x03ca
        L_0x03e3:
            int r0 = r0.A03
            if (r7 == r0) goto L_0x0385
            r8 = -1
            if (r0 >= r7) goto L_0x03eb
            r8 = 1
        L_0x03eb:
            X.37j r6 = new X.37j
            r6.<init>(r7, r8, r9, r11)
            r1.A06 = r6
            goto L_0x0385
        L_0x03f3:
            r9 = 0
            r11 = 0
            goto L_0x0363
        L_0x03f9:
            java.lang.StringBuilder r1 = X.C36381kD.A11(r1)
            java.lang.String r0 = " is not of type RollingCounterView! Something has gone wrong inside ensureViews(). childCount="
            r1.append(r0)
            int r0 = r4.getChildCount()
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            X.C18740tg.A0A(r0)
            goto L_0x0385
        L_0x0413:
            java.util.List r1 = r4.A07
            r0 = 8
            if (r1 != 0) goto L_0x041a
            r0 = 4
        L_0x041a:
            r4.setVisibility(r0)
        L_0x041d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43512Ic.A00(X.4Uq, boolean, boolean):void");
    }

    public C43512Ic(Context context) {
        super(context);
        LinearLayout.LayoutParams A0N = C36371kC.A0N();
        setGravity(17);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        setLayoutParams(A0N);
        setOrientation(0);
        setBackgroundResource(R.drawable.reaction_bubble_background);
        this.A02 = C36391kE.A07(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = this.A02;
        setPadding(i, dimensionPixelSize, i, dimensionPixelSize);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setVisibility(8);
        setId(R.id.reactions_bubble_layout);
        setClipToPadding(false);
        setClipChildren(false);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
        }
        setFocusable(true);
    }

    public void setAreAnimationsEnabled(boolean z) {
        this.A08 = z;
    }
}
