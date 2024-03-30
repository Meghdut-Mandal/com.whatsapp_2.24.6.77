package X;

/* renamed from: X.6Ev  reason: invalid class name and case insensitive filesystem */
public abstract class C129076Ev {
    public float A01(int i) {
        if (this instanceof C93334gO) {
            C93334gO r1 = (C93334gO) this;
            if (i == 0) {
                return r1.A00;
            }
            if (i == 1) {
                return r1.A01;
            }
            if (i == 2) {
                return r1.A02;
            }
            if (i == 3) {
                return r1.A03;
            }
            return 0.0f;
        } else if (this instanceof C93324gN) {
            C93324gN r12 = (C93324gN) this;
            if (i == 0) {
                return r12.A00;
            }
            if (i == 1) {
                return r12.A01;
            }
            if (i == 2) {
                return r12.A02;
            }
            return 0.0f;
        } else if (this instanceof C93314gM) {
            C93314gM r13 = (C93314gM) this;
            if (i == 0) {
                return r13.A00;
            }
            if (i == 1) {
                return r13.A01;
            }
            return 0.0f;
        } else {
            C93304gL r0 = (C93304gL) this;
            if (i == 0) {
                return r0.A00;
            }
            return 0.0f;
        }
    }

    public int A02() {
        if (this instanceof C93334gO) {
            return 4;
        }
        if (this instanceof C93324gN) {
            return 3;
        }
        if (this instanceof C93314gM) {
            return 2;
        }
        return 1;
    }

    public C129076Ev A03() {
        if (this instanceof C93334gO) {
            return new C93334gO(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (this instanceof C93324gN) {
            return new C93324gN(0.0f, 0.0f, 0.0f);
        }
        if (this instanceof C93314gM) {
            return new C93314gM(0.0f, 0.0f);
        }
        return new C93304gL(0.0f);
    }

    public void A04() {
        if (this instanceof C93334gO) {
            C93334gO r1 = (C93334gO) this;
            r1.A00 = 0.0f;
            r1.A01 = 0.0f;
            r1.A02 = 0.0f;
            r1.A03 = 0.0f;
        } else if (this instanceof C93324gN) {
            C93324gN r12 = (C93324gN) this;
            r12.A00 = 0.0f;
            r12.A01 = 0.0f;
            r12.A02 = 0.0f;
        } else if (this instanceof C93314gM) {
            C93314gM r13 = (C93314gM) this;
            r13.A00 = 0.0f;
            r13.A01 = 0.0f;
        } else {
            ((C93304gL) this).A00 = 0.0f;
        }
    }

    public void A05(int i, float f) {
        if (this instanceof C93334gO) {
            C93334gO r1 = (C93334gO) this;
            if (i == 0) {
                r1.A00 = f;
            } else if (i == 1) {
                r1.A01 = f;
            } else if (i == 2) {
                r1.A02 = f;
            } else if (i == 3) {
                r1.A03 = f;
            }
        } else if (this instanceof C93324gN) {
            C93324gN r12 = (C93324gN) this;
            if (i == 0) {
                r12.A00 = f;
            } else if (i == 1) {
                r12.A01 = f;
            } else if (i == 2) {
                r12.A02 = f;
            }
        } else if (this instanceof C93314gM) {
            C93314gM r13 = (C93314gM) this;
            if (i == 0) {
                r13.A00 = f;
            } else if (i == 1) {
                r13.A01 = f;
            }
        } else {
            C93304gL r0 = (C93304gL) this;
            if (i == 0) {
                r0.A00 = f;
            }
        }
    }

    public static C129076Ev A00(C129076Ev r1) {
        C129076Ev A03 = r1.A03();
        AnonymousClass00C.A0E(A03, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return A03;
    }
}
