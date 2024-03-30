package X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

/* renamed from: X.4bC  reason: invalid class name and case insensitive filesystem */
public class C90944bC extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;
    public final /* synthetic */ C148816zT A02;

    public static String A00(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "UNKNOWN BLUETOOTH SCO STATE" : "CONNECTING" : "CONNECTED" : "DISCONNECTED" : "ERROR";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C90944bC(C148816zT r1) {
        this();
        this.A02 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C56042vd.A01(context);
                    this.A01 = true;
                }
            }
        }
        C18740tg.A01();
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            C148816zT r4 = this.A02;
            int i = r4.A01;
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            r4.A01 = intExtra;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/audio_route/bluetoothScoReceiver/ACTION_SCO_AUDIO_STATE_UPDATED [");
            A0u.append(A00(i));
            A0u.append(" -> ");
            A0u.append(A00(intExtra));
            C36321k7.A1a(A0u, "]");
            CallInfo callInfo = Voip.getCallInfo();
            int i2 = r4.A01;
            if (i2 == 0) {
                if (i == 2 || i == 1) {
                    r4.A0C(callInfo, false);
                    r4.A09(callInfo, (Boolean) null);
                }
            } else if (i2 == 1) {
                if (C19550w8.A08()) {
                    Iterator it = AnonymousClass6HL.A00(r4.A0F.A0D()).iterator();
                    while (it.hasNext()) {
                        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it.next();
                        StringBuilder A0v = AnonymousClass000.A0v("voip/audio_route/bluetoothScoReceiver device name: ");
                        A0v.append(audioDeviceInfo.getProductName());
                        A0v.append(", type: ");
                        A0v.append(audioDeviceInfo.getType());
                        A0v.append(", address: ");
                        C36321k7.A1a(A0v, audioDeviceInfo.getAddress());
                    }
                } else {
                    BluetoothHeadset bluetoothHeadset = r4.A0G.A00;
                    if (bluetoothHeadset != null) {
                        for (BluetoothDevice next : bluetoothHeadset.getConnectedDevices()) {
                            if (bluetoothHeadset.isAudioConnected(next)) {
                                BluetoothClass bluetoothClass = next.getBluetoothClass();
                                StringBuilder A0v2 = AnonymousClass000.A0v("voip/audio_route/bluetoothScoReceiver device name: ");
                                A0v2.append(next.getName());
                                A0v2.append(", device class:");
                                A0v2.append(bluetoothClass.getDeviceClass());
                                A0v2.append(", major class: ");
                                A0v2.append(bluetoothClass.getMajorDeviceClass());
                                A0v2.append(", supports AUDIO: ");
                                A0v2.append(bluetoothClass.hasService(2097152));
                                A0v2.append(", supports TELEPHONY: ");
                                A0v2.append(bluetoothClass.hasService(4194304));
                                A0v2.append(", address: ");
                                C36321k7.A1a(A0v2, next.getAddress());
                            }
                        }
                    }
                }
            }
            r4.A0A(callInfo, (Boolean) null);
        }
    }

    public C90944bC() {
        this.A01 = false;
        this.A00 = C36441kJ.A11();
    }
}
