package X;

/* renamed from: X.6H7  reason: invalid class name */
public abstract class AnonymousClass6H7 {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "cancel";
            case 2:
                return "failed_insufficient_space";
            case 3:
                return "failed_io";
            case 4:
                return "failed_oom";
            case 5:
                return "failed_bad_media";
            case 6:
                return "failed_no_permissions";
            case 7:
                return "failed_fnf";
            case 8:
                return "failed_server";
            case 9:
                return "failed_request";
            case 10:
                return "failed_request_timeout";
            case 11:
                return "failed_not_finalized";
            case 12:
                return "failed_optimistic_hash";
            case 13:
                return "failed_media_conn";
            case 14:
                return "failed_optimistic_network_unsafe";
            case 15:
                return "failed_throttle";
            case 16:
                return "failed_no_such_algorithm";
            case 17:
                return "failed_network";
            case 18:
                return "failed_watls";
            case 19:
                return "failed_url";
            case 20:
                return "failed_transcoding_unknown";
            case 21:
                return "failed_file_format_unsupported";
            case 22:
                return "failed_dns_lookup";
            case 23:
                return "failed_wamsys";
            case 24:
                return "failed_too_large";
            case 28:
                return "failed_cronet";
            case 29:
                return "failed_no_direct_path";
            case 30:
                return "failed_no_media_key";
            case 31:
                return "failed_unknown";
            case 32:
                return "cancel_programmatic";
            case 33:
                return "failed_no_route";
            case 34:
                return "failed_cannot_transcode";
            case 35:
                return "failed_unknown_mimetype";
            case 36:
                return "failed_server_rejected_media";
            case 37:
                return "failed_io_encryption";
            default:
                return "undefined";
        }
    }

    public static boolean A01(int i) {
        return i == 17 || i == 8 || i == 10 || i == 13 || i == 33 || i == 18 || i == 22 || i == 29;
    }
}
