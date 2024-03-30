package X;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.os.Trace;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Callable;

public final /* synthetic */ class AYY implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ A29 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AYY(A29 a29, String str, long j) {
        this.A01 = a29;
        this.A02 = str;
        this.A00 = j;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i;
        A29 a29 = this.A01;
        String str = this.A02;
        long j = this.A00;
        Trace.beginSection("Camera1Device.startVideoRecording.startVideoTask.call");
        HashSet hashSet = C197019az.A00;
        if (!C200349hC.A02(hashSet)) {
            a29.A0J.A01();
        }
        AnonymousClass9WX r10 = a29.A0O;
        C201049ih A022 = r10.A02(a29.A01);
        a29.A0B = C201049ih.A07(C201049ih.A0V, A022);
        C191289Cj r8 = C201049ih.A0A;
        a29.A03 = C201049ih.A02(r8, A022);
        C201049ih A023 = r10.A02(a29.A01);
        boolean A024 = C200349hC.A02(hashSet);
        B4X b4x = a29.A08;
        Objects.requireNonNull(b4x);
        int A0I = AnonymousClass000.A0I(b4x.B84(B4X.A00));
        if (A0I == -1 || !CamcorderProfile.hasProfile(a29.A01, A0I)) {
            A0I = 1;
        }
        C202659mN r1 = a29.A0I;
        CamcorderProfile camcorderProfile = CamcorderProfile.get(C202659mN.A00(r1, a29.A01), A0I);
        AnonymousClass9W3 r12 = (AnonymousClass9W3) A023.A08(C201049ih.A0w);
        if (r12 == null) {
            r12 = (AnonymousClass9W3) A023.A08(C201049ih.A0p);
        }
        Objects.requireNonNull(r12);
        int i2 = r12.A01;
        if (!A024 || A0I == 1) {
            camcorderProfile.videoCodec = 2;
            camcorderProfile.videoFrameWidth = r12.A02;
            camcorderProfile.videoFrameHeight = i2;
            camcorderProfile.videoFrameRate = C201049ih.A02(C201049ih.A0u, A023);
            Object B84 = a29.A08.B84(B4X.A0c);
            if (B84.equals(C188348zR.HIGH)) {
                i = 5000000;
            } else if (B84.equals(C188348zR.MEDIUM)) {
                i = 3000000;
            } else if (B84.equals(C188348zR.LOW)) {
                i = 1000000;
            }
            camcorderProfile.videoBitRate = i;
        }
        int A05 = r1.A05(a29.A01, a29.A0Z);
        if (Integer.valueOf(A05) == null) {
            A05 = r1.A05(a29.A01, a29.A0Z);
        }
        int i3 = a29.A01;
        boolean A07 = C201049ih.A07(C201049ih.A0M, A022);
        C23072B3b b3b = a29.A0b;
        Objects.requireNonNull(b3b);
        C23014B0f BJ1 = b3b.BJ1();
        a29.A0A = BJ1;
        if (BJ1 == null) {
            if (C200349hC.A02(hashSet)) {
                a29.A0J.A01();
            }
            C1693088o A002 = r10.A00(i3);
            boolean z = !C201049ih.A07(C201049ih.A0S, A022);
            if (C198429dX.A04(C198429dX.A0R, A002.A00)) {
                int i4 = 0;
                if (z) {
                    i4 = 3;
                }
                C191299Ck.A02(r8, A002, i4);
            }
            C191299Ck.A02(C201049ih.A0v, A002, A05);
            A002.A02();
            C159927kB r82 = a29.A06;
            if (r82 == null) {
                r82 = new C23226BAi(a29, 0);
                a29.A06 = r82;
            }
            BJ1 = new C140246lH(r82, A07);
            a29.A0A = BJ1;
        }
        try {
            a29.A09 = BJ1.Bv0(camcorderProfile, (AnonymousClass7cE) null, str, (String) null, i3, A05, true, A07, false);
            Camera camera = a29.A0a;
            Objects.requireNonNull(camera);
            camera.lock();
            a29.A09.A02(C199989gN.A0N, Long.valueOf(j));
            Trace.endSection();
            return a29.A09;
        } catch (Throwable th) {
            Camera camera2 = a29.A0a;
            Objects.requireNonNull(camera2);
            camera2.lock();
            throw th;
        }
    }
}
