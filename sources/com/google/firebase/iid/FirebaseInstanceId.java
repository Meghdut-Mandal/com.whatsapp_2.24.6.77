package com.google.firebase.iid;

import X.AnonymousClass00J;
import X.AnonymousClass668;
import X.AnonymousClass6KS;
import X.AnonymousClass6X5;
import X.C115095iK;
import X.C141526nO;
import X.C18960u7;
import X.C19080uL;
import X.C19160uT;
import X.C19260ue;
import X.C19270uf;
import X.C19280ug;
import X.C19290uh;
import X.C19300ui;
import X.C19310uj;
import X.C19350un;
import X.C19360uo;
import X.C19370up;
import X.C35331iW;
import X.C35641j1;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstanceId {
    public static C19290uh A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public boolean A00 = false;
    public final C18960u7 A01;
    public final C19360uo A02;
    public final C19270uf A03;
    public final C19370up A04;
    public final C19350un A05;
    public final C19310uj A06;
    public final Executor A07;

    public static final synchronized void A03(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A00) {
                firebaseInstanceId.A08(0);
            }
        }
    }

    public final synchronized void A07() {
        A08.A02();
        if (this.A02.A00()) {
            A03(this);
        }
    }

    public final synchronized void A08(long j) {
        synchronized (this) {
            A04(new C35331iW(this, this.A05, Math.min(Math.max(30, j << 1), A0A)), j);
            this.A00 = true;
        }
    }

    public final synchronized void A09(boolean z) {
        this.A00 = z;
    }

    public FirebaseInstanceId(C18960u7 r23, C19160uT r24, C19080uL r25) {
        C18960u7 r2 = r23;
        C18960u7.A02(r2);
        Context context = r2.A00;
        C19270uf r0 = new C19270uf(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = C19280ug.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
        if (C19270uf.A01(r2) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    C18960u7.A02(r2);
                    A08 = new C19290uh(context);
                }
            }
            this.A01 = r2;
            this.A03 = r0;
            this.A06 = new C19310uj(r2, r0, r25, threadPoolExecutor);
            this.A07 = threadPoolExecutor2;
            this.A05 = new C19350un(A08);
            this.A02 = new C19360uo(r24, this);
            this.A04 = new C19370up(threadPoolExecutor);
            threadPoolExecutor2.execute(new C35641j1((Object) this, 0));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static AnonymousClass6KS A00(String str, String str2) {
        AnonymousClass6KS r4;
        AnonymousClass6KS r2;
        C19290uh r3 = A08;
        synchronized (r3) {
            String string = r3.A01.getString(C19290uh.A01(str, str2), (String) null);
            r4 = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        r2 = new AnonymousClass6KS(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        sb.append("Failed to parse token: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                    }
                } else {
                    r2 = new AnonymousClass6KS(0, string, (String) null);
                }
                r4 = r2;
            }
        }
        return r4;
    }

    public static final Object A01(Task task, FirebaseInstanceId firebaseInstanceId) {
        try {
            return Tasks.await(task, AnonymousClass6X5.A0L, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    firebaseInstanceId.A07();
                }
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e);
            }
            throw cause;
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public static String A02() {
        AnonymousClass668 r0;
        C19290uh r3 = A08;
        synchronized (r3) {
            Map map = r3.A03;
            r0 = (AnonymousClass668) map.get("");
            if (r0 == null) {
                try {
                    C19300ui r7 = r3.A02;
                    Context context = r3.A00;
                    C19260ue e = null;
                    File A042 = C19300ui.A04(context);
                    if (A042.exists()) {
                        try {
                            r0 = C19300ui.A02(A042);
                        } catch (C19260ue | IOException e2) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e2);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                                sb.append("Failed to read ID from file, retrying: ");
                                sb.append(valueOf);
                                Log.d("FirebaseInstanceId", sb.toString());
                            }
                            try {
                                r0 = C19300ui.A02(A042);
                            } catch (IOException e3) {
                                String valueOf2 = String.valueOf(e3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                                sb2.append("IID file exists, but failed to read from it: ");
                                sb2.append(valueOf2);
                                Log.w("FirebaseInstanceId", sb2.toString());
                                throw new C19260ue(e3);
                            } catch (C19260ue e4) {
                                e = e4;
                            }
                        }
                        C19300ui.A06(context, r0);
                        map.put("", r0);
                    }
                    try {
                        r0 = C19300ui.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                        if (r0 != null) {
                            C19300ui.A00(context, r0, false);
                        } else {
                            if (e == null) {
                                r0 = r7.A07(context);
                            }
                            throw e;
                        }
                        map.put("", r0);
                    } catch (C19260ue e5) {
                        e = e5;
                    }
                } catch (C19260ue unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C18960u7.A00()).A07();
                    r0 = r3.A02.A07(r3.A00);
                }
            }
        }
        return r0.A01;
    }

    public static void A04(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = A09;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new AnonymousClass00J("FirebaseInstanceId"));
                A09 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static boolean A05() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    public static FirebaseInstanceId getInstance(C18960u7 r2) {
        C18960u7.A02(r2);
        return (FirebaseInstanceId) r2.A02.A02(FirebaseInstanceId.class);
    }

    public final boolean A0A(AnonymousClass6KS r8) {
        if (r8 != null) {
            String A062 = this.A03.A06();
            if (System.currentTimeMillis() > r8.A00 + AnonymousClass6KS.A03 || !A062.equals(r8.A02)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String A06(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            return ((C115095iK) A01(Tasks.forResult((Object) null).continueWithTask(this.A07, new C141526nO(this, str, str2)), this)).A00;
        }
        throw new IOException("MAIN_THREAD");
    }
}
