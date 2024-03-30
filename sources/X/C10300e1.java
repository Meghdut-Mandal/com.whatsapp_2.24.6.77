package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0e1  reason: invalid class name and case insensitive filesystem */
public final class C10300e1 implements C17340r8 {
    public IAccountAccessor A00;
    public C17580re A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08 = 0;
    public int A09;
    public AnonymousClass0L0 A0A;
    public final Context A0B;
    public final C02600Bc A0C;
    public final C10340e5 A0D;
    public final AnonymousClass0TT A0E;
    public final ArrayList A0F = AnonymousClass001.A0I();
    public final Lock A0G;
    public final Bundle A0H = AnonymousClass001.A07();
    public final AnonymousClass0JC A0I;
    public final Map A0J;
    public final Set A0K = new HashSet();

    public static final void A03(C10300e1 r7) {
        r7.A03 = false;
        C10340e5 r6 = r7.A0D;
        r6.A07.A01 = Collections.emptySet();
        for (Object next : r7.A0K) {
            Map map = r6.A0A;
            if (!map.containsKey(next)) {
                map.put(next, new AnonymousClass0L0(17, (PendingIntent) null));
            }
        }
    }

    public final void Bxv() {
    }

    public final void Bxy(Bundle bundle) {
        if (A07(this, 1)) {
            if (bundle != null) {
                this.A0H.putAll(bundle);
            }
            if (A06(this)) {
                A00();
            }
        }
    }

    public final void Bxz(AnonymousClass0L0 r2, C06190Sq r3, boolean z) {
        if (A07(this, 1)) {
            A01(r2, r3, this, z);
            if (A06(this)) {
                A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void A00() {
        IBinder iBinder;
        C10340e5 r3 = this.A0D;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            r3.A07.A0D();
            r3.A0E = new C10280dz(r3);
            r3.A0E.Bxs();
            r3.A0C.signalAll();
            lock.unlock();
            AnonymousClass0RJ.A00.execute(new C11280g1(this));
            C17580re r1 = this.A01;
            if (r1 != null) {
                if (this.A05) {
                    IAccountAccessor iAccountAccessor = this.A00;
                    AnonymousClass006.A01(iAccountAccessor);
                    boolean z = this.A06;
                    C04260Jy r12 = (C04260Jy) r1;
                    try {
                        C07760Ze r4 = (C07760Ze) r12.A04();
                        Integer num = r12.A00;
                        AnonymousClass006.A01(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r4.A01);
                        if (iAccountAccessor == null) {
                            iBinder = null;
                        } else {
                            iBinder = iAccountAccessor.asBinder();
                        }
                        obtain.writeStrongBinder(iBinder);
                        obtain.writeInt(intValue);
                        obtain.writeInt(z ? 1 : 0);
                        r4.A00(9, obtain);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A10 = AnonymousClass000.A10(r3.A0A);
            while (A10.hasNext()) {
                Object obj = r3.A03.get(A10.next());
                AnonymousClass006.A01(obj);
                ((C17590rf) obj).B5X();
            }
            Bundle bundle = this.A0H;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            r3.A02.Bxo(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static final void A02(AnonymousClass0L0 r5, C10300e1 r6) {
        ArrayList arrayList = r6.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        r6.A05(!r5.A00());
        C10340e5 r0 = r6.A0D;
        r0.A00(r5);
        r0.A02.Bxl(r5);
    }

    public static final void A04(C10300e1 r6) {
        if (r6.A09 != 0) {
            return;
        }
        if (!r6.A03 || r6.A04) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            r6.A08 = 1;
            C10340e5 r4 = r6.A0D;
            Map map = r4.A03;
            r6.A09 = map.size();
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                Object next = A10.next();
                if (!r4.A0A.containsKey(next)) {
                    A0I2.add(map.get(next));
                } else if (A06(r6)) {
                    r6.A00();
                }
            }
            if (!A0I2.isEmpty()) {
                r6.A0F.add(AnonymousClass0RJ.A00.submit(new C04050Jb(r6, A0I2)));
            }
        }
    }

    private final void A05(boolean z) {
        C17580re r4 = this.A01;
        if (r4 != null) {
            if (r4.isConnected() && z) {
                C04260Jy r0 = (C04260Jy) r4;
                try {
                    C07760Ze r3 = (C07760Ze) r0.A04();
                    Integer num = r0.A00;
                    AnonymousClass006.A01(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(r3.A01);
                    obtain.writeInt(intValue);
                    r3.A00(7, obtain);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            r4.B5X();
            AnonymousClass006.A01(this.A0E);
            this.A00 = null;
        }
    }

    public static final boolean A06(C10300e1 r4) {
        AnonymousClass0L0 r2;
        int i = r4.A09 - 1;
        r4.A09 = i;
        if (i <= 0) {
            if (i < 0) {
                Log.w("GACConnecting", r4.A0D.A07.A0C());
                Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                r2 = new AnonymousClass0L0(8, (PendingIntent) null);
            } else {
                r2 = r4.A0A;
                if (r2 == null) {
                    return true;
                }
                r4.A0D.A00 = r4.A07;
            }
            A02(r2, r4);
        }
        return false;
    }

    public static final boolean A07(C10300e1 r4, int i) {
        String str;
        String str2;
        if (r4.A08 == i) {
            return true;
        }
        Log.w("GACConnecting", r4.A0D.A07.A0C());
        Log.w("GACConnecting", "Unexpected callback in ".concat(r4.toString()));
        Log.w("GACConnecting", AnonymousClass000.A0r("mRemainingConnections=", AnonymousClass000.A0u(), r4.A09));
        int i2 = r4.A08;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GoogleApiClient connecting is in step ");
        if (i2 != 0) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        A0u.append(str);
        A0u.append(" but received callback for step ");
        if (i != 0) {
            str2 = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        A0u.append(str2);
        Log.e("GACConnecting", A0u.toString(), new Exception());
        A02(new AnonymousClass0L0(8, (PendingIntent) null), r4);
        return false;
    }

    public final AnonymousClass0JS Bxk(AnonymousClass0JS r2) {
        this.A0D.A07.A0D.add(r2);
        return r2;
    }

    public final AnonymousClass0JS Bxn(AnonymousClass0JS r2) {
        throw AnonymousClass001.A09("GoogleApiClient is not connected yet.");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.0re, X.0rf] */
    public final void Bxs() {
        C10340e5 r2 = this.A0D;
        r2.A0A.clear();
        this.A03 = false;
        this.A0A = null;
        this.A08 = 0;
        this.A02 = true;
        this.A04 = false;
        this.A05 = false;
        HashMap A0J2 = AnonymousClass001.A0J();
        Map map = this.A0J;
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            C06190Sq r6 = (C06190Sq) A10.next();
            Map map2 = r2.A03;
            AnonymousClass0QI r5 = r6.A01;
            Object obj = map2.get(r5);
            AnonymousClass006.A01(obj);
            C17590rf r4 = (C17590rf) obj;
            boolean A1X = AnonymousClass000.A1X(map.get(r6));
            if (r4.BoS()) {
                this.A03 = true;
                if (A1X) {
                    this.A0K.add(r5);
                } else {
                    this.A02 = false;
                }
            }
            A0J2.put(r4, new C10390eA(r6, this, A1X));
        }
        if (this.A03) {
            AnonymousClass0TT r9 = this.A0E;
            AnonymousClass006.A01(r9);
            AnonymousClass0JC r42 = this.A0I;
            AnonymousClass006.A01(r42);
            AnonymousClass0JO r1 = r2.A07;
            r9.A00 = Integer.valueOf(System.identityHashCode(r1));
            C10130dk r7 = new C10130dk(this);
            this.A01 = r42.A00(this.A0B, r1.A05, r7, r7, r9, r9.A01);
        }
        this.A09 = r2.A03.size();
        this.A0F.add(AnonymousClass0RJ.A00.submit(new C04040Ja(this, A0J2)));
    }

    public final void By0(int i) {
        A02(new AnonymousClass0L0(8, (PendingIntent) null), this);
    }

    public final boolean By1() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0D.A00((AnonymousClass0L0) null);
        return true;
    }

    public C10300e1(Context context, C02600Bc r3, AnonymousClass0JC r4, C10340e5 r5, AnonymousClass0TT r6, Map map, Lock lock) {
        this.A0D = r5;
        this.A0E = r6;
        this.A0J = map;
        this.A0C = r3;
        this.A0I = r4;
        this.A0G = lock;
        this.A0B = context;
    }

    public static final void A01(AnonymousClass0L0 r4, C06190Sq r5, C10300e1 r6, boolean z) {
        if ((!z || r4.A00() || r6.A0C.A03((Context) null, (String) null, r4.A01) != null) && r6.A0A == null) {
            r6.A0A = r4;
            r6.A07 = Integer.MAX_VALUE;
        }
        r6.A0D.A0A.put(r5.A01, r4);
    }
}
