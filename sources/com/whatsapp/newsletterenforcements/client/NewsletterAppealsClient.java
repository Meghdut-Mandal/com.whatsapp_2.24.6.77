package com.whatsapp.newsletterenforcements.client;

import X.AnonymousClass00C;
import X.AnonymousClass2Z0;
import X.AnonymousClass2Z1;
import X.AnonymousClass2Z2;
import X.C005502l;
import X.C36411kG;
import X.C61563Cm;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

public final class NewsletterAppealsClient {
    public final C61563Cm A00;
    public final C005502l A01;

    public NewsletterAppealsClient(C61563Cm r2, C005502l r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final AnonymousClass2Z1 A00(NewsletterGeoSuspendAppealStateResponseImpl newsletterGeoSuspendAppealStateResponseImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterGeoSuspendAppealStateResponseImpl.A06(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        AnonymousClass00C.A08(graphQLXWA2AppealState);
        String A07 = newsletterGeoSuspendAppealStateResponseImpl.A07("creation_time");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterGeoSuspendAppealStateResponseImpl.A06(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        AnonymousClass00C.A08(graphQLXWA2ViolationCategory);
        return new AnonymousClass2Z1((GraphQLXWA2AppealReason) newsletterGeoSuspendAppealStateResponseImpl.A06(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason"), graphQLXWA2AppealState, graphQLXWA2ViolationCategory, A07, C36411kG.A10("country_code", newsletterGeoSuspendAppealStateResponseImpl.A00));
    }

    public static final AnonymousClass2Z2 A01(NewsletterViolatingMessageAppealStateResponseImpl newsletterViolatingMessageAppealStateResponseImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterViolatingMessageAppealStateResponseImpl.A06(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        AnonymousClass00C.A08(graphQLXWA2AppealState);
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterViolatingMessageAppealStateResponseImpl.A06(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        AnonymousClass00C.A08(graphQLXWA2ViolationCategory);
        return new AnonymousClass2Z2((GraphQLXWA2AppealReason) newsletterViolatingMessageAppealStateResponseImpl.A06(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason"), graphQLXWA2AppealState, graphQLXWA2ViolationCategory, newsletterViolatingMessageAppealStateResponseImpl.A07("creation_time"), C36411kG.A10("server_msg_id", newsletterViolatingMessageAppealStateResponseImpl.A00));
    }

    public static final AnonymousClass2Z0 A02(NewsletterSuspendAppealStateResponseImpl newsletterSuspendAppealStateResponseImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterSuspendAppealStateResponseImpl.A06(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        AnonymousClass00C.A08(graphQLXWA2AppealState);
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterSuspendAppealStateResponseImpl.A06(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        AnonymousClass00C.A08(graphQLXWA2ViolationCategory);
        return new AnonymousClass2Z0((GraphQLXWA2AppealReason) newsletterSuspendAppealStateResponseImpl.A06(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason"), graphQLXWA2AppealState, graphQLXWA2ViolationCategory, newsletterSuspendAppealStateResponseImpl.A07("creation_time"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C28981Uw r12, java.lang.String r13, java.lang.String r14, X.C023509x r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C82443yi
            r7 = r11
            if (r0 == 0) goto L_0x003c
            r4 = r15
            X.3yi r4 = (X.C82443yi) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x0042
            X.AnonymousClass0AN.A00(r3)
        L_0x0021:
            X.AnonymousClass00C.A0A(r3)
            return r3
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            X.02l r0 = r11.A01
            r10 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createGeosuspensionAppeal$2 r5 = new com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createGeosuspensionAppeal$2
            r6 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003c:
            X.3yi r4 = new X.3yi
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient.A03(X.1Uw, java.lang.String, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C28981Uw r12, java.lang.String r13, java.lang.String r14, X.C023509x r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C82463yk
            r7 = r11
            if (r0 == 0) goto L_0x003c
            r4 = r15
            X.3yk r4 = (X.C82463yk) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x0042
            X.AnonymousClass0AN.A00(r3)
        L_0x0021:
            X.AnonymousClass00C.A0A(r3)
            return r3
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            X.02l r0 = r11.A01
            r10 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createViolatingMessageAppeal$2 r5 = new com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createViolatingMessageAppeal$2
            r6 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003c:
            X.3yk r4 = new X.3yk
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient.A04(X.1Uw, java.lang.String, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C28981Uw r7, java.lang.String r8, X.C023509x r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C82453yj
            if (r0 == 0) goto L_0x0038
            r5 = r9
            X.3yj r5 = (X.C82453yj) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x003e
            X.AnonymousClass0AN.A00(r1)
        L_0x0020:
            X.AnonymousClass00C.A0A(r1)
            return r1
        L_0x0024:
            X.AnonymousClass0AN.A00(r1)
            X.02l r2 = r6.A01
            r1 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createSuspensionAppeal$2 r0 = new com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createSuspensionAppeal$2
            r0.<init>(r7, r6, r8, r1)
            r5.label = r3
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0038:
            X.3yj r5 = new X.3yj
            r5.<init>(r6, r9)
            goto L_0x0012
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient.A05(X.1Uw, java.lang.String, X.09x):java.lang.Object");
    }
}
