package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.07n  reason: invalid class name and case insensitive filesystem */
public class C017607n extends AnonymousClass054 {
    public static final Property A00 = new C18080sa(2);
    public static final Property A01 = new C18080sa(1);
    public static final Property A02 = new C017707o();
    public static final Property A03 = new C18080sa(4);
    public static final Property A04 = new C18080sa(3);
    public static final Property A05 = new C18080sa(0);
    public static final String[] A06 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    private void A01(AnonymousClass0X9 r8) {
        View view = r8.A00;
        if (C011304x.A03(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = r8.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", view.getParent());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r11 != r10) goto L_0x0059;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A04(android.view.ViewGroup r21, X.AnonymousClass0X9 r22, X.AnonymousClass0X9 r23) {
        /*
            r20 = this;
            r0 = r22
            if (r22 == 0) goto L_0x012d
            r3 = r23
            if (r23 == 0) goto L_0x012d
            java.util.Map r14 = r0.A02
            java.util.Map r1 = r3.A02
            java.lang.String r0 = "android:changeBounds:parent"
            java.lang.Object r2 = r14.get(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r2 == 0) goto L_0x012d
            if (r0 == 0) goto L_0x012d
            android.view.View r15 = r3.A00
            java.lang.String r0 = "android:changeBounds:bounds"
            java.lang.Object r2 = r14.get(r0)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r13 = r2.left
            int r12 = r0.left
            int r11 = r2.top
            int r10 = r0.top
            int r9 = r2.right
            int r8 = r0.right
            int r7 = r2.bottom
            int r6 = r0.bottom
            int r5 = r9 - r13
            int r4 = r7 - r11
            int r3 = r8 - r12
            int r2 = r6 - r10
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r14 = r14.get(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r5 == 0) goto L_0x0050
            if (r4 != 0) goto L_0x0054
        L_0x0050:
            if (r3 == 0) goto L_0x012a
            if (r2 == 0) goto L_0x012a
        L_0x0054:
            if (r13 != r12) goto L_0x0059
            r1 = 0
            if (r11 == r10) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            if (r9 != r8) goto L_0x005e
            if (r7 == r6) goto L_0x0060
        L_0x005e:
            int r1 = r1 + 1
        L_0x0060:
            if (r14 == 0) goto L_0x0124
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0126
        L_0x0068:
            if (r1 <= 0) goto L_0x012d
            r0 = 2
            X.0V3 r14 = X.AnonymousClass0W5.A02
            r19 = r7
            r18 = r9
            r17 = r11
            r16 = r13
            r14.A06(r15, r16, r17, r18, r19)
            r14 = r20
            if (r1 != r0) goto L_0x00fb
            if (r5 != r3) goto L_0x00b1
            if (r4 != r2) goto L_0x00b1
            float r3 = (float) r13
            float r2 = (float) r11
            float r1 = (float) r12
            float r0 = (float) r10
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r4.moveTo(r3, r2)
            r4.lineTo(r1, r0)
            android.util.Property r1 = A03
        L_0x0091:
            r0 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r15, r1, r0, r4)
        L_0x0096:
            android.view.ViewParent r0 = r15.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00b0
            android.view.ViewParent r1 = r15.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 1
            X.AnonymousClass0W4.A01(r1, r0)
            X.0IU r0 = new X.0IU
            r0.<init>(r1, r14)
            r14.A0A(r0)
        L_0x00b0:
            return r4
        L_0x00b1:
            X.0TS r2 = new X.0TS
            r2.<init>(r15)
            float r13 = (float) r13
            float r5 = (float) r11
            float r3 = (float) r12
            float r1 = (float) r10
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r4.moveTo(r13, r5)
            r4.lineTo(r3, r1)
            android.util.Property r3 = A05
            r1 = 0
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofObject(r2, r3, r1, r4)
            float r9 = (float) r9
            float r5 = (float) r7
            float r3 = (float) r8
            float r1 = (float) r6
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r4.moveTo(r9, r5)
            r4.lineTo(r3, r1)
            android.util.Property r3 = A01
            r1 = 0
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r2, r3, r1, r4)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r0]
            r0 = 0
            r1[r0] = r10
            r0 = 1
            r1[r0] = r3
            r4.playTogether(r1)
            X.0DF r0 = new X.0DF
            r0.<init>(r2, r14)
            r4.addListener(r0)
            goto L_0x0096
        L_0x00fb:
            if (r13 != r12) goto L_0x0111
            if (r11 != r10) goto L_0x0111
            float r3 = (float) r9
            float r2 = (float) r7
            float r1 = (float) r8
            float r0 = (float) r6
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r4.moveTo(r3, r2)
            r4.lineTo(r1, r0)
            android.util.Property r1 = A00
            goto L_0x0091
        L_0x0111:
            float r3 = (float) r13
            float r2 = (float) r11
            float r1 = (float) r12
            float r0 = (float) r10
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r4.moveTo(r3, r2)
            r4.lineTo(r1, r0)
            android.util.Property r1 = A04
            goto L_0x0091
        L_0x0124:
            if (r0 == 0) goto L_0x0068
        L_0x0126:
            int r1 = r1 + 1
            goto L_0x0068
        L_0x012a:
            r1 = 0
            goto L_0x0060
        L_0x012d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017607n.A04(android.view.ViewGroup, X.0X9, X.0X9):android.animation.Animator");
    }

    public void A0S(AnonymousClass0X9 r1) {
        A01(r1);
    }

    public void A0T(AnonymousClass0X9 r1) {
        A01(r1);
    }

    public String[] A0W() {
        return A06;
    }
}
