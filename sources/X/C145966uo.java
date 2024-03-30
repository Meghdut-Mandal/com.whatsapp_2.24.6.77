package X;

import java.io.IOException;

/* renamed from: X.6uo  reason: invalid class name and case insensitive filesystem */
public final class C145966uo implements C160087kR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C006302t A02;

    public void B2J(C123815x8 r6) {
        C128846Dv r0;
        Object obj;
        C006302t r2;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass6DK r3 = (AnonymousClass6DK) r6.A03.A00;
        if (r3 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MLModelMetadataGraphqlFetcher/fetch/ml model metadata not found for ");
            A0u.append(this.A01);
            A0u.append(' ');
            C36351kA.A1R(A0u, this.A00);
            r2 = this.A02;
            obj = AnonymousClass00C.A02(new AnonymousClass5DK("ML Model metadata is not found"));
        } else if (r3.A00 == 0) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("MLModelMetadataGraphqlFetcher/fetch/ml model not found for ");
            A0u2.append(this.A01);
            A0u2.append(' ');
            C36351kA.A1R(A0u2, this.A00);
            C006302t r22 = this.A02;
            String str = r3.A01;
            if (str == null) {
                str = "Model is not found";
            }
            r22.invoke(new AnonymousClass0AK(AnonymousClass00C.A02(new AnonymousClass5DK(str))));
            return;
        } else {
            AnonymousClass6BZ r02 = (AnonymousClass6BZ) C007103b.A0P(r3.A02, 0);
            if (r02 == null || (r0 = (C128846Dv) C007103b.A0P(r02.A00, 0)) == null || (obj = r0.A00) == null) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("MLModelMetadataGraphqlFetcher/fetch/ml model file url not found for ");
                A0u3.append(this.A01);
                A0u3.append(' ');
                C36351kA.A1R(A0u3, this.A00);
                C006302t r23 = this.A02;
                String str2 = r3.A01;
                if (str2 == null) {
                    str2 = "Model url is missing";
                }
                r23.invoke(new AnonymousClass0AK(AnonymousClass00C.A02(new AnonymousClass5DK(str2))));
                return;
            }
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("MLModelMetadataGraphqlFetcher/fetch/found ml model file url for ");
            A0u4.append(this.A01);
            A0u4.append(' ');
            C36321k7.A1Y(A0u4, this.A00);
            r2 = this.A02;
        }
        r2.invoke(new AnonymousClass0AK(obj));
    }

    public void BVL(IOException iOException) {
        C36321k7.A1J(iOException, "MLModelMetadataGraphqlFetcher/onDeliveryFailure/exception: ", C36401kF.A0t(iOException, 0));
        C006302t r2 = this.A02;
        AnonymousClass5DJ r0 = new AnonymousClass5DJ(iOException);
        AnonymousClass00C.A0D(r0, 0);
        r2.invoke(new AnonymousClass0AK(C90524aI.A0t(r0)));
    }

    public void BWk(Exception exc) {
        C36321k7.A1J(exc, "MLModelMetadataGraphqlFetcher/onError/exception: ", C36401kF.A0t(exc, 0));
        C006302t r2 = this.A02;
        AnonymousClass5DL r0 = new AnonymousClass5DL(exc);
        AnonymousClass00C.A0D(r0, 0);
        r2.invoke(new AnonymousClass0AK(C90524aI.A0t(r0)));
    }

    public C145966uo(String str, C006302t r2, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = r2;
    }
}
