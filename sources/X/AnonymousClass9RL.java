package X;

/* renamed from: X.9RL  reason: invalid class name */
public class AnonymousClass9RL {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public AnonymousClass9RL(Integer num, Integer num2, Integer num3) {
        this.A00 = num;
        this.A02 = num2;
        this.A01 = num3;
    }

    public String toString() {
        String obj;
        StringBuilder A0p = C90484aE.A0p();
        Integer num = this.A00;
        String str = "";
        if (num == null) {
            obj = str;
        } else {
            obj = num.toString();
        }
        A0p.append(obj);
        A0p.append(":");
        Integer num2 = this.A02;
        if (num2 != null) {
            str = num2.toString();
        }
        return C165567td.A0Y(str, A0p);
    }
}
