package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9m3  reason: invalid class name and case insensitive filesystem */
public class C202509m3 {
    public static final int[] A0A;
    public long A00;
    public boolean A01;
    public final long A02;
    public final C1896394p A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final AnonymousClass9QS[] A08;
    public final List A09;

    static {
        int[] iArr = new int[19];
        A0A = iArr;
        iArr[0] = 8000;
        iArr[1] = 0;
        iArr[2] = 500;
        iArr[3] = 2000;
        iArr[4] = 500;
        iArr[5] = 2000;
        iArr[6] = 500;
        iArr[7] = 2000;
        iArr[8] = 8000;
        iArr[9] = 500;
        iArr[10] = 30000;
        iArr[11] = 30000;
        iArr[16] = 1;
        iArr[17] = 1;
        iArr[18] = 1;
    }

    public static int A00(C202509m3 r10, int i) {
        C188168z9 r0;
        C201209j4 r5;
        long j;
        AnonymousClass9QS[] r7 = r10.A08;
        if (r7[i] == null) {
            return A0A[i];
        }
        if (r10.A01 && r10.A03 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - r10.A00 > r10.A02) {
                long j2 = -1;
                if (r10.A05) {
                    boolean z = r10.A06;
                    synchronized (C201209j4.class) {
                        r5 = C201209j4.A07;
                        if (r5 == null) {
                            r5 = new C201209j4(B40.A00);
                            C201209j4.A07 = r5;
                        }
                    }
                    if (z) {
                        j = r5.A00((AbrContextAwareConfiguration) null).A00;
                    } else {
                        synchronized (r5) {
                            j = r5.A02;
                        }
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                }
                List list = r10.A04;
                if (j2 >= 0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r0 = C188168z9.EXCELLENT;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        if (j2 < ((long) C36381kD.A03(pair))) {
                            r0 = (C188168z9) pair.first;
                            break;
                        }
                    }
                } else {
                    r0 = C188168z9.UNKNOWN;
                }
                int i2 = 0;
                do {
                    if ((!r10.A07 || i2 != 1) && r7[i2] != null) {
                        AnonymousClass9QS r52 = r7[i2];
                        AUB aub = r52.A01;
                        if (!aub.useNetworkQuality || !aub.useNetworkType) {
                            r52.A00(r0);
                        } else if (!aub.useNetworkQualityWifiOnly && r0 != C188168z9.UNKNOWN) {
                            r52.A00(r0);
                        }
                        if (aub.useNetworkType) {
                            r52.A00 = aub.defaultValue;
                        }
                    }
                    i2++;
                } while (i2 < 19);
                r10.A00 = elapsedRealtime;
            }
        }
        return r7[i].A00;
    }

    public static void A01(AUB aub, Object[] objArr, int i) {
        AnonymousClass9QS r0;
        if (aub != null) {
            r0 = new AnonymousClass9QS(aub);
        } else {
            r0 = null;
        }
        objArr[i] = r0;
    }

    public C202509m3(AUR aur, C1896394p r16) {
        AnonymousClass9QS[] r5 = new AnonymousClass9QS[19];
        this.A08 = r5;
        int i = 0;
        this.A01 = false;
        this.A07 = aur.useLatencyForSegmentConcat;
        this.A05 = aur.useAccumulatorForBw;
        this.A06 = aur.useBwBpsForConnectionQuality;
        Pair[] pairArr = new Pair[4];
        C188168z9 r13 = C188168z9.DEGRADED;
        AUB aub = aur.latencyBoundMsConfig;
        pairArr[0] = C36341k9.A0I(r13, aub.degradedValue);
        C188168z9 r12 = C188168z9.POOR;
        pairArr[1] = C36341k9.A0I(r12, aub.poorValue);
        C188168z9 r11 = C188168z9.MODERATE;
        pairArr[2] = C36341k9.A0I(r11, aub.moderateValue);
        C188168z9 r9 = C188168z9.GOOD;
        this.A09 = Collections.unmodifiableList(C90524aI.A0p(C36341k9.A0I(r9, aub.goodValue), pairArr, 3));
        Pair[] pairArr2 = new Pair[4];
        AUB aub2 = aur.qualityMapperBoundMsConfig;
        pairArr2[0] = C36341k9.A0I(r13, aub2.degradedValue);
        pairArr2[1] = C36341k9.A0I(r12, aub2.poorValue);
        pairArr2[2] = C36341k9.A0I(r11, aub2.moderateValue);
        this.A04 = Collections.unmodifiableList(C90524aI.A0p(C36341k9.A0I(r9, aub2.goodValue), pairArr2, 3));
        A01(aur.fetchHttpReadTimeoutMsConfig, r5, 0);
        A01(aur.concatenatedMsPerLoadConfig, r5, 1);
        A01(aur.minBufferMsConfig, r5, 2);
        A01(aur.minRebufferMsConfig, r5, 3);
        A01(aur.liveMinBufferMsConfig, r5, 4);
        A01(aur.liveMinRebufferMsConfig, r5, 5);
        A01(aur.liveAPIMinBufferMsConfig, r5, 12);
        A01(aur.liveAPIMinRebufferMsConfig, r5, 13);
        A01(aur.livePremiumMinBufferMsConfig, r5, 14);
        A01(aur.livePremiumMinRebufferMsConfig, r5, 15);
        A01(aur.fbstoriesMinBufferMsConfig, r5, 6);
        A01(aur.fbstoriesMinRebufferMsConfig, r5, 7);
        A01(aur.fetchCacheSourceHttpConnectTimeoutMsConfig, r5, 8);
        A01(aur.minMicroRebufferMsConfig, r5, 9);
        A01(aur.wifiMaxWatermarkMsConfig, r5, 10);
        A01(aur.cellMaxWatermarkMsConfig, r5, 11);
        A01(aur.networkAwareDisableSecondPhasePrefetch, r5, 16);
        A01(aur.networkAwarePrefetchTaskQueueWorkerNum, r5, 17);
        A01(aur.networkAwareHttpPriorityIncrementalForStreaming, r5, 18);
        while (true) {
            if (this.A08[i] == null) {
                i++;
                if (i >= 19) {
                    break;
                }
            } else {
                this.A01 = true;
                break;
            }
        }
        this.A03 = r16;
        this.A02 = aur.minDelayToRefreshTigonBitrateMs;
    }

    public C202509m3() {
        this(AUR.A01, (C1896394p) null);
    }
}
