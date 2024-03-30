package X;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.0Wn  reason: invalid class name and case insensitive filesystem */
public final class C07150Wn {
    public static final C07150Wn A02 = new C07150Wn();
    public final C15990oN A00 = new C10640ed();
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    public final C17320r6 A00(Class cls) {
        AnonymousClass0QU r9;
        AnonymousClass0X1 r6;
        AnonymousClass0QW r10;
        AnonymousClass0QS r5;
        AnonymousClass0QT r7;
        AnonymousClass0QW r2;
        AnonymousClass0QS r1;
        Class cls2;
        Charset charset = AnonymousClass0WB.A00;
        Objects.requireNonNull(cls, "messageType");
        ConcurrentMap concurrentMap = this.A01;
        C17320r6 r52 = (C17320r6) concurrentMap.get(cls);
        if (r52 == null) {
            C10640ed r12 = (C10640ed) this.A00;
            Class cls3 = C07450Xs.A03;
            Class<AnonymousClass0M8> cls4 = AnonymousClass0M8.class;
            if (cls4.isAssignableFrom(cls) || (cls2 = C07450Xs.A03) == null || cls2.isAssignableFrom(cls)) {
                C15980oM ByQ = r12.A00.ByQ(cls);
                C10570eV r62 = (C10570eV) ByQ;
                int i = r62.A00;
                if ((i & 2) == 2) {
                    if (cls4.isAssignableFrom(cls)) {
                        r2 = C07450Xs.A02;
                        r1 = AnonymousClass0Rl.A00;
                    } else {
                        r2 = C07450Xs.A00;
                        r1 = AnonymousClass0Rl.A01;
                        if (r1 == null) {
                            throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    r52 = new C10620eb(r1, r62.A01, r2);
                } else {
                    boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                    boolean A1S = AnonymousClass000.A1S(i & 1, 1);
                    if (isAssignableFrom) {
                        r9 = C05900Rn.A01;
                        r6 = AnonymousClass0X1.A01;
                        r10 = C07450Xs.A02;
                        if (A1S) {
                            r5 = AnonymousClass0Rl.A00;
                            r7 = C05890Rm.A01;
                        } else {
                            r5 = null;
                            r7 = C05890Rm.A01;
                        }
                    } else {
                        r9 = C05900Rn.A00;
                        r6 = AnonymousClass0X1.A00;
                        if (A1S) {
                            r10 = C07450Xs.A00;
                            r5 = AnonymousClass0Rl.A01;
                            if (r5 != null) {
                                r7 = C05890Rm.A00;
                            } else {
                                throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            r10 = C07450Xs.A01;
                            r5 = null;
                            r7 = C05890Rm.A00;
                        }
                    }
                    r52 = C10630ec.A0D(r5, r6, r7, ByQ, r9, r10);
                }
                Objects.requireNonNull(cls, "messageType");
                Objects.requireNonNull(r52, "schema");
                C17320r6 r0 = (C17320r6) concurrentMap.putIfAbsent(cls, r52);
                if (r0 != null) {
                    return r0;
                }
            } else {
                throw AnonymousClass001.A08("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        return r52;
    }
}
