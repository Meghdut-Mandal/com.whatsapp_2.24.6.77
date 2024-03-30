package X;

/* renamed from: X.5N1  reason: invalid class name */
public class AnonymousClass5N1 extends C19950wm {
    public final /* synthetic */ C131566Po A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N1(C131566Po r3, String str) {
        super(AnonymousClass000.A0p("PhotosNetwork-", str, AnonymousClass000.A0u()));
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x017b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0182, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x02e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0086 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r0 = r31
            X.6Po r5 = r0.A00     // Catch:{ InterruptedException -> 0x035a }
            java.util.Stack r1 = r5.A0B     // Catch:{ InterruptedException -> 0x035a }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x035a }
            int r0 = r1.size()     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x0015
            r1.wait()     // Catch:{ all -> 0x0350 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0350 }
            int r0 = r1.size()     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x034b
            r3 = 0
            java.lang.Object r4 = r5.A05     // Catch:{ InterruptedException -> 0x035a }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x035a }
            int r0 = r1.size()     // Catch:{ all -> 0x0348 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r3 = r1.pop()     // Catch:{ all -> 0x0348 }
            X.5y9 r3 = (X.C124415y9) r3     // Catch:{ all -> 0x0348 }
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x0348 }
            if (r3 == 0) goto L_0x034b
            java.util.concurrent.ConcurrentMap r15 = r3.A05     // Catch:{ InterruptedException -> 0x035a }
            int r0 = r15.size()     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x034b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A07     // Catch:{ InterruptedException -> 0x035a }
            boolean r0 = X.C90504aG.A1Z(r0)     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x034b
            boolean r0 = r5 instanceof X.C102154zO     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x00ca
            r9 = r5
            X.4zO r9 = (X.C102154zO) r9     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r0 = r3.A03     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r10 = X.C18750th.A04(r0)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.StringBuilder r1 = X.C36421kH.A0f(r10)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r0 = "thumbloader/download "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r7 = r3.A04     // Catch:{ InterruptedException -> 0x035a }
            X.C36321k7.A1a(r1, r7)     // Catch:{ InterruptedException -> 0x035a }
            r0 = 11
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ InterruptedException -> 0x035a }
            r11 = 1
            r6 = 0
            X.13E r0 = r9.A01     // Catch:{ IOException -> 0x00b3 }
            X.6v1 r8 = r0.A04(r7)     // Catch:{ IOException -> 0x00b3 }
            X.0ww r1 = r9.A00     // Catch:{ IOException -> 0x0086 }
            r0 = 30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0086 }
            X.5RE r2 = r8.B8D(r1, r6, r0)     // Catch:{ IOException -> 0x0086 }
            X.6Tn r0 = r9.A03     // Catch:{ all -> 0x007c }
            r0.A04(r2, r10)     // Catch:{ all -> 0x007c }
            r2.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0086
        L_0x007c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0086 }
        L_0x0085:
            throw r1     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            X.6Tn r9 = r9.A03     // Catch:{ all -> 0x00a9 }
            int r2 = r3.A01     // Catch:{ all -> 0x00a9 }
            int r1 = r3.A00     // Catch:{ all -> 0x00a9 }
            boolean r0 = r3.A06     // Catch:{ all -> 0x00a9 }
            android.graphics.Bitmap r2 = r9.A02(r10, r2, r1, r0)     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x009d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "thumbloader/decode failed "
            X.C36321k7.A1P(r0, r7, r1)     // Catch:{ all -> 0x00a9 }
        L_0x009d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x00a9 }
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r2)     // Catch:{ all -> 0x00a9 }
            r8.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00c5
        L_0x00a9:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00b3 }
        L_0x00b2:
            throw r1     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0353 }
            java.lang.String r0 = "thumbloader/error downloading "
            X.C90464aC.A1L(r0, r7, r1, r2)     // Catch:{ all -> 0x0353 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0353 }
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r6)     // Catch:{ all -> 0x0353 }
        L_0x00c5:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x0300
        L_0x00ca:
            boolean r0 = r5 instanceof X.C102144zN     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x019a
            r9 = r5
            X.4zN r9 = (X.C102144zN) r9     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r0 = r3.A03     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r8 = X.C18750th.A04(r0)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.StringBuilder r1 = X.C36421kH.A0f(r8)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r0 = "StickerThumbLoader/download "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r7 = r3.A04     // Catch:{ InterruptedException -> 0x035a }
            X.C36321k7.A1a(r1, r7)     // Catch:{ InterruptedException -> 0x035a }
            r0 = 11
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ InterruptedException -> 0x035a }
            r6 = 0
            X.1BR r10 = r9.A00     // Catch:{ IOException -> 0x018e }
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)     // Catch:{ IOException -> 0x018e }
            X.0wo r1 = r10.A02     // Catch:{ IOException -> 0x018e }
            long r11 = X.C19970wo.A00(r1)     // Catch:{ IOException -> 0x018e }
            X.13E r0 = r10.A07     // Catch:{ IOException -> 0x0183 }
            X.6v1 r2 = r0.A04(r7)     // Catch:{ IOException -> 0x0183 }
            long r20 = X.C19970wo.A00(r1)     // Catch:{ all -> 0x017c }
            long r20 = r20 - r11
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x017c }
            java.net.URL r17 = r0.getURL()     // Catch:{ all -> 0x017c }
            X.AnonymousClass00C.A08(r17)     // Catch:{ all -> 0x017c }
            int r0 = r0.getResponseCode()     // Catch:{ all -> 0x017c }
            long r0 = (long) r0     // Catch:{ all -> 0x017c }
            r18 = r0
            r16 = r10
            r16.A03(r17, r18, r20)     // Catch:{ all -> 0x017c }
            X.0ww r1 = r10.A01     // Catch:{ all -> 0x017c }
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x017c }
            X.5RE r11 = r2.B8D(r1, r6, r0)     // Catch:{ all -> 0x017c }
            java.io.ByteArrayOutputStream r12 = X.C90524aI.A0Q()     // Catch:{ all -> 0x0175 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x0175 }
            java.util.Objects.requireNonNull(r12)     // Catch:{ all -> 0x0175 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0175 }
        L_0x0132:
            int r1 = r11.read(r10)     // Catch:{ all -> 0x0175 }
            r0 = -1
            if (r1 != r0) goto L_0x0142
            byte[] r0 = r12.toByteArray()     // Catch:{ all -> 0x0175 }
            java.io.ByteArrayInputStream r10 = X.C90524aI.A0P(r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0147
        L_0x0142:
            r0 = 0
            r12.write(r10, r0, r1)     // Catch:{ all -> 0x0175 }
            goto L_0x0132
        L_0x0147:
            r11.close()     // Catch:{ all -> 0x017c }
            r2.close()     // Catch:{ IOException -> 0x0183 }
            X.6Tn r9 = r9.A03     // Catch:{ all -> 0x016b }
            r9.A04(r10, r8)     // Catch:{ all -> 0x016b }
            int r2 = r3.A01     // Catch:{ all -> 0x016b }
            int r1 = r3.A00     // Catch:{ all -> 0x016b }
            r0 = 0
            android.graphics.Bitmap r6 = r9.A02(r8, r2, r1, r0)     // Catch:{ all -> 0x016b }
            if (r6 != 0) goto L_0x0166
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "StickerThumbLoader/decode failed "
            X.C36321k7.A1P(r0, r7, r1)     // Catch:{ all -> 0x016b }
        L_0x0166:
            r10.close()     // Catch:{ IOException -> 0x018e }
            goto L_0x02f5
        L_0x016b:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0170 }
            goto L_0x0174
        L_0x0170:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x018e }
        L_0x0174:
            throw r1     // Catch:{ IOException -> 0x018e }
        L_0x0175:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x017c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x0183 }
            throw r0     // Catch:{ IOException -> 0x0183 }
        L_0x0183:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x018e }
            java.lang.String r0 = "StickerPackNetworkProvider/preview thumbnail decode failed "
            X.C90464aC.A1L(r0, r7, r1, r2)     // Catch:{ IOException -> 0x018e }
            throw r2     // Catch:{ IOException -> 0x018e }
        L_0x018e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0353 }
            java.lang.String r0 = "StickerThumbLoader/error downloading "
            X.C90464aC.A1L(r0, r7, r1, r2)     // Catch:{ all -> 0x0353 }
            goto L_0x02f5
        L_0x019a:
            r8 = r5
            X.4zP r8 = (X.C102164zP) r8     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r2 = r3.A04     // Catch:{ InterruptedException -> 0x035a }
            android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x0207
            java.lang.String r1 = r0.getAuthority()     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r0 = "static.whatsapp.net"
            boolean r0 = r0.equals(r1)     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x0207
            X.6yj r1 = new X.6yj     // Catch:{ InterruptedException -> 0x035a }
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x035a }
        L_0x01b6:
            X.6vq r7 = new X.6vq     // Catch:{ InterruptedException -> 0x035a }
            r7.<init>()     // Catch:{ InterruptedException -> 0x035a }
            r6 = 0
            r0 = 0
            X.5vA r2 = new X.5vA     // Catch:{ InterruptedException -> 0x035a }
            r2.<init>(r7, r1, r0, r6)     // Catch:{ InterruptedException -> 0x035a }
            X.0wo r14 = r8.A01     // Catch:{ InterruptedException -> 0x035a }
            X.0ww r13 = r8.A00     // Catch:{ InterruptedException -> 0x035a }
            X.1BS r12 = r8.A05     // Catch:{ InterruptedException -> 0x035a }
            X.1BV r11 = r8.A04     // Catch:{ InterruptedException -> 0x035a }
            X.6Fk r1 = r3.A02     // Catch:{ InterruptedException -> 0x035a }
            java.util.Iterator r9 = X.AnonymousClass000.A0z(r15)     // Catch:{ InterruptedException -> 0x035a }
        L_0x01d0:
            boolean r0 = r9.hasNext()     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x0205
            java.lang.Object r0 = r9.next()     // Catch:{ InterruptedException -> 0x035a }
            X.7lb r0 = (X.C160797lb) r0     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x01d0
            java.lang.Integer r10 = r0.BEi()     // Catch:{ InterruptedException -> 0x035a }
        L_0x01e2:
            java.util.Iterator r9 = X.AnonymousClass000.A0z(r15)     // Catch:{ InterruptedException -> 0x035a }
        L_0x01e6:
            boolean r0 = r9.hasNext()     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x0203
            java.lang.Object r0 = r9.next()     // Catch:{ InterruptedException -> 0x035a }
            if (r0 == 0) goto L_0x01e6
            java.lang.Integer r9 = X.C36361kB.A0i()     // Catch:{ InterruptedException -> 0x035a }
        L_0x01f6:
            java.lang.String r29 = ""
            if (r10 == 0) goto L_0x020f
            int r0 = r10.intValue()     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r27 = X.AnonymousClass1Ax.A01(r0)     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x0211
        L_0x0203:
            r9 = 0
            goto L_0x01f6
        L_0x0205:
            r10 = 0
            goto L_0x01e2
        L_0x0207:
            java.lang.String r0 = "image"
            X.6yi r1 = new X.6yi     // Catch:{ InterruptedException -> 0x035a }
            r1.<init>(r2, r0)     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x01b6
        L_0x020f:
            r27 = r29
        L_0x0211:
            if (r9 == 0) goto L_0x0231
            int r9 = r9.intValue()     // Catch:{ InterruptedException -> 0x035a }
            if (r9 == 0) goto L_0x022c
            r0 = 1
            if (r9 == r0) goto L_0x0229
            r0 = 2
            if (r9 == r0) goto L_0x0226
            r0 = 3
            if (r9 == r0) goto L_0x0223
            goto L_0x022f
        L_0x0223:
            java.lang.String r29 = "aggressive_prefetch"
            goto L_0x0231
        L_0x0226:
            java.lang.String r29 = "prefetch"
            goto L_0x0231
        L_0x0229:
            java.lang.String r29 = "full"
            goto L_0x0231
        L_0x022c:
            java.lang.String r29 = "manual"
            goto L_0x0231
        L_0x022f:
            java.lang.String r29 = "unknown"
        L_0x0231:
            X.0yC r10 = r8.A02     // Catch:{ InterruptedException -> 0x035a }
            X.6Fk r0 = r3.A02     // Catch:{ InterruptedException -> 0x035a }
            X.1Gl r0 = r0.A0g     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r9 = r0.A02     // Catch:{ InterruptedException -> 0x035a }
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ InterruptedException -> 0x035a }
            r26 = 0
            X.64M r24 = new X.64M     // Catch:{ InterruptedException -> 0x035a }
            r30 = 0
            r25 = r10
            r28 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ InterruptedException -> 0x035a }
            X.76y r16 = new X.76y     // Catch:{ InterruptedException -> 0x035a }
            r25 = 0
            r23 = r12
            r22 = r8
            r21 = r2
            r20 = r1
            r19 = r11
            r18 = r14
            r17 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ InterruptedException -> 0x035a }
            X.5mC r1 = r16.B5u()     // Catch:{ InterruptedException -> 0x035a }
            X.6Wx r9 = r1.A00     // Catch:{ InterruptedException -> 0x035a }
            X.58z r10 = r9.A00     // Catch:{ InterruptedException -> 0x035a }
            if (r10 == 0) goto L_0x02a6
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r15)     // Catch:{ InterruptedException -> 0x035a }
        L_0x026d:
            boolean r1 = r2.hasNext()     // Catch:{ InterruptedException -> 0x035a }
            if (r1 == 0) goto L_0x02a6
            java.lang.Object r1 = r2.next()     // Catch:{ InterruptedException -> 0x035a }
            X.7lb r1 = (X.C160797lb) r1     // Catch:{ InterruptedException -> 0x035a }
            java.lang.Integer r11 = r1.BEi()     // Catch:{ InterruptedException -> 0x035a }
            r10.A0H = r11     // Catch:{ InterruptedException -> 0x035a }
            if (r11 == 0) goto L_0x026d
            X.6Fk r1 = r3.A02     // Catch:{ InterruptedException -> 0x035a }
            X.1Gl r1 = r1.A0g     // Catch:{ InterruptedException -> 0x035a }
            int r2 = r1.A00     // Catch:{ InterruptedException -> 0x035a }
            int r1 = r11.intValue()     // Catch:{ InterruptedException -> 0x035a }
            int r1 = X.AnonymousClass6UH.A01(r2, r1, r6)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x035a }
            r10.A0J = r1     // Catch:{ InterruptedException -> 0x035a }
            java.lang.Integer r1 = X.C36361kB.A0j()     // Catch:{ InterruptedException -> 0x035a }
            r10.A0G = r1     // Catch:{ InterruptedException -> 0x035a }
            boolean r1 = r9.A03()     // Catch:{ InterruptedException -> 0x035a }
            X.0yW r2 = r8.A03     // Catch:{ InterruptedException -> 0x035a }
            if (r1 == 0) goto L_0x02c2
            r2.Bly(r10)     // Catch:{ InterruptedException -> 0x035a }
        L_0x02a6:
            r2 = 0
            boolean r1 = r9.A03()     // Catch:{ InterruptedException -> 0x035a }
            if (r1 == 0) goto L_0x02ec
            java.io.ByteArrayOutputStream r1 = r7.A00     // Catch:{ InterruptedException -> 0x035a }
            if (r1 == 0) goto L_0x02b5
            byte[] r2 = r1.toByteArray()     // Catch:{ InterruptedException -> 0x035a }
        L_0x02b5:
            X.C18740tg.A06(r2)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r1 = r3.A03     // Catch:{ InterruptedException -> 0x035a }
            java.lang.String r9 = X.C18750th.A04(r1)     // Catch:{ InterruptedException -> 0x035a }
            X.C18740tg.A06(r9)     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x02cb
        L_0x02c2:
            X.0u5 r1 = new X.0u5     // Catch:{ InterruptedException -> 0x035a }
            r1.<init>(r0, r0)     // Catch:{ InterruptedException -> 0x035a }
            r2.Bls(r10, r1, r0)     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x02a6
        L_0x02cb:
            java.io.ByteArrayInputStream r7 = X.C90524aI.A0P(r2)     // Catch:{ IOException -> 0x02e2 }
            X.6Tn r1 = r8.A03     // Catch:{ all -> 0x02d8 }
            r1.A04(r7, r9)     // Catch:{ all -> 0x02d8 }
            r7.close()     // Catch:{ IOException -> 0x02e2 }
            goto L_0x02e2
        L_0x02d8:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x02dd }
            goto L_0x02e1
        L_0x02dd:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x02e2 }
        L_0x02e1:
            throw r2     // Catch:{ IOException -> 0x02e2 }
        L_0x02e2:
            X.6Tn r7 = r8.A03     // Catch:{ InterruptedException -> 0x035a }
            int r2 = r3.A01     // Catch:{ InterruptedException -> 0x035a }
            int r1 = r3.A00     // Catch:{ InterruptedException -> 0x035a }
            android.graphics.Bitmap r2 = r7.A02(r9, r2, r1, r6)     // Catch:{ InterruptedException -> 0x035a }
        L_0x02ec:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException -> 0x035a }
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r2)     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x0300
        L_0x02f5:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ InterruptedException -> 0x035a }
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ InterruptedException -> 0x035a }
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r6)     // Catch:{ InterruptedException -> 0x035a }
        L_0x0300:
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x035a }
            java.lang.Object r0 = r1.first     // Catch:{ all -> 0x0345 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ all -> 0x0345 }
            if (r0 != 0) goto L_0x0315
            r15.clear()     // Catch:{ all -> 0x0345 }
            java.util.Map r1 = r5.A09     // Catch:{ all -> 0x0345 }
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x0345 }
            r1.remove(r0)     // Catch:{ all -> 0x0345 }
        L_0x0313:
            monitor-exit(r4)     // Catch:{ all -> 0x0345 }
            goto L_0x034b
        L_0x0315:
            java.lang.Object r6 = r1.second     // Catch:{ all -> 0x0345 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ all -> 0x0345 }
            X.6Tn r2 = r5.A03     // Catch:{ all -> 0x0345 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0345 }
            if (r6 == 0) goto L_0x0321
            r0 = r6
            goto L_0x0323
        L_0x0321:
            android.graphics.Bitmap r0 = X.C132416Tn.A07     // Catch:{ all -> 0x0345 }
        L_0x0323:
            r2.A03(r0, r1)     // Catch:{ all -> 0x0345 }
            java.util.Map r0 = r5.A09     // Catch:{ all -> 0x0345 }
            r0.remove(r1)     // Catch:{ all -> 0x0345 }
            int r0 = r15.size()     // Catch:{ all -> 0x0345 }
            if (r0 == 0) goto L_0x0313
            java.util.ArrayList r2 = X.C90494aF.A0g(r15)     // Catch:{ all -> 0x0345 }
            r15.clear()     // Catch:{ all -> 0x0345 }
            r0 = 35
            X.74w r1 = new X.74w     // Catch:{ all -> 0x0345 }
            r1.<init>(r6, r2, r5, r0)     // Catch:{ all -> 0x0345 }
            X.17Y r0 = r5.A02     // Catch:{ all -> 0x0345 }
            r0.A0H(r1)     // Catch:{ all -> 0x0345 }
            goto L_0x0313
        L_0x0345:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0345 }
            goto L_0x0357
        L_0x0348:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0348 }
            goto L_0x0357
        L_0x034b:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x035a }
            goto L_0x0358
        L_0x0350:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0350 }
            goto L_0x0357
        L_0x0353:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ InterruptedException -> 0x035a }
        L_0x0357:
            throw r0     // Catch:{ InterruptedException -> 0x035a }
        L_0x0358:
            if (r0 == 0) goto L_0x0005
        L_0x035a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5N1.run():void");
    }
}
