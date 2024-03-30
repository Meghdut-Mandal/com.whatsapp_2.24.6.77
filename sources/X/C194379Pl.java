package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9Pl  reason: invalid class name and case insensitive filesystem */
public class C194379Pl {
    public final AnonymousClass9KP A00;

    public synchronized void A00(C191829Eq r7) {
        C21240yt r0;
        AnonymousClass920 r1;
        AnonymousClass9P3 r12;
        AnonymousClass9P3 r13;
        try {
            AnonymousClass9KP r5 = this.A00;
            AnonymousClass9KQ r14 = r5.A02;
            C193499Lr r2 = r5.A00;
            C16330oz r4 = r5.A01;
            if (r14.A02) {
                Iterator it = ((AnonymousClass9Tb) r14.A01.get(r2)).A00.iterator();
                while (it.hasNext()) {
                    C193599Mc r3 = (C193599Mc) it.next();
                    if (r3.A03.isInstance(r7)) {
                        C193499Lr r22 = r3.A01;
                        C193499Lr r02 = r5.A00;
                        if (!(r22 == r02 || (r13 = r02.A01) == null)) {
                            r13.A04(r4, r7, r3, 1);
                        }
                        AnonymousClass9P3 r15 = r3.A00;
                        if (r15 != null) {
                            r15.A04(r4, r7, r3, 2);
                        }
                        if (!(r22 == r5.A00 || (r12 = r22.A00) == null)) {
                            r12.A04(r4, r7, r3, 3);
                        }
                        r5.A00 = r22;
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("No valid transition from state: ");
                r1 = new AnonymousClass920(AnonymousClass000.A0q(r2.A03, A0u));
            } else {
                r1 = new AnonymousClass920("State machine map is not initialized - call build()");
            }
            throw r1;
        } catch (AnonymousClass920 e) {
            if (!(e.getCause() instanceof C21240yt)) {
                r0 = C165577te.A0V("Internal Error", C165587tf.A0m(e), (byte) 80);
            } else {
                r0 = (C21240yt) e.getCause();
            }
            throw r0;
        }
    }

    public C194379Pl(C21224ADg aDg) {
        AnonymousClass920 r1;
        AnonymousClass9KQ r3 = new AnonymousClass9KQ();
        try {
            C193499Lr[] r9 = AnonymousClass9BJ.A0B;
            int i = 0;
            int i2 = 0;
            while (true) {
                C193499Lr r4 = r9[i2];
                HashMap hashMap = r3.A01;
                if (hashMap.get(r4) != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("State already added: ");
                    r1 = new AnonymousClass920(AnonymousClass000.A0q(r4.A03, A0u));
                    break;
                }
                boolean z = false;
                if (r4.A02 == C023109s.A00) {
                    z = true;
                    if (r3.A00 != null) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Start state already exists, new state invalid: ");
                        r1 = new AnonymousClass920(AnonymousClass000.A0q(r4.A03, A0u2));
                        break;
                    }
                }
                hashMap.put(r4, new AnonymousClass9Tb());
                if (z) {
                    r3.A00 = r4;
                }
                i2++;
                if (i2 >= 12) {
                    C193599Mc[] r5 = AnonymousClass9BO.A00;
                    while (true) {
                        C193599Mc r2 = r5[i];
                        AnonymousClass9Tb r12 = (AnonymousClass9Tb) hashMap.get(r2.A02);
                        if (r12 != null) {
                            if (hashMap.get(r2.A01) == null) {
                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                A0u3.append("Cannot find output state for transition ");
                                r1 = new AnonymousClass920(AnonymousClass000.A0q(r2.A04, A0u3));
                                break;
                            }
                            r12.A00.add(r2);
                            i++;
                            if (i >= 31) {
                                if (r3.A00 != null) {
                                    Iterator A0s = C90484aE.A0s(hashMap);
                                    while (true) {
                                        if (!A0s.hasNext()) {
                                            r1 = new AnonymousClass920("State machine must have an end state");
                                            break;
                                        }
                                        Integer num = ((C193499Lr) A0s.next()).A02;
                                        Integer num2 = C023109s.A0C;
                                        if (num == num2) {
                                            HashSet A16 = C36441kJ.A16();
                                            Iterator A10 = C36371kC.A10(hashMap);
                                            while (true) {
                                                if (A10.hasNext()) {
                                                    Map.Entry A11 = AnonymousClass000.A11(A10);
                                                    if (((AnonymousClass9Tb) A11.getValue()).A00.size() == 0 && ((C193499Lr) A11.getKey()).A02 != num2) {
                                                        StringBuilder A0u4 = AnonymousClass000.A0u();
                                                        A0u4.append("Non-end state with no outbound transitions: ");
                                                        r1 = new AnonymousClass920(AnonymousClass000.A0q(((C193499Lr) A11.getKey()).A03, A0u4));
                                                        break;
                                                    }
                                                    HashSet A162 = C36441kJ.A16();
                                                    Iterator it = ((AnonymousClass9Tb) A11.getValue()).A00.iterator();
                                                    while (it.hasNext()) {
                                                        A162.add(((C193599Mc) it.next()).A01);
                                                    }
                                                    A16.addAll(A162);
                                                } else if (hashMap.size() - A16.size() > 1) {
                                                    r1 = new AnonymousClass920("Non-start state(s) with no incoming transitions exist(s)");
                                                } else if (hashMap.size() - A16.size() != 1 || !A16.contains(r3.A00)) {
                                                    r3.A02 = true;
                                                    this.A00 = new AnonymousClass9KP(aDg, r3);
                                                    return;
                                                } else {
                                                    r1 = new AnonymousClass920("Non-start state(s) with no incoming transitions exist(s)");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    r1 = new AnonymousClass920("State machine must have a start state");
                                }
                            }
                        } else {
                            StringBuilder A0u5 = AnonymousClass000.A0u();
                            A0u5.append("Cannot find input state for transition ");
                            r1 = new AnonymousClass920(AnonymousClass000.A0q(r2.A04, A0u5));
                            break;
                        }
                    }
                }
            }
            throw r1;
        } catch (AnonymousClass920 e) {
            throw C165577te.A0V("Failed to init finite state machine.", C165587tf.A0m(e), (byte) 80);
        }
    }
}
