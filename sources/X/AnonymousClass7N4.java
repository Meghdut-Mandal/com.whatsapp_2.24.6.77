package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.7N4  reason: invalid class name */
public final class AnonymousClass7N4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass5R9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7N4(AnonymousClass5R9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        MediaExtractor mediaExtractor = ((AnonymousClass611) this.this$0.A03.getValue()).A00;
        C36321k7.A1T("AudioDecoderInputStream/Number of tracks: ", AnonymousClass000.A0u(), mediaExtractor.getTrackCount());
        ArrayList A0I = AnonymousClass001.A0I();
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            AnonymousClass00C.A08(trackFormat);
            String string = trackFormat.getString("mime");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("AudioDecoderInputStream/createDecoder: ");
            A0u.append(i);
            A0u.append("; mime: ");
            A0u.append(string);
            C36321k7.A1K(trackFormat, "; format: ", A0u);
            if (string != null && AnonymousClass098.A07(string, "audio", false)) {
                try {
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
                    Log.i("AudioDecoderInputStream/decoder created");
                    createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    Log.i("AudioDecoderInputStream/decoder configured");
                    return new C127976Aj(createDecoderByType, i);
                } catch (IllegalArgumentException e) {
                    A0I.add(string);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("AudioDecoderInputStream/createDecoder can't create decoder for ");
                    C36351kA.A1P(string, A0u2, e);
                }
            }
        }
        if (A0I.size() == 0) {
            Log.w("AudioDecoderInputStream/createDecoder failed to find an audio track");
            throw new AnonymousClass5R4(AnonymousClass5S0.NO_AUDIO);
        }
        C36321k7.A1L(A0I, "AudioDecoderInputStream/createDecoder failed to create decoder for the following mimes: ", AnonymousClass000.A0u());
        throw new AnonymousClass5R4(AnonymousClass5S0.DECODER_CREATION_FAILED);
    }
}
