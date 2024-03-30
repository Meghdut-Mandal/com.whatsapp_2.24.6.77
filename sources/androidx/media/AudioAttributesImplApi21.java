package androidx.media;

import X.AnonymousClass000;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public int A00 = -1;
    public AudioAttributes A01;

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.A01 = audioAttributes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.A01.equals(((AudioAttributesImplApi21) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioAttributesCompat: audioattributes=");
        return AnonymousClass000.A0o(this.A01, A0u);
    }

    public AudioAttributesImplApi21() {
    }
}
