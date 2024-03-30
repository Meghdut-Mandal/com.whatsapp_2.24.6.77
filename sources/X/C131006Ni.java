package X;

/* renamed from: X.6Ni  reason: invalid class name and case insensitive filesystem */
public class C131006Ni {
    public final int A00;

    public boolean A00() {
        int i = this.A00;
        if (i == 2 || i == 1 || i == 21) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.A00;
        switch (i) {
            case 0:
                return "failed";
            case 1:
                return "success-restored";
            case 2:
                return "success-created";
            case 3:
                return "failed-jid-mismatch";
            case 4:
                return "failed-on-file-integrity-check";
            case 5:
                return "failed-out-of-space";
            case 6:
                return "failed-msgstore-already-exists";
            case 7:
                return "canceled";
            case 8:
                return "provider-server-prop-not-enabled";
            case 9:
                return "app-signature-mismatch";
            case 10:
                return "incorrect-caller-package-name";
            case 11:
                return "requester-app-version-incorrect";
            case 12:
                return "incorrect-file-mode";
            case 13:
                return "phone-number-mismatch";
            case 14:
                return "msgstore-db-does-not-exist";
            case 15:
                return "failed-to-get-backup-file";
            case 16:
                return "backup-failed-with-generic-error";
            case 17:
                return "backup-failed-out-of-space";
            case 18:
                return "backup-failed-invalid-backup";
            case 19:
                return "success-transfer-db-file";
            case 20:
                return "failed-decryption-key-missing";
            case 21:
                return "base-restored-increment-failed";
            default:
                C36321k7.A1U("unspecified initialization status: ", AnonymousClass000.A0u(), i);
                return String.valueOf(i);
        }
    }

    public C131006Ni(int i) {
        this.A00 = i;
    }
}
