package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.4fN  reason: invalid class name and case insensitive filesystem */
public class C93004fN extends LinearLayout {
    public ValueAnimator A00;
    public int A01 = -1;
    public final /* synthetic */ TabLayout A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93004fN(Context context, TabLayout tabLayout) {
        super(context);
        this.A02 = tabLayout;
        setWillNotDraw(false);
    }

    public static void A00(View view, View view2, C93004fN r12, float f) {
        int A06;
        int i;
        int A062;
        float sin;
        double cos;
        float A002;
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = r12.A02;
            Drawable drawable = tabLayout.A0D;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.A0D.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = r12.A02;
            C130676Lz r1 = tabLayout2.A0M;
            Drawable drawable2 = tabLayout2.A0D;
            if (r1 instanceof C99334t6) {
                int i2 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                if (i2 >= 0) {
                    view = view2;
                }
                RectF A003 = C130676Lz.A00(view, tabLayout2);
                if (i2 < 0) {
                    A002 = AnonymousClass064.A00(1.0f, 0.0f, 0.0f, 0.5f, f);
                } else {
                    A002 = AnonymousClass064.A00(0.0f, 1.0f, 0.5f, 1.0f, f);
                }
                drawable2.setBounds((int) A003.left, drawable2.getBounds().top, (int) A003.right, drawable2.getBounds().bottom);
                drawable2.setAlpha((int) (A002 * 255.0f));
            } else {
                if (r1 instanceof C99324t5) {
                    RectF A004 = C130676Lz.A00(view, tabLayout2);
                    RectF A005 = C130676Lz.A00(view2, tabLayout2);
                    float f2 = A004.left;
                    float f3 = A005.left;
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    if (f2 < f3) {
                        sin = (float) (1.0d - Math.cos(d));
                        cos = Math.sin(d);
                    } else {
                        sin = (float) Math.sin(d);
                        cos = 1.0d - Math.cos(d);
                    }
                    float f4 = (float) cos;
                    TimeInterpolator timeInterpolator = AnonymousClass064.A02;
                    A06 = C90504aG.A06(sin, (int) f3, (int) f2);
                    i = drawable2.getBounds().top;
                    A062 = C90504aG.A06(f4, (int) A005.right, (int) A004.right);
                } else {
                    RectF A006 = C130676Lz.A00(view, tabLayout2);
                    RectF A007 = C130676Lz.A00(view2, tabLayout2);
                    int i3 = (int) A006.left;
                    int i4 = (int) A007.left;
                    TimeInterpolator timeInterpolator2 = AnonymousClass064.A02;
                    A06 = C90504aG.A06(f, i4, i3);
                    i = drawable2.getBounds().top;
                    A062 = C90504aG.A06(f, (int) A007.right, (int) A006.right);
                }
                drawable2.setBounds(A06, i, A062, drawable2.getBounds().bottom);
            }
        }
        C011504z.A05(r12);
    }

    public static void A01(C93004fN r6, int i) {
        TabLayout tabLayout = r6.A02;
        if (tabLayout.A0L == 0) {
            View childAt = r6.getChildAt(i);
            Drawable drawable = tabLayout.A0D;
            RectF A002 = C130676Lz.A00(childAt, tabLayout);
            drawable.setBounds((int) A002.left, drawable.getBounds().top, (int) A002.right, drawable.getBounds().bottom);
            tabLayout.A0G = i;
        }
    }

    public void A02(int i) {
        TabLayout tabLayout = this.A02;
        Rect bounds = tabLayout.A0D.getBounds();
        tabLayout.A0D.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public void draw(Canvas canvas) {
        TabLayout tabLayout = this.A02;
        int height = tabLayout.A0D.getBounds().height();
        if (height < 0) {
            height = tabLayout.A0D.getIntrinsicHeight();
        }
        int i = tabLayout.A04;
        int i2 = 0;
        if (i == 0) {
            i2 = getHeight() - height;
            height = getHeight();
        } else if (i == 1) {
            i2 = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        } else if (i != 2) {
            if (i != 3) {
                height = 0;
            }
            height = getHeight();
        }
        if (C36421kH.A03(tabLayout.A0D) > 0) {
            Rect bounds = tabLayout.A0D.getBounds();
            tabLayout.A0D.setBounds(bounds.left, i2, bounds.right, height);
            tabLayout.A0D.draw(canvas);
        }
        super.draw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            TabLayout tabLayout = this.A02;
            int i5 = tabLayout.A0G;
            if (i5 == -1) {
                i5 = tabLayout.getSelectedTabPosition();
                tabLayout.A0G = i5;
            }
            A01(this, i5);
            return;
        }
        TabLayout tabLayout2 = this.A02;
        int selectedTabPosition = tabLayout2.getSelectedTabPosition();
        if (tabLayout2.A0G != selectedTabPosition) {
            View childAt = getChildAt(selectedTabPosition);
            View childAt2 = getChildAt(selectedTabPosition);
            if (childAt2 == null) {
                A01(this, tabLayout2.getSelectedTabPosition());
                return;
            }
            tabLayout2.A0G = selectedTabPosition;
            C111295c3 r1 = new C111295c3(childAt, childAt2, this, 1);
            this.A00.removeAllUpdateListeners();
            this.A00.addUpdateListener(r1);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.A02;
            if (tabLayout.A0J == 1 || tabLayout.A0H == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) AnonymousClass062.A00(getContext(), 16)) * 2)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.A0J = 0;
                        tabLayout.A0K(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.A01 != i) {
            requestLayout();
            this.A01 = i;
        }
    }
}
