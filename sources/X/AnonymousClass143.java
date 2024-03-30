package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.143  reason: invalid class name */
public abstract class AnonymousClass143 {
    public static boolean A0E(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 0 || type == 1 || type == 18 || type == 22 || type == 3 || type == 7 || type == 21;
    }

    public static AnonymousClass11F A00(Jid jid) {
        if (jid instanceof DeviceJid) {
            return ((DeviceJid) jid).userJid;
        }
        C222713q r0 = AnonymousClass11F.A00;
        return C222713q.A00(jid);
    }

    public static AnonymousClass147 A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        Jid A02 = Jid.Companion.A02(obj);
        if (A02 instanceof AnonymousClass147) {
            return (AnonymousClass147) A02;
        }
        throw new C19740wR(obj);
    }

    public static String A03(Jid jid) {
        if (jid == null) {
            return null;
        }
        return jid.getRawString();
    }

    public static String A04(String str) {
        Class<Jid> cls = Jid.class;
        Jid A02 = Jid.Companion.A02(str);
        if (A02 == null || !cls.isAssignableFrom(A02.getClass())) {
            return str;
        }
        return A02.toString();
    }

    public static String A05(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        int length = strArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(A04(strArr[i]));
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static ArrayList A06(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid A02 = Jid.Companion.A02((String) it.next());
                if (cls.isInstance(A02)) {
                    arrayList.add(cls.cast(A02));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList A08(String[] strArr) {
        Class<UserJid> cls = UserJid.class;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                Jid A02 = Jid.Companion.A02(str);
                if (cls.isInstance(A02)) {
                    arrayList.add(cls.cast(A02));
                }
            }
        }
        return arrayList;
    }

    public static void A0B(Class cls, Collection collection, Collection collection2) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid A02 = Jid.Companion.A02((String) it.next());
                if (cls.isInstance(A02)) {
                    collection2.add(cls.cast(A02));
                }
            }
        }
    }

    public static void A0C(Iterable iterable, Collection collection) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid jid = (Jid) it.next();
                if (jid != null) {
                    collection.add(jid.getRawString());
                }
            }
        }
    }

    public static void A0D(Iterable iterable, Collection collection) {
        Jid A02;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!(str == null || (A02 = Jid.Companion.A02(str)) == null)) {
                    collection.add(A02);
                }
            }
        }
    }

    public static boolean A0F(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 10 || type == 0 || type == 17 || type == 20 || type == 18 || type == 19) {
            return true;
        }
        return false;
    }

    public static boolean A0G(Jid jid) {
        if ((jid instanceof AnonymousClass146) || (jid instanceof AnonymousClass147)) {
            return true;
        }
        return false;
    }

    public static boolean A0H(Jid jid) {
        if ((jid instanceof AnonymousClass148) || (jid instanceof AnonymousClass14A)) {
            return true;
        }
        return false;
    }

    public static boolean A0I(Jid jid) {
        if ((jid instanceof C223313w) || (jid instanceof C177508du)) {
            return true;
        }
        return false;
    }

    public static boolean A0J(Jid jid) {
        if ((jid instanceof PhoneUserJid) || (jid instanceof C223413x)) {
            return true;
        }
        return false;
    }

    public static boolean A0K(Jid jid) {
        if ((jid instanceof C177648e8) || (jid instanceof C223613z)) {
            return true;
        }
        return false;
    }

    public static AnonymousClass11F A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r1 = (AnonymousClass11F) it.next();
            if (r1 instanceof C177528dw) {
                return r1;
            }
        }
        return null;
    }

    public static ArrayList A07(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        A0C(collection, arrayList);
        return arrayList;
    }

    public static Set A09(C19700wN r2, Set set) {
        HashSet hashSet = new HashSet(set.size());
        A0A(r2, set, hashSet);
        return hashSet;
    }

    public static void A0A(C19700wN r4, Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid == null) {
                r4.A0E("Jids/deviceJidsToUserJids/null-jid", (String) null, true);
            } else {
                collection.add(deviceJid.userJid);
            }
        }
    }

    public static boolean A0L(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof C28981Uw) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0M(Collection collection) {
        for (Object obj : collection) {
            if (!(obj instanceof C177528dw)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0N(Collection collection) {
        if (A01(collection) != null) {
            return true;
        }
        return false;
    }

    public static String[] A0O(Collection collection) {
        return (String[]) A07(collection).toArray(new String[0]);
    }
}
