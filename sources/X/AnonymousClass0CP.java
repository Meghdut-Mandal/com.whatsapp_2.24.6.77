package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;

/* renamed from: X.0CP  reason: invalid class name */
public abstract class AnonymousClass0CP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass0CI A05;
    public AnonymousClass0V2 A06;
    public RecyclerView A07;
    public AnonymousClass0CU A08;
    public AnonymousClass0CU A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public final AnonymousClass0CT A0D;
    public final AnonymousClass0CT A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 == 1073741824) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 == 1073741824) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001f
            if (r7 >= 0) goto L_0x002f
            if (r7 != r2) goto L_0x0018
            if (r5 == r0) goto L_0x002d
            if (r5 == 0) goto L_0x0018
            if (r5 == r1) goto L_0x002d
        L_0x0018:
            r5 = 0
            r7 = 0
        L_0x001a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L_0x001f:
            if (r7 >= 0) goto L_0x002f
            if (r7 == r2) goto L_0x002d
            if (r7 != r3) goto L_0x0018
            if (r5 == r0) goto L_0x002b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002d:
            r7 = r4
            goto L_0x001a
        L_0x002f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CP.A01(int, int, int, int, boolean):int");
    }

    public void A0W(View view) {
        AnonymousClass0D2 r6 = (AnonymousClass0D2) view.getLayoutParams();
        Rect A0N = this.A07.A0N(view);
        int i = 0 + A0N.left + A0N.right;
        int i2 = 0 + A0N.top + A0N.bottom;
        int A012 = A01(this.A03, this.A04, A0O() + A0P() + r6.leftMargin + r6.rightMargin + i, r6.width, A1N());
        int A013 = A01(this.A00, this.A01, A0Q() + A0N() + r6.topMargin + r6.bottomMargin + i2, r6.height, A1O());
        if (A0j(view, r6, A012, A013)) {
            view.measure(A012, A013);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        if ((r1.bottom - r5) > r6) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0h(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r0 = 2
            int[] r8 = new int[r0]
            int r4 = r11.A0O()
            int r3 = r11.A0Q()
            int r2 = r11.A03
            int r0 = r11.A0P()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.A0N()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r7 = r13.getTop()
            int r0 = r12.top
            int r7 = r7 + r0
            int r0 = r13.getScrollY()
            int r7 = r7 - r0
            int r6 = r12.width()
            int r6 = r6 + r9
            int r0 = r12.height()
            int r0 = r0 + r7
            int r9 = r9 - r4
            r4 = 0
            int r10 = java.lang.Math.min(r4, r9)
            int r7 = r7 - r3
            int r5 = java.lang.Math.min(r4, r7)
            int r6 = r6 - r2
            int r3 = java.lang.Math.max(r4, r6)
            int r0 = r0 - r1
            int r2 = java.lang.Math.max(r4, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r1 = X.AnonymousClass04F.A01(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00b1
            if (r3 != 0) goto L_0x005f
            int r3 = java.lang.Math.max(r10, r6)
        L_0x005f:
            if (r5 != 0) goto L_0x0065
            int r5 = java.lang.Math.min(r7, r2)
        L_0x0065:
            r8[r4] = r3
            r8[r0] = r5
            r10 = 0
            r4 = r8[r4]
            r9 = 1
            if (r16 == 0) goto L_0x00a7
            android.view.View r8 = r14.getFocusedChild()
            if (r8 == 0) goto L_0x00a6
            int r7 = r11.A0O()
            int r6 = r11.A0Q()
            int r3 = r11.A03
            int r0 = r11.A0P()
            int r3 = r3 - r0
            int r2 = r11.A00
            int r0 = r11.A0N()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0u
            androidx.recyclerview.widget.RecyclerView.A0B(r8, r1)
            int r0 = r1.left
            int r0 = r0 - r4
            if (r0 >= r3) goto L_0x00a6
            int r0 = r1.right
            int r0 = r0 - r4
            if (r0 <= r7) goto L_0x00a6
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto L_0x00a6
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r6) goto L_0x00a7
        L_0x00a6:
            return r10
        L_0x00a7:
            if (r4 != 0) goto L_0x00ab
            if (r5 == 0) goto L_0x00a6
        L_0x00ab:
            if (r15 == 0) goto L_0x00b9
            r14.scrollBy(r4, r5)
            return r9
        L_0x00b1:
            if (r10 != 0) goto L_0x00b7
            int r10 = java.lang.Math.min(r9, r3)
        L_0x00b7:
            r3 = r10
            goto L_0x005f
        L_0x00b9:
            r14.A0n(r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CP.A0h(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public void A0l(AnonymousClass0C2 r1, int i) {
    }

    public boolean A0m() {
        return false;
    }

    public void A0n(AnonymousClass0CZ r1, AnonymousClass0CZ r2) {
    }

    public void A0o(RecyclerView recyclerView) {
    }

    public abstract int A0r(C02760Bu r1, AnonymousClass0C4 r2, int i);

    public abstract int A0s(C02760Bu r1, AnonymousClass0C4 r2, int i);

    public abstract int A0t(AnonymousClass0C4 r1);

    public abstract int A0u(AnonymousClass0C4 r1);

    public abstract int A0v(AnonymousClass0C4 r1);

    public abstract int A0w(AnonymousClass0C4 r1);

    public abstract int A0x(AnonymousClass0C4 r1);

    public abstract int A0y(AnonymousClass0C4 r1);

    public abstract Parcelable A0z();

    public abstract View A10(View view, C02760Bu r2, AnonymousClass0C4 r3, int i);

    public abstract AnonymousClass0D2 A11();

    public void A16(int i) {
    }

    public abstract void A17(int i);

    public abstract void A19(Parcelable parcelable);

    public abstract void A1C(AnonymousClass0C2 r1, AnonymousClass0C4 r2, int i, int i2);

    public abstract void A1D(C02760Bu r1, AnonymousClass0C4 r2);

    public abstract void A1E(C02760Bu r1, RecyclerView recyclerView);

    public abstract void A1F(AnonymousClass0C4 r1);

    public abstract void A1G(AnonymousClass0C4 r1, RecyclerView recyclerView, int i);

    public void A1H(RecyclerView recyclerView) {
    }

    public void A1I(RecyclerView recyclerView, int i, int i2) {
    }

    public void A1J(RecyclerView recyclerView, int i, int i2) {
    }

    public void A1K(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public abstract boolean A1N();

    public abstract boolean A1O();

    public abstract boolean A1P();

    public abstract boolean A1Q();

    public boolean A1R(AnonymousClass0D2 r2) {
        return r2 != null;
    }

    public static AnonymousClass0TB A03(Context context, AttributeSet attributeSet, int i, int i2) {
        AnonymousClass0TB r3 = new AnonymousClass0TB();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C34321gq.A00, i, i2);
        r3.A00 = obtainStyledAttributes.getInt(0, 1);
        r3.A01 = obtainStyledAttributes.getInt(10, 1);
        r3.A02 = obtainStyledAttributes.getBoolean(9, false);
        r3.A03 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return r3;
    }

    public static void A06(GridLayoutManager gridLayoutManager) {
        gridLayoutManager.A02.A01.clear();
        gridLayoutManager.A02.A00.clear();
    }

    public int A0L() {
        AnonymousClass0CI r0 = this.A05;
        if (r0 != null) {
            return r0.A03();
        }
        return 0;
    }

    public int A0M() {
        AnonymousClass0CZ r0;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r0 = recyclerView.A0G) == null) {
            return 0;
        }
        return r0.A0J();
    }

    public int A0N() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int A0O() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A0P() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int A0Q() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View A0R(int i) {
        AnonymousClass0CI r0 = this.A05;
        if (r0 != null) {
            return r0.A06(i);
        }
        return null;
    }

    public void A0S() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0X(View view) {
        AnonymousClass0CI r3 = this.A05;
        RecyclerView recyclerView = ((AnonymousClass0CH) r3.A01).A00;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (r3.A00.A07(indexOfChild)) {
                AnonymousClass0CI.A02(view, r3);
            }
            View childAt = recyclerView.getChildAt(indexOfChild);
            if (childAt != null) {
                recyclerView.A0r(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(indexOfChild);
        }
    }

    public void A0Z(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0N(view));
        }
    }

    public void A0b(C07650Ys r4, C02760Bu r5, AnonymousClass0C4 r6) {
        if (this.A07.canScrollVertically(-1) || this.A07.canScrollHorizontally(-1)) {
            AccessibilityNodeInfo accessibilityNodeInfo = r4.A02;
            accessibilityNodeInfo.addAction(DefaultCrypto.BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.A07.canScrollVertically(1) || this.A07.canScrollHorizontally(1)) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = r4.A02;
            accessibilityNodeInfo2.addAction(ZipDecompressor.UNZIP_BUFFER_SIZE);
            accessibilityNodeInfo2.setScrollable(true);
        }
        r4.A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(A0q(r5, r6), A0p(r5, r6), false, 0)));
    }

    public void A0e(C02760Bu r8) {
        ArrayList arrayList = r8.A05;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AnonymousClass0D3) arrayList.get(i)).A0H;
            AnonymousClass0D3 A042 = RecyclerView.A04(view);
            if (!A042.A09()) {
                A042.A08(false);
                if ((A042.A00 & 256) != 0) {
                    this.A07.removeDetachedView(view, false);
                }
                C02800By r0 = this.A07.A0H;
                if (r0 != null) {
                    r0.A0C(A042);
                }
                A042.A08(true);
                AnonymousClass0D3 A043 = RecyclerView.A04(view);
                A043.A08 = null;
                A043.A0F = false;
                A043.A00 &= -33;
                r8.A09(A043);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = r8.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0g(AnonymousClass0V2 r5) {
        AnonymousClass0V2 r1 = this.A06;
        if (!(r1 == null || r5 == r1 || !r1.A05)) {
            r1.A01();
        }
        this.A06 = r5;
        RecyclerView recyclerView = this.A07;
        AnonymousClass0C1 r12 = recyclerView.A0z;
        r12.A06.removeCallbacks(r12);
        r12.A03.abortAnimation();
        if (r5.A06) {
            StringBuilder sb = new StringBuilder();
            sb.append("An instance of ");
            String simpleName = r5.getClass().getSimpleName();
            sb.append(simpleName);
            sb.append(" was started more than once. Each instance of");
            sb.append(simpleName);
            sb.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w("RecyclerView", sb.toString());
        }
        r5.A03 = recyclerView;
        r5.A02 = this;
        int i = r5.A00;
        if (i != -1) {
            recyclerView.A0y.A06 = i;
            r5.A05 = true;
            r5.A04 = true;
            r5.A01 = recyclerView.A0I.A0k(i);
            r5.A02();
            r5.A03.A0z.A00();
            r5.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean A0i(Bundle bundle, C02760Bu r8, AnonymousClass0C4 r9, int i) {
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    i4 = (this.A00 - A0Q()) - A0N();
                } else {
                    i4 = 0;
                }
                if (this.A07.canScrollHorizontally(1)) {
                    i3 = (this.A03 - A0O()) - A0P();
                }
                i3 = 0;
            } else if (i == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    i2 = -((this.A00 - A0Q()) - A0N());
                } else {
                    i2 = 0;
                }
                if (this.A07.canScrollHorizontally(-1)) {
                    i3 = -((this.A03 - A0O()) - A0P());
                }
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.A07.A0o(i3, i2, true);
                return true;
            }
        }
        return false;
    }

    public int A0p(C02760Bu r4, AnonymousClass0C4 r5) {
        AnonymousClass0CZ r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0G) == null || !A1N()) {
            return 1;
        }
        return r1.A0J();
    }

    public int A0q(C02760Bu r4, AnonymousClass0C4 r5) {
        AnonymousClass0CZ r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0G) == null || !A1O()) {
            return 1;
        }
        return r1.A0J();
    }

    public AnonymousClass0D2 A12(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0D2(context, attributeSet);
    }

    public AnonymousClass0D2 A13(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof AnonymousClass0D2) {
            return new AnonymousClass0D2((AnonymousClass0D2) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass0D2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass0D2(layoutParams);
    }

    public void A14(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A032 = recyclerView.A0E.A03();
            for (int i2 = 0; i2 < A032; i2++) {
                recyclerView.A0E.A06(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A15(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A032 = recyclerView.A0E.A03();
            for (int i2 = 0; i2 < A032; i2++) {
                recyclerView.A0E.A06(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A1B(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AnonymousClass0CZ r0 = this.A07.A0G;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.A0J());
            }
        }
    }

    public void A1M(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A0x(str);
        }
    }

    public AnonymousClass0CP() {
        C18390t5 r2 = new C18390t5(this, 0);
        this.A0D = r2;
        C18390t5 r1 = new C18390t5(this, 1);
        this.A0E = r1;
        this.A08 = new AnonymousClass0CU(r2);
        this.A09 = new AnonymousClass0CU(r1);
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            return Math.max(i2, i3);
        }
        return size;
    }

    public static int A02(View view) {
        return ((AnonymousClass0D2) view.getLayoutParams()).A01();
    }

    public static void A04(View view, int i, int i2, int i3, int i4) {
        AnonymousClass0D2 r2 = (AnonymousClass0D2) view.getLayoutParams();
        Rect rect = r2.A03;
        view.layout(i + rect.left + r2.leftMargin, i2 + rect.top + r2.topMargin, (i3 - rect.right) - r2.rightMargin, (i4 - rect.bottom) - r2.bottomMargin);
    }

    public static void A05(View view, AnonymousClass0CP r8, int i, boolean z) {
        AnonymousClass0D3 A042 = RecyclerView.A04(view);
        if (z || (A042.A00 & 8) != 0) {
            r8.A07.A11.A03(A042);
        } else {
            r8.A07.A11.A04(A042);
        }
        AnonymousClass0D2 r5 = (AnonymousClass0D2) view.getLayoutParams();
        int i2 = A042.A00;
        boolean z2 = false;
        if ((i2 & 32) != 0) {
            z2 = true;
        }
        if (z2 || A042.A08 != null) {
            C02760Bu r0 = A042.A08;
            if (r0 != null) {
                r0.A0A(A042);
            } else {
                A042.A00 = i2 & -33;
            }
            r8.A05.A0B(view, view.getLayoutParams(), i, false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = r8.A07;
            AnonymousClass0CI r02 = r8.A05;
            if (parent == recyclerView) {
                int A052 = r02.A05(view);
                if (i == -1) {
                    i = r8.A05.A03();
                }
                if (A052 == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(r8.A07.indexOfChild(view));
                    sb.append(r8.A07.A0T());
                    throw new IllegalStateException(sb.toString());
                } else if (A052 != i) {
                    AnonymousClass0CP r2 = r8.A07.A0I;
                    View A0R = r2.A0R(A052);
                    if (A0R != null) {
                        r2.A0R(A052);
                        r2.A05.A08(A052);
                        r2.A0Y(A0R, i);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cannot move a child from non-existing index:");
                        sb2.append(A052);
                        sb2.append(r2.A07.toString());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else {
                r02.A0A(view, i, false);
                r5.A01 = true;
                AnonymousClass0V2 r22 = r8.A06;
                if (r22 != null && r22.A05 && RecyclerView.A01(view) == r22.A00) {
                    r22.A01 = view;
                }
            }
        }
        if (r5.A02) {
            A042.A0H.invalidate();
            r5.A02 = false;
        }
    }

    public static boolean A07(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public void A0T(int i, int i2) {
        int A0L = A0L();
        if (A0L == 0) {
            this.A07.A0l(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A0L; i7++) {
            View A0R = A0R(i7);
            Rect rect = this.A07.A0u;
            RecyclerView.A0B(A0R, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0u.set(i5, i6, i3, i4);
        A18(this.A07.A0u, i, i2);
    }

    public void A0U(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0 && !RecyclerView.A1A) {
            this.A03 = 0;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0 && !RecyclerView.A1A) {
            this.A00 = 0;
        }
    }

    public void A0V(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((AnonymousClass0D2) view.getLayoutParams()).A03;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.A07 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A07.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void A0Y(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AnonymousClass0D3 A042 = RecyclerView.A04(view);
        boolean z = false;
        if ((A042.A00 & 8) != 0) {
            z = true;
        }
        C02770Bv r0 = this.A07.A11;
        if (z) {
            r0.A03(A042);
        } else {
            r0.A04(A042);
        }
        AnonymousClass0CI r2 = this.A05;
        boolean z2 = false;
        if ((A042.A00 & 8) != 0) {
            z2 = true;
        }
        r2.A0B(view, layoutParams, i, z2);
    }

    public void A0a(View view, C07650Ys r4) {
        AnonymousClass0D3 A042 = RecyclerView.A04(view);
        if (A042 != null && (A042.A00 & 8) == 0) {
            AnonymousClass0CI r0 = this.A05;
            if (!r0.A02.contains(A042.A0H)) {
                RecyclerView recyclerView = this.A07;
                A1A(view, r4, recyclerView.A0x, recyclerView.A0y);
            }
        }
    }

    public void A0c(C02760Bu r5) {
        int A0L = A0L();
        while (true) {
            A0L--;
            if (A0L >= 0) {
                View A0R = A0R(A0L);
                AnonymousClass0D3 A042 = RecyclerView.A04(A0R);
                if (!A042.A09()) {
                    if ((A042.A00 & 4) == 0 || (A042.A00 & 8) != 0 || this.A07.A0G.A00) {
                        A0R(A0L);
                        this.A05.A08(A0L);
                        r5.A08(A0R);
                        this.A07.A11.A04(A042);
                    } else {
                        if (A0R(A0L) != null) {
                            this.A05.A09(A0L);
                        }
                        r5.A09(A042);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A0d(C02760Bu r3) {
        int A0L = A0L();
        while (true) {
            A0L--;
            if (A0L < 0) {
                return;
            }
            if (!RecyclerView.A04(A0R(A0L)).A09()) {
                A0f(r3, A0L);
            }
        }
    }

    public void A0f(C02760Bu r3, int i) {
        View A0R = A0R(i);
        if (A0R(i) != null) {
            this.A05.A09(i);
        }
        r3.A07(A0R);
    }

    public boolean A0j(View view, AnonymousClass0D2 r4, int i, int i2) {
        if (view.isLayoutRequested() || !A07(view.getWidth(), i, r4.width) || !A07(view.getHeight(), i2, r4.height)) {
            return true;
        }
        return false;
    }

    public View A0k(int i) {
        int A0L = A0L();
        for (int i2 = 0; i2 < A0L; i2++) {
            View A0R = A0R(i2);
            AnonymousClass0D3 A042 = RecyclerView.A04(A0R);
            if (A042 != null) {
                int i3 = A042.A05;
                if (i3 == -1) {
                    i3 = A042.A04;
                }
                if (i3 == i && !A042.A09() && (this.A07.A0y.A08 || (A042.A00 & 8) == 0)) {
                    return A0R;
                }
            }
        }
        return null;
    }

    public void A18(Rect rect, int i, int i2) {
        int width = rect.width() + A0O() + A0P();
        int height = rect.height() + A0Q() + A0N();
        this.A07.setMeasuredDimension(A00(i, width, C011504z.A02(this.A07)), A00(i2, height, C011504z.A01(this.A07)));
    }

    public void A1A(View view, C07650Ys r9, C02760Bu r10, AnonymousClass0C4 r11) {
        int i;
        int i2;
        if (A1O()) {
            i = A02(view);
        } else {
            i = 0;
        }
        if (A1N()) {
            i2 = A02(view);
        } else {
            i2 = 0;
        }
        r9.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false)));
    }

    public void A1L(RecyclerView recyclerView, Object obj, int i, int i2) {
    }
}
