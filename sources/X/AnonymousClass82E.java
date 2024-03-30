package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* renamed from: X.82E  reason: invalid class name */
public abstract class AnonymousClass82E extends C208949zD {
    public static final byte[] A0l = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public long A07;
    public C207099uY A08;
    public AnonymousClass9OH A09;
    public B28 A0A;
    public B28 A0B;
    public C23079B3l A0C;
    public C202149l7 A0D;
    public AnonymousClass929 A0E;
    public ByteBuffer A0F;
    public ArrayDeque A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public boolean A0T;
    public long A0U;
    public long A0V = -9223372036854775807L;
    public String A0W;
    public boolean A0X;
    public boolean A0Y;
    public final int A0Z;
    public final MediaCodec.BufferInfo A0a;
    public final C190989Bd A0b;
    public final AnonymousClass82Z A0c;
    public final C200129gf A0d;
    public final B4Y A0e;
    public final AnonymousClass9JW A0f;
    public final C125125zM A0g;
    public final List A0h;
    public final boolean A0i;
    public final int A0j;
    public final AnonymousClass82Z A0k;

    private void A01() {
        this.A03 = -1;
        this.A0c.A01 = null;
    }

    public void A0F() {
        this.A08 = null;
        this.A0G = null;
        try {
            A0L();
            try {
                B28 b28 = this.A0A;
                if (b28 != null) {
                    this.A0d.A03(b28);
                }
                try {
                    A03(this);
                } finally {
                    this.A0A = null;
                    this.A0B = null;
                }
            } catch (Throwable th) {
                A03(this);
                throw th;
            } finally {
                this.A0A = null;
                this.A0B = null;
            }
        } catch (Throwable th2) {
            try {
                A03(this);
                throw th2;
            } finally {
                this.A0A = null;
                this.A0B = null;
            }
        } finally {
        }
    }

    public void A0G(long j, boolean z) {
        this.A0M = false;
        this.A0N = false;
        if (this.A0C != null) {
            A0K();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r0 <= r6) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(android.media.MediaCrypto r12, X.C207099uY r13, X.C23079B3l r14, X.C202149l7 r15) {
        /*
            r11 = this;
            r3 = r11
            X.82m r3 = (X.C1689082m) r3
            X.9uY[] r0 = r3.A0A
            java.util.Objects.requireNonNull(r0)
            int r5 = X.C1689082m.A00(r13, r3, r15)
            r3.A00 = r5
            java.lang.String r1 = r15.A02
            int r4 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 24
            if (r4 >= r0) goto L_0x00f1
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r0 = "zeroflte"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "herolte"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "heroqlte"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f1
        L_0x0042:
            r0 = 1
        L_0x0043:
            r3.A0A = r0
            boolean r0 = r15.A06
            r3.A0B = r0
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "audio/raw"
        L_0x004f:
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r2 = "mime"
            r7.setString(r2, r0)
            int r1 = r13.A05
            java.lang.String r0 = "channel-count"
            r7.setInteger(r0, r1)
            int r1 = r13.A0F
            java.lang.String r0 = "sample-rate"
            r7.setInteger(r0, r1)
            java.util.List r0 = r13.A0T
            X.AnonymousClass93m.A00(r7, r0)
            java.lang.String r1 = "max-input-size"
            r0 = -1
            if (r5 == r0) goto L_0x0074
            r7.setInteger(r1, r5)
        L_0x0074:
            r0 = 23
            if (r4 < r0) goto L_0x007e
            r1 = 0
            java.lang.String r0 = "priority"
            r7.setInteger(r0, r1)
        L_0x007e:
            java.lang.String r1 = r13.A0O
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "mp4a.40.42"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            X.5zM r4 = r3.A0g
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x00dd
            int r5 = r4.A05
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x00d1
            int r5 = r4.A00
            int r6 = r4.A01
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 11
            int r0 = r1.get(r0)
            if (r0 >= r5) goto L_0x00a9
            r5 = 3
            if (r0 > r6) goto L_0x00aa
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x00d1
            android.media.AudioManager r1 = r3.A06
            if (r1 != 0) goto L_0x00be
            android.content.Context r1 = r3.A0D
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r3.A06 = r1
        L_0x00be:
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r1.isBluetoothScoOn()
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r1.isBluetoothA2dpOn()
            if (r0 == 0) goto L_0x00d1
        L_0x00d0:
            r5 = 5
        L_0x00d1:
            java.lang.String r0 = "aac-drc-effect-type"
            r7.setInteger(r0, r5)
            int r1 = r4.A06
            java.lang.String r0 = "aac-target-ref-level"
            r7.setInteger(r0, r1)
        L_0x00dd:
            r8 = 0
            r10 = 0
            r6 = r12
            r5 = r14
            r9 = r8
            r5.B3R(r6, r7, r8, r9, r10)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x00f4
            r3.A07 = r7
            java.lang.String r0 = r13.A0S
            r7.setString(r2, r0)
            return
        L_0x00f1:
            r0 = 0
            goto L_0x0043
        L_0x00f4:
            r3.A07 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.A0N(android.media.MediaCrypto, X.9uY, X.B3l, X.9l7):void");
    }

    public boolean A0P(C23079B3l b3l, ByteBuffer byteBuffer, int i, int i2, long j, long j2, long j3, boolean z) {
        C207099uY r1;
        int i3;
        C1689082m r4 = (C1689082m) this;
        if (r4.A0B && (i2 & 2) != 0) {
            b3l.BnR(i, false);
            return true;
        } else if (z) {
            b3l.BnR(i, false);
            r4.A09.A09++;
            r4.A0F.A0P = true;
            return true;
        } else {
            if (r4.A0H) {
                C207099uY r2 = r4.A08;
                if ((!"audio/raw".equals(r2.A0S) || r2.A0B == 2) && i2 == 0 && r4.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
                    int position = byteBuffer.position();
                    int limit = byteBuffer.limit();
                    byteBuffer.position(10);
                    short s = byteBuffer.getShort();
                    byteBuffer.position(position);
                    byteBuffer.limit(limit);
                    int limit2 = r4.A01 + (byteBuffer.limit() - byteBuffer.position());
                    r4.A01 = limit2;
                    r4.A02++;
                    r4.A05 += (long) Math.abs(s);
                    if (limit2 >= r4.A03 * 2) {
                        r4.A01 = 0;
                        r4.A02 = 0;
                        r4.A05 = 0;
                    }
                }
            }
            if (r4.A0G && byteBuffer.limit() > byteBuffer.position()) {
                int position2 = byteBuffer.position();
                int limit3 = byteBuffer.limit();
                ByteBuffer allocate = ByteBuffer.allocate(limit3 - position2);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position2);
                byteBuffer.limit(limit3);
            }
            try {
                if (!r4.A0F.A0J(byteBuffer, j3)) {
                    return false;
                }
                b3l.BnR(i, false);
                r4.A09.A07++;
                return true;
            } catch (C1889991q e) {
                e = e;
                r1 = r4.A08;
                i3 = 5001;
                throw r4.A0B(r1, e, i3);
            } catch (C1890091r e2) {
                e = e2;
                r1 = r4.A08;
                i3 = 5002;
                throw r4.A0B(r1, e, i3);
            }
        }
    }

    private void A00() {
        if (this.A02 == 2) {
            A0L();
            A0M();
            return;
        }
        this.A0N = true;
        A0J();
    }

    private void A02(MediaCrypto mediaCrypto, C202149l7 r14) {
        boolean z;
        String str = r14.A02;
        C23079B3l b3l = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C196289Yq.A01(AnonymousClass000.A0p("createCodec:", str, AnonymousClass000.A0u()));
            C125125zM r5 = this.A0g;
            C139136jI r3 = new C139136jI(r5.A09, r5.A0N);
            AnonymousClass6V0 r1 = AnonymousClass6V0.A04;
            boolean z2 = this instanceof C1688982l;
            if (z2) {
                z = true;
            } else {
                z = false;
            }
            C23079B3l A022 = r1.A02(r3, r5, str, z);
            this.A0W = str;
            C196289Yq.A00();
            C196289Yq.A01("configureCodec");
            A0N(mediaCrypto, this.A08, A022, r14);
            C196289Yq.A00();
            C196289Yq.A01("startCodec");
            A022.start();
            C196289Yq.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.A0C = A022;
            this.A0D = r14;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (z2) {
                C1688982l r12 = (C1688982l) this;
                AnonymousClass5o9 r7 = r12.A0j;
                Handler handler = r7.A00;
                if (handler != null) {
                    handler.post(new AVf(r7, str, 1, j));
                }
                r12.A0V = r12.A0S(str);
                return;
            }
            AnonymousClass9QE r72 = ((C1689082m) this).A0E;
            Handler handler2 = r72.A00;
            if (handler2 != null) {
                handler2.post(new AVf(r72, str, 0, j));
            }
        } catch (Exception e) {
            if (b3l != null) {
                b3l.release();
            }
            throw e;
        }
    }

    public static void A03(AnonymousClass82E r2) {
        B28 b28 = r2.A0B;
        if (b28 != null && b28 != r2.A0A) {
            r2.A0d.A03(b28);
        }
    }

    public void A0H(boolean z, boolean z2) {
        this.A09 = new AnonymousClass9OH();
        this.A07 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r2 == null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0I(X.C207099uY r4, X.B4Y r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C1688982l
            if (r0 == 0) goto L_0x000d
            java.lang.String r2 = r4.A0S
            if (r2 != 0) goto L_0x0027
        L_0x0008:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x000d:
            r1 = r3
            X.82m r1 = (X.C1689082m) r1
            java.lang.String r2 = r4.A0S
            if (r2 == 0) goto L_0x0008
            int r0 = r4.A05
            boolean r0 = r1.A0Q(r0, r2)
            if (r0 == 0) goto L_0x0027
            X.9l7 r0 = r5.BFF()
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x0027:
            r0 = 0
            java.util.List r0 = r5.BAq(r2, r6, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.A0I(X.9uY, X.B4Y, boolean):java.util.List");
    }

    public void A0J() {
        if (this instanceof C1689082m) {
            C1689082m r3 = (C1689082m) this;
            try {
                r3.A0F.A0E();
            } catch (C1890091r e) {
                throw r3.A0B(r3.A08, e, 5002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fb, code lost:
        if ("OMX.rk.video_decoder.avc".equals(r5) == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020b, code lost:
        if ("OMX.broadcom.video_decoder.tunnel.secure".equals(r5) == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0215, code lost:
        if ("Amazon".equals(com.facebook.android.exoplayer2.util.Util.A03) == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021f, code lost:
        if ("AFTS".equals(com.facebook.android.exoplayer2.util.Util.A04) == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0223, code lost:
        if (r6.A07 == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0235, code lost:
        if ("OMX.google.vorbis.decoder".equals(r5) == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0245, code lost:
        if ("OMX.google.aac.decoder".equals(r5) == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x027c, code lost:
        if ("OMX.google.vorbis.decoder".equals(r5) == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0280, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0284, code lost:
        if (r4 <= 29) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r4.requiresSecureDecoderComponent(r2) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0273  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r21 = this;
            r0 = r21
            X.B3l r1 = r0.A0C
            if (r1 != 0) goto L_0x030a
            X.9uY r1 = r0.A08
            if (r1 == 0) goto L_0x030a
            X.B28 r3 = r0.A0B
            r0.A0A = r3
            java.lang.String r2 = r1.A0S
            r12 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0022
            X.0o7 r1 = r3.BAT()
            X.9zL r1 = (X.C209029zL) r1
            if (r1 != 0) goto L_0x002a
            X.8xZ r1 = r3.BBc()
            if (r1 == 0) goto L_0x030a
        L_0x0022:
            r4 = r12
        L_0x0023:
            r1 = 0
        L_0x0024:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0034
        L_0x002a:
            android.media.MediaCrypto r4 = r1.A00
            boolean r2 = r4.requiresSecureDecoderComponent(r2)
            r1 = 1
            if (r2 != 0) goto L_0x0024
            goto L_0x0023
        L_0x0034:
            java.util.ArrayDeque r6 = r0.A0G     // Catch:{ 929 -> 0x02cf }
            r9 = 0
            if (r6 != 0) goto L_0x00cf
            X.B4Y r10 = r0.A0e     // Catch:{ 5UT -> 0x00c3 }
            X.9uY r5 = r0.A08     // Catch:{ 5UT -> 0x00c3 }
            java.util.List r7 = r0.A0I(r5, r10, r1)     // Catch:{ 5UT -> 0x00c3 }
            boolean r5 = r7.isEmpty()     // Catch:{ 5UT -> 0x00c3 }
            if (r5 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            X.9uY r5 = r0.A08     // Catch:{ 5UT -> 0x00c3 }
            java.util.List r7 = r0.A0I(r5, r10, r9)     // Catch:{ 5UT -> 0x00c3 }
            boolean r5 = r7.isEmpty()     // Catch:{ 5UT -> 0x00c3 }
            if (r5 != 0) goto L_0x0078
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = "Drm session requires secure decoder for "
            r6.append(r5)     // Catch:{ 5UT -> 0x00c3 }
            X.9uY r5 = r0.A08     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = r5.A0S     // Catch:{ 5UT -> 0x00c3 }
            r6.append(r5)     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = ", but no secure decoder available. Trying to proceed with "
            r6.append(r5)     // Catch:{ 5UT -> 0x00c3 }
            r6.append(r7)     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = "."
            java.lang.String r6 = X.AnonymousClass000.A0q(r5, r6)     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = "MediaCodecRenderer"
            android.util.Log.w(r5, r6)     // Catch:{ 5UT -> 0x00c3 }
        L_0x0078:
            boolean r5 = r7.isEmpty()     // Catch:{ 5UT -> 0x00c3 }
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r0.A0Q     // Catch:{ 5UT -> 0x00c3 }
            if (r5 == 0) goto L_0x00a7
            X.9uY r5 = r0.A08     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = X.C203599oN.A01(r5)     // Catch:{ 5UT -> 0x00c3 }
            if (r5 == 0) goto L_0x00a7
            java.util.List r10 = r10.BAq(r5, r9, r9)     // Catch:{ 5UT -> 0x00c3 }
            int r6 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 5UT -> 0x00c3 }
            r5 = 26
            if (r6 < r5) goto L_0x00a7
            X.9uY r5 = r0.A08     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r6 = r5.A0S     // Catch:{ 5UT -> 0x00c3 }
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r5.equals(r6)     // Catch:{ 5UT -> 0x00c3 }
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r10.isEmpty()     // Catch:{ 5UT -> 0x00c3 }
            if (r5 != 0) goto L_0x00a7
            r7 = r10
        L_0x00a7:
            boolean r5 = r0.A0i     // Catch:{ 5UT -> 0x00c3 }
            if (r5 == 0) goto L_0x00b5
            java.util.ArrayDeque r6 = new java.util.ArrayDeque     // Catch:{ 5UT -> 0x00c3 }
            r6.<init>(r7)     // Catch:{ 5UT -> 0x00c3 }
        L_0x00b0:
            r0.A0G = r6     // Catch:{ 5UT -> 0x00c3 }
            r0.A0E = r12     // Catch:{ 5UT -> 0x00c3 }
            goto L_0x00cf
        L_0x00b5:
            java.lang.Object r5 = r7.get(r9)     // Catch:{ 5UT -> 0x00c3 }
            java.util.List r5 = java.util.Collections.singletonList(r5)     // Catch:{ 5UT -> 0x00c3 }
            java.util.ArrayDeque r6 = new java.util.ArrayDeque     // Catch:{ 5UT -> 0x00c3 }
            r6.<init>(r5)     // Catch:{ 5UT -> 0x00c3 }
            goto L_0x00b0
        L_0x00c3:
            r7 = move-exception
            X.9uY r6 = r0.A08     // Catch:{ 929 -> 0x02cf }
            r5 = -49998(0xffffffffffff3cb2, float:NaN)
            X.929 r4 = new X.929     // Catch:{ 929 -> 0x02cf }
            r4.<init>(r6, r7, r5, r1)     // Catch:{ 929 -> 0x02cf }
            throw r4     // Catch:{ 929 -> 0x02cf }
        L_0x00cf:
            X.9uY r7 = r0.A08     // Catch:{ 929 -> 0x02cf }
            if (r7 == 0) goto L_0x00ef
            boolean r5 = r0.A0R     // Catch:{ 929 -> 0x02cf }
            if (r5 == 0) goto L_0x00ef
            java.lang.String r14 = r7.A0S     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = "video/av01"
            boolean r5 = r5.equalsIgnoreCase(r14)     // Catch:{ 929 -> 0x02cf }
            if (r5 == 0) goto L_0x00ef
            java.lang.String r13 = "meta.dav1d.av1.decoder"
            r15 = 0
            r16 = 1
            r17 = 0
            X.9l7 r5 = X.C202149l7.A00(r12, r13, r14, r15, r16, r17)     // Catch:{ 929 -> 0x02cf }
            r6.addFirst(r5)     // Catch:{ 929 -> 0x02cf }
        L_0x00ef:
            java.util.ArrayDeque r5 = r0.A0G     // Catch:{ 929 -> 0x02cf }
            boolean r5 = r5.isEmpty()     // Catch:{ 929 -> 0x02cf }
            if (r5 != 0) goto L_0x02c4
            java.util.ArrayDeque r5 = r0.A0G     // Catch:{ 929 -> 0x02cf }
            java.lang.Object r7 = r5.peekFirst()     // Catch:{ 929 -> 0x02cf }
        L_0x00fd:
            java.util.ArrayDeque r5 = r0.A0G     // Catch:{ 929 -> 0x02cf }
            java.lang.Object r11 = r5.peekFirst()     // Catch:{ 929 -> 0x02cf }
            X.9l7 r11 = (X.C202149l7) r11     // Catch:{ 929 -> 0x02cf }
            boolean r5 = r0 instanceof X.C1688982l     // Catch:{ 929 -> 0x02cf }
            if (r5 == 0) goto L_0x0120
            r9 = r0
            X.82l r9 = (X.C1688982l) r9     // Catch:{ 929 -> 0x02cf }
            android.view.Surface r6 = r9.A0Q     // Catch:{ 929 -> 0x02cf }
            if (r6 == 0) goto L_0x011a
            boolean r5 = r9.A0T     // Catch:{ 929 -> 0x02cf }
            if (r5 != 0) goto L_0x0120
            boolean r5 = r6.isValid()     // Catch:{ 929 -> 0x02cf }
            if (r5 != 0) goto L_0x0120
        L_0x011a:
            boolean r5 = X.C1688982l.A09(r11, r9)     // Catch:{ 929 -> 0x02cf }
            if (r5 == 0) goto L_0x030a
        L_0x0120:
            X.9JW r5 = r0.A0f     // Catch:{ Exception -> 0x013f }
            int r9 = r5.A00     // Catch:{ Exception -> 0x013f }
            if (r9 <= 0) goto L_0x013b
            r0.A02(r4, r11)     // Catch:{ Exception -> 0x012b }
            goto L_0x01b3
        L_0x012b:
            r5 = move-exception
            if (r11 != r7) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            throw r5     // Catch:{ Exception -> 0x013f }
        L_0x0130:
            java.lang.String r6 = "MediaCodecRenderer"
            java.lang.String r5 = "Preferred decoder instantiation failed. Sleeping then retrying."
            android.util.Log.w(r6, r5)     // Catch:{ Exception -> 0x013f }
            long r5 = (long) r9     // Catch:{ Exception -> 0x013f }
            java.lang.Thread.sleep(r5)     // Catch:{ Exception -> 0x013f }
        L_0x013b:
            r0.A02(r4, r11)     // Catch:{ Exception -> 0x013f }
            goto L_0x01b3
        L_0x013f:
            r6 = move-exception
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = "Failed to initialize decoder: "
            java.lang.String r9 = X.AnonymousClass000.A0l(r11, r5, r9)     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = "MediaCodecRenderer"
            android.util.Log.w(r5, r9, r6)     // Catch:{ 929 -> 0x02cf }
            java.util.ArrayDeque r5 = r0.A0G     // Catch:{ 929 -> 0x02cf }
            r5.removeFirst()     // Catch:{ 929 -> 0x02cf }
            X.9uY r10 = r0.A08     // Catch:{ 929 -> 0x02cf }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = "Decoder init failed: "
            r9.append(r5)     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = r11.A02     // Catch:{ 929 -> 0x02cf }
            r9.append(r5)     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = ", "
            java.lang.String r13 = X.AnonymousClass000.A0l(r10, r5, r9)     // Catch:{ 929 -> 0x02cf }
            java.lang.String r14 = r10.A0S     // Catch:{ 929 -> 0x02cf }
            boolean r5 = r6 instanceof android.media.MediaCodec.CodecException     // Catch:{ 929 -> 0x02cf }
            if (r5 == 0) goto L_0x01b1
            r5 = r6
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5     // Catch:{ 929 -> 0x02cf }
            java.lang.String r15 = r5.getDiagnosticInfo()     // Catch:{ 929 -> 0x02cf }
        L_0x0177:
            X.929 r10 = new X.929     // Catch:{ 929 -> 0x02cf }
            r17 = r1
            r16 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 929 -> 0x02cf }
            X.929 r5 = r0.A0E     // Catch:{ 929 -> 0x02cf }
            if (r5 != 0) goto L_0x0192
            r0.A0E = r10     // Catch:{ 929 -> 0x02cf }
        L_0x0186:
            java.util.ArrayDeque r5 = r0.A0G     // Catch:{ 929 -> 0x02cf }
            boolean r5 = r5.isEmpty()     // Catch:{ 929 -> 0x02cf }
            if (r5 == 0) goto L_0x00fd
            X.929 r4 = r0.A0E     // Catch:{ 929 -> 0x02cf }
            goto L_0x02ce
        L_0x0192:
            java.lang.String r16 = r5.getMessage()     // Catch:{ 929 -> 0x02cf }
            java.lang.Throwable r19 = r5.getCause()     // Catch:{ 929 -> 0x02cf }
            java.lang.String r9 = r5.mimeType     // Catch:{ 929 -> 0x02cf }
            boolean r6 = r5.secureDecoderRequired     // Catch:{ 929 -> 0x02cf }
            X.9l7 r14 = r5.codecInfo     // Catch:{ 929 -> 0x02cf }
            java.lang.String r5 = r5.diagnosticInfo     // Catch:{ 929 -> 0x02cf }
            X.929 r13 = new X.929     // Catch:{ 929 -> 0x02cf }
            r15 = r10
            r17 = r9
            r18 = r5
            r20 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 929 -> 0x02cf }
            r0.A0E = r13     // Catch:{ 929 -> 0x02cf }
            goto L_0x0186
        L_0x01b1:
            r15 = 0
            goto L_0x0177
        L_0x01b3:
            X.5zM r1 = r0.A0g
            boolean r7 = r1.A0Q
            X.9l7 r6 = r0.A0D
            java.lang.String r5 = r6.A02
            int r4 = com.facebook.android.exoplayer2.util.Util.A00
            r1 = 25
            if (r4 > r1) goto L_0x02c1
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0288
            java.lang.String r9 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r1 = "SM-T585"
            boolean r1 = r9.startsWith(r1)
            if (r1 != 0) goto L_0x01eb
            java.lang.String r1 = "SM-A510"
            boolean r1 = r9.startsWith(r1)
            if (r1 != 0) goto L_0x01eb
            java.lang.String r1 = "SM-A520"
            boolean r1 = r9.startsWith(r1)
            if (r1 != 0) goto L_0x01eb
            java.lang.String r1 = "SM-J700"
            boolean r1 = r9.startsWith(r1)
            if (r1 == 0) goto L_0x0288
        L_0x01eb:
            r1 = 2
        L_0x01ec:
            r0.A00 = r1
            r1 = 0
            if (r7 == 0) goto L_0x0226
            r1 = 25
            if (r4 > r1) goto L_0x0282
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0225
        L_0x01fd:
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0225
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0225
        L_0x020d:
            java.lang.String r9 = com.facebook.android.exoplayer2.util.Util.A03
            java.lang.String r1 = "Amazon"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0280
            java.lang.String r9 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0280
            boolean r1 = r6.A07
            if (r1 == 0) goto L_0x0280
        L_0x0225:
            r1 = 1
        L_0x0226:
            r0.A0J = r1
            r1 = 23
            if (r7 == 0) goto L_0x0273
            if (r4 > r1) goto L_0x0237
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r5)
            r6 = 1
            if (r1 != 0) goto L_0x0238
        L_0x0237:
            r6 = 0
        L_0x0238:
            r0.A0X = r6
            r1 = 21
            if (r4 != r1) goto L_0x0247
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r4 = r1.equals(r5)
            r1 = 1
            if (r4 != 0) goto L_0x0248
        L_0x0247:
            r1 = 0
        L_0x0248:
            r0.A0I = r1
            int r4 = r0.A01
            r1 = 2
            if (r4 != r1) goto L_0x026d
            long r6 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 + r4
        L_0x0256:
            r0.A0U = r6
            r0.A01()
            r1 = -1
            r0.A04 = r1
            r0.A0F = r12
            r0.A0V = r2
            r0.A0S = r8
            X.9OH r1 = r0.A09
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            return
        L_0x026d:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0256
        L_0x0273:
            if (r4 > r1) goto L_0x027e
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r5)
            r6 = 1
            if (r1 != 0) goto L_0x0238
        L_0x027e:
            r6 = 0
            goto L_0x0238
        L_0x0280:
            r1 = 0
            goto L_0x0226
        L_0x0282:
            r1 = 29
            if (r4 > r1) goto L_0x020d
            goto L_0x01fd
        L_0x0288:
            r1 = 24
            if (r4 >= r1) goto L_0x02c1
            java.lang.String r1 = "OMX.Nvidia.h264.decode"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x029c
            java.lang.String r1 = "OMX.Nvidia.h264.decode.secure"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x02c1
        L_0x029c:
            java.lang.String r9 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r1 = "flounder"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x02be
            java.lang.String r1 = "flounder_lte"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x02be
            java.lang.String r1 = "grouper"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x02be
            java.lang.String r1 = "tilapia"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x02c1
        L_0x02be:
            r1 = 1
            goto L_0x01ec
        L_0x02c1:
            r1 = 0
            goto L_0x01ec
        L_0x02c4:
            X.9uY r6 = r0.A08     // Catch:{ 929 -> 0x02cf }
            r5 = -49999(0xffffffffffff3cb1, float:NaN)
            X.929 r4 = new X.929     // Catch:{ 929 -> 0x02cf }
            r4.<init>(r6, r12, r5, r1)     // Catch:{ 929 -> 0x02cf }
        L_0x02ce:
            throw r4     // Catch:{ 929 -> 0x02cf }
        L_0x02cf:
            r10 = move-exception
            int r6 = r0.A0j
            if (r6 <= 0) goto L_0x0301
            long r4 = r0.A0V
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02e3
            long r8 = X.C36441kJ.A0A(r4)
            long r6 = (long) r6
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0301
        L_0x02e3:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x02f4
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.String r1 = "Decoder initialization failed, retry"
            android.util.Log.w(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.A0V = r1
        L_0x02f4:
            java.util.ArrayDeque r1 = r0.A0G
            if (r1 == 0) goto L_0x030a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x030a
            r0.A0G = r12
            return
        L_0x0301:
            X.9uY r2 = r0.A08
            r1 = 4001(0xfa1, float:5.607E-42)
            X.82J r0 = r0.A0B(r2, r10, r1)
            throw r0
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.A0M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0160, code lost:
        if (r8.A01(r9) != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
        if (r0 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f0, code lost:
        if (r2.A09 == r8.A09) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.C207099uY r14) {
        /*
            r13 = this;
            X.9uY r8 = r13.A08
            r13.A08 = r14
            X.AXg r1 = r14.A0L
            r4 = 0
            if (r8 != 0) goto L_0x002d
            r0 = r4
        L_0x000a:
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r1, r0)
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0076
            X.9uY r2 = r13.A08
            X.AXg r0 = r2.A0L
            if (r0 == 0) goto L_0x0074
            X.9gf r6 = r13.A0d
            if (r6 == 0) goto L_0x0066
            X.5zM r0 = r13.A0g
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x004a
            X.9iD r7 = X.C200779iD.A00()
            X.9uY r0 = r13.A08
            X.AXg r5 = r0.A0L
            monitor-enter(r7)
            goto L_0x0030
        L_0x002d:
            X.AXg r0 = r8.A0L
            goto L_0x000a
        L_0x0030:
            android.util.LruCache r0 = r7.A00     // Catch:{ all -> 0x0047 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            java.util.UUID r2 = X.AnonymousClass9B7.A04     // Catch:{ all -> 0x0047 }
            r0 = 0
            X.9uV r2 = X.C200129gf.A00(r5, r2, r0)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0059
            android.util.LruCache r0 = r7.A00     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ all -> 0x0047 }
            X.B28 r1 = (X.B28) r1     // Catch:{ all -> 0x0047 }
            goto L_0x0059
        L_0x0047:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004a:
            android.os.Looper r1 = android.os.Looper.myLooper()
            X.9uY r0 = r13.A08
            X.AXg r0 = r0.A0L
            X.B28 r1 = r6.A01(r1, r0)
            r13.A0B = r1
            goto L_0x005e
        L_0x0059:
            monitor-exit(r7)
            if (r1 == 0) goto L_0x004a
            r13.A0B = r1
        L_0x005e:
            X.B28 r0 = r13.A0A
            if (r1 != r0) goto L_0x0076
            r6.A03(r1)
            goto L_0x0076
        L_0x0066:
            java.lang.String r0 = "Media requires a DrmSessionManager"
            X.92Q r1 = new X.92Q
            r1.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            X.82J r0 = r13.A0B(r2, r1, r0)
            throw r0
        L_0x0074:
            r13.A0B = r4
        L_0x0076:
            X.B28 r1 = r13.A0B
            X.B28 r0 = r13.A0A
            r6 = 0
            if (r1 != r0) goto L_0x01e1
            X.B3l r0 = r13.A0C
            if (r0 == 0) goto L_0x01e1
            X.9l7 r5 = r13.A0D
            X.9uY r9 = r13.A08
            r2 = r13
            boolean r0 = r13 instanceof X.C1688982l
            if (r0 == 0) goto L_0x00f6
            X.82l r2 = (X.C1688982l) r2
            X.9uY r1 = r2.A08
            if (r1 == 0) goto L_0x009f
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x009f
            java.lang.String r1 = r1.A0S
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 1
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r8.A0S
            java.lang.String r0 = r9.A0S
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b3
            int r1 = r8.A0E
            int r0 = r9.A0E
            if (r1 != r0) goto L_0x00b3
        L_0x00b2:
            return
        L_0x00b3:
            boolean r0 = r5.A03
            boolean r0 = X.C1688982l.A08(r8, r9, r0)
            if (r0 == 0) goto L_0x01e1
            int r1 = r9.A0I
            X.9J5 r5 = r2.A0R
            int r0 = r5.A02
            if (r1 > r0) goto L_0x01e1
            int r1 = r9.A09
            int r0 = r5.A00
            if (r1 > r0) goto L_0x01e1
            int r1 = X.C1688982l.A00(r9)
            X.9J5 r0 = r2.A0R
            int r0 = r0.A01
            if (r1 > r0) goto L_0x01e1
            boolean r0 = r8.A01(r9)
            if (r0 != 0) goto L_0x00b2
            r13.A0Y = r3
            r13.A01 = r3
            int r1 = r13.A00
            r0 = 2
            if (r1 == r0) goto L_0x00f2
            if (r1 != r3) goto L_0x00f3
            X.9uY r2 = r13.A08
            int r1 = r2.A0I
            int r0 = r8.A0I
            if (r1 != r0) goto L_0x00f3
            int r1 = r2.A09
            int r0 = r8.A09
            if (r1 != r0) goto L_0x00f3
        L_0x00f2:
            r6 = 1
        L_0x00f3:
            r13.A0H = r6
            return
        L_0x00f6:
            X.82m r2 = (X.C1689082m) r2
            X.5zM r0 = r2.A0g
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x01e1
            int r1 = X.C1689082m.A00(r9, r2, r5)
            int r0 = r2.A00
            if (r1 > r0) goto L_0x01e1
            java.lang.String r1 = r8.A0S
            java.lang.String r0 = r9.A0S
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r1, r0)
            r12 = 0
            if (r0 != 0) goto L_0x0113
            r12 = 8
        L_0x0113:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0182
            int r1 = r8.A0E
            int r0 = r9.A0E
            if (r1 == r0) goto L_0x011f
            r12 = r12 | 1024(0x400, float:1.435E-42)
        L_0x011f:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0131
            int r1 = r8.A0I
            int r0 = r9.A0I
            if (r1 != r0) goto L_0x012f
            int r1 = r8.A09
            int r0 = r9.A09
            if (r1 == r0) goto L_0x0131
        L_0x012f:
            r12 = r12 | 512(0x200, float:7.175E-43)
        L_0x0131:
            X.9tt r1 = r8.A0N
            X.9tt r0 = r9.A0N
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r1, r0)
            if (r0 != 0) goto L_0x013d
            r12 = r12 | 2048(0x800, float:2.87E-42)
        L_0x013d:
            java.lang.String r10 = r5.A02
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "SM-T230"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0159
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0159
            boolean r0 = r8.A01(r9)
            if (r0 != 0) goto L_0x0159
            r12 = r12 | 2
        L_0x0159:
            if (r12 != 0) goto L_0x01dd
            boolean r0 = r8.A01(r9)
            r11 = 2
            if (r0 == 0) goto L_0x0163
        L_0x0162:
            r11 = 3
        L_0x0163:
            r12 = 0
        L_0x0164:
            X.9UQ r7 = new X.9UQ
            r7.<init>(r8, r9, r10, r11, r12)
            int r1 = r7.A01
            r0 = 2
            if (r1 == r0) goto L_0x0171
            r0 = 3
            if (r1 != r0) goto L_0x01e1
        L_0x0171:
            int r0 = r8.A07
            if (r0 != 0) goto L_0x01e1
            int r0 = r8.A08
            if (r0 != 0) goto L_0x01e1
            int r0 = r9.A07
            if (r0 != 0) goto L_0x01e1
            int r0 = r9.A08
            if (r0 != 0) goto L_0x01e1
            return
        L_0x0182:
            int r1 = r8.A05
            int r0 = r9.A05
            if (r1 == r0) goto L_0x018a
            r12 = r12 | 4096(0x1000, float:5.74E-42)
        L_0x018a:
            int r1 = r8.A0F
            int r0 = r9.A0F
            if (r1 == r0) goto L_0x0192
            r12 = r12 | 8192(0x2000, float:1.14794E-41)
        L_0x0192:
            int r1 = r8.A0B
            int r0 = r9.A0B
            if (r1 == r0) goto L_0x019a
            r12 = r12 | 16384(0x4000, float:2.2959E-41)
        L_0x019a:
            if (r12 != 0) goto L_0x01c3
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c3
            android.util.Pair r1 = X.C203599oN.A00(r8)
            android.util.Pair r0 = X.C203599oN.A00(r9)
            if (r1 == 0) goto L_0x01c3
            if (r0 == 0) goto L_0x01c3
            int r2 = X.C36381kD.A04(r1)
            int r1 = X.C36381kD.A04(r0)
            r0 = 42
            if (r2 != r0) goto L_0x01c3
            if (r1 != r0) goto L_0x01c3
            java.lang.String r10 = r5.A02
            goto L_0x0162
        L_0x01c3:
            boolean r0 = r8.A01(r9)
            if (r0 != 0) goto L_0x01cb
            r12 = r12 | 32
        L_0x01cb:
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d7
            r12 = r12 | 2
        L_0x01d7:
            if (r12 != 0) goto L_0x01dd
            java.lang.String r10 = r5.A02
            r11 = 1
            goto L_0x0163
        L_0x01dd:
            java.lang.String r10 = r5.A02
            r11 = 0
            goto L_0x0164
        L_0x01e1:
            r13.A0G = r4
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x01ea
            r13.A02 = r3
            return
        L_0x01ea:
            r13.A0L()
            r13.A0M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.A0O(X.9uY):void");
    }

    public boolean BLh() {
        if (!(this instanceof C1689082m)) {
            return this.A0N;
        }
        C1689082m r1 = (C1689082m) this;
        if (!r1.A0N) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = r1.A0F;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0M || defaultAudioSink.A0H()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BMw() {
        /*
            r5 = this;
            X.9uY r0 = r5.A08
            if (r0 != 0) goto L_0x003d
            java.lang.Integer r0 = X.C023109s.A01
        L_0x0006:
            r5.A07 = r0
        L_0x0008:
            X.9uY r0 = r5.A08
            if (r0 == 0) goto L_0x005f
            boolean r0 = r5.A0T
            if (r0 != 0) goto L_0x005f
            boolean r0 = r5.BK4()
            if (r0 == 0) goto L_0x0033
            boolean r0 = r5.A08
        L_0x0018:
            if (r0 != 0) goto L_0x0031
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x0031
            long r3 = r5.A0U
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
        L_0x0031:
            r0 = 1
            return r0
        L_0x0033:
            X.B2j r0 = r5.A06
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.BMw()
            goto L_0x0018
        L_0x003d:
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x0006
        L_0x0044:
            boolean r0 = r5.BK4()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r5.A08
        L_0x004c:
            if (r0 != 0) goto L_0x0008
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x0008
            java.lang.Integer r0 = X.C023109s.A0G
            goto L_0x0006
        L_0x0055:
            X.B2j r0 = r5.A06
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.BMw()
            goto L_0x004c
        L_0x005f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.BMw():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c1, code lost:
        if (r0.A0N != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c3, code lost:
        A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0233, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f3, code lost:
        if (r0.A01 != 2) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02f5, code lost:
        r7.clear();
        r0.A01 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02fa, code lost:
        r0.A0M = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02fe, code lost:
        if (r0.A0K != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0300, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0307, code lost:
        if (r0.A0J != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0309, code lost:
        r0.A0L = true;
        r0.A0C.Bmh(r0.A03, 0, 0, 0, 4);
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04c9, code lost:
        if (r11 != false) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0182, code lost:
        if (r0.A0J == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        if (r0.A0M != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018b, code lost:
        if (r0.A02 != 2) goto L_0x0236;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:265:0x04c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bo3(long r27, long r29) {
        /*
            r26 = this;
            r4 = r27
            r0 = r26
            boolean r1 = r0.A0N
            if (r1 == 0) goto L_0x000c
            r0.A0J()
        L_0x000b:
            return
        L_0x000c:
            X.9uY r1 = r0.A08
            r3 = 1
            r9 = -4
            r10 = -5
            if (r1 != 0) goto L_0x0026
            X.82Z r6 = r0.A0k
            r6.clear()
            X.9Bd r2 = r0.A0b
            r1 = 2
            int r1 = r0.A0A(r2, r6, r1)
            if (r1 != r10) goto L_0x002e
            X.9uY r1 = r2.A00
            r0.A0O(r1)
        L_0x0026:
            r0.A0M()
            X.B3l r1 = r0.A0C
            if (r1 == 0) goto L_0x04dd
            goto L_0x0042
        L_0x002e:
            if (r1 != r9) goto L_0x000b
            r2 = 4
            int r1 = r6.A00
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1S(r1, r2)
            X.C200319h9.A02(r1)
            r0.A0M = r3
            r0.A00()
            return
        L_0x0042:
            java.lang.String r1 = "drainAndFeed"
            X.C196289Yq.A01(r1)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0047:
            int r1 = r0.A04     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 >= 0) goto L_0x0191
            r6 = 0
            boolean r1 = r0.A0I     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x005d
            boolean r1 = r0.A0L     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x005d
            X.B3l r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x01bc }
            android.media.MediaCodec$BufferInfo r7 = r0.A0a     // Catch:{ IllegalStateException -> 0x01bc }
            int r2 = r1.B5J(r7)     // Catch:{ IllegalStateException -> 0x01bc }
            goto L_0x0065
        L_0x005d:
            X.B3l r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaCodec$BufferInfo r7 = r0.A0a     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r1.B5J(r7)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0065:
            if (r2 < 0) goto L_0x0073
            boolean r1 = r0.A0O     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0229
            r0.A0O = r6     // Catch:{ IllegalStateException -> 0x0497 }
            X.B3l r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            r1.BnR(r2, r6)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0047
        L_0x0073:
            r1 = -2
            if (r2 != r1) goto L_0x017d
            X.B3l r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaFormat r12 = r1.BEp()     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0095
            java.lang.String r1 = "width"
            int r1 = r12.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = 32
            if (r1 != r2) goto L_0x0095
            java.lang.String r1 = "height"
            int r1 = r12.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != r2) goto L_0x0095
            r0.A0O = r3     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0047
        L_0x0095:
            X.B3l r7 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r1 = r0 instanceof X.C1688982l     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x010d
            r8 = r0
            X.82l r8 = (X.C1688982l) r8     // Catch:{ IllegalStateException -> 0x0497 }
            r8.A0O = r12     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r2 = "crop-right"
            boolean r1 = r12.containsKey(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r9 = "crop-top"
            java.lang.String r11 = "crop-bottom"
            java.lang.String r13 = "crop-left"
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r12.containsKey(r13)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r12.containsKey(r11)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r12.containsKey(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x00cf
            r6 = 1
            int r2 = r12.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r12.getInteger(r13)     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 - r1
            int r1 = r2 + 1
        L_0x00cc:
            r8.A07 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x00d6
        L_0x00cf:
            java.lang.String r1 = "width"
            int r1 = r12.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x00cc
        L_0x00d6:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00e0
        L_0x00d9:
            java.lang.String r1 = "height"
            int r9 = r12.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x00eb
        L_0x00e0:
            int r2 = r12.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r12.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 - r1
            int r9 = r2 + 1
        L_0x00eb:
            r8.A06 = r9     // Catch:{ IllegalStateException -> 0x0497 }
            float r6 = r8.A02     // Catch:{ IllegalStateException -> 0x0497 }
            r8.A01 = r6     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r8.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = 90
            if (r2 == r1) goto L_0x00fb
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 != r1) goto L_0x0106
        L_0x00fb:
            int r1 = r8.A07     // Catch:{ IllegalStateException -> 0x0497 }
            r8.A07 = r9     // Catch:{ IllegalStateException -> 0x0497 }
            r8.A06 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r6
            r8.A01 = r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0106:
            int r1 = r8.A0G     // Catch:{ IllegalStateException -> 0x0497 }
            r7.Bsi(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0047
        L_0x010d:
            r7 = r0
            X.82m r7 = (X.C1689082m) r7     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaFormat r2 = r7.A07     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x0134
            java.lang.String r1 = "mime"
            java.lang.String r1 = r2.getString(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            int r13 = X.C203249nb.A00(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaFormat r1 = r7.A07     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0120:
            java.lang.String r11 = "channel-count"
            int r2 = r1.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r9 = "sample-rate"
            int r1 = r1.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r1 * r2
            r7.A03 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r1 = r7.A0A     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0159
            goto L_0x0146
        L_0x0134:
            X.9uY r6 = r7.A08     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r2 = r6.A0S     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0143
            int r13 = r6.A0B     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0144
        L_0x0143:
            r13 = 2
        L_0x0144:
            r1 = r12
            goto L_0x0120
        L_0x0146:
            r6 = 6
            if (r2 != r6) goto L_0x0159
            X.9uY r1 = r7.A08     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r1.A05     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 >= r6) goto L_0x0159
            int[] r8 = new int[r2]     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = 0
        L_0x0152:
            if (r1 >= r2) goto L_0x015a
            r8[r1] = r1     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r1 + 1
            goto L_0x0152
        L_0x0159:
            r8 = 0
        L_0x015a:
            X.9en r6 = new X.9en     // Catch:{ IllegalStateException -> 0x0497 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r1 = "audio/raw"
            r6.A0R = r1     // Catch:{ IllegalStateException -> 0x0497 }
            r6.A0A = r13     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r12.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0497 }
            r6.A04 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r12.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            r6.A0E = r1     // Catch:{ IllegalStateException -> 0x0497 }
            X.9uY r2 = new X.9uY     // Catch:{ IllegalStateException -> 0x0497 }
            r2.<init>(r6)     // Catch:{ IllegalStateException -> 0x0497 }
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r7.A0F     // Catch:{ 923 -> 0x0467 }
            r1.A0F(r2, r8)     // Catch:{ 923 -> 0x0467 }
            goto L_0x0047
        L_0x017d:
            r1 = -3
            if (r2 == r1) goto L_0x0047
            boolean r1 = r0.A0J     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0236
            boolean r1 = r0.A0M     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != 0) goto L_0x0233
            int r2 = r0.A02     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = 2
            if (r2 != r1) goto L_0x0236
            goto L_0x0233
        L_0x018f:
            r0.A0P = r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0191:
            boolean r1 = r0.A0I     // Catch:{ IllegalStateException -> 0x0497 }
            r21 = r29
            if (r1 == 0) goto L_0x01c7
            boolean r1 = r0.A0L     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x01c7
            X.B3l r11 = r0.A0C     // Catch:{ IllegalStateException -> 0x01bc }
            java.nio.ByteBuffer r9 = r0.A0F     // Catch:{ IllegalStateException -> 0x01bc }
            int r8 = r0.A04     // Catch:{ IllegalStateException -> 0x01bc }
            android.media.MediaCodec$BufferInfo r13 = r0.A0a     // Catch:{ IllegalStateException -> 0x01bc }
            int r7 = r13.flags     // Catch:{ IllegalStateException -> 0x01bc }
            long r1 = r13.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01bc }
            boolean r6 = r0.A0P     // Catch:{ IllegalStateException -> 0x01bc }
            r16 = r9
            r17 = r8
            r18 = r7
            r19 = r4
            r23 = r1
            r25 = r6
            r14 = r0
            r15 = r11
            boolean r1 = r14.A0P(r15, r16, r17, r18, r19, r21, r23, r25)     // Catch:{ IllegalStateException -> 0x01bc }
            goto L_0x01e7
        L_0x01bc:
            r0.A00()     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r1 = r0.A0N     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0236
            r0.A0L()     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0236
        L_0x01c7:
            X.B3l r11 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r9 = r0.A0F     // Catch:{ IllegalStateException -> 0x0497 }
            int r8 = r0.A04     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaCodec$BufferInfo r13 = r0.A0a     // Catch:{ IllegalStateException -> 0x0497 }
            int r7 = r13.flags     // Catch:{ IllegalStateException -> 0x0497 }
            long r1 = r13.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r6 = r0.A0P     // Catch:{ IllegalStateException -> 0x0497 }
            r16 = r9
            r17 = r8
            r18 = r7
            r19 = r4
            r23 = r1
            r25 = r6
            r14 = r0
            r15 = r11
            boolean r1 = r14.A0P(r15, r16, r17, r18, r19, r21, r23, r25)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x01e7:
            if (r1 == 0) goto L_0x0236
            long r6 = r13.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r1 = r0 instanceof X.C1688982l     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0217
            r12 = r0
            X.82l r12 = (X.C1688982l) r12     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r12.A04     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r1 - r3
            r12.A04 = r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x01f7:
            int r14 = r12.A0B     // Catch:{ IllegalStateException -> 0x0497 }
            if (r14 == 0) goto L_0x0217
            long[] r11 = r12.A0m     // Catch:{ IllegalStateException -> 0x0497 }
            r9 = 0
            r15 = r11[r9]     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r1 < 0) goto L_0x0217
            long[] r8 = r12.A0l     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = r8[r9]     // Catch:{ IllegalStateException -> 0x0497 }
            r12.A0N = r1     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r14 + -1
            r12.A0B = r1     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.System.arraycopy(r8, r3, r8, r9, r1)     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r12.A0B     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.System.arraycopy(r11, r3, r11, r9, r1)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x01f7
        L_0x0217:
            int r1 = r13.flags     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = r1 & 4
            boolean r2 = X.AnonymousClass000.A1P(r1)
            r1 = -1
            r0.A04 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = 0
            r0.A0F = r1     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x0233
            goto L_0x0047
        L_0x0229:
            int r1 = r7.size     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != 0) goto L_0x0426
            int r1 = r7.flags     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0426
        L_0x0233:
            r0.A00()     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0236:
            X.B3l r4 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            r6 = 0
            if (r4 == 0) goto L_0x0277
            int r1 = r0.A02     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = 2
            if (r1 == r2) goto L_0x0277
            boolean r1 = r0.A0M     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != 0) goto L_0x0277
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 >= 0) goto L_0x025d
            int r5 = r4.B5G()     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A03 = r5     // Catch:{ IllegalStateException -> 0x0497 }
            if (r5 < 0) goto L_0x0277
            X.82Z r4 = r0.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            X.B3l r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r1 = r1.BCk(r5)     // Catch:{ IllegalStateException -> 0x0497 }
            r4.A01 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            r4.clear()     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x025d:
            int r1 = r0.A02     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != r3) goto L_0x0280
            boolean r1 = r0.A0J     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != 0) goto L_0x0275
            r0.A0L = r3     // Catch:{ IllegalStateException -> 0x0497 }
            X.B3l r3 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            int r4 = r0.A03     // Catch:{ IllegalStateException -> 0x0497 }
            r7 = 0
            r9 = 4
            r5 = 0
            r3.Bmh(r4, r5, r6, r7, r9)     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A01()     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0275:
            r0.A02 = r2     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0277:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.A05 = r1     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x04cb
        L_0x0280:
            boolean r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x02a4
            r0.A0H = r6     // Catch:{ IllegalStateException -> 0x0497 }
            X.82Z r1 = r0.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r2 = r1.A01     // Catch:{ IllegalStateException -> 0x0497 }
            byte[] r1 = A0l     // Catch:{ IllegalStateException -> 0x0497 }
            r2.put(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            X.B3l r11 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0497 }
            r14 = 38
            r15 = 0
            r13 = 0
            r17 = 0
            r12 = r1
            r11.Bmh(r12, r13, r14, r15, r17)     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A01()     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A0K = r3     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0236
        L_0x02a4:
            boolean r1 = r0.A0T     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x02aa
            r8 = 0
            goto L_0x02e4
        L_0x02aa:
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != r3) goto L_0x02cf
            r5 = 0
        L_0x02af:
            X.9uY r1 = r0.A08     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.List r1 = r1.A0T     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r1.size()     // Catch:{ IllegalStateException -> 0x0497 }
            if (r5 >= r1) goto L_0x02cd
            X.9uY r1 = r0.A08     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.List r1 = r1.A0T     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.Object r4 = r1.get(r5)     // Catch:{ IllegalStateException -> 0x0497 }
            byte[] r4 = (byte[]) r4     // Catch:{ IllegalStateException -> 0x0497 }
            X.82Z r1 = r0.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r1 = r1.A01     // Catch:{ IllegalStateException -> 0x0497 }
            r1.put(r4)     // Catch:{ IllegalStateException -> 0x0497 }
            int r5 = r5 + 1
            goto L_0x02af
        L_0x02cd:
            r0.A01 = r2     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x02cf:
            X.82Z r7 = r0.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r1 = r7.A01     // Catch:{ IllegalStateException -> 0x0497 }
            int r8 = r1.position()     // Catch:{ IllegalStateException -> 0x0497 }
            X.9Bd r5 = r0.A0b     // Catch:{ IllegalStateException -> 0x0497 }
            int r4 = r0.A0A(r5, r7, r6)     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = -3
            if (r4 == r1) goto L_0x0277
            if (r4 != r10) goto L_0x02e4
            goto L_0x0373
        L_0x02e4:
            X.82Z r7 = r0.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            r4 = 4
            int r1 = r7.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1S(r1, r4)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x031c
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != r2) goto L_0x02fa
            r7.clear()     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A01 = r3     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x02fa:
            r0.A0M = r3     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r1 = r0.A0K     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != 0) goto L_0x0305
            r0.A00()     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0277
        L_0x0305:
            boolean r1 = r0.A0J     // Catch:{ CryptoException -> 0x0487 }
            if (r1 != 0) goto L_0x0277
            r0.A0L = r3     // Catch:{ CryptoException -> 0x0487 }
            X.B3l r1 = r0.A0C     // Catch:{ CryptoException -> 0x0487 }
            int r2 = r0.A03     // Catch:{ CryptoException -> 0x0487 }
            r5 = 0
            r7 = 4
            r3 = 0
            r4 = 0
            r1.Bmh(r2, r3, r4, r5, r7)     // Catch:{ CryptoException -> 0x0487 }
            r0.A01()     // Catch:{ CryptoException -> 0x0487 }
            goto L_0x0277
        L_0x031c:
            boolean r1 = r0.A0S     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x0335
            int r1 = r7.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = r1 & 1
            boolean r1 = X.AnonymousClass000.A1S(r1, r3)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != 0) goto L_0x0335
            r7.clear()     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != r2) goto L_0x0236
            r0.A01 = r3     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0236
        L_0x0335:
            r0.A0S = r6     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = r1 & r2
            boolean r16 = X.AnonymousClass000.A1S(r1, r2)     // Catch:{ IllegalStateException -> 0x0497 }
            X.9JW r1 = r0.A0f     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r1 = r1.A02     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 == 0) goto L_0x035d
            if (r16 == 0) goto L_0x035d
            X.9OC r1 = r7.A03     // Catch:{ IllegalStateException -> 0x0497 }
            if (r8 == 0) goto L_0x035d
            int[] r2 = r1.A06     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x0358
            int[] r2 = new int[r3]     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A06 = r2     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaCodec$CryptoInfo r1 = r1.A08     // Catch:{ IllegalStateException -> 0x0497 }
            r1.numBytesOfClearData = r2     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0358:
            r1 = r2[r6]     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r1 + r8
            r2[r6] = r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x035d:
            X.B28 r1 = r0.A0A     // Catch:{ IllegalStateException -> 0x0497 }
            r4 = 0
            if (r1 == 0) goto L_0x036e
            if (r16 == 0) goto L_0x036e
            int r2 = r1.BHt()     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == r3) goto L_0x0471
            r1 = 4
            if (r2 == r1) goto L_0x036e
            r4 = 1
        L_0x036e:
            r0.A0T = r4     // Catch:{ IllegalStateException -> 0x0497 }
            if (r4 != 0) goto L_0x0277
            goto L_0x0383
        L_0x0373:
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r1 != r2) goto L_0x037c
            r7.clear()     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A01 = r3     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x037c:
            X.9uY r1 = r5.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A0O(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0236
        L_0x0383:
            long r8 = r7.A00     // Catch:{ CryptoException -> 0x0487 }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r7.A00     // Catch:{ CryptoException -> 0x0487 }
            r1 = r1 & r2
            boolean r1 = X.AnonymousClass000.A1S(r1, r2)     // Catch:{ CryptoException -> 0x0487 }
            if (r1 == 0) goto L_0x0395
            java.util.List r1 = r0.A0h     // Catch:{ CryptoException -> 0x0487 }
            X.C165577te.A1Q(r1, r8)     // Catch:{ CryptoException -> 0x0487 }
        L_0x0395:
            long r1 = r0.A06     // Catch:{ CryptoException -> 0x0487 }
            long r1 = java.lang.Math.max(r1, r8)     // Catch:{ CryptoException -> 0x0487 }
            r0.A06 = r1     // Catch:{ CryptoException -> 0x0487 }
            java.nio.ByteBuffer r1 = r7.A01     // Catch:{ CryptoException -> 0x0487 }
            if (r1 == 0) goto L_0x03a4
            r1.flip()     // Catch:{ CryptoException -> 0x0487 }
        L_0x03a4:
            boolean r1 = r0 instanceof X.C1688982l     // Catch:{ CryptoException -> 0x0487 }
            if (r1 == 0) goto L_0x03c9
            r11 = r0
            X.82l r11 = (X.C1688982l) r11     // Catch:{ CryptoException -> 0x0487 }
            int r1 = r11.A04     // Catch:{ CryptoException -> 0x0487 }
            int r1 = r1 + 1
            r11.A04 = r1     // Catch:{ CryptoException -> 0x0487 }
            long r4 = r7.A00     // Catch:{ CryptoException -> 0x0487 }
            long r1 = r11.A0K     // Catch:{ CryptoException -> 0x0487 }
            long r1 = java.lang.Math.max(r4, r1)     // Catch:{ CryptoException -> 0x0487 }
            r11.A0K = r1     // Catch:{ CryptoException -> 0x0487 }
            int r2 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ CryptoException -> 0x0487 }
            r1 = 23
            if (r2 >= r1) goto L_0x03f0
            boolean r1 = r11.A0a     // Catch:{ CryptoException -> 0x0487 }
            if (r1 == 0) goto L_0x03f0
            r11.A0Q()     // Catch:{ CryptoException -> 0x0487 }
            goto L_0x03f0
        L_0x03c9:
            r13 = r0
            X.82m r13 = (X.C1689082m) r13     // Catch:{ CryptoException -> 0x0487 }
            boolean r1 = r13.A09     // Catch:{ CryptoException -> 0x0487 }
            if (r1 == 0) goto L_0x03f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r7.A00     // Catch:{ CryptoException -> 0x0487 }
            r1 = r1 & r2
            boolean r1 = X.AnonymousClass000.A1S(r1, r2)     // Catch:{ CryptoException -> 0x0487 }
            if (r1 != 0) goto L_0x03f0
            long r4 = r7.A00     // Catch:{ CryptoException -> 0x0487 }
            long r1 = r13.A04     // Catch:{ CryptoException -> 0x0487 }
            long r11 = r4 - r1
            long r14 = java.lang.Math.abs(r11)     // Catch:{ CryptoException -> 0x0487 }
            r11 = 500000(0x7a120, double:2.47033E-318)
            int r1 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x03ee
            r13.A04 = r4     // Catch:{ CryptoException -> 0x0487 }
        L_0x03ee:
            r13.A09 = r6     // Catch:{ CryptoException -> 0x0487 }
        L_0x03f0:
            if (r16 == 0) goto L_0x0402
            X.B3l r11 = r0.A0C     // Catch:{ CryptoException -> 0x0487 }
            int r2 = r0.A03     // Catch:{ CryptoException -> 0x0487 }
            X.9OC r1 = r7.A03     // Catch:{ CryptoException -> 0x0487 }
            r14 = 0
            r15 = 0
            r12 = r1
            r13 = r2
            r16 = r8
            r11.Bmj(r12, r13, r14, r15, r16)     // Catch:{ CryptoException -> 0x0487 }
            goto L_0x0415
        L_0x0402:
            X.B3l r4 = r0.A0C     // Catch:{ CryptoException -> 0x0487 }
            int r2 = r0.A03     // Catch:{ CryptoException -> 0x0487 }
            java.nio.ByteBuffer r1 = r7.A01     // Catch:{ CryptoException -> 0x0487 }
            int r14 = r1.limit()     // Catch:{ CryptoException -> 0x0487 }
            r13 = 0
            r17 = 0
            r11 = r4
            r12 = r2
            r15 = r8
            r11.Bmh(r12, r13, r14, r15, r17)     // Catch:{ CryptoException -> 0x0487 }
        L_0x0415:
            r0.A01()     // Catch:{ CryptoException -> 0x0487 }
            r0.A0K = r3     // Catch:{ CryptoException -> 0x0487 }
            r0.A01 = r6     // Catch:{ CryptoException -> 0x0487 }
            X.9OH r2 = r0.A09     // Catch:{ CryptoException -> 0x0487 }
            int r1 = r2.A06     // Catch:{ CryptoException -> 0x0487 }
            int r1 = r1 + 1
            r2.A06 = r1     // Catch:{ CryptoException -> 0x0487 }
            goto L_0x0236
        L_0x0426:
            r0.A04 = r2     // Catch:{ IllegalStateException -> 0x0497 }
            X.B3l r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r2 = r1.BEn(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            r0.A0F = r2     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x0441
            int r1 = r7.offset     // Catch:{ IllegalStateException -> 0x0497 }
            r2.position(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r6 = r0.A0F     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r7.offset     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r7.size     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 + r1
            r6.limit(r2)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0441:
            long r6 = r7.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.List r12 = r0.A0h     // Catch:{ IllegalStateException -> 0x0497 }
            int r11 = r12.size()     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = 0
        L_0x044a:
            if (r2 >= r11) goto L_0x0464
            java.lang.Object r1 = r12.get(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalStateException -> 0x0497 }
            long r8 = r1.longValue()     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x045e
            r12.remove(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0461
        L_0x045e:
            int r2 = r2 + 1
            goto L_0x044a
        L_0x0461:
            r1 = 1
            goto L_0x018f
        L_0x0464:
            r1 = 0
            goto L_0x018f
        L_0x0467:
            r3 = move-exception
            X.9uY r2 = r7.A08     // Catch:{ IllegalStateException -> 0x0497 }
            r1 = 5001(0x1389, float:7.008E-42)
            X.82J r1 = r7.A0B(r2, r3, r1)     // Catch:{ IllegalStateException -> 0x0497 }
            throw r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0471:
            X.8xZ r4 = r1.BBc()     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ IllegalStateException -> 0x0497 }
            X.B28 r1 = r0.A0A     // Catch:{ IllegalStateException -> 0x0497 }
            X.8xZ r3 = r1.BBc()     // Catch:{ IllegalStateException -> 0x0497 }
            X.9uY r2 = r0.A08     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r4.errorCode     // Catch:{ IllegalStateException -> 0x0497 }
            X.82J r1 = r0.A0B(r2, r3, r1)     // Catch:{ IllegalStateException -> 0x0497 }
            throw r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0487:
            r3 = move-exception
            X.9uY r2 = r0.A08     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = r3.getErrorCode()     // Catch:{ IllegalStateException -> 0x0497 }
            int r1 = com.facebook.android.exoplayer2.util.Util.A01(r1)     // Catch:{ IllegalStateException -> 0x0497 }
            X.82J r1 = r0.A0B(r2, r3, r1)     // Catch:{ IllegalStateException -> 0x0497 }
            throw r1     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0497:
            r8 = move-exception
            int r2 = r0.A0Z     // Catch:{ all -> 0x04d8 }
            r11 = 0
            if (r2 <= 0) goto L_0x04cf
            long r6 = r0.A05     // Catch:{ all -> 0x04d8 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x04b1
            long r4 = X.C36441kJ.A0A(r6)     // Catch:{ all -> 0x04d8 }
            long r2 = (long) r2     // Catch:{ all -> 0x04d8 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x04b2
        L_0x04b1:
            r11 = 1
        L_0x04b2:
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x04c9
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.String r1 = "Dequeue failed, retry"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x04d8 }
            r1 = 0
            r0.A0G = r1     // Catch:{ IllegalStateException -> 0x04c3 }
            r0.A0L()     // Catch:{ IllegalStateException -> 0x04c3 }
        L_0x04c3:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04d8 }
            r0.A05 = r1     // Catch:{ all -> 0x04d8 }
        L_0x04c9:
            if (r11 == 0) goto L_0x04cf
        L_0x04cb:
            X.C196289Yq.A00()
            goto L_0x0504
        L_0x04cf:
            X.9uY r2 = r0.A08     // Catch:{ all -> 0x04d8 }
            r1 = 4003(0xfa3, float:5.61E-42)
            X.82J r0 = r0.A0B(r2, r8, r1)     // Catch:{ all -> 0x04d8 }
            throw r0     // Catch:{ all -> 0x04d8 }
        L_0x04d8:
            r0 = move-exception
            X.C196289Yq.A00()
            throw r0
        L_0x04dd:
            X.9OH r8 = r0.A09
            int r7 = r8.A08
            X.B2j r6 = r0.A06
            java.util.Objects.requireNonNull(r6)
            long r1 = r0.A03
            long r4 = r27 - r1
            int r1 = r6.BuD(r4)
            int r7 = r7 + r1
            r8.A08 = r7
            X.82Z r4 = r0.A0k
            r4.clear()
            X.9Bd r2 = r0.A0b
            r1 = 0
            int r1 = r0.A0A(r2, r4, r1)
            if (r1 != r10) goto L_0x0509
            X.9uY r1 = r2.A00
            r0.A0O(r1)
        L_0x0504:
            X.9OH r0 = r0.A09
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x0509:
            if (r1 != r9) goto L_0x0504
            r2 = 4
            int r1 = r4.A00
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1S(r1, r2)
            X.C200319h9.A02(r1)
            r0.A0M = r3
            r0.A00()
            goto L_0x0504
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.Bo3(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0196, code lost:
        if (X.C36381kD.A04(r0) == 42) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r1 == 2) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BvJ(X.C207099uY r13) {
        /*
            r12 = this;
            X.B4Y r8 = r12.A0e     // Catch:{ 5UT -> 0x01a2 }
            r6 = r12
            boolean r0 = r12 instanceof X.C1688982l     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x0025
            X.82l r6 = (X.C1688982l) r6     // Catch:{ 5UT -> 0x01a2 }
            if (r13 == 0) goto L_0x001c
            boolean r0 = r6.A0R     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = r13.A0S     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x001c
            r0 = 20
            return r0
        L_0x001c:
            boolean r1 = r6.A0W     // Catch:{ 5UT -> 0x01a2 }
            boolean r0 = r6.A0Q     // Catch:{ 5UT -> 0x01a2 }
            int r0 = X.C1688982l.A01(r13, r8, r1, r0)     // Catch:{ 5UT -> 0x01a2 }
            return r0
        L_0x0025:
            X.82m r6 = (X.C1689082m) r6     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r3 = r13.A0S     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r1 = X.C203249nb.A05(r3)     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = "audio"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            r5 = 0
            if (r0 != 0) goto L_0x0038
            r0 = 0
            return r0
        L_0x0038:
            int r1 = r13.A06     // Catch:{ 5UT -> 0x01a2 }
            if (r1 == 0) goto L_0x0040
            r0 = 2
            r11 = 0
            if (r1 != r0) goto L_0x0041
        L_0x0040:
            r11 = 1
        L_0x0041:
            r10 = 4
            r9 = 8
            if (r11 == 0) goto L_0x0057
            int r0 = r13.A05     // Catch:{ 5UT -> 0x01a2 }
            boolean r0 = r6.A0Q(r0, r3)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x0057
            X.9l7 r0 = r8.BFF()     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x0057
            r0 = 44
            return r0
        L_0x0057:
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r3)     // Catch:{ 5UT -> 0x01a2 }
            r7 = 1
            if (r0 == 0) goto L_0x006c
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r3 = r6.A0F     // Catch:{ 5UT -> 0x01a2 }
            int r1 = r13.A05     // Catch:{ 5UT -> 0x01a2 }
            int r0 = r13.A0B     // Catch:{ 5UT -> 0x01a2 }
            boolean r0 = r3.A0I(r1, r0)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x01a0
        L_0x006c:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r6.A0F     // Catch:{ 5UT -> 0x01a2 }
            int r4 = r13.A05     // Catch:{ 5UT -> 0x01a2 }
            r0 = 2
            boolean r0 = r1.A0I(r4, r0)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x01a0
            java.util.List r1 = r6.A0I(r13, r8, r5)     // Catch:{ 5UT -> 0x01a2 }
            boolean r0 = r1.isEmpty()     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x0084
            r0 = 129(0x81, float:1.81E-43)
            return r0
        L_0x0084:
            if (r11 != 0) goto L_0x0089
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L_0x0089:
            java.lang.Object r3 = r1.get(r5)     // Catch:{ 5UT -> 0x01a2 }
            X.9l7 r3 = (X.C202149l7) r3     // Catch:{ 5UT -> 0x01a2 }
            int r5 = r13.A0F     // Catch:{ 5UT -> 0x01a2 }
            r1 = -1
            if (r5 == r1) goto L_0x00b9
            android.media.MediaCodecInfo$CodecCapabilities r0 = r3.A00     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "sampleRate.caps"
        L_0x009a:
            X.C202149l7.A01(r3, r0)     // Catch:{ 5UT -> 0x01a2 }
            goto L_0x019b
        L_0x009f:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "sampleRate.aCaps"
            goto L_0x009a
        L_0x00a8:
            boolean r0 = r0.isSampleRateSupported(r5)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00b9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = "sampleRate.support, "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ 5UT -> 0x01a2 }
            goto L_0x009a
        L_0x00b9:
            if (r4 == r1) goto L_0x0181
            android.media.MediaCodecInfo$CodecCapabilities r0 = r3.A00     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "channelCount.caps"
            goto L_0x009a
        L_0x00c2:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "channelCount.aCaps"
            goto L_0x009a
        L_0x00cb:
            java.lang.String r6 = r3.A02     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r1 = r3.A01     // Catch:{ 5UT -> 0x01a2 }
            int r5 = r0.getMaxInputChannelCount()     // Catch:{ 5UT -> 0x01a2 }
            if (r5 > r7) goto L_0x00dd
            int r7 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 5UT -> 0x01a2 }
            r0 = 26
            if (r7 < r0) goto L_0x00e1
            if (r5 <= 0) goto L_0x00e1
        L_0x00dd:
            if (r5 >= r4) goto L_0x0181
            goto L_0x0175
        L_0x00e1:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r2.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x0141
            r2 = 6
            goto L_0x014d
        L_0x0141:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x01a2 }
            r2 = 30
            if (r0 == 0) goto L_0x014d
            r2 = 16
        L_0x014d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r1.append(r0)     // Catch:{ 5UT -> 0x01a2 }
            r1.append(r6)     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = ", ["
            r1.append(r0)     // Catch:{ 5UT -> 0x01a2 }
            r1.append(r5)     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ 5UT -> 0x01a2 }
            r1.append(r2)     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r1 = X.C90474aD.A0g(r1)     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = "MediaCodecInfo"
            android.util.Log.w(r0, r1)     // Catch:{ 5UT -> 0x01a2 }
            r5 = r2
            goto L_0x00dd
        L_0x0175:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5UT -> 0x01a2 }
            java.lang.String r0 = "channelCount.support, "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ 5UT -> 0x01a2 }
            goto L_0x009a
        L_0x0181:
            boolean r0 = r3.A05     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x018a
            boolean r0 = r3.A03     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x019c
            goto L_0x0198
        L_0x018a:
            android.util.Pair r0 = X.C203599oN.A00(r13)     // Catch:{ 5UT -> 0x01a2 }
            if (r0 == 0) goto L_0x019c
            int r1 = X.C36381kD.A04(r0)     // Catch:{ 5UT -> 0x01a2 }
            r0 = 42
            if (r1 != r0) goto L_0x019c
        L_0x0198:
            r9 = 16
            goto L_0x019c
        L_0x019b:
            r10 = 3
        L_0x019c:
            r0 = r9 | 32
            r0 = r0 | r10
            return r0
        L_0x01a0:
            r0 = 1
            return r0
        L_0x01a2:
            r1 = move-exception
            r0 = 4002(0xfa2, float:5.608E-42)
            X.82J r0 = r12.A0B(r13, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.BvJ(X.9uY):int");
    }

    public AnonymousClass82E(C200129gf r5, B4Y b4y, AnonymousClass9JW r7, C125125zM r8, int i, int i2, int i3, boolean z) {
        super(i);
        Objects.requireNonNull(r8);
        this.A0g = r8;
        Objects.requireNonNull(r7);
        this.A0f = r7;
        Objects.requireNonNull(b4y);
        this.A0e = b4y;
        this.A0d = r5;
        this.A0i = z;
        this.A0j = i2;
        this.A0Z = i3;
        this.A0c = new AnonymousClass82Z(0);
        this.A0k = new AnonymousClass82Z(0);
        this.A0b = new C190989Bd();
        this.A0h = AnonymousClass001.A0I();
        this.A0a = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
        this.A06 = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r1.A0M) < 500) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K() {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0U = r0
            r7.A01()
            r0 = -1
            r7.A04 = r0
            r0 = 0
            r7.A0F = r0
            r5 = 1
            r7.A0S = r5
            r6 = 0
            r7.A0T = r6
            r7.A0P = r6
            java.util.List r0 = r7.A0h
            r0.clear()
            r7.A0H = r6
            r7.A0O = r6
            boolean r0 = r7.A0X
            if (r0 == 0) goto L_0x0029
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x0057
        L_0x0029:
            r1 = r7
            boolean r0 = r7 instanceof X.C1688982l
            if (r0 == 0) goto L_0x0041
            X.82l r1 = (X.C1688982l) r1
            boolean r0 = r1.A0U
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0M
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
        L_0x0041:
            int r0 = r7.A02
            if (r0 != 0) goto L_0x0057
            X.B3l r0 = r7.A0C
            r0.flush()
            r7.A0K = r6
        L_0x004c:
            boolean r0 = r7.A0Y
            if (r0 == 0) goto L_0x0056
            X.9uY r0 = r7.A08
            if (r0 == 0) goto L_0x0056
            r7.A01 = r5
        L_0x0056:
            return
        L_0x0057:
            r7.A0L()
            r7.A0M()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82E.A0K():void");
    }

    public void A0L() {
        boolean z;
        this.A0U = -9223372036854775807L;
        this.A0V = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        A01();
        this.A04 = -1;
        this.A0F = null;
        this.A0T = false;
        this.A0P = false;
        this.A0h.clear();
        this.A0D = null;
        this.A0Y = false;
        this.A0K = false;
        this.A00 = 0;
        this.A0J = false;
        this.A0X = false;
        this.A0H = false;
        this.A0O = false;
        this.A0L = false;
        this.A01 = 0;
        this.A02 = 0;
        C23079B3l b3l = this.A0C;
        if (b3l != null) {
            this.A09.A02++;
            try {
                AnonymousClass6V0 r4 = AnonymousClass6V0.A04;
                if (this instanceof C1688982l) {
                    z = true;
                } else {
                    z = false;
                }
                r4.A03(b3l, this.A0g, C023109s.A01, this.A0W, z);
                this.A0C = null;
                B28 b28 = this.A0A;
                if (b28 != null && this.A0B != b28) {
                    try {
                        this.A0d.A03(b28);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                this.A0C = null;
                B28 b282 = this.A0A;
                if (!(b282 == null || this.A0B == b282)) {
                    this.A0d.A03(b282);
                }
                throw th;
            } finally {
                this.A0A = null;
                this.A0W = null;
            }
        }
    }
}
