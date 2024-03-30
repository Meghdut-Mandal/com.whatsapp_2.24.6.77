package X;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.5ZN  reason: invalid class name */
public abstract class AnonymousClass5ZN {
    public static Object A00(AnonymousClass6MO r13, C160377ku r14, C124125xd r15) {
        String message;
        boolean z;
        AnonymousClass6YX r7;
        C115225iX r1;
        C142236oY r3 = r15.A05;
        if (AnonymousClass6RN.A00.A03()) {
            AnonymousClass6RN.A00("Parse script");
        }
        try {
            r14.B6g(r15.A00);
            if (AnonymousClass6RN.A00.A03()) {
                AnonymousClass68E.A00();
            }
            C142246oZ BwQ = r14.BwQ();
            r3.BSB(r13, r14, r14.BH1());
            try {
                List<Object> unmodifiableList = Collections.unmodifiableList(r13.A00);
                ThreadLocal threadLocal = C113065ew.A00;
                if (threadLocal.get() == null) {
                    z = true;
                    r7 = new AnonymousClass6YX();
                    threadLocal.set(r7);
                } else {
                    z = false;
                    r7 = (AnonymousClass6YX) threadLocal.get();
                }
                try {
                    C115225iX r8 = new C115225iX(r15);
                    int i = r7.A01;
                    AnonymousClass6YX.A0L(r7, unmodifiableList.size() + 1 + 5);
                    AnonymousClass6YX.A0M(r7, (Object) null);
                    for (Object A0M : unmodifiableList) {
                        AnonymousClass6YX.A0M(r7, A0M);
                    }
                    AnonymousClass6YX.A0N(r7, new AnonymousClass6JJ(BwQ), (Object) null, unmodifiableList.size(), r7.A02);
                    r1 = r7.A03;
                    Objects.requireNonNull(r8);
                    r7.A03 = r8;
                    AnonymousClass6YX.A0J(r7);
                    r7.A03 = r1;
                    Object A09 = AnonymousClass6YX.A09(r7);
                    AnonymousClass6YX.A0K(r7);
                    int i2 = r7.A01;
                    if (i2 != i) {
                        Object[] A0M2 = AnonymousClass001.A0M();
                        C36331k8.A1X(A0M2, i2, 0, i, 1);
                        AnonymousClass6YX.A0P(String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", A0M2));
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    if (z) {
                        threadLocal.remove();
                    }
                    r3.BQz(r13, r14, A09, r14.BH1());
                    return A09;
                } catch (AnonymousClass78W e) {
                    throw e;
                } catch (RuntimeException e2) {
                    try {
                        throw new AnonymousClass78W((Throwable) e2);
                    } catch (AnonymousClass78W e3) {
                        if (z) {
                            try {
                                throw new AnonymousClass5VI(e3);
                            } catch (Throwable th) {
                                if (z) {
                                    threadLocal.remove();
                                }
                                throw th;
                            }
                        } else {
                            throw e3;
                        }
                    }
                } catch (Throwable th2) {
                    r7.A03 = r1;
                    throw th2;
                }
            } catch (AnonymousClass5VI e4) {
                th = new AnonymousClass5VI(r14.BHl(), e4);
                if (th.getMessage() == null) {
                    message = "";
                } else {
                    message = th.getMessage();
                }
                r3.Bft(r14, message);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (AnonymousClass6RN.A00.A03()) {
                AnonymousClass68E.A00();
                throw th;
            }
            throw th;
        }
    }
}
