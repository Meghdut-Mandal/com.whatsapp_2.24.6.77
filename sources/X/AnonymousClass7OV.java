package X;

import java.io.IOException;

/* renamed from: X.7OV  reason: invalid class name */
public class AnonymousClass7OV implements C160087kR {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass7OV(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj2;
        this.A00 = obj3;
        this.A01 = obj;
    }

    public void B2J(C123815x8 r8) {
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(r8, 0);
            if (!(!C224714l.A02())) {
                throw AnonymousClass001.A09("Check failed.");
            } else if (r8.A00 != 0) {
                AnonymousClass6MQ r6 = ((C120525re) this.A02).A01;
                AnonymousClass66O r5 = r8.A04;
                AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
                C128936Ee r4 = new C128936Ee(0, 0);
                C1501274b r3 = C1501274b.A00;
                r6.A00(r4, new C164587s3(this.A00, 1), (AnonymousClass2V1) r5, r3);
            } else {
                Object obj = r8.A03.A00;
                if (obj == null) {
                    ((C009003v) this.A00).invoke(2, (Object) null);
                } else {
                    ((C006302t) this.A01).invoke(new C134876bk(new C135086c7(C146356vT.A00(), obj, "WaFbAccessToken"), 2));
                }
            }
        } else {
            AnonymousClass00C.A0D(r8, 0);
            ((C146046uw) this.A02).A05.markerEnd(386138113, 2);
            ((C160087kR) this.A00).B2J(r8);
        }
    }

    public void BVL(IOException iOException) {
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(iOException, 0);
            AnonymousClass1UT.A01("WebAuthAccessTokenFetcher/exchangeTokenAndBlobForAccessToken delivery failure", iOException);
            ((C009003v) this.A00).invoke(C90494aF.A0U(), (Object) null);
            return;
        }
        AnonymousClass00C.A0D(iOException, 0);
        ((C146046uw) this.A02).A05.markerEnd(386138113, 3);
        ((C160087kR) this.A00).BVL(iOException);
    }

    public void BWk(Exception exc) {
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            AnonymousClass1UT.A01("WebAuthAccessTokenFetcher/exchangeTokenAndBlobForAccessToken failed", exc);
            if (exc instanceof AnonymousClass5V0) {
                C132286Sy r2 = ((AnonymousClass5V0) exc).error;
                ((C009003v) this.A00).invoke(Integer.valueOf(r2.A01), Integer.valueOf(r2.A02));
                return;
            }
            ((C009003v) this.A00).invoke(C36361kB.A0j(), (Object) null);
            return;
        }
        AnonymousClass00C.A0D(exc, 0);
        if (!(exc instanceof AnonymousClass5V0) || ((AnonymousClass5V0) exc).error.A01 != 190) {
            ((C146046uw) this.A02).A05.markerEnd(386138113, 3);
            ((C160087kR) this.A00).BWk(exc);
            return;
        }
        C146046uw r5 = (C146046uw) this.A02;
        boolean z = r5.A02.A00;
        C21430zE r1 = r5.A05;
        if (z) {
            r1.markerPoint(386138113, "refresh_token_with_certificate");
            Object obj = this.A00;
            r5.A01.A02((AnonymousClass6OQ) this.A01, new C164037rA(r5, obj, 2), (C128936Ee) null);
            return;
        }
        r1.markerPoint(386138113, "create_user_without_certificate");
        C146046uw.A00(r5);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
