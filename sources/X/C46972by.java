package X;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: X.2by  reason: invalid class name and case insensitive filesystem */
public class C46972by extends AnonymousClass2bU implements AnonymousClass4RU {
    public int A00;
    public String A01;

    public AnonymousClass3T1 B32(C64933Qa r9) {
        C64933Qa r2 = r9;
        if (this instanceof C46822bj) {
            C46822bj r3 = (C46822bj) this;
            return new C46822bj(r3.A01, r2, r3, r3.A0I);
        } else if (this instanceof C46832bk) {
            C46832bk r32 = (C46832bk) this;
            AnonymousClass00C.A0D(r9, 0);
            long j = r32.A0I;
            C65013Qj r1 = r32.A01;
            AnonymousClass00C.A0B(r1);
            return new C46832bk(r1, r2, r32, j, true);
        } else {
            return new C46972by(this.A01, r2, this, this.A1I, this.A0I, true);
        }
    }

    public String A1j() {
        if (TextUtils.isEmpty(this.A01)) {
            return A1b();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        C36421kH.A1N(A0u);
        return AnonymousClass000.A0q(A1b(), A0u);
    }

    public void A1k(String str) {
        this.A01 = AnonymousClass14B.A0C(str, 65536);
    }

    public C63683Kz A0V() {
        C63683Kz A0V = super.A0V();
        C18740tg.A06(A0V);
        return A0V;
    }

    public void A1c(Cursor cursor, C65013Qj r3) {
        super.A1c(cursor, r3);
        this.A00 = C36351kA.A03(cursor, "page_count");
        A1k(C36341k9.A0f(cursor, "media_caption"));
    }

    public void A1d(Cursor cursor, C65013Qj r3) {
        super.A1d(cursor, r3);
        this.A00 = C36351kA.A03(cursor, "page_count");
        A1k(C36341k9.A0f(cursor, "media_caption"));
    }

    public C46972by(C64933Qa r1, int i, long j) {
        super(r1, i, j);
    }

    public C46972by(C64933Qa r2, long j) {
        super(r2, 9, j);
    }

    public C46972by(C65013Qj r2, C64933Qa r3, C46972by r4, int i, long j, boolean z) {
        super(r2, r3, r4, i, j, z);
        this.A00 = r4.A00;
        this.A01 = r4.A01;
    }
}
