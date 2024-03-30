package X;

import java.util.Map;

/* renamed from: X.8eR  reason: invalid class name and case insensitive filesystem */
public class C177828eR extends C201579ju {
    public static final Map A01 = new AnonymousClass9ZP(3);
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177828eR(C19700wN r19, C19970wo r20, AnonymousClass11g r21, C20810yC r22, C21010yW r23, AnonymousClass19L r24, Integer num, Integer num2, String str, String str2, long j, long j2) {
        super(r19, r20, r21, r22, r23, r24, num, num2, str, 3, j, j2);
        int i;
        Map map = A01;
        String str3 = str2;
        if (map.containsKey(str3)) {
            Object obj = map.get(str3);
            C18740tg.A06(obj);
            i = AnonymousClass000.A0I(obj);
        } else {
            i = 18;
        }
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoggableCallStanza");
        A0u.append("(");
        A0u.append(super.toString());
        A0u.append("; type=");
        A0u.append(this.A00);
        return C90474aD.A0f(A0u);
    }
}
