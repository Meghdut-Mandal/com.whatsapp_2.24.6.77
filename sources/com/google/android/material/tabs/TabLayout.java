package com.google.android.material.tabs;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass062;
import X.AnonymousClass06R;
import X.AnonymousClass076;
import X.AnonymousClass07S;
import X.AnonymousClass08I;
import X.AnonymousClass0SK;
import X.AnonymousClass6DR;
import X.C011304x;
import X.C011504z;
import X.C013105r;
import X.C017007h;
import X.C017207j;
import X.C07650Ys;
import X.C111295c3;
import X.C111565cU;
import X.C130676Lz;
import X.C138716ia;
import X.C138726ib;
import X.C141666nc;
import X.C159127ir;
import X.C17690rq;
import X.C36331k8;
import X.C36441kJ;
import X.C90474aD;
import X.C90494aF;
import X.C90504aG;
import X.C90524aI;
import X.C91024bK;
import X.C93004fN;
import X.C93024fQ;
import X.C99324t5;
import X.C99334t6;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final C017007h A0l = new C017207j(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ColorStateList A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public Drawable A0D;
    public ViewPager A0E;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public C130676Lz A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public int A0Q;
    public ValueAnimator A0R;
    public DataSetObserver A0S;
    public AnonymousClass07S A0T;
    public C138716ia A0U;
    public C159127ir A0V;
    public C159127ir A0W;
    public AnonymousClass6DR A0X;
    public C138726ib A0Y;
    public boolean A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final TimeInterpolator A0d;
    public final C017007h A0e;
    public final C93004fN A0f;
    public final ArrayList A0g;
    public final ArrayList A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;

    public static ColorStateList A02(int i, int i2) {
        return new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void A05(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C011304x.A03(this)) {
                C93004fN r6 = this.A0f;
                int childCount = r6.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (r6.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                int scrollX = getScrollX();
                int A012 = A01(i, 0.0f);
                if (scrollX != A012) {
                    A04();
                    ValueAnimator valueAnimator = this.A0R;
                    int[] A1O = C36441kJ.A1O();
                    A1O[0] = scrollX;
                    A1O[1] = A012;
                    valueAnimator.setIntValues(A1O);
                    this.A0R.start();
                }
                int i3 = this.A02;
                ValueAnimator valueAnimator2 = r6.A00;
                if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || r6.A02.A0G == i)) {
                    r6.A00.cancel();
                }
                TabLayout tabLayout = r6.A02;
                if (tabLayout.A0G != i) {
                    View childAt = r6.getChildAt(tabLayout.getSelectedTabPosition());
                    View childAt2 = r6.getChildAt(i);
                    if (childAt2 == null) {
                        C93004fN.A01(r6, tabLayout.getSelectedTabPosition());
                        return;
                    }
                    tabLayout.A0G = i;
                    C111295c3 r3 = new C111295c3(childAt, childAt2, r6, 1);
                    ValueAnimator valueAnimator3 = new ValueAnimator();
                    r6.A00 = valueAnimator3;
                    valueAnimator3.setInterpolator(tabLayout.A0d);
                    valueAnimator3.setDuration((long) i3);
                    float[] A0v = C90524aI.A0v();
                    // fill-array-data instruction
                    A0v[0] = 0;
                    A0v[1] = 1065353216;
                    valueAnimator3.setFloatValues(A0v);
                    valueAnimator3.addUpdateListener(r3);
                    valueAnimator3.start();
                    return;
                }
                return;
            }
            A0C(0.0f, i, true, true);
        }
    }

    private void A07(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0E;
        if (viewPager2 != null) {
            C138726ib r1 = this.A0Y;
            if (!(r1 == null || (list2 = viewPager2.A0E) == null)) {
                list2.remove(r1);
            }
            C138716ia r12 = this.A0U;
            if (!(r12 == null || (list = this.A0E.A0D) == null)) {
                list.remove(r12);
            }
        }
        C159127ir r2 = this.A0V;
        if (r2 != null) {
            this.A0g.remove(r2);
            this.A0V = null;
        }
        if (viewPager != null) {
            this.A0E = viewPager;
            C138726ib r13 = this.A0Y;
            if (r13 == null) {
                r13 = new C138726ib(this);
                this.A0Y = r13;
            }
            r13.A01 = 0;
            r13.A00 = 0;
            viewPager.A0K(r13);
            C141666nc r14 = new C141666nc(viewPager);
            this.A0V = r14;
            C90474aD.A1H(r14, this.A0g);
            AnonymousClass07S adapter = viewPager.getAdapter();
            if (adapter != null) {
                A0E(adapter, true);
            }
            C138716ia r15 = this.A0U;
            if (r15 == null) {
                r15 = new C138716ia(this);
                this.A0U = r15;
            }
            r15.A00 = true;
            List list3 = viewPager.A0D;
            if (list3 == null) {
                list3 = AnonymousClass001.A0I();
                viewPager.A0D = list3;
            }
            list3.add(r15);
            A0C(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            this.A0E = null;
            A0E((AnonymousClass07S) null, false);
        }
        this.A0Z = z;
    }

    public void A0C(float f, int i, boolean z, boolean z2) {
        int A012;
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            C93004fN r3 = this.A0f;
            if (round < r3.getChildCount()) {
                if (z2) {
                    r3.A02.A0G = round;
                    ValueAnimator valueAnimator = r3.A00;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        r3.A00.cancel();
                    }
                    C93004fN.A00(r3.getChildAt(i), r3.getChildAt(i + 1), r3, f);
                }
                ValueAnimator valueAnimator2 = this.A0R;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0R.cancel();
                }
                if (i < 0) {
                    A012 = 0;
                } else {
                    A012 = A01(i, f);
                }
                scrollTo(A012, 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public void A0F(ViewPager viewPager, boolean z) {
        A07(viewPager, false);
    }

    public void A0K(boolean z) {
        float f;
        int i = 0;
        while (true) {
            C93004fN r1 = this.A0f;
            if (i < r1.getChildCount()) {
                View childAt = r1.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.A0H == 1 && this.A0J == 0) {
                    layoutParams.width = 0;
                    f = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f = 0.0f;
                }
                layoutParams.weight = f;
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r5 = (X.C93024fQ) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r6 = 0
        L_0x0001:
            X.4fN r1 = r7.A0f
            int r0 = r1.getChildCount()
            if (r6 >= r0) goto L_0x0032
            android.view.View r5 = r1.getChildAt(r6)
            boolean r0 = r5 instanceof X.C93024fQ
            if (r0 == 0) goto L_0x002f
            X.4fQ r5 = (X.C93024fQ) r5
            android.graphics.drawable.Drawable r4 = r5.A00
            if (r4 == 0) goto L_0x002f
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r0.draw(r8)
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AnonymousClass07S r2) {
        A0E(r2, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        A0F(viewPager, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r6.A0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(int r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.A0H
            r5 = 0
            r4 = 2
            if (r0 == 0) goto L_0x0008
            if (r0 != r4) goto L_0x0046
        L_0x0008:
            X.4fN r3 = r6.A0f
            android.view.View r2 = r3.getChildAt(r7)
            if (r2 == 0) goto L_0x0046
            int r1 = r7 + 1
            int r0 = r3.getChildCount()
            if (r1 >= r0) goto L_0x0042
            android.view.View r0 = r3.getChildAt(r1)
        L_0x001c:
            int r1 = r2.getWidth()
            if (r0 == 0) goto L_0x0026
            int r5 = r0.getWidth()
        L_0x0026:
            int r2 = r2.getLeft()
            int r0 = r1 / 2
            int r2 = r2 + r0
            int r0 = r6.getWidth()
            int r0 = r0 / r4
            int r2 = r2 - r0
            int r1 = r1 + r5
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 * r8
            int r1 = (int) r1
            int r0 = X.AnonymousClass04F.A01(r6)
            if (r0 != 0) goto L_0x0044
            int r2 = r2 + r1
            return r2
        L_0x0042:
            r0 = 0
            goto L_0x001c
        L_0x0044:
            int r2 = r2 - r1
            return r2
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A01(int, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1 != 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r5 = this;
            int r0 = r5.A0H
            r4 = 2
            r2 = 0
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            r0 = 0
        L_0x0009:
            X.4fN r3 = r5.A0f
            X.AnonymousClass04F.A06(r3, r0, r2, r2, r2)
            int r0 = r5.A0H
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x001b
            if (r0 == r4) goto L_0x001b
        L_0x0017:
            r5.A0K(r2)
            return
        L_0x001b:
            int r0 = r5.A0J
            if (r0 != r4) goto L_0x0026
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r1, r0)
        L_0x0026:
            r3.setGravity(r2)
            goto L_0x0017
        L_0x002a:
            int r1 = r5.A0J
            if (r1 == 0) goto L_0x0034
            r0 = 1
            if (r1 == r2) goto L_0x003e
            if (r1 == r4) goto L_0x003b
            goto L_0x0017
        L_0x0034:
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r1, r0)
        L_0x003b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x003e:
            r3.setGravity(r0)
            goto L_0x0017
        L_0x0042:
            int r1 = r5.A0P
            int r0 = r5.A08
            int r0 = X.AnonymousClass001.A02(r1, r0, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A03():void");
    }

    private void A04() {
        if (this.A0R == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0R = valueAnimator;
            valueAnimator.setInterpolator(this.A0d);
            this.A0R.setDuration((long) this.A02);
            C111565cU.A00(this.A0R, this, 4);
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.A0j;
        if (i != -1) {
            return i;
        }
        int i2 = this.A0H;
        if (i2 == 0 || i2 == 2) {
            return this.A0k;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, C36331k8.A00(this, this.A0f.getWidth() - getWidth()));
    }

    private void setSelectedTabView(int i) {
        C93004fN r5 = this.A0f;
        int childCount = r5.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r5.getChildAt(i2);
                boolean z = true;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(AnonymousClass000.A1S(i2, i));
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(AnonymousClass000.A1S(i2, i));
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                    if (childAt instanceof C93024fQ) {
                        ((C93024fQ) childAt).A05();
                    }
                }
            }
        }
    }

    public AnonymousClass6DR A08() {
        C93024fQ r1;
        CharSequence charSequence;
        AnonymousClass6DR r2 = (AnonymousClass6DR) A0l.B09();
        if (r2 == null) {
            r2 = new AnonymousClass6DR();
        }
        r2.A03 = this;
        C017007h r0 = this.A0e;
        if (r0 == null || (r1 = (C93024fQ) r0.B09()) == null) {
            r1 = new C93024fQ(getContext(), this);
        }
        r1.setTab(r2);
        r1.setFocusable(true);
        r1.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(r2.A04)) {
            charSequence = r2.A05;
        } else {
            charSequence = r2.A04;
        }
        r1.setContentDescription(charSequence);
        r2.A02 = r1;
        return r2;
    }

    public AnonymousClass6DR A09(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.A0h;
        if (i < arrayList.size()) {
            return (AnonymousClass6DR) arrayList.get(i);
        }
        return null;
    }

    public void A0B() {
        C93004fN r3 = this.A0f;
        int childCount = r3.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C93024fQ r1 = (C93024fQ) r3.getChildAt(childCount);
            r3.removeViewAt(childCount);
            if (r1 != null) {
                r1.setTab((AnonymousClass6DR) null);
                r1.setSelected(false);
                this.A0e.BnO(r1);
            }
            requestLayout();
        }
        Iterator it = this.A0h.iterator();
        while (it.hasNext()) {
            AnonymousClass6DR r2 = (AnonymousClass6DR) it.next();
            it.remove();
            r2.A03 = null;
            r2.A02 = null;
            r2.A06 = null;
            r2.A05 = null;
            r2.A04 = null;
            r2.A00 = -1;
            r2.A01 = null;
            A0l.BnO(r2);
        }
        this.A0X = null;
    }

    public void A0D(int i) {
        int i2;
        AnonymousClass6DR r0 = this.A0X;
        if (r0 != null) {
            i2 = r0.A00;
        } else {
            i2 = 0;
        }
        C93004fN r02 = this.A0f;
        C93024fQ r1 = (C93024fQ) r02.getChildAt(i);
        r02.removeViewAt(i);
        if (r1 != null) {
            r1.setTab((AnonymousClass6DR) null);
            r1.setSelected(false);
            this.A0e.BnO(r1);
        }
        requestLayout();
        ArrayList arrayList = this.A0h;
        AnonymousClass6DR r2 = (AnonymousClass6DR) arrayList.remove(i);
        if (r2 != null) {
            r2.A03 = null;
            r2.A02 = null;
            r2.A06 = null;
            r2.A05 = null;
            r2.A04 = null;
            r2.A00 = -1;
            r2.A01 = null;
            A0l.BnO(r2);
        }
        int size = arrayList.size();
        int i3 = -1;
        for (int i4 = i; i4 < size; i4++) {
            if (((AnonymousClass6DR) arrayList.get(i4)).A00 == this.A0G) {
                i3 = i4;
            }
            ((AnonymousClass6DR) arrayList.get(i4)).A00 = i4;
        }
        this.A0G = i3;
        if (i2 == i) {
            AnonymousClass6DR r12 = null;
            if (!arrayList.isEmpty()) {
                r12 = (AnonymousClass6DR) arrayList.get(Math.max(0, i - 1));
            }
            A0J(r12, true);
        }
    }

    public void A0E(AnonymousClass07S r3, boolean z) {
        DataSetObserver dataSetObserver;
        AnonymousClass07S r1 = this.A0T;
        if (!(r1 == null || (dataSetObserver = this.A0S) == null)) {
            r1.A0B(dataSetObserver);
        }
        this.A0T = r3;
        if (z && r3 != null) {
            DataSetObserver dataSetObserver2 = this.A0S;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new C91024bK(this);
                this.A0S = dataSetObserver2;
            }
            r3.A0A(dataSetObserver2);
        }
        A0A();
    }

    public void A0G(C17690rq r3) {
        ArrayList arrayList = this.A0g;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public void A0H(AnonymousClass6DR r3) {
        ArrayList arrayList = this.A0h;
        A0I(r3, arrayList.size(), arrayList.isEmpty());
    }

    public void A0I(AnonymousClass6DR r8, int i, boolean z) {
        float f;
        if (r8.A03 == this) {
            r8.A00 = i;
            ArrayList arrayList = this.A0h;
            arrayList.add(i, r8);
            int size = arrayList.size();
            int i2 = -1;
            for (int i3 = i + 1; i3 < size; i3++) {
                if (((AnonymousClass6DR) arrayList.get(i3)).A00 == this.A0G) {
                    i2 = i3;
                }
                ((AnonymousClass6DR) arrayList.get(i3)).A00 = i3;
            }
            this.A0G = i2;
            C93024fQ r6 = r8.A02;
            r6.setSelected(false);
            r6.setActivated(false);
            C93004fN r5 = this.A0f;
            int i4 = r8.A00;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.A0H == 1 && this.A0J == 0) {
                layoutParams.width = 0;
                f = 1.0f;
            } else {
                layoutParams.width = -2;
                f = 0.0f;
            }
            layoutParams.weight = f;
            r5.addView(r6, i4, layoutParams);
            if (z) {
                r8.A00();
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("Tab belongs to a different TabLayout.");
    }

    public void A0J(AnonymousClass6DR r6, boolean z) {
        int i;
        AnonymousClass6DR r4 = this.A0X;
        if (r4 != r6) {
            if (r6 != null) {
                i = r6.A00;
            } else {
                i = -1;
            }
            if (z) {
                if ((r4 == null || r4.A00 == -1) && i != -1) {
                    A0C(0.0f, i, true, true);
                } else {
                    A05(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0X = r6;
            if (r4 != null && r4.A03 != null) {
                ArrayList arrayList = this.A0g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size);
                }
            }
            if (r6 != null) {
                ArrayList arrayList2 = this.A0g;
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        ((C159127ir) arrayList2.get(size2)).Biv(r6);
                    } else {
                        return;
                    }
                }
            }
        } else if (r4 != null) {
            ArrayList arrayList3 = this.A0g;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    ((C159127ir) arrayList3.get(size3)).Biu(r6);
                } else {
                    A05(r6.A00);
                    return;
                }
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A08("Only TabItem instances can be added to TabLayout");
    }

    public int getSelectedTabPosition() {
        AnonymousClass6DR r0 = this.A0X;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0h.size();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.A0H;
        if ((i == 0 || i == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setInlineLabel(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            int i = 0;
            while (true) {
                C93004fN r1 = this.A0f;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C93024fQ) {
                        C93024fQ r4 = (C93024fQ) childAt;
                        r4.setOrientation(r4.A0A.A0N ^ true ? 1 : 0);
                        TextView textView = r4.A04;
                        if (textView == null && r4.A02 == null) {
                            C93024fQ.A04(r4.A03, r4.A05, r4, true);
                        } else {
                            C93024fQ.A04(r4.A02, textView, r4, false);
                        }
                    }
                    i++;
                } else {
                    A03();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C159127ir r3) {
        C159127ir r1 = this.A0W;
        if (r1 != null) {
            this.A0g.remove(r1);
        }
        this.A0W = r3;
        if (r3 != null) {
            C90474aD.A1H(r3, this.A0g);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = AnonymousClass08I.A01(drawable).mutate();
        this.A0D = mutate;
        A06(mutate, this.A0Q);
        int i = this.A05;
        if (i == -1) {
            i = this.A0D.getIntrinsicHeight();
        }
        this.A0f.A02(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.A0Q = i;
        A06(this.A0D, i);
        A0K(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            C011504z.A05(this.A0f);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.A05 = i;
        this.A0f.A02(i);
    }

    public void setTabGravity(int i) {
        if (this.A0J != i) {
            this.A0J = i;
            A03();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0A != colorStateList) {
            this.A0A = colorStateList;
            ArrayList arrayList = this.A0h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C93024fQ r0 = ((AnonymousClass6DR) arrayList.get(i)).A02;
                if (r0 != null) {
                    r0.A06();
                }
            }
        }
    }

    public void setTabIndicatorAnimationMode(int i) {
        C130676Lz r0;
        this.A03 = i;
        if (i == 0) {
            r0 = new C130676Lz();
        } else if (i == 1) {
            r0 = new C99324t5();
        } else if (i == 2) {
            r0 = new C99334t6();
        } else {
            throw AnonymousClass000.A0c(" is not a valid TabIndicatorAnimationMode", C90504aG.A0q(i));
        }
        this.A0M = r0;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0O = z;
        C93004fN r1 = this.A0f;
        C93004fN.A01(r1, r1.A02.getSelectedTabPosition());
        C011504z.A05(r1);
    }

    public void setTabMode(int i) {
        if (i != this.A0H) {
            this.A0H = i;
            A03();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0B != colorStateList) {
            this.A0B = colorStateList;
            int i = 0;
            while (true) {
                C93004fN r1 = this.A0f;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C93024fQ) {
                        C93024fQ.A03(getContext(), (C93024fQ) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0C != colorStateList) {
            this.A0C = colorStateList;
            ArrayList arrayList = this.A0h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C93024fQ r0 = ((AnonymousClass6DR) arrayList.get(i)).A02;
                if (r0 != null) {
                    r0.A06();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0F != z) {
            this.A0F = z;
            int i = 0;
            while (true) {
                C93004fN r1 = this.A0f;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C93024fQ) {
                        C93024fQ.A03(getContext(), (C93024fQ) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = 2132084401(0x7f1506b1, float:1.9808972E38)
            r1 = r18
            r12 = r19
            r15 = r20
            android.content.Context r0 = X.C27891Qg.A00(r1, r12, r15, r0)
            r2 = r17
            r2.<init>(r0, r12, r15)
            r5 = -1
            r2.A0G = r5
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0h = r0
            r2.A0I = r5
            r1 = 0
            r2.A0Q = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.A0K = r0
            r2.A05 = r5
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0g = r0
            r3 = 12
            X.07i r0 = new X.07i
            r0.<init>(r3)
            r2.A0e = r0
            android.content.Context r11 = r2.getContext()
            r2.setHorizontalScrollBarEnabled(r1)
            X.4fN r6 = new X.4fN
            r6.<init>(r11, r2)
            r2.A0f = r6
            r3 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r5)
            super.addView(r6, r1, r0)
            int[] r13 = X.C27931Qk.A0c
            r4 = 1
            int[] r14 = new int[r4]
            r0 = 24
            r7 = 24
            r14[r1] = r0
            r16 = 2132084401(0x7f1506b1, float:1.9808972E38)
            android.content.res.TypedArray r3 = X.C013205s.A00(r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x008a
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.05l r8 = new X.05l
            r8.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r8.A0C(r0)
            r8.A0B(r11)
            float r0 = X.C011004s.A00(r2)
            r8.A09(r0)
            X.C011504z.A04(r8, r2)
        L_0x008a:
            r0 = 5
            android.graphics.drawable.Drawable r0 = X.AnonymousClass061.A02(r11, r3, r0)
            r2.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            r0 = 8
            int r0 = r3.getColor(r0, r1)
            r2.setSelectedTabIndicatorColor(r0)
            r0 = 11
            int r0 = r3.getDimensionPixelSize(r0, r5)
            r6.A02(r0)
            r0 = 10
            int r0 = r3.getInt(r0, r1)
            r2.setSelectedTabIndicatorGravity(r0)
            r0 = 7
            int r0 = r3.getInt(r0, r1)
            r2.setTabIndicatorAnimationMode(r0)
            r0 = 9
            boolean r0 = r3.getBoolean(r0, r4)
            r2.setTabIndicatorFullWidth(r0)
            r0 = 16
            int r6 = r3.getDimensionPixelSize(r0, r1)
            r2.A06 = r6
            r2.A07 = r6
            r2.A09 = r6
            r2.A08 = r6
            r0 = 19
            int r0 = r3.getDimensionPixelSize(r0, r6)
            r2.A08 = r0
            r6 = 20
            int r0 = r2.A09
            int r0 = r3.getDimensionPixelSize(r6, r0)
            r2.A09 = r0
            r6 = 18
            int r0 = r2.A07
            int r0 = r3.getDimensionPixelSize(r6, r0)
            r2.A07 = r0
            r6 = 17
            int r0 = r2.A06
            int r0 = r3.getDimensionPixelSize(r6, r0)
            r2.A06 = r0
            r0 = 2130969843(0x7f0404f3, float:1.754838E38)
            boolean r6 = X.C014506h.A04(r11, r0, r1)
            r0 = 2130970900(0x7f040914, float:1.7550523E38)
            if (r6 == 0) goto L_0x0101
            r0 = 2130970931(0x7f040933, float:1.7550586E38)
        L_0x0101:
            r2.A0b = r0
            r0 = 2132083744(0x7f150420, float:1.9807639E38)
            int r9 = r3.getResourceId(r7, r0)
            r2.A0c = r9
            int[] r8 = X.AnonymousClass1MJ.A0M
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r9, r8)
            int r0 = r6.getDimensionPixelSize(r1, r1)     // Catch:{ all -> 0x0214 }
            float r0 = (float) r0     // Catch:{ all -> 0x0214 }
            r2.A01 = r0     // Catch:{ all -> 0x0214 }
            r0 = 3
            r7 = 3
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r11, r6, r0)     // Catch:{ all -> 0x0214 }
            r2.A0C = r0     // Catch:{ all -> 0x0214 }
            r6.recycle()
            r0 = 22
            r6 = 22
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0134
            int r0 = r3.getResourceId(r6, r9)
            r2.A0I = r0
        L_0x0134:
            int r0 = r2.A0I
            if (r0 == r5) goto L_0x016c
            android.content.res.TypedArray r9 = r11.obtainStyledAttributes(r0, r8)
            float r0 = r2.A01     // Catch:{ all -> 0x0164 }
            int r0 = (int) r0     // Catch:{ all -> 0x0164 }
            r9.getDimensionPixelSize(r1, r0)     // Catch:{ all -> 0x0164 }
            android.content.res.ColorStateList r10 = X.AnonymousClass061.A00(r11, r9, r7)     // Catch:{ all -> 0x0164 }
            if (r10 == 0) goto L_0x0169
            android.content.res.ColorStateList r0 = r2.A0C     // Catch:{ all -> 0x0164 }
            int r8 = r0.getDefaultColor()     // Catch:{ all -> 0x0164 }
            int[] r6 = new int[r4]     // Catch:{ all -> 0x0164 }
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            r6[r1] = r0     // Catch:{ all -> 0x0164 }
            int r0 = r10.getDefaultColor()     // Catch:{ all -> 0x0164 }
            int r0 = r10.getColorForState(r6, r0)     // Catch:{ all -> 0x0164 }
            android.content.res.ColorStateList r0 = A02(r8, r0)     // Catch:{ all -> 0x0164 }
            r2.A0C = r0     // Catch:{ all -> 0x0164 }
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            r9.recycle()
            throw r0
        L_0x0169:
            r9.recycle()
        L_0x016c:
            r0 = 25
            r6 = 25
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x017c
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r11, r3, r6)
            r2.A0C = r0
        L_0x017c:
            r0 = 23
            r6 = 23
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0196
            int r6 = r3.getColor(r6, r1)
            android.content.res.ColorStateList r0 = r2.A0C
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r0 = A02(r0, r6)
            r2.A0C = r0
        L_0x0196:
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r11, r3, r7)
            r2.A0A = r0
            r0 = 4
            r3.getInt(r0, r5)
            r0 = 21
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r11, r3, r0)
            r2.A0B = r0
            r6 = 6
            r0 = 300(0x12c, float:4.2E-43)
            int r0 = r3.getInt(r6, r0)
            r2.A02 = r0
            r6 = 2130970185(0x7f040649, float:1.7549073E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass064.A02
            android.animation.TimeInterpolator r0 = X.C017807p.A01(r0, r11, r6)
            r2.A0d = r0
            r0 = 14
            int r0 = r3.getDimensionPixelSize(r0, r5)
            r2.A0j = r0
            r0 = 13
            int r0 = r3.getDimensionPixelSize(r0, r5)
            r2.A0i = r0
            int r0 = r3.getResourceId(r1, r1)
            r2.A0a = r0
            int r0 = r3.getDimensionPixelSize(r4, r1)
            r2.A0P = r0
            r0 = 15
            int r0 = r3.getInt(r0, r4)
            r2.A0H = r0
            r0 = 2
            int r0 = r3.getInt(r0, r1)
            r2.A0J = r0
            r0 = 12
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0N = r0
            r0 = 26
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0F = r0
            r3.recycle()
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131166253(0x7f07042d, float:1.7946746E38)
            float r0 = X.C36441kJ.A00(r1, r0)
            r2.A00 = r0
            r0 = 2131166251(0x7f07042b, float:1.7946742E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A0k = r0
            r2.A03()
            return
        L_0x0214:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A06(Drawable drawable, int i) {
        boolean A1P = AnonymousClass000.A1P(i);
        if (Build.VERSION.SDK_INT == 21) {
            if (A1P) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter((ColorFilter) null);
            }
        } else if (A1P) {
            AnonymousClass076.A06(drawable, i);
        } else {
            AnonymousClass076.A01((ColorStateList) null, drawable);
        }
    }

    public void A0A() {
        int currentItem;
        A0B();
        AnonymousClass07S r0 = this.A0T;
        if (r0 != null) {
            int A0H2 = r0.A0H();
            for (int i = 0; i < A0H2; i++) {
                AnonymousClass6DR A082 = A08();
                A082.A02(this.A0T.A0F(i));
                A0I(A082, this.A0h.size(), false);
            }
            ViewPager viewPager = this.A0E;
            if (viewPager != null && A0H2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < this.A0h.size()) {
                A0J(A09(currentItem), true);
            }
        }
    }

    public int getTabGravity() {
        return this.A0J;
    }

    public ColorStateList getTabIconTint() {
        return this.A0A;
    }

    public int getTabIndicatorAnimationMode() {
        return this.A03;
    }

    public int getTabIndicatorGravity() {
        return this.A04;
    }

    public int getTabMaxWidth() {
        return this.A0K;
    }

    public int getTabMode() {
        return this.A0H;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0B;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0D;
    }

    public ColorStateList getTabTextColors() {
        return this.A0C;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass06R.A01(this);
        if (this.A0E == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A07((ViewPager) parent, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0Z) {
            setupWithViewPager((ViewPager) null);
            this.A0Z = false;
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C07650Ys(accessibilityNodeInfo).A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0h.size(), false, 1)));
    }

    public void onMeasure(int i, int i2) {
        int round = Math.round(AnonymousClass062.A00(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0i;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - AnonymousClass062.A00(getContext(), 56));
            }
            this.A0K = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A0H;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getActionMasked() != 8 || (i = this.A0H) == 0 || i == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        AnonymousClass06R.A02(this, f);
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A04();
        this.A0R.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C013105r.A00(getContext(), i));
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C013105r.A00(getContext(), i));
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public boolean shouldDelayChildPressedState() {
        return AnonymousClass000.A1R(getTabScrollRange());
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void addView(View view, int i) {
        throw AnonymousClass001.A08("Only TabItem instances can be added to TabLayout");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C17690rq r1) {
        setOnTabSelectedListener((C159127ir) r1);
    }

    public void setSelectedTabIndicator(int i) {
        setSelectedTabIndicator(C90494aF.A0G(this, i));
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A08("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view) {
        throw AnonymousClass001.A08("Only TabItem instances can be added to TabLayout");
    }
}
