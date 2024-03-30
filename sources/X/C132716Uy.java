package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Uy  reason: invalid class name and case insensitive filesystem */
public class C132716Uy {
    public final int A00;
    public final int A01;
    public final List A02;
    public final AnonymousClass13R A03;

    public static C132716Uy A00(AnonymousClass13R r2, C20810yC r3) {
        boolean A0E = r3.A0E(2668);
        return new C132716Uy(r2, A0E ? 1 : 0, A0E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(org.json.JSONObject r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0015
            java.lang.String r1 = "backup_version"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x0015
            int r5 = r7.getInt(r1)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0016
        L_0x000f:
            r1 = move-exception
            java.lang.String r0 = "BackupExpiryManager/getBackupVersion/failed to parse version from json"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0015:
            r5 = 0
        L_0x0016:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.List r0 = r6.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)
            if (r7 == 0) goto L_0x0039
            boolean r0 = r7.has(r2)     // Catch:{ JSONException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            boolean r1 = r7.getBoolean(r2)     // Catch:{ JSONException -> 0x0039 }
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.put(r2, r0)
            goto L_0x0020
        L_0x0042:
            int r0 = r6.A01
            if (r5 >= r0) goto L_0x004d
            java.lang.String r0 = "BackupExpiryManager/backup expired based on version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x004d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132716Uy.A03(org.json.JSONObject):boolean");
    }

    public C132716Uy(AnonymousClass13R r3, int i, int i2) {
        this.A03 = r3;
        this.A01 = i;
        this.A00 = i2;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A02 = A0I;
        A0I.add("call_log");
        A0I.add("labeled_jid");
        A0I.add("message_fts");
        A0I.add("blank_me_jid");
        A0I.add("message_link");
        A0I.add("message_main");
        A0I.add("message_text");
        A0I.add("missed_calls");
        A0I.add("receipt_user");
        A0I.add("message_media");
        A0I.add("message_vcard");
        A0I.add("message_future");
        A0I.add("message_quoted");
        A0I.add("message_system");
        A0I.add("receipt_device");
        A0I.add("message_mention");
        A0I.add("message_revoked");
        A0I.add("broadcast_me_jid");
        A0I.add("message_frequent");
        A0I.add("message_location");
        A0I.add("participant_user");
        A0I.add("message_thumbnail");
        A0I.add("message_send_count");
        A0I.add("migration_jid_store");
        A0I.add("payment_transaction");
        A0I.add("migration_chat_store");
        A0I.add("quoted_order_message");
        A0I.add("quoted_order_message_v2");
        A0I.add("message_main_verification");
        A0I.add("quoted_ui_elements_reply_message");
        A0I.add("alter_message_ephemeral_to_message_ephemeral_remove_column");
        A0I.add("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column");
    }

    public static HashMap A01(C132716Uy r4) {
        HashMap A0J = AnonymousClass001.A0J();
        Boolean A0m = C36371kC.A0m();
        A0J.put("call_log", A0m);
        A0J.put("labeled_jid", A0m);
        A0J.put("message_link", A0m);
        A0J.put("receipt_user", A0m);
        A0J.put("message_quoted", A0m);
        A0J.put("message_thumbnail", A0m);
        A0J.put("quoted_order_message", A0m);
        A0J.put("quoted_order_message_v2", A0m);
        A0J.put("message_main_verification", A0m);
        A0J.put("alter_message_ephemeral_to_message_ephemeral_remove_column", A0m);
        A0J.put("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column", A0m);
        A0J.put("message_text", A0m);
        A0J.put("message_vcard", A0m);
        A0J.put("message_future", A0m);
        A0J.put("message_frequent", A0m);
        A0J.put("message_revoked", A0m);
        A0J.put("message_system", A0m);
        A0J.put("missed_calls", A0m);
        A0J.put("message_mention", A0m);
        A0J.put("receipt_device", A0m);
        A0J.put("message_location", A0m);
        A0J.put("participant_user", A0m);
        A0J.put("broadcast_me_jid", A0m);
        A0J.put("message_media", A0m);
        A0J.put("message_send_count", A0m);
        A0J.put("payment_transaction", A0m);
        A0J.put("migration_jid_store", A0m);
        A0J.put("migration_chat_store", A0m);
        A0J.put("quoted_ui_elements_reply_message", A0m);
        A0J.put("blank_me_jid", A0m);
        A0J.put("message_main", A0m);
        C227415p r0 = (C227415p) r4.A03.A00().get("message_fts");
        boolean z = true;
        if (r0 == null || r0.A01() != 1) {
            z = false;
        }
        A0J.put("message_fts", Boolean.valueOf(z));
        return A0J;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.io.File r8) {
        /*
            r7 = this;
            java.io.FileInputStream r2 = X.C90524aI.A0U(r8)     // Catch:{ IOException -> 0x0032 }
            X.4uC r0 = X.C99934uC.DEFAULT_INSTANCE     // Catch:{ all -> 0x0028 }
            X.8Hz r1 = X.C170918Hz.A06(r0, r2)     // Catch:{ all -> 0x0028 }
            X.4uC r1 = (X.C99934uC) r1     // Catch:{ all -> 0x0028 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0028 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0019
            X.4uS r4 = r1.backupMetadata_     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x001a
            X.4uS r4 = X.C100094uS.DEFAULT_INSTANCE     // Catch:{ all -> 0x0028 }
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            r2.close()     // Catch:{ IOException -> 0x0032 }
            if (r4 == 0) goto L_0x0039
            int r0 = r4.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0039
            int r3 = r4.backupVersion_
            goto L_0x003a
        L_0x0028:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0032 }
        L_0x0031:
            throw r1     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            java.lang.String r0 = "readProtobufBackupMetadata/failed"
            com.whatsapp.util.Log.w(r0, r1)
            r4 = 0
        L_0x0039:
            r3 = 0
        L_0x003a:
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            java.util.List r0 = r7.A02
            java.util.Iterator r6 = r0.iterator()
        L_0x0044:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.String r1 = X.AnonymousClass001.A0C(r6)
            if (r4 == 0) goto L_0x0057
            int r0 = r1.hashCode()
            switch(r0) {
                case -1879012827: goto L_0x0060;
                case -1696390154: goto L_0x006b;
                case -1617991306: goto L_0x0076;
                case -1372203662: goto L_0x007a;
                case -1286318798: goto L_0x0085;
                case -1286296847: goto L_0x0090;
                case -1286083995: goto L_0x009b;
                case -1220382292: goto L_0x00a6;
                case -1212132786: goto L_0x00b1;
                case -1003755283: goto L_0x00bc;
                case -872783571: goto L_0x00c7;
                case -738045655: goto L_0x00d2;
                case -631883203: goto L_0x00de;
                case -537381604: goto L_0x00ea;
                case -266421354: goto L_0x00f6;
                case -251736654: goto L_0x0102;
                case -228245188: goto L_0x010e;
                case -172298781: goto L_0x011a;
                case -136111098: goto L_0x0126;
                case -101944730: goto L_0x0132;
                case -38832335: goto L_0x013e;
                case 320355671: goto L_0x014a;
                case 491179391: goto L_0x0156;
                case 562095961: goto L_0x0161;
                case 637715707: goto L_0x016d;
                case 952486048: goto L_0x0179;
                case 1013557607: goto L_0x0185;
                case 1029740752: goto L_0x0191;
                case 1395058782: goto L_0x019d;
                case 1476079284: goto L_0x01a9;
                case 1580832246: goto L_0x01b5;
                case 1761584297: goto L_0x01c1;
                case 2085446219: goto L_0x01cd;
                default: goto L_0x0057;
            }
        L_0x0057:
            r5 = 0
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.put(r1, r0)
            goto L_0x0044
        L_0x0060:
            java.lang.String r0 = "payment_transaction"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.paymentTransactionMigrationFinished_
            goto L_0x0058
        L_0x006b:
            java.lang.String r0 = "migration_jid_store"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.migrationJidStoreMigrationFinished_
            goto L_0x0058
        L_0x0076:
            java.lang.String r0 = "media_migration_fixer"
            goto L_0x0158
        L_0x007a:
            java.lang.String r0 = "receipt_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.receiptUserMigrationFinished_
            goto L_0x0058
        L_0x0085:
            java.lang.String r0 = "message_link"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageLinkMigrationFinished_
            goto L_0x0058
        L_0x0090:
            java.lang.String r0 = "message_main"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageMainMigrationFinished_
            goto L_0x0058
        L_0x009b:
            java.lang.String r0 = "message_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageTextMigrationFinished_
            goto L_0x0058
        L_0x00a6:
            java.lang.String r0 = "message_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageMediaMigrationFinished_
            goto L_0x0058
        L_0x00b1:
            java.lang.String r0 = "message_vcard"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageVcardMigrationFinished_
            goto L_0x0058
        L_0x00bc:
            java.lang.String r0 = "message_location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageLocationMigrationFinished_
            goto L_0x0058
        L_0x00c7:
            java.lang.String r0 = "message_fts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageFtsMigrationFinished_
            goto L_0x0058
        L_0x00d2:
            java.lang.String r0 = "blank_me_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.blankMeJidMigrationFinished_
            goto L_0x0058
        L_0x00de:
            java.lang.String r0 = "receipt_device"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.receiptDeviceMigrationFinished_
            goto L_0x0058
        L_0x00ea:
            java.lang.String r0 = "broadcast_me_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.broadcastMeJidMigrationFinished_
            goto L_0x0058
        L_0x00f6:
            java.lang.String r0 = "alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_
            goto L_0x0058
        L_0x0102:
            java.lang.String r0 = "message_mention"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageMentionMigrationFinished_
            goto L_0x0058
        L_0x010e:
            java.lang.String r0 = "quoted_order_message_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.quotedOrderMessageV2MigrationFinished_
            goto L_0x0058
        L_0x011a:
            java.lang.String r0 = "call_log"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.callLogMigrationFinished_
            goto L_0x0058
        L_0x0126:
            java.lang.String r0 = "message_frequent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageFrequentMigrationFinished_
            goto L_0x0058
        L_0x0132:
            java.lang.String r0 = "message_revoked"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageRevokedMigrationFinished_
            goto L_0x0058
        L_0x013e:
            java.lang.String r0 = "missed_calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.missedCallsMigrationFinished_
            goto L_0x0058
        L_0x014a:
            java.lang.String r0 = "participant_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.participantUserMigrationFinished_
            goto L_0x0058
        L_0x0156:
            java.lang.String r0 = "quoted_order_message"
        L_0x0158:
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0058
            goto L_0x0057
        L_0x0161:
            java.lang.String r0 = "labeled_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.labeledJidMigrationFinished_
            goto L_0x0058
        L_0x016d:
            java.lang.String r0 = "message_future"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageFutureMigrationFinished_
            goto L_0x0058
        L_0x0179:
            java.lang.String r0 = "message_quoted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageQuotedMigrationFinished_
            goto L_0x0058
        L_0x0185:
            java.lang.String r0 = "message_system"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageSystemMigrationFinished_
            goto L_0x0058
        L_0x0191:
            java.lang.String r0 = "message_send_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageSendCountMigrationFinished_
            goto L_0x0058
        L_0x019d:
            java.lang.String r0 = "quoted_ui_elements_reply_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.quotedUiElementsReplyMessageMigrationFinished_
            goto L_0x0058
        L_0x01a9:
            java.lang.String r0 = "message_thumbnail"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageThumbnailMigrationFinished_
            goto L_0x0058
        L_0x01b5:
            java.lang.String r0 = "alter_message_ephemeral_to_message_ephemeral_remove_column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_
            goto L_0x0058
        L_0x01c1:
            java.lang.String r0 = "message_main_verification"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.messageMainVerificationMigrationFinished_
            goto L_0x0058
        L_0x01cd:
            java.lang.String r0 = "migration_chat_store"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            boolean r5 = r4.migrationChatStoreMigrationFinished_
            goto L_0x0058
        L_0x01d9:
            int r0 = r7.A01
            if (r3 >= r0) goto L_0x01e4
            java.lang.String r0 = "BackupExpiryManager/backup expired based on version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x01e4:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132716Uy.A02(java.io.File):boolean");
    }
}
