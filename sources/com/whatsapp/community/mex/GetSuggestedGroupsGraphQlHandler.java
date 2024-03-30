package com.whatsapp.community.mex;

import X.AnonymousClass00C;
import X.C27591Ow;

public final class GetSuggestedGroupsGraphQlHandler {
    public final C27591Ow A00;

    public GetSuggestedGroupsGraphQlHandler(C27591Ow r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3 A[Catch:{ 1Ov -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass147 r20, X.AnonymousClass147 r21, X.C023509x r22) {
        /*
            r19 = this;
            r3 = r22
            r9 = r20
            boolean r0 = r3 instanceof X.C82703z8
            r7 = r19
            if (r0 == 0) goto L_0x0028
            r6 = r3
            X.3z8 r6 = (X.C82703z8) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r6.label = r2
        L_0x0018:
            java.lang.Object r2 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x002e
            java.lang.Object r9 = r6.L$0
            X.147 r9 = (X.AnonymousClass147) r9
            goto L_0x0094
        L_0x0028:
            X.3z8 r6 = new X.3z8
            r6.<init>(r7, r3)
            goto L_0x0018
        L_0x002e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.AnonymousClass0AN.A00(r2)
            X.1Ow r8 = r7.A00     // Catch:{ 1Ov -> 0x0165 }
            com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsQueryImpl$Builder r2 = new com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsQueryImpl$Builder     // Catch:{ 1Ov -> 0x0165 }
            r2.<init>()     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r1 = r9.getRawString()     // Catch:{ 1Ov -> 0x0165 }
            X.9VA r3 = r2.A00     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "id"
            r3.A02(r0, r1)     // Catch:{ 1Ov -> 0x0165 }
            r0 = 0
            if (r1 == 0) goto L_0x004f
            r0 = 1
        L_0x004f:
            r2.A01 = r0     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r1 = r21.getRawString()     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "sub_group_hint_id"
            r3.A02(r0, r1)     // Catch:{ 1Ov -> 0x0165 }
            r0 = 0
            if (r1 == 0) goto L_0x005e
            r0 = 1
        L_0x005e:
            r2.A03 = r0     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r1 = "INTERACTIVE"
            java.lang.String r0 = "query_context"
            r3.A02(r0, r1)     // Catch:{ 1Ov -> 0x0165 }
            r2.A02 = r4     // Catch:{ 1Ov -> 0x0165 }
            boolean r0 = r2.A01     // Catch:{ 1Ov -> 0x0165 }
            X.C20740y5.A06(r0)     // Catch:{ 1Ov -> 0x0165 }
            boolean r0 = r2.A03     // Catch:{ 1Ov -> 0x0165 }
            X.C20740y5.A06(r0)     // Catch:{ 1Ov -> 0x0165 }
            boolean r0 = r2.A02     // Catch:{ 1Ov -> 0x0165 }
            X.C20740y5.A06(r0)     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.class
            java.lang.String r1 = "QuerySuggestedGroups"
            X.9JF r0 = new X.9JF     // Catch:{ 1Ov -> 0x0165 }
            r0.<init>(r3, r2, r1)     // Catch:{ 1Ov -> 0x0165 }
            X.9fL r1 = r8.A01(r0)     // Catch:{ 1Ov -> 0x0165 }
            r6.L$0 = r9     // Catch:{ 1Ov -> 0x0165 }
            r6.L$1 = r7     // Catch:{ 1Ov -> 0x0165 }
            r6.label = r4     // Catch:{ 1Ov -> 0x0165 }
            X.AoD r0 = X.C22531AoD.A00     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Object r2 = r1.A01(r6, r0)     // Catch:{ 1Ov -> 0x0165 }
            if (r2 != r5) goto L_0x0097
            return r5
        L_0x0094:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ 1Ov -> 0x0165 }
        L_0x0097:
            X.9Y8 r2 = (X.AnonymousClass9Y8) r2     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.class
            java.lang.String r0 = "xwa2_group_query_by_id"
            X.9Y8 r0 = r2.A03(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            if (r0 == 0) goto L_0x015e
            org.json.JSONObject r3 = r0.A00     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "__typename"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ 1Ov -> 0x0165 }
            int r1 = r0.hashCode()     // Catch:{ 1Ov -> 0x0165 }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r1 != r0) goto L_0x015e
            com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r2 = new com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Ov -> 0x0165 }
            r2.<init>(r3)     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.class
            java.lang.String r0 = "sub_group_suggestions"
            X.9Y8 r2 = r2.A03(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            if (r2 == 0) goto L_0x015e
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.class
            java.lang.String r0 = "edges"
            X.1Ak r0 = r2.A04(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            if (r0 == 0) goto L_0x015e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 1Ov -> 0x0165 }
            r3.<init>()     // Catch:{ 1Ov -> 0x0165 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 1Ov -> 0x0165 }
        L_0x00d6:
            boolean r0 = r7.hasNext()     // Catch:{ 1Ov -> 0x0165 }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r2 = r7.next()     // Catch:{ 1Ov -> 0x0165 }
            X.9Y8 r2 = (X.AnonymousClass9Y8) r2     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.class
            java.lang.String r0 = "node"
            X.9Y8 r6 = r2.A03(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ 1Ov -> 0x0165 }
            X.AnonymousClass00C.A0D(r9, r4)     // Catch:{ 1Ov -> 0x0165 }
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR     // Catch:{ 1Ov -> 0x0165 }
            org.json.JSONObject r5 = r6.A00     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r2 = "id"
            java.lang.String r0 = r5.optString(r2)     // Catch:{ 1Ov -> 0x0165 }
            X.147 r10 = X.C65533Sl.A04(r0)     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Subject> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Subject.class
            java.lang.String r0 = "subject"
            X.9Y8 r0 = r6.A03(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            r13 = 0
            if (r0 == 0) goto L_0x015b
            org.json.JSONObject r1 = r0.A00     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "value"
            java.lang.String r12 = r1.optString(r0)     // Catch:{ 1Ov -> 0x0165 }
        L_0x0111:
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Description> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Description.class
            java.lang.String r0 = "description"
            X.9Y8 r0 = r6.A03(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            if (r0 == 0) goto L_0x0123
            org.json.JSONObject r1 = r0.A00     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "value"
            java.lang.String r13 = r1.optString(r0)     // Catch:{ 1Ov -> 0x0165 }
        L_0x0123:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 1Ov -> 0x0165 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Creator> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Creator.class
            java.lang.String r0 = "creator"
            X.9Y8 r0 = r6.A03(r1, r0)     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = r0.A07(r2)     // Catch:{ 1Ov -> 0x0165 }
            com.whatsapp.jid.UserJid r11 = X.C222813r.A01(r0)     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "creation_time"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ 1Ov -> 0x0165 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 1Ov -> 0x0165 }
            long r14 = java.lang.Long.parseLong(r0)     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r0 = "total_participants_count"
            int r0 = r5.optInt(r0)     // Catch:{ 1Ov -> 0x0165 }
            long r0 = (long) r0     // Catch:{ 1Ov -> 0x0165 }
            java.lang.String r2 = "is_existing_group"
            boolean r18 = r5.optBoolean(r2)     // Catch:{ 1Ov -> 0x0165 }
            X.3KN r8 = new X.3KN     // Catch:{ 1Ov -> 0x0165 }
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18)     // Catch:{ 1Ov -> 0x0165 }
            r3.add(r8)     // Catch:{ 1Ov -> 0x0165 }
            goto L_0x00d6
        L_0x015b:
            r12 = r13
            goto L_0x0111
        L_0x015d:
            return r3
        L_0x015e:
            r1 = -1
            X.1PI r0 = new X.1PI     // Catch:{ 1Ov -> 0x0165 }
            r0.<init>(r1)     // Catch:{ 1Ov -> 0x0165 }
            throw r0     // Catch:{ 1Ov -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            X.9jD r0 = r0.error
            X.B2T r0 = r0.A00()
            int r1 = r0.B9n()
            X.1PI r0 = new X.1PI
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler.A00(X.147, X.147, X.09x):java.lang.Object");
    }
}
