package com.facebook.exoplayer.bandwidthestimator.estimate;

import X.AnonymousClass000;
import X.AnonymousClass5ZP;
import X.AnonymousClass94N;
import X.C36351kA;
import X.C90464aC;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

public class VideoBandwidthEstimate {
    public static final Map A08 = new AnonymousClass5ZP(0);
    public long A00;
    public AbrContextAwareConfiguration A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public VideoBandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6, int i, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        this.A05 = j;
        this.A07 = j2;
        this.A06 = j3;
        this.A00 = j4;
        this.A04 = j5;
        this.A03 = j6;
        this.A02 = i;
        this.A01 = abrContextAwareConfiguration;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("ttfb=");
        A0u2.append(this.A05);
        StringBuilder A0j = C90464aC.A0j(A0u2, A0u);
        A0j.append(", bw=");
        A0j.append(this.A00 / 1000);
        StringBuilder A0j2 = C90464aC.A0j(A0j, A0u);
        A0j2.append(", ttfb_s=");
        A0j2.append(this.A06);
        StringBuilder A0j3 = C90464aC.A0j(A0j2, A0u);
        A0j3.append(", bw_s=");
        A0j3.append(this.A03 / 1000);
        StringBuilder A0j4 = C90464aC.A0j(A0j3, A0u);
        A0j4.append(", s=");
        A0j4.append(this.A02);
        C36351kA.A1K(A0j4, A0u);
        synchronized (AnonymousClass94N.class) {
        }
        return A0u.toString();
    }

    public VideoBandwidthEstimate() {
        this.A05 = -1;
        this.A07 = -1;
        this.A06 = -1;
        this.A00 = -1;
        this.A04 = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = null;
    }
}
