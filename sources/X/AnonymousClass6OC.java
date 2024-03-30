package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.6OC  reason: invalid class name */
public class AnonymousClass6OC {
    public AnonymousClass0ZS A00;
    public C161347mb A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = C36441kJ.A11();

    public static C1257461c A00(Context context) {
        Throwable th;
        Throwable th2;
        C161347mb r1;
        IOException th3;
        C1257461c r4;
        AnonymousClass6OC r3 = new AnonymousClass6OC(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass006.A04("Calling this from your main thread can lead to deadlock");
            synchronized (r3) {
                try {
                    if (r3.A02) {
                        r3.A01();
                    }
                    Context context2 = r3.A03;
                    try {
                        context2.getPackageManager().getPackageInfo("com.android.vending", 0);
                        int A022 = C02600Bc.A00.A02(context2, 12451000);
                        if (A022 == 0 || A022 == 2) {
                            AnonymousClass0ZS r5 = new AnonymousClass0ZS();
                            Intent A0I = C36441kJ.A0I("com.google.android.gms.ads.identifier.service.START");
                            A0I.setPackage("com.google.android.gms");
                            try {
                                if (C07510Ya.A00().A03(context2, A0I, r5, 1)) {
                                    r3.A00 = r5;
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    AnonymousClass006.A04("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                    if (!r5.A00) {
                                        r5.A00 = true;
                                        IBinder iBinder = (IBinder) r5.A01.poll(10000, timeUnit);
                                        if (iBinder != null) {
                                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                            if (queryLocalInterface instanceof C161347mb) {
                                                r1 = (C161347mb) queryLocalInterface;
                                            } else {
                                                r1 = new C133836a4(iBinder);
                                            }
                                            r3.A01 = r1;
                                            r3.A02 = true;
                                        } else {
                                            th2 = new TimeoutException("Timed out waiting for the service connection");
                                        }
                                    } else {
                                        th2 = AnonymousClass001.A09("Cannot call get on this connection more than once");
                                    }
                                    throw th2;
                                }
                                th = C90524aI.A0X("Connection failure");
                                throw th;
                            } catch (Throwable th4) {
                                th = new IOException(th4);
                            }
                        } else {
                            th = C90524aI.A0X("Google Play services not available");
                            throw th;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        th = new AnonymousClass0O8(9);
                    }
                } catch (InterruptedException unused2) {
                    th = C90524aI.A0X("Interrupted exception");
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            }
            AnonymousClass006.A04("Calling this from your main thread can lead to deadlock");
            synchronized (r3) {
                try {
                    if (!r3.A02) {
                        synchronized (r3.A04) {
                            try {
                                throw C90524aI.A0X("AdvertisingIdClient is not connected.");
                            } catch (Throwable th6) {
                                th3 = th6;
                                throw th3;
                            }
                        }
                    } else {
                        AnonymousClass006.A01(r3.A00);
                        AnonymousClass006.A01(r3.A01);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel A002 = ((C133836a4) r3.A01).A00(1, obtain);
                        String readString = A002.readString();
                        A002.recycle();
                        Parcel obtain2 = Parcel.obtain();
                        obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        obtain2.writeInt(1);
                        Parcel A003 = ((C133836a4) r3.A01).A00(2, obtain2);
                        boolean A1P = AnonymousClass000.A1P(A003.readInt());
                        A003.recycle();
                        r4 = new C1257461c(readString, A1P);
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    th3 = C90524aI.A0X("Remote exception");
                } catch (Throwable th7) {
                    th = th7;
                    throw th;
                }
            }
            synchronized (r3.A04) {
                try {
                } catch (Throwable th8) {
                    while (true) {
                        th = th8;
                        break;
                    }
                }
            }
            long A0J = C90514aH.A0J(elapsedRealtime);
            if (Math.random() <= 0.0d) {
                HashMap A0J2 = AnonymousClass001.A0J();
                String str = "1";
                A0J2.put("app_context", str);
                if (true != r4.A01) {
                    str = "0";
                }
                A0J2.put("limit_ad_tracking", str);
                String str2 = r4.A00;
                if (str2 != null) {
                    A0J2.put("ad_id_size", Integer.toString(str2.length()));
                }
                A0J2.put("tag", "AdvertisingIdClient");
                A0J2.put("time_spent", Long.toString(A0J));
                new AnonymousClass78a(A0J2).start();
            }
            r3.A01();
            return r4;
        } catch (Throwable th9) {
            r3.A01();
            throw th9;
        }
    }

    public final void A01() {
        AnonymousClass006.A04("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (this.A00 != null) {
                try {
                    if (this.A02) {
                        C07510Ya.A00().A02(context, this.A00);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public AnonymousClass6OC(Context context) {
        AnonymousClass006.A01(context);
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext != null ? applicationContext : context;
        this.A02 = false;
    }

    public final void finalize() {
        A01();
        super.finalize();
    }
}
