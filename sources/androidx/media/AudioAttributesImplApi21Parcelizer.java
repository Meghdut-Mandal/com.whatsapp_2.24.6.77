package androidx.media;

import X.AnonymousClass0XJ;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AnonymousClass0XJ r3) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) r3.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = r3.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AnonymousClass0XJ r3) {
        r3.A07(audioAttributesImplApi21.A01, 1);
        r3.A06(audioAttributesImplApi21.A00, 2);
    }
}