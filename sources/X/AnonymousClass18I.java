package X;

import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.18I  reason: invalid class name */
public class AnonymousClass18I {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final C20700y1 A02;
    public final AnonymousClass18J A03;
    public final C20810yC A04;
    public final List A05 = Collections.synchronizedList(new LinkedList());
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();
    public final Object A07 = new Object();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();

    public static AnonymousClass79X A00(AnonymousClass6EZ r3, AnonymousClass18I r4) {
        ConcurrentHashMap concurrentHashMap = r4.A06;
        Integer valueOf = Integer.valueOf(Math.abs(r4.A02(r3).hashCode()) % 512);
        if (!concurrentHashMap.containsKey(valueOf)) {
            concurrentHashMap.putIfAbsent(valueOf, new AnonymousClass79X(r4));
        }
        Object obj = concurrentHashMap.get(valueOf);
        C18740tg.A06(obj);
        return (AnonymousClass79X) obj;
    }

    public static AnonymousClass79X A01(AnonymousClass18I r3, AnonymousClass6EU r4) {
        ConcurrentHashMap concurrentHashMap = r3.A08;
        StringBuilder sb = new StringBuilder();
        sb.append(r4.A01);
        sb.append(":");
        sb.append(r3.A02(r4.A00));
        Integer valueOf = Integer.valueOf(Math.abs(sb.toString().hashCode()) % 32);
        if (!concurrentHashMap.containsKey(valueOf)) {
            concurrentHashMap.putIfAbsent(valueOf, new AnonymousClass79X(r3));
        }
        Object obj = concurrentHashMap.get(valueOf);
        C18740tg.A06(obj);
        return (AnonymousClass79X) obj;
    }

    private String A02(AnonymousClass6EZ r5) {
        if (r5.A01 != 0) {
            try {
                String str = r5.A02;
                Parcelable.Creator creator = C223313w.CREATOR;
                PhoneUserJid A0A = this.A03.A00.A0A(C130946Nb.A00(str));
                if (A0A != null) {
                    r5 = C133256Xm.A02(DeviceJid.Companion.A01(A0A, r5.A00));
                }
            } catch (C19740wR e) {
                if (C20800yB.A01(C21000yV.A02, this.A04, 7495)) {
                    String str2 = r5.A02;
                    Parcelable.Creator creator2 = AnonymousClass148.CREATOR;
                    AnonymousClass00C.A0D(str2, 0);
                    UserJid A042 = UserJid.JID_FACTORY.A04(str2, "interop");
                    AnonymousClass00C.A08(A042);
                    if (!(A042 instanceof AnonymousClass148)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid interop JID: ");
                        sb.append(str2);
                        throw new C19740wR(sb.toString());
                    }
                }
                Log.e("SignalLocks/getPhoneNumberSignalAddressIfAvailable", e);
            } catch (C19740wR unused) {
                Log.e("SignalLocks/getPhoneNumberSignalAddressIfAvailable", e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r5.A02);
        sb2.append(".");
        sb2.append(r5.A01);
        return sb2.toString();
    }

    public static void A03(AnonymousClass79X r3, AnonymousClass18I r4) {
        C20700y1 r0 = r4.A02;
        if (r0 == null || !r0.A00()) {
            if (C20800yB.A01(C21000yV.A02, r4.A04, 4831)) {
                r4.A04(new HashSet(Collections.singleton(r3)));
                return;
            }
        }
        r3.lock();
    }

    private boolean A06(Set set) {
        boolean z;
        synchronized (this.A07) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Lock lock = (Lock) it.next();
                if (!lock.tryLock()) {
                    break;
                }
                hashSet.add(lock);
            }
            z = true;
            if (hashSet.size() != set.size()) {
                z = false;
                A05(hashSet);
            }
        }
        return z;
    }

    public AnonymousClass79X A07() {
        AnonymousClass6EZ r2;
        C19730wQ r0 = this.A01;
        r0.A0G();
        C223413x r02 = r0.A02;
        if (r02 != null) {
            r2 = C133256Xm.A02(r02);
        } else {
            r2 = new AnonymousClass6EZ("", 0, 0);
        }
        AnonymousClass79X A002 = A00(r2, this);
        A03(A002, this);
        return A002;
    }

    public AnonymousClass79X A08(DeviceJid deviceJid) {
        AnonymousClass79X A002 = A00(C133256Xm.A02(deviceJid.userJid.getPrimaryDevice()), this);
        A03(A002, this);
        return A002;
    }

    public AnonymousClass18I(C19700wN r2, C19730wQ r3, C20700y1 r4, AnonymousClass18J r5, C20810yC r6) {
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    private void A04(Set set) {
        if (!A06(set)) {
            HashMap hashMap = new HashMap();
            for (Map.Entry value : this.A06.entrySet()) {
                ReentrantLock reentrantLock = (ReentrantLock) value.getValue();
                if (reentrantLock.isHeldByCurrentThread()) {
                    hashMap.put(reentrantLock, Integer.valueOf(reentrantLock.getHoldCount()));
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                for (int i = 0; i < ((Number) entry.getValue()).intValue(); i++) {
                    ((Lock) entry.getKey()).unlock();
                }
            }
            set.addAll(hashMap.keySet());
            while (!A06(set)) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                List list = this.A05;
                list.add(countDownLatch);
                try {
                    countDownLatch.await(10, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                list.remove(countDownLatch);
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                for (int i2 = 0; i2 < ((Number) entry2.getValue()).intValue() - 1; i2++) {
                    ((Lock) entry2.getKey()).lock();
                }
            }
        }
    }

    public static void A05(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Lock) it.next()).unlock();
        }
    }

    public HashSet A09(Set set) {
        if (set.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(A00((AnonymousClass6EZ) it.next(), this));
        }
        return hashSet;
    }

    public void A0A(Set set) {
        if (set.size() == 1) {
            A03((AnonymousClass79X) set.iterator().next(), this);
            return;
        }
        C20700y1 r0 = this.A02;
        if (r0 == null || !r0.A00()) {
            if (C20800yB.A01(C21000yV.A02, this.A04, 4831)) {
                A04(new HashSet(set));
                return;
            }
        }
        while (!A06(set)) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            List list = this.A05;
            list.add(countDownLatch);
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            list.remove(countDownLatch);
        }
    }
}
