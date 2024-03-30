package com.facebook.exoplayer.datasource;

import X.A1B;
import X.AUR;
import X.AnonymousClass904;
import X.B2E;
import X.B5U;
import X.B5V;
import X.B5W;
import X.C192369Gs;
import X.C201379jQ;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FbHttpProxyDataSource implements B5V, B5U {
    public B5V A00;
    public B5W A01;
    public int A02;
    public long A03 = 0;
    public boolean A04;
    public final C201379jQ A05;
    public final AUR A06;
    public final C192369Gs A07;
    public final AnonymousClass904 A08;

    public static void A00(FbHttpProxyDataSource fbHttpProxyDataSource, String str, Map map) {
        List list = (List) map.get(str);
        if (list != null) {
            fbHttpProxyDataSource.A01.BjX(str, list.get(0));
        }
    }

    public synchronized void close() {
        this.A00.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.A03     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x000c
            monitor-exit(r6)
            return r5
        L_0x000c:
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            long r2 = (long) r9
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0028 }
            int r9 = (int) r0     // Catch:{ all -> 0x0028 }
        L_0x0018:
            X.B5V r0 = r6.A00     // Catch:{ all -> 0x0028 }
            int r4 = r0.read(r7, r8, r9)     // Catch:{ all -> 0x0028 }
            if (r4 == r5) goto L_0x0026
            long r2 = r6.A03     // Catch:{ all -> 0x0028 }
            long r0 = (long) r4     // Catch:{ all -> 0x0028 }
            long r2 = r2 - r0
            r6.A03 = r2     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r6)
            return r4
        L_0x0028:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.read(byte[], int, int):int");
    }

    public Map BGn() {
        return this.A00.BGn();
    }

    public Uri BIj() {
        return this.A00.BIj();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long Bks(X.C202189lD r64) {
        /*
            r63 = this;
            r4 = r63
            monitor-enter(r4)
            r5 = r64
            android.net.Uri r0 = r5.A04     // Catch:{ all -> 0x02a3 }
            r62 = r0
            X.9em r6 = r5.A05     // Catch:{ all -> 0x02a3 }
            X.9iO r0 = r6.A0F     // Catch:{ all -> 0x02a3 }
            boolean r7 = r0.A02     // Catch:{ all -> 0x02a3 }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x02a3 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x02a3 }
            X.9jQ r0 = r4.A05     // Catch:{ all -> 0x02a3 }
            java.lang.String r10 = r0.A07     // Catch:{ all -> 0x02a3 }
            X.9iO r9 = new X.9iO     // Catch:{ all -> 0x02a3 }
            r9.<init>(r2, r1, r7)     // Catch:{ all -> 0x02a3 }
            X.9jH r3 = r6.A0E     // Catch:{ all -> 0x02a3 }
            if (r3 != 0) goto L_0x0024
            X.8y6 r0 = X.C187558y6.A00     // Catch:{ all -> 0x02a3 }
            X.9jH r3 = r0.mHttpPriority     // Catch:{ all -> 0x02a3 }
        L_0x0024:
            if (r7 == 0) goto L_0x005f
            X.AUR r2 = r4.A06     // Catch:{ all -> 0x02a3 }
            boolean r0 = r2.enableHttpPriorityForPrefetch     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r2.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0047
            byte r1 = r3.A00     // Catch:{ all -> 0x02a3 }
            r0 = 1
        L_0x0033:
            X.9jH r3 = new X.9jH     // Catch:{ all -> 0x02a3 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x02a3 }
        L_0x0038:
            boolean r0 = r2.useLowerHttpPriorityForUnimportantPrefetch     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x004b
            long r0 = r5.A03     // Catch:{ all -> 0x02a3 }
            r11 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r1 = 1
            if (r8 > 0) goto L_0x004c
            goto L_0x004b
        L_0x0047:
            byte r1 = r3.A00     // Catch:{ all -> 0x02a3 }
            r0 = 0
            goto L_0x0033
        L_0x004b:
            r1 = 0
        L_0x004c:
            boolean r0 = r2.useLowerHttpPriorityForAllPrefetch     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x005c
            if (r1 == 0) goto L_0x0091
            boolean r0 = r2.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0059
            X.8y6 r0 = X.C187558y6.A09     // Catch:{ all -> 0x02a3 }
            goto L_0x0097
        L_0x0059:
            X.8y6 r0 = X.C187558y6.A08     // Catch:{ all -> 0x02a3 }
            goto L_0x0097
        L_0x005c:
            if (r1 == 0) goto L_0x0099
            goto L_0x0091
        L_0x005f:
            X.AUR r2 = r4.A06     // Catch:{ all -> 0x02a3 }
            boolean r0 = r2.enableHttpPriorityForStreaming     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0099
            boolean r0 = r2.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x007c
            X.8y6 r0 = X.C187558y6.A05     // Catch:{ all -> 0x02a3 }
        L_0x006b:
            X.9jH r3 = r0.mHttpPriority     // Catch:{ all -> 0x02a3 }
            int r1 = r2.bufferedDurationBasedHttpPriorityUpperBoundMs     // Catch:{ all -> 0x02a3 }
            if (r1 <= 0) goto L_0x0099
            int r0 = r6.A00     // Catch:{ all -> 0x02a3 }
            if (r0 <= r1) goto L_0x0099
            boolean r1 = r2.useHttpPriorityWarmupForLongBufferedStreaming     // Catch:{ all -> 0x02a3 }
            boolean r0 = r2.useHttpPriorityIncrementalForLongBufferedStreaming     // Catch:{ all -> 0x02a3 }
            if (r1 == 0) goto L_0x0084
            goto L_0x007f
        L_0x007c:
            X.8y6 r0 = X.C187558y6.A04     // Catch:{ all -> 0x02a3 }
            goto L_0x006b
        L_0x007f:
            if (r0 == 0) goto L_0x008c
            X.8y6 r0 = X.C187558y6.A0B     // Catch:{ all -> 0x02a3 }
            goto L_0x008e
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            X.8y6 r0 = X.C187558y6.A03     // Catch:{ all -> 0x02a3 }
            goto L_0x008e
        L_0x0089:
            X.8y6 r0 = X.C187558y6.A02     // Catch:{ all -> 0x02a3 }
            goto L_0x008e
        L_0x008c:
            X.8y6 r0 = X.C187558y6.A0A     // Catch:{ all -> 0x02a3 }
        L_0x008e:
            X.9jH r3 = r0.mHttpPriority     // Catch:{ all -> 0x02a3 }
            goto L_0x0099
        L_0x0091:
            boolean r0 = r2.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0151
            X.8y6 r0 = X.C187558y6.A07     // Catch:{ all -> 0x02a3 }
        L_0x0097:
            X.9jH r3 = r0.mHttpPriority     // Catch:{ all -> 0x02a3 }
        L_0x0099:
            byte[] r0 = r5.A08     // Catch:{ all -> 0x02a3 }
            r61 = r0
            long r0 = r5.A01     // Catch:{ all -> 0x02a3 }
            r59 = r0
            long r0 = r5.A03     // Catch:{ all -> 0x02a3 }
            r57 = r0
            long r0 = r5.A02     // Catch:{ all -> 0x02a3 }
            r55 = r0
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x02a3 }
            r54 = r0
            int r0 = r5.A00     // Catch:{ all -> 0x02a3 }
            r53 = r0
            int r0 = r4.A02     // Catch:{ all -> 0x02a3 }
            r34 = r0
            r8 = 0
            r25 = 0
            java.lang.String r0 = r6.A0J     // Catch:{ all -> 0x02a3 }
            r22 = r0
            long r0 = r6.A09     // Catch:{ all -> 0x02a3 }
            r41 = r0
            boolean r0 = r6.A0P     // Catch:{ all -> 0x02a3 }
            r49 = r0
            int r0 = r6.A07     // Catch:{ all -> 0x02a3 }
            r30 = r0
            int r0 = r6.A06     // Catch:{ all -> 0x02a3 }
            r31 = r0
            int r0 = r6.A00     // Catch:{ all -> 0x02a3 }
            r32 = r0
            int r0 = r6.A08     // Catch:{ all -> 0x02a3 }
            r33 = r0
            boolean r0 = r6.A0R     // Catch:{ all -> 0x02a3 }
            r50 = r0
            boolean r0 = r6.A0O     // Catch:{ all -> 0x02a3 }
            r51 = r0
            long r0 = r6.A0B     // Catch:{ all -> 0x02a3 }
            r43 = r0
            long r15 = r6.A0D     // Catch:{ all -> 0x02a3 }
            boolean r0 = r6.A0Q     // Catch:{ all -> 0x02a3 }
            r52 = r0
            int r0 = r6.A05     // Catch:{ all -> 0x02a3 }
            r35 = r0
            int r0 = r6.A02     // Catch:{ all -> 0x02a3 }
            r36 = r0
            long r11 = r6.A0C     // Catch:{ all -> 0x02a3 }
            long r0 = r6.A0A     // Catch:{ all -> 0x02a3 }
            int r13 = r6.A01     // Catch:{ all -> 0x02a3 }
            r37 = r13
            java.util.Map r13 = r6.A0N     // Catch:{ all -> 0x02a3 }
            int r14 = r6.A03     // Catch:{ all -> 0x02a3 }
            r38 = r14
            java.lang.String r14 = r6.A0H     // Catch:{ all -> 0x02a3 }
            r23 = r14
            java.lang.String r14 = r6.A0G     // Catch:{ all -> 0x02a3 }
            r24 = r14
            java.lang.String r14 = r6.A0I     // Catch:{ all -> 0x02a3 }
            r26 = r14
            java.lang.String r14 = r6.A0M     // Catch:{ all -> 0x02a3 }
            java.lang.String r6 = r6.A0K     // Catch:{ all -> 0x02a3 }
            r17 = -1
            X.9em r19 = new X.9em     // Catch:{ all -> 0x02a3 }
            r20 = r3
            r21 = r9
            r27 = r14
            r28 = r6
            r29 = r13
            r39 = r41
            r41 = r43
            r43 = r15
            r45 = r11
            r47 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r47, r49, r50, r51, r52)     // Catch:{ all -> 0x02a3 }
            X.9lD r9 = new X.9lD     // Catch:{ all -> 0x02a3 }
            r20 = r9
            r21 = r62
            r22 = r19
            r23 = r54
            r24 = r61
            r25 = r53
            r26 = r59
            r28 = r57
            r30 = r55
            r20.<init>(r21, r22, r23, r24, r25, r26, r28, r30)     // Catch:{ all -> 0x02a3 }
            boolean r0 = r2.enableVideoPlayerServerSideBweAnnotations     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x016f
            X.904 r1 = r4.A08     // Catch:{ all -> 0x02a3 }
            X.904 r0 = X.AnonymousClass904.DASH_VIDEO     // Catch:{ all -> 0x02a3 }
            if (r1 == r0) goto L_0x0155
            X.904 r0 = X.AnonymousClass904.PROGRESSIVE     // Catch:{ all -> 0x02a3 }
            if (r1 == r0) goto L_0x0155
            X.904 r0 = X.AnonymousClass904.LIVE_VIDEO     // Catch:{ all -> 0x02a3 }
            if (r1 != r0) goto L_0x016f
            goto L_0x0155
        L_0x0151:
            X.8y6 r0 = X.C187558y6.A06     // Catch:{ all -> 0x02a3 }
            goto L_0x0097
        L_0x0155:
            if (r7 == 0) goto L_0x015a
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x02a3 }
            goto L_0x015c
        L_0x015a:
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x02a3 }
        L_0x015c:
            java.lang.String r3 = "x-fb-ssbwe-annotation-request-type"
            int r0 = r0.intValue()     // Catch:{ all -> 0x02a3 }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0178
            java.lang.String r1 = "android-playing-video"
        L_0x0168:
            X.9em r0 = r9.A05     // Catch:{ all -> 0x02a3 }
            java.util.Map r0 = r0.A0N     // Catch:{ all -> 0x02a3 }
            r0.put(r3, r1)     // Catch:{ all -> 0x02a3 }
        L_0x016f:
            com.facebook.video.heroplayer.setting.FbAutogeneratedSettings r0 = r2.autogenSettings     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r0.enableSloHttpHeaderLogging     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x01ab
            goto L_0x017b
        L_0x0178:
            java.lang.String r1 = "android-prefetch-video"
            goto L_0x0168
        L_0x017b:
            if (r10 == 0) goto L_0x018e
            X.9bU r3 = X.C197309bU.A01     // Catch:{ all -> 0x02a3 }
            monitor-enter(r3)     // Catch:{ all -> 0x02a3 }
            android.util.LruCache r0 = r3.A00     // Catch:{ all -> 0x02a0 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x02a0 }
            boolean r0 = X.AnonymousClass000.A1V(r0)
            monitor-exit(r3)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x018e
            goto L_0x01ab
        L_0x018e:
            java.lang.String r1 = "x-fb-qpl-ec"
            boolean r0 = r13.containsKey(r1)     // Catch:{ all -> 0x02a3 }
            if (r0 != 0) goto L_0x0199
            X.C200329hA.A02(r5)     // Catch:{ all -> 0x02a3 }
        L_0x0199:
            java.lang.String r1 = X.C36431kI.A1A(r1, r13)     // Catch:{ all -> 0x02a3 }
            if (r1 == 0) goto L_0x01ab
            r9.A00(r13)     // Catch:{ all -> 0x02a3 }
            X.9bU r3 = X.C197309bU.A01     // Catch:{ all -> 0x02a3 }
            monitor-enter(r3)     // Catch:{ all -> 0x02a3 }
            android.util.LruCache r0 = r3.A00     // Catch:{ all -> 0x02a0 }
            r0.put(r10, r1)     // Catch:{ all -> 0x02a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x02a3 }
        L_0x01ab:
            X.B5W r1 = r4.A01     // Catch:{ IOException -> 0x029e }
            if (r1 == 0) goto L_0x01b4
            X.8zj r0 = X.C188528zj.NOT_CACHED     // Catch:{ IOException -> 0x029e }
            r1.BjY(r9, r0)     // Catch:{ IOException -> 0x029e }
        L_0x01b4:
            X.B5V r1 = r4.A00     // Catch:{ IOException -> 0x029e }
            long r5 = r1.Bks(r9)     // Catch:{ IOException -> 0x029e }
            r11 = 1
            boolean r0 = r2.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x02a3 }
            boolean r7 = X.AnonymousClass000.A1P(r0)
            java.util.Map r3 = r1.BGn()     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x025b
            X.B5W r0 = r4.A01     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x025b
            java.lang.String r2 = "X-FB-Connection-Quality"
            java.util.List r0 = X.C200329hA.A01(r2, r3, r7)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x01dc
            java.lang.String r1 = X.C36401kF.A0s(r0, r8)     // Catch:{ all -> 0x02a3 }
            X.B5W r0 = r4.A01     // Catch:{ all -> 0x02a3 }
            r0.BjX(r2, r1)     // Catch:{ all -> 0x02a3 }
        L_0x01dc:
            java.lang.String r2 = "x-fb-cec-video-limit"
            java.util.List r0 = X.C90524aI.A0o(r2, r3)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x01ed
            java.lang.String r1 = X.C36401kF.A0s(r0, r8)     // Catch:{ all -> 0x02a3 }
            X.B5W r0 = r4.A01     // Catch:{ all -> 0x02a3 }
            r0.BjX(r2, r1)     // Catch:{ all -> 0x02a3 }
        L_0x01ed:
            java.lang.String r0 = "up-ttfb"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-fb-log-session-id"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-fb-log-transaction-id"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-fb-session-id"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-fb-response-time-ms"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-bwe-mean"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-bwe-std-dev"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-fb-dynamic-predictive-response-chunk-size"
            A00(r4, r0, r3)     // Catch:{ all -> 0x02a3 }
            java.util.Iterator r13 = X.AnonymousClass000.A0y(r3)     // Catch:{ all -> 0x02a3 }
        L_0x0219:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x025b
            java.util.Map$Entry r12 = X.AnonymousClass000.A11(r13)     // Catch:{ all -> 0x02a3 }
            java.lang.Object r0 = r12.getKey()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r12.getValue()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r12.getValue()     // Catch:{ all -> 0x02a3 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x02a3 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02a3 }
            if (r0 != 0) goto L_0x0219
            java.lang.String r1 = X.C90494aF.A0f(r12)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "x-fb-ull-"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0219
            X.B5W r2 = r4.A01     // Catch:{ all -> 0x02a3 }
            java.lang.String r1 = X.C90494aF.A0f(r12)     // Catch:{ all -> 0x02a3 }
            java.lang.Object r0 = r12.getValue()     // Catch:{ all -> 0x02a3 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x02a3 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x02a3 }
            r2.BjX(r1, r0)     // Catch:{ all -> 0x02a3 }
            goto L_0x0219
        L_0x025b:
            long r7 = X.C200329hA.A00(r3, r7)     // Catch:{ all -> 0x02a3 }
            r0 = 0
            long r2 = r9.A03     // Catch:{ all -> 0x02a3 }
            long r7 = r7 - r2
            long r0 = java.lang.Math.max(r0, r7)     // Catch:{ all -> 0x02a3 }
            int r7 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x0273
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0273
            r4.A03 = r5     // Catch:{ all -> 0x02a3 }
            goto L_0x0275
        L_0x0273:
            r4.A03 = r0     // Catch:{ all -> 0x02a3 }
        L_0x0275:
            java.lang.String r13 = "com.facebook.exoplayer.datasource.FbHttpProxyDataSource"
            java.lang.String r12 = "Opening data spec Offset: %d, Length %d Open Length %d Videoid %s Key %s"
            r7 = 5
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x02a3 }
            r7 = 0
            X.AnonymousClass000.A1M(r8, r7, r2)     // Catch:{ all -> 0x02a3 }
            long r2 = r9.A02     // Catch:{ all -> 0x02a3 }
            X.AnonymousClass000.A1M(r8, r11, r2)     // Catch:{ all -> 0x02a3 }
            r7 = 2
            X.AnonymousClass000.A1M(r8, r7, r0)     // Catch:{ all -> 0x02a3 }
            r7 = 3
            r8[r7] = r10     // Catch:{ all -> 0x02a3 }
            r10 = 4
            java.lang.String r7 = r9.A06     // Catch:{ all -> 0x02a3 }
            r8[r10] = r7     // Catch:{ all -> 0x02a3 }
            X.C131916Rh.A01(r13, r12, r8)     // Catch:{ all -> 0x02a3 }
            int r7 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x029c
            long r0 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x02a3 }
        L_0x029c:
            monitor-exit(r4)
            return r0
        L_0x029e:
            r0 = move-exception
            goto L_0x02a2
        L_0x02a0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02a3 }
        L_0x02a2:
            throw r0     // Catch:{ all -> 0x02a3 }
        L_0x02a3:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.Bks(X.9lD):long");
    }

    public void cancel() {
        if (this.A04) {
            this.A00.cancel();
        }
    }

    public FbHttpProxyDataSource(B5V b5v, B5W b5w, C192369Gs r8, C201379jQ r9, AUR aur, int i, int i2, boolean z) {
        AnonymousClass904 r1;
        this.A05 = r9;
        this.A00 = b5v;
        this.A02 = i;
        this.A01 = b5w;
        AnonymousClass904[] values = AnonymousClass904.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r1 = AnonymousClass904.UNKNOWN;
                break;
            }
            r1 = values[i3];
            if (r1.value == i2) {
                break;
            }
            i3++;
        }
        this.A08 = r1;
        this.A04 = z;
        this.A06 = aur;
        this.A07 = r8;
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        if (b2e instanceof B5W) {
            this.A01 = (B5W) b2e;
        } else {
            this.A01 = new A1B(b2e);
        }
    }
}
