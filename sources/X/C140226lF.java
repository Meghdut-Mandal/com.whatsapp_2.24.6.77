package X;

import android.graphics.SurfaceTexture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6lF  reason: invalid class name and case insensitive filesystem */
public class C140226lF implements C23072B3b {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public int A05;
    public C199559fW A06;
    public final C140196lC A07 = new C140196lC();
    public final /* synthetic */ AnonymousClass88P A08;

    public void Bfp(SurfaceTexture surfaceTexture) {
        this.A06 = null;
        AnonymousClass88P.A01(this.A08, (C199559fW) null);
    }

    public C140226lF(AnonymousClass88P r2) {
        this.A08 = r2;
    }

    public static void A00(C140226lF r8) {
        if (r8.A07.A02 != null) {
            AnonymousClass88P r2 = r8.A08;
            r2.A0H.post(new AVq(r2, r8.A01, r8.A00, r8.A05, r8.A02, r8.A04, r8.A03));
        }
    }

    public C23076B3g BGB() {
        return this.A08.A0J;
    }

    public SurfaceTexture BI5(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = i6;
        this.A02 = i4;
        this.A04 = i5;
        this.A03 = AnonymousClass000.A1S(i7, 1);
        int i9 = 7;
        if (i8 != 7) {
            i9 = 0;
        }
        AnonymousClass88P r7 = this.A08;
        if (i9 != r7.A00) {
            r7.A00 = i9;
            if (i9 == 7) {
                r7.A0O = true;
            } else {
                r7.A0O = false;
            }
            C199559fW r1 = this.A06;
            if (r1 != null) {
                ((C1690483a) r7.A06).A05.A02.A03(r1);
                AnonymousClass88P.A01(r7, this.A06);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean z = r7.A0L;
        if (z) {
            C140196lC r3 = this.A07;
            SurfaceTexture surfaceTexture = r3.A02;
            r3.A02 = null;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            AnonymousClass6YR.A05("ar-session", "regular surface used - async");
            r3.A02 = new SurfaceTexture(0);
        }
        r7.A0H.post(new AnonymousClass75C((Object) this, (Object) countDownLatch, 43));
        if (!z) {
            try {
                countDownLatch.await(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Object[] objArr = new Object[1];
                C90514aH.A1U(e, objArr, 0);
                AnonymousClass6YR.A0E("RtcSurfacePipeComponent", "Timeout when creating SurfaceNode: %s", e, objArr);
            }
        }
        A00(this);
        return this.A07.A02;
    }

    public void BSy(int i) {
        if (this.A05 != i) {
            this.A05 = i;
            A00(this);
        }
    }

    public void BVY(int i) {
        this.A08.A0G.post(new C81283wl((Object) this, i, 4));
    }

    public void Bfn(int i, int i2) {
        AnonymousClass88P r3 = this.A08;
        r3.A0H.post(new C1497572q(r3, 2));
    }

    public void Bfo(SurfaceTexture surfaceTexture, int i, int i2) {
        C199559fW r0 = this.A06;
        if (r0 == null || r0.A05 != surfaceTexture) {
            this.A06 = new C199559fW(surfaceTexture);
        }
        AnonymousClass88P r3 = this.A08;
        AnonymousClass88P.A01(r3, this.A06);
        r3.A0H.post(new C1497572q(r3, 3));
    }

    public void BnV(SurfaceTexture surfaceTexture) {
        C140196lC r2 = this.A07;
        SurfaceTexture surfaceTexture2 = r2.A02;
        r2.A02 = null;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        A00(this);
    }

    public B32 BFt() {
        return null;
    }

    public C23014B0f BJ1() {
        return null;
    }
}
