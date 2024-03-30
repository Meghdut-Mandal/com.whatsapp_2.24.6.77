package com.whatsapp.community.mex;

import X.AnonymousClass00C;
import X.C20810yC;
import X.C27591Ow;

public final class GetSubgroupsGraphQlHandler {
    public final C20810yC A00;
    public final C27591Ow A01;

    public GetSubgroupsGraphQlHandler(C20810yC r2, C27591Ow r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[Catch:{ 1Ov -> 0x0267 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0113 A[Catch:{ 1Ov -> 0x0267 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025f A[Catch:{ 1Ov -> 0x0267 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0260 A[Catch:{ 1Ov -> 0x0267 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass147 r19, X.AnonymousClass147 r20, X.C023509x r21) {
        /*
            r18 = this;
            r4 = r21
            boolean r1 = r4 instanceof X.C82573yv
            r0 = r18
            if (r1 == 0) goto L_0x0026
            r5 = r4
            X.3yv r5 = (X.C82573yv) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0026
            int r3 = r3 - r2
            r5.label = r3
        L_0x0016:
            java.lang.Object r7 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r5.label
            r6 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r6) goto L_0x002c
            java.lang.Object r0 = r5.L$0
            com.whatsapp.community.mex.GetSubgroupsGraphQlHandler r0 = (com.whatsapp.community.mex.GetSubgroupsGraphQlHandler) r0
            goto L_0x0090
        L_0x0026:
            X.3yv r5 = new X.3yv
            r5.<init>(r0, r4)
            goto L_0x0016
        L_0x002c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            X.AnonymousClass0AN.A00(r7)
            X.1Ow r8 = r0.A01     // Catch:{ 1Ov -> 0x0267 }
            com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsQueryImpl$Builder r3 = new com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsQueryImpl$Builder     // Catch:{ 1Ov -> 0x0267 }
            r3.<init>()     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = r19.getRawString()     // Catch:{ 1Ov -> 0x0267 }
            X.9VA r7 = r3.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r1 = "id"
            r7.A02(r1, r2)     // Catch:{ 1Ov -> 0x0267 }
            r1 = 0
            if (r2 == 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            r3.A01 = r1     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = r20.getRawString()     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r1 = "sub_group_hint_id"
            r7.A02(r1, r2)     // Catch:{ 1Ov -> 0x0267 }
            r1 = 0
            if (r2 == 0) goto L_0x005c
            r1 = 1
        L_0x005c:
            r3.A03 = r1     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "INTERACTIVE"
            java.lang.String r1 = "query_context"
            r7.A02(r1, r2)     // Catch:{ 1Ov -> 0x0267 }
            r3.A02 = r6     // Catch:{ 1Ov -> 0x0267 }
            boolean r1 = r3.A01     // Catch:{ 1Ov -> 0x0267 }
            X.C20740y5.A06(r1)     // Catch:{ 1Ov -> 0x0267 }
            boolean r1 = r3.A03     // Catch:{ 1Ov -> 0x0267 }
            X.C20740y5.A06(r1)     // Catch:{ 1Ov -> 0x0267 }
            boolean r1 = r3.A02     // Catch:{ 1Ov -> 0x0267 }
            X.C20740y5.A06(r1)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.class
            java.lang.String r2 = "QuerySubgroups"
            X.9JF r1 = new X.9JF     // Catch:{ 1Ov -> 0x0267 }
            r1.<init>(r7, r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            X.9fL r2 = r8.A01(r1)     // Catch:{ 1Ov -> 0x0267 }
            r5.L$0 = r0     // Catch:{ 1Ov -> 0x0267 }
            r5.label = r6     // Catch:{ 1Ov -> 0x0267 }
            X.AoD r1 = X.C22531AoD.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Object r7 = r2.A01(r5, r1)     // Catch:{ 1Ov -> 0x0267 }
            if (r7 != r4) goto L_0x0093
            return r4
        L_0x0090:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ 1Ov -> 0x0267 }
        L_0x0093:
            X.9Y8 r7 = (X.AnonymousClass9Y8) r7     // Catch:{ 1Ov -> 0x0267 }
            r1 = 0
            X.AnonymousClass00C.A0D(r7, r1)     // Catch:{ 1Ov -> 0x0267 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ 1Ov -> 0x0267 }
            r1.<init>()     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById> r5 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.class
            java.lang.String r4 = "xwa2_group_query_by_id"
            X.9Y8 r2 = r7.A03(r5, r4)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x010a
            org.json.JSONObject r9 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "__typename"
            java.lang.String r2 = r9.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            int r3 = r2.hashCode()     // Catch:{ 1Ov -> 0x0267 }
            r2 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r3 != r2) goto L_0x010a
            com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r8 = new com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Ov -> 0x0267 }
            r8.<init>(r9)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$DefaultSubGroup> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.DefaultSubGroup.class
            java.lang.String r2 = "default_sub_group"
            X.9Y8 r10 = r8.A03(r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r10 == 0) goto L_0x010a
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR     // Catch:{ 1Ov -> 0x0267 }
            org.json.JSONObject r3 = r10.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r3.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            X.147 r11 = X.C65533Sl.A04(r2)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$DefaultSubGroup$Subject> r9 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.DefaultSubGroup.Subject.class
            java.lang.String r8 = "subject"
            X.9Y8 r2 = r10.A03(r9, r8)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x00ea
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "value"
            java.lang.String r12 = r3.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r12 != 0) goto L_0x00ec
        L_0x00ea:
            java.lang.String r12 = ""
        L_0x00ec:
            X.9Y8 r3 = r10.A03(r9, r8)     // Catch:{ 1Ov -> 0x0267 }
            if (r3 == 0) goto L_0x010f
            java.lang.String r2 = "creation_time"
            java.lang.String r8 = r3.A07(r2)     // Catch:{ 1Ov -> 0x0267 }
        L_0x00f8:
            r2 = 0
            long r14 = X.AnonymousClass6R8.A01(r8, r2)     // Catch:{ 1Ov -> 0x0267 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r2
            r13 = 3
            X.3QK r10 = new X.3QK     // Catch:{ 1Ov -> 0x0267 }
            r10.<init>(r11, r12, r13, r14)     // Catch:{ 1Ov -> 0x0267 }
            r1.add(r10)     // Catch:{ 1Ov -> 0x0267 }
        L_0x010a:
            X.9Y8 r2 = r7.A03(r5, r4)     // Catch:{ 1Ov -> 0x0267 }
            goto L_0x0111
        L_0x010f:
            r8 = 0
            goto L_0x00f8
        L_0x0111:
            if (r2 == 0) goto L_0x0259
            org.json.JSONObject r5 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "__typename"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            int r3 = r2.hashCode()     // Catch:{ 1Ov -> 0x0267 }
            r2 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r3 != r2) goto L_0x0259
            com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r4 = new com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Ov -> 0x0267 }
            r4.<init>(r5)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.class
            java.lang.String r2 = "sub_groups"
            X.9Y8 r4 = r4.A03(r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r4 == 0) goto L_0x0259
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.class
            java.lang.String r2 = "edges"
            X.1Ak r2 = r4.A04(r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x0259
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ 1Ov -> 0x0267 }
            r5.<init>()     // Catch:{ 1Ov -> 0x0267 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ 1Ov -> 0x0267 }
        L_0x0146:
            boolean r2 = r10.hasNext()     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x0256
            java.lang.Object r8 = r10.next()     // Catch:{ 1Ov -> 0x0267 }
            X.9Y8 r8 = (X.AnonymousClass9Y8) r8     // Catch:{ 1Ov -> 0x0267 }
            X.0yC r4 = r0.A00     // Catch:{ 1Ov -> 0x0267 }
            r3 = 7180(0x1c0c, float:1.0061E-41)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ 1Ov -> 0x0267 }
            boolean r7 = X.C20800yB.A01(r2, r4, r3)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.class
            java.lang.String r2 = "node"
            X.9Y8 r4 = r8.A03(r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r7 == 0) goto L_0x01f9
            X.AnonymousClass00C.A08(r4)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$MembershipApprovalRequests> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.MembershipApprovalRequests.class
            java.lang.String r2 = "membership_approval_requests"
            X.9Y8 r2 = r4.A03(r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            r9 = 0
            if (r2 == 0) goto L_0x017f
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "total_count"
            int r2 = r3.optInt(r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 <= 0) goto L_0x017f
            r9 = 1
        L_0x017f:
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR     // Catch:{ 1Ov -> 0x0267 }
            org.json.JSONObject r3 = r4.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r3.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            X.147 r12 = X.C65533Sl.A04(r2)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Subject> r8 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Subject.class
            java.lang.String r7 = "subject"
            X.9Y8 r2 = r4.A03(r8, r7)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x01a1
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "value"
            java.lang.String r14 = r3.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r14 != 0) goto L_0x01a3
        L_0x01a1:
            java.lang.String r14 = ""
        L_0x01a3:
            X.9Y8 r3 = r4.A03(r8, r7)     // Catch:{ 1Ov -> 0x0267 }
            if (r3 == 0) goto L_0x01cd
            java.lang.String r2 = "creation_time"
            java.lang.String r7 = r3.A07(r2)     // Catch:{ 1Ov -> 0x0267 }
        L_0x01af:
            r2 = 0
            long r16 = X.AnonymousClass6R8.A01(r7, r2)     // Catch:{ 1Ov -> 0x0267 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r2
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Properties> r8 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Properties.class
            java.lang.String r7 = "properties"
            X.9Y8 r2 = r4.A03(r8, r7)     // Catch:{ 1Ov -> 0x0267 }
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "general_chat"
            boolean r2 = r3.optBoolean(r2)     // Catch:{ 1Ov -> 0x0267 }
            r15 = 2
            if (r2 == 0) goto L_0x01d0
            goto L_0x01cf
        L_0x01cd:
            r7 = 0
            goto L_0x01af
        L_0x01cf:
            r15 = 6
        L_0x01d0:
            X.9Y8 r2 = r4.A03(r8, r7)     // Catch:{ 1Ov -> 0x0267 }
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "membership_approval_mode_enabled"
            boolean r2 = r3.optBoolean(r2)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch:{ 1Ov -> 0x0267 }
            r3 = 0
            if (r2 == 0) goto L_0x01ef
            r3 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch:{ 1Ov -> 0x0267 }
            boolean r2 = X.AnonymousClass00C.A0J(r4, r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x01ef
            r3 = 2
        L_0x01ef:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ 1Ov -> 0x0267 }
            X.3QK r11 = new X.3QK     // Catch:{ 1Ov -> 0x0267 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ 1Ov -> 0x0267 }
            goto L_0x0251
        L_0x01f9:
            X.AnonymousClass00C.A08(r4)     // Catch:{ 1Ov -> 0x0267 }
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR     // Catch:{ 1Ov -> 0x0267 }
            org.json.JSONObject r3 = r4.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r3.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            X.147 r12 = X.C65533Sl.A04(r2)     // Catch:{ 1Ov -> 0x0267 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Subject> r8 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Subject.class
            java.lang.String r7 = "subject"
            X.9Y8 r2 = r4.A03(r8, r7)     // Catch:{ 1Ov -> 0x0267 }
            if (r2 == 0) goto L_0x021e
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "value"
            java.lang.String r13 = r3.optString(r2)     // Catch:{ 1Ov -> 0x0267 }
            if (r13 != 0) goto L_0x0220
        L_0x021e:
            java.lang.String r13 = ""
        L_0x0220:
            X.9Y8 r3 = r4.A03(r8, r7)     // Catch:{ 1Ov -> 0x0267 }
            if (r3 == 0) goto L_0x0249
            java.lang.String r2 = "creation_time"
            java.lang.String r7 = r3.A07(r2)     // Catch:{ 1Ov -> 0x0267 }
        L_0x022c:
            r2 = 0
            long r15 = X.AnonymousClass6R8.A01(r7, r2)     // Catch:{ 1Ov -> 0x0267 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 * r2
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Properties> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Properties.class
            java.lang.String r2 = "properties"
            X.9Y8 r2 = r4.A03(r3, r2)     // Catch:{ 1Ov -> 0x0267 }
            org.json.JSONObject r3 = r2.A00     // Catch:{ 1Ov -> 0x0267 }
            java.lang.String r2 = "general_chat"
            boolean r2 = r3.optBoolean(r2)     // Catch:{ 1Ov -> 0x0267 }
            r14 = 2
            if (r2 == 0) goto L_0x024c
            goto L_0x024b
        L_0x0249:
            r7 = 0
            goto L_0x022c
        L_0x024b:
            r14 = 6
        L_0x024c:
            X.3QK r11 = new X.3QK     // Catch:{ 1Ov -> 0x0267 }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ 1Ov -> 0x0267 }
        L_0x0251:
            r5.add(r11)     // Catch:{ 1Ov -> 0x0267 }
            goto L_0x0146
        L_0x0256:
            r1.addAll(r5)     // Catch:{ 1Ov -> 0x0267 }
        L_0x0259:
            boolean r0 = r1.isEmpty()     // Catch:{ 1Ov -> 0x0267 }
            if (r0 != 0) goto L_0x0260
            return r1
        L_0x0260:
            r1 = -1
            X.1Ot r0 = new X.1Ot     // Catch:{ 1Ov -> 0x0267 }
            r0.<init>(r1)     // Catch:{ 1Ov -> 0x0267 }
            throw r0     // Catch:{ 1Ov -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            X.9jD r0 = r0.error
            X.B2T r0 = r0.A00()
            int r1 = r0.B9n()
            X.1Ot r0 = new X.1Ot
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.mex.GetSubgroupsGraphQlHandler.A00(X.147, X.147, X.09x):java.lang.Object");
    }
}
