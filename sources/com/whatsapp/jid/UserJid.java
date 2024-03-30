package com.whatsapp.jid;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass14B;
import X.C222613p;
import X.C222813r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class UserJid extends AnonymousClass11F implements Cloneable {
    public static final C222813r Companion = new C222813r();
    public static final C222613p JID_FACTORY = C222613p.A01();

    public static final UserJid of(Jid jid) {
        return C222813r.A00(jid);
    }

    public static final List userJidsFromChatJids(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid A00 = C222813r.A00((Jid) it.next());
            if (A00 != null) {
                arrayList.add(A00);
            }
        }
        return arrayList;
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass14B.A0B(this.user, 4));
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public DeviceJid getPrimaryDevice() {
        return DeviceJid.Companion.A01(this, 0);
    }

    public Object clone() {
        return super.clone();
    }

    public UserJid(String str) {
        super(str);
    }
}
