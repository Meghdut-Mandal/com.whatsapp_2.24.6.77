package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.6U1  reason: invalid class name */
public abstract class AnonymousClass6U1 {
    public static final C94214hq A01(C94214hq r9) {
        C94214hq r4;
        int A00;
        C137856gq r1 = r9.A03;
        if (!r1.A08) {
            return null;
        }
        C1506776e A05 = C137856gq.A05(r1, new C137856gq[16]);
        loop0:
        while (true) {
            int i = A05.A00;
            if (i != 0) {
                C137856gq A03 = C1506776e.A03(A05, i);
                if ((A03.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    while (true) {
                        if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                            A03 = A03.A02;
                            if (A03 == null) {
                                break;
                            }
                        } else {
                            C1506776e r3 = null;
                            do {
                                if (A03 instanceof C94214hq) {
                                    r4 = (C94214hq) A03;
                                    if (r4.A03.A08 && ((A00 = C94214hq.A00(r4)) == 0 || A00 == 1 || A00 == 2)) {
                                        return r4;
                                    }
                                } else if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (A03 instanceof C94114hf)) {
                                    int i2 = 0;
                                    for (C137856gq r2 = ((C94114hf) A03).A00; r2 != null; r2 = r2.A02) {
                                        if ((r2.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                A03 = r2;
                                            } else {
                                                r3 = C90464aC.A0G(r3);
                                                A03 = C90524aI.A0D(r3, A03);
                                                r3.A0D(r2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                        continue;
                                    }
                                }
                                A03 = AnonymousClass6VZ.A00(r3);
                                continue;
                            } while (A03 != null);
                        }
                    }
                } else {
                    AnonymousClass6VZ.A04(A05, A03);
                }
            } else {
                return null;
            }
        }
        return r4;
    }

    public static final AnonymousClass6QC A02(C94214hq r2) {
        C94894iy r22 = r2.A05;
        if (r22 != null) {
            return C109155Wm.A00(r22).BOQ(r22, false);
        }
        return AnonymousClass6QC.A04;
    }

    public static final boolean A03(C94214hq r2) {
        C137846gp r1;
        C94894iy r0 = r2.A05;
        if (r0 == null || (r1 = r0.A0G) == null || !r1.A0P.A0G.A0C || r1.A09 == null) {
            return false;
        }
        return true;
    }

    public static final C94214hq A00(C94214hq r9) {
        int A00 = C94214hq.A00(r9);
        if (A00 != 0) {
            if (A00 == 1) {
                C137856gq r1 = r9.A03;
                if (r1.A08) {
                    C1506776e A05 = C137856gq.A05(r1, new C137856gq[16]);
                    loop3:
                    while (true) {
                        int i = A05.A00;
                        if (i != 0) {
                            C137856gq A03 = C1506776e.A03(A05, i);
                            if ((A03.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                while (true) {
                                    if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                                        A03 = A03.A02;
                                        if (A03 == null) {
                                            break;
                                        }
                                    } else {
                                        C1506776e r7 = null;
                                        do {
                                            if (A03 instanceof C94214hq) {
                                                r9 = A00((C94214hq) A03);
                                                if (r9 != null) {
                                                    break loop3;
                                                }
                                            } else if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (A03 instanceof C94114hf)) {
                                                int i2 = 0;
                                                for (C137856gq r5 = ((C94114hf) A03).A00; r5 != null; r5 = r5.A02) {
                                                    if ((r5.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            A03 = r5;
                                                        } else {
                                                            r7 = C90464aC.A0G(r7);
                                                            A03 = C90524aI.A0D(r7, A03);
                                                            r7.A0D(r5);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                    continue;
                                                }
                                            }
                                            A03 = AnonymousClass6VZ.A00(r7);
                                            continue;
                                        } while (A03 != null);
                                    }
                                }
                            } else {
                                AnonymousClass6VZ.A04(A05, A03);
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    throw AnonymousClass001.A09("visitChildren called on an unattached node");
                }
            } else if (A00 != 2) {
                if (A00 == 3) {
                    return null;
                }
                throw C36441kJ.A18();
            }
        }
        return r9;
    }
}
