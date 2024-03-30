package com.google.android.play.core.integrity.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C36431kI;
import X.C90474aD;
import X.C90494aF;
import java.util.HashMap;
import java.util.Map;

public abstract class b {
    public static final Map a;
    public static final Map b;

    public static String a(int i) {
        Map map = a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        Map map2 = b;
        if (!map2.containsKey(valueOf)) {
            return "";
        }
        String A1A = C36431kI.A1A(valueOf, map);
        String A1A2 = C36431kI.A1A(valueOf, map2);
        StringBuilder A0v = AnonymousClass000.A0v(A1A);
        A0v.append(" (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#");
        A0v.append(A1A2);
        return C90474aD.A0f(A0v);
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        a = A0J;
        HashMap A0J2 = AnonymousClass001.A0J();
        b = A0J2;
        Integer A0U = C90494aF.A0U();
        A0J.put(A0U, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n");
        A0J.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        A0J.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        A0J.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        A0J.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        A0J.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        A0J.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        A0J.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        A0J.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        A0J.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        A0J.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        A0J.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        A0J.put(-17, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.");
        A0J.put(-18, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        A0J.put(-19, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.");
        A0J.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        A0J2.put(A0U, "API_NOT_AVAILABLE");
        A0J2.put(-3, "NETWORK_ERROR");
        A0J2.put(-2, "PLAY_STORE_NOT_FOUND");
        A0J2.put(-14, "PLAY_STORE_VERSION_OUTDATED");
        A0J2.put(-5, "APP_NOT_INSTALLED");
        A0J2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        A0J2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        A0J2.put(-7, "APP_UID_MISMATCH");
        A0J2.put(-8, "TOO_MANY_REQUESTS");
        A0J2.put(-9, "CANNOT_BIND_TO_SERVICE");
        A0J2.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        A0J2.put(-17, "REQUEST_HASH_TOO_LONG");
        A0J2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        A0J2.put(-18, "CLIENT_TRANSIENT_ERROR");
        A0J2.put(-19, "INTEGRITY_TOKEN_PROVIDER_INVALID");
        A0J2.put(-100, "INTERNAL_ERROR");
    }
}