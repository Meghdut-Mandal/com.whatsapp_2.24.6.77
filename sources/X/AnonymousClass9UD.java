package X;

import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.9UD  reason: invalid class name */
public final class AnonymousClass9UD {
    public final C28981Uw A00;
    public final C30131Zi A01;
    public final C26141Ja A02;

    public AnonymousClass9UD(C26141Ja r2, C28981Uw r3, C30131Zi r4) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = r4;
    }

    public final void A00(int i) {
        C30131Zi r2;
        C28981Uw r1;
        C52282pB r0;
        if (i != 404) {
            if (i == 423) {
                r2 = this.A01;
                r1 = this.A00;
                r0 = C52282pB.SUSPENDED;
            } else if (i == 451) {
                r2 = this.A01;
                r1 = this.A00;
                r0 = C52282pB.GEOSUSPENDED;
            } else {
                return;
            }
            r2.A04(r0, r1);
            return;
        }
        this.A01.A07(this.A00);
    }

    public final void A01(GraphQLXWA2NewsletterStateType graphQLXWA2NewsletterStateType) {
        if (graphQLXWA2NewsletterStateType != null) {
            int ordinal = graphQLXWA2NewsletterStateType.ordinal();
            int i = 423;
            if (ordinal != 2) {
                i = 451;
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        i = 404;
                    } else {
                        return;
                    }
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                A00(valueOf.intValue());
            }
        }
    }
}
