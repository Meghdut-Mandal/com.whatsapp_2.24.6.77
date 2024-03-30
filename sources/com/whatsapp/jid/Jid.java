package com.whatsapp.jid;

import X.AnonymousClass00C;
import X.C1901797e;
import X.C222513o;
import X.C222613p;
import android.os.Parcelable;
import java.util.Arrays;

public abstract class Jid implements Comparable, Parcelable {
    public static final C222513o Companion = new C222513o();
    public static final C222613p JID_FACTORY = C222613p.A01();
    public final String user;

    public Jid(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.user = str;
    }

    public int compareTo(Jid jid) {
        AnonymousClass00C.A0D(jid, 0);
        return getRawString().compareTo(jid.getRawString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jid)) {
            return false;
        }
        Jid jid = (Jid) obj;
        return C1901797e.A00(this.user, jid.user) && AnonymousClass00C.A0J(getServer(), jid.getServer()) && getType() == jid.getType();
    }

    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public abstract String getServer();

    public abstract int getType();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.user, getServer(), Integer.valueOf(getType())});
    }

    public String getRawString() {
        return C222513o.A01(this.user, getServer());
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public final boolean isProtocolCompliant() {
        int type = getType();
        if (type == 2 || type == 9 || type == 11 || type == 8) {
            return false;
        }
        return true;
    }

    public String toString() {
        return getObfuscatedString();
    }
}
