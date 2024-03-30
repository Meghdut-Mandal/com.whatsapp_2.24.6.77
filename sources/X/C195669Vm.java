package X;

import java.util.Map;

/* renamed from: X.9Vm  reason: invalid class name and case insensitive filesystem */
public final class C195669Vm {
    public final String A00;
    public final Map A01;

    public C195669Vm(String str, Map map) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195669Vm) {
                C195669Vm r5 = (C195669Vm) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + AnonymousClass000.A0H(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FcsJitPrefetchNextScreenData(appId=");
        A0u.append(this.A00);
        A0u.append(", bloksServerParams=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
