package X;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.0Gq  reason: invalid class name */
public class AnonymousClass0Gq extends AnonymousClass08A {
    public static final Class A00;
    public static final Constructor A01;
    public static final Method A02;
    public static final Method A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r9 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r7 = 0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Constructor r8 = r6.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.String r4 = "addFontWeightStyle"
            r0 = 5
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            r3[r7] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r5 = 1
            r3[r5] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r1 = 2
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r3[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r0 = 3
            r3[r0] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r1 = 4
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Method r4 = X.AnonymousClass001.A0G(r6, r0, r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r9 = r8
            goto L_0x004c
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass000.A0k(r2)
            java.lang.String r0 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r0, r1, r2)
            r6 = r9
            r0 = r9
            r4 = r9
        L_0x004c:
            A01 = r9
            A00 = r6
            A02 = r4
            A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Gq.<clinit>():void");
    }

    public Typeface A05(Context context, CancellationSignal cancellationSignal, AnonymousClass0TI[] r17, int i) {
        Object obj;
        Typeface typeface;
        boolean z;
        try {
            obj = A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            AnonymousClass007 r8 = new AnonymousClass007(0);
            int length = r17.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    AnonymousClass0TI r1 = r17[i2];
                    Uri uri = r1.A03;
                    Object obj2 = (ByteBuffer) r8.get(uri);
                    if (obj2 == null) {
                        obj2 = AnonymousClass0YK.A01(context, uri);
                        r8.put(uri, obj2);
                        if (obj2 == null) {
                            break;
                        }
                    }
                    int i3 = r1.A01;
                    int i4 = r1.A02;
                    boolean z2 = r1.A04;
                    try {
                        Method method = A02;
                        Object[] objArr = new Object[5];
                        objArr[0] = obj2;
                        AnonymousClass000.A1L(objArr, i3, 1);
                        objArr[2] = null;
                        AnonymousClass000.A1L(objArr, i4, 3);
                        AnonymousClass000.A1N(objArr, 4, z2);
                        z = AnonymousClass000.A1Y(obj, method, objArr);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    i2++;
                } else {
                    try {
                        Object newInstance = Array.newInstance(A00, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) A03.invoke((Object) null, new Object[]{newInstance});
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, i);
                    }
                }
            }
        }
        return null;
    }

    public static boolean A01() {
        if (A02 != null) {
            return true;
        }
        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A02(android.content.Context r16, android.content.res.Resources r17, X.C09610ce r18, int r19) {
        /*
            r15 = this;
            java.lang.reflect.Constructor r1 = A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            java.lang.Object r5 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r5 = 0
        L_0x000b:
            r4 = 0
            if (r5 == 0) goto L_0x009d
            r0 = r18
            X.0TP[] r8 = r0.A00
            int r7 = r8.length
            r6 = 0
        L_0x0014:
            if (r6 >= r7) goto L_0x0084
            r3 = r8[r6]
            int r0 = r3.A00
            java.io.File r2 = X.AnonymousClass0YK.A00(r16)
            if (r2 == 0) goto L_0x0054
            r1 = r17
            boolean r0 = X.AnonymousClass0YK.A02(r1, r2, r0)     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0029
            goto L_0x0051
        L_0x0029:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004c }
            java.nio.channels.FileChannel r9 = r0.getChannel()     // Catch:{ all -> 0x0042 }
            long r13 = r9.size()     // Catch:{ all -> 0x0042 }
            java.nio.channels.FileChannel$MapMode r10 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0042 }
            r11 = 0
            java.nio.MappedByteBuffer r12 = r9.map(r10, r11, r13)     // Catch:{ all -> 0x0042 }
            r0.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004d
        L_0x0042:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x004c }
        L_0x004b:
            throw r1     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            r12 = 0
        L_0x004d:
            r2.delete()
            goto L_0x0055
        L_0x0051:
            r2.delete()
        L_0x0054:
            r12 = r4
        L_0x0055:
            if (r12 == 0) goto L_0x009d
            int r11 = r3.A01
            int r10 = r3.A02
            boolean r9 = r3.A05
            r3 = 0
            java.lang.reflect.Method r2 = A02     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            r1[r3] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            r0 = 1
            X.AnonymousClass000.A1L(r1, r11, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            r0 = 2
            r1[r0] = r4     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            r0 = 3
            X.AnonymousClass000.A1L(r1, r10, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            r0 = 4
            X.AnonymousClass000.A1N(r1, r0, r9)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            boolean r0 = X.AnonymousClass000.A1Y(r5, r2, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0079 }
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x009d
            int r6 = r6 + 1
            goto L_0x0014
        L_0x007f:
            r0 = move-exception
            r2.delete()
            throw r0
        L_0x0084:
            java.lang.Class r1 = A00     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            r0 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            r2 = 0
            java.lang.reflect.Array.set(r3, r2, r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            java.lang.reflect.Method r1 = A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            r0[r2] = r3     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009c }
            return r0
        L_0x009c:
            return r4
        L_0x009d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Gq.A02(android.content.Context, android.content.res.Resources, X.0ce, int):android.graphics.Typeface");
    }

    public Typeface A04(Context context, Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = AnonymousClass0WA.A00(typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.A04(context, typeface, i, z);
        }
        return typeface2;
    }
}
