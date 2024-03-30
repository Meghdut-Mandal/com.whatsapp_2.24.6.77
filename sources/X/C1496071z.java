package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.71z  reason: invalid class name and case insensitive filesystem */
public final class C1496071z implements Closeable {
    public static final Charset A0E = C19430v1.A0D;
    public int A00;
    public long A01 = 0;
    public Writer A02;
    public long A03 = 0;
    public final int A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final LinkedHashMap A09 = new LinkedHashMap(0, 0.75f, true);
    public final int A0A;
    public final C117715mi A0B;
    public final Callable A0C = new C163727qf(this, 4);
    public final ExecutorService A0D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C1496071z(C117715mi r11, File file, long j) {
        this.A06 = file;
        this.A0A = 1;
        this.A07 = C36441kJ.A0w(file, "journal");
        this.A08 = C36441kJ.A0w(file, "journal.tmp");
        this.A04 = 1;
        this.A05 = j;
        this.A0B = r11;
    }

    public static synchronized C1269666k A00(C1496071z r4, String str) {
        synchronized (r4) {
            if (r4.A02 != null) {
                A09(str);
                LinkedHashMap linkedHashMap = r4.A09;
                C1272267l r2 = (C1272267l) linkedHashMap.get(str);
                if (r2 == null) {
                    r2 = new C1272267l(r4, str);
                    linkedHashMap.put(str, r2);
                } else if (r2.A01 != null) {
                    return null;
                }
                C1269666k r3 = new C1269666k(r2, r4);
                r2.A01 = r3;
                Writer writer = r4.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("DIRTY ");
                A0u.append(str);
                writer.write(AnonymousClass000.A0t(A0u, 10));
                r4.A02.flush();
                return r3;
            }
            throw AnonymousClass001.A09("cache is closed");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:53|54|(4:57|(2:59|87)(2:60|88)|85|55)|86|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        A06(r4);
        A08(r5.A08);
        r10 = X.C36391kE.A10(r5.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0135, code lost:
        if (r10.hasNext() != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        r4 = (X.C1272267l) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (r4.A01 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        r5.A01 += r4.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r4.A01 = null;
        A08(r4.A00());
        A08(r4.A01());
        r10.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0161, code lost:
        r5.A02 = new java.io.BufferedWriter(new java.io.FileWriter(r9, true), com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016f, code lost:
        return r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0123 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C1496071z A01(X.C117715mi r14, java.io.File r15, long r16) {
        /*
            r8 = 1
            r4 = 0
            r2 = r16
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a9
            X.71z r5 = new X.71z
            r17 = r14
            r16 = r15
            r5.<init>(r14, r15, r2)
            java.io.File r9 = r5.A07
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0199
            java.lang.String r12 = ", "
            java.io.FileInputStream r1 = X.C90524aI.A0U(r9)     // Catch:{ IOException -> 0x0191 }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0191 }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r11 = A02(r4)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = A02(r4)     // Catch:{ all -> 0x018c }
            java.lang.String r13 = A02(r4)     // Catch:{ all -> 0x018c }
            java.lang.String r7 = A02(r4)     // Catch:{ all -> 0x018c }
            java.lang.String r6 = A02(r4)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0170
            java.lang.String r1 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x018c }
            boolean r0 = r1.equals(r13)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0170
            boolean r0 = r1.equals(r7)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0170
        L_0x0063:
            java.lang.String r11 = A02(r4)     // Catch:{ EOFException -> 0x0123 }
            java.lang.String r0 = " "
            java.lang.String[] r14 = r11.split(r0)     // Catch:{ EOFException -> 0x0123 }
            int r6 = r14.length     // Catch:{ EOFException -> 0x0123 }
            java.lang.String r7 = "unexpected journal line: "
            r1 = 2
            if (r6 < r1) goto L_0x0111
            r12 = r14[r8]     // Catch:{ EOFException -> 0x0123 }
            r13 = 0
            r10 = r14[r13]     // Catch:{ EOFException -> 0x0123 }
            java.lang.String r0 = "REMOVE"
            boolean r0 = r10.equals(r0)     // Catch:{ EOFException -> 0x0123 }
            if (r0 == 0) goto L_0x0088
            if (r6 != r1) goto L_0x0088
            java.util.LinkedHashMap r0 = r5.A09     // Catch:{ EOFException -> 0x0123 }
            r0.remove(r12)     // Catch:{ EOFException -> 0x0123 }
            goto L_0x0063
        L_0x0088:
            java.util.LinkedHashMap r0 = r5.A09     // Catch:{ EOFException -> 0x0123 }
            java.lang.Object r10 = r0.get(r12)     // Catch:{ EOFException -> 0x0123 }
            X.67l r10 = (X.C1272267l) r10     // Catch:{ EOFException -> 0x0123 }
            r15 = 0
            if (r10 != 0) goto L_0x009b
            X.67l r10 = new X.67l     // Catch:{ EOFException -> 0x0123 }
            r10.<init>(r5, r12)     // Catch:{ EOFException -> 0x0123 }
            r0.put(r12, r10)     // Catch:{ EOFException -> 0x0123 }
        L_0x009b:
            r12 = r14[r13]     // Catch:{ EOFException -> 0x0123 }
            java.lang.String r0 = "CLEAN"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x0123 }
            if (r0 == 0) goto L_0x00e5
            r0 = 3
            if (r6 != r0) goto L_0x00e5
            r10.A02 = r8     // Catch:{ EOFException -> 0x0123 }
            r10.A01 = r15     // Catch:{ EOFException -> 0x0123 }
            int r6 = java.lang.Math.min(r8, r8)     // Catch:{ EOFException -> 0x0123 }
            java.lang.Class r0 = r14.getClass()     // Catch:{ EOFException -> 0x0123 }
            java.lang.Class r0 = r0.getComponentType()     // Catch:{ EOFException -> 0x0123 }
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r0, r8)     // Catch:{ EOFException -> 0x0123 }
            java.lang.Object[] r11 = (java.lang.Object[]) r11     // Catch:{ EOFException -> 0x0123 }
            java.lang.System.arraycopy(r14, r1, r11, r13, r6)     // Catch:{ EOFException -> 0x0123 }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ EOFException -> 0x0123 }
            int r12 = r11.length     // Catch:{ EOFException -> 0x0123 }
            X.71z r0 = r10.A05     // Catch:{ EOFException -> 0x0123 }
            int r0 = r0.A04     // Catch:{ EOFException -> 0x0123 }
            if (r12 == r0) goto L_0x00d7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)     // Catch:{ EOFException -> 0x0123 }
            java.lang.String r0 = java.util.Arrays.toString(r11)     // Catch:{ EOFException -> 0x0123 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ EOFException -> 0x0123 }
            goto L_0x0122
        L_0x00d7:
            if (r13 >= r12) goto L_0x0063
            long[] r6 = r10.A04     // Catch:{ NumberFormatException -> 0x0104 }
            r0 = r11[r13]     // Catch:{ NumberFormatException -> 0x0104 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0104 }
            r6[r13] = r0     // Catch:{ NumberFormatException -> 0x0104 }
            r13 = 1
            goto L_0x00d7
        L_0x00e5:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x0123 }
            if (r0 == 0) goto L_0x00f8
            if (r6 != r1) goto L_0x00f8
            X.66k r0 = new X.66k     // Catch:{ EOFException -> 0x0123 }
            r0.<init>(r10, r5)     // Catch:{ EOFException -> 0x0123 }
            r10.A01 = r0     // Catch:{ EOFException -> 0x0123 }
            goto L_0x0063
        L_0x00f8:
            java.lang.String r0 = "READ"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x0123 }
            if (r0 == 0) goto L_0x011a
            if (r6 != r1) goto L_0x011a
            goto L_0x0063
        L_0x0104:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)     // Catch:{ EOFException -> 0x0123 }
            java.lang.String r0 = java.util.Arrays.toString(r11)     // Catch:{ EOFException -> 0x0123 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ EOFException -> 0x0123 }
            goto L_0x0122
        L_0x0111:
            java.lang.String r0 = X.C36321k7.A0D(r7, r11)     // Catch:{ EOFException -> 0x0123 }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x0123 }
            goto L_0x0122
        L_0x011a:
            java.lang.String r0 = X.C36321k7.A0D(r7, r11)     // Catch:{ EOFException -> 0x0123 }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x0123 }
        L_0x0122:
            throw r0     // Catch:{ EOFException -> 0x0123 }
        L_0x0123:
            A06(r4)     // Catch:{ IOException -> 0x0191 }
            java.io.File r0 = r5.A08     // Catch:{ IOException -> 0x0191 }
            A08(r0)     // Catch:{ IOException -> 0x0191 }
            java.util.LinkedHashMap r0 = r5.A09     // Catch:{ IOException -> 0x0191 }
            java.util.Iterator r10 = X.C36391kE.A10(r0)     // Catch:{ IOException -> 0x0191 }
        L_0x0131:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0191 }
            if (r0 == 0) goto L_0x0161
            java.lang.Object r4 = r10.next()     // Catch:{ IOException -> 0x0191 }
            X.67l r4 = (X.C1272267l) r4     // Catch:{ IOException -> 0x0191 }
            X.66k r0 = r4.A01     // Catch:{ IOException -> 0x0191 }
            r1 = 0
            if (r0 != 0) goto L_0x014c
            long r6 = r5.A01     // Catch:{ IOException -> 0x0191 }
            long[] r0 = r4.A04     // Catch:{ IOException -> 0x0191 }
            r0 = r0[r1]     // Catch:{ IOException -> 0x0191 }
            long r6 = r6 + r0
            r5.A01 = r6     // Catch:{ IOException -> 0x0191 }
            goto L_0x0131
        L_0x014c:
            r0 = 0
            r4.A01 = r0     // Catch:{ IOException -> 0x0191 }
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x0191 }
            A08(r0)     // Catch:{ IOException -> 0x0191 }
            java.io.File r0 = r4.A01()     // Catch:{ IOException -> 0x0191 }
            A08(r0)     // Catch:{ IOException -> 0x0191 }
            r10.remove()     // Catch:{ IOException -> 0x0191 }
            goto L_0x0131
        L_0x0161:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0191 }
            r4.<init>(r9, r8)     // Catch:{ IOException -> 0x0191 }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0191 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x0191 }
            r5.A02 = r0     // Catch:{ IOException -> 0x0191 }
            return r5
        L_0x0170:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "unexpected journal header: ["
            X.C36321k7.A1O(r0, r11, r12, r10, r1)     // Catch:{ all -> 0x018c }
            r1.append(r12)     // Catch:{ all -> 0x018c }
            r1.append(r7)     // Catch:{ all -> 0x018c }
            r1.append(r12)     // Catch:{ all -> 0x018c }
            r1.append(r6)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "]"
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            A06(r4)     // Catch:{ IOException -> 0x0191 }
            throw r0     // Catch:{ IOException -> 0x0191 }
        L_0x0191:
            r5.close()
            java.io.File r0 = r5.A06
            A07(r0)
        L_0x0199:
            r16.mkdirs()
            X.71z r5 = new X.71z
            r1 = r17
            r0 = r16
            r5.<init>(r1, r0, r2)
            A05(r5)
            return r5
        L_0x01a9:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496071z.A01(X.5mi, java.io.File, long):X.71z");
    }

    public static synchronized void A03(C1269666k r9, C1496071z r10, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (r10) {
            C1272267l r5 = r9.A01;
            if (r5.A01 == r9) {
                if (z && !r5.A02) {
                    int i = 0;
                    while (i < r10.A04) {
                        if (r5.A01().exists()) {
                            i = 1;
                        } else {
                            A03(r9, r9.A02, false);
                            illegalStateException = C90464aC.A0R("edit didn't create file ", AnonymousClass000.A0u(), i);
                        }
                    }
                }
                for (int i2 = 0; i2 < r10.A04; i2 = 1) {
                    File A012 = r5.A01();
                    if (!z) {
                        A08(A012);
                    } else if (A012.exists()) {
                        File A002 = r5.A00();
                        A012.renameTo(A002);
                        long[] jArr = r5.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        r10.A01 = (r10.A01 - j) + length;
                    }
                }
                r10.A00++;
                r5.A01 = null;
                if (r5.A02 || z) {
                    r5.A02 = true;
                    Writer writer = r10.A02;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("CLEAN ");
                    StringBuilder A0q = C90484aE.A0q(r5.A03, A0u);
                    long[] jArr2 = r5.A04;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        A0q.append(' ');
                        A0q.append(j2);
                    }
                    C36351kA.A1K(A0q, A0u);
                    writer.write(AnonymousClass000.A0t(A0u, 10));
                    if (z) {
                        long j3 = r10.A03;
                        r10.A03 = 1 + j3;
                        r5.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r10.A09;
                    String str = r5.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r10.A02;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C90464aC.A1J("REMOVE ", str, A0u2, 10);
                    writer2.write(A0u2.toString());
                }
                Writer writer3 = r10.A02;
                if (writer3 != null) {
                    writer3.flush();
                }
                if (r10.A01 > r10.A05 || A0A(r10)) {
                    r10.A0D.submit(r10.A0C);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static synchronized void A05(C1496071z r12) {
        synchronized (r12) {
            Writer writer = r12.A02;
            if (writer != null) {
                writer.close();
            }
            File file = r12.A08;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file), DefaultCrypto.BUFFER_SIZE);
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(r12.A0A));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(r12.A04));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A10 = C36391kE.A10(r12.A09);
                while (A10.hasNext()) {
                    C1272267l r2 = (C1272267l) A10.next();
                    if (r2.A01 != null) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("DIRTY ");
                        A0u.append(r2.A03);
                        bufferedWriter.write(AnonymousClass000.A0t(A0u, 10));
                    } else {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("CLEAN ");
                        StringBuilder A0q = C90484aE.A0q(r2.A03, A0u2);
                        long[] jArr = r2.A04;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            A0q.append(' ');
                            A0q.append(j);
                        }
                        C36351kA.A1K(A0q, A0u2);
                        bufferedWriter.write(AnonymousClass000.A0t(A0u2, 10));
                    }
                }
                bufferedWriter.close();
                File file2 = r12.A07;
                file.renameTo(file2);
                r12.A02 = new BufferedWriter(new FileWriter(file2, true), DefaultCrypto.BUFFER_SIZE);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return;
        throw th;
    }

    public synchronized C1494971l A0B(String str) {
        C1494971l r4;
        synchronized (this) {
            if (this.A02 != null) {
                A09(str);
                C1272267l r5 = (C1272267l) this.A09.get(str);
                r4 = null;
                if (r5 != null && r5.A02) {
                    int i = this.A04;
                    InputStream[] inputStreamArr = new InputStream[i];
                    int i2 = 0;
                    while (i2 < i) {
                        try {
                            inputStreamArr[i2] = C90524aI.A0U(r5.A00());
                            i2 = 1;
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }
                    this.A00++;
                    this.A02.append("READ").append(' ').append(str).append(10);
                    if (A0A(this)) {
                        this.A0D.submit(this.A0C);
                    }
                    r4 = new C1494971l(this, inputStreamArr);
                }
            } else {
                throw AnonymousClass001.A09("cache is closed");
            }
        }
        return r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.Writer r0 = r8.A02     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0065
            A09(r9)     // Catch:{ all -> 0x007b }
            java.util.LinkedHashMap r3 = r8.A09     // Catch:{ all -> 0x007b }
            java.lang.Object r7 = r3.get(r9)     // Catch:{ all -> 0x007b }
            X.67l r7 = (X.C1272267l) r7     // Catch:{ all -> 0x007b }
            r2 = 0
            if (r7 == 0) goto L_0x0063
            X.66k r0 = r7.A01     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0018
            goto L_0x0063
        L_0x0018:
            int r0 = r8.A04     // Catch:{ all -> 0x007b }
            if (r2 >= r0) goto L_0x0035
            java.io.File r4 = r7.A00()     // Catch:{ all -> 0x007b }
            boolean r0 = r4.delete()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006c
            long r4 = r8.A01     // Catch:{ all -> 0x007b }
            long[] r6 = r7.A04     // Catch:{ all -> 0x007b }
            r0 = r6[r2]     // Catch:{ all -> 0x007b }
            long r4 = r4 - r0
            r8.A01 = r4     // Catch:{ all -> 0x007b }
            r0 = 0
            r6[r2] = r0     // Catch:{ all -> 0x007b }
            r2 = 1
            goto L_0x0018
        L_0x0035:
            int r0 = r8.A00     // Catch:{ all -> 0x007b }
            r2 = 1
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x007b }
            java.io.Writer r1 = r8.A02     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "REMOVE"
            java.io.Writer r1 = r1.append(r0)     // Catch:{ all -> 0x007b }
            r0 = 32
            java.io.Writer r0 = r1.append(r0)     // Catch:{ all -> 0x007b }
            java.io.Writer r1 = r0.append(r9)     // Catch:{ all -> 0x007b }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x007b }
            r3.remove(r9)     // Catch:{ all -> 0x007b }
            boolean r0 = A0A(r8)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.ExecutorService r1 = r8.A0D     // Catch:{ all -> 0x007b }
            java.util.concurrent.Callable r0 = r8.A0C     // Catch:{ all -> 0x007b }
            r1.submit(r0)     // Catch:{ all -> 0x007b }
        L_0x0063:
            monitor-exit(r8)
            return r2
        L_0x0065:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x007b }
            goto L_0x007a
        L_0x006c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "failed to delete "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)     // Catch:{ all -> 0x007b }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x007b }
        L_0x007a:
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496071z.A0C(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.A02 != null) {
            Iterator A0r = C90474aD.A0r(this.A09.values());
            while (A0r.hasNext()) {
                C1269666k r2 = ((C1272267l) A0r.next()).A01;
                if (r2 != null) {
                    A03(r2, r2.A02, false);
                }
            }
            A04(this);
            this.A02.close();
            this.A02 = null;
        }
    }

    public static String A02(InputStream inputStream) {
        StringBuilder A0h = C90524aI.A0h(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read == 10) {
                int length = A0h.length();
                if (length > 0) {
                    int i = length - 1;
                    if (A0h.charAt(i) == 13) {
                        A0h.setLength(i);
                    }
                }
                return A0h.toString();
            } else {
                A0h.append((char) read);
            }
        }
    }

    public static void A06(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A09(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("keys must not contain spaces or newlines: \"");
            A0u.append(str);
            throw AnonymousClass000.A0c("\"", A0u);
        }
    }

    public static boolean A0A(C1496071z r3) {
        int i = r3.A00;
        if (i < 2000 || i < r3.A09.size()) {
            return false;
        }
        return true;
    }

    public static void A04(C1496071z r6) {
        HashSet A16 = C36441kJ.A16();
        while (r6.A01 > r6.A05) {
            String A0f = C90494aF.A0f(AnonymousClass000.A11(C36371kC.A10(r6.A09)));
            if (r6.A0C(A0f)) {
                A16.add(A0f);
            }
        }
        C117715mi r0 = r6.A0B;
        if (r0 != null) {
            C26521Km r3 = r0.A00;
            Set set = r3.A03;
            synchronized (set) {
                Iterator it = A16.iterator();
                while (it.hasNext()) {
                    set.remove(AnonymousClass001.A0C(it));
                }
                C26521Km.A00(r3);
            }
        }
    }

    public static void A07(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A07(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw C90524aI.A0X(AnonymousClass000.A0l(file2, "failed to delete file: ", AnonymousClass000.A0u()));
                }
            }
            return;
        }
        throw C90464aC.A0P(file, "not a directory: ", AnonymousClass000.A0u());
    }

    public static void A08(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
