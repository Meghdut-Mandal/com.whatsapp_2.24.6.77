package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass0JG;
import X.AnonymousClass0JH;
import X.AnonymousClass0JL;
import X.AnonymousClass0KH;
import X.AnonymousClass0KV;
import X.AnonymousClass0LV;
import X.AnonymousClass0OR;
import X.AnonymousClass0S9;
import X.AnonymousClass0U9;
import X.C006302t;
import X.C04290Kb;
import X.C04300Kc;
import X.C04380Kk;
import X.C04390Kl;
import X.C04400Km;
import X.C04520Ky;
import X.C05250Oz;
import X.C07180Wq;
import X.C07590Yl;
import X.C10050dc;
import X.C10060dd;
import X.C10210ds;
import X.C10220dt;
import X.C10230du;
import X.C10240dv;
import X.C36321k7;
import X.C36331k8;
import X.C90484aE;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.zzw;

public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion();
    public static final int DEFAULT_VALUE = 1;
    public static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    public static final String TAG = "HiddenActivity";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    private final void handleBeginSignIn() {
        C04400Km r3 = (C04400Km) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r3 != null) {
            AnonymousClass006.A01(this);
            AnonymousClass0JL r6 = new AnonymousClass0JL((Activity) this, new C10060dd());
            AnonymousClass006.A01(r3);
            AnonymousClass006.A01(r3);
            AnonymousClass0U9 r1 = new AnonymousClass0U9();
            C04390Kl r0 = r3.A01;
            AnonymousClass006.A01(r0);
            r1.A01 = r0;
            AnonymousClass0KH r02 = r3.A04;
            AnonymousClass006.A01(r02);
            r1.A04 = r02;
            C04290Kb r03 = r3.A03;
            AnonymousClass006.A01(r03);
            r1.A03 = r03;
            AnonymousClass0KV r04 = r3.A02;
            AnonymousClass006.A01(r04);
            r1.A02 = r04;
            r1.A06 = r3.A06;
            r1.A00 = r3.A00;
            String str = r3.A05;
            if (str != null) {
                r1.A05 = str;
            }
            r1.A05 = r6.A00;
            C04400Km A00 = r1.A00();
            C07180Wq r32 = new C07180Wq((AnonymousClass0OR) null);
            r32.A03 = new C04520Ky[]{AnonymousClass0S9.A00};
            r32.A01 = new C10230du(A00, r6);
            r32.A02 = false;
            r32.A00 = 1553;
            zzw A01 = C07590Yl.A01(r6, r32.A00(), 0);
            A01.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda4(new HiddenActivity$handleBeginSignIn$1$1(this, intExtra)));
            A01.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda3(this));
            return;
        }
        Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
        finish();
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C36321k7.A0w(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !AnonymousClass000.A1Z(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A01)) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        AnonymousClass00C.A0B(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C36331k8.A0i("During begin sign in, failure response from one tap: ", AnonymousClass000.A0u(), exc));
    }

    private final void handleCreatePassword() {
        C04300Kc r3 = (C04300Kc) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r3 != null) {
            AnonymousClass006.A01(this);
            AnonymousClass0JH r6 = new AnonymousClass0JH(this, new C10050dc());
            AnonymousClass006.A01(r3);
            AnonymousClass006.A01(r3);
            C04300Kc r4 = new C04300Kc(r3.A01, r6.A00, r3.A00);
            C07180Wq r32 = new C07180Wq((AnonymousClass0OR) null);
            r32.A03 = new C04520Ky[]{AnonymousClass0S9.A04};
            r32.A01 = new C10220dt(r4, r6);
            r32.A02 = false;
            r32.A00 = 1536;
            zzw A01 = C07590Yl.A01(r6, r32.A00(), 0);
            A01.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda7(new HiddenActivity$handleCreatePassword$1$1(this, intExtra)));
            A01.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda2(this));
            return;
        }
        Log.i(TAG, "During save password, params is null, nothing to launch for create password");
        finish();
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C36321k7.A0w(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !AnonymousClass000.A1Z(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A01)) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        AnonymousClass00C.A0B(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C36331k8.A0i("During save password, found password failure response from one tap ", AnonymousClass000.A0u(), exc));
    }

    private final void handleCreatePublicKeyCredential() {
        AnonymousClass0LV r4 = (AnonymousClass0LV) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r4 != null) {
            AnonymousClass0JG r2 = new AnonymousClass0JG(this);
            C07180Wq r1 = new C07180Wq((AnonymousClass0OR) null);
            r1.A01 = new C10210ds(r2, r4);
            r1.A00 = 5407;
            zzw A01 = C07590Yl.A01(r2, r1.A00(), 0);
            A01.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda5(new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra)));
            A01.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda0(this));
            return;
        }
        Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
        finish();
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C36321k7.A0w(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !AnonymousClass000.A1Z(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A01)) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        AnonymousClass00C.A0B(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C36331k8.A0i("During create public key credential, fido registration failure: ", AnonymousClass000.A0u(), exc));
    }

    private final void handleGetSignInIntent() {
        C04380Kk r5 = (C04380Kk) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r5 != null) {
            AnonymousClass006.A01(this);
            AnonymousClass0JL r4 = new AnonymousClass0JL((Activity) this, new C10060dd());
            AnonymousClass006.A01(r5);
            AnonymousClass006.A01(r5);
            String str = r5.A01;
            AnonymousClass006.A01(str);
            String str2 = r5.A04;
            String str3 = r5.A02;
            boolean z = r5.A05;
            C04380Kk r6 = new C04380Kk(str, str3, r4.A00, str2, r5.A00, z);
            C07180Wq r52 = new C07180Wq((AnonymousClass0OR) null);
            r52.A03 = new C04520Ky[]{AnonymousClass0S9.A05};
            r52.A01 = new C10240dv(r6, r4);
            r52.A00 = 1555;
            zzw A01 = C07590Yl.A01(r4, r52.A00(), 0);
            A01.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda6(new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra)));
            A01.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda1(this));
            return;
        }
        Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
        finish();
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C36321k7.A0w(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !AnonymousClass000.A1Z(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A01)) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        AnonymousClass00C.A0B(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C36331k8.A0i("During get sign-in intent, failure response from one tap: ", AnonymousClass000.A0u(), exc));
    }

    /* access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver2, String str, String str2) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        A07.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        A07.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver2.send(Integer.MAX_VALUE, A07);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        A07.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
        A07.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            resultReceiver2.send(i2, A07);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver2 = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver2;
        if (resultReceiver2 == null) {
            finish();
        }
        restoreState(bundle);
        if (!this.mWaitingForActivityResult) {
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                            handleBeginSignIn();
                            return;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                            handleCreatePublicKeyCredential();
                            return;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                            handleCreatePassword();
                            return;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                            handleGetSignInIntent();
                            return;
                        }
                        break;
                }
            }
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }

    public static final void handleBeginSignIn$lambda$10$lambda$8(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }
}
