package X;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0Z2  reason: invalid class name */
public abstract class AnonymousClass0Z2 {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final AnonymousClass0UT A01 = new AnonymousClass0UT("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A02(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ApiException) {
                throw cause;
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            A01.A01(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static TokenData A00(Bundle bundle) {
        Integer num;
        String str;
        String str2;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 != null) {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            TokenData tokenData = (TokenData) bundle2.getParcelable("TokenData");
            if (tokenData != null) {
                return tokenData;
            }
        }
        String string = bundle.getString("Error");
        AnonymousClass006.A01(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        Integer[] A002 = C023109s.A00(60);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A002[i];
                switch (num.intValue()) {
                    case 1:
                        str2 = "SocketTimeout";
                        break;
                    case 2:
                        str2 = "Ok";
                        break;
                    case 3:
                        str2 = "UNKNOWN_ERR";
                        break;
                    case 4:
                        str2 = "NetworkError";
                        break;
                    case 5:
                        str2 = "ServiceUnavailable";
                        break;
                    case 6:
                        str2 = "InternalError";
                        break;
                    case 7:
                        str2 = "IllegalArgument";
                        break;
                    case 8:
                        str2 = "BadAuthentication";
                        break;
                    case 9:
                        str2 = "BAD_REQUEST";
                        break;
                    case 10:
                        str2 = "EmptyConsumerPackageOrSig";
                        break;
                    case 11:
                        str2 = "InvalidSecondFactor";
                        break;
                    case 12:
                        str2 = "PostSignInFlowRequired";
                        break;
                    case 13:
                        str2 = "NeedsBrowser";
                        break;
                    case 14:
                        str2 = "Unknown";
                        break;
                    case 15:
                        str2 = "NotVerified";
                        break;
                    case 16:
                        str2 = "TermsNotAgreed";
                        break;
                    case 17:
                        str2 = "AccountDisabled";
                        break;
                    case 18:
                        str2 = "CaptchaRequired";
                        break;
                    case 19:
                        str2 = "AccountDeleted";
                        break;
                    case 20:
                        str2 = "ServiceDisabled";
                        break;
                    case 21:
                        str2 = "ChallengeRequired";
                        break;
                    case 22:
                        str2 = "NeedPermission";
                        break;
                    case 23:
                        str2 = "NeedRemoteConsent";
                        break;
                    case 24:
                        str2 = "INVALID_SCOPE";
                        break;
                    case 25:
                        str2 = "UserCancel";
                        break;
                    case 26:
                        str2 = "PermissionDenied";
                        break;
                    case 27:
                        str2 = "RESTRICTED_CLIENT";
                        break;
                    case 28:
                        str2 = "INVALID_AUDIENCE";
                        break;
                    case 29:
                        str2 = "UNREGISTERED_ON_API_CONSOLE";
                        break;
                    case 30:
                        str2 = "ThirdPartyDeviceManagementRequired";
                        break;
                    case 31:
                        str2 = "DeviceManagementInternalError";
                        break;
                    case 32:
                        str2 = "DeviceManagementSyncDisabled";
                        break;
                    case 33:
                        str2 = "DeviceManagementAdminBlocked";
                        break;
                    case 34:
                        str2 = "DeviceManagementAdminPendingApproval";
                        break;
                    case 35:
                        str2 = "DeviceManagementStaleSyncRequired";
                        break;
                    case 36:
                        str2 = "DeviceManagementDeactivated";
                        break;
                    case 37:
                        str2 = "DeviceManagementScreenlockRequired";
                        break;
                    case 38:
                        str2 = "DeviceManagementRequired";
                        break;
                    case 39:
                        str2 = "DeviceManagementRequiredOrSyncDisabled";
                        break;
                    case 40:
                        str2 = "ALREADY_HAS_GMAIL";
                        break;
                    case 41:
                        str2 = "WeakPassword";
                        break;
                    case 42:
                        str2 = "BadRequest";
                        break;
                    case 43:
                        str2 = "BadUsername";
                        break;
                    case 44:
                        str2 = "DeletedGmail";
                        break;
                    case 45:
                        str2 = "ExistingUsername";
                        break;
                    case 46:
                        str2 = "LoginFail";
                        break;
                    case 47:
                        str2 = "NotLoggedIn";
                        break;
                    case 48:
                        str2 = "NoGmail";
                        break;
                    case 49:
                        str2 = "RequestDenied";
                        break;
                    case 50:
                        str2 = "ServerError";
                        break;
                    case 51:
                        str2 = "UsernameUnavailable";
                        break;
                    case 52:
                        str2 = "GPlusOther";
                        break;
                    case 53:
                        str2 = "GPlusNickname";
                        break;
                    case 54:
                        str2 = "GPlusInvalidChar";
                        break;
                    case 55:
                        str2 = "GPlusInterstitial";
                        break;
                    case 56:
                        str2 = "ProfileUpgradeError";
                        break;
                    case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                        str2 = "AuthSecurityError";
                        break;
                    case 58:
                        str2 = "AuthBindingError";
                        break;
                    case 59:
                        str2 = "AccountNotPresent";
                        break;
                    default:
                        str2 = "ClientLoginDisabled";
                        break;
                }
                if (!str2.equals(string)) {
                    i++;
                }
            } else {
                num = C023109s.A06;
            }
        }
        if (C023109s.A0X.equals(num) || C023109s.A0A.equals(num) || C023109s.A0D.equals(num) || C023109s.A0E.equals(num) || C023109s.A05.equals(num) || C023109s.A0F.equals(num) || C023109s.A0Q.equals(num) || C023109s.A0I.equals(num) || C023109s.A0J.equals(num) || C023109s.A0K.equals(num) || C023109s.A0L.equals(num) || C023109s.A0M.equals(num) || C023109s.A0N.equals(num) || C023109s.A0P.equals(num) || C023109s.A0H.equals(num) || C023109s.A0O.equals(num)) {
            AnonymousClass0UT r3 = A01;
            switch (num.intValue()) {
                case 1:
                    str = "SOCKET_TIMEOUT";
                    break;
                case 2:
                    str = "SUCCESS";
                    break;
                case 3:
                    str = "UNKNOWN_ERROR";
                    break;
                case 4:
                    str = "NETWORK_ERROR";
                    break;
                case 5:
                    str = "SERVICE_UNAVAILABLE";
                    break;
                case 6:
                    str = "INTNERNAL_ERROR";
                    break;
                case 7:
                    str = "ILLEGAL_ARGUMENT";
                    break;
                case 8:
                    str = "BAD_AUTHENTICATION";
                    break;
                case 9:
                    str = "BAD_TOKEN_REQUEST";
                    break;
                case 10:
                    str = "EMPTY_CONSUMER_PKG_OR_SIG";
                    break;
                case 11:
                    str = "NEEDS_2F";
                    break;
                case 12:
                    str = "NEEDS_POST_SIGN_IN_FLOW";
                    break;
                case 13:
                    str = "NEEDS_BROWSER";
                    break;
                case 14:
                    str = "UNKNOWN";
                    break;
                case 15:
                    str = "NOT_VERIFIED";
                    break;
                case 16:
                    str = "TERMS_NOT_AGREED";
                    break;
                case 17:
                    str = "ACCOUNT_DISABLED";
                    break;
                case 18:
                    str = "CAPTCHA";
                    break;
                case 19:
                    str = "ACCOUNT_DELETED";
                    break;
                case 20:
                    str = "SERVICE_DISABLED";
                    break;
                case 21:
                    str = "CHALLENGE_REQUIRED";
                    break;
                case 22:
                    str = "NEED_PERMISSION";
                    break;
                case 23:
                    str = "NEED_REMOTE_CONSENT";
                    break;
                case 24:
                    str = "INVALID_SCOPE";
                    break;
                case 25:
                    str = "USER_CANCEL";
                    break;
                case 26:
                    str = "PERMISSION_DENIED";
                    break;
                case 27:
                    str = "RESTRICTED_CLIENT";
                    break;
                case 28:
                    str = "INVALID_AUDIENCE";
                    break;
                case 29:
                    str = "UNREGISTERED_ON_API_CONSOLE";
                    break;
                case 30:
                    str = "THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED";
                    break;
                case 31:
                    str = "DM_INTERNAL_ERROR";
                    break;
                case 32:
                    str = "DM_SYNC_DISABLED";
                    break;
                case 33:
                    str = "DM_ADMIN_BLOCKED";
                    break;
                case 34:
                    str = "DM_ADMIN_PENDING_APPROVAL";
                    break;
                case 35:
                    str = "DM_STALE_SYNC_REQUIRED";
                    break;
                case 36:
                    str = "DM_DEACTIVATED";
                    break;
                case 37:
                    str = "DM_SCREENLOCK_REQUIRED";
                    break;
                case 38:
                    str = "DM_REQUIRED";
                    break;
                case 39:
                    str = "DEVICE_MANAGEMENT_REQUIRED";
                    break;
                case 40:
                    str = "ALREADY_HAS_GMAIL";
                    break;
                case 41:
                    str = "BAD_PASSWORD";
                    break;
                case 42:
                    str = "BAD_REQUEST";
                    break;
                case 43:
                    str = "BAD_USERNAME";
                    break;
                case 44:
                    str = "DELETED_GMAIL";
                    break;
                case 45:
                    str = "EXISTING_USERNAME";
                    break;
                case 46:
                    str = "LOGIN_FAIL";
                    break;
                case 47:
                    str = "NOT_LOGGED_IN";
                    break;
                case 48:
                    str = "NO_GMAIL";
                    break;
                case 49:
                    str = "REQUEST_DENIED";
                    break;
                case 50:
                    str = "SERVER_ERROR";
                    break;
                case 51:
                    str = "USERNAME_UNAVAILABLE";
                    break;
                case 52:
                    str = "GPLUS_OTHER";
                    break;
                case 53:
                    str = "GPLUS_NICKNAME";
                    break;
                case 54:
                    str = "GPLUS_INVALID_CHAR";
                    break;
                case 55:
                    str = "GPLUS_INTERSTITIAL";
                    break;
                case 56:
                    str = "GPLUS_PROFILE_ERROR";
                    break;
                case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                    str = "AUTH_SECURITY_ERROR";
                    break;
                case 58:
                    str = "AUTH_BINDING_ERROR";
                    break;
                case 59:
                    str = "ACCOUNT_NOT_PRESENT";
                    break;
                default:
                    str = "CLIENT_LOGIN_DISABLED";
                    break;
            }
            r3.A01("isUserRecoverableError status: ".concat(String.valueOf(str)), new Object[0]);
            throw new UserRecoverableAuthException(intent, string);
        } else if (C023109s.A0R.equals(num) || C023109s.A0S.equals(num) || C023109s.A0V.equals(num) || C023109s.A0T.equals(num) || C023109s.A0U.equals(num)) {
            throw new IOException(string);
        } else {
            throw new AnonymousClass0OD(string);
        }
    }

    public static Object A01(ComponentName componentName, Context context, C16760q3 r8) {
        AnonymousClass0ZS r3 = new AnonymousClass0ZS();
        C07520Yb A002 = C07520Yb.A00(context);
        try {
            if (A002.A02(r3, new AnonymousClass0YA(componentName), "GoogleAuthUtil")) {
                try {
                    AnonymousClass006.A04("BlockingServiceConnection.getService() called on main thread");
                    if (!r3.A00) {
                        r3.A00 = true;
                        Object ByD = r8.ByD((IBinder) r3.A01.take());
                        A002.A01(r3, new AnonymousClass0YA(componentName));
                        return ByD;
                    }
                    throw AnonymousClass001.A09("Cannot call get on this connection more than once");
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    A002.A01(r3, new AnonymousClass0YA(componentName));
                    throw th;
                }
            } else {
                throw new IOException("Could not bind to service.");
            }
        } catch (SecurityException e2) {
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = e2.getMessage();
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", A0L));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static String A03(Account account, Context context) {
        TokenData tokenData;
        Bundle A07 = AnonymousClass001.A07();
        A04(account);
        AnonymousClass006.A04("Calling this from your main thread can lead to deadlock");
        AnonymousClass006.A05("oauth2:https://www.googleapis.com/auth/drive.appdata", "Scope cannot be empty or null.");
        A04(account);
        A05(context);
        Bundle bundle = new Bundle(A07);
        A06(context, bundle);
        AnonymousClass0Y9.A00(context);
        AnonymousClass0eS.A01.A00.ByC();
        if (AnonymousClass000.A1X(AnonymousClass0WE.A0A.A02()) && A07(context)) {
            AnonymousClass0JJ r5 = new AnonymousClass0JJ(context);
            AnonymousClass006.A05("oauth2:https://www.googleapis.com/auth/drive.appdata", "Scope cannot be null!");
            C07180Wq r3 = new C07180Wq((AnonymousClass0OR) null);
            r3.A03 = new C04520Ky[]{AnonymousClass0SB.A09};
            r3.A01 = new C10260dx(account, bundle, r5);
            r3.A00 = 1512;
            try {
                Bundle bundle2 = (Bundle) A02(C07590Yl.A01(r5, r3.A00(), 1), "token retrieval");
                if (bundle2 != null) {
                    tokenData = A00(bundle2);
                    return tokenData.A01;
                }
                A01.A01("Service call returned null.", new Object[0]);
                throw new IOException("Service unavailable.");
            } catch (ApiException e) {
                AnonymousClass0UT r32 = A01;
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = "token retrieval";
                A0M[1] = Log.getStackTraceString(e);
                r32.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", A0M);
            }
        }
        tokenData = (TokenData) A01(A00, context, new C10030da(account, bundle));
        return tokenData.A01;
    }

    public static void A04(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = A02;
            int i = 0;
            while (!strArr[i].equals(account.type)) {
                i++;
                if (i >= 3) {
                    throw AnonymousClass001.A08("Account type not supported");
                }
            }
            return;
        }
        throw AnonymousClass001.A08("Account name cannot be empty!");
    }

    public static boolean A07(Context context) {
        if (C02610Bd.A00.A02(context, 17895000) == 0) {
            AnonymousClass0eS.A01.A00.ByC();
            C17850sA r1 = ((AnonymousClass0M7) AnonymousClass0WE.A05.A02()).zzd;
            String str = context.getApplicationInfo().packageName;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                if (AnonymousClass001.A0C(it).equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void A05(Context context) {
        try {
            C02620Be.A01(context.getApplicationContext(), 8400000);
        } catch (C04030Iz e) {
            int i = e.zza;
            throw new C03930Im(new Intent(e.zza), e.getMessage(), i);
        } catch (AnonymousClass0O8 | GooglePlayServicesIncorrectManifestValueException e2) {
            throw new AnonymousClass0OD(e2.getMessage(), e2);
        }
    }

    public static void A06(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }
}
