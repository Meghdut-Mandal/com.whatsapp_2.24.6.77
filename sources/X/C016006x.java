package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.06x  reason: invalid class name and case insensitive filesystem */
public class C016006x {
    public static ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static ConcurrentHashMap A0C = new ConcurrentHashMap();
    public static final RectF A0D = new RectF();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public int A03 = 0;
    public TextPaint A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public int[] A07 = new int[0];
    public final Context A08;
    public final TextView A09;
    public final C016106y A0A;

    public static int[] A06(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i++;
            } while (i < length);
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Number) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method A02(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = A0C;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    public static void A03(C016006x r3, float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            r3.A03 = 1;
            r3.A01 = f;
            r3.A00 = f2;
            r3.A02 = f3;
            r3.A05 = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public static boolean A04(C016006x r7) {
        if (!(!(r7.A09 instanceof AnonymousClass074)) || r7.A03 != 1) {
            r7.A06 = false;
            return false;
        }
        if (!r7.A05 || r7.A07.length == 0) {
            float f = r7.A00;
            float f2 = r7.A01;
            float f3 = r7.A02;
            int floor = ((int) Math.floor((double) ((f - f2) / f3))) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round((((float) i) * f3) + f2);
            }
            r7.A07 = A06(iArr);
        }
        r7.A06 = true;
        return true;
    }

    public static boolean A05(C016006x r5) {
        int[] iArr = r5.A07;
        int length = iArr.length;
        boolean z = false;
        if (length > 0) {
            z = true;
        }
        r5.A05 = z;
        if (z) {
            r5.A03 = 1;
            r5.A01 = (float) iArr[0];
            r5.A00 = (float) iArr[length - 1];
            r5.A02 = -1.0f;
        }
        return z;
    }

    public void A07() {
        int measuredWidth;
        StaticLayout staticLayout;
        CharSequence transformation;
        TextView textView = this.A09;
        if ((!(textView instanceof AnonymousClass074)) && this.A03 != 0) {
            if (this.A06) {
                if (textView.getMeasuredHeight() > 0 && textView.getMeasuredWidth() > 0) {
                    if (this.A0A.A01(textView)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
                    }
                    int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = A0D;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            int length = this.A07.length;
                            if (length != 0) {
                                int i = length - 1;
                                int i2 = 1;
                                int i3 = 0;
                                while (i2 <= i) {
                                    int i4 = (i2 + i) / 2;
                                    int i5 = this.A07[i4];
                                    CharSequence text = textView.getText();
                                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                                    if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                                        text = transformation;
                                    }
                                    int maxLines = textView.getMaxLines();
                                    TextPaint textPaint = this.A04;
                                    if (textPaint == null) {
                                        this.A04 = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.A04.set(textView.getPaint());
                                    this.A04.setTextSize((float) i5);
                                    Layout.Alignment alignment = (Layout.Alignment) A01(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
                                    int round = Math.round(rectF.right);
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        staticLayout = A00(alignment, text, round, maxLines);
                                    } else {
                                        staticLayout = new StaticLayout(text, this.A04, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                                    }
                                    if (maxLines != -1) {
                                        if (staticLayout.getLineCount() <= maxLines) {
                                            if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i3 = i4 - 1;
                                        i = i3;
                                    }
                                    if (((float) staticLayout.getHeight()) <= rectF.bottom) {
                                        int i6 = i4 + 1;
                                        i3 = i2;
                                        i2 = i6;
                                    }
                                    i3 = i4 - 1;
                                    i = i3;
                                }
                                float f = (float) this.A07[i3];
                                if (f != textView.getTextSize()) {
                                    A08(0, f);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A06 = true;
        }
    }

    public void A08(int i, float f) {
        Resources resources;
        Context context = this.A08;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.A09;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.A06 = false;
                try {
                    Method A022 = A02("nullLayouts");
                    if (A022 != null) {
                        A022.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public void A09(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.A08;
        int[] iArr = AnonymousClass1MJ.A08;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        TextView textView = this.A09;
        C012005e.A0E(textView.getContext(), obtainStyledAttributes, attributeSet2, textView, iArr, i2);
        if (obtainStyledAttributes.hasValue(5)) {
            this.A03 = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f2 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f3 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                int i3 = 0;
                do {
                    iArr2[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                    i3++;
                } while (i3 < length);
                this.A07 = A06(iArr2);
                A05(this);
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!(!(textView instanceof AnonymousClass074))) {
            this.A03 = 0;
        } else if (this.A03 == 1) {
            if (!this.A05) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                A03(this, f2, f3, f);
            }
            A04(this);
        }
    }

    public C016006x(TextView textView) {
        C016106y r0;
        this.A09 = textView;
        this.A08 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new AnonymousClass070();
        } else if (i >= 23) {
            r0 = new C016206z();
        } else {
            r0 = new C016106y();
        }
        this.A0A = r0;
    }

    private StaticLayout A00(Layout.Alignment alignment, CharSequence charSequence, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.A04, i);
        StaticLayout.Builder alignment2 = obtain.setAlignment(alignment);
        TextView textView = this.A09;
        StaticLayout.Builder hyphenationFrequency = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.A0A.A00(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    public static Object A01(Object obj, Object obj2, String str) {
        try {
            return A02(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return obj2;
        }
    }
}
