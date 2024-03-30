package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;

/* renamed from: X.6Wx  reason: invalid class name and case insensitive filesystem */
public final class C133136Wx {
    public C1042858z A00;
    public final int A01;
    public final File A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C133136Wx(int i, String str, boolean z) {
        this((File) null, str, i, z, false);
    }

    public static C133136Wx A00(int i, boolean z) {
        return new C133136Wx(i, (String) null, z);
    }

    public static String A01(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "failed_generic";
            case 2:
                return "dns_failure";
            case 3:
                return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            case 4:
                return "disk_full";
            case 5:
                return "too_old";
            case 6:
                return "resume_failed";
            case 7:
                return "hash_mismatch";
            case 8:
                return "invalid_url";
            case 9:
                return "output_stream_fail";
            case 11:
                return "no_route";
            case 12:
                return "throttle";
            case 13:
                return "user_cancel";
            case 14:
                return "prefetch_end";
            case 15:
                return "watls_error";
            case 16:
                return "server_error";
            case 17:
                return "wamsys_failed";
            case 18:
                return "failed_network";
            case 19:
                return "failed_connect";
            case 20:
                return "host_switch_required";
            case 21:
                return "suspicious_content";
            case 22:
                return "failed_cronet";
            case 23:
                return "partial_image_downloaded";
            case 24:
                return "programmatic_cancel";
            case 25:
                return "failed_no_client_network";
            case 26:
                return "failed_no_encryption_algorithm";
            case 27:
                return "failed_no_encrypted_hash";
            case 28:
                return "failed_no_media_hash";
            case 29:
                return "failed_no_media_key";
            case 30:
                return "failed_no_sidecar";
            case 31:
                return "failed_hash_verification";
            case 32:
                return "enc_hash_mismatch";
            case 34:
                return "deduped";
            default:
                return "invalid";
        }
    }

    public static boolean A02(int i) {
        if (!(i == 1 || i == 2 || i == 3 || i == 11 || i == 25 || i == 15 || i == 16)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public boolean A03() {
        int i = this.A01;
        if (i == 0 || i == 34) {
            return true;
        }
        return false;
    }

    public String toString() {
        return A01(this.A01);
    }

    public C133136Wx(File file, String str, int i, boolean z, boolean z2) {
        this.A01 = i;
        this.A03 = str;
        this.A05 = z;
        this.A02 = file;
        this.A04 = z2;
    }

    public C133136Wx(int i) {
        this(i, (String) null, false);
    }
}
