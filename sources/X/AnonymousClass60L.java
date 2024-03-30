package X;

import android.media.MediaFormat;

/* renamed from: X.60L  reason: invalid class name */
public class AnonymousClass60L {
    public C128986Em A00;

    public void A00(C118715oc r8) {
        C108365Tf r4 = C108365Tf.CODEC_ANDROID_AUDIO_AAC;
        C121015sS r6 = new C121015sS(r4);
        r6.A01 = r8.A00;
        AnonymousClass60J r0 = r8.A01;
        if (r0 != null) {
            r6.A00 = r0.A00;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(r6.A02.value, 44100, 2);
        createAudioFormat.setInteger("aac-profile", r6.A00);
        createAudioFormat.setInteger("max-input-size", 64000);
        createAudioFormat.setInteger("bitrate", r6.A01);
        createAudioFormat.setInteger("sample-rate", 44100);
        createAudioFormat.setInteger("channel-count", 2);
        C128986Em A02 = AnonymousClass6Xb.A02(createAudioFormat, C107835Rb.BUFFERS, r4.value, (String) null);
        this.A00 = A02;
        A02.A02();
    }
}
