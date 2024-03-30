package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.7V2  reason: invalid class name */
public final class AnonymousClass7V2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $focusDirection;
    public final /* synthetic */ C10770fC $isCancelled;
    public final /* synthetic */ C94214hq $source;
    public final /* synthetic */ C137346fz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V2(C137346fz r2, C94214hq r3, C10770fC r4, int i) {
        super(1);
        this.$source = r3;
        this.this$0 = r2;
        this.$focusDirection = i;
        this.$isCancelled = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C137856gq r11;
        boolean z;
        AnonymousClass6XQ r0;
        C94214hq r13 = (C94214hq) obj;
        if (AnonymousClass00C.A0J(r13, this.$source)) {
            return false;
        }
        C137856gq r1 = r13.A03;
        if (r1.A08) {
            C137856gq r10 = r1.A04;
            C137846gp A02 = AnonymousClass6VZ.A02(r13);
            loop0:
            while (true) {
                r11 = null;
                z = true;
                if (A02 == null) {
                    break;
                }
                if (AnonymousClass6XQ.A00(A02, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    while (r10 != null) {
                        if ((r10.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                            C137856gq r4 = r10;
                            C1506776e r3 = null;
                            while (r4 != null) {
                                if (r4 instanceof C94214hq) {
                                    r11 = r4;
                                    break loop0;
                                }
                                if (AnonymousClass000.A1P(r4.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) && (r4 instanceof C94114hf)) {
                                    int i = 0;
                                    for (C137856gq r2 = ((C94114hf) r4).A00; r2 != null; r2 = r2.A02) {
                                        if (AnonymousClass000.A1P(r2.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
                                            i++;
                                            if (i == 1) {
                                                r4 = r2;
                                            } else {
                                                r3 = C90464aC.A0F(r3);
                                                r4 = C90524aI.A0D(r3, r4);
                                                r3.A0D(r2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                r4 = AnonymousClass6VZ.A00(r3);
                            }
                            continue;
                        }
                        r10 = r10.A04;
                    }
                }
                A02 = A02.A0A();
                if (A02 == null || (r0 = A02.A0R) == null) {
                    r10 = null;
                } else {
                    r10 = r0.A05;
                }
            }
            if (r11 != null) {
                AnonymousClass6S2 r32 = this.this$0.A05;
                int i2 = this.$focusDirection;
                C10770fC r22 = this.$isCancelled;
                try {
                    if (r32.A00) {
                        AnonymousClass6S2.A00(r32);
                    }
                    r32.A00 = true;
                    int intValue = AnonymousClass6XT.A01(r13, i2).intValue();
                    if (intValue != 2) {
                        if (intValue == 1 || intValue == 3) {
                            r22.element = true;
                        } else if (intValue == 0) {
                            z = AnonymousClass6XT.A02(r13);
                        } else {
                            throw C36441kJ.A18();
                        }
                    }
                    return Boolean.valueOf(z);
                } finally {
                    AnonymousClass6S2.A01(r32);
                }
            } else {
                throw AnonymousClass001.A09("Focus search landed at the root.");
            }
        } else {
            throw AnonymousClass001.A09("visitAncestors called on an unattached node");
        }
    }
}
