package com.whatsapp.registration.passkey;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3TX;
import X.AnonymousClass97X;
import X.AnonymousClass97Y;
import X.C009003v;
import X.C023509x;
import X.C182138ob;
import X.C182148oc;
import X.C188188zB;
import X.C36351kA;
import X.C51972og;
import X.C62973Ig;
import X.C77383qP;
import android.util.Base64;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkey.PasskeyVerifier$onPasskeyChallengeReceived$1$1", f = "PasskeyVerifier.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyVerifier$onPasskeyChallengeReceived$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ long $passkeyApiRequestStartTime;
    public final /* synthetic */ String $passkeyChallenge;
    public int label;
    public final /* synthetic */ C77383qP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyVerifier$onPasskeyChallengeReceived$1$1(C77383qP r2, String str, C023509x r4, long j) {
        super(2, r4);
        this.this$0 = r2;
        this.$passkeyChallenge = str;
        this.$passkeyApiRequestStartTime = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new PasskeyVerifier$onPasskeyChallengeReceived$1$1(this.this$0, this.$passkeyChallenge, r8, this.$passkeyApiRequestStartTime);
    }

    public final Object invokeSuspend(Object obj) {
        C009003v r1;
        C51972og r0;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C77383qP r02 = this.this$0;
            PasskeyAndroidApiImpl passkeyAndroidApiImpl = r02.A07;
            Object obj2 = r02.A09.get();
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            String str = this.$passkeyChallenge;
            this.label = 1;
            obj = passkeyAndroidApiImpl.A01((AnonymousClass01L) obj2, str, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass97X r15 = (AnonymousClass97X) obj;
        if (r15 instanceof C182148oc) {
            Log.i("PasskeyVerification/onPasskeyChallengeReceived/PasskeyLoginEvent/passkey_client_login_success");
            AnonymousClass3TX.A00(this.this$0.A06, Long.valueOf(System.currentTimeMillis() - this.$passkeyApiRequestStartTime), "verify_passkey", "passkey_client_login_success", (String) null, (String) null);
            this.this$0.A0A.invoke(C51972og.SUCCESS, Base64.encodeToString(C36351kA.A1b((String) ((C182148oc) r15).A00), 2));
        } else if (r15 instanceof C182138ob) {
            long currentTimeMillis = System.currentTimeMillis() - this.$passkeyApiRequestStartTime;
            C62973Ig r12 = (C62973Ig) ((C182138ob) r15).A00;
            C188188zB r03 = r12.A00;
            Throwable th = r12.A01;
            int ordinal = r03.ordinal();
            if (ordinal == 1) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_cancelled", th);
                this.this$0.A06.A03(AnonymousClass97Y.A00(th), "passkey_client_login_cancelled", currentTimeMillis);
                r1 = this.this$0.A0A;
                r0 = C51972og.ANDROID_API_VERIFICATION_CANCELLED;
            } else if (ordinal == 0) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_ineligible", th);
                this.this$0.A06.A03(AnonymousClass97Y.A00(th), "passkey_client_login_ineligible", currentTimeMillis);
                r1 = this.this$0.A0A;
                r0 = C51972og.ANDROID_API_VERIFICATION_INELIGIBLE;
            } else if (ordinal == 2) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_nopasskey", th);
                this.this$0.A06.A03(AnonymousClass97Y.A00(th), "passkey_client_login_nopasskey", currentTimeMillis);
                r1 = this.this$0.A0A;
                r0 = C51972og.ANDROID_API_VERIFICATION_NOPASSKEY;
            } else if (ordinal == 3 || ordinal == 4) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_error", th);
                this.this$0.A06.A03(AnonymousClass97Y.A00(th), "passkey_client_login_error", currentTimeMillis);
                r1 = this.this$0.A0A;
                r0 = C51972og.ANDROID_API_VERIFICATION_FAILED;
            }
            r1.invoke(r0, (Object) null);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PasskeyVerifier$onPasskeyChallengeReceived$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
