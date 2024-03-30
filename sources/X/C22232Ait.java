package X;

import java.io.IOException;

/* renamed from: X.Ait  reason: case insensitive filesystem */
public final class C22232Ait extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Throwable $throwable;
    public final /* synthetic */ AnonymousClass8AA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22232Ait(AnonymousClass8AA r2, Throwable th) {
        super(0);
        this.$throwable = th;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Throwable th = this.$throwable;
        if (th instanceof C187298xc) {
            str = "SOCKET_CONNECTION_DEVICE_PROTOCOL_ERROR";
        } else if (th instanceof IOException) {
            str = "SOCKET_CONNECTION_DEVICE_IO_EXCEPTION";
        } else {
            str = "SOCKET_CONNECTION_UNKNOWN_ERROR";
        }
        this.this$0.A00.A08(new C1695289r(str), th, true);
        return AnonymousClass0AJ.A00;
    }
}
