package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6X6  reason: invalid class name */
public class AnonymousClass6X6 {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass144 A05;
    public final Object A06 = C36441kJ.A11();
    public final Map A07 = C90524aI.A0s();
    public final Map A08 = C90524aI.A0s();
    public final Object A09 = C36441kJ.A11();
    public volatile boolean A0A = false;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A05;
        objArr[1] = this.A08;
        objArr[2] = this.A07;
        objArr[3] = A0B();
        return AnonymousClass000.A0M(A0D(), objArr, 4);
    }

    private void A03() {
        Iterator A0z = AnonymousClass000.A0z(this.A08);
        while (A0z.hasNext()) {
            Iterator A10 = C36391kE.A10(((AnonymousClass6PM) A0z.next()).A04);
            while (A10.hasNext()) {
                ((AnonymousClass6B1) A10.next()).A01 = false;
            }
        }
    }

    public static void A04(AnonymousClass6X6 r2) {
        synchronized (r2.A09) {
            r2.A04 = AnonymousClass6UD.A03(r2.A0H());
            r2.A03 = AnonymousClass6UD.A03(r2.A0G());
            r2.A0D();
            r2.A0B();
        }
    }

    public C20760y7 A05() {
        Map map;
        if (this.A00 != 0) {
            map = this.A07;
        } else {
            map = this.A08;
        }
        return C20760y7.copyOf((Collection) map.keySet());
    }

    public C20760y7 A07() {
        return C20760y7.copyOf(this.A08.values());
    }

    public AnonymousClass6PM A09(UserJid userJid) {
        Map map;
        if (userJid instanceof PhoneUserJid) {
            map = this.A08;
        } else {
            map = this.A07;
        }
        AnonymousClass6PM r0 = (AnonymousClass6PM) map.remove(userJid);
        if (r0 != null) {
            A0J();
        }
        return r0;
    }

    public String A0B() {
        String str;
        synchronized (this.A09) {
            str = this.A03;
            C18740tg.A06(str);
        }
        return str;
    }

    public String A0C() {
        String str;
        synchronized (this.A06) {
            str = this.A01;
            if (str == null) {
                str = A01(this.A07.keySet());
                this.A01 = str;
            }
            C18740tg.A06(str);
        }
        return str;
    }

    public String A0D() {
        String str;
        synchronized (this.A09) {
            str = this.A04;
            C18740tg.A06(str);
        }
        return str;
    }

    public String A0E() {
        String str;
        synchronized (this.A06) {
            str = this.A02;
            if (str == null) {
                str = A01(this.A08.keySet());
                this.A02 = str;
            }
            C18740tg.A06(str);
        }
        return str;
    }

    public void A0M(ConcurrentHashMap concurrentHashMap) {
        Map map = this.A08;
        map.clear();
        Iterator A10 = C36371kC.A10(concurrentHashMap);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (A11.getKey() instanceof PhoneUserJid) {
                map.put(A11.getKey(), A11.getValue());
            } else if (!AnonymousClass143.A0I((Jid) A11.getKey()) || this.A00 == 0) {
                A11.getKey();
            } else {
                this.A07.put(A11.getKey(), A11.getValue());
            }
        }
    }

    public boolean A0Q(UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        if (this.A08.containsKey(userJid) || this.A07.containsKey(userJid)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass6X6 r4 = (AnonymousClass6X6) obj;
            if (this.A05.equals(r4.A05) && this.A08.equals(r4.A08) && C1901797e.A00(A0B(), r4.A0B()) && this.A07.equals(r4.A07)) {
                return C1901797e.A00(A0D(), r4.A0D());
            }
        }
        return false;
    }

    public AnonymousClass6X6(AnonymousClass144 r2, int i) {
        C18740tg.A06(r2);
        this.A05 = r2;
        this.A00 = i;
    }

    public static AnonymousClass6PM A00(AnonymousClass6X6 r3, UserJid userJid, Collection collection, int i, boolean z, boolean z2) {
        AnonymousClass6PM A082 = r3.A08(userJid);
        if (A082 != null) {
            A082.A01 = i;
            A082.A02 = z;
        } else {
            A082 = new AnonymousClass6PM(userJid, A02(collection), i, z);
            if (userJid instanceof PhoneUserJid) {
                Map map = r3.A08;
                A082.A00 = map.size();
                map.put(userJid, A082);
            }
            if (AnonymousClass143.A0I(userJid) && r3.A00 != 0) {
                Map map2 = r3.A07;
                A082.A00 = map2.size();
                map2.put(userJid, A082);
            }
            r3.A0A = true;
            if (z2) {
                r3.A0J();
                return A082;
            }
        }
        return A082;
    }

    public static String A01(Collection collection) {
        ArrayList A14 = C36441kJ.A14(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C90464aC.A1U(A14, it);
        }
        Collections.sort(A14);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            Iterator it2 = A14.iterator();
            while (it2.hasNext()) {
                instance.update(AnonymousClass001.A0C(it2).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("1:");
            return AnonymousClass000.A0q(C36441kJ.A13(bArr), A0u);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public static HashSet A02(Collection collection) {
        C18740tg.A0C(!collection.isEmpty());
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new AnonymousClass6B1((DeviceJid) it.next(), false, false));
        }
        return hashSet;
    }

    public C20760y7 A06() {
        HashSet A16 = C36441kJ.A16();
        A16.addAll(this.A08.keySet());
        A16.addAll(this.A07.keySet());
        return C20760y7.copyOf((Collection) A16);
    }

    public AnonymousClass6PM A08(UserJid userJid) {
        Map map;
        if (!AnonymousClass143.A0I(userJid) || this.A00 == 0) {
            map = this.A08;
        } else {
            map = this.A07;
        }
        return (AnonymousClass6PM) map.get(userJid);
    }

    public C121165sh A0A(C20760y7 r9, UserJid userJid) {
        AnonymousClass6PM A082 = A08(userJid);
        boolean z = false;
        if (A082 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GroupParticipants/refreshDevices/participant ");
            A0u.append(userJid);
            C36341k9.A1O(A0u, " doesn't exist");
            return new C121165sh(false, false, false);
        }
        ConcurrentHashMap concurrentHashMap = A082.A04;
        C20760y7 copyOf = C20760y7.copyOf((Collection) concurrentHashMap.keySet());
        C225614x it = r9.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (!copyOf.contains(deviceJid)) {
                this.A0A = true;
                AnonymousClass6B1 r2 = new AnonymousClass6B1(deviceJid, false, false);
                DeviceJid deviceJid2 = r2.A02;
                if (!concurrentHashMap.containsKey(deviceJid2)) {
                    concurrentHashMap.put(deviceJid2, r2);
                }
                z2 = true;
            }
        }
        C225614x it2 = copyOf.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!r9.contains(next)) {
                AnonymousClass6B1 r0 = (AnonymousClass6B1) concurrentHashMap.remove(next);
                if (r0 != null) {
                    z4 |= r0.A01;
                }
                z3 = true;
            }
        }
        if (z2 || z3) {
            A04(this);
            if (z3 && z4) {
                z = true;
                A03();
            }
        }
        return new C121165sh(z2, z3, z);
    }

    public ArrayList A0F() {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A0z = AnonymousClass000.A0z(this.A08);
        while (A0z.hasNext()) {
            AnonymousClass6PM r1 = (AnonymousClass6PM) A0z.next();
            if (r1.A01 != 0) {
                A0I.add(r1);
            }
        }
        return A0I;
    }

    public HashSet A0G() {
        HashSet A16 = C36441kJ.A16();
        Iterator A0y = AnonymousClass000.A0y(this.A07);
        while (A0y.hasNext()) {
            C225614x it = C20760y7.copyOf(((AnonymousClass6PM) C36351kA.A0u(A0y)).A04.values()).iterator();
            while (it.hasNext()) {
                A16.add(((AnonymousClass6B1) it.next()).A02);
            }
        }
        return A16;
    }

    public HashSet A0H() {
        HashSet A16 = C36441kJ.A16();
        Iterator A0y = AnonymousClass000.A0y(this.A08);
        while (A0y.hasNext()) {
            C225614x it = C20760y7.copyOf(((AnonymousClass6PM) C36351kA.A0u(A0y)).A04.values()).iterator();
            while (it.hasNext()) {
                A16.add(((AnonymousClass6B1) it.next()).A02);
            }
        }
        return A16;
    }

    public HashSet A0I(C19730wQ r8, boolean z) {
        Map map;
        boolean z2;
        HashSet A16 = C36441kJ.A16();
        if (z) {
            map = this.A07;
        } else {
            map = this.A08;
        }
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            C225614x it = C20760y7.copyOf(((AnonymousClass6PM) C36351kA.A0u(A0y)).A04.values()).iterator();
            while (it.hasNext()) {
                AnonymousClass6B1 r3 = (AnonymousClass6B1) it.next();
                if (!z || 3 == this.A00) {
                    z2 = r3.A01;
                } else {
                    z2 = r3.A00;
                }
                DeviceJid deviceJid = r3.A02;
                if (!r8.A0O(deviceJid) && !z2) {
                    A16.add(deviceJid);
                }
            }
        }
        return A16;
    }

    public void A0J() {
        A04(this);
        synchronized (this.A06) {
            this.A02 = A01(this.A08.keySet());
            this.A01 = A01(this.A07.keySet());
            A0E();
            A0C();
        }
    }

    public void A0K(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass6PM r1 = (AnonymousClass6PM) it.next();
                A00(this, r1.A03, C20760y7.copyOf((Collection) r1.A04.keySet()), r1.A01, r1.A02, false);
            } else {
                A0J();
                return;
            }
        }
    }

    public void A0L(Collection collection) {
        boolean z = false;
        for (Object next : collection) {
            if (this.A08.remove(next) != null || this.A07.remove(next) != null) {
                z = true;
            }
        }
        if (z) {
            A0J();
        }
    }

    public boolean A0N(C20760y7 r6, UserJid userJid) {
        AnonymousClass6PM A082 = A08(userJid);
        if (A082 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GroupParticipants/removeDevices/participant ");
            A0u.append(userJid);
            C36341k9.A1O(A0u, " doesn't exist");
            return false;
        }
        boolean z = false;
        C225614x it = r6.iterator();
        while (it.hasNext()) {
            AnonymousClass6B1 r0 = (AnonymousClass6B1) A082.A04.remove(it.next());
            if (r0 != null) {
                z |= r0.A01;
            }
        }
        if (r6.isEmpty()) {
            return z;
        }
        if (z) {
            A03();
        }
        A04(this);
        return z;
    }

    public boolean A0O(C19730wQ r4) {
        PhoneUserJid A0n = C36441kJ.A0n(r4);
        C223313w A082 = r4.A08();
        if (A0n != null && this.A08.containsKey(A0n)) {
            return true;
        }
        if (A082 == null || !this.A07.containsKey(A082)) {
            return false;
        }
        return true;
    }

    public boolean A0P(C19730wQ r4) {
        AnonymousClass6PM r0;
        PhoneUserJid A0n = C36441kJ.A0n(r4);
        if (A0n == null || (r0 = (AnonymousClass6PM) this.A08.get(A0n)) == null || r0.A01 == 0) {
            return false;
        }
        return true;
    }

    public boolean A0R(Collection collection) {
        for (Object obj : collection) {
            AnonymousClass6PM r0 = (AnonymousClass6PM) this.A08.get(obj);
            if (r0 != null) {
                C225614x it = C20760y7.copyOf(r0.A04.values()).iterator();
                while (it.hasNext()) {
                    if (((AnonymousClass6B1) it.next()).A01) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupParticipants{groupJid='");
        A0u.append(this.A05);
        A0u.append('\'');
        A0u.append(", participants=");
        C90504aG.A1N(A0u, this.A08);
        A0u.append(", participantHashV1='");
        A0u.append(A0D());
        A0u.append('\'');
        A0u.append(", lidParticipants=");
        C90504aG.A1N(A0u, this.A07);
        A0u.append(", lidParticipantHashV1='");
        A0u.append(A0B());
        A0u.append('\'');
        return AnonymousClass000.A0s(A0u);
    }
}
