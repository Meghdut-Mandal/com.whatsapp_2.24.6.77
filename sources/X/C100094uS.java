package X;

/* renamed from: X.4uS  reason: invalid class name and case insensitive filesystem */
public final class C100094uS extends C170918Hz implements C22901AyD {
    public static final int ALTER_MESSAGE_EPHEMERAL_SETTING_TO_MESSAGE_EPHEMERAL_SETTING_REMOVE_COLUMN_MIGRATION_FINISHED_FIELD_NUMBER = 37;
    public static final int ALTER_MESSAGE_EPHEMERAL_TO_MESSAGE_EPHEMERAL_REMOVE_COLUMN_MIGRATION_FINISHED_FIELD_NUMBER = 36;
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    public static final int BACKUP_EXPORT_FILE_SIZE_FIELD_NUMBER = 38;
    public static final int BACKUP_VERSION_FIELD_NUMBER = 4;
    public static final int BLANK_ME_JID_MIGRATION_FINISHED_FIELD_NUMBER = 8;
    public static final int BROADCAST_ME_JID_MIGRATION_FINISHED_FIELD_NUMBER = 22;
    public static final int CALL_LOG_MIGRATION_FINISHED_FIELD_NUMBER = 5;
    public static final int CLEANED_DB_FIELD_NUMBER = 39;
    public static final C100094uS DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
    public static final int JID_SUFFIX_FIELD_NUMBER = 3;
    public static final int LABELED_JID_MIGRATION_FINISHED_FIELD_NUMBER = 6;
    public static final int MEDIA_MIGRATION_FIXER_MIGRATION_FINISHED_FIELD_NUMBER = 32;
    public static final int MESSAGE_FREQUENT_MIGRATION_FINISHED_FIELD_NUMBER = 23;
    public static final int MESSAGE_FTS_MIGRATION_FINISHED_FIELD_NUMBER = 7;
    public static final int MESSAGE_FUTURE_MIGRATION_FINISHED_FIELD_NUMBER = 16;
    public static final int MESSAGE_LINK_MIGRATION_FINISHED_FIELD_NUMBER = 9;
    public static final int MESSAGE_LOCATION_MIGRATION_FINISHED_FIELD_NUMBER = 24;
    public static final int MESSAGE_MAIN_MIGRATION_FINISHED_FIELD_NUMBER = 10;
    public static final int MESSAGE_MAIN_VERIFICATION_MIGRATION_FINISHED_FIELD_NUMBER = 34;
    public static final int MESSAGE_MEDIA_MIGRATION_FINISHED_FIELD_NUMBER = 14;
    public static final int MESSAGE_MENTION_MIGRATION_FINISHED_FIELD_NUMBER = 20;
    public static final int MESSAGE_QUOTED_MIGRATION_FINISHED_FIELD_NUMBER = 17;
    public static final int MESSAGE_REVOKED_MIGRATION_FINISHED_FIELD_NUMBER = 21;
    public static final int MESSAGE_SEND_COUNT_MIGRATION_FINISHED_FIELD_NUMBER = 27;
    public static final int MESSAGE_SYSTEM_MIGRATION_FINISHED_FIELD_NUMBER = 18;
    public static final int MESSAGE_TEXT_MIGRATION_FINISHED_FIELD_NUMBER = 11;
    public static final int MESSAGE_THUMBNAIL_MIGRATION_FINISHED_FIELD_NUMBER = 26;
    public static final int MESSAGE_VCARD_MIGRATION_FINISHED_FIELD_NUMBER = 15;
    public static final int MIGRATION_CHAT_STORE_MIGRATION_FINISHED_FIELD_NUMBER = 30;
    public static final int MIGRATION_JID_STORE_MIGRATION_FINISHED_FIELD_NUMBER = 28;
    public static final int MISSED_CALLS_MIGRATION_FINISHED_FIELD_NUMBER = 12;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PARTICIPANT_USER_MIGRATION_FINISHED_FIELD_NUMBER = 25;
    public static final int PAYMENT_TRANSACTION_MIGRATION_FINISHED_FIELD_NUMBER = 29;
    public static final int QUOTED_ORDER_MESSAGE_MIGRATION_FINISHED_FIELD_NUMBER = 31;
    public static final int QUOTED_ORDER_MESSAGE_V2_MIGRATION_FINISHED_FIELD_NUMBER = 33;
    public static final int QUOTED_UI_ELEMENTS_REPLY_MESSAGE_MIGRATION_FINISHED_FIELD_NUMBER = 35;
    public static final int RECEIPT_DEVICE_MIGRATION_FINISHED_FIELD_NUMBER = 19;
    public static final int RECEIPT_USER_MIGRATION_FINISHED_FIELD_NUMBER = 13;
    public boolean alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_;
    public boolean alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_;
    public String appVersion_ = "";
    public long backupExportFileSize_;
    public int backupVersion_;
    public int bitField0_;
    public int bitField1_;
    public boolean blankMeJidMigrationFinished_;
    public boolean broadcastMeJidMigrationFinished_;
    public boolean callLogMigrationFinished_;
    public boolean cleanedDb_;
    public String deviceModel_ = "";
    public String jidSuffix_ = "";
    public boolean labeledJidMigrationFinished_;
    public boolean mediaMigrationFixerMigrationFinished_;
    public boolean messageFrequentMigrationFinished_;
    public boolean messageFtsMigrationFinished_;
    public boolean messageFutureMigrationFinished_;
    public boolean messageLinkMigrationFinished_;
    public boolean messageLocationMigrationFinished_;
    public boolean messageMainMigrationFinished_;
    public boolean messageMainVerificationMigrationFinished_;
    public boolean messageMediaMigrationFinished_;
    public boolean messageMentionMigrationFinished_;
    public boolean messageQuotedMigrationFinished_;
    public boolean messageRevokedMigrationFinished_;
    public boolean messageSendCountMigrationFinished_;
    public boolean messageSystemMigrationFinished_;
    public boolean messageTextMigrationFinished_;
    public boolean messageThumbnailMigrationFinished_;
    public boolean messageVcardMigrationFinished_;
    public boolean migrationChatStoreMigrationFinished_;
    public boolean migrationJidStoreMigrationFinished_;
    public boolean missedCallsMigrationFinished_;
    public boolean participantUserMigrationFinished_;
    public boolean paymentTransactionMigrationFinished_;
    public boolean quotedOrderMessageMigrationFinished_;
    public boolean quotedOrderMessageV2MigrationFinished_;
    public boolean quotedUiElementsReplyMessageMigrationFinished_;
    public boolean receiptDeviceMigrationFinished_;
    public boolean receiptUserMigrationFinished_;

    static {
        C100094uS r1 = new C100094uS();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100094uS.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(41);
                A1Z[1] = "bitField1_";
                A1Z[2] = "appVersion_";
                A1Z[3] = "deviceModel_";
                A1Z[4] = "jidSuffix_";
                A1Z[5] = "backupVersion_";
                A1Z[6] = "callLogMigrationFinished_";
                A1Z[7] = "labeledJidMigrationFinished_";
                A1Z[8] = "messageFtsMigrationFinished_";
                A1Z[9] = "blankMeJidMigrationFinished_";
                A1Z[10] = "messageLinkMigrationFinished_";
                A1Z[11] = "messageMainMigrationFinished_";
                A1Z[12] = "messageTextMigrationFinished_";
                A1Z[13] = "missedCallsMigrationFinished_";
                A1Z[14] = "receiptUserMigrationFinished_";
                A1Z[15] = "messageMediaMigrationFinished_";
                A1Z[16] = "messageVcardMigrationFinished_";
                A1Z[17] = "messageFutureMigrationFinished_";
                A1Z[18] = "messageQuotedMigrationFinished_";
                A1Z[19] = "messageSystemMigrationFinished_";
                A1Z[20] = "receiptDeviceMigrationFinished_";
                A1Z[21] = "messageMentionMigrationFinished_";
                A1Z[22] = "messageRevokedMigrationFinished_";
                A1Z[23] = "broadcastMeJidMigrationFinished_";
                A1Z[24] = "messageFrequentMigrationFinished_";
                A1Z[25] = "messageLocationMigrationFinished_";
                A1Z[26] = "participantUserMigrationFinished_";
                A1Z[27] = "messageThumbnailMigrationFinished_";
                A1Z[28] = "messageSendCountMigrationFinished_";
                A1Z[29] = "migrationJidStoreMigrationFinished_";
                A1Z[30] = "paymentTransactionMigrationFinished_";
                A1Z[31] = "migrationChatStoreMigrationFinished_";
                A1Z[32] = "quotedOrderMessageMigrationFinished_";
                A1Z[33] = "mediaMigrationFixerMigrationFinished_";
                A1Z[34] = "quotedOrderMessageV2MigrationFinished_";
                A1Z[35] = "messageMainVerificationMigrationFinished_";
                A1Z[36] = "quotedUiElementsReplyMessageMigrationFinished_";
                A1Z[37] = "alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_";
                A1Z[38] = "alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_";
                A1Z[39] = "backupExportFileSize_";
                A1Z[40] = "cleanedDb_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001'\u0000\u0002\u0001''\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u0019ဇ\u0018\u001aဇ\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dဇ\u001c\u001eဇ\u001d\u001fဇ\u001e ဇ\u001f!ဇ \"ဇ!#ဇ\"$ဇ#%ဇ$&ဂ%'ဇ&", A1Z);
            case 3:
                return new C100094uS();
            case 4:
                return new C99474tS();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100094uS.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        C201979ko r03 = C21072A7j.A01;
                        r0 = C90524aI.A0G(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw AnonymousClass001.A0D();
        }
    }
}
