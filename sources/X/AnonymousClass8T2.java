package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8T2  reason: invalid class name */
public class AnonymousClass8T2 extends C21077A7o {
    public List A00;
    public final Integer A01;

    public AnonymousClass8T2(C21077A7o a7o, Integer num) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A00 = A0I;
        A0I.add(a7o);
        A0I.add((Object) null);
        this.A01 = num;
    }

    public boolean B1B(AnonymousClass9LX r6) {
        Integer num = this.A01;
        if (num == C023109s.A0C) {
            for (C21077A7o B1B : this.A00) {
                if (B1B.B1B(r6)) {
                }
            }
            return false;
        }
        Integer num2 = C023109s.A00;
        List<C21077A7o> list = this.A00;
        if (num != num2) {
            return !((C21077A7o) list.get(0)).B1B(r6);
        }
        for (C21077A7o B1B2 : list) {
            if (!B1B2.B1B(r6)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0q = C90484aE.A0q("(", A0u);
        A0q.append(" ");
        switch (this.A01.intValue()) {
            case 0:
                str = "&&";
                break;
            case 1:
                str = "!";
                break;
            default:
                str = "||";
                break;
        }
        A0u.append(C201749kK.A00(this.A00, AnonymousClass000.A0p(str, " ", A0q), ""));
        return C90474aD.A0f(A0u);
    }

    public AnonymousClass8T2(Integer num, Collection collection) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A00 = A0I;
        A0I.addAll(collection);
        this.A01 = num;
    }
}
