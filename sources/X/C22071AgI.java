package X;

import android.bluetooth.BluetoothSocket;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AgI  reason: case insensitive filesystem */
public final class C22071AgI extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22071AgI(AnonymousClass8AA r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass88I r6;
        AnonymousClass88C r1;
        C22071AgI.super.A07();
        AnonymousClass8AA r4 = this.this$0;
        C200159gk r3 = AnonymousClass9AO.A01;
        r3.A01("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION]: Called handleLinkedDeviceSetup()");
        AnonymousClass84B r7 = r4.A00;
        AnonymousClass9Y3 r62 = r7.A01;
        r3.A01("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION]: Called getSocket()");
        C23090B4a b4a = r7.A0H;
        if (b4a != null) {
            b4a.BPK("socket_connection_request");
        }
        List list = r62.A0B;
        B2N b2n = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r7.A08(new C1695289r("SOCKET_CONNECTION_ERROR_ESTABLISHING_DEVICE_CONNECTION"), (Throwable) null, false);
                    break;
                }
                AnonymousClass88I r8 = (AnonymousClass88I) it.next();
                try {
                    B2N A00 = C198389dT.A00.A00(r8, r7);
                    r3.A02("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION]: Connected to BTC socket");
                    r62.A0D.set(false);
                    r62.A07 = r8;
                    b2n = A00;
                    break;
                } catch (IllegalStateException e) {
                    r3.A06("sup:SocketConnectionStateDelegate", e.getMessage(), (Throwable) null);
                    AnonymousClass8AA.A00(r4);
                } catch (IOException e2) {
                    r3.A07("sup:SocketConnectionStateDelegate", "Error opening and connecting socket", e2);
                    AnonymousClass8AA.A00(r4);
                } catch (Exception e3) {
                    r3.A07("sup:SocketConnectionStateDelegate", "unhandled exception", e3);
                }
            }
        }
        r62.A04 = b2n;
        if (!(b2n == null || (r6 = r62.A07) == null || (r1 = r6.A01) == null)) {
            Closeable BA3 = b2n.BA3();
            AnonymousClass00C.A0E(BA3, "null cannot be cast to non-null type android.bluetooth.BluetoothSocket");
            C199069ee r72 = new C199069ee((BluetoothSocket) BA3, r1.A00, AnonymousClass97B.A00(r4, 6), AnonymousClass97B.A00(r4, 7), new C1898895z(r4, 1));
            r72.A03 = AnonymousClass97B.A00(r4, 8);
            r72.A02 = new AnonymousClass96N(r4, 0);
            r3.A01("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION]: Open linked device...");
            r72.A01();
            r6.A00 = r72;
        }
        return AnonymousClass0AJ.A00;
    }
}
