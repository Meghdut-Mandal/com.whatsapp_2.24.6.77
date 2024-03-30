package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* renamed from: X.6lH  reason: invalid class name and case insensitive filesystem */
public class C140246lH implements C23014B0f {
    public MediaRecorder A00;
    public final MediaRecorder.OnErrorListener A01 = new C133656Zm(this);
    public final MediaRecorder.OnInfoListener A02 = new C133666Zn(this);
    public final C159927kB A03;
    public final boolean A04;

    public C199989gN Bv0(CamcorderProfile camcorderProfile, AnonymousClass7cE r12, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str3 = str;
        FileDescriptor fd = new RandomAccessFile(str, "rws").getFD();
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        C159927kB r3 = this.A03;
        r3.BgR(mediaRecorder);
        boolean z4 = this.A04;
        MediaRecorder mediaRecorder2 = this.A00;
        if (z4) {
            mediaRecorder2.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        int i3 = i2;
        this.A00.setOrientationHint(i3);
        this.A00.setOutputFile(fd);
        this.A00.setOnInfoListener(this.A02);
        this.A00.setOnErrorListener(this.A01);
        this.A00.prepare();
        r3.BhG(this.A00);
        this.A00.start();
        return C90514aH.A0W(camcorderProfile, new C195099Sm(str3, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i3, i));
    }

    public void Bv9() {
        MediaRecorder mediaRecorder = this.A00;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
            } catch (RuntimeException e) {
                Log.e("SimpleVideoCapture", "stopVideoRecording", e);
                throw AnonymousClass001.A0B(e);
            } catch (Throwable th) {
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
                throw th;
            }
        }
    }

    public C140246lH(C159927kB r2, boolean z) {
        this.A04 = z;
        this.A03 = r2;
    }
}
