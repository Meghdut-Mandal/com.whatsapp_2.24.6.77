package X;

import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1Fh  reason: invalid class name and case insensitive filesystem */
public final class C25181Fh {
    public final AnonymousClass16D A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;

    public C25181Fh(AnonymousClass16D r2, C220412q r3, AnonymousClass17X r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final boolean A00(AnonymousClass3T1 r5) {
        AnonymousClass141 A0A;
        AnonymousClass141 A0A2;
        if (r5 instanceof AnonymousClass2bM) {
            AnonymousClass2bM r1 = (AnonymousClass2bM) r5;
            if (r1.A1e()) {
                AnonymousClass11F r12 = r1.A1J.A00;
                if (AnonymousClass143.A0G(r12)) {
                    C220412q r3 = this.A01;
                    Parcelable.Creator creator = AnonymousClass147.CREATOR;
                    AnonymousClass147 A03 = C65533Sl.A03(r12);
                    if (r3.A05(A03) == 3 && A03 != null && (A0A2 = this.A00.A0A(A03)) != null && A0A2.A0j && r3.A0P(A03)) {
                        return true;
                    }
                }
            }
        }
        if (r5 == null) {
            return false;
        }
        C222713q r0 = AnonymousClass11F.A00;
        AnonymousClass11F r2 = r5.A1J.A00;
        AnonymousClass144 A002 = AnonymousClass6H4.A00(r2);
        if (A002 != null && this.A02.A0B(A002)) {
            return true;
        }
        if (!r5.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) || !AnonymousClass143.A0G(r2)) {
            return false;
        }
        C220412q r32 = this.A01;
        Parcelable.Creator creator2 = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(r2);
        if (r32.A05(A032) != 3 || A032 == null || (A0A = this.A00.A0A(A032)) == null || !A0A.A0j || !r32.A0P(A032)) {
            return false;
        }
        return true;
    }
}
