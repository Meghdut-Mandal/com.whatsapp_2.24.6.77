package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.0Z0  reason: invalid class name */
public class AnonymousClass0Z0 {
    public C06030Sa A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public Menu A09;
    public CharSequence A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public char A0E;
    public char A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final /* synthetic */ AnonymousClass0EG A0U;

    private Object A00(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.A0U.A00.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", AnonymousClass000.A0p("Cannot instantiate class: ", str, AnonymousClass000.A0u()), e);
            return null;
        }
    }

    public AnonymousClass0Z0(Menu menu, AnonymousClass0EG r3) {
        this.A0U = r3;
        this.A09 = menu;
        this.A03 = 0;
        this.A01 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A0C = true;
        this.A0B = true;
    }

    public static void A01(MenuItem menuItem, AnonymousClass0Z0 r8) {
        MenuItem enabled = menuItem.setChecked(r8.A0R).setVisible(r8.A0T).setEnabled(r8.A0S);
        boolean z = false;
        boolean z2 = false;
        if (r8.A0I >= 1) {
            z2 = true;
        }
        enabled.setCheckable(z2).setTitleCondensed(r8.A0N).setIcon(r8.A0J);
        int i = r8.A0L;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (r8.A0Q != null) {
            AnonymousClass0EG r3 = r8.A0U;
            Context context = r3.A00;
            if (!context.isRestricted()) {
                Object obj = r3.A01;
                if (obj == null) {
                    obj = AnonymousClass0EG.A00(r3, context);
                    r3.A01 = obj;
                }
                menuItem.setOnMenuItemClickListener(new C08980bd(obj, r8.A0Q));
            } else {
                throw AnonymousClass001.A09("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (r8.A0I >= 2) {
            if (menuItem instanceof C018707z) {
                C018707z r2 = (C018707z) menuItem;
                r2.A02 = 4 | (r2.A02 & -5);
            } else if (menuItem instanceof AnonymousClass0FY) {
                AnonymousClass0FY r4 = (AnonymousClass0FY) menuItem;
                try {
                    Method method = r4.A00;
                    if (method == null) {
                        method = AnonymousClass001.A0H(r4.A01.getClass(), Boolean.TYPE, "setExclusiveCheckable", new Class[1], 0);
                        r4.A00 = method;
                    }
                    AnonymousClass07L r1 = r4.A01;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1N(objArr, 0, true);
                    method.invoke(r1, objArr);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = r8.A0P;
        if (str != null) {
            menuItem.setActionView((View) r8.A00(str, AnonymousClass0EG.A05, r8.A0U.A03));
            z = true;
        }
        int i2 = r8.A0G;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        C06030Sa r12 = r8.A00;
        if (r12 != null) {
            if (menuItem instanceof AnonymousClass07L) {
                ((AnonymousClass07L) menuItem).BsQ(r12);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = r8.A0M;
        boolean z3 = menuItem instanceof AnonymousClass07L;
        if (z3) {
            ((AnonymousClass07L) menuItem).Bqb(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C07670Yu.A05(menuItem, charSequence);
        }
        CharSequence charSequence2 = r8.A0O;
        if (z3) {
            ((AnonymousClass07L) menuItem).BsV(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C07670Yu.A06(menuItem, charSequence2);
        }
        char c = r8.A0E;
        int i3 = r8.A0H;
        if (z3) {
            ((AnonymousClass07L) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C07670Yu.A03(menuItem, c, i3);
        }
        char c2 = r8.A0F;
        int i4 = r8.A0K;
        if (z3) {
            ((AnonymousClass07L) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C07670Yu.A04(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = r8.A08;
        if (mode != null) {
            if (z3) {
                ((AnonymousClass07L) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C07670Yu.A02(mode, menuItem);
            }
        }
        ColorStateList colorStateList = r8.A07;
        if (colorStateList != null) {
            AnonymousClass0VM.A01(colorStateList, menuItem);
        }
    }

    public void A02(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.A0U.A00.obtainStyledAttributes(attributeSet, AnonymousClass1MJ.A0E);
        this.A03 = obtainStyledAttributes.getResourceId(1, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        this.A04 = obtainStyledAttributes.getInt(4, 0);
        this.A02 = obtainStyledAttributes.getInt(5, 0);
        this.A0C = obtainStyledAttributes.getBoolean(2, true);
        this.A0B = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.util.AttributeSet r9) {
        /*
            r8 = this;
            X.0EG r7 = r8.A0U
            android.content.Context r1 = r7.A00
            int[] r0 = X.AnonymousClass1MJ.A0F
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r9, r0)
            X.04j r5 = new X.04j
            r5.<init>(r1, r0)
            r4 = 0
            r0 = 2
            android.content.res.TypedArray r3 = r5.A02
            int r0 = r3.getResourceId(r0, r4)
            r8.A06 = r0
            int r1 = r8.A01
            r0 = 5
            int r2 = r3.getInt(r0, r1)
            int r1 = r8.A04
            r0 = 6
            int r1 = r3.getInt(r0, r1)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2 = r2 | r1
            r8.A05 = r2
            r0 = 7
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0A = r0
            r0 = 8
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0N = r0
            int r0 = r3.getResourceId(r4, r4)
            r8.A0J = r0
            r0 = 9
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x012e
            r0 = 0
        L_0x004f:
            r8.A0E = r0
            r0 = 16
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r3.getInt(r0, r1)
            r8.A0H = r0
            r0 = 10
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x0128
            r0 = 0
        L_0x0064:
            r8.A0F = r0
            r0 = 20
            int r0 = r3.getInt(r0, r1)
            r8.A0K = r0
            r0 = 11
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0124
            r0 = 11
            boolean r0 = r3.getBoolean(r0, r4)
        L_0x007c:
            r8.A0I = r0
            r0 = 3
            boolean r0 = r3.getBoolean(r0, r4)
            r8.A0R = r0
            boolean r1 = r8.A0C
            r0 = 4
            boolean r0 = r3.getBoolean(r0, r1)
            r8.A0T = r0
            boolean r1 = r8.A0B
            r0 = 1
            boolean r0 = r3.getBoolean(r0, r1)
            r8.A0S = r0
            r1 = 21
            r0 = -1
            int r0 = r3.getInt(r1, r0)
            r8.A0L = r0
            r0 = 12
            java.lang.String r0 = r3.getString(r0)
            r8.A0Q = r0
            r0 = 13
            int r0 = r3.getResourceId(r0, r4)
            r8.A0G = r0
            r0 = 15
            java.lang.String r0 = r3.getString(r0)
            r8.A0P = r0
            r0 = 14
            java.lang.String r6 = r3.getString(r0)
            boolean r0 = X.AnonymousClass000.A1V(r6)
            r2 = 0
            if (r0 == 0) goto L_0x0121
            int r0 = r8.A0G
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = r8.A0P
            if (r0 != 0) goto L_0x011a
            java.lang.Class[] r1 = X.AnonymousClass0EG.A04
            java.lang.Object[] r0 = r7.A02
            java.lang.Object r0 = r8.A00(r6, r1, r0)
            X.0Sa r0 = (X.C06030Sa) r0
            r8.A00 = r0
        L_0x00d9:
            r0 = 17
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0M = r0
            r0 = 22
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0O = r0
            r0 = 19
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0117
            r1 = 19
            r0 = -1
            int r1 = r3.getInt(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r8.A08
            android.graphics.PorterDuff$Mode r0 = X.C010504k.A00(r0, r1)
            r8.A08 = r0
        L_0x0100:
            r1 = 18
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0114
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r8.A07 = r0
        L_0x010e:
            r3.recycle()
            r8.A0D = r4
            return
        L_0x0114:
            r8.A07 = r2
            goto L_0x010e
        L_0x0117:
            r8.A08 = r2
            goto L_0x0100
        L_0x011a:
            java.lang.String r1 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r1, r0)
        L_0x0121:
            r8.A00 = r2
            goto L_0x00d9
        L_0x0124:
            int r0 = r8.A02
            goto L_0x007c
        L_0x0128:
            char r0 = r0.charAt(r4)
            goto L_0x0064
        L_0x012e:
            char r0 = r0.charAt(r4)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z0.A03(android.util.AttributeSet):void");
    }
}
