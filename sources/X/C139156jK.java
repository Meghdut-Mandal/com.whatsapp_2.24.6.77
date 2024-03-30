package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.6jK  reason: invalid class name and case insensitive filesystem */
public final class C139156jK implements C23070B2z {
    public MediaCodecInfo[] A00;
    public final int A01;

    public boolean BpX() {
        return true;
    }

    public int B9p() {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    public MediaCodecInfo B9q(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    public C139156jK(boolean z) {
        this.A01 = C90504aG.A1T(z ? 1 : 0) ? 1 : 0;
    }

    public boolean BLm(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public boolean BLn(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
