package X;

/* renamed from: X.3LY  reason: invalid class name */
public abstract class AnonymousClass3LY {
    public static String A01(int i) {
        if (i == 16) {
            return "smb_premium_message";
        }
        if (i == 17) {
            return "flows_media_experience";
        }
        switch (i) {
            case 1:
                return "camera_tab";
            case 2:
                return "chat_button";
            case 3:
                return "chat_menu";
            case 4:
                return "status_tab";
            case 5:
                return "status_reply";
            case 6:
                return "smb_quick_reply_edit";
            case 7:
                return "smb_quick_reply_send";
            default:
                return "unknown";
        }
    }

    public static int A00(Boolean bool, int i, boolean z) {
        switch (i) {
            case 1:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (z || bool == null) {
                    return 2;
                }
                if (Boolean.TRUE.equals(bool)) {
                    return 11;
                }
                return 10;
            case 2:
                if (z || bool == null) {
                    return 12;
                }
                if (Boolean.TRUE.equals(bool)) {
                    return 14;
                }
                return 13;
            case 3:
                if (z) {
                    return 7;
                }
                return 21;
            case 4:
                if (z) {
                    return 15;
                }
                return 16;
            case 5:
                if (z) {
                    return 18;
                }
                return 19;
            case 6:
                throw AnonymousClass001.A09(AnonymousClass000.A0r("Invalid camera origin:", AnonymousClass000.A0u(), i));
            case 7:
                throw AnonymousClass001.A09(AnonymousClass000.A0r("Invalid camera origin:", AnonymousClass000.A0u(), i));
            case 14:
                throw AnonymousClass001.A09(AnonymousClass000.A0r("Invalid camera origin:", AnonymousClass000.A0u(), i));
            case 16:
                throw AnonymousClass001.A09(AnonymousClass000.A0r("Invalid camera origin:", AnonymousClass000.A0u(), i));
            case 17:
                return 51;
            default:
                return 8;
        }
    }
}
