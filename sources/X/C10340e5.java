package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0e5  reason: invalid class name and case insensitive filesystem */
public final class C10340e5 implements C17350r9, C17600rg {
    public int A00;
    public AnonymousClass0L0 A01 = null;
    public final C17230qw A02;
    public final Map A03;
    public final Context A04;
    public final C02600Bc A05;
    public final AnonymousClass0JC A06;
    public final AnonymousClass0JO A07;
    public final AnonymousClass0MI A08;
    public final AnonymousClass0TT A09;
    public final Map A0A = AnonymousClass001.A0J();
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile C17340r8 A0E;

    public final void By5() {
    }

    public final boolean By7(C15910oD r2) {
        return false;
    }

    public final void A00(AnonymousClass0L0 r3) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = r3;
            this.A0E = new C10290e0(this);
            this.A0E.Bxs();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void Bxm(AnonymousClass0L0 r3, C06190Sq r4, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.Bxz(r3, r4, z);
        } finally {
            lock.unlock();
        }
    }

    public final void By2() {
        this.A0E.Bxv();
    }

    public final void By3() {
        this.A0E.By1();
        this.A0A.clear();
    }

    public final void By4(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String str2;
        String str3;
        String str4 = str;
        String concat = String.valueOf(str4).concat("  ");
        PrintWriter printWriter2 = printWriter;
        printWriter2.append(str4).append("mState=").println(this.A0E);
        Iterator A10 = AnonymousClass000.A10(this.A0B);
        while (A10.hasNext()) {
            C06190Sq r2 = (C06190Sq) A10.next();
            printWriter2.append(str4).append(r2.A02).println(":");
            Object obj = this.A03.get(r2.A01);
            AnonymousClass006.A01(obj);
            C07560Yg r7 = (C07560Yg) ((C17590rf) obj);
            synchronized (r7.A0J) {
                i = r7.A02;
                iInterface = r7.A06;
            }
            synchronized (r7.A0K) {
                iGmsServiceBroker = r7.A09;
            }
            printWriter2.append(concat).append("mConnectState=");
            if (i == 1) {
                str2 = "DISCONNECTED";
            } else if (i == 2) {
                str2 = "REMOTE_CONNECTING";
            } else if (i == 3) {
                str2 = "LOCAL_CONNECTING";
            } else if (i != 4) {
                str2 = "DISCONNECTING";
            } else {
                str2 = "CONNECTED";
            }
            printWriter2.print(str2);
            printWriter2.append(" mService=");
            if (iInterface == null) {
                printWriter2.append("null");
            } else {
                printWriter2.append(r7.A07()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
            }
            printWriter2.append(" mServiceBroker=");
            if (iGmsServiceBroker == null) {
                printWriter2.println("null");
            } else {
                printWriter2.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (r7.A04 > 0) {
                PrintWriter append = printWriter2.append(concat).append("lastConnectedTime=");
                long j = r7.A04;
                String format = simpleDateFormat.format(new Date(j));
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(j);
                append.println(AnonymousClass000.A0p(" ", format, A0u));
            }
            if (r7.A03 > 0) {
                printWriter2.append(concat).append("lastSuspendedCause=");
                int i2 = r7.A00;
                if (i2 == 1) {
                    str3 = "CAUSE_SERVICE_DISCONNECTED";
                } else if (i2 == 2) {
                    str3 = "CAUSE_NETWORK_LOST";
                } else if (i2 != 3) {
                    str3 = String.valueOf(i2);
                } else {
                    str3 = "CAUSE_DEAD_OBJECT_EXCEPTION";
                }
                printWriter2.append(str3);
                PrintWriter append2 = printWriter2.append(" lastSuspendedTime=");
                long j2 = r7.A03;
                String format2 = simpleDateFormat.format(new Date(j2));
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(j2);
                append2.println(AnonymousClass000.A0p(" ", format2, A0u2));
            }
            if (r7.A05 > 0) {
                printWriter2.append(concat).append("lastFailedStatus=").append(AnonymousClass0QJ.A00(r7.A01));
                PrintWriter append3 = printWriter2.append(" lastFailedTime=");
                long j3 = r7.A05;
                String format3 = simpleDateFormat.format(new Date(j3));
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append(j3);
                append3.println(AnonymousClass000.A0p(" ", format3, A0u3));
            }
        }
    }

    public final boolean By6() {
        return this.A0E instanceof C10280dz;
    }

    public final void onConnected(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.Bxy(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.By0(i);
        } finally {
            lock.unlock();
        }
    }

    public C10340e5(Context context, Looper looper, C02600Bc r6, AnonymousClass0JC r7, AnonymousClass0JO r8, C17230qw r9, AnonymousClass0TT r10, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A04 = context;
        this.A0D = lock;
        this.A05 = r6;
        this.A03 = map;
        this.A09 = r10;
        this.A0B = map2;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r9;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C10140dl) arrayList.get(i)).A00 = this;
        }
        this.A08 = new AnonymousClass0MI(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new C10290e0(this);
    }

    public final AnonymousClass0JS Bxu(AnonymousClass0JS r2) {
        r2.A05();
        this.A0E.Bxk(r2);
        return r2;
    }

    public final AnonymousClass0JS Bxx(AnonymousClass0JS r2) {
        r2.A05();
        return this.A0E.Bxn(r2);
    }
}
