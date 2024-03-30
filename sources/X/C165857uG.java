package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: X.7uG  reason: invalid class name and case insensitive filesystem */
public final class C165857uG extends MediaCodec.Callback {
    public long A00;
    public MediaCodec.CodecException A01;
    public MediaFormat A02;
    public Handler A03;
    public IllegalStateException A04;
    public boolean A05;
    public MediaFormat A06;
    public final HandlerThread A07;
    public final AnonymousClass9S1 A08;
    public final Object A09 = C36441kJ.A11();
    public final ArrayDeque A0A;
    public final ArrayDeque A0B;
    public final AnonymousClass9S1 A0C;

    public static void A00(C165857uG r4) {
        ArrayDeque arrayDeque = r4.A0B;
        if (!arrayDeque.isEmpty()) {
            r4.A06 = (MediaFormat) arrayDeque.getLast();
        }
        AnonymousClass9S1 r0 = r4.A0C;
        r0.A00 = 0;
        r0.A02 = -1;
        r0.A01 = 0;
        AnonymousClass9S1 r02 = r4.A08;
        r02.A00 = 0;
        r02.A02 = -1;
        r02.A01 = 0;
        r4.A0A.clear();
        arrayDeque.clear();
    }

    public static /* synthetic */ void A01(C165857uG r6) {
        synchronized (r6.A09) {
            if (!r6.A05) {
                long j = r6.A00 - 1;
                r6.A00 = j;
                if (j <= 0) {
                    if (j < 0) {
                        r6.A04 = C165617ti.A0V();
                    } else {
                        A00(r6);
                    }
                }
            }
        }
    }

    public void A02(MediaCodec mediaCodec) {
        C200319h9.A02(AnonymousClass000.A1W(this.A03));
        HandlerThread handlerThread = this.A07;
        handlerThread.start();
        Handler A0M = C90514aH.A0M(handlerThread);
        mediaCodec.setCallback(this, A0M);
        this.A03 = A0M;
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.A09) {
            this.A01 = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.A09) {
            this.A0C.A00(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.A09) {
            MediaFormat mediaFormat = this.A06;
            if (mediaFormat != null) {
                this.A08.A00(-2);
                this.A0B.add(mediaFormat);
                this.A06 = null;
            }
            this.A08.A00(i);
            this.A0A.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.A09) {
            this.A08.A00(-2);
            this.A0B.add(mediaFormat);
            this.A06 = null;
        }
    }

    public C165857uG(HandlerThread handlerThread) {
        this.A07 = handlerThread;
        this.A0C = new AnonymousClass9S1();
        this.A08 = new AnonymousClass9S1();
        this.A0A = new ArrayDeque();
        this.A0B = new ArrayDeque();
    }
}
