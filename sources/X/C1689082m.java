package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Objects;

/* renamed from: X.82m  reason: invalid class name and case insensitive filesystem */
public class C1689082m extends AnonymousClass82E implements B2G {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03;
    public long A04;
    public long A05 = 0;
    public AudioManager A06;
    public MediaFormat A07;
    public C207099uY A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final AnonymousClass9QE A0E;
    public final DefaultAudioSink A0F;
    public final boolean A0G;
    public final boolean A0H;

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1689082m(android.content.Context r13, android.os.Handler r14, X.C200129gf r15, X.B4Y r16, X.AnonymousClass9JW r17, X.C125125zM r18, X.C209409zx r19, X.C23092B4c[] r20, boolean r21, boolean r22) {
        /*
            r12 = this;
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = new com.facebook.android.exoplayer2.audio.DefaultAudioSink
            r0 = r20
            r2.<init>(r0)
            r8 = 1
            r9 = 0
            r3 = r12
            r10 = 0
            r11 = 0
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r9
            r12.A02 = r9
            r0 = 0
            r12.A05 = r0
            android.content.Context r0 = r13.getApplicationContext()
            r12.A0D = r0
            r12.A0F = r2
            r0 = r21
            r12.A0G = r0
            r0 = r22
            r12.A0H = r0
            X.9QE r0 = new X.9QE
            r1 = r19
            r0.<init>(r14, r1)
            r12.A0E = r0
            X.9zI r0 = new X.9zI
            r0.<init>(r12)
            r2.A0E = r0
            boolean r0 = r7.A0A
            r2.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689082m.<init>(android.content.Context, android.os.Handler, X.9gf, X.B4Y, X.9JW, X.5zM, X.9zx, X.B4c[], boolean, boolean):void");
    }

    public static int A00(C207099uY r3, C1689082m r4, C202149l7 r5) {
        PackageManager packageManager;
        int i = Util.A00;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(r5.A02) || (i == 23 && (packageManager = r4.A0D.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return r3.A0A;
        }
        return -1;
    }

    public static void A01(C1689082m r6) {
        long A0A2 = r6.A0F.A0A(r6.BLh());
        if (A0A2 != Long.MIN_VALUE) {
            if (!r6.A0C) {
                A0A2 = Math.max(r6.A04, A0A2);
            }
            r6.A04 = A0A2;
            r6.A0C = false;
        }
    }

    public void A0F() {
        try {
            this.A0F.A0B();
            super.A0F();
            synchronized (this.A09) {
            }
            this.A0E.A00(this.A09);
        } catch (Throwable th) {
            synchronized (this.A09) {
                this.A0E.A00(this.A09);
                throw th;
            }
        }
    }

    public boolean A0Q(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.A0F.A0I(-1, 18)) {
                return true;
            }
            str = "audio/eac3";
        }
        int A002 = C203249nb.A00(str);
        if (!this.A0F.A0I(i, A002) || A002 == 0) {
            return false;
        }
        return true;
    }

    public C199519fS BFz() {
        return DefaultAudioSink.A03(this.A0F).A02;
    }

    public long BG6() {
        if (this.A01 == 2) {
            A01(this);
        }
        return this.A04;
    }

    public boolean BMw() {
        if (this.A0F.A0H() || super.BMw()) {
            return true;
        }
        return false;
    }

    public C199519fS Brd(C199519fS r2) {
        this.A0F.A0G(r2);
        return r2;
    }

    public void A0G(long j, boolean z) {
        super.A0G(j, z);
        this.A0F.A0B();
        this.A04 = j;
        this.A09 = true;
        this.A0C = true;
    }

    public void A0H(boolean z, boolean z2) {
        super.A0H(z, z2);
        AnonymousClass9QE r3 = this.A0E;
        AnonymousClass9OH r2 = this.A09;
        Handler handler = r3.A00;
        if (handler != null) {
            C165587tf.A0y(handler, r3, r2, 30);
        }
        C199319f7 r0 = this.A04;
        Objects.requireNonNull(r0);
        if (r0.A00 != 0) {
            throw C165617ti.A0V();
        }
    }

    public void A0O(C207099uY r4) {
        super.A0O(r4);
        this.A08 = r4;
        AnonymousClass9QE r2 = this.A0E;
        Handler handler = r2.A00;
        if (handler != null) {
            C165587tf.A0y(handler, r2, r4, 28);
        }
    }
}
