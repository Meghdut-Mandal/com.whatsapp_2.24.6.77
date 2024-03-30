package X;

import java.util.Map;

/* renamed from: X.9Wi  reason: invalid class name and case insensitive filesystem */
public final class C195859Wi {
    public final C193399Lh A00;
    public final C199709fp A01;
    public final Map A02;
    public final Map A03;

    public C195859Wi(C193399Lh r2, C199709fp r3, Map map, Map map2) {
        AnonymousClass00C.A0D(map2, 4);
        this.A01 = r3;
        this.A03 = map;
        this.A00 = r2;
        this.A02 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195859Wi) {
                C195859Wi r5 = (C195859Wi) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A00, C36351kA.A05(this.A03, C36391kE.A0A(this.A01))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StanzaConfig(connectionThreadRequests=");
        A0u.append(this.A01);
        A0u.append(", pendingServerRequests=");
        A0u.append(this.A03);
        A0u.append(", companionXmppReadInterceptor=");
        A0u.append(this.A00);
        A0u.append(", ackKickSeenIds=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
