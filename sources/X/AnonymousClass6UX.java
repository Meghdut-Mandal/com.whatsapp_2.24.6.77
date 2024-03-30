package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* renamed from: X.6UX  reason: invalid class name */
public abstract class AnonymousClass6UX {
    public static final Integer A00 = C023109s.A00;
    public static final WeakHashMap A01 = new WeakHashMap();
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();

    public static AnonymousClass72Q A00(Context context) {
        AnonymousClass72Q r3;
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        TypedArray typedArray4;
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            r3 = (AnonymousClass72Q) weakHashMap.get(theme);
        }
        if (r3 == null) {
            r3 = new AnonymousClass72Q();
            AnonymousClass6RN.A00("LoadTextStyle");
            Resources.Theme theme2 = context.getTheme();
            if (Build.VERSION.SDK_INT <= 22) {
                synchronized (theme2) {
                    typedArray = context.obtainStyledAttributes((AttributeSet) null, C113885gH.A01, 0, 0);
                }
            } else {
                typedArray = context.obtainStyledAttributes((AttributeSet) null, C113885gH.A01, 0, 0);
            }
            int resourceId = typedArray.getResourceId(0, -1);
            typedArray.recycle();
            if (resourceId != -1) {
                if (Build.VERSION.SDK_INT <= 22) {
                    synchronized (theme2) {
                        typedArray4 = theme2.obtainStyledAttributes(resourceId, C113885gH.A00);
                    }
                } else {
                    typedArray4 = theme2.obtainStyledAttributes(resourceId, C113885gH.A00);
                }
                A02(typedArray4, r3);
                typedArray4.recycle();
            }
            if (Build.VERSION.SDK_INT <= 22) {
                synchronized (theme2) {
                    typedArray2 = context.obtainStyledAttributes((AttributeSet) null, C113885gH.A02, 0, 0);
                }
            } else {
                typedArray2 = context.obtainStyledAttributes((AttributeSet) null, C113885gH.A02, 0, 0);
            }
            int resourceId2 = typedArray2.getResourceId(0, -1);
            typedArray2.recycle();
            if (resourceId2 != -1) {
                if (Build.VERSION.SDK_INT <= 22) {
                    synchronized (theme2) {
                        typedArray3 = theme2.obtainStyledAttributes(resourceId2, C113885gH.A00);
                    }
                } else {
                    typedArray3 = theme2.obtainStyledAttributes(resourceId2, C113885gH.A00);
                }
                A02(typedArray3, r3);
                typedArray3.recycle();
            }
            AnonymousClass68E.A00();
            synchronized (weakHashMap) {
                weakHashMap.put(theme, r3);
            }
        }
        return r3.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 8388613) goto L_0x0003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return X.C023109s.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        return X.C023109s.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        return X.C023109s.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        return A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A01(int r0, int r1) {
        /*
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0006;
                case 2: goto L_0x001e;
                case 3: goto L_0x0021;
                case 4: goto L_0x0030;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                default: goto L_0x0003;
            }
        L_0x0003:
            java.lang.Integer r0 = A00
            return r0
        L_0x0006:
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x002d
            r0 = 5
            if (r1 == r0) goto L_0x002a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L_0x0027
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L_0x0024
            goto L_0x0003
        L_0x001e:
            java.lang.Integer r0 = X.C023109s.A00
            return r0
        L_0x0021:
            java.lang.Integer r0 = X.C023109s.A01
            return r0
        L_0x0024:
            java.lang.Integer r0 = X.C023109s.A0R
            return r0
        L_0x0027:
            java.lang.Integer r0 = X.C023109s.A0G
            return r0
        L_0x002a:
            java.lang.Integer r0 = X.C023109s.A0V
            return r0
        L_0x002d:
            java.lang.Integer r0 = X.C023109s.A0S
            return r0
        L_0x0030:
            java.lang.Integer r0 = X.C023109s.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UX.A01(int, int):java.lang.Integer");
    }

    public static void A02(TypedArray typedArray, AnonymousClass72Q r10) {
        Integer num;
        int indexCount = typedArray.getIndexCount();
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index == 2) {
                r10.A0T = typedArray.getColorStateList(index);
                r10.A0R = 0;
            } else if (index == 0) {
                r10.A0S = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    r10.A0V = A02[integer - 1];
                }
            } else if (index == 25) {
                i = typedArray.getInt(index, -1);
                r10.A0Z = A01(i, i2);
            } else if (index == 6) {
                i2 = typedArray.getInt(index, -1);
                r10.A0Z = A01(i, i2);
                int i4 = i2 & 112;
                if (i4 == 16) {
                    num = C023109s.A01;
                } else if (i4 == 48 || i4 != 80) {
                    num = C023109s.A00;
                } else {
                    num = C023109s.A0C;
                }
                r10.A0F = num;
            } else if (index == 15) {
                r10.A0G = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                r10.A0B = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                r10.A0Q = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                r10.A0H = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                r10.A07 = typedArray.getColor(index, 0);
            } else if (index == 3) {
                r10.A0M = typedArray.getColor(index, 0);
            } else if (index == 1) {
                r10.A0E = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                r10.A00 = (float) typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                r10.A0L = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                r10.A01 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                r10.A02 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                r10.A03 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                r10.A0D = typedArray.getColor(index, 0);
            } else if (index == 13) {
                r10.A0A = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                r10.A08 = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                r10.A0C = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                r10.A09 = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    r10.A0U = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r10.A04 = typedArray.getInt(index, 0);
                }
            } else if (index == 27) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r10.A05 = typedArray.getInt(index, 0);
                }
            } else if (index == 28 && Build.VERSION.SDK_INT >= 26) {
                r10.A06 = typedArray.getInt(index, 0);
            }
        }
    }
}
