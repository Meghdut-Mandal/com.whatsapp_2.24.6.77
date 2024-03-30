package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.6jJ  reason: invalid class name and case insensitive filesystem */
public final class C139146jJ implements C23070B2z {
    public boolean BLm(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return false;
    }

    public boolean BpX() {
        return false;
    }

    public boolean BLn(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
            return false;
        }
        return true;
    }

    public int B9p() {
        return MediaCodecList.getCodecCount();
    }

    public MediaCodecInfo B9q(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }
}
