package X;

import android.app.Activity;
import com.whatsapp.registration.passkey.PasskeyVerifier$onPasskeyChallengeReceived$1$1;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3qP  reason: invalid class name and case insensitive filesystem */
public final class C77383qP implements AnonymousClass4UE {
    public final C21060yb A00;
    public final C19630wG A01;
    public final C19420v0 A02;
    public final C21520zN A03;
    public final AnonymousClass3UV A04;
    public final C199929gH A05;
    public final AnonymousClass3TX A06;
    public final PasskeyAndroidApiImpl A07;
    public final C19770wU A08;
    public final WeakReference A09;
    public final C009003v A0A;

    public void BTw(C52082or r5, C66713Xa r6, String str) {
        C36321k7.A1K(r5, "PasskeyVerification/onCodeEntrypointResponse/status=", C36401kF.A0t(r5, 1));
        if (r6 == null || r5 != C52082or.YES) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PasskeyVerification/PasskeyLoginEvent/passkey_start_login_error/error=");
            String name = r5.name();
            C36321k7.A1Z(A0u, name);
            this.A06.A09("enter_number", "passkey_start_login_error", name);
            C65983Uf.A0Q(this.A02, name);
            this.A0A.invoke(C51972og.CODE_REQUEST_FAILURE, (Object) null);
            return;
        }
        Log.i("PasskeyVerification/passkeyLoginEvent/passkey_start_login_success");
        this.A06.A06("enter_number", "passkey_start_login_success");
        A00(r6.A0C);
    }

    public C77383qP(C21060yb r2, C19630wG r3, C19420v0 r4, C21520zN r5, AnonymousClass3UV r6, C199929gH r7, AnonymousClass3TX r8, PasskeyAndroidApiImpl passkeyAndroidApiImpl, C19770wU r10, WeakReference weakReference, C009003v r12) {
        C36321k7.A1B(r3, r2, r5, r4, r6);
        C36321k7.A13(r10, r7, passkeyAndroidApiImpl);
        AnonymousClass00C.A0D(r8, 9);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A08 = r10;
        this.A05 = r7;
        this.A07 = passkeyAndroidApiImpl;
        this.A06 = r8;
        this.A09 = weakReference;
        this.A0A = r12;
    }

    public final void A00(String str) {
        Log.i("PasskeyVerification/onPasskeyChallengeReceived/attempt to verify authResponse");
        AnonymousClass014 r0 = (AnonymousClass014) this.A09.get();
        long currentTimeMillis = System.currentTimeMillis();
        if (r0 != null) {
            String str2 = str;
            if (str != null) {
                C36331k8.A1T(new PasskeyVerifier$onPasskeyChallengeReceived$1$1(this, str2, (C023509x) null, currentTimeMillis), C33311f5.A00(r0));
                return;
            }
            Log.e("PasskeyVerification/passkeyEvent/passkey_start_login_error/invalidCode");
            this.A06.A09("enter_number", "passkey_start_login_error", "invalid_or_empty_code");
            this.A0A.invoke(C51972og.CODE_REQUEST_FAILURE, (Object) null);
            return;
        }
        Log.e("PasskeyVerification/PasskeyLoginEvent/passkey_client_login_error/error=parent_activity_null");
        AnonymousClass3TX.A00(this.A06, Long.valueOf(C36441kJ.A0A(currentTimeMillis)), "enter_number", "passkey_client_login_error", "parent_activity_null", (String) null);
    }

    public void BKC(boolean z, String str) {
        WeakReference weakReference = this.A09;
        if (weakReference.get() != null && z) {
            Object obj = weakReference.get();
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AnonymousClass3SJ.A00((Activity) obj, 9);
        }
    }

    public void Bu4(boolean z, String str) {
        WeakReference weakReference = this.A09;
        if (weakReference.get() != null && z) {
            Object obj = weakReference.get();
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AnonymousClass3SJ.A01((Activity) obj, 9);
        }
    }
}
