package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01M;
import X.AnonymousClass5VC;
import X.AnonymousClass6HW;
import X.AnonymousClass93K;
import X.AnonymousClass9Q8;
import X.AnonymousClass9c7;
import X.AnonymousClass9x6;
import X.B9N;
import X.B9P;
import X.C132496Ty;
import X.C134946bs;
import X.C1502274l;
import X.C207699wn;
import X.C36431kI;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.ICarApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.Objects;

public final class CarAppBinder extends ICarApp.Stub {
    public AnonymousClass9x6 mCurrentSession;
    public final SessionInfo mCurrentSessionInfo;
    public HandshakeInfo mHandshakeInfo;
    public AnonymousClass9c7 mHostValidator;
    public CarAppService mService;

    public void destroy() {
        this.mCurrentSession = null;
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass6HW.A00(new C1502274l(this, iOnDoneCallback, str, 0));
    }

    /* renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ void m19lambda$getManager$7$androidxcarappCarAppBinder(String str, IOnDoneCallback iOnDoneCallback) {
        Objects.requireNonNull((Object) null);
        if (str.equals("app")) {
            throw AnonymousClass001.A0A("getCarContext");
        } else if (!str.equals("navigation")) {
            Log.e("CarApp", AnonymousClass000.A0q("%s is not a valid manager", AnonymousClass000.A0v(str)));
            C132496Ty.A02(iOnDoneCallback, "getManager", new InvalidParameterException(AnonymousClass000.A0q(" is not a valid manager type", AnonymousClass000.A0v(str))));
        } else {
            throw AnonymousClass001.A0A("getCarContext");
        }
    }

    /* renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m20lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) {
        Objects.requireNonNull((Object) null);
        Objects.requireNonNull(this.mCurrentSessionInfo);
        throw AnonymousClass001.A0A("onCreateSession");
    }

    /* renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m21lambda$onAppPause$3$androidxcarappCarAppBinder() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0A("handleLifecycleEvent");
    }

    /* renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m22lambda$onAppResume$2$androidxcarappCarAppBinder() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0A("handleLifecycleEvent");
    }

    /* renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m23lambda$onAppStart$1$androidxcarappCarAppBinder() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0A("handleLifecycleEvent");
    }

    /* renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m24lambda$onAppStop$4$androidxcarappCarAppBinder() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0A("handleLifecycleEvent");
    }

    /* renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m25lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) {
        Objects.requireNonNull((Object) null);
        onConfigurationChangedInternal((AnonymousClass9x6) null, configuration);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m26lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) {
        Objects.requireNonNull((Object) null);
        onNewIntentInternal((AnonymousClass9x6) null, intent);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9P(this, 0), (AnonymousClass01M) null, "onAppPause");
    }

    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9P(this, 1), (AnonymousClass01M) null, "onAppResume");
    }

    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9P(this, 2), (AnonymousClass01M) null, "onAppStart");
    }

    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9P(this, 3), (AnonymousClass01M) null, "onAppStop");
    }

    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9N(configuration, this, 1), (AnonymousClass01M) null, "onConfigurationChanged");
    }

    public void onDestroyLifecycle() {
        this.mCurrentSession = null;
    }

    public void onHandshakeCompleted(C134946bs r6, IOnDoneCallback iOnDoneCallback) {
        Objects.requireNonNull((Object) null);
        try {
            String str = ((HandshakeInfo) r6.A00()).mHostPackageName;
            Objects.requireNonNull(str);
            AnonymousClass9Q8 r4 = new AnonymousClass9Q8(str, Binder.getCallingUid());
            getHostValidator();
            Objects.requireNonNull(r4);
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", AnonymousClass000.A0l(r4, "Evaluating ", AnonymousClass000.A0u()));
            }
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", "Accepted - Validator disabled, all hosts allowed");
            }
            throw AnonymousClass001.A0A("getAppInfo");
        } catch (AnonymousClass5VC | IllegalArgumentException unused) {
            throw AnonymousClass001.A0A("setHostInfo");
        }
    }

    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9N(intent, this, 0), (AnonymousClass01M) null, "onNewIntent");
    }

    private AnonymousClass9c7 getHostValidator() {
        AnonymousClass9c7 r0 = this.mHostValidator;
        if (r0 != null) {
            return r0;
        }
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0A("createHostValidator");
    }

    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            Objects.requireNonNull((Object) null);
            throw AnonymousClass001.A0A("getAppInfo");
        } catch (IllegalArgumentException e) {
            C132496Ty.A02(iOnDoneCallback, "getAppInfo", e);
        }
    }

    public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", AnonymousClass000.A0l(intent, "onAppCreate intent: ", AnonymousClass000.A0u()));
        }
        C132496Ty.A01(iOnDoneCallback, new C207699wn(intent, configuration, this, iCarHost), "onAppCreate");
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int i = handshakeInfo.mHostCarAppApiLevel;
        if (i >= 1) {
            ClassLoader classLoader = AnonymousClass93K.class.getClassLoader();
            Objects.requireNonNull(classLoader);
            InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
            if (resourceAsStream != null) {
                try {
                    String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                    int parseInt = Integer.parseInt(readLine);
                    if (parseInt < 1 || parseInt > 6) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Unrecognized Car API level: ");
                        throw AnonymousClass000.A0g(readLine, A0u);
                    } else if (i <= parseInt) {
                        this.mHandshakeInfo = handshakeInfo;
                        return;
                    }
                } catch (IOException unused) {
                    throw AnonymousClass001.A09("Unable to read Car API level file");
                }
            } else {
                throw AnonymousClass001.A09(String.format("Car API level file %s not found", C36431kI.A1Z("car-app-api.level", 1)));
            }
        }
        throw AnonymousClass000.A0d("Invalid Car App API level received: ", AnonymousClass000.A0u(), i);
    }

    public CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private AnonymousClass01M getCurrentLifecycle() {
        return null;
    }

    private void onConfigurationChangedInternal(AnonymousClass9x6 r4, Configuration configuration) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", AnonymousClass000.A0l(configuration, "onCarConfigurationChanged configuration: ", AnonymousClass000.A0u()));
            }
            throw AnonymousClass001.A0A("onCarConfigurationChangedInternal");
        }
        throw AnonymousClass001.A09("Not running on main thread when it is required to");
    }

    private void onNewIntentInternal(AnonymousClass9x6 r3, Intent intent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw AnonymousClass001.A0A("onNewIntent");
        }
        throw AnonymousClass001.A09("Not running on main thread when it is required to");
    }

    public AnonymousClass9x6 getCurrentSession() {
        return null;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    public void onAutoDriveEnabled() {
    }
}
