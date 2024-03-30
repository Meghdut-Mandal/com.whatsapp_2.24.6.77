package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.AYi  reason: case insensitive filesystem */
public class C21731AYi implements Callable {
    public final /* synthetic */ A2F A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CaptureRequest.Builder A02;
    public final /* synthetic */ C195169St A03;

    public C21731AYi(CaptureRequest.Builder builder, C195169St r2, A2F a2f, long j) {
        this.A03 = r2;
        this.A02 = builder;
        this.A00 = a2f;
        this.A01 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        B4X b4x;
        C195169St r6 = this.A03;
        if (!r6.A0D) {
            throw AnonymousClass001.A09("Not recording video.");
        } else if (r6.A0B == null || r6.A05 == null || r6.A03 == null || r6.A02 == null || r6.A01 == null) {
            throw AnonymousClass001.A09("Cannot stop recording video, camera is closed");
        } else if (r6.A06 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r6.A00;
            if (elapsedRealtime < 500) {
                SystemClock.sleep(500 - elapsedRealtime);
            }
            C199989gN r3 = r6.A06;
            r3.A02(C199989gN.A0Q, Long.valueOf(SystemClock.elapsedRealtime()));
            Exception A002 = r6.A00();
            C1692888m r0 = r6.A03;
            C191289Cj r5 = C201049ih.A0A;
            if (!(C201049ih.A02(r5, r0) == 0 || (builder = this.A02) == null || ((b4x = r6.A04) != null && C165567td.A1a(B4X.A02, b4x)))) {
                C195519Up r1 = new C195519Up();
                r1.A01(r5, 0);
                r6.A03.A0A(r1.A00());
                AnonymousClass9Yv.A01(builder, r6.A03, r6.A05, 0);
                r6.A02.A05();
            }
            if (A002 == null) {
                r3.A02(C199989gN.A0P, Long.valueOf(this.A01));
                return r3;
            }
            throw A002;
        } else {
            throw AnonymousClass001.A09("Cannot stop recording video, VideoCaptureInfo is null");
        }
    }
}
