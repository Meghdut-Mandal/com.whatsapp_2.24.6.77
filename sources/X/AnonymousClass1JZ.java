package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.1JZ  reason: invalid class name */
public abstract class AnonymousClass1JZ {
    public static final Object A00 = new Object();

    public static int A00(int i) {
        if ((8388608 & i) != 0) {
            return i;
        }
        int i2 = i & 7;
        return i2 == 5 ? (i & -8) | 3 : i2 == 3 ? (i & -8) | 5 : i;
    }

    public static void A05(View view, C18820ts r6, int i, int i2) {
        A07(view, r6, i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static String A01(C18820ts r1, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean z = !C18820ts.A00(r1).A06;
        char c = 8207;
        if (z) {
            c = 8206;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char c = 8207;
        if (A0C(str)) {
            c = 8206;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static void A03(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i2);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        r1 = (android.widget.RelativeLayout) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        r4 = (android.widget.ListView) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d5, code lost:
        r11 = (android.view.ViewGroup.MarginLayoutParams) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.view.View r13, X.C18820ts r14) {
        /*
            X.1Kv r0 = X.C18820ts.A00(r14)
            boolean r0 = r0.A06
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L_0x002c
            boolean r0 = r13 instanceof android.widget.TimePicker
            if (r0 == 0) goto L_0x0182
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "accent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0182
        L_0x0021:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 == r0) goto L_0x002b
            r0 = 23
            if (r1 != r0) goto L_0x0182
        L_0x002b:
            return
        L_0x002c:
            boolean r0 = r13 instanceof X.AnonymousClass043
            if (r0 != 0) goto L_0x002b
            r0 = 2131427964(0x7f0b027c, float:1.847756E38)
            java.lang.Object r0 = r13.getTag(r0)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r13 instanceof android.widget.TimePicker
            if (r0 != 0) goto L_0x002b
            int r4 = r13.getPaddingRight()
            int r2 = r13.getPaddingTop()
            int r1 = r13.getPaddingLeft()
            int r0 = r13.getPaddingBottom()
            r13.setPadding(r4, r2, r1, r0)
            boolean r0 = r13 instanceof android.widget.TextView
            r2 = 1
            if (r0 == 0) goto L_0x0078
            boolean r0 = r13 instanceof android.widget.EditText
            if (r0 != 0) goto L_0x0078
            r7 = r13
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r0 = r7.getGravity()
            int r0 = A00(r0)
            r7.setGravity(r0)
            android.graphics.drawable.Drawable[] r6 = r7.getCompoundDrawables()
            r0 = 2
            r5 = r6[r0]
            r4 = r6[r2]
            r1 = r6[r3]
            r0 = 3
            r0 = r6[r0]
            r7.setCompoundDrawables(r5, r4, r1, r0)
        L_0x0078:
            boolean r0 = r13 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x008c
            r1 = r13
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r0 = r1.getGravity()
            if (r0 == 0) goto L_0x008c
            int r0 = A00(r0)
            r1.setGravity(r0)
        L_0x008c:
            boolean r0 = r13 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x00a6
            r4 = r13
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0159
            int r0 = r4.getGravity()
        L_0x009d:
            if (r0 == 0) goto L_0x00a6
            int r0 = A00(r0)
            r4.setGravity(r0)
        L_0x00a6:
            boolean r0 = r13 instanceof android.widget.ListView
            if (r0 == 0) goto L_0x00bb
            r4 = r13
            android.widget.ListView r4 = (android.widget.ListView) r4
            android.graphics.drawable.Drawable r1 = r4.getDivider()
            if (r1 == 0) goto L_0x00bb
            X.4vb r0 = new X.4vb
            r0.<init>(r1, r14)
            r4.setDivider(r0)
        L_0x00bb:
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0170
            r8 = r13
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r7 = r8.getChildCount()
            r6 = 0
        L_0x00c7:
            if (r6 >= r7) goto L_0x0170
            android.view.View r5 = r8.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00e5
            r11 = r4
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r10 = r11.leftMargin
            int r9 = r11.rightMargin
            if (r10 == r9) goto L_0x00e5
            int r1 = r11.topMargin
            int r0 = r11.bottomMargin
            r11.setMargins(r9, r1, r10, r0)
        L_0x00e5:
            boolean r0 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r0 == 0) goto L_0x0110
            r11 = r4
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            int[] r12 = r11.getRules()
            r1 = r12[r3]
            r0 = r12[r2]
            r12[r2] = r1
            r12[r3] = r0
            r10 = 5
            r9 = r12[r10]
            r1 = 7
            r0 = r12[r1]
            r11.addRule(r10, r0)
            r11.addRule(r1, r9)
            r10 = 9
            r9 = r12[r10]
            r1 = 11
            r0 = r12[r1]
            r12[r10] = r0
            r12[r1] = r9
        L_0x0110:
            boolean r0 = r4 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x011f
            r1 = r4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r1.gravity
            int r0 = A00(r0)
            r1.gravity = r0
        L_0x011f:
            boolean r0 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x012e
            r1 = r4
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r1.gravity
            int r0 = A00(r0)
            r1.gravity = r0
        L_0x012e:
            boolean r0 = r4 instanceof X.AnonymousClass0BJ
            if (r0 == 0) goto L_0x0152
            X.0BJ r4 = (X.AnonymousClass0BJ) r4
            float r1 = r4.A04
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            r4.A04 = r0
            int r1 = r4.A0U
            int r0 = r4.A0m
            r4.A0U = r0
            r4.A0m = r1
            int r1 = r4.A0V
            int r0 = r4.A0l
            r4.A0V = r0
            r4.A0l = r1
            r5.setLayoutParams(r4)
        L_0x0152:
            A04(r5, r14)
            int r6 = r6 + 1
            goto L_0x00c7
        L_0x0159:
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            java.lang.String r0 = "mGravity"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a6 }
            r0.setAccessible(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a6 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a6 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a6 }
            goto L_0x009d
        L_0x0170:
            boolean r0 = r13 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L_0x002b
            androidx.constraintlayout.widget.Barrier r13 = (androidx.constraintlayout.widget.Barrier) r13
            int r0 = r13.A00
            if (r0 != 0) goto L_0x017d
            r13.A00 = r2
            return
        L_0x017d:
            if (r0 != r2) goto L_0x002b
            r13.A00 = r3
            return
        L_0x0182:
            X.AnonymousClass04F.A05(r13, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JZ.A04(android.view.View, X.0ts):void");
    }

    public static void A06(View view, C18820ts r3, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!C18820ts.A00(r3).A06) {
            marginLayoutParams.setMargins(i, i2, i3, i4);
        } else {
            marginLayoutParams.setMargins(i3, i2, i, i4);
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void A07(View view, C18820ts r3, int i, int i2, int i3, int i4) {
        int i5 = i;
        if (C18820ts.A00(r3).A06) {
            i5 = i3;
        }
        if (!C18820ts.A00(r3).A06) {
            i = i3;
        }
        view.setPadding(i5, i2, i, i4);
    }

    public static void A08(Window window, C18820ts r3) {
        View decorView = window.getDecorView();
        int i = 0;
        if (C18820ts.A00(r3).A06) {
            i = 1;
        }
        decorView.setLayoutDirection(i);
    }

    public static void A09(EditText editText, C18820ts r5) {
        int paddingLeft;
        int paddingTop;
        int dimensionPixelSize;
        if (C18820ts.A00(r5).A06) {
            paddingLeft = editText.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            paddingTop = editText.getPaddingTop();
            dimensionPixelSize = editText.getPaddingRight();
        } else {
            paddingLeft = editText.getPaddingLeft();
            paddingTop = editText.getPaddingTop();
            dimensionPixelSize = editText.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        editText.setPadding(paddingLeft, paddingTop, dimensionPixelSize, editText.getPaddingBottom());
    }

    public static void A0A(HorizontalScrollView horizontalScrollView, C18820ts r4) {
        if (C18820ts.A00(r4).A06) {
            horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C90094Zb(horizontalScrollView, 0));
        }
    }

    public static void A0B(TextView textView, C18820ts r3, int i) {
        if (C18820ts.A00(r3).A06) {
            textView.setCompoundDrawablesWithIntrinsicBounds(new C100744vb(AnonymousClass00E.A00(textView.getContext(), i), r3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }

    public static boolean A0C(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            return !AnonymousClass047.A01.BN4(charSequence, 0, charSequence.length());
        }
        Log.w("TextEmojiLabel/isTextLTR text is empty or null");
        return true;
    }
}
