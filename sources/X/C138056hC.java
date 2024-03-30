package X;

import android.text.StaticLayout;
import java.lang.reflect.Constructor;

/* renamed from: X.6hC  reason: invalid class name and case insensitive filesystem */
public final class C138056hC implements C158867iN {
    public static Constructor A00;
    public static boolean A01;

    public boolean BLl(StaticLayout staticLayout, boolean z) {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.reflect.Constructor} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.StaticLayout B3n(X.C124955z4 r13) {
        /*
            r12 = this;
            java.lang.String r4 = "unable to call constructor"
            java.lang.String r3 = "StaticLayoutFactory"
            boolean r0 = A01
            if (r0 != 0) goto L_0x005b
            r7 = 1
            A01 = r7
            java.lang.Class<android.text.StaticLayout> r5 = android.text.StaticLayout.class
            r0 = 13
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0053 }
            r1 = 0
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0053 }
            r2[r7] = r6     // Catch:{ NoSuchMethodException -> 0x0053 }
            r0 = 2
            r2[r0] = r6     // Catch:{ NoSuchMethodException -> 0x0053 }
            r1 = 3
            java.lang.Class<android.text.TextPaint> r0 = android.text.TextPaint.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            r0 = 4
            r2[r0] = r6     // Catch:{ NoSuchMethodException -> 0x0053 }
            r1 = 5
            java.lang.Class<android.text.Layout$Alignment> r0 = android.text.Layout.Alignment.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            r1 = 6
            java.lang.Class<android.text.TextDirectionHeuristic> r0 = android.text.TextDirectionHeuristic.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            r0 = 7
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x0053 }
            r2[r0] = r1     // Catch:{ NoSuchMethodException -> 0x0053 }
            r0 = 8
            r2[r0] = r1     // Catch:{ NoSuchMethodException -> 0x0053 }
            r1 = 9
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0053 }
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            r1 = 10
            java.lang.Class<android.text.TextUtils$TruncateAt> r0 = android.text.TextUtils.TruncateAt.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            r0 = 11
            r2[r0] = r6     // Catch:{ NoSuchMethodException -> 0x0053 }
            r0 = 12
            r2[r0] = r6     // Catch:{ NoSuchMethodException -> 0x0053 }
            java.lang.reflect.Constructor r0 = r5.getConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x0053 }
            A00 = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
            goto L_0x005b
        L_0x0053:
            r0 = 0
            A00 = r0
            java.lang.String r0 = "unable to collect necessary constructor."
            android.util.Log.e(r3, r0)
        L_0x005b:
            java.lang.reflect.Constructor r5 = A00
            r6 = 0
            if (r5 == 0) goto L_0x00bd
            r0 = 13
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 0
            java.lang.CharSequence r0 = r13.A0D     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r2[r1] = r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 1
            r0 = 0
            X.AnonymousClass000.A1L(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 2
            int r0 = r13.A02     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            X.AnonymousClass000.A1L(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 3
            android.text.TextPaint r0 = r13.A0B     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r2[r1] = r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 4
            int r0 = r13.A08     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            X.AnonymousClass000.A1L(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 5
            android.text.Layout$Alignment r0 = r13.A09     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r2[r1] = r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 6
            android.text.TextDirectionHeuristic r0 = r13.A0A     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r2[r1] = r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 7
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AnonymousClass000.A1I(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 8
            r0 = 0
            X.AnonymousClass000.A1I(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 9
            boolean r0 = r13.A0E     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            X.AnonymousClass000.A1N(r2, r1, r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 10
            android.text.TextUtils$TruncateAt r0 = r13.A0C     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r2[r1] = r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 11
            int r0 = r13.A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            X.AnonymousClass000.A1L(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r1 = 12
            int r0 = r13.A07     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            X.AnonymousClass000.A1L(r2, r0, r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            java.lang.Object r0 = r5.newInstance(r2)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            android.text.StaticLayout r0 = (android.text.StaticLayout) r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00b8 }
            r6 = r0
            goto L_0x00bd
        L_0x00b8:
            A00 = r6
            android.util.Log.e(r3, r4)
        L_0x00bd:
            if (r6 == 0) goto L_0x00c0
            return r6
        L_0x00c0:
            java.lang.CharSequence r1 = r13.A0D
            r2 = 0
            int r3 = r13.A02
            android.text.TextPaint r4 = r13.A0B
            int r5 = r13.A08
            android.text.Layout$Alignment r6 = r13.A09
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            boolean r9 = r13.A0E
            android.text.TextUtils$TruncateAt r10 = r13.A0C
            int r11 = r13.A01
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138056hC.B3n(X.5z4):android.text.StaticLayout");
    }
}
