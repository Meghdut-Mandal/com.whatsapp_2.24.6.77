package X;

import android.net.Uri;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.6jO  reason: invalid class name and case insensitive filesystem */
public class C139196jO implements B39, C160767lY {
    public long A00;
    public RandomAccessFile A01;
    public boolean A02;
    public long A03;
    public long A04;
    public final Handler A05 = C36341k9.A0H();
    public final AnonymousClass171 A06;
    public final C19630wG A07;
    public final C20060wx A08;
    public final AnonymousClass1A5 A09;
    public final C46932bu A0A;
    public final AnonymousClass6Fc A0B;
    public final AnonymousClass61H A0C;

    public void B0p(B2E b2e) {
    }

    public void BSW(AnonymousClass6Fc r1, long j) {
    }

    public void BW8(int i) {
    }

    public void BcE(File file, boolean z) {
    }

    public void Bev() {
    }

    public /* synthetic */ void cancel() {
        throw null;
    }

    public Uri BIj() {
        return Uri.fromFile(this.A0B.A02());
    }

    public void BW9(AnonymousClass6Fc r4) {
        this.A05.post(new C1498172w(this, r4, 4));
    }

    public void BXt(AnonymousClass6Fc r6) {
        RandomAccessFile randomAccessFile;
        File A022 = this.A0B.A02();
        if (this.A02 && (randomAccessFile = this.A01) != null) {
            try {
                long filePointer = randomAccessFile.getFilePointer();
                try {
                    this.A01.close();
                    this.A01 = null;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A022, "r");
                    this.A01 = randomAccessFile2;
                    randomAccessFile2.seek(filePointer);
                } catch (IOException e) {
                    Log.e((Throwable) e);
                    this.A01 = null;
                } catch (Throwable th) {
                    this.A01 = null;
                    throw th;
                }
            } catch (IOException e2) {
                Log.e((Throwable) e2);
                Log.e("WhatsappChunkAwareDataSource/hotswap failed");
            }
        }
    }

    public long Bks(C202189lD r10) {
        this.A03 = 0;
        long j = r10.A03;
        this.A00 = j;
        AnonymousClass6Fc r8 = this.A0B;
        synchronized (r8) {
            r8.A0G.add(this);
        }
        C121885ts r1 = r8.A0F;
        long j2 = this.A00;
        Handler handler = r1.A02;
        handler.removeCallbacks(r1.A01);
        C80303vB r2 = new C80303vB(r1, j2, 19);
        r1.A01 = r2;
        handler.postDelayed(r2, 200);
        long A012 = r8.A01() - j;
        this.A04 = A012;
        return A012;
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.A01;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.A01 = null;
                if (this.A02) {
                    this.A02 = false;
                }
            } catch (IOException e) {
                throw new AnonymousClass5R1(e);
            } catch (Throwable th) {
                this.A01 = null;
                if (this.A02) {
                    this.A02 = false;
                }
                throw th;
            }
        }
        AnonymousClass6Fc r1 = this.A0B;
        synchronized (r1) {
            r1.A0G.remove(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        if (r0 == -1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (r0 == 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r4 = r11.A01.read(r12, r13, (int) java.lang.Math.min((long) r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r4 != -1) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        if (r11.A04 == r11.A03) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r11.A03 += (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            X.6Fc r4 = r11.A0B
            int r0 = r4.A00()
            r10 = 0
            if (r0 == 0) goto L_0x00d8
            int r1 = r4.A00()
            r0 = 2
            if (r1 == r0) goto L_0x00d8
            java.io.File r0 = r4.A02()
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "downloadFile is null"
            X.C18740tg.A0D(r1, r0)
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x003e
            java.io.File r1 = r4.A02()     // Catch:{ IOException -> 0x0034 }
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0034 }
            r11.A01 = r2     // Catch:{ IOException -> 0x0034 }
            long r0 = r11.A00     // Catch:{ IOException -> 0x0034 }
            r2.seek(r0)     // Catch:{ IOException -> 0x0034 }
            goto L_0x003b
        L_0x0034:
            r0 = move-exception
            X.5R1 r1 = new X.5R1
            r1.<init>(r0)
            throw r1
        L_0x003b:
            r0 = 1
            r11.A02 = r0
        L_0x003e:
            long r5 = (long) r14
            long r2 = r11.A04
            long r0 = r11.A03
            long r2 = r2 - r0
            long r0 = java.lang.Math.min(r5, r2)
            int r6 = (int) r0
            r5 = -1
            if (r6 == 0) goto L_0x00d7
            java.io.RandomAccessFile r0 = r11.A01
            X.C18740tg.A06(r0)
            long r0 = r0.getFilePointer()
            boolean r0 = r4.A09(r0)
            if (r0 == 0) goto L_0x00d8
            java.io.RandomAccessFile r0 = r11.A01
            long r2 = r0.getFilePointer()
            monitor-enter(r4)
            int r1 = r4.A01     // Catch:{ all -> 0x00d4 }
            r0 = 3
            if (r1 != r0) goto L_0x006a
            long r0 = r4.A04     // Catch:{ all -> 0x00d4 }
            goto L_0x00a3
        L_0x006a:
            boolean r0 = r4.A09(r2)     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x0072
            monitor-exit(r4)
            return r10
        L_0x0072:
            long r7 = r4.A01()     // Catch:{ all -> 0x00d4 }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00ce
            X.6QJ r8 = r4.A07     // Catch:{ all -> 0x00d4 }
            long r0 = r8.A01     // Catch:{ all -> 0x00d4 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x009f
            int r7 = r8.A03(r2)     // Catch:{ all -> 0x00d4 }
        L_0x0086:
            int r1 = r8.A00     // Catch:{ all -> 0x00d4 }
            if (r7 >= r1) goto L_0x0093
            boolean r0 = r8.A09(r7)     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0093
            int r7 = r7 + 1
            goto L_0x0086
        L_0x0093:
            if (r7 == r1) goto L_0x009f
            long r0 = r8.A05(r7)     // Catch:{ all -> 0x00d4 }
            r8 = -1
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00a3
        L_0x009f:
            long r0 = r4.A01()     // Catch:{ all -> 0x00d4 }
        L_0x00a3:
            long r0 = r0 - r2
            monitor-exit(r4)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00d8
            java.io.RandomAccessFile r4 = r11.A01
            long r2 = (long) r6
            long r1 = java.lang.Math.min(r2, r0)
            int r0 = (int) r1
            int r4 = r4.read(r12, r13, r0)
            if (r4 != r5) goto L_0x00c7
            long r3 = r11.A04
            long r1 = r11.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00c7:
            long r2 = r11.A03
            long r0 = (long) r4
            long r2 = r2 + r0
            r11.A03 = r2
            return r4
        L_0x00ce:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x00d4 }
            r0.<init>()     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x00d7:
            return r5
        L_0x00d8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139196jO.read(byte[], int, int):int");
    }

    public C139196jO(AnonymousClass171 r2, C19630wG r3, C20060wx r4, AnonymousClass1A5 r5, C46932bu r6, AnonymousClass6Fc r7, AnonymousClass61H r8) {
        this.A07 = r3;
        this.A08 = r4;
        this.A06 = r2;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = r7;
        this.A0C = r8;
    }
}
