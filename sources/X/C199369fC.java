package X;

/* renamed from: X.9fC  reason: invalid class name and case insensitive filesystem */
public class C199369fC {
    public static final C199369fC A02 = new C199369fC(C188248zH.xMidYMid, C023109s.A00);
    public static final C199369fC A03 = new C199369fC(C188248zH.none, (Integer) null);
    public C188248zH A00;
    public Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C199369fC r5 = (C199369fC) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C199369fC(C188248zH r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        C36421kH.A1N(A0u);
        Integer num = this.A01;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "meet";
        } else {
            str = "slice";
        }
        return AnonymousClass000.A0q(str, A0u);
    }
}
