package X;

import java.util.List;

public class AUW implements Cloneable {
    public C1686981p A00;
    public AUX A01;
    public AUX A02;
    public Boolean A03;
    public Float A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public String A0B;
    public AUX[] A0C;
    public long A0D = 0;
    public AnonymousClass9L5 A0E;
    public AUX A0F;
    public AUT A0G;
    public AUT A0H;
    public AUT A0I;
    public AUT A0J;
    public AUT A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Float A0N;
    public Float A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Float A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public String A0a;
    public String A0b;
    public List A0c;

    public static AUW A00() {
        AUW auw = new AUW();
        auw.A0D = -1;
        C1686981p r6 = C1686981p.A01;
        auw.A0G = r6;
        Integer num = C023109s.A00;
        auw.A0U = num;
        Float valueOf = Float.valueOf(1.0f);
        auw.A0N = valueOf;
        auw.A0J = null;
        auw.A0R = valueOf;
        auw.A02 = new AUX(1.0f);
        auw.A06 = num;
        auw.A07 = num;
        auw.A04 = Float.valueOf(4.0f);
        auw.A0C = null;
        auw.A01 = new AUX(0.0f);
        auw.A0O = valueOf;
        auw.A00 = r6;
        auw.A0c = null;
        auw.A0F = new AUX(C023109s.A0V, 12.0f);
        auw.A0W = 400;
        auw.A0V = num;
        auw.A08 = num;
        auw.A05 = num;
        auw.A0Y = num;
        auw.A0M = C36371kC.A0m();
        auw.A0E = null;
        auw.A0B = null;
        auw.A0A = null;
        auw.A09 = null;
        Boolean bool = Boolean.TRUE;
        auw.A0L = bool;
        auw.A03 = bool;
        auw.A0I = r6;
        auw.A0Q = valueOf;
        auw.A0a = null;
        auw.A0T = num;
        auw.A0b = null;
        auw.A0H = null;
        auw.A0P = valueOf;
        auw.A0K = null;
        auw.A0S = valueOf;
        auw.A0Z = num;
        auw.A0X = num;
        return auw;
    }

    public Object clone() {
        AUW auw = (AUW) super.clone();
        AUX[] auxArr = this.A0C;
        if (auxArr != null) {
            auw.A0C = (AUX[]) auxArr.clone();
        }
        return auw;
    }
}
