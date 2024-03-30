package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4bE  reason: invalid class name and case insensitive filesystem */
public class C90964bE extends BroadcastReceiver implements C19710wO, BluetoothProfile.ServiceListener {
    public BluetoothHeadset A00;
    public AudioDeviceCallback A01;
    public WeakReference A02;
    public int A03 = -1;
    public final Context A04;
    public final C21060yb A05;
    public final Set A06 = Collections.newSetFromMap(C90524aI.A0s());

    public static String A00(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN BLUETOOTH CONNECTION STATE" : "DISCONNECTING" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public String BIB() {
        return "BluetoothHeadsetMonitor";
    }

    public /* synthetic */ void BRM() {
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C148816zT r3;
        Object connectedDevices;
        if (i == 1) {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            this.A00 = bluetoothHeadset;
            WeakReference weakReference = this.A02;
            if (weakReference != null) {
                r3 = (C148816zT) weakReference.get();
                if (r3 != null && !r3.A02) {
                    if (bluetoothHeadset != null) {
                        AudioManager A0D = this.A05.A0D();
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("BluetoothHeadsetMonitor/onServiceConnected ");
                        A0u.append(this.A00);
                        A0u.append(", devices: ");
                        if (C19550w8.A08()) {
                            connectedDevices = A01(A0D);
                        } else {
                            connectedDevices = this.A00.getConnectedDevices();
                        }
                        A0u.append(connectedDevices);
                        C36321k7.A1K(r3, ", ", A0u);
                        r3.A06(Voip.getCallInfo());
                        return;
                    }
                    return;
                }
            } else {
                r3 = null;
            }
            C36321k7.A1L(r3, "BluetoothHeadsetMonitor/onServiceConnected VoipInterface already Destroyed ", AnonymousClass000.A0u());
        }
    }

    public void onServiceDisconnected(int i) {
        C148816zT r2;
        if (i == 1) {
            WeakReference weakReference = this.A02;
            if (weakReference != null) {
                r2 = (C148816zT) weakReference.get();
            } else {
                r2 = null;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BluetoothHeadsetMonitor/onServiceDisconnected ");
            A0u.append(this.A00);
            C36321k7.A1K(r2, ", ", A0u);
            this.A00 = null;
            if (r2 == null || r2.A02) {
                C36321k7.A1L(r2, "BluetoothHeadsetMonitor/onServiceDisconnected VoipInterface already Destroyed ", AnonymousClass000.A0u());
            } else {
                r2.A0C(Voip.getCallInfo(), false);
            }
        }
    }

    private void A02() {
        this.A01 = new C91404bx(this);
    }

    public static void A03(C90964bE r1, int i) {
        if (r1.A03 != i) {
            r1.A03 = i;
            for (C158547hg BSG : r1.A06) {
                BSG.BSG(i);
            }
        }
    }

    public void A04(C158547hg r5) {
        Set set = this.A06;
        if (set.isEmpty()) {
            if (C19550w8.A08()) {
                AudioManager A0D = this.A05.A0D();
                if (A0D != null) {
                    A02();
                    AudioDeviceCallback audioDeviceCallback = this.A01;
                    C18740tg.A06(audioDeviceCallback);
                    A0D.registerAudioDeviceCallback(audioDeviceCallback, (Handler) null);
                }
            } else {
                C26981Mg.A01(this, this.A04, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"), true);
            }
        }
        set.add(r5);
    }

    public void A05(C158547hg r3) {
        Set set = this.A06;
        if (set.remove(r3) && set.isEmpty()) {
            if (C19550w8.A08()) {
                AudioManager A0D = this.A05.A0D();
                if (A0D != null) {
                    AudioDeviceCallback audioDeviceCallback = this.A01;
                    C18740tg.A06(audioDeviceCallback);
                    A0D.unregisterAudioDeviceCallback(audioDeviceCallback);
                    return;
                }
                return;
            }
            this.A04.unregisterReceiver(this);
        }
    }

    public C90964bE(Context context, C21060yb r3) {
        this.A04 = context;
        this.A05 = r3;
    }

    public static ArrayList A01(AudioManager audioManager) {
        ArrayList A002 = AnonymousClass6HL.A00(audioManager);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            A0I.add(((AudioDeviceInfo) it.next()).getAddress());
        }
        return A0I;
    }

    public void BRL() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                defaultAdapter.getProfileProxy(this.A04, this, 1);
            } catch (Exception e) {
                Log.e((Throwable) e);
            }
        } else {
            Log.e("BluetoothHeadsetMonitor/init failed to get bluetoothAdapter");
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BluetoothHeadsetMonitor/bluetoothConnectionReceiver [");
            A0u.append(A00(intExtra2));
            A0u.append(" -> ");
            A0u.append(A00(intExtra));
            C36321k7.A1a(A0u, "]");
            if (intExtra != intExtra2) {
                A03(this, intExtra);
            }
        }
    }
}
