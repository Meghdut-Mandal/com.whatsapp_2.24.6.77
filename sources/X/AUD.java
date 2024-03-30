package X;

import java.io.Serializable;

public class AUD implements Serializable {
    public static final long serialVersionUID = 97435743598597292L;
    public final boolean allowOldCacheCleanup = false;
    public final boolean bypassUpgrade;
    public final String cacheDirectory = null;
    public final boolean cacheFileSizeCall;
    public final int cacheInstrumentationEventBatchPeriodS;
    public final int cacheInstrumentationHighRamItemLimit;
    public final int cacheInstrumentationLowRamItemLimit;
    public final int cacheInstrumentationSamplingRate;
    public final boolean cacheManagerWaitForCacheInitialization;
    public final int cacheSizeInBytes = 104857600;
    public final boolean delayInitCache;
    public final boolean enableCacheBlockWithoutTimeout;
    public final boolean enableCacheInstrumentation;
    public final boolean enableInitSegmentFix;
    public final boolean enableOnlyCacheEvictionInstrumentation;
    public final boolean enableShardCachedFiles;
    public final boolean enableUtilisationInstrumentation;
    public final boolean fixReadWriteBlock;
    public final long minCacheFileSizeInBytes;
    public final int numSubDirectory;
    public final String oldCacheDirectory = null;
    public final double perVideoLRUMaxPercent;
    public final int perVideoLRUMinOffset;
    public final boolean perVideoLruProtectPrefetchCacheConcurrentFix;
    public final double protectPrefetchCacheMaxPercent = 0.3d;
    public final int protectPrefetchCacheMinOffset = 1048576;
    public final boolean skipCacheBeforeInited;
    public final long skipDeadSpanLockThresholdMs;
    public final boolean skipEscapeCacheKey;
    public final boolean skipRegex;
    public final long timeToLiveEvictionIntervalBackgroundMs;
    public final long timeToLiveEvictionIntervalForegroundMs;
    public final long timeToLiveMs;
    public final boolean useFbLruCacheEvictor = true;
    public final boolean usePerVideoLruCache = false;
    public final boolean usePerVideoLruProtectPrefetchCacheEvictor = false;
    public final boolean useSimpleCacheLoadV2;

    public AUD(boolean z) {
        this.delayInitCache = z;
        this.perVideoLRUMinOffset = 0;
        this.perVideoLRUMaxPercent = 0.1d;
        this.bypassUpgrade = false;
        this.skipEscapeCacheKey = false;
        this.skipRegex = false;
        this.cacheFileSizeCall = false;
        this.timeToLiveMs = 0;
        this.timeToLiveEvictionIntervalForegroundMs = 60000;
        this.timeToLiveEvictionIntervalBackgroundMs = 3600000;
        this.fixReadWriteBlock = false;
        this.enableCacheInstrumentation = false;
        this.cacheInstrumentationEventBatchPeriodS = 0;
        this.cacheInstrumentationLowRamItemLimit = -1;
        this.cacheInstrumentationHighRamItemLimit = -1;
        this.enableShardCachedFiles = false;
        this.numSubDirectory = 10;
        this.skipCacheBeforeInited = false;
        this.enableOnlyCacheEvictionInstrumentation = false;
        this.enableUtilisationInstrumentation = false;
        this.cacheInstrumentationSamplingRate = 1;
        this.skipDeadSpanLockThresholdMs = 0;
        this.useSimpleCacheLoadV2 = false;
        this.minCacheFileSizeInBytes = 0;
        this.cacheManagerWaitForCacheInitialization = false;
        this.perVideoLruProtectPrefetchCacheConcurrentFix = false;
        this.enableInitSegmentFix = false;
        this.enableCacheBlockWithoutTimeout = true;
    }
}
