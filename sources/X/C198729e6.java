package X;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.9e6  reason: invalid class name and case insensitive filesystem */
public final class C198729e6 {
    public static final C198729e6 A02 = new C198729e6();
    public final C22809AwK A00 = new A43();
    public final ConcurrentMap A01 = C90524aI.A0s();

    public final B3T A00(Class cls) {
        C22808AwJ awJ;
        C199249ey r6;
        AnonymousClass95U r10;
        AnonymousClass95S r5;
        C22806AwH awH;
        AnonymousClass95U r2;
        AnonymousClass95S r1;
        Class cls2;
        Charset charset = C197089b7.A00;
        Objects.requireNonNull(cls, "messageType");
        ConcurrentMap concurrentMap = this.A01;
        B3T b3t = (B3T) concurrentMap.get(cls);
        if (b3t == null) {
            A43 a43 = (A43) this.A00;
            Class cls3 = C203829ow.A03;
            Class<AnonymousClass8EX> cls4 = AnonymousClass8EX.class;
            if (cls4.isAssignableFrom(cls) || (cls2 = C203829ow.A03) == null || cls2.isAssignableFrom(cls)) {
                C22807AwI ByT = a43.A00.ByT(cls);
                C21031A3u a3u = (C21031A3u) ByT;
                int i = a3u.A00;
                if ((i & 2) == 2) {
                    if (cls4.isAssignableFrom(cls)) {
                        r2 = C203829ow.A02;
                        r1 = AnonymousClass9AX.A00;
                    } else {
                        r2 = C203829ow.A00;
                        r1 = AnonymousClass9AX.A01;
                        if (r1 == null) {
                            throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    b3t = new A41(r1, a3u.A01, r2);
                } else {
                    boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                    boolean A1S = AnonymousClass000.A1S(i & 1, 1);
                    if (isAssignableFrom) {
                        awJ = C190719Aa.A01;
                        r6 = C199249ey.A01;
                        r10 = C203829ow.A02;
                        if (A1S) {
                            r5 = AnonymousClass9AX.A00;
                            awH = AnonymousClass9AZ.A01;
                        } else {
                            r5 = null;
                            awH = AnonymousClass9AZ.A01;
                        }
                    } else {
                        awJ = C190719Aa.A00;
                        r6 = C199249ey.A00;
                        if (A1S) {
                            r10 = C203829ow.A00;
                            r5 = AnonymousClass9AX.A01;
                            if (r5 != null) {
                                awH = AnonymousClass9AZ.A00;
                            } else {
                                throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            r10 = C203829ow.A01;
                            r5 = null;
                            awH = AnonymousClass9AZ.A00;
                        }
                    }
                    b3t = A42.A0G(r5, r6, awH, ByT, awJ, r10);
                }
                Objects.requireNonNull(cls, "messageType");
                Objects.requireNonNull(b3t, "schema");
                B3T b3t2 = (B3T) concurrentMap.putIfAbsent(cls, b3t);
                if (b3t2 != null) {
                    return b3t2;
                }
            } else {
                throw AnonymousClass001.A08("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        return b3t;
    }
}
