package androidx.fragment.app;

import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass029;
import X.AnonymousClass02E;
import X.AnonymousClass09H;
import X.AnonymousClass09Y;
import X.C012005e;
import X.C022909q;
import X.C05250Oz;
import X.C56572wW;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class FragmentContainerView extends FrameLayout {
    public boolean A00;
    public View.OnApplyWindowInsetsListener A01;
    public final List A02;
    public final List A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass00C.A0D(view, 0);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (!(tag instanceof AnonymousClass02E) || tag == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        super.addView(view, i, layoutParams);
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        AnonymousClass09H A0B;
        AnonymousClass00C.A0D(windowInsets, 0);
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(windowInsets);
        AnonymousClass09H r1 = new AnonymousClass09H(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A01;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AnonymousClass00C.A08(onApplyWindowInsets);
            Objects.requireNonNull(onApplyWindowInsets);
            A0B = new AnonymousClass09H(onApplyWindowInsets);
        } else {
            A0B = C012005e.A0B(this, r1);
        }
        if (!A0B.A00.A0A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C012005e.A0A(getChildAt(i), A0B);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        if (this.A00) {
            for (View drawChild : this.A02) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        AnonymousClass00C.A0D(canvas, 0);
        AnonymousClass00C.A0D(view, 1);
        if (this.A00) {
            List list = this.A02;
            if ((!list.isEmpty()) && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A00 = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r1.A0L(getId());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass02E getFragment() {
        /*
            r3 = this;
            r1 = r3
        L_0x0001:
            if (r1 == 0) goto L_0x0030
            r0 = 2131430413(0x7f0b0c0d, float:1.8482526E38)
            java.lang.Object r2 = r1.getTag(r0)
            boolean r0 = r2 instanceof X.AnonymousClass02E
            if (r0 == 0) goto L_0x0025
            X.02E r2 = (X.AnonymousClass02E) r2
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2.A12()
            if (r0 == 0) goto L_0x004e
            X.01z r1 = r2.A0k()
        L_0x001c:
            int r0 = r3.getId()
            X.02E r0 = r1.A0L(r0)
            return r0
        L_0x0025:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0030
            android.view.View r1 = (android.view.View) r1
            goto L_0x0001
        L_0x0030:
            android.content.Context r1 = r3.getContext()
        L_0x0034:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1 instanceof X.AnonymousClass01I
            if (r0 == 0) goto L_0x0047
            X.01I r1 = (X.AnonymousClass01I) r1
            if (r1 == 0) goto L_0x0072
            X.02D r0 = r1.A04
            X.01y r0 = r0.A00
            X.01z r1 = r0.A03
            goto L_0x001c
        L_0x0047:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0034
        L_0x004e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "The Fragment "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " that owns View "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "View "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is not within a subclass of FragmentActivity."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentContainerView.getFragment():X.02E");
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AnonymousClass00C.A0D(windowInsets, 0);
        return windowInsets;
    }

    public void removeView(View view) {
        AnonymousClass00C.A0D(view, 0);
        A00(view);
        super.removeView(view);
    }

    public void removeViewInLayout(View view) {
        AnonymousClass00C.A0D(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AnonymousClass00C.A0D(onApplyWindowInsetsListener, 0);
        this.A01 = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        AnonymousClass00C.A0D(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }

    private final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AnonymousClass00C.A08(childAt);
            A00(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AnonymousClass00C.A08(childAt);
            A00(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                AnonymousClass00C.A08(childAt);
                A00(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AnonymousClass00C.A08(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AnonymousClass01z r9) {
        super(context, attributeSet);
        View view;
        String str;
        AnonymousClass00C.A0D(context, 1);
        AnonymousClass00C.A0D(attributeSet, 2);
        AnonymousClass00C.A0D(r9, 3);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56572wW.A01, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AnonymousClass02E A0L = r9.A0L(id);
        if (classAttribute != null && A0L == null) {
            if (id == -1) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            AnonymousClass029 A0O = r9.A0O();
            context.getClassLoader();
            AnonymousClass02E A002 = A0O.A00(classAttribute);
            AnonymousClass00C.A08(A002);
            A002.A0Y = true;
            if (A002.A0K != null) {
                A002.A0Y = false;
                A002.A0Y = true;
            }
            AnonymousClass09Y r1 = new AnonymousClass09Y(r9);
            r1.A0G = true;
            A002.A0G = this;
            r1.A0E(A002, string, getId());
            r1.A04();
        }
        Iterator it = r9.A0T.A02().iterator();
        while (it.hasNext()) {
            C022909q r3 = (C022909q) it.next();
            AnonymousClass02E r2 = r3.A02;
            if (r2.A05 == getId() && (view = r2.A0F) != null && view.getParent() == null) {
                r2.A0G = this;
                r3.A03();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r6) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        AnonymousClass00C.A0D(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56572wW.A01, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                StringBuilder sb = new StringBuilder();
                sb.append("FragmentContainerView must be within a FragmentActivity to use ");
                sb.append(str);
                sb.append("=\"");
                sb.append(classAttribute);
                sb.append('\"');
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
    }
}
