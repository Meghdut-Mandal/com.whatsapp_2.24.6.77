package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7uF  reason: invalid class name and case insensitive filesystem */
public final class C165847uF extends MediaCodec.Callback {
    public final /* synthetic */ C202589mG A00;

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        AnonymousClass00C.A0D(codecException, 1);
        C200159gk r2 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Decoder onError Diagnostics: ");
        r2.A04("sup:AsyncFrameHandler", AnonymousClass000.A0q(codecException.getDiagnosticInfo(), A0u), codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodec mediaCodec2 = mediaCodec;
        AnonymousClass00C.A0D(mediaCodec, 0);
        int i2 = i;
        try {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i2);
            C202589mG r5 = this.A00;
            C193979Nq r10 = (C193979Nq) r5.A04.poll(1, TimeUnit.SECONDS);
            if (r10 == null) {
                mediaCodec2.queueInputBuffer(i2, 0, 0, 0, 0);
                return;
            }
            C202589mG.A01(r10, r5);
            C202519m5.A00.A03(r5.A03(), r10, r5.A04(), inputBuffer, i2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOutputBufferAvailable(android.media.MediaCodec r5, int r6, android.media.MediaCodec.BufferInfo r7) {
        /*
            r4 = this;
            r3 = 0
            X.C36321k7.A0v(r5, r3, r7)
            X.9mG r2 = r4.A00     // Catch:{ all -> 0x0024 }
            X.883 r1 = r2.A04()     // Catch:{ all -> 0x0024 }
            boolean r0 = r1.A02     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0012
            r5.releaseOutputBuffer(r6, r3)     // Catch:{ all -> 0x0024 }
            return
        L_0x0012:
            java.nio.ByteBuffer r0 = r5.getOutputBuffer(r6)     // Catch:{ all -> 0x0024 }
            X.C202519m5.A00(r7, r5, r1, r0, r6)     // Catch:{ all -> 0x0024 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0021 }
            r2.A00 = r0     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r2 = move-exception
            r1 = 1
            goto L_0x0026
        L_0x0024:
            r2 = move-exception
            r1 = 0
        L_0x0026:
            X.9mG r0 = r4.A00     // Catch:{ all -> 0x0035 }
            X.883 r0 = r0.A04()     // Catch:{ all -> 0x0035 }
            X.C202519m5.A01(r0, r2)     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0034
            r5.releaseOutputBuffer(r6, r3)     // Catch:{ all -> 0x0034 }
        L_0x0034:
            return
        L_0x0035:
            r0 = move-exception
            if (r1 != 0) goto L_0x003b
            r5.releaseOutputBuffer(r6, r3)     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165847uF.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        AnonymousClass00C.A0D(mediaFormat, 1);
        AnonymousClass9AO.A01.A01("sup:AsyncFrameHandler", AnonymousClass000.A0l(mediaFormat, "onOutputFormatChanged ", AnonymousClass000.A0u()));
    }

    public C165847uF(C202589mG r1) {
        this.A00 = r1;
    }
}
