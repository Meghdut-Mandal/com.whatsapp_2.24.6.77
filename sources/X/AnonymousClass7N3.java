package X;

import android.media.MediaCodec;

/* renamed from: X.7N3  reason: invalid class name */
public final class AnonymousClass7N3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass5R9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7N3(AnonymousClass5R9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        Object obj2;
        this.this$0.A04.clear();
        AnonymousClass00T r1 = this.this$0.A02;
        AnonymousClass00C.A0D(r1, 0);
        if (r1.BM2()) {
            obj = r1.getValue();
        } else {
            obj = null;
        }
        C127976Aj r0 = (C127976Aj) obj;
        if (r0 != null) {
            MediaCodec mediaCodec = r0.A01;
            mediaCodec.stop();
            mediaCodec.release();
        }
        AnonymousClass00T r12 = this.this$0.A03;
        AnonymousClass00C.A0D(r12, 0);
        if (r12.BM2()) {
            obj2 = r12.getValue();
        } else {
            obj2 = null;
        }
        AnonymousClass611 r02 = (AnonymousClass611) obj2;
        if (r02 != null) {
            r02.A00.release();
        }
        return AnonymousClass0AJ.A00;
    }
}
