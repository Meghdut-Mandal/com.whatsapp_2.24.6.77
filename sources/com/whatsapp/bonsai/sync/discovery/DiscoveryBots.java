package com.whatsapp.bonsai.sync.discovery;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C1277169j;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import java.util.List;

public final class DiscoveryBots {
    public final long A00;
    public final C1277169j A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoveryBots) {
                DiscoveryBots discoveryBots = (DiscoveryBots) obj;
                if (!AnonymousClass00C.A0J(this.A01, discoveryBots.A01) || !AnonymousClass00C.A0J(this.A02, discoveryBots.A02) || this.A00 != discoveryBots.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36351kA.A05(this.A02, C36391kE.A0A(this.A01)));
    }

    public DiscoveryBots(C1277169j r1, List list, long j) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DiscoveryBots(defaultBot=");
        A0u.append(this.A01);
        A0u.append(", sections=");
        A0u.append(this.A02);
        A0u.append(", timestampMs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
