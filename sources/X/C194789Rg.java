package X;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9Rg  reason: invalid class name and case insensitive filesystem */
public class C194789Rg {
    public AnonymousClass9YQ A00;
    public AnonymousClass9YQ A01 = new C22576Ap5(this);
    public final ConcurrentHashMap A02;

    public AnonymousClass9YQ A00(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        AnonymousClass9YQ r0 = (AnonymousClass9YQ) concurrentHashMap.get(cls);
        if (r0 != null) {
            return r0;
        }
        if (cls != null && (Map.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls))) {
            C22577Ap6 ap6 = new C22577Ap6(cls, this);
            concurrentHashMap.put(cls, ap6);
            return ap6;
        } else if (cls.isArray()) {
            C22564Aot aot = new C22564Aot(cls, this);
            concurrentHashMap.putIfAbsent(cls, aot);
            return aot;
        } else if (List.class.isAssignableFrom(cls)) {
            if (cls.isInterface()) {
                cls = C21900AcU.class;
            }
            C202429lo.A00(cls);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isInterface()) {
                cls = C21901AcV.class;
            }
            C202429lo.A00(cls);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            C202429lo.A00(cls);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public C194789Rg() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.A02 = concurrentHashMap;
        concurrentHashMap.put(Date.class, C22565Aou.A00);
        AnonymousClass9YQ r3 = C22578Ap7.A0C;
        concurrentHashMap.put(int[].class, r3);
        AnonymousClass9YQ r1 = C22578Ap7.A05;
        concurrentHashMap.put(Integer[].class, r1);
        concurrentHashMap.put(short[].class, r3);
        concurrentHashMap.put(Short[].class, r1);
        concurrentHashMap.put(long[].class, C22578Ap7.A0D);
        concurrentHashMap.put(Long[].class, C22578Ap7.A06);
        concurrentHashMap.put(byte[].class, C22578Ap7.A08);
        concurrentHashMap.put(Byte[].class, C22578Ap7.A01);
        concurrentHashMap.put(char[].class, C22578Ap7.A09);
        concurrentHashMap.put(Character[].class, C22578Ap7.A02);
        concurrentHashMap.put(float[].class, C22578Ap7.A0B);
        concurrentHashMap.put(Float[].class, C22578Ap7.A04);
        concurrentHashMap.put(double[].class, C22578Ap7.A0A);
        concurrentHashMap.put(Double[].class, C22578Ap7.A03);
        concurrentHashMap.put(boolean[].class, C22578Ap7.A07);
        concurrentHashMap.put(Boolean[].class, C22578Ap7.A00);
        C22575Ap4 ap4 = new C22575Ap4(this);
        this.A00 = ap4;
        concurrentHashMap.put(C23123B6e.class, ap4);
        concurrentHashMap.put(B0C.class, this.A00);
        concurrentHashMap.put(C21900AcU.class, this.A00);
        concurrentHashMap.put(C21901AcV.class, this.A00);
    }
}
