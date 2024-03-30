package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.9dg  reason: invalid class name and case insensitive filesystem */
public class C198509dg {
    public final C193289Kw[] A00;

    public C198509dg(String str) {
        this.A00 = new C193289Kw[]{new C193289Kw(str, this), new C193289Kw(AnonymousClass000.A0p("X509 ", str, AnonymousClass000.A0u()), this), new C193289Kw("PKCS7", this)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r0 > 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.InputStream r5) {
        /*
            java.lang.StringBuffer r4 = X.C165607th.A0x()
        L_0x0004:
            int r3 = r5.read()
            r2 = 10
            r1 = 13
            if (r3 == r1) goto L_0x001f
            if (r3 == r2) goto L_0x001f
            if (r3 < 0) goto L_0x0017
            char r0 = (char) r3
            r4.append(r0)
            goto L_0x0004
        L_0x0017:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0037
            r0 = 0
            return r0
        L_0x001f:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0004
            if (r3 != r1) goto L_0x0037
            r1 = 1
            r5.mark(r1)
            int r0 = r5.read()
            if (r0 != r2) goto L_0x003c
            r5.mark(r1)
        L_0x0034:
            r5.reset()
        L_0x0037:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x003c:
            if (r0 <= 0) goto L_0x0037
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198509dg.A00(java.io.InputStream):java.lang.String");
    }

    public C22656AsM A01(InputStream inputStream) {
        String A002;
        C193289Kw[] r7;
        int length;
        C193289Kw r5;
        String A003;
        StringBuffer A0x = C165607th.A0x();
        loop0:
        while (true) {
            A002 = A00(inputStream);
            if (A002 != null) {
                int i = 0;
                while (true) {
                    r7 = this.A00;
                    length = r7.length;
                    if (i != length) {
                        r5 = r7[i];
                        if (!A002.startsWith(r5.A01) && !A002.startsWith(r5.A00)) {
                            i++;
                        }
                    }
                }
            } else {
                throw C90524aI.A0X("malformed PEM data: no header found");
            }
        }
        if (!A002.startsWith(r5.A01)) {
            throw C90524aI.A0X("malformed PEM data: found footer where header was expected");
        }
        loop2:
        while (true) {
            A003 = A00(inputStream);
            if (A003 != null) {
                int i2 = 0;
                while (i2 != length) {
                    C193289Kw r1 = r7[i2];
                    if (!A003.startsWith(r1.A01) && !A003.startsWith(r1.A00)) {
                        i2++;
                    }
                }
                A0x.append(A003);
            } else {
                throw C90524aI.A0X("malformed PEM data: no footer found");
            }
        }
        if (!A003.startsWith(r5.A00)) {
            throw C90524aI.A0X("malformed PEM data: header/footer mismatch");
        } else if (A0x.length() == 0) {
            return null;
        } else {
            try {
                String obj = A0x.toString();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((obj.length() / 4) * 3);
                C196869af.A00.B56(byteArrayOutputStream, obj);
                return C22656AsM.A04(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new AnonymousClass92O(C36331k8.A0i("unable to decode base64 string: ", AnonymousClass000.A0u(), e), e);
            } catch (Exception unused) {
                throw C90524aI.A0X("malformed PEM data encountered");
            }
        }
    }
}
