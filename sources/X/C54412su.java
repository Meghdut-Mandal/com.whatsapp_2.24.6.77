package X;

import android.os.Bundle;
import com.whatsapp.glasses.BluetoothPermissionDialogFragment;

/* renamed from: X.2su  reason: invalid class name and case insensitive filesystem */
public abstract class C54412su {
    public static final BluetoothPermissionDialogFragment A00() {
        BluetoothPermissionDialogFragment bluetoothPermissionDialogFragment = new BluetoothPermissionDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("bluetooth", true);
        bluetoothPermissionDialogFragment.A17(A07);
        return bluetoothPermissionDialogFragment;
    }
}
