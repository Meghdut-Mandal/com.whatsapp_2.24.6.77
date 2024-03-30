package X;

import android.text.TextUtils;
import com.whatsapp.TextData;

/* renamed from: X.2bV  reason: invalid class name */
public class AnonymousClass2bV extends AnonymousClass3T1 implements AnonymousClass4RU {
    public int A00;
    public int A01 = 0;
    public TextData A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public byte[] A07;

    public AnonymousClass2bV A1X(C64933Qa r11, long j) {
        String A1d;
        if (this instanceof AnonymousClass2cX) {
            throw new AnonymousClass1X6("ViewOnce messages can not be forwarded");
        }
        C64933Qa r5 = r11;
        long j2 = j;
        if (this instanceof AnonymousClass2cW) {
            AnonymousClass2cW r6 = (AnonymousClass2cW) this;
            AnonymousClass2bV r1 = new AnonymousClass2bV(r11, j);
            if (r11.A00 instanceof C177528dw) {
                A1d = r6.A1Y();
            } else {
                A1d = r6.A1d();
            }
            r1.A16(A1d);
            r6.A1a(r1);
            return r1;
        } else if ((this instanceof AnonymousClass2cV) || (this instanceof AnonymousClass2cU)) {
            AnonymousClass2bV r12 = new AnonymousClass2bV(r11, j);
            r12.A16(A0b());
            A1a(r12);
            return r12;
        } else {
            AnonymousClass2bV r4 = new AnonymousClass2bV(r5, this, j2, false);
            AnonymousClass37E A002 = C61583Cq.A00(this);
            if (A002 != null) {
                r4.A10(new AnonymousClass37E(A002.A00, A002.A01, AnonymousClass001.A0I()));
            }
            A1a(r4);
            return r4;
        }
    }

    public AnonymousClass3T1 B32(C64933Qa r9) {
        C64933Qa r3 = r9;
        if (this instanceof AnonymousClass2cX) {
            AnonymousClass2cX r4 = (AnonymousClass2cX) this;
            return new AnonymousClass2cX(r9, r4, r4.A0I);
        } else if (this instanceof AnonymousClass2cW) {
            AnonymousClass2cW r42 = (AnonymousClass2cW) this;
            return new AnonymousClass2cW(r9, r42, r42.A0I);
        } else if (this instanceof AnonymousClass2cV) {
            AnonymousClass2cV r43 = (AnonymousClass2cV) this;
            return new AnonymousClass2cV(r9, r43, r43.A0I);
        } else if (this instanceof AnonymousClass2cT) {
            AnonymousClass2cT r44 = (AnonymousClass2cT) this;
            AnonymousClass00C.A0D(r9, 0);
            return new AnonymousClass2cT(r9, r44, r44.A0I);
        } else if (!(this instanceof AnonymousClass2cU)) {
            return new AnonymousClass2bV(r3, this, this.A0I, true);
        } else {
            AnonymousClass2cU r45 = (AnonymousClass2cU) this;
            return new AnonymousClass2cU(r9, r45, r45.A0I);
        }
    }

    public String A1Y() {
        if (!(this instanceof AnonymousClass2cW)) {
            return A0b();
        }
        AnonymousClass2cW r4 = (AnonymousClass2cW) this;
        if (TextUtils.isEmpty(r4.A0b())) {
            return r4.A00.A02;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("*");
        A0u.append(AnonymousClass000.A0p(r4.A0b(), "*", A0u2));
        A0u.append("\n\n");
        return AnonymousClass000.A0q(r4.A00.A02, A0u);
    }

    public void A1Z(TextData textData) {
        byte[] bArr = this.A07;
        if (bArr != null) {
            textData.thumbnail = bArr;
            this.A07 = null;
        }
        this.A02 = textData;
    }

    public void A1a(AnonymousClass2bV r2) {
        if (this.A02 != null) {
            r2.A02 = null;
            r2.A1b(this.A02.thumbnail);
        }
    }

    public void A1b(byte[] bArr) {
        TextData textData = this.A02;
        if (textData != null) {
            textData.thumbnail = bArr;
        } else {
            this.A07 = bArr;
        }
    }

    public byte[] A1c() {
        TextData textData = this.A02;
        if (textData != null) {
            return textData.thumbnail;
        }
        return this.A07;
    }

    public AnonymousClass2bV(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public AnonymousClass2bV(C64933Qa r2, long j) {
        super(r2, 0, j);
    }

    public AnonymousClass2bV(C64933Qa r8, AnonymousClass2bV r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A05 = r9.A05;
        this.A04 = r9.A04;
        this.A06 = r9.A06;
        this.A02 = r9.A02;
        this.A07 = r9.A07;
        this.A01 = r9.A01;
        this.A00 = r9.A00;
        this.A03 = r9.A03;
    }
}
