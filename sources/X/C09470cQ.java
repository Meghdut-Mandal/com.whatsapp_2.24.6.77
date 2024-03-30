package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.0cQ  reason: invalid class name and case insensitive filesystem */
public class C09470cQ implements C17250qy {
    public static Method A0P;
    public static Method A0Q;
    public static Method A0R;
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = -2;
    public Context A04;
    public Rect A05;
    public View A06;
    public AdapterView.OnItemClickListener A07;
    public AdapterView.OnItemSelectedListener A08;
    public ListAdapter A09;
    public PopupWindow A0A;
    public AnonymousClass0F6 A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public DataSetObserver A0I;
    public final Handler A0J;
    public final C11130fm A0K = new C11130fm(this);
    public final Rect A0L = AnonymousClass001.A06();
    public final C09240c3 A0M = new C09240c3(this);
    public final C11120fl A0N = new C11120fl(this);
    public final C09110bq A0O = new C09110bq(this);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A0Q = AnonymousClass001.A0H(cls, Boolean.TYPE, "setClipToScreenEnabled", new Class[1], 0);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A0R = AnonymousClass001.A0H(PopupWindow.class, Rect.class, "setEpicenterBounds", new Class[1], 0);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                Class[] clsArr = new Class[3];
                clsArr[0] = View.class;
                clsArr[1] = Integer.TYPE;
                A0P = AnonymousClass001.A0H(cls2, Boolean.TYPE, "getMaxAvailableHeight", clsArr, 2);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AnonymousClass0F6 A02(Context context, boolean z) {
        return new AnonymousClass0F6(context, z);
    }

    public void A03(int i) {
        Drawable background = this.A0A.getBackground();
        if (background != null) {
            Rect rect = this.A0L;
            background.getPadding(rect);
            this.A03 = rect.left + rect.right + i;
            return;
        }
        this.A03 = i;
    }

    public Drawable B8j() {
        return this.A0A.getBackground();
    }

    public int BJ0() {
        if (!this.A0D) {
            return 0;
        }
        return this.A02;
    }

    public boolean BNH() {
        return this.A0A.isShowing();
    }

    public void Bq4(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A0I;
        if (dataSetObserver == null) {
            this.A0I = new C03140Di(this);
        } else {
            ListAdapter listAdapter2 = this.A09;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A09 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A0I);
        }
        AnonymousClass0F6 r1 = this.A0B;
        if (r1 != null) {
            r1.setAdapter(this.A09);
        }
    }

    public void BqH(Drawable drawable) {
        this.A0A.setBackgroundDrawable(drawable);
    }

    public void Bsg(int i) {
        this.A02 = i;
        this.A0D = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Btc() {
        /*
            r18 = this;
            r3 = r18
            X.0F6 r0 = r3.A0B
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = -1
            r9 = 1
            if (r0 != 0) goto L_0x008a
            android.content.Context r1 = r3.A04
            X.0fk r0 = new X.0fk
            r0.<init>(r3)
            r3.A0C = r0
            boolean r0 = r3.A0F
            r0 = r0 ^ 1
            X.0F6 r1 = r3.A02(r1, r0)
            r3.A0B = r1
            android.widget.ListAdapter r0 = r3.A09
            r1.setAdapter(r0)
            X.0F6 r1 = r3.A0B
            android.widget.AdapterView$OnItemClickListener r0 = r3.A07
            r1.setOnItemClickListener(r0)
            X.0F6 r0 = r3.A0B
            r0.setFocusable(r9)
            X.0F6 r0 = r3.A0B
            r0.setFocusableInTouchMode(r9)
            X.0F6 r2 = r3.A0B
            r1 = 0
            X.0tT r0 = new X.0tT
            r0.<init>(r3, r1)
            r2.setOnItemSelectedListener(r0)
            X.0F6 r1 = r3.A0B
            X.0c3 r0 = r3.A0M
            r1.setOnScrollListener(r0)
            android.widget.AdapterView$OnItemSelectedListener r1 = r3.A08
            if (r1 == 0) goto L_0x004e
            X.0F6 r0 = r3.A0B
            r0.setOnItemSelectedListener(r1)
        L_0x004e:
            X.0F6 r0 = r3.A0B
            r11 = 0
            android.widget.PopupWindow r12 = r3.A0A
            r12.setContentView(r0)
        L_0x0056:
            android.graphics.drawable.Drawable r0 = r12.getBackground()
            android.graphics.Rect r6 = r3.A0L
            if (r0 == 0) goto L_0x0085
            r0.getPadding(r6)
            int r1 = r6.top
            int r0 = r6.bottom
            int r10 = r1 + r0
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x006e
            int r0 = -r1
            r3.A02 = r0
        L_0x006e:
            int r1 = r12.getInputMethodMode()
            r0 = 2
            if (r1 == r0) goto L_0x0076
            r9 = 0
        L_0x0076:
            android.view.View r8 = r3.A06
            int r4 = r3.A02
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x00a9
            java.lang.reflect.Method r2 = A0P
            if (r2 == 0) goto L_0x00b5
            goto L_0x0091
        L_0x0085:
            r6.setEmpty()
            r10 = 0
            goto L_0x006e
        L_0x008a:
            android.widget.PopupWindow r12 = r3.A0A
            r12.getContentView()
            r11 = 0
            goto L_0x0056
        L_0x0091:
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00ae }
            r1[r11] = r8     // Catch:{ Exception -> 0x00ae }
            r0 = 1
            X.AnonymousClass000.A1L(r1, r4, r0)     // Catch:{ Exception -> 0x00ae }
            r0 = 2
            X.AnonymousClass000.A1N(r1, r0, r9)     // Catch:{ Exception -> 0x00ae }
            java.lang.Object r0 = r2.invoke(r12, r1)     // Catch:{ Exception -> 0x00ae }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00ae }
            int r4 = r0.intValue()     // Catch:{ Exception -> 0x00ae }
            goto L_0x00b9
        L_0x00a9:
            int r4 = r12.getMaxAvailableHeight(r8, r4, r9)
            goto L_0x00b9
        L_0x00ae:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r1, r0)
        L_0x00b5:
            int r4 = r12.getMaxAvailableHeight(r8, r4)
        L_0x00b9:
            int r1 = r3.A03
            r0 = -2
            if (r1 == r0) goto L_0x01bf
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x01bf
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
        L_0x00c6:
            X.0F6 r0 = r3.A0B
            r6 = -1
            int r2 = r0.A00(r1, r4)
            if (r2 <= 0) goto L_0x00de
            X.0F6 r0 = r3.A0B
            int r1 = r0.getPaddingTop()
            X.0F6 r0 = r3.A0B
            int r0 = r0.getPaddingBottom()
            int r1 = r1 + r0
            int r10 = r10 + r1
            int r11 = r11 + r10
        L_0x00de:
            int r2 = r2 + r11
            r12.getInputMethodMode()
            r0 = 1002(0x3ea, float:1.404E-42)
            X.AnonymousClass0W8.A00(r12, r0)
            boolean r0 = r12.isShowing()
            r7 = 1
            r5 = -2
            r4 = 0
            if (r0 == 0) goto L_0x0122
            android.view.View r0 = r3.A06
            boolean r0 = X.C011304x.A02(r0)
            if (r0 == 0) goto L_0x0118
            int r1 = r3.A03
            if (r1 != r6) goto L_0x0119
            r1 = -1
        L_0x00fd:
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0102
            r7 = 0
        L_0x0102:
            r12.setOutsideTouchable(r7)
            android.view.View r13 = r3.A06
            int r14 = r3.A01
            int r15 = r3.A02
            if (r1 >= 0) goto L_0x010e
            r1 = -1
        L_0x010e:
            if (r2 >= 0) goto L_0x0111
            r2 = -1
        L_0x0111:
            r16 = r1
            r17 = r2
            r12.update(r13, r14, r15, r16, r17)
        L_0x0118:
            return
        L_0x0119:
            if (r1 != r5) goto L_0x00fd
            android.view.View r0 = r3.A06
            int r1 = r0.getWidth()
            goto L_0x00fd
        L_0x0122:
            int r0 = r3.A03
            if (r0 != r6) goto L_0x0138
            r0 = -1
        L_0x0127:
            r12.setWidth(r0)
            r12.setHeight(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0152
            java.lang.reflect.Method r1 = A0Q
            if (r1 == 0) goto L_0x0155
            goto L_0x0141
        L_0x0138:
            if (r0 != r5) goto L_0x0127
            android.view.View r0 = r3.A06
            int r0 = r0.getWidth()
            goto L_0x0127
        L_0x0141:
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x014a }
            X.AnonymousClass000.A1N(r0, r4, r7)     // Catch:{ Exception -> 0x014a }
            r1.invoke(r12, r0)     // Catch:{ Exception -> 0x014a }
            goto L_0x0155
        L_0x014a:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r0)
            goto L_0x0155
        L_0x0152:
            r12.setIsClippedToScreen(r7)
        L_0x0155:
            boolean r0 = r3.A0E
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r12.setOutsideTouchable(r0)
            X.0bq r0 = r3.A0O
            r12.setTouchInterceptor(r0)
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x016c
            boolean r0 = r3.A0G
            X.AnonymousClass0W8.A01(r12, r0)
        L_0x016c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0180
            java.lang.reflect.Method r2 = A0R
            if (r2 == 0) goto L_0x018e
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0186 }
            android.graphics.Rect r0 = r3.A05     // Catch:{ Exception -> 0x0186 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0186 }
            r2.invoke(r12, r1)     // Catch:{ Exception -> 0x0186 }
            goto L_0x018e
        L_0x0180:
            android.graphics.Rect r0 = r3.A05
            r12.setEpicenterBounds(r0)
            goto L_0x018e
        L_0x0186:
            r2 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r0, r2)
        L_0x018e:
            android.view.View r4 = r3.A06
            int r2 = r3.A01
            int r1 = r3.A02
            int r0 = r3.A00
            A01(r4, r12, r2, r1, r0)
            X.0F6 r0 = r3.A0B
            r0.setSelection(r6)
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x01aa
            X.0F6 r0 = r3.A0B
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x01b3
        L_0x01aa:
            X.0F6 r0 = r3.A0B
            if (r0 == 0) goto L_0x01b3
            r0.A08 = r7
            r0.requestLayout()
        L_0x01b3:
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x0118
            android.os.Handler r1 = r3.A0J
            X.0fl r0 = r3.A0N
            r1.post(r0)
            return
        L_0x01bf:
            android.content.Context r0 = r3.A04
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r0)
            int r2 = r0.widthPixels
            int r1 = r6.left
            int r0 = r6.right
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09470cQ.Btc():void");
    }

    public void dismiss() {
        PopupWindow popupWindow = this.A0A;
        popupWindow.dismiss();
        popupWindow.setContentView((View) null);
        this.A0B = null;
        this.A0J.removeCallbacks(this.A0K);
    }

    public C09470cQ(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A04 = context;
        this.A0J = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1MJ.A0D, i, i2);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0D = true;
        }
        obtainStyledAttributes.recycle();
        AnonymousClass0F9 r0 = new AnonymousClass0F9(context, attributeSet, i, i2);
        this.A0A = r0;
        r0.setInputMethodMode(1);
    }

    public void Br1(int i) {
        this.A01 = i;
    }

    public int BCT() {
        return this.A01;
    }

    public AnonymousClass0F6 BDZ() {
        return this.A0B;
    }

    public static void A01(View view, PopupWindow popupWindow, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
