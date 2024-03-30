package androidx.media;

import X.AnonymousClass0XJ;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AnonymousClass0XJ r3) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.A01 = (AudioAttributes) r3.A02(audioAttributesImplApi26.A01, 1);
        audioAttributesImplApi26.A00 = r3.A01(audioAttributesImplApi26.A00, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AnonymousClass0XJ r3) {
        r3.A07(audioAttributesImplApi26.A01, 1);
        r3.A06(audioAttributesImplApi26.A00, 2);
    }
}
