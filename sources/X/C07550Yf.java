package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Yf  reason: invalid class name and case insensitive filesystem */
public class C07550Yf {
    public static C07550Yf A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public GoogleSignInAccount A01() {
        String A032;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass000.A0p(":", A033, AnonymousClass000.A0v("googleSignInAccount")))) != null) {
            try {
                String str6 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject jSONObject = new JSONObject(A032);
                    String optString = jSONObject.optString("photoUrl");
                    if (!TextUtils.isEmpty(optString)) {
                        uri = Uri.parse(optString);
                    } else {
                        uri = null;
                    }
                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (jSONObject.has("tokenId")) {
                        str = jSONObject.optString("tokenId");
                    } else {
                        str = null;
                    }
                    if (jSONObject.has("email")) {
                        str2 = jSONObject.optString("email");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME)) {
                        str3 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                    } else {
                        str3 = null;
                    }
                    if (jSONObject.has("givenName")) {
                        str4 = jSONObject.optString("givenName");
                    } else {
                        str4 = null;
                    }
                    if (jSONObject.has("familyName")) {
                        str5 = jSONObject.optString("familyName");
                    } else {
                        str5 = null;
                    }
                    String string = jSONObject.getString("obfuscatedIdentifier");
                    AnonymousClass006.A03(string);
                    AnonymousClass006.A01(hashSet);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(uri, optString2, str, str2, str3, (String) null, string, str4, str5, new ArrayList(hashSet), 3, parseLong);
                    if (jSONObject.has("serverAuthCode")) {
                        str6 = jSONObject.optString("serverAuthCode");
                    }
                    googleSignInAccount.A06 = str6;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions A02() {
        String A032;
        String str;
        Account account;
        String str2;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass000.A0p(":", A033, AnonymousClass000.A0v("googleSignInOptions")))) != null) {
            try {
                Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
                String str3 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject jSONObject = new JSONObject(A032);
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(new Scope(1, jSONArray.getString(i)));
                    }
                    if (jSONObject.has("accountName")) {
                        str = jSONObject.optString("accountName");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        account = new Account(str, "com.google");
                    } else {
                        account = null;
                    }
                    ArrayList arrayList = new ArrayList(hashSet);
                    boolean z = jSONObject.getBoolean("idTokenRequested");
                    boolean z2 = jSONObject.getBoolean("serverAuthRequested");
                    boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
                    if (jSONObject.has("serverClientId")) {
                        str2 = jSONObject.optString("serverClientId");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("hostedDomain")) {
                        str3 = jSONObject.optString("hostedDomain");
                    }
                    return new GoogleSignInOptions(account, str2, str3, (String) null, arrayList, AnonymousClass001.A0J(), 3, z, z2, z3);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A03(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return this.A00.getString(str, (String) null);
        } finally {
            lock.unlock();
        }
    }

    public final void A04(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            this.A00.edit().putString(str, str2).apply();
        } finally {
            lock.unlock();
        }
    }

    public C07550Yf(Context context) {
        this.A00 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C07550Yf A00(Context context) {
        AnonymousClass006.A01(context);
        Lock lock = A03;
        lock.lock();
        try {
            C07550Yf r1 = A02;
            if (r1 == null) {
                r1 = new C07550Yf(context.getApplicationContext());
                A02 = r1;
            }
            return r1;
        } finally {
            lock.unlock();
        }
    }
}
