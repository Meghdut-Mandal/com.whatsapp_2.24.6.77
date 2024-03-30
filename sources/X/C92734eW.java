package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.4eW  reason: invalid class name and case insensitive filesystem */
public final class C92734eW extends FrameLayout {
    public ViewGroup A00;
    public C92774ec A01;
    public final Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92734eW(Context context, Integer num) {
        super(context);
        AnonymousClass00C.A0D(num, 2);
        this.A02 = num;
        Context context2 = getContext();
        this.A00 = new FrameLayout(context2);
        this.A01 = new C92774ec(context2);
        getContentPager();
        getContentPager().setImportantForAccessibility(1);
        addView(getContentPager());
        addView(getHeaderContainer());
    }

    public final C92774ec getContentPager() {
        C92774ec r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contentPager");
    }

    public final ViewGroup getHeaderContainer() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw C36331k8.A0d("headerContainer");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContentPager().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        getHeaderContainer().measure(C90504aG.A08(View.MeasureSpec.getSize(getMeasuredWidth())), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Integer.MIN_VALUE));
        getHeaderContainer().layout(0, 0, getHeaderContainer().getMeasuredWidth(), getHeaderContainer().getMeasuredHeight());
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A02 == C023109s.A0R) {
            i3 = Integer.MIN_VALUE;
        }
        getContentPager().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        setMeasuredDimension(getContentPager().getMeasuredWidth(), getContentPager().getMeasuredHeight());
    }
}
