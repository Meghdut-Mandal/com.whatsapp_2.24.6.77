package com.facebook.exoplayer.formatevaluator.configuration;

import X.AUF;
import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.AnonymousClass9XE;
import X.C188058yy;
import X.C1891392j;
import X.C36321k7;
import X.C36431kI;
import android.net.ConnectivityManager;
import java.util.Locale;

public final class AbrContextAwareConfiguration {
    public final AUF abrSetting;
    public final C1891392j connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGClips;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final AnonymousClass9XE playbackPreferences;

    public final int getHighBwRiskConfPct(C188058yy r3) {
        int i;
        int i2;
        int i3;
        AnonymousClass00C.A0D(r3, 0);
        if (this.isLive) {
            C188058yy r1 = C188058yy.ULTRA_LOW_LATENCY;
            AUF auf = this.abrSetting;
            if (r3 == r1) {
                return auf.liveHighBwRiskConfPctUltraLowLatency;
            }
            return auf.liveHighBwRiskConfPct;
        } else if (this.isBackgroundPrefetch && (i3 = this.abrSetting.backgroundPrefetchHighBwRiskConfPct) > 0) {
            return i3;
        } else {
            if (this.isSponsored) {
                AUF auf2 = this.abrSetting;
                int i4 = auf2.adHighBwRiskConfPct;
                if (i4 > 0) {
                    return i4;
                }
                if (this.isPrefetch) {
                    i2 = auf2.adHighBwRiskConfPctPrefetch;
                } else {
                    i2 = auf2.adHighBwRiskConfPctOnScreen;
                }
                if (i2 > 0) {
                    return i2;
                }
            }
            if (!this.isPrefetch || !this.enableForegroundPrefetchQualityExperimentation || (i = this.abrSetting.foregroundPrefetchHighBwRiskConfPct) <= 0) {
                return this.abrSetting.highBwRiskConfPct;
            }
            return i;
        }
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, C188058yy r4) {
        int i2;
        AnonymousClass00C.A0D(r4, 1);
        if (r4 != C188058yy.ULTRA_LOW_LATENCY || (i2 = this.abrSetting.ultraLowLatencyAdjustedLowestQualityIndex) < 0) {
            return i - 1;
        }
        return Math.min(i2, i - 1);
    }

    public final double getRiskAdjFactor(boolean z, C188058yy r4) {
        AnonymousClass00C.A0D(r4, 1);
        boolean z2 = this.isLive;
        if (z) {
            AUF auf = this.abrSetting;
            if (z2) {
                return auf.liveAudioRiskAdjFactor;
            }
            return auf.audioRiskAdjFactor;
        } else if (!z2) {
            return this.abrSetting.riskAdjFactor;
        } else {
            if (r4 == C188058yy.LOW_LATENCY) {
                return this.abrSetting.liveUserLowLatencyRiskAdjFactor;
            }
            C188058yy r1 = C188058yy.ULTRA_LOW_LATENCY;
            AUF auf2 = this.abrSetting;
            if (r4 == r1) {
                return auf2.liveUserUltraLowLatencyRiskAdjFactor;
            }
            return auf2.liveRiskAdjFactor;
        }
    }

    public final boolean getSystemicRiskEnable(boolean z) {
        boolean z2;
        boolean z3 = this.isLive;
        if (z) {
            AUF auf = this.abrSetting;
            if (z3) {
                return auf.liveSystemicRiskAudioEnable;
            }
            return auf.systemicRiskAudioEnable;
        }
        if (z3) {
            AUF auf2 = this.abrSetting;
            if (!auf2.systemicRiskEnable) {
                return false;
            }
            z2 = auf2.liveSystemicRiskEnable;
        } else {
            boolean z4 = this.isStory;
            AUF auf3 = this.abrSetting;
            if (!z4) {
                return auf3.systemicRiskEnable;
            }
            if (!auf3.systemicRiskEnable) {
                return false;
            }
            z2 = auf3.systemicRiskEnableForStories;
        }
        return z2;
    }

    public final double getSystemicRiskFactor(boolean z, C188058yy r7) {
        AnonymousClass00C.A0D(r7, 1);
        boolean z2 = this.isLive;
        if (z) {
            AUF auf = this.abrSetting;
            if (z2) {
                return auf.liveSystemicRiskAudioFactor;
            }
            return auf.systemicRiskAudioFactor;
        } else if (!z2) {
            if (this.isIGClips) {
                double d = this.abrSetting.systemRiskFactorForIgClips;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.systemicRiskFactor;
        } else if (r7 == C188058yy.LOW_LATENCY) {
            return this.abrSetting.liveUserLowLatencySystemicRiskFactor;
        } else {
            C188058yy r1 = C188058yy.ULTRA_LOW_LATENCY;
            AUF auf2 = this.abrSetting;
            if (r7 == r1) {
                return auf2.liveUserUltraLowLatencySystemicRiskFactor;
            }
            return auf2.liveSystemicRiskFactor;
        }
    }

    public final double getVirtualBufferPercent(C188058yy r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3 == C188058yy.LOW_LATENCY) {
            return this.abrSetting.liveLSBVirtualBufferPercent;
        }
        if (r3 == C188058yy.ULTRA_LOW_LATENCY) {
            return this.abrSetting.liveULSBVirtualBufferPercent;
        }
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveVirtualBufferPercent;
        }
        return auf.virtualBufferPercent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSystemicRiskIBR(boolean r4, X.AnonymousClass9GX r5) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L_0x0018
            boolean r1 = r3.isLive
            X.AUF r0 = r3.abrSetting
            if (r1 == 0) goto L_0x000e
            boolean r0 = r0.liveSystemicRiskAudioEnableABR
            if (r0 != 0) goto L_0x0018
        L_0x000d:
            return r2
        L_0x000e:
            boolean r0 = r0.systemicRiskAudioEnableABR
            if (r0 == 0) goto L_0x000d
            if (r5 == 0) goto L_0x000d
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x000d
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.isSystemicRiskIBR(boolean, X.9GX):boolean");
    }

    public final boolean shouldUseServerSideBWE(C188058yy r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (this.isLive) {
            if (r3 == C188058yy.ULTRA_LOW_LATENCY) {
                return this.abrSetting.useSSBweForUltraLowLatency;
            }
            if (r3 == C188058yy.LOW_LATENCY) {
                return this.abrSetting.useSSBweForLowLatency;
            }
            if (r3 == C188058yy.REGULAR_LATENCY) {
                return this.abrSetting.useSSBweForRegularLatency;
            }
        }
        return false;
    }

    private final boolean getEnableInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveEnableInitialBitrateBoosterByNetworkQuality;
        }
        return auf.enableInitialBitrateBoosterByNetworkQuality;
    }

    private final float getInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveInitialBitrateBoosterByNetworkQuality;
        }
        return auf.initialBitrateBoosterByNetworkQuality;
    }

    public final boolean enableAndroidAPIBitrate() {
        return this.abrSetting.enableAndroidAPIBitrate;
    }

    public final boolean enableConfRiskBwCache() {
        return this.abrSetting.enableConfRiskBwCache;
    }

    public final boolean enableMosOverride() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.enableMosOverrideLive;
        }
        return auf.enableMosOverride;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        if (this.isLive || !z || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCacheOverride;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        if (this.isLive || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCachePrefetchOverride;
    }

    public final boolean enableXPlatBweParity() {
        return this.abrSetting.enableXPlatBweParity;
    }

    public final long getAbrDurationForIntentional() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAbrDurationForIntentional;
        }
        return auf.abrDurationForIntentional;
    }

    public final boolean getAllowAbrUpToWatchableMosInLowBuffer() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAllowAbrUpToWatchableMosInLowBuffer;
        }
        return auf.allowAbrUpToWatchableMosInLowBuffer;
    }

    public final boolean getAllowAudioFormatsLowerThanDefault() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAllowAudioFormatsLowerThanDefault;
        }
        return auf.allowAudioFormatsLowerThanDefault;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return this.abrSetting.androidBandwidthFallbackNumberOfSamples;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitIntentionalKbps;
        }
        return 0;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitUnintentionalKbps;
        }
        return 0;
    }

    public final float getAudioBandwidthFraction() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAudioBandwidthFractionCell;
        }
        return auf.audioBandwidthFractionCell;
    }

    public final int getAudioMaxInitialBitrate() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAudioMaxInitialBitrate;
        }
        return auf.audioMaxInitialBitrate;
    }

    public final float getAudioPrefetchBandwidthFraction() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAudioPrefetchBandwidthFraction;
        }
        return auf.audioPrefetchBandwidthFraction;
    }

    public final boolean getAvoidUsingDefaultQualityForIdealWhenNoBWEstimate() {
        return this.abrSetting.liveAvoidUseDefault;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return this.abrSetting.bwWeightLimitForBWEDampening;
    }

    public final float getBandwidthMultiplier() {
        boolean z;
        AnonymousClass9XE r1 = this.playbackPreferences;
        synchronized (r1) {
            z = r1.A05;
        }
        if (!z || !this.isIGStory) {
            return 1.0f;
        }
        return this.abrSetting.bandwidthMultiplier;
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsSponsoredVerticalVideos;
    }

    public final boolean getBypassWidthLimitsStories() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStories;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStoriesPrefetch;
    }

    public final int getDefaultBwRiskConfPct() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveDefaultBwRiskConfPct;
        }
        return auf.defaultBwRiskConfPct;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return this.abrSetting.dropRenderFrameRatioForPreventAbrUp;
    }

    public final boolean getEnableBsrV2Definition() {
        return this.abrSetting.enableBsrV2Definition;
    }

    public final boolean getEnableCdnBandwidthRestriction() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableCdnBandwidthRestriction;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableSegmentBitrate;
    }

    public final boolean getEnableVodPrefetchQSFix() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableVodPrefetchQSFix;
    }

    public final boolean getForceCurrentNoWatchableFormatFrameDrop() {
        return this.abrSetting.forceCurrentNoWatchableFormatFrameDrop;
    }

    public final float getFrameDropFactor() {
        return this.abrSetting.frameDropFactor;
    }

    public final boolean getHashUrlForUnique() {
        return this.abrSetting.hashUrlForUnique;
    }

    public final int getHighBufferBandwidthConfPct() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveHighBufferBandwidthConfidencePct;
        }
        return auf.highBufferBandwidthConfidencePct;
    }

    public final double getHighOrBetterMosThreshold() {
        return this.abrSetting.highOrBetterMosThreshold;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return this.abrSetting.honorDefaultBandwidthSR;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.initSegmentBandwidthExclusionLimitBytes;
    }

    public final float getLambdaFallingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveLambdaFallingBufferConfidenceCalculator;
        }
        return auf.lambdaFallingBufferConfidenceCalculator;
    }

    public final float getLambdaRisingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveLambdaRisingBufferConfidenceCalculator;
        }
        return auf.lambdaRisingBufferConfidenceCalculator;
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAbrLatencyBasedAbrTargetBufferSizeMs;
        }
        return auf.latencyBasedTargetBufferSizeMs;
    }

    public final int getLiveDefaultMaxWidth() {
        return this.abrSetting.liveAbrDefaultMaxWidthCell;
    }

    public final int getLowBufferBandwidthConfPct() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveLowBufferBandwidthConfidencePct;
        }
        return auf.lowBufferBandwidthConfidencePct;
    }

    public final int getLowWatermarkMs() {
        if (this.isLive) {
            return 0;
        }
        return Integer.MAX_VALUE;
    }

    public final float getMainProcessBitrateMultiplier() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMainProcessBitrateEstimateMultiplier;
        }
        return auf.mainProcessBitrateEstimateMultiplier;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxAlphaLowPassEMABwDown;
        }
        return auf.maxAlphaLowPassEMABwDown;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxAlphaLowPassEMABwUp;
        }
        return auf.maxAlphaLowPassEMABwUp;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxAlphaLowPassEMABwVol;
        }
        return auf.maxAlphaLowPassEMABwVol;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxAlphaLowPassEMATtfbDown;
        }
        return auf.maxAlphaLowPassEMATtfbDown;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxAlphaLowPassEMATtfbUp;
        }
        return auf.maxAlphaLowPassEMATtfbUp;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxAlphaLowPassEMATtfbVol;
        }
        return auf.maxAlphaLowPassEMATtfbVol;
    }

    public final float getMaxBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxBandwidthMultiplier;
        }
        boolean z = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.storiesMaxBandwidthMultiplier;
        }
        return auf.maxBandwidthMultiplier;
    }

    public final long getMaxBufferedDurationFallingBufferMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            if (z2) {
                i = auf.liveStoriesMaxBufferedDurationMsFallingBuffer;
            } else {
                i = auf.liveMaxBufferedDurationMsFallingBuffer;
            }
        } else if (z2) {
            i = auf.storiesMaxBufferedDurationMsFallingBuffer;
        } else {
            i = auf.maxBufferedDurationMsFallingBuffer;
        }
        return (long) i;
    }

    public final long getMaxDurationForQualityDecreaseMs() {
        int i;
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            i = auf.liveMaxDurationForQualityDecreaseMs;
        } else {
            i = auf.maxDurationForQualityDecreaseMs;
        }
        return (long) i;
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return this.abrSetting.maxNumberSmallBwSamplesIgnored;
    }

    public final float getMaxTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxTTFBMultiplier;
        }
        boolean z = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.storiesMaxTTFBMultiplier;
        }
        return auf.maxTTFBMultiplier;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxWidthCell;
        }
        return auf.maxWidthCell;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveMaxWidthInlinePlayer;
        }
        return auf.maxWidthInlinePlayer;
    }

    public final int getMaxWidthSphericalVideo() {
        return this.abrSetting.maxWidthSphericalVideo;
    }

    public final int getMaxWidthToPrefetch() {
        boolean z;
        if (this.abrSetting.bypassPrefetchWidthLimits) {
            return Integer.MAX_VALUE;
        }
        AnonymousClass9XE r1 = this.playbackPreferences;
        synchronized (r1) {
            z = r1.A04;
        }
        if (z) {
            return this.abrSetting.maxWidthSphericalVideo;
        }
        boolean z2 = this.isLive;
        AUF auf = this.abrSetting;
        if (z2) {
            return auf.liveMaxWidthToPrefetchCell;
        }
        return auf.maxWidthToPrefetchAbrCell;
    }

    public final float getMinBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinBandwidthMultiplier;
        }
        boolean z = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.storiesMinBandwidthMultiplier;
        }
        return auf.minBandwidthMultiplier;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        if (this.isLive) {
            return 0;
        }
        return this.abrSetting.minBufferedDurationMsForMosAwareCache;
    }

    public final long getMinDurationForHighBWQualityIncreaseMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            if (z2) {
                i = auf.liveStoriesMinDurationForHighBWQualityIncreaseMs;
            } else {
                i = auf.liveMinDurationForHighBWQualityIncreaseMs;
            }
        } else if (z2) {
            i = auf.storiesMinDurationForHighBWQualityIncreaseMs;
        } else {
            i = auf.minDurationForHighBWQualityIncreaseMs;
        }
        return (long) i;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return this.abrSetting.minFramesDropForPreventAbrUp;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return this.abrSetting.minFramesRenderedForPreventAbrUp;
    }

    public final int getMinMosConstraintLimit() {
        return this.abrSetting.minMosConstraintLimit;
    }

    public final int getMinMosForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.storiesMinMosForCachedQuality;
        }
        return auf.minMosForCachedQuality;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.minOverallMosForABR;
    }

    public final float getMinPartiallyCachedSpan() {
        return this.abrSetting.minPartiallyCachedSpan;
    }

    public final float getMinTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinTTFBMultiplier;
        }
        boolean z = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.storiesMinTTFBMultiplier;
        }
        return auf.minTTFBMultiplier;
    }

    public final int getMinWatchableMos() {
        int i;
        if (!this.isIGClips || (i = this.abrSetting.igClipsMinWatchableMos) <= 0) {
            return this.abrSetting.minWatchableMos;
        }
        return i;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return this.abrSetting.minWidthMultiplierFrameDrop;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.modBwRiskConfPct;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.modOverallMosForABR;
    }

    public final int getMosDiffPctForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.storiesMosDiffPctForCachedQuality;
        }
        return auf.mosDiffPctForCachedQuality;
    }

    public final float getMosPrefetchFractionByNetworkQuality() {
        return this.abrSetting.mosPrefetchFractionByNetworkQuality;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return this.abrSetting.personalizedAggressiveStallDuration;
    }

    public final int getPersonalizedBWRiskConfPctAggressive() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedBWRiskConfPctAggressive;
        }
        return auf.personalizedBWRiskConfPctAggressive;
    }

    public final int getPersonalizedBWRiskConfPctConservative() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedBWRiskConfPctConservative;
        }
        return auf.personalizedBWRiskConfPctConservative;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedBWRiskConfPctNormal;
        }
        return auf.personalizedBWRiskConfPctNormal;
    }

    public final int getPersonalizedBWRiskConfPctVeryAggressive() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedBWRiskConfPctVeryAggressive;
        }
        return auf.personalizedBWRiskConfPctVeryAggressive;
    }

    public final int getPersonalizedBWRiskConfPctVeryConservative() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedBWRiskConfPctVeryConservative;
        }
        return auf.personalizedBWRiskConfPctVeryConservative;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return this.abrSetting.personalizedConservativeStallDuration;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedRiskMultiplierAggressive;
        }
        return auf.personalizedRiskMultiplierAggressive;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedRiskMultiplierConservative;
        }
        return auf.personalizedRiskMultiplierConservative;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedRiskMultiplierVeryAggressive;
        }
        return auf.personalizedRiskMultiplierVeryAggressive;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedRiskMultiplierVeryConservative;
        }
        return auf.personalizedRiskMultiplierVeryConservative;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return this.abrSetting.personalizedVeryAggressiveStallDuration;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePersonalizedVirtualBufferPercent;
        }
        return auf.personalizedVirtualBufferPercent;
    }

    public final int getPredictiveABRDownBufferMs() {
        return this.abrSetting.livePredictiveABRDownBufferMs;
    }

    public final int getPredictiveABRMaxSingleCycleDepletionMs() {
        return this.abrSetting.livePredictiveABRMaxSingleCycleDepletionMs;
    }

    public final float getPredictiveABRTtfbRatio() {
        return this.abrSetting.livePredictiveABRTtfbRatio;
    }

    public final int getPredictiveABRUpBufferMs() {
        return this.abrSetting.livePredictiveABRUpBufferMs;
    }

    public final boolean getPredictiveABRUpOnLiveHead() {
        return this.abrSetting.livePredictiveABRUpOnLiveHead;
    }

    public final int getPredictiveABRUpRetryIntervalMs() {
        return this.abrSetting.livePredictiveABRUpRetryIntervalMs;
    }

    public final float getPrefetchDurationMultiplier() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePrefetchDurationMultiplier;
        }
        return auf.vodPrefetchDurationMultiplier;
    }

    public final int getPrefetchLongQueueBandwidthConfPct() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePrefetchLongQueueBandwidthConfidencePct;
        }
        return auf.prefetchLongQueueBandwidthConfidencePct;
    }

    public final float getPrefetchLongQueueBandwidthFraction() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAbrPrefetchLongQueueBandwidthFraction;
        }
        return auf.prefetchLongQueueBandwidthFraction;
    }

    public final int getPrefetchLongQueueSizeThreshold() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAbrPrefetchLongQueueSizeThreshold;
        }
        return auf.prefetchLongQueueSizeThreshold;
    }

    public final int getPrefetchShortQueueBandwidthConfPct() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.livePrefetchShortQueueBandwidthConfidencePct;
        }
        return auf.prefetchShortQueueBandwidthConfidencePct;
    }

    public final float getPrefetchShortQueueBandwidthFraction() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveAbrPrefetchShortQueueBandwidthFraction;
        }
        return auf.prefetchShortQueueBandwidthFraction;
    }

    public final int getRiskRewardRatioBufferLimitMs() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveRiskRewardRatioBufferLimitMs;
        }
        return auf.riskRewardRatioBufferLimitMs;
    }

    public final float getRiskRewardRatioLowerBound() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveRiskRewardRatioLowerBound;
        }
        return auf.riskRewardRatioLowerBound;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return this.abrSetting.liveRiskRewardRatioUpperBound;
        }
        if (this.isStory) {
            float f = this.abrSetting.riskRewardRatioUpperBoundSfv;
            if (((double) f) > 0.0d) {
                return f;
            }
        }
        return this.abrSetting.riskRewardRatioUpperBound;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveScreenWidthMultiplierLandscapeVideo;
        }
        return auf.screenWidthMultiplierLandscapeVideo;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveScreenWidthMultiplierPortraitVideo;
        }
        return auf.screenWidthMultiplierPortraitVideo;
    }

    public final boolean getServerSideForwardBwe() {
        if (this.isLive) {
            return this.abrSetting.serverSideForwardBwe;
        }
        return false;
    }

    public final boolean getShouldAvoidOnCellular() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveShouldAvoidOnCellular;
        }
        return auf.enableAvoidOnCellular;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return this.abrSetting.shouldCountFirstChunkOnly;
    }

    public final boolean getShouldEnableAudioIbr() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveEnableAudioIbrEvaluator;
        }
        return auf.enableAudioIbrEvaluator;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveEnableAudioIbrCache;
        }
        return auf.enableAudioIbrCache;
    }

    public final boolean getShouldEnableBwOnlyEstimationForLongPoll() {
        return this.abrSetting.enableBwOnlyEstimationForLongPoll;
    }

    public final boolean getShouldEnableMultiAudioSupport() {
        return this.abrSetting.enableMultiAudioSupport;
    }

    public final boolean getShouldEnableTtfbOnlyEstimation() {
        return this.abrSetting.enableTtfbOnlyEstimation;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return this.abrSetting.treatShortFormAsStories;
    }

    public final boolean getShouldUseServerSideGoodput() {
        return this.abrSetting.shouldUseServerSideGoodput;
    }

    public final boolean getSkipCachedAsCurrent() {
        return this.abrSetting.skipCachedAsCurrent;
    }

    public final double getSmartCacheOverrideThreshold() {
        return this.abrSetting.smartCacheOverrideThreshold;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return this.abrSetting.smartCacheOverridePrefetchThreshold;
    }

    public final float getSoftMinMosBandwidthFractionForAbrSelector() {
        return this.abrSetting.softMinMosBandwidthFractionForAbrSelector;
    }

    public final float getSoftMinMosForAbrSelector() {
        return this.abrSetting.softMinMosForAbrSelector;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeAcrossVideosMs;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeMs;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveSystemicRiskAvgSegmentDurationMs;
        }
        return auf.systemicRiskAvgSegmentDurationMs;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (!z) {
            return 1.0d;
        }
        boolean z2 = this.isLive;
        AUF auf = this.abrSetting;
        if (z2) {
            return auf.liveSystemicRiskAudioBitrateBoostFactor;
        }
        return auf.systemicRiskAudioBitrateBoostFactor;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        AUF auf = this.abrSetting;
        if (z2) {
            return auf.liveSystemicRiskAudioEnableDynOtherBitrate;
        }
        return auf.systemicRiskAudioEnableDynOtherBitrate;
    }

    public final boolean getSystemicRiskEnableForPrefetch() {
        return this.abrSetting.systemicRiskEnableForPrefetch;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            AUF auf = this.abrSetting;
            if (z2) {
                return auf.liveSystemicRiskAudioLowMosFactor;
            }
            return auf.systemicRiskAudioLowMosFactor;
        } else if (z2) {
            return this.abrSetting.liveSystemicRiskLowMosFactor;
        } else {
            if (this.isIGClips) {
                double d = this.abrSetting.systemicRiskLowMosFactorForIgClips;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.systemicRiskLowMosFactor;
        }
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveSystemicRiskMaxLookaheadDurationMs;
        }
        return auf.systemicRiskMaxLookaheadDurationMs;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.systemicRiskModMosFactor;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (!z) {
            return 0;
        }
        boolean z2 = this.isLive;
        AUF auf = this.abrSetting;
        if (z2) {
            return auf.liveSystemicRiskAudioOtherBitrate;
        }
        return auf.systemicRiskAudioOtherBitrate;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return this.abrSetting.ttfbWeightLimitForBWEDampening;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveTreatCurrentNullAsLowBuffer;
        }
        return auf.treatCurrentNullAsLowBuffer;
    }

    public final int getTtfbMsecWithServerSideGoodput() {
        return this.abrSetting.ttfbMsecWithServerSideGoodput;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return this.abrSetting.useDefaultFormatAsBackupForScreenWidthConstraints;
    }

    public final boolean getUsePlaybackCsvqm() {
        return this.abrSetting.usePlaybackCsvqm;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.usePlaybackMosForLowMosABR;
    }

    public final boolean getUseUnifiedUploadMos() {
        return this.abrSetting.useUnifiedUploadMos;
    }

    public final int getVeryHighBufferDurationMsForBandwidthBoost() {
        boolean z;
        if (this.abrSetting.veryHighBufferDurationMsForBandwidthBoostIG >= 0) {
            AnonymousClass9XE r1 = this.playbackPreferences;
            synchronized (r1) {
                z = r1.A05;
            }
            if (z && this.isIGStory) {
                return this.abrSetting.veryHighBufferDurationMsForBandwidthBoostIG;
            }
        }
        if (this.isLive) {
            return -1;
        }
        return this.abrSetting.veryHighBufferDurationMsForBandwidthBoost;
    }

    public final boolean overrideCacheWhenHighMos() {
        if (!this.isStory || !this.abrSetting.overrideCacheWhenHighMos) {
            return false;
        }
        return true;
    }

    public final boolean overrideCacheWhenHighMosForPrefetch() {
        if (!this.isStory || !this.abrSetting.overrideCacheWhenHighMosForPrefetch) {
            return false;
        }
        return true;
    }

    public final boolean shouldAlwaysPlayCachedData() {
        if (this.isLive) {
            return this.abrSetting.alwaysPlayLiveCachedData;
        }
        return false;
    }

    public final boolean shouldAvoidOnABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.shouldEnableAvoidOnABR;
    }

    public final boolean shouldDeleteNonSR() {
        return this.abrSetting.shouldDeleteNonSR;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return this.abrSetting.shouldDeprecateLiveInitialABR;
    }

    public final boolean shouldExcludeCDNResponseTimeForLongPoll() {
        return this.abrSetting.removeCDNResponseTimeForLongPoll;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return this.abrSetting.shouldLogInbandTelemetryBweDebugString;
    }

    public final boolean shouldSelectIntermediateFormatRiskRewardBased() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveSelectIntermediateFormatRiskRewardBased;
        }
        return auf.selectIntermediateFormatRiskRewardBased;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.useLogarithmicRisk;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveShouldUseLowPassEMAAsymmetryForBWEstimation;
        }
        return auf.shouldUseLowPassEMAAsymmetryForBWEstimation;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveShouldUseLowPassEMAForBWEstimation;
        }
        return auf.shouldUseLowPassEMAForBWEstimation;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveShouldUseLowPassWithWeightedEMAForBWEstimation;
        }
        return auf.shouldUseLowPassWithWeightedEMAForBWEstimation;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useMosAwareCachedSelection;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (z) {
            return false;
        }
        boolean z2 = this.isLive;
        AUF auf = this.abrSetting;
        if (z2) {
            return auf.liveUseRiskRewardRatio;
        }
        return auf.useRiskRewardRatio;
    }

    public final boolean updateFormatsWithIntentionChange() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveUpdateFormatsWithIntentionChange;
        }
        return auf.updateFormatsWithIntentionChange;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForABRIfLower;
        }
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForAOCIfLower;
        }
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useOverallMosForABR;
    }

    public final boolean usePersonalizedBWRiskConfPcts() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveUsePersonalizedBWRiskConfPcts;
        }
        return auf.usePersonalizedBWRiskConfPcts;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveUsePersonalizedRiskMultipliers;
        }
        return auf.usePersonalizedRiskMultipliers;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        boolean z = this.isLive;
        AUF auf = this.abrSetting;
        if (z) {
            return auf.liveUsePersonalizedVirtualBuffer;
        }
        return auf.usePersonalizedVirtualBuffer;
    }

    public AbrContextAwareConfiguration(AUF auf, C1891392j r6, AnonymousClass9XE r7, boolean z, boolean z2) {
        String str;
        String str2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C36321k7.A0y(auf, r7);
        this.abrSetting = auf;
        this.connectivityManagerHolder = r6;
        this.playbackPreferences = r7;
        this.isLive = z;
        synchronized (r7) {
            str = r7.A00;
        }
        synchronized (r7) {
            str2 = r7.A01;
        }
        boolean z7 = false;
        if ("fb_stories".equalsIgnoreCase(str) || (this.abrSetting.treatShortFormAsStories && ("fb_shorts_viewer".equalsIgnoreCase(str2) || "fb_shorts_native_in_feed_unit".equalsIgnoreCase(str2)))) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isStory = z3;
        this.isIGStory = "reel_feed_timeline".equalsIgnoreCase(str);
        this.isIGClips = str != null ? AnonymousClass098.A07(C36431kI.A1D(Locale.ROOT, str), "clips_viewer_", false) : z7;
        synchronized (r7) {
            z4 = r7.A06;
        }
        this.isThumbnail = z4;
        synchronized (r7) {
            z5 = r7.A05;
        }
        this.isSponsored = z5;
        synchronized (r7) {
            z6 = r7.A03;
        }
        this.isBackgroundPrefetch = z6;
        this.enableForegroundPrefetchQualityExperimentation = r7.A02;
        this.isPrefetch = z2;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMos() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMosForPrefetch() {
        return false;
    }

    public final ConnectivityManager getConnectivityManager() {
        return null;
    }

    public final String getDataConnectionQuality() {
        return "UNKNOWN";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getMaxInitialBitrate() {
        /*
            r5 = this;
            boolean r0 = r5.getEnableInitialBitrateBoosterByNetworkQuality()
            if (r0 == 0) goto L_0x000f
            com.facebook.common.networkbasic.ConnectionQuality r2 = com.facebook.common.networkbasic.ConnectionQuality.UNKNOWN
            java.lang.String r0 = "UNKNOWN"
            com.facebook.common.networkbasic.ConnectionQuality r2 = com.facebook.common.networkbasic.ConnectionQuality.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0012 }
            goto L_0x0012
        L_0x000f:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0037
        L_0x0012:
            com.facebook.common.networkbasic.ConnectionQuality r0 = com.facebook.common.networkbasic.ConnectionQuality.UNKNOWN
            if (r2 == r0) goto L_0x000f
            int r1 = r2.ordinal()
            com.facebook.common.networkbasic.ConnectionQuality r0 = com.facebook.common.networkbasic.ConnectionQuality.MODERATE
            int r0 = r0.ordinal()
            if (r1 <= r0) goto L_0x000f
            int r1 = r2.ordinal()
            com.facebook.common.networkbasic.ConnectionQuality r0 = com.facebook.common.networkbasic.ConnectionQuality.MODERATE
            int r0 = r0.ordinal()
            int r1 = r1 - r0
            float r0 = r5.getInitialBitrateBoosterByNetworkQuality()
            double r2 = (double) r0
            double r0 = (double) r1
            double r3 = java.lang.Math.pow(r2, r0)
        L_0x0037:
            boolean r1 = r5.isLive
            X.AUF r0 = r5.abrSetting
            if (r1 == 0) goto L_0x0043
            int r0 = r0.liveInitialBitrate
        L_0x003f:
            double r1 = (double) r0
            double r1 = r1 * r3
            int r0 = (int) r1
            return r0
        L_0x0043:
            int r0 = r0.maxInitialBitrate
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getMaxInitialBitrate():int");
    }

    public final AnonymousClass9XE getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnWifi() {
        return false;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }
}
