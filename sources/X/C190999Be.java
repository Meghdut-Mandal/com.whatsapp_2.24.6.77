package X;

import android.media.AudioAttributes;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9Be  reason: invalid class name and case insensitive filesystem */
public final class C190999Be {
    public final AudioAttributes A00;

    public C190999Be(C199379fD r4) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(r4.A01);
        int i = Util.A00;
        if (i >= 29) {
            C1892993d.A00(usage);
            if (i >= 32) {
                C1893093e.A00(usage);
            }
        }
        this.A00 = usage.build();
    }
}
