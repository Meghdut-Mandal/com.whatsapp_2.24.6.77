package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.B3l  reason: case insensitive filesystem */
public interface C23079B3l {
    @Deprecated
    void B3R(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i);

    int B5G();

    int B5J(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer BCk(int i);

    ByteBuffer BEn(int i);

    MediaFormat BEp();

    void Bmh(int i, int i2, int i3, long j, int i4);

    void Bmj(AnonymousClass9OC r1, int i, int i2, int i3, long j);

    void BnQ(int i, long j);

    void BnR(int i, boolean z);

    void BrM(Handler handler, AnonymousClass9P8 r2);

    void BrS(Surface surface);

    void Bsi(int i);

    void flush();

    void release();

    @Deprecated
    void reset();

    @Deprecated
    void start();

    @Deprecated
    void stop();
}
