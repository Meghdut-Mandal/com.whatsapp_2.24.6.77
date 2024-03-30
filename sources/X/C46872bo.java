package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2bo  reason: invalid class name and case insensitive filesystem */
public final class C46872bo extends C46882bp implements C23043B1o, AnonymousClass4RU, AnonymousClass4TW {
    public C207219uk A00;
    public AnonymousClass2bZ A01;

    public C46872bo A1j(C64933Qa r14) {
        C207219uk r4;
        C64933Qa r3 = r14;
        AnonymousClass00C.A0D(r14, 0);
        if (AnonymousClass000.A1S(this.A0A & 2097152, 2097152)) {
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
            return new C46872bo(r22, r3, r4, this, j);
        }
        long j2 = this.A0I;
        C65013Qj r7 = this.A01;
        AnonymousClass00C.A0B(r7);
        return new C46872bo(r7, r14, this, j2, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46872bo(C64933Qa r2, C207219uk r3, long j) {
        super(r2, 57, j);
        C36321k7.A0y(r2, r3);
        this.A00 = r3;
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

    public C46872bo(C65013Qj r2, C64933Qa r3, C46872bo r4, long j, boolean z) {
        super(r2, r3, r4, j, z);
        this.A00 = r4.A00;
    }

    public C46872bo(C65013Qj r8, C64933Qa r9, C207219uk r10, C46872bo r11, long j) {
        super(r8, r9, r11, j, true);
        this.A00 = r10;
    }

    public C46872bo(C64933Qa r2, long j) {
        super(r2, 57, j);
    }
}
