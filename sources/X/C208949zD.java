package X;

import android.os.SystemClock;
import android.util.Log;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import java.util.Objects;

/* renamed from: X.9zD  reason: invalid class name and case insensitive filesystem */
public abstract class C208949zD implements B5Q, B26 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C199319f7 A04;
    public C200769iC A05;
    public B2j A06;
    public Integer A07 = C023109s.A00;
    public boolean A08;
    public boolean A09;
    public C207099uY[] A0A;
    public final int A0B;
    public final C190989Bd A0C;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass82J A0B(X.C207099uY r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            r1 = 0
            r2 = r10
            if (r10 == 0) goto L_0x001a
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r9.A09 = r0
            int r0 = r9.BvJ(r10)     // Catch:{ 82J -> 0x0018, all -> 0x0014 }
            r8 = r0 & 7
            r9.A09 = r1
            goto L_0x001b
        L_0x0014:
            r0 = move-exception
            r9.A09 = r1
            throw r0
        L_0x0018:
            r9.A09 = r1
        L_0x001a:
            r8 = 4
        L_0x001b:
            java.lang.String r3 = r9.getName()
            int r7 = r9.A00
            if (r10 != 0) goto L_0x0024
            r8 = 4
        L_0x0024:
            r5 = 1
            X.82J r1 = new X.82J
            r4 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208949zD.A0B(X.9uY, java.lang.Throwable, int):X.82J");
    }

    public abstract void A0F();

    public abstract void A0G(long j, boolean z);

    public void A0H(boolean z, boolean z2) {
    }

    public final int A0A(C190989Bd r9, AnonymousClass82Z r10, int i) {
        B2j b2j = this.A06;
        Objects.requireNonNull(b2j);
        int Bms = b2j.Bms(r9, r10, i);
        if (Bms != -4) {
            if (Bms == -5) {
                C207099uY r7 = r9.A00;
                Objects.requireNonNull(r7);
                long j = r7.A0J;
                if (j != Long.MAX_VALUE) {
                    C199159en r1 = new C199159en(r7);
                    r1.A0I = j + this.A03;
                    r9.A00 = new C207099uY(r1);
                }
            }
            return Bms;
        } else if (AnonymousClass000.A1S(r10.A00 & 4, 4)) {
            this.A02 = Long.MIN_VALUE;
            if (!this.A08) {
                return -3;
            }
            return -4;
        } else {
            long j2 = r10.A00 + this.A03;
            r10.A00 = j2;
            this.A02 = Math.max(this.A02, j2);
            return Bms;
        }
    }

    public void A0C() {
        DefaultAudioSink defaultAudioSink;
        if (this instanceof AnonymousClass82G) {
            defaultAudioSink = ((AnonymousClass82G) this).A0J;
        } else if (this instanceof AnonymousClass82E) {
            AnonymousClass82E r4 = (AnonymousClass82E) this;
            if (r4 instanceof C1688982l) {
                C1688982l r42 = (C1688982l) r4;
                r42.A08 = 0;
                r42.A09 = 0;
                r42.A0A = 0;
                r42.A0H = SystemClock.elapsedRealtime();
                r42.A0L = SystemClock.elapsedRealtime() * 1000;
                return;
            } else if (r4 instanceof C1689082m) {
                defaultAudioSink = ((C1689082m) r4).A0F;
            } else {
                throw null;
            }
        } else {
            return;
        }
        defaultAudioSink.A0D();
    }

    public void A0D() {
        DefaultAudioSink defaultAudioSink;
        if (this instanceof AnonymousClass82G) {
            AnonymousClass82G r0 = (AnonymousClass82G) this;
            AnonymousClass82G.A04(r0);
            defaultAudioSink = r0.A0J;
        } else if (this instanceof AnonymousClass82E) {
            AnonymousClass82E r2 = (AnonymousClass82E) this;
            if (r2 instanceof C1688982l) {
                C1688982l r22 = (C1688982l) r2;
                r22.A0J = -9223372036854775807L;
                C1688982l.A06(r22);
                return;
            } else if (r2 instanceof C1689082m) {
                C1689082m r23 = (C1689082m) r2;
                C1689082m.A01(r23);
                defaultAudioSink = r23.A0F;
            } else {
                throw null;
            }
        } else {
            return;
        }
        defaultAudioSink.A0C();
    }

    public void A0E(C207099uY[] r8, long j) {
        if (this instanceof C1688982l) {
            C1688982l r4 = (C1688982l) this;
            if (r4.A0N == -9223372036854775807L) {
                r4.A0N = j;
                return;
            }
            int i = r4.A0B;
            long[] jArr = r4.A0l;
            if (i == 10) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Too many stream changes, so dropping offset: ");
                Log.w("MediaCodecVideoRenderer", C36411kG.A11(A0u, jArr[9]));
            } else {
                r4.A0B = i + 1;
            }
            int i2 = r4.A0B - 1;
            jArr[i2] = j;
            r4.A0m[i2] = r4.A0K;
        } else if (this instanceof AnonymousClass82F) {
            AnonymousClass82F r1 = (AnonymousClass82F) this;
            r1.A01 = j;
            r1.A02 = r8[0];
            if (r1.A03 != null) {
                r1.A00 = 1;
            } else {
                AnonymousClass82F.A05(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r4.BMw() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008e, code lost:
        if (r10 != null) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJd(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass82G
            if (r0 == 0) goto L_0x001f
            r1 = r8
            X.82G r1 = (X.AnonymousClass82G) r1
            r0 = 2
            if (r9 == r0) goto L_0x0114
            r0 = 3
            if (r9 == r0) goto L_0x00f5
            r0 = 6
            if (r9 != r0) goto L_0x001e
            X.9T5 r10 = (X.AnonymousClass9T5) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0J
        L_0x0014:
            X.9T5 r0 = r1.A0F
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x001e
            r1.A0F = r10
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r8 instanceof X.C1688982l
            if (r0 == 0) goto L_0x00da
            r4 = r8
            X.82l r4 = (X.C1688982l) r4
            r7 = 1
            if (r9 != r7) goto L_0x00c1
            android.view.Surface r10 = (android.view.Surface) r10
            if (r10 != 0) goto L_0x0032
            android.view.Surface r0 = r4.A0P
            if (r0 == 0) goto L_0x0091
            r10 = r0
        L_0x0032:
            android.view.Surface r0 = r4.A0Q
            if (r0 == r10) goto L_0x00a6
            r4.A0Q = r10
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A0M = r0
            int r6 = r4.A01
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x004b
            boolean r0 = r4.BMw()
            r5 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            r3 = 2
            if (r6 == r7) goto L_0x0051
            if (r6 != r3) goto L_0x008e
        L_0x0051:
            X.B3l r2 = r4.A0C
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            if (r1 < r0) goto L_0x0088
            if (r2 == 0) goto L_0x0088
            if (r10 == 0) goto L_0x0088
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0088
            X.C1688982l.A04(r10, r2)
        L_0x0064:
            android.view.Surface r0 = r4.A0P
            if (r10 == r0) goto L_0x012a
            X.C1688982l.A07(r4)
            X.C1688982l.A05(r4)
            if (r6 == r3) goto L_0x0072
            if (r5 == 0) goto L_0x001e
        L_0x0072:
            long r5 = r4.A0g
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r5
        L_0x007f:
            r4.A0J = r0
            return
        L_0x0082:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x007f
        L_0x0088:
            r4.A0L()
            r4.A0M()
        L_0x008e:
            if (r10 == 0) goto L_0x012a
            goto L_0x0064
        L_0x0091:
            X.9l7 r2 = r4.A0D
            if (r2 == 0) goto L_0x0032
            boolean r0 = X.C1688982l.A09(r2, r4)
            if (r0 == 0) goto L_0x0032
            android.content.Context r1 = r4.A0h
            boolean r0 = r2.A07
            X.4dE r10 = X.C92164dE.A01(r1, r0)
            r4.A0P = r10
            goto L_0x0032
        L_0x00a6:
            if (r10 == 0) goto L_0x001e
            android.view.Surface r0 = r4.A0P
            if (r10 == r0) goto L_0x001e
            X.C1688982l.A07(r4)
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x001e
            X.5o9 r3 = r4.A0j
            android.view.Surface r2 = r4.A0Q
            android.os.Handler r1 = r3.A00
            if (r1 == 0) goto L_0x001e
            r0 = 35
            X.C165587tf.A0y(r1, r3, r2, r0)
            return
        L_0x00c1:
            r0 = 4
            if (r9 != r0) goto L_0x00d2
            int r1 = X.AnonymousClass000.A0I(r10)
            r4.A0G = r1
            X.B3l r0 = r4.A0C
            if (r0 == 0) goto L_0x001e
            r0.Bsi(r1)
            return
        L_0x00d2:
            r0 = 7
            if (r9 != r0) goto L_0x001e
            X.9D6 r10 = (X.AnonymousClass9D6) r10
            r4.A0S = r10
            return
        L_0x00da:
            boolean r0 = r8 instanceof X.C1689082m
            if (r0 == 0) goto L_0x001e
            r1 = r8
            X.82m r1 = (X.C1689082m) r1
            r0 = 2
            if (r9 == r0) goto L_0x0107
            r0 = 3
            if (r9 == r0) goto L_0x00f0
            r0 = 6
            if (r9 != r0) goto L_0x001e
            X.9T5 r10 = (X.AnonymousClass9T5) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0F
            goto L_0x0014
        L_0x00f0:
            X.9fD r10 = (X.C199379fD) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0F
            goto L_0x00f9
        L_0x00f5:
            X.9fD r10 = (X.C199379fD) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0J
        L_0x00f9:
            X.9fD r0 = r1.A0D
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x001e
            r1.A0D = r10
            r1.A0B()
            return
        L_0x0107:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = r1.A0F
            float r1 = X.C36441kJ.A03(r10)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            goto L_0x0120
        L_0x0114:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = r1.A0J
            float r1 = X.C36441kJ.A03(r10)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x0120:
            r2.A00 = r1
            android.media.AudioTrack r0 = r2.A0B
            if (r0 == 0) goto L_0x001e
            r0.setVolume(r1)
            return
        L_0x012a:
            r1 = -1
            r4.A0F = r1
            r4.A0D = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A03 = r0
            r4.A0E = r1
            X.C1688982l.A05(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208949zD.BJd(int, java.lang.Object):void");
    }

    public final boolean BK4() {
        return AnonymousClass000.A1Q((this.A02 > Long.MIN_VALUE ? 1 : (this.A02 == Long.MIN_VALUE ? 0 : -1)));
    }

    public C208949zD(int i) {
        this.A0B = i;
        this.A0C = new C190989Bd();
        this.A02 = Long.MIN_VALUE;
    }
}
