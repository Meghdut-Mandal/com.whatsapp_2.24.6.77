package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8o1  reason: invalid class name and case insensitive filesystem */
public final class C181778o1 extends C181798o3 implements C23043B1o, AnonymousClass4RU, AnonymousClass4TW {
    public C207219uk A00;
    public AnonymousClass2bZ A01;

    public C181778o1 A1j(C64933Qa r13) {
        C207219uk r4;
        C64933Qa r3 = r13;
        AnonymousClass00C.A0D(r13, 0);
        if (A1T(2097152)) {
            C207219uk r2 = this.A00;
            if (r2 != null) {
                Parcel obtain = Parcel.obtain();
                AnonymousClass00C.A08(obtain);
                obtain.writeParcelable(r2, 0);
                obtain.setDataPosition(0);
                Parcelable A0H = C36411kG.A0H(obtain, C207219uk.class);
                obtain.recycle();
                r4 = (C207219uk) A0H;
            } else {
                r4 = null;
            }
            long j = this.A0I;
            C65013Qj r22 = this.A01;
            AnonymousClass00C.A0B(r22);
            return new C181778o1(r22, r3, r4, this, j);
        }
        long j2 = this.A0I;
        C65013Qj r7 = this.A01;
        AnonymousClass00C.A0B(r7);
        return new C181778o1(r7, r13, this, j2);
    }

    public C181778o1(C64933Qa r2, long j) {
        super(r2, 62, j);
    }

    public String A0d() {
        if (!A1T(2097152)) {
            return this.A02;
        }
        C207219uk r0 = this.A00;
        if (r0 != null) {
            return r0.A09;
        }
        return null;
    }

    public void A17(String str) {
        if (A1T(2097152)) {
            C207219uk r0 = this.A00;
            if (r0 != null) {
                r0.A09 = str;
                return;
            }
            return;
        }
        this.A02 = str;
    }

    public AnonymousClass2bZ B9R() {
        return this.A01;
    }

    public C207219uk BA8() {
        return this.A00;
    }

    public void BqQ(AnonymousClass2bZ r1) {
        this.A01 = r1;
    }

    public void BqZ(C207219uk r1) {
        this.A00 = r1;
    }

    public C181778o1(C65013Qj r9, C64933Qa r10, C181778o1 r11, long j) {
        super(r9, r10, r11, j, true);
        this.A00 = r11.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C181778o1(C64933Qa r2, C207219uk r3, long j) {
        super(r2, 62, j);
        C36321k7.A0y(r2, r3);
        this.A00 = r3;
    }

    public C181778o1(C65013Qj r8, C64933Qa r9, C207219uk r10, C181778o1 r11, long j) {
        super(r8, r9, r11, j, true);
        this.A00 = r10;
    }
}
