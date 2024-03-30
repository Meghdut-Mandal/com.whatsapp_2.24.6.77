package androidx.media;

import X.AnonymousClass0XJ;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AnonymousClass0XJ r3) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.A00;
        if (r3.A09(1)) {
            obj = r3.A04();
        }
        audioAttributesCompat.A00 = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AnonymousClass0XJ r2) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        r2.A05(1);
        r2.A08(audioAttributesImpl);
    }
}
