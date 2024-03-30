package com.whatsapp.suggestions.networking;

import X.C20810yC;
import X.C27591Ow;

public final class SuggestedContactsFetcher {
    public final C20810yC A00;
    public final C27591Ow A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r10, X.C023509x r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C21934Ad9
            if (r0 == 0) goto L_0x00e3
            r4 = r11
            X.Ad9 r4 = (X.C21934Ad9) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e3
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r6 = 1
            if (r0 == 0) goto L_0x00a0
            if (r0 != r6) goto L_0x00ea
            X.AnonymousClass0AN.A00(r2)
        L_0x0020:
            X.9Y8 r2 = (X.AnonymousClass9Y8) r2
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts> r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.class
            java.lang.String r0 = "xwa2_growth_suggested_contacts"
            X.9Y8 r2 = r2.A03(r1, r0)
            X.AnonymousClass00C.A08(r2)
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts$Signals> r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.Signals.class
            java.lang.String r0 = "signals"
            X.1Ak r1 = r2.A04(r1, r0)
            X.AnonymousClass00C.A08(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0041
            X.09w r6 = X.C023409w.A00
        L_0x0040:
            return r6
        L_0x0041:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r1.iterator()
        L_0x0049:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0040
            X.9Y8 r2 = X.C165617ti.A0C(r8)
            if (r2 == 0) goto L_0x0049
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r7 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "name"
            java.lang.Enum r5 = r2.A06(r7, r0)
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r5 = (com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType) r5
            java.util.ArrayList r4 = X.C36411kG.A13(r5)
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts$Signals$Contacts> r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.Signals.Contacts.class
            java.lang.String r0 = "contacts"
            X.1Ak r0 = r2.A04(r1, r0)
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0072:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0095
            X.9Y8 r0 = X.C165617ti.A0C(r3)
            if (r0 == 0) goto L_0x0072
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "jid"
            java.lang.String r2 = X.C36411kG.A10(r0, r1)
            java.lang.String r0 = "rank"
            int r1 = r1.optInt(r0)
            X.6Ae r0 = new X.6Ae
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0072
        L_0x0095:
            if (r5 == r7) goto L_0x0049
            X.6Af r0 = new X.6Af
            r0.<init>(r5, r4)
            r6.add(r0)
            goto L_0x0049
        L_0x00a0:
            X.AnonymousClass0AN.A00(r2)
            X.1Ow r7 = r9.A01
            com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsQueryImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsQueryImpl$Builder
            r0.<init>()
            X.9VA r3 = r0.A00
            java.lang.String r0 = "input"
            r3.A00(r10, r0)
            boolean r0 = X.AnonymousClass000.A1V(r10)
            X.C20740y5.A06(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.class
            java.lang.String r1 = "GetSuggestedContacts"
            X.9JF r0 = new X.9JF
            r0.<init>(r3, r2, r1)
            X.9fL r3 = r7.A01(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            X.0yC r1 = r9.A00
            r0 = 5652(0x1614, float:7.92E-42)
            int r0 = r1.A07(r0)
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            r3.A00 = r0
            r4.L$0 = r9
            r4.label = r6
            X.AoD r0 = X.C22531AoD.A00
            java.lang.Object r2 = r3.A01(r4, r0)
            if (r2 != r5) goto L_0x0020
            return r5
        L_0x00e3:
            X.Ad9 r4 = new X.Ad9
            r4.<init>(r9, r11)
            goto L_0x0012
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.networking.SuggestedContactsFetcher.A00(com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput, X.09x):java.lang.Object");
    }

    public SuggestedContactsFetcher(C20810yC r1, C27591Ow r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
