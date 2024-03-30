package X;

import android.media.MediaCodec;
import com.whatsapp.util.Log;

/* renamed from: X.7N5  reason: invalid class name */
public final class AnonymousClass7N5 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass5R9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7N5(AnonymousClass5R9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C127976Aj r1 = (C127976Aj) this.this$0.A02.getValue();
        MediaCodec mediaCodec = r1.A01;
        ((AnonymousClass611) this.this$0.A03.getValue()).A00.selectTrack(r1.A00);
        mediaCodec.start();
        Log.i("AudioDecoderInputStream/decoder started");
        return AnonymousClass0AJ.A00;
    }
}
