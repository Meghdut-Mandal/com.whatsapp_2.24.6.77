package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Gp  reason: invalid class name */
public class AnonymousClass0Gp extends AnonymousClass08A {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[SYNTHETIC, Splitter:B:13:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[SYNTHETIC, Splitter:B:21:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r6, android.os.CancellationSignal r7, X.AnonymousClass0TI[] r8, int r9) {
        /*
            r5 = this;
            r3 = 0
            int r1 = r8.length
            r4 = 0
            r0 = 1
            if (r1 < r0) goto L_0x009c
            X.0TI r0 = r5.A06(r8, r9)
            android.content.ContentResolver r2 = r6.getContentResolver()
            android.net.Uri r1 = r0.A03     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r1, r0, r3)     // Catch:{ IOException -> 0x009b }
            if (r3 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ ErrnoException -> 0x0042 }
            java.lang.String r0 = "/proc/self/fd/"
            r1.append(r0)     // Catch:{ ErrnoException -> 0x0042 }
            int r0 = r3.getFd()     // Catch:{ ErrnoException -> 0x0042 }
            r1.append(r0)     // Catch:{ ErrnoException -> 0x0042 }
            java.lang.String r0 = r1.toString()     // Catch:{ ErrnoException -> 0x0042 }
            java.lang.String r2 = android.system.Os.readlink(r0)     // Catch:{ ErrnoException -> 0x0042 }
            android.system.StructStat r0 = android.system.Os.stat(r2)     // Catch:{ ErrnoException -> 0x0042 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0042 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0042 }
            if (r0 == 0) goto L_0x0042
            java.io.File r1 = new java.io.File     // Catch:{ ErrnoException -> 0x0042 }
            r1.<init>(r2)     // Catch:{ ErrnoException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
            r1 = r4
        L_0x0043:
            if (r1 == 0) goto L_0x0050
            boolean r0 = r1.canRead()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0050
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0083
        L_0x0050:
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x0091 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0091 }
            r2.<init>(r0)     // Catch:{ all -> 0x0091 }
            java.io.File r1 = X.AnonymousClass0YK.A00(r6)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x007f
            boolean r0 = X.AnonymousClass0YK.A03(r1, r2)     // Catch:{ RuntimeException -> 0x007a, all -> 0x0075 }
            if (r0 != 0) goto L_0x0069
            r1.delete()     // Catch:{ all -> 0x0087 }
            goto L_0x007f
        L_0x0069:
            java.lang.String r0 = r1.getPath()     // Catch:{ RuntimeException -> 0x007a, all -> 0x0075 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ RuntimeException -> 0x007a, all -> 0x0075 }
            r1.delete()     // Catch:{ all -> 0x0087 }
            goto L_0x0080
        L_0x0075:
            r0 = move-exception
            r1.delete()     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x007a:
            r1.delete()     // Catch:{ all -> 0x0087 }
            r0 = r4
            goto L_0x0080
        L_0x007f:
            r0 = r4
        L_0x0080:
            r2.close()     // Catch:{ all -> 0x0091 }
        L_0x0083:
            r3.close()     // Catch:{ IOException -> 0x009b }
            return r0
        L_0x0087:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x009b }
        L_0x009a:
            throw r1     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            return r4
        L_0x009c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Gp.A05(android.content.Context, android.os.CancellationSignal, X.0TI[], int):android.graphics.Typeface");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01() {
        /*
            boolean r0 = A04
            if (r0 != 0) goto L_0x0052
            r8 = 1
            A04 = r8
            r9 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r7 = 0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.reflect.Constructor r5 = r6.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.String r3 = "addFontWeightStyle"
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r7] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r2[r8] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r1 = 2
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.reflect.Method r4 = X.AnonymousClass001.A0G(r6, r0, r3, r2, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r8)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r9 = r5
            goto L_0x004a
        L_0x003d:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass000.A0k(r2)
            java.lang.String r0 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r0, r1, r2)
            r0 = r9
            r6 = r9
            r4 = r9
        L_0x004a:
            A01 = r9
            A00 = r6
            A02 = r4
            A03 = r0
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Gp.A01():void");
    }

    public Typeface A02(Context context, Resources resources, C09610ce r15, int i) {
        A01();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            AnonymousClass0TP[] r10 = r15.A00;
            int length = r10.length;
            int i2 = 0;
            while (i2 < length) {
                AnonymousClass0TP r1 = r10[i2];
                File A002 = AnonymousClass0YK.A00(context);
                if (A002 == null) {
                    return null;
                }
                try {
                    if (AnonymousClass0YK.A02(resources, A002, r1.A00)) {
                        String path = A002.getPath();
                        int i3 = r1.A02;
                        boolean z = r1.A05;
                        A01();
                        Method method = A02;
                        Object[] objArr = new Object[3];
                        objArr[0] = path;
                        AnonymousClass000.A1L(objArr, i3, 1);
                        AnonymousClass000.A1N(objArr, 2, z);
                        if (AnonymousClass000.A1Y(newInstance, method, objArr)) {
                            A002.delete();
                            i2++;
                        }
                    }
                    A002.delete();
                    return null;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw AnonymousClass001.A0B(e);
                } catch (RuntimeException unused) {
                    A002.delete();
                    return null;
                } catch (Throwable th) {
                    A002.delete();
                    throw th;
                }
            }
            A01();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw AnonymousClass001.A0B(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw AnonymousClass001.A0B(e3);
        }
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
