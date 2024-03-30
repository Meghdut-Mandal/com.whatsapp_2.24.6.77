package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0ZU  reason: invalid class name */
public class AnonymousClass0ZU implements ServiceConnection, Handler.Callback {
    public Set A00 = new HashSet();
    public final Context A01;
    public final Handler A02;
    public final Map A03 = AnonymousClass001.A0J();
    public final HandlerThread A04;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r11.A03 != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.AnonymousClass0TG r11) {
        /*
            r10 = this;
            java.lang.String r2 = "NotifManCompat"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Processing component "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.util.ArrayDeque r0 = r11.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " queued tasks"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x002e:
            java.util.ArrayDeque r6 = r11.A02
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x009f
            boolean r0 = r11.A03
            if (r0 != 0) goto L_0x005a
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.ComponentName r4 = r11.A04
            android.content.Intent r1 = r0.setComponent(r4)
            android.content.Context r3 = r10.A01
            r0 = 33
            boolean r0 = r3.bindService(r1, r10, r0)
            r11.A03 = r0
            if (r0 == 0) goto L_0x0129
            r0 = 0
            r11.A00 = r0
        L_0x0056:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x005e
        L_0x005a:
            X.0rN r0 = r11.A01
            if (r0 != 0) goto L_0x00a0
        L_0x005e:
            android.os.Handler r5 = r10.A02
            android.content.ComponentName r4 = r11.A04
            boolean r0 = r5.hasMessages(r7, r4)
            if (r0 != 0) goto L_0x009f
            int r0 = r11.A00
            r3 = 1
            int r1 = r0 + 1
            r11.A00 = r1
            r0 = 6
            if (r1 <= r0) goto L_0x013b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Giving up on delivering "
            r1.append(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = " tasks to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " after "
            r1.append(r0)
            int r0 = r11.A00
            r1.append(r0)
            java.lang.String r0 = " retries"
            r1.append(r0)
            X.AnonymousClass000.A1A(r1, r2)
            r6.clear()
        L_0x009f:
            return
        L_0x00a0:
            java.lang.Object r4 = r6.peek()
            X.0nq r4 = (X.C15700nq) r4
            if (r4 == 0) goto L_0x0121
            boolean r0 = android.util.Log.isLoggable(r2, r7)     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            if (r0 == 0) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            java.lang.String r0 = "Sending task "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            android.util.Log.d(r2, r0)     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
        L_0x00bb:
            X.0rN r9 = r11.A01     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            X.0cc r4 = (X.C09590cc) r4     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            java.lang.String r8 = r4.A02     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            int r5 = r4.A00     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            java.lang.String r3 = r4.A03     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            android.app.Notification r1 = r4.A01     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            X.0bS r9 = (X.C08870bS) r9     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            java.lang.String r0 = X.C17440rN.A00     // Catch:{ all -> 0x00f0 }
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x00f0 }
            r4.writeString(r8)     // Catch:{ all -> 0x00f0 }
            r4.writeInt(r5)     // Catch:{ all -> 0x00f0 }
            r4.writeString(r3)     // Catch:{ all -> 0x00f0 }
            r0 = 0
            r3 = 1
            r4.writeInt(r3)     // Catch:{ all -> 0x00f0 }
            r1.writeToParcel(r4, r0)     // Catch:{ all -> 0x00f0 }
            android.os.IBinder r1 = r9.A00     // Catch:{ all -> 0x00f0 }
            r0 = 0
            r1.transact(r3, r4, r0, r3)     // Catch:{ all -> 0x00f0 }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            r6.remove()     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            goto L_0x00a0
        L_0x00f0:
            r0 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
            throw r0     // Catch:{ DeadObjectException -> 0x00f5, RemoteException -> 0x010e }
        L_0x00f5:
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x0121
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Remote service has died: "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            android.util.Log.d(r2, r0)
            goto L_0x0121
        L_0x010e:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RemoteException communicating with "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            android.util.Log.w(r2, r0, r3)
        L_0x0121:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x009f
            goto L_0x005e
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to bind to listener "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)
            android.util.Log.w(r2, r0)
            r3.unbindService(r10)
            goto L_0x0056
        L_0x013b:
            int r1 = r1 - r3
            int r3 = r3 << r1
            int r3 = r3 * 1000
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x015a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Scheduling retry for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x015a:
            android.os.Message r2 = r5.obtainMessage(r7, r4)
            long r0 = (long) r3
            r5.sendMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZU.A00(X.0TG):void");
    }

    public boolean handleMessage(Message message) {
        Set set;
        C17440rN r1;
        int i = message.what;
        if (i == 0) {
            Object obj = message.obj;
            Context context = this.A01;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (C007203c.A05) {
                if (string != null) {
                    if (!string.equals(C007203c.A03)) {
                        HashSet hashSet = new HashSet(r4);
                        for (String unflattenFromString : string.split(":", -1)) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        C007203c.A04 = hashSet;
                        C007203c.A03 = string;
                    }
                }
                set = C007203c.A04;
            }
            if (!set.equals(this.A00)) {
                this.A00 = set;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet2 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (set.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Permission present on component ");
                            A0u.append(componentName);
                            A0u.append(", not adding listener record.");
                            AnonymousClass000.A1A(A0u, "NotifManCompat");
                        } else {
                            hashSet2.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    Map map = this.A03;
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", AnonymousClass000.A0l(componentName2, "Adding listener record for ", AnonymousClass000.A0u()));
                        }
                        map.put(componentName2, new AnonymousClass0TG(componentName2));
                    }
                }
                Iterator A0y = AnonymousClass000.A0y(this.A03);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (!hashSet2.contains(A11.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("Removing listener record for ");
                            Log.d("NotifManCompat", AnonymousClass000.A0o(A11.getKey(), A0u2));
                        }
                        AnonymousClass0TG r12 = (AnonymousClass0TG) A11.getValue();
                        if (r12.A03) {
                            context.unbindService(this);
                            r12.A03 = false;
                        }
                        r12.A01 = null;
                        A0y.remove();
                    }
                }
            }
            Iterator A0z = AnonymousClass000.A0z(this.A03);
            while (A0z.hasNext()) {
                AnonymousClass0TG r13 = (AnonymousClass0TG) A0z.next();
                r13.A02.add(obj);
                A00(r13);
            }
        } else if (i == 1) {
            AnonymousClass0SY r0 = (AnonymousClass0SY) message.obj;
            ComponentName componentName3 = r0.A00;
            IBinder iBinder = r0.A01;
            AnonymousClass0TG r2 = (AnonymousClass0TG) this.A03.get(componentName3);
            if (r2 != null) {
                if (iBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(C17440rN.A00);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C17440rN)) {
                        r1 = new C08870bS(iBinder);
                    } else {
                        r1 = (C17440rN) queryLocalInterface;
                    }
                }
                r2.A01 = r1;
                r2.A00 = 0;
                A00(r2);
                return true;
            }
        } else if (i == 2) {
            AnonymousClass0TG r14 = (AnonymousClass0TG) this.A03.get(message.obj);
            if (r14 != null) {
                if (r14.A03) {
                    this.A01.unbindService(this);
                    r14.A03 = false;
                }
                r14.A01 = null;
            }
        } else if (i != 3) {
            return false;
        } else {
            AnonymousClass0TG r02 = (AnonymousClass0TG) this.A03.get(message.obj);
            if (r02 != null) {
                A00(r02);
                return true;
            }
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", AnonymousClass000.A0l(componentName, "Connected to service ", AnonymousClass000.A0u()));
        }
        this.A02.obtainMessage(1, new AnonymousClass0SY(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", AnonymousClass000.A0l(componentName, "Disconnected from service ", AnonymousClass000.A0u()));
        }
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }

    public AnonymousClass0ZU(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A04 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(handlerThread.getLooper(), this);
    }
}
