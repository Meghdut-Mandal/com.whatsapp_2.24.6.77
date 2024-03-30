package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.71y  reason: invalid class name and case insensitive filesystem */
public final class C1495971y implements Closeable {
    public static final Charset A0E = Charset.forName(DefaultCrypto.UTF_8);
    public static final Pattern A0F = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream A0G = new AnonymousClass5RG();
    public static final Charset A0H = Charset.forName("US-ASCII");
    public int A00;
    public long A01;
    public long A02 = 0;
    public Writer A03;
    public long A04 = 0;
    public final int A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final LinkedHashMap A09 = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0A = new C163727qf(this, 2);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final int A0C;
    public final File A0D;

    public C1495971y(File file, long j) {
        this.A06 = file;
        this.A0C = 2;
        this.A07 = C36441kJ.A0w(file, "journal");
        this.A08 = C36441kJ.A0w(file, "journal.tmp");
        this.A0D = C36441kJ.A0w(file, "journal.bkp");
        this.A05 = 1;
        this.A01 = j;
    }

    public static synchronized void A00(C1263363n r9, C1495971y r10, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (r10) {
            C1271767g r5 = r9.A02;
            if (r5.A01 == r9) {
                if (z && !r5.A02) {
                    int i = 0;
                    while (true) {
                        if (i < r10.A05) {
                            if (!r9.A03[i]) {
                                r9.A00();
                                illegalStateException = C90464aC.A0R("Newly created entry didn't create value for index ", AnonymousClass000.A0u(), i);
                                break;
                            } else if (!r5.A01().exists()) {
                                r9.A00();
                                break;
                            } else {
                                i = 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < r10.A05; i2 = 1) {
                    File A012 = r5.A01();
                    if (!z) {
                        A04(A012);
                    } else if (A012.exists()) {
                        File A002 = r5.A00();
                        A012.renameTo(A002);
                        long[] jArr = r5.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        r10.A02 = (r10.A02 - j) + length;
                    }
                }
                r10.A00++;
                r5.A01 = null;
                if (r5.A02 || z) {
                    r5.A02 = true;
                    Writer writer = r10.A03;
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
                        long j3 = r10.A04;
                        r10.A04 = 1 + j3;
                        r5.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r10.A09;
                    String str = r5.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r10.A03;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C90464aC.A1J("REMOVE ", str, A0u2, 10);
                    writer2.write(A0u2.toString());
                }
                r10.A03.flush();
                if (r10.A02 > r10.A01 || A06(r10)) {
                    r10.A0B.submit(r10.A0A);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static synchronized void A01(C1495971y r12) {
        synchronized (r12) {
            Writer writer = r12.A03;
            if (writer != null) {
                writer.close();
            }
            File file = r12.A08;
            FileOutputStream A0W = C90524aI.A0W(file);
            Charset charset = A0H;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(A0W, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(r12.A0C));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(r12.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A10 = C36391kE.A10(r12.A09);
                while (A10.hasNext()) {
                    C1271767g r2 = (C1271767g) A10.next();
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
                if (file2.exists()) {
                    File file3 = r12.A0D;
                    A04(file3);
                    if (!file2.renameTo(file3)) {
                        th = new IOException();
                        throw th;
                    }
                }
                if (file.renameTo(file2)) {
                    r12.A0D.delete();
                    r12.A03 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
                } else {
                    th = new IOException();
                    throw th;
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter.close();
            }
        }
    }

    public synchronized void A07(String str) {
        Throwable th;
        if (this.A03 != null) {
            A05(str);
            LinkedHashMap linkedHashMap = this.A09;
            C1271767g r7 = (C1271767g) linkedHashMap.get(str);
            int i = 0;
            if (r7 != null) {
                if (r7.A01 == null) {
                    while (i < this.A05) {
                        File A002 = r7.A00();
                        if (!A002.exists() || A002.delete()) {
                            long j = this.A02;
                            long[] jArr = r7.A04;
                            this.A02 = j - jArr[i];
                            jArr[i] = 0;
                            i = 1;
                        } else {
                            th = C90524aI.A0X(AnonymousClass000.A0l(A002, "failed to delete ", AnonymousClass000.A0u()));
                        }
                    }
                    this.A00++;
                    Writer writer = this.A03;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("REMOVE ");
                    A0u.append(str);
                    writer.append(AnonymousClass000.A0t(A0u, 10));
                    linkedHashMap.remove(str);
                    if (A06(this)) {
                        this.A0B.submit(this.A0A);
                    }
                }
            }
        } else {
            th = AnonymousClass001.A09("cache is closed");
        }
        throw th;
    }

    public synchronized void close() {
        if (this.A03 != null) {
            LinkedHashMap linkedHashMap = this.A09;
            Iterator A0r = C90474aD.A0r(linkedHashMap.values());
            while (A0r.hasNext()) {
                C1263363n r0 = ((C1271767g) A0r.next()).A01;
                if (r0 != null) {
                    r0.A00();
                }
            }
            while (this.A02 > this.A01) {
                A07(C90494aF.A0f(AnonymousClass000.A11(C36371kC.A10(linkedHashMap))));
            }
            this.A03.close();
            this.A03 = null;
        }
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A05(String str) {
        if (!C36361kB.A1Z(str, A0F)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            A0u.append(str);
            throw AnonymousClass000.A0c("\"", A0u);
        }
    }

    public static boolean A06(C1495971y r3) {
        int i = r3.A00;
        if (i < 2000 || i < r3.A09.size()) {
            return false;
        }
        return true;
    }

    public static void A03(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A03(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw C90524aI.A0X(AnonymousClass000.A0l(file2, "failed to delete file: ", AnonymousClass000.A0u()));
                }
            }
            return;
        }
        throw C90524aI.A0X(AnonymousClass000.A0l(file, "not a readable directory: ", AnonymousClass000.A0u()));
    }

    public static void A04(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
