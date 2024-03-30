package X;

import com.whatsapp.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6QJ  reason: invalid class name */
public abstract class AnonymousClass6QJ {
    public final int A00;
    public final long A01;
    public final int[] A02;

    public static synchronized long A01(AnonymousClass6QJ r2, int i) {
        long j;
        synchronized (r2) {
            j = (long) r2.A02[i];
        }
        return j;
    }

    public int A03(long j) {
        boolean z = true;
        int i = 0;
        C18740tg.A0C(C36401kF.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        if (j >= this.A01) {
            z = false;
        }
        C18740tg.A0C(z);
        int i2 = 0;
        while (i < this.A00) {
            i2 += A02(i);
            if (j < ((long) i2)) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r16 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r3 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r11.A02[r6] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r1 != ((long) A02(r6))) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        X.AnonymousClass000.A1F(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A07(long r12, long r14, boolean r16) {
        /*
            r11 = this;
            r10 = r11
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x0005:
            r8 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            int r7 = r11.A03(r12)
            long r3 = r11.A05(r7)
            long r1 = r12 - r3
            r6 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r0 = X.C36401kF.A1U(r0)
            X.C18740tg.A0C(r0)
            int r0 = r11.A02(r7)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            r6 = 0
        L_0x0029:
            X.C18740tg.A0C(r6)
            int r6 = r11.A03(r12)
            long r3 = A01(r11, r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            long r1 = r1 + r14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0086
            int r7 = r11.A02(r6)
            long r3 = (long) r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            if (r16 == 0) goto L_0x004e
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x006e }
            r0[r6] = r7     // Catch:{ all -> 0x006e }
            monitor-exit(r10)
        L_0x004e:
            long r1 = r1 - r3
            int r3 = r6 + 1
            int r0 = r11.A00
            if (r3 >= r0) goto L_0x005e
            X.AnonymousClass000.A1F(r5, r6)
            long r12 = r11.A05(r3)
            r14 = r1
            goto L_0x0005
        L_0x005e:
            java.lang.String r0 = "downloaded more bytes than chunks"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0065:
            if (r16 == 0) goto L_0x0072
            int r3 = (int) r1
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x006e }
            r0[r6] = r3     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0071:
            monitor-exit(r10)
        L_0x0072:
            int r0 = r11.A02(r6)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0086
            X.AnonymousClass000.A1F(r5, r6)
            return r5
        L_0x007f:
            java.lang.String r0 = "gap in downloaded chunk"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6QJ.A07(long, long, boolean):java.util.ArrayList");
    }

    public synchronized boolean A09(int i) {
        return AnonymousClass000.A1S(this.A02[i], A02(i));
    }

    public synchronized String toString() {
        StringBuilder A0u;
        String str;
        A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("totalBytes: ");
        A0u2.append(this.A01);
        A0u2.append(", ");
        StringBuilder A0j = C90464aC.A0j(A0u2, A0u);
        A0j.append("chunkCount: ");
        int i = this.A00;
        A0j.append(i);
        A0j.append(", ");
        C36351kA.A1K(A0j, A0u);
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            if (!A09(i3)) {
                if (i2 >= 0) {
                    int i4 = i3 - 1;
                    if (i4 != i2) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("-");
                        A0u3.append(i4);
                        str = C90474aD.A0g(A0u3);
                    } else {
                        str = "]";
                    }
                    A0u.append(str);
                    i2 = -1;
                }
                int[] iArr = this.A02;
                if (iArr[i3] > 0) {
                    StringBuilder A0p = C90484aE.A0p();
                    A0p.append(i3);
                    A0p.append("] ");
                    A0p.append(iArr[i3]);
                    A0p.append(", ");
                    C36351kA.A1K(A0p, A0u);
                }
            } else if (i2 < 0) {
                A0u.append(AnonymousClass000.A0r("[", AnonymousClass000.A0u(), i3));
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            StringBuilder A0p2 = C90484aE.A0p();
            A0p2.append(i2);
            A0p2.append("-");
            A0p2.append(i - 1);
            A0p2.append("]");
            C36351kA.A1K(A0p2, A0u);
        }
        return A0u.toString();
    }

    public int A02(int i) {
        if (this instanceof AnonymousClass5LE) {
            return C36351kA.A06(((AnonymousClass5LE) this).A00, i);
        }
        AnonymousClass5LD r1 = (AnonymousClass5LD) this;
        int i2 = r1.A00 - 1;
        long j = r1.A01;
        if (i == i2) {
            j = Math.min(j, r1.A01 % j);
        }
        return (int) j;
    }

    public long A04() {
        long j = 0;
        for (int i = 0; i < this.A00; i++) {
            j += A01(this, i);
        }
        return j;
    }

    public long A05(int i) {
        long j = 0;
        int i2 = 0;
        while (i2 < i && i2 < this.A00) {
            j += (long) A02(i2);
            i2++;
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(long r7) {
        /*
            r6 = this;
            long r4 = r6.A01
            r2 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            int r4 = r6.A03(r7)
        L_0x000c:
            int r1 = r6.A00
            if (r4 >= r1) goto L_0x0019
            boolean r0 = r6.A09(r4)
            if (r0 == 0) goto L_0x0019
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0019:
            if (r4 == r1) goto L_0x0024
            long r2 = r6.A05(r4)
            long r0 = A01(r6, r4)
            long r2 = r2 + r0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6QJ.A06(long):long");
    }

    public void A08(File file) {
        DataOutputStream dataOutputStream;
        if (this instanceof AnonymousClass5LE) {
            try {
                dataOutputStream = new DataOutputStream(C90504aG.A0Y(file));
                dataOutputStream.writeLong(this.A01);
                for (int i = 0; i < this.A00; i++) {
                    dataOutputStream.writeInt(this.A02[i]);
                }
            } catch (IOException e) {
                Log.e("ChunkStore/chunk store write failed", e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            AnonymousClass5LD r2 = (AnonymousClass5LD) this;
            dataOutputStream = new DataOutputStream(C90504aG.A0Y(file));
            dataOutputStream.writeLong(r2.A01);
            dataOutputStream.writeLong(r2.A01);
            dataOutputStream.writeInt(r2.A00);
            for (int i2 = 0; i2 < r2.A00; i2++) {
                dataOutputStream.writeInt(r2.A02[i2]);
            }
        }
        dataOutputStream.flush();
        dataOutputStream.close();
        return;
        throw th;
    }

    public AnonymousClass6QJ(int[] iArr, int i, long j) {
        this.A01 = j;
        this.A00 = i;
        if (iArr == null) {
            this.A02 = new int[i];
        } else {
            this.A02 = iArr;
        }
    }
}
