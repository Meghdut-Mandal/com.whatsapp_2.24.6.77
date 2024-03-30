package com.facebook.android.exoplayer2.audio;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass82Q;
import X.AnonymousClass82T;
import X.AnonymousClass82U;
import X.AnonymousClass82V;
import X.AnonymousClass9L7;
import X.AnonymousClass9L8;
import X.AnonymousClass9QF;
import X.AnonymousClass9T5;
import X.AnonymousClass9U2;
import X.B0W;
import X.B40;
import X.C165597tg;
import X.C1889991q;
import X.C1890091r;
import X.C191009Bf;
import X.C192889Iy;
import X.C198059cq;
import X.C199139el;
import X.C199339f9;
import X.C199379fD;
import X.C199519fS;
import X.C199669fk;
import X.C200319h9;
import X.C200929iU;
import X.C207099uY;
import X.C208979zG;
import X.C208989zH;
import X.C21839AbH;
import X.C23088B3y;
import X.C23092B4c;
import X.C36331k8;
import X.C36361kB;
import X.C36411kG;
import X.C90484aE;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.common.base.Strings;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class DefaultAudioSink {
    public static AtomicInteger A0h = C90484aE.A0v();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public AudioTrack A0B;
    public C199519fS A0C;
    public C199379fD A0D;
    public B0W A0E;
    public AnonymousClass9T5 A0F;
    public C200929iU A0G;
    public AnonymousClass9L8 A0H;
    public AnonymousClass9L8 A0I;
    public ByteBuffer A0J;
    public ByteBuffer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public C23092B4c[] A0R;
    public ByteBuffer[] A0S;
    public C200929iU A0T;
    public AnonymousClass9U2 A0U;
    public final C199669fk A0V;
    public final C199139el A0W = new C199139el(new C191009Bf(this));
    public final AnonymousClass82T A0X;
    public final C23088B3y A0Y;
    public final AnonymousClass9L7 A0Z;
    public final AnonymousClass9QF A0a;
    public final AnonymousClass9QF A0b;
    public final AnonymousClass82U A0c;
    public final C199339f9 A0d;
    public final ArrayDeque A0e;
    public final C23092B4c[] A0f;
    public final C23092B4c[] A0g;

    public static int A00(long j) {
        int i = (int) j;
        if (AnonymousClass000.A1Q((((long) i) > j ? 1 : (((long) i) == j ? 0 : -1)))) {
            return i;
        }
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1M(A0L2, 0, j);
        throw AnonymousClass001.A08(Strings.A00("Out of range: %s", A0L2));
    }

    public void A0C() {
        this.A0N = false;
        if (this.A0B != null) {
            C199139el r6 = this.A0W;
            r6.A0D = 0;
            r6.A03 = 0;
            r6.A01 = 0;
            r6.A08 = 0;
            if (r6.A0F == -9223372036854775807L) {
                C198059cq r0 = r6.A0H;
                Objects.requireNonNull(r0);
                C198059cq.A00(r0, 0);
                this.A0B.pause();
            }
        }
    }

    public void A0D() {
        this.A0N = true;
        if (this.A0B != null) {
            C198059cq r1 = this.A0W.A0H;
            Objects.requireNonNull(r1);
            C198059cq.A00(r1, 0);
            this.A0B.play();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0372, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x041c, code lost:
        if (r7 == 11) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0423, code lost:
        if (r7 != 11) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0428, code lost:
        if (r7 != 8) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r10 == r1) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(java.nio.ByteBuffer r30, long r31) {
        /*
            r29 = this;
            r11 = 1
            r9 = r29
            java.nio.ByteBuffer r1 = r9.A0J
            r17 = 0
            r10 = r30
            if (r1 == 0) goto L_0x000e
            r0 = 0
            if (r10 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C200319h9.A01(r0)
            X.9iU r0 = r9.A0T
            r18 = 0
            r2 = r31
            if (r0 == 0) goto L_0x0074
            boolean r0 = r9.A09()
            if (r0 == 0) goto L_0x04f2
            X.9iU r4 = r9.A0T
            X.9iU r5 = r9.A0G
            int r1 = r5.A04
            int r0 = r4.A04
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A03
            int r0 = r4.A03
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A06
            int r0 = r4.A06
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A05
            int r0 = r4.A05
            if (r1 != r0) goto L_0x0079
            r9.A0G = r4
            r0 = r18
            r9.A0T = r0
            android.media.AudioTrack r4 = r9.A0B
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x0071
            boolean r0 = r4.isOffloadedPlayback()
            if (r0 == 0) goto L_0x0071
            r1 = 3
            android.media.AudioTrack r0 = r9.A0B
            int r0 = r0.getPlayState()
            if (r0 != r1) goto L_0x0064
            android.media.AudioTrack r0 = r9.A0B
            r0.setOffloadEndOfStream()
        L_0x0064:
            android.media.AudioTrack r4 = r9.A0B
            X.9iU r0 = r9.A0G
            X.9uY r0 = r0.A07
            int r1 = r0.A07
            int r0 = r0.A08
            r4.setOffloadDelayPadding(r1, r0)
        L_0x0071:
            r9.A05(r2)
        L_0x0074:
            android.media.AudioTrack r0 = r9.A0B
            if (r0 != 0) goto L_0x0180
            goto L_0x0086
        L_0x0079:
            r9.A04()
            boolean r0 = r9.A0H()
            if (r0 != 0) goto L_0x04f2
            r9.A0B()
            goto L_0x0071
        L_0x0086:
            X.9f9 r1 = r9.A0d     // Catch:{ 91q -> 0x0174 }
            monitor-enter(r1)     // Catch:{ 91q -> 0x0174 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0171 }
            monitor-exit(r1)     // Catch:{ 91q -> 0x0174 }
            if (r0 == 0) goto L_0x04f2
            boolean r0 = r9.A0L     // Catch:{ 91q -> 0x0174 }
            if (r0 == 0) goto L_0x00dc
            X.9iU r0 = r9.A0G     // Catch:{ 91q -> 0x009c }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 91q -> 0x009c }
            android.media.AudioTrack r1 = r9.A02(r0)     // Catch:{ 91q -> 0x009c }
            goto L_0x00e2
        L_0x009c:
            r13 = move-exception
            X.9iU r0 = r9.A0G     // Catch:{ 91q -> 0x0174 }
            int r4 = r0.A00     // Catch:{ 91q -> 0x0174 }
            r1 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 <= r1) goto L_0x00db
            X.9uY r14 = r0.A07     // Catch:{ 91q -> 0x0174 }
            int r12 = r0.A01     // Catch:{ 91q -> 0x0174 }
            int r8 = r0.A04     // Catch:{ 91q -> 0x0174 }
            int r7 = r0.A05     // Catch:{ 91q -> 0x0174 }
            int r6 = r0.A06     // Catch:{ 91q -> 0x0174 }
            int r5 = r0.A02     // Catch:{ 91q -> 0x0174 }
            int r4 = r0.A03     // Catch:{ 91q -> 0x0174 }
            X.B4c[] r1 = r0.A08     // Catch:{ 91q -> 0x0174 }
            X.9iU r0 = new X.9iU     // Catch:{ 91q -> 0x0174 }
            r28 = 1000000(0xf4240, float:1.401298E-39)
            r19 = r0
            r20 = r14
            r21 = r1
            r22 = r12
            r23 = r8
            r24 = r7
            r25 = r6
            r26 = r5
            r27 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 91q -> 0x0174 }
            android.media.AudioTrack r1 = r9.A02(r0)     // Catch:{ 91q -> 0x00d7 }
            r9.A0G = r0     // Catch:{ 91q -> 0x00d7 }
            goto L_0x00e2
        L_0x00d7:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch:{ 91q -> 0x0174 }
        L_0x00db:
            throw r13     // Catch:{ 91q -> 0x0174 }
        L_0x00dc:
            X.9iU r0 = r9.A0G     // Catch:{ 91q -> 0x0174 }
            android.media.AudioTrack r1 = r9.A02(r0)     // Catch:{ 91q -> 0x0174 }
        L_0x00e2:
            r9.A0B = r1     // Catch:{ 91q -> 0x0174 }
            int r7 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 91q -> 0x0174 }
            r0 = 29
            if (r7 < r0) goto L_0x0102
            boolean r0 = r1.isOffloadedPlayback()     // Catch:{ 91q -> 0x0174 }
            if (r0 == 0) goto L_0x0102
            android.media.AudioTrack r0 = r9.A0B     // Catch:{ 91q -> 0x0174 }
            r9.A07(r0)     // Catch:{ 91q -> 0x0174 }
            android.media.AudioTrack r4 = r9.A0B     // Catch:{ 91q -> 0x0174 }
            X.9iU r0 = r9.A0G     // Catch:{ 91q -> 0x0174 }
            X.9uY r0 = r0.A07     // Catch:{ 91q -> 0x0174 }
            int r1 = r0.A07     // Catch:{ 91q -> 0x0174 }
            int r0 = r0.A08     // Catch:{ 91q -> 0x0174 }
            r4.setOffloadDelayPadding(r1, r0)     // Catch:{ 91q -> 0x0174 }
        L_0x0102:
            android.media.AudioTrack r0 = r9.A0B     // Catch:{ 91q -> 0x0174 }
            int r0 = r0.getAudioSessionId()     // Catch:{ 91q -> 0x0174 }
            r9.A01 = r0     // Catch:{ 91q -> 0x0174 }
            X.9el r8 = r9.A0W     // Catch:{ 91q -> 0x0174 }
            android.media.AudioTrack r6 = r9.A0B     // Catch:{ 91q -> 0x0174 }
            X.9iU r0 = r9.A0G     // Catch:{ 91q -> 0x0174 }
            int r5 = r0.A03     // Catch:{ 91q -> 0x0174 }
            int r4 = r0.A05     // Catch:{ 91q -> 0x0174 }
            int r1 = r0.A00     // Catch:{ 91q -> 0x0174 }
            r8.A0G = r6     // Catch:{ 91q -> 0x0174 }
            r8.A00 = r1     // Catch:{ 91q -> 0x0174 }
            X.9cq r0 = new X.9cq     // Catch:{ 91q -> 0x0174 }
            r0.<init>(r6)     // Catch:{ 91q -> 0x0174 }
            r8.A0H = r0     // Catch:{ 91q -> 0x0174 }
            int r12 = r6.getSampleRate()     // Catch:{ 91q -> 0x0174 }
            r8.A02 = r12     // Catch:{ 91q -> 0x0174 }
            r0 = 23
            if (r7 >= r0) goto L_0x0133
            r0 = 5
            if (r5 == r0) goto L_0x0131
            r0 = 6
            if (r5 != r0) goto L_0x0133
        L_0x0131:
            r0 = 1
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            r8.A0L = r0     // Catch:{ 91q -> 0x0174 }
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r5)     // Catch:{ 91q -> 0x0174 }
            r8.A0K = r0     // Catch:{ 91q -> 0x0174 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0144
            goto L_0x014a
        L_0x0144:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0152
        L_0x014a:
            int r1 = r1 / r4
            long r4 = (long) r1     // Catch:{ 91q -> 0x0174 }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            long r0 = (long) r12     // Catch:{ 91q -> 0x0174 }
            long r4 = r4 / r0
        L_0x0152:
            r8.A04 = r4     // Catch:{ 91q -> 0x0174 }
            r0 = 0
            r8.A09 = r0     // Catch:{ 91q -> 0x0174 }
            r8.A0C = r0     // Catch:{ 91q -> 0x0174 }
            r8.A0B = r0     // Catch:{ 91q -> 0x0174 }
            r4 = 0
            r8.A0J = r4     // Catch:{ 91q -> 0x0174 }
            r8.A0F = r6     // Catch:{ 91q -> 0x0174 }
            r8.A06 = r6     // Catch:{ 91q -> 0x0174 }
            r8.A0A = r0     // Catch:{ 91q -> 0x0174 }
            android.media.AudioTrack r1 = r9.A0B     // Catch:{ 91q -> 0x0174 }
            if (r1 == 0) goto L_0x016e
            float r0 = r9.A00     // Catch:{ 91q -> 0x0174 }
            r1.setVolume(r0)     // Catch:{ 91q -> 0x0174 }
        L_0x016e:
            r9.A0O = r11     // Catch:{ 91q -> 0x0174 }
            goto L_0x0180
        L_0x0171:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ 91q -> 0x0174 }
            throw r0     // Catch:{ 91q -> 0x0174 }
        L_0x0174:
            r1 = move-exception
            boolean r0 = r1.isRecoverable
            if (r0 != 0) goto L_0x017f
            X.9QF r0 = r9.A0a
            r0.A00(r1)
            return r17
        L_0x017f:
            throw r1
        L_0x0180:
            X.9QF r1 = r9.A0a
            r0 = r18
            r1.A00 = r0
            boolean r0 = r9.A0O
            r4 = 0
            if (r0 == 0) goto L_0x01a1
            long r0 = java.lang.Math.max(r4, r2)
            r9.A06 = r0
            r0 = 0
            r9.A0P = r0
            r9.A0O = r0
            r9.A05(r2)
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x01a1
            r9.A0D()
        L_0x01a1:
            X.9el r8 = r9.A0W
            long r0 = A01(r9)
            android.media.AudioTrack r6 = r8.A0G
            java.util.Objects.requireNonNull(r6)
            int r7 = r6.getPlayState()
            boolean r6 = r8.A0L
            if (r6 == 0) goto L_0x01c6
            r6 = 2
            if (r7 != r6) goto L_0x01bb
            r0 = 0
            r8.A0J = r0
            return r17
        L_0x01bb:
            if (r7 != r11) goto L_0x01c6
            long r12 = X.C199139el.A00(r8)
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x01c6
            return r17
        L_0x01c6:
            boolean r6 = r8.A0J
            boolean r0 = r8.A01(r0)
            r8.A0J = r0
            if (r6 == 0) goto L_0x01f5
            if (r0 != 0) goto L_0x01f5
            if (r7 == r11) goto L_0x01f5
            X.9Bf r12 = r8.A0M
            int r6 = r8.A00
            long r0 = r8.A04
            java.util.UUID r7 = X.AnonymousClass9B7.A04
            long r21 = com.facebook.android.exoplayer2.util.Util.A05(r0)
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r12.A00
            X.B0W r7 = r0.A0E
            if (r7 == 0) goto L_0x01f5
            long r23 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.A05
            long r23 = r23 - r0
            r19 = r7
            r20 = r6
            r19.Bjp(r20, r21, r23)
        L_0x01f5:
            java.nio.ByteBuffer r0 = r9.A0J
            if (r0 != 0) goto L_0x04a6
            java.nio.ByteOrder r1 = r10.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r0 = X.C36361kB.A1a(r1, r0)
            X.C200319h9.A01(r0)
            boolean r0 = r10.hasRemaining()
            if (r0 == 0) goto L_0x04f1
            X.9iU r1 = r9.A0G
            int r0 = r1.A04
            if (r0 == 0) goto L_0x042d
            int r0 = r9.A03
            if (r0 != 0) goto L_0x042d
            int r6 = r1.A03
            r13 = -1
            switch(r6) {
                case 5: goto L_0x027b;
                case 6: goto L_0x027b;
                case 7: goto L_0x02b7;
                case 8: goto L_0x02b7;
                case 9: goto L_0x0227;
                case 10: goto L_0x0310;
                case 11: goto L_0x0314;
                case 12: goto L_0x0314;
                case 13: goto L_0x021c;
                case 14: goto L_0x0318;
                case 15: goto L_0x0375;
                case 16: goto L_0x0310;
                case 17: goto L_0x0379;
                case 18: goto L_0x027b;
                default: goto L_0x021c;
            }
        L_0x021c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r6)
            throw r0
        L_0x0227:
            int r0 = r10.position()
            int r14 = r10.getInt(r0)
            java.nio.ByteOrder r1 = r10.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x023b
            int r14 = java.lang.Integer.reverseBytes(r14)
        L_0x023b:
            r1 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r14 & r1
            if (r0 != r1) goto L_0x0276
            int r0 = r14 >>> 19
            r12 = 3
            r13 = r0 & 3
            if (r13 == r11) goto L_0x0276
            int r0 = r14 >>> 17
            r7 = r0 & 3
            if (r7 == 0) goto L_0x0276
            int r0 = r14 >>> 12
            r6 = 15
            r1 = r0 & 15
            int r0 = r14 >>> 10
            r0 = r0 & 3
            if (r1 == 0) goto L_0x0276
            if (r1 == r6) goto L_0x0276
            if (r0 == r12) goto L_0x0276
            r15 = 1152(0x480, float:1.614E-42)
            if (r7 == r11) goto L_0x0270
            r0 = 2
            if (r7 == r0) goto L_0x03fb
            if (r7 != r12) goto L_0x026b
            r15 = 384(0x180, float:5.38E-43)
            goto L_0x03fb
        L_0x026b:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x0270:
            if (r13 == r12) goto L_0x03fb
            r15 = 576(0x240, float:8.07E-43)
            goto L_0x03fb
        L_0x0276:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x027b:
            int r0 = r10.position()
            int r0 = r0 + 5
            byte r0 = r10.get(r0)
            r6 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 3
            int r6 = r6 >> r1
            r0 = 10
            if (r6 <= r0) goto L_0x02b3
            int r0 = r10.position()
            int r0 = r0 + 4
            byte r0 = r10.get(r0)
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            if (r0 == r1) goto L_0x02ab
            int r0 = r10.position()
            int r0 = r0 + 4
            byte r0 = r10.get(r0)
            r0 = r0 & 48
            int r1 = r0 >> 4
        L_0x02ab:
            int[] r0 = X.AnonymousClass9Ap.A00
            r0 = r0[r1]
            int r15 = r0 * 256
            goto L_0x03fb
        L_0x02b3:
            r15 = 1536(0x600, float:2.152E-42)
            goto L_0x03fb
        L_0x02b7:
            int r1 = r10.position()
            byte r6 = r10.get(r1)
            r0 = -2
            if (r6 == r0) goto L_0x0303
            if (r6 == r13) goto L_0x02f0
            r0 = 31
            if (r6 == r0) goto L_0x02e3
            int r0 = r1 + 4
            byte r0 = r10.get(r0)
            r0 = r0 & 1
            int r6 = r0 << 6
            int r0 = r1 + 5
        L_0x02d4:
            byte r0 = r10.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
        L_0x02da:
            int r0 = r0 >> 2
            r0 = r0 | r6
            int r0 = r0 + 1
            int r15 = r0 * 32
            goto L_0x03fb
        L_0x02e3:
            int r0 = r1 + 5
            byte r0 = r10.get(r0)
            r0 = r0 & 7
            int r6 = r0 << 4
            int r0 = r1 + 6
            goto L_0x02fc
        L_0x02f0:
            int r0 = r1 + 4
            byte r0 = r10.get(r0)
            r0 = r0 & 7
            int r6 = r0 << 4
            int r0 = r1 + 7
        L_0x02fc:
            byte r0 = r10.get(r0)
            r0 = r0 & 60
            goto L_0x02da
        L_0x0303:
            int r0 = r1 + 5
            byte r0 = r10.get(r0)
            r0 = r0 & 1
            int r6 = r0 << 6
            int r0 = r1 + 4
            goto L_0x02d4
        L_0x0310:
            r15 = 1024(0x400, float:1.435E-42)
            goto L_0x03fb
        L_0x0314:
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x03fb
        L_0x0318:
            int r14 = r10.position()
            int r0 = r10.limit()
            int r7 = r0 + -10
            r12 = r14
        L_0x0323:
            if (r12 > r7) goto L_0x0372
            int r0 = r12 + 4
            int r6 = r10.getInt(r0)
            java.nio.ByteOrder r1 = r10.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x0337
            int r6 = java.lang.Integer.reverseBytes(r6)
        L_0x0337:
            r1 = r6 & -2
            r0 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r1 != r0) goto L_0x036f
            int r12 = r12 - r14
            if (r12 == r13) goto L_0x0372
            int r0 = r10.position()
            int r0 = r0 + r12
            int r0 = r0 + 7
            byte r0 = r10.get(r0)
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 187(0xbb, float:2.62E-43)
            boolean r7 = X.AnonymousClass000.A1S(r1, r0)
            r6 = 40
            int r1 = r10.position()
            int r1 = r1 + r12
            r0 = 8
            if (r7 == 0) goto L_0x0361
            r0 = 9
        L_0x0361:
            int r1 = r1 + r0
            byte r0 = r10.get(r1)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r6 = r6 << r0
            int r15 = r6 * 16
            goto L_0x03fb
        L_0x036f:
            int r12 = r12 + 1
            goto L_0x0323
        L_0x0372:
            r15 = 0
            goto L_0x03fb
        L_0x0375:
            r15 = 512(0x200, float:7.175E-43)
            goto L_0x03fb
        L_0x0379:
            r0 = 16
            byte[] r1 = new byte[r0]
            int r0 = r10.position()
            r10.get(r1)
            r10.position(r0)
            X.9jM r15 = new X.9jM
            r15.<init>(r1)
            r0 = 16
            r15.A01(r0)
            int r1 = r15.A01(r0)
            r14 = 4
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x03a0
            r0 = 24
            r15.A01(r0)
        L_0x03a0:
            r13 = 2
            int r0 = r15.A01(r13)
            r12 = 3
            if (r0 != r12) goto L_0x03b1
        L_0x03a8:
            r15.A01(r13)
            boolean r0 = r15.A02()
            if (r0 != 0) goto L_0x03a8
        L_0x03b1:
            r0 = 10
            int r16 = r15.A01(r0)
            boolean r0 = r15.A02()
            if (r0 == 0) goto L_0x03db
            int r0 = r15.A01(r12)
            if (r0 <= 0) goto L_0x03db
            int r6 = r15.A02
            r15.A02 = r6
            int r0 = r15.A00
            int r1 = r0 + 2
            r15.A00 = r1
            r0 = 7
            if (r1 <= r0) goto L_0x03d8
            int r0 = r6 + 1
            r15.A02 = r0
            int r0 = r1 + -8
            r15.A00 = r0
        L_0x03d8:
            X.C201339jM.A00(r15)
        L_0x03db:
            boolean r7 = r15.A02()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r1 = 44100(0xac44, float:6.1797E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r7 == 0) goto L_0x03ed
            r0 = 48000(0xbb80, float:6.7262E-41)
        L_0x03ed:
            int r7 = r15.A01(r14)
            if (r0 != r1) goto L_0x0400
            r0 = 13
            if (r7 != r0) goto L_0x042b
            int[] r0 = X.C196419Zo.A00
            r15 = r0[r7]
        L_0x03fb:
            r9.A03 = r15
            if (r15 != 0) goto L_0x042d
            return r11
        L_0x0400:
            if (r0 != r6) goto L_0x042b
            int[] r1 = X.C196419Zo.A00
            r0 = 14
            if (r7 >= r0) goto L_0x042b
            r15 = r1[r7]
            int r6 = r16 % 5
            r1 = 8
            if (r6 == r11) goto L_0x0426
            r0 = 11
            if (r6 == r13) goto L_0x0421
            if (r6 == r12) goto L_0x0426
            if (r6 != r14) goto L_0x03fb
            if (r7 == r12) goto L_0x041e
            if (r7 == r1) goto L_0x041e
            if (r7 != r0) goto L_0x03fb
        L_0x041e:
            int r15 = r15 + 1
            goto L_0x03fb
        L_0x0421:
            if (r7 == r1) goto L_0x041e
            if (r7 != r0) goto L_0x03fb
            goto L_0x041e
        L_0x0426:
            if (r7 == r12) goto L_0x041e
            if (r7 != r1) goto L_0x03fb
            goto L_0x041e
        L_0x042b:
            r15 = 0
            goto L_0x03fb
        L_0x042d:
            X.9L8 r0 = r9.A0H
            if (r0 == 0) goto L_0x043e
            boolean r0 = r9.A09()
            if (r0 == 0) goto L_0x04f2
            r9.A05(r2)
            r0 = r18
            r9.A0H = r0
        L_0x043e:
            long r6 = r9.A06
            X.9iU r14 = r9.A0G
            int r0 = r14.A04
            if (r0 != 0) goto L_0x04c4
            long r0 = r9.A08
            int r12 = r14.A01
            long r12 = (long) r12
            long r0 = r0 / r12
        L_0x044c:
            X.82U r12 = r9.A0c
            long r12 = r12.A04
            long r0 = r0 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r12
            X.9uY r12 = r14.A07
            int r12 = r12.A0F
            long r12 = (long) r12
            long r0 = r0 / r12
            long r6 = r6 + r0
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x0474
            long r0 = r6 - r31
            long r14 = java.lang.Math.abs(r0)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0492
            X.91n r0 = new X.91n
            r0.<init>(r2, r6)
            r9.A0P = r11
        L_0x0474:
            boolean r0 = r9.A09()
            if (r0 == 0) goto L_0x04f2
            long r12 = r31 - r6
            long r0 = r9.A06
            long r0 = r0 + r12
            r9.A06 = r0
            r0 = 0
            r9.A0P = r0
            r9.A05(r2)
            X.B0W r1 = r9.A0E
            if (r1 == 0) goto L_0x0492
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0492
            r1.Bcx()
        L_0x0492:
            X.9iU r0 = r9.A0G
            int r0 = r0.A04
            if (r0 != 0) goto L_0x04b9
            long r4 = r9.A08
            int r0 = r10.remaining()
            long r0 = (long) r0
            long r4 = r4 + r0
            r9.A08 = r4
        L_0x04a2:
            r9.A0J = r10
            r9.A04 = r11
        L_0x04a6:
            r9.A06(r2)
            java.nio.ByteBuffer r0 = r9.A0J
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x04c7
            r0 = r18
            r9.A0J = r0
            r0 = 0
            r9.A04 = r0
            return r11
        L_0x04b9:
            long r4 = r9.A07
            int r0 = r9.A03
            long r0 = (long) r0
            long r6 = (long) r11
            long r0 = r0 * r6
            long r4 = r4 + r0
            r9.A07 = r4
            goto L_0x04a2
        L_0x04c4:
            long r0 = r9.A07
            goto L_0x044c
        L_0x04c7:
            long r3 = A01(r9)
            long r5 = r8.A06
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x04f2
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f2
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04f2
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r0 = "Resetting stalled audio track"
            android.util.Log.w(r1, r0)
            r9.A0B()
        L_0x04f1:
            return r11
        L_0x04f2:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0J(java.nio.ByteBuffer, long):boolean");
    }

    @Deprecated
    public DefaultAudioSink(C23092B4c[] b4cArr) {
        C192889Iy r2 = new C192889Iy();
        C199669fk r1 = C199669fk.A01;
        Objects.requireNonNull(r1, "Both parameters are null");
        Objects.requireNonNull(r1);
        r2.A00 = r1;
        Objects.requireNonNull(b4cArr);
        AnonymousClass9L7 r6 = new AnonymousClass9L7(b4cArr);
        Objects.requireNonNull(r6);
        r2.A02 = r6;
        this.A0V = r2.A00;
        this.A0Z = r6;
        this.A0Y = r2.A01;
        C199339f9 r0 = new C199339f9(B40.A00);
        this.A0d = r0;
        r0.A01();
        AnonymousClass82T r4 = new AnonymousClass82T();
        this.A0X = r4;
        AnonymousClass82U r3 = new AnonymousClass82U();
        this.A0c = r3;
        ArrayList A0I2 = AnonymousClass001.A0I();
        C208989zH[] r12 = new C208989zH[3];
        r12[0] = new AnonymousClass82Q();
        C36411kG.A1Q(r4, r3, r12, 1);
        Collections.addAll(A0I2, r12);
        Collections.addAll(A0I2, r6.A03);
        this.A0g = (C23092B4c[]) A0I2.toArray(new C23092B4c[0]);
        this.A0f = new C23092B4c[]{new AnonymousClass82V()};
        this.A00 = 1.0f;
        this.A0D = C199379fD.A03;
        this.A01 = 0;
        this.A0F = new AnonymousClass9T5();
        C199519fS r22 = C199519fS.A05;
        this.A0I = new AnonymousClass9L8(r22, 0, 0, false);
        this.A0C = r22;
        this.A02 = -1;
        this.A0R = new C23092B4c[0];
        this.A0S = new ByteBuffer[0];
        this.A0e = new ArrayDeque();
        this.A0a = new AnonymousClass9QF();
        this.A0b = new AnonymousClass9QF();
    }

    public static long A01(DefaultAudioSink defaultAudioSink) {
        C200929iU r1 = defaultAudioSink.A0G;
        if (r1.A04 == 0) {
            return defaultAudioSink.A0A / ((long) r1.A05);
        }
        return defaultAudioSink.A09;
    }

    private AudioTrack A02(C200929iU r13) {
        AudioTrack audioTrack;
        try {
            C199379fD r2 = this.A0D;
            int i = this.A01;
            if (Util.A00 >= 29) {
                audioTrack = C200929iU.A01(r2, r13, i);
            } else {
                AudioAttributes A002 = C200929iU.A00(r2);
                int i2 = r13.A06;
                int i3 = r13.A02;
                audioTrack = new AudioTrack(A002, new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(r13.A03).build(), r13.A00, 1, i);
            }
            AtomicInteger atomicInteger = A0h;
            atomicInteger.incrementAndGet();
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
                atomicInteger.decrementAndGet();
            } catch (Exception e) {
                Object[] A0M2 = AnonymousClass001.A0M();
                C36331k8.A1W(A0M2, state);
                AnonymousClass000.A1L(A0M2, atomicInteger.get(), 1);
                Log.e("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", A0M2), e);
            }
            int i4 = r13.A06;
            int i5 = r13.A02;
            int i6 = r13.A00;
            C207099uY r5 = r13.A07;
            boolean z = true;
            if (r13.A04 != 1) {
                z = false;
            }
            throw new C1889991q(r5, state, i4, i5, i6, atomicInteger.get(), z);
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            int i7 = r13.A06;
            int i8 = r13.A02;
            int i9 = r13.A00;
            throw new C1889991q(r13.A07, 0, i7, i8, i9, A0h.get(), AnonymousClass000.A1O(r13.A04));
        } catch (C1889991q e2) {
            throw e2;
        }
    }

    public static AnonymousClass9L8 A03(DefaultAudioSink defaultAudioSink) {
        AnonymousClass9L8 r0 = defaultAudioSink.A0H;
        if (r0 != null) {
            return r0;
        }
        ArrayDeque arrayDeque = defaultAudioSink.A0e;
        if (!arrayDeque.isEmpty()) {
            return (AnonymousClass9L8) arrayDeque.getLast();
        }
        return defaultAudioSink.A0I;
    }

    private void A04() {
        if (!this.A0Q) {
            this.A0Q = true;
            C199139el r6 = this.A0W;
            long A012 = A01(this);
            r6.A0E = C199139el.A00(r6);
            r6.A0F = SystemClock.elapsedRealtime() * 1000;
            r6.A05 = A012;
            this.A0B.stop();
        }
    }

    private void A05(long j) {
        C199519fS r4;
        boolean z;
        if ("audio/raw".equals(this.A0G.A07.A0S)) {
            AnonymousClass9L7 r3 = this.A0Z;
            r4 = A03(this).A02;
            C208979zG r2 = r3.A01;
            float f = r4.A01;
            if (r2.A01 != f) {
                r2.A01 = f;
                r2.A07 = true;
            }
            float f2 = r4.A00;
            if (r2.A00 != f2) {
                r2.A00 = f2;
                r2.A07 = true;
            }
            r3.A02.A00 = r4.A03;
        } else {
            r4 = C199519fS.A05;
        }
        if ("audio/raw".equals(this.A0G.A07.A0S)) {
            AnonymousClass9L7 r1 = this.A0Z;
            z = A03(this).A03;
            r1.A00.A05 = z;
        } else {
            z = false;
        }
        this.A0e.add(new AnonymousClass9L8(r4, Math.max(0, j), (A01(this) * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0G.A06), z));
        C23092B4c[] b4cArr = this.A0G.A08;
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (C23092B4c b4c : b4cArr) {
            if (b4c.BL7()) {
                A0I2.add(b4c);
            } else {
                b4c.flush();
            }
        }
        int size = A0I2.size();
        this.A0R = (C23092B4c[]) A0I2.toArray(new C23092B4c[size]);
        this.A0S = new ByteBuffer[size];
        int i = 0;
        while (true) {
            C23092B4c[] b4cArr2 = this.A0R;
            if (i < b4cArr2.length) {
                C23092B4c b4c2 = b4cArr2[i];
                b4c2.flush();
                this.A0S[i] = b4c2.BEm();
                i++;
            } else {
                return;
            }
        }
    }

    private void A06(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0R.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0J;
                if (byteBuffer == null) {
                    byteBuffer = C23092B4c.A00;
                }
            } else {
                byteBuffer = this.A0S[i - 1];
            }
            if (i == length) {
                A08(byteBuffer, j);
            } else {
                C23092B4c b4c = this.A0R[i];
                if (i > this.A02) {
                    b4c.Bmg(byteBuffer);
                }
                ByteBuffer BEm = b4c.BEm();
                this.A0S[i] = BEm;
                if (BEm.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
                continue;
            } else {
                return;
            }
        } while (i >= 0);
    }

    private void A07(AudioTrack audioTrack) {
        AnonymousClass9U2 r0 = this.A0U;
        if (r0 == null) {
            r0 = new AnonymousClass9U2(this);
            this.A0U = r0;
        }
        r0.A00(audioTrack);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r9.A0K != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A09() {
        /*
            r9 = this;
            int r8 = r9.A02
            r7 = -1
            r6 = 1
            r5 = 0
            if (r8 != r7) goto L_0x002c
            r9.A02 = r5
            r8 = 0
        L_0x000a:
            r4 = 1
        L_0x000b:
            X.B4c[] r3 = r9.A0R
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L_0x002e
            r0 = r3[r8]
            if (r4 == 0) goto L_0x001c
            r0.Bmf()
        L_0x001c:
            r9.A06(r1)
            boolean r0 = r0.BLh()
            if (r0 == 0) goto L_0x0039
            int r0 = r9.A02
            int r8 = r0 + 1
            r9.A02 = r8
            goto L_0x000a
        L_0x002c:
            r4 = 0
            goto L_0x000b
        L_0x002e:
            java.nio.ByteBuffer r0 = r9.A0K
            if (r0 == 0) goto L_0x003a
            r9.A08(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0K
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r5
        L_0x003a:
            r9.A02 = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A09():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (r17 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r17 != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r17 == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0A(boolean r20) {
        /*
            r19 = this;
            r12 = r19
            android.media.AudioTrack r0 = r12.A0B
            if (r0 == 0) goto L_0x02c8
            boolean r0 = r12.A0O
            if (r0 != 0) goto L_0x02c8
            X.9el r9 = r12.A0W
            android.media.AudioTrack r0 = r9.A0G
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.getPlayState()
            r14 = 3
            if (r0 != r14) goto L_0x01c3
            long r4 = X.C199139el.A00(r9)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r4 = r4 / r0
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            long r0 = java.lang.System.nanoTime()
            long r2 = X.C36391kE.A0B(r0)
            long r0 = r9.A08
            long r15 = r2 - r0
            r10 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            long[] r11 = r9.A0N
            int r8 = r9.A01
            long r0 = r4 - r2
            r11[r8] = r0
            int r1 = r8 + 1
            r0 = 10
            int r1 = r1 % r0
            r9.A01 = r1
            int r10 = r9.A03
            if (r10 >= r0) goto L_0x0053
            int r10 = r10 + 1
            r9.A03 = r10
        L_0x0053:
            r9.A08 = r2
            r9.A0D = r6
            r8 = 0
        L_0x0058:
            if (r8 >= r10) goto L_0x0064
            r15 = r11[r8]
            long r0 = (long) r10
            long r15 = r15 / r0
            long r6 = r6 + r15
            r9.A0D = r6
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0064:
            boolean r0 = r9.A0L
            if (r0 != 0) goto L_0x01c3
            X.9cq r8 = r9.A0H
            java.util.Objects.requireNonNull(r8)
            X.9MA r10 = r8.A05
            long r0 = r8.A03
            long r15 = r2 - r0
            long r0 = r8.A04
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x00b2
            r8.A03 = r2
            android.media.AudioTrack r0 = r10.A04
            android.media.AudioTimestamp r11 = r10.A03
            boolean r17 = r0.getTimestamp(r11)
            if (r17 == 0) goto L_0x009e
            long r6 = r11.framePosition
            long r0 = r10.A01
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x0094
            long r0 = r10.A02
            r15 = 1
            long r0 = r0 + r15
            r10.A02 = r0
        L_0x0094:
            r10.A01 = r6
            long r0 = r10.A02
            r13 = 32
            long r0 = r0 << r13
            long r6 = r6 + r0
            r10.A00 = r6
        L_0x009e:
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x00ca
            r13 = 2
            if (r0 == r6) goto L_0x00e0
            if (r0 == r13) goto L_0x00c7
            if (r0 != r14) goto L_0x00b0
            if (r17 == 0) goto L_0x00b2
        L_0x00ac:
            r0 = 0
            X.C198059cq.A00(r8, r0)
        L_0x00b0:
            if (r17 != 0) goto L_0x00ed
        L_0x00b2:
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x01c3
            java.lang.reflect.Method r8 = r9.A0I
            if (r8 == 0) goto L_0x01c3
            long r0 = r9.A07
            long r6 = r2 - r0
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01c3
            goto L_0x0183
        L_0x00c7:
            if (r17 != 0) goto L_0x00ed
            goto L_0x00ac
        L_0x00ca:
            if (r17 == 0) goto L_0x0173
            long r0 = r11.nanoTime
            long r13 = X.C36391kE.A0B(r0)
            long r0 = r8.A02
            int r7 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00b2
            long r0 = r10.A00
            r8.A01 = r0
            X.C198059cq.A00(r8, r6)
            goto L_0x00ed
        L_0x00e0:
            if (r17 == 0) goto L_0x00ac
            long r6 = r10.A00
            long r0 = r8.A01
            int r14 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ed
            X.C198059cq.A00(r8, r13)
        L_0x00ed:
            long r0 = r11.nanoTime
            long r6 = X.C36391kE.A0B(r0)
            long r0 = r10.A00
            long r10 = r6 - r2
            long r13 = java.lang.Math.abs(r10)
            r15 = 5000000(0x4c4b40, double:2.470328E-317)
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0151
            X.9Bf r13 = r9.A0M
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r11 = "Spurious audio timestamp (system clock mismatch): "
        L_0x010a:
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = ", "
            r10.append(r11)
            r10.append(r6)
            r10.append(r11)
            r10.append(r2)
            r10.append(r11)
            r10.append(r4)
            r10.append(r11)
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r6 = r13.A00
            X.9iU r4 = r6.A0G
            int r0 = r4.A04
            if (r0 != 0) goto L_0x014e
            long r0 = r6.A08
            int r4 = r4.A01
            long r4 = (long) r4
            long r0 = r0 / r4
        L_0x0135:
            r10.append(r0)
            r10.append(r11)
            long r0 = A01(r6)
            java.lang.String r1 = X.C36411kG.A11(r10, r0)
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)
            r0 = 4
        L_0x0149:
            X.C198059cq.A00(r8, r0)
            goto L_0x00b2
        L_0x014e:
            long r0 = r6.A07
            goto L_0x0135
        L_0x0151:
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r0 * r10
            int r10 = r9.A02
            long r10 = (long) r10
            long r13 = r13 / r10
            long r13 = r13 - r4
            long r13 = java.lang.Math.abs(r13)
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x016c
            X.9Bf r13 = r9.A0M
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r11 = "Spurious audio timestamp (frame position mismatch): "
            goto L_0x010a
        L_0x016c:
            int r1 = r8.A00
            r0 = 4
            if (r1 != r0) goto L_0x00b2
            r0 = 0
            goto L_0x0149
        L_0x0173:
            long r0 = r8.A02
            long r6 = r2 - r0
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            X.C198059cq.A00(r8, r14)
            goto L_0x00b2
        L_0x0183:
            android.media.AudioTrack r1 = r9.A0G     // Catch:{ Exception -> 0x01be }
            java.util.Objects.requireNonNull(r1)     // Catch:{ Exception -> 0x01be }
            java.lang.Object[] r0 = X.C90524aI.A0w()     // Catch:{ Exception -> 0x01be }
            java.lang.Object r0 = r8.invoke(r1, r0)     // Catch:{ Exception -> 0x01be }
            int r0 = X.C90514aH.A0H(r0)     // Catch:{ Exception -> 0x01be }
            long r0 = X.C36371kC.A07(r0)     // Catch:{ Exception -> 0x01be }
            long r4 = r9.A04     // Catch:{ Exception -> 0x01be }
            long r0 = r0 - r4
            r9.A0A = r0     // Catch:{ Exception -> 0x01be }
            r4 = 0
            long r0 = java.lang.Math.max(r0, r4)     // Catch:{ Exception -> 0x01be }
            r9.A0A = r0     // Catch:{ Exception -> 0x01be }
            r7 = 5000000(0x4c4b40, double:2.470328E-317)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x01c1
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01be }
            java.lang.String r6 = "Ignoring impossibly large audio latency: "
            java.lang.String r1 = X.C36381kD.A0z(r6, r7, r0)     // Catch:{ Exception -> 0x01be }
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x01be }
            r9.A0A = r4     // Catch:{ Exception -> 0x01be }
            goto L_0x01c1
        L_0x01be:
            r0 = 0
            r9.A0I = r0
        L_0x01c1:
            r9.A07 = r2
        L_0x01c3:
            long r0 = java.lang.System.nanoTime()
            long r6 = X.C36391kE.A0B(r0)
            X.9cq r1 = r9.A0H
            java.util.Objects.requireNonNull(r1)
            int r5 = r1.A00
            r0 = 1
            if (r5 == r0) goto L_0x0221
            r0 = 2
            if (r5 == r0) goto L_0x0221
            int r0 = r9.A03
            if (r0 != 0) goto L_0x021c
            long r2 = X.C199139el.A00(r9)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r2 = r2 / r0
        L_0x01e8:
            if (r20 != 0) goto L_0x01ed
            long r0 = r9.A0A
            long r2 = r2 - r0
        L_0x01ed:
            X.9iU r6 = r12.A0G
            long r4 = A01(r12)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r7 = java.lang.Math.min(r2, r4)
        L_0x01ff:
            java.util.ArrayDeque r3 = r12.A0e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x023b
            java.lang.Object r0 = r3.getFirst()
            X.9L8 r0 = (X.AnonymousClass9L8) r0
            long r1 = r0.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x023b
            java.lang.Object r0 = r3.remove()
            X.9L8 r0 = (X.AnonymousClass9L8) r0
            r12.A0I = r0
            goto L_0x01ff
        L_0x021c:
            long r0 = r9.A0D
            long r2 = r6 + r0
            goto L_0x01e8
        L_0x0221:
            X.9MA r4 = r1.A05
            long r2 = r4.A00
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r2 = r2 / r0
            r0 = 2
            if (r5 != r0) goto L_0x01ed
            android.media.AudioTimestamp r0 = r4.A03
            long r0 = r0.nanoTime
            long r0 = X.C36391kE.A0B(r0)
            long r6 = r6 - r0
            long r2 = r2 + r6
            goto L_0x01ed
        L_0x023b:
            X.9L8 r2 = r12.A0I
            long r0 = r2.A00
            long r13 = r7 - r0
            X.9fS r1 = r2.A02
            X.9fS r0 = X.C199519fS.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            long r2 = r2.A01
            long r2 = r2 + r13
        L_0x024e:
            X.9iU r6 = r12.A0G
            X.9L7 r0 = r12.A0Z
            X.82W r0 = r0.A00
            long r4 = r0.A04
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r2 = r2 + r4
            return r2
        L_0x0260:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02a8
            X.9L7 r0 = r12.A0Z
            X.9zG r2 = r0.A01
            long r5 = r2.A03
            r3 = 1024(0x400, double:5.06E-321)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02a1
            long r15 = r2.A02
            X.9mq r0 = r2.A06
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.A00
            int r0 = r0.A0G
            int r1 = r1 * r0
            int r0 = r1 * 2
            long r0 = (long) r0
            long r15 = r15 - r0
            X.9gA r0 = r2.A05
            int r1 = r0.A03
            X.9gA r0 = r2.A04
            int r4 = r0.A03
            if (r1 != r4) goto L_0x029a
            long r2 = r2.A03
        L_0x028e:
            r17 = r2
            long r4 = com.facebook.android.exoplayer2.util.Util.A07(r13, r15, r17)
        L_0x0294:
            X.9L8 r0 = r12.A0I
            long r2 = r0.A01
            long r2 = r2 + r4
            goto L_0x024e
        L_0x029a:
            long r0 = (long) r1
            long r15 = r15 * r0
            long r2 = r2.A03
            long r0 = (long) r4
            long r2 = r2 * r0
            goto L_0x028e
        L_0x02a1:
            float r0 = r2.A01
            double r2 = (double) r0
            double r0 = (double) r13
            double r2 = r2 * r0
            long r4 = (long) r2
            goto L_0x0294
        L_0x02a8:
            java.lang.Object r6 = r3.getFirst()
            X.9L8 r6 = (X.AnonymousClass9L8) r6
            long r4 = r6.A00
            long r4 = r4 - r7
            X.9L8 r0 = r12.A0I
            X.9fS r0 = r0.A02
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02c4
            double r2 = (double) r4
            double r0 = (double) r1
            double r2 = r2 * r0
            long r4 = java.lang.Math.round(r2)
        L_0x02c4:
            long r2 = r6.A01
            long r2 = r2 - r4
            goto L_0x024e
        L_0x02c8:
            r2 = -9223372036854775808
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0A(boolean):long");
    }

    public void A0B() {
        if (this.A0B != null) {
            this.A08 = 0;
            this.A07 = 0;
            this.A0A = 0;
            this.A09 = 0;
            int i = 0;
            this.A03 = 0;
            this.A0I = new AnonymousClass9L8(A03(this).A02, 0, 0, A03(this).A03);
            this.A06 = 0;
            this.A0H = null;
            this.A0e.clear();
            this.A0J = null;
            this.A04 = 0;
            this.A0K = null;
            this.A0Q = false;
            this.A0M = false;
            this.A02 = -1;
            this.A0c.A04 = 0;
            while (true) {
                C23092B4c[] b4cArr = this.A0R;
                if (i >= b4cArr.length) {
                    break;
                }
                C23092B4c b4c = b4cArr[i];
                b4c.flush();
                this.A0S[i] = b4c.BEm();
                i++;
            }
            C199139el r3 = this.A0W;
            AudioTrack audioTrack = r3.A0G;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.A0B.pause();
            }
            AudioTrack audioTrack2 = this.A0B;
            if (Util.A00 >= 29 && audioTrack2.isOffloadedPlayback()) {
                AnonymousClass9U2 r1 = this.A0U;
                Objects.requireNonNull(r1);
                r1.A01(this.A0B);
            }
            AudioTrack audioTrack3 = this.A0B;
            this.A0B = null;
            C200929iU r0 = this.A0T;
            if (r0 != null) {
                this.A0G = r0;
                this.A0T = null;
            }
            r3.A0D = 0;
            r3.A03 = 0;
            r3.A01 = 0;
            r3.A08 = 0;
            r3.A0G = null;
            r3.A0H = null;
            this.A0d.A00();
            new C21839AbH(audioTrack3, this).start();
        }
        this.A0b.A00 = null;
        this.A0a.A00 = null;
    }

    public void A0E() {
        if (!this.A0M && this.A0B != null && A09()) {
            A04();
            this.A0M = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fc, code lost:
        if (r3 != 23) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0233, code lost:
        if (r0 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r5 = X.C199669fk.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r5.containsKey(java.lang.Integer.valueOf(r4)) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        if (r4 != 18) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (java.util.Arrays.binarySearch(r1.A00, 18) >= 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (java.util.Arrays.binarySearch(r1.A00, r4) < 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r3 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r3 == -1) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r4 == 18) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
        if (r3 <= 8) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        throw new X.AnonymousClass923(r7, X.AnonymousClass000.A0l(r7, "Unable to configure passthrough for: ", X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b3, code lost:
        if (r11 != -1) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r3 = 48000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A00 < 29) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00be, code lost:
        r3 = X.C196429Zp.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        r1 = com.facebook.android.exoplayer2.util.Util.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r1 > 28) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        if (r3 != 7) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r1 > 26) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        if ("fugu".equals(com.facebook.android.exoplayer2.util.Util.A01) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        if (r3 != 1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        r0 = com.facebook.android.exoplayer2.util.Util.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r0 == 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        r0 = android.util.Pair.create(java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
        r10 = X.C36381kD.A04(r0);
        r13 = X.C36381kD.A03(r0);
        r19 = -1;
        r8 = 2;
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
        if (r3 == 3) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (r3 == 4) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0190, code lost:
        if (r3 != 5) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0192, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0195, code lost:
        r0 = r5.getOrDefault(java.lang.Integer.valueOf(r4), 0);
        java.util.Objects.requireNonNull(r0);
        r3 = X.AnonymousClass000.A0I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ac, code lost:
        if (r4 != 8) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b4, code lost:
        if (java.util.Arrays.binarySearch(r1.A00, 8) >= 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b6, code lost:
        r4 = 7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C207099uY r27, int[] r28) {
        /*
            r26 = this;
            r7 = r27
            java.lang.String r3 = r7.A0S
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r3)
            r2 = 0
            r6 = r26
            if (r0 == 0) goto L_0x0063
            int r5 = r7.A0B
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r5)
            X.C200319h9.A01(r0)
            int r3 = r7.A05
            int r19 = com.facebook.android.exoplayer2.util.Util.A02(r5, r3)
            X.B4c[] r14 = r6.A0g
            X.82U r2 = r6.A0c
            int r1 = r7.A07
            int r0 = r7.A08
            r2.A03 = r1
            r2.A02 = r0
            X.82T r0 = r6.A0X
            r1 = r28
            r0.A01 = r1
            int r0 = r7.A0F
            X.9gA r4 = new X.9gA
            r4.<init>(r0, r3, r5)
            int r3 = r14.length
            r2 = 0
        L_0x0039:
            if (r2 >= r3) goto L_0x0052
            r0 = r14[r2]
            X.9gA r1 = r0.B3O(r4)     // Catch:{ 91S -> 0x004b }
            boolean r0 = r0.BL7()     // Catch:{ 91S -> 0x004b }
            if (r0 == 0) goto L_0x0048
            r4 = r1
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x004b:
            r1 = move-exception
            X.923 r0 = new X.923
            r0.<init>((X.C207099uY) r7, (java.lang.Throwable) r1)
            throw r0
        L_0x0052:
            int r10 = r4.A02
            int r11 = r4.A03
            int r0 = r4.A01
            int r13 = com.facebook.android.exoplayer2.util.Util.A00(r0)
            int r9 = com.facebook.android.exoplayer2.util.Util.A02(r10, r0)
            r8 = 0
            goto L_0x00ff
        L_0x0063:
            X.B4c[] r14 = new X.C23092B4c[r2]
            int r11 = r7.A0F
            X.9fk r1 = r6.A0V
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = r7.A0O
            int r0 = r3.hashCode()
            switch(r0) {
                case -2123537834: goto L_0x01b9;
                case -1095064472: goto L_0x01c2;
                case -53558318: goto L_0x01ca;
                case 187078296: goto L_0x0200;
                case 187078297: goto L_0x0208;
                case 1504578661: goto L_0x0211;
                case 1504831518: goto L_0x0219;
                case 1505942594: goto L_0x0222;
                case 1556697186: goto L_0x022b;
                default: goto L_0x0075;
            }
        L_0x0075:
            r4 = 0
        L_0x0076:
            X.0wy r5 = X.C199669fk.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x00a2
            r8 = 18
            if (r4 != r8) goto L_0x01aa
            int[] r0 = r1.A00
            int r0 = java.util.Arrays.binarySearch(r0, r8)
            if (r0 >= 0) goto L_0x008f
            r4 = 6
        L_0x008f:
            int[] r0 = r1.A00
            int r0 = java.util.Arrays.binarySearch(r0, r4)
            if (r0 < 0) goto L_0x00a2
            int r3 = r7.A05
            r0 = -1
            if (r3 == r0) goto L_0x00b2
            if (r4 == r8) goto L_0x00b2
            r0 = 8
            if (r3 <= r0) goto L_0x00c2
        L_0x00a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to configure passthrough for: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r7, r0, r1)
            X.923 r0 = new X.923
            r0.<init>((X.C207099uY) r7, (java.lang.String) r1)
            throw r0
        L_0x00b2:
            r3 = r11
            if (r11 != r0) goto L_0x00b8
            r3 = 48000(0xbb80, float:6.7262E-41)
        L_0x00b8:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x0195
            int r3 = X.C196429Zp.A00(r4, r3)
        L_0x00c2:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 28
            if (r1 > r0) goto L_0x00df
            r0 = 7
            if (r3 != r0) goto L_0x0189
            r3 = 8
        L_0x00cd:
            r0 = 26
            if (r1 > r0) goto L_0x00df
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r0 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00df
            r0 = 1
            if (r3 != r0) goto L_0x00df
            r3 = 2
        L_0x00df:
            int r0 = com.facebook.android.exoplayer2.util.Util.A00(r3)
            if (r0 == 0) goto L_0x00a2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            if (r0 == 0) goto L_0x00a2
            int r10 = X.C36381kD.A04(r0)
            int r13 = X.C36381kD.A03(r0)
            r19 = -1
            r8 = 2
            r9 = -1
        L_0x00ff:
            int r12 = android.media.AudioTrack.getMinBufferSize(r11, r13, r10)
            r0 = -2
            boolean r0 = X.C36381kD.A1U(r12, r0)
            X.C200319h9.A02(r0)
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r8 == 0) goto L_0x0164
            r0 = 1
            if (r8 == r0) goto L_0x015a
            r1 = 250000(0x3d090, float:3.50325E-40)
            r0 = 5
            if (r10 != r0) goto L_0x011b
            r1 = 500000(0x7a120, float:7.00649E-40)
        L_0x011b:
            int r0 = X.C209019zK.A00(r10)
            long r2 = (long) r1
            long r0 = (long) r0
        L_0x0121:
            long r0 = X.C165597tg.A0E(r2, r0)
            int r0 = A00(r0)
        L_0x0129:
            double r0 = (double) r0
            double r0 = r0 * r17
            int r2 = (int) r0
            int r0 = java.lang.Math.max(r12, r2)
            int r0 = r0 + r9
            int r25 = r0 + -1
            int r25 = r25 / r9
            int r25 = r25 * r9
            java.lang.String r2 = ") for: "
            if (r10 == 0) goto L_0x0250
            if (r13 == 0) goto L_0x023a
            X.9iU r1 = new X.9iU
            r21 = r9
            r22 = r11
            r23 = r13
            r24 = r10
            r17 = r7
            r18 = r14
            r20 = r8
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.media.AudioTrack r0 = r6.A0B
            if (r0 == 0) goto L_0x0237
            r6.A0T = r1
            return
        L_0x015a:
            int r1 = X.C209019zK.A00(r10)
            r0 = 50000000(0x2faf080, float:3.6872239E-37)
            long r2 = (long) r0
            long r0 = (long) r1
            goto L_0x0121
        L_0x0164:
            int r16 = r12 * 4
            r0 = 250000(0x3d090, float:3.50325E-40)
            long r0 = (long) r0
            long r4 = (long) r11
            long r0 = r0 * r4
            long r2 = (long) r9
            long r0 = X.C165597tg.A0E(r0, r2)
            int r15 = A00(r0)
            r0 = 750000(0xb71b0, float:1.050974E-39)
            long r0 = (long) r0
            long r0 = r0 * r4
            long r0 = X.C165597tg.A0E(r0, r2)
            int r1 = A00(r0)
            r0 = r16
            int r0 = X.C165607th.A03(r0, r1, r15)
            goto L_0x0129
        L_0x0189:
            r0 = 3
            if (r3 == r0) goto L_0x0192
            r0 = 4
            if (r3 == r0) goto L_0x0192
            r0 = 5
            if (r3 != r0) goto L_0x00cd
        L_0x0192:
            r3 = 6
            goto L_0x00cd
        L_0x0195:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r5.getOrDefault(r1, r0)
            java.util.Objects.requireNonNull(r0)
            int r3 = X.AnonymousClass000.A0I(r0)
            goto L_0x00c2
        L_0x01aa:
            r3 = 8
            if (r4 != r3) goto L_0x008f
            int[] r0 = r1.A00
            int r0 = java.util.Arrays.binarySearch(r0, r3)
            if (r0 >= 0) goto L_0x008f
            r4 = 7
            goto L_0x008f
        L_0x01b9:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r3.equals(r0)
            r4 = 18
            goto L_0x0233
        L_0x01c2:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r3.equals(r0)
            r4 = 7
            goto L_0x0233
        L_0x01ca:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x0075
            X.9QH r0 = X.C203249nb.A02(r4)
            if (r0 == 0) goto L_0x0075
            int r3 = r0.A00
            r0 = 2
            r4 = 10
            if (r3 == r0) goto L_0x0076
            r0 = 5
            r4 = 11
            if (r3 == r0) goto L_0x0076
            r0 = 29
            r4 = 12
            if (r3 == r0) goto L_0x0076
            r0 = 42
            r4 = 16
            if (r3 == r0) goto L_0x0076
            r0 = 22
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r0) goto L_0x0076
            r0 = 23
            r4 = 15
            if (r3 == r0) goto L_0x0076
            goto L_0x0075
        L_0x0200:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r3.equals(r0)
            r4 = 5
            goto L_0x0233
        L_0x0208:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r3.equals(r0)
            r4 = 17
            goto L_0x0233
        L_0x0211:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r3.equals(r0)
            r4 = 6
            goto L_0x0233
        L_0x0219:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r3.equals(r0)
            r4 = 9
            goto L_0x0233
        L_0x0222:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r3.equals(r0)
            r4 = 8
            goto L_0x0233
        L_0x022b:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r3.equals(r0)
            r4 = 14
        L_0x0233:
            if (r0 != 0) goto L_0x0076
            goto L_0x0075
        L_0x0237:
            r6.A0G = r1
            return
        L_0x023a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid output channel config (mode="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = X.AnonymousClass000.A0l(r7, r2, r1)
            X.923 r0 = new X.923
            r0.<init>((X.C207099uY) r7, (java.lang.String) r1)
            throw r0
        L_0x0250:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid output encoding (mode="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = X.AnonymousClass000.A0l(r7, r2, r1)
            X.923 r0 = new X.923
            r0.<init>((X.C207099uY) r7, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0F(X.9uY, int[]):void");
    }

    public void A0G(C199519fS r10) {
        C199519fS r0 = C199519fS.A05;
        C199519fS r3 = new C199519fS(C165597tg.A01(r10.A01, 8.0f, 0.1f), C165597tg.A01(r10.A00, 8.0f, 0.1f), false, false);
        boolean z = A03(this).A03;
        AnonymousClass9L8 A032 = A03(this);
        if (!r3.equals(A032.A02) || z != A032.A03) {
            AnonymousClass9L8 r2 = new AnonymousClass9L8(r3, -9223372036854775807L, -9223372036854775807L, z);
            if (this.A0B != null) {
                this.A0H = r2;
            } else {
                this.A0I = r2;
            }
        }
    }

    public boolean A0H() {
        if (this.A0B == null || !this.A0W.A01(A01(this))) {
            return false;
        }
        return true;
    }

    private void A08(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.A0K;
            boolean z = true;
            boolean z2 = false;
            if (byteBuffer2 != null) {
                C200319h9.A01(C36361kB.A1a(byteBuffer2, byteBuffer));
            } else {
                this.A0K = byteBuffer;
            }
            int remaining = byteBuffer.remaining();
            int write = this.A0B.write(byteBuffer, remaining, 1);
            this.A05 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Util.A00 >= 24 && write == -6) || write == -32) {
                    z2 = true;
                }
                C1890091r r1 = new C1890091r(this.A0G.A07, write, z2);
                if (!r1.isRecoverable) {
                    this.A0b.A00(r1);
                    return;
                }
                throw r1;
            }
            this.A0b.A00 = null;
            AudioTrack audioTrack = this.A0B;
            if (Util.A00 >= 29) {
                audioTrack.isOffloadedPlayback();
            }
            int i = this.A0G.A04;
            if (i == 0) {
                this.A0A += (long) write;
            }
            if (write == remaining) {
                if (i != 0) {
                    if (byteBuffer != this.A0J) {
                        z = false;
                    }
                    C200319h9.A02(z);
                    this.A09 += ((long) this.A03) * ((long) this.A04);
                }
                this.A0K = null;
            }
        }
    }

    public boolean A0I(int i, int i2) {
        if (!Util.A0D(i2)) {
            if (Arrays.binarySearch(this.A0V.A00, i2) < 0) {
                return false;
            }
            if (i == -1 || i <= 8) {
                return true;
            }
            return false;
        }
        return true;
    }
}
