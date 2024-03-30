package com.facebook.wearable.mediastream.api.abr;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C200999ib;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1", f = "FrameRateAdaptiveVideoConfigHandler.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
public final class FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C200999ib this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1(C200999ib r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01d3, code lost:
        if (r11 != 0) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01d5, code lost:
        r4 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d7, code lost:
        r0 = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d8, code lost:
        if (r7 >= r0) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01da, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01dd, code lost:
        r4 = r4 / ((double) r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.0AO r17 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r18 = r19
            r0 = r18
            int r1 = r0.label
            r16 = 1
            if (r1 == 0) goto L_0x02c4
            r0 = 1
            if (r1 != r0) goto L_0x02cc
            X.AnonymousClass0AN.A00(r20)
        L_0x0012:
            r0 = r18
            X.9ib r9 = r0.this$0
            int r11 = r9.A02
            double r4 = (double) r11
            long r2 = r9.A0G
            double r0 = (double) r2
            double r2 = r4 / r0
            r0 = 1000(0x3e8, float:1.401E-42)
            double r0 = (double) r0
            double r2 = r2 * r0
            X.88A r0 = r9.A03
            int r7 = r0.A01
            double r0 = (double) r7
            double r2 = r2 / r0
            X.9gk r8 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Computed throughput. latency: "
            r6.append(r0)
            X.9cv r10 = r9.A04
            long r0 = r10.A00
            r6.append(r0)
            java.lang.String r0 = " ms, drift: "
            r6.append(r0)
            long r0 = r10.A01
            r6.append(r0)
            java.lang.String r0 = " ms, ratio: "
            r6.append(r0)
            r6.append(r11)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r0 = " = "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            java.lang.String r13 = "sup:FrameRateAdaptiveVideoConfigHandler"
            r8.A03(r13, r0)
            r0 = 0
            r9.A02 = r0
            long r0 = r10.A01
            long r6 = r10.A05
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x01e0
            long r6 = r10.A00
            r11 = 0
            int r10 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x01e0
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "High latency drift: "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = "ms"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r5)
            r8.A03(r13, r0)
            double r0 = r9.A08
            double r2 = r2 * r0
        L_0x0090:
            int r1 = r9.A01
            r0 = 0
            if (r1 <= r0) goto L_0x0096
            r1 = 0
        L_0x0096:
            int r1 = r1 - r16
            r9.A01 = r1
            int r0 = r9.A0C
            int r0 = r1 % r0
            java.lang.String r10 = "handleCongestion - offset ["
            if (r0 == 0) goto L_0x00d6
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r1, r10)
        L_0x00a6:
            java.lang.String r0 = "] :: no change required"
        L_0x00a8:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r8.A03(r13, r0)
        L_0x00af:
            X.88A r0 = r9.A03
        L_0x00b1:
            r9.A03 = r0
            r0 = r18
            X.9ib r0 = r0.this$0
            X.02t r1 = r0.A05
            X.88A r0 = r0.A03
            r1.invoke(r0)
        L_0x00be:
            r0 = r18
            X.9ib r1 = r0.this$0
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x02c9
            long r2 = r1.A0G
            r1 = 1
            r0 = r18
            r0.label = r1
            java.lang.Object r1 = X.C07330Xf.A00(r0, r2)
            r0 = r17
            if (r1 != r0) goto L_0x0012
            return r17
        L_0x00d6:
            double r0 = r9.A09
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e1
            r2 = 1
            double r2 = (double) r2
            double r2 = r2 - r0
        L_0x00e1:
            X.00T r6 = r9.A0J
            java.lang.Object r5 = r6.getValue()
            X.9YO r5 = (X.AnonymousClass9YO) r5
            X.88A r0 = r9.A03
            int r0 = r0.A00
            double r0 = (double) r0
            double r0 = r0 * r2
            int r7 = (int) r0
            int r0 = r9.A00
            int r4 = r0 + 1
            X.00T r5 = r5.A00
            java.util.List r0 = X.C90524aI.A0q(r5)
            int r0 = r0.size()
            java.lang.String r1 = "sup:BaseBitrateLadderProvider"
            if (r4 != r0) goto L_0x0168
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Already at lowest rung! Using bitrate: "
        L_0x0108:
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r11, r7)
            r8.A03(r1, r0)
        L_0x010f:
            X.00T r0 = r9.A0K
            java.lang.Object r0 = r0.getValue()
            X.9YO r0 = (X.AnonymousClass9YO) r0
            X.88A r0 = r0.A03()
            int r0 = r0.A00
            if (r7 <= r0) goto L_0x0120
            r7 = r0
        L_0x0120:
            X.88A r0 = r9.A03
            int r5 = r0.A00
            int r0 = r9.A0B
            int r0 = r5 - r0
            r1 = r7
            if (r7 >= r0) goto L_0x012c
            r1 = r0
        L_0x012c:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0v(r10)
            int r0 = r9.A01
            r4.append(r0)
            java.lang.String r0 = "] :: current bitrate: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = " // bitrate adjustment percent: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " // computed bitrate: "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = " // new bitrate: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r4, r1)
            r8.A03(r13, r0)
            X.88A r0 = r9.A03
            int r0 = r0.A00
            if (r1 > r0) goto L_0x00af
            java.lang.Object r0 = r6.getValue()
            X.9YO r0 = (X.AnonymousClass9YO) r0
            X.88A r0 = X.C200999ib.A00(r0, r9, r1)
            goto L_0x00b1
        L_0x0168:
            java.util.List r0 = X.C90524aI.A0q(r5)
            java.lang.Object r0 = r0.get(r4)
            X.88B r0 = (X.AnonymousClass88B) r0
            X.0mZ r0 = r0.A04
            boolean r0 = r0.A02(r7)
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "Using next lower rung: "
            r11.append(r0)
            java.util.List r0 = X.C90524aI.A0q(r5)
            java.lang.Object r0 = r0.get(r4)
            r11.append(r0)
            java.lang.String r0 = " and bitrate "
            goto L_0x0108
        L_0x0192:
            java.lang.String r0 = "Attempted to move one than one step down! Using next lower rung "
            r11.append(r0)
            java.util.List r0 = X.C90524aI.A0q(r5)
            java.lang.Object r0 = r0.get(r4)
            r11.append(r0)
            java.lang.String r0 = " average bitrate"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r11)
            r8.A03(r1, r0)
            java.util.List r0 = X.C90524aI.A0q(r5)
            java.lang.Object r0 = r0.get(r4)
            X.88B r0 = (X.AnonymousClass88B) r0
            X.0mZ r0 = r0.A04
            java.util.Iterator r12 = r0.iterator()
            r4 = 0
            r11 = 0
        L_0x01be:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01d3
            int r0 = X.C36341k9.A0A(r12)
            double r0 = (double) r0
            double r4 = r4 + r0
            int r11 = r11 + 1
            if (r11 >= 0) goto L_0x01be
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x01d3:
            if (r11 != 0) goto L_0x01dd
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x01d7:
            int r0 = (int) r4
            if (r7 >= r0) goto L_0x010f
            r7 = r0
            goto L_0x010f
        L_0x01dd:
            double r0 = (double) r11
            double r4 = r4 / r0
            goto L_0x01d7
        L_0x01e0:
            double r0 = r9.A08
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 - r0
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0293
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0293
            int r0 = r9.A01
            int r7 = r0 + 1
            r9.A01 = r7
            int r12 = r9.A0F
            java.lang.String r15 = "handleNormalThroughput - offset ["
            if (r7 < r12) goto L_0x028d
            int r0 = r7 % r12
            if (r0 != 0) goto L_0x028d
            int r14 = r9.A0D
            double r5 = r9.A0A
            X.88A r0 = r9.A03
            int r4 = r0.A00
            double r0 = (double) r4
            double r5 = r5 * r0
            X.9cv r10 = r9.A04
            long r0 = r10.A01
            double r2 = (double) r0
            long r10 = r10.A05
            double r0 = (double) r10
            double r2 = r2 / r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            double r5 = r5 * r0
            int r0 = (int) r5
            if (r14 >= r0) goto L_0x0218
            r14 = r0
        L_0x0218:
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = r7 / r12
            int r0 = r0 + -1
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r2, r0)
            double r2 = (double) r14
            double r2 = r2 * r0
            int r5 = (int) r2
            int r2 = r9.A0E
            if (r5 <= r2) goto L_0x022b
            r5 = r2
        L_0x022b:
            int r4 = r4 + r5
            java.lang.StringBuilder r3 = X.C90464aC.A0h(r7, r15)
            java.lang.String r2 = "] :: multiplier ("
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ") // current bitrate: "
            r3.append(r0)
            X.88A r0 = r9.A03
            int r0 = r0.A00
            r3.append(r0)
            java.lang.String r0 = " // adjusted bitrate: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = " //  increment bitrate: "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = " // new bitrate: "
            r3.append(r0)
            X.00T r2 = r9.A0K
            java.lang.Object r0 = r2.getValue()
            X.9YO r0 = (X.AnonymousClass9YO) r0
            X.88A r0 = r0.A03()
            int r1 = r0.A00
            r0 = r4
            if (r4 <= r1) goto L_0x026b
            r0 = r1
        L_0x026b:
            java.lang.String r0 = X.C36381kD.A10(r3, r0)
            r8.A03(r13, r0)
            java.lang.Object r0 = r2.getValue()
            X.9YO r0 = (X.AnonymousClass9YO) r0
            X.88A r0 = r0.A03()
            int r0 = r0.A00
            if (r4 <= r0) goto L_0x0281
            r4 = r0
        L_0x0281:
            java.lang.Object r0 = r2.getValue()
            X.9YO r0 = (X.AnonymousClass9YO) r0
            X.88A r0 = X.C200999ib.A00(r0, r9, r4)
            goto L_0x00b1
        L_0x028d:
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r7, r15)
            goto L_0x00a6
        L_0x0293:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0090
            int r2 = r9.A01
            int r1 = r9.A0F
            int r0 = r1 + -1
            if (r2 < r0) goto L_0x02a4
            int r0 = r2 + 1
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x02ac
        L_0x02a4:
            r0 = -1
            if (r2 >= r0) goto L_0x02a8
            r2 = -1
        L_0x02a8:
            int r2 = r2 + 1
            r9.A01 = r2
        L_0x02ac:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handleHighThroughput - offset ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] :: Received video frames {"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "} within the threshold, so not updating bitrate."
            goto L_0x00a8
        L_0x02c4:
            X.AnonymousClass0AN.A00(r20)
            goto L_0x00be
        L_0x02c9:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x02cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
