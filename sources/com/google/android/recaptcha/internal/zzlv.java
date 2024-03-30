package com.google.android.recaptcha.internal;

import X.C165567td;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class zzlv {
    public static final long zza = ((long) zzz(byte[].class));
    public static final boolean zzb;
    public static final Unsafe zzc;
    public static final Class zzd = Memory.class;
    public static final boolean zze;
    public static final zzlu zzf;
    public static final boolean zzg;
    public static final boolean zzh;

    public static boolean zzv(Class cls) {
        try {
            return C165567td.A1b(zzd, cls);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0109  */
    static {
        /*
            java.lang.Class<double[]> r14 = double[].class
            java.lang.Class<float[]> r13 = float[].class
            java.lang.Class<long[]> r12 = long[].class
            java.lang.Class<int[]> r11 = int[].class
            java.lang.Class<boolean[]> r10 = boolean[].class
            sun.misc.Unsafe r3 = zzg()
            zzc = r3
            java.lang.Class<libcore.io.Memory> r0 = libcore.io.Memory.class
            zzd = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r2 = zzv(r0)
            zze = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = zzv(r0)
            r0 = 0
            if (r3 == 0) goto L_0x002c
            if (r2 == 0) goto L_0x003a
            com.google.android.recaptcha.internal.zzlt r0 = new com.google.android.recaptcha.internal.zzlt
            r0.<init>(r3)
        L_0x002c:
            zzf = r0
            java.lang.String r6 = "getLong"
            java.lang.String r5 = "objectFieldOffset"
            r4 = 2
            r3 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0068
            sun.misc.Unsafe r0 = r0.zza
            goto L_0x0042
        L_0x003a:
            if (r1 == 0) goto L_0x002c
            com.google.android.recaptcha.internal.zzls r0 = new com.google.android.recaptcha.internal.zzls
            r0.<init>(r3)
            goto L_0x002c
        L_0x0042:
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x0064 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r9] = r0     // Catch:{ all -> 0x0064 }
            r2.getMethod(r5, r1)     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x0064 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1[r9] = r0     // Catch:{ all -> 0x0064 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0064 }
            r1[r3] = r0     // Catch:{ all -> 0x0064 }
            r2.getMethod(r6, r1)     // Catch:{ all -> 0x0064 }
            java.lang.reflect.Field r0 = zzB()     // Catch:{ all -> 0x0064 }
            r1 = 1
            if (r0 != 0) goto L_0x0069
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            X.C165587tf.A0p(com.google.android.recaptcha.internal.zzlv.class).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x0068:
            r1 = 0
        L_0x0069:
            zzg = r1
            com.google.android.recaptcha.internal.zzlu r0 = zzf
            if (r0 == 0) goto L_0x00be
            sun.misc.Unsafe r0 = r0.zza
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x00ba }
            X.C165567td.A1I(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "getInt"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ba }
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r0[r9] = r8     // Catch:{ all -> 0x00ba }
            java.lang.Class r0 = X.C165597tg.A0b(r7, r1, r0, r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "putInt"
            r5 = 3
            java.lang.Class[] r1 = X.C165597tg.A1Y(r0, r5)     // Catch:{ all -> 0x00ba }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ba }
            r1[r4] = r0     // Catch:{ all -> 0x00ba }
            r7.getMethod(r2, r1)     // Catch:{ all -> 0x00ba }
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ba }
            r0[r9] = r8     // Catch:{ all -> 0x00ba }
            java.lang.Class r2 = X.C165597tg.A0b(r7, r6, r0, r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r2, r5)     // Catch:{ all -> 0x00ba }
            r0[r4] = r2     // Catch:{ all -> 0x00ba }
            r7.getMethod(r1, r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r2, r4)     // Catch:{ all -> 0x00ba }
            r7.getMethod(r1, r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r2, r5)     // Catch:{ all -> 0x00ba }
            r0[r4] = r8     // Catch:{ all -> 0x00ba }
            r7.getMethod(r1, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            X.C165587tf.A0p(com.google.android.recaptcha.internal.zzlv.class).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x00be:
            r0 = 0
            goto L_0x00c1
        L_0x00c0:
            r0 = 1
        L_0x00c1:
            zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzz(r0)
            long r0 = (long) r0
            zza = r0
            zzz(r10)
            zzA(r10)
            zzz(r11)
            zzA(r11)
            zzz(r12)
            zzA(r12)
            zzz(r13)
            zzA(r13)
            zzz(r14)
            zzA(r14)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzz(r0)
            zzA(r0)
            java.lang.reflect.Field r1 = zzB()
            if (r1 == 0) goto L_0x0101
            com.google.android.recaptcha.internal.zzlu r0 = zzf
            if (r0 == 0) goto L_0x0101
            sun.misc.Unsafe r0 = r0.zza
            r0.objectFieldOffset(r1)
        L_0x0101:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x010a
            r3 = 0
        L_0x010a:
            zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzlv.<clinit>():void");
    }

    public static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field zzB() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        try {
            field = cls.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = cls.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field == null || field.getType() != Long.TYPE) {
                return null;
            }
        }
        return field;
    }

    public static void zzD(Object obj, long j, byte b) {
        zzlu zzlu = zzf;
        long j2 = -4 & j;
        int i = zzlu.zza.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zzlu.zza.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void zzE(Object obj, long j, byte b) {
        zzlu zzlu = zzf;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzlu.zza.putInt(obj, j2, ((255 & b) << i) | (zzlu.zza.getInt(obj, j2) & (~(255 << i))));
    }

    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    public static int zzc(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    public static long zzd(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzlr());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzm(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    public static void zzn(byte[] bArr, long j, byte b) {
        zzf.zzd(bArr, zza + j, b);
    }

    public static void zzo(Object obj, long j, double d) {
        zzf.zze(obj, j, d);
    }

    public static void zzp(Object obj, long j, float f) {
        zzf.zzf(obj, j, f);
    }

    public static void zzq(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    public static void zzr(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    public static void zzs(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static boolean zzw(Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    public static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
