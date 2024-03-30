package X;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

/* renamed from: X.6iH  reason: invalid class name and case insensitive filesystem */
public class C138546iH implements C158907iR {
    public final AudioAttributes.Builder A00 = new AudioAttributes.Builder();

    public C138546iH A00(int i) {
        this.A00.setUsage(1);
        return this;
    }

    public /* bridge */ /* synthetic */ C158907iR Bse(int i) {
        A00(1);
        return this;
    }

    public AudioAttributesImpl B21() {
        return new AudioAttributesImplApi21(this.A00.build());
    }
}
