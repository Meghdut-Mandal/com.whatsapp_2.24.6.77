package X;

import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5a9  reason: invalid class name and case insensitive filesystem */
public abstract class C110115a9 {
    public static final List A00(DiscoveryBots discoveryBots) {
        if (discoveryBots == null) {
            return C023409w.A00;
        }
        List<AnonymousClass6BC> list = discoveryBots.A02;
        ArrayList A03 = AnonymousClass03T.A03(discoveryBots.A01);
        for (AnonymousClass6BC r0 : list) {
            AnonymousClass03Y.A0B(r0.A02, A03);
        }
        return A03;
    }
}
