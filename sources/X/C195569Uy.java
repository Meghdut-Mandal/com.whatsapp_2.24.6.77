package X;

import com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl;

/* renamed from: X.9Uy  reason: invalid class name and case insensitive filesystem */
public abstract class C195569Uy {
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0416, code lost:
        if (r9 == X.C52382pL.OWNER) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05c6, code lost:
        if (r1.A09 != X.C52382pL.OWNER) goto L_0x05c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:394:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C177278dX r16) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r15 instanceof X.C177478dr
            r3 = r16
            if (r1 == 0) goto L_0x0092
            X.8dr r0 = (X.C177478dr) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            X.0yC r2 = r0.A02
            r1 = 4921(0x1339, float:6.896E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0039
            X.9Y8 r3 = r3.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl$Xwa2NotifyTextStatusOnUpdate> r2 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl.Xwa2NotifyTextStatusOnUpdate.class
            java.lang.String r1 = "xwa2_notify_text_status_on_update"
            X.9Y8 r3 = r3.A03(r2, r1)
            X.AnonymousClass00C.A08(r3)
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            org.json.JSONObject r6 = r3.A00
            java.lang.String r1 = "jid"
            java.lang.String r1 = r6.optString(r1)
            com.whatsapp.jid.UserJid r7 = r2.A02(r1)
            if (r7 != 0) goto L_0x003a
            java.lang.String r0 = "Null JID in TS updated notification"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            return
        L_0x003a:
            boolean r1 = X.AnonymousClass143.A0I(r7)
            if (r1 == 0) goto L_0x004a
            X.12O r1 = r0.A01
            X.13w r7 = (X.C223313w) r7
            com.whatsapp.jid.PhoneUserJid r7 = r1.A0A(r7)
            if (r7 == 0) goto L_0x0039
        L_0x004a:
            java.lang.String r5 = "ephemeral_duration_sec"
            int r2 = r6.optInt(r5)
            r1 = -1
            if (r2 != r1) goto L_0x0077
            r10 = -1
        L_0x0055:
            X.16D r6 = r0.A00
            java.lang.String r0 = "text"
            java.lang.String r8 = r3.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl$Xwa2NotifyTextStatusOnUpdate$Emoji> r1 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl.Xwa2NotifyTextStatusOnUpdate.Emoji.class
            java.lang.String r0 = "emoji"
            X.9Y8 r0 = r3.A03(r1, r0)
            if (r0 == 0) goto L_0x0071
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "content"
            java.lang.String r9 = r1.optString(r0)
            if (r9 != 0) goto L_0x0073
        L_0x0071:
            java.lang.String r9 = ""
        L_0x0073:
            r6.A0g(r7, r8, r9, r10)
            return
        L_0x0077:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r1 = "last_update_time"
            java.lang.String r1 = X.C36411kG.A10(r1, r6)
            long r1 = java.lang.Long.parseLong(r1)
            long r10 = r4.toMillis(r1)
            int r1 = r6.optInt(r5)
            long r1 = (long) r1
            long r1 = r4.toMillis(r1)
            long r10 = r10 + r1
            goto L_0x0055
        L_0x0092:
            boolean r1 = r15 instanceof X.C177418dl
            if (r1 == 0) goto L_0x00e5
            X.8dl r0 = (X.C177418dl) r0
            r4 = 0
            X.AnonymousClass00C.A0D(r3, r4)
            X.0yC r2 = r0.A01
            r1 = 4921(0x1339, float:6.896E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0039
            X.9Y8 r3 = r3.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl$Xwa2NotifyTextStatusOnUpdateSideSub> r2 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl.Xwa2NotifyTextStatusOnUpdateSideSub.class
            java.lang.String r1 = "xwa2_notify_text_status_on_update_side_sub"
            X.9Y8 r1 = r3.A03(r2, r1)
            X.AnonymousClass00C.A08(r1)
            org.json.JSONObject r2 = r1.A00
            java.lang.String r1 = "hash"
            java.lang.String r2 = X.C36411kG.A10(r1, r2)
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0039
            byte[] r1 = X.C36351kA.A1b(r2)
            byte[] r3 = android.util.Base64.decode(r1, r4)
            X.5Tu r1 = X.C108515Tu.A0I
            X.6Pz r2 = new X.6Pz
            r2.<init>(r1)
            r1 = 1
            r2.A02 = r1
            X.6NS r1 = X.AnonymousClass6NS.A0O
            r2.A00 = r1
            r2.A05(r3)
            X.6Pq r2 = r2.A01()
            X.0xY r1 = r0.A00
            r0 = 1
            X.C20430xY.A00(r1, r2, r0)
            return
        L_0x00e5:
            boolean r1 = r15 instanceof X.C177468dq
            if (r1 == 0) goto L_0x012f
            X.8dq r0 = (X.C177468dq) r0
            X.9Y8 r9 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange> r8 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.class
            java.lang.String r7 = "xwa2_notify_newsletter_on_state_change"
            X.9Y8 r1 = r9.A03(r8, r7)
            java.lang.String r2 = X.AnonymousClass9Y8.A02(r1)
            if (r2 == 0) goto L_0x0039
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ Exception -> 0x06e8 }
            X.1Uw r6 = X.C65313Ro.A00(r2)     // Catch:{ Exception -> 0x06e8 }
            X.12q r1 = r0.A00     // Catch:{ Exception -> 0x06e8 }
            X.C65903Tx.A04(r1, r6)     // Catch:{ Exception -> 0x06e8 }
            X.9Y8 r3 = r9.A03(r8, r7)     // Catch:{ Exception -> 0x06e8 }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange r3 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange) r3     // Catch:{ Exception -> 0x06e8 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange$State> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State.class
            java.lang.String r1 = "state"
            X.9Y8 r5 = r3.A03(r2, r1)     // Catch:{ Exception -> 0x06e8 }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange$State r5 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State) r5     // Catch:{ Exception -> 0x06e8 }
            if (r5 == 0) goto L_0x0039
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r4 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Exception -> 0x06e8 }
            java.lang.String r3 = "type"
            java.lang.Enum r1 = r5.A06(r4, r3)     // Catch:{ Exception -> 0x06e8 }
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType) r1     // Catch:{ Exception -> 0x06e8 }
            if (r1 == 0) goto L_0x06e4
            int r2 = r1.ordinal()     // Catch:{ Exception -> 0x06e8 }
            r1 = 4
            if (r2 == r1) goto L_0x06de
            goto L_0x06b2
        L_0x012f:
            boolean r1 = r15 instanceof X.C177498dt
            if (r1 == 0) goto L_0x0251
            X.8dt r0 = (X.C177498dt) r0
            X.9Y8 r8 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate> r7 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.class
            java.lang.String r6 = "xwa2_notify_newsletter_owner_on_metadata_update"
            X.9Y8 r1 = r8.A03(r7, r6)
            org.json.JSONObject r1 = r1.A00
            java.lang.String r9 = "id"
            java.lang.String r2 = X.C36411kG.A10(r9, r1)
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ all -> 0x0150 }
            X.1Uw r3 = X.C65313Ro.A00(r2)     // Catch:{ all -> 0x0150 }
            goto L_0x0155
        L_0x0150:
            r1 = move-exception
            X.03N r3 = X.C90524aI.A0t(r1)
        L_0x0155:
            boolean r1 = r3 instanceof X.AnonymousClass03N
            if (r1 == 0) goto L_0x015a
            r3 = 0
        L_0x015a:
            X.1Uw r3 = (X.C28981Uw) r3
            if (r3 == 0) goto L_0x0039
            X.9Y8 r4 = r8.A03(r7, r6)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$Actor> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.Actor.class
            java.lang.String r1 = "actor"
            X.9Y8 r5 = r4.A03(r2, r1)
            if (r5 == 0) goto L_0x0039
            java.lang.String r4 = "pn"
            java.lang.String r1 = r5.A07(r4)
            if (r1 == 0) goto L_0x023d
            X.13s r2 = com.whatsapp.jid.PhoneUserJid.Companion
            java.lang.String r1 = r5.A07(r4)
            com.whatsapp.jid.PhoneUserJid r4 = r2.A02(r1)
        L_0x017e:
            if (r4 == 0) goto L_0x0039
            X.1GQ r1 = r0.A03
            X.0yC r2 = r1.A00
            r1 = 7245(0x1c4d, float:1.0152E-41)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0039
            X.12q r1 = r0.A00
            X.C65903Tx.A04(r1, r3)
            X.1ZL r5 = r0.A04
            X.9Y8 r2 = r8.A03(r7, r6)
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate r2 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate) r2
            X.AnonymousClass00C.A08(r2)
            X.ADW r1 = new X.ADW
            r1.<init>(r2)
            X.2La r1 = r5.A0A(r1, r3)
            if (r1 == 0) goto L_0x06f7
            X.1ZT r5 = r0.A02
            r5.A02(r1)
            X.9Y8 r2 = r8.A03(r7, r6)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.class
            java.lang.String r0 = "thread_metadata"
            X.9Y8 r6 = r2.A03(r1, r0)
            if (r6 != 0) goto L_0x01fc
            X.09w r2 = X.C023409w.A00
        L_0x01bc:
            X.12q r0 = r5.A01
            X.3Qp r1 = X.C36371kC.A0W(r0, r3)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0039
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0039
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.OWNER
            if (r1 != r0) goto L_0x0039
            X.1GQ r0 = r5.A05
            X.0yC r1 = r0.A00
            r0 = 7245(0x1c4d, float:1.0152E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0039
            X.1ZU r5 = r5.A06
            X.8z4 r0 = X.C188118z4.PROFILE_PICTURE
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x06f3
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x01f4
            X.16I r1 = r5.A05
            X.1jb r0 = r5.A06
            r1.registerObserver(r0)
            r0 = 1
            r5.A01 = r0
        L_0x01f4:
            X.9WC r0 = new X.9WC
            r0.<init>(r3, r4, r2)
            r5.A00 = r0
            return
        L_0x01fc:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Preview> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview.class
            java.lang.String r0 = "preview"
            X.9Y8 r0 = r6.A03(r1, r0)
            if (r0 == 0) goto L_0x020f
            X.8z4 r0 = X.C188118z4.PROFILE_PICTURE
            r2.add(r0)
        L_0x020f:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Name> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name.class
            java.lang.String r0 = "name"
            X.9Y8 r0 = r6.A03(r1, r0)
            if (r0 == 0) goto L_0x021e
            X.8z4 r0 = X.C188118z4.NAME
            r2.add(r0)
        L_0x021e:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Description> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description.class
            java.lang.String r0 = "description"
            X.9Y8 r0 = r6.A03(r1, r0)
            if (r0 == 0) goto L_0x022d
            X.8z4 r0 = X.C188118z4.DESCRIPTION
            r2.add(r0)
        L_0x022d:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Settings> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.class
            java.lang.String r0 = "settings"
            X.9Y8 r0 = r6.A03(r1, r0)
            if (r0 == 0) goto L_0x01bc
            X.8z4 r0 = X.C188118z4.REACTION_SETTINGS
            r2.add(r0)
            goto L_0x01bc
        L_0x023d:
            X.6Nb r2 = X.C223313w.A01
            java.lang.String r1 = r5.A07(r9)
            X.13w r2 = r2.A02(r1)
            if (r2 == 0) goto L_0x0039
            X.12O r1 = r0.A01
            com.whatsapp.jid.PhoneUserJid r4 = r1.A0A(r2)
            goto L_0x017e
        L_0x0251:
            boolean r1 = r15 instanceof X.C177388di
            if (r1 == 0) goto L_0x0287
            X.8di r0 = (X.C177388di) r0
            X.9Y8 r3 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl$Xwa2NotifyNewsletterOnMuteChange> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl.Xwa2NotifyNewsletterOnMuteChange.class
            java.lang.String r1 = "xwa2_notify_newsletter_on_mute_change"
            X.9Y8 r3 = r3.A03(r2, r1)
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = X.AnonymousClass9Y8.A02(r3)
            if (r4 == 0) goto L_0x0039
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r2 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "mute"
            java.lang.Enum r3 = r3.A06(r2, r1)
            if (r3 == 0) goto L_0x0039
            X.1ZT r2 = r0.A00
            X.3Ro r0 = X.C28981Uw.A03
            X.1Uw r1 = X.C65313Ro.A00(r4)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            boolean r0 = X.C36361kB.A1a(r3, r0)
            r2.A03(r1, r0)
            return
        L_0x0287:
            boolean r1 = r15 instanceof X.C177458dp
            if (r1 == 0) goto L_0x02a1
            X.8dp r0 = (X.C177458dp) r0
            X.9Y8 r7 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl$Xwa2NotifyNewsletterOnMetadataUpdate> r6 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.class
            java.lang.String r5 = "xwa2_notify_newsletter_on_metadata_update"
            X.9Y8 r1 = r7.A03(r6, r5)
            java.lang.String r2 = X.AnonymousClass9Y8.A02(r1)
            if (r2 == 0) goto L_0x0039
            goto L_0x06fd
        L_0x02a1:
            boolean r1 = r15 instanceof X.C177378dh
            if (r1 == 0) goto L_0x02f2
            X.8dh r0 = (X.C177378dh) r0
            X.9Y8 r3 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl$Xwa2NotifyNewsletterOnLeave> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl.Xwa2NotifyNewsletterOnLeave.class
            java.lang.String r1 = "xwa2_notify_newsletter_on_leave"
            X.9Y8 r1 = r3.A03(r2, r1)
            r4 = 0
            if (r1 == 0) goto L_0x0730
            java.lang.String r2 = X.AnonymousClass9Y8.A02(r1)
            if (r2 == 0) goto L_0x0730
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ all -> 0x02c3 }
            X.1Uw r3 = X.C65313Ro.A00(r2)     // Catch:{ all -> 0x02c3 }
            goto L_0x02c8
        L_0x02c3:
            r1 = move-exception
            X.03N r3 = X.C90524aI.A0t(r1)
        L_0x02c8:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r3)
            if (r1 == 0) goto L_0x02d5
            X.1ZT r2 = r0.A00
            java.lang.String r1 = "Unable to parse JID for leave notification"
            r2.A04(r1)
        L_0x02d5:
            boolean r1 = r3 instanceof X.AnonymousClass03N
            if (r1 != 0) goto L_0x02da
            r4 = r3
        L_0x02da:
            X.1Uw r4 = (X.C28981Uw) r4
            if (r4 == 0) goto L_0x0039
            X.1ZT r2 = r0.A00
            X.12q r0 = r2.A01
            X.C65903Tx.A04(r0, r4)
            X.1Ja r1 = r2.A02
            X.2pL r0 = X.C52382pL.GUEST
            r1.A07(r0, r4)
            X.1ZL r0 = r2.A08
            r0.A0F(r4)
            return
        L_0x02f2:
            boolean r1 = r15 instanceof X.C177368dg
            if (r1 == 0) goto L_0x034f
            X.8dg r0 = (X.C177368dg) r0
            X.9Y8 r7 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl$Xwa2NotifyNewsletterOnJoin> r6 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.class
            java.lang.String r5 = "xwa2_notify_newsletter_on_join"
            X.9Y8 r1 = r7.A03(r6, r5)
            r4 = 0
            if (r1 == 0) goto L_0x0735
            java.lang.String r2 = X.AnonymousClass9Y8.A02(r1)
            if (r2 == 0) goto L_0x0735
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ all -> 0x0314 }
            X.1Uw r3 = X.C65313Ro.A00(r2)     // Catch:{ all -> 0x0314 }
            goto L_0x0319
        L_0x0314:
            r1 = move-exception
            X.03N r3 = X.C90524aI.A0t(r1)
        L_0x0319:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r3)
            if (r1 == 0) goto L_0x0326
            X.1ZT r2 = r0.A00
            java.lang.String r1 = "Unable to parse JID for join notification"
            r2.A04(r1)
        L_0x0326:
            boolean r1 = r3 instanceof X.AnonymousClass03N
            if (r1 != 0) goto L_0x032b
            r4 = r3
        L_0x032b:
            X.1Uw r4 = (X.C28981Uw) r4
            if (r4 == 0) goto L_0x0039
            X.1ZT r3 = r0.A00
            X.9Y8 r0 = r7.A03(r6, r5)
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl$Xwa2NotifyNewsletterOnJoin r0 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin) r0
            X.AnonymousClass00C.A08(r0)
            X.ADU r2 = new X.ADU
            r2.<init>(r0)
            X.1ZL r1 = r3.A08
            r0 = 0
            X.2La r1 = r1.A0B(r2, r4, r0)
            X.1SL r0 = r3.A07
            r0.A02(r4)
            r3.A02(r1)
            return
        L_0x034f:
            boolean r1 = r15 instanceof X.C177448do
            if (r1 == 0) goto L_0x0450
            X.8do r0 = (X.C177448do) r0
            X.9Y8 r7 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote> r6 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.class
            java.lang.String r4 = "xwa2_notify_newsletter_admin_promote"
            X.9Y8 r1 = r7.A03(r6, r4)
            org.json.JSONObject r2 = r1.A00
            java.lang.String r1 = "id"
            java.lang.String r2 = X.C36411kG.A10(r1, r2)
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ all -> 0x0370 }
            X.1Uw r10 = X.C65313Ro.A00(r2)     // Catch:{ all -> 0x0370 }
            goto L_0x0375
        L_0x0370:
            r1 = move-exception
            X.03N r10 = X.C90524aI.A0t(r1)
        L_0x0375:
            boolean r1 = r10 instanceof X.AnonymousClass03N
            if (r1 == 0) goto L_0x037a
            r10 = 0
        L_0x037a:
            X.1Uw r10 = (X.C28981Uw) r10
            if (r10 == 0) goto L_0x0039
            X.13s r8 = com.whatsapp.jid.PhoneUserJid.Companion
            X.9Y8 r5 = r7.A03(r6, r4)
            r3 = 0
            if (r5 == 0) goto L_0x03fd
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$User> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.User.class
            java.lang.String r1 = "user"
            X.9Y8 r2 = r5.A03(r2, r1)
            if (r2 == 0) goto L_0x03fd
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x0397:
            com.whatsapp.jid.PhoneUserJid r11 = r8.A02(r1)
            X.1GQ r1 = r0.A01
            X.0yC r5 = r1.A00
            r1 = 7244(0x1c4c, float:1.0151E-41)
            boolean r1 = r5.A0E(r1)
            X.9Y8 r9 = r7.A03(r6, r4)
            if (r1 == 0) goto L_0x03e4
            if (r9 == 0) goto L_0x03e2
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$Actor> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.Actor.class
            java.lang.String r1 = "actor"
            X.9Y8 r2 = r9.A03(r2, r1)
            if (r2 == 0) goto L_0x03e2
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x03bd:
            com.whatsapp.jid.PhoneUserJid r12 = r8.A02(r1)
        L_0x03c1:
            X.9Y8 r4 = r7.A03(r6, r4)
            if (r4 == 0) goto L_0x03d1
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r2 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "user_new_role"
            java.lang.Enum r3 = r4.A06(r2, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r3 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole) r3
        L_0x03d1:
            X.2pL r9 = X.AnonymousClass1ZL.A01(r3)
            r1 = 7244(0x1c4c, float:1.0151E-41)
            boolean r1 = r5.A0E(r1)
            if (r1 != 0) goto L_0x03ff
            X.2pL r1 = X.C52382pL.OWNER
            if (r9 != r1) goto L_0x03ff
            return
        L_0x03e2:
            r1 = r3
            goto L_0x03bd
        L_0x03e4:
            if (r9 == 0) goto L_0x03fb
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$Admin> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.Admin.class
            java.lang.String r1 = "admin"
            X.9Y8 r2 = r9.A03(r2, r1)
            if (r2 == 0) goto L_0x03fb
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x03f6:
            com.whatsapp.jid.PhoneUserJid r12 = r8.A02(r1)
            goto L_0x03c1
        L_0x03fb:
            r1 = r3
            goto L_0x03f6
        L_0x03fd:
            r1 = r3
            goto L_0x0397
        L_0x03ff:
            if (r11 == 0) goto L_0x0039
            X.1ZT r13 = r0.A00
            r14 = 0
            X.AnonymousClass1ZT.A00(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass1ZT.A01(r9, r10, r11, r13)
            X.0wQ r3 = r13.A00
            boolean r0 = r3.A0M(r12)
            r2 = 1
            if (r0 == 0) goto L_0x0418
            X.2pL r0 = X.C52382pL.OWNER
            r1 = 1
            if (r9 != r0) goto L_0x0419
        L_0x0418:
            r1 = 0
        L_0x0419:
            boolean r0 = r3.A0M(r11)
            if (r0 == 0) goto L_0x044e
            X.2pL r0 = X.C52382pL.OWNER
            if (r9 != r0) goto L_0x044e
        L_0x0423:
            if (r1 != 0) goto L_0x0427
            if (r2 == 0) goto L_0x0432
        L_0x0427:
            X.1ZU r0 = r13.A06
            X.8ye r5 = X.C187858ye.PROMOTE
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.A02(r1, r2, r3, r4, r5)
        L_0x0432:
            X.1LX r0 = r13.A09
            java.lang.String r2 = "newsletter_multi_admin"
            X.1LY r1 = r0.A00
            r0 = 0
            r1.A00(r2, r0)
            X.1ZZ r2 = r13.A04
            X.0wI r0 = r2.A00
            r6 = 22
            X.1ia r1 = new X.1ia
            r3 = r10
            r4 = r11
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00(r1)
            return
        L_0x044e:
            r2 = 0
            goto L_0x0423
        L_0x0450:
            boolean r1 = r15 instanceof X.C177438dn
            if (r1 == 0) goto L_0x04f7
            X.8dn r0 = (X.C177438dn) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            X.1GQ r1 = r0.A02
            X.0yC r2 = r1.A00
            r1 = 7245(0x1c4d, float:1.0152E-41)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0039
            X.9Y8 r9 = r3.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl$Xwa2NotifyNewsletterAdminInviteRevoke> r8 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl.Xwa2NotifyNewsletterAdminInviteRevoke.class
            java.lang.String r7 = "xwa2_notify_newsletter_admin_invite_revoke"
            X.9Y8 r1 = r9.A03(r8, r7)
            org.json.JSONObject r1 = r1.A00
            java.lang.String r6 = "id"
            java.lang.String r2 = X.C36411kG.A10(r6, r1)
            X.3Ro r1 = X.C28981Uw.A03
            X.1Uw r10 = r1.A01(r2)
            if (r10 == 0) goto L_0x0039
            X.13s r4 = com.whatsapp.jid.PhoneUserJid.Companion
            X.9Y8 r3 = r9.A03(r8, r7)
            r12 = 0
            if (r3 == 0) goto L_0x04f5
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl$Xwa2NotifyNewsletterAdminInviteRevoke$User> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl.Xwa2NotifyNewsletterAdminInviteRevoke.User.class
            java.lang.String r1 = "user"
            X.9Y8 r2 = r3.A03(r2, r1)
            if (r2 == 0) goto L_0x04f5
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x0499:
            com.whatsapp.jid.PhoneUserJid r11 = r4.A02(r1)
            X.6Nb r5 = X.C223313w.A01
            X.9Y8 r3 = r9.A03(r8, r7)
            if (r3 == 0) goto L_0x04f3
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl$Xwa2NotifyNewsletterAdminInviteRevoke$User> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl.Xwa2NotifyNewsletterAdminInviteRevoke.User.class
            java.lang.String r1 = "user"
            X.9Y8 r1 = r3.A03(r2, r1)
            if (r1 == 0) goto L_0x04f3
            java.lang.String r1 = r1.A07(r6)
        L_0x04b3:
            X.13w r4 = r5.A02(r1)
            X.9Y8 r3 = r9.A03(r8, r7)
            if (r3 == 0) goto L_0x04f1
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl$Xwa2NotifyNewsletterAdminInviteRevoke$Actor> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminInviteRevokeResponseImpl.Xwa2NotifyNewsletterAdminInviteRevoke.Actor.class
            java.lang.String r1 = "actor"
            X.9Y8 r1 = r3.A03(r2, r1)
            if (r1 == 0) goto L_0x04f1
            java.lang.String r1 = r1.A07(r6)
        L_0x04cb:
            X.13w r2 = r5.A02(r1)
            if (r2 == 0) goto L_0x04d7
            X.12O r1 = r0.A00
            com.whatsapp.jid.PhoneUserJid r12 = r1.A0A(r2)
        L_0x04d7:
            if (r4 == 0) goto L_0x04ee
            X.12O r1 = r0.A00
            if (r11 == 0) goto L_0x04ea
            r1.A0H(r4, r11)
        L_0x04e0:
            if (r12 == 0) goto L_0x0039
            X.1ZT r13 = r0.A01
            r9 = 0
            r14 = 1
            X.AnonymousClass1ZT.A00(r9, r10, r11, r12, r13, r14)
            return
        L_0x04ea:
            com.whatsapp.jid.PhoneUserJid r11 = r1.A0A(r4)
        L_0x04ee:
            if (r11 == 0) goto L_0x0039
            goto L_0x04e0
        L_0x04f1:
            r1 = r12
            goto L_0x04cb
        L_0x04f3:
            r1 = r12
            goto L_0x04b3
        L_0x04f5:
            r1 = r12
            goto L_0x0499
        L_0x04f7:
            boolean r1 = r15 instanceof X.C177428dm
            if (r1 == 0) goto L_0x05f3
            X.8dm r0 = (X.C177428dm) r0
            X.9Y8 r8 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote> r7 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.class
            java.lang.String r5 = "xwa2_notify_newsletter_admin_demote"
            X.9Y8 r1 = r8.A03(r7, r5)
            org.json.JSONObject r2 = r1.A00
            java.lang.String r1 = "id"
            java.lang.String r2 = X.C36411kG.A10(r1, r2)
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ all -> 0x0518 }
            X.1Uw r10 = X.C65313Ro.A00(r2)     // Catch:{ all -> 0x0518 }
            goto L_0x051d
        L_0x0518:
            r1 = move-exception
            X.03N r10 = X.C90524aI.A0t(r1)
        L_0x051d:
            boolean r1 = r10 instanceof X.AnonymousClass03N
            if (r1 == 0) goto L_0x0522
            r10 = 0
        L_0x0522:
            X.1Uw r10 = (X.C28981Uw) r10
            if (r10 == 0) goto L_0x0039
            X.13s r4 = com.whatsapp.jid.PhoneUserJid.Companion
            X.9Y8 r6 = r8.A03(r7, r5)
            r3 = 0
            if (r6 == 0) goto L_0x05a5
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$User> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.User.class
            java.lang.String r1 = "user"
            X.9Y8 r2 = r6.A03(r2, r1)
            if (r2 == 0) goto L_0x05a5
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x053f:
            com.whatsapp.jid.PhoneUserJid r11 = r4.A02(r1)
            X.1GQ r1 = r0.A01
            X.0yC r6 = r1.A00
            r1 = 7244(0x1c4c, float:1.0151E-41)
            boolean r1 = r6.A0E(r1)
            X.9Y8 r9 = r8.A03(r7, r5)
            if (r1 == 0) goto L_0x058c
            if (r9 == 0) goto L_0x058a
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$Actor> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.Actor.class
            java.lang.String r1 = "actor"
            X.9Y8 r2 = r9.A03(r2, r1)
            if (r2 == 0) goto L_0x058a
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x0565:
            com.whatsapp.jid.PhoneUserJid r4 = r4.A02(r1)
        L_0x0569:
            X.9Y8 r5 = r8.A03(r7, r5)
            if (r5 == 0) goto L_0x0579
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r2 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "user_new_role"
            java.lang.Enum r3 = r5.A06(r2, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r3 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole) r3
        L_0x0579:
            X.2pL r12 = X.AnonymousClass1ZL.A01(r3)
            r1 = 7244(0x1c4c, float:1.0151E-41)
            boolean r1 = r6.A0E(r1)
            if (r1 != 0) goto L_0x05a7
            X.2pL r1 = X.C52382pL.ADMIN
            if (r12 != r1) goto L_0x05a7
            return
        L_0x058a:
            r1 = r3
            goto L_0x0565
        L_0x058c:
            if (r9 == 0) goto L_0x05a3
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$Admin> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.Admin.class
            java.lang.String r1 = "admin"
            X.9Y8 r2 = r9.A03(r2, r1)
            if (r2 == 0) goto L_0x05a3
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A07(r1)
        L_0x059e:
            com.whatsapp.jid.PhoneUserJid r4 = r4.A02(r1)
            goto L_0x0569
        L_0x05a3:
            r1 = r3
            goto L_0x059e
        L_0x05a5:
            r1 = r3
            goto L_0x053f
        L_0x05a7:
            if (r11 == 0) goto L_0x0039
            X.1ZT r3 = r0.A00
            X.AnonymousClass1ZT.A01(r12, r10, r11, r3)
            X.2pL r0 = X.C52382pL.ADMIN
            r1 = 0
            if (r12 == r0) goto L_0x05e4
            X.12q r0 = r3.A01
            X.3Qp r1 = r0.A09(r10, r1)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x05c8
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x05c8
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.OWNER
            r2 = 1
            if (r1 == r0) goto L_0x05c9
        L_0x05c8:
            r2 = 0
        L_0x05c9:
            X.0wQ r1 = r3.A00
            boolean r0 = r1.A0M(r4)
            if (r0 != 0) goto L_0x05e4
            if (r2 != 0) goto L_0x05d9
            boolean r0 = r1.A0M(r11)
            if (r0 == 0) goto L_0x05e4
        L_0x05d9:
            X.1ZU r4 = r3.A06
            r5 = 0
            X.8ye r9 = X.C187858ye.DEMOTE
            r6 = r10
            r7 = r11
            r8 = r5
            r4.A02(r5, r6, r7, r8, r9)
        L_0x05e4:
            X.1ZZ r9 = r3.A04
            X.0wI r0 = r9.A00
            r13 = 22
            X.1ia r8 = new X.1ia
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A00(r8)
            return
        L_0x05f3:
            boolean r1 = r15 instanceof X.C177408dk
            if (r1 == 0) goto L_0x0612
            X.9Y8 r2 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl$Xwa2Newsletter> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.Xwa2Newsletter.class
            java.lang.String r0 = "xwa2_newsletter"
            X.9Y8 r0 = r2.A03(r1, r0)
            if (r0 == 0) goto L_0x0039
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r1.<init>(r0)
            java.lang.String r0 = "id"
            r1.A07(r0)
            return
        L_0x0612:
            X.8dj r0 = (X.C177398dj) r0
            X.9Y8 r3 = X.C177488ds.A00(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange> r2 = com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.class
            java.lang.String r1 = "xwa2_notify_group_on_prop_change"
            X.9Y8 r5 = r3.A03(r2, r1)
            X.AnonymousClass00C.A08(r5)
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties> r6 = com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.Properties.class
            java.lang.String r3 = "properties"
            X.9Y8 r1 = r5.A03(r6, r3)
            if (r1 == 0) goto L_0x0039
            org.json.JSONObject r1 = r1.A00
            java.lang.String r4 = "__typename"
            java.lang.String r1 = r1.optString(r4)
            int r2 = r1.hashCode()
            r1 = 700555404(0x29c1a08c, float:8.598772E-14)
            if (r2 != r1) goto L_0x0039
            X.9Y8 r1 = r5.A03(r6, r3)
            if (r1 == 0) goto L_0x0039
            org.json.JSONObject r3 = r1.A00
            java.lang.String r1 = r3.optString(r4)
            int r2 = r1.hashCode()
            r1 = 700555404(0x29c1a08c, float:8.598772E-14)
            if (r2 != r1) goto L_0x0039
            com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunityProperties r1 = new com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunityProperties
            r1.<init>(r3)
            org.json.JSONObject r2 = r1.A00
            java.lang.String r1 = "allow_non_admin_sub_group_creation"
            boolean r12 = r2.optBoolean(r1)
            X.3Sl r2 = X.AnonymousClass147.A01
            org.json.JSONObject r1 = r5.A00
            java.lang.String r4 = "id"
            java.lang.String r1 = r1.optString(r4)
            X.147 r8 = r2.A06(r1)
            if (r8 == 0) goto L_0x0039
            X.0xQ r7 = r0.A01
            X.13r r3 = com.whatsapp.jid.UserJid.Companion
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$UpdatedBy> r2 = com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.UpdatedBy.class
            java.lang.String r1 = "updated_by"
            X.9Y8 r1 = r5.A03(r2, r1)
            if (r1 == 0) goto L_0x06b0
            java.lang.String r1 = r1.A07(r4)
        L_0x0682:
            com.whatsapp.jid.UserJid r9 = r3.A02(r1)
            java.lang.String r1 = "update_time"
            java.lang.String r1 = r5.A07(r1)
            if (r1 == 0) goto L_0x069e
            long r5 = java.lang.Long.parseLong(r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            if (r4 == 0) goto L_0x069e
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x06a8
        L_0x069e:
            X.0wo r0 = r0.A00
            long r0 = X.C19970wo.A00(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x06a8:
            long r10 = r4.longValue()
            r7.A0e(r8, r9, r10, r12)
            return
        L_0x06b0:
            r1 = 0
            goto L_0x0682
        L_0x06b2:
            r1 = 1
            if (r2 == r1) goto L_0x06bc
            r1 = 2
            if (r2 == r1) goto L_0x06bc
            r1 = 3
            if (r2 == r1) goto L_0x06bc
            goto L_0x06e4
        L_0x06bc:
            X.1ZT r2 = r0.A01     // Catch:{ Exception -> 0x06e8 }
            X.9Y8 r0 = r9.A03(r8, r7)     // Catch:{ Exception -> 0x06e8 }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange r0 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange) r0     // Catch:{ Exception -> 0x06e8 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x06e8 }
            X.ADX r1 = new X.ADX     // Catch:{ Exception -> 0x06e8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x06e8 }
            X.1ZL r0 = r2.A08     // Catch:{ Exception -> 0x06e8 }
            X.2La r0 = r0.A0A(r1, r6)     // Catch:{ Exception -> 0x06e8 }
            if (r0 != 0) goto L_0x06da
            java.lang.String r0 = "Failed to convert newsletter suspend into NewsletterInfo"
            r2.A04(r0)     // Catch:{ Exception -> 0x06e8 }
            return
        L_0x06da:
            r2.A02(r0)     // Catch:{ Exception -> 0x06e8 }
            return
        L_0x06de:
            X.1Zi r0 = r0.A02     // Catch:{ Exception -> 0x06e8 }
            r0.A07(r6)     // Catch:{ Exception -> 0x06e8 }
            return
        L_0x06e4:
            r5.A06(r4, r3)     // Catch:{ Exception -> 0x06e8 }
            return
        L_0x06e8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NewsletterNotificationStateChangeHandler/error "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x06f3:
            r5.A03(r3, r4, r2)
            return
        L_0x06f7:
            java.lang.String r0 = "NewsletterNotificationOwnerUpdateHandler/failed to find newsletterInfo"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x06fd:
            X.3Ro r1 = X.C28981Uw.A03     // Catch:{ Exception -> 0x072a }
            X.1Uw r4 = X.C65313Ro.A00(r2)     // Catch:{ Exception -> 0x072a }
            X.12q r1 = r0.A00     // Catch:{ Exception -> 0x072a }
            X.C65903Tx.A04(r1, r4)     // Catch:{ Exception -> 0x072a }
            X.1ZL r3 = r0.A02     // Catch:{ Exception -> 0x072a }
            X.9Y8 r2 = r7.A03(r6, r5)     // Catch:{ Exception -> 0x072a }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl$Xwa2NotifyNewsletterOnMetadataUpdate r2 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate) r2     // Catch:{ Exception -> 0x072a }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x072a }
            X.ADV r1 = new X.ADV     // Catch:{ Exception -> 0x072a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x072a }
            X.2La r1 = r3.A0A(r1, r4)     // Catch:{ Exception -> 0x072a }
            if (r1 == 0) goto L_0x0724
            X.1ZT r0 = r0.A01     // Catch:{ Exception -> 0x072a }
            r0.A02(r1)     // Catch:{ Exception -> 0x072a }
            return
        L_0x0724:
            java.lang.String r0 = "NewsletterNotificationMetadataUpdateHandler/failed to find newsletterInfo"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x072a }
            return
        L_0x072a:
            java.lang.String r0 = "NewsletterNotificationMetadataUpdateHandler/failed to get newsletterInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0730:
            X.1ZT r1 = r0.A00
            java.lang.String r0 = "Received leave notification with null JID"
            goto L_0x0739
        L_0x0735:
            X.1ZT r1 = r0.A00
            java.lang.String r0 = "Received join notification with null JID"
        L_0x0739:
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195569Uy.A02(X.8dX):void");
    }

    public Class A01() {
        if (this instanceof C177478dr) {
            return TextStatusUpdateNotificationResponseImpl.class;
        }
        if (this instanceof C177418dl) {
            return TextStatusUpdateNotificationSideSubResponseImpl.class;
        }
        if (this instanceof C177468dq) {
            return NotificationNewsletterStateChangeResponseImpl.class;
        }
        if (this instanceof C177498dt) {
            return NotificationNewsletterOwnerUpdateResponseImpl.class;
        }
        if (this instanceof C177388di) {
            return NotificationNewsletterMuteChangeResponseImpl.class;
        }
        if (this instanceof C177458dp) {
            return NotificationNewsletterUpdateResponseImpl.class;
        }
        if (this instanceof C177378dh) {
            return NotificationNewsletterLeaveResponseImpl.class;
        }
        if (this instanceof C177368dg) {
            return NotificationNewsletterJoinResponseImpl.class;
        }
        if (this instanceof C177448do) {
            return NotificationNewsletterAdminPromoteResponseImpl.class;
        }
        if (this instanceof C177438dn) {
            return NotificationNewsletterAdminInviteRevokeResponseImpl.class;
        }
        if (this instanceof C177428dm) {
            return NotificationNewsletterAdminDemoteResponseImpl.class;
        }
        if (this instanceof C177408dk) {
            return NewsletterMetadataResponseImpl.class;
        }
        if (this instanceof C177488ds) {
            return NotificationNewsletterAdminMetadataUpdateResponseImpl.class;
        }
        return NotificationGroupPropertyUpdateResponseImpl.class;
    }
}
