package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.4hq  reason: invalid class name and case insensitive filesystem */
public final class C94214hq extends C137856gq implements C161807nV, C161787nT, C17500rW, AnonymousClass7bY {
    public AnonymousClass5U8 A00 = AnonymousClass5U8.Inactive;
    public boolean A01;
    public boolean A02;

    public /* synthetic */ Object BAY(C114375h9 r2) {
        return C109185Wp.A00(this, r2);
    }

    public final C137356g0 A0F() {
        C137356g0 r9 = new C137356g0();
        C137856gq r8 = this.A03;
        if (r8.A08) {
            C137856gq r10 = r8;
            C137846gp A022 = AnonymousClass6VZ.A02(this);
            if (A022 != null) {
                loop0:
                while (true) {
                    if (AnonymousClass6XQ.A00(A022, 3072) != 0) {
                        while (true) {
                            if (r10 == null) {
                                break;
                            }
                            int i = r10.A01;
                            if ((i & 3072) != 0) {
                                if (r10 != r8 && (i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    break loop0;
                                } else if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                                    C137856gq r4 = r10;
                                    C1506776e r3 = null;
                                    do {
                                        if (r4 instanceof C161747nP) {
                                            ((C161747nP) r4).B1I(r9);
                                        } else if ((r4.A01 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 && (r4 instanceof C94114hf)) {
                                            int i2 = 0;
                                            for (C137856gq r2 = ((C94114hf) r4).A00; r2 != null; r2 = r2.A02) {
                                                if ((r2.A01 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
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
                            r10 = r10.A04;
                        }
                    }
                    A022 = A022.A0A();
                    if (A022 == null) {
                        break;
                    }
                    AnonymousClass6XQ r0 = A022.A0R;
                    if (r0 != null) {
                        r10 = r0.A05;
                    } else {
                        r10 = null;
                    }
                }
            }
            return r9;
        }
        throw AnonymousClass001.A09("visitAncestors called on an unattached node");
    }

    public AnonymousClass5U8 A0G() {
        C137846gp r0;
        C161327mZ r02;
        C161657nG r03;
        AnonymousClass5U8 r04;
        C94894iy r05 = this.A03.A05;
        if (r05 == null || (r0 = r05.A0G) == null || (r02 = r0.A09) == null || (r03 = ((AndroidComposeView) r02).A0R) == null || (r04 = (AnonymousClass5U8) ((C137346fz) r03).A05.A02.get(this)) == null) {
            return this.A00;
        }
        return r04;
    }

    public final void A0I() {
        C137856gq r4 = this.A03;
        C1506776e r3 = null;
        while (r4 != null) {
            if (r4 instanceof C161737nO) {
                AnonymousClass6QT.A01((C161737nO) r4);
            } else if ((r4.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && (r4 instanceof C94114hf)) {
                int i = 0;
                for (C137856gq r2 = ((C94114hf) r4).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
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
        C137856gq r1 = this.A03;
        if (r1.A08) {
            C137856gq r8 = r1.A04;
            C137846gp A022 = AnonymousClass6VZ.A02(this);
            if (A022 != null) {
                while (true) {
                    if (AnonymousClass6XQ.A00(A022, 5120) != 0) {
                        while (r8 != null) {
                            int i2 = r8.A01;
                            if ((i2 & 5120) == 0 || (1024 & i2) != 0 || !r8.A08) {
                                r8 = r8.A04;
                            } else {
                                C1506776e r42 = null;
                                C137856gq r32 = r8;
                                do {
                                    if (r32 instanceof C161737nO) {
                                        AnonymousClass6QT.A01((C161737nO) r32);
                                    } else if ((r32.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && (r32 instanceof C94114hf)) {
                                        int i3 = 0;
                                        for (C137856gq r22 = ((C94114hf) r32).A00; r22 != null; r22 = r22.A02) {
                                            if ((r22.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    r32 = r22;
                                                } else {
                                                    r42 = C90464aC.A0G(r42);
                                                    r32 = C90524aI.A0D(r42, r32);
                                                    r42.A0D(r22);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                            continue;
                                        }
                                    }
                                    r32 = AnonymousClass6VZ.A00(r42);
                                    continue;
                                } while (r32 != null);
                                r8 = r8.A04;
                            }
                        }
                    }
                    A022 = A022.A0A();
                    if (A022 != null) {
                        AnonymousClass6XQ r0 = A022.A0R;
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

    public static int A00(C94214hq r0) {
        return r0.A0G().ordinal();
    }

    public final void A0H() {
        int A002 = A00(this);
        if (A002 == 0 || A002 == 2) {
            C10810fG r1 = new C10810fG();
            C109285Wz.A00(this, new AnonymousClass7NT(this, r1));
            Object obj = r1.element;
            if (obj == null) {
                throw C36331k8.A0d("focusProperties");
            } else if (!((C158817iH) obj).B9M()) {
                ((C137346fz) ((AndroidComposeView) AnonymousClass6VZ.A03(this)).A0R).B2p(true, true);
            }
        }
    }

    public void A0J(AnonymousClass5U8 r2) {
        ((C137346fz) ((AndroidComposeView) AnonymousClass6VZ.A03(this)).A0R).A05.A02.put(this, r2);
    }

    public /* synthetic */ AnonymousClass65T BGK() {
        return C94774il.A00;
    }

    public void Bbq() {
        AnonymousClass5U8 A0G = A0G();
        A0H();
        if (A0G != A0G()) {
            AnonymousClass6QT.A02(this);
        }
    }
}
