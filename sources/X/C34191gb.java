package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1gb  reason: invalid class name and case insensitive filesystem */
public abstract class C34191gb {
    public static int A00(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 6;
            case 12:
                return 15;
            case 13:
                return 3;
            case 14:
                return 5;
            case 15:
                return 8;
            case 16:
                return 9;
            case 17:
                return 10;
            case 18:
                return 11;
            case 19:
                return 12;
            case 20:
                return 13;
            case 21:
                return 14;
            case 23:
                return 16;
            case 24:
                return 18;
            case 25:
                return 17;
            case 27:
                return 25;
            case 28:
                return 26;
            case 29:
                return 27;
            case 30:
                return 28;
            case 31:
                return 29;
            default:
                return 2;
        }
    }

    public static String A01(int i) {
        if (i == 0) {
            return "success";
        }
        if (i == 1) {
            return "service-missing";
        }
        if (i == 2) {
            return "service-version-update-required";
        }
        if (i == 3) {
            return "service-disabled";
        }
        if (i == 9) {
            return "service-invalid";
        }
        if (i == 18) {
            return "service-updating";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected-return-code: ");
        sb.append(i);
        return sb.toString();
    }

    public static String A03(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "daily";
        }
        if (i == 2) {
            return "weekly";
        }
        if (i == 3) {
            return "monthly";
        }
        if (i == 4) {
            return "manual";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected backup frequency: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String A04(AnonymousClass179 r2, C20830yE r3, File file, long j) {
        try {
            try {
                return AnonymousClass6YY.A06(file, MessageDigest.getInstance("MD5"), j);
            } catch (IOException e) {
                if (!r2.A0B(file) || !r3.A0H()) {
                    Log.e("gdrive-util/get-message-digest", e);
                    return null;
                }
                throw new C101864yP(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String A06(AnonymousClass179 r1, String str) {
        if (str.startsWith("_INTERNAL_FILES_") || str.startsWith("_INTERNAL_DATABASES_")) {
            return null;
        }
        return r1.A07(str).getAbsolutePath();
    }

    public static String A07(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        sb.append("***");
        sb.append(str.substring(indexOf - 1));
        return sb.toString();
    }

    public static String A02(int i) {
        switch (i) {
            case 10:
                return "none";
            case 11:
                return "auth-failed";
            case 12:
                return "account-missing";
            case 13:
                return "google-drive-full";
            case 14:
                return "google-drive-not-reachable";
            case 15:
                return "local-storage-full";
            case 16:
                return "local-chat-backup-missing";
            case 17:
                return "file-not-found";
            case 18:
                return "base-folder-does-not-exist";
            case 19:
                return "gdrive-servers-are-not-working-properly";
            case 20:
                return "failed-to-authenticate-with-whatsapp-servers";
            case 21:
                return "gps-unavailable";
            case 22:
                return "local-gdrive-file-map-is-missing";
            case 23:
                return "read-external-storage-permission-is-missing";
            case 24:
                return "backup-generated-using-newer-version-of-app";
            case 25:
                return "service-disabled";
            case 26:
                return "unknown";
            case 27:
                return "media-without-message-from-db";
            case 28:
                return "auth-failed-user-recoverable";
            case 29:
                return "auth-failed-user-recoverable-notified";
            case 30:
                return "auth-failed-user-security-exception";
            case 31:
                return "auth-failed-user-lib-exception";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected-error-code:");
                sb.append(i);
                return sb.toString();
        }
    }

    public static String A05(AnonymousClass179 r6, File file) {
        StringBuilder sb;
        String absolutePath = file.getAbsolutePath();
        if (r6.A0B(file)) {
            sb.append(((File) r6.A01.get()).getAbsolutePath());
            sb.append("/");
            String replace = absolutePath.replace(sb.toString(), "");
            if (!replace.startsWith("_INTERNAL_FILES_") && !replace.startsWith("_INTERNAL_DATABASES_")) {
                return replace;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gdrive-util/local-path-to-upload-title/malicious-file-name: ");
            sb2.append(replace);
            Log.e(sb2.toString());
            return null;
        }
        sb = new StringBuilder();
        sb.append("gdrive-util/unexpected file: ");
        sb.append(absolutePath);
        Log.w(sb.toString());
        return null;
    }

    public static boolean A08(Context context) {
        int A00 = C34201gc.A00(context);
        if (A00 == 0) {
            return true;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("CoreGoogleDriveUtilsisGoogleDriveAccessPossible/Google Play services are missing and can be installed,  status code: ");
            sb.append(A01(A00));
            Log.i(sb.toString());
            return true;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CoreGoogleDriveUtilsisGoogleDriveAccessPossible/Google Play services are missing and cannot be installed, status code: ");
            sb2.append(A01(A00));
            Log.i(sb2.toString(), e);
            return false;
        }
    }
}
