package X;

import java.io.InputStream;

/* renamed from: X.7M3  reason: invalid class name */
public final class AnonymousClass7M3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ InputStream $this_transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7M3(InputStream inputStream) {
        super(0);
        this.$this_transform = inputStream;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(this.$this_transform.read());
    }
}
