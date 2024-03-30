package X;

import java.io.IOException;

/* renamed from: X.AgJ  reason: case insensitive filesystem */
public final class C22072AgJ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8A9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22072AgJ(AnonymousClass8A9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22072AgJ.super.A07();
        C200159gk r5 = AnonymousClass9AO.A01;
        AnonymousClass8A9 r1 = this.this$0;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[SOCKET_CONNECTION_TCP] Connecting to TCP socket, ip: ");
        AnonymousClass84B r12 = r1.A00;
        A0u.append(r12.A02);
        A0u.append(", port: ");
        r5.A02("sup:SocketConnectionTcpStateDelegate", C36381kD.A10(A0u, r12.A00));
        try {
            C23090B4a b4a = this.this$0.A00.A0H;
            if (b4a != null) {
                b4a.BPK("socket_connection_request");
            }
            AnonymousClass84B r3 = this.this$0.A00;
            r3.A01.A04 = C198389dT.A00.A00((AnonymousClass88I) null, r3);
            AnonymousClass84B r32 = this.this$0.A00;
            AnonymousClass81Q.A01(r32.A0D, r32, AnonymousClass84B.A0S, 10);
        } catch (IOException e) {
            r5.A05("sup:SocketConnectionTcpStateDelegate", "Failed to connect to TCP socket", e);
            AnonymousClass81Q.A02(this.this$0.A00, "SOCKET_CONNECTION_CONNECT_TO_SOCKET_FAIL");
        }
        return AnonymousClass0AJ.A00;
    }
}
