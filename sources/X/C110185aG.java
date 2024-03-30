package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.5aG  reason: invalid class name and case insensitive filesystem */
public class C110185aG implements ServiceConnection {
    public Object A00;
    public final int A01;

    public C110185aG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C101704y9 r2 = (C101704y9) obj;
                r2.A0Q.set(true);
                C33161ep r1 = r2.A0F;
                if (!r1.A01) {
                    r1.A04();
                }
                r2.A0O.open();
                break;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) obj;
                restoreFromBackupActivity.A0x.set(true);
                restoreFromBackupActivity.A0p.open();
                restoreFromBackupActivity.A0E.A01(restoreFromBackupActivity.A0r);
                return;
            default:
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = (SettingsGoogleDriveViewModel) obj;
                settingsGoogleDriveViewModel.A0d.set(true);
                C33161ep r12 = settingsGoogleDriveViewModel.A0V;
                if (!r12.A01) {
                    r12.A04();
                }
                C1497072l.A00(settingsGoogleDriveViewModel.A0b, this, 34);
                settingsGoogleDriveViewModel.A01.open();
                settingsGoogleDriveViewModel.A0T();
                break;
        }
        Log.i("settings-gdrive/service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConditionVariable conditionVariable;
        switch (this.A01) {
            case 0:
                C101704y9 r2 = (C101704y9) this.A00;
                r2.A0Q.set(false);
                conditionVariable = r2.A0O;
                break;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity.A0h = false;
                if (!restoreFromBackupActivity.A0x.compareAndSet(true, false)) {
                    restoreFromBackupActivity.A0E.A02(restoreFromBackupActivity.A0r);
                    restoreFromBackupActivity.A0p.close();
                    return;
                }
                return;
            default:
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = (SettingsGoogleDriveViewModel) this.A00;
                settingsGoogleDriveViewModel.A0d.set(false);
                conditionVariable = settingsGoogleDriveViewModel.A01;
                break;
        }
        conditionVariable.close();
        Log.i("settings-gdrive/service-disconnected");
    }
}
