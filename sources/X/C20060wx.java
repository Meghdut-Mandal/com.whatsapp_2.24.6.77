package X;

import android.os.Environment;
import android.os.StatFs;
import com.whatsapp.util.Log;

/* renamed from: X.0wx  reason: invalid class name and case insensitive filesystem */
public class C20060wx {
    public static boolean A00() {
        try {
            return Environment.isExternalStorageRemovable();
        } catch (Exception e) {
            Log.w("StorageUtils/checkifremovable/error ", e);
            return true;
        }
    }

    public long A01() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (ArithmeticException | IllegalArgumentException e) {
            Log.w("StorageUtils/avail-external-storage/error/", e);
            return 0;
        }
    }

    public long A02() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public long A03() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException e) {
            Log.w("StorageUtils/total-external-storage/error/illegal-arg", e);
            return 0;
        }
    }

    public long A04() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
