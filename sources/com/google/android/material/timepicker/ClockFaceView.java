package com.google.android.material.timepicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.AnonymousClass061;
import X.AnonymousClass06J;
import X.AnonymousClass06L;
import X.AnonymousClass06M;
import X.AnonymousClass0SK;
import X.AnonymousClass0X0;
import X.AnonymousClass7cQ;
import X.C011504z;
import X.C011705b;
import X.C012005e;
import X.C012505l;
import X.C013105r;
import X.C07650Ys;
import X.C07690Yx;
import X.C1497572q;
import X.C162457oc;
import X.C163987r5;
import X.C27931Qk;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClockFaceView extends ConstraintLayout implements AnonymousClass7cQ {
    public float A00;
    public int A01;
    public C012505l A02;
    public String[] A03;
    public final int A04;
    public final ColorStateList A05;
    public final Rect A06;
    public final Rect A07;
    public final RectF A08;
    public final SparseArray A09;
    public final C011705b A0A;
    public final ClockHandView A0B;
    public final Runnable A0C;
    public final float[] A0D;
    public final int[] A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        C012505l r3 = new C012505l();
        this.A02 = r3;
        AnonymousClass06L r2 = new AnonymousClass06L(0.5f);
        AnonymousClass06M r1 = new AnonymousClass06M(r3.A01.A0K);
        r1.A02 = r2;
        r1.A03 = r2;
        r1.A01 = r2;
        r1.A00 = r2;
        r3.setShapeAppearanceModel(new AnonymousClass06J(r1));
        this.A02.A0C(ColorStateList.valueOf(-1));
        C011504z.A04(this.A02, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0W, i, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0C = new C1497572q(this, 36);
        obtainStyledAttributes.recycle();
        this.A07 = AnonymousClass001.A06();
        this.A08 = C36441kJ.A0N();
        this.A06 = AnonymousClass001.A06();
        this.A09 = new SparseArray();
        this.A0D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C27931Qk.A07, i, R.style.f13nameremoved);
        Resources resources = getResources();
        ColorStateList A002 = AnonymousClass061.A00(context, obtainStyledAttributes2, 1);
        this.A05 = A002;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.A0B = clockHandView;
        this.A04 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        int colorForState = A002.getColorForState(new int[]{16842913}, A002.getDefaultColor());
        this.A0E = new int[]{colorForState, colorForState, A002.getDefaultColor()};
        clockHandView.A0B.add(this);
        int defaultColor = C013105r.A00(context, R.color.f6nameremoved).getDefaultColor();
        ColorStateList A003 = AnonymousClass061.A00(context, obtainStyledAttributes2, 0);
        setBackgroundColor(A003 != null ? A003.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C163987r5(this, 0));
        setFocusable(true);
        obtainStyledAttributes2.recycle();
        this.A0A = new C162457oc(this, 2);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.A03 = strArr;
        LayoutInflater A0C2 = C36351kA.A0C(this);
        SparseArray sparseArray = this.A09;
        int size = sparseArray.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            int length = this.A03.length;
            if (i2 >= Math.max(length, size)) {
                break;
            }
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) A0C2.inflate(R.layout.f9nameremoved, this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.A03[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                C012005e.A0V(textView, this.A0A);
                textView.setTextColor(this.A05);
            }
            i2++;
        }
        ClockHandView clockHandView2 = this.A0B;
        if (clockHandView2.A04 && !z) {
            clockHandView2.A03 = 1;
        }
        clockHandView2.A04 = z;
        clockHandView2.invalidate();
        this.A0G = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0H = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0F = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static void A00(ClockFaceView clockFaceView) {
        SparseArray sparseArray;
        RadialGradient radialGradient;
        RectF rectF = clockFaceView.A0B.A0A;
        float f = Float.MAX_VALUE;
        View view = null;
        int i = 0;
        while (true) {
            sparseArray = clockFaceView.A09;
            if (i >= sparseArray.size()) {
                break;
            }
            View view2 = (View) sparseArray.get(i);
            if (view2 != null) {
                Rect rect = clockFaceView.A07;
                view2.getHitRect(rect);
                RectF rectF2 = clockFaceView.A08;
                rectF2.set(rect);
                rectF2.union(rectF);
                float width = rectF2.width() * rectF2.height();
                if (width < f) {
                    view = view2;
                    f = width;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (textView != null) {
                textView.setSelected(C36361kB.A1a(textView, view));
                Rect rect2 = clockFaceView.A07;
                textView.getHitRect(rect2);
                RectF rectF3 = clockFaceView.A08;
                rectF3.set(rect2);
                Rect rect3 = clockFaceView.A06;
                textView.getLineBounds(0, rect3);
                rectF3.inset((float) rect3.left, (float) rect3.top);
                if (!RectF.intersects(rectF, rectF3)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF3.left, rectF.centerY() - rectF3.top, rectF.width() * 0.5f, clockFaceView.A0E, clockFaceView.A0D, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    public void A06() {
        C07690Yx r5 = new C07690Yx();
        r5.A0B(this);
        HashMap A0J = AnonymousClass001.A0J();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                Object tag = childAt.getTag(R.id.material_clock_level);
                if (tag == null) {
                    tag = C36361kB.A0i();
                }
                if (!A0J.containsKey(tag)) {
                    C90514aH.A1P(tag, A0J);
                }
                C90524aI.A0n(tag, A0J).add(childAt);
            }
        }
        Iterator A10 = C36371kC.A10(A0J);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            List list = (List) A11.getValue();
            int A0I = AnonymousClass000.A0I(A11.getKey());
            int i2 = this.A01;
            if (A0I == 2) {
                i2 = C90514aH.A06((float) i2, 0.66f);
            }
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                AnonymousClass0X0 r0 = C07690Yx.A03(r5, C36431kI.A0K(it).getId()).A02;
                r0.A0C = R.id.circle_center;
                r0.A0D = i2;
                r0.A00 = f;
                f += 360.0f / ((float) list.size());
            }
        }
        r5.A09(this);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.A09;
            if (i3 < sparseArray.size()) {
                ((View) sparseArray.get(i3)).setVisibility(0);
                i3++;
            } else {
                return;
            }
        }
    }

    public void setBackgroundColor(int i) {
        this.A02.A0C(ColorStateList.valueOf(i));
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(AnonymousClass04F.A00());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0C;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A06();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C07650Ys(accessibilityNodeInfo).A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A03.length, false, 1)));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics A0B2 = C36361kB.A0B(this);
        int max = (int) (((float) this.A0F) / Math.max(Math.max(((float) this.A0G) / ((float) A0B2.heightPixels), ((float) this.A0H) / ((float) A0B2.widthPixels)), 1.0f));
        int A082 = C90504aG.A08(max);
        setMeasuredDimension(max, max);
        super.onMeasure(A082, A082);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0C;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public ClockFaceView(Context context) {
        this(context, (AttributeSet) null);
    }
}
