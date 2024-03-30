package X;

import android.media.MediaCodec;
import com.facebook.wearable.mediastream.codec.VideoDecoderBufferHandler$onOutputBuffer$1;
import java.nio.ByteBuffer;

/* renamed from: X.9m5  reason: invalid class name and case insensitive filesystem */
public final class C202519m5 {
    public static final C202519m5 A00 = new C202519m5();

    public static final void A00(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, AnonymousClass883 r6, ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null || bufferInfo.size == 0 || !r6.A03) {
            mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
        C36331k8.A1T(new VideoDecoderBufferHandler$onOutputBuffer$1(bufferInfo, r6, (C023509x) null), C009403z.A02(C006702x.A00));
    }

    public final void A03(MediaCodec mediaCodec, C193979Nq r9, AnonymousClass883 r10, ByteBuffer byteBuffer, int i) {
        long j;
        int i2;
        int i3;
        int i4 = 0;
        if (byteBuffer == null || !r10.A02) {
            j = 0;
            i2 = 0;
            i3 = 0;
        } else {
            ByteBuffer byteBuffer2 = r9.A05;
            byteBuffer2.rewind();
            byteBuffer.clear();
            byteBuffer.put(byteBuffer2);
            byteBuffer.flip();
            i4 = r9.A01;
            i2 = r9.A02;
            j = r9.A03;
            i3 = r9.A00;
        }
        mediaCodec.queueInputBuffer(i, i4, i2, j, i3);
    }

    public static final void A01(AnonymousClass883 r6, Throwable th) {
        if (!(th instanceof MediaCodec.CodecException)) {
            AnonymousClass9AO.A01.A05("sup:VideoDecoderBufferHandler", "Video decoder output exception!", th);
        } else if (r6.A02) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            int errorCode = codecException.getErrorCode();
            C200159gk r2 = AnonymousClass9AO.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            if (errorCode == -19) {
                A0u.append("Resource was not available. Likely caused by preview surface change. Diagnostics: ");
                r2.A07("sup:VideoDecoderBufferHandler", AnonymousClass000.A0q(codecException.getDiagnosticInfo(), A0u), th);
            } else {
                A0u.append("Video decoder output exception! Diagnostics: ");
                r2.A05("sup:VideoDecoderBufferHandler", AnonymousClass000.A0q(codecException.getDiagnosticInfo(), A0u), th);
            }
            r6.A01.invoke();
        }
    }

    public static final void A02(AnonymousClass883 r4, Throwable th) {
        String str;
        if (r4.A02) {
            if (th instanceof MediaCodec.CodecException) {
                str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            } else {
                str = "";
            }
            AnonymousClass00C.A0B(str);
            AnonymousClass9AO.A01.A05("sup:VideoDecoderBufferHandler", AnonymousClass000.A0p("Video decoder enqueue video frame exception! Diagnostics ", str, AnonymousClass000.A0u()), th);
            r4.A01.invoke();
        }
    }
}
