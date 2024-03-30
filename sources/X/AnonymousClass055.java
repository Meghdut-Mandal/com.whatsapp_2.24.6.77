package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.055  reason: invalid class name */
public abstract class AnonymousClass055 extends AnonymousClass054 {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r6 == null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0V(X.AnonymousClass0X9 r5, X.AnonymousClass0X9 r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L_0x0006
            if (r6 != 0) goto L_0x0019
        L_0x0005:
            return r3
        L_0x0006:
            if (r6 == 0) goto L_0x0019
            java.util.Map r0 = r6.A02
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r0.containsKey(r2)
            java.util.Map r0 = r5.A02
            boolean r0 = r0.containsKey(r2)
            if (r1 == r0) goto L_0x0019
            return r3
        L_0x0019:
            X.0TQ r1 = A01(r5, r6)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0005
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0029
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0005
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass055.A0V(X.0X9, X.0X9):boolean");
    }

    public abstract ObjectAnimator A0X(View view, ViewGroup viewGroup, AnonymousClass0X9 r3, AnonymousClass0X9 r4);

    public abstract ObjectAnimator A0Y(View view, ViewGroup viewGroup, AnonymousClass0X9 r3, AnonymousClass0X9 r4);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r9 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r5.A01 == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r1 == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r5.A03 == null) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0TQ A01(X.AnonymousClass0X9 r8, X.AnonymousClass0X9 r9) {
        /*
            X.0TQ r5 = new X.0TQ
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r3 = "android:visibility:parent"
            r4 = 0
            r7 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x007e
            java.util.Map r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L_0x002e:
            if (r9 == 0) goto L_0x007b
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r3)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x004a:
            r5.A02 = r4
            r3 = 1
            if (r8 == 0) goto L_0x005c
            if (r9 == 0) goto L_0x0062
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L_0x006b
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L_0x006b
        L_0x005b:
            return r5
        L_0x005c:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0071
            if (r9 != 0) goto L_0x005b
        L_0x0062:
            int r0 = r5.A01
            if (r0 != 0) goto L_0x005b
        L_0x0066:
            r5.A04 = r6
        L_0x0068:
            r5.A05 = r3
            return r5
        L_0x006b:
            if (r2 == r1) goto L_0x0074
            if (r2 == 0) goto L_0x0066
            if (r1 != 0) goto L_0x005b
        L_0x0071:
            r5.A04 = r3
            goto L_0x0068
        L_0x0074:
            if (r4 == 0) goto L_0x0066
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x005b
            goto L_0x0071
        L_0x007b:
            r5.A00 = r7
            goto L_0x004a
        L_0x007e:
            r5.A01 = r7
            r5.A03 = r4
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass055.A01(X.0X9, X.0X9):X.0TQ");
    }

    public static void A02(AnonymousClass0X9 r4) {
        View view = r4.A00;
        int visibility = view.getVisibility();
        Map map = r4.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (A01(A0C(r2, false), A0D(r2, false)).A05 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A04(android.view.ViewGroup r12, X.AnonymousClass0X9 r13, X.AnonymousClass0X9 r14) {
        /*
            r11 = this;
            X.0TQ r1 = A01(r13, r14)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0125
            android.view.ViewGroup r0 = r1.A03
            if (r0 != 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.A02
            if (r0 == 0) goto L_0x0125
        L_0x0010:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x003a
            int r0 = r11.A00
            r1 = 1
            r0 = r0 & 1
            r5 = 0
            if (r0 != r1) goto L_0x0039
            if (r14 == 0) goto L_0x0039
            if (r13 != 0) goto L_0x010e
            android.view.View r0 = r14.A00
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            X.0X9 r1 = r11.A0C(r2, r0)
            X.0X9 r0 = r11.A0D(r2, r0)
            X.0TQ r0 = A01(r1, r0)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x010e
        L_0x0039:
            return r5
        L_0x003a:
            int r9 = r1.A00
            int r0 = r11.A00
            r8 = 2
            r0 = r0 & 2
            r5 = 0
            if (r0 != r8) goto L_0x0039
            if (r13 == 0) goto L_0x0039
            android.view.View r7 = r13.A00
            if (r14 == 0) goto L_0x00fa
            android.view.View r2 = r14.A00
        L_0x004c:
            r0 = 2131433528(0x7f0b1838, float:1.8488844E38)
            r6 = 2131433528(0x7f0b1838, float:1.8488844E38)
            java.lang.Object r1 = r7.getTag(r0)
            android.view.View r1 = (android.view.View) r1
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0070
            r10 = 1
        L_0x005d:
            android.animation.ObjectAnimator r5 = r11.A0Y(r1, r12, r13, r14)
            if (r10 != 0) goto L_0x0039
            if (r5 != 0) goto L_0x0115
            X.0SN r0 = new X.0SN
            r0.<init>(r12)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.remove(r1)
            return r5
        L_0x0070:
            if (r2 == 0) goto L_0x0099
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x00f7
            r0 = 4
            if (r9 == r0) goto L_0x007d
            if (r7 != r2) goto L_0x0099
        L_0x007d:
            int r1 = r2.getVisibility()
            X.0V3 r0 = X.AnonymousClass0W5.A02
            r0.A05(r2, r4)
            android.animation.ObjectAnimator r5 = r11.A0Y(r2, r12, r13, r14)
            if (r5 == 0) goto L_0x0121
            X.0DR r0 = new X.0DR
            r0.<init>(r2, r9)
            r5.addListener(r0)
            r5.addPauseListener(r0)
            goto L_0x011d
        L_0x0099:
            android.view.ViewParent r0 = r7.getParent()
            if (r0 != 0) goto L_0x00d5
            r10 = 0
            r1 = r7
        L_0x00a1:
            java.util.Map r2 = r13.A02
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r0 = r2.get(r0)
            int[] r0 = (int[]) r0
            r9 = r0[r4]
            r5 = r0[r3]
            int[] r2 = new int[r8]
            r12.getLocationOnScreen(r2)
            r0 = r2[r4]
            int r9 = r9 - r0
            int r0 = r1.getLeft()
            int r9 = r9 - r0
            r1.offsetLeftAndRight(r9)
            r0 = r2[r3]
            int r5 = r5 - r0
            int r0 = r1.getTop()
            int r5 = r5 - r0
            r1.offsetTopAndBottom(r5)
            X.0SN r0 = new X.0SN
            r0.<init>(r12)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.add(r1)
            goto L_0x005d
        L_0x00d5:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x0039
            android.view.ViewParent r2 = r7.getParent()
            android.view.View r2 = (android.view.View) r2
            X.0X9 r1 = r11.A0D(r2, r3)
            X.0X9 r0 = r11.A0C(r2, r3)
            X.0TQ r0 = A01(r1, r0)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x00fd
            android.widget.ImageView r2 = X.C06890Vm.A00(r7, r2, r12)
        L_0x00f7:
            r10 = 0
            r1 = r2
            goto L_0x00a1
        L_0x00fa:
            r2 = r5
            goto L_0x004c
        L_0x00fd:
            int r1 = r2.getId()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x0039
            r0 = -1
            if (r1 == r0) goto L_0x0039
            r12.findViewById(r1)
            return r5
        L_0x010e:
            android.view.View r0 = r14.A00
            android.animation.ObjectAnimator r5 = r11.A0X(r0, r12, r13, r14)
            return r5
        L_0x0115:
            r7.setTag(r6, r1)
            X.0IT r0 = new X.0IT
            r0.<init>(r1, r7, r12, r11)
        L_0x011d:
            r11.A0A(r0)
            return r5
        L_0x0121:
            r0.A05(r2, r1)
            return r5
        L_0x0125:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass055.A04(android.view.ViewGroup, X.0X9, X.0X9):android.animation.Animator");
    }

    public void A0S(AnonymousClass0X9 r1) {
        A02(r1);
    }

    public String[] A0W() {
        return A01;
    }
}
