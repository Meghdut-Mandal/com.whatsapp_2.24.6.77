package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9jJ  reason: invalid class name and case insensitive filesystem */
public class C201309jJ {
    public static final B0G A02 = new AnonymousClass9ZQ(5);
    public static final B0G A03 = new AnonymousClass9ZQ(4);
    public static final B0G A04 = new AnonymousClass9ZQ(2);
    public static final B0G A05 = new AnonymousClass9ZQ(3);
    public static final B0G A06 = new AnonymousClass9ZQ(6);
    public static final B0G A07 = new AnonymousClass9ZQ(1);
    public static final B0G A08 = new AnonymousClass9ZQ(0);
    public static final B0G A09 = new AZJ();
    public static final B0G A0A = new AZK();
    public static final B0G A0B = new AnonymousClass9ZQ(7);
    public LinkedList A00 = C90524aI.A0l();
    public ConcurrentHashMap A01 = C90524aI.A0s();

    public void A01(B0G b0g, Class... clsArr) {
        for (Class put : clsArr) {
            this.A01.put(put, b0g);
        }
    }

    public void A00(Class cls, B0G b0g) {
        this.A00.addLast(new C192699If(cls, b0g));
    }

    public C201309jJ() {
        A01(new AnonymousClass9ZY(this, 9), String.class);
        A01(new AnonymousClass9ZY(this, 0), Double.class);
        A01(new AnonymousClass9ZY(this, 1), Date.class);
        A01(new AnonymousClass9ZY(this, 2), Float.class);
        B0G b0g = A0B;
        A01(b0g, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        A01(b0g, Boolean.class);
        A01(new AnonymousClass9ZY(this, 3), int[].class);
        A01(new AnonymousClass9ZY(this, 4), short[].class);
        A01(new AnonymousClass9ZY(this, 5), long[].class);
        A01(new AnonymousClass9ZY(this, 6), float[].class);
        A01(new AnonymousClass9ZY(this, 7), double[].class);
        A01(new AnonymousClass9ZY(this, 8), boolean[].class);
        A00(C23124B6f.class, A07);
        A00(B0D.class, A08);
        A00(C23123B6e.class, A04);
        A00(B0C.class, A05);
        A00(Map.class, A06);
        A00(Iterable.class, A03);
        A00(Enum.class, A02);
        A00(Number.class, b0g);
    }
}
