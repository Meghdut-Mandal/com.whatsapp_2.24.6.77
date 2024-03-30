package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.6jI  reason: invalid class name and case insensitive filesystem */
public class C139136jI implements AnonymousClass7eI {
    public final AnonymousClass5o8 A00;

    public C23079B3l B4L(String str, boolean z) {
        AnonymousClass5o8 r3 = this.A00;
        if (z && str.equals("meta.dav1d.av1.decoder")) {
            try {
                C23079B3l b3l = (C23079B3l) Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (b3l != null) {
                    return b3l;
                }
            } catch (Exception e) {
                Object[] A1b = C36411kG.A1b("exoplayer2.av1.src.Dav1dMediaCodecAdapter");
                C90514aH.A1U(e, A1b, 1);
                Log.w("CodecSuppierImpl", String.format("Exception when trying to instantiate %s: %s", A1b));
            }
        }
        if (!r3.A00 || !z || Util.A00 < 23) {
            return new C209239zg(str);
        }
        return new C209229zf(r3.A01).A02(str);
    }

    public C139136jI(boolean z, boolean z2) {
        this.A00 = new AnonymousClass5o8(z, z2);
    }
}
