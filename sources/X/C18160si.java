package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0si  reason: invalid class name and case insensitive filesystem */
public class C18160si extends AnonymousClass0V6 {
    public Object A00;
    public final int A01;

    public C18160si(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int A01(View view) {
        if (1 - this.A01 != 0) {
            return 0;
        }
        return ((SideSheetBehavior) this.A00).A04;
    }

    public int A02(View view) {
        if (this.A01 != 0) {
            return 0;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A00;
        if (bottomSheetBehavior.A0X) {
            return bottomSheetBehavior.A0F;
        }
        return bottomSheetBehavior.A05;
    }

    public int A03(View view, int i, int i2) {
        if (this.A01 == 0) {
            return view.getLeft();
        }
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A00;
        SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior.A0B.A00;
        int max = Math.max(0, sideSheetBehavior2.A04 - sideSheetBehavior2.A01);
        int i3 = sideSheetBehavior.A04;
        if (i >= max) {
            max = i;
            if (i > i3) {
                return i3;
            }
        }
        return max;
    }

    public int A04(View view, int i, int i2) {
        if (this.A01 != 0) {
            return view.getTop();
        }
        int A0R = ((BottomSheetBehavior) this.A00).A0R();
        int A02 = A02(view);
        if (i < A0R) {
            return A0R;
        }
        if (i <= A02) {
            return i;
        }
        return A02;
    }

    public void A05(int i) {
        if (this.A01 != 0) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A00;
                if (sideSheetBehavior.A0E) {
                    sideSheetBehavior.A0R(1);
                }
            }
        } else if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A00;
            if (bottomSheetBehavior.A0U) {
                bottomSheetBehavior.A0X(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3 > ((r2 - java.lang.Math.max(0, r2 - r6.A01)) / 2)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (X.AnonymousClass000.A05(r3, java.lang.Math.max(0, r2 - r6.A01)) < X.AnonymousClass000.A05(r3, r2)) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r1 > r2.A09) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r4 < r0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        if (X.AnonymousClass000.A05(r4, r0) < X.AnonymousClass000.A05(r4, r2.A05)) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (X.AnonymousClass000.A05(r4, r2.A07) < X.AnonymousClass000.A05(r4, r2.A05)) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            if (r0 == 0) goto L_0x007e
            java.lang.Object r5 = r7.A00
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            X.0WL r3 = r5.A0B
            r2 = 0
            r4 = 5
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x007c
            int r0 = r8.getRight()
            float r1 = (float) r0
            com.google.android.material.sidesheet.SideSheetBehavior r6 = r3.A00
            float r0 = r6.A00
            float r0 = r0 * r9
            float r1 = r1 + r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r0 = 500(0x1f4, float:7.0E-43)
            float r0 = (float) r0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
        L_0x0038:
            r0 = 1
            com.google.android.material.sidesheet.SideSheetBehavior.A01(r8, r5, r4, r0)
            return
        L_0x003d:
            int r3 = r8.getLeft()
            int r2 = r6.A04
            int r0 = r6.A01
            int r1 = r2 - r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r2 - r0
            int r0 = r2 / 2
            if (r3 <= r0) goto L_0x007c
            goto L_0x0038
        L_0x0052:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            goto L_0x0038
        L_0x0063:
            int r3 = r8.getLeft()
            int r2 = r6.A04
            int r0 = r6.A01
            int r1 = r2 - r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = X.AnonymousClass000.A05(r3, r0)
            int r0 = X.AnonymousClass000.A05(r3, r2)
            if (r1 >= r0) goto L_0x0038
        L_0x007c:
            r4 = 3
            goto L_0x0038
        L_0x007e:
            r1 = 0
            r3 = 6
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.Object r2 = r7.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            if (r0 >= 0) goto L_0x009c
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x00e4
            int r1 = r8.getTop()
            java.lang.System.currentTimeMillis()
            int r0 = r2.A09
            if (r1 <= r0) goto L_0x00e4
        L_0x0097:
            r0 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior.A07(r8, r2, r3, r0)
            return
        L_0x009c:
            boolean r0 = r2.A0X
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r2.A0e(r8, r10)
            if (r0 == 0) goto L_0x00e6
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            int r0 = r2.A0I
            float r0 = (float) r0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
        L_0x00b9:
            int r4 = r8.getTop()
            int r1 = r2.A0F
            int r0 = r2.A0R()
            int r1 = r1 + r0
            int r0 = r1 / 2
            if (r4 > r0) goto L_0x012f
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x00e4
            int r1 = r8.getTop()
            int r0 = r2.A0R()
            int r4 = X.AnonymousClass000.A05(r1, r0)
            int r1 = r8.getTop()
            int r0 = r2.A09
            int r0 = X.AnonymousClass000.A05(r1, r0)
        L_0x00e2:
            if (r4 >= r0) goto L_0x0097
        L_0x00e4:
            r3 = 3
            goto L_0x0097
        L_0x00e6:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010d
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x010d
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x0132
            int r4 = r8.getTop()
            int r0 = r2.A09
        L_0x0100:
            int r1 = X.AnonymousClass000.A05(r4, r0)
            int r0 = r2.A05
            int r0 = X.AnonymousClass000.A05(r4, r0)
            if (r1 >= r0) goto L_0x0132
            goto L_0x0097
        L_0x010d:
            int r4 = r8.getTop()
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x0124
            int r0 = r2.A07
            int r1 = X.AnonymousClass000.A05(r4, r0)
            int r0 = r2.A05
            int r0 = X.AnonymousClass000.A05(r4, r0)
            if (r1 >= r0) goto L_0x0132
            goto L_0x00e4
        L_0x0124:
            int r0 = r2.A09
            if (r4 >= r0) goto L_0x0100
            int r0 = r2.A05
            int r0 = X.AnonymousClass000.A05(r4, r0)
            goto L_0x00e2
        L_0x012f:
            r3 = 5
            goto L_0x0097
        L_0x0132:
            r3 = 4
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18160si.A06(android.view.View, float, float):void");
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        View A0Y;
        ViewGroup.MarginLayoutParams A0a;
        if (this.A01 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A00;
            WeakReference weakReference = sideSheetBehavior.A0C;
            if (!(weakReference == null || (A0Y = AnonymousClass000.A0Y(weakReference)) == null || (A0a = AnonymousClass000.A0a(A0Y)) == null)) {
                AnonymousClass0WL r0 = sideSheetBehavior.A0B;
                int left = view.getLeft();
                view.getRight();
                int i5 = r0.A00.A04;
                if (left <= i5) {
                    A0a.rightMargin = i5 - left;
                }
                A0Y.setLayoutParams(A0a);
            }
            Set set = sideSheetBehavior.A0H;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0A("onSlide");
                }
                return;
            }
            return;
        }
        ((BottomSheetBehavior) this.A00).A0U(i2);
    }

    public boolean A09(View view, int i) {
        WeakReference weakReference;
        View A0Y;
        WeakReference weakReference2;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
            if (sideSheetBehavior.A05 == 1 || (weakReference2 = sideSheetBehavior.A0D) == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
        int i3 = bottomSheetBehavior.A0J;
        if (i3 == 1 || bottomSheetBehavior.A0i) {
            return false;
        }
        if (i3 == 3 && bottomSheetBehavior.A04 == i && (weakReference = bottomSheetBehavior.A0R) != null && (A0Y = AnonymousClass000.A0Y(weakReference)) != null && A0Y.canScrollVertically(-1)) {
            return false;
        }
        System.currentTimeMillis();
        WeakReference weakReference3 = bottomSheetBehavior.A0S;
        if (weakReference3 == null || weakReference3.get() != view) {
            return false;
        }
        return true;
    }
}
