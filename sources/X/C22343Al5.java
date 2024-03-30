package X;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* renamed from: X.Al5  reason: case insensitive filesystem */
public final class C22343Al5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9OE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22343Al5(AnonymousClass9OE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        short s;
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        AnonymousClass6YR.A06("lam:LinkedDeviceManager", "Started gatt");
        AnonymousClass9OE r0 = this.this$0;
        C198939eR r1 = r0.A02;
        UUID uuid = r0.A00.A02;
        BluetoothGattServer bluetoothGattServer = r1.A00;
        if (bluetoothGattServer != null) {
            try {
                BluetoothGattService bluetoothGattService = new BluetoothGattService(uuid, 0);
                BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(C198939eR.A08, 26, 17);
                bluetoothGattCharacteristic.addDescriptor(new BluetoothGattDescriptor(C198939eR.A07, 17));
                bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
                boolean addService = bluetoothGattServer.addService(bluetoothGattService);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("addService: Added ");
                A0u.append(uuid);
                AnonymousClass6YR.A06("lam:LinkedDeviceManager/gatt", C36371kC.A0z(" = ", A0u, addService));
            } catch (Throwable unused) {
            }
        }
        AnonymousClass9OE r02 = this.this$0;
        C198939eR r6 = r02.A02;
        Integer A00 = r02.A03.A00();
        UUID uuid2 = this.this$0.A00.A02;
        byte[] bArr = r6.A06;
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (A00 != null) {
            s = (short) A00.intValue();
        } else {
            s = 0;
        }
        order.putShort(s);
        BluetoothGattServer bluetoothGattServer2 = r6.A00;
        if (!(bluetoothGattServer2 == null || (service = bluetoothGattServer2.getService(uuid2)) == null || (characteristic = service.getCharacteristic(C198939eR.A08)) == null)) {
            characteristic.setValue(bArr);
            for (BluetoothDevice notifyCharacteristicChanged : r6.A04) {
                bluetoothGattServer2.notifyCharacteristicChanged(notifyCharacteristicChanged, characteristic, false);
            }
        }
        AVZ avz = this.this$0.A01;
        avz.A01.A05.execute(avz);
        return AnonymousClass0AJ.A00;
    }
}
