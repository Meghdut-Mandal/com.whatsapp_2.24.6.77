package X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0CM  reason: invalid class name */
public class AnonymousClass0CM {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public static void A02(View view, ViewParent viewParent, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    public static boolean A07(AnonymousClass0CM r8, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        ViewParent viewParent;
        int i6;
        int i7;
        AnonymousClass0CM r1 = r8;
        if (r8.A02) {
            if (i5 != 0) {
                viewParent = r8.A00;
            } else {
                viewParent = r8.A01;
            }
            if (viewParent != null) {
                int[] iArr3 = iArr;
                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                    if (iArr != null) {
                        r1.A04.getLocationInWindow(iArr);
                        i6 = iArr[0];
                        i7 = iArr[1];
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    if (iArr2 == null) {
                        iArr2 = r1.A03;
                        if (iArr2 == null) {
                            iArr2 = new int[2];
                            r1.A03 = iArr2;
                        }
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                    View view = r1.A04;
                    if (viewParent instanceof C02410Ae) {
                        ((C02410Ae) viewParent).BbR(view, iArr2, i, i2, i3, i4, i5);
                    } else {
                        iArr2[0] = iArr2[0] + i3;
                        iArr2[1] = iArr2[1] + i4;
                        if (viewParent instanceof C02400Ad) {
                            ((C02400Ad) viewParent).BbQ(view, i, i2, i3, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                A02(view, viewParent, i, i2, i3, i4);
                            } catch (AbstractMethodError e) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("ViewParent ");
                                sb.append(viewParent);
                                sb.append(" does not implement interface method onNestedScroll");
                                Log.e("ViewParentCompat", sb.toString(), e);
                            }
                        }
                    }
                    if (iArr3 != null) {
                        view.getLocationInWindow(iArr3);
                        iArr3[0] = iArr3[0] - i6;
                        iArr3[1] = iArr3[1] - i7;
                    }
                    return true;
                } else if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
            }
        }
        return false;
    }

    public boolean A0C(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ViewParent viewParent;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (this.A02) {
            int i6 = i3;
            if (i3 != 0) {
                viewParent = this.A00;
            } else {
                viewParent = this.A01;
            }
            if (viewParent != null) {
                int i7 = i;
                int i8 = i2;
                if (i != 0 || i2 != 0) {
                    if (iArr2 != null) {
                        this.A04.getLocationInWindow(iArr2);
                        i4 = iArr2[0];
                        i5 = iArr2[1];
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    if (iArr == null && (iArr3 = this.A03) == null) {
                        iArr3 = new int[2];
                        this.A03 = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    View view = this.A04;
                    if (viewParent instanceof C02400Ad) {
                        ((C02400Ad) viewParent).BbP(view, iArr3, i7, i8, i6);
                    } else if (i3 == 0) {
                        try {
                            A03(view, viewParent, iArr3, i7, i8);
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ViewParent ");
                            sb.append(viewParent);
                            sb.append(" does not implement interface method onNestedPreScroll");
                            Log.e("ViewParentCompat", sb.toString(), e);
                        }
                    }
                    if (iArr2 != null) {
                        view.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i4;
                        iArr2[1] = iArr2[1] - i5;
                    }
                    if (!(iArr3[0] == 0 && iArr3[1] == 0)) {
                        return true;
                    }
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
        }
        return false;
    }

    public void A08(int i) {
        ViewParent viewParent;
        if (i != 0) {
            viewParent = this.A00;
        } else {
            viewParent = this.A01;
        }
        if (viewParent != null) {
            View view = this.A04;
            if (viewParent instanceof C02400Ad) {
                ((C02400Ad) viewParent).Bhs(view, i);
            } else if (i == 0) {
                try {
                    A01(view, viewParent);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            }
            if (i != 0) {
                this.A00 = null;
            } else {
                this.A01 = null;
            }
        }
    }

    public boolean A09(float f, float f2) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return A05(this.A04, viewParent, f, f2);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    public boolean A0A(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return A06(this.A04, viewParent, f, f2, z);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0063 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(int r8, int r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0068
            android.view.ViewParent r1 = r7.A00
        L_0x0004:
            r0 = 0
            if (r1 == 0) goto L_0x0008
            r0 = 1
        L_0x0008:
            r6 = 1
            if (r0 != 0) goto L_0x0032
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x008d
            android.view.View r5 = r7.A04
            android.view.ViewParent r3 = r5.getParent()
            r4 = r5
        L_0x0016:
            if (r3 == 0) goto L_0x008d
            boolean r0 = r3 instanceof X.C02400Ad
            if (r0 == 0) goto L_0x0039
            r0 = r3
            X.0Ad r0 = (X.C02400Ad) r0
            boolean r0 = r0.BhH(r4, r5, r8, r9)
        L_0x0023:
            if (r0 == 0) goto L_0x005c
            if (r9 == 0) goto L_0x0036
            r7.A00 = r3
        L_0x0029:
            boolean r0 = r3 instanceof X.C02400Ad
            if (r0 == 0) goto L_0x0033
            X.0Ad r3 = (X.C02400Ad) r3
            r3.BbS(r4, r5, r8, r9)
        L_0x0032:
            return r6
        L_0x0033:
            if (r9 != 0) goto L_0x0032
            goto L_0x006b
        L_0x0036:
            r7.A01 = r3
            goto L_0x0029
        L_0x0039:
            if (r9 != 0) goto L_0x005c
            boolean r0 = A04(r4, r5, r3, r8)     // Catch:{ AbstractMethodError -> 0x0040 }
            goto L_0x0023
        L_0x0040:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ViewParent "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
        L_0x005c:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x0063
            r4 = r3
            android.view.View r4 = (android.view.View) r4
        L_0x0063:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x0016
        L_0x0068:
            android.view.ViewParent r1 = r7.A01
            goto L_0x0004
        L_0x006b:
            A00(r4, r5, r3, r8)     // Catch:{ AbstractMethodError -> 0x006f }
            goto L_0x008c
        L_0x006f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ViewParent "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
            return r6
        L_0x008c:
            return r6
        L_0x008d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CM.A0B(int, int):boolean");
    }

    public AnonymousClass0CM(View view) {
        this.A04 = view;
    }

    public static boolean A04(View view, View view2, ViewParent viewParent, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static boolean A05(View view, ViewParent viewParent, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    public static boolean A06(View view, ViewParent viewParent, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    public static void A01(View view, ViewParent viewParent) {
        viewParent.onStopNestedScroll(view);
    }

    public static void A00(View view, View view2, ViewParent viewParent, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static void A03(View view, ViewParent viewParent, int[] iArr, int i, int i2) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }
}
