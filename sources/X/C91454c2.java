package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4c2  reason: invalid class name and case insensitive filesystem */
public class C91454c2 extends ConnectivityManager.NetworkCallback {
    public volatile Network A00;
    public final /* synthetic */ C27001Mi A01;

    public C91454c2(C27001Mi r1) {
        this.A01 = r1;
    }

    private void A00(Network network, boolean z) {
        String str;
        if (this.A00 == null) {
            return;
        }
        if (network == null || network.equals(this.A00)) {
            this.A00 = null;
            C27001Mi r4 = this.A01;
            r4.A02.A00();
            C20720y3 r0 = r4.A03;
            r0.A0D(-1, false, z);
            r0.A0H(false, false);
            if (z) {
                AnonymousClass19O r3 = r4.A04;
                Integer num = r3.A04;
                if (num != null) {
                    str = num.toString();
                } else {
                    str = null;
                }
                C19420v0 r42 = r3.A0A;
                List A0o = r42.A0o();
                AnonymousClass00C.A08(A0o);
                if (str != null && !A0o.contains(str)) {
                    ArrayList A15 = C36441kJ.A15(A0o);
                    A15.add(str);
                    if (A15.size() > 10) {
                        AnonymousClass03Y.A09(A15);
                    }
                    C36341k9.A0x(C19420v0.A00(r42), "network:last_blocked_session_ids", AnonymousClass14B.A07(",", C007103b.A0d(A15, 10)));
                }
                if (!r3.A06 && AnonymousClass19O.A02(r3, "xmpp-bg-to-blocked")) {
                    r3.A06 = true;
                }
            }
        }
    }

    public void onUnavailable() {
        Log.i("xmpp/handler/network/network-callback onUnavailable");
        A00((Network) null, false);
    }

    public void onAvailable(Network network) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("xmpp/handler/network/network-callback onAvailable:");
        A0u.append(network);
        A0u.append(" handle:");
        C36351kA.A1S(A0u, network.getNetworkHandle());
    }

    public void onBlockedStatusChanged(Network network, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("xmpp/handler/network/network-callback onBlockedStatusChanged network:");
        A0u.append(network);
        A0u.append(" blocked:");
        A0u.append(z);
        A0u.append(" handle:");
        C36351kA.A1S(A0u, network.getNetworkHandle());
        if (z) {
            A00(network, true);
            return;
        }
        this.A00 = network;
        C27001Mi r1 = this.A01;
        boolean A002 = C27001Mi.A00(network, r1);
        long networkHandle = network.getNetworkHandle();
        r1.A02.A00();
        C20720y3 r12 = r1.A03;
        r12.A0D(networkHandle, AnonymousClass000.A1Q(A002 ? 1 : 0), false);
        r12.A0H(A002, false);
    }

    public void onLost(Network network) {
        C36321k7.A1K(network, "xmpp/handler/network/network-callback onLost:", AnonymousClass000.A0u());
        A00(network, false);
    }
}
