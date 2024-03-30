package com.google.android.search.verification.client;

import X.AnonymousClass000;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90524aI;
import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.search.verification.api.ISearchActionVerificationService;

public abstract class SearchActionVerificationClientService extends IntentService {
    public static final int CONNECTION_TIMEOUT_IN_MS = 1000;
    public static final String EXTRA_INTENT = "SearchActionVerificationClientExtraIntent";
    public static final long MS_TO_NS = 1000000;
    public static final String NOTIFICATION_CHANNEL_ID = "Assistant_verifier";
    public static final int NOTIFICATION_ID = 10000;
    public static final String REMOTE_ASSISTANT_GO_SERVICE_ACTION = "com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE";
    public static final String REMOTE_GSA_SERVICE_ACTION = "com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE";
    public static final String SEND_MESSAGE_ERROR_MESSAGE = "com.google.android.voicesearch.extra.ERROR_MESSAGE";
    public static final String SEND_MESSAGE_RESULT_RECEIVER = "com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER";
    public static final String TAG = "SAVerificationClientS";
    public static final int TIME_TO_SLEEP_IN_MS = 50;
    public final Intent assistantGoServiceIntent = C36441kJ.A0I(REMOTE_ASSISTANT_GO_SERVICE_ACTION).setPackage(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE);
    public SearchActionVerificationServiceConnection assistantGoVerificationServiceConnection;
    public final long connectionTimeout = 1000;
    public final boolean dbg = isDebugMode();
    public final Intent gsaServiceIntent = C36441kJ.A0I(REMOTE_GSA_SERVICE_ACTION).setPackage(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE);
    public SearchActionVerificationServiceConnection searchActionVerificationServiceConnection;

    public class SearchActionVerificationServiceConnection implements ServiceConnection {
        public ISearchActionVerificationService iRemoteService;

        public void onServiceDisconnected(ComponentName componentName) {
            this.iRemoteService = null;
            if (SearchActionVerificationClientService.this.dbg) {
                Log.d(SearchActionVerificationClientService.TAG, "onServiceDisconnected");
            }
        }

        public SearchActionVerificationServiceConnection() {
        }

        private boolean isConnected() {
            return AnonymousClass000.A1V(this.iRemoteService);
        }

        public boolean isVerified(Intent intent, Bundle bundle) {
            ISearchActionVerificationService iSearchActionVerificationService = this.iRemoteService;
            if (iSearchActionVerificationService == null || !iSearchActionVerificationService.isSearchAction(intent, bundle)) {
                return false;
            }
            return true;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (SearchActionVerificationClientService.this.dbg) {
                Log.d(SearchActionVerificationClientService.TAG, "onServiceConnected");
            }
            this.iRemoteService = ISearchActionVerificationService.Stub.asInterface(iBinder);
        }

        public ISearchActionVerificationService getRemoteService() {
            return this.iRemoteService;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.applicationInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isPackageInstalled(java.lang.String r5) {
        /*
            r4 = this;
            r1 = 1
            r3 = 0
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0017 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            return r1
        L_0x0015:
            r1 = 0
            return r1
        L_0x0017:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            java.lang.String r0 = "Couldn't find package name %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "SAVerificationClientS"
            android.util.Log.w(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.isPackageInstalled(java.lang.String):boolean");
    }

    public long getConnectionTimeout() {
        return 1000;
    }

    public boolean isTestingMode() {
        return false;
    }

    public abstract void performAction(Intent intent, boolean z, Bundle bundle);

    public abstract void postForegroundNotification();

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (X.AnonymousClass000.A1V(r10.assistantGoVerificationServiceConnection.iRemoteService) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.AnonymousClass000.A1V(r10.searchActionVerificationServiceConnection.iRemoteService) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean installedServicesConnected() {
        /*
            r10 = this;
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            boolean r3 = r10.isPackageInstalled(r4)
            r9 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0015
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r10.searchActionVerificationServiceConnection
            com.google.android.search.verification.api.ISearchActionVerificationService r0 = r0.iRemoteService
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r8 = 1
        L_0x0016:
            boolean r0 = r10.dbg
            r6 = 2
            r1 = 3
            java.lang.String r5 = "SAVerificationClientS"
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r4
            X.AnonymousClass000.A1N(r2, r7, r3)
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r10.searchActionVerificationServiceConnection
            com.google.android.search.verification.api.ISearchActionVerificationService r0 = r0.iRemoteService
            boolean r0 = X.AnonymousClass000.A1V(r0)
            X.AnonymousClass000.A1N(r2, r6, r0)
            java.lang.String r0 = "GSA app %s installed: %s connected %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            android.util.Log.d(r5, r0)
        L_0x0039:
            java.lang.String r4 = "com.google.android.apps.assistant"
            boolean r3 = r10.isPackageInstalled(r4)
            if (r3 == 0) goto L_0x004c
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r10.assistantGoVerificationServiceConnection
            com.google.android.search.verification.api.ISearchActionVerificationService r0 = r0.iRemoteService
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            boolean r0 = r10.dbg
            if (r0 == 0) goto L_0x006c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r9] = r4
            X.AnonymousClass000.A1N(r1, r7, r3)
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r10.assistantGoVerificationServiceConnection
            com.google.android.search.verification.api.ISearchActionVerificationService r0 = r0.iRemoteService
            boolean r0 = X.AnonymousClass000.A1V(r0)
            X.AnonymousClass000.A1N(r1, r6, r0)
            java.lang.String r0 = "AssistantGo app %s installed: %s connected %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.d(r5, r0)
        L_0x006c:
            if (r8 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x0071
            r9 = 1
        L_0x0071:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.installedServicesConnected():boolean");
    }

    private boolean isDebugMode() {
        return AnonymousClass000.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(Build.TYPE) ? 1 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean maybePerformActionIfVerified(java.lang.String r9, android.content.Intent r10, com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection r11) {
        /*
            r8 = this;
            java.lang.String r0 = "com.google.android.googlequicksearchbox"
            boolean r0 = r9.equals(r0)
            r4 = 1
            java.lang.String r7 = "SAVerificationClientS"
            r3 = 0
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "com.google.android.apps.assistant"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0026
            boolean r0 = r8.dbg
            if (r0 == 0) goto L_0x0025
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r9
            java.lang.String r0 = "Unsupported package %s for verification."
        L_0x001e:
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0022:
            android.util.Log.d(r7, r0)
        L_0x0025:
            return r3
        L_0x0026:
            boolean r0 = r8.isDebugMode()
            if (r0 != 0) goto L_0x003d
            boolean r0 = com.google.android.search.verification.client.SearchActionVerificationClientUtil.isPackageGoogleSigned(r8, r9)
            if (r0 != 0) goto L_0x003d
            boolean r0 = r8.dbg
            if (r0 == 0) goto L_0x0025
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r9
            java.lang.String r0 = "Cannot verify the intent with package %s in unsafe mode."
            goto L_0x001e
        L_0x003d:
            java.lang.String r1 = "SearchActionVerificationClientExtraIntent"
            boolean r0 = r10.hasExtra(r1)
            if (r0 != 0) goto L_0x005e
            boolean r0 = r8.dbg
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 28
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "No extra, nothing to check: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            goto L_0x0022
        L_0x005e:
            android.os.Parcelable r5 = r10.getParcelableExtra(r1)
            android.content.Intent r5 = (android.content.Intent) r5
            boolean r0 = r8.dbg
            if (r0 == 0) goto L_0x006b
            com.google.android.search.verification.client.SearchActionVerificationClientUtil.logIntentWithExtras(r5)
        L_0x006b:
            com.google.android.search.verification.api.ISearchActionVerificationService r0 = r11.iRemoteService
            boolean r1 = X.AnonymousClass000.A1V(r0)
            r0 = 2
            java.lang.String r6 = "VerificationService is not connected to %s, unable to check intent: %s"
            if (r1 == 0) goto L_0x009c
            java.lang.String r2 = "%s Service API version: %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            r1[r3] = r9     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            com.google.android.search.verification.api.ISearchActionVerificationService r0 = r11.iRemoteService     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            int r0 = r0.getVersion()     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            X.AnonymousClass000.A1L(r1, r0, r4)     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            android.util.Log.i(r7, r0)     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            android.os.Bundle r0 = X.AnonymousClass001.A07()     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            boolean r4 = r11.isVerified(r5, r0)     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            r8.performAction(r5, r4, r0)     // Catch:{ RemoteException -> 0x0098, Exception -> 0x00aa }
            goto L_0x00be
        L_0x0098:
            r2 = move-exception
            java.lang.String r1 = "Remote exception: "
            goto L_0x00ad
        L_0x009c:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r9
            r0[r4] = r10
            java.lang.String r0 = java.lang.String.format(r6, r0)
            android.util.Log.e(r7, r0)
            goto L_0x00bc
        L_0x00aa:
            r2 = move-exception
            java.lang.String r1 = "Exception: "
        L_0x00ad:
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.C90464aC.A0c(r1, r0)
            android.util.Log.e(r7, r0)
            java.lang.String r6 = r2.getMessage()
        L_0x00bc:
            r4 = 0
            goto L_0x00c0
        L_0x00be:
            java.lang.String r6 = ""
        L_0x00c0:
            java.lang.String r1 = "com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER"
            boolean r0 = r5.hasExtra(r1)
            if (r0 == 0) goto L_0x00e1
            android.os.Bundle r0 = r5.getExtras()
            android.os.Parcelable r2 = r0.getParcelable(r1)
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "com.google.android.voicesearch.extra.ERROR_MESSAGE"
            r1.putString(r0, r6)
            if (r4 != 0) goto L_0x00de
            r3 = -1
        L_0x00de:
            r2.send(r3, r1)
        L_0x00e1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.maybePerformActionIfVerified(java.lang.String, android.content.Intent, com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection):boolean");
    }

    public final void onCreate() {
        if (this.dbg) {
            Log.d(TAG, "onCreate");
        }
        super.onCreate();
        this.searchActionVerificationServiceConnection = new SearchActionVerificationServiceConnection();
        if (isPackageSafe(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE)) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new SearchActionVerificationServiceConnection();
        if (isPackageSafe(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE)) {
            bindService(this.assistantGoServiceIntent, this.assistantGoVerificationServiceConnection, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            postForegroundNotification();
        }
    }

    public final void onDestroy() {
        if (this.dbg) {
            Log.d(TAG, "onDestroy");
        }
        super.onDestroy();
        SearchActionVerificationServiceConnection searchActionVerificationServiceConnection2 = this.searchActionVerificationServiceConnection;
        if (AnonymousClass000.A1V(searchActionVerificationServiceConnection2.iRemoteService)) {
            unbindService(searchActionVerificationServiceConnection2);
        }
        SearchActionVerificationServiceConnection searchActionVerificationServiceConnection3 = this.assistantGoVerificationServiceConnection;
        if (AnonymousClass000.A1V(searchActionVerificationServiceConnection3.iRemoteService)) {
            unbindService(searchActionVerificationServiceConnection3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null) {
            long nanoTime = System.nanoTime();
            while (!installedServicesConnected() && System.nanoTime() - nanoTime < this.connectionTimeout * MS_TO_NS) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    if (this.dbg) {
                        String valueOf = String.valueOf(e);
                        C90464aC.A1G("Unexpected InterruptedException: ", valueOf, TAG, C90524aI.A0h(C90474aD.A05(valueOf) + 33));
                    }
                }
            }
            if (maybePerformActionIfVerified(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE, intent, this.searchActionVerificationServiceConnection)) {
                str = "Verified the intent with GSA.";
            } else {
                Log.i(TAG, "Unable to verify the intent with GSA.");
                if (maybePerformActionIfVerified(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE, intent, this.assistantGoVerificationServiceConnection)) {
                    str = "Verified the intent with Assistant Go.";
                } else {
                    str = "Unable to verify the intent with Assistant Go.";
                }
            }
            Log.i(TAG, str);
        } else if (this.dbg) {
            Log.d(TAG, "Unable to verify null intent");
        }
    }

    private void createChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, getApplicationContext().getResources().getString(R.string.google_assistant_verification_channel_name), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    private boolean isPackageSafe(String str) {
        if (!isPackageInstalled(str)) {
            return false;
        }
        if (isDebugMode() || SearchActionVerificationClientUtil.isPackageGoogleSigned(this, str)) {
            return true;
        }
        return false;
    }
}
