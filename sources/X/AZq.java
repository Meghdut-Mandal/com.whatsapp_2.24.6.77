package X;

import java.math.BigInteger;

public class AZq implements C16590pl {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public AnonymousClass9Tz A03;

    public AZq(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AnonymousClass9Tz r4) {
        this.A00 = bigInteger3;
        this.A01 = bigInteger;
        this.A02 = bigInteger2;
        this.A03 = r4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AZq)) {
            return false;
        }
        AZq aZq = (AZq) obj;
        if (!aZq.A01.equals(this.A01) || !aZq.A02.equals(this.A02) || !aZq.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() ^ this.A02.hashCode()) ^ this.A00.hashCode();
    }
}
