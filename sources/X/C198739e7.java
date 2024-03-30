package X;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.9e7  reason: invalid class name and case insensitive filesystem */
public final class C198739e7 {
    public static final C198739e7 A02 = new C198739e7();
    public final ConcurrentMap A00 = C90524aI.A0s();
    public final C197399be A01 = new C197399be();

    public C23073B3d A00(Class cls) {
        Integer num;
        C1898195s r8;
        C199639ff r6;
        AnonymousClass9TG r10;
        C1897995q r5;
        C200369hI r7;
        AnonymousClass9TG r2;
        C1897995q r1;
        Class cls2;
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(cls, "messageType");
        ConcurrentMap concurrentMap = this.A00;
        C23073B3d b3d = (C23073B3d) concurrentMap.get(cls);
        if (b3d == null) {
            C197399be r12 = this.A01;
            AnonymousClass9TG r0 = C203849oy.A02;
            Class<C170918Hz> cls3 = C170918Hz.class;
            if (cls3.isAssignableFrom(cls) || (cls2 = C203849oy.A03) == null || cls2.isAssignableFrom(cls)) {
                AnonymousClass9LW BPr = r12.A00.BPr(cls);
                int i = BPr.A00;
                if ((i & 2) == 2) {
                    if (cls3.isAssignableFrom(cls)) {
                        r2 = C203849oy.A02;
                        r1 = C190739Ac.A01;
                    } else {
                        r2 = C203849oy.A00;
                        r1 = C190739Ac.A00;
                        if (r1 == null) {
                            throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    b3d = new C21073A7k(r1, BPr.A01, r2);
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    if ((i & 1) == 1) {
                        num = C023109s.A00;
                    } else {
                        num = C023109s.A01;
                    }
                    boolean A1a = C36361kB.A1a(num, C023109s.A00);
                    if (isAssignableFrom) {
                        r8 = C190759Ae.A01;
                        r6 = C199639ff.A01;
                        r10 = C203849oy.A02;
                        if (A1a) {
                            r5 = C190739Ac.A01;
                            r7 = C190749Ad.A01;
                        } else {
                            r5 = null;
                            r7 = C190749Ad.A01;
                        }
                    } else {
                        r8 = C190759Ae.A00;
                        r6 = C199639ff.A00;
                        if (A1a) {
                            r10 = C203849oy.A00;
                            r5 = C190739Ac.A00;
                            if (r5 != null) {
                                r7 = C190749Ad.A00;
                            } else {
                                throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            r10 = C203849oy.A01;
                            r5 = null;
                            r7 = C190749Ad.A00;
                        }
                    }
                    b3d = C21074A7l.A0M(r5, r6, r7, r8, BPr, r10);
                }
                Objects.requireNonNull(cls, "messageType");
                Objects.requireNonNull(b3d, "schema");
                C23073B3d b3d2 = (C23073B3d) concurrentMap.putIfAbsent(cls, b3d);
                if (b3d2 != null) {
                    return b3d2;
                }
            } else {
                throw AnonymousClass001.A08("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
        }
        return b3d;
    }
}
