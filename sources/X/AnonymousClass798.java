package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.798  reason: invalid class name */
public final class AnonymousClass798 extends HashMap<UserJid, Integer> {
    public static List A00;

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof UserJid)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof UserJid)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof UserJid)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof UserJid)) {
            return null;
        }
        return super.remove(obj);
    }

    static {
        C90474aD.A0u();
    }

    public /* bridge */ Integer A00(UserJid userJid) {
        return (Integer) super.get(userJid);
    }

    public /* bridge */ boolean A01(UserJid userJid) {
        return super.containsKey(userJid);
    }

    public void clear() {
        super.clear();
        C90474aD.A0u();
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof UserJid) || !(obj2 instanceof Integer)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
