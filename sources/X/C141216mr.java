package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.wamediajni.WamediaProcessingException;
import com.facebook.wamediajni.WamediaStreamsMP4Muxer;
import java.nio.ByteBuffer;

/* renamed from: X.6mr  reason: invalid class name and case insensitive filesystem */
public class C141216mr implements C160907lm {
    public C123085vu A00;
    public WamediaStreamsMP4Muxer A01;
    public boolean A02;

    public void B3Q(String str) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = new WamediaStreamsMP4Muxer(this.A00, str);
        wamediaStreamsMP4Muxer.initialize();
        this.A01 = wamediaStreamsMP4Muxer;
    }

    public void BqF(MediaFormat mediaFormat) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeSetAudioMediaFormat(mediaFormat);
        }
    }

    public void BrP(int i) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeSetOrientationHint(i);
        }
    }

    public void Bsh(MediaFormat mediaFormat) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeSetVideoMediaFormat(mediaFormat);
        }
    }

    public void BxZ(C159937kC r9) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            ByteBuffer B95 = r9.B95();
            MediaCodec.BufferInfo B91 = r9.B91();
            try {
                wamediaStreamsMP4Muxer.mNativeWrapper.nativeWriteAudioSampleData(B95, B91.offset, B91.size, B91.flags, B91.presentationTimeUs);
            } catch (WamediaProcessingException e) {
                throw e;
            } catch (WamediaProcessingException e2) {
                throw new AnonymousClass5VE(e2);
            }
        }
    }

    public void Bxg(C159937kC r9) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            ByteBuffer B95 = r9.B95();
            MediaCodec.BufferInfo B91 = r9.B91();
            try {
                wamediaStreamsMP4Muxer.mNativeWrapper.nativeWriteVideoSampleData(B95, B91.offset, B91.size, B91.flags, B91.presentationTimeUs);
            } catch (WamediaProcessingException e) {
                throw e;
            } catch (WamediaProcessingException e2) {
                throw new AnonymousClass5VE(e2);
            }
        }
    }

    public void start() {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeStart();
            wamediaStreamsMP4Muxer.A00 = true;
            this.A02 = true;
        }
    }

    public void stop() {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A01;
        if (wamediaStreamsMP4Muxer != null) {
            if (wamediaStreamsMP4Muxer.A00) {
                wamediaStreamsMP4Muxer.mNativeWrapper.nativeStop();
                wamediaStreamsMP4Muxer.A00 = false;
            }
            this.A02 = false;
        }
    }

    public C141216mr(C123085vu r1) {
        this.A00 = r1;
    }

    public boolean BNK() {
        return this.A02;
    }
}
