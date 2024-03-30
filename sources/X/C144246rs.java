package X;

import android.os.SystemClock;

/* renamed from: X.6rs  reason: invalid class name and case insensitive filesystem */
public class C144246rs implements C160747lW {
    public final /* synthetic */ AnonymousClass6YT A00;

    public C144246rs(AnonymousClass6YT r1) {
        this.A00 = r1;
    }

    public void BRd(float f, float f2) {
        this.A00.A0a.A0H(new AnonymousClass732(this, f, f2, 0));
    }

    public void BRe(boolean z) {
        this.A00.A0a.A0H(new AnonymousClass75B(20, (Object) this, z));
    }

    public void BSu(Exception exc, int i) {
        String str;
        AnonymousClass6YT r6 = this.A00;
        r6.A0a.A0H(new C81283wl((Object) this, i, 18));
        C133106Wu r5 = r6.A0j;
        boolean A03 = r6.A0d.A03();
        if (r5.A0A) {
            C21430zE r1 = r5.A08;
            if (A03) {
                str = "in_call";
            } else if (i == 2) {
                str = "evicted";
            } else if (i == 3) {
                str = "photo";
            } else if (i != 4) {
                str = "unknown";
            } else {
                str = "video";
            }
            r1.markerAnnotate(554251647, "error_message", str);
        }
        r5.A05(4);
        C132726Uz r4 = r6.A0i;
        if (C132726Uz.A02(r4)) {
            C1041658n r3 = new C1041658n();
            r3.A09 = C36361kB.A0j();
            r3.A0G = r4.A01.A00;
            r3.A0E = C36441kJ.A0y(i);
            StringBuilder A11 = C36381kD.A11(exc);
            A11.append(" at ");
            C36351kA.A1K(exc.getStackTrace()[0], A11);
            r3.A0H = A11.toString();
            r4.A00.Blv(r3);
        }
    }

    public void BdY() {
        long j;
        AnonymousClass6YT r4 = this.A00;
        C133106Wu r3 = r4.A0j;
        C161087m8 r0 = r4.A0C;
        int cameraType = r0.getCameraType();
        boolean z = !r0.BLt();
        Integer valueOf = Integer.valueOf(r4.A0C.getCameraApi());
        String flashMode = r4.A0C.getFlashMode();
        boolean z2 = r3.A0A;
        if (z2) {
            C133106Wu.A03(r3, "onPreviewReady", 554251647);
            C133106Wu.A01(r3, valueOf, 554251647, cameraType);
            C133106Wu.A00(r3, 554251647, z ? 1 : 0);
            r3.A08.markerAnnotate(554251647, "flash_mode", flashMode);
        }
        if (r4.A0R) {
            Integer valueOf2 = Integer.valueOf(r4.A0C.getCameraApi());
            int cameraType2 = r4.A0C.getCameraType();
            C1039157o r1 = new C1039157o();
            r1.A02 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A03);
            r1.A01 = Integer.valueOf(cameraType2);
            r1.A00 = valueOf2;
            if (r3.A09) {
                r3.A07.Bly(r1);
            }
            if (z2) {
                C133106Wu.A01(r3, valueOf2, 554250848, cameraType2);
                r3.A08.markerEnd(554250848, 2);
            }
            r4.A0R = false;
        } else {
            boolean z3 = r4.A0Q;
            Integer valueOf3 = Integer.valueOf(r4.A0C.getCameraApi());
            int cameraType3 = r4.A0C.getCameraType();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z3) {
                j = r3.A01;
            } else {
                j = r3.A02;
            }
            r3.A01 = 0;
            r3.A02 = 0;
            if (j != 0) {
                C1039657t r12 = new C1039657t();
                r12.A02 = Integer.valueOf(z3 ^ true ? 1 : 0);
                r12.A03 = Long.valueOf(elapsedRealtime - j);
                r12.A01 = Integer.valueOf(cameraType3);
                r12.A00 = valueOf3;
                if (r3.A09) {
                    r3.A07.Bly(r12);
                }
            }
        }
        r4.A0Q = false;
        r4.A0a.A0H(new C81323wp((Object) this, 3));
        C133106Wu.A02(r3, "onPreviewReady", 554251647);
        r3.A05(2);
    }

    public void Bdu(AnonymousClass67E r5) {
        this.A00.A0a.A0H(new AnonymousClass751(32, r5.A02, this));
    }

    public void BkF() {
        C133106Wu r4 = this.A00.A0j;
        r4.A04 = SystemClock.elapsedRealtime() - r4.A05;
        if (r4.A0A) {
            C133106Wu.A02(r4, "start_video_capture", 554249147);
            C133106Wu.A03(r4, "video_record", 554249147);
        }
    }
}
