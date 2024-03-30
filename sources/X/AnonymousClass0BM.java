package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0BM  reason: invalid class name */
public abstract class AnonymousClass0BM extends View {
    public int A00;
    public C16650pr A01;
    public String A02;
    public HashMap A03 = new HashMap();
    public int[] A04 = new int[32];
    public Context A05;

    public static int A00(AnonymousClass0BM r7, ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (!(str == null || (resources = r7.A05.getResources()) == null)) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void A07(C02500Aq r1, boolean z) {
    }

    public void A08(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.A02 = null;
        this.A00 = 0;
        for (int A022 : iArr) {
            A02(A022);
        }
    }

    private void A03(String str) {
        if (str != null && str.length() != 0 && this.A05 != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                getParent();
            }
            int A012 = A01(trim);
            if (A012 != 0) {
                this.A03.put(Integer.valueOf(A012), trim);
                A02(A012);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }

    public void A04() {
        if (this.A01 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof AnonymousClass0BJ) {
                ((AnonymousClass0BJ) layoutParams).A0s = (C02500Aq) this.A01;
            }
        }
    }

    public void A06(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C33961gD.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A02 = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A04, this.A00);
    }

    public void setIds(String str) {
        this.A02 = str;
        if (str != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    A03(str.substring(i));
                    return;
                } else {
                    A03(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public AnonymousClass0BM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = context;
        A06(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r2 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(java.lang.String r5) {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r3 = 0
            if (r0 == 0) goto L_0x0042
            android.view.ViewParent r2 = r4.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
        L_0x000f:
            boolean r0 = r4.isInEditMode()
            r1 = 0
            if (r0 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x003d
            java.util.HashMap r0 = r2.A0C
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x003d
            java.util.HashMap r0 = r2.A0C
            java.lang.Object r1 = r0.get(r5)
        L_0x002a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0036
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0060
        L_0x0036:
            int r1 = A00(r4, r2, r5)
            if (r1 != 0) goto L_0x0060
            goto L_0x0044
        L_0x003d:
            r1 = 0
            goto L_0x002a
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            goto L_0x0036
        L_0x0042:
            r2 = r3
            goto L_0x000f
        L_0x0044:
            java.lang.Class<X.2qV> r0 = X.C52982qV.class
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch:{ Exception -> 0x004e }
            int r1 = r0.getInt(r3)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            if (r1 != 0) goto L_0x0060
            android.content.Context r0 = r4.A05
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "id"
            int r1 = r2.getIdentifier(r5, r0, r1)
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BM.A01(java.lang.String):int");
    }

    private void A02(int i) {
        if (i != getId()) {
            int i2 = this.A00 + 1;
            int[] iArr = this.A04;
            int length = iArr.length;
            if (i2 > length) {
                iArr = Arrays.copyOf(iArr, length * 2);
                this.A04 = iArr;
            }
            int i3 = this.A00;
            iArr[i3] = i;
            this.A00 = i3 + 1;
        }
    }

    public void A05() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A09((ConstraintLayout) parent);
        }
    }

    public void A09(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.A00; i++) {
            View view = (View) constraintLayout.A05.get(this.A04[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A02;
        if (str != null) {
            setIds(str);
        }
    }

    public AnonymousClass0BM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = context;
        A06(attributeSet);
    }

    public AnonymousClass0BM(Context context) {
        super(context);
        this.A05 = context;
        A06((AttributeSet) null);
    }
}
