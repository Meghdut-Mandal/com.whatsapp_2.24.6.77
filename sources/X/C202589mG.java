package X;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.9mG  reason: invalid class name and case insensitive filesystem */
public final class C202589mG {
    public long A00;
    public HandlerThread A01;
    public final MediaCodec A02;
    public final AnonymousClass883 A03;
    public final LinkedBlockingQueue A04;

    public C202589mG(MediaCodec mediaCodec, AnonymousClass883 r4) {
        AnonymousClass00C.A0D(r4, 2);
        this.A02 = mediaCodec;
        this.A03 = r4;
        this.A04 = new LinkedBlockingQueue(100);
    }

    public static final /* synthetic */ void A01(C193979Nq r6, C202589mG r7) {
        if (!r6.A06) {
            long elapsedRealtime = ((long) 30) - (SystemClock.elapsedRealtime() - r7.A00);
            if (elapsedRealtime > 0) {
                Thread.sleep(elapsedRealtime);
            }
        }
    }

    public void A05() {
        MediaCodec mediaCodec = this.A02;
        C165847uF r1 = new C165847uF(this);
        HandlerThread handlerThread = this.A01;
        if (handlerThread == null) {
            throw C36331k8.A0d("decoderThread");
        }
        mediaCodec.setCallback(r1, C90514aH.A0M(handlerThread));
    }

    public MediaCodec A03() {
        return this.A02;
    }

    public AnonymousClass883 A04() {
        return this.A03;
    }

    public C202589mG() {
    }
}
