package X;

/* renamed from: X.5N3  reason: invalid class name */
public class AnonymousClass5N3 extends C19950wm {
    public final AnonymousClass1HE A00;
    public volatile boolean A01;
    public final /* synthetic */ AnonymousClass1HA A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N3(AnonymousClass1HE r2, AnonymousClass1HA r3) {
        super("StickerImageFileLoader");
        this.A02 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r3 = 0
            r5 = r3
        L_0x0007:
            boolean r0 = r15.A01     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 != 0) goto L_0x0192
            X.1HE r4 = r15.A00     // Catch:{ InterruptedException -> 0x0192 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0192 }
            java.util.PriorityQueue r2 = r4.A00     // Catch:{ all -> 0x018f }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x001b
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.wait(r0)     // Catch:{ all -> 0x018f }
        L_0x001b:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0028
            java.lang.Object r11 = r2.remove()     // Catch:{ all -> 0x018f }
            X.3KR r11 = (X.AnonymousClass3KR) r11     // Catch:{ all -> 0x018f }
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0192 }
            if (r11 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r8 = r3
            goto L_0x0031
        L_0x002f:
            java.lang.Integer r8 = r11.A04     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0031:
            boolean r0 = r15.A01     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0037
            goto L_0x017f
        L_0x0037:
            if (r11 == 0) goto L_0x0173
            if (r8 == 0) goto L_0x0048
            X.1HA r0 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            X.1HC r2 = r0.A04     // Catch:{ InterruptedException -> 0x0192 }
            int r1 = r8.intValue()     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r0 = "sticker_queue_run"
            r2.A01(r1, r0)     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0048:
            X.6c4 r7 = r11.A03     // Catch:{ InterruptedException -> 0x0192 }
            boolean r0 = r7.A0L     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r7.A0A     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r4 = "local_file_exists"
            if (r0 != 0) goto L_0x00c3
            X.1HA r5 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            X.1Bp r2 = r5.A0A     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r0 = r7.A06     // Catch:{ InterruptedException -> 0x0192 }
            X.690 r1 = new X.690     // Catch:{ InterruptedException -> 0x0192 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String[] r0 = r7.A0O     // Catch:{ InterruptedException -> 0x0192 }
            java.io.File r6 = r2.A00(r1, r0)     // Catch:{ InterruptedException -> 0x0192 }
            boolean r0 = r6.exists()     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x009b
            long r9 = r6.length()     // Catch:{ InterruptedException -> 0x0192 }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            java.lang.Integer r0 = r11.A04     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0082
            X.1HC r1 = r5.A04     // Catch:{ InterruptedException -> 0x0192 }
            int r0 = r0.intValue()     // Catch:{ InterruptedException -> 0x0192 }
            r1.A01(r0, r4)     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0082:
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ InterruptedException -> 0x0192 }
            r7.A0A = r0     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0088:
            boolean r0 = r11.A06     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 != 0) goto L_0x011c
            X.1HA r12 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            X.17Y r9 = r12.A02     // Catch:{ InterruptedException -> 0x0192 }
            com.whatsapp.stickers.WebpUtils r13 = r12.A08     // Catch:{ InterruptedException -> 0x0192 }
            X.0yb r10 = r12.A03     // Catch:{ InterruptedException -> 0x0192 }
            java.util.concurrent.ConcurrentHashMap r14 = r12.A0E     // Catch:{ InterruptedException -> 0x0192 }
            X.AnonymousClass1HA.A04(r9, r10, r11, r12, r13, r14)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x017c
        L_0x009b:
            r6.getAbsolutePath()     // Catch:{ InterruptedException -> 0x0192 }
            X.1Bj r1 = r5.A0B     // Catch:{ InterruptedException -> 0x0192 }
            r0 = 1
            java.io.File r6 = r1.A00(r7, r6, r0)     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.Integer r0 = r11.A04     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x00c0
            if (r6 == 0) goto L_0x0088
            X.1HC r5 = r5.A04     // Catch:{ InterruptedException -> 0x0192 }
            int r4 = r0.intValue()     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r0 = "sticker_downloaded"
            r5.A01(r4, r0)     // Catch:{ InterruptedException -> 0x0192 }
            X.5IY r2 = X.AnonymousClass5IY.A00     // Catch:{ InterruptedException -> 0x0192 }
            long r0 = r6.length()     // Catch:{ InterruptedException -> 0x0192 }
            r5.A04(r2, r4, r0)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x0082
        L_0x00c0:
            if (r6 == 0) goto L_0x0088
            goto L_0x0082
        L_0x00c3:
            java.lang.Integer r2 = r11.A04     // Catch:{ InterruptedException -> 0x0192 }
            if (r2 == 0) goto L_0x0088
            X.1HA r0 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            X.1HC r1 = r0.A04     // Catch:{ InterruptedException -> 0x0192 }
            int r0 = r2.intValue()     // Catch:{ InterruptedException -> 0x0192 }
            r1.A01(r0, r4)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x0088
        L_0x00d3:
            boolean r0 = r11.A02()     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r7.A0E     // Catch:{ InterruptedException -> 0x0192 }
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "loading-hash"
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r7.A0A     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r7.A0C     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r7.A09     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0088
            X.1HA r0 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            X.1Bm r0 = r0.A0C     // Catch:{ InterruptedException -> 0x0192 }
            X.5ce r1 = r0.A00(r7)     // Catch:{ InterruptedException -> 0x0192 }
            boolean r0 = r1 instanceof X.AnonymousClass5L5     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0111
            X.5L5 r1 = (X.AnonymousClass5L5) r1     // Catch:{ InterruptedException -> 0x0192 }
            X.6c4 r1 = r1.A00     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r0 = r1.A0A     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0107
            r7.A0A = r0     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0107:
            X.3S2 r0 = r7.A04     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 != 0) goto L_0x0088
            X.3S2 r0 = r1.A04     // Catch:{ InterruptedException -> 0x0192 }
            r7.A04 = r0     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x0088
        L_0x0111:
            boolean r0 = r1 instanceof X.AnonymousClass5L4     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "StickerImageFileLoader/prepareNormalSticker/sticker cannot be downloaded"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x0088
        L_0x011c:
            boolean r0 = r11.A02()     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x017c
            X.1HA r4 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r6 = r11.A05     // Catch:{ InterruptedException -> 0x0192 }
            android.graphics.drawable.Drawable r5 = X.AnonymousClass1HA.A00(r7, r4, r6)     // Catch:{ InterruptedException -> 0x0192 }
            if (r5 != 0) goto L_0x0160
            com.whatsapp.stickers.WebpUtils r2 = r4.A08     // Catch:{ InterruptedException -> 0x0192 }
            X.0y0 r1 = r4.A01     // Catch:{ InterruptedException -> 0x0192 }
            X.0yb r0 = r4.A03     // Catch:{ InterruptedException -> 0x0192 }
            byte[] r2 = X.AnonymousClass1HA.A05(r1, r0, r7, r2)     // Catch:{ InterruptedException -> 0x0192 }
            if (r2 == 0) goto L_0x0150
            boolean r0 = r7.A0N     // Catch:{ InterruptedException -> 0x0192 }
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = r7.A0E     // Catch:{ InterruptedException -> 0x0192 }
            X.1Ao r0 = r4.A05     // Catch:{ InterruptedException -> 0x0192 }
            X.7u4 r5 = r0.A02(r1, r2)     // Catch:{ InterruptedException -> 0x0192 }
            if (r5 == 0) goto L_0x0150
            java.util.concurrent.ConcurrentHashMap r1 = r4.A0E     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch:{ InterruptedException -> 0x0192 }
            r0.<init>(r5)     // Catch:{ InterruptedException -> 0x0192 }
            r1.put(r6, r0)     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0150:
            X.17Y r0 = r4.A02     // Catch:{ InterruptedException -> 0x0192 }
            r11.A01(r5, r0)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x017c
        L_0x0156:
            java.lang.String r0 = r7.A0E     // Catch:{ InterruptedException -> 0x0192 }
            X.C18740tg.A06(r0)     // Catch:{ InterruptedException -> 0x0192 }
            android.graphics.drawable.Drawable r5 = X.AnonymousClass1HA.A01(r11, r4, r0, r2)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x0150
        L_0x0160:
            if (r8 == 0) goto L_0x0150
            X.1HC r2 = r4.A04     // Catch:{ InterruptedException -> 0x0192 }
            int r1 = r8.intValue()     // Catch:{ InterruptedException -> 0x0192 }
            java.lang.String r0 = "in_memory_cache_hit"
            r2.A01(r1, r0)     // Catch:{ InterruptedException -> 0x0192 }
            X.2pF r0 = X.C52322pF.SUCCESS     // Catch:{ InterruptedException -> 0x0192 }
            r2.A02(r0, r1)     // Catch:{ InterruptedException -> 0x0192 }
            goto L_0x0150
        L_0x0173:
            if (r5 != 0) goto L_0x017c
            X.1HA r0 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            r0.A00 = r3     // Catch:{ InterruptedException -> 0x0192 }
            r15.interrupt()     // Catch:{ InterruptedException -> 0x0192 }
        L_0x017c:
            r5 = r11
            goto L_0x0007
        L_0x017f:
            if (r8 == 0) goto L_0x018e
            X.1HA r0 = r15.A02     // Catch:{ InterruptedException -> 0x0192 }
            X.1HC r2 = r0.A04     // Catch:{ InterruptedException -> 0x0192 }
            int r1 = r8.intValue()     // Catch:{ InterruptedException -> 0x0192 }
            X.2pF r0 = X.C52322pF.CANCEL     // Catch:{ InterruptedException -> 0x0192 }
            r2.A02(r0, r1)     // Catch:{ InterruptedException -> 0x0192 }
        L_0x018e:
            return
        L_0x018f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0192 }
            throw r0     // Catch:{ InterruptedException -> 0x0192 }
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5N3.run():void");
    }
}
