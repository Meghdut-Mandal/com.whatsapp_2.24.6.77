package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.5Bl  reason: invalid class name and case insensitive filesystem */
public class C104805Bl extends AnonymousClass75H {
    public static final C119755qP A0K = new C119755qP(30, 72);
    public static final C119755qP A0L = new C119755qP(48, 96);
    public final PowerManager.WakeLock A00;
    public final C19700wN A01;
    public final Mp4Ops A02;
    public final AnonymousClass1AV A03;
    public final C24341Cb A04;
    public final C19630wG A05;
    public final C19420v0 A06;
    public final C21350z4 A07;
    public final AnonymousClass1DF A08;
    public final C20810yC A09;
    public final C21010yW A0A;
    public final AnonymousClass5BY A0B;
    public final AnonymousClass1GJ A0C;
    public final C25511Gp A0D;
    public final AnonymousClass1DC A0E;
    public final C19770wU A0F;
    public final C20690y0 A0G;
    public final AnonymousClass1EJ A0H;
    public final C24051Aw A0I;
    public final AnonymousClass1GX A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r3 == null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass5Bd A00(X.AnonymousClass5BZ r9, X.AnonymousClass2bU r10, java.io.File r11) {
        /*
            r8 = this;
            r7 = 0
            if (r10 == 0) goto L_0x00d4
            java.lang.String r0 = r10.A04
            if (r0 == 0) goto L_0x00d4
            X.3Qj r0 = r10.A01
            if (r0 == 0) goto L_0x00d4
            java.io.File r0 = r0.A0I
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00d4
            X.1Aw r1 = r8.A0I     // Catch:{ IOException -> 0x00cb }
            X.3Qj r0 = r10.A01     // Catch:{ IOException -> 0x00cb }
            java.io.File r0 = r0.A0I     // Catch:{ IOException -> 0x00cb }
            X.AnonymousClass6YY.A0B(r1, r0, r11)     // Catch:{ IOException -> 0x00cb }
            java.lang.String r1 = r10.A04     // Catch:{ IOException -> 0x00cb }
            java.lang.String r0 = X.AnonymousClass6UG.A00(r11)     // Catch:{ IOException -> 0x00cb }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x00cb }
            if (r0 != 0) goto L_0x002e
            X.AnonymousClass6YY.A0P(r11)     // Catch:{ IOException -> 0x00cb }
            return r7
        L_0x002e:
            X.5BY r4 = r8.A0B     // Catch:{ IOException -> 0x00cb }
            boolean r6 = r4.A07     // Catch:{ IOException -> 0x00cb }
            X.3Qa r0 = r10.A1J     // Catch:{ IOException -> 0x00cb }
            X.11F r0 = r0.A00     // Catch:{ IOException -> 0x00cb }
            boolean r0 = r0 instanceof X.C177528dw     // Catch:{ IOException -> 0x00cb }
            if (r6 != r0) goto L_0x004c
            X.1EJ r0 = r8.A0H     // Catch:{ IOException -> 0x00cb }
            X.C18740tg.A06(r10)     // Catch:{ IOException -> 0x00cb }
            r0.A00(r10)     // Catch:{ IOException -> 0x00cb }
            X.3Kz r0 = r10.A0V()     // Catch:{ IOException -> 0x00cb }
            byte[] r3 = r0.A02()     // Catch:{ IOException -> 0x00cb }
            if (r3 != 0) goto L_0x0060
        L_0x004c:
            if (r6 == 0) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            X.5qP r0 = A0K     // Catch:{ IOException -> 0x00cb }
            r2 = 30
            goto L_0x0058
        L_0x0054:
            X.5qP r0 = A0L     // Catch:{ IOException -> 0x00cb }
            r2 = 48
        L_0x0058:
            int r1 = r0.A01     // Catch:{ IOException -> 0x00cb }
            r0 = r6 ^ 1
            byte[] r3 = X.AnonymousClass1GX.A0d(r11, r2, r1, r0)     // Catch:{ IOException -> 0x00cb }
        L_0x0060:
            X.6Tv r2 = r4.A01     // Catch:{ IOException -> 0x00cb }
            java.io.File r4 = r4.A06     // Catch:{ IOException -> 0x00cb }
            long r0 = r4.length()     // Catch:{ IOException -> 0x00cb }
            r2.A08(r0)     // Catch:{ IOException -> 0x00cb }
            int r0 = X.AnonymousClass1GW.A03(r4)     // Catch:{ IOException -> 0x00cb }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ IOException -> 0x00cb }
            X.58x r4 = r2.A02     // Catch:{ IOException -> 0x00cb }
            r4.A0S = r0     // Catch:{ IOException -> 0x00cb }
            r0 = 2
            r2.A05(r0)     // Catch:{ IOException -> 0x00cb }
            r0 = 3
            r2.A04(r0)     // Catch:{ IOException -> 0x00cb }
            X.58v r5 = r2.A01     // Catch:{ IOException -> 0x00cb }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x00cb }
            r5.A01 = r0     // Catch:{ IOException -> 0x00cb }
            r4.A01 = r0     // Catch:{ IOException -> 0x00cb }
            java.lang.Boolean r0 = X.C36381kD.A0j()     // Catch:{ IOException -> 0x00cb }
            r5.A00 = r0     // Catch:{ IOException -> 0x00cb }
            int r0 = r10.A0B     // Catch:{ IOException -> 0x00cb }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ IOException -> 0x00cb }
            r5.A06 = r0     // Catch:{ IOException -> 0x00cb }
            r4.A0G = r0     // Catch:{ IOException -> 0x00cb }
            long r0 = r11.length()     // Catch:{ IOException -> 0x00cb }
            r2.A07(r0)     // Catch:{ IOException -> 0x00cb }
            long r0 = X.AnonymousClass1GX.A02(r11)     // Catch:{ IOException -> 0x00cb }
            long r0 = X.C36391kE.A0B(r0)     // Catch:{ IOException -> 0x00cb }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00cb }
            r5.A05 = r0     // Catch:{ IOException -> 0x00cb }
            r4.A0F = r0     // Catch:{ IOException -> 0x00cb }
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x00cb }
            r4.A06 = r0     // Catch:{ IOException -> 0x00cb }
            r2.A03()     // Catch:{ IOException -> 0x00cb }
            int r0 = r10.A0B     // Catch:{ IOException -> 0x00cb }
            r9.A00 = r0     // Catch:{ IOException -> 0x00cb }
            r9.A01 = r1     // Catch:{ IOException -> 0x00cb }
            r9.A00 = r11     // Catch:{ IOException -> 0x00cb }
            r9.A03 = r3     // Catch:{ IOException -> 0x00cb }
            r9.A02 = r1     // Catch:{ IOException -> 0x00cb }
            X.5Bd r0 = r9.A00()     // Catch:{ IOException -> 0x00cb }
            return r0
        L_0x00cb:
            r1 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/attemptReuseExistingVideo"
            com.whatsapp.util.Log.e(r0, r1)
            X.AnonymousClass6YY.A0P(r11)
        L_0x00d4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104805Bl.A00(X.5BZ, X.2bU, java.io.File):X.5Bd");
    }

    private void A01(C132466Tv r14, AnonymousClass6BV r15, C146526vk r16, int i, int i2, long j) {
        C1042458v r5 = r14.A01;
        r5.A0R = "transcode";
        C1042658x r6 = r14.A02;
        r6.A0A = C36361kB.A0i();
        Long A0y = C36441kJ.A0y(r15.A02);
        r5.A0D = A0y;
        r6.A0X = A0y;
        AnonymousClass5BY r1 = this.A0B;
        C146526vk r2 = r16;
        r2.A0C = r1.A09;
        int i3 = r15.A00;
        int i4 = 9;
        if (r1.A07) {
            i4 = 6;
        }
        r2.A00 = AnonymousClass1GJ.A00(i3, i, i2, i4, j);
        r2.A0I();
        long j2 = (long) r2.A01;
        if (j2 > 0) {
            Long valueOf = Long.valueOf(C36391kE.A0B(j2));
            r5.A0M = valueOf;
            r6.A0W = valueOf;
        }
    }

    private void A03(Exception exc) {
        AnonymousClass58Y r1 = new AnonymousClass58Y();
        r1.A01 = C36371kC.A0p();
        r1.A07 = exc.toString();
        this.A0A.Blw(r1);
    }

    private boolean A04(C132466Tv r4, File file, File file2) {
        r4.A01.A0R = "checkAndRepair";
        C1042658x r2 = r4.A02;
        r2.A0A = C36371kC.A0n();
        this.A0G.A0e(file, file2);
        try {
            boolean A042 = this.A02.A04(this.A03, file2);
            r2.A02 = Boolean.valueOf(A042);
            return A042;
        } catch (AnonymousClass5V4 e) {
            throw e;
        } catch (IOException e2) {
            Log.e("ProcessVideoTask/processVideo/mediatranscodequeue/repair/io-exception/", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ed, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03b5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03b6, code lost:
        com.whatsapp.util.Log.e("mp4ops/removeDolbyEAC3Track/", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03cb, code lost:
        throw new X.AnonymousClass5V4(0, X.C36331k8.A0i("integrity check error: ", X.AnonymousClass000.A0u(), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x047f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        com.whatsapp.util.Log.e("ProcessVideoTask/processVideo/mediatranscodequeue/transcodeVideoWithFallback/exception", r1);
        r4.A04.add("Fallback");
        r2 = A04(r4, r13, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0577, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0578, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0582, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0583, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05bb, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05bc, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05db, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05dc, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ef, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05f0, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0603, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0604, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x060e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x060f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x02ee */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02fc A[Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02fd A[Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0516 A[ADDED_TO_REGION, Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0534 A[Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0577 A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0582 A[ExcHandler: 5V4 (e X.5V4), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05bb A[ExcHandler: IOException (e java.io.IOException), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05db A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05ef A[ExcHandler: 1GK (e X.1GK), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0603 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x060e A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:64:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0693  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C122615v9 A06() {
        /*
            r62 = this;
            java.lang.String r35 = "-"
            java.lang.String r20 = "Mp4OpsFail ("
            r7 = r62
            X.0wG r4 = r7.A05
            X.0wU r3 = r7.A0F
            com.whatsapp.Mp4Ops r0 = r7.A02
            r23 = r0
            X.0yC r0 = r7.A09
            r61 = r0
            X.0wN r2 = r7.A01
            X.1AV r0 = r7.A03
            r60 = r0
            X.1GJ r0 = r7.A0C
            r59 = r0
            X.1Cb r0 = r7.A04
            r58 = r0
            X.0v0 r0 = r7.A06
            r19 = r0
            X.0yW r0 = r7.A0A
            X.6Wt r1 = new X.6Wt
            r8 = r1
            r9 = r2
            r10 = r23
            r11 = r60
            r12 = r58
            r13 = r4
            r14 = r19
            r15 = r61
            r16 = r0
            r17 = r59
            r18 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.5BY r6 = r7.A0B
            java.io.File r0 = r6.A06
            r47 = r0
            X.C21656ATx.A04(r47)     // Catch:{ IOException -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r11 = 0
            goto L_0x004b
        L_0x004a:
            r11 = 1
        L_0x004b:
            r1.A03(r11)
            java.io.File r5 = r6.A06
            long r21 = r47.length()
            long r0 = r6.A02
            r16 = r0
            long r2 = r6.A03
            int r0 = r6.A01
            r34 = r0
            int r0 = r6.A00
            r33 = r0
            android.graphics.RectF r0 = r6.A04
            r18 = r0
            boolean r0 = r6.A08
            r32 = r0
            if (r0 == 0) goto L_0x0145
            X.6BV r31 = r59.A0D()
        L_0x0070:
            X.6Tv r4 = r6.A01
            X.1Gp r0 = r7.A0D
            r1 = r31
            int r1 = r1.A02
            r25 = r1
            r1 = r31
            int r15 = r1.A01
            X.0wG r14 = r0.A03
            X.0yC r13 = r0.A04
            X.0wN r12 = r0.A00
            X.0wU r9 = r0.A06
            X.1GJ r8 = r0.A05
            X.1AV r1 = r0.A01
            X.1Cb r0 = r0.A02
            X.6vk r10 = new X.6vk
            r36 = r10
            r37 = r18
            r38 = r12
            r39 = r23
            r40 = r4
            r41 = r1
            r42 = r0
            r43 = r14
            r44 = r13
            r45 = r8
            r46 = r9
            r48 = r5
            r49 = r34
            r50 = r33
            r51 = r25
            r52 = r15
            r53 = r16
            r55 = r2
            r57 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r57)
            r6.A00(r10)
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r19)
            java.lang.String r0 = "video_transcode_saved_local_config"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            if (r0 == 0) goto L_0x0143
            X.6SH r0 = X.AnonymousClass6SH.A00(r0)
        L_0x00ca:
            r10.A04 = r0
            X.6VQ r0 = r6.A05
            r30 = 0
            if (r0 == 0) goto L_0x00d6
            r30 = 1
            r10.A07 = r0
        L_0x00d6:
            X.5BZ r9 = new X.5BZ
            r9.<init>()
            r1 = 422(0x1a6, float:5.91E-43)
            r0 = r61
            boolean r24 = r0.A0E(r1)
            int r0 = X.C146526vk.A02(r24)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            X.58v r0 = r4.A01
            r42 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.A04 = r1
            X.58x r8 = r4.A02
            r8.A05 = r1
            int r0 = X.AnonymousClass1GW.A03(r47)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.A0S = r0
            r0 = r21
            r4.A08(r0)
            r1 = 3
            r0 = 2
            if (r11 == 0) goto L_0x010d
            r0 = 3
        L_0x010d:
            r4.A05(r0)
            r4.A04(r1)
            boolean r0 = r6.A07
            r23 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            r0 = r42
            r0.A01 = r1
            r8.A01 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r30)
            r0.A00 = r1
            if (r30 == 0) goto L_0x0130
            java.util.HashSet r1 = r4.A03
            java.lang.String r0 = "doodle"
            r1.add(r0)
        L_0x0130:
            r4.A01()
            r1 = 7987(0x1f33, float:1.1192E-41)
            r0 = r61
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x01c6
            X.611 r14 = new X.611
            r14.<init>()
            goto L_0x0152
        L_0x0143:
            r0 = 0
            goto L_0x00ca
        L_0x0145:
            boolean r8 = r6.A07
            boolean r4 = r6.A0A
            r1 = 0
            r0 = r59
            X.6BV r31 = r0.A0E(r8, r1, r4)
            goto L_0x0070
        L_0x0152:
            java.lang.String r1 = r47.getAbsolutePath()     // Catch:{ Exception -> 0x019e }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ Exception -> 0x019e }
            android.media.MediaExtractor r13 = r14.A00     // Catch:{ Exception -> 0x019e }
            r13.setDataSource(r1)     // Catch:{ Exception -> 0x019e }
            int r15 = r13.getTrackCount()     // Catch:{ Exception -> 0x019e }
            r12 = 0
        L_0x0164:
            if (r12 >= r15) goto L_0x01c3
            android.media.MediaFormat r11 = r13.getTrackFormat(r12)     // Catch:{ Exception -> 0x019e }
            X.AnonymousClass00C.A08(r11)     // Catch:{ Exception -> 0x019e }
            java.lang.String r0 = "mime"
            java.lang.String r1 = r11.getString(r0)     // Catch:{ Exception -> 0x019e }
            if (r1 == 0) goto L_0x0190
            java.lang.String r0 = "audio/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x019e }
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = "sample-rate"
            boolean r1 = r11.containsKey(r0)     // Catch:{ Exception -> 0x019e }
            if (r1 == 0) goto L_0x0190
            int r1 = r11.getInteger(r0)     // Catch:{ Exception -> 0x019e }
            if (r1 == 0) goto L_0x0193
            r0 = 96000(0x17700, float:1.34525E-40)
            if (r1 > r0) goto L_0x0193
        L_0x0190:
            int r12 = r12 + 1
            goto L_0x0164
        L_0x0193:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/sample rate zero"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x019e }
            X.5LX r0 = new X.5LX     // Catch:{ Exception -> 0x019e }
            r0.<init>()     // Catch:{ Exception -> 0x019e }
            throw r0     // Catch:{ Exception -> 0x019e }
        L_0x019e:
            r1 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/bad track format"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01bc }
            r7.A03(r1)     // Catch:{ all -> 0x01bc }
            A02(r4, r1)     // Catch:{ all -> 0x01bc }
            r4.A02()     // Catch:{ all -> 0x01bc }
            r1 = 2131889277(0x7f120c7d, float:1.9413213E38)
            X.7gs r0 = r6.A05     // Catch:{ all -> 0x01bc }
            r0.B5i(r1)     // Catch:{ all -> 0x01bc }
            android.media.MediaExtractor r0 = r14.A00
            r0.release()
            goto L_0x0696
        L_0x01bc:
            r1 = move-exception
            android.media.MediaExtractor r0 = r14.A00
            r0.release()
            throw r1
        L_0x01c3:
            r13.release()
        L_0x01c6:
            boolean r0 = r6.A09
            r29 = r0
            if (r0 == 0) goto L_0x01d3
            java.lang.String r1 = "muted"
            java.util.HashSet r0 = r4.A03
            r0.add(r1)
        L_0x01d3:
            r18 = 0
            int r27 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r27 < 0) goto L_0x01e4
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e4
            java.lang.String r1 = "trim"
            java.util.HashSet r0 = r4.A03
            r0.add(r1)
        L_0x01e4:
            java.util.Objects.requireNonNull(r6)
            r28 = 2
            X.7sT r1 = new X.7sT
            r0 = 2
            r1.<init>(r6, r0)
            r10.A05 = r1
            X.0z4 r0 = r7.A07     // Catch:{ Exception -> 0x01ff }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01ff }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x01ff }
            goto L_0x0205
        L_0x01ff:
            r1 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0205:
            android.os.PowerManager$WakeLock r0 = r7.A00     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r26 = r0
            if (r0 == 0) goto L_0x020e
            r26.acquire()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x020e:
            boolean r0 = r47.exists()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0565
            int r1 = X.C146526vk.A02(r24)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = 1
            if (r1 != r0) goto L_0x04aa
            X.67y r12 = new X.67y     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = r47
            r12.<init>(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = X.C19550w8.A01()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0241
            boolean r0 = X.C111785cq.A00(r12)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x022c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x023a
            r0 = 4
            r4.A05(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x023a:
            int r11 = r12.A02     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            int r1 = r12.A00     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r11 == 0) goto L_0x04a3
            goto L_0x0243
        L_0x0241:
            r0 = 0
            goto L_0x022c
        L_0x0243:
            if (r1 == 0) goto L_0x04a3
            int r13 = java.lang.Math.max(r11, r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = r25
            int r0 = java.lang.Math.min(r0, r13)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            android.util.Pair r1 = X.AnonymousClass1GJ.A05(r11, r1, r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.Object r0 = r1.first     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            int r25 = X.C90514aH.A0H(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.Object r0 = r1.second     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            int r24 = X.C90514aH.A0H(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r11 = r6.A0B     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            long r0 = r12.A03     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r40 = r0
            long r13 = X.C36391kE.A0B(r40)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r15 = r59
            r0 = r21
            android.util.Pair r14 = r15.A0C(r0, r13)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r1 = 5178(0x143a, float:7.256E-42)
            r0 = r61
            boolean r1 = r0.A0E(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r4.A09(r12)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r27 != 0) goto L_0x032b
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x032b
            if (r30 != 0) goto L_0x032b
            if (r11 != 0) goto L_0x028e
            java.lang.Object r0 = r14.first     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x032b
        L_0x028e:
            if (r1 != 0) goto L_0x032b
            java.lang.String r0 = "mediatranscodequeue/attemptToDedupeVideo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r13 = X.AnonymousClass6UG.A00(r47)     // Catch:{ IOException -> 0x02ed, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            if (r32 == 0) goto L_0x02ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r13)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "-hd"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r0 = 2
            java.lang.String r13 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x02ae:
            if (r29 == 0) goto L_0x02c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r13)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "-mute"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r0 = 2
            java.lang.String r13 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x02c3:
            if (r34 <= 0) goto L_0x02e3
            if (r33 <= 0) goto L_0x02e3
            r0 = r35
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r13, r0)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r0 = r34
            r1.append(r0)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r15 = r35
            r0 = r33
            java.lang.String r0 = X.AnonymousClass000.A0r(r15, r1, r0)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r0 = 2
            java.lang.String r13 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x02e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "mediatranscodequeue/computedHash="
            X.C36321k7.A1Q(r0, r13, r1)     // Catch:{ IOException -> 0x02ee, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x02ee
        L_0x02ed:
            r13 = 0
        L_0x02ee:
            X.1DF r1 = r7.A08     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            X.2bU r0 = r1.A0B(r13)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x02fd
            X.5Bd r21 = r7.A00(r9, r0, r5)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r21 == 0) goto L_0x02fd
            goto L_0x031c
        L_0x02fd:
            if (r13 == 0) goto L_0x0329
            r0 = 3
            java.util.ArrayList r0 = r1.A0F(r13, r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x0308:
            boolean r0 = r15.hasNext()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0329
            X.2bU r1 = X.C36441kJ.A0r(r15)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = r1 instanceof X.C181798o3     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0308
            X.5Bd r21 = r7.A00(r9, r1, r5)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r21 == 0) goto L_0x0308
        L_0x031c:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            X.C90464aC.A0t(r26)
            X.0z4 r0 = r7.A07
            r0.A02()
            return r21
        L_0x0329:
            r9.A01 = r13     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x032b:
            r1 = r25
            r0 = r24
            r4.A06(r1, r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            X.1DA r0 = X.AnonymousClass1DC.A04(r47)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = 8
            if (r1 != r0) goto L_0x03cf
            java.lang.String r0 = "mediatranscodequeue/needs dolby EAC3 Audio track removal"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r1 = r58
            r0 = r47
            java.io.File r13 = r1.A01(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r1 = r60
            r0 = r47
            X.58q r15 = r1.A03(r0, r13)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = r47.getAbsolutePath()     // Catch:{ Error -> 0x03b5 }
            java.lang.String r1 = r13.getAbsolutePath()     // Catch:{ Error -> 0x03b5 }
            com.whatsapp.Mp4Ops$LibMp4OperationResult r1 = com.whatsapp.Mp4Ops.mp4removeDolbyEAC3Track(r0, r1)     // Catch:{ Error -> 0x03b5 }
            r0 = r60
            r0.A04(r1, r15, r13)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            if (r15 == 0) goto L_0x036e
            X.0yW r0 = r0.A01     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r0.Bly(r15)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x036e:
            boolean r0 = r1.success     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 != 0) goto L_0x03aa
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "mp4ops/check/error_message/"
            r2.append(r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = r1.errorMessage     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            X.C36321k7.A1Z(r2, r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = r1.ioException     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x038b
            java.lang.String r0 = "No space"
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x038a:
            throw r1     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x038b:
            int r3 = r1.errorCode     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "removeDolbyEAC3Track failed, error_code: "
            r2.append(r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r2.append(r3)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = " | message: "
            r2.append(r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = r1.errorMessage     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            X.5V4 r1 = new X.5V4     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r1.<init>(r3, r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x038a
        L_0x03aa:
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r10.A09 = r13     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            X.C146526vk.A0C(r10)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x03d1
        L_0x03b5:
            r3 = move-exception
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "integrity check error: "
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r3)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            X.5V4 r0 = new X.5V4     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            r0.<init>(r2, r1)     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
            throw r0     // Catch:{ 5V4 -> 0x03cc, IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, InterruptedException | ExecutionException -> 0x0577, InterruptedException | ExecutionException -> 0x0577 }
        L_0x03cc:
            r0 = move-exception
            goto L_0x0576
        L_0x03cf:
            r13 = r47
        L_0x03d1:
            java.lang.String r1 = "NotNeedTranscode"
            if (r27 < 0) goto L_0x0427
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0427
            r13 = 3
            r0 = r31
            android.util.Pair r12 = X.AnonymousClass1GJ.A06(r0, r12, r13)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r11 != 0) goto L_0x0424
            java.lang.Object r0 = r12.first     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 != 0) goto L_0x0424
            java.util.HashSet r11 = r4.A04     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r11.add(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.Object r0 = r12.second     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x03f7:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0405
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r11.add(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x03f7
        L_0x0405:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "mediatranscodequeue/trim/from="
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = r16
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = ", to="
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r11.append(r2)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r2 = ", duration="
            r0 = r40
            X.C36321k7.A1V(r2, r11, r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x04b7
        L_0x0424:
            long r2 = r2 - r16
            goto L_0x0494
        L_0x0427:
            java.lang.Object r0 = r14.first     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 != 0) goto L_0x0457
            if (r11 != 0) goto L_0x0457
            java.lang.String r0 = "mediatranscodequeue/copy/not-need-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.util.HashSet r2 = r4.A04     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r2.add(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.Object r0 = r14.second     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x0443:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0451
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x0443
        L_0x0451:
            boolean r2 = r7.A04(r4, r13, r5)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x0512
        L_0x0457:
            r1 = 228(0xe4, float:3.2E-43)
            r0 = r61
            boolean r0 = r0.A0E(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0492
            if (r30 != 0) goto L_0x0492
            java.lang.Object r0 = r14.first     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            if (r0 == 0) goto L_0x0492
            if (r11 != 0) goto L_0x0492
            r32 = r7
            r33 = r4
            r34 = r31
            r35 = r10
            r36 = r25
            r37 = r24
            r38 = r40
            r32.A01(r33, r34, r35, r36, r37, r38)     // Catch:{ 1GL | 5V4 | IOException -> 0x047f, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x04c6
        L_0x047f:
            r1 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/transcodeVideoWithFallback/exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r1 = "Fallback"
            java.util.HashSet r0 = r4.A04     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0.add(r1)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            boolean r2 = r7.A04(r4, r13, r5)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x0512
        L_0x0492:
            r2 = r40
        L_0x0494:
            r11 = r7
            r12 = r4
            r13 = r31
            r14 = r10
            r15 = r25
            r16 = r24
            r17 = r2
            r11.A01(r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x04c6
        L_0x04a3:
            X.2hu r0 = new X.2hu     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x0576
        L_0x04aa:
            java.lang.String r11 = "TranscoderNotSupported"
            if (r27 < 0) goto L_0x04c8
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x04c8
            java.util.HashSet r0 = r4.A04     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0.add(r11)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x04b7:
            java.lang.String r1 = "trim"
            r0 = r42
            r0.A0R = r1     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r8.A0A = r0     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r10.A0J()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x04c6:
            r2 = 1
            goto L_0x0512
        L_0x04c8:
            long r0 = r47.length()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            float r2 = (float) r0     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = r31
            int r3 = r0.A00     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            long r0 = (long) r3     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r14 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r14
            float r13 = (float) r0     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r12 = 1069547520(0x3fc00000, float:1.5)
            float r13 = r13 * r12
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0571
            java.util.HashSet r2 = r4.A04     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r2.add(r11)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "inputSize<=1.5TimesMaxSize | "
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            long r0 = r47.length()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            long r0 = r0 / r14
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "Mb < "
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            float r0 = (float) r3     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            float r0 = r0 * r12
            r11.append(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "Mb"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r11)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "mediatranscodequeue/copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0 = r47
            boolean r2 = r7.A04(r4, r0, r5)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x0512:
            boolean r0 = r10.A0Y     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            if (r0 != 0) goto L_0x0534
            if (r29 == 0) goto L_0x0523
            boolean r0 = r10.A0Z     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            if (r0 != 0) goto L_0x0523
            r1 = r60
            r0 = r58
            com.whatsapp.Mp4Ops.A00(r1, r0, r5)     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
        L_0x0523:
            X.1DC r0 = r7.A0E     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            boolean r0 = r0.A0G(r5)     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            if (r0 == 0) goto L_0x052d
            r10 = 1
            goto L_0x053e
        L_0x052d:
            java.lang.String r0 = "video was not transcoded correctly"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            throw r0     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
        L_0x0534:
            java.lang.String r0 = "cancel"
            r4.A0A(r0)     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            java.lang.String r0 = "Cancel"
            r8.A0e = r0     // Catch:{ IllegalStateException -> 0x0611, IllegalArgumentException -> 0x0606, 1GK -> 0x05f2, FileNotFoundException -> 0x05de, IOException -> 0x05be, 5V4 -> 0x0585, InterruptedException | ExecutionException -> 0x057a }
            r10 = 0
        L_0x053e:
            android.util.Pair r3 = X.AnonymousClass1GW.A0D(r5)     // Catch:{ IllegalStateException -> 0x0562, IllegalArgumentException -> 0x055f, 1GK -> 0x055c, FileNotFoundException -> 0x0559, IOException -> 0x0557, 5V4 -> 0x0555, InterruptedException | ExecutionException -> 0x0553 }
            java.lang.Object r0 = r3.second     // Catch:{ IllegalStateException -> 0x0562, IllegalArgumentException -> 0x055f, 1GK -> 0x055c, FileNotFoundException -> 0x0559, IOException -> 0x0557, 5V4 -> 0x0555, InterruptedException | ExecutionException -> 0x0553 }
            int r1 = X.C90514aH.A0H(r0)     // Catch:{ IllegalStateException -> 0x0562, IllegalArgumentException -> 0x055f, 1GK -> 0x055c, FileNotFoundException -> 0x0559, IOException -> 0x0557, 5V4 -> 0x0555, InterruptedException | ExecutionException -> 0x0553 }
            java.lang.Object r0 = r3.first     // Catch:{ IllegalStateException -> 0x0562, IllegalArgumentException -> 0x055f, 1GK -> 0x055c, FileNotFoundException -> 0x0559, IOException -> 0x0557, 5V4 -> 0x0555, InterruptedException | ExecutionException -> 0x0553 }
            int r0 = X.C90514aH.A0H(r0)     // Catch:{ IllegalStateException -> 0x0562, IllegalArgumentException -> 0x055f, 1GK -> 0x055c, FileNotFoundException -> 0x0559, IOException -> 0x0557, 5V4 -> 0x0555, InterruptedException | ExecutionException -> 0x0553 }
            r4.A06(r1, r0)     // Catch:{ IllegalStateException -> 0x0562, IllegalArgumentException -> 0x055f, 1GK -> 0x055c, FileNotFoundException -> 0x0559, IOException -> 0x0557, 5V4 -> 0x0555, InterruptedException | ExecutionException -> 0x0553 }
            goto L_0x062f
        L_0x0553:
            r1 = move-exception
            goto L_0x057c
        L_0x0555:
            r3 = move-exception
            goto L_0x0587
        L_0x0557:
            r1 = move-exception
            goto L_0x05c0
        L_0x0559:
            r1 = move-exception
            goto L_0x05e0
        L_0x055c:
            r1 = move-exception
            goto L_0x05f4
        L_0x055f:
            r1 = move-exception
            goto L_0x0608
        L_0x0562:
            r1 = move-exception
            goto L_0x0613
        L_0x0565:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            java.lang.String r0 = "transcode input file does not exist"
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r0)     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            goto L_0x0576
        L_0x0571:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x0576:
            throw r0     // Catch:{ IllegalStateException -> 0x060e, IllegalArgumentException -> 0x0603, 1GK -> 0x05ef, FileNotFoundException -> 0x05db, IOException -> 0x05bb, 5V4 -> 0x0582, InterruptedException | ExecutionException -> 0x0577 }
        L_0x0577:
            r1 = move-exception
            r2 = 1
            goto L_0x057b
        L_0x057a:
            r1 = move-exception
        L_0x057b:
            r10 = 0
        L_0x057c:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/ExecutionException or InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0698 }
            goto L_0x05f9
        L_0x0582:
            r3 = move-exception
            r2 = 1
            goto L_0x0586
        L_0x0585:
            r3 = move-exception
        L_0x0586:
            r10 = 0
        L_0x0587:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0698 }
            r7.A03(r3)     // Catch:{ all -> 0x0698 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r20)     // Catch:{ all -> 0x0698 }
            int r0 = r3.errorCode     // Catch:{ all -> 0x0698 }
            r1.append(r0)     // Catch:{ all -> 0x0698 }
            java.lang.String r0 = ") | "
            r1.append(r0)     // Catch:{ all -> 0x0698 }
            java.lang.String r0 = r3.detailMessage     // Catch:{ all -> 0x0698 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0698 }
            r4.A0A(r0)     // Catch:{ all -> 0x0698 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r20)     // Catch:{ all -> 0x0698 }
            int r0 = r3.errorCode     // Catch:{ all -> 0x0698 }
            r1.append(r0)     // Catch:{ all -> 0x0698 }
            java.lang.String r0 = X.C90474aD.A0f(r1)     // Catch:{ all -> 0x0698 }
            r8.A0e = r0     // Catch:{ all -> 0x0698 }
            java.lang.String r0 = r3.detailMessage     // Catch:{ all -> 0x0698 }
            r4.A0B(r0)     // Catch:{ all -> 0x0698 }
            goto L_0x05ff
        L_0x05bb:
            r1 = move-exception
            r2 = 1
            goto L_0x05bf
        L_0x05be:
            r1 = move-exception
        L_0x05bf:
            r10 = 0
        L_0x05c0:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/ioexception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0698 }
            r7.A03(r1)     // Catch:{ all -> 0x0698 }
            A02(r4, r1)     // Catch:{ all -> 0x0698 }
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0698 }
            if (r0 == 0) goto L_0x0626
            boolean r0 = X.C90504aG.A1Y(r1)     // Catch:{ all -> 0x0698 }
            if (r0 == 0) goto L_0x0626
            r1 = 2131889309(0x7f120c9d, float:1.9413278E38)
            goto L_0x0621
        L_0x05db:
            r1 = move-exception
            r2 = 1
            goto L_0x05df
        L_0x05de:
            r1 = move-exception
        L_0x05df:
            r10 = 0
        L_0x05e0:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0698 }
            r7.A03(r1)     // Catch:{ all -> 0x0698 }
            A02(r4, r1)     // Catch:{ all -> 0x0698 }
            r1 = 2131889298(0x7f120c92, float:1.9413256E38)
            goto L_0x0621
        L_0x05ef:
            r1 = move-exception
            r2 = 1
            goto L_0x05f3
        L_0x05f2:
            r1 = move-exception
        L_0x05f3:
            r10 = 0
        L_0x05f4:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/bad video"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0698 }
        L_0x05f9:
            r7.A03(r1)     // Catch:{ all -> 0x0698 }
            A02(r4, r1)     // Catch:{ all -> 0x0698 }
        L_0x05ff:
            r1 = 2131889277(0x7f120c7d, float:1.9413213E38)
            goto L_0x0621
        L_0x0603:
            r1 = move-exception
            r2 = 1
            goto L_0x0607
        L_0x0606:
            r1 = move-exception
        L_0x0607:
            r10 = 0
        L_0x0608:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0698 }
            goto L_0x0618
        L_0x060e:
            r1 = move-exception
            r2 = 1
            goto L_0x0612
        L_0x0611:
            r1 = move-exception
        L_0x0612:
            r10 = 0
        L_0x0613:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0698 }
        L_0x0618:
            r7.A03(r1)     // Catch:{ all -> 0x0698 }
            A02(r4, r1)     // Catch:{ all -> 0x0698 }
            r1 = 2131889323(0x7f120cab, float:1.9413306E38)
        L_0x0621:
            X.7gs r0 = r6.A05     // Catch:{ all -> 0x0698 }
            r0.B5i(r1)     // Catch:{ all -> 0x0698 }
        L_0x0626:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            android.os.PowerManager$WakeLock r0 = r7.A00
            r26 = r0
            goto L_0x0633
        L_0x062f:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
        L_0x0633:
            X.C90464aC.A0t(r26)
            X.0z4 r0 = r7.A07
            r0.A02()
            if (r10 == 0) goto L_0x0693
            if (r23 == 0) goto L_0x068e
            X.5qP r0 = A0L
            r3 = 48
        L_0x0643:
            int r1 = r0.A01
            r0 = r23 ^ 1
            byte[] r6 = X.AnonymousClass1GX.A0d(r5, r3, r1, r0)
            if (r27 <= 0) goto L_0x0654
            if (r6 != 0) goto L_0x0654
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0654:
            int r3 = X.AnonymousClass1GW.A04(r5)
            java.lang.Long r1 = X.C36441kJ.A0y(r3)
            r0 = r42
            r0.A06 = r1
            r8.A0G = r1
            long r0 = r5.length()
            r4.A07(r0)
            long r0 = X.AnonymousClass1GX.A02(r5)
            long r0 = X.C36391kE.A0B(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r42
            r0.A05 = r1
            r8.A0F = r1
            r4.A03()
            r9.A00 = r3
            r9.A01 = r2
            r9.A00 = r5
            r9.A03 = r6
            r0 = 1
        L_0x0687:
            r9.A02 = r0
            X.5Bd r21 = r9.A00()
            return r21
        L_0x068e:
            X.5qP r0 = A0K
            r3 = 30
            goto L_0x0643
        L_0x0693:
            r4.A02()
        L_0x0696:
            r0 = 0
            goto L_0x0687
        L_0x0698:
            r1 = move-exception
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            android.os.PowerManager$WakeLock r0 = r7.A00
            X.C90464aC.A0t(r0)
            X.0z4 r0 = r7.A07
            r0.A02()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104805Bl.A06():X.5v9");
    }

    public C104805Bl(PowerManager.WakeLock wakeLock, C19700wN r3, C20690y0 r4, Mp4Ops mp4Ops, AnonymousClass1AV r6, C24341Cb r7, C19630wG r8, C19420v0 r9, C21350z4 r10, AnonymousClass1DF r11, C20810yC r12, C21010yW r13, AnonymousClass1EJ r14, AnonymousClass5BY r15, AnonymousClass1GJ r16, C25511Gp r17, C24051Aw r18, AnonymousClass1GX r19, AnonymousClass1DC r20, C19770wU r21) {
        super(r15);
        this.A05 = r8;
        this.A0F = r21;
        this.A02 = mp4Ops;
        this.A09 = r12;
        this.A01 = r3;
        this.A0G = r4;
        this.A0A = r13;
        this.A0J = r19;
        this.A0C = r16;
        this.A03 = r6;
        this.A07 = r10;
        this.A08 = r11;
        this.A04 = r7;
        this.A0E = r20;
        this.A06 = r9;
        this.A0I = r18;
        this.A0D = r17;
        this.A0H = r14;
        this.A00 = wakeLock;
        this.A0B = r15;
    }

    public static void A02(C132466Tv r3, Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0k = AnonymousClass000.A0k(exc);
        A0u.append(A0k);
        C90474aD.A1K(" | ", A0u, exc);
        A0u.append(" | stack: ");
        r3.A0A(AnonymousClass000.A0q(Arrays.toString(exc.getStackTrace()), A0u));
        AnonymousClass75H.A05(r3, r3.A02, A0k, exc);
    }
}
