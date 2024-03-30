package X;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Fi  reason: invalid class name and case insensitive filesystem */
public abstract class C129136Fi {
    public C005102h A07() {
        if (this instanceof Recomposer) {
            return ((Recomposer) this).A0J;
        }
        return ((C93534gi) this).A07.A0V.A07();
    }

    public void A08(C161477my r5) {
        AnonymousClass0AP r1;
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A0C) {
                List list = recomposer.A0E;
                if (!list.contains(r5)) {
                    list.add(r5);
                    r1 = Recomposer.A01(recomposer);
                } else {
                    r1 = null;
                }
            }
            if (r1 != null) {
                r1.resumeWith(AnonymousClass0AJ.A00);
                return;
            }
            return;
        }
        C136916fF r0 = ((C93534gi) this).A07;
        C129136Fi r12 = r0.A0V;
        r12.A08(r0.A0W);
        r12.A08(r5);
    }

    public void A09(C161477my r4) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A0C) {
                Set set = recomposer.A04;
                if (set == null) {
                    set = C36441kJ.A17();
                    recomposer.A04 = set;
                }
                set.add(r4);
            }
            return;
        }
        ((C93534gi) this).A07.A0V.A09(r4);
    }

    public void A0A(C161477my r4) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A0C) {
                recomposer.A0D.remove(r4);
                recomposer.A03 = null;
                recomposer.A0E.remove(r4);
                recomposer.A0G.remove(r4);
            }
            return;
        }
        ((C93534gi) this).A07.A0V.A0A(r4);
    }

    public void A0B(C161477my r12, C009003v r13) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            C136986fP r2 = (C136986fP) r12;
            C136916fF r9 = r2.A05;
            boolean z = r9.A0M;
            try {
                C93904hK A00 = AnonymousClass6VV.A00(new AnonymousClass7R9(r12), new C154767Tl(r12, (C1506876f) null));
                try {
                    Snapshot A06 = A00.A06();
                    try {
                        synchronized (r2.A0C) {
                            C136986fP.A04(r2);
                            C132146Si r4 = r2.A00;
                            r2.A00 = new C132146Si(16);
                            try {
                                if (r9.A0F.A00.A02 == 0) {
                                    C136916fF.A0J(r9, r4, r13);
                                } else {
                                    throw AnonymousClass6XJ.A01("Expected applyChanges() to have been called");
                                }
                            } catch (Exception e) {
                                r2.A00 = r4;
                                throw e;
                            }
                        }
                        C1269066c.A00(A06);
                        Recomposer.A03(A00);
                        if (!z) {
                            AnonymousClass6YQ.A00().A0E();
                        }
                        Object obj = recomposer.A0C;
                        synchronized (obj) {
                            if (C108185Sm.A00(recomposer) > 0 && !Recomposer.A00(recomposer).contains(r12)) {
                                recomposer.A0D.add(r12);
                                recomposer.A03 = null;
                            }
                        }
                        synchronized (obj) {
                            try {
                                List list = recomposer.A0F;
                                if (0 < list.size()) {
                                    list.get(0);
                                    throw AnonymousClass001.A0A("getComposition$runtime_release");
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            r12.B1G();
                            r12.B1J();
                            if (!z) {
                                AnonymousClass6YQ.A00().A0E();
                            }
                        } catch (Exception e2) {
                            Recomposer.A02((C161477my) null, recomposer, e2);
                        }
                    } catch (Throwable th2) {
                        try {
                            C136986fP.A02(r2);
                            throw th2;
                        } catch (Exception e3) {
                            try {
                                C136986fP.A03(r2);
                                throw e3;
                            } catch (Throwable th3) {
                                C1269066c.A00(A06);
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Recomposer.A03(A00);
                    throw th;
                }
            } catch (Exception e4) {
                Recomposer.A02(r12, recomposer, e4);
            }
        } else {
            ((C93534gi) this).A07.A0V.A0B(r12, r13);
        }
    }
}
