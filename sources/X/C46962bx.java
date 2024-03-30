package X;

import android.database.Cursor;

/* renamed from: X.2bx  reason: invalid class name and case insensitive filesystem */
public class C46962bx extends AnonymousClass2bU implements AnonymousClass4RU {
    public C135066c4 A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public transient long A04;
    public transient AnonymousClass3S2 A05;
    public transient Integer A06;

    public C46962bx(C65013Qj r10, C64933Qa r11, C46962bx r12, long j, boolean z) {
        super(r10, r11, r12, r12.A1I, j, z);
        this.A05 = r12.A05;
        this.A03 = r12.A03;
        this.A01 = r12.A01;
        this.A00 = r12.A00;
        this.A04 = j;
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r8) {
        long j = this.A0I;
        return new C46962bx(this.A01, r8, this, j, true);
    }

    public boolean A1j() {
        AnonymousClass3S2 r0 = this.A05;
        if ((r0 == null || !r0.A07) && !this.A02) {
            return false;
        }
        return true;
    }

    public boolean A1k() {
        AnonymousClass3S2 r0 = this.A05;
        if (r0 == null || !r0.A0A) {
            return false;
        }
        return true;
    }

    public boolean A1l() {
        Integer num = this.A01;
        if (num == null || (num.intValue() & 1) == 0) {
            return false;
        }
        return true;
    }

    public void A1c(Cursor cursor, C65013Qj r7) {
        Integer valueOf;
        super.A1c(cursor, r7);
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("is_animated_sticker")) == 1) {
            z = true;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("sticker_flags");
        if (cursor.isNull(columnIndexOrThrow)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(cursor.getInt(columnIndexOrThrow));
        }
        this.A01 = valueOf;
        this.A03 = z;
    }

    public C46962bx(C64933Qa r2, long j) {
        super(r2, 20, j);
        this.A04 = j;
    }
}
