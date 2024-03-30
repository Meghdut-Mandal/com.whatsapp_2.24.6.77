package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5C0  reason: invalid class name */
public class AnonymousClass5C0 extends AnonymousClass5C2 implements C160107kT {
    public C1042858z A00;
    public final long A01;
    public final C19630wG A02;
    public final C20810yC A03;
    public final C124245xp A04;
    public final AnonymousClass1O9 A05;
    public final C25711Hj A06;
    public final String A07;
    public final AnonymousClass1O7 A08;
    public volatile File A09;
    public volatile boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5C0(X.C20050ww r12, X.AnonymousClass1O7 r13, X.C19970wo r14, X.C19630wG r15, X.C20060wx r16, X.C20810yC r17, X.AnonymousClass1BV r18, X.C124245xp r19, X.AnonymousClass1O9 r20, X.AnonymousClass1BS r21, X.C25711Hj r22, java.lang.String r23, long r24) {
        /*
            r11 = this;
            r10 = 0
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r19
            X.C18740tg.A06(r2)
            r11.A03 = r7
            r0 = r24
            r11.A01 = r0
            r0 = r23
            r11.A07 = r0
            r0 = r22
            r11.A06 = r0
            r11.A02 = r15
            r11.A04 = r2
            r0 = r20
            r11.A05 = r0
            r11.A08 = r13
            r11.B0M(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5C0.<init>(X.0ww, X.1O7, X.0wo, X.0wG, X.0wx, X.0yC, X.1BV, X.5xp, X.1O9, X.1BS, X.1Hj, java.lang.String, long):void");
    }

    public /* synthetic */ void BW4(long j) {
    }

    public void BW6(boolean z) {
        Context context = this.A02.A00;
        C124245xp r0 = this.A04;
        C90464aC.A18(AnonymousClass1OC.A00(context, r0.A04, r0.A06, r0.A02));
        this.A06.accept(this.A07);
        this.A0A = false;
        C1042858z r1 = this.A00;
        if (r1 != null) {
            this.A05.A00.Bly(r1);
        }
    }

    public C117395mC A02() {
        C117395mC A022 = super.A02();
        C1042858z r3 = A022.A00.A00;
        this.A00 = r3;
        if (r3 != null) {
            r3.A0I = C36421kH.A0U();
            r3.A0J = 15;
            r3.A0H = C36391kE.A0r();
            int i = 5;
            if (this.A04.A02 == 1) {
                i = 2;
            }
            r3.A0G = Integer.valueOf(i);
            return A022;
        }
        Log.e("ProfilePicturePlainFileDownload/download media_download2 event in DownloadResponse is null");
        return A022;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BW7(X.C133136Wx r12, X.C129166Fp r13) {
        /*
            r11 = this;
            boolean r0 = r12.A03()
            r4 = 0
            if (r0 == 0) goto L_0x003d
            java.io.File r0 = r11.A09
            long r2 = r0.length()
            int r1 = (int) r2
            byte[] r3 = new byte[r1]
            java.io.File r0 = r11.A09     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
            java.io.FileInputStream r2 = X.C90524aI.A0U(r0)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002f }
            r0.<init>(r2)     // Catch:{ all -> 0x002f }
            r0.read(r3, r4, r1)     // Catch:{ all -> 0x0025 }
            r0.close()     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
            goto L_0x004e
        L_0x0025:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x002f }
        L_0x002e:
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
        L_0x0038:
            throw r1     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
            goto L_0x004b
        L_0x003d:
            int r0 = r12.A01
            boolean r0 = X.C133136Wx.A02(r0)
            r8 = 6
            if (r0 == 0) goto L_0x0058
            r8 = 4
            goto L_0x0058
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
        L_0x004b:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x004e:
            X.5xp r1 = r11.A04
            r1.A00 = r3
            X.1O7 r0 = r11.A08
            r0.A03(r1)
            r8 = 1
        L_0x0058:
            X.58z r0 = r12.A00
            if (r0 == 0) goto L_0x00a5
            java.lang.Long r0 = r0.A0N
            if (r0 == 0) goto L_0x00a5
            long r0 = r0.longValue()
            int r10 = (int) r0
        L_0x0065:
            X.1O9 r5 = r11.A05
            X.5xp r0 = r11.A04
            int r1 = r0.A02
            r0 = 1
            r9 = 1
            if (r1 != r0) goto L_0x0070
            r9 = 2
        L_0x0070:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r11.A01
            java.lang.Long r7 = X.C90504aG.A0h(r2, r0)
            java.io.File r0 = r11.A09
            if (r0 == 0) goto L_0x00a3
            java.io.File r0 = r11.A09
            long r0 = r0.length()
            java.lang.Double r6 = X.C90524aI.A0Z(r0)
        L_0x0088:
            r5.A00(r6, r7, r8, r9, r10)
            java.io.File r0 = r11.A09
            r0.delete()
            X.1Hj r1 = r11.A06
            java.lang.String r0 = r11.A07
            r1.accept(r0)
            r11.A0A = r4
            X.58z r1 = r11.A00
            if (r1 == 0) goto L_0x00a2
            X.0yW r0 = r5.A00
            r0.Bly(r1)
        L_0x00a2:
            return
        L_0x00a3:
            r6 = 0
            goto L_0x0088
        L_0x00a5:
            r10 = -1
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5C0.BW7(X.6Wx, X.6Fp):void");
    }
}
