package X;

import androidx.window.extensions.layout.WindowLayoutInfo;

/* renamed from: X.AkT  reason: case insensitive filesystem */
public final class C22305AkT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C207749wv $consumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22305AkT(C207749wv r2) {
        super(1);
        this.$consumer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        AnonymousClass00C.A0D(windowLayoutInfo, 0);
        this.$consumer.accept(windowLayoutInfo);
        return AnonymousClass0AJ.A00;
    }
}
