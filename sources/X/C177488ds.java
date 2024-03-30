package X;

/* renamed from: X.8ds  reason: invalid class name and case insensitive filesystem */
public final class C177488ds extends C195569Uy {
    public final C26151Jb A00;
    public final AnonymousClass1SM A01;
    public final C30211Zq A02;
    public final AnonymousClass1ZM A03;
    public final C62663Ha A04;

    public C177488ds(C26151Jb r2, AnonymousClass1SM r3, C30211Zq r4, AnonymousClass1ZM r5, C62663Ha r6) {
        C36321k7.A17(r3, r6, r4, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
    }

    public static AnonymousClass9Y8 A00(C177278dX r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0231, code lost:
        if (r2 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C177278dX r12) {
        /*
            r11 = this;
            X.9Y8 r4 = A00(r12)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate> r3 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.class
            java.lang.String r2 = "xwa2_notify_newsletter_on_admin_metadata_update"
            X.9Y8 r0 = r4.A03(r3, r2)
            java.lang.String r1 = X.AnonymousClass9Y8.A02(r0)
            X.3Ro r0 = X.C28981Uw.A03     // Catch:{ all -> 0x0017 }
            X.1Uw r8 = X.C65313Ro.A00(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001c
        L_0x0017:
            r0 = move-exception
            X.03N r8 = X.C90524aI.A0t(r0)
        L_0x001c:
            boolean r0 = r8 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            X.1Uw r8 = (X.C28981Uw) r8
            if (r8 == 0) goto L_0x023c
            X.9Y8 r5 = r4.A03(r3, r2)
            X.AnonymousClass00C.A08(r5)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.class
            java.lang.String r0 = "thread_metadata"
            X.9Y8 r2 = r5.A03(r1, r0)
            if (r2 == 0) goto L_0x0169
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.class
            java.lang.String r0 = "geo_states"
            X.1Ak r10 = r2.A04(r1, r0)
            if (r10 == 0) goto L_0x0169
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r10.iterator()
        L_0x0048:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.9Y8 r2 = (X.AnonymousClass9Y8) r2
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates$State> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.State.class
            java.lang.String r0 = "state"
            X.9Y8 r2 = r2.A03(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r1 = r2.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 != r0) goto L_0x0048
            r6.add(r3)
            goto L_0x0048
        L_0x006d:
            java.util.ArrayList r9 = X.C36351kA.A0z(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x0075:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008b
            X.9Y8 r0 = X.C165617ti.A0C(r2)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "country_code"
            java.lang.String r0 = r1.optString(r0)
            r9.add(r0)
            goto L_0x0075
        L_0x008b:
            boolean r0 = X.C36411kG.A1a(r9)
            if (r0 == 0) goto L_0x00d5
            X.3Ha r6 = r11.A04
            monitor-enter(r6)
            X.3HZ r7 = r6.A00(r8)     // Catch:{ all -> 0x0165 }
            if (r7 == 0) goto L_0x00d4
            java.util.Set r4 = r7.A00     // Catch:{ all -> 0x0165 }
            java.util.ArrayList r3 = X.C36351kA.A0z(r9)     // Catch:{ all -> 0x0165 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0165 }
        L_0x00a4:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ all -> 0x0165 }
            X.3HY r0 = new X.3HY     // Catch:{ all -> 0x0165 }
            r0.<init>(r1)     // Catch:{ all -> 0x0165 }
            r3.add(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x00a4
        L_0x00b7:
            java.util.LinkedHashSet r0 = X.C13640kC.A04(r3, r4)     // Catch:{ all -> 0x0165 }
            X.3HZ r1 = new X.3HZ     // Catch:{ all -> 0x0165 }
            r1.<init>(r0)     // Catch:{ all -> 0x0165 }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x0165 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d4
            r6.A01(r8, r1)     // Catch:{ all -> 0x0165 }
            monitor-exit(r6)
            X.1ZM r1 = r11.A03
            X.2pQ r0 = X.C52432pQ.GEOSUSPENSION
            r1.A00(r8, r0)
            goto L_0x00d5
        L_0x00d4:
            monitor-exit(r6)
        L_0x00d5:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r10.iterator()
        L_0x00dd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.9Y8 r2 = (X.AnonymousClass9Y8) r2
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates$State> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.State.class
            java.lang.String r0 = "state"
            X.9Y8 r2 = r2.A03(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r1 = r2.A06(r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.ACTIVE
            if (r1 != r0) goto L_0x00dd
            r6.add(r3)
            goto L_0x00dd
        L_0x0102:
            java.util.ArrayList r9 = X.C36351kA.A0z(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x010a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0120
            X.9Y8 r0 = X.C165617ti.A0C(r2)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "country_code"
            java.lang.String r0 = r1.optString(r0)
            r9.add(r0)
            goto L_0x010a
        L_0x0120:
            boolean r0 = X.C36411kG.A1a(r9)
            if (r0 == 0) goto L_0x0169
            X.3Ha r6 = r11.A04
            monitor-enter(r6)
            X.3HZ r7 = r6.A00(r8)     // Catch:{ all -> 0x0165 }
            if (r7 == 0) goto L_0x0168
            java.util.Set r4 = r7.A00     // Catch:{ all -> 0x0165 }
            java.util.ArrayList r3 = X.C36351kA.A0z(r9)     // Catch:{ all -> 0x0165 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0165 }
        L_0x0139:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x014c
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ all -> 0x0165 }
            X.3HY r0 = new X.3HY     // Catch:{ all -> 0x0165 }
            r0.<init>(r1)     // Catch:{ all -> 0x0165 }
            r3.add(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x0139
        L_0x014c:
            java.util.Set r0 = X.C007103b.A0f(r3)     // Catch:{ all -> 0x0165 }
            java.util.Set r0 = X.C13640kC.A05(r0, r4)     // Catch:{ all -> 0x0165 }
            X.3HZ r1 = new X.3HZ     // Catch:{ all -> 0x0165 }
            r1.<init>(r0)     // Catch:{ all -> 0x0165 }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x0165 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0168
            r6.A01(r8, r1)     // Catch:{ all -> 0x0165 }
            goto L_0x0168
        L_0x0165:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0168:
            monitor-exit(r6)
        L_0x0169:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.class
            java.lang.String r0 = "messages"
            X.9Y8 r2 = r5.A03(r1, r0)
            if (r2 == 0) goto L_0x023c
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.class
            java.lang.String r0 = "edges"
            X.1Ak r0 = r2.A04(r1, r0)
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x018a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0237
            X.9Y8 r2 = X.C165617ti.A0C(r9)
            if (r2 == 0) goto L_0x0230
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.class
            java.lang.String r0 = "node"
            X.9Y8 r0 = r2.A03(r1, r0)
            if (r0 == 0) goto L_0x0230
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "server_id"
            java.lang.String r0 = r1.optString(r0)
            if (r0 == 0) goto L_0x0230
            java.lang.Long r3 = X.AnonymousClass097.A04(r0)
        L_0x01ae:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.class
            java.lang.String r0 = "node"
            X.9Y8 r2 = r2.A03(r1, r0)
            if (r2 == 0) goto L_0x0235
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node$MessageDeliveryUpdate> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.MessageDeliveryUpdate.class
            java.lang.String r0 = "message_delivery_update"
            X.9Y8 r2 = r2.A03(r1, r0)
            if (r2 == 0) goto L_0x0235
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node$MessageDeliveryUpdate$Issue> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.MessageDeliveryUpdate.Issue.class
            java.lang.String r0 = "issue"
            X.9Y8 r2 = r2.A03(r1, r0)
            if (r2 == 0) goto L_0x0235
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "code"
            java.lang.Enum r1 = r2.A06(r1, r0)
        L_0x01d4:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.NEEDS_REVIEW
            boolean r4 = X.C36361kB.A1a(r1, r0)
            if (r3 != 0) goto L_0x01f7
            if (r4 == 0) goto L_0x01f2
            X.8zz r3 = X.C188648zz.A0S
            java.lang.String r2 = "add"
        L_0x01e2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NewsletterAdminMetadataUpdateHandler/reportServerIdMissing Unexpectedly failed to find serverId for message to "
            X.C36321k7.A1P(r0, r2, r1)
            X.1Jb r1 = r11.A00
            r0 = 0
            r1.A00(r3, r0)
            goto L_0x018a
        L_0x01f2:
            X.8zz r3 = X.C188648zz.A0T
            java.lang.String r2 = "remove"
            goto L_0x01e2
        L_0x01f7:
            X.1SM r0 = r11.A01
            long r2 = r3.longValue()
            X.3T1 r1 = r0.A02(r8, r2)
            r0 = r6
            if (r4 == 0) goto L_0x0205
            r0 = r7
        L_0x0205:
            if (r1 != 0) goto L_0x022b
            if (r4 == 0) goto L_0x0226
            X.8zz r5 = X.C188648zz.A0B
            java.lang.String r4 = "add"
        L_0x020d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NewsletterAdminMetadataUpdateHandler/reportMessageNotFound Unexpectedly failed to find message to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " for serverId: "
            X.C36341k9.A1M(r0, r1, r2)
            X.1Jb r1 = r11.A00
            r0 = 0
            r1.A00(r5, r0)
            goto L_0x018a
        L_0x0226:
            X.8zz r5 = X.C188648zz.A0C
            java.lang.String r4 = "remove"
            goto L_0x020d
        L_0x022b:
            r0.add(r1)
            goto L_0x018a
        L_0x0230:
            r3 = 0
            if (r2 == 0) goto L_0x0235
            goto L_0x01ae
        L_0x0235:
            r1 = 0
            goto L_0x01d4
        L_0x0237:
            X.1Zq r0 = r11.A02
            r0.A00(r8, r7, r6)
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177488ds.A02(X.8dX):void");
    }
}
