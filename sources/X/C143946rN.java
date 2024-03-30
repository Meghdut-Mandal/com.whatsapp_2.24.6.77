package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6rN  reason: invalid class name and case insensitive filesystem */
public class C143946rN implements C34841hj {
    public final int A00;
    public final AnonymousClass72P A01;
    public final AnonymousClass689 A02;
    public final AnonymousClass141 A03;
    public final List A04;

    public C143946rN(AnonymousClass72P r7, AnonymousClass689 r8, AnonymousClass141 r9) {
        this(r7, r8, r9, (List) null, -1);
    }

    public int BD8() {
        return 2;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1J(objArr, 2);
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A02;
        objArr[4] = this.A04;
        C36371kC.A1S(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public /* bridge */ /* synthetic */ AnonymousClass11F BDC() {
        AnonymousClass141 A022 = this.A01.A02();
        if (A022 == null) {
            return null;
        }
        return (AnonymousClass11F) A022.A06(UserJid.class);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C143946rN)) {
            return false;
        }
        C143946rN r4 = (C143946rN) obj;
        if (!Collections.unmodifiableList(this.A01.A03).equals(Collections.unmodifiableList(r4.A01.A03)) || !C1901797e.A00(this.A03, r4.A03) || !C1901797e.A00(this.A02, r4.A02) || !C1901797e.A00(this.A04, r4.A04) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass72P B9E() {
        return this.A01;
    }

    public int BH3() {
        return this.A00;
    }

    public C143946rN(AnonymousClass72P r1, AnonymousClass689 r2, AnonymousClass141 r3, List list, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = list;
        this.A00 = i;
    }
}
