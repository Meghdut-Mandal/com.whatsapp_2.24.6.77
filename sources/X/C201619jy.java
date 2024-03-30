package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.9jy  reason: invalid class name and case insensitive filesystem */
public class C201619jy {
    public B5X A00;
    public int A01;
    public C191449Cz A02;
    public AnonymousClass896 A03;
    public AnonymousClass9MM A04;
    public C20988A2c A05;
    public C20989A2d A06;
    public A0V A07;
    public boolean A08 = false;
    public final Handler A09;
    public final AnonymousClass60H A0A;
    public final C202509m3 A0B;
    public final AUR A0C;
    public final Map A0D;
    public final Map A0E;
    public final Context A0F;

    public synchronized B5Y A03() {
        B5Y b5y;
        AUR aur = this.A0C;
        if (aur.enableVideoHybridCache) {
            if (this.A05 == null) {
                A00();
            }
            b5y = this.A05;
        } else if (aur.enableVideoMemoryCache) {
            if (this.A06 == null) {
                A00();
            }
            b5y = this.A06;
        } else {
            if (this.A03 == null) {
                A00();
            }
            b5y = this.A03;
        }
        return b5y;
    }

    public boolean A06(Uri uri, String str, long j, boolean z, boolean z2) {
        B5Y A032 = A03();
        AUR aur = this.A0C;
        String str2 = str;
        if (aur.enableCacheLookUp && aur.usePerVideoLookupToCheckCache) {
            A07(str2);
        }
        if (A032 == null) {
            return false;
        }
        String A002 = C131916Rh.A00(uri, (String) null, str2, z, aur.useShortKey, z2, aur.splitLastSegmentCachekey, aur.skipThumbnailCacheKey);
        long j2 = j;
        if (aur.useIsCachedSkipInit) {
            return A032.BLI(A002, 0, j2);
        }
        return A032.BLH(A002, 0, j2);
    }

    private void A00() {
        Tracer.A00("CacheManager.initCache");
        try {
            if (this.A04 == null) {
                A01();
            }
            AUR aur = this.A0C;
            if (aur.enableVideoMemoryCache) {
                this.A06 = new C20989A2d(aur.videoMemoryCacheSizeKb);
            } else {
                A04();
                File A0S = C90524aI.A0S(C36321k7.A0D(this.A04.A01, "/ExoPlayerCacheDir/videocache"));
                B5X b5x = this.A00;
                Handler handler = this.A09;
                AUD aud = aur.cache;
                boolean z = aud.skipCacheBeforeInited;
                boolean z2 = aud.skipEscapeCacheKey;
                boolean z3 = aud.skipRegex;
                boolean z4 = aud.cacheFileSizeCall;
                boolean z5 = aud.fixReadWriteBlock;
                boolean z6 = aud.enableShardCachedFiles;
                int i = aud.numSubDirectory;
                long j = aud.skipDeadSpanLockThresholdMs;
                boolean z7 = aud.useSimpleCacheLoadV2;
                Handler handler2 = handler;
                B5X b5x2 = b5x;
                this.A03 = new AnonymousClass896(handler2, b5x2, A0S, i, j, aud.minCacheFileSizeInBytes, z, aud.bypassUpgrade, z2, z3, z4, z5, z6, z7);
                AUD aud2 = aur.cache;
                if (aud2.enableCacheInstrumentation || aud2.enableOnlyCacheEvictionInstrumentation || aud2.enableUtilisationInstrumentation) {
                    Tracer.A00("CacheManager.initializeCacheInstrumentation");
                    A0X a0x = A0X.A04;
                    if (a0x == null) {
                        a0x = new A0X();
                        A0X.A04 = a0x;
                    }
                    AnonymousClass896 r3 = this.A03;
                    AnonymousClass60H r2 = this.A0A;
                    AUD aud3 = aur.cache;
                    int i2 = aud3.cacheInstrumentationEventBatchPeriodS;
                    boolean z8 = aud3.enableOnlyCacheEvictionInstrumentation;
                    if (r2 != null) {
                        a0x.A03 = z8;
                        a0x.A01 = new C130376Kv(handler, r2, i2);
                        a0x.A02 = "HeroSimpleCache";
                        a0x.A00 = new C192359Gr();
                        r3.A08(a0x);
                    }
                    Systrace.A00();
                }
                if (aur.enableCacheLookUp) {
                    A0V a0v = new A0V();
                    this.A07 = a0v;
                    this.A03.A08(a0v);
                }
                Map map = this.A0E;
                boolean z9 = false;
                if (map.containsKey("dummy_default_setting") && C165587tf.A06("dummy_default_setting", map) != 0) {
                    z9 = true;
                }
                if (!z9) {
                    this.A0A.A00(new AnonymousClass89B("", "CACHE", "USE_DEFAULT_CACHE_SETTING", "using default exp settings"));
                }
                if (!aur.dummyDefaultSetting) {
                    this.A0A.A00(new AnonymousClass89B("", "CACHE", "USE_DEFAULT_CACHE_SETTING", "using default exp settings"));
                }
                if (aur.cache.timeToLiveMs > 0) {
                    handler.postDelayed(new C1497572q(this, 14), 3000);
                }
                if (aur.enableVideoHybridCache) {
                    C20989A2d a2d = new C20989A2d(aur.videoMemoryCacheSizeKb);
                    this.A06 = a2d;
                    this.A05 = new C20988A2c(a2d, this.A03);
                }
            }
            try {
                C131916Rh.A01("CacheManager_default", "CacheInitialized", C90524aI.A0w());
            } finally {
                Systrace.A00();
            }
        } catch (Throwable th) {
            C131916Rh.A01("CacheManager_default", "CacheInitialized", C90524aI.A0w());
            throw th;
        }
    }

    private void A01() {
        B5X aXh;
        AUR aur = this.A0C;
        AUD aud = aur.cache;
        String str = aud.cacheDirectory;
        if (str == null) {
            str = this.A0F.getFilesDir().toString();
        }
        AnonymousClass9MM r3 = new AnonymousClass9MM(str, aud.cacheSizeInBytes, aud.useFbLruCacheEvictor, aud.usePerVideoLruProtectPrefetchCacheEvictor, aud.usePerVideoLruCache);
        this.A04 = r3;
        int i = r3.A00;
        this.A01 = i;
        if (r3.A04) {
            AUD aud2 = aur.cache;
            int i2 = aud2.perVideoLRUMinOffset;
            double d = aud2.perVideoLRUMaxPercent;
            int i3 = aud2.protectPrefetchCacheMinOffset;
            aXh = new C21712AXj(d, aud2.protectPrefetchCacheMaxPercent, i2, i3, (long) i, aud2.perVideoLruProtectPrefetchCacheConcurrentFix);
        } else if (r3.A03) {
            AUD aud3 = aur.cache;
            int i4 = aud3.perVideoLRUMinOffset;
            aXh = new C21711AXi(aud3.perVideoLRUMaxPercent, i4, (long) i);
        } else {
            aXh = new C21710AXh((long) i);
        }
        this.A00 = aXh;
        if (this.A04.A02) {
            this.A00 = new A0W(aXh, this, this.A0A);
        }
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [X.A0O] */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.A0Z, X.B39] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        if (X.C165587tf.A06("progressive.enable_throttling_data_source", r9) != 0) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ed, code lost:
        if (r15 != false) goto L_0x0141;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5U A02(com.facebook.exoplayer.monitor.VpsEventCallback r38, X.B5W r39, X.AnonymousClass904 r40, X.C201379jQ r41, X.C1896394p r42, java.util.Map r43, java.util.concurrent.atomic.AtomicBoolean r44, int r45, int r46, int r47, boolean r48, boolean r49, boolean r50) {
        /*
            r37 = this;
            r2 = r37
            X.AUR r1 = r2.A0C
            boolean r3 = r1.enableTransferListenerCallbackPerfFix
            X.A1C r0 = new X.A1C
            r0.<init>(r3)
            r3 = r41
            r14 = r46
            r13 = r47
            r24 = r48
            r27 = r50
            if (r50 == 0) goto L_0x00f1
            java.lang.String r4 = r1.userAgent
            r7 = 0
            X.83J r6 = new X.83J
            r8 = r7
            r9 = r4
            r10 = r14
            r11 = r13
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0023:
            r2.A04()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r5 = r39
            if (r39 == 0) goto L_0x0031
            r4.add(r5)
        L_0x0031:
            java.util.ArrayList r4 = X.C36441kJ.A15(r4)
            r0.A00 = r4
            r10 = r40
            int r8 = r10.value
            boolean r7 = r1.cancelOngoingRequest
            r18 = r44
            r18.get()
            java.lang.String r5 = r3.A07
            boolean r4 = r1.enableExcessiveNumUriRedirectLogging
            if (r4 != 0) goto L_0x00e8
            r4 = 0
        L_0x0049:
            com.facebook.exoplayer.datasource.FbHttpProxyDataSource r12 = new com.facebook.exoplayer.datasource.FbHttpProxyDataSource
            r34 = r45
            r28 = r12
            r29 = r6
            r30 = r0
            r31 = r4
            r32 = r3
            r33 = r1
            r35 = r8
            r36 = r7
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)
            X.AUD r4 = r1.cache
            boolean r4 = r4.skipCacheBeforeInited
            if (r4 == 0) goto L_0x0071
            if (r48 != 0) goto L_0x0071
            X.896 r4 = r2.A03
            if (r4 == 0) goto L_0x0071
            boolean r4 = r4.A02
            if (r4 != 0) goto L_0x0071
        L_0x0070:
            return r12
        L_0x0071:
            if (r5 == 0) goto L_0x0083
            java.lang.String r4 = ""
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "0"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0092
        L_0x0083:
            java.lang.String r6 = "CacheManager_default"
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r5)
            java.lang.String r4 = "Invalid videoId is %s"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            android.util.Log.e(r6, r4)
        L_0x0092:
            java.util.Map r6 = r2.A0E
            java.lang.String r5 = "prefetch.block_on_same_cache_key_timeout_ms"
            boolean r4 = r6.containsKey(r5)
            if (r4 == 0) goto L_0x00e5
            int r19 = X.C165587tf.A06(r5, r6)
        L_0x00a0:
            java.lang.String r5 = "prefetch.prefetch_max_cache_file_size"
            boolean r4 = r6.containsKey(r5)
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = X.C36431kI.A1A(r5, r6)
            long r20 = java.lang.Long.parseLong(r4)
        L_0x00b0:
            boolean r9 = r1.reduceMemoryDataSinkMemorySpike
            X.AUF r4 = r1.abrSetting
            boolean r8 = r4.hashUrlForUnique
            boolean r7 = r1.enableDynamicPrefetchCacheFileSize
            long r4 = r1.minCacheFileSizeForDynamicChunkingInBytes
            boolean r6 = r1.enableDynamicPrefetchCacheFileSizePrefetchOnly
            X.A0Z r11 = new X.A0Z
            r22 = r4
            r25 = r9
            r26 = r8
            r28 = r7
            r29 = r6
            r15 = r10
            r16 = r3
            r17 = r1
            r13 = r0
            r14 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26, r27, r28, r29)
            r12 = r11
            r1 = r43
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0070
            X.A0Y r0 = new X.A0Y
            r0.<init>(r11, r1)
            return r0
        L_0x00e1:
            r20 = 102400(0x19000, double:5.05923E-319)
            goto L_0x00b0
        L_0x00e5:
            r19 = 8000(0x1f40, float:1.121E-41)
            goto L_0x00a0
        L_0x00e8:
            X.9Gs r4 = new X.9Gs
            r9 = r38
            r4.<init>(r9, r2)
            goto L_0x0049
        L_0x00f1:
            java.util.Map r9 = r2.A0E
            java.lang.String r5 = "dash.use_liger_for_vod"
            boolean r4 = r9.containsKey(r5)
            r6 = 0
            if (r4 == 0) goto L_0x0103
            int r4 = X.C165587tf.A06(r5, r9)
            if (r4 == 0) goto L_0x0103
            r6 = 1
        L_0x0103:
            java.lang.String r17 = "Apache"
            r7 = 0
            r5 = 1
            if (r6 != 0) goto L_0x019d
            boolean r4 = r1.enableLocalSocketProxy
            if (r4 != 0) goto L_0x019d
            boolean r4 = r1.enableIgHttpDataSource
            if (r4 != 0) goto L_0x019d
            boolean r4 = r1.enableFBLiteHttpDataSource
            if (r4 != 0) goto L_0x019d
            java.lang.String r6 = "CacheManager_default"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r4 = "using default data source for apache"
            X.C131916Rh.A01(r6, r4, r5)
            java.lang.String r4 = r1.userAgent
            r19 = 0
            r16 = 0
            X.83J r6 = new X.83J
            r18 = r6
            r20 = r19
            r21 = r4
            r22 = r14
            r23 = r13
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.String r5 = "progressive.enable_throttling_data_source"
            boolean r4 = r9.containsKey(r5)
            if (r4 == 0) goto L_0x017b
            int r4 = X.C165587tf.A06(r5, r9)
            if (r4 == 0) goto L_0x017b
        L_0x0141:
            if (r48 != 0) goto L_0x017b
            if (r49 == 0) goto L_0x017b
            java.lang.String r7 = "progressive.throttling_buffer_low"
            boolean r4 = r9.containsKey(r7)
            if (r4 == 0) goto L_0x0153
            int r4 = X.C165587tf.A06(r7, r9)
            if (r4 <= 0) goto L_0x017b
        L_0x0153:
            java.lang.String r5 = "progressive.throttling_buffer_high"
            boolean r4 = r9.containsKey(r5)
            if (r4 == 0) goto L_0x0161
            int r4 = X.C165587tf.A06(r5, r9)
            if (r4 <= 0) goto L_0x017b
        L_0x0161:
            boolean r4 = r9.containsKey(r7)
            if (r4 == 0) goto L_0x0199
            int r7 = X.C165587tf.A06(r7, r9)
        L_0x016b:
            boolean r4 = r9.containsKey(r5)
            if (r4 == 0) goto L_0x0196
            int r5 = X.C165587tf.A06(r5, r9)
        L_0x0175:
            X.A0O r4 = new X.A0O
            r4.<init>(r6, r7, r5)
            r6 = r4
        L_0x017b:
            java.lang.String r8 = "CacheManager_default"
            r4 = 4
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r16] = r17
            java.lang.String r5 = r3.A07
            r4 = 1
            r7[r4] = r5
            r4 = 2
            X.AnonymousClass000.A1L(r7, r14, r4)
            r4 = 3
            X.AnonymousClass000.A1L(r7, r13, r4)
            java.lang.String r4 = "Created %s Data Source for video %s (timeout_ms connect=%d read=%d)"
            X.C131916Rh.A01(r8, r4, r7)
            goto L_0x0023
        L_0x0196:
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0175
        L_0x0199:
            r7 = 32768(0x8000, float:4.5918E-41)
            goto L_0x016b
        L_0x019d:
            java.lang.String r4 = r1.userAgent
            r19 = 0
            r16 = 0
            X.83J r6 = new X.83J
            r18 = r6
            r20 = r19
            r21 = r4
            r22 = r14
            r23 = r13
            r18.<init>(r19, r20, r21, r22, r23)
            boolean r4 = r1.enableFBLiteHttpDataSource
            if (r4 == 0) goto L_0x01c4
            java.lang.String r7 = "progressive.enable_throttling_data_source"
            boolean r4 = r9.containsKey(r7)
            if (r4 == 0) goto L_0x01f4
            int r4 = X.C165587tf.A06(r7, r9)
            if (r4 == 0) goto L_0x01f4
        L_0x01c4:
            r15 = 1
        L_0x01c5:
            boolean r4 = r1.logOnApacheFallback
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r2.A08
            if (r4 != 0) goto L_0x01ed
            r2.A08 = r5
            if (r42 == 0) goto L_0x01f1
            java.lang.String r12 = "dummy"
        L_0x01d3:
            X.60H r11 = r2.A0A
            java.lang.String r10 = r3.A07
            java.lang.String r8 = "CACHE"
            java.lang.String r7 = "FALL_BACK_TO_APACHE"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "apache fallback: "
            java.lang.String r5 = X.AnonymousClass000.A0p(r4, r12, r5)
            X.89B r4 = new X.89B
            r4.<init>(r10, r8, r7, r5)
            r11.A00(r4)
        L_0x01ed:
            if (r15 == 0) goto L_0x017b
            goto L_0x0141
        L_0x01f1:
            java.lang.String r12 = "null helper"
            goto L_0x01d3
        L_0x01f4:
            r15 = 0
            goto L_0x01c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201619jy.A02(com.facebook.exoplayer.monitor.VpsEventCallback, X.B5W, X.904, X.9jQ, X.94p, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, int, int, int, boolean, boolean, boolean):X.B5U");
    }

    public void A04() {
        if (this.A04 == null) {
            A01();
        }
        File A0S = C90524aI.A0S(C36321k7.A0D(this.A04.A01, "/ExoPlayerCacheDir/videocache"));
        if (!A0S.exists()) {
            A0S.mkdirs();
        }
    }

    public boolean A07(String str) {
        A0V a0v = this.A07;
        if (a0v == null) {
            return false;
        }
        Map map = a0v.A00;
        if (!map.containsKey(str)) {
            return false;
        }
        try {
            if (map.get(str) == null || ((Set) map.get(str)).size() <= 0) {
                return false;
            }
            return true;
        } catch (NullPointerException unused) {
            Log.e("PerVideoCacheLookup", String.format("Invalid video cache for video id = %s", new Object[]{str}));
            map.remove(str);
            return false;
        }
    }

    public C201619jy(Context context, Handler handler, AnonymousClass60H r4, C202509m3 r5, AUR aur, Map map) {
        try {
            this.A0E = map;
            this.A0C = aur;
            this.A0B = r5;
            this.A0A = r4;
            this.A0D = new WeakHashMap();
            this.A0F = context;
            this.A09 = handler;
            if (!aur.cache.delayInitCache) {
                A00();
            }
        } finally {
            C196289Yq.A00();
        }
    }

    public void A05() {
        B5Y A032 = A03();
        if (A032 != null) {
            if (this.A02 == null) {
                this.A02 = new C191449Cz(B40.A00);
            }
            AUR aur = this.A0C;
            long j = aur.cache.timeToLiveMs;
            Iterator it = A032.BDP().iterator();
            while (it.hasNext()) {
                NavigableSet<C21664AUg> B9B = A032.B9B(AnonymousClass001.A0C(it));
                if (B9B != null) {
                    for (C21664AUg aUg : B9B) {
                        if (System.currentTimeMillis() - aUg.A03 >= j) {
                            A032.Bnz(aUg, "ttl_eviction");
                        }
                    }
                }
            }
            this.A09.postDelayed(new C1497572q(this, 13), aur.cache.timeToLiveEvictionIntervalForegroundMs);
        }
    }
}
