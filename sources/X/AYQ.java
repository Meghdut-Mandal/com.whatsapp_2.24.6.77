package X;

import java.util.Map;

public abstract class AYQ implements Map.Entry {
    public abstract Object getKey();

    public abstract Object getValue();

    public abstract Object setValue(Object obj);

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C1897595l.A00(getKey(), entry.getKey()) || !C1897595l.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0H(getKey()) ^ C36411kG.A09(getValue());
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 1);
        A0i.append(valueOf);
        return AnonymousClass000.A0p("=", valueOf2, A0i);
    }
}
