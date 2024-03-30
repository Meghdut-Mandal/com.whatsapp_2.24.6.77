package androidx.viewpager2.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass04F;
import X.AnonymousClass0CP;
import X.AnonymousClass0CZ;
import X.AnonymousClass0EL;
import X.AnonymousClass0Hw;
import X.AnonymousClass0Hz;
import X.AnonymousClass0ID;
import X.AnonymousClass0II;
import X.AnonymousClass0IK;
import X.AnonymousClass0Ij;
import X.AnonymousClass0SK;
import X.AnonymousClass0U4;
import X.C000700i;
import X.C011504z;
import X.C02740Bs;
import X.C02800By;
import X.C03810Hu;
import X.C03910Ik;
import X.C06170So;
import X.C06180Sp;
import X.C06560Ub;
import X.C07650Ys;
import X.C09940dP;
import X.C11270g0;
import X.C11530gT;
import X.C132986Wc;
import X.C15830o3;
import X.C15840o4;
import X.C18230sp;
import X.C18240sq;
import X.C56072vh;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter$5;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Iterator;
import java.util.List;

public final class ViewPager2 extends ViewGroup {
    public int A00;
    public int A01 = -1;
    public LinearLayoutManager A02;
    public C02740Bs A03 = new C18230sp(this, 0);
    public RecyclerView A04;
    public AnonymousClass0Ij A05 = new AnonymousClass0Ij();
    public AnonymousClass0ID A06;
    public AnonymousClass0U4 A07;
    public boolean A08 = false;
    public boolean A09 = true;
    public int A0A = -1;
    public Parcelable A0B;
    public AnonymousClass0IK A0C;
    public C02800By A0D = null;
    public AnonymousClass0Ij A0E;
    public C06170So A0F;
    public C03910Ik A0G;
    public boolean A0H = false;
    public final Rect A0I = AnonymousClass001.A06();
    public final Rect A0J = AnonymousClass001.A06();

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.A01 = i;
            this.A04.requestLayout();
            return;
        }
        throw AnonymousClass001.A08("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setPageTransformer(C15840o4 r4) {
        boolean z = this.A0H;
        if (r4 != null) {
            if (!z) {
                this.A0D = this.A04.A0H;
                this.A0H = true;
            }
            this.A04.setItemAnimator((C02800By) null);
            this.A0G.A00 = r4;
        } else if (z) {
            this.A04.setItemAnimator(this.A0D);
            this.A0D = null;
            this.A0H = false;
        }
    }

    private void A00() {
        AnonymousClass0CZ r5;
        int length;
        int length2;
        if (this.A0A != -1 && (r5 = this.A04.A0G) != null) {
            Parcelable parcelable = this.A0B;
            if (parcelable != null) {
                if (r5 instanceof C15830o3) {
                    AnonymousClass0Hz r6 = (AnonymousClass0Hz) ((C15830o3) r5);
                    C000700i r8 = r6.A05;
                    if (r8.A00() == 0) {
                        C000700i r7 = r6.A03;
                        if (r7.A00() == 0) {
                            Bundle bundle = (Bundle) parcelable;
                            if (bundle.getClassLoader() == null) {
                                bundle.setClassLoader(r6.getClass().getClassLoader());
                            }
                            Iterator<String> it = bundle.keySet().iterator();
                            while (it.hasNext()) {
                                String A0C2 = AnonymousClass001.A0C(it);
                                if (A0C2.startsWith("f#") && A0C2.length() > (length2 = "f#".length())) {
                                    r7.A0A(Long.parseLong(A0C2.substring(length2)), r6.A06.A0M(bundle, A0C2));
                                } else if (!A0C2.startsWith("s#") || A0C2.length() <= (length = "s#".length())) {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("Unexpected key in savedState: ");
                                    throw AnonymousClass000.A0c(A0C2, A0u);
                                } else {
                                    long parseLong = Long.parseLong(A0C2.substring(length));
                                    Parcelable parcelable2 = bundle.getParcelable(A0C2);
                                    if (r6.A0O(parseLong)) {
                                        r8.A0A(parseLong, parcelable2);
                                    }
                                }
                            }
                            if (r7.A00() != 0) {
                                r6.A00 = true;
                                r6.A01 = true;
                                r6.A0M();
                                Handler handler = new Handler(Looper.getMainLooper());
                                C11270g0 r2 = new C11270g0(r6);
                                r6.A07.A04(new FragmentStateAdapter$5(handler, r6, r2));
                                handler.postDelayed(r2, 10000);
                            }
                        }
                    }
                    throw AnonymousClass001.A09("Expected the adapter to be 'fresh' while restoring state.");
                }
                this.A0B = null;
            }
            int max = Math.max(0, Math.min(this.A0A, r5.A0J() - 1));
            this.A00 = max;
            this.A0A = -1;
            this.A04.A0h(max);
            this.A07.A00();
        }
    }

    private void A01(Context context, AttributeSet attributeSet) {
        this.A07 = new AnonymousClass0U4(this);
        AnonymousClass0II r1 = new AnonymousClass0II(context, this);
        this.A04 = r1;
        r1.setId(AnonymousClass04F.A00());
        this.A04.setDescendantFocusability(C132986Wc.A0F);
        C03810Hu r12 = new C03810Hu(this);
        this.A02 = r12;
        this.A04.setLayoutManager(r12);
        this.A04.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.A04.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView recyclerView = this.A04;
        C09940dP r13 = new C09940dP(this);
        List list = recyclerView.A0P;
        if (list == null) {
            list = AnonymousClass001.A0I();
            recyclerView.A0P = list;
        }
        list.add(r13);
        AnonymousClass0ID r2 = new AnonymousClass0ID(this);
        this.A06 = r2;
        RecyclerView recyclerView2 = this.A04;
        this.A0F = new C06170So(recyclerView2, r2, this);
        AnonymousClass0Hw r0 = new AnonymousClass0Hw(this);
        this.A0C = r0;
        r0.A07(recyclerView2);
        this.A04.A0v(this.A06);
        AnonymousClass0Ij r5 = new AnonymousClass0Ij();
        this.A0E = r5;
        this.A06.A05 = r5;
        C18240sq r3 = new C18240sq(this, 1);
        C18240sq r14 = new C18240sq(this, 2);
        r5.A00.add(r3);
        this.A0E.A00.add(r14);
        AnonymousClass0U4 r15 = this.A07;
        C011504z.A06(this.A04, 2);
        r15.A00 = new C18230sp(r15, 1);
        ViewPager2 viewPager2 = r15.A04;
        if (C011504z.A00(viewPager2) == 0) {
            C011504z.A06(viewPager2, 1);
        }
        AnonymousClass0Ij r02 = this.A0E;
        r02.A00.add(this.A05);
        C03910Ik r16 = new C03910Ik(this.A02);
        this.A0G = r16;
        this.A0E.A00.add(r16);
        RecyclerView recyclerView3 = this.A04;
        attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = C56072vh.A00;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context2, iArr, attributeSet2, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A02() {
        AnonymousClass0IK r1 = this.A0C;
        if (r1 != null) {
            View A042 = r1.A04(this.A02);
            if (A042 != null) {
                int A022 = AnonymousClass0CP.A02(A042);
                if (A022 != this.A00 && this.A06.A02 == 0) {
                    this.A0E.A01(A022);
                }
                this.A08 = false;
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("Design assumption violated.");
    }

    public void A03(int i) {
        C06560Ub r0;
        AnonymousClass0CZ r3 = this.A04.A0G;
        if (r3 == null) {
            if (this.A0A != -1) {
                this.A0A = Math.max(i, 0);
            }
        } else if (r3.A0J() > 0) {
            int min = Math.min(Math.max(i, 0), r3.A0J() - 1);
            int i2 = this.A00;
            if ((min != i2 || this.A06.A02 != 0) && min != i2) {
                double d = (double) i2;
                this.A00 = min;
                this.A07.A00();
                AnonymousClass0ID r1 = this.A06;
                if (r1.A02 != 0) {
                    AnonymousClass0ID.A01(r1);
                    C06180Sp r12 = r1.A04;
                    d = ((double) r12.A02) + ((double) r12.A00);
                }
                AnonymousClass0ID r5 = this.A06;
                r5.A00 = 2;
                boolean z = false;
                if (r5.A03 != min) {
                    z = true;
                }
                r5.A03 = min;
                AnonymousClass0ID.A02(r5, 2);
                if (z && (r0 = r5.A05) != null) {
                    r0.A01(min);
                }
                double d2 = (double) min;
                int i3 = (Math.abs(d2 - d) > 3.0d ? 1 : (Math.abs(d2 - d) == 3.0d ? 0 : -1));
                RecyclerView recyclerView = this.A04;
                if (i3 > 0) {
                    int i4 = min + 3;
                    if (d2 > d) {
                        i4 = min - 3;
                    }
                    recyclerView.A0h(i4);
                    RecyclerView recyclerView2 = this.A04;
                    recyclerView2.post(new C11530gT(recyclerView2, min));
                    return;
                }
                recyclerView.A0i(min);
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        return this.A04.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.A04.canScrollVertically(i);
    }

    public AnonymousClass0CZ getAdapter() {
        return this.A04.A0G;
    }

    public int getItemDecorationCount() {
        return this.A04.A12.size();
    }

    public int getOrientation() {
        return this.A02.A00;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.A04;
        if (this.A02.A00 == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.A06.A02;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        Rect rect = this.A0J;
        rect.left = getPaddingLeft();
        rect.right = AnonymousClass001.A04(this, i3, i);
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.A0I;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.A04.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.A08) {
            A02();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.A04, i, i2);
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        int measuredState = this.A04.getMeasuredState();
        int A092 = measuredWidth + AnonymousClass000.A09(this);
        int A0C2 = measuredHeight + AnonymousClass000.A0C(this);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(A092, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(A0C2, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0EL)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0EL r2 = (AnonymousClass0EL) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0A = r2.A00;
        this.A0B = r2.A02;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        AnonymousClass0U4 r1 = this.A07;
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ViewPager2 viewPager2 = r1.A04;
        int i3 = viewPager2.A00;
        if (i == 8192) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        if (!viewPager2.A09) {
            return true;
        }
        viewPager2.A03(i2);
        return true;
    }

    public void setAdapter(AnonymousClass0CZ r4) {
        AnonymousClass0CZ r2 = this.A04.A0G;
        AnonymousClass0U4 r0 = this.A07;
        if (r2 != null) {
            r2.A01.unregisterObserver(r0.A00);
            r2.A01.unregisterObserver(this.A03);
        }
        this.A04.setAdapter(r4);
        this.A00 = 0;
        A00();
        AnonymousClass0U4 r02 = this.A07;
        r02.A00();
        if (r4 != null) {
            r4.BnA(r02.A00);
            r4.BnA(this.A03);
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.A09 = z;
        this.A07.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01(context, attributeSet);
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof AnonymousClass0EL) {
            int i = ((AnonymousClass0EL) parcelable).A01;
            sparseArray.put(this.A04.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        A00();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int A0J2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.A07.A04;
        AnonymousClass0CZ r2 = viewPager2.A04.A0G;
        if (r2 != null) {
            int i3 = viewPager2.A02.A00;
            i = r2.A0J();
            if (i3 != 1) {
                i2 = i;
                i = 0;
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        new C07650Ys(accessibilityNodeInfo).A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0)));
        AnonymousClass0CZ r0 = viewPager2.A04.A0G;
        if (r0 != null && (A0J2 = r0.A0J()) != 0 && viewPager2.A09) {
            if (viewPager2.A00 > 0) {
                accessibilityNodeInfo.addAction(DefaultCrypto.BUFFER_SIZE);
            }
            if (viewPager2.A00 < A0J2 - 1) {
                accessibilityNodeInfo.addAction(ZipDecompressor.UNZIP_BUFFER_SIZE);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0EL r8 = new AnonymousClass0EL(super.onSaveInstanceState());
        r8.A01 = this.A04.getId();
        int i = this.A0A;
        if (i == -1) {
            i = this.A00;
        }
        r8.A00 = i;
        Parcelable parcelable = this.A0B;
        Bundle bundle = parcelable;
        if (parcelable == null) {
            AnonymousClass0CZ r6 = this.A04.A0G;
            if (r6 instanceof C15830o3) {
                AnonymousClass0Hz r62 = (AnonymousClass0Hz) ((C15830o3) r6);
                C000700i r10 = r62.A03;
                int A002 = r10.A00();
                C000700i r5 = r62.A05;
                Bundle bundle2 = new Bundle(A002 + r5.A00());
                for (int i2 = 0; i2 < r10.A00(); i2++) {
                    long A022 = r10.A02(i2);
                    AnonymousClass02E r3 = (AnonymousClass02E) r10.A05(A022);
                    if (r3 != null && r3.A12()) {
                        StringBuilder A0v = AnonymousClass000.A0v("f#");
                        A0v.append(A022);
                        r62.A06.A0Y(bundle2, r3, A0v.toString());
                    }
                }
                for (int i3 = 0; i3 < r5.A00(); i3++) {
                    long A023 = r5.A02(i3);
                    if (r62.A0O(A023)) {
                        StringBuilder A0v2 = AnonymousClass000.A0v("s#");
                        A0v2.append(A023);
                        bundle2.putParcelable(A0v2.toString(), (Parcelable) r5.A05(A023));
                    }
                }
                bundle = bundle2;
            }
            return r8;
        }
        r8.A02 = bundle;
        return r8;
    }

    public void onViewAdded(View view) {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        throw AnonymousClass000.A0g(" does not support direct child views", A0u);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.A07.A00();
    }

    public void setCurrentItem(int i) {
        A03(i);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A01;
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public void setOrientation(int i) {
        this.A02.A1f(i);
        this.A07.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public ViewPager2(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }
}
