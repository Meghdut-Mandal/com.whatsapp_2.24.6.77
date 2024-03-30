package X;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public abstract class A0U implements C23077B3i {
    public long A00 = 0;
    public Object A01 = C36441kJ.A11();
    public boolean A02;
    public int A03;
    public long A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final B5X A0E;
    public final ArrayList A0F;
    public final HashMap A0G;
    public final HashMap A0H;
    public final HashMap A0I;
    public final Handler A0J;
    public final File A0K;
    public final HashMap A0L;
    public final Random A0M;
    public final Set A0N;

    public void A07() {
        AnonymousClass896 r7 = (AnonymousClass896) this;
        Iterator A10 = C36371kC.A10(r7.A0G);
        while (A10.hasNext()) {
            Iterator it = ((AbstractCollection) C36351kA.A0u(A10)).iterator();
            boolean z = true;
            while (it.hasNext()) {
                C21664AUg aUg = (C21664AUg) it.next();
                if (!aUg.A06.exists()) {
                    it.remove();
                    if (aUg.A08) {
                        r7.A00 -= aUg.A04;
                    }
                    r7.A09(aUg, "file_removed");
                } else {
                    z = false;
                }
            }
            if (z) {
                A10.remove();
            }
        }
    }

    public synchronized NavigableSet B0R(B2F b2f, String str) {
        HashMap hashMap = this.A0I;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0I();
            hashMap.put(str, arrayList);
        }
        arrayList.add(b2f);
        return B9B(str);
    }

    public synchronized void B0T(String str) {
        Set set = this.A0N;
        if (set != null) {
            set.add(str);
        }
    }

    public synchronized void B38(File file) {
        C21664AUg A002 = C202829mj.A00(file, 0, 0, false, false);
        C200319h9.A02(AnonymousClass000.A1V(A002));
        C200319h9.A02(this.A0L.containsKey(A002.A07));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
            } else {
                A02(A002);
                notifyAll();
            }
        }
    }

    public synchronized long B97() {
        return this.A00;
    }

    public synchronized NavigableSet B9B(String str) {
        TreeSet treeSet;
        TreeSet treeSet2 = (TreeSet) this.A0G.get(str);
        if (treeSet2 == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet(treeSet2);
        }
        return treeSet;
    }

    public synchronized Set BDP() {
        return C90524aI.A0k(this.A0G.keySet());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean BLH(java.lang.String r11, long r12, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.HashMap r0 = r10.A0G     // Catch:{ all -> 0x0050 }
            java.lang.Object r6 = r0.get(r11)     // Catch:{ all -> 0x0050 }
            java.util.TreeSet r6 = (java.util.TreeSet) r6     // Catch:{ all -> 0x0050 }
            r7 = 0
            if (r6 == 0) goto L_0x004e
            X.AUg r0 = X.C202829mj.A02(r11, r12)     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r6.floor(r0)     // Catch:{ all -> 0x0050 }
            X.AUg r5 = (X.C21664AUg) r5     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x004e
            long r1 = r5.A05     // Catch:{ all -> 0x0050 }
            long r3 = r5.A04     // Catch:{ all -> 0x0050 }
            long r1 = r1 + r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            long r12 = r12 + r14
            r9 = 1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            java.util.NavigableSet r0 = r6.tailSet(r5, r7)     // Catch:{ all -> 0x0050 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0050 }
        L_0x002f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0050 }
            X.AUg r3 = (X.C21664AUg) r3     // Catch:{ all -> 0x0050 }
            long r5 = r3.A05     // Catch:{ all -> 0x0050 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004e
            long r3 = r3.A04     // Catch:{ all -> 0x0050 }
            long r5 = r5 + r3
            long r1 = java.lang.Math.max(r1, r5)     // Catch:{ all -> 0x0050 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
        L_0x004c:
            monitor-exit(r10)
            return r9
        L_0x004e:
            monitor-exit(r10)
            return r7
        L_0x0050:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0U.BLH(java.lang.String, long, long):boolean");
    }

    public synchronized void BnP(C21664AUg aUg) {
        C200319h9.A02(C36361kB.A1a(aUg, this.A0L.remove(aUg.A07)));
        notifyAll();
    }

    public synchronized void Bnn(B2F b2f, String str) {
        HashMap hashMap = this.A0I;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.remove(b2f);
            if (arrayList.isEmpty()) {
                hashMap.remove(str);
            }
        }
    }

    private C21664AUg A00(C21664AUg aUg) {
        C21664AUg aUg2 = aUg;
        String str = aUg2.A07;
        long j = aUg2.A05;
        TreeSet treeSet = (TreeSet) this.A0G.get(str);
        if (treeSet != null) {
            C21664AUg aUg3 = (C21664AUg) treeSet.floor(aUg2);
            if (aUg3 != null) {
                long j2 = aUg3.A05;
                if (j2 <= j && j < j2 + aUg3.A04) {
                    if (aUg3.A06.exists()) {
                        return aUg3;
                    }
                    A07();
                    return A00(aUg2);
                }
            }
            C21664AUg aUg4 = (C21664AUg) treeSet.ceiling(aUg2);
            if (aUg4 != null) {
                return new C21664AUg((File) null, str, j, aUg4.A05 - j, -1, false);
            }
        }
        return new C21664AUg((File) null, str, j, -1, -1, false);
    }

    public static synchronized C21664AUg A01(C21664AUg aUg, A0U a0u, Integer num) {
        C21664AUg aUg2;
        A0U a0u2 = a0u;
        synchronized (a0u2) {
            try {
                C196289Yq.A01("exo-startReadWriteNonBlocking");
                C21664AUg A002 = a0u2.A00(aUg);
                if (A002.A08) {
                    HashMap hashMap = a0u2.A0G;
                    String str = A002.A07;
                    TreeSet treeSet = (TreeSet) hashMap.get(str);
                    if (treeSet == null || !treeSet.remove(A002)) {
                        B5X b5x = a0u2.A0E;
                        if (b5x != null) {
                            b5x.BWv((int) A002.A05, (int) A002.A04, "startReadWriteNonBlocking", str);
                        }
                        Iterator it = a0u2.A0F.iterator();
                        while (it.hasNext()) {
                            ((B5X) it.next()).BWv((int) A002.A05, (int) A002.A04, "startReadWriteNonBlocking", str);
                        }
                    }
                    boolean z = a0u2.A0A;
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = A002.A06;
                    File parentFile = file.getParentFile();
                    long j = A002.A05;
                    File A032 = C202829mj.A03(parentFile, str, j, currentTimeMillis, z);
                    file.renameTo(A032);
                    aUg2 = C202829mj.A01(A032, str, j, currentTimeMillis, 0);
                    treeSet.add(aUg2);
                    ArrayList arrayList = (ArrayList) a0u2.A0I.get(str);
                    Integer num2 = num;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((B2F) arrayList.get(size)).Bgv(a0u2, A002, aUg2, num2);
                        }
                    }
                    B5X b5x2 = a0u2.A0E;
                    if (b5x2 != null) {
                        b5x2.Bgv(a0u2, A002, aUg2, num2);
                    }
                    Iterator it2 = a0u2.A0F.iterator();
                    while (it2.hasNext()) {
                        ((B2F) it2.next()).Bgv(a0u2, A002, aUg2, num2);
                    }
                } else {
                    HashMap hashMap2 = a0u2.A0L;
                    String str2 = aUg.A07;
                    if (!hashMap2.containsKey(str2)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        A002.A01 = elapsedRealtime;
                        A002.A09 = elapsedRealtime;
                        hashMap2.put(str2, A002);
                        C196289Yq.A00();
                        return A002;
                    }
                    aUg2 = null;
                }
                C196289Yq.A00();
                return aUg2;
            } catch (Throwable th) {
                C196289Yq.A00();
                throw th;
            }
        }
    }

    private void A02(C21664AUg aUg) {
        HashMap hashMap = this.A0G;
        String str = aUg.A07;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection == null) {
            abstractCollection = new TreeSet();
            hashMap.put(str, abstractCollection);
        }
        abstractCollection.add(aUg);
        this.A00 += aUg.A04;
        AbstractList abstractList = (AbstractList) this.A0I.get(str);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((B2F) abstractList.get(size)).Bgt(this, aUg);
            }
        }
        B5X b5x = this.A0E;
        if (b5x != null) {
            b5x.Bgt(this, aUg);
        }
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            ((B2F) it.next()).Bgt(this, aUg);
        }
    }

    public static void A03(A0U a0u) {
        try {
            C196289Yq.A01("VPS-SimpleCacheInit");
            File file = a0u.A0K;
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!a0u.A0C) {
                a0u.A04(file, true);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a0u.A06(file.toPath(), true);
            } else {
                a0u.A05(file, true);
            }
        } finally {
            C196289Yq.A00();
        }
    }

    private void A05(File file, boolean z) {
        File file2 = file;
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            if (z || listFiles.length != 0) {
                C21664AUg aUg = null;
                int length = listFiles.length;
                for (int i = 0; i < length; i++) {
                    File file3 = listFiles[i];
                    if (file3.getName().indexOf(46) == -1) {
                        A05(file3, false);
                    } else {
                        long length2 = file3.length();
                        if (length2 == 0) {
                            C165587tf.A0z(this.A0J, this, file3, 5);
                        } else {
                            if (!this.A08) {
                                file3 = C202829mj.A04(file3, this.A0A);
                            }
                            if (this.A09) {
                                aUg = C202829mj.A00(file3, length2, -9223372036854775807L, this.A0A, this.A0B);
                            } else {
                                aUg = C202829mj.A00(file3, 0, -9223372036854775807L, this.A0A, this.A0B);
                            }
                        }
                        if (aUg == null) {
                            C165587tf.A0z(this.A0J, this, file3, 5);
                        } else {
                            A02(aUg);
                        }
                    }
                }
                return;
            }
            C165587tf.A0z(this.A0J, this, file2, 5);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(java.nio.file.Path r19, boolean r20) {
        /*
            r18 = this;
            r5 = r19
            java.nio.file.DirectoryStream r10 = java.nio.file.Files.newDirectoryStream(r5)     // Catch:{ IOException -> 0x00bb }
            if (r10 != 0) goto L_0x0009
            return
        L_0x0009:
            r7 = 0
            java.util.Iterator r9 = r10.iterator()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r4 = 0
            r8 = 0
        L_0x0010:
            boolean r0 = r9.hasNext()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r3 = r18
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r2 = r9.next()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            int r8 = r8 + 1
            java.nio.file.Path r0 = r2.getFileName()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.lang.String r1 = r0.toString()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0 = 46
            int r1 = r1.indexOf(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0 = -1
            if (r1 != r0) goto L_0x0035
            r3.A06(r2, r4)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x0035:
            java.io.File r0 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            long r12 = r0.length()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            long r0 = r3.A04     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            android.os.Handler r1 = r3.A0J     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.72r r0 = new X.72r     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r2)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0091
        L_0x004e:
            boolean r0 = r3.A08     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            if (r0 != 0) goto L_0x0060
            java.io.File r1 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.io.File r0 = X.C202829mj.A04(r1, r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.nio.file.Path r2 = r0.toPath()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x0060:
            boolean r0 = r3.A09     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            if (r0 == 0) goto L_0x007a
            java.io.File r11 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r1 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0B     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r16 = r1
            X.AUg r7 = X.C202829mj.A00(r11, r12, r14, r16, r17)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0091
        L_0x007a:
            java.io.File r11 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r1 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r12 = 0
            boolean r0 = r3.A0B     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r16 = r1
            X.AUg r7 = X.C202829mj.A00(r11, r12, r14, r16, r17)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x0091:
            if (r7 != 0) goto L_0x009f
            android.os.Handler r1 = r3.A0J     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.72r r0 = new X.72r     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r2)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x009f:
            r3.A02(r7)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x00a4:
            if (r20 != 0) goto L_0x00b2
            if (r8 != 0) goto L_0x00b2
            android.os.Handler r1 = r3.A0J     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.72r r0 = new X.72r     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r5)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x00b2:
            r10.close()     // Catch:{ IOException -> 0x00bb }
            return
        L_0x00b6:
            r0 = move-exception
            r10.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            throw r0
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0U.A06(java.nio.file.Path, boolean):void");
    }

    public boolean BLI(String str, long j, long j2) {
        if (!this.A0D || this.A02) {
            return BLH(str, j, j2);
        }
        return false;
    }

    public boolean BMG(String str) {
        Set set = this.A0N;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public synchronized File BuU(String str, long j, long j2) {
        File file;
        synchronized (this) {
            String str2 = str;
            C200319h9.A02(this.A0L.containsKey(str2));
            File file2 = this.A0K;
            if (!file2.exists()) {
                A07();
                file2.mkdirs();
            }
            B5X b5x = this.A0E;
            long j3 = j;
            long j4 = j2;
            if (b5x != null) {
                b5x.BhF(this, str2, j3, j4);
            }
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                ((B5X) it.next()).BhF(this, str2, j3, j4);
            }
            if (this.A06) {
                File A0w = C36441kJ.A0w(file2, Integer.toString(this.A0M.nextInt(this.A03)));
                if (!A0w.exists()) {
                    A0w.mkdir();
                }
                file = C202829mj.A03(A0w, str2, j3, System.currentTimeMillis(), this.A0A);
            } else {
                file = C202829mj.A03(file2, str2, j3, System.currentTimeMillis(), this.A0A);
            }
        }
        return file;
    }

    public synchronized C21664AUg Buk(Integer num, String str, long j, long j2) {
        synchronized (this) {
            Tracer.A00("SimpleCache.startReadWrite");
            try {
                C21664AUg A022 = C202829mj.A02(str, j);
                long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
                boolean A1Q = AnonymousClass000.A1Q((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                while (true) {
                    Integer num2 = num;
                    C21664AUg A012 = A01(A022, this, num2);
                    if (A012 != null) {
                        Systrace.A00();
                        return A012;
                    } else if (!this.A07 || !A1Q) {
                        long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                        HashMap hashMap = this.A0L;
                        String str2 = A022.A07;
                        if (hashMap.containsKey(str2)) {
                            long j3 = ((C21664AUg) hashMap.get(str2)).A01;
                            if (j3 > 0) {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - j3;
                                if (elapsedRealtime3 > j2) {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("lock expired after ");
                                    A0u.append(elapsedRealtime2);
                                    Log.w("SimpleCache", AnonymousClass000.A0p("ms for span: ", str2, A0u));
                                    break;
                                }
                                elapsedRealtime2 = j2 - elapsedRealtime3;
                            }
                        }
                        if (!A1Q) {
                            if (elapsedRealtime2 <= 0) {
                                break;
                            }
                        } else {
                            elapsedRealtime2 = 0;
                        }
                        wait(elapsedRealtime2);
                    } else {
                        HashMap hashMap2 = this.A0L;
                        String str3 = A022.A07;
                        if (hashMap2.containsKey(str3)) {
                            C21664AUg aUg = (C21664AUg) hashMap2.get(str3);
                            long j4 = this.A05;
                            if (j4 > 0 && num2 != C023109s.A00 && num2 != C023109s.A0G && aUg.A09 > 0 && SystemClock.elapsedRealtime() - aUg.A09 > j4) {
                                Log.d("SimpleCache", AnonymousClass000.A0p("Ignore expired cache lock when retry ", str3, AnonymousClass000.A0u()));
                                break;
                            }
                            aUg.A00++;
                        }
                        wait();
                        if (hashMap2.containsKey(str3)) {
                            ((C21664AUg) hashMap2.get(str3)).A00--;
                        }
                    }
                }
                return null;
            } finally {
                Systrace.A00();
            }
        }
    }

    public A0U(Handler handler, B5X b5x, File file, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        try {
            C196289Yq.A01("VPS-SimpleCacheConstructor");
            this.A08 = z2;
            this.A0A = z3;
            this.A0B = z4;
            this.A09 = z5;
            this.A07 = z6;
            this.A0K = file;
            this.A0E = b5x;
            this.A0L = AnonymousClass001.A0J();
            this.A0G = AnonymousClass001.A0J();
            this.A0N = C36441kJ.A16();
            this.A0H = AnonymousClass001.A0J();
            this.A0I = AnonymousClass001.A0J();
            this.A0F = AnonymousClass001.A0I();
            this.A0M = new Random();
            this.A06 = z7;
            this.A03 = i;
            this.A0D = z;
            this.A05 = j;
            this.A0C = z8;
            this.A04 = j2;
            this.A0J = handler;
            new AnonymousClass78Z(this).start();
        } finally {
            C196289Yq.A00();
        }
    }

    private void A04(File file, boolean z) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        if (z || listFiles.length != 0) {
            C21664AUg aUg = null;
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) == -1) {
                    A04(file2, false);
                } else {
                    long length = file2.length();
                    if (length <= this.A04) {
                        file2.delete();
                    } else {
                        if (!this.A08) {
                            file2 = C202829mj.A04(file2, this.A0A);
                        }
                        boolean z2 = this.A09;
                        boolean z3 = this.A0A;
                        if (!z2) {
                            length = 0;
                        }
                        aUg = C202829mj.A00(file2, length, -9223372036854775807L, z3, this.A0B);
                    }
                    if (aUg == null) {
                        file2.delete();
                    } else {
                        A02(aUg);
                    }
                }
            }
            return;
        }
        file.delete();
    }
}
