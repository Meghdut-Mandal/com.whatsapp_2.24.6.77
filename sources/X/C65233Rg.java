package X;

import android.graphics.RectF;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3Rg  reason: invalid class name and case insensitive filesystem */
public class C65233Rg {
    public int A00;
    public final C124995z9 A01;
    public final AnonymousClass65P A02;
    public final AnonymousClass3Ot A03;
    public final String A04;

    public static C65233Rg A00(Uri uri, C132046Rx r28, C1262263a r29, AnonymousClass3Ot r30, C25471Gl r31, AnonymousClass3S2 r32, String str, int i, boolean z, boolean z2, boolean z3) {
        Uri uri2 = uri;
        C25471Gl r5 = r31;
        C36321k7.A0v(r5, 0, uri2);
        int i2 = i;
        boolean z4 = z2;
        return new C65233Rg(AnonymousClass3M4.A00(r28, r5, i2, z3), new AnonymousClass65P((RectF) null, r29, r5, r32, (File) null, (String) null, uri2.toString(), (String) null, (String) null, 0, i2, 0, 0, 0, 0, z, AnonymousClass6Y1.A06(r5), z4, z4, false, false, false, false), r30, str, 0);
    }

    public static C65233Rg A01(C19730wQ r45, C236419g r46, AnonymousClass1D1 r47, AnonymousClass1GJ r48, AnonymousClass3Ot r49, AnonymousClass3SC r50, boolean z) {
        AnonymousClass3S2 r6;
        boolean z2;
        boolean A1a;
        String str;
        int[] iArr;
        AnonymousClass3SC r43 = r50;
        C65013Qj A002 = AnonymousClass2bU.A00(r43.A01());
        AnonymousClass00C.A08(A002);
        String str2 = A002.A0L;
        AnonymousClass3Ot r44 = r49;
        Integer num = r44.A00;
        AnonymousClass1D1 r8 = r47;
        AnonymousClass1GJ r1 = r48;
        C36321k7.A0v(r8, 0, r1);
        AnonymousClass32T r7 = new AnonymousClass32T(r1);
        CopyOnWriteArrayList copyOnWriteArrayList = r43.A02;
        boolean z3 = copyOnWriteArrayList instanceof Collection;
        boolean z4 = false;
        if (!z3 || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AnonymousClass1GJ r2 = r7.A00;
                AnonymousClass2bU r3 = (AnonymousClass2bU) next;
                AnonymousClass00C.A0D(r3, 1);
                if (r2.A0K(r3)) {
                    z4 = true;
                    break;
                }
            }
        }
        AnonymousClass2bU A012 = r43.A01();
        AnonymousClass00C.A08(A012);
        boolean A05 = r43.A05();
        boolean z5 = false;
        if (!z3 || !copyOnWriteArrayList.isEmpty()) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C64933Qa.A02(it2) instanceof C28981Uw) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C65013Qj A003 = AnonymousClass2bU.A00(A012);
        if (A012 instanceof C46962bx) {
            C46962bx r12 = (C46962bx) A012;
            r6 = r12.A05;
            z2 = r12.A1l();
        } else {
            r6 = null;
            z2 = false;
        }
        C1262263a A004 = r8.A00(num, A012.A1I, A05);
        String str3 = A003.A0K;
        File file = A003.A0I;
        String A1b = A012.A1b();
        String str4 = A012.A04;
        String str5 = A012.A05;
        C25471Gl A022 = AnonymousClass6Y1.A02(A012);
        AnonymousClass00C.A08(A022);
        int i = A003.A05;
        int i2 = A012.A09;
        long j = A003.A0F;
        long j2 = A003.A0G;
        int i3 = A003.A08;
        int i4 = A003.A07;
        AnonymousClass3S2 r20 = r6;
        File file2 = file;
        String str6 = str4;
        String str7 = str5;
        int i5 = i;
        RectF rectF = A003.A0H;
        AnonymousClass65P r16 = new AnonymousClass65P(rectF, A004, A022, r20, file2, str3, A1b, str6, str7, i5, i2, i3, i4, j, j2, A05, z5, z4, !A003.A0U, z, A003.A0T, A003.A0S, z2);
        C19730wQ r4 = r45;
        C236419g r32 = r46;
        C36321k7.A0v(r4, 1, r32);
        Iterator it3 = copyOnWriteArrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (!C66013Ui.A0V(r4, C36391kE.A0l(it3))) {
                    A1a = true;
                    break;
                }
            } else {
                A1a = C36411kG.A1a(r32.A09());
                break;
            }
        }
        AnonymousClass2bU A013 = r43.A01();
        AnonymousClass00C.A08(A013);
        C65013Qj A005 = AnonymousClass2bU.A00(A013);
        C132046Rx A006 = C132046Rx.A00(A005, A013.A0I);
        AnonymousClass6Q6 A1Y = A013.A1Y();
        boolean A042 = C64933Qa.A04(A013);
        boolean z6 = !A042;
        C25471Gl A023 = AnonymousClass6Y1.A02(A013);
        File file3 = A005.A0I;
        long j3 = A013.A00;
        String str8 = A013.A04;
        String str9 = A013.A03;
        int i6 = A013.A09;
        if (A042) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        if (A1Y != null) {
            iArr = A1Y.A06();
        } else {
            iArr = null;
        }
        int i7 = A005.A04;
        List A0Y = C007103b.A0Y(copyOnWriteArrayList);
        ArrayList A0J = C36321k7.A0J(A0Y);
        Iterator it4 = A0Y.iterator();
        while (it4.hasNext()) {
            String str10 = C36391kE.A0l(it4).A1J.A01;
            AnonymousClass00C.A07(str10);
            A0J.add(str10);
        }
        boolean A014 = C131806Qs.A01(A013);
        int A007 = AnonymousClass1D9.A00(r43);
        AnonymousClass00C.A0B(A023);
        return new C65233Rg(new C124995z9(A006, (C119765qQ) null, A023, file3, str8, str9, str, A0J, iArr, i6, i7, A007, j3, A1a, true, z6, A014), r16, r44, str2, r43.A00);
    }

    public C65233Rg(C124995z9 r1, AnonymousClass65P r2, AnonymousClass3Ot r3, String str, int i) {
        this.A04 = str;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
