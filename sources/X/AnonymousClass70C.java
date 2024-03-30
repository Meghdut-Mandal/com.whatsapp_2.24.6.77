package X;

import java.util.Map;

/* renamed from: X.70C  reason: invalid class name */
public class AnonymousClass70C implements C16360p7 {
    public final String A00;
    public final String A01;
    public final Map A02;

    public AnonymousClass70C(String str, String str2, Map map) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("QplEventCallback{instanceKey='");
        char A002 = C90484aE.A00(this.A01, A0u);
        A0u.append(", eventType='");
        A0u.append(this.A00);
        A0u.append(A002);
        A0u.append(", params=");
        return C90464aC.A0X(this.A02, A0u);
    }
}
