package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9eU  reason: invalid class name and case insensitive filesystem */
public class C198969eU {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AUI A04;
    public final Integer A05;
    public final AtomicBoolean A06;
    public final C202509m3 A07;
    public final AtomicBoolean A08;
    public final boolean A09;

    public long A00(long j) {
        int i;
        float f;
        C202509m3 r1;
        AUI aui = this.A04;
        if (aui == null) {
            return 0;
        }
        try {
            C196289Yq.A01("getIntentBasedLowWatermarkUs");
            int i2 = aui.cellMinLowWaterMarkMs;
            if (!this.A09 || (r1 = this.A07) == null) {
                i = aui.cellMaxLowWaterMarkMs;
            } else {
                i = C202509m3.A00(r1, 11);
            }
            float f2 = aui.cellLowWaterMarkMultiplier;
            Integer num = this.A05;
            if (num == C023109s.A01) {
                f = aui.waterMarkLowMultiplier;
            } else if (num == C023109s.A0C) {
                f = aui.waterMarkHighMultiplier;
            } else {
                f = 1.0f;
            }
            return (long) (f * Math.min(((float) (((long) i2) * 1000)) + (f2 * ((float) j)), (float) (((long) i) * 1000)));
        } finally {
            C196289Yq.A00();
        }
    }

    public C198969eU(C202509m3 r5, AUI aui, Integer num, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = aui;
        this.A06 = atomicBoolean;
        this.A08 = atomicBoolean2;
        this.A02 = ((long) i) * 1000;
        this.A03 = ((long) i2) * 1000;
        this.A01 = ((long) i3) * 1000;
        this.A00 = ((long) i4) * 1000;
        this.A05 = num;
        this.A07 = r5;
        this.A09 = z;
    }

    public C198969eU() {
        this((C202509m3) null, (AUI) null, C023109s.A00, new AtomicBoolean(false), new AtomicBoolean(false), 1000, -1, 15000, 30000, false);
    }
}
