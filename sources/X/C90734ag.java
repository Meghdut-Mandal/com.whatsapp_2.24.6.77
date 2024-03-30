package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4ag  reason: invalid class name and case insensitive filesystem */
public abstract class C90734ag extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04;

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        if (C90494aF.A1a("EnhancedIntentService")) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        binder = this.A02;
        if (binder == null) {
            binder = new C91504c7(new C115105iL(this));
            this.A02 = binder;
        }
        return binder;
    }

    public static final void A00(Intent intent, C90734ag r8) {
        if (intent != null) {
            synchronized (C113915gL.A02) {
                if (C113915gL.A00 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    AnonymousClass6T2 r5 = C113915gL.A00;
                    if (r5.A05.decrementAndGet() < 0) {
                        Log.e("WakeLock", String.valueOf(r5.A0A).concat(" release without a matched acquire!"));
                    }
                    synchronized (r5.A09) {
                        TextUtils.isEmpty((CharSequence) null);
                        Map map = r5.A0B;
                        if (map.containsKey((Object) null)) {
                            AnonymousClass6JG r1 = (AnonymousClass6JG) map.get((Object) null);
                            if (r1 != null) {
                                int i = r1.A00 - 1;
                                r1.A00 = i;
                                if (i == 0) {
                                    map.remove((Object) null);
                                }
                            }
                        } else {
                            Log.w("WakeLock", String.valueOf(r5.A0A).concat(" counter does not exist"));
                        }
                        AnonymousClass6T2.A00(r5);
                    }
                }
            }
        }
        synchronized (r8.A04) {
            int i2 = r8.A01 - 1;
            r8.A01 = i2;
            if (i2 == 0) {
                r8.stopSelfResult(r8.A00);
            }
        }
    }

    public void onDestroy() {
        this.A03.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Task task;
        synchronized (this.A04) {
            this.A00 = i2;
            this.A01++;
        }
        Intent intent2 = (Intent) C19440v3.A00().A03.poll();
        if (intent2 != null) {
            if (A03(intent2)) {
                task = Tasks.forResult((Object) null);
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                C1503374w.A01(this, intent2, taskCompletionSource, this.A03, 25);
                task = taskCompletionSource.zza;
            }
            if (!task.isComplete()) {
                task.addOnCompleteListener(AnonymousClass775.A00, (OnCompleteListener) new C141546nQ(intent, this));
                return 3;
            }
        }
        A00(intent, this);
        return 2;
    }

    public C90734ag() {
        String str;
        String valueOf = String.valueOf(C90484aE.A0k(this));
        if (valueOf.length() != 0) {
            str = "Firebase-".concat(valueOf);
        } else {
            str = new String("Firebase-");
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass00J(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A04 = C36441kJ.A11();
        this.A01 = 0;
    }

    public boolean A03(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!FirebaseMessagingService.A02(intent)) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            C18960u7 A002 = C18960u7.A00();
            C18960u7.A02(A002);
            A002.A02.A02(AnonymousClass7cR.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        FirebaseMessagingService.A01(intent, "_no");
        return true;
    }
}
