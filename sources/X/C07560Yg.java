package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Yg  reason: invalid class name and case insensitive filesystem */
public abstract class C07560Yg {
    public static final C04520Ky[] A0T = new C04520Ky[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public AnonymousClass0L0 A07 = null;
    public C16840qB A08;
    public IGmsServiceBroker A09;
    public C06260Sx A0A;
    public AtomicInteger A0B = new AtomicInteger(0);
    public boolean A0C = false;
    public AnonymousClass0ZT A0D;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final AnonymousClass0oF A0H;
    public final AnonymousClass0oG A0I;
    public final Object A0J = new Object();
    public final Object A0K = new Object();
    public final String A0L;
    public final ArrayList A0M = AnonymousClass001.A0I();
    public final Looper A0N;
    public final C02600Bc A0O;
    public final C07520Yb A0P;
    public volatile C04510Kx A0Q = null;
    public volatile String A0R;
    public volatile String A0S = null;

    public static final void A01(IInterface iInterface, C07560Yg r9, int i) {
        C06260Sx r0;
        boolean z = false;
        boolean z2 = true;
        if (i != 4) {
            z2 = false;
        }
        boolean z3 = true;
        if (iInterface == null) {
            z3 = false;
        }
        if (z2 == z3) {
            z = true;
        }
        AnonymousClass006.A06(z);
        synchronized (r9.A0J) {
            r9.A02 = i;
            r9.A06 = iInterface;
            if (i == 1) {
                AnonymousClass0ZT r6 = r9.A0D;
                if (r6 != null) {
                    C07520Yb r5 = r9.A0P;
                    String str = r9.A0A.A00;
                    AnonymousClass006.A01(str);
                    C06260Sx r02 = r9.A0A;
                    r5.A01(r6, new AnonymousClass0YA(str, r02.A01, r02.A02));
                    r9.A0D = null;
                }
            } else if (i == 2 || i == 3) {
                AnonymousClass0ZT r62 = r9.A0D;
                if (!(r62 == null || (r0 = r9.A0A) == null)) {
                    String str2 = r0.A00;
                    String str3 = r0.A01;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Calling connect() while still connected, missing disconnect() for ");
                    A0u.append(str2);
                    Log.e("GmsClient", AnonymousClass000.A0p(" on ", str3, A0u));
                    C07520Yb r52 = r9.A0P;
                    String str4 = r9.A0A.A00;
                    AnonymousClass006.A01(str4);
                    C06260Sx r03 = r9.A0A;
                    r52.A01(r62, new AnonymousClass0YA(str4, r03.A01, r03.A02));
                    r9.A0B.incrementAndGet();
                }
                AtomicInteger atomicInteger = r9.A0B;
                AnonymousClass0ZT r8 = new AnonymousClass0ZT(r9, atomicInteger.get());
                r9.A0D = r8;
                C06260Sx r2 = new C06260Sx(r9.A06(), r9.A08(), r9.A0E());
                r9.A0A = r2;
                if (!r2.A02 || r9.BEG() >= 17895000) {
                    C07520Yb r7 = r9.A0P;
                    String str5 = r2.A00;
                    AnonymousClass006.A01(str5);
                    C06260Sx r1 = r9.A0A;
                    String str6 = r1.A01;
                    String str7 = r9.A0L;
                    if (str7 == null) {
                        str7 = AnonymousClass000.A0k(r9.A0F);
                    }
                    if (!r7.A02(r8, new AnonymousClass0YA(str5, str6, r1.A02), str7)) {
                        C06260Sx r04 = r9.A0A;
                        String str8 = r04.A00;
                        String str9 = r04.A01;
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("unable to connect to service: ");
                        A0u2.append(str8);
                        A0u2.append(" on ");
                        A0u2.append(str9);
                        AnonymousClass000.A1A(A0u2, "GmsClient");
                        int i2 = atomicInteger.get();
                        Handler handler = r9.A0G;
                        handler.sendMessage(handler.obtainMessage(7, i2, -1, new AnonymousClass0LE(r9, 16)));
                    }
                } else {
                    throw AnonymousClass001.A09("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(r2.A00)));
                }
            } else if (i == 4) {
                AnonymousClass006.A01(iInterface);
                r9.A0C(iInterface);
            }
        }
    }

    public abstract IInterface A05(IBinder iBinder);

    public String A06() {
        return "com.google.android.gms";
    }

    public abstract String A07();

    public abstract String A08();

    public boolean A0D() {
        return false;
    }

    public C04520Ky[] A0F() {
        return A0T;
    }

    public abstract int BEG();

    public boolean BmV() {
        return false;
    }

    public boolean BoR() {
        return true;
    }

    public boolean BoS() {
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean A02(IInterface iInterface, C07560Yg r3, int i, int i2) {
        synchronized (r3.A0J) {
            if (r3.A02 != i) {
                return false;
            }
            A01(iInterface, r3, i2);
            return true;
        }
    }

    public final IInterface A04() {
        IInterface iInterface;
        synchronized (this.A0J) {
            if (this.A02 != 5) {
                A09();
                iInterface = this.A06;
                AnonymousClass006.A02(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public void A0A(int i) {
        this.A00 = i;
        this.A03 = System.currentTimeMillis();
    }

    public void A0B(Bundle bundle, IBinder iBinder, int i, int i2) {
        Handler handler = this.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new AnonymousClass0LF(bundle, iBinder, this, i)));
    }

    public void B3T(C16840qB r3) {
        AnonymousClass006.A02(r3, "Connection progress callbacks cannot be null.");
        this.A08 = r3;
        A01((IInterface) null, this, 2);
    }

    public void B5X() {
        this.A0B.incrementAndGet();
        ArrayList arrayList = this.A0M;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C06500Tv r1 = (C06500Tv) arrayList.get(i);
                synchronized (r1) {
                    r1.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0K) {
            this.A09 = null;
        }
        A01((IInterface) null, this, 1);
    }

    public void B5Y(String str) {
        this.A0S = str;
        B5X();
    }

    public void BGd(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A032 = A03();
        int i = this.A0E;
        String str = this.A0R;
        Scope[] scopeArr = AnonymousClass0KF.A0F;
        Bundle A072 = AnonymousClass001.A07();
        C04520Ky[] r16 = AnonymousClass0KF.A0E;
        AnonymousClass0KF r10 = new AnonymousClass0KF((Account) null, A072, (IBinder) null, (String) null, str, r16, r16, scopeArr, 6, i, 12451000, 0, true, false);
        r10.A05 = this.A0F.getPackageName();
        r10.A03 = A032;
        Set set2 = set;
        if (set != null) {
            r10.A0A = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (BoS()) {
            r10.A02 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                r10.A04 = iAccountAccessor.asBinder();
            }
        }
        r10.A08 = A0T;
        r10.A09 = A0F();
        if (A0D()) {
            r10.A07 = true;
        }
        try {
            synchronized (this.A0K) {
                IGmsServiceBroker iGmsServiceBroker = this.A09;
                if (iGmsServiceBroker != null) {
                    AnonymousClass0MP r8 = new AnonymousClass0MP(this, this.A0B.get());
                    C10410eC r9 = (C10410eC) iGmsServiceBroker;
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(r8.asBinder());
                        obtain.writeInt(1);
                        C08690b9.A00(obtain, r10, 0);
                        r9.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, this.A0B.get(), 3));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            A0B((Bundle) null, (IBinder) null, 8, this.A0B.get());
        }
    }

    public Intent BHZ() {
        throw AnonymousClass001.A0E("Not a sign in API");
    }

    public boolean BLT() {
        boolean z;
        synchronized (this.A0J) {
            int i = this.A02;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    public boolean isConnected() {
        boolean A1S;
        synchronized (this.A0J) {
            A1S = AnonymousClass000.A1S(this.A02, 4);
        }
        return A1S;
    }

    public C07560Yg(Context context, Looper looper, C02600Bc r6, AnonymousClass0oF r7, AnonymousClass0oG r8, C07520Yb r9, String str, int i) {
        AnonymousClass006.A02(context, "Context must not be null");
        this.A0F = context;
        AnonymousClass006.A02(looper, "Looper must not be null");
        this.A0N = looper;
        AnonymousClass006.A02(r9, "Supervisor must not be null");
        this.A0P = r9;
        AnonymousClass006.A02(r6, "API availability must not be null");
        this.A0O = r6;
        this.A0G = new AnonymousClass0MS(looper, this);
        this.A0E = i;
        this.A0H = r7;
        this.A0I = r8;
        this.A0L = str;
    }

    public Bundle A03() {
        return AnonymousClass001.A07();
    }

    public final void A09() {
        if (!isConnected()) {
            throw AnonymousClass001.A09("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void A0C(IInterface iInterface) {
        this.A04 = System.currentTimeMillis();
    }

    public boolean A0E() {
        if (BEG() >= 211700000) {
            return true;
        }
        return false;
    }
}
