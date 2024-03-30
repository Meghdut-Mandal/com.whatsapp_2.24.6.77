package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;
import java.util.List;

/* renamed from: X.6Af  reason: invalid class name and case insensitive filesystem */
public final class C127936Af {
    public final GraphQLXWA2SuggestedContactsSignalType A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127936Af) {
                C127936Af r5 = (C127936Af) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C127936Af(GraphQLXWA2SuggestedContactsSignalType graphQLXWA2SuggestedContactsSignalType, List list) {
        this.A00 = graphQLXWA2SuggestedContactsSignalType;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ServerSignal(signalType=");
        A0u.append(this.A00);
        A0u.append(", contactInfoList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
