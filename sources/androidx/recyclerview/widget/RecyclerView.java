package androidx.recyclerview.widget;

import X.AnonymousClass007;
import X.AnonymousClass00h;
import X.AnonymousClass0C1;
import X.AnonymousClass0C3;
import X.AnonymousClass0C4;
import X.AnonymousClass0C5;
import X.AnonymousClass0C8;
import X.AnonymousClass0CE;
import X.AnonymousClass0CH;
import X.AnonymousClass0CI;
import X.AnonymousClass0CK;
import X.AnonymousClass0CM;
import X.AnonymousClass0CO;
import X.AnonymousClass0CP;
import X.AnonymousClass0CZ;
import X.AnonymousClass0D2;
import X.AnonymousClass0D3;
import X.AnonymousClass0D4;
import X.AnonymousClass0HK;
import X.AnonymousClass0OK;
import X.AnonymousClass0Q5;
import X.AnonymousClass0TY;
import X.AnonymousClass0UE;
import X.AnonymousClass0V2;
import X.C000600g;
import X.C000700i;
import X.C011004s;
import X.C011504z;
import X.C012005e;
import X.C02730Bq;
import X.C02750Bt;
import X.C02760Bu;
import X.C02770Bv;
import X.C02790Bx;
import X.C02800By;
import X.C02900Ci;
import X.C02910Cj;
import X.C02990Cr;
import X.C06460Tr;
import X.C15800o0;
import X.C16730q0;
import X.C17060qe;
import X.C17220qv;
import X.C18590tP;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RecyclerView extends ViewGroup implements C02730Bq {
    public static final boolean A1A;
    public static final Interpolator A1B = new C18590tP(0);
    public static final Class[] A1C;
    public static final int[] A1D = {16843830};
    public AnonymousClass0CO A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public EdgeEffect A09;
    public EdgeEffect A0A;
    public EdgeEffect A0B;
    public EdgeEffect A0C;
    public AnonymousClass0CE A0D;
    public AnonymousClass0CI A0E;
    public AnonymousClass0C3 A0F;
    public AnonymousClass0CZ A0G;
    public C02800By A0H;
    public AnonymousClass0CP A0I;
    public AnonymousClass0TY A0J;
    public C17220qv A0K;
    public AnonymousClass0UE A0L;
    public C16730q0 A0M;
    public AnonymousClass0CK A0N;
    public Runnable A0O;
    public List A0P;
    public List A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public float A0Z;
    public float A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public VelocityTracker A0j;
    public AnonymousClass0CM A0k;
    public C15800o0 A0l;
    public C02790Bx A0m;
    public AnonymousClass0C5 A0n;
    public AnonymousClass0HK A0o;
    public boolean A0p;
    public final RectF A0q;
    public final Runnable A0r;
    public final int[] A0s;
    public final int A0t;
    public final Rect A0u;
    public final Rect A0v;
    public final AccessibilityManager A0w;
    public final C02760Bu A0x;
    public final AnonymousClass0C4 A0y;
    public final AnonymousClass0C1 A0z;
    public final AnonymousClass0C8 A10;
    public final C02770Bv A11;
    public final ArrayList A12;
    public final ArrayList A13;
    public final List A14;
    public final int[] A15;
    public final int A16;
    public final C02750Bt A17;
    public final int[] A18;
    public final int[] A19;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        }
        A1A = z;
        Class cls = Integer.TYPE;
        A1C = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    private void A0C(View view, View view2) {
        View view3 = view;
        View view4 = view;
        if (view2 != null) {
            view4 = view2;
        }
        Rect rect = this.A0u;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof AnonymousClass0D2) {
            AnonymousClass0D2 r1 = (AnonymousClass0D2) layoutParams;
            if (!r1.A01) {
                Rect rect2 = r1.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        AnonymousClass0CP r2 = this.A0I;
        boolean z = !this.A02;
        boolean z2 = false;
        if (view2 == null) {
            z2 = true;
        }
        r2.A0h(rect, view3, this, z, z2);
    }

    public void A0e() {
        AnonymousClass0V2 r0;
        setScrollState(0);
        AnonymousClass0C1 r1 = this.A0z;
        r1.A06.removeCallbacks(r1);
        r1.A03.abortAnimation();
        AnonymousClass0CP r02 = this.A0I;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A01();
        }
    }

    public void A0g(int i) {
    }

    public void A0n(int i, int i2) {
        A0o(i, i2, false);
    }

    public void A0o(int i, int i2, boolean z) {
        AnonymousClass0CP r1 = this.A0I;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A04) {
            int i3 = 0;
            if (!r1.A1N()) {
                i = 0;
            }
            if (!r1.A1O()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().A0B(i3, 1);
                }
                this.A0z.A01((Interpolator) null, i, i2, Integer.MIN_VALUE);
            }
        }
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0I.A0h(rect, view, this, z, false);
    }

    public void setAdapter(AnonymousClass0CZ r3) {
        suppressLayout(false);
        A0E(r3, this, false, true);
        A0z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C15800o0 r2) {
        if (r2 != null) {
            this.A0l = r2;
            setChildrenDrawingOrderEnabled(true);
        }
    }

    public static AnonymousClass0D3 A04(View view) {
        if (view == null) {
            return null;
        }
        return ((AnonymousClass0D2) view.getLayoutParams()).A00;
    }

    public static RecyclerView A05(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView A052 = A05(viewGroup.getChildAt(i));
                if (A052 != null) {
                    return A052;
                }
            }
        }
        return null;
    }

    private void A06() {
        AnonymousClass0D4 r0;
        long j;
        View focusedChild;
        View A0P2;
        AnonymousClass0D3 A0S2;
        long j2;
        int A042;
        int id;
        AnonymousClass0C4 r5 = this.A0y;
        boolean z = true;
        r5.A01(1);
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0z.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        r5.A09 = false;
        A0d();
        C02770Bv r3 = this.A11;
        AnonymousClass007 r7 = r3.A01;
        r7.clear();
        C000700i r2 = r3.A00;
        r2.A07();
        this.A07++;
        A08();
        if (!this.A0Y || !hasFocus() || this.A0G == null || (focusedChild = getFocusedChild()) == null || (A0P2 = A0P(focusedChild)) == null || (A0S2 = A0S(A0P2)) == null) {
            r5.A07 = -1;
            r5.A01 = -1;
            r5.A02 = -1;
        } else {
            if (this.A0G.A00) {
                j2 = A0S2.A07;
            } else {
                j2 = -1;
            }
            r5.A07 = j2;
            if (this.A0S) {
                A042 = -1;
            } else if ((A0S2.A00 & 8) != 0) {
                A042 = A0S2.A02;
            } else {
                A042 = A0S2.A04();
            }
            r5.A01 = A042;
            View view = A0S2.A0H;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        r5.A02 = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            r5.A02 = id;
        }
        if (!r5.A0B || !this.A03) {
            z = false;
        }
        r5.A0D = z;
        this.A03 = false;
        this.A0W = false;
        r5.A08 = r5.A0A;
        r5.A03 = this.A0G.A0J();
        A0J(this.A15);
        if (r5.A0B) {
            AnonymousClass0CI r10 = this.A0E;
            int A032 = r10.A03();
            for (int i = 0; i < A032; i++) {
                AnonymousClass0D3 A043 = A04(r10.A06(i));
                if (!A043.A09() && ((A043.A00 & 4) == 0 || this.A0G.A00)) {
                    int i2 = A043.A00;
                    int i3 = i2 & 14;
                    if ((i2 & 4) == 0 && (i3 & 4) == 0) {
                        A043.A04();
                    }
                    A043.A05();
                    C06460Tr r02 = new C06460Tr();
                    r02.A00(A043);
                    r3.A01(r02, A043);
                    if (r5.A0D && (A043.A00 & 2) != 0 && (A043.A00 & 8) == 0 && !A043.A09() && (A043.A00 & 4) == 0) {
                        if (this.A0G.A00) {
                            j = A043.A07;
                        } else {
                            j = (long) A043.A04;
                        }
                        r2.A0A(j, A043);
                    }
                }
            }
        }
        if (r5.A0A) {
            AnonymousClass0CI r4 = this.A0E;
            int A044 = r4.A04();
            for (int i4 = 0; i4 < A044; i4++) {
                AnonymousClass0D3 A045 = A04(r4.A07(i4));
                if (!A045.A09() && A045.A02 == -1) {
                    A045.A02 = A045.A04;
                }
            }
            boolean z2 = r5.A0C;
            r5.A0C = false;
            this.A0I.A1D(this.A0x, r5);
            r5.A0C = z2;
            for (int i5 = 0; i5 < r4.A03(); i5++) {
                AnonymousClass0D3 A046 = A04(r4.A06(i5));
                if (!A046.A09() && ((r0 = (AnonymousClass0D4) r7.get(A046)) == null || (r0.A00 & 4) == 0)) {
                    int i6 = A046.A00;
                    int i7 = i6 & 14;
                    if ((i6 & 4) == 0 && (i7 & 4) == 0) {
                        A046.A04();
                    }
                    boolean z3 = false;
                    if ((8192 & A046.A00) != 0) {
                        z3 = true;
                    }
                    A046.A05();
                    C06460Tr r22 = new C06460Tr();
                    r22.A00(A046);
                    if (z3) {
                        A0s(r22, A046);
                    } else {
                        AnonymousClass0D4 r1 = (AnonymousClass0D4) r7.get(A046);
                        if (r1 == null) {
                            r1 = (AnonymousClass0D4) AnonymousClass0D4.A03.B09();
                            if (r1 == null) {
                                r1 = new AnonymousClass0D4();
                            }
                            r7.put(A046, r1);
                        }
                        r1.A00 |= 2;
                        r1.A02 = r22;
                    }
                }
            }
        }
        AnonymousClass0CI r42 = this.A0E;
        int A047 = r42.A04();
        for (int i8 = 0; i8 < A047; i8++) {
            AnonymousClass0D3 A048 = A04(r42.A07(i8));
            if (!A048.A09()) {
                A048.A02 = -1;
                A048.A05 = -1;
            }
        }
        C02760Bu r8 = this.A0x;
        ArrayList arrayList = r8.A06;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AnonymousClass0D3 r12 = (AnonymousClass0D3) arrayList.get(i9);
            r12.A02 = -1;
            r12.A05 = -1;
        }
        ArrayList arrayList2 = r8.A05;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AnonymousClass0D3 r13 = (AnonymousClass0D3) arrayList2.get(i10);
            r13.A02 = -1;
            r13.A05 = -1;
        }
        ArrayList arrayList3 = r8.A04;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                AnonymousClass0D3 r14 = (AnonymousClass0D3) arrayList3.get(i11);
                r14.A02 = -1;
                r14.A05 = -1;
            }
        }
        A0y(true);
        A10(false);
        r5.A04 = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4.A03 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4.A0I.A1Q() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08() {
        /*
            r4 = this;
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x001c
            X.0CE r1 = r4.A0D
            java.util.ArrayList r0 = r1.A04
            r1.A09(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A09(r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0T
            if (r0 == 0) goto L_0x001c
            X.0CP r0 = r4.A0I
            r0.A1H(r4)
        L_0x001c:
            X.0By r0 = r4.A0H
            if (r0 == 0) goto L_0x0029
            X.0CP r0 = r4.A0I
            boolean r0 = r0.A1Q()
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.0CE r0 = r4.A0D
            if (r1 == 0) goto L_0x0074
            r0.A07()
        L_0x0031:
            boolean r0 = r4.A0W
            r3 = 0
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4.A03
            r2 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            X.0C4 r1 = r4.A0y
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0072
            X.0By r0 = r4.A0H
            if (r0 == 0) goto L_0x0072
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x0052
            X.0CP r0 = r4.A0I
            boolean r0 = r0.A0C
        L_0x0050:
            if (r0 == 0) goto L_0x0072
        L_0x0052:
            r0 = 1
        L_0x0053:
            r1.A0B = r0
            if (r0 == 0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x006a
            X.0By r0 = r4.A0H
            if (r0 == 0) goto L_0x006a
            X.0CP r0 = r4.A0I
            boolean r0 = r0.A1Q()
            if (r0 == 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            r1.A0A = r3
            return
        L_0x006d:
            X.0CZ r0 = r4.A0G
            boolean r0 = r0.A00
            goto L_0x0050
        L_0x0072:
            r0 = 0
            goto L_0x0053
        L_0x0074:
            r0.A06()
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A08():void");
    }

    private void A09() {
        boolean z;
        VelocityTracker velocityTracker = this.A0j;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A0j(0);
        EdgeEffect edgeEffect = this.A0A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A0A.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A0C;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A0C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A0B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A09;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A09.isFinished();
        }
        if (z) {
            C011504z.A05(this);
        }
    }

    public static void A0E(AnonymousClass0CZ r5, RecyclerView recyclerView, boolean z, boolean z2) {
        AnonymousClass0CZ r0 = recyclerView.A0G;
        if (r0 != null) {
            r0.A01.unregisterObserver(recyclerView.A17);
            recyclerView.A0G.A0I(recyclerView);
        }
        if (!z || z2) {
            recyclerView.A0c();
        }
        AnonymousClass0CE r1 = recyclerView.A0D;
        r1.A09(r1.A04);
        r1.A09(r1.A05);
        r1.A00 = 0;
        AnonymousClass0CZ r4 = recyclerView.A0G;
        recyclerView.A0G = r5;
        if (r5 != null) {
            r5.BnA(recyclerView.A17);
            r5.A0H(recyclerView);
        }
        AnonymousClass0CP r12 = recyclerView.A0I;
        if (r12 != null) {
            r12.A0n(r4, recyclerView.A0G);
        }
        C02760Bu r3 = recyclerView.A0x;
        AnonymousClass0CZ r2 = recyclerView.A0G;
        r3.A05.clear();
        r3.A04();
        C02900Ci r13 = r3.A02;
        if (r13 == null) {
            r13 = new C02900Ci();
            r3.A02 = r13;
        }
        if (r4 != null) {
            r13.A00--;
        }
        if (!z && r13.A00 == 0) {
            r13.A01();
        }
        if (r2 != null) {
            r13.A00++;
        }
        recyclerView.A0y.A0C = true;
    }

    public static void A0F(AnonymousClass0D3 r3) {
        WeakReference weakReference = r3.A0C;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        r3.A0C = null;
                        return;
                    } else if (view != r3.A0H) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0G(AnonymousClass0D3 r6, RecyclerView recyclerView) {
        View view = r6.A0H;
        boolean z = false;
        if (view.getParent() == recyclerView) {
            z = true;
        }
        recyclerView.A0x.A0A(recyclerView.A0S(view));
        boolean z2 = false;
        if ((r6.A00 & 256) != 0) {
            z2 = true;
        }
        AnonymousClass0CI r2 = recyclerView.A0E;
        if (z2) {
            r2.A0B(view, view.getLayoutParams(), -1, true);
        } else if (!z) {
            r2.A0A(view, -1, true);
        } else {
            int indexOfChild = ((AnonymousClass0CH) r2.A01).A00.indexOfChild(view);
            if (indexOfChild >= 0) {
                r2.A00.A04(indexOfChild);
                AnonymousClass0CI.A01(view, r2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void A0J(int[] iArr) {
        AnonymousClass0CI r9 = this.A0E;
        int A032 = r9.A03();
        if (A032 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < A032; i3++) {
            AnonymousClass0D3 A042 = A04(r9.A06(i3));
            if (!A042.A09()) {
                int i4 = A042.A05;
                if (i4 == -1) {
                    i4 = A042.A04;
                }
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private AnonymousClass0CM getScrollingChildHelper() {
        AnonymousClass0CM r0 = this.A0k;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0CM r02 = new AnonymousClass0CM(this);
        this.A0k = r02;
        return r02;
    }

    public int A0M(AnonymousClass0D3 r8) {
        if ((524 & r8.A00) == 0 && r8.A0A()) {
            AnonymousClass0CE r0 = this.A0D;
            int i = r8.A04;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C02990Cr r6 = (C02990Cr) arrayList.get(i2);
                int i3 = r6.A00;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            if (r6.A02 == i) {
                                i = r6.A01;
                            } else {
                                if (r6.A02 < i) {
                                    i--;
                                }
                                if (r6.A01 <= i) {
                                    i++;
                                }
                            }
                        }
                    } else if (r6.A02 > i) {
                        continue;
                    } else if (r6.A02 + r6.A01 <= i) {
                        i -= r6.A01;
                    }
                } else if (r6.A02 <= i) {
                    i += r6.A01;
                }
            }
            return i;
        }
        return -1;
    }

    public View A0O(float f, float f2) {
        AnonymousClass0CI r2 = this.A0E;
        int A032 = r2.A03();
        while (true) {
            A032--;
            if (A032 < 0) {
                return null;
            }
            View A062 = r2.A06(A032);
            float translationX = A062.getTranslationX();
            float translationY = A062.getTranslationY();
            if (f >= ((float) A062.getLeft()) + translationX && f <= ((float) A062.getRight()) + translationX && f2 >= ((float) A062.getTop()) + translationY && f2 <= ((float) A062.getBottom()) + translationY) {
                return A062;
            }
        }
    }

    public AnonymousClass0D3 A0Q(int i) {
        AnonymousClass0D3 r1 = null;
        if (!this.A0S) {
            AnonymousClass0CI r5 = this.A0E;
            int A042 = r5.A04();
            for (int i2 = 0; i2 < A042; i2++) {
                AnonymousClass0D3 A043 = A04(r5.A07(i2));
                if (A043 != null && (A043.A00 & 8) == 0 && A0M(A043) == i) {
                    if (!r5.A02.contains(A043.A0H)) {
                        return A043;
                    }
                    r1 = A043;
                }
            }
        }
        return r1;
    }

    public AnonymousClass0D3 A0R(int i, boolean z) {
        int i2;
        AnonymousClass0CI r6 = this.A0E;
        int A042 = r6.A04();
        AnonymousClass0D3 r4 = null;
        for (int i3 = 0; i3 < A042; i3++) {
            AnonymousClass0D3 A043 = A04(r6.A07(i3));
            if (A043 != null && (A043.A00 & 8) == 0) {
                if (z || (i2 = A043.A05) == -1) {
                    i2 = A043.A04;
                }
                if (i2 == i) {
                    if (!r6.A02.contains(A043.A0H)) {
                        return A043;
                    }
                    r4 = A043;
                } else {
                    continue;
                }
            }
        }
        return r4;
    }

    public String A0T() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.A0G);
        sb.append(", layout:");
        sb.append(this.A0I);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public void A0U() {
        if (this.A02 && !this.A0S) {
            AnonymousClass0CE r5 = this.A0D;
            ArrayList arrayList = r5.A04;
            if (arrayList.size() > 0) {
                int i = r5.A00;
                if ((4 & i) != 0 && (11 & i) == 0) {
                    Method method = C000600g.A03;
                    AnonymousClass00h.A01("RV PartialInvalidate");
                    A0d();
                    this.A07++;
                    r5.A07();
                    if (!this.A05) {
                        AnonymousClass0CI r4 = this.A0E;
                        int A032 = r4.A03();
                        int i2 = 0;
                        while (true) {
                            if (i2 < A032) {
                                AnonymousClass0D3 A042 = A04(r4.A06(i2));
                                if (A042 != null && !A042.A09() && (A042.A00 & 2) != 0) {
                                    A0V();
                                    break;
                                }
                                i2++;
                            } else {
                                r5.A05();
                                break;
                            }
                        }
                    }
                    A10(true);
                    A0y(true);
                    AnonymousClass00h.A00();
                } else if (arrayList.size() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        Method method2 = C000600g.A03;
        AnonymousClass00h.A01("RV FullInvalidate");
        A0V();
        AnonymousClass00h.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e4, code lost:
        if (r5.A0E.A02.contains(getFocusedChild()) == false) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0423, code lost:
        if (r1 != null) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0433, code lost:
        if (r6.hasFocusable() != false) goto L_0x0471;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0423 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V() {
        /*
            r22 = this;
            r5 = r22
            X.0CZ r0 = r5.A0G
            java.lang.String r7 = "RecyclerView"
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "No adapter attached; skipping layout"
        L_0x000a:
            android.util.Log.e(r7, r0)
            return
        L_0x000e:
            X.0CP r2 = r5.A0I
            if (r2 != 0) goto L_0x0015
            java.lang.String r0 = "No layout manager attached; skipping layout"
            goto L_0x000a
        L_0x0015:
            X.0C4 r4 = r5.A0y
            r0 = 0
            r4.A09 = r0
            int r1 = r4.A04
            r0 = 1
            if (r1 != r0) goto L_0x0194
            r5.A06()
        L_0x0022:
            X.0CP r3 = r5.A0I
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0U(r1, r0)
            r5.A07()
        L_0x003c:
            r0 = 4
            r4.A01(r0)
            r5.A0d()
            int r0 = r5.A07
            int r0 = r0 + 1
            r5.A07 = r0
            r6 = 1
            r4.A04 = r6
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x034f
            X.0CI r9 = r5.A0E
            int r8 = r9.A03()
            int r8 = r8 - r6
        L_0x0057:
            if (r8 < 0) goto L_0x01f5
            android.view.View r0 = r9.A06(r8)
            X.0D3 r10 = A04(r0)
            boolean r0 = r10.A09()
            if (r0 != 0) goto L_0x00b0
            X.0CZ r0 = r5.A0G
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x018f
            long r0 = r10.A07
        L_0x006f:
            X.0Tr r3 = new X.0Tr
            r3.<init>()
            r3.A00(r10)
            X.0Bv r12 = r5.A11
            X.00i r2 = r12.A00
            java.lang.Object r11 = r2.A05(r0)
            X.0D3 r11 = (X.AnonymousClass0D3) r11
            if (r11 == 0) goto L_0x00ad
            boolean r2 = r11.A09()
            if (r2 != 0) goto L_0x00ad
            X.007 r13 = r12.A01
            java.lang.Object r2 = r13.get(r11)
            X.0D4 r2 = (X.AnonymousClass0D4) r2
            r14 = 1
            if (r2 == 0) goto L_0x018c
            int r2 = r2.A00
            r2 = r2 & 1
            if (r2 == 0) goto L_0x018c
        L_0x009a:
            java.lang.Object r2 = r13.get(r10)
            X.0D4 r2 = (X.AnonymousClass0D4) r2
            r13 = 1
            if (r2 == 0) goto L_0x0189
            int r2 = r2.A00
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0189
        L_0x00a9:
            if (r14 == 0) goto L_0x00b3
            if (r11 != r10) goto L_0x00b3
        L_0x00ad:
            r12.A02(r3, r10)
        L_0x00b0:
            int r8 = r8 + -1
            goto L_0x0057
        L_0x00b3:
            r2 = 4
            X.0Tr r2 = X.C02770Bv.A00(r11, r12, r2)
            r12.A02(r3, r10)
            r3 = 8
            X.0Tr r12 = X.C02770Bv.A00(r10, r12, r3)
            if (r2 != 0) goto L_0x0134
            int r15 = r9.A03()
            r14 = 0
        L_0x00c8:
            if (r14 >= r15) goto L_0x010f
            android.view.View r2 = r9.A06(r14)
            X.0D3 r13 = A04(r2)
            if (r13 == r10) goto L_0x010c
            X.0CZ r2 = r5.A0G
            boolean r12 = r2.A00
            if (r12 == 0) goto L_0x0108
            long r2 = r13.A07
        L_0x00dc:
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x010c
            java.lang.String r2 = " \n View Holder 2:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r12 == 0) goto L_0x01d3
            r1.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r1.append(r0)
            r1.append(r13)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r0 = r5.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0108:
            int r2 = r13.A04
            long r2 = (long) r2
            goto L_0x00dc
        L_0x010c:
            int r14 = r14 + 1
            goto L_0x00c8
        L_0x010f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " cannot be found but it is necessary for "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r5.A0T()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r7, r0)
            goto L_0x00b0
        L_0x0134:
            r1 = 0
            r11.A08(r1)
            if (r14 == 0) goto L_0x013d
            A0G(r11, r5)
        L_0x013d:
            if (r11 == r10) goto L_0x0153
            if (r13 == 0) goto L_0x0144
            A0G(r10, r5)
        L_0x0144:
            r11.A09 = r10
            A0G(r11, r5)
            X.0Bu r0 = r5.A0x
            r0.A0A(r11)
            r10.A08(r1)
            r10.A0A = r11
        L_0x0153:
            X.0By r13 = r5.A0H
            X.0Bz r13 = (X.C02810Bz) r13
            int r3 = r2.A00
            int r2 = r2.A01
            boolean r0 = r10.A09()
            if (r0 == 0) goto L_0x0184
            r1 = r2
            r0 = r3
        L_0x0163:
            r15 = r10
            r16 = r3
            r17 = r2
            r18 = r0
            r19 = r1
            r14 = r11
            boolean r0 = r13.A0I(r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x00b0
            java.lang.Runnable r0 = r5.A0O
            X.C011504z.A07(r5, r0)
            r5.A0X = r6
            goto L_0x00b0
        L_0x0184:
            int r0 = r12.A00
            int r1 = r12.A01
            goto L_0x0163
        L_0x0189:
            r13 = 0
            goto L_0x00a9
        L_0x018c:
            r14 = 0
            goto L_0x009a
        L_0x018f:
            int r0 = r10.A04
            long r0 = (long) r0
            goto L_0x006f
        L_0x0194:
            X.0CE r1 = r5.A0D
            java.util.ArrayList r0 = r1.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01a8
            java.util.ArrayList r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01a8
            goto L_0x0022
        L_0x01a8:
            int r1 = r2.A03
            int r0 = r5.getWidth()
            if (r1 != r0) goto L_0x0022
            X.0CP r0 = r5.A0I
            int r1 = r0.A00
            int r0 = r5.getHeight()
            if (r1 != r0) goto L_0x0022
            X.0CP r3 = r5.A0I
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0U(r1, r0)
            goto L_0x003c
        L_0x01d3:
            r1.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r1.append(r0)
            r1.append(r13)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r0 = r5.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f5:
            X.0Bv r0 = r5.A11
            X.0C8 r12 = r5.A10
            X.007 r11 = r0.A01
            int r10 = r11.size()
        L_0x01ff:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x034f
            java.lang.Object r9 = r11.A04(r10)
            X.0D3 r9 = (X.AnonymousClass0D3) r9
            java.lang.Object r8 = r11.A05(r10)
            X.0D4 r8 = (X.AnonymousClass0D4) r8
            int r0 = r8.A00
            r1 = 3
            r0 = r0 & 3
            if (r0 == r1) goto L_0x033c
            int r0 = r8.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x029b
            X.0Tr r0 = r8.A02
            if (r0 == 0) goto L_0x033c
            X.0Tr r2 = r8.A02
            X.0Tr r1 = r8.A01
        L_0x0224:
            r0 = r12
            X.0C9 r0 = (X.AnonymousClass0C9) r0
            androidx.recyclerview.widget.RecyclerView r7 = r0.A00
            X.0Bu r0 = r7.A0x
            r0.A0A(r9)
            A0G(r9, r7)
            r0 = 0
            r9.A08(r0)
            X.0By r13 = r7.A0H
            X.0Bz r13 = (X.C02810Bz) r13
            int r0 = r2.A00
            r19 = r0
            int r14 = r2.A01
            android.view.View r3 = r9.A0H
            if (r1 != 0) goto L_0x0296
            int r2 = r3.getLeft()
            int r1 = r3.getTop()
        L_0x024b:
            int r0 = r9.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0291
            r0 = r19
            if (r0 != r2) goto L_0x0257
            if (r14 == r1) goto L_0x0291
        L_0x0257:
            int r15 = r3.getWidth()
            int r15 = r15 + r2
            int r0 = r3.getHeight()
            int r0 = r0 + r1
            r3.layout(r2, r1, r15, r0)
            r16 = r14
            r17 = r2
            r18 = r1
            r15 = r19
            r14 = r9
            boolean r0 = r13.A0H(r14, r15, r16, r17, r18)
        L_0x0271:
            if (r0 == 0) goto L_0x0282
            boolean r0 = r7.A0X
            if (r0 != 0) goto L_0x0282
            boolean r0 = r7.A0V
            if (r0 == 0) goto L_0x0282
            java.lang.Runnable r0 = r7.A0O
            X.C011504z.A07(r7, r0)
            r7.A0X = r6
        L_0x0282:
            r0 = 0
            r8.A00 = r0
            r0 = 0
            r8.A02 = r0
            r8.A01 = r0
            X.07h r0 = X.AnonymousClass0D4.A03
            r0.BnO(r8)
            goto L_0x01ff
        L_0x0291:
            boolean r0 = r13.A0G(r9)
            goto L_0x0271
        L_0x0296:
            int r2 = r1.A00
            int r1 = r1.A01
            goto L_0x024b
        L_0x029b:
            int r0 = r8.A00
            r1 = 14
            r0 = r0 & 14
            if (r0 == r1) goto L_0x0303
            int r0 = r8.A00
            r1 = 12
            r0 = r0 & 12
            if (r0 != r1) goto L_0x02f2
            X.0Tr r2 = r8.A02
            X.0Tr r3 = r8.A01
            r1 = r12
            X.0C9 r1 = (X.AnonymousClass0C9) r1
            r0 = 0
            r9.A08(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r1.A00
            boolean r0 = r7.A0S
            X.0By r15 = r7.A0H
            X.0Bz r15 = (X.C02810Bz) r15
            if (r0 == 0) goto L_0x02e2
            int r13 = r2.A00
            int r2 = r2.A01
            boolean r0 = r9.A09()
            if (r0 == 0) goto L_0x02dd
            r1 = r2
            r0 = r13
        L_0x02cc:
            r16 = r9
            r19 = r2
            r20 = r0
            r21 = r1
            r17 = r9
            r18 = r13
            boolean r0 = r15.A0I(r16, r17, r18, r19, r20, r21)
            goto L_0x0271
        L_0x02dd:
            int r0 = r3.A00
            int r1 = r3.A01
            goto L_0x02cc
        L_0x02e2:
            int r14 = r2.A00
            int r13 = r3.A00
            if (r14 != r13) goto L_0x0322
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x0322
            r15.A06(r9)
            goto L_0x0282
        L_0x02f2:
            int r0 = r8.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x02fd
            X.0Tr r2 = r8.A02
            r1 = 0
            goto L_0x0224
        L_0x02fd:
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0282
        L_0x0303:
            X.0Tr r2 = r8.A02
            X.0Tr r3 = r8.A01
            r0 = r12
            X.0C9 r0 = (X.AnonymousClass0C9) r0
            androidx.recyclerview.widget.RecyclerView r7 = r0.A00
            r0 = 0
            r9.A08(r0)
            X.0By r15 = r7.A0H
            X.0Bz r15 = (X.C02810Bz) r15
            if (r2 == 0) goto L_0x0336
            int r14 = r2.A00
            int r13 = r3.A00
            if (r14 != r13) goto L_0x0322
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 == r0) goto L_0x0336
        L_0x0322:
            int r1 = r2.A01
            int r0 = r3.A01
            r16 = r9
            r17 = r14
            r18 = r1
            r19 = r13
            r20 = r0
            boolean r0 = r15.A0H(r16, r17, r18, r19, r20)
            goto L_0x0271
        L_0x0336:
            boolean r0 = r15.A0F(r9)
            goto L_0x0271
        L_0x033c:
            r0 = r12
            X.0C9 r0 = (X.AnonymousClass0C9) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.0CP r2 = r0.A0I
            android.view.View r1 = r9.A0H
            X.0Bu r0 = r0.A0x
            r2.A0X(r1)
            r0.A07(r1)
            goto L_0x0282
        L_0x034f:
            X.0CP r0 = r5.A0I
            X.0Bu r2 = r5.A0x
            r0.A0e(r2)
            int r0 = r4.A03
            r4.A05 = r0
            r7 = 0
            r5.A0S = r7
            r5.A0T = r7
            r4.A0B = r7
            r4.A0A = r7
            X.0CP r1 = r5.A0I
            r1.A0C = r7
            java.util.ArrayList r0 = r2.A04
            if (r0 == 0) goto L_0x036e
            r0.clear()
        L_0x036e:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0379
            r1.A02 = r7
            r1.A0B = r7
            r2.A05()
        L_0x0379:
            X.0CP r0 = r5.A0I
            r0.A1F(r4)
            r5.A0y(r6)
            r5.A10(r7)
            X.0Bv r1 = r5.A11
            X.007 r0 = r1.A01
            r0.clear()
            X.00i r0 = r1.A00
            r0.A07()
            int[] r3 = r5.A15
            r2 = r3[r7]
            r1 = r3[r6]
            r5.A0J(r3)
            r0 = r3[r7]
            if (r0 != r2) goto L_0x03a1
            r0 = r3[r6]
            if (r0 == r1) goto L_0x03a4
        L_0x03a1:
            r5.A0m(r7, r7)
        L_0x03a4:
            boolean r0 = r5.A0Y
            if (r0 == 0) goto L_0x03c8
            X.0CZ r0 = r5.A0G
            if (r0 == 0) goto L_0x03c8
            boolean r0 = r5.hasFocus()
            if (r0 == 0) goto L_0x03c8
            int r1 = r5.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r0) goto L_0x03c8
            int r1 = r5.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r0) goto L_0x03d2
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x03d2
        L_0x03c8:
            r0 = -1
            r4.A07 = r0
            r0 = -1
            r4.A01 = r0
            r4.A02 = r0
            return
        L_0x03d2:
            boolean r0 = r5.isFocused()
            if (r0 != 0) goto L_0x03e7
            android.view.View r1 = r5.getFocusedChild()
            X.0CI r0 = r5.A0E
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x03e7
            goto L_0x03c8
        L_0x03e7:
            long r2 = r4.A07
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0435
            X.0CZ r0 = r5.A0G
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0435
            r1 = 0
            X.0CI r10 = r5.A0E
            int r11 = r10.A04()
            r9 = 0
        L_0x03fd:
            if (r9 >= r11) goto L_0x0423
            android.view.View r0 = r10.A07(r9)
            X.0D3 r8 = A04(r0)
            if (r8 == 0) goto L_0x0420
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0420
            long r6 = r8.A07
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0420
            android.view.View r1 = r8.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r1)
            r1 = r8
            if (r0 == 0) goto L_0x0425
        L_0x0420:
            int r9 = r9 + 1
            goto L_0x03fd
        L_0x0423:
            if (r1 == 0) goto L_0x0435
        L_0x0425:
            android.view.View r6 = r1.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x0435
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x0471
        L_0x0435:
            X.0CI r0 = r5.A0E
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x03c8
            int r3 = r4.A01
            r0 = -1
            if (r3 != r0) goto L_0x0443
            r3 = 0
        L_0x0443:
            int r2 = r4.A00()
            r1 = r3
        L_0x0448:
            if (r1 >= r2) goto L_0x045b
            X.0D3 r0 = r5.A0Q(r1)
            if (r0 == 0) goto L_0x045b
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x0471
            int r1 = r1 + 1
            goto L_0x0448
        L_0x045b:
            int r1 = java.lang.Math.min(r2, r3)
        L_0x045f:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x03c8
            X.0D3 r0 = r5.A0Q(r1)
            if (r0 == 0) goto L_0x03c8
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 == 0) goto L_0x045f
        L_0x0471:
            int r3 = r4.A02
            long r1 = (long) r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0485
            android.view.View r1 = r6.findViewById(r3)
            if (r1 == 0) goto L_0x0485
            boolean r0 = r1.isFocusable()
            if (r0 == 0) goto L_0x0485
            r6 = r1
        L_0x0485:
            r6.requestFocus()
            goto L_0x03c8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0V():void");
    }

    public void A0W() {
        AnonymousClass0CI r4 = this.A0E;
        int A042 = r4.A04();
        for (int i = 0; i < A042; i++) {
            ((AnonymousClass0D2) r4.A07(i).getLayoutParams()).A01 = true;
        }
        ArrayList arrayList = this.A0x.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0D2 r1 = (AnonymousClass0D2) ((AnonymousClass0D3) arrayList.get(i2)).A0H.getLayoutParams();
            if (r1 != null) {
                r1.A01 = true;
            }
        }
    }

    public void A0X() {
        int measuredHeight;
        if (this.A09 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A09 = edgeEffect;
            boolean z = this.A0R;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0Y() {
        int measuredWidth;
        if (this.A0A == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0A = edgeEffect;
            boolean z = this.A0R;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0Z() {
        int measuredWidth;
        if (this.A0B == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0B = edgeEffect;
            boolean z = this.A0R;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0a() {
        int measuredHeight;
        if (this.A0C == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0C = edgeEffect;
            boolean z = this.A0R;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0b() {
        if (this.A12.size() != 0) {
            AnonymousClass0CP r1 = this.A0I;
            if (r1 != null) {
                r1.A1M("Cannot invalidate item decorations during a scroll or layout");
            }
            A0W();
            requestLayout();
        }
    }

    public void A0c() {
        C02800By r0 = this.A0H;
        if (r0 != null) {
            r0.A0A();
        }
        AnonymousClass0CP r02 = this.A0I;
        if (r02 != null) {
            C02760Bu r1 = this.A0x;
            r02.A0d(r1);
            this.A0I.A0e(r1);
        }
        C02760Bu r12 = this.A0x;
        r12.A05.clear();
        r12.A04();
    }

    public void A0d() {
        int i = this.A0e + 1;
        this.A0e = i;
        if (i == 1 && !this.A04) {
            this.A05 = false;
        }
    }

    public void A0f(int i) {
        if (this.A0I != null) {
            setScrollState(2);
            this.A0I.A17(i);
            awakenScrollBars();
        }
    }

    public void A0h(int i) {
        if (!this.A04) {
            A0e();
            AnonymousClass0CP r0 = this.A0I;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            r0.A17(i);
            awakenScrollBars();
        }
    }

    public void A0i(int i) {
        if (!this.A04) {
            AnonymousClass0CP r1 = this.A0I;
            if (r1 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                r1.A1G(this.A0y, this, i);
            }
        }
    }

    public void A0k(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A0A;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.A0A.onRelease();
            z = this.A0A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A0B.onRelease();
            z |= this.A0B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A0C.onRelease();
            z |= this.A0C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A09;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A09.onRelease();
            z |= this.A09.isFinished();
        }
        if (z) {
            C011504z.A05(this);
        }
    }

    public void A0m(int i, int i2) {
        this.A0b++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AnonymousClass0UE r0 = this.A0L;
        if (r0 != null) {
            r0.A04(this, i, i2);
        }
        List list = this.A0Q;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((AnonymousClass0UE) this.A0Q.get(size)).A04(this, i, i2);
            }
        }
        this.A0b--;
    }

    public void A0p(int i, int i2, boolean z) {
        int i3 = i + i2;
        AnonymousClass0CI r8 = this.A0E;
        int A042 = r8.A04();
        for (int i4 = 0; i4 < A042; i4++) {
            AnonymousClass0D3 A043 = A04(r8.A07(i4));
            if (A043 != null && !A043.A09()) {
                int i5 = A043.A04;
                if (i5 >= i3) {
                    A043.A07(-i2, z);
                } else if (i5 >= i) {
                    A043.A00 = 8 | A043.A00;
                    A043.A07(-i2, z);
                    A043.A04 = i - 1;
                }
                this.A0y.A0C = true;
            }
        }
        C02760Bu r5 = this.A0x;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass0D3 r2 = (AnonymousClass0D3) arrayList.get(size);
                if (r2 != null) {
                    if (r2.A04 >= i3) {
                        r2.A07(-i2, z);
                    } else if (r2.A04 >= i) {
                        r2.A00 = 8 | r2.A00;
                        r5.A06(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void A0s(C06460Tr r4, AnonymousClass0D3 r5) {
        long j;
        int i = 0 | (r5.A00 & (~DefaultCrypto.BUFFER_SIZE));
        r5.A00 = i;
        if (this.A0y.A0D && (i & 2) != 0 && (i & 8) == 0 && !r5.A09()) {
            if (this.A0G.A00) {
                j = r5.A07;
            } else {
                j = (long) r5.A04;
            }
            this.A11.A00.A0A(j, r5);
        }
        this.A11.A01(r4, r5);
    }

    public void A0t(C02910Cj r3) {
        AnonymousClass0CP r1 = this.A0I;
        if (r1 != null) {
            r1.A1M("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A12;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r3);
        A0W();
        requestLayout();
    }

    public void A0u(C02910Cj r4) {
        AnonymousClass0CP r1 = this.A0I;
        if (r1 != null) {
            r1.A1M("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A12;
        arrayList.remove(r4);
        if (arrayList.isEmpty()) {
            boolean z = false;
            if (getOverScrollMode() == 2) {
                z = true;
            }
            setWillNotDraw(z);
        }
        A0W();
        requestLayout();
    }

    public void A0v(AnonymousClass0UE r2) {
        List list = this.A0Q;
        if (list == null) {
            list = new ArrayList();
            this.A0Q = list;
        }
        list.add(r2);
    }

    public void A0w(AnonymousClass0UE r2) {
        List list = this.A0Q;
        if (list != null) {
            list.remove(r2);
        }
    }

    public void A0x(String str) {
        if (this.A07 > 0) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(A0T());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.A0b > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(A0T());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    public void A0y(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A07 - 1;
        this.A07 = i2;
        if (i2 < 1) {
            this.A07 = 0;
            if (z) {
                int i3 = this.A06;
                this.A06 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.A0w) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                    AnonymousClass0Q5.A00(obtain, i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A14;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        AnonymousClass0D3 r3 = (AnonymousClass0D3) list.get(size);
                        if (r3.A0H.getParent() == this && !r3.A09() && (i = r3.A03) != -1) {
                            C011504z.A06(r3.A0H, i);
                            r3.A03 = -1;
                        }
                    } else {
                        list.clear();
                        return;
                    }
                }
            }
        }
    }

    public void A0z(boolean z) {
        this.A0T = z | this.A0T;
        this.A0S = true;
        AnonymousClass0CI r5 = this.A0E;
        int A042 = r5.A04();
        for (int i = 0; i < A042; i++) {
            AnonymousClass0D3 A043 = A04(r5.A07(i));
            if (A043 != null && !A043.A09()) {
                A043.A00 = 6 | A043.A00;
            }
        }
        A0W();
        C02760Bu r6 = this.A0x;
        ArrayList arrayList = r6.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0D3 r2 = (AnonymousClass0D3) arrayList.get(i2);
            if (r2 != null) {
                int i3 = 6 | r2.A00;
                r2.A00 = i3;
                r2.A00 = 1024 | i3;
            }
        }
        AnonymousClass0CZ r0 = r6.A08.A0G;
        if (r0 == null || !r0.A00) {
            r6.A04();
        }
    }

    public void A10(boolean z) {
        int i = this.A0e;
        if (i < 1) {
            this.A0e = 1;
            i = 1;
        }
        if (!z && !this.A04) {
            this.A05 = false;
        }
        if (i == 1) {
            if (z && this.A05 && !this.A04 && this.A0I != null && this.A0G != null) {
                A0V();
            }
            if (!this.A04) {
                this.A05 = false;
            }
        }
        this.A0e--;
    }

    public boolean A12() {
        if (!this.A02 || this.A0S || this.A0D.A04.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A13(int r19, int r20) {
        /*
            r18 = this;
            r6 = r20
            r7 = r19
            r3 = r18
            X.0CP r1 = r3.A0I
            r10 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r0)
        L_0x0012:
            return r10
        L_0x0013:
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0012
            boolean r8 = r1.A1N()
            boolean r9 = r1.A1O()
            if (r8 == 0) goto L_0x0029
            int r1 = java.lang.Math.abs(r7)
            int r0 = r3.A0t
            if (r1 >= r0) goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            if (r9 == 0) goto L_0x0034
            int r1 = java.lang.Math.abs(r6)
            int r0 = r3.A0t
            if (r1 >= r0) goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r7 != 0) goto L_0x003a
            if (r6 != 0) goto L_0x003a
            return r10
        L_0x003a:
            float r5 = (float) r7
            float r2 = (float) r6
            X.0CM r0 = r3.getScrollingChildHelper()
            boolean r0 = r0.A09(r5, r2)
            if (r0 != 0) goto L_0x0012
            r4 = 1
            if (r8 != 0) goto L_0x004c
            r1 = 0
            if (r9 == 0) goto L_0x004d
        L_0x004c:
            r1 = 1
        L_0x004d:
            r3.dispatchNestedFling(r5, r2, r1)
            X.0TY r0 = r3.A0J
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.A02(r7, r6)
            if (r0 == 0) goto L_0x005b
            return r4
        L_0x005b:
            if (r1 == 0) goto L_0x0012
            if (r9 == 0) goto L_0x0061
            r8 = r8 | 2
        L_0x0061:
            X.0CM r0 = r3.getScrollingChildHelper()
            r0.A0B(r8, r4)
            int r2 = r3.A16
            int r1 = -r2
            int r0 = java.lang.Math.min(r7, r2)
            int r12 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.min(r6, r2)
            int r13 = java.lang.Math.max(r1, r0)
            X.0C1 r3 = r3.A0z
            androidx.recyclerview.widget.RecyclerView r1 = r3.A06
            r0 = 2
            r1.setScrollState(r0)
            r3.A01 = r10
            r3.A00 = r10
            android.view.animation.Interpolator r0 = r3.A02
            android.view.animation.Interpolator r2 = A1B
            if (r0 == r2) goto L_0x009a
            r3.A02 = r2
            android.content.Context r1 = r1.getContext()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r1, r2)
            r3.A03 = r0
        L_0x009a:
            android.widget.OverScroller r9 = r3.A03
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 2147483647(0x7fffffff, float:NaN)
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A00()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A13(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ff, code lost:
        if (r5 == 0.0f) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r0 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A14(android.view.MotionEvent r24, int r25, int r26) {
        /*
            r23 = this;
            r15 = r23
            r15.A0U()
            X.0CZ r0 = r15.A0G
            r14 = 1
            r22 = 0
            r4 = r25
            r3 = r26
            if (r0 == 0) goto L_0x011b
            int[] r0 = r15.A0s
            r0[r22] = r22
            r0[r14] = r22
            r15.A0q(r4, r0, r3)
            r2 = r0[r22]
            r1 = r0[r14]
            int r8 = r25 - r2
            int r7 = r26 - r1
        L_0x0021:
            java.util.ArrayList r0 = r15.A12
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002c
            r15.invalidate()
        L_0x002c:
            int[] r0 = r15.A0s
            r0[r22] = r22
            r0[r14] = r22
            int[] r10 = r15.A19
            r20 = r8
            r21 = r7
            r18 = r2
            r19 = r1
            r16 = r10
            r17 = r0
            r15.A11(r16, r17, r18, r19, r20, r21, r22)
            r5 = r0[r22]
            int r8 = r8 - r5
            r0 = r0[r14]
            int r7 = r7 - r0
            if (r5 != 0) goto L_0x004e
            r13 = 0
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r13 = 1
        L_0x004f:
            int r0 = r15.A0f
            r9 = r10[r22]
            int r0 = r0 - r9
            r15.A0f = r0
            int r5 = r15.A0g
            r0 = r10[r14]
            int r5 = r5 - r0
            r15.A0g = r5
            int[] r6 = r15.A18
            r0 = r6[r22]
            int r0 = r0 + r9
            r6[r22] = r0
            r5 = r6[r14]
            r0 = r10[r14]
            int r5 = r5 + r0
            r6[r14] = r5
            int r5 = r15.getOverScrollMode()
            r0 = 2
            if (r5 == r0) goto L_0x00c5
            if (r24 == 0) goto L_0x00c2
            r5 = 8194(0x2002, float:1.1482E-41)
            int r0 = r24.getSource()
            r0 = r0 & r5
            if (r0 == r5) goto L_0x00c2
            float r6 = r24.getX()
            float r8 = (float) r8
            float r9 = r24.getY()
            float r5 = (float) r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0102
            r15.A0Y()
            android.widget.EdgeEffect r10 = r15.A0A
            float r11 = -r8
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r11 = r11 / r0
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            float r9 = r7 - r9
        L_0x00a2:
            X.AnonymousClass0Q8.A00(r10, r11, r9)
            r9 = 1
        L_0x00a6:
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dd
            r15.A0a()
            android.widget.EdgeEffect r7 = r15.A0C
            float r5 = -r5
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            X.AnonymousClass0Q8.A00(r7, r5, r6)
        L_0x00bf:
            X.C011504z.A05(r15)
        L_0x00c2:
            r15.A0k(r4, r3)
        L_0x00c5:
            if (r2 != 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00cc
        L_0x00c9:
            r15.A0m(r2, r1)
        L_0x00cc:
            boolean r0 = r15.awakenScrollBars()
            if (r0 != 0) goto L_0x00d5
            r15.invalidate()
        L_0x00d5:
            if (r13 != 0) goto L_0x00dc
            if (r2 != 0) goto L_0x00dc
            if (r1 != 0) goto L_0x00dc
            r14 = 0
        L_0x00dc:
            return r14
        L_0x00dd:
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f7
            r15.A0X()
            android.widget.EdgeEffect r8 = r15.A09
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r7 = r7 - r6
            X.AnonymousClass0Q8.A00(r8, r5, r7)
            goto L_0x00bf
        L_0x00f7:
            if (r9 != 0) goto L_0x00bf
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00bf
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            goto L_0x00bf
        L_0x0102:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            r15.A0Z()
            android.widget.EdgeEffect r10 = r15.A0B
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r11 = r8 / r0
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            goto L_0x00a2
        L_0x0119:
            r9 = 0
            goto L_0x00a6
        L_0x011b:
            r1 = 0
            r2 = 0
            r8 = 0
            r7 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A14(android.view.MotionEvent, int, int):boolean");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof AnonymousClass0D2) || !this.A0I.A1R((AnonymousClass0D2) layoutParams)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null || !r2.A1N()) {
            return 0;
        }
        return r2.A0t(this.A0y);
    }

    public int computeHorizontalScrollOffset() {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null || !r2.A1N()) {
            return 0;
        }
        return r2.A0u(this.A0y);
    }

    public int computeHorizontalScrollRange() {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null || !r2.A1N()) {
            return 0;
        }
        return r2.A0v(this.A0y);
    }

    public int computeVerticalScrollExtent() {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null || !r2.A1O()) {
            return 0;
        }
        return r2.A0w(this.A0y);
    }

    public int computeVerticalScrollOffset() {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null || !r2.A1O()) {
            return 0;
        }
        return r2.A0x(this.A0y);
    }

    public int computeVerticalScrollRange() {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null || !r2.A1O()) {
            return 0;
        }
        return r2.A0y(this.A0y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0146, code lost:
        if (r3 <= r2) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (A0P(r12) == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        A0d();
        r11.A0I.A10(r12, r11.A0x, r11.A0y, r13);
        A10(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r11.A04 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0121, code lost:
        if (r10 > 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            r11 = this;
            X.0CZ r0 = r11.A0G
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.0CP r0 = r11.A0I
            if (r0 == 0) goto L_0x0013
            int r0 = r11.A07
            if (r0 > 0) goto L_0x0013
            boolean r0 = r11.A04
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r1 == 0) goto L_0x0087
            r3 = 2
            if (r13 == r3) goto L_0x0020
            if (r13 != r6) goto L_0x0087
        L_0x0020:
            X.0CP r0 = r11.A0I
            boolean r0 = r0.A1O()
            if (r0 == 0) goto L_0x0063
            r0 = 33
            if (r13 != r3) goto L_0x002e
            r0 = 130(0x82, float:1.82E-43)
        L_0x002e:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x0063
        L_0x0034:
            r11.A0U()
            android.view.View r0 = r11.A0P(r12)
            if (r0 == 0) goto L_0x0171
            r11.A0d()
            X.0CP r3 = r11.A0I
            X.0Bu r1 = r11.A0x
            X.0C4 r0 = r11.A0y
            r3.A10(r12, r1, r0, r13)
            r11.A10(r2)
        L_0x004c:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
        L_0x0050:
            if (r5 == 0) goto L_0x0172
        L_0x0052:
            boolean r0 = r5.hasFocusable()
            if (r0 != 0) goto L_0x00ad
            android.view.View r0 = r11.getFocusedChild()
            if (r0 != 0) goto L_0x00a9
            android.view.View r12 = super.focusSearch(r12, r13)
            return r12
        L_0x0063:
            X.0CP r1 = r11.A0I
            boolean r0 = r1.A1N()
            if (r0 == 0) goto L_0x004c
            androidx.recyclerview.widget.RecyclerView r0 = r1.A07
            int r0 = X.AnonymousClass04F.A01(r0)
            r1 = 0
            if (r0 != r6) goto L_0x0075
            r1 = 1
        L_0x0075:
            r0 = 0
            if (r13 != r3) goto L_0x0079
            r0 = 1
        L_0x0079:
            r1 = r1 ^ r0
            r0 = 17
            if (r1 == 0) goto L_0x0080
            r0 = 66
        L_0x0080:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0034
        L_0x0087:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
            if (r5 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x0172
            r11.A0U()
            android.view.View r0 = r11.A0P(r12)
            if (r0 == 0) goto L_0x0171
            r11.A0d()
            X.0CP r3 = r11.A0I
            X.0Bu r1 = r11.A0x
            X.0C4 r0 = r11.A0y
            android.view.View r5 = r3.A10(r12, r1, r0, r13)
            r11.A10(r2)
            goto L_0x0050
        L_0x00a9:
            r11.A0C(r5, r4)
            return r12
        L_0x00ad:
            if (r5 == r11) goto L_0x0172
            android.view.View r0 = r11.A0P(r5)
            if (r0 == 0) goto L_0x0172
            if (r12 == 0) goto L_0x0123
            android.view.View r0 = r11.A0P(r12)
            if (r0 == 0) goto L_0x0123
            android.graphics.Rect r8 = r11.A0u
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            r8.set(r2, r2, r1, r0)
            android.graphics.Rect r7 = r11.A0v
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r7.set(r2, r2, r1, r0)
            r11.offsetDescendantRectToMyCoords(r12, r8)
            r11.offsetDescendantRectToMyCoords(r5, r7)
            X.0CP r0 = r11.A0I
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = X.AnonymousClass04F.A01(r0)
            r10 = -1
            r9 = 1
            if (r0 != r6) goto L_0x00ea
            r9 = -1
        L_0x00ea:
            int r3 = r8.left
            int r2 = r7.left
            if (r3 < r2) goto L_0x00f4
            int r1 = r8.right
            if (r1 > r2) goto L_0x013f
        L_0x00f4:
            int r1 = r8.right
            int r0 = r7.right
            if (r1 >= r0) goto L_0x013f
            r4 = 1
        L_0x00fb:
            int r3 = r8.top
            int r2 = r7.top
            if (r3 < r2) goto L_0x0105
            int r1 = r8.bottom
            if (r1 > r2) goto L_0x0134
        L_0x0105:
            int r1 = r8.bottom
            int r0 = r7.bottom
            if (r1 >= r0) goto L_0x0134
            r10 = 1
        L_0x010c:
            if (r13 == r6) goto L_0x012c
            r0 = 2
            if (r13 == r0) goto L_0x0124
            r0 = 17
            if (r13 == r0) goto L_0x016e
            r0 = 33
            if (r13 == r0) goto L_0x016b
            r0 = 66
            if (r13 == r0) goto L_0x0168
            r0 = 130(0x82, float:1.82E-43)
            if (r13 != r0) goto L_0x014a
            if (r10 <= 0) goto L_0x0172
        L_0x0123:
            return r5
        L_0x0124:
            if (r10 > 0) goto L_0x0123
            if (r10 != 0) goto L_0x0172
            int r4 = r4 * r9
            if (r4 < 0) goto L_0x0172
            return r5
        L_0x012c:
            if (r10 < 0) goto L_0x0123
            if (r10 != 0) goto L_0x0172
            int r4 = r4 * r9
            if (r4 > 0) goto L_0x0172
            return r5
        L_0x0134:
            int r0 = r7.bottom
            if (r1 > r0) goto L_0x013a
            if (r3 < r0) goto L_0x013d
        L_0x013a:
            if (r3 <= r2) goto L_0x013d
            goto L_0x010c
        L_0x013d:
            r10 = 0
            goto L_0x010c
        L_0x013f:
            int r0 = r7.right
            if (r1 > r0) goto L_0x0145
            if (r3 < r0) goto L_0x0148
        L_0x0145:
            r4 = -1
            if (r3 > r2) goto L_0x00fb
        L_0x0148:
            r4 = 0
            goto L_0x00fb
        L_0x014a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid direction: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r11.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0168:
            if (r4 <= 0) goto L_0x0172
            return r5
        L_0x016b:
            if (r10 >= 0) goto L_0x0172
            return r5
        L_0x016e:
            if (r4 >= 0) goto L_0x0172
            return r5
        L_0x0171:
            return r4
        L_0x0172:
            android.view.View r5 = super.focusSearch(r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AnonymousClass0CP r0 = this.A0I;
        if (r0 != null) {
            return r0.A11();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(A0T());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AnonymousClass0CP r1 = this.A0I;
        if (r1 != null) {
            return r1.A12(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(A0T());
        throw new IllegalStateException(sb.toString());
    }

    public int getBaseline() {
        if (this.A0I != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public int getItemDecorationCount() {
        return this.A12.size();
    }

    public C02900Ci getRecycledViewPool() {
        C02760Bu r1 = this.A0x;
        C02900Ci r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        C02900Ci r02 = new C02900Ci();
        r1.A02 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == 0.0f) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2 != 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        A14(r7, (int) (r2 * r6.A0Z), (int) (r3 * r6.A0a));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.0CP r0 = r6.A0I
            r5 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x004a
            int r1 = r7.getAction()
            r0 = 8
            if (r1 != r0) goto L_0x004a
            int r0 = r7.getSource()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L_0x004d
            X.0CP r0 = r6.A0I
            boolean r0 = r0.A1O()
            if (r0 == 0) goto L_0x004b
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r3 = -r0
        L_0x0029:
            X.0CP r0 = r6.A0I
            boolean r0 = r0.A1N()
            if (r0 == 0) goto L_0x0065
            r0 = 10
            float r2 = r7.getAxisValue(r0)
        L_0x0037:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
        L_0x003b:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
        L_0x003f:
            float r0 = r6.A0Z
            float r2 = r2 * r0
            int r1 = (int) r2
            float r0 = r6.A0a
            float r3 = r3 * r0
            int r0 = (int) r3
            r6.A14(r7, r1, r0)
        L_0x004a:
            return r5
        L_0x004b:
            r3 = 0
            goto L_0x0029
        L_0x004d:
            int r1 = r7.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004a
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            X.0CP r1 = r6.A0I
            boolean r0 = r1.A1O()
            if (r0 == 0) goto L_0x0067
            float r3 = -r2
        L_0x0065:
            r2 = 0
            goto L_0x0037
        L_0x0067:
            boolean r0 = r1.A1N()
            if (r0 == 0) goto L_0x004a
            r3 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r4 != false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.A04
            r2 = 0
            if (r0 != 0) goto L_0x0123
            r0 = 0
            r9.A0K = r0
            boolean r0 = r9.A0K(r10)
            r1 = 1
            if (r0 == 0) goto L_0x0016
            r9.A09()
            r9.setScrollState(r2)
            return r1
        L_0x0016:
            X.0CP r0 = r9.A0I
            if (r0 == 0) goto L_0x0123
            boolean r3 = r0.A1N()
            boolean r8 = r0.A1O()
            android.view.VelocityTracker r0 = r9.A0j
            if (r0 != 0) goto L_0x002c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0j = r0
        L_0x002c:
            r0.addMovement(r10)
            int r7 = r10.getActionMasked()
            int r6 = r10.getActionIndex()
            r4 = 2
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L_0x00df
            if (r7 == r1) goto L_0x00d5
            if (r7 == r4) goto L_0x0074
            r0 = 3
            if (r7 == r0) goto L_0x006d
            r0 = 5
            if (r7 == r0) goto L_0x0052
            r0 = 6
            if (r7 != r0) goto L_0x004c
            r9.A0A(r10)
        L_0x004c:
            int r0 = r9.A08
            if (r0 != r1) goto L_0x0123
            r2 = 1
            return r2
        L_0x0052:
            int r0 = r10.getPointerId(r6)
            r9.A0h = r0
            float r0 = r10.getX(r6)
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0f = r0
            r9.A0c = r0
            float r0 = r10.getY(r6)
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0g = r0
            r9.A0d = r0
            goto L_0x004c
        L_0x006d:
            r9.A09()
            r9.setScrollState(r2)
            goto L_0x004c
        L_0x0074:
            int r0 = r9.A0h
            int r4 = r10.findPointerIndex(r0)
            if (r4 >= 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r1.append(r0)
            int r0 = r9.A0h
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r2
        L_0x009a:
            float r0 = r10.getX(r4)
            float r0 = r0 + r5
            int r7 = (int) r0
            float r0 = r10.getY(r4)
            float r0 = r0 + r5
            int r6 = (int) r0
            int r0 = r9.A08
            if (r0 == r1) goto L_0x004c
            int r0 = r9.A0c
            int r4 = r7 - r0
            int r0 = r9.A0d
            int r5 = r6 - r0
            if (r3 == 0) goto L_0x00d3
            int r3 = java.lang.Math.abs(r4)
            int r0 = r9.A0i
            if (r3 <= r0) goto L_0x00d3
            r9.A0f = r7
            r4 = 1
        L_0x00bf:
            if (r8 == 0) goto L_0x00d0
            int r3 = java.lang.Math.abs(r5)
            int r0 = r9.A0i
            if (r3 <= r0) goto L_0x00d0
            r9.A0g = r6
        L_0x00cb:
            r9.setScrollState(r1)
            goto L_0x004c
        L_0x00d0:
            if (r4 == 0) goto L_0x004c
            goto L_0x00cb
        L_0x00d3:
            r4 = 0
            goto L_0x00bf
        L_0x00d5:
            android.view.VelocityTracker r0 = r9.A0j
            r0.clear()
            r9.A0j(r2)
            goto L_0x004c
        L_0x00df:
            boolean r0 = r9.A0p
            if (r0 == 0) goto L_0x00e5
            r9.A0p = r2
        L_0x00e5:
            int r0 = r10.getPointerId(r2)
            r9.A0h = r0
            float r0 = r10.getX()
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0f = r0
            r9.A0c = r0
            float r0 = r10.getY()
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0g = r0
            r9.A0d = r0
            int r0 = r9.A08
            if (r0 != r4) goto L_0x0110
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r9.setScrollState(r1)
            r9.A0j(r1)
        L_0x0110:
            int[] r0 = r9.A18
            r0[r1] = r2
            r0[r2] = r2
            if (r8 == 0) goto L_0x011a
            r3 = r3 | 2
        L_0x011a:
            X.0CM r0 = r9.getScrollingChildHelper()
            r0.A0B(r3, r2)
            goto L_0x004c
        L_0x0123:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Method method = C000600g.A03;
        AnonymousClass00h.A01("RV OnLayout");
        A0V();
        AnonymousClass00h.A00();
        this.A02 = true;
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass0C4 r1;
        AnonymousClass0CP r12 = this.A0I;
        if (r12 == null) {
            A0l(i, i2);
        } else if (r12.A1P()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            AnonymousClass0CP r0 = this.A0I;
            AnonymousClass0C4 r4 = this.A0y;
            r0.A07.A0l(i, i2);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.A0G != null) {
                if (r4.A04 == 1) {
                    A06();
                }
                this.A0I.A0U(i, i2);
                r4.A09 = true;
                A07();
                this.A0I.A0T(i, i2);
                if (this.A0I.A0m()) {
                    this.A0I.A0U(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    r4.A09 = true;
                    A07();
                    this.A0I.A0T(i, i2);
                }
            }
        } else if (this.A0U) {
            r12.A07.A0l(i, i2);
        } else {
            if (this.A01) {
                A0d();
                this.A07++;
                A08();
                A0y(true);
                r1 = this.A0y;
                if (r1.A0A) {
                    r1.A08 = true;
                } else {
                    this.A0D.A06();
                    r1.A08 = false;
                }
                this.A01 = false;
                A10(false);
            } else {
                r1 = this.A0y;
                if (r1.A0A) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            AnonymousClass0CZ r02 = this.A0G;
            if (r02 != null) {
                r1.A03 = r02.A0J();
            } else {
                r1.A03 = 0;
            }
            A0d();
            this.A0I.A07.A0l(i, i2);
            A10(false);
            r1.A08 = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A07 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof AnonymousClass0HK)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0HK r3 = (AnonymousClass0HK) parcelable;
        this.A0o = r3;
        super.onRestoreInstanceState(r3.A00);
        AnonymousClass0CP r1 = this.A0I;
        if (r1 != null && (parcelable2 = this.A0o.A00) != null) {
            r1.A19(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        Parcelable.Creator creator = AnonymousClass0HK.CREATOR;
        AnonymousClass0HK r1 = new AnonymousClass0HK(super.onSaveInstanceState());
        AnonymousClass0HK r0 = this.A0o;
        if (r0 != null) {
            parcelable = r0.A00;
        } else {
            AnonymousClass0CP r02 = this.A0I;
            if (r02 != null) {
                parcelable = r02.A0z();
            } else {
                parcelable = null;
            }
        }
        r1.A00 = parcelable;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        if (r7 == 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0104, code lost:
        if (r6 != 0) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0106, code lost:
        setScrollState(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018e, code lost:
        if (r11 != false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r13 = r19
            boolean r0 = r13.A04
            r3 = 0
            if (r0 != 0) goto L_0x0202
            boolean r0 = r13.A0p
            if (r0 != 0) goto L_0x0202
            X.0qv r0 = r13.A0K
            r4 = r20
            if (r0 != 0) goto L_0x0027
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x0022
            r0 = 0
        L_0x0018:
            r5 = 1
            if (r0 == 0) goto L_0x0039
            r13.A09()
            r13.setScrollState(r3)
            return r5
        L_0x0022:
            boolean r0 = r13.A0K(r4)
            goto L_0x0018
        L_0x0027:
            r0.BjE(r4, r13)
            int r2 = r4.getAction()
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0034
            if (r2 != r0) goto L_0x0037
        L_0x0034:
            r0 = 0
            r13.A0K = r0
        L_0x0037:
            r0 = 1
            goto L_0x0018
        L_0x0039:
            X.0CP r0 = r13.A0I
            if (r0 == 0) goto L_0x0202
            boolean r2 = r0.A1N()
            boolean r12 = r0.A1O()
            android.view.VelocityTracker r0 = r13.A0j
            if (r0 != 0) goto L_0x004f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0j = r0
        L_0x004f:
            int r9 = r4.getActionMasked()
            int r7 = r4.getActionIndex()
            if (r9 != 0) goto L_0x005f
            int[] r0 = r13.A18
            r0[r5] = r3
            r0[r3] = r3
        L_0x005f:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4)
            int[] r0 = r13.A18
            r6 = r0[r3]
            float r8 = (float) r6
            r6 = r0[r5]
            float r6 = (float) r6
            r1.offsetLocation(r8, r6)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L_0x01db
            if (r9 == r5) goto L_0x0199
            r6 = 2
            if (r9 == r6) goto L_0x00ae
            r0 = 3
            if (r9 == r0) goto L_0x00a7
            r0 = 5
            if (r9 == r0) goto L_0x008c
            r0 = 6
            if (r9 != r0) goto L_0x0083
            r13.A0A(r4)
        L_0x0083:
            android.view.VelocityTracker r0 = r13.A0j
            r0.addMovement(r1)
        L_0x0088:
            r1.recycle()
            return r5
        L_0x008c:
            int r0 = r4.getPointerId(r7)
            r13.A0h = r0
            float r0 = r4.getX(r7)
            float r0 = r0 + r8
            int r0 = (int) r0
            r13.A0f = r0
            r13.A0c = r0
            float r0 = r4.getY(r7)
            float r0 = r0 + r8
            int r0 = (int) r0
            r13.A0g = r0
            r13.A0d = r0
            goto L_0x0083
        L_0x00a7:
            r13.A09()
            r13.setScrollState(r3)
            goto L_0x0083
        L_0x00ae:
            int r6 = r13.A0h
            int r7 = r4.findPointerIndex(r6)
            if (r7 >= 0) goto L_0x00d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r1.append(r0)
            int r0 = r13.A0h
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r3
        L_0x00d4:
            float r6 = r4.getX(r7)
            float r6 = r6 + r8
            int r9 = (int) r6
            float r6 = r4.getY(r7)
            float r6 = r6 + r8
            int r8 = (int) r6
            int r7 = r13.A0f
            int r7 = r7 - r9
            int r6 = r13.A0g
            int r6 = r6 - r8
            int r10 = r13.A08
            if (r10 == r5) goto L_0x0109
            if (r2 == 0) goto L_0x00f8
            int r10 = r13.A0i
            if (r7 <= 0) goto L_0x0192
            int r7 = r7 - r10
            int r7 = java.lang.Math.max(r3, r7)
        L_0x00f5:
            r11 = 1
            if (r7 != 0) goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            if (r12 == 0) goto L_0x018e
            int r10 = r13.A0i
            if (r6 <= 0) goto L_0x0187
            int r6 = r6 - r10
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0104:
            if (r6 == 0) goto L_0x018e
        L_0x0106:
            r13.setScrollState(r5)
        L_0x0109:
            int r10 = r13.A08
            if (r10 != r5) goto L_0x0083
            int[] r14 = r13.A0s
            r14[r3] = r3
            r14[r5] = r3
            r16 = 0
            if (r2 == 0) goto L_0x0119
            r16 = r7
        L_0x0119:
            r17 = 0
            if (r12 == 0) goto L_0x011f
            r17 = r6
        L_0x011f:
            int[] r15 = r13.A19
            r18 = 0
            boolean r10 = r13.A15(r14, r15, r16, r17, r18)
            if (r10 == 0) goto L_0x0144
            r10 = r14[r3]
            int r7 = r7 - r10
            r10 = r14[r5]
            int r6 = r6 - r10
            r11 = r0[r3]
            r10 = r15[r3]
            int r11 = r11 + r10
            r0[r3] = r11
            r11 = r0[r5]
            r10 = r15[r5]
            int r11 = r11 + r10
            r0[r5] = r11
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
        L_0x0144:
            r0 = r15[r3]
            int r9 = r9 - r0
            r13.A0f = r9
            r0 = r15[r5]
            int r8 = r8 - r0
            r13.A0g = r8
            if (r2 == 0) goto L_0x0151
            r3 = r7
        L_0x0151:
            r0 = 0
            if (r12 == 0) goto L_0x0155
            r0 = r6
        L_0x0155:
            boolean r0 = r13.A14(r4, r3, r0)
            if (r0 == 0) goto L_0x0162
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
        L_0x0162:
            X.0CO r4 = r13.A00
            if (r4 == 0) goto L_0x0083
            if (r7 != 0) goto L_0x016a
            if (r6 == 0) goto L_0x0083
        L_0x016a:
            boolean r0 = r13.A0V
            if (r0 == 0) goto L_0x017f
            long r2 = r4.A01
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x017f
            long r2 = java.lang.System.nanoTime()
            r4.A01 = r2
            r13.post(r4)
        L_0x017f:
            X.0C3 r0 = r13.A0F
            r0.A01 = r7
            r0.A02 = r6
            goto L_0x0083
        L_0x0187:
            int r6 = r6 + r10
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x0104
        L_0x018e:
            if (r11 == 0) goto L_0x0109
            goto L_0x0106
        L_0x0192:
            int r7 = r7 + r10
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x00f5
        L_0x0199:
            android.view.VelocityTracker r0 = r13.A0j
            r0.addMovement(r1)
            android.view.VelocityTracker r6 = r13.A0j
            r4 = 1000(0x3e8, float:1.401E-42)
            int r0 = r13.A16
            float r0 = (float) r0
            r6.computeCurrentVelocity(r4, r0)
            r7 = 0
            if (r2 == 0) goto L_0x01d9
            android.view.VelocityTracker r2 = r13.A0j
            int r0 = r13.A0h
            float r0 = r2.getXVelocity(r0)
            float r6 = -r0
        L_0x01b4:
            if (r12 == 0) goto L_0x01d7
            android.view.VelocityTracker r2 = r13.A0j
            int r0 = r13.A0h
            float r0 = r2.getYVelocity(r0)
            float r4 = -r0
        L_0x01bf:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01c7
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01cf
        L_0x01c7:
            int r2 = (int) r6
            int r0 = (int) r4
            boolean r0 = r13.A13(r2, r0)
            if (r0 != 0) goto L_0x01d2
        L_0x01cf:
            r13.setScrollState(r3)
        L_0x01d2:
            r13.A09()
            goto L_0x0088
        L_0x01d7:
            r4 = 0
            goto L_0x01bf
        L_0x01d9:
            r6 = 0
            goto L_0x01b4
        L_0x01db:
            int r0 = r4.getPointerId(r3)
            r13.A0h = r0
            float r0 = r4.getX()
            float r0 = r0 + r8
            int r0 = (int) r0
            r13.A0f = r0
            r13.A0c = r0
            float r0 = r4.getY()
            float r0 = r0 + r8
            int r0 = (int) r0
            r13.A0g = r0
            r13.A0d = r0
            if (r12 == 0) goto L_0x01f9
            r2 = r2 | 2
        L_0x01f9:
            X.0CM r0 = r13.getScrollingChildHelper()
            r0.A0B(r2, r3)
            goto L_0x0083
        L_0x0202:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        AnonymousClass0V2 r0 = this.A0I.A06;
        if ((r0 == null || !r0.A05) && this.A07 <= 0 && view2 != null) {
            A0C(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A13;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C17220qv) arrayList.get(i)).Ber(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.A0e != 0 || this.A04) {
            this.A05 = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i, int i2) {
        AnonymousClass0CP r2 = this.A0I;
        if (r2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A04) {
            boolean A1N = r2.A1N();
            boolean A1O = r2.A1O();
            if (!A1N) {
                if (A1O) {
                    i = 0;
                } else {
                    return;
                }
            } else if (!A1O) {
                i2 = 0;
            }
            A14((MotionEvent) null, i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int A022;
        if (this.A07 > 0) {
            int i = 0;
            if (!(accessibilityEvent == null || (A022 = A02(accessibilityEvent)) == 0)) {
                i = A022;
            }
            this.A06 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(AnonymousClass0CK r1) {
        this.A0N = r1;
        C012005e.A0V(this, r1);
    }

    public void setClipToPadding(boolean z) {
        if (z != this.A0R) {
            this.A09 = null;
            this.A0C = null;
            this.A0B = null;
            this.A0A = null;
        }
        this.A0R = z;
        super.setClipToPadding(z);
        if (this.A02) {
            requestLayout();
        }
    }

    public void setItemAnimator(C02800By r3) {
        C02800By r0 = this.A0H;
        if (r0 != null) {
            r0.A0A();
            this.A0H.A04 = null;
        }
        this.A0H = r3;
        if (r3 != null) {
            r3.A04 = this.A0n;
        }
    }

    public void setItemViewCacheSize(int i) {
        C02760Bu r0 = this.A0x;
        r0.A01 = i;
        r0.A05();
    }

    public void setLayoutManager(AnonymousClass0CP r7) {
        C02760Bu r4;
        if (r7 != this.A0I) {
            A0e();
            if (this.A0I != null) {
                C02800By r0 = this.A0H;
                if (r0 != null) {
                    r0.A0A();
                }
                AnonymousClass0CP r02 = this.A0I;
                r4 = this.A0x;
                r02.A0d(r4);
                this.A0I.A0e(r4);
                r4.A05.clear();
                r4.A04();
                if (this.A0V) {
                    AnonymousClass0CP r1 = this.A0I;
                    r1.A0A = false;
                    r1.A1E(r4, this);
                }
                AnonymousClass0CP r2 = this.A0I;
                r2.A07 = null;
                r2.A05 = null;
                r2.A03 = 0;
                r2.A00 = 0;
                r2.A04 = 1073741824;
                r2.A01 = 1073741824;
                this.A0I = null;
            } else {
                r4 = this.A0x;
                r4.A05.clear();
                r4.A04();
            }
            AnonymousClass0CI r5 = this.A0E;
            r5.A00.A02();
            List list = r5.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r5.A01.BZc((View) list.get(size));
                list.remove(size);
            }
            RecyclerView recyclerView = ((AnonymousClass0CH) r5.A01).A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A0r(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0I = r7;
            if (r7 != null) {
                if (r7.A07 == null) {
                    r7.A07 = this;
                    r7.A05 = r5;
                    r7.A03 = getWidth();
                    r7.A00 = getHeight();
                    r7.A04 = 1073741824;
                    r7.A01 = 1073741824;
                    if (this.A0V) {
                        AnonymousClass0CP r12 = this.A0I;
                        r12.A0A = true;
                        r12.A0o(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(r7);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(r7.A07.A0T());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            r4.A05();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(C02900Ci r4) {
        C02760Bu r2 = this.A0x;
        C02900Ci r1 = r2.A02;
        if (r1 != null) {
            r1.A00--;
        }
        r2.A02 = r4;
        if (r4 != null && r2.A08.A0G != null) {
            r4.A00++;
        }
    }

    public void setScrollState(int i) {
        AnonymousClass0V2 r0;
        if (i != this.A08) {
            this.A08 = i;
            if (i != 2) {
                AnonymousClass0C1 r1 = this.A0z;
                r1.A06.removeCallbacks(r1);
                r1.A03.abortAnimation();
                AnonymousClass0CP r02 = this.A0I;
                if (!(r02 == null || (r0 = r02.A06) == null)) {
                    r0.A01();
                }
            }
            AnonymousClass0CP r03 = this.A0I;
            if (r03 != null) {
                r03.A16(i);
            }
            A0g(i);
            AnonymousClass0UE r04 = this.A0L;
            if (r04 != null) {
                r04.A03(this, i);
            }
            List list = this.A0Q;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((AnonymousClass0UE) this.A0Q.get(size)).A03(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setViewCacheExtension(AnonymousClass0OK r2) {
        this.A0x.A03 = r2;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.A04) {
            A0x("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.A04 = false;
                if (!(!this.A05 || this.A0I == null || this.A0G == null)) {
                    requestLayout();
                }
                this.A05 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A04 = true;
            this.A0p = true;
            A0e();
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public static int A00(View view) {
        AnonymousClass0D3 A042 = A04(view);
        if (A042 != null) {
            return A042.A04();
        }
        return -1;
    }

    public static int A01(View view) {
        AnonymousClass0D3 A042 = A04(view);
        if (A042 == null) {
            return -1;
        }
        int i = A042.A05;
        if (i == -1) {
            return A042.A04;
        }
        return i;
    }

    public static int A02(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static Display A03(View view) {
        return view.getDisplay();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r4.A0H == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07() {
        /*
            r4 = this;
            r4.A0d()
            int r0 = r4.A07
            int r0 = r0 + 1
            r4.A07 = r0
            X.0C4 r3 = r4.A0y
            r0 = 6
            r3.A01(r0)
            X.0CE r0 = r4.A0D
            r0.A06()
            X.0CZ r0 = r4.A0G
            int r0 = r0.A0J()
            r3.A03 = r0
            r2 = 0
            r3.A00 = r2
            r3.A08 = r2
            X.0CP r1 = r4.A0I
            X.0Bu r0 = r4.A0x
            r1.A1D(r0, r3)
            r3.A0C = r2
            r0 = 0
            r4.A0o = r0
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0036
            X.0By r1 = r4.A0H
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.A0B = r0
            r0 = 4
            r3.A04 = r0
            r0 = 1
            r4.A0y(r0)
            r4.A10(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A07():void");
    }

    private void A0A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0h) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0h = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A0f = x;
            this.A0c = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A0g = y;
            this.A0d = y;
        }
    }

    public static void A0B(View view, Rect rect) {
        AnonymousClass0D2 r6 = (AnonymousClass0D2) view.getLayoutParams();
        Rect rect2 = r6.A03;
        rect.set((view.getLeft() - rect2.left) - r6.leftMargin, (view.getTop() - rect2.top) - r6.topMargin, view.getRight() + rect2.right + r6.rightMargin, view.getBottom() + rect2.bottom + r6.bottomMargin);
    }

    private boolean A0K(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A13;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C17220qv r1 = (C17220qv) arrayList.get(i);
            if (!r1.BZG(motionEvent, this) || action == 3) {
                i++;
            } else {
                this.A0K = r1;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if ((r1 & 4) == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect A0N(android.view.View r11) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            X.0D2 r8 = (X.AnonymousClass0D2) r8
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x001c
            X.0C4 r7 = r10.A0y
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x001f
            X.0D3 r0 = r8.A00
            int r1 = r0.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x001c
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001f
        L_0x001c:
            android.graphics.Rect r0 = r8.A03
            return r0
        L_0x001f:
            android.graphics.Rect r6 = r8.A03
            r5 = 0
            r6.set(r5, r5, r5, r5)
            java.util.ArrayList r4 = r10.A12
            int r3 = r4.size()
            r2 = 0
        L_0x002c:
            if (r2 >= r3) goto L_0x005b
            android.graphics.Rect r9 = r10.A0u
            r9.set(r5, r5, r5, r5)
            java.lang.Object r0 = r4.get(r2)
            X.0Cj r0 = (X.C02910Cj) r0
            r0.A05(r9, r11, r7, r10)
            int r1 = r6.left
            int r0 = r9.left
            int r1 = r1 + r0
            r6.left = r1
            int r1 = r6.top
            int r0 = r9.top
            int r1 = r1 + r0
            r6.top = r1
            int r1 = r6.right
            int r0 = r9.right
            int r1 = r1 + r0
            r6.right = r1
            int r1 = r6.bottom
            int r0 = r9.bottom
            int r1 = r1 + r0
            r6.bottom = r1
            int r2 = r2 + 1
            goto L_0x002c
        L_0x005b:
            r8.A01 = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0N(android.view.View):android.graphics.Rect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0P(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L_0x0010
            if (r1 == r2) goto L_0x0010
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0010
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r1 == r2) goto L_0x0013
            r3 = 0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0P(android.view.View):android.view.View");
    }

    public AnonymousClass0D3 A0S(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A04(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0j(int i) {
        getScrollingChildHelper().A08(i);
    }

    public void A0l(int i, int i2) {
        setMeasuredDimension(AnonymousClass0CP.A00(i, getPaddingLeft() + getPaddingRight(), C011504z.A02(this)), AnonymousClass0CP.A00(i2, getPaddingTop() + getPaddingBottom(), C011504z.A01(this)));
    }

    public void A0q(int i, int[] iArr, int i2) {
        int i3;
        int i4;
        AnonymousClass0D3 r0;
        A0d();
        this.A07++;
        Method method = C000600g.A03;
        AnonymousClass00h.A01("RV Scroll");
        AnonymousClass0C4 r2 = this.A0y;
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0z.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        if (i != 0) {
            i3 = this.A0I.A0r(this.A0x, r2, i);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.A0I.A0s(this.A0x, r2, i2);
        } else {
            i4 = 0;
        }
        AnonymousClass00h.A00();
        AnonymousClass0CI r8 = this.A0E;
        int A032 = r8.A03();
        for (int i5 = 0; i5 < A032; i5++) {
            View A062 = r8.A06(i5);
            AnonymousClass0D3 A0S2 = A0S(A062);
            if (!(A0S2 == null || (r0 = A0S2.A0A) == null)) {
                View view = r0.A0H;
                int left = A062.getLeft();
                int top = A062.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A0y(true);
        A10(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public void A0r(View view) {
        AnonymousClass0D3 A042 = A04(view);
        AnonymousClass0CZ r0 = this.A0G;
        if (!(r0 == null || A042 == null)) {
            r0.A0C(A042);
        }
        List list = this.A0P;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C17060qe) this.A0P.get(size)).BTW(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A11(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass0CM.A07(getScrollingChildHelper(), iArr, iArr2, i, i2, i3, i4, i5);
    }

    public boolean A15(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().A0C(iArr, iArr2, i, i2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A0A(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A09(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0C(iArr, iArr2, i, i2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return AnonymousClass0CM.A07(getScrollingChildHelper(), iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r0.draw(r8) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r1 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r1 == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            java.util.ArrayList r3 = r7.A12
            int r4 = r3.size()
            r6 = 0
            r2 = 0
        L_0x000b:
            if (r2 >= r4) goto L_0x001b
            java.lang.Object r1 = r3.get(r2)
            X.0Cj r1 = (X.C02910Cj) r1
            X.0C4 r0 = r7.A0y
            r1.A04(r8, r0, r7)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001b:
            android.widget.EdgeEffect r0 = r7.A0A
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0116
            int r2 = r8.save()
            boolean r0 = r7.A0R
            if (r0 == 0) goto L_0x0113
            int r1 = r7.getPaddingBottom()
        L_0x0031:
            r0 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r0)
            int r0 = r7.getHeight()
            int r0 = -r0
            int r0 = r0 + r1
            float r1 = (float) r0
            r0 = 0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A0A
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.draw(r8)
            r5 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r8.restoreToCount(r2)
        L_0x0050:
            android.widget.EdgeEffect r0 = r7.A0C
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x007f
            int r2 = r8.save()
            boolean r0 = r7.A0R
            if (r0 == 0) goto L_0x006f
            int r0 = r7.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r7.getPaddingTop()
            float r0 = (float) r0
            r8.translate(r1, r0)
        L_0x006f:
            android.widget.EdgeEffect r0 = r7.A0C
            if (r0 == 0) goto L_0x007a
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r5 = r5 | r0
            r8.restoreToCount(r2)
        L_0x007f:
            android.widget.EdgeEffect r0 = r7.A0B
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00b5
            int r4 = r8.save()
            int r2 = r7.getWidth()
            boolean r0 = r7.A0R
            if (r0 == 0) goto L_0x0111
            int r1 = r7.getPaddingTop()
        L_0x0099:
            r0 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r0)
            int r0 = -r1
            float r1 = (float) r0
            int r0 = -r2
            float r0 = (float) r0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A0B
            if (r0 == 0) goto L_0x00b0
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r5 = r5 | r0
            r8.restoreToCount(r4)
        L_0x00b5:
            android.widget.EdgeEffect r0 = r7.A09
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00f4
            int r4 = r8.save()
            r0 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r0)
            boolean r2 = r7.A0R
            int r0 = r7.getWidth()
            int r1 = -r0
            if (r2 == 0) goto L_0x010a
            int r0 = r7.getPaddingRight()
            int r1 = r1 + r0
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            int r0 = r7.getPaddingBottom()
            int r1 = r1 + r0
        L_0x00e1:
            float r0 = (float) r1
            r8.translate(r2, r0)
            android.widget.EdgeEffect r0 = r7.A09
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.draw(r8)
            if (r0 == 0) goto L_0x00f0
            r6 = 1
        L_0x00f0:
            r5 = r5 | r6
            r8.restoreToCount(r4)
        L_0x00f4:
            if (r5 != 0) goto L_0x0106
            X.0By r1 = r7.A0H
            if (r1 == 0) goto L_0x0109
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0109
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0109
        L_0x0106:
            X.C011504z.A05(r7)
        L_0x0109:
            return
        L_0x010a:
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            goto L_0x00e1
        L_0x0111:
            r1 = 0
            goto L_0x0099
        L_0x0113:
            r1 = 0
            goto L_0x0031
        L_0x0116:
            r5 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().A01 != null) {
            return true;
        }
        return false;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A07 = 0;
        boolean z = true;
        this.A0V = true;
        if (!this.A02 || isLayoutRequested()) {
            z = false;
        }
        this.A02 = z;
        AnonymousClass0CP r1 = this.A0I;
        if (r1 != null) {
            r1.A0A = true;
            r1.A0o(this);
        }
        this.A0X = false;
        ThreadLocal threadLocal = AnonymousClass0CO.A05;
        AnonymousClass0CO r0 = (AnonymousClass0CO) threadLocal.get();
        this.A00 = r0;
        if (r0 == null) {
            this.A00 = new AnonymousClass0CO();
            Display A032 = A03(this);
            float f = 60.0f;
            if (!isInEditMode() && A032 != null) {
                float refreshRate = A032.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            AnonymousClass0CO r2 = this.A00;
            r2.A00 = (long) (1.0E9f / f);
            threadLocal.set(r2);
        }
        this.A00.A02.add(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C02800By r0 = this.A0H;
        if (r0 != null) {
            r0.A0A();
        }
        A0e();
        this.A0V = false;
        AnonymousClass0CP r1 = this.A0I;
        if (r1 != null) {
            C02760Bu r02 = this.A0x;
            r1.A0A = false;
            r1.A1E(r02, this);
        }
        this.A14.clear();
        removeCallbacks(this.A0O);
        do {
        } while (AnonymousClass0D4.A03.B09() != null);
        AnonymousClass0CO r03 = this.A00;
        if (r03 != null) {
            r03.A02.remove(this);
            this.A00 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C02910Cj) arrayList.get(i)).A03(canvas, this.A0y, this);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A09 = null;
            this.A0C = null;
            this.A0B = null;
            this.A0A = null;
        }
    }

    public void removeDetachedView(View view, boolean z) {
        AnonymousClass0D3 A042 = A04(view);
        if (A042 != null) {
            int i = A042.A00;
            if ((i & 256) != 0) {
                A042.A00 = i & -257;
            } else if (!A042.A09()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A042);
                sb.append(A0T());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        A0r(view);
        super.removeDetachedView(view, z);
    }

    public void setEdgeEffectFactory(C02790Bx r2) {
        Objects.requireNonNull(r2);
        this.A0m = r2;
        this.A09 = null;
        this.A0C = null;
        this.A0B = null;
        this.A0A = null;
    }

    public void setNestedScrollingEnabled(boolean z) {
        AnonymousClass0CM scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.A02) {
            C011004s.A04(scrollingChildHelper.A04);
        }
        scrollingChildHelper.A02 = z;
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.A0i = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.A0i = i2;
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0B(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().A08(0);
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.A0U = z;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setOnFlingListener(AnonymousClass0TY r1) {
        this.A0J = r1;
    }

    @Deprecated
    public void setOnScrollListener(AnonymousClass0UE r1) {
        this.A0L = r1;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0Y = z;
    }

    public void setRecyclerListener(C16730q0 r1) {
        this.A0M = r1;
    }

    public AnonymousClass0CZ getAdapter() {
        return this.A0G;
    }

    public boolean getClipToPadding() {
        return this.A0R;
    }

    public AnonymousClass0CK getCompatAccessibilityDelegate() {
        return this.A0N;
    }

    public C02790Bx getEdgeEffectFactory() {
        return this.A0m;
    }

    public C02800By getItemAnimator() {
        return this.A0H;
    }

    public AnonymousClass0CP getLayoutManager() {
        return this.A0I;
    }

    public int getMaxFlingVelocity() {
        return this.A16;
    }

    public int getMinFlingVelocity() {
        return this.A0t;
    }

    public AnonymousClass0TY getOnFlingListener() {
        return this.A0J;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0Y;
    }

    public int getScrollState() {
        return this.A08;
    }

    public boolean isAttachedToWindow() {
        return this.A0V;
    }

    public final boolean isLayoutSuppressed() {
        return this.A04;
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AnonymousClass0CP r0 = this.A0I;
        if (r0 != null) {
            return r0.A13(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(A0T());
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01ff A[Catch:{ NoSuchMethodException -> 0x024a, ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0212 A[Catch:{ NoSuchMethodException -> 0x024a, ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r23, android.util.AttributeSet r24, int r25) {
        /*
            r22 = this;
            r15 = r22
            r4 = r23
            r3 = r24
            r6 = r25
            r15.<init>(r4, r3, r6)
            X.0Bt r0 = new X.0Bt
            r0.<init>(r15)
            r15.A17 = r0
            X.0Bu r0 = new X.0Bu
            r0.<init>(r15)
            r15.A0x = r0
            X.0Bv r0 = new X.0Bv
            r0.<init>()
            r15.A11 = r0
            X.0Bw r0 = new X.0Bw
            r0.<init>(r15)
            r15.A0r = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r15.A0u = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r15.A0v = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r15.A0q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A12 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A13 = r0
            r2 = 0
            r15.A0e = r2
            r15.A0S = r2
            r15.A0T = r2
            r15.A07 = r2
            r15.A0b = r2
            X.0Bx r0 = new X.0Bx
            r0.<init>()
            r15.A0m = r0
            X.0C0 r0 = new X.0C0
            r0.<init>()
            r15.A0H = r0
            r15.A08 = r2
            r10 = -1
            r15.A0h = r10
            r0 = 1
            r15.A0Z = r0
            r15.A0a = r0
            r1 = 1
            r15.A0Y = r1
            X.0C1 r0 = new X.0C1
            r0.<init>(r15)
            r15.A0z = r0
            X.0C3 r0 = new X.0C3
            r0.<init>()
            r15.A0F = r0
            X.0C4 r0 = new X.0C4
            r0.<init>()
            r15.A0y = r0
            r15.A0W = r2
            r15.A03 = r2
            X.0C6 r0 = new X.0C6
            r0.<init>(r15)
            r15.A0n = r0
            r15.A0X = r2
            r11 = 2
            int[] r0 = new int[r11]
            r15.A15 = r0
            int[] r0 = new int[r11]
            r15.A19 = r0
            int[] r0 = new int[r11]
            r15.A18 = r0
            int[] r0 = new int[r11]
            r15.A0s = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A14 = r0
            X.0C7 r0 = new X.0C7
            r0.<init>(r15)
            r15.A0O = r0
            X.0C9 r0 = new X.0C9
            r0.<init>(r15)
            r15.A10 = r0
            r15.setScrollContainer(r1)
            r15.setFocusableInTouchMode(r1)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r4)
            int r0 = r5.getScaledTouchSlop()
            r15.A0i = r0
            float r0 = X.C016507c.A00(r4, r5)
            r15.A0Z = r0
            float r0 = X.C016507c.A01(r4, r5)
            r15.A0a = r0
            int r0 = r5.getScaledMinimumFlingVelocity()
            r15.A0t = r0
            int r0 = r5.getScaledMaximumFlingVelocity()
            r15.A16 = r0
            int r5 = r15.getOverScrollMode()
            r0 = 0
            if (r5 != r11) goto L_0x00e8
            r0 = 1
        L_0x00e8:
            r15.setWillNotDraw(r0)
            X.0By r5 = r15.A0H
            X.0C5 r0 = r15.A0n
            r5.A04 = r0
            X.0CC r5 = new X.0CC
            r5.<init>(r15)
            X.0CE r0 = new X.0CE
            r0.<init>(r5)
            r15.A0D = r0
            X.0CH r5 = new X.0CH
            r5.<init>(r15)
            X.0CI r0 = new X.0CI
            r0.<init>(r5)
            r15.A0E = r0
            int r0 = X.C012005e.A00(r15)
            if (r0 != 0) goto L_0x0114
            r0 = 8
            X.C012005e.A0S(r15, r0)
        L_0x0114:
            int r0 = X.C011504z.A00(r15)
            if (r0 != 0) goto L_0x011d
            X.C011504z.A06(r15, r1)
        L_0x011d:
            android.content.Context r5 = r15.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r15.A0w = r0
            X.0CK r0 = new X.0CK
            r0.<init>(r15)
            r15.setAccessibilityDelegateCompat(r0)
            int[] r8 = X.C34321gq.A00
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r3, r8, r6, r2)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r7 < r0) goto L_0x014e
            r21 = 0
            r16 = r4
            r17 = r8
            r18 = r3
            r19 = r5
            r20 = r6
            r15.saveAttributeDataForStyleable(r16, r17, r18, r19, r20, r21)
        L_0x014e:
            r7 = 8
            java.lang.String r9 = r5.getString(r7)
            int r7 = r5.getInt(r11, r10)
            if (r7 != r10) goto L_0x015f
            r7 = 262144(0x40000, float:3.67342E-40)
            r15.setDescendantFocusability(r7)
        L_0x015f:
            boolean r7 = r5.getBoolean(r1, r1)
            r15.A0R = r7
            r7 = 3
            boolean r7 = r5.getBoolean(r7, r2)
            if (r7 == 0) goto L_0x01ae
            r7 = 6
            android.graphics.drawable.Drawable r13 = r5.getDrawable(r7)
            android.graphics.drawable.StateListDrawable r13 = (android.graphics.drawable.StateListDrawable) r13
            r7 = 7
            android.graphics.drawable.Drawable r11 = r5.getDrawable(r7)
            r7 = 4
            android.graphics.drawable.Drawable r14 = r5.getDrawable(r7)
            android.graphics.drawable.StateListDrawable r14 = (android.graphics.drawable.StateListDrawable) r14
            r7 = 5
            android.graphics.drawable.Drawable r12 = r5.getDrawable(r7)
            if (r13 == 0) goto L_0x0327
            if (r11 == 0) goto L_0x0327
            if (r14 == 0) goto L_0x0327
            if (r12 == 0) goto L_0x0327
            android.content.Context r7 = r15.getContext()
            android.content.res.Resources r8 = r7.getResources()
            r7 = 2131166577(0x7f070571, float:1.7947403E38)
            int r16 = r8.getDimensionPixelSize(r7)
            r7 = 2131166579(0x7f070573, float:1.7947407E38)
            int r17 = r8.getDimensionPixelSize(r7)
            r7 = 2131166578(0x7f070572, float:1.7947405E38)
            int r18 = r8.getDimensionPixelOffset(r7)
            X.0I5 r10 = new X.0I5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01ae:
            r5.recycle()
            java.lang.String r7 = ": Could not instantiate the LayoutManager: "
            if (r9 == 0) goto L_0x0303
            java.lang.String r5 = r9.trim()
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x0303
            char r8 = r5.charAt(r2)
            r10 = 46
            if (r8 != r10) goto L_0x01db
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = r4.getPackageName()
            r9.append(r8)
        L_0x01d3:
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            goto L_0x01f9
        L_0x01db:
            java.lang.String r8 = "."
            boolean r8 = r5.contains(r8)
            if (r8 != 0) goto L_0x01f9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r8 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r8 = r8.getPackage()
            java.lang.String r8 = r8.getName()
            r9.append(r8)
            r9.append(r10)
            goto L_0x01d3
        L_0x01f9:
            boolean r8 = r15.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            if (r8 == 0) goto L_0x0212
            java.lang.Class r8 = r15.getClass()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
        L_0x0207:
            java.lang.Class r9 = java.lang.Class.forName(r5, r2, r8)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.Class<X.0CP> r8 = X.AnonymousClass0CP.class
            java.lang.Class r11 = r9.asSubclass(r8)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            goto L_0x0217
        L_0x0212:
            java.lang.ClassLoader r8 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            goto L_0x0207
        L_0x0217:
            r10 = 0
            java.lang.Class[] r8 = A1C     // Catch:{ NoSuchMethodException -> 0x0235 }
            java.lang.reflect.Constructor r13 = r11.getConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x0235 }
            r8 = 4
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ NoSuchMethodException -> 0x0235 }
            r12[r2] = r23     // Catch:{ NoSuchMethodException -> 0x0235 }
            r12[r1] = r24     // Catch:{ NoSuchMethodException -> 0x0235 }
            r9 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ NoSuchMethodException -> 0x0235 }
            r12[r9] = r8     // Catch:{ NoSuchMethodException -> 0x0235 }
            r9 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ NoSuchMethodException -> 0x0235 }
            r12[r9] = r8     // Catch:{ NoSuchMethodException -> 0x0235 }
            r10 = r12
            goto L_0x023c
        L_0x0235:
            r9 = move-exception
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x024a }
            java.lang.reflect.Constructor r13 = r11.getConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x024a }
        L_0x023c:
            r13.setAccessible(r1)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.Object r8 = r13.newInstance(r10)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            X.0CP r8 = (X.AnonymousClass0CP) r8     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            r15.setLayoutManager(r8)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            goto L_0x0303
        L_0x024a:
            r2 = move-exception
            r2.initCause(r9)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.String r0 = r3.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.String r0 = ": Error creating LayoutManager "
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            r1.append(r5)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            r0.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02e4, InvocationTargetException -> 0x02c7, InstantiationException -> 0x02aa, IllegalAccessException -> 0x028b, ClassCastException -> 0x026c }
        L_0x026c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Class is not a LayoutManager "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x028b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Cannot access non-public constructor "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02aa:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getPositionDescription()
            r1.append(r0)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02c7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getPositionDescription()
            r1.append(r0)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02e4:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Unable to find LayoutManager "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0303:
            int[] r8 = A1D
            android.content.res.TypedArray r7 = r4.obtainStyledAttributes(r3, r8, r6, r2)
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r0) goto L_0x031c
            r21 = 0
            r16 = r4
            r17 = r8
            r18 = r3
            r19 = r7
            r20 = r6
            r15.saveAttributeDataForStyleable(r16, r17, r18, r19, r20, r21)
        L_0x031c:
            boolean r0 = r7.getBoolean(r2, r1)
            r7.recycle()
            r15.setNestedScrollingEnabled(r0)
            return
        L_0x0327:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Trying to set fast scroller without both required drawables."
            r1.append(r0)
            java.lang.String r0 = r15.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
