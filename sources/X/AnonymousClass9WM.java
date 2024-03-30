package X;

import java.io.InputStream;

/* renamed from: X.9WM  reason: invalid class name */
public class AnonymousClass9WM {
    public final InputStream A00;
    public final int A01;
    public final byte[][] A02 = new byte[11][];

    public AnonymousClass9WM(InputStream inputStream, int i) {
        this.A00 = inputStream;
        this.A01 = i;
    }

    public C202169lB A01() {
        C219411z A002 = A00();
        if (A002 == null) {
            return new C202169lB(0);
        }
        C202169lB r1 = new C202169lB();
        do {
            r1.A06(A002 instanceof B0J ? ((B0J) A002).BDb() : A002.Bve());
            A002 = A00();
        } while (A002 != null);
        return r1;
    }

    public C22658AsO A02(int i, boolean z) {
        C219411z ase;
        C22673Asd asd;
        if (!z) {
            ase = new C22644AsA(((C22688Ass) this.A00).A02());
        } else {
            C202169lB A012 = A01();
            boolean z2 = this.A00 instanceof C22687Asr;
            int i2 = A012.A00;
            if (z2) {
                if (i2 == 1) {
                    return new C22679Asj(A012.A05(0), i, true);
                }
                if (i2 < 1) {
                    asd = C190809Aj.A01;
                } else {
                    asd = new C22673Asd(A012);
                }
                return new C22679Asj(asd, i, false);
            } else if (i2 == 1) {
                return new C22680Ask(A012.A05(0), i, true);
            } else {
                if (i2 < 1) {
                    ase = C190819Ak.A00;
                } else {
                    ase = new C22674Ase(A012);
                }
            }
        }
        return new C22680Ask(ase, i, false);
    }

    public C219411z A00() {
        InputStream inputStream = this.A00;
        int read = inputStream.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        if (inputStream instanceof C22687Asr) {
            C22687Asr asr = (C22687Asr) inputStream;
            asr.A00 = false;
            C22687Asr.A00(asr);
        }
        int A002 = C187118xI.A00(inputStream, read);
        boolean A1P = AnonymousClass000.A1P(read & 32);
        int i = this.A01;
        if (A002 == 4 || A002 == 16 || A002 == 17 || A002 == 8) {
            z = true;
        }
        int A012 = C187118xI.A01(inputStream, i, z);
        if (A012 >= 0) {
            C22688Ass ass = new C22688Ass(inputStream, A012, i);
            if ((read & 64) != 0) {
                return new C22584ArC(ass.A02(), A002, A1P);
            }
            if ((read & 128) != 0) {
                return new AZW(new AnonymousClass9WM(ass, C201849kY.A02(ass)), A002, A1P);
            }
            if (A1P) {
                if (A002 == 4) {
                    return new AZX(new AnonymousClass9WM(ass, C201849kY.A02(ass)));
                }
                if (A002 == 8) {
                    return new AZU(new AnonymousClass9WM(ass, C201849kY.A02(ass)));
                }
                if (A002 == 16) {
                    return new C21746AZa(new AnonymousClass9WM(ass, C201849kY.A02(ass)));
                }
                if (A002 == 17) {
                    return new C21748AZc(new AnonymousClass9WM(ass, C201849kY.A02(ass)));
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("unknown tag ");
                A0u.append(A002);
                throw C90464aC.A0M(" encountered", A0u);
            } else if (A002 == 4) {
                return new AZY(ass);
            } else {
                try {
                    return C187118xI.A04(ass, this.A02, A002);
                } catch (IllegalArgumentException e) {
                    throw new C187348xh("corrupted stream detected", e);
                }
            }
        } else if (A1P) {
            AnonymousClass9WM r1 = new AnonymousClass9WM(new C22687Asr(inputStream, i), i);
            if ((read & 64) != 0) {
                return new AZV(r1, A002);
            }
            if ((read & 128) != 0) {
                return new AZW(r1, A002, true);
            }
            if (A002 == 4) {
                return new AZX(r1);
            }
            if (A002 == 8) {
                return new AZU(r1);
            }
            if (A002 == 16) {
                return new AZZ(r1);
            }
            if (A002 == 17) {
                return new C21747AZb(r1);
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("unknown BER object encountered: 0x");
            C90504aG.A0z(A002, A0u2);
            throw new C187348xh(A0u2.toString());
        } else {
            throw C90524aI.A0X("indefinite-length primitive encoding encountered");
        }
    }
}
