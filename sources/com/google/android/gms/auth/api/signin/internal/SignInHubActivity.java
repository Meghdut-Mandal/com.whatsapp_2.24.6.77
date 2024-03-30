package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass01I;
import X.C07170Wp;
import X.C07540Ye;
import X.C07550Yf;
import X.C09920dN;
import X.C12180hd;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends AnonymousClass01I {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    private final void A01(int i) {
        Status status = new Status(i, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        A05 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                int i3 = 8;
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.A02) != null) {
                        C07170Wp A002 = C07170Wp.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        Objects.requireNonNull(googleSignInAccount);
                        synchronized (A002) {
                            C07550Yf r5 = A002.A02;
                            AnonymousClass006.A01(googleSignInAccount);
                            AnonymousClass006.A01(googleSignInOptions);
                            String str = googleSignInAccount.A07;
                            r5.A04("defaultGoogleSignInAccount", str);
                            AnonymousClass006.A01(googleSignInAccount);
                            AnonymousClass006.A01(googleSignInOptions);
                            String A0p = AnonymousClass000.A0p(":", str, AnonymousClass000.A0v("googleSignInAccount"));
                            JSONObject jSONObject = new JSONObject();
                            try {
                                String str2 = googleSignInAccount.A02;
                                if (str2 != null) {
                                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                                }
                                String str3 = googleSignInAccount.A03;
                                if (str3 != null) {
                                    jSONObject.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A04;
                                if (str4 != null) {
                                    jSONObject.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A05;
                                if (str5 != null) {
                                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str5);
                                }
                                String str6 = googleSignInAccount.A08;
                                if (str6 != null) {
                                    jSONObject.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A09;
                                if (str7 != null) {
                                    jSONObject.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A01;
                                if (uri != null) {
                                    jSONObject.put("photoUrl", uri.toString());
                                }
                                String str8 = googleSignInAccount.A06;
                                if (str8 != null) {
                                    jSONObject.put("serverAuthCode", str8);
                                }
                                jSONObject.put("expirationTime", googleSignInAccount.A00);
                                jSONObject.put("obfuscatedIdentifier", str);
                                JSONArray jSONArray = new JSONArray();
                                List list = googleSignInAccount.A0A;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, C12180hd.A00);
                                for (Scope scope : scopeArr) {
                                    jSONArray.put(scope.A01);
                                }
                                jSONObject.put("grantedScopes", jSONArray);
                                jSONObject.remove("serverAuthCode");
                                r5.A04(A0p, jSONObject.toString());
                                String A0p2 = AnonymousClass000.A0p(":", str, AnonymousClass000.A0v("googleSignInOptions"));
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    JSONArray jSONArray2 = new JSONArray();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0B);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put(((Scope) it.next()).A01);
                                    }
                                    jSONObject2.put("scopes", jSONArray2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        jSONObject2.put("accountName", account.name);
                                    }
                                    jSONObject2.put("idTokenRequested", googleSignInOptions.A05);
                                    jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    jSONObject2.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        jSONObject2.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        jSONObject2.put("hostedDomain", str10);
                                    }
                                    r5.A04(A0p2, jSONObject2.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    runtimeException = AnonymousClass001.A0B(e);
                                    throw runtimeException;
                                }
                            } catch (JSONException e2) {
                                runtimeException = AnonymousClass001.A0B(e2);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent2;
                        C07540Ye.A00(this).A03(new C09920dN(this));
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode") && (i3 = intent2.getIntExtra("errorCode", 8)) == 13) {
                        i3 = 12501;
                    }
                }
                A01(i3);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String packageName;
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            i = 12500;
        } else {
            boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                Bundle bundleExtra = intent.getBundleExtra("config");
                Objects.requireNonNull(bundleExtra);
                SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
                if (signInConfiguration == null) {
                    Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    setResult(0);
                } else {
                    this.A02 = signInConfiguration;
                    if (bundle != null) {
                        boolean z = bundle.getBoolean("signingInGoogleApiClients");
                        this.A04 = z;
                        if (z) {
                            this.A00 = bundle.getInt("signInResultCode");
                            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                            Objects.requireNonNull(intent2);
                            this.A01 = intent2;
                            C07540Ye.A00(this).A03(new C09920dN(this));
                            A05 = false;
                            return;
                        }
                        return;
                    } else if (A05) {
                        setResult(0);
                        i = 12502;
                    } else {
                        A05 = true;
                        Intent intent3 = new Intent(action);
                        if (equals) {
                            packageName = "com.google.android.gms";
                        } else {
                            packageName = getPackageName();
                        }
                        intent3.setPackage(packageName);
                        intent3.putExtra("config", this.A02);
                        try {
                            startActivityForResult(intent3, 40962);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            this.A03 = true;
                            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                            A01(17);
                            return;
                        }
                    }
                }
            } else {
                Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            }
            finish();
            return;
        }
        A01(i);
    }

    public final void onDestroy() {
        super.onDestroy();
        A05 = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
