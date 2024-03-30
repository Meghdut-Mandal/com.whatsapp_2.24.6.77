package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.6Em  reason: invalid class name and case insensitive filesystem */
public class C128986Em {
    public MediaFormat A00;
    public String A01;
    public ByteBuffer[] A02;
    public ByteBuffer[] A03;
    public final MediaCodec A04;
    public final Surface A05;
    public final Integer A06;
    public final boolean A07;

    public C141206mq A00(long j) {
        C131736Qi.A02(AnonymousClass000.A1W(this.A05), (String) null);
        int dequeueInputBuffer = this.A04.dequeueInputBuffer(j);
        if (dequeueInputBuffer >= 0) {
            return new C141206mq(dequeueInputBuffer, this.A02[dequeueInputBuffer], (MediaCodec.BufferInfo) null);
        }
        return null;
    }

    public C141206mq A01(long j) {
        C141206mq r0;
        Trace.beginSection("MediaCodecWrapper.dequeueNextOutputBuffer()");
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            Trace.beginSection("MediaCodecWrapper.dequeueOutputBuffer()");
            MediaCodec mediaCodec = this.A04;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer >= 0) {
                r0 = new C141206mq(dequeueOutputBuffer, this.A03[dequeueOutputBuffer], bufferInfo);
            } else {
                if (dequeueOutputBuffer == -3) {
                    Trace.beginSection("MediaCodecWrapper.buffersChanged()");
                    this.A03 = mediaCodec.getOutputBuffers();
                    Trace.endSection();
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    this.A00 = outputFormat;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(this.A01);
                    this.A01 = AnonymousClass000.A0q(String.format(Locale.US, "New output format: %s", C36431kI.A1Z(outputFormat, 1)), A0u);
                    r0 = new C141206mq(-1, (ByteBuffer) null, (MediaCodec.BufferInfo) null);
                    r0.A01 = true;
                }
                Trace.endSection();
                return null;
            }
            Trace.endSection();
            return r0;
        } finally {
            Trace.endSection();
        }
    }

    public void A02() {
        MediaCodec mediaCodec = this.A04;
        mediaCodec.start();
        if (this.A05 == null) {
            this.A02 = mediaCodec.getInputBuffers();
        }
        this.A03 = mediaCodec.getOutputBuffers();
    }

    public void A03(C141206mq r9) {
        MediaCodec mediaCodec = this.A04;
        int i = r9.A02;
        MediaCodec.BufferInfo bufferInfo = r9.A00;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == X.C023109s.A01) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C128986Em(android.media.MediaCodec r3, android.view.Surface r4, java.lang.Integer r5, java.lang.String r6, boolean r7) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L_0x000a
            java.lang.Integer r0 = X.C023109s.A01
            r1 = 0
            if (r5 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C131736Qi.A02(r1, r0)
            r2.A06 = r5
            r2.A04 = r3
            r2.A05 = r4
            r2.A07 = r7
            r2.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128986Em.<init>(android.media.MediaCodec, android.view.Surface, java.lang.Integer, java.lang.String, boolean):void");
    }
}
