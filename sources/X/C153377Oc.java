package X;

import com.whatsapp.audioRecording.OpusRecorderFactory;

/* renamed from: X.7Oc  reason: invalid class name and case insensitive filesystem */
public final class C153377Oc extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20810yC $abProps;
    public final /* synthetic */ OpusRecorderFactory $opusRecorderFactory;
    public final /* synthetic */ AnonymousClass6Q9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153377Oc(OpusRecorderFactory opusRecorderFactory, C20810yC r3, AnonymousClass6Q9 r4) {
        super(0);
        this.$opusRecorderFactory = opusRecorderFactory;
        this.this$0 = r4;
        this.$abProps = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        OpusRecorderFactory opusRecorderFactory = this.$opusRecorderFactory;
        AnonymousClass6Q9 r0 = this.this$0;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C36431kI.A1E(r0.A07));
        return opusRecorderFactory.createOpusRecorder(AnonymousClass000.A0q(".opus", A0u), this.$abProps.A0E(6501));
    }
}
