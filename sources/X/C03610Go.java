package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Go  reason: invalid class name and case insensitive filesystem */
public class C03610Go extends AnonymousClass0Gp {
    public final Constructor A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Class A05;
    public final Method A06;

    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r15.A01.invoke(r2, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r16, android.os.CancellationSignal r17, X.AnonymousClass0TI[] r18, int r19) {
        /*
            r15 = this;
            r2 = 0
            r9 = r18
            int r8 = r9.length
            r0 = 1
            r14 = 0
            if (r8 < r0) goto L_0x00de
            java.lang.reflect.Method r3 = r15.A02
            if (r3 != 0) goto L_0x0013
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r0 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r0)
        L_0x0013:
            boolean r0 = X.AnonymousClass000.A1V(r3)
            r4 = r19
            r6 = r16
            if (r0 != 0) goto L_0x0057
            X.0TI r4 = r15.A06(r9, r4)
            android.content.ContentResolver r3 = r6.getContentResolver()
            android.net.Uri r1 = r4.A03     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r1, r0, r2)     // Catch:{ IOException -> 0x0056 }
            if (r3 == 0) goto L_0x00de
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r1 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x004c }
            r1.<init>(r0)     // Catch:{ all -> 0x004c }
            int r0 = r4.A02     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r1 = r1.setWeight(r0)     // Catch:{ all -> 0x004c }
            boolean r0 = r4.A04     // Catch:{ all -> 0x004c }
            android.graphics.Typeface$Builder r0 = r1.setItalic(r0)     // Catch:{ all -> 0x004c }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ all -> 0x004c }
            r3.close()     // Catch:{ IOException -> 0x0056 }
            return r0
        L_0x004c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0056 }
        L_0x0055:
            throw r1     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r2
        L_0x0057:
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            r3 = 0
        L_0x005c:
            if (r3 >= r8) goto L_0x0076
            r1 = r18[r3]
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0073
            android.net.Uri r1 = r1.A03
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x0073
            java.nio.MappedByteBuffer r0 = X.AnonymousClass0YK.A01(r6, r1)
            r5.put(r1, r0)
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0076:
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r5)
            java.lang.reflect.Constructor r1 = r15.A00     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0083 }
        L_0x0083:
            if (r2 == 0) goto L_0x00de
            r3 = 0
            r6 = 0
        L_0x0087:
            if (r6 >= r8) goto L_0x00bc
            r1 = r18[r6]
            android.net.Uri r0 = r1.A03
            java.lang.Object r13 = r7.get(r0)
            if (r13 == 0) goto L_0x00b9
            int r12 = r1.A01
            int r11 = r1.A02
            boolean r10 = r1.A04
            r5 = 0
            java.lang.reflect.Method r3 = r15.A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            r1[r5] = r13     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            r0 = 1
            X.AnonymousClass000.A1L(r1, r12, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            r0 = 2
            r1[r0] = r14     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            r0 = 3
            X.AnonymousClass000.A1L(r1, r11, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            r0 = 4
            X.AnonymousClass000.A1L(r1, r10, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            boolean r0 = X.AnonymousClass000.A1Y(r2, r3, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b5 }
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r0 == 0) goto L_0x00d6
            r3 = 1
        L_0x00b9:
            int r6 = r6 + 1
            goto L_0x0087
        L_0x00bc:
            if (r3 == 0) goto L_0x00d6
            r0 = 0
            java.lang.reflect.Method r1 = r15.A04     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c8 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c8 }
            boolean r0 = X.AnonymousClass000.A1Y(r2, r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c8 }
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            if (r0 == 0) goto L_0x00de
            android.graphics.Typeface r0 = r15.A07(r2)
            if (r0 == 0) goto L_0x00de
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r4)
            return r0
        L_0x00d6:
            java.lang.reflect.Method r1 = r15.A01     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00de }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00de }
            r1.invoke(r2, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00de }
        L_0x00de:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03610Go.A05(android.content.Context, android.os.CancellationSignal, X.0TI[], int):android.graphics.Typeface");
    }

    public Typeface A07(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A05, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A06.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A08(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface A02(Context context, Resources resources, C09610ce r17, int i) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A02;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        C09610ce r3 = r17;
        if (!AnonymousClass000.A1V(method)) {
            return super.A02(context, resources, r3, i);
        }
        try {
            obj = this.A00.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            AnonymousClass0TP[] r5 = r3.A00;
            int length = r5.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    AnonymousClass0TP r0 = r5[i2];
                    Object obj2 = r0.A03;
                    int i3 = r0.A01;
                    int i4 = r0.A02;
                    boolean z3 = r0.A05;
                    Object fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(r0.A04);
                    try {
                        Object[] objArr = new Object[8];
                        objArr[0] = context.getAssets();
                        objArr[1] = obj2;
                        AnonymousClass000.A1L(objArr, 0, 2);
                        AnonymousClass000.A1N(objArr, 3, false);
                        AnonymousClass000.A1L(objArr, i3, 4);
                        AnonymousClass000.A1L(objArr, i4, 5);
                        AnonymousClass000.A1L(objArr, z3 ? 1 : 0, 6);
                        objArr[7] = fromFontVariationSettings;
                        z2 = AnonymousClass000.A1Y(obj, method, objArr);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            this.A01.invoke(obj, new Object[0]);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    } else {
                        i2++;
                    }
                } else {
                    try {
                        z = AnonymousClass000.A1Y(obj, this.A04, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z = false;
                    }
                    if (z) {
                        return A07(obj);
                    }
                }
            }
        }
        return null;
    }

    public Typeface A03(Context context, Resources resources, String str, int i, int i2) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A02;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!AnonymousClass000.A1V(method)) {
            return super.A03(context, resources, str, i, i2);
        }
        try {
            obj = this.A00.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            Object[] objArr = new Object[8];
            objArr[0] = context.getAssets();
            objArr[1] = str;
            AnonymousClass000.A1L(objArr, 0, 2);
            AnonymousClass000.A1N(objArr, 3, false);
            AnonymousClass000.A1L(objArr, 0, 4);
            AnonymousClass000.A1L(objArr, -1, 5);
            AnonymousClass000.A1L(objArr, -1, 6);
            objArr[7] = null;
            z = AnonymousClass000.A1Y(obj, method, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            z = false;
        }
        if (!z) {
            try {
                this.A01.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused3) {
            }
            return null;
        }
        try {
            z2 = AnonymousClass000.A1Y(obj, this.A04, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        return A07(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r0 = X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r0 = X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A04(android.content.Context r10, android.graphics.Typeface r11, int r12, boolean r13) {
        /*
            r9 = this;
            java.lang.reflect.Field r1 = X.C06020Rz.A03     // Catch:{ RuntimeException -> 0x0073 }
            boolean r0 = X.AnonymousClass000.A1V(r1)
            if (r0 != 0) goto L_0x000a
            r2 = 0
            goto L_0x0074
        L_0x000a:
            int r6 = r12 << 1
            r6 = r6 | r13
            java.lang.Object r8 = X.C06020Rz.A01     // Catch:{ RuntimeException -> 0x0073 }
            monitor-enter(r8)     // Catch:{ RuntimeException -> 0x0073 }
            long r0 = r1.getLong(r11)     // Catch:{ IllegalAccessException -> 0x0064 }
            X.00i r3 = X.C06020Rz.A00     // Catch:{ all -> 0x0070 }
            java.lang.Object r5 = r3.A05(r0)     // Catch:{ all -> 0x0070 }
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0028
            r2 = 4
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch:{ all -> 0x0070 }
            r5.<init>(r2)     // Catch:{ all -> 0x0070 }
            r3.A0A(r0, r5)     // Catch:{ all -> 0x0070 }
            goto L_0x0032
        L_0x0028:
            java.lang.Object r2 = r5.get(r6)     // Catch:{ all -> 0x0070 }
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0032
        L_0x0030:
            monitor-exit(r8)     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0032:
            java.lang.reflect.Method r7 = X.C06020Rz.A04     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            r4 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            r3 = 0
            X.AnonymousClass000.A1M(r2, r3, r0)     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            r0 = 1
            X.AnonymousClass000.A1L(r2, r12, r0)     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            r0 = 2
            X.AnonymousClass000.A1N(r2, r0, r13)     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            java.lang.Object r2 = r7.invoke(r4, r2)     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ IllegalAccessException -> 0x006a, InvocationTargetException -> 0x005e }
            java.lang.reflect.Constructor r1 = X.C06020Rz.A02     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0059 }
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0059 }
            r0[r3] = r2     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0059 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0059 }
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r2 = r4
        L_0x005a:
            r5.put(r6, r2)     // Catch:{ all -> 0x0070 }
            goto L_0x0030
        L_0x005e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x006f
        L_0x0064:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x0070 }
        L_0x006f:
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ RuntimeException -> 0x0073 }
        L_0x0073:
            r2 = 0
        L_0x0074:
            if (r2 != 0) goto L_0x007a
            android.graphics.Typeface r2 = super.A04(r10, r11, r12, r13)
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03610Go.A04(android.content.Context, android.graphics.Typeface, int, boolean):android.graphics.Typeface");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C03610Go() {
        /*
            r9 = this;
            r9.<init>()
            r3 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r7 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.reflect.Constructor r6 = r7.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 8
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r1 = 0
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            r2[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r1 = 1
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 2
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 3
            r2[r0] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 4
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 5
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 6
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 7
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r4 = android.graphics.fonts.FontVariationAxis[].class
            r2[r0] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.String r0 = "addFontFromAssetManager"
            java.lang.reflect.Method r5 = r7.getMethod(r0, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 5
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r1 = 0
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            r2[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 1
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 2
            r2[r0] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 3
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 4
            r2[r0] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.String r0 = "addFontFromBuffer"
            java.lang.reflect.Method r4 = r7.getMethod(r0, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.String r0 = "freeze"
            java.lang.reflect.Method r2 = r7.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.String r0 = "abortCreation"
            java.lang.reflect.Method r1 = r7.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.reflect.Method r0 = r9.A08(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            r3 = r7
            goto L_0x008b
        L_0x006e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to collect necessary methods for class "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0k(r2)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r0, r1, r2)
            r0 = r3
            r6 = r3
            r5 = r3
            r4 = r3
            r2 = r3
            r1 = r3
        L_0x008b:
            r9.A05 = r3
            r9.A00 = r6
            r9.A02 = r5
            r9.A03 = r4
            r9.A04 = r2
            r9.A01 = r1
            r9.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03610Go.<init>():void");
    }
}
