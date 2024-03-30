package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Nx  reason: invalid class name and case insensitive filesystem */
public class C27361Nx implements C27351Nw {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C24361Cd A01;
    public final C19770wU A02;
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final Set A05 = new HashSet();
    public final AnonymousClass1DM A06;
    public final AnonymousClass1C4 A07;

    public static AnonymousClass35G A00(AnonymousClass11F r1, C27361Nx r2) {
        byte[] bArr;
        C192449Ha A072;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r1);
        if (A002 == null || (A072 = r2.A06.A07(A002)) == null) {
            bArr = null;
        } else {
            bArr = A072.A01;
        }
        return new AnonymousClass35G(r2, bArr);
    }

    public static void A01(AnonymousClass11F r6, AnonymousClass35G r7, C27361Nx r8) {
        int i;
        AnonymousClass3A3 r0 = (AnonymousClass3A3) r8.A04.get(r6);
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        if (i != 1 && r7 != null) {
            AnonymousClass1C4 r2 = r8.A07;
            byte[] bArr = r7.A00;
            AnonymousClass19J r1 = r2.A01;
            if (!r1.A06 || r1.A04 != 2) {
                r8.A05.add(r6);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("app/send-presence-subscription jid=");
            sb.append(r6);
            Log.i(sb.toString());
            AnonymousClass19A r3 = r2.A02;
            Message obtain = Message.obtain((Handler) null, 0, 12, 0, r6);
            if (bArr != null) {
                obtain.getData().putByteArray("tctoken", bArr);
            }
            r3.A0J(obtain);
            r8.A09(r6, true);
            r8.A05.remove(r6);
        }
    }

    public int A02(AnonymousClass11F r8, UserJid userJid) {
        AnonymousClass35E r6;
        AnonymousClass3A3 r62 = (AnonymousClass3A3) this.A04.get(r8);
        if (r62 == null) {
            return -1;
        }
        if (userJid == null || !AnonymousClass143.A0G(r8)) {
            long j = r62.A03;
            if (j == 0 || j + 25000 <= SystemClock.elapsedRealtime()) {
                return -1;
            }
            return r62.A00;
        }
        HashMap hashMap = r62.A05;
        if (hashMap == null || (r6 = (AnonymousClass35E) hashMap.get(userJid)) == null) {
            return -1;
        }
        long j2 = r6.A01;
        if (j2 == 0 || j2 + 25000 <= SystemClock.elapsedRealtime()) {
            return -1;
        }
        return r6.A00;
    }

    public long A03(AnonymousClass11F r3) {
        AnonymousClass3A3 r0 = (AnonymousClass3A3) this.A04.get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A04;
    }

    public GroupJid A04(AnonymousClass11F r7, int i, long j) {
        HashMap hashMap;
        AnonymousClass35E r0;
        HashMap hashMap2 = this.A04;
        AnonymousClass3A3 r3 = (AnonymousClass3A3) hashMap2.get(r7);
        if (r3 == null) {
            r3 = new AnonymousClass3A3();
            hashMap2.put(r7, r3);
        }
        if (j == 0) {
            r3.A04 = 0;
        } else {
            r3.A04 = j;
        }
        r3.A03 = 0;
        r3.A01 = i;
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (AnonymousClass143.A0G((Jid) entry.getKey()) && (hashMap = ((AnonymousClass3A3) entry.getValue()).A05) != null && (r0 = (AnonymousClass35E) hashMap.get(r7)) != null) {
                r0.A01 = 0;
                AnonymousClass6SZ r02 = GroupJid.Companion;
                return AnonymousClass6SZ.A00((Jid) entry.getKey());
            }
        }
        return null;
    }

    public void A05() {
        HashMap hashMap = this.A04;
        HashSet hashSet = new HashSet(hashMap.keySet());
        hashMap.clear();
        HashMap hashMap2 = this.A03;
        for (C35661j3 removeCallbacks : hashMap2.values()) {
            this.A00.removeCallbacks(removeCallbacks);
        }
        hashMap2.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.A01.A00((AnonymousClass11F) it.next());
        }
    }

    public void A07(AnonymousClass11F r4) {
        if (!(r4 instanceof C177618e5) && !(r4 instanceof C177628e6) && !(r4 instanceof C177638e7) && !(r4 instanceof AnonymousClass146) && !(r4 instanceof C28981Uw) && !AnonymousClass143.A0H(r4)) {
            this.A02.Bp0(new C49152ie(r4, this), new Void[0]);
        }
    }

    public void A08(AnonymousClass11F r6, UserJid userJid) {
        String obj;
        HashMap hashMap = this.A04;
        AnonymousClass3A3 r4 = (AnonymousClass3A3) hashMap.get(r6);
        if (r4 == null) {
            r4 = new AnonymousClass3A3();
            hashMap.put(r6, r4);
        }
        if (userJid != null && AnonymousClass143.A0G(r6)) {
            HashMap hashMap2 = r4.A05;
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                r4.A05 = hashMap2;
            }
            AnonymousClass35E r1 = (AnonymousClass35E) hashMap2.get(userJid);
            if (r1 == null) {
                r1 = new AnonymousClass35E();
                r4.A05.put(userJid, r1);
            }
            r1.A01 = 0;
        }
        r4.A03 = 0;
        if (userJid == null) {
            obj = r6.getRawString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(r6.getRawString());
            sb.append(userJid.getRawString());
            obj = sb.toString();
        }
        C35661j3 r12 = (C35661j3) this.A03.get(obj);
        if (r12 != null) {
            this.A00.removeCallbacks(r12);
        }
    }

    public void A09(AnonymousClass11F r4, boolean z) {
        HashMap hashMap = this.A04;
        AnonymousClass3A3 r2 = (AnonymousClass3A3) hashMap.get(r4);
        if (r2 == null) {
            r2 = new AnonymousClass3A3();
            hashMap.put(r4, r2);
        }
        r2.A02 = z ? 1 : 0;
        if (!z) {
            r2.A04 = 0;
        }
    }

    public C27361Nx(C24361Cd r3, AnonymousClass1DM r4, AnonymousClass1C4 r5, C19770wU r6) {
        this.A02 = r6;
        this.A07 = r5;
        this.A01 = r3;
        this.A06 = r4;
    }

    public void A06(AnonymousClass11F r8) {
        AnonymousClass3A3 r5;
        HashMap hashMap;
        if (AnonymousClass143.A0G(r8) && (r5 = (AnonymousClass3A3) this.A04.get(r8)) != null && (hashMap = r5.A05) != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((AnonymousClass35E) entry.getValue()).A01 = 0;
                StringBuilder sb = new StringBuilder();
                sb.append(r8.getRawString());
                sb.append(((Jid) entry.getKey()).getRawString());
                C35661j3 r1 = (C35661j3) this.A03.get(sb.toString());
                if (r1 != null) {
                    this.A00.removeCallbacks(r1);
                }
            }
            r5.A03 = 0;
        }
    }
}
