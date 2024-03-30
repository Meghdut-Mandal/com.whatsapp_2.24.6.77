package X;

/* renamed from: X.5N5  reason: invalid class name */
public class AnonymousClass5N5 extends C19950wm {
    public final C20690y0 A00;
    public final AnonymousClass1HB A01;
    public final C18820ts A02;
    public final AnonymousClass1H2 A03;
    public final /* synthetic */ AnonymousClass1SX A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N5(C20690y0 r2, C18820ts r3, AnonymousClass1H2 r4, AnonymousClass1HB r5, AnonymousClass1SX r6) {
        super("MessageThumbsThread");
        this.A04 = r6;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a1, code lost:
        if (X.AnonymousClass6YC.A02(r6.A00, r5.A04, r8, r3) >= 262144) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0206, code lost:
        if (r3 == null) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0.A0A <= 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010f, code lost:
        r7 = r5.A03.A00;
        r2 = r6.A03;
        r17 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02ca A[Catch:{ InterruptedException -> 0x02fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e7 A[Catch:{ InterruptedException -> 0x02fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f5 A[ADDED_TO_REGION, Catch:{ InterruptedException -> 0x02fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r26 = this;
            r13 = 10
            android.os.Process.setThreadPriority(r13)
        L_0x0005:
            r6 = r26
            X.1SX r5 = r6.A04     // Catch:{ InterruptedException -> 0x02fa }
            X.1SY r0 = r5.A09     // Catch:{ InterruptedException -> 0x02fa }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.Object r4 = r0.takeLast()     // Catch:{ InterruptedException -> 0x02fa }
            X.67r r4 = (X.C1272867r) r4     // Catch:{ InterruptedException -> 0x02fa }
        L_0x0013:
            java.util.concurrent.atomic.AtomicInteger r15 = r5.A0A     // Catch:{ InterruptedException -> 0x02fa }
            int r2 = r15.get()     // Catch:{ InterruptedException -> 0x02fa }
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r2 > r13) goto L_0x02eb
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x02fa }
            long r0 = X.C52952qR.A00     // Catch:{ InterruptedException -> 0x02fa }
            long r2 = r2 - r0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x0013
        L_0x002e:
            java.lang.Object r10 = r4.A04     // Catch:{ InterruptedException -> 0x02fa }
            android.view.View r14 = r4.A00     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.Object r0 = r14.getTag()     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x02fa }
            r2 = 0
            if (r0 == 0) goto L_0x02db
            X.3T1 r3 = r4.A01     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r3 instanceof X.AnonymousClass2bU     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0255
            X.2bU r3 = (X.AnonymousClass2bU) r3     // Catch:{ InterruptedException -> 0x02fa }
            X.3Qj r7 = r3.A01     // Catch:{ InterruptedException -> 0x02fa }
            r9 = 1
            r22 = 0
            if (r7 == 0) goto L_0x0210
            X.1D5 r1 = r5.A07     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = r7.A0L     // Catch:{ InterruptedException -> 0x02fa }
            X.5z2 r0 = r1.A00(r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x005d
            long r0 = r0.A0A     // Catch:{ InterruptedException -> 0x02fa }
            int r8 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            r1 = 1
            if (r8 > 0) goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.io.File r0 = r7.A0I     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x016f
            boolean r0 = r0.canRead()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x016f
            boolean r0 = r3 instanceof X.C46882bp     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0074
            java.io.File r0 = r7.A0I     // Catch:{ InterruptedException -> 0x02fa }
            android.graphics.Bitmap r3 = X.AnonymousClass1SX.A00(r7, r4, r5, r0, r2)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x01bf
        L_0x0074:
            boolean r0 = r3 instanceof X.C47002cZ     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x013e
            X.3Qa r0 = r3.A1J     // Catch:{ InterruptedException -> 0x02fa }
            boolean r8 = r0.A02     // Catch:{ InterruptedException -> 0x02fa }
            if (r8 == 0) goto L_0x00ed
            boolean r0 = r7.A0V     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r7.A0U     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x00ed
            int r12 = r7.A08     // Catch:{ InterruptedException -> 0x02fa }
            if (r12 <= 0) goto L_0x00d8
            int r11 = r7.A07     // Catch:{ InterruptedException -> 0x02fa }
            if (r11 <= 0) goto L_0x00d8
            long r0 = r7.A0F     // Catch:{ InterruptedException -> 0x02fa }
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 < 0) goto L_0x009c
            long r2 = r7.A0G     // Catch:{ InterruptedException -> 0x02fa }
            int r16 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r16 <= 0) goto L_0x009c
            long r22 = r0 * r17
        L_0x009c:
            android.graphics.RectF r1 = r7.A0H     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r2 = r7.A0I     // Catch:{ InterruptedException -> 0x02fa }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/file=null"
            goto L_0x0250
        L_0x00a6:
            X.C21656ATx.A04(r2)     // Catch:{ IOException -> 0x00be }
            android.graphics.Bitmap r3 = X.C21656ATx.A00(r2)     // Catch:{ IOException | IllegalArgumentException -> 0x00b6, Exception -> 0x00ae }
            goto L_0x00f3
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02db
        L_0x00b6:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02db
        L_0x00be:
            r20 = -1
            X.6vW r0 = new X.6vW     // Catch:{ InterruptedException -> 0x02fa }
            r0.<init>(r2)     // Catch:{ InterruptedException -> 0x02fa }
            r21 = 0
            r24 = 0
            r25 = 0
            r17 = r0
            r18 = r12
            r19 = r11
            r16 = r1
            android.graphics.Bitmap r3 = X.C25541Gs.A00(r16, r17, r18, r19, r20, r21, r22, r24, r25)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x00f3
        L_0x00d8:
            long r2 = r7.A0F     // Catch:{ InterruptedException -> 0x02fa }
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x00ed
            long r0 = r7.A0G     // Catch:{ InterruptedException -> 0x02fa }
            int r11 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ed
            java.io.File r0 = r7.A0I     // Catch:{ InterruptedException -> 0x02fa }
            long r2 = r2 * r17
            android.graphics.Bitmap r3 = X.C25541Gs.A02(r0, r2)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x00f3
        L_0x00ed:
            java.io.File r0 = r7.A0I     // Catch:{ InterruptedException -> 0x02fa }
            android.graphics.Bitmap r3 = X.C25541Gs.A01(r0)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x00f3:
            if (r3 == 0) goto L_0x02db
            if (r8 == 0) goto L_0x02c0
            boolean r0 = r7.A0V     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x02c0
            boolean r0 = r7.A0U     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x02c0
            java.lang.String r1 = r7.A0K     // Catch:{ InterruptedException -> 0x02fa }
            if (r1 == 0) goto L_0x02c0
            X.0y0 r0 = r6.A00     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r21 = X.AnonymousClass1GW.A0H(r0, r1)     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r21.exists()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02c0
            X.0wG r0 = r5.A03     // Catch:{ InterruptedException -> 0x02fa }
            android.content.Context r7 = r0.A00     // Catch:{ InterruptedException -> 0x02fa }
            X.1H2 r2 = r6.A03     // Catch:{ InterruptedException -> 0x02fa }
            X.0ts r1 = r6.A02     // Catch:{ InterruptedException -> 0x02fa }
            X.1HA r0 = r5.A08     // Catch:{ InterruptedException -> 0x02fa }
            X.6Nc r16 = X.AnonymousClass6VQ.A05     // Catch:{ InterruptedException -> 0x02fa }
            r18 = r1
            r19 = r2
            r20 = r0
            r17 = r7
            X.6VQ r1 = r16.A01(r17, r18, r19, r20, r21)     // Catch:{ InterruptedException -> 0x02fa }
            if (r1 == 0) goto L_0x02c0
            boolean r0 = r3.isMutable()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x0135
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x02fa }
            android.graphics.Bitmap r3 = r3.copy(r0, r9)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x0135:
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ InterruptedException -> 0x02fa }
            r1.A05(r3, r0, r0, r0)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02c0
        L_0x013e:
            boolean r0 = r3 instanceof X.C46972by     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            java.lang.String r1 = "application/pdf"
            java.lang.String r0 = r3.A05     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            java.io.File r0 = r7.A0I     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r7 = r0.getAbsolutePath()     // Catch:{ InterruptedException -> 0x02fa }
            X.7l9 r0 = r4.A03     // Catch:{ InterruptedException -> 0x02fa }
            int r3 = r0.BHb()     // Catch:{ InterruptedException -> 0x02fa }
            int r0 = r0.BHb()     // Catch:{ InterruptedException -> 0x02fa }
            int r2 = r0 / 3
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)     // Catch:{ InterruptedException -> 0x02fa }
            r1 = 480(0x1e0, float:6.73E-43)
            boolean r0 = X.AnonymousClass6YG.A07()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x02db
            android.graphics.Bitmap r3 = X.C25571Gv.A01(r7, r3, r2, r1, r9)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x01bf
        L_0x016f:
            boolean r0 = r3 instanceof X.C181798o3     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x0177
            boolean r0 = r3 instanceof X.AnonymousClass2cY     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x01c3
        L_0x0177:
            r0 = r3
            X.2cZ r0 = (X.C47002cZ) r0     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = X.C65703Td.A03(r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x01a3
            if (r1 != 0) goto L_0x01a3
            X.3Qa r0 = r3.A1J     // Catch:{ InterruptedException -> 0x02fa }
            X.11F r0 = r0.A00     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r0 instanceof X.C28981Uw     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x01c3
            X.0yC r8 = r5.A05     // Catch:{ InterruptedException -> 0x02fa }
            r0 = 6508(0x196c, float:9.12E-42)
            boolean r0 = r8.A0E(r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x01c3
            X.0y0 r1 = r6.A00     // Catch:{ InterruptedException -> 0x02fa }
            X.0wx r0 = r5.A04     // Catch:{ InterruptedException -> 0x02fa }
            long r11 = X.AnonymousClass6YC.A02(r1, r0, r8, r3)     // Catch:{ InterruptedException -> 0x02fa }
            r8 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x01c3
        L_0x01a3:
            X.0y0 r2 = r5.A02     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r1 = r2.A0M(r3)     // Catch:{ InterruptedException -> 0x02fa }
            if (r1 == 0) goto L_0x02db
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            java.io.File r0 = r2.A0N(r1)     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r0.exists()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            android.graphics.Bitmap r3 = X.C25541Gs.A01(r1)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x01bf:
            if (r3 == 0) goto L_0x02db
            goto L_0x02c0
        L_0x01c3:
            boolean r0 = r3 instanceof X.C46882bp     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0210
            X.6Q6 r9 = r3.A1Y()     // Catch:{ InterruptedException -> 0x02fa }
            X.0y0 r11 = r6.A00     // Catch:{ InterruptedException -> 0x02fa }
            X.005 r0 = r11.A03     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x02fa }
            X.179 r1 = (X.AnonymousClass179) r1     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = ".Thumbs"
            java.io.File r12 = r1.A07(r0)     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r8 = ".prog.thumb.jpg"
            java.lang.String r1 = r3.A04     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = r3.A07     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r1 = X.C20690y0.A03(r12, r1, r0, r8)     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r8 = r11.A0M(r3)     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = X.AnonymousClass3T2.A04(r3)     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0208
            if (r9 == 0) goto L_0x0208
            if (r8 == 0) goto L_0x0208
            boolean r0 = r8.exists()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0208
            X.1Gq r0 = r5.A06     // Catch:{ InterruptedException -> 0x02fa }
            r0.A00(r9)     // Catch:{ InterruptedException -> 0x02fa }
            int[] r0 = r9.A06()     // Catch:{ InterruptedException -> 0x02fa }
            android.graphics.Bitmap r3 = X.AnonymousClass1SX.A00(r7, r4, r5, r8, r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r3 != 0) goto L_0x02c0
        L_0x0208:
            boolean r0 = r4.A05     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 != 0) goto L_0x02db
            if (r1 == 0) goto L_0x02db
            goto L_0x02af
        L_0x0210:
            boolean r0 = r3 instanceof X.C46962bx     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            X.2bx r3 = (X.C46962bx) r3     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r3.A03     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            android.content.Context r8 = r14.getContext()     // Catch:{ InterruptedException -> 0x02fa }
            X.3Qa r7 = r3.A1J     // Catch:{ InterruptedException -> 0x02fa }
            X.0y0 r2 = r6.A00     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r1 = r3.A04     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = r3.A07     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r3 = r2.A0c(r1, r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r3 == 0) goto L_0x0246
            boolean r0 = r3.exists()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0246
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ InterruptedException -> 0x02fa }
            r0 = 2131166133(0x7f0703b5, float:1.7946503E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ InterruptedException -> 0x02fa }
            X.1HB r1 = r6.A01     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = r7.A01     // Catch:{ InterruptedException -> 0x02fa }
            android.graphics.Bitmap r3 = r1.A06(r3, r0, r2, r2)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02ac
        L_0x0246:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = "MessageThumbFetcher/sticker thumbnail doesn't exist: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x0250:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02db
        L_0x0255:
            boolean r0 = r3 instanceof X.AnonymousClass2bV     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            X.7l9 r0 = r4.A03     // Catch:{ InterruptedException -> 0x02fa }
            int r0 = r0.BHb()     // Catch:{ InterruptedException -> 0x02fa }
            X.3L1 r8 = r3.A0a     // Catch:{ InterruptedException -> 0x02fa }
            r1 = 8000(0x1f40, float:1.121E-41)
            if (r0 == 0) goto L_0x0269
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x0269:
            r0 = 2
            int r2 = java.lang.Math.max(r1, r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r8 == 0) goto L_0x0284
            X.0y0 r0 = r6.A00     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r7 = r0.A0J(r8)     // Catch:{ InterruptedException -> 0x02fa }
            int r0 = r8.A01     // Catch:{ InterruptedException -> 0x02fa }
            int r3 = java.lang.Math.min(r0, r2)     // Catch:{ InterruptedException -> 0x02fa }
            int r0 = r8.A00     // Catch:{ InterruptedException -> 0x02fa }
            int r1 = java.lang.Math.min(r0, r2)     // Catch:{ InterruptedException -> 0x02fa }
            r2 = r3
            goto L_0x029f
        L_0x0284:
            X.3KQ r0 = r3.A0N()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            X.3KQ r0 = r3.A0N()     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = r0.A06     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            X.0y0 r1 = r6.A00     // Catch:{ InterruptedException -> 0x02fa }
            X.3KQ r0 = r3.A0N()     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = r0.A06     // Catch:{ InterruptedException -> 0x02fa }
            java.io.File r7 = r1.A0P(r0)     // Catch:{ InterruptedException -> 0x02fa }
            r1 = r2
        L_0x029f:
            if (r7 == 0) goto L_0x02db
            X.6Kx r0 = new X.6Kx     // Catch:{ InterruptedException -> 0x02fa }
            r0.<init>(r2, r1)     // Catch:{ InterruptedException -> 0x02fa }
            X.5sn r0 = X.AnonymousClass6Y8.A09(r0, r7)     // Catch:{ InterruptedException -> 0x02fa }
            android.graphics.Bitmap r3 = r0.A02     // Catch:{ InterruptedException -> 0x02fa }
        L_0x02ac:
            if (r3 != 0) goto L_0x02c0
            goto L_0x02db
        L_0x02af:
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02db
            android.graphics.Bitmap r3 = X.AnonymousClass1SX.A00(r7, r4, r5, r1, r2)     // Catch:{ InterruptedException -> 0x02fa }
            if (r3 == 0) goto L_0x02db
            r1 = 4
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r3, r1, r0)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x02c0:
            java.lang.Object r0 = r14.getTag()     // Catch:{ InterruptedException -> 0x02fa }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x02e7
            r15.incrementAndGet()     // Catch:{ InterruptedException -> 0x02fa }
            X.5wb r4 = r4.A02     // Catch:{ InterruptedException -> 0x02fa }
            android.os.Handler r2 = r5.A01     // Catch:{ InterruptedException -> 0x02fa }
            r1 = 17
            X.737 r0 = new X.737     // Catch:{ InterruptedException -> 0x02fa }
            r0.<init>(r6, r4, r3, r1)     // Catch:{ InterruptedException -> 0x02fa }
            r2.post(r0)     // Catch:{ InterruptedException -> 0x02fa }
        L_0x02db:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x02fa }
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "MessageThumbsThread/run/Thread interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02f9
        L_0x02e7:
            r3.recycle()     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x02db
        L_0x02eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.String r0 = "MessageThumbsThread/too many result callbacks pending="
            X.C36321k7.A1T(r0, r1, r2)     // Catch:{ InterruptedException -> 0x02fa }
            java.lang.Thread.sleep(r17)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x0013
        L_0x02f9:
            return
        L_0x02fa:
            r1 = move-exception
            java.lang.String r0 = "MessageThumbsThread/run/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5N5.run():void");
    }
}
