package X;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.10I  reason: invalid class name */
public abstract class AnonymousClass10I extends AnonymousClass10G {
    public String A00;
    public String[] A01;
    public AnonymousClass10L A02;
    public final Context A03;
    public final Map A04 = new HashMap();

    public C21653ATt A05(byte b) {
        AnonymousClass10J r1 = (AnonymousClass10J) this;
        return new AnonymousClass894(r1, r1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass10I(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            java.lang.String r0 = r0.dataDir
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r1 = 1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.<init>(r2, r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.A04 = r0
            r3.A03 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10I.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|(4:(1:15)(2:16|(1:18))|19|(1:21)|22)(2:23|24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r7.setWritable(true) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r9 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r2 = new X.AnonymousClass10L(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = new X.AnonymousClass10L(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2.A01 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r2.close();
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r7.setWritable(false) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("error removing ");
        r1.append(r7.getCanonicalPath());
        r1.append(" write permission");
        android.util.Log.w("SysUtil", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r7.setWritable(false) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("error removing ");
        r1.append(r7.getCanonicalPath());
        r1.append(" write permission");
        android.util.Log.w("SysUtil", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass10L A00(java.io.File r7, java.io.File r8, boolean r9) {
        /*
            java.lang.String r4 = " write permission"
            java.lang.String r5 = "error removing "
            java.lang.String r3 = "SysUtil"
            r2 = 1
            r6 = 0
            if (r9 == 0) goto L_0x0010
            X.10L r1 = new X.10L     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x001e }
            r1.<init>(r8, r6)     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x001e }
            return r1
        L_0x0010:
            X.10L r1 = new X.10L     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x001e }
            r1.<init>(r8, r2)     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x001e }
            java.nio.channels.FileLock r0 = r1.A01     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x001e }
            if (r0 != 0) goto L_0x001d
            r1.close()     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x001e }
            r1 = 0
        L_0x001d:
            return r1
        L_0x001e:
            r2 = move-exception
            throw r2
        L_0x0020:
            r1 = move-exception
            boolean r0 = r7.setWritable(r2)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005d
            if (r9 == 0) goto L_0x002f
            X.10L r2 = new X.10L     // Catch:{ all -> 0x005e }
            r2.<init>(r8, r6)     // Catch:{ all -> 0x005e }
            goto L_0x003d
        L_0x002f:
            r0 = 1
            X.10L r2 = new X.10L     // Catch:{ all -> 0x005e }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x005e }
            java.nio.channels.FileLock r0 = r2.A01     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x003d
            r2.close()     // Catch:{ all -> 0x005e }
            r2 = 0
        L_0x003d:
            boolean r0 = r7.setWritable(r6)
            if (r0 != 0) goto L_0x005c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r7.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
        L_0x005c:
            return r2
        L_0x005d:
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r2 = move-exception
            boolean r0 = r7.setWritable(r6)
            if (r0 != 0) goto L_0x007e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r7.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
        L_0x007e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10I.A00(java.io.File, java.io.File, boolean):X.10L");
    }

    public static void A01(File file, byte b) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
            return;
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c1, code lost:
        if ((r43 & 2) == 0) goto L_0x0482;
     */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0532 A[SYNTHETIC, Splitter:B:223:0x0532] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db A[Catch:{ all -> 0x0110, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3 A[Catch:{ all -> 0x0110, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0259 A[Catch:{ all -> 0x0461, Exception -> 0x0242, all -> 0x0549 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r43) {
        /*
            r42 = this;
            r32 = r42
            r0 = r32
            java.io.File r6 = r0.A00
            boolean r0 = r6.mkdirs()
            if (r0 != 0) goto L_0x0029
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "cannot mkdir: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0029:
            boolean r29 = r6.canWrite()
            java.lang.String r5 = "error removing "
            java.lang.String r28 = "releasing dso store lock for "
            java.lang.String r26 = " (syncer thread started)"
            java.lang.String r27 = "not releasing dso store lock for "
            r7 = 1
            r31 = 0
            java.lang.String r4 = " write permission"
            r3 = 0
            java.lang.String r2 = "fb-UnpackingSoSource"
            if (r29 != 0) goto L_0x0060
            boolean r0 = r6.setWritable(r7)     // Catch:{ all -> 0x0573 }
            if (r0 != 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0573 }
            r1.<init>()     // Catch:{ all -> 0x0573 }
            java.lang.String r0 = "error adding "
            r1.append(r0)     // Catch:{ all -> 0x0573 }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x0573 }
            r1.append(r0)     // Catch:{ all -> 0x0573 }
            r1.append(r4)     // Catch:{ all -> 0x0573 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0573 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0573 }
        L_0x0060:
            java.lang.String r30 = "dso_lock"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0573 }
            r0 = r30
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0573 }
            X.10L r39 = A00(r6, r1, r7)     // Catch:{ all -> 0x0573 }
            r0 = r32
            X.10L r0 = r0.A02     // Catch:{ all -> 0x0575 }
            if (r0 != 0) goto L_0x0082
            java.lang.String r1 = "dso_instance_lock"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0575 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0575 }
            X.10L r1 = A00(r6, r0, r3)     // Catch:{ all -> 0x0575 }
            r0 = r32
            r0.A02 = r1     // Catch:{ all -> 0x0575 }
        L_0x0082:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0575 }
            r1.<init>()     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = "locked dso store "
            r1.append(r0)     // Catch:{ all -> 0x0575 }
            r1.append(r6)     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0575 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0575 }
            r0 = r32
            boolean r0 = r0 instanceof X.AnonymousClass10J     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0115
            r10 = r32
            X.10J r10 = (X.AnonymousClass10J) r10     // Catch:{ all -> 0x0575 }
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x0575 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x0575 }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0575 }
            r9 = 2
            r8.writeByte(r9)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0110 }
            r8.writeString(r0)     // Catch:{ all -> 0x0110 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0110 }
            r8.writeLong(r0)     // Catch:{ all -> 0x0110 }
            android.content.Context r10 = r10.A03     // Catch:{ all -> 0x0110 }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = r10.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            r8.writeInt(r0)     // Catch:{ all -> 0x0110 }
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r0.nativeLibraryDir     // Catch:{ all -> 0x0110 }
            if (r1 != 0) goto L_0x00e3
            r8.writeByte(r7)     // Catch:{ all -> 0x0110 }
            byte[] r25 = r8.marshall()     // Catch:{ all -> 0x0110 }
            goto L_0x014b
        L_0x00e3:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0110 }
            r0.<init>(r1)     // Catch:{ all -> 0x0110 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x0110 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x00fa
            r8.writeByte(r7)     // Catch:{ all -> 0x0110 }
            byte[] r25 = r8.marshall()     // Catch:{ all -> 0x0110 }
            goto L_0x014b
        L_0x00fa:
            r8.writeByte(r9)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0110 }
            r8.writeString(r0)     // Catch:{ all -> 0x0110 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0110 }
            r8.writeLong(r0)     // Catch:{ all -> 0x0110 }
            byte[] r25 = r8.marshall()     // Catch:{ all -> 0x0110 }
            goto L_0x014b
        L_0x0110:
            r0 = move-exception
            r8.recycle()     // Catch:{ all -> 0x0575 }
            throw r0     // Catch:{ all -> 0x0575 }
        L_0x0115:
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0575 }
            r0 = r32
            X.ATt r11 = r0.A05(r7)     // Catch:{ all -> 0x0575 }
            X.9Cy r0 = r11.A00()     // Catch:{ all -> 0x0569 }
            X.9Gp[] r10 = r0.A00     // Catch:{ all -> 0x0569 }
            r9.writeByte(r7)     // Catch:{ all -> 0x0569 }
            int r8 = r10.length     // Catch:{ all -> 0x0569 }
            r9.writeInt(r8)     // Catch:{ all -> 0x0569 }
            r1 = 0
        L_0x012d:
            if (r1 >= r8) goto L_0x0140
            r0 = r10[r1]     // Catch:{ all -> 0x0569 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0569 }
            r9.writeString(r0)     // Catch:{ all -> 0x0569 }
            r0 = r10[r1]     // Catch:{ all -> 0x0569 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0569 }
            r9.writeString(r0)     // Catch:{ all -> 0x0569 }
            int r1 = r1 + 1
            goto L_0x012d
        L_0x0140:
            r11.close()     // Catch:{ all -> 0x0575 }
            byte[] r25 = r9.marshall()     // Catch:{ all -> 0x0575 }
            r9.recycle()     // Catch:{ all -> 0x0575 }
            goto L_0x014e
        L_0x014b:
            r8.recycle()     // Catch:{ all -> 0x0575 }
        L_0x014e:
            java.lang.String r24 = "dso_state"
            java.io.File r23 = new java.io.File     // Catch:{ all -> 0x0575 }
            r1 = r24
            r0 = r23
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0575 }
            java.lang.String r10 = "rw"
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0575 }
            r9.<init>(r0, r10)     // Catch:{ all -> 0x0575 }
            byte r8 = r9.readByte()     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            if (r8 == r7) goto L_0x0180
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            r1.<init>()     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            java.lang.String r0 = "dso store "
            r1.append(r0)     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            r1.append(r6)     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            java.lang.String r0 = " regeneration interrupted: wiping clean"
            r1.append(r0)     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
            android.util.Log.v(r2, r0)     // Catch:{ EOFException -> 0x017f, all -> 0x0564 }
        L_0x017f:
            r8 = 0
        L_0x0180:
            r9.close()     // Catch:{ all -> 0x0575 }
            java.lang.String r15 = "dso_deps"
            java.io.File r22 = new java.io.File     // Catch:{ all -> 0x0575 }
            r1 = r22
            r1.<init>(r6, r15)     // Catch:{ all -> 0x0575 }
            r21 = 0
            java.io.RandomAccessFile r20 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0575 }
            r1 = r20
            r0 = r22
            r1.<init>(r0, r10)     // Catch:{ all -> 0x0575 }
            long r0 = r20.length()     // Catch:{ all -> 0x055f }
            int r9 = (int) r0     // Catch:{ all -> 0x055f }
            byte[] r1 = new byte[r9]     // Catch:{ all -> 0x055f }
            r0 = r20
            int r0 = r0.read(r1)     // Catch:{ all -> 0x055f }
            if (r0 == r9) goto L_0x01ac
            java.lang.String r0 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x055f }
            r8 = 0
        L_0x01ac:
            r0 = r25
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x055f }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x055f }
            r8 = 0
            goto L_0x01c3
        L_0x01bd:
            if (r8 == 0) goto L_0x01c3
            r0 = r43 & 2
            if (r0 == 0) goto L_0x0482
        L_0x01c3:
            java.lang.String r0 = "so store dirty: regenerating"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x055f }
            r0 = r23
            A01(r0, r3)     // Catch:{ all -> 0x055f }
            r0 = r32
            X.ATt r19 = r0.A05(r8)     // Catch:{ all -> 0x055f }
            X.9Cy r21 = r19.A00()     // Catch:{ all -> 0x0555 }
            X.ATs r18 = r19.A01()     // Catch:{ all -> 0x0555 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0553 }
            r1.<init>()     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = "regenerating DSO store "
            r1.append(r0)     // Catch:{ all -> 0x0553 }
            java.lang.Class r0 = r32.getClass()     // Catch:{ all -> 0x0553 }
            java.lang.String r17 = r0.getName()     // Catch:{ all -> 0x0553 }
            r0 = r17
            r1.append(r0)     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0553 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0553 }
            java.lang.String r13 = "dso_manifest"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0553 }
            r1.<init>(r6, r13)     // Catch:{ all -> 0x0553 }
            java.io.RandomAccessFile r16 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0553 }
            r0 = r16
            r0.<init>(r1, r10)     // Catch:{ all -> 0x0553 }
            if (r8 != r7) goto L_0x0248
            byte r0 = r16.readByte()     // Catch:{ Exception -> 0x0242 }
            if (r0 != r7) goto L_0x0232
            int r12 = r16.readInt()     // Catch:{ Exception -> 0x0242 }
            if (r12 < 0) goto L_0x023a
            X.9Gp[] r11 = new X.C192339Gp[r12]     // Catch:{ Exception -> 0x0242 }
            r9 = 0
        L_0x0218:
            if (r9 >= r12) goto L_0x022c
            java.lang.String r8 = r16.readUTF()     // Catch:{ Exception -> 0x0242 }
            java.lang.String r1 = r16.readUTF()     // Catch:{ Exception -> 0x0242 }
            X.9Gp r0 = new X.9Gp     // Catch:{ Exception -> 0x0242 }
            r0.<init>(r8, r1)     // Catch:{ Exception -> 0x0242 }
            r11[r9] = r0     // Catch:{ Exception -> 0x0242 }
            int r9 = r9 + 1
            goto L_0x0218
        L_0x022c:
            X.9Cy r12 = new X.9Cy     // Catch:{ Exception -> 0x0242 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x0242 }
            goto L_0x024f
        L_0x0232:
            java.lang.String r0 = "wrong dso manifest version"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0242 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0242 }
            goto L_0x0241
        L_0x023a:
            java.lang.String r0 = "illegal number of shared libraries"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0242 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0242 }
        L_0x0241:
            throw r1     // Catch:{ Exception -> 0x0242 }
        L_0x0242:
            r1 = move-exception
            java.lang.String r0 = "error reading existing DSO manifest"
            android.util.Log.i(r2, r0, r1)     // Catch:{ all -> 0x0549 }
        L_0x0248:
            X.9Gp[] r0 = new X.C192339Gp[r3]     // Catch:{ all -> 0x0549 }
            X.9Cy r12 = new X.9Cy     // Catch:{ all -> 0x0549 }
            r12.<init>(r0)     // Catch:{ all -> 0x0549 }
        L_0x024f:
            r0 = r21
            X.9Gp[] r11 = r0.A00     // Catch:{ all -> 0x0549 }
            java.lang.String[] r9 = r6.list()     // Catch:{ all -> 0x0549 }
            if (r9 == 0) goto L_0x0532
            r8 = 0
        L_0x025a:
            int r0 = r9.length     // Catch:{ all -> 0x0549 }
            if (r8 >= r0) goto L_0x02b3
            r0 = r9[r8]     // Catch:{ all -> 0x0549 }
            r1 = r24
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x02b0
            r1 = r30
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x02b0
            java.lang.String r1 = "dso_instance_lock"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x02b0
            boolean r1 = r0.equals(r15)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x02b0
            boolean r1 = r0.equals(r13)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x02b0
            r1 = 0
        L_0x0284:
            int r14 = r11.length     // Catch:{ all -> 0x0549 }
            if (r1 >= r14) goto L_0x0294
            r14 = r11[r1]     // Catch:{ all -> 0x0549 }
            java.lang.String r14 = r14.A01     // Catch:{ all -> 0x0549 }
            boolean r14 = r14.equals(r0)     // Catch:{ all -> 0x0549 }
            if (r14 != 0) goto L_0x02b0
            int r1 = r1 + 1
            goto L_0x0284
        L_0x0294:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0549 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0549 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0549 }
            r0.<init>()     // Catch:{ all -> 0x0549 }
            java.lang.String r14 = "deleting unaccounted-for file "
            r0.append(r14)     // Catch:{ all -> 0x0549 }
            r0.append(r1)     // Catch:{ all -> 0x0549 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0549 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0549 }
            X.C131706Qe.A00(r1)     // Catch:{ all -> 0x0549 }
        L_0x02b0:
            int r8 = r8 + 1
            goto L_0x025a
        L_0x02b3:
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0549 }
            r30 = r0
        L_0x02ba:
            boolean r0 = r18.A01()     // Catch:{ all -> 0x0549 }
            if (r0 == 0) goto L_0x0466
            X.ATq r11 = r18.A00()     // Catch:{ all -> 0x0549 }
            r14 = 1
            r8 = 0
        L_0x02c6:
            X.9Gp[] r1 = r12.A00     // Catch:{ all -> 0x045c }
            int r0 = r1.length     // Catch:{ all -> 0x045c }
            if (r8 >= r0) goto L_0x02ea
            X.9Gp r9 = r11.A00     // Catch:{ all -> 0x045c }
            java.lang.String r13 = r9.A01     // Catch:{ all -> 0x045c }
            r0 = r1[r8]     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x045c }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x045c }
            if (r0 == 0) goto L_0x02e6
            r0 = r1[r8]     // Catch:{ all -> 0x045c }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x045c }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x045c }
            if (r0 == 0) goto L_0x02e6
            goto L_0x02e9
        L_0x02e6:
            int r8 = r8 + 1
            goto L_0x02c6
        L_0x02e9:
            r14 = 0
        L_0x02ea:
            X.9Gp r0 = r11.A00     // Catch:{ all -> 0x045c }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x045c }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x045c }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x045c }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x045c }
            if (r0 == 0) goto L_0x02fb
            if (r14 == 0) goto L_0x03e1
        L_0x02fb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x045c }
            r8.<init>()     // Catch:{ all -> 0x045c }
            java.lang.String r0 = "extracting DSO "
            r8.append(r0)     // Catch:{ all -> 0x045c }
            r8.append(r1)     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x045c }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x045c }
            boolean r0 = r6.setWritable(r7)     // Catch:{ all -> 0x043b }
            if (r0 == 0) goto L_0x0424
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x043b }
            r9.<init>(r6, r1)     // Catch:{ all -> 0x043b }
            r8 = 0
            boolean r0 = r9.exists()     // Catch:{ IOException -> 0x03fd }
            if (r0 == 0) goto L_0x033b
            boolean r0 = r9.setWritable(r7)     // Catch:{ IOException -> 0x03fd }
            if (r0 != 0) goto L_0x033b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fd }
            r1.<init>()     // Catch:{ IOException -> 0x03fd }
            java.lang.String r0 = "error adding write permission to: "
            r1.append(r0)     // Catch:{ IOException -> 0x03fd }
            r1.append(r9)     // Catch:{ IOException -> 0x03fd }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x03fd }
            android.util.Log.w(r2, r0)     // Catch:{ IOException -> 0x03fd }
        L_0x033b:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0341 }
            r1.<init>(r9, r10)     // Catch:{ IOException -> 0x0341 }
            goto L_0x0363
        L_0x0341:
            r1 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fd }
            r13.<init>()     // Catch:{ IOException -> 0x03fd }
            java.lang.String r0 = "error overwriting "
            r13.append(r0)     // Catch:{ IOException -> 0x03fd }
            r13.append(r9)     // Catch:{ IOException -> 0x03fd }
            java.lang.String r0 = " trying to delete and start over"
            r13.append(r0)     // Catch:{ IOException -> 0x03fd }
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x03fd }
            android.util.Log.w(r2, r0, r1)     // Catch:{ IOException -> 0x03fd }
            X.C131706Qe.A00(r9)     // Catch:{ IOException -> 0x03fd }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x03fd }
            r1.<init>(r9, r10)     // Catch:{ IOException -> 0x03fd }
        L_0x0363:
            r8 = r1
            java.io.InputStream r0 = r11.A01     // Catch:{ IOException -> 0x03fd }
            r24 = r0
            int r0 = r24.available()     // Catch:{ IOException -> 0x03fd }
            if (r0 <= r7) goto L_0x0376
            java.io.FileDescriptor r13 = r1.getFD()     // Catch:{ IOException -> 0x03fd }
            long r0 = (long) r0     // Catch:{ IOException -> 0x03fd }
            com.facebook.soloader.SysUtil$LollipopSysdeps.fallocateIfSupported(r13, r0)     // Catch:{ IOException -> 0x03fd }
        L_0x0376:
            r14 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
        L_0x037a:
            r13 = 32768(0x8000, float:4.5918E-41)
            int r0 = r14 - r1
            int r15 = java.lang.Math.min(r13, r0)     // Catch:{ IOException -> 0x03fd }
            r13 = r30
            r0 = r24
            int r13 = r0.read(r13, r3, r15)     // Catch:{ IOException -> 0x03fd }
            r0 = -1
            if (r13 == r0) goto L_0x0397
            r0 = r30
            r8.write(r0, r3, r13)     // Catch:{ IOException -> 0x03fd }
            int r1 = r1 + r13
            if (r1 >= r14) goto L_0x0397
            goto L_0x037a
        L_0x0397:
            long r0 = r8.getFilePointer()     // Catch:{ IOException -> 0x03fd }
            r8.setLength(r0)     // Catch:{ IOException -> 0x03fd }
            boolean r0 = r9.setExecutable(r7, r3)     // Catch:{ IOException -> 0x03fd }
            if (r0 == 0) goto L_0x03e6
            boolean r0 = r9.setWritable(r3)     // Catch:{ all -> 0x043b }
            if (r0 != 0) goto L_0x03bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x043b }
            r0.<init>()     // Catch:{ all -> 0x043b }
            r0.append(r5)     // Catch:{ all -> 0x043b }
            r0.append(r9)     // Catch:{ all -> 0x043b }
            r0.append(r4)     // Catch:{ all -> 0x043b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x043b }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x043b }
        L_0x03bf:
            r8.close()     // Catch:{ all -> 0x043b }
            boolean r0 = r6.setWritable(r3)     // Catch:{ all -> 0x045c }
            if (r0 != 0) goto L_0x03e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x045c }
            r1.<init>()     // Catch:{ all -> 0x045c }
            r1.append(r5)     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x045c }
            r1.append(r0)     // Catch:{ all -> 0x045c }
            r1.append(r4)     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x045c }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x045c }
        L_0x03e1:
            r11.close()     // Catch:{ all -> 0x0549 }
            goto L_0x02ba
        L_0x03e6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fd }
            r1.<init>()     // Catch:{ IOException -> 0x03fd }
            java.lang.String r0 = "cannot make file executable: "
            r1.append(r0)     // Catch:{ IOException -> 0x03fd }
            r1.append(r9)     // Catch:{ IOException -> 0x03fd }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03fd }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x03fd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03fd }
            throw r0     // Catch:{ IOException -> 0x03fd }
        L_0x03fd:
            r0 = move-exception
            X.C131706Qe.A00(r9)     // Catch:{ all -> 0x0402 }
            throw r0     // Catch:{ all -> 0x0402 }
        L_0x0402:
            r1 = move-exception
            boolean r0 = r9.setWritable(r3)     // Catch:{ all -> 0x043b }
            if (r0 != 0) goto L_0x041e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x043b }
            r0.<init>()     // Catch:{ all -> 0x043b }
            r0.append(r5)     // Catch:{ all -> 0x043b }
            r0.append(r9)     // Catch:{ all -> 0x043b }
            r0.append(r4)     // Catch:{ all -> 0x043b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x043b }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x043b }
        L_0x041e:
            if (r8 == 0) goto L_0x0423
            r8.close()     // Catch:{ all -> 0x043b }
        L_0x0423:
            throw r1     // Catch:{ all -> 0x043b }
        L_0x0424:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x043b }
            r1.<init>()     // Catch:{ all -> 0x043b }
            java.lang.String r0 = "cannot make directory writable for us: "
            r1.append(r0)     // Catch:{ all -> 0x043b }
            r1.append(r6)     // Catch:{ all -> 0x043b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x043b }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x043b }
            r0.<init>(r1)     // Catch:{ all -> 0x043b }
            throw r0     // Catch:{ all -> 0x043b }
        L_0x043b:
            r7 = move-exception
            boolean r0 = r6.setWritable(r3)     // Catch:{ all -> 0x045c }
            if (r0 != 0) goto L_0x045b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x045c }
            r1.<init>()     // Catch:{ all -> 0x045c }
            r1.append(r5)     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x045c }
            r1.append(r0)     // Catch:{ all -> 0x045c }
            r1.append(r4)     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x045c }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x045c }
        L_0x045b:
            throw r7     // Catch:{ all -> 0x045c }
        L_0x045c:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0461 }
            goto L_0x0465
        L_0x0461:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0549 }
        L_0x0465:
            throw r1     // Catch:{ all -> 0x0549 }
        L_0x0466:
            r16.close()     // Catch:{ all -> 0x0553 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0553 }
            r1.<init>()     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = "Finished regenerating DSO store "
            r1.append(r0)     // Catch:{ all -> 0x0553 }
            r0 = r17
            r1.append(r0)     // Catch:{ all -> 0x0553 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0553 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0553 }
            r19.close()     // Catch:{ all -> 0x055f }
        L_0x0482:
            r20.close()     // Catch:{ all -> 0x0575 }
            if (r21 != 0) goto L_0x049c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0575 }
            r1.<init>()     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = "dso store is up-to-date: "
            r1.append(r0)     // Catch:{ all -> 0x0575 }
            r1.append(r6)     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0575 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x0575 }
            goto L_0x04dd
        L_0x049c:
            r0 = r43 & 4
            if (r0 != 0) goto L_0x04df
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0575 }
            X.1ij r7 = new X.1ij     // Catch:{ all -> 0x0575 }
            r41 = 0
            r33 = r7
            r34 = r32
            r35 = r22
            r36 = r25
            r37 = r21
            r38 = r23
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0575 }
            r0 = r43 & 1
            if (r0 == 0) goto L_0x04d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0575 }
            r1.<init>()     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = "SoSync:"
            r1.append(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = r6.getName()     // Catch:{ all -> 0x0575 }
            r1.append(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0575 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ all -> 0x0575 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0575 }
            r0.start()     // Catch:{ all -> 0x0575 }
            goto L_0x04df
        L_0x04d9:
            r7.run()     // Catch:{ all -> 0x0575 }
            goto L_0x04df
        L_0x04dd:
            r31 = r39
        L_0x04df:
            if (r29 != 0) goto L_0x0500
            boolean r0 = r6.setWritable(r3)
            if (r0 != 0) goto L_0x0500
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r6.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x0500:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r31 == 0) goto L_0x051a
            r1.<init>()
            r0 = r28
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            r31.close()
            return
        L_0x051a:
            r1.<init>()
            r0 = r27
            r1.append(r0)
            r1.append(r6)
            r0 = r26
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            return
        L_0x0532:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0549 }
            r1.<init>()     // Catch:{ all -> 0x0549 }
            java.lang.String r0 = "unable to list directory "
            r1.append(r0)     // Catch:{ all -> 0x0549 }
            r1.append(r6)     // Catch:{ all -> 0x0549 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0549 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0549 }
            r0.<init>(r1)     // Catch:{ all -> 0x0549 }
            throw r0     // Catch:{ all -> 0x0549 }
        L_0x0549:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x054e }
            goto L_0x0552
        L_0x054e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0553 }
        L_0x0552:
            throw r1     // Catch:{ all -> 0x0553 }
        L_0x0553:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0555 }
        L_0x0555:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x055a }
            goto L_0x055e
        L_0x055a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x055f }
        L_0x055e:
            throw r1     // Catch:{ all -> 0x055f }
        L_0x055f:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x056e }
            goto L_0x0572
        L_0x0564:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x056e }
            goto L_0x0572
        L_0x0569:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x056e }
            goto L_0x0572
        L_0x056e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0575 }
        L_0x0572:
            throw r1     // Catch:{ all -> 0x0575 }
        L_0x0573:
            r7 = move-exception
            goto L_0x0578
        L_0x0575:
            r7 = move-exception
            r31 = r39
        L_0x0578:
            if (r29 != 0) goto L_0x0599
            boolean r0 = r6.setWritable(r3)
            if (r0 != 0) goto L_0x0599
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r6.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x0599:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r31 == 0) goto L_0x05b3
            r1.<init>()
            r0 = r28
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            r31.close()
            throw r7
        L_0x05b3:
            r1.<init>()
            r0 = r27
            r1.append(r0)
            r1.append(r6)
            r0 = r26
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10I.A03(int):void");
    }
}
