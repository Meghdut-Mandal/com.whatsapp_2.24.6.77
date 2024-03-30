package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Br  reason: invalid class name and case insensitive filesystem */
public final class C24241Br {
    public final AnonymousClass1BF A00;
    public final C24251Bs A01;
    public final C23871Ae A02;
    public final C24281Bv A03;
    public final C24221Bp A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass004 A07;
    public final AnonymousClass004 A08;
    public final C005502l A09;
    public final C005502l A0A;

    public C24241Br(AnonymousClass1BF r2, C24251Bs r3, C23871Ae r4, C24281Bv r5, C24221Bp r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass004 r9, AnonymousClass004 r10, C005502l r11, C005502l r12) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass00C.A0D(r6, 8);
        AnonymousClass00C.A0D(r10, 9);
        AnonymousClass00C.A0D(r11, 10);
        AnonymousClass00C.A0D(r12, 11);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
        this.A06 = r8;
        this.A08 = r9;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = r10;
        this.A0A = r11;
        this.A09 = r12;
    }

    public static final String A00(C111345c8 r4) {
        StringBuilder sb;
        if (r4 instanceof AnonymousClass5HV) {
            return "delivery_error";
        }
        if (r4 instanceof AnonymousClass5HW) {
            sb = new StringBuilder();
            sb.append("error_");
            String message = ((Throwable) ((AnonymousClass5HW) r4).A00).getMessage();
            if (message == null) {
                message = "unknown";
            }
            sb.append(message);
        } else if (r4 instanceof AnonymousClass5HX) {
            sb = new StringBuilder();
            sb.append("multiple_errors [");
            List<Throwable> list = ((AnonymousClass5HX) r4).A00;
            ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(list, 10));
            for (Throwable message2 : list) {
                arrayList.add(message2.getMessage());
            }
            sb.append(C007103b.A0Q(", ", "", "", arrayList, (C006302t) null));
            sb.append(']');
        } else {
            if (r4 instanceof AnonymousClass5HY) {
                sb = new StringBuilder();
                sb.append("unknown_error (");
                sb.append(((AnonymousClass5HY) r4).A00.getMessage());
            } else if (r4 instanceof AnonymousClass5HU) {
                sb = new StringBuilder();
                sb.append("unknown_error_code (");
                sb.append(0);
            } else {
                throw new C13180jS();
            }
            sb.append(')');
        }
        return sb.toString();
    }

    public static final void A01(C24241Br r3, String str, String str2) {
        C23871Ae r2 = r3.A02;
        if (str2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("hasAvatar=");
            sb.append(r3.A00.A01());
            str2 = sb.toString();
        }
        r2.A02(1, str, str2);
    }
}
