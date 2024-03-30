package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.facebook.android.exoplayer2.ext.opus.OpusDecoder;
import com.facebook.android.exoplayer2.ext.opus.OpusLibrary;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.82G  reason: invalid class name */
public class AnonymousClass82G extends C208949zD implements B2G {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnonymousClass9OH A06;
    public AnonymousClass82Z A07;
    public C209039zM A08;
    public SimpleOutputBuffer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public C207099uY A0F;
    public boolean A0G;
    public final C190989Bd A0H;
    public final AnonymousClass9QE A0I = new AnonymousClass9QE((Handler) null, (C209409zx) null);
    public final DefaultAudioSink A0J;
    public final AnonymousClass82Z A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82G() {
        super(1);
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(new C23092B4c[0]);
        this.A0J = defaultAudioSink;
        defaultAudioSink.A0E = new C209009zJ(this);
        this.A0H = new C190989Bd();
        this.A0K = new AnonymousClass82Z(0);
        this.A01 = 0;
        this.A0C = true;
    }

    private void A01() {
        this.A0G = true;
        try {
            this.A0J.A0E();
        } catch (C1890091r e) {
            throw A0B(this.A0F, e, 5002);
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0F() {
        this.A0F = null;
        this.A0C = true;
        try {
            A02();
            DefaultAudioSink defaultAudioSink = this.A0J;
            defaultAudioSink.A0B();
            for (C23092B4c reset : defaultAudioSink.A0g) {
                reset.reset();
            }
            for (C23092B4c reset2 : defaultAudioSink.A0f) {
                reset2.reset();
            }
            defaultAudioSink.A0N = false;
            synchronized (this.A06) {
            }
            this.A0I.A00(this.A06);
        } catch (Throwable th) {
            synchronized (this.A06) {
                this.A0I.A00(this.A06);
                throw th;
            }
        }
    }

    public String getName() {
        return "LibopusAudioRenderer";
    }

    private void A00() {
        if (this.A08 == null) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C196289Yq.A01("createAudioDecoder");
                C207099uY r1 = this.A0F;
                int i = r1.A0A;
                if (i == -1) {
                    i = 5760;
                }
                OpusDecoder opusDecoder = new OpusDecoder(r1.A0T, i);
                this.A00 = opusDecoder.A01;
                this.A04 = 48000;
                this.A08 = opusDecoder;
                C196289Yq.A00();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                AnonymousClass9QE r5 = this.A0I;
                String name = this.A08.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = r5.A00;
                if (handler != null) {
                    handler.post(new AVf(r5, name, 0, j));
                }
                this.A06.A01++;
            } catch (C1688182b e) {
                throw A0B(this.A0F, e, 5001);
            }
        }
    }

    private void A02() {
        C209039zM r1 = this.A08;
        if (r1 != null) {
            this.A07 = null;
            this.A09 = null;
            r1.release();
            this.A08 = null;
            this.A06.A02++;
            this.A01 = 0;
            this.A0D = false;
        }
    }

    private void A03(C207099uY r4) {
        C207099uY r2 = this.A0F;
        this.A0F = r4;
        C21709AXg aXg = r4.A0L;
        C21709AXg aXg2 = null;
        if (r2 != null) {
            aXg2 = r2.A0L;
        }
        if (!Util.A0E(aXg, aXg2)) {
            C207099uY r22 = this.A0F;
            if (r22.A0L != null) {
                throw A0B(r22, new AnonymousClass92Q("Media requires a DrmSessionManager"), 5002);
            }
        }
        if (this.A0D) {
            this.A01 = 1;
        } else {
            A02();
            A00();
            this.A0C = true;
        }
        this.A02 = r4.A07;
        this.A03 = r4.A08;
        AnonymousClass9QE r23 = this.A0I;
        Handler handler = r23.A00;
        if (handler != null) {
            C165587tf.A0y(handler, r23, r4, 28);
        }
    }

    public static void A04(AnonymousClass82G r6) {
        long A0A2 = r6.A0J.A0A(r6.BLh());
        if (A0A2 != Long.MIN_VALUE) {
            if (!r6.A0B) {
                A0A2 = Math.max(r6.A05, A0A2);
            }
            r6.A05 = A0A2;
            r6.A0B = false;
        }
    }

    public void A0G(long j, boolean z) {
        this.A0J.A0B();
        this.A05 = j;
        this.A0A = true;
        this.A0B = true;
        this.A0E = false;
        this.A0G = false;
        if (this.A08 == null) {
            return;
        }
        if (this.A01 != 0) {
            A02();
            A00();
            return;
        }
        this.A07 = null;
        SimpleOutputBuffer simpleOutputBuffer = this.A09;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.A09 = null;
        }
        this.A08.flush();
        this.A0D = false;
    }

    public void A0H(boolean z, boolean z2) {
        AnonymousClass9OH r3 = new AnonymousClass9OH();
        this.A06 = r3;
        AnonymousClass9QE r2 = this.A0I;
        Handler handler = r2.A00;
        if (handler != null) {
            C165587tf.A0y(handler, r2, r3, 30);
        }
        C199319f7 r0 = this.A04;
        Objects.requireNonNull(r0);
        if (r0.A00 != 0) {
            throw C165617ti.A0V();
        }
    }

    public C199519fS BFz() {
        return DefaultAudioSink.A03(this.A0J).A02;
    }

    public long BG6() {
        if (this.A01 == 2) {
            A04(this);
        }
        return this.A05;
    }

    public boolean BLh() {
        if (!this.A0G) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.A0J;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0M || defaultAudioSink.A0H()) {
            return false;
        }
        return true;
    }

    public boolean BMw() {
        boolean BMw;
        if (this.A0J.A0H()) {
            return true;
        }
        if (this.A0F == null) {
            return false;
        }
        if (BK4()) {
            BMw = this.A08;
        } else {
            B2j b2j = this.A06;
            Objects.requireNonNull(b2j);
            BMw = b2j.BMw();
        }
        if (BMw || this.A09 != null) {
            return true;
        }
        return false;
    }

    public void Bo3(long j, long j2) {
        if (this.A0G) {
            try {
                this.A0J.A0E();
            } catch (C1890091r e) {
                throw A0B(this.A0F, e, 5002);
            }
        } else {
            if (this.A0F == null) {
                AnonymousClass82Z r3 = this.A0K;
                r3.clear();
                C190989Bd r2 = this.A0H;
                int A0A2 = A0A(r2, r3, 2);
                if (A0A2 == -5) {
                    A03(r2.A00);
                } else if (A0A2 == -4) {
                    C200319h9.A02(AnonymousClass000.A1S(r3.A00 & 4, 4));
                    this.A0E = true;
                    A01();
                    return;
                } else {
                    return;
                }
            }
            A00();
            if (this.A08 != null) {
                try {
                    C196289Yq.A01("drainAndFeed");
                    while (true) {
                        SimpleOutputBuffer simpleOutputBuffer = this.A09;
                        if (simpleOutputBuffer == null) {
                            simpleOutputBuffer = (SimpleOutputBuffer) this.A08.A03();
                            this.A09 = simpleOutputBuffer;
                            if (simpleOutputBuffer == null) {
                                break;
                            }
                            this.A06.A09 += simpleOutputBuffer.A00;
                        }
                        if (!AnonymousClass000.A1S(simpleOutputBuffer.A00 & 4, 4)) {
                            if (this.A0C) {
                                int i = this.A00;
                                int i2 = this.A04;
                                AnonymousClass7c0 r0 = C207099uY.CREATOR;
                                C199159en r1 = new C199159en();
                                r1.A0P = null;
                                r1.A0R = "audio/raw";
                                r1.A0N = null;
                                r1.A03 = -1;
                                r1.A09 = -1;
                                r1.A04 = i;
                                r1.A0E = i2;
                                r1.A0A = 2;
                                r1.A0S = null;
                                r1.A0K = null;
                                r1.A0F = 0;
                                r1.A0Q = null;
                                C199159en r22 = new C199159en(new C207099uY(r1));
                                r22.A06 = this.A02;
                                r22.A07 = this.A03;
                                this.A0J.A0F(new C207099uY(r22), (int[]) null);
                                this.A0C = false;
                            }
                            DefaultAudioSink defaultAudioSink = this.A0J;
                            SimpleOutputBuffer simpleOutputBuffer2 = this.A09;
                            if (!defaultAudioSink.A0J(simpleOutputBuffer2.data, simpleOutputBuffer2.A01)) {
                                break;
                            }
                            this.A06.A07++;
                            this.A09.release();
                            this.A09 = null;
                        } else if (this.A01 == 2) {
                            A02();
                            A00();
                            this.A0C = true;
                        } else {
                            simpleOutputBuffer.release();
                            this.A09 = null;
                            A01();
                        }
                    }
                    while (true) {
                        C209039zM r32 = this.A08;
                        if (r32 == null || this.A01 == 2 || this.A0E) {
                            break;
                        }
                        AnonymousClass82Z r12 = this.A07;
                        if (r12 == null) {
                            r12 = r32.A02();
                            this.A07 = r12;
                            if (r12 == null) {
                                break;
                            }
                        }
                        if (this.A01 == 1) {
                            r12.A00 = 4;
                            this.A08.A04(r12);
                            this.A07 = null;
                            this.A01 = 2;
                            break;
                        }
                        C190989Bd r23 = this.A0H;
                        int A0A3 = A0A(r23, r12, 0);
                        if (A0A3 == -3) {
                            break;
                        } else if (A0A3 == -5) {
                            A03(r23.A00);
                        } else {
                            AnonymousClass82Z r24 = this.A07;
                            if (AnonymousClass000.A1S(r24.A00 & 4, 4)) {
                                this.A0E = true;
                                this.A08.A04(r24);
                                this.A07 = null;
                                break;
                            }
                            ByteBuffer byteBuffer = r24.A01;
                            if (byteBuffer != null) {
                                byteBuffer.flip();
                            }
                            AnonymousClass82Z r10 = this.A07;
                            if (this.A0A && !AnonymousClass000.A1S(r10.A00 & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
                                long j3 = r10.A00;
                                if (Math.abs(j3 - this.A05) > 500000) {
                                    this.A05 = j3;
                                }
                                this.A0A = false;
                            }
                            this.A08.A04(r10);
                            this.A0D = true;
                            this.A06.A06++;
                            this.A07 = null;
                        }
                    }
                    C196289Yq.A00();
                    synchronized (this.A06) {
                    }
                } catch (C1688182b | C1889991q | AnonymousClass923 e2) {
                    throw A0B(this.A0F, e2, 5001);
                }
            }
        }
    }

    public C199519fS Brd(C199519fS r2) {
        this.A0J.A0G(r2);
        return r2;
    }

    public final int BvJ(C207099uY r5) {
        int i = r5.A06;
        OpusLibrary opusLibrary = OpusLibrary.$redex_init_class;
        boolean z = true;
        if (i != 0 && (i == 1 || i != 1)) {
            z = false;
        }
        if (!"audio/opus".equalsIgnoreCase(r5.A0S)) {
            return 0;
        }
        if (!this.A0J.A0I(r5.A05, 2)) {
            return 1;
        }
        if (z) {
            return 44;
        }
        return 2;
    }
}
