package X;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.whatsapp.R;
import com.whatsapp.calling.telecom.SelfManagedConnectionService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1Pg  reason: invalid class name and case insensitive filesystem */
public class C27681Pg extends C19590wC {
    public PhoneAccountHandle A00;
    public boolean A01;
    public final C21060yb A02;
    public final ConcurrentMap A03 = new ConcurrentHashMap(2);
    public final ComponentName A04;
    public final C19730wQ A05;
    public final C19630wG A06;
    public final C20810yC A07;
    public final AnonymousClass13J A08;
    public volatile boolean A09;

    public int A01() {
        return C20800yB.A00(C21000yV.A02, ((AnonymousClass13K) this.A08).A02, 1658);
    }

    public C91734cX A03(String str) {
        return (C91734cX) this.A03.get(str);
    }

    public void A05() {
        C21060yb r4 = this.A02;
        if (r4.A0I() == null) {
            Log.w("voip/SelfManagedConnectionsManager/unregisterPhoneAccount telecomManager is null");
            return;
        }
        Log.i("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts");
        try {
            TelecomManager.class.getMethod("clearPhoneAccounts", new Class[0]).invoke(r4.A0I(), new Object[0]);
            this.A00 = null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public boolean A0E() {
        return C20800yB.A01(C21000yV.A02, this.A07, 2186);
    }

    public boolean A0F() {
        this.A09 = C20800yB.A01(C21000yV.A02, this.A07, 1641);
        return this.A09;
    }

    public boolean A0G() {
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A07, 1642);
        this.A01 = A012;
        return A012;
    }

    public boolean A0H() {
        String str;
        if (this.A00 != null) {
            return true;
        }
        C21060yb r4 = this.A02;
        if (r4.A0I() == null) {
            str = "voip/SelfManagedConnectionsManager/registerPhoneAccount telecomManager is null";
        } else {
            C19730wQ r0 = this.A05;
            r0.A0G();
            PhoneUserJid phoneUserJid = r0.A03;
            if (phoneUserJid == null) {
                str = "voip/SelfManagedConnectionsManager/registerPhoneAccount jid is null";
            } else {
                Uri A002 = A00(phoneUserJid);
                if (A002 == null) {
                    str = "voip/SelfManagedConnectionsManager/registerPhoneAccount address is null";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/SelfManagedConnectionsManager/registerPhoneAccount ");
                    sb.append(phoneUserJid);
                    Log.i(sb.toString());
                    PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(this.A04, phoneUserJid.getRawString());
                    this.A00 = phoneAccountHandle;
                    Context context = this.A06.A00;
                    PhoneAccount.Builder shortDescription = PhoneAccount.builder(phoneAccountHandle, context.getString(R.string.f12nameremoved)).addSupportedUriScheme("tel").setAddress(A002).setCapabilities(3080).setShortDescription(context.getString(R.string.f12nameremoved));
                    if (Build.VERSION.SDK_INT >= 28) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
                        shortDescription.setExtras(bundle);
                    }
                    try {
                        r4.A0I().registerPhoneAccount(shortDescription.build());
                        return true;
                    } catch (Exception e) {
                        Log.e((Throwable) e);
                        this.A00 = null;
                        return false;
                    }
                }
            }
        }
        Log.w(str);
        return false;
    }

    public C27681Pg(C19730wQ r4, C21060yb r5, C19630wG r6, C20810yC r7, AnonymousClass13J r8) {
        this.A07 = r7;
        this.A05 = r4;
        this.A06 = r6;
        this.A08 = r8;
        this.A02 = r5;
        this.A04 = new ComponentName(r6.A00, SelfManagedConnectionService.class);
    }

    public static Uri A00(UserJid userJid) {
        String A032 = AnonymousClass3U2.A03(AnonymousClass3U8.A07(userJid));
        if (A032 != null) {
            return Uri.fromParts("tel", A032, "");
        }
        Log.i("voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get phone number");
        return null;
    }

    public C91734cX A02(ConnectionRequest connectionRequest, boolean z) {
        Bundle bundle;
        StringBuilder sb;
        String str;
        C18740tg.A01();
        Bundle extras = connectionRequest.getExtras();
        C91734cX r4 = null;
        if (extras == null) {
            sb = new StringBuilder();
            str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection extras is null for request ";
        } else {
            if (!z) {
                bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
                if (bundle == null) {
                    sb = new StringBuilder();
                    str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection EXTRA_INCOMING_CALL_EXTRAS is null for request ";
                }
            } else {
                bundle = extras;
            }
            String string = bundle.getString("call_id");
            UserJid A022 = UserJid.Companion.A02(bundle.getString("peer_jid"));
            String string2 = bundle.getString("peer_display_name");
            boolean z2 = bundle.getBoolean("is_rejoin", false);
            if (string == null || A022 == null || string2 == null) {
                sb = new StringBuilder();
                str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection invalid request ";
            } else {
                r4 = new C91734cX(this, this.A08, string);
                r4.setConnectionProperties(128);
                r4.setAddress(connectionRequest.getAddress(), 1);
                r4.setCallerDisplayName(string2, 1);
                r4.setConnectionCapabilities(r4.getConnectionCapabilities() | 2);
                r4.setVideoState(connectionRequest.getVideoState());
                r4.setExtras(extras);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("voip/SelfManagedConnectionsManager/createSelfManagedConnection with ");
                sb2.append(A022);
                sb2.append(", call id: ");
                sb2.append(string);
                sb2.append(", isOutgoing ");
                sb2.append(z);
                Log.i(sb2.toString());
                A09(r4);
                for (AnonymousClass1Pk r0 : getObservers()) {
                    if (z) {
                        r0.A05(string, z2);
                    } else {
                        r0.A01(string);
                    }
                }
                return r4;
            }
        }
        sb.append(str);
        sb.append(connectionRequest);
        Log.i(sb.toString());
        return r4;
    }

    public void A04() {
        C18740tg.A01();
        ConcurrentMap concurrentMap = this.A03;
        if (!concurrentMap.isEmpty()) {
            Log.i("voip/SelfManagedConnectionsManager/removeAllConnections");
            Iterator it = new ArrayList(concurrentMap.values()).iterator();
            while (it.hasNext()) {
                ((C91734cX) it.next()).A01(2);
            }
            C18740tg.A0D(concurrentMap.isEmpty(), "all connection should have been removed");
        }
    }

    public void A06(CallAudioState callAudioState, String str) {
        C18740tg.A01();
        for (AnonymousClass1Pk A002 : getObservers()) {
            A002.A00(callAudioState, str);
        }
    }

    public void A07(ConnectionRequest connectionRequest) {
        String string;
        C18740tg.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            for (AnonymousClass1Pk A022 : getObservers()) {
                A022.A02(string);
            }
        }
    }

    public void A08(ConnectionRequest connectionRequest) {
        String string;
        C18740tg.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            for (AnonymousClass1Pk r5 : getObservers()) {
                if (r5 instanceof C27711Pl) {
                    C27711Pl r52 = (C27711Pl) r5;
                    C18740tg.A01();
                    AnonymousClass1NE r3 = r52.A05;
                    AnonymousClass6NW r2 = r3.A0Z;
                    StringBuilder sb = new StringBuilder();
                    sb.append("app/startOutgoingCall/onCreateOutgoingConnectionFailed ");
                    sb.append(string);
                    sb.append(", pendingCallCommand: ");
                    sb.append(r2);
                    Log.i(sb.toString());
                    if (r2 != null && string.equals(r2.A0A)) {
                        Log.w("app/startOutgoingCall/failed_create_outgoing_connection");
                        r3.A0Z = null;
                        r3.A02.removeMessages(1);
                    }
                    r52.A04.A04(string, 97);
                } else {
                    C18740tg.A01();
                }
            }
        }
    }

    public void A09(C91734cX r4) {
        C18740tg.A01();
        ConcurrentMap concurrentMap = this.A03;
        concurrentMap.put(r4.A00(), r4);
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/addConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A0A(C91734cX r4) {
        C18740tg.A01();
        ConcurrentMap concurrentMap = this.A03;
        concurrentMap.remove(r4.A00());
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/removeConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A0B(String str) {
        C18740tg.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/disconnectConnectionIfExists");
        sb.append(str);
        Log.i(sb.toString());
        C91734cX A032 = A03(str);
        if (A032 != null) {
            A032.A01(2);
        }
    }

    public void A0C(String str, int i) {
        C18740tg.A01();
        for (AnonymousClass1Pk A042 : getObservers()) {
            A042.A04(str, i);
        }
    }

    public void A0D(String str, String str2) {
        C91734cX A032 = A03(str);
        if (A032 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip/SelfManagedConnectionsManager/onCallAutoConnected changing CallId from: ");
            sb.append(str);
            sb.append(" -> ");
            sb.append(str2);
            Log.i(sb.toString());
            A0A(A032);
            A032.A02(str2);
            A09(A032);
        }
    }

    public boolean A0I(UserJid userJid, String str, String str2, boolean z) {
        String str3;
        C18740tg.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (!this.A09) {
            str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall incomingEnabled is false";
        } else {
            C21060yb r4 = this.A02;
            if (r4.A0I() == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0I().isIncomingCallPermitted(this.A00)) {
                        Log.i("voip/SelfManagedConnectionsManager/addNewIncomingCall incoming call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A002 = A00(userJid);
                    if (A002 != null) {
                        Bundle bundle = new Bundle();
                        if (z) {
                            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("call_id", str);
                        bundle2.putString("peer_jid", userJid.getRawString());
                        bundle2.putString("peer_display_name", str2);
                        bundle2.putBoolean("is_rejoin", false);
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", bundle2);
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", A002);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/addNewIncomingCall callId=");
                        sb2.append(str);
                        sb2.append(", peerJid=");
                        sb2.append(userJid);
                        sb2.append(", videoCall=");
                        sb2.append(z);
                        sb2.append(", isRejoin=false");
                        Log.i(sb2.toString());
                        r4.A0I().addNewIncomingCall(this.A00, bundle);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }

    public boolean A0J(UserJid userJid, String str, String str2, boolean z, boolean z2) {
        String str3;
        C18740tg.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/placeOutgoingCall ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (!this.A01) {
            str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall outgoingEnabled is false";
        } else {
            C21060yb r4 = this.A02;
            if (r4.A0I() == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0I().isOutgoingCallPermitted(this.A00)) {
                        Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall outgoing call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A002 = A00(userJid);
                    if (A002 != null) {
                        if (z) {
                            String str4 = Build.MANUFACTURER;
                            if (str4.equalsIgnoreCase("samsung") || str4.equalsIgnoreCase("oppo") || str4.equalsIgnoreCase("OnePlus")) {
                                z = false;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (z) {
                            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("call_id", str);
                        bundle2.putString("peer_jid", userJid.getRawString());
                        bundle2.putString("peer_display_name", str2);
                        bundle2.putBoolean("is_rejoin", z2);
                        bundle.putParcelable("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle2);
                        bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", this.A00);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/placeOutgoingCall callId=");
                        sb2.append(str);
                        sb2.append(", peerJid=");
                        sb2.append(userJid);
                        sb2.append(", videoCall=");
                        sb2.append(z);
                        sb2.append(", isRejoin=");
                        sb2.append(z2);
                        Log.i(sb2.toString());
                        r4.A0I().placeCall(A002, bundle);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }
}
