package X;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: X.6PR  reason: invalid class name */
public class AnonymousClass6PR {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;

    public synchronized Bundle A01() {
        Bundle A07;
        A07 = AnonymousClass001.A07();
        A07.putString("account_name", this.A05);
        A07.putLong("total_backup_size", this.A00);
        A07.putLong("last_modified", this.A04);
        A07.putBoolean("overwrite_local_files", this.A03);
        A07.putBoolean("is_download_size_zero", this.A01);
        A07.putBoolean("is_encrypted_backup", this.A02);
        return A07;
    }

    public synchronized String toString() {
        Locale locale;
        Object[] objArr;
        locale = Locale.ENGLISH;
        objArr = new Object[6];
        objArr[0] = C34191gb.A07(this.A05);
        AnonymousClass000.A1N(objArr, 1, this.A03);
        AnonymousClass000.A1N(objArr, 2, this.A01);
        AnonymousClass000.A1M(objArr, 3, this.A04);
        AnonymousClass000.A1M(objArr, 4, this.A00);
        AnonymousClass000.A1N(objArr, 5, this.A02);
        return String.format(locale, "Account:%s overwriteLocalFile:%b isDownloadSizeZero:%b lastModified:%s totalBackupSize: %d isPasswordProtected: %b", objArr);
    }

    public static AnonymousClass6PR A00(Bundle bundle) {
        if (bundle.containsKey("account_name")) {
            AnonymousClass6PR r2 = new AnonymousClass6PR(C36431kI.A17(bundle, "account_name"), bundle.getLong("last_modified", -1), bundle.getLong("total_backup_size", -1), bundle.getBoolean("overwrite_local_files"), bundle.getBoolean("is_download_size_zero"), bundle.getBoolean("is_encrypted_backup", false));
            C36321k7.A1K(r2, "gdrive-activity/create-restore-data-from-bundle/ ", AnonymousClass000.A0u());
            return r2;
        }
        throw AnonymousClass001.A09("account_name cannot be null.");
    }

    public AnonymousClass6PR(String str, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A04 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
