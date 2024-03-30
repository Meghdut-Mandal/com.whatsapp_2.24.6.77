package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.9zg  reason: invalid class name and case insensitive filesystem */
public class C209239zg implements C23079B3l {
    public final MediaCodec A00;

    public void B3R(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i) {
        this.A00.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    public void Bmh(int i, int i2, int i3, long j, int i4) {
        this.A00.queueInputBuffer(i, 0, i3, j, i4);
    }

    public void Bmj(AnonymousClass9OC r8, int i, int i2, int i3, long j) {
        this.A00.queueSecureInputBuffer(i, 0, r8.A08, j, 0);
    }

    public void BnR(int i, boolean z) {
        this.A00.releaseOutputBuffer(i, false);
    }

    public int B5G() {
        return this.A00.dequeueInputBuffer(0);
    }

    public int B5J(MediaCodec.BufferInfo bufferInfo) {
        while (true) {
            int dequeueOutputBuffer = this.A00.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer != -3 && dequeueOutputBuffer != -3) {
                return dequeueOutputBuffer;
            }
        }
    }

    public ByteBuffer BCk(int i) {
        return this.A00.getInputBuffer(i);
    }

    public ByteBuffer BEn(int i) {
        return this.A00.getOutputBuffer(i);
    }

    public MediaFormat BEp() {
        return this.A00.getOutputFormat();
    }

    public void BnQ(int i, long j) {
        this.A00.releaseOutputBuffer(i, j);
    }

    public void BrM(Handler handler, AnonymousClass9P8 r4) {
        this.A00.setOnFrameRenderedListener(new C204289pl(this, r4), handler);
    }

    public void BrS(Surface surface) {
        this.A00.setOutputSurface(surface);
    }

    public void Bsi(int i) {
        this.A00.setVideoScalingMode(i);
    }

    public void flush() {
        this.A00.flush();
    }

    public void release() {
        this.A00.release();
    }

    public void reset() {
        this.A00.reset();
    }

    public void start() {
        this.A00.start();
    }

    public void stop() {
        this.A00.stop();
    }

    public C209239zg(String str) {
        this.A00 = MediaCodec.createByCodecName(str);
    }
}
