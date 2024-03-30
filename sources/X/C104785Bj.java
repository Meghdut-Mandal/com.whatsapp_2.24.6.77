package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import java.util.Arrays;

/* renamed from: X.5Bj  reason: invalid class name and case insensitive filesystem */
public final class C104785Bj extends AnonymousClass75H {
    public final C19700wN A00;
    public final C20690y0 A01;
    public final Mp4Ops A02;
    public final AnonymousClass1AV A03;
    public final C24341Cb A04;
    public final C19630wG A05;
    public final C19420v0 A06;
    public final C21350z4 A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final AnonymousClass5BX A0A;
    public final AnonymousClass1GJ A0B;
    public final C25511Gp A0C;
    public final AnonymousClass1DC A0D;
    public final C19770wU A0E;
    public final PowerManager.WakeLock A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104785Bj(PowerManager.WakeLock wakeLock, C19700wN r3, C20690y0 r4, Mp4Ops mp4Ops, AnonymousClass1AV r6, C24341Cb r7, C19630wG r8, C19420v0 r9, C21350z4 r10, C20810yC r11, C21010yW r12, AnonymousClass5BX r13, AnonymousClass1GJ r14, C25511Gp r15, AnonymousClass1DC r16, C19770wU r17) {
        super(r13);
        AnonymousClass00C.A0D(r13, 14);
        this.A05 = r8;
        this.A0E = r17;
        this.A02 = mp4Ops;
        this.A08 = r11;
        this.A00 = r3;
        this.A01 = r4;
        this.A0B = r14;
        this.A03 = r6;
        this.A07 = r10;
        this.A04 = r7;
        this.A0D = r16;
        this.A06 = r9;
        this.A0C = r15;
        this.A0A = r13;
        this.A09 = r12;
        this.A0F = wakeLock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0360, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0361, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0363, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0364, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x039b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x039c, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03ab, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b4, code lost:
        if (X.AnonymousClass099.A0O(r3, "No space", false) == true) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b6, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ba, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03bb, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03c8, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c9, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03dc, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03dd, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03df, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e0, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0445, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0446, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0452, code lost:
        r33.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0455, code lost:
        r7.A07.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x045a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ee, code lost:
        if (r27 <= 0) goto L_0x01f0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0309 A[Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0360 A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0363 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x039b A[ExcHandler: IOException (e java.io.IOException), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03ab A[Catch:{ all -> 0x0442 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ba A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03c8 A[ExcHandler: 1GK (e X.1GK), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03dc A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03df A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:37:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ca A[Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C122615v9 A06() {
        /*
            r61 = this;
            r7 = r61
            X.5BX r6 = r7.A0A
            X.6Tv r5 = r6.A01
            android.os.PowerManager$WakeLock r0 = r7.A0F
            r33 = r0
            java.lang.String r32 = "Mp4OpsFail ("
            X.5BZ r31 = new X.5BZ
            r31.<init>()
            X.0wG r4 = r7.A05
            X.0wU r3 = r7.A0E
            com.whatsapp.Mp4Ops r0 = r7.A02
            r37 = r0
            X.0yC r15 = r7.A08
            X.0wN r2 = r7.A00
            X.1AV r0 = r7.A03
            r60 = r0
            X.1GJ r0 = r7.A0B
            r59 = r0
            X.1Cb r0 = r7.A04
            r58 = r0
            X.0v0 r0 = r7.A06
            r57 = r0
            X.0yW r0 = r7.A09
            X.6Wt r1 = new X.6Wt
            r8 = r1
            r9 = r2
            r10 = r37
            r11 = r60
            r12 = r58
            r13 = r4
            r14 = r57
            r16 = r0
            r17 = r59
            r18 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.io.File r0 = r6.A06
            r30 = r0
            r56 = 0
            if (r0 == 0) goto L_0x0053
            X.C21656ATx.A04(r30)     // Catch:{ IOException -> 0x0055 }
            r3 = 1
            r0 = 3
            goto L_0x0057
        L_0x0053:
            r3 = 0
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            r0 = 2
        L_0x0057:
            r5.A05(r0)
            r1.A03(r3)
            java.io.File r14 = r6.A06
            r0 = 422(0x1a6, float:5.91E-43)
            boolean r29 = r15.A0E(r0)
            int r0 = X.C146526vk.A02(r29)
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r2)
            X.58v r8 = r5.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A04 = r0
            X.58x r4 = r5.A02
            r4.A05 = r0
            r0 = 13
            r5.A04(r0)
            r5.A01()
            if (r30 != 0) goto L_0x00aa
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/failed to load, check MediaLoadGifJob logs to see details."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "FailedToLoad"
            r5.A0A(r0)
            r4.A0e = r0
            java.lang.String r0 = "Input file null"
            r5.A0B(r0)
            r1 = 2131889322(0x7f120caa, float:1.9413304E38)
            X.7gs r0 = r6.A05
            r0.B5i(r1)
        L_0x009d:
            r5.A02()
            r1 = 0
        L_0x00a1:
            r0 = r31
            r0.A02 = r1
            X.5Bd r0 = r31.A00()
            return r0
        L_0x00aa:
            long r0 = r6.A02
            r16 = r0
            long r0 = r6.A03
            r19 = r0
            int r0 = r6.A01
            r28 = r0
            int r0 = r6.A00
            r27 = r0
            android.graphics.RectF r0 = r6.A04
            r24 = r0
            r0 = 3656(0xe48, float:5.123E-42)
            int r10 = r15.A07(r0)
            boolean r1 = r6.A07
            r0 = 3654(0xe46, float:5.12E-42)
            if (r1 == 0) goto L_0x00cc
            r0 = 594(0x252, float:8.32E-43)
        L_0x00cc:
            int r1 = r15.A07(r0)
            r0 = 1280(0x500, float:1.794E-42)
            int r13 = java.lang.Math.min(r1, r0)
            r0 = 3655(0xe47, float:5.122E-42)
            int r0 = r15.A07(r0)
            long r0 = X.C36371kC.A07(r0)
            int r9 = (int) r0
            X.6BV r26 = new X.6BV
            r0 = r26
            r0.<init>(r10, r13, r9)
            X.1Gp r1 = r7.A0C
            X.0wG r0 = r1.A03
            r23 = r0
            X.0yC r0 = r1.A04
            r22 = r0
            X.0wN r0 = r1.A00
            r21 = r0
            X.0wU r0 = r1.A06
            r18 = r0
            X.1GJ r0 = r1.A05
            r12 = r0
            X.1AV r11 = r1.A01
            X.1Cb r0 = r1.A02
            X.6vk r10 = new X.6vk
            r34 = r10
            r35 = r24
            r36 = r21
            r38 = r5
            r39 = r11
            r40 = r0
            r41 = r23
            r42 = r22
            r43 = r12
            r44 = r18
            r45 = r30
            r46 = r14
            r47 = r28
            r48 = r27
            r49 = r13
            r50 = r9
            r51 = r16
            r53 = r19
            r55 = r3
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55)
            r6.A00(r10)
            X.6VQ r0 = r6.A05
            if (r0 == 0) goto L_0x0137
            r56 = 1
            r10.A07 = r0
        L_0x0137:
            long r24 = r30.length()
            r0 = r24
            r5.A08(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r56)
            r8.A00 = r0
            if (r56 == 0) goto L_0x014f
            java.util.HashSet r1 = r5.A03
            java.lang.String r0 = "doodle"
            r1.add(r0)
        L_0x014f:
            int r0 = X.AnonymousClass1GW.A03(r30)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A0S = r0
            r22 = 0
            int r21 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r21 < 0) goto L_0x016a
            int r0 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x016a
            java.lang.String r1 = "trim"
            java.util.HashSet r0 = r5.A03
            r0.add(r1)
        L_0x016a:
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r57)
            java.lang.String r0 = "video_transcode_saved_local_config"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            if (r0 == 0) goto L_0x017c
            X.6SH r0 = X.AnonymousClass6SH.A00(r0)
            r10.A04 = r0
        L_0x017c:
            r18 = 1
            X.7sT r0 = new X.7sT
            r0.<init>(r7, r2)
            r10.A05 = r0
            r10.A0B = r2
            X.0z4 r0 = r7.A07     // Catch:{ Exception -> 0x0195 }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0195 }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x0195 }
            goto L_0x019b
        L_0x0195:
            r1 = move-exception
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x019b:
            if (r33 == 0) goto L_0x01a0
            r33.acquire()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x01a0:
            boolean r0 = r30.exists()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 == 0) goto L_0x034d
            X.67y r12 = new X.67y     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r0 = r30
            r12.<init>(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r3 != 0) goto L_0x01c7
            boolean r0 = X.C19550w8.A01()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 == 0) goto L_0x01cc
            boolean r0 = X.C111785cq.A00(r12)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x01b9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 == 0) goto L_0x01c7
            r0 = 4
            r5.A05(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x01c7:
            int r0 = X.C146526vk.A02(r29)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x01ce
        L_0x01cc:
            r0 = 0
            goto L_0x01b9
        L_0x01ce:
            java.lang.String r17 = "mediatranscodequeue/gif/trim"
            java.lang.String r16 = "mediatranscodequeue/gif/apply-gif-tag-only"
            if (r0 != r2) goto L_0x0292
            int r11 = r12.A02     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            int r9 = r12.A00     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r11 < r9) goto L_0x01e8
            int r9 = r9 * r13
            int r9 = r9 / r11
            r11 = r13
        L_0x01dd:
            long r2 = X.AnonymousClass1GW.A06(r30)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            long r2 = r2 / r0
            if (r28 <= 0) goto L_0x01f0
            goto L_0x01ec
        L_0x01e8:
            int r11 = r11 * r13
            int r11 = r11 / r9
            r9 = r13
            goto L_0x01dd
        L_0x01ec:
            r55 = 1
            if (r27 > 0) goto L_0x01f2
        L_0x01f0:
            r55 = 0
        L_0x01f2:
            r13 = r59
            r0 = r24
            android.util.Pair r1 = r13.A0C(r0, r2)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            X.1Gl r51 = X.C25471Gl.A04     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r50 = r13
            r52 = r30
            r53 = r24
            boolean r13 = r50.A0J(r51, r52, r53, r55, r56)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r2 = 13
            r0 = r26
            android.util.Pair r3 = X.AnonymousClass1GJ.A06(r0, r12, r2)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r13 != 0) goto L_0x0260
            java.lang.Object r0 = r1.first     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 != 0) goto L_0x0260
            java.lang.Object r0 = r3.first     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "MediaEligibleToSend"
            java.util.HashSet r2 = r5.A04     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.Object r0 = r1.second     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x0235:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 == 0) goto L_0x0243
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x0235
        L_0x0243:
            java.lang.Object r0 = r3.second     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x024b:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 == 0) goto L_0x0259
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x024b
        L_0x0259:
            if (r21 < 0) goto L_0x02bb
            int r0 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x02bb
            goto L_0x02a3
        L_0x0260:
            java.lang.String r0 = "mediatranscodequeue/gif/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            float r0 = X.C146526vk.A00(r11, r9)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r10.A00 = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.String r0 = "transcode"
            r8.A0R = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r4.A0A = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r10.A0I()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r5.A09(r12)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r5.A06(r11, r9)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            int r0 = r10.A01     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b3
            long r0 = X.C36391kE.A0B(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r8.A0M = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r4.A0W = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x02b3
        L_0x0292:
            boolean r0 = r12.A07     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 != 0) goto L_0x0346
            java.lang.String r1 = "TranscoderNotSupported"
            java.util.HashSet r0 = r5.A04     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r0.add(r1)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r21 < 0) goto L_0x02b5
            int r0 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b5
        L_0x02a3:
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.String r0 = "trim"
            r8.A0R = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r4.A0A = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r10.A0J()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x02b3:
            r2 = 0
            goto L_0x02c6
        L_0x02b5:
            com.whatsapp.util.Log.i((java.lang.String) r16)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            X.0y0 r1 = r7.A01     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x02c0
        L_0x02bb:
            com.whatsapp.util.Log.i((java.lang.String) r16)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            X.0y0 r1 = r7.A01     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x02c0:
            r0 = r30
            r1.A0e(r0, r14)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r2 = 1
        L_0x02c6:
            boolean r0 = r10.A0Y     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 != 0) goto L_0x0309
            boolean r0 = r10.A0Z     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 != 0) goto L_0x02d5
            r1 = r60
            r0 = r58
            com.whatsapp.Mp4Ops.A00(r1, r0, r14)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x02d5:
            if (r2 == 0) goto L_0x02f2
            r1 = r37
            r0 = r60
            boolean r0 = r1.A04(r0, r14)     // Catch:{ 5V4 -> 0x02e6, IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5V4 -> 0x02e6, IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r4.A02 = r0     // Catch:{ 5V4 -> 0x02e6, IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x02e8
        L_0x02e6:
            r0 = move-exception
            goto L_0x035f
        L_0x02e8:
            java.lang.String r0 = "checkAndRepair"
            r8.A0R = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r4.A0A = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x02f2:
            r0 = 8037(0x1f65, float:1.1262E-41)
            boolean r0 = r15.A0E(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 != 0) goto L_0x02ff
            r0 = r58
            com.whatsapp.GifHelper.A00(r0, r14)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x02ff:
            X.1DC r0 = r7.A0D     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            boolean r0 = r0.A0G(r14)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            if (r0 == 0) goto L_0x0359
            r9 = 1
            goto L_0x0313
        L_0x0309:
            java.lang.String r0 = "cancel"
            r5.A0A(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.String r0 = "Cancel"
            r4.A0e = r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            r9 = 0
        L_0x0313:
            android.util.Pair r2 = X.AnonymousClass1GW.A0D(r14)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            java.lang.Object r0 = r2.second     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            int r1 = X.AnonymousClass000.A0I(r0)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            java.lang.Object r0 = r2.first     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            int r0 = X.AnonymousClass000.A0I(r0)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            r5.A06(r1, r0)     // Catch:{ IllegalStateException -> 0x0343, IllegalArgumentException -> 0x0340, 1GK -> 0x033d, FileNotFoundException -> 0x033a, IOException -> 0x0338, 5V4 -> 0x0336, InterruptedException -> 0x0334, ExecutionException -> 0x0331 }
            goto L_0x03f7
        L_0x0331:
            r1 = move-exception
            goto L_0x03d0
        L_0x0334:
            r1 = move-exception
            goto L_0x0365
        L_0x0336:
            r2 = move-exception
            goto L_0x036d
        L_0x0338:
            r1 = move-exception
            goto L_0x039d
        L_0x033a:
            r1 = move-exception
            goto L_0x03bc
        L_0x033d:
            r1 = move-exception
            goto L_0x03ca
        L_0x0340:
            r1 = move-exception
            goto L_0x03e7
        L_0x0343:
            r1 = move-exception
            goto L_0x03e1
        L_0x0346:
            java.lang.String r0 = "cannot transcode gif"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x035f
        L_0x034d:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            java.lang.String r0 = "transcode input file does not exist"
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
            goto L_0x035f
        L_0x0359:
            java.lang.String r0 = "video was not transcoded correctly"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x035f:
            throw r0     // Catch:{ IllegalStateException -> 0x03df, IllegalArgumentException -> 0x03dc, 1GK -> 0x03c8, FileNotFoundException -> 0x03ba, IOException -> 0x039b, 5V4 -> 0x036b, InterruptedException -> 0x0363, ExecutionException -> 0x0360 }
        L_0x0360:
            r1 = move-exception
            r9 = 0
            goto L_0x03d0
        L_0x0363:
            r1 = move-exception
            r9 = 0
        L_0x0365:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
            goto L_0x03d5
        L_0x036b:
            r2 = move-exception
            r9 = 0
        L_0x036d:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0442 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r32)     // Catch:{ all -> 0x0442 }
            int r0 = r2.errorCode     // Catch:{ all -> 0x0442 }
            r1.append(r0)     // Catch:{ all -> 0x0442 }
            java.lang.String r0 = ") | "
            r1.append(r0)     // Catch:{ all -> 0x0442 }
            java.lang.String r0 = r2.detailMessage     // Catch:{ all -> 0x0442 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0442 }
            r5.A0A(r0)     // Catch:{ all -> 0x0442 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r32)     // Catch:{ all -> 0x0442 }
            int r0 = r2.errorCode     // Catch:{ all -> 0x0442 }
            java.lang.String r0 = X.C36321k7.A0G(r1, r0)     // Catch:{ all -> 0x0442 }
            r4.A0e = r0     // Catch:{ all -> 0x0442 }
            java.lang.String r0 = r2.detailMessage     // Catch:{ all -> 0x0442 }
            r5.A0B(r0)     // Catch:{ all -> 0x0442 }
            goto L_0x03d8
        L_0x039b:
            r1 = move-exception
            r9 = 0
        L_0x039d:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/ioexception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
            A00(r5, r1)     // Catch:{ all -> 0x0442 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x0442 }
            if (r3 == 0) goto L_0x03f7
            java.lang.String r2 = "No space"
            r1 = 0
            r0 = 0
            boolean r1 = X.AnonymousClass099.A0O(r3, r2, r0)     // Catch:{ all -> 0x0445 }
            r0 = 1
            if (r1 != r0) goto L_0x03f7
            r1 = 2131889309(0x7f120c9d, float:1.9413278E38)
            goto L_0x03f2
        L_0x03ba:
            r1 = move-exception
            r9 = 0
        L_0x03bc:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
            A00(r5, r1)     // Catch:{ all -> 0x0442 }
            r1 = 2131889296(0x7f120c90, float:1.9413252E38)
            goto L_0x03f2
        L_0x03c8:
            r1 = move-exception
            r9 = 0
        L_0x03ca:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/bad gif"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
            goto L_0x03d5
        L_0x03d0:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/ExecutionException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
        L_0x03d5:
            A00(r5, r1)     // Catch:{ all -> 0x0442 }
        L_0x03d8:
            r1 = 2131889275(0x7f120c7b, float:1.9413209E38)
            goto L_0x03f2
        L_0x03dc:
            r1 = move-exception
            r9 = 0
            goto L_0x03e7
        L_0x03df:
            r1 = move-exception
            r9 = 0
        L_0x03e1:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
            goto L_0x03ec
        L_0x03e7:
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0442 }
        L_0x03ec:
            A00(r5, r1)     // Catch:{ all -> 0x0442 }
            r1 = 2131889322(0x7f120caa, float:1.9413304E38)
        L_0x03f2:
            X.7gs r0 = r6.A05     // Catch:{ all -> 0x0442 }
            r0.B5i(r1)     // Catch:{ all -> 0x0442 }
        L_0x03f7:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            if (r33 == 0) goto L_0x0407
            boolean r1 = r33.isHeld()
            r0 = 1
            if (r1 != r0) goto L_0x0407
            r33.release()
        L_0x0407:
            X.0z4 r0 = r7.A07
            r0.A02()
            if (r9 == 0) goto L_0x009d
            if (r21 > 0) goto L_0x0434
            if (r56 != 0) goto L_0x0434
            r3 = 0
        L_0x0413:
            int r2 = X.AnonymousClass1GW.A04(r14)
            java.lang.Long r0 = X.C36441kJ.A0y(r2)
            r8.A06 = r0
            r4.A0G = r0
            long r0 = r14.length()
            r5.A07(r0)
            r5.A03()
            r0 = r31
            r0.A00 = r2
            r0.A00 = r14
            r0.A03 = r3
            r1 = 1
            goto L_0x00a1
        L_0x0434:
            byte[] r3 = X.C25541Gs.A04(r14)
            if (r21 <= 0) goto L_0x0413
            if (r3 != 0) goto L_0x0413
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0413
        L_0x0442:
            r2 = move-exception
            r1 = 0
            goto L_0x0446
        L_0x0445:
            r2 = move-exception
        L_0x0446:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r1)
            if (r33 == 0) goto L_0x0455
            boolean r1 = r33.isHeld()
            r0 = 1
            if (r1 != r0) goto L_0x0455
            r33.release()
        L_0x0455:
            X.0z4 r0 = r7.A07
            r0.A02()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104785Bj.A06():X.5v9");
    }

    public static final void A00(C132466Tv r3, Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0k = AnonymousClass000.A0k(exc);
        A0u.append(A0k);
        C90474aD.A1K(" | ", A0u, exc);
        A0u.append(" | stack: ");
        r3.A0A(AnonymousClass000.A0q(Arrays.toString(exc.getStackTrace()), A0u));
        AnonymousClass75H.A05(r3, r3.A02, A0k, exc);
    }
}
