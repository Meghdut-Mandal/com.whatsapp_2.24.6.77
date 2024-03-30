package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.AsM  reason: case insensitive filesystem */
public abstract class C22656AsM extends AnonymousClass121 implements Iterable {
    public C219411z[] A00;

    public C22656AsM() {
        this.A00 = C202169lB.A03;
    }

    public C22656AsM(C219411z r3) {
        Objects.requireNonNull(r3, "'element' cannot be null");
        this.A00 = new C219411z[]{r3};
    }

    public C22656AsM(C202169lB r2) {
        Objects.requireNonNull(r2, "'elementVector' cannot be null");
        this.A00 = r2.A07();
    }

    public C22656AsM(C219411z[] r2, boolean z) {
        this.A00 = r2;
    }

    public static C219411z A02(C22656AsM asM) {
        return asM.A0J(0);
    }

    public static C219411z A03(C22656AsM asM) {
        return asM.A0J(1);
    }

    public AnonymousClass121 A0B() {
        return new C22675Asf(this.A00, false);
    }

    public boolean A0E() {
        return true;
    }

    public boolean A0F(AnonymousClass121 r6) {
        if (r6 instanceof C22656AsM) {
            C22656AsM asM = (C22656AsM) r6;
            int A0H = A0H();
            if (asM.A0H() == A0H) {
                int i = 0;
                while (i < A0H) {
                    AnonymousClass121 Bve = this.A00[i].Bve();
                    AnonymousClass121 Bve2 = asM.A00[i].Bve();
                    if (Bve == Bve2 || Bve.A0F(Bve2)) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int length = this.A00.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.A00[length].Bve().hashCode();
        }
    }

    public Iterator iterator() {
        return new AY0(this.A00);
    }

    public static IllegalArgumentException A01(C22656AsM asM) {
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(asM.A0H());
        return new IllegalArgumentException(sb.toString());
    }

    public static C22656AsM A04(Object obj) {
        if (obj == null || (obj instanceof C22656AsM)) {
            return (C22656AsM) obj;
        }
        if (obj instanceof C23126B6h) {
            return A04(((C219411z) obj).Bve());
        }
        if (obj instanceof byte[]) {
            try {
                return A04(AnonymousClass121.A00((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A08(C36331k8.A0i("failed to construct sequence from byte[]: ", AnonymousClass000.A0u(), e));
            }
        } else {
            if (obj instanceof C219411z) {
                AnonymousClass121 Bve = ((C219411z) obj).Bve();
                if (Bve instanceof C22656AsM) {
                    return (C22656AsM) Bve;
                }
            }
            throw C165567td.A0N(obj, "unknown object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public static C22656AsM A05(C22658AsO asO, boolean z) {
        if (!z) {
            AnonymousClass121 A01 = C22658AsO.A01(asO);
            if (asO.A02) {
                if (asO instanceof C22679Asj) {
                    return new C22673Asd((C219411z) A01);
                }
                return new C22674Ase((C219411z) A01);
            } else if (A01 instanceof C22656AsM) {
                C22656AsM asM = (C22656AsM) A01;
                if (asO instanceof C22679Asj) {
                    return asM;
                }
                return (C22656AsM) asM.A0C();
            } else {
                throw C165567td.A0N(asO, "unknown object in getInstance: ", AnonymousClass000.A0u());
            }
        } else if (asO.A02) {
            return A04(C22658AsO.A01(asO));
        } else {
            throw AnonymousClass001.A08("object implicit - explicit expected.");
        }
    }

    public AnonymousClass121 A0C() {
        C22674Ase ase;
        if (this instanceof C22672Asc) {
            C22672Asc asc = (C22672Asc) this;
            synchronized (asc) {
                C22672Asc.A06(asc);
                ase = new C22674Ase(asc.A00);
            }
            return ase;
        } else if ((this instanceof C22674Ase) || (this instanceof C22675Asf)) {
            return this;
        } else {
            return new C22674Ase(this.A00);
        }
    }

    public int A0H() {
        int length;
        if (!(this instanceof C22672Asc)) {
            return this.A00.length;
        }
        C22672Asc asc = (C22672Asc) this;
        synchronized (asc) {
            C22672Asc.A06(asc);
            length = asc.A00.length;
        }
        return length;
    }

    public Enumeration A0I() {
        Enumeration enumeration;
        if (!(this instanceof C22672Asc)) {
            return new B97(this);
        }
        C22672Asc asc = (C22672Asc) this;
        synchronized (asc) {
            byte[] bArr = asc.A00;
            if (bArr != null) {
                enumeration = new AXq(bArr);
            } else {
                enumeration = new B97((C22656AsM) asc);
            }
        }
        return enumeration;
    }

    public C219411z A0J(int i) {
        C219411z r0;
        if (!(this instanceof C22672Asc)) {
            return this.A00[i];
        }
        C22672Asc asc = (C22672Asc) this;
        synchronized (asc) {
            C22672Asc.A06(asc);
            r0 = asc.A00[i];
        }
        return r0;
    }

    public C22656AsM(C219411z[] r4) {
        if (r4 != null) {
            int length = r4.length;
            int i = 0;
            while (i < length) {
                if (r4[i] != null) {
                    i++;
                }
            }
            this.A00 = C202169lB.A04(r4);
            return;
        }
        throw AnonymousClass001.A0A("'elements' cannot be null, or contain null");
    }

    public String toString() {
        int A0H = A0H();
        if (A0H == 0) {
            return "[]";
        }
        StringBuffer A0x = C165607th.A0x();
        A0x.append('[');
        int i = 0;
        while (true) {
            A0x.append(this.A00[i]);
            i++;
            if (i >= A0H) {
                A0x.append(']');
                return A0x.toString();
            }
            A0x.append(", ");
        }
    }
}
