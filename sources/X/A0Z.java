package X;

import android.net.Uri;
import android.util.Pair;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class A0Z implements B5U {
    public long A00;
    public long A01;
    public B2C A02;
    public B39 A03;
    public B5V A04;
    public C21664AUg A05;
    public B5W A06;
    public AnonymousClass9SU A07;
    public C195429Ug A08;
    public boolean A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public boolean A0D;
    public boolean A0E = false;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final AnonymousClass83D A0J;
    public final C201619jy A0K;
    public final AnonymousClass904 A0L;
    public final C201379jQ A0M;
    public final AUR A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final AtomicBoolean A0U;

    private void A02() {
        try {
            C196289Yq.A01("exo-closecurrentstream");
            C21664AUg aUg = this.A05;
            if (aUg == null) {
                hashCode();
            } else {
                hashCode();
                File file = aUg.A06;
                if (file != null) {
                    file.getPath();
                }
            }
            if (this.A03 != null) {
                B5W b5w = this.A06;
                if (b5w != null) {
                    if (this.A0D) {
                        b5w.BjU();
                    } else {
                        b5w.BjV(A00(), this, true);
                    }
                }
                this.A03.close();
                this.A03 = null;
            }
            C21664AUg aUg2 = this.A05;
            if (aUg2 != null && !aUg2.A08) {
                Object[] objArr = new Object[5];
                objArr[0] = this.A0L;
                AnonymousClass000.A1M(objArr, 1, aUg2.A05);
                AnonymousClass000.A1M(objArr, 2, aUg2.A04);
                objArr[3] = this.A0M.A07;
                objArr[4] = this.A07.A06;
                C131916Rh.A01("FbHttpCacheDataSource", "Cache data sink close stream. Type:%s, Offset:%d, FileSize:%d, Vid:%s, Key:%s", objArr);
                B2C b2c = this.A02;
                if (b2c != null) {
                    try {
                        b2c.close();
                        this.A02 = null;
                    } catch (C187218xS unused) {
                    }
                }
            }
        } finally {
            C21664AUg aUg3 = this.A05;
            if (aUg3 != null && !aUg3.A08) {
                A04(aUg3);
            }
            this.A05 = null;
            C196289Yq.A00();
        }
    }

    public Uri BIj() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0110, code lost:
        if (r11.A06 > 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        if (r3 != false) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bks(X.C202189lD r30) {
        /*
            r29 = this;
            r8 = 0
            r6 = r29
            r6.A0D = r8
            r7 = r30
            java.lang.String r15 = r7.A06     // Catch:{ IOException -> 0x01a6 }
            X.9jQ r9 = r6.A0M     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r5 = r9.A07     // Catch:{ IOException -> 0x01a6 }
            android.net.Uri r0 = r7.A04     // Catch:{ IOException -> 0x01a6 }
            r28 = r0
            boolean r14 = r6.A0P     // Catch:{ IOException -> 0x01a6 }
            X.AUR r4 = r6.A0N     // Catch:{ IOException -> 0x01a6 }
            boolean r2 = r4.useShortKey     // Catch:{ IOException -> 0x01a6 }
            boolean r10 = r9.A01     // Catch:{ IOException -> 0x01a6 }
            boolean r1 = r4.splitLastSegmentCachekey     // Catch:{ IOException -> 0x01a6 }
            boolean r0 = r4.skipThumbnailCacheKey     // Catch:{ IOException -> 0x01a6 }
            r20 = r2
            r21 = r10
            r22 = r1
            r23 = r0
            r18 = r5
            r19 = r14
            r17 = r15
            r16 = r28
            java.lang.String r12 = X.C131916Rh.A00(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x01a6 }
            boolean r1 = r4.checkThumbnailCache     // Catch:{ IOException -> 0x01a6 }
            if (r1 == 0) goto L_0x0072
            X.9jy r0 = r6.A0K     // Catch:{ IOException -> 0x01a6 }
            X.B5Y r22 = r0.A03()     // Catch:{ IOException -> 0x01a6 }
            long r2 = r7.A03     // Catch:{ IOException -> 0x01a6 }
            long r0 = r7.A02     // Catch:{ IOException -> 0x01a6 }
            r23 = r12
            r24 = r2
            r26 = r0
            boolean r11 = r22.BLI(r23, r24, r26)     // Catch:{ IOException -> 0x01a6 }
            if (r11 != 0) goto L_0x0072
            boolean r13 = r4.useShortKey     // Catch:{ IOException -> 0x01a6 }
            boolean r19 = X.AnonymousClass000.A1Q(r10)
            boolean r11 = r4.splitLastSegmentCachekey     // Catch:{ IOException -> 0x01a6 }
            boolean r10 = r4.skipThumbnailCacheKey     // Catch:{ IOException -> 0x01a6 }
            r18 = r13
            r20 = r11
            r21 = r10
            r16 = r5
            r17 = r14
            r14 = r28
            java.lang.String r23 = X.C131916Rh.A00(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x01a6 }
            r10 = 2
            long r0 = r0 / r10
            r26 = r0
            boolean r0 = r22.BLI(r23, r24, r26)     // Catch:{ IOException -> 0x01a6 }
            if (r0 == 0) goto L_0x0072
            r12 = r23
        L_0x0072:
            r13 = 2
            X.9SU r0 = r6.A07     // Catch:{ IOException -> 0x01a6 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C200319h9.A02(r0)     // Catch:{ IOException -> 0x01a6 }
            X.9SU r0 = new X.9SU     // Catch:{ IOException -> 0x01a6 }
            r0.<init>(r7, r12)     // Catch:{ IOException -> 0x01a6 }
            r6.A07 = r0     // Catch:{ IOException -> 0x01a6 }
            X.AUD r0 = r4.cache     // Catch:{ IOException -> 0x01a6 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ IOException -> 0x01a6 }
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r28.toString()     // Catch:{ IOException -> 0x01a6 }
            X.9Ug r11 = new X.9Ug     // Catch:{ IOException -> 0x01a6 }
            r11.<init>(r9, r0)     // Catch:{ IOException -> 0x01a6 }
            r6.A08 = r11     // Catch:{ IOException -> 0x01a6 }
            X.9jy r0 = r6.A0K     // Catch:{ IOException -> 0x01a6 }
            X.B5Y r10 = r0.A03()     // Catch:{ IOException -> 0x01a6 }
            X.9SU r14 = r6.A07     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r0 = "VideoRequestEvent.onOpen"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ IOException -> 0x01a6 }
            long r2 = r14.A02     // Catch:{ all -> 0x00f6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00f6 }
            r11.A06 = r0     // Catch:{ all -> 0x00f6 }
            long r0 = r14.A01     // Catch:{ all -> 0x00f6 }
            r15 = -1
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x00b3
            long r15 = r0 + r2
        L_0x00b3:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00f6 }
            r11.A05 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = r14.A06     // Catch:{ all -> 0x00f6 }
            r11.A07 = r0     // Catch:{ all -> 0x00f6 }
            java.util.NavigableSet r3 = r10.B9B(r0)     // Catch:{ all -> 0x00f6 }
            boolean r0 = X.AnonymousClass000.A1V(r3)
            r11.A09 = r0     // Catch:{ all -> 0x00f6 }
            r0 = -1
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r2 = r3.first()     // Catch:{ all -> 0x00f6 }
            X.AUg r2 = (X.C21664AUg) r2     // Catch:{ all -> 0x00f6 }
            long r9 = r2.A05     // Catch:{ all -> 0x00f6 }
            java.lang.Object r15 = r3.last()     // Catch:{ all -> 0x00f6 }
            X.AUg r15 = (X.C21664AUg) r15     // Catch:{ all -> 0x00f6 }
            long r2 = r15.A04     // Catch:{ all -> 0x00f6 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 == 0) goto L_0x00e2
            long r0 = r15.A05     // Catch:{ all -> 0x00f6 }
            long r0 = r0 + r2
        L_0x00e2:
            r2 = r0
            r0 = r9
            goto L_0x00e7
        L_0x00e5:
            r2 = -1
        L_0x00e7:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00f6 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x00f6 }
            r11.A04 = r0     // Catch:{ all -> 0x00f6 }
            goto L_0x00fc
        L_0x00f6:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()     // Catch:{ IOException -> 0x01a6 }
            goto L_0x01a5
        L_0x00fc:
            com.facebook.systrace.Systrace.A00()     // Catch:{ IOException -> 0x01a6 }
        L_0x00ff:
            X.9em r11 = r7.A05     // Catch:{ IOException -> 0x01a6 }
            if (r11 == 0) goto L_0x0112
            X.AUD r0 = r4.cache     // Catch:{ IOException -> 0x01a6 }
            boolean r0 = r0.enableInitSegmentFix     // Catch:{ IOException -> 0x01a6 }
            if (r0 == 0) goto L_0x0112
            int r0 = r11.A07     // Catch:{ IOException -> 0x01a6 }
            if (r0 > 0) goto L_0x0112
            int r1 = r11.A06     // Catch:{ IOException -> 0x01a6 }
            r0 = 1
            if (r1 <= 0) goto L_0x0113
        L_0x0112:
            r0 = 0
        L_0x0113:
            r6.A05(r0)     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r10 = "FbHttpCacheDataSource"
            java.lang.String r9 = "Cache data source open spec. Type:%s, Position:%d/%d, Length:%d, Vid:%s, Key:%s"
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x01a6 }
            X.904 r2 = r6.A0L     // Catch:{ IOException -> 0x01a6 }
            r3[r8] = r2     // Catch:{ IOException -> 0x01a6 }
            long r0 = r7.A03     // Catch:{ IOException -> 0x01a6 }
            r8 = 1
            X.AnonymousClass000.A1M(r3, r8, r0)     // Catch:{ IOException -> 0x01a6 }
            long r0 = r7.A01     // Catch:{ IOException -> 0x01a6 }
            X.AnonymousClass000.A1M(r3, r13, r0)     // Catch:{ IOException -> 0x01a6 }
            r8 = 3
            long r0 = r7.A02     // Catch:{ IOException -> 0x01a6 }
            X.AnonymousClass000.A1M(r3, r8, r0)     // Catch:{ IOException -> 0x01a6 }
            X.C36381kD.A1L(r5, r12, r3)     // Catch:{ IOException -> 0x01a6 }
            X.C131916Rh.A01(r10, r9, r3)     // Catch:{ IOException -> 0x01a6 }
            com.facebook.video.heroplayer.setting.FbAutogeneratedSettings r3 = r4.autogenSettings     // Catch:{ IOException -> 0x01a6 }
            if (r3 == 0) goto L_0x0152
            boolean r3 = r3.enableSloHttpHeaderLogging     // Catch:{ IOException -> 0x01a6 }
            if (r3 == 0) goto L_0x0152
            if (r5 == 0) goto L_0x015b
            X.9bU r8 = X.C197309bU.A01     // Catch:{ IOException -> 0x01a6 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x01a6 }
            android.util.LruCache r3 = r8.A00     // Catch:{ all -> 0x01a3 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01a3 }
            boolean r3 = X.AnonymousClass000.A1V(r3)
            monitor-exit(r8)     // Catch:{ IOException -> 0x01a6 }
            if (r3 == 0) goto L_0x015b
        L_0x0152:
            r11 = 0
            r9 = -1
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x018c
            goto L_0x0185
        L_0x015b:
            if (r11 == 0) goto L_0x015e
            goto L_0x0164
        L_0x015e:
            X.C200329hA.A02(r7)     // Catch:{ IOException -> 0x01a6 }
            if (r11 == 0) goto L_0x0152
            goto L_0x016e
        L_0x0164:
            java.util.Map r8 = r11.A0N     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r3 = "x-fb-qpl-ec"
            boolean r3 = r8.containsKey(r3)     // Catch:{ IOException -> 0x01a6 }
            if (r3 == 0) goto L_0x015e
        L_0x016e:
            java.util.Map r9 = r11.A0N     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r3 = "x-fb-qpl-ec"
            java.lang.Object r8 = r9.get(r3)     // Catch:{ IOException -> 0x01a6 }
            if (r8 == 0) goto L_0x0152
            r7.A00(r9)     // Catch:{ IOException -> 0x01a6 }
            X.9bU r7 = X.C197309bU.A01     // Catch:{ IOException -> 0x01a6 }
            monitor-enter(r7)     // Catch:{ IOException -> 0x01a6 }
            android.util.LruCache r3 = r7.A00     // Catch:{ all -> 0x01a0 }
            r3.put(r5, r8)     // Catch:{ all -> 0x01a0 }
            monitor-exit(r7)     // Catch:{ IOException -> 0x01a6 }
            goto L_0x0152
        L_0x0185:
            long r7 = r6.A01     // Catch:{ IOException -> 0x01a6 }
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x018c
            return r7
        L_0x018c:
            boolean r3 = r4.enableUpdateProgressiveContentLengthFromCache     // Catch:{ IOException -> 0x01a6 }
            if (r3 == 0) goto L_0x019f
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            X.904 r3 = X.AnonymousClass904.PROGRESSIVE     // Catch:{ IOException -> 0x01a6 }
            if (r2 != r3) goto L_0x019f
            long r7 = r6.A00     // Catch:{ IOException -> 0x01a6 }
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x019f
            return r7
        L_0x019f:
            return r0
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x01a6 }
            goto L_0x01a5
        L_0x01a3:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ IOException -> 0x01a6 }
        L_0x01a5:
            throw r0     // Catch:{ IOException -> 0x01a6 }
        L_0x01a6:
            r2 = move-exception
            X.AUR r0 = r6.A0N
            X.AUD r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x01c2
            X.9Ug r1 = r6.A08
            java.lang.String r0 = "VideoRequestEvent.onException"
            com.facebook.debug.tracer.Tracer.A00(r0)
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x01ba }
            goto L_0x01bf
        L_0x01ba:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()
            throw r0
        L_0x01bf:
            com.facebook.systrace.Systrace.A00()
        L_0x01c2:
            X.B5W r1 = r6.A06
            if (r1 == 0) goto L_0x01cd
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x01ce
            r1.BjU()
        L_0x01cd:
            throw r2
        L_0x01ce:
            r1.BjW(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0Z.Bks(X.9lD):long");
    }

    public void cancel() {
        this.A0D = true;
        if (this.A0N.cancelOngoingRequest) {
            this.A04.cancel();
        }
    }

    private C202189lD A00() {
        File file;
        AnonymousClass9SU r0 = this.A07;
        long j = r0.A02;
        long j2 = r0.A01;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        C21664AUg aUg = this.A05;
        if (aUg != null && this.A0N.checkCachedLockedCacheSpan && aUg.A08) {
            j -= aUg.A05;
            j2 = Math.min(aUg.A04 - j, j2);
        }
        Uri uri = null;
        if (!(this.A0N.enableVideoMemoryCache || aUg == null || (file = aUg.A06) == null)) {
            uri = Uri.fromFile(file);
        }
        AnonymousClass9SU r02 = this.A07;
        long j3 = r02.A00;
        return new C202189lD(uri, r02.A05, r02.A06, (byte[]) null, r02.A03, j3, j, j2);
    }

    private C21664AUg A01(C23077B3i b3i) {
        NavigableSet<C21664AUg> B9B = b3i.B9B(this.A07.A06);
        if (B9B == null) {
            return null;
        }
        for (C21664AUg aUg : B9B) {
            if (this.A07.A02 < aUg.A05) {
                return aUg;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 != -1) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r15 = this;
            X.AUR r0 = r15.A0N
            boolean r1 = r0.alwaysPerformContentLengthUpdateFirst
            if (r1 == 0) goto L_0x001e
            X.9jy r1 = r15.A0K
            X.B5Y r1 = r1.A03()
            if (r1 == 0) goto L_0x001f
            X.9SU r2 = r15.A07
            java.lang.String r2 = r2.A06
            long r2 = r1.BIR(r2)
            r5 = -1
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001c:
            r15.A01 = r2
        L_0x001e:
            return
        L_0x001f:
            X.9SU r2 = r15.A07
            android.net.Uri r4 = r2.A04
            r7 = 0
            long r9 = r2.A00
            r11 = 0
            r13 = 1
            java.lang.String r6 = r2.A06
            int r8 = r2.A03
            X.9em r5 = r2.A05
            X.9lD r3 = new X.9lD
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13)
            X.B5V r2 = r15.A04     // Catch:{ IOException -> 0x004e }
            r2.Bks(r3)     // Catch:{ IOException -> 0x004e }
            java.util.Map r2 = r2.BGn()
            boolean r0 = r0.enableCaseInsensitiveHttpResponseHeaderKey
            long r2 = X.C200329hA.A00(r2, r0)
            if (r1 == 0) goto L_0x001c
            X.9SU r0 = r15.A07
            java.lang.String r0 = r0.A06
            r1.BsX(r0, r2)
            goto L_0x001c
        L_0x004e:
            r1 = move-exception
            X.B5V r0 = r15.A04
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0Z.A03():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        com.facebook.systrace.Systrace.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(X.C21664AUg r5) {
        /*
            r4 = this;
            X.9jy r3 = r4.A0K
            X.B5Y r0 = r3.A03()
            if (r0 == 0) goto L_0x0043
            X.AUR r0 = r4.A0N
            X.AUD r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x003c
            X.A0X r1 = X.A0X.A04
            if (r1 != 0) goto L_0x001b
            X.A0X r1 = new X.A0X
            r1.<init>()
            X.A0X.A04 = r1
        L_0x001b:
            X.AUg r2 = r4.A05
            java.lang.String r0 = "CacheInstrumentationListener.onReleaseHoleSpan"
            com.facebook.debug.tracer.Tracer.A00(r0)
            X.9Gr r1 = r1.A00     // Catch:{ all -> 0x0034 }
            monitor-enter(r1)     // Catch:{ all -> 0x0034 }
            java.util.TreeSet r0 = r1.A01     // Catch:{ all -> 0x0031 }
            r0.remove(r2)     // Catch:{ all -> 0x0031 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0031 }
            r0.remove(r2)     // Catch:{ all -> 0x0031 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0039
        L_0x0031:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()
            throw r0
        L_0x0039:
            com.facebook.systrace.Systrace.A00()
        L_0x003c:
            X.B5Y r0 = r3.A03()
            r0.BnP(r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0Z.A04(X.AUg):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0646, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0647, code lost:
        com.facebook.systrace.Systrace.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (r1 == null) goto L_0x013a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219 A[Catch:{ IOException -> 0x05e4, IOException -> 0x028f, all -> 0x0641 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0233 A[Catch:{ IOException -> 0x05e4, IOException -> 0x028f, all -> 0x0641 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0296 A[Catch:{ IOException -> 0x05e4, IOException -> 0x028f, all -> 0x0641 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0155 A[Catch:{ IOException | IllegalArgumentException -> 0x006e, all -> 0x0656 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b A[Catch:{ IOException | IllegalArgumentException -> 0x006e, all -> 0x0656 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0181 A[Catch:{ IOException | IllegalArgumentException -> 0x006e, all -> 0x0656 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0182 A[Catch:{ IOException | IllegalArgumentException -> 0x006e, all -> 0x0656 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(boolean r37) {
        /*
            r36 = this;
            java.lang.String r0 = "exo-opennextdatasource"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x0656 }
            r4 = r36
            X.B39 r0 = r4.A03     // Catch:{ all -> 0x0656 }
            r19 = 1
            r20 = 0
            boolean r18 = X.AnonymousClass000.A1V(r0)
            r4.A02()     // Catch:{ all -> 0x0656 }
            X.9SU r3 = r4.A07     // Catch:{ all -> 0x0656 }
            long r1 = r3.A01     // Catch:{ all -> 0x0656 }
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0023
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0023:
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0652
            X.AUR r5 = r4.A0N     // Catch:{ all -> 0x0656 }
            boolean r0 = r5.shouldLoadBinaryDataFromManifest     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x0079
            X.9em r0 = r3.A05     // Catch:{ all -> 0x0656 }
            java.lang.String r1 = r0.A0G     // Catch:{ all -> 0x0656 }
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = r0.A0H     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x0079
            X.A0I r12 = new X.A0I     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            r12.<init>(r0, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            r4.A03 = r12     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            X.9SU r8 = r4.A07     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            android.net.Uri r14 = r8.A04     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            byte[] r13 = r8.A07     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            long r6 = r8.A00     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            long r2 = r8.A02     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            long r0 = r8.A01     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            java.lang.String r11 = r8.A06     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            int r10 = r8.A03     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            X.9em r9 = r8.A05     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            X.9lD r8 = new X.9lD     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            r21 = r8
            r22 = r14
            r23 = r9
            r24 = r11
            r25 = r13
            r26 = r10
            r27 = r6
            r29 = r2
            r31 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31)     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            r12.Bks(r8)     // Catch:{ IOException | IllegalArgumentException -> 0x006e }
            goto L_0x064e
        L_0x006e:
            r3 = move-exception
            java.lang.String r2 = "FbHttpCacheDataSource"
            java.lang.String r1 = "Caught exception reading from manifest data source so ignoring"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0656 }
            X.C165607th.A1L(r1, r2, r3, r0)     // Catch:{ all -> 0x0656 }
        L_0x0079:
            X.9jy r0 = r4.A0K     // Catch:{ all -> 0x0656 }
            r35 = r0
            X.B5Y r9 = r35.A03()     // Catch:{ all -> 0x0656 }
            X.8zj r8 = X.C188528zj.NOT_CACHED     // Catch:{ all -> 0x0656 }
            if (r9 == 0) goto L_0x019a
            boolean r0 = r5.enableVrlQplLoggingEvents     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x00a8
            X.B5W r6 = r4.A06     // Catch:{ all -> 0x0656 }
            if (r6 == 0) goto L_0x00a8
            boolean r0 = r4.A0R     // Catch:{ all -> 0x0656 }
            if (r0 != 0) goto L_0x00a8
            X.9SU r1 = r4.A07     // Catch:{ all -> 0x0656 }
            long r2 = r1.A00     // Catch:{ all -> 0x0656 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            r6.BZC()     // Catch:{ all -> 0x0656 }
            goto L_0x00a8
        L_0x009d:
            X.9em r0 = r1.A05     // Catch:{ all -> 0x0656 }
            int r0 = r0.A07     // Catch:{ all -> 0x0656 }
            if (r0 != 0) goto L_0x00a8
            long r0 = r1.A01     // Catch:{ all -> 0x0656 }
            r6.BY5(r2, r0)     // Catch:{ all -> 0x0656 }
        L_0x00a8:
            boolean r3 = r4.A0R     // Catch:{ InterruptedException -> 0x0190 }
            if (r3 == 0) goto L_0x00af
            java.lang.Integer r2 = X.C023109s.A00     // Catch:{ InterruptedException -> 0x0190 }
            goto L_0x00b1
        L_0x00af:
            java.lang.Integer r2 = X.C023109s.A01     // Catch:{ InterruptedException -> 0x0190 }
        L_0x00b1:
            if (r37 == 0) goto L_0x00b5
            java.lang.Integer r2 = X.C023109s.A0G     // Catch:{ InterruptedException -> 0x0190 }
        L_0x00b5:
            boolean r0 = r5.enableLogSemiCachedEvents     // Catch:{ InterruptedException -> 0x0190 }
            if (r0 == 0) goto L_0x00fb
            X.9SU r0 = r4.A07     // Catch:{ InterruptedException -> 0x0190 }
            java.lang.String r6 = r0.A06     // Catch:{ InterruptedException -> 0x0190 }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x0190 }
            X.AUg r1 = r9.Bul(r2, r6, r0)     // Catch:{ InterruptedException -> 0x0190 }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x0190 }
            if (r1 != 0) goto L_0x00f4
            X.8zj r8 = X.C188528zj.SEMI_CACHED     // Catch:{ InterruptedException -> 0x0190 }
            boolean r0 = r4.A09     // Catch:{ InterruptedException -> 0x0190 }
            if (r0 != 0) goto L_0x013a
            boolean r1 = r5.enableCacheBlockWithoutTimeout     // Catch:{ InterruptedException -> 0x0190 }
            X.9SU r0 = r4.A07     // Catch:{ InterruptedException -> 0x0190 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r6 = r0.A06     // Catch:{ InterruptedException -> 0x0190 }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x0190 }
            X.AUg r1 = r9.Buj(r2, r6, r0)     // Catch:{ InterruptedException -> 0x0190 }
        L_0x00db:
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x0190 }
            goto L_0x0138
        L_0x00de:
            java.lang.String r10 = r0.A06     // Catch:{ InterruptedException -> 0x0190 }
            long r6 = r0.A02     // Catch:{ InterruptedException -> 0x0190 }
            int r0 = r4.A0F     // Catch:{ InterruptedException -> 0x0190 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0190 }
            r21 = r9
            r22 = r2
            r23 = r10
            r24 = r6
            r26 = r0
            X.AUg r1 = r21.Buk(r22, r23, r24, r26)     // Catch:{ InterruptedException -> 0x0190 }
            goto L_0x00db
        L_0x00f4:
            boolean r0 = r1.A08     // Catch:{ InterruptedException -> 0x0190 }
            if (r0 == 0) goto L_0x0143
            X.8zj r8 = X.C188528zj.CACHED     // Catch:{ InterruptedException -> 0x0190 }
            goto L_0x0143
        L_0x00fb:
            X.8zj r8 = X.C188528zj.CACHED     // Catch:{ InterruptedException -> 0x0190 }
            boolean r0 = r4.A09     // Catch:{ InterruptedException -> 0x0190 }
            if (r0 == 0) goto L_0x010e
            X.9SU r0 = r4.A07     // Catch:{ InterruptedException -> 0x0190 }
            java.lang.String r6 = r0.A06     // Catch:{ InterruptedException -> 0x0190 }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x0190 }
            X.AUg r1 = r9.Bul(r2, r6, r0)     // Catch:{ InterruptedException -> 0x0190 }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x0190 }
            goto L_0x0138
        L_0x010e:
            boolean r0 = r5.enableCacheBlockWithoutTimeout     // Catch:{ InterruptedException -> 0x0190 }
            if (r0 == 0) goto L_0x011f
            X.9SU r0 = r4.A07     // Catch:{ InterruptedException -> 0x0190 }
            java.lang.String r6 = r0.A06     // Catch:{ InterruptedException -> 0x0190 }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x0190 }
            X.AUg r1 = r9.Buj(r2, r6, r0)     // Catch:{ InterruptedException -> 0x0190 }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x0190 }
            goto L_0x0138
        L_0x011f:
            X.9SU r0 = r4.A07     // Catch:{ InterruptedException -> 0x0190 }
            java.lang.String r10 = r0.A06     // Catch:{ InterruptedException -> 0x0190 }
            long r6 = r0.A02     // Catch:{ InterruptedException -> 0x0190 }
            int r0 = r4.A0F     // Catch:{ InterruptedException -> 0x0190 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0190 }
            r21 = r9
            r22 = r2
            r23 = r10
            r24 = r6
            r26 = r0
            X.AUg r1 = r21.Buk(r22, r23, r24, r26)     // Catch:{ InterruptedException -> 0x0190 }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x0190 }
        L_0x0138:
            if (r1 != 0) goto L_0x0143
        L_0x013a:
            if (r3 == 0) goto L_0x0143
            java.lang.String r0 = "Timeout when obtain cache span lock"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ InterruptedException -> 0x0190 }
            throw r0     // Catch:{ InterruptedException -> 0x0190 }
        L_0x0143:
            boolean r0 = r5.enableVrlQplLoggingEvents     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x0158
            X.B5W r10 = r4.A06     // Catch:{ all -> 0x0656 }
            if (r10 == 0) goto L_0x0158
            if (r3 != 0) goto L_0x0158
            X.9SU r2 = r4.A07     // Catch:{ all -> 0x0656 }
            long r6 = r2.A00     // Catch:{ all -> 0x0656 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x015b
            r10.BZB(r8)     // Catch:{ all -> 0x0656 }
        L_0x0158:
            X.AUg r0 = r4.A05     // Catch:{ all -> 0x0656 }
            goto L_0x017f
        L_0x015b:
            X.9em r0 = r2.A05     // Catch:{ all -> 0x0656 }
            int r0 = r0.A07     // Catch:{ all -> 0x0656 }
            if (r0 != 0) goto L_0x0158
            long r2 = r2.A01     // Catch:{ all -> 0x0656 }
            boolean r0 = r5.fixNullCacheSpan     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x016f
            if (r1 == 0) goto L_0x016c
            long r0 = r1.A04     // Catch:{ all -> 0x0656 }
            goto L_0x0171
        L_0x016c:
            r0 = -1
            goto L_0x0171
        L_0x016f:
            long r0 = r1.A04     // Catch:{ all -> 0x0656 }
        L_0x0171:
            r21 = r10
            r22 = r8
            r23 = r6
            r25 = r2
            r27 = r0
            r21.BY4(r22, r23, r25, r27)     // Catch:{ all -> 0x0656 }
            goto L_0x0158
        L_0x017f:
            if (r0 != 0) goto L_0x0182
            goto L_0x0194
        L_0x0182:
            r9.hashCode()     // Catch:{ all -> 0x0656 }
            r4.hashCode()     // Catch:{ all -> 0x0656 }
            java.io.File r0 = r0.A06     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x019a
            r0.getPath()     // Catch:{ all -> 0x0656 }
            goto L_0x019a
        L_0x0190:
            X.C196289Yq.A00()
            return r20
        L_0x0194:
            r9.hashCode()     // Catch:{ all -> 0x0656 }
            r4.hashCode()     // Catch:{ all -> 0x0656 }
        L_0x019a:
            r0 = 0
            r4.A0E = r0     // Catch:{ all -> 0x0656 }
            X.AUg r1 = r4.A05     // Catch:{ all -> 0x0656 }
            if (r1 == 0) goto L_0x0309
            boolean r0 = r1.A08     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x0309
            long r0 = r1.A04     // Catch:{ all -> 0x0656 }
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            boolean r0 = X.C90504aG.A1T(r2)
            X.C200319h9.A02(r0)     // Catch:{ all -> 0x0656 }
            X.B5W r13 = r4.A06     // Catch:{ all -> 0x0656 }
            if (r13 == 0) goto L_0x01e2
            X.9SU r9 = r4.A07     // Catch:{ all -> 0x0656 }
            android.net.Uri r15 = r9.A04     // Catch:{ all -> 0x0656 }
            byte[] r14 = r9.A07     // Catch:{ all -> 0x0656 }
            long r6 = r9.A00     // Catch:{ all -> 0x0656 }
            long r2 = r9.A02     // Catch:{ all -> 0x0656 }
            long r0 = r9.A01     // Catch:{ all -> 0x0656 }
            java.lang.String r12 = r9.A06     // Catch:{ all -> 0x0656 }
            int r11 = r9.A03     // Catch:{ all -> 0x0656 }
            X.9em r10 = r9.A05     // Catch:{ all -> 0x0656 }
            X.9lD r9 = new X.9lD     // Catch:{ all -> 0x0656 }
            r21 = r9
            r22 = r15
            r23 = r10
            r24 = r12
            r25 = r14
            r26 = r11
            r27 = r6
            r29 = r2
            r31 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31)     // Catch:{ all -> 0x0656 }
            r13.BjY(r9, r8)     // Catch:{ all -> 0x0656 }
        L_0x01e2:
            java.lang.String r0 = "exo-opencachedatasource"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x0641 }
            X.AUg r0 = r4.A05     // Catch:{ all -> 0x0641 }
            if (r0 != 0) goto L_0x01f8
            r4.hashCode()     // Catch:{ all -> 0x0641 }
        L_0x01ee:
            X.AUg r2 = r4.A05     // Catch:{ all -> 0x0641 }
            if (r2 == 0) goto L_0x0203
            boolean r1 = r2.A08     // Catch:{ all -> 0x0641 }
            r0 = 1
            if (r1 != 0) goto L_0x0204
            goto L_0x0203
        L_0x01f8:
            r4.hashCode()     // Catch:{ all -> 0x0641 }
            java.io.File r0 = r0.A06     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x01ee
            r0.getPath()     // Catch:{ all -> 0x0641 }
            goto L_0x01ee
        L_0x0203:
            r0 = 0
        L_0x0204:
            X.C200319h9.A02(r0)     // Catch:{ all -> 0x0641 }
            X.9SU r8 = r4.A07     // Catch:{ all -> 0x0641 }
            long r6 = r8.A02     // Catch:{ all -> 0x0641 }
            long r0 = r2.A05     // Catch:{ all -> 0x0641 }
            long r6 = r6 - r0
            long r2 = r2.A04     // Catch:{ all -> 0x0641 }
            long r2 = r2 - r6
            long r0 = r8.A01     // Catch:{ all -> 0x0641 }
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x021e
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x021e:
            long r2 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0641 }
            X.9lD r11 = r4.A00()     // Catch:{ all -> 0x0641 }
            boolean r1 = r5.enableVideoMemoryCache     // Catch:{ all -> 0x0641 }
            r13 = 3
            r12 = 2
            r0 = 6
            if (r1 != 0) goto L_0x0296
            X.AUg r1 = r4.A05     // Catch:{ all -> 0x0641 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0641 }
            if (r1 != 0) goto L_0x0296
            java.lang.String r15 = "FbHttpCacheDataSource"
            java.lang.String r14 = "Cache data source open spec(Cached). Type:%s, Offset:%d, FilePos:%d, Length:%d, Vid:%s, Key:%s"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x0641 }
            X.904 r0 = r4.A0L     // Catch:{ all -> 0x0641 }
            r10[r20] = r0     // Catch:{ all -> 0x0641 }
            X.9SU r9 = r4.A07     // Catch:{ all -> 0x0641 }
            long r0 = r9.A00     // Catch:{ all -> 0x0641 }
            r8 = 1
            X.AnonymousClass000.A1M(r10, r8, r0)     // Catch:{ all -> 0x0641 }
            X.AnonymousClass000.A1M(r10, r12, r6)     // Catch:{ all -> 0x0641 }
            X.AnonymousClass000.A1M(r10, r13, r2)     // Catch:{ all -> 0x0641 }
            X.9jQ r0 = r4.A0M     // Catch:{ all -> 0x0641 }
            java.lang.String r1 = r0.A07     // Catch:{ all -> 0x0641 }
            r0 = 4
            r10[r0] = r1     // Catch:{ all -> 0x0641 }
            java.lang.String r1 = r9.A06     // Catch:{ all -> 0x0641 }
            r0 = 5
            r10[r0] = r1     // Catch:{ all -> 0x0641 }
            X.C131916Rh.A01(r15, r14, r10)     // Catch:{ all -> 0x0641 }
            X.83D r9 = r4.A0J     // Catch:{ IOException -> 0x028f }
            r9.Bks(r11)     // Catch:{ IOException -> 0x028f }
            X.AUD r0 = r5.cache     // Catch:{ all -> 0x0641 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x028a
            X.9Ug r10 = r4.A08     // Catch:{ all -> 0x0641 }
            X.9SU r0 = r4.A07     // Catch:{ all -> 0x0641 }
            long r6 = r0.A00     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = "VideoRequestEvent.onOpenCacheDataSource"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ all -> 0x0641 }
            int r0 = r10.A00     // Catch:{ all -> 0x05d3 }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ all -> 0x05d3 }
            long r0 = r10.A03     // Catch:{ all -> 0x05d3 }
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x027e
            r10.A03 = r6     // Catch:{ all -> 0x05d3 }
        L_0x027e:
            long r0 = r10.A02     // Catch:{ all -> 0x05d3 }
            long r6 = r6 + r2
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0287
            r10.A02 = r6     // Catch:{ all -> 0x05d3 }
        L_0x0287:
            com.facebook.systrace.Systrace.A00()     // Catch:{ all -> 0x0641 }
        L_0x028a:
            r4.A00 = r2     // Catch:{ all -> 0x0641 }
            r4.A03 = r9     // Catch:{ all -> 0x0641 }
            goto L_0x02f8
        L_0x028f:
            r1 = move-exception
            X.83D r0 = r4.A0J     // Catch:{ all -> 0x0641 }
            r0.close()     // Catch:{ all -> 0x0641 }
            throw r1     // Catch:{ all -> 0x0641 }
        L_0x0296:
            java.lang.String r15 = "FbHttpCacheDataSource"
            java.lang.String r14 = "Cache data source open spec(MemoryCached). Type:%s, Offset:%d, CachePos:%d, Length:%d, Vid:%s, Key:%s"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x0641 }
            X.904 r0 = r4.A0L     // Catch:{ all -> 0x0641 }
            r10[r20] = r0     // Catch:{ all -> 0x0641 }
            X.9SU r9 = r4.A07     // Catch:{ all -> 0x0641 }
            long r0 = r9.A00     // Catch:{ all -> 0x0641 }
            r8 = 1
            X.AnonymousClass000.A1M(r10, r8, r0)     // Catch:{ all -> 0x0641 }
            X.AnonymousClass000.A1M(r10, r12, r6)     // Catch:{ all -> 0x0641 }
            X.AnonymousClass000.A1M(r10, r13, r2)     // Catch:{ all -> 0x0641 }
            X.9jQ r0 = r4.A0M     // Catch:{ all -> 0x0641 }
            java.lang.String r1 = r0.A07     // Catch:{ all -> 0x0641 }
            r0 = 4
            r10[r0] = r1     // Catch:{ all -> 0x0641 }
            java.lang.String r1 = r9.A06     // Catch:{ all -> 0x0641 }
            r0 = 5
            r10[r0] = r1     // Catch:{ all -> 0x0641 }
            X.C131916Rh.A01(r15, r14, r10)     // Catch:{ all -> 0x0641 }
            X.A0L r10 = new X.A0L     // Catch:{ all -> 0x0641 }
            r10.<init>()     // Catch:{ all -> 0x0641 }
            X.B5Y r6 = r35.A03()     // Catch:{ all -> 0x0641 }
            X.AUg r1 = r4.A05     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = "exo-openmemorydatasource"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x0303 }
            r10.A02 = r6     // Catch:{ all -> 0x0303 }
            byte[] r1 = r6.Bmu(r1)     // Catch:{ all -> 0x0303 }
            if (r1 == 0) goto L_0x02fd
            r10.A03 = r1     // Catch:{ all -> 0x0303 }
            long r8 = r11.A03     // Catch:{ all -> 0x0303 }
            r10.A00 = r8     // Catch:{ all -> 0x0303 }
            long r6 = r11.A02     // Catch:{ all -> 0x0303 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x02e9
            int r0 = r1.length     // Catch:{ all -> 0x0303 }
            long r0 = (long) r0     // Catch:{ all -> 0x0303 }
            long r0 = r0 - r8
        L_0x02e6:
            r10.A01 = r0     // Catch:{ all -> 0x0303 }
            goto L_0x02f1
        L_0x02e9:
            int r0 = r1.length     // Catch:{ all -> 0x0303 }
            long r0 = (long) r0     // Catch:{ all -> 0x0303 }
            long r0 = r0 - r8
            long r0 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x0303 }
            goto L_0x02e6
        L_0x02f1:
            X.C196289Yq.A00()     // Catch:{ all -> 0x0641 }
            r4.A00 = r2     // Catch:{ all -> 0x0641 }
            r4.A03 = r10     // Catch:{ all -> 0x0641 }
        L_0x02f8:
            X.C196289Yq.A00()     // Catch:{ all -> 0x0656 }
            r8 = 0
            goto L_0x030a
        L_0x02fd:
            X.8xR r0 = new X.8xR     // Catch:{ all -> 0x0303 }
            r0.<init>()     // Catch:{ all -> 0x0303 }
            throw r0     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r0 = move-exception
            X.C196289Yq.A00()     // Catch:{ all -> 0x0641 }
            goto L_0x05d7
        L_0x0309:
            r8 = 1
        L_0x030a:
            X.AUD r0 = r5.cache     // Catch:{ all -> 0x0656 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x034c
            X.A0X r1 = X.A0X.A04     // Catch:{ all -> 0x0656 }
            if (r1 != 0) goto L_0x031b
            X.A0X r1 = new X.A0X     // Catch:{ all -> 0x0656 }
            r1.<init>()     // Catch:{ all -> 0x0656 }
            X.A0X.A04 = r1     // Catch:{ all -> 0x0656 }
        L_0x031b:
            X.AUg r7 = r4.A05     // Catch:{ all -> 0x0656 }
            X.9jQ r6 = r4.A0M     // Catch:{ all -> 0x0656 }
            X.9SU r0 = r4.A07     // Catch:{ all -> 0x0656 }
            android.net.Uri r0 = r0.A04     // Catch:{ all -> 0x0656 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0656 }
            java.lang.String r0 = "CacheInstrumentationListener.onOpenHoleSpan"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ all -> 0x0656 }
            if (r7 == 0) goto L_0x0349
            boolean r0 = r7.A08     // Catch:{ all -> 0x0646 }
            if (r0 != 0) goto L_0x0349
            X.9Gr r2 = r1.A00     // Catch:{ all -> 0x0646 }
            monitor-enter(r2)     // Catch:{ all -> 0x0646 }
            java.util.TreeSet r0 = r2.A01     // Catch:{ all -> 0x0346 }
            r0.add(r7)     // Catch:{ all -> 0x0346 }
            java.util.Map r1 = r2.A00     // Catch:{ all -> 0x0346 }
            X.9Gq r0 = new X.9Gq     // Catch:{ all -> 0x0346 }
            r0.<init>(r6, r3)     // Catch:{ all -> 0x0346 }
            r1.put(r7, r0)     // Catch:{ all -> 0x0346 }
            monitor-exit(r2)     // Catch:{ all -> 0x0646 }
            goto L_0x0349
        L_0x0346:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0646 }
            throw r0     // Catch:{ all -> 0x0646 }
        L_0x0349:
            com.facebook.systrace.Systrace.A00()     // Catch:{ all -> 0x0656 }
        L_0x034c:
            if (r8 == 0) goto L_0x064b
            boolean r0 = r4.A09     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x0364
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "shouldOpenHttp source, but read from cache only is true: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0656 }
            X.9jQ r0 = r4.A0M     // Catch:{ all -> 0x0656 }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x0656 }
            r1[r20] = r0     // Catch:{ all -> 0x0656 }
            X.C131916Rh.A01(r3, r2, r1)     // Catch:{ all -> 0x0656 }
            goto L_0x0652
        L_0x0364:
            if (r18 == 0) goto L_0x036f
            boolean r0 = r4.A0R     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x036f
            r4.A03()     // Catch:{ all -> 0x0656 }
            goto L_0x0652
        L_0x036f:
            X.AUg r0 = r4.A05     // Catch:{ all -> 0x0656 }
            if (r0 != 0) goto L_0x0383
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "Cache span locked. Skipping caching %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0656 }
            X.9jQ r0 = r4.A0M     // Catch:{ all -> 0x0656 }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x0656 }
            r1[r20] = r0     // Catch:{ all -> 0x0656 }
            X.C131916Rh.A01(r3, r2, r1)     // Catch:{ all -> 0x0656 }
        L_0x0383:
            java.lang.String r0 = "exo-openhttpdatastream"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x0641 }
            X.B5Y r0 = r35.A03()     // Catch:{ all -> 0x0641 }
            X.AUg r11 = r4.A01(r0)     // Catch:{ all -> 0x0641 }
            if (r11 != 0) goto L_0x039a
            X.B5Y r0 = r35.A03()     // Catch:{ all -> 0x0641 }
            X.AUg r11 = r4.A01(r0)     // Catch:{ all -> 0x0641 }
        L_0x039a:
            X.9SU r0 = r4.A07     // Catch:{ all -> 0x0641 }
            long r2 = r0.A01     // Catch:{ all -> 0x0641 }
            r21 = -1
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x03a7
            r2 = -1
            goto L_0x03b0
        L_0x03a7:
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x03b0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x03b0:
            X.B5Y r8 = r35.A03()     // Catch:{ all -> 0x0641 }
            boolean r0 = r5.useShortKey     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x03e1
            boolean r0 = r5.enableLongCacheKeyForContentLength     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x03e1
            X.9SU r1 = r4.A07     // Catch:{ all -> 0x0641 }
            java.lang.String r10 = r1.A06     // Catch:{ all -> 0x0641 }
            X.9jQ r0 = r4.A0M     // Catch:{ all -> 0x0641 }
            java.lang.String r9 = r0.A07     // Catch:{ all -> 0x0641 }
            android.net.Uri r7 = r1.A04     // Catch:{ all -> 0x0641 }
            boolean r6 = r4.A0P     // Catch:{ all -> 0x0641 }
            boolean r1 = r0.A01     // Catch:{ all -> 0x0641 }
            boolean r0 = r5.skipThumbnailCacheKey     // Catch:{ all -> 0x0641 }
            r27 = 0
            r29 = 0
            r23 = r7
            r24 = r10
            r25 = r9
            r26 = r6
            r28 = r1
            r30 = r0
            java.lang.String r10 = X.C131916Rh.A00(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0641 }
            goto L_0x03e5
        L_0x03e1:
            X.9SU r0 = r4.A07     // Catch:{ all -> 0x0641 }
            java.lang.String r10 = r0.A06     // Catch:{ all -> 0x0641 }
        L_0x03e5:
            r9 = 2
            if (r8 == 0) goto L_0x040b
            long r6 = r8.BIR(r10)     // Catch:{ all -> 0x0641 }
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x040b
            X.9SU r0 = r4.A07     // Catch:{ all -> 0x0641 }
            long r0 = r0.A02     // Catch:{ all -> 0x0641 }
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x040b
            java.lang.String r5 = "FbHttpCacheDataSource"
            java.lang.String r4 = "Skip Http request because content length is %s and position is %s"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x0641 }
            r2 = 0
            X.AnonymousClass000.A1M(r3, r2, r6)     // Catch:{ all -> 0x0641 }
            r2 = 1
            X.AnonymousClass000.A1M(r3, r2, r0)     // Catch:{ all -> 0x0641 }
            X.C165597tg.A1H(r4, r5, r3)     // Catch:{ all -> 0x0641 }
            goto L_0x0638
        L_0x040b:
            if (r11 == 0) goto L_0x0418
            long r0 = r11.A05     // Catch:{ all -> 0x0641 }
            X.9SU r6 = r4.A07     // Catch:{ all -> 0x0641 }
            long r6 = r6.A02     // Catch:{ all -> 0x0641 }
            long r0 = r0 - r6
            long r2 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0641 }
        L_0x0418:
            X.9lD r0 = X.C202189lD.A09     // Catch:{ all -> 0x0641 }
            X.9SU r9 = r4.A07     // Catch:{ all -> 0x0641 }
            android.net.Uri r14 = r9.A04     // Catch:{ all -> 0x0641 }
            r19 = 0
            long r6 = r9.A00     // Catch:{ all -> 0x0641 }
            long r0 = r9.A02     // Catch:{ all -> 0x0641 }
            java.lang.String r13 = r9.A06     // Catch:{ all -> 0x0641 }
            int r12 = r9.A03     // Catch:{ all -> 0x0641 }
            X.9em r11 = r9.A05     // Catch:{ all -> 0x0641 }
            X.9lD r9 = new X.9lD     // Catch:{ all -> 0x0641 }
            r23 = r9
            r24 = r14
            r25 = r11
            r26 = r13
            r27 = r19
            r28 = r12
            r29 = r6
            r31 = r0
            r33 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x0641 }
            X.9em r12 = r9.A05     // Catch:{ all -> 0x0641 }
            X.9iO r1 = r12.A0F     // Catch:{ all -> 0x0641 }
            X.9jQ r6 = r4.A0M     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x0641 }
            r1.A00 = r0     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = r6.A04     // Catch:{ all -> 0x0641 }
            r1.A01 = r0     // Catch:{ all -> 0x0641 }
            X.B5V r11 = r4.A04     // Catch:{ IOException -> 0x05e4 }
            long r31 = r11.Bks(r9)     // Catch:{ IOException -> 0x05e4 }
            java.util.Map r1 = r11.BGn()     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = r6.A07     // Catch:{ all -> 0x0641 }
            r18 = r0
            boolean r0 = r5.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x0641 }
            long r0 = X.C200329hA.A00(r1, r0)     // Catch:{ all -> 0x0641 }
            r4.A01 = r0     // Catch:{ all -> 0x0641 }
            boolean r6 = r5.enableVodContentLengthLogging     // Catch:{ all -> 0x0641 }
            if (r6 == 0) goto L_0x046e
            X.B5W r6 = r4.A06     // Catch:{ all -> 0x0641 }
            r6.Bqc(r0)     // Catch:{ all -> 0x0641 }
        L_0x046e:
            if (r8 == 0) goto L_0x0475
            long r0 = r4.A01     // Catch:{ all -> 0x0641 }
            r8.BsX(r10, r0)     // Catch:{ all -> 0x0641 }
        L_0x0475:
            X.9SU r8 = r4.A07     // Catch:{ all -> 0x0641 }
            long r6 = r8.A01     // Catch:{ all -> 0x0641 }
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x048a
            long r0 = r4.A01     // Catch:{ all -> 0x0641 }
            int r10 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1Q(r10)
            X.C200319h9.A02(r6)     // Catch:{ all -> 0x0641 }
            r8.A01 = r0     // Catch:{ all -> 0x0641 }
        L_0x048a:
            java.lang.String r15 = "FbHttpCacheDataSource"
            java.lang.String r13 = "Cache data source open spec(HTTP). Type:%s, Offset:%d, Length:%d, OpenLength:%d, Vid:%s, Key:%s, seq:%d"
            r0 = 7
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x0641 }
            X.904 r14 = r4.A0L     // Catch:{ all -> 0x0641 }
            r10[r20] = r14     // Catch:{ all -> 0x0641 }
            long r0 = r9.A01     // Catch:{ all -> 0x0641 }
            r6 = 1
            X.AnonymousClass000.A1M(r10, r6, r0)     // Catch:{ all -> 0x0641 }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0641 }
            r0 = 2
            r10[r0] = r7     // Catch:{ all -> 0x0641 }
            java.lang.Long r6 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x0641 }
            r0 = 3
            r10[r0] = r6     // Catch:{ all -> 0x0641 }
            r0 = 4
            r10[r0] = r18     // Catch:{ all -> 0x0641 }
            java.lang.String r1 = r8.A06     // Catch:{ all -> 0x0641 }
            r0 = 5
            r10[r0] = r1     // Catch:{ all -> 0x0641 }
            int r0 = r12.A07     // Catch:{ all -> 0x0641 }
            X.C36381kD.A1T(r10, r0)     // Catch:{ all -> 0x0641 }
            X.C131916Rh.A01(r15, r13, r10)     // Catch:{ all -> 0x0641 }
            r4.A03 = r11     // Catch:{ all -> 0x0641 }
            X.AUD r0 = r5.cache     // Catch:{ all -> 0x0641 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x04e7
            X.9Ug r8 = r4.A08     // Catch:{ all -> 0x0641 }
            X.9SU r0 = r4.A07     // Catch:{ all -> 0x0641 }
            long r2 = r0.A00     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = "VideoRequestEvent.onOpenHttpDataStream"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ all -> 0x0641 }
            int r0 = r8.A01     // Catch:{ all -> 0x05d3 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x05d3 }
            long r0 = r8.A03     // Catch:{ all -> 0x05d3 }
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x04da
            r8.A03 = r2     // Catch:{ all -> 0x05d3 }
        L_0x04da:
            long r0 = r8.A02     // Catch:{ all -> 0x05d3 }
            long r2 = r2 + r31
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x04e4
            r8.A02 = r2     // Catch:{ all -> 0x05d3 }
        L_0x04e4:
            com.facebook.systrace.Systrace.A00()     // Catch:{ all -> 0x0641 }
        L_0x04e7:
            X.AUg r8 = r4.A05     // Catch:{ all -> 0x0641 }
            if (r8 == 0) goto L_0x05df
            boolean r0 = r8.A08     // Catch:{ all -> 0x0641 }
            if (r0 != 0) goto L_0x05df
            int r0 = (r31 > r16 ? 1 : (r31 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x05d8
            boolean r2 = r4.A0R     // Catch:{ all -> 0x0641 }
            if (r2 != 0) goto L_0x0506
            r0 = r35
            int r0 = r0.A01     // Catch:{ all -> 0x0641 }
            long r0 = (long) r0     // Catch:{ all -> 0x0641 }
            int r3 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x05d8
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0508
        L_0x0506:
            long r0 = r4.A0H     // Catch:{ 8xS -> 0x05c9 }
        L_0x0508:
            boolean r9 = r4.A0O     // Catch:{ 8xS -> 0x05c9 }
            if (r9 == 0) goto L_0x0515
            boolean r3 = r4.A0Q     // Catch:{ 8xS -> 0x05c9 }
            if (r3 == 0) goto L_0x0512
            if (r2 == 0) goto L_0x0515
        L_0x0512:
            r30 = 1
            goto L_0x0517
        L_0x0515:
            r30 = 0
        L_0x0517:
            boolean r3 = r4.A0S     // Catch:{ 8xS -> 0x05c9 }
            boolean r8 = r5.enableVideoHybridCache     // Catch:{ 8xS -> 0x05c9 }
            if (r8 == 0) goto L_0x0520
            if (r2 == 0) goto L_0x0520
            goto L_0x0552
        L_0x0520:
            boolean r2 = r5.enableVideoMemoryCache     // Catch:{ 8xS -> 0x05c9 }
            if (r2 == 0) goto L_0x0530
            X.B5Y r5 = r35.A03()     // Catch:{ 8xS -> 0x05c9 }
            X.A0D r2 = new X.A0D     // Catch:{ 8xS -> 0x05c9 }
            r2.<init>(r5, r0, r3)     // Catch:{ 8xS -> 0x05c9 }
            r4.A02 = r2     // Catch:{ 8xS -> 0x05c9 }
            goto L_0x0583
        L_0x0530:
            X.B5Y r22 = r35.A03()     // Catch:{ 8xS -> 0x05c9 }
            boolean r11 = r4.A0T     // Catch:{ 8xS -> 0x05c9 }
            int r10 = r4.A0G     // Catch:{ 8xS -> 0x05c9 }
            X.AUg r8 = r4.A05     // Catch:{ 8xS -> 0x05c9 }
            long r2 = r4.A0I     // Catch:{ 8xS -> 0x05c9 }
            X.A0E r5 = new X.A0E     // Catch:{ 8xS -> 0x05c9 }
            r21 = r5
            r23 = r8
            r24 = r10
            r25 = r0
            r27 = r2
            r29 = r11
            r30 = r9
            r21.<init>(r22, r23, r24, r25, r27, r29, r30)     // Catch:{ 8xS -> 0x05c9 }
            r4.A02 = r5     // Catch:{ 8xS -> 0x05c9 }
            goto L_0x0583
        L_0x0552:
            boolean r2 = r5.enableHybridCacheForPrefetch     // Catch:{ 8xS -> 0x05c9 }
            if (r2 == 0) goto L_0x0520
            X.B5Y r2 = r35.A03()     // Catch:{ 8xS -> 0x05c9 }
            X.A0D r10 = new X.A0D     // Catch:{ 8xS -> 0x05c9 }
            r10.<init>(r2, r0, r3)     // Catch:{ 8xS -> 0x05c9 }
            X.B5Y r22 = r35.A03()     // Catch:{ 8xS -> 0x05c9 }
            boolean r11 = r4.A0T     // Catch:{ 8xS -> 0x05c9 }
            int r9 = r4.A0G     // Catch:{ 8xS -> 0x05c9 }
            X.AUg r8 = r4.A05     // Catch:{ 8xS -> 0x05c9 }
            long r2 = r4.A0I     // Catch:{ 8xS -> 0x05c9 }
            X.A0E r5 = new X.A0E     // Catch:{ 8xS -> 0x05c9 }
            r21 = r5
            r23 = r8
            r24 = r9
            r25 = r0
            r27 = r2
            r29 = r11
            r21.<init>(r22, r23, r24, r25, r27, r29, r30)     // Catch:{ 8xS -> 0x05c9 }
            X.A0C r0 = new X.A0C     // Catch:{ 8xS -> 0x05c9 }
            r0.<init>(r10, r5)     // Catch:{ 8xS -> 0x05c9 }
            r4.A02 = r0     // Catch:{ 8xS -> 0x05c9 }
        L_0x0583:
            X.9SU r5 = r4.A07     // Catch:{ 8xS -> 0x05c9 }
            android.net.Uri r11 = r5.A04     // Catch:{ 8xS -> 0x05c9 }
            long r2 = r5.A00     // Catch:{ 8xS -> 0x05c9 }
            long r0 = r5.A02     // Catch:{ 8xS -> 0x05c9 }
            java.lang.String r10 = r5.A06     // Catch:{ 8xS -> 0x05c9 }
            int r9 = r5.A03     // Catch:{ 8xS -> 0x05c9 }
            X.9em r8 = r5.A05     // Catch:{ 8xS -> 0x05c9 }
            X.9lD r5 = new X.9lD     // Catch:{ 8xS -> 0x05c9 }
            r21 = r5
            r22 = r11
            r23 = r8
            r24 = r10
            r25 = r19
            r26 = r9
            r27 = r2
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31)     // Catch:{ 8xS -> 0x05c9 }
            X.B2C r0 = r4.A02     // Catch:{ 8xS -> 0x05c9 }
            r0.Bkt(r5)     // Catch:{ 8xS -> 0x05c9 }
            java.lang.String r3 = "Cache data sink open spec. Type:%s, Offset:%d, Length:%d, OpenLength:%d Vid:%s, Key:%s"
            r0 = 6
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ 8xS -> 0x05c9 }
            r2[r20] = r14     // Catch:{ 8xS -> 0x05c9 }
            long r0 = r5.A01     // Catch:{ 8xS -> 0x05c9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 8xS -> 0x05c9 }
            X.C90464aC.A1D(r0, r7, r6, r2)     // Catch:{ 8xS -> 0x05c9 }
            r0 = 4
            r2[r0] = r18     // Catch:{ 8xS -> 0x05c9 }
            X.9SU r0 = r4.A07     // Catch:{ 8xS -> 0x05c9 }
            java.lang.String r1 = r0.A06     // Catch:{ 8xS -> 0x05c9 }
            r0 = 5
            r2[r0] = r1     // Catch:{ 8xS -> 0x05c9 }
            X.C131916Rh.A01(r15, r3, r2)     // Catch:{ 8xS -> 0x05c9 }
            goto L_0x05df
        L_0x05c9:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0641 }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x0641 }
            goto L_0x05d7
        L_0x05d3:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()     // Catch:{ all -> 0x0641 }
        L_0x05d7:
            throw r0     // Catch:{ all -> 0x0641 }
        L_0x05d8:
            r4.A04(r8)     // Catch:{ all -> 0x0641 }
            r0 = r19
            r4.A05 = r0     // Catch:{ all -> 0x0641 }
        L_0x05df:
            X.C196289Yq.A00()     // Catch:{ all -> 0x0656 }
            r0 = 1
            goto L_0x063c
        L_0x05e4:
            r6 = move-exception
            X.B5V r2 = r4.A04     // Catch:{ all -> 0x0641 }
            r2.close()     // Catch:{ all -> 0x0641 }
            boolean r0 = r6 instanceof X.AnonymousClass83K     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x0640
            r3 = r6
            X.83K r3 = (X.AnonymousClass83K) r3     // Catch:{ all -> 0x0641 }
            int r1 = r3.responseCode     // Catch:{ all -> 0x0641 }
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x0640
            java.util.Map r1 = r2.BGn()     // Catch:{ all -> 0x0641 }
            boolean r0 = r5.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x0641 }
            long r0 = X.C200329hA.A00(r1, r0)     // Catch:{ all -> 0x0641 }
            r4.A01 = r0     // Catch:{ all -> 0x0641 }
            if (r8 == 0) goto L_0x0608
            r8.BsX(r10, r0)     // Catch:{ all -> 0x0641 }
        L_0x0608:
            X.9SU r8 = r4.A07     // Catch:{ all -> 0x0641 }
            long r6 = r8.A01     // Catch:{ all -> 0x0641 }
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x0621
            long r1 = r4.A01     // Catch:{ all -> 0x0641 }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0621
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.C200319h9.A02(r0)     // Catch:{ all -> 0x0641 }
            r8.A01 = r1     // Catch:{ all -> 0x0641 }
        L_0x0621:
            java.lang.String r2 = "FbHttpCacheDataSource"
            java.lang.String r1 = "Returning length 0 after 416 response"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0641 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0641 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0641 }
            boolean r0 = r5.enable416Logging     // Catch:{ all -> 0x0641 }
            if (r0 == 0) goto L_0x0638
            X.B5W r0 = r4.A06     // Catch:{ all -> 0x0641 }
            r0.BjW(r3)     // Catch:{ all -> 0x0641 }
        L_0x0638:
            X.C196289Yq.A00()     // Catch:{ all -> 0x0656 }
            r0 = 0
        L_0x063c:
            X.C196289Yq.A00()
            return r0
        L_0x0640:
            throw r6     // Catch:{ all -> 0x0641 }
        L_0x0641:
            r0 = move-exception
            X.C196289Yq.A00()     // Catch:{ all -> 0x0656 }
            goto L_0x064a
        L_0x0646:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()     // Catch:{ all -> 0x0656 }
        L_0x064a:
            throw r0     // Catch:{ all -> 0x0656 }
        L_0x064b:
            r4.A03()     // Catch:{ all -> 0x0656 }
        L_0x064e:
            X.C196289Yq.A00()
            return r19
        L_0x0652:
            X.C196289Yq.A00()
            return r20
        L_0x0656:
            r0 = move-exception
            X.C196289Yq.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0Z.A05(boolean):boolean");
    }

    public void close() {
        C188228zF r19;
        long j;
        if (this.A0N.cache.enableCacheInstrumentation) {
            A0X a0x = A0X.A04;
            if (a0x == null) {
                a0x = new A0X();
                A0X.A04 = a0x;
            }
            C195429Ug r6 = this.A08;
            Tracer.A00("CacheInstrumentationListener.onRequestComplete");
            try {
                C130376Kv r10 = a0x.A01;
                if (r10 != null && !r6.A08) {
                    if (r6.A09) {
                        int i = r6.A01;
                        if (i == 0) {
                            r19 = C188228zF.CACHE_HIT;
                        } else {
                            int i2 = r6.A00;
                            if (i2 == 0) {
                                if (i > 0) {
                                    r19 = C188228zF.CACHE_PARTIAL_MISS;
                                }
                                r19 = C188228zF.CACHE_UNKNOWN;
                            } else {
                                if (i2 > 0 && i > 0) {
                                    r19 = C188228zF.CACHE_PARTIAL_HIT;
                                }
                                r19 = C188228zF.CACHE_UNKNOWN;
                            }
                        }
                    } else {
                        if (r6.A00 == 0 && r6.A01 > 0) {
                            r19 = C188228zF.CACHE_MISS;
                        }
                        r19 = C188228zF.CACHE_UNKNOWN;
                    }
                    if (!a0x.A03) {
                        String str = a0x.A02;
                        C201379jQ r12 = r6.A0A;
                        String str2 = r12.A03;
                        String name = r12.A00.name();
                        String str3 = r6.A07;
                        String str4 = r6.A0B;
                        long j2 = r6.A03;
                        long j3 = j2;
                        if (j2 >= Long.MAX_VALUE || r6.A02 <= -1) {
                            j2 = r6.A06.longValue();
                        }
                        if (j3 < Long.MAX_VALUE) {
                            j = r6.A02;
                            if (j > -1) {
                                Pair pair = r6.A04;
                                String str5 = str2;
                                String str6 = str3;
                                String str7 = str;
                                Pair pair2 = pair;
                                r10.A01.add(new AUS(pair2, r19, str7, str5, name, str6, str4, r12.A06, r12.A05, j2, j, r12.A0A));
                            }
                        }
                        j = r6.A05.longValue();
                        Pair pair3 = r6.A04;
                        String str52 = str2;
                        String str62 = str3;
                        String str72 = str;
                        Pair pair22 = pair3;
                        r10.A01.add(new AUS(pair22, r19, str72, str52, name, str62, str4, r12.A06, r12.A05, j2, j, r12.A0A));
                    }
                }
            } finally {
                Systrace.A00();
            }
        }
        A02();
        this.A07 = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:17|(1:25)|26|(2:28|(3:30|31|32))|43|44|(3:46|47|48)|49|(2:57|58)|59|60|(3:62|(1:64)|65)|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        if (r4 != -1) goto L_0x0098;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00d5 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d9 A[Catch:{ IOException -> 0x00e2, all -> 0x00f6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r7 = r18
            X.9lD r8 = r7.A00()     // Catch:{ IOException -> 0x00e2 }
            boolean r0 = r7.A0E     // Catch:{ IOException -> 0x00e2 }
            r6 = 0
            r9 = 1
            if (r0 != 0) goto L_0x001f
            X.B5W r5 = r7.A06     // Catch:{ IOException -> 0x00e2 }
            if (r5 == 0) goto L_0x001d
            long r3 = r7.A01     // Catch:{ IOException -> 0x00e2 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r5.BjZ(r8, r7, r9, r0)     // Catch:{ IOException -> 0x00e2 }
        L_0x001d:
            r7.A0E = r9     // Catch:{ IOException -> 0x00e2 }
        L_0x001f:
            X.B39 r0 = r7.A03     // Catch:{ IOException -> 0x00e2 }
            r5 = -1
            if (r0 != 0) goto L_0x0033
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "Trying to read when datasource isn't set. cache-only: %b"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00e2 }
            boolean r0 = r7.A09     // Catch:{ IOException -> 0x00e2 }
            X.AnonymousClass000.A1N(r1, r6, r0)     // Catch:{ IOException -> 0x00e2 }
            X.C131916Rh.A01(r3, r2, r1)     // Catch:{ IOException -> 0x00e2 }
            return r5
        L_0x0033:
            r14 = 0
            r10 = r19
            r9 = r20
            r12 = r21
            int r4 = r0.read(r10, r9, r12)     // Catch:{ IOException -> 0x00e2 }
            if (r4 <= 0) goto L_0x0084
            long r2 = r7.A0C     // Catch:{ IOException -> 0x00e2 }
            long r0 = (long) r4     // Catch:{ IOException -> 0x00e2 }
            long r2 = r2 + r0
            r7.A0C = r2     // Catch:{ IOException -> 0x00e2 }
            X.AUR r11 = r7.A0N     // Catch:{ IOException -> 0x00e2 }
            X.AUD r0 = r11.cache     // Catch:{ IOException -> 0x00e2 }
            long r0 = r0.skipDeadSpanLockThresholdMs     // Catch:{ IOException -> 0x00e2 }
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x006d
            X.B39 r1 = r7.A03     // Catch:{ IOException -> 0x00e2 }
            X.B5V r0 = r7.A04     // Catch:{ IOException -> 0x00e2 }
            if (r1 != r0) goto L_0x006d
            X.AUg r13 = r7.A05     // Catch:{ IOException -> 0x00e2 }
            if (r13 == 0) goto L_0x006d
            long r0 = r7.A0B     // Catch:{ IOException -> 0x00e2 }
            long r16 = r2 - r0
            r14 = 5120(0x1400, double:2.5296E-320)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            r7.A0B = r2     // Catch:{ IOException -> 0x00e2 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00e2 }
            r13.A09 = r0     // Catch:{ IOException -> 0x00e2 }
        L_0x006d:
            int r11 = r11.numOfBytesBeforeLoaderThreadSleep     // Catch:{ IOException -> 0x00e2 }
            if (r11 <= 0) goto L_0x0098
            long r2 = r7.A0C     // Catch:{ IOException -> 0x00e2 }
            long r0 = r7.A0A     // Catch:{ IOException -> 0x00e2 }
            long r13 = r2 - r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x00e2 }
            int r11 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0098
            r7.A0A = r2     // Catch:{ IOException -> 0x00e2 }
            r0 = 1
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0084 }
            goto L_0x0098
        L_0x0084:
            if (r4 != r5) goto L_0x0095
            boolean r0 = r7.A05(r6)     // Catch:{ IOException -> 0x00e2 }
            if (r0 == 0) goto L_0x00e1
            X.B39 r0 = r7.A03     // Catch:{ IOException -> 0x00e2 }
            int r4 = r0.read(r10, r9, r12)     // Catch:{ IOException -> 0x00e2 }
            if (r4 != r5) goto L_0x0095
            return r4
        L_0x0095:
            r0 = 0
            if (r4 == r5) goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            X.C200319h9.A02(r0)     // Catch:{ IOException -> 0x00e2 }
            X.9SU r5 = r7.A07     // Catch:{ IOException -> 0x00e2 }
            long r2 = r5.A01     // Catch:{ IOException -> 0x00e2 }
            r11 = -1
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00b5
            long r0 = (long) r4
            long r2 = r2 - r0
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r0 = X.C36401kF.A1U(r0)
            X.C200319h9.A02(r0)     // Catch:{ IOException -> 0x00e2 }
            r5.A01 = r2     // Catch:{ IOException -> 0x00e2 }
        L_0x00b5:
            long r0 = r5.A00     // Catch:{ IOException -> 0x00e2 }
            long r2 = (long) r4     // Catch:{ IOException -> 0x00e2 }
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ IOException -> 0x00e2 }
            long r0 = r5.A02     // Catch:{ IOException -> 0x00e2 }
            long r0 = r0 + r2
            r5.A02 = r0     // Catch:{ IOException -> 0x00e2 }
            X.B39 r0 = r7.A03     // Catch:{ IOException -> 0x00e2 }
            X.B5V r2 = r7.A04     // Catch:{ IOException -> 0x00e2 }
            if (r0 != r2) goto L_0x00d5
            X.B2C r1 = r7.A02     // Catch:{ IOException -> 0x00e2 }
            if (r1 == 0) goto L_0x00d5
            X.AUg r0 = r7.A05     // Catch:{ IOException -> 0x00e2 }
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.A08     // Catch:{ IOException -> 0x00e2 }
            if (r0 != 0) goto L_0x00d5
            r1.write(r10, r9, r4)     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            X.B5W r1 = r7.A06     // Catch:{ IOException -> 0x00e2 }
            if (r1 == 0) goto L_0x00e1
            X.B39 r0 = r7.A03     // Catch:{ IOException -> 0x00e2 }
            if (r0 != r2) goto L_0x00de
            r6 = 1
        L_0x00de:
            r1.BSX(r8, r7, r4, r6)     // Catch:{ IOException -> 0x00e2 }
        L_0x00e1:
            return r4
        L_0x00e2:
            r2 = move-exception
            X.AUR r0 = r7.A0N
            X.AUD r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x00fe
            X.9Ug r1 = r7.A08
            java.lang.String r0 = "VideoRequestEvent.onException"
            com.facebook.debug.tracer.Tracer.A00(r0)
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x00f6 }
            goto L_0x00fb
        L_0x00f6:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()
            throw r0
        L_0x00fb:
            com.facebook.systrace.Systrace.A00()
        L_0x00fe:
            X.B5W r0 = r7.A06
            if (r0 == 0) goto L_0x0105
            r0.BjW(r2)
        L_0x0105:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0Z.read(byte[], int, int):int");
    }

    public A0Z(B5V b5v, B5W b5w, C201619jy r6, AnonymousClass904 r7, C201379jQ r8, AUR aur, AtomicBoolean atomicBoolean, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0K = r6;
        this.A0M = r8;
        this.A04 = b5v;
        this.A0J = new AnonymousClass83D();
        this.A02 = null;
        this.A0R = z;
        this.A06 = b5w;
        this.A01 = 0;
        this.A00 = 0;
        this.A0F = i;
        this.A0H = j;
        this.A0S = z2;
        this.A0P = z3;
        this.A0D = false;
        this.A09 = z4;
        this.A0N = aur;
        this.A0U = atomicBoolean;
        this.A0L = r7;
        this.A0T = aur.useBufferedCacheDataSink;
        this.A0G = aur.bufferedCacheDataSinkSize;
        this.A0O = z5;
        this.A0Q = z6;
        this.A0I = j2;
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        if (b2e instanceof B5W) {
            this.A06 = (B5W) b2e;
        } else {
            this.A06 = new A1B(b2e);
        }
    }
}
