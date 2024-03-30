package X;

import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.4cX  reason: invalid class name and case insensitive filesystem */
public class C91734cX extends Connection {
    public C27681Pg A00;
    public AnonymousClass13J A01;
    public String A02;

    public void A01(int i) {
        if (this.A00 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/SelfManagedConnection/setDisconnected ");
            A0u.append(this.A02);
            C36321k7.A1T(", cause: ", A0u, i);
            setDisconnected(new DisconnectCause(i));
            destroy();
            this.A00.A0A(this);
            this.A00 = null;
        }
    }

    public void onAbort() {
        Log.i("voip/SelfManagedConnection/onAbort");
        super.onAbort();
    }

    public void onAnswer(int i) {
        Log.i("voip/SelfManagedConnection/onAnswer");
        C27681Pg r2 = this.A00;
        if (r2 != null) {
            r2.A0C(this.A02, 2);
        }
        setActive();
    }

    public void onDisconnect() {
        Log.i("voip/SelfManagedConnection/onDisconnect");
        C27681Pg r2 = this.A00;
        if (r2 != null) {
            r2.A0C(this.A02, 4);
        }
        A01(2);
    }

    public void onShowIncomingCallUi() {
        Log.i("voip/SelfManagedConnection/onShowIncomingCallUi");
        C27681Pg r0 = this.A00;
        if (r0 != null) {
            String str = this.A02;
            C18740tg.A01();
            Iterator A0s = C36361kB.A0s(r0);
            while (A0s.hasNext()) {
                ((AnonymousClass1Pk) A0s.next()).A03(str);
            }
        }
    }

    public C91734cX(C27681Pg r1, AnonymousClass13J r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public String A00() {
        return this.A02;
    }

    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        C36321k7.A1K(callAudioState, "voip/SelfManagedConnection/onCallAudioStateChanged ", AnonymousClass000.A0u());
        super.onCallAudioStateChanged(callAudioState);
        C27681Pg r1 = this.A00;
        if (r1 != null) {
            r1.A06(callAudioState, this.A02);
        }
    }

    public void onHold() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/SelfManagedConnection/onHold, AudioModeIsVoip: ");
        C36331k8.A1S(A0u, getAudioModeIsVoip());
        C27681Pg r2 = this.A00;
        if (r2 != null) {
            r2.A0C(this.A02, 0);
        }
        setOnHold();
    }

    public void onReject(String str) {
        C36321k7.A1Q("voip/SelfManagedConnection/onReject ", str, AnonymousClass000.A0u());
        onReject();
    }

    public void onStateChanged(int i) {
        C36321k7.A1T("voip/SelfManagedConnection/onStateChanged ", AnonymousClass000.A0u(), i);
        super.onStateChanged(i);
    }

    public void onUnhold() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/SelfManagedConnection/onUnhold, AudioModeIsVoip: ");
        C36331k8.A1S(A0u, getAudioModeIsVoip());
        C27681Pg r2 = this.A00;
        if (r2 != null) {
            r2.A0C(this.A02, 1);
        }
        setAudioModeIsVoip(true);
        setActive();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SelfManagedConnection: ");
        return AnonymousClass000.A0q(this.A02, A0u);
    }

    public void A02(String str) {
        this.A02 = str;
    }

    public void onExtrasChanged(Bundle bundle) {
        super.onExtrasChanged(bundle);
    }

    public void onAnswer() {
        onAnswer(0);
    }

    public void onReject() {
        Log.i("voip/SelfManagedConnection/onReject");
        C27681Pg r2 = this.A00;
        if (r2 != null) {
            r2.A0C(this.A02, 3);
        }
        A01(6);
    }
}
