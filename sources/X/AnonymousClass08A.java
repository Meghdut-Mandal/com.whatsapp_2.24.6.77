package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08A  reason: invalid class name */
public abstract class AnonymousClass08A {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public abstract Typeface A02(Context context, Resources resources, C09610ce r3, int i);

    public abstract Typeface A05(Context context, CancellationSignal cancellationSignal, AnonymousClass0TI[] r3, int i);

    public static long A00(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d2, code lost:
        if (r0 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7 A[Catch:{ IllegalAccessException -> 0x00d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A04(android.content.Context r25, android.graphics.Typeface r26, int r27, boolean r28) {
        /*
            r24 = this;
            r7 = r26
            java.lang.reflect.Field r1 = X.C05960Rt.A02     // Catch:{ RuntimeException -> 0x0008 }
            r0 = 0
            if (r1 == 0) goto L_0x000b
            goto L_0x000a
        L_0x0008:
            r0 = 0
            goto L_0x000e
        L_0x000a:
            r0 = 1
        L_0x000b:
            if (r0 != 0) goto L_0x0011
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x00e1
            return r0
        L_0x0011:
            r10 = r27
            int r8 = r27 << 1
            r9 = r28
            r8 = r8 | r28
            java.lang.Object r17 = X.C05960Rt.A01     // Catch:{ RuntimeException -> 0x0008 }
            monitor-enter(r17)     // Catch:{ RuntimeException -> 0x0008 }
            java.lang.Object r0 = r1.get(r7)     // Catch:{ IllegalAccessException -> 0x00d7 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalAccessException -> 0x00d7 }
            long r0 = r0.longValue()     // Catch:{ IllegalAccessException -> 0x00d7 }
            X.00i r3 = X.C05960Rt.A00     // Catch:{ all -> 0x00de }
            java.lang.Object r6 = r3.A05(r0)     // Catch:{ all -> 0x00de }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x00de }
            if (r6 != 0) goto L_0x00cc
            r2 = 4
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ all -> 0x00de }
            r6.<init>(r2)     // Catch:{ all -> 0x00de }
            r3.A0A(r0, r6)     // Catch:{ all -> 0x00de }
        L_0x0039:
            long r3 = A00(r7)     // Catch:{ all -> 0x00de }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            r0 = r24
            java.util.concurrent.ConcurrentHashMap r12 = r0.A00     // Catch:{ all -> 0x00de }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00de }
            java.lang.Object r11 = r12.get(r0)     // Catch:{ all -> 0x00de }
            X.0ce r11 = (X.C09610ce) r11     // Catch:{ all -> 0x00de }
            if (r11 == 0) goto L_0x00b4
            r19 = r25
            android.content.res.Resources r4 = r19.getResources()     // Catch:{ all -> 0x00de }
            X.0TP[] r15 = r11.A00     // Catch:{ all -> 0x00de }
            int r14 = r15.length     // Catch:{ all -> 0x00de }
            r13 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
        L_0x0061:
            if (r3 >= r14) goto L_0x0082
            r2 = r15[r3]     // Catch:{ all -> 0x00de }
            int r0 = r2.A02     // Catch:{ all -> 0x00de }
            int r0 = r0 - r27
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00de }
            int r1 = r0 * 2
            boolean r0 = r2.A05     // Catch:{ all -> 0x00de }
            r16 = 1
            if (r0 != r9) goto L_0x0077
            r16 = 0
        L_0x0077:
            int r1 = r1 + r16
            if (r13 == 0) goto L_0x007d
            if (r5 <= r1) goto L_0x007f
        L_0x007d:
            r13 = r2
            r5 = r1
        L_0x007f:
            int r3 = r3 + 1
            goto L_0x0061
        L_0x0082:
            if (r13 == 0) goto L_0x00b4
            int r3 = r13.A00     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r13.A03     // Catch:{ all -> 0x00de }
            r1 = 0
            X.08A r18 = X.AnonymousClass089.A01     // Catch:{ all -> 0x00de }
            r23 = 0
            r20 = r4
            r21 = r2
            r22 = r3
            android.graphics.Typeface r0 = r18.A03(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r2 = X.AnonymousClass089.A00(r4, r2, r3, r1, r1)     // Catch:{ all -> 0x00de }
            X.00v r1 = X.AnonymousClass089.A00     // Catch:{ all -> 0x00de }
            r1.A08(r2, r0)     // Catch:{ all -> 0x00de }
        L_0x00a2:
            long r4 = A00(r0)     // Catch:{ all -> 0x00de }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00b5
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00de }
            r12.put(r1, r11)     // Catch:{ all -> 0x00de }
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 != 0) goto L_0x00c8
            r1 = 1
            r0 = 600(0x258, float:8.41E-43)
            if (r10 < r0) goto L_0x00c0
            if (r28 == 0) goto L_0x00c4
            r1 = 3
            goto L_0x00c4
        L_0x00c0:
            r1 = 2
            if (r28 != 0) goto L_0x00c4
            r1 = 0
        L_0x00c4:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r7, r1)     // Catch:{ all -> 0x00de }
        L_0x00c8:
            r6.put(r8, r0)     // Catch:{ all -> 0x00de }
            goto L_0x00d4
        L_0x00cc:
            java.lang.Object r0 = r6.get(r8)     // Catch:{ all -> 0x00de }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x0039
        L_0x00d4:
            monitor-exit(r17)     // Catch:{ all -> 0x00de }
            goto L_0x000e
        L_0x00d7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00de }
            r0.<init>(r1)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ RuntimeException -> 0x0008 }
        L_0x00e1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08A.A04(android.content.Context, android.graphics.Typeface, int, boolean):android.graphics.Typeface");
    }

    public AnonymousClass0TI A06(AnonymousClass0TI[] r11, int i) {
        int i2 = 700;
        if ((i & 1) == 0) {
            i2 = 400;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            z = true;
        }
        AnonymousClass0TI r6 = null;
        int i3 = Integer.MAX_VALUE;
        for (AnonymousClass0TI r3 : r11) {
            int abs = Math.abs(r3.A02 - i2) * 2;
            int i4 = 1;
            if (r3.A04 == z) {
                i4 = 0;
            }
            int i5 = abs + i4;
            if (r6 == null || i3 > i5) {
                r6 = r3;
                i3 = i5;
            }
        }
        return r6;
    }

    public Typeface A03(Context context, Resources resources, String str, int i, int i2) {
        File A002 = AnonymousClass0YK.A00(context);
        if (A002 == null) {
            return null;
        }
        try {
            if (!AnonymousClass0YK.A02(resources, A002, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A002.getPath());
            A002.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A002.delete();
        }
    }
}
