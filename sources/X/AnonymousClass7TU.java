package X;

import com.whatsapp.voicetranscription.Resample48khzTo16khzKt$resample48khzTo16khz$1;

/* renamed from: X.7TU  reason: invalid class name */
public final class AnonymousClass7TU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $truncate48khzAudio;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TU(C006302t r2) {
        super(1);
        this.$truncate48khzAudio = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        C16970qV r1 = (C16970qV) this.$truncate48khzAudio.invoke(obj);
        AnonymousClass00C.A0D(r1, 0);
        return new C18650tV(new Resample48khzTo16khzKt$resample48khzTo16khz$1((C023509x) null, r1), 1);
    }
}
