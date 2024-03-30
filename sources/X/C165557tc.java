package X;

import java.io.IOException;

/* renamed from: X.7tc  reason: invalid class name and case insensitive filesystem */
public class C165557tc implements C160087kR {
    public Object A00;
    public final int A01;

    public C165557tc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.6bE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r5) {
        /*
            r4 = this;
            int r1 = r4.A01
            r0 = 0
            switch(r1) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0058;
                case 2: goto L_0x008e;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.AnonymousClass00C.A0D(r5, r0)
            X.60z r0 = r5.A03
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.A00
            X.6Dj r0 = (X.C128726Dj) r0
            if (r1 == 0) goto L_0x0081
            X.67W r0 = r0.A01
            r0.A01(r1)
        L_0x001a:
            return
        L_0x001b:
            X.AnonymousClass00C.A0D(r5, r0)
            X.66O r1 = r5.A04
            r0 = 0
            java.lang.Object r3 = r1.A00(r0)
            java.lang.String r3 = (java.lang.String) r3
            X.60z r0 = r5.A03
            java.lang.Object r2 = r0.A00
            X.6bE r2 = (X.C134556bE) r2
            if (r2 == 0) goto L_0x0045
            java.lang.Object r1 = r4.A00
            X.09x r1 = (X.C023509x) r1
            java.util.List r0 = r2.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0099
            java.lang.String r1 = "Empty data returned by server"
            X.5UZ r0 = new X.5UZ
            r0.<init>(r1)
            r4.BWk(r0)
        L_0x0045:
            if (r3 == 0) goto L_0x001a
            java.lang.Object r1 = r4.A00
            X.09x r1 = (X.C023509x) r1
            X.5UZ r0 = new X.5UZ
            r0.<init>(r3)
            X.03N r0 = X.AnonymousClass00C.A02(r0)
            r1.resumeWith(r0)
            return
        L_0x0058:
            X.AnonymousClass00C.A0D(r5, r0)
            X.66O r1 = r5.A04
            r0 = 0
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Exception r0 = (java.lang.Exception) r0
            if (r0 != 0) goto L_0x007d
            X.60z r0 = r5.A03
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r4.A00
            X.09x r1 = (X.C023509x) r1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0099
            X.5Uc r0 = new X.5Uc
            r0.<init>()
        L_0x007d:
            r4.BWk(r0)
            return
        L_0x0081:
            X.67W r2 = r0.A01
            java.lang.String r1 = "Null Payload"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r2.A00(r0)
            return
        L_0x008e:
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r0 = r4.A00
            X.09x r0 = (X.C023509x) r0
            r0.resumeWith(r5)
            return
        L_0x0099:
            r1.resumeWith(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165557tc.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        switch (this.A01) {
            case 2:
                AnonymousClass00C.A0D(iOException, 0);
                break;
            case 3:
                AnonymousClass00C.A0D(iOException, 0);
                AnonymousClass67W r4 = ((C128726Dj) this.A00).A01;
                C122855vX r3 = r4.A03;
                r3.A02 = iOException;
                r3.A00 = 7;
                r4.A02.A02(r3, r4.A04, iOException.getLocalizedMessage());
                return;
            default:
                AnonymousClass00C.A0D(iOException, 0);
                iOException.getMessage();
                break;
        }
        ((C023509x) this.A00).resumeWith(C90524aI.A0t(iOException));
    }

    public void BWk(Exception exc) {
        switch (this.A01) {
            case 2:
                AnonymousClass00C.A0D(exc, 0);
                break;
            case 3:
                AnonymousClass00C.A0D(exc, 0);
                ((C128726Dj) this.A00).A01.A00(exc);
                return;
            default:
                AnonymousClass00C.A0D(exc, 0);
                exc.getMessage();
                break;
        }
        ((C023509x) this.A00).resumeWith(C90524aI.A0t(exc));
    }
}
