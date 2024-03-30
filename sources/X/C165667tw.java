package X;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.7tw  reason: invalid class name and case insensitive filesystem */
public final class C165667tw extends BluetoothGattServerCallback {
    public final /* synthetic */ C198939eR A00;

    public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] bArr;
        int i3 = 0;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        C36341k9.A1E(bluetoothDevice, 0, bluetoothGattCharacteristic);
        C198939eR r3 = this.A00;
        UUID uuid = C198939eR.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gatt characteristic read (");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0m(bluetoothGattCharacteristic.getUuid(), A0u));
        boolean A0J = AnonymousClass00C.A0J(bluetoothGattCharacteristic.getUuid(), C198939eR.A08);
        BluetoothGattServer bluetoothGattServer = r3.A00;
        int i4 = i;
        if (A0J) {
            if (bluetoothGattServer != null) {
                bArr = r3.A06;
            } else {
                return;
            }
        } else if (bluetoothGattServer != null) {
            i3 = 257;
            bArr = null;
        } else {
            return;
        }
        bluetoothGattServer.sendResponse(bluetoothDevice2, i4, i3, 0, bArr);
    }

    public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        AnonymousClass00C.A0D(bluetoothDevice, 0);
        C198939eR r3 = this.A00;
        UUID uuid = C198939eR.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("connection state changed ");
        A0u.append(bluetoothDevice);
        A0u.append(" connected=");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", C36421kH.A0d(A0u, AnonymousClass000.A1S(i2, 2)));
        if (i2 == 0) {
            r3.A04.remove(bluetoothDevice);
        }
    }

    public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGattServer bluetoothGattServer;
        byte[] bArr;
        int i3 = 0;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        C36341k9.A1E(bluetoothDevice, 0, bluetoothGattDescriptor);
        C198939eR r3 = this.A00;
        UUID uuid = C198939eR.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gatt descriptor read (");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0m(bluetoothGattDescriptor.getUuid(), A0u));
        int i4 = i;
        if (AnonymousClass00C.A0J(C198939eR.A07, bluetoothGattDescriptor.getUuid())) {
            if (r3.A04.contains(bluetoothDevice)) {
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            } else {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            bluetoothGattServer = r3.A00;
            if (bluetoothGattServer == null) {
                return;
            }
        } else {
            bluetoothGattServer = r3.A00;
            if (bluetoothGattServer != null) {
                i3 = 257;
                bArr = null;
            } else {
                return;
            }
        }
        bluetoothGattServer.sendResponse(bluetoothDevice2, i4, i3, 0, bArr);
    }

    public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        BluetoothGattServer bluetoothGattServer;
        int i3 = 0;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        C36321k7.A0v(bluetoothDevice, 0, bluetoothGattDescriptor);
        C198939eR r2 = this.A00;
        UUID uuid = C198939eR.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gatt descriptor write (");
        AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0m(bluetoothGattDescriptor.getUuid(), A0u));
        int i4 = i;
        if (AnonymousClass00C.A0J(C198939eR.A07, bluetoothGattDescriptor.getUuid())) {
            byte[] bArr2 = bArr;
            if (Arrays.equals(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE, bArr2)) {
                AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0l(bluetoothDevice, "subscribe gatt device ", AnonymousClass000.A0u()));
                r2.A04.add(bluetoothDevice);
            } else if (Arrays.equals(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE, bArr2)) {
                AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0l(bluetoothDevice, "unsubscribe gatt device ", AnonymousClass000.A0u()));
                r2.A04.remove(bluetoothDevice);
            }
            if (!z2 || (bluetoothGattServer = r2.A00) == null) {
                return;
            }
        } else {
            bluetoothGattServer = r2.A00;
            if (bluetoothGattServer != null) {
                i3 = 257;
            } else {
                return;
            }
        }
        bluetoothGattServer.sendResponse(bluetoothDevice2, i4, i3, 0, (byte[]) null);
    }

    public void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        AnonymousClass00C.A0D(bluetoothDevice, 0);
        UUID uuid = C198939eR.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mtu changed ");
        A0u.append(bluetoothDevice);
        AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0r(" mtu=", A0u, i));
    }

    public C165667tw(C198939eR r1) {
        this.A00 = r1;
    }

    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        UUID uuid;
        int i3;
        int i4;
        byte[] bArr2;
        C198939eR r4 = this.A00;
        UUID uuid2 = C198939eR.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gatt characteristic write (");
        UUID uuid3 = null;
        if (bluetoothGattCharacteristic != null) {
            uuid = bluetoothGattCharacteristic.getUuid();
        } else {
            uuid = null;
        }
        AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", AnonymousClass000.A0m(uuid, A0u));
        if (bluetoothGattCharacteristic != null) {
            uuid3 = bluetoothGattCharacteristic.getUuid();
        }
        boolean A0J = AnonymousClass00C.A0J(uuid3, C198939eR.A08);
        BluetoothGattServer bluetoothGattServer = r4.A00;
        if (A0J) {
            if (bluetoothGattServer != null) {
                i3 = 0;
                bArr2 = r4.A06;
                i4 = 0;
            } else {
                return;
            }
        } else if (bluetoothGattServer != null) {
            i3 = 257;
            i4 = 0;
            bArr2 = null;
        } else {
            return;
        }
        bluetoothGattServer.sendResponse(bluetoothDevice, i, i3, i4, bArr2);
    }
}
