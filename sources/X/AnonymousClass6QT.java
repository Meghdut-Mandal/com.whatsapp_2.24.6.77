package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.6QT  reason: invalid class name */
public abstract class AnonymousClass6QT {
    public static final AnonymousClass5U8 A00(C161737nO r11) {
        C137856gq r112 = (C137856gq) r11;
        C137856gq r4 = r112.A03;
        C1506776e r3 = null;
        while (r4 != null) {
            if (r4 instanceof C94214hq) {
                AnonymousClass5U8 A0G = ((C94214hq) r4).A0G();
                int ordinal = A0G.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    return A0G;
                }
            } else if ((r4.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (r4 instanceof C94114hf)) {
                int i = 0;
                for (C137856gq r2 = ((C94114hf) r4).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                        i++;
                        if (i == 1) {
                            r4 = r2;
                        } else {
                            r3 = C90464aC.A0G(r3);
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
        C137856gq r1 = r112.A03;
        if (r1.A08) {
            C1506776e A05 = C137856gq.A05(r1, new C137856gq[16]);
            while (true) {
                int i2 = A05.A00;
                if (i2 != 0) {
                    C137856gq A03 = C1506776e.A03(A05, i2);
                    if ((A03.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                        while (true) {
                            if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                                A03 = A03.A02;
                                if (A03 == null) {
                                    break;
                                }
                            } else {
                                C1506776e r32 = null;
                                do {
                                    if (A03 instanceof C94214hq) {
                                        AnonymousClass5U8 A0G2 = ((C94214hq) A03).A0G();
                                        int ordinal2 = A0G2.ordinal();
                                        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                                            return A0G2;
                                        }
                                    } else if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (A03 instanceof C94114hf)) {
                                        int i3 = 0;
                                        for (C137856gq r22 = ((C94114hf) A03).A00; r22 != null; r22 = r22.A02) {
                                            if ((r22.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    A03 = r22;
                                                } else {
                                                    r32 = C90464aC.A0G(r32);
                                                    A03 = C90524aI.A0D(r32, A03);
                                                    r32.A0D(r22);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                            continue;
                                        }
                                    }
                                    A03 = AnonymousClass6VZ.A00(r32);
                                    continue;
                                } while (A03 != null);
                            }
                        }
                    } else {
                        AnonymousClass6VZ.A04(A05, A03);
                    }
                } else {
                    return AnonymousClass5U8.Inactive;
                }
            }
        } else {
            throw AnonymousClass001.A09("visitChildren called on an unattached node");
        }
    }

    public static final void A02(C94214hq r13) {
        C137856gq r7 = r13.A03;
        if (r7.A08) {
            C137856gq r8 = r7;
            C137846gp A02 = AnonymousClass6VZ.A02(r13);
            if (A02 != null) {
                while (true) {
                    if (AnonymousClass6XQ.A00(A02, 5120) != 0) {
                        while (r8 != null) {
                            int i = r8.A01;
                            if ((i & 5120) != 0) {
                                if (r8 != r7 && (i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    return;
                                }
                                if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                                    C137856gq r4 = r8;
                                    C1506776e r3 = null;
                                    do {
                                        if (r4 instanceof C161737nO) {
                                            C161737nO r42 = (C161737nO) r4;
                                            r42.BYG(A00(r42));
                                        } else if ((r4.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && (r4 instanceof C94114hf)) {
                                            int i2 = 0;
                                            for (C137856gq r2 = ((C94114hf) r4).A00; r2 != null; r2 = r2.A02) {
                                                if ((r2.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        r4 = r2;
                                                    } else {
                                                        r3 = C90464aC.A0F(r3);
                                                        r4 = C90524aI.A0D(r3, r4);
                                                        r3.A0D(r2);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                                continue;
                                            }
                                        }
                                        r4 = AnonymousClass6VZ.A00(r3);
                                        continue;
                                    } while (r4 != null);
                                }
                            }
                            r8 = r8.A04;
                        }
                    }
                    A02 = A02.A0A();
                    if (A02 != null) {
                        AnonymousClass6XQ r0 = A02.A0R;
                        if (r0 != null) {
                            r8 = r0.A05;
                        } else {
                            r8 = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw AnonymousClass001.A09("visitAncestors called on an unattached node");
        }
    }

    public static final void A01(C161737nO r2) {
        C130356Kt r1 = ((C137346fz) ((AndroidComposeView) AnonymousClass6VZ.A03(r2)).A0R).A04;
        C130356Kt.A00(r1, r2, r1.A00);
    }
}
