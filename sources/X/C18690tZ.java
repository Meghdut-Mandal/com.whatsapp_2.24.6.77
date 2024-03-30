package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.ApplicationLike;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Objects;

/* renamed from: X.0tZ  reason: invalid class name and case insensitive filesystem */
public abstract class C18690tZ extends Application implements C18680tY {
    public static final C18720te appStartStat = C18720te.A04;
    public ApplicationLike delegate;
    public volatile C18770tn waResourcesWrapper;

    private void configureCrashLogging(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new C18730tf(context, this));
    }

    public Resources getResources() {
        if (Boolean.TRUE.equals(C18740tg.A01)) {
            return super.getResources();
        }
        if (this.waResourcesWrapper == null) {
            synchronized (this) {
                if (this.waResourcesWrapper == null) {
                    this.waResourcesWrapper = C18770tn.A02(super.getBaseContext(), ((C18800tq) C18810tr.A00(this, C18800tq.class)).BxU());
                }
            }
        }
        return this.waResourcesWrapper;
    }

    public C18850tv getWorkManagerConfiguration() {
        return (C18850tv) C18840tu.A00(((C18800tq) C18810tr.A00(this, C18800tq.class)).AfI.A00.A3T).get();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ConditionVariable conditionVariable = C18740tg.A00;
        C18740tg.A01 = true;
        Boolean bool = C18750th.A03;
        int i = Log.level;
        File file = new File(getFilesDir(), "Logs");
        if (!Log.logDirRef.compareAndSet((Object) null, file)) {
            throw new IllegalStateException("log application context already assigned");
        }
        Log.logFile = new File(file, "whatsapp.log");
        Log.logTempFile = new File(file, "whatsapp.tmp");
        Log.logFileLatch.countDown();
        Log.level = 3;
        StringBuilder sb = new StringBuilder();
        sb.append("==== logfile version=");
        Objects.requireNonNull("2.24.6.77");
        sb.append("2.24.6.77");
        sb.append(" level=");
        sb.append(Log.level);
        sb.append("====");
        Log.log("LL_I ", sb.toString());
        configureCrashLogging(this);
        appStartStat.A00 = SystemClock.elapsedRealtimeNanos();
    }

    public ApplicationLike createDelegate() {
        if (C18760tj.A02(this)) {
            return new SecondaryProcessAbstractAppShellDelegate(this);
        }
        return new AbstractAppShellDelegate(this, appStartStat);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ApplicationLike applicationLike = this.delegate;
        C18740tg.A06(applicationLike);
        applicationLike.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        ApplicationLike createDelegate = createDelegate();
        this.delegate = createDelegate;
        Boolean bool = C18750th.A03;
        createDelegate.onCreate();
    }

    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendBroadcast(intent, str, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle);
    }

    public void startActivity(Intent intent) {
        C18860tw.A03(intent);
        super.startActivity(intent);
    }

    public void sendBroadcast(Intent intent, String str) {
        C18860tw.A02(intent);
        super.sendBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str);
    }

    public void sendBroadcast(Intent intent) {
        C18860tw.A02(intent);
        super.sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, int i, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, String str3, Bundle bundle, Bundle bundle2) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, i, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i, str2, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str3, Bundle bundle) {
        C18860tw.A02(intent);
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i, str3, bundle);
    }
}
