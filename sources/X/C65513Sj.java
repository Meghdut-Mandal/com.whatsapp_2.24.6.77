package X;

import com.whatsapp.comments.CommentListManager$loadMessages$1;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Sj  reason: invalid class name and case insensitive filesystem */
public final class C65513Sj {
    public static final Comparator A0D = C81583xF.A00;
    public final C90394a5 A00;
    public final AnonymousClass16J A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass3T1 A03;
    public final AnonymousClass1A1 A04;
    public final AtomicReference A05 = new AtomicReference(C51732oI.UNINITIALIZED);
    public final C005502l A06;
    public final AnonymousClass040 A07;
    public final C18010sR A08;
    public final AnonymousClass05H A09;
    public final AnonymousClass05L A0A;
    public final AnonymousClass05K A0B;
    public final C24561Cx A0C;

    public C65513Sj(C24561Cx r5, AnonymousClass16J r6, AnonymousClass12P r7, AnonymousClass3T1 r8, AnonymousClass1A1 r9, C005502l r10, AnonymousClass040 r11) {
        AnonymousClass00C.A0D(r9, 1);
        C36321k7.A19(r6, r5, r7, r10);
        AnonymousClass00C.A0D(r11, 7);
        this.A04 = r9;
        this.A01 = r6;
        this.A0C = r5;
        this.A02 = r7;
        this.A06 = r10;
        this.A03 = r8;
        this.A07 = r11;
        AnonymousClass05N r0 = new AnonymousClass05N(new TreeSet(A0D));
        this.A0A = r0;
        this.A0B = r0;
        C12960iw A002 = C05750Qx.A00(C023109s.A01, 1);
        this.A08 = A002;
        this.A09 = C06810Ve.A01(A002);
        C90394a5 A003 = C90394a5.A00(this, 7);
        this.A00 = A003;
        r6.registerObserver(A003);
        this.A05.set(C51732oI.LOADING);
        C36381kD.A1R(this.A06, new CommentListManager$loadMessages$1(this, (C023509x) null), this.A07);
    }

    public static final boolean A00(C65513Sj r1, AnonymousClass3T1 r2) {
        Long A042;
        C63663Kx A0P = r2.A0P();
        if (A0P == null || (A042 = A0P.A04()) == null) {
            return false;
        }
        return A042.equals(Long.valueOf(r1.A03.A1N));
    }
}
