package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.List;

/* renamed from: X.9zi  reason: invalid class name and case insensitive filesystem */
public class C209259zi implements B4Y {
    public C202149l7 BFF() {
        C202149l7 r0;
        List A03 = C203599oN.A03("audio/raw", false);
        if (A03.isEmpty() || (r0 = (C202149l7) A03.get(0)) == null) {
            return null;
        }
        return new C202149l7((MediaCodecInfo.CodecCapabilities) null, r0.A02, (String) null, true, false, true, true, false, false);
    }

    public List BAq(String str, boolean z, boolean z2) {
        List A03 = C203599oN.A03(str, z);
        Log.d("MediaCodecSelector", AnonymousClass000.A0l(A03, "default mediacodec order:", AnonymousClass000.A0u()));
        return A03;
    }
}
