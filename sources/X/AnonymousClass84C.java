package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.84C  reason: invalid class name */
public class AnonymousClass84C extends C195539Ur {
    public final AnonymousClass84B A00;
    public final AtomicBoolean A01 = new AtomicBoolean();

    public void A07() {
        this.A01.set(true);
    }

    public void A08() {
        this.A01.set(false);
    }

    public String A0A() {
        if (this instanceof AnonymousClass8AB) {
            return "sup:WiFiDirectStateDelegate";
        }
        if (this instanceof AnonymousClass8AE) {
            return "sup:StreamingStateDelegate";
        }
        if (this instanceof AnonymousClass8A9) {
            return "sup:SocketConnectionTcpStateDelegate";
        }
        if (this instanceof AnonymousClass8AA) {
            return "sup:SocketConnectionStateDelegate";
        }
        if (this instanceof AnonymousClass8AF) {
            return "sup:LiveStreamAppStateDelegate";
        }
        if (this instanceof AnonymousClass8AH) {
            return "sup:MediaStreamServiceTcpStateDelegate";
        }
        if (this instanceof AnonymousClass8AG) {
            return "sup:MediaStreamServiceBtcStateDelegate";
        }
        if (this instanceof AnonymousClass8AC) {
            return "sup:LinkedAppManagerStateDelegate";
        }
        if (this instanceof AnonymousClass8AD) {
            return "sup:InitialStateDelegate";
        }
        if (this instanceof AnonymousClass8A7) {
            return "sup:IdleStateDelegate";
        }
        if (this instanceof AnonymousClass8A6) {
            return "sup:DiscoveredStateDelegate";
        }
        if (this instanceof AnonymousClass8A8) {
            return "sup:ConnectedStateDelegate";
        }
        return "sup:BaseStateDelegate";
    }

    public final void A0B(AnonymousClass00S r4) {
        if (!this.A01.get() || !this.A00.A04.getThread().isAlive()) {
            AnonymousClass9AO.A01.A01(A0A(), "call back executed outside of scope");
        } else {
            r4.invoke();
        }
    }

    public AnonymousClass84C(AnonymousClass84B r2) {
        this.A00 = r2;
    }
}
