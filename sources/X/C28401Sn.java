package X;

import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1Sn  reason: invalid class name and case insensitive filesystem */
public final class C28401Sn implements C28391Sm {
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final AnonymousClass1LV A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C18820ts A05;
    public final C220412q A06;
    public final AnonymousClass17X A07;
    public final AnonymousClass180 A08;
    public final C233117z A09;
    public final AnonymousClass1EL A0A;
    public final AnonymousClass19A A0B;
    public final C19770wU A0C;
    public final C28411So A0D;

    public C28401Sn(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass1LV r4, C28411So r5, AnonymousClass16D r6, AnonymousClass171 r7, C18820ts r8, C220412q r9, AnonymousClass17X r10, AnonymousClass180 r11, C233117z r12, AnonymousClass1EL r13, AnonymousClass19A r14, C19770wU r15) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r15, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r9, 4);
        AnonymousClass00C.A0D(r14, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass00C.A0D(r13, 9);
        AnonymousClass00C.A0D(r4, 10);
        AnonymousClass00C.A0D(r10, 11);
        AnonymousClass00C.A0D(r12, 12);
        AnonymousClass00C.A0D(r11, 13);
        this.A00 = r2;
        this.A0C = r15;
        this.A01 = r3;
        this.A06 = r9;
        this.A0B = r14;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A0A = r13;
        this.A02 = r4;
        this.A07 = r10;
        this.A09 = r12;
        this.A08 = r11;
        this.A0D = r5;
    }

    public int BEP(AnonymousClass147 r4) {
        Object next;
        AnonymousClass00C.A0D(r4, 0);
        if (this.A06.A05(r4) != 1 && (r4 = this.A02.A02(r4)) == null) {
            return 0;
        }
        C20760y7 A072 = this.A07.A07.A0C(r4).A07();
        AnonymousClass00C.A08(A072);
        C12320hr r1 = new C12320hr(new C12790if(AnonymousClass4N3.A00, C15060md.A02(new C85924Iy(this), new C18650tV(A072, 0))));
        if (!r1.hasNext()) {
            next = null;
        } else {
            next = r1.next();
        }
        Number number = (Number) next;
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public Set B9u(AnonymousClass147 r4) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.A06.A05(r4) == 1) {
            linkedHashSet.add(r4);
            AnonymousClass1LV r1 = this.A02;
            AnonymousClass00C.A0D(r4, 0);
            AnonymousClass3QK A002 = r1.A08.A00(r4);
            if (A002 != null) {
                Parcelable.Creator creator = AnonymousClass147.CREATOR;
                AnonymousClass147 A032 = C65533Sl.A03(A002.A02);
                if (A032 != null && this.A07.A0C(A032)) {
                    linkedHashSet.add(A032);
                }
            }
        }
        return C007103b.A0f(linkedHashSet);
    }
}
