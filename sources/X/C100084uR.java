package X;

/* renamed from: X.4uR  reason: invalid class name and case insensitive filesystem */
public final class C100084uR extends C170918Hz implements C22901AyD {
    public static final int AUTO_DOWNLOAD_CELLULAR_FIELD_NUMBER = 5;
    public static final int AUTO_DOWNLOAD_ROAMING_FIELD_NUMBER = 6;
    public static final int AUTO_DOWNLOAD_WIFI_FIELD_NUMBER = 4;
    public static final int AUTO_UNARCHIVE_CHATS_FIELD_NUMBER = 14;
    public static final int AVATAR_USER_SETTINGS_FIELD_NUMBER = 11;
    public static final int CHAT_LOCK_SETTINGS_FIELD_NUMBER = 19;
    public static final int DARK_THEME_WALLPAPER_FIELD_NUMBER = 3;
    public static final C100084uR DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_DURATION_FIELD_NUMBER = 9;
    public static final int DISAPPEARING_MODE_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int FONT_SIZE_FIELD_NUMBER = 12;
    public static final int GROUPNOTIFICATIONSETTINGS_FIELD_NUMBER = 18;
    public static final int INDIVIDUALNOTIFICATIONSETTINGS_FIELD_NUMBER = 17;
    public static final int LIGHT_THEME_WALLPAPER_FIELD_NUMBER = 1;
    public static final int MEDIA_VISIBILITY_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PHOTO_QUALITY_MODE_FIELD_NUMBER = 16;
    public static final int SECURITY_NOTIFICATIONS_FIELD_NUMBER = 13;
    public static final int SHOW_GROUP_NOTIFICATIONS_PREVIEW_FIELD_NUMBER = 8;
    public static final int SHOW_INDIVIDUAL_NOTIFICATIONS_PREVIEW_FIELD_NUMBER = 7;
    public static final int VIDEO_QUALITY_MODE_FIELD_NUMBER = 15;
    public C99954uE autoDownloadCellular_;
    public C99954uE autoDownloadRoaming_;
    public C99954uE autoDownloadWiFi_;
    public boolean autoUnarchiveChats_;
    public C99844u3 avatarUserSettings_;
    public int bitField0_;
    public C99834u2 chatLockSettings_;
    public C99874u6 darkThemeWallpaper_;
    public int disappearingModeDuration_;
    public long disappearingModeTimestamp_;
    public int fontSize_;
    public C100014uK groupNotificationSettings_;
    public C100014uK individualNotificationSettings_;
    public C99874u6 lightThemeWallpaper_;
    public int mediaVisibility_;
    public int photoQualityMode_;
    public boolean securityNotifications_;
    public boolean showGroupNotificationsPreview_;
    public boolean showIndividualNotificationsPreview_;
    public int videoQualityMode_;

    static {
        C100084uR r1 = new C100084uR();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100084uR.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(21);
                A1Z[1] = "lightThemeWallpaper_";
                A1Z[2] = "mediaVisibility_";
                A1Z[3] = C141876ny.A00;
                A1Z[4] = "darkThemeWallpaper_";
                A1Z[5] = "autoDownloadWiFi_";
                A1Z[6] = "autoDownloadCellular_";
                A1Z[7] = "autoDownloadRoaming_";
                A1Z[8] = "showIndividualNotificationsPreview_";
                A1Z[9] = "showGroupNotificationsPreview_";
                A1Z[10] = "disappearingModeDuration_";
                A1Z[11] = "disappearingModeTimestamp_";
                A1Z[12] = "avatarUserSettings_";
                A1Z[13] = "fontSize_";
                A1Z[14] = "securityNotifications_";
                A1Z[15] = "autoUnarchiveChats_";
                A1Z[16] = "videoQualityMode_";
                A1Z[17] = "photoQualityMode_";
                A1Z[18] = "individualNotificationSettings_";
                A1Z[19] = "groupNotificationSettings_";
                A1Z[20] = "chatLockSettings_";
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b\nဂ\t\u000bဉ\n\fင\u000b\rဇ\f\u000eဇ\r\u000fင\u000e\u0010င\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012", A1Z);
            case 3:
                return new C100084uR();
            case 4:
                return new C99744tt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100084uR.class) {
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
