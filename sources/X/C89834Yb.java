package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.4Yb  reason: invalid class name and case insensitive filesystem */
public class C89834Yb implements Comparator {
    public final int A00;

    public C89834Yb(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return C007103b.A0c(iterable, new C89834Yb(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fd, code lost:
        return X.C05590Qh.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0119, code lost:
        return X.C05590Qh.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return X.C05590Qh.A00(r2, java.lang.Long.valueOf(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0109;
                case 2: goto L_0x0100;
                case 3: goto L_0x00e4;
                case 4: goto L_0x004d;
                case 5: goto L_0x00be;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00a4;
                case 8: goto L_0x0093;
                case 9: goto L_0x001a;
                case 10: goto L_0x0085;
                case 11: goto L_0x006b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.2go r7 = (X.C48162go) r7
            long r0 = r7.A02
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.2go r6 = (X.C48162go) r6
            long r0 = r6.A02
        L_0x0011:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = X.C05590Qh.A00(r2, r0)
            return r0
        L_0x001a:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse r7 = (com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse) r7
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r7.B8g()
            java.lang.String r1 = "creation_time"
            java.lang.String r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x0030
            X.9Y8 r7 = (X.AnonymousClass9Y8) r7
            org.json.JSONObject r0 = r7.A00
            java.lang.String r0 = X.C36411kG.A10(r1, r0)
        L_0x0030:
            java.lang.Long r2 = X.C36431kI.A15(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse r6 = (com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse) r6
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r6.B8g()
            java.lang.String r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x0048
            X.9Y8 r6 = (X.AnonymousClass9Y8) r6
            org.json.JSONObject r0 = r6.A00
            java.lang.String r0 = X.C36411kG.A10(r1, r0)
        L_0x0048:
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x0011
        L_0x004d:
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            long r0 = r7.A0I
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            long r0 = r6.A0I
            goto L_0x0011
        L_0x005a:
            X.3Iq r6 = (X.C63073Iq) r6
            X.3KU r0 = r6.A01
            long r0 = r0.A04
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.3Iq r7 = (X.C63073Iq) r7
            X.3KU r0 = r7.A01
            long r0 = r0.A04
            goto L_0x0011
        L_0x006b:
            X.011 r7 = (X.AnonymousClass011) r7
            java.lang.Object r0 = r7.second
            int r0 = X.AnonymousClass000.A0I(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.011 r6 = (X.AnonymousClass011) r6
            java.lang.Object r0 = r6.second
            int r0 = X.AnonymousClass000.A0I(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0115
        L_0x0085:
            X.4Us r6 = (X.C88964Us) r6
            java.lang.String r1 = r6.BF9()
            X.4Us r7 = (X.C88964Us) r7
            java.lang.String r0 = r7.BF9()
            goto L_0x0115
        L_0x0093:
            X.2am r7 = (X.C46692am) r7
            X.3X9 r0 = r7.A00
            java.lang.String r1 = r0.A01()
            X.2am r6 = (X.C46692am) r6
            X.3X9 r0 = r6.A00
            java.lang.String r0 = r0.A01()
            goto L_0x0115
        L_0x00a4:
            X.3HY r6 = (X.AnonymousClass3HY) r6
            java.lang.String r1 = r6.A00
            X.3HY r7 = (X.AnonymousClass3HY) r7
            java.lang.String r0 = r7.A00
            goto L_0x0115
        L_0x00ad:
            boolean r0 = r6 instanceof X.C46672ak
            r0 = r0 ^ 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7 instanceof X.C46672ak
            r0 = r0 ^ 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0115
        L_0x00be:
            boolean r1 = r6 instanceof X.C46542Yg
            java.lang.Integer r4 = X.C36361kB.A0i()
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = X.C36381kD.A0m()
            if (r1 == 0) goto L_0x00dd
            r1 = r2
        L_0x00d2:
            boolean r0 = r7 instanceof X.C46542Yg
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r7 instanceof X.C46552Yh
            r2 = r3
            if (r0 == 0) goto L_0x00f9
            r2 = r4
            goto L_0x00f9
        L_0x00dd:
            boolean r0 = r6 instanceof X.C46552Yh
            r1 = r3
            if (r0 == 0) goto L_0x00d2
            r1 = r4
            goto L_0x00d2
        L_0x00e4:
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            X.3KQ r0 = r6.A0N()
            r2 = 0
            if (r0 == 0) goto L_0x00fe
            java.lang.Integer r1 = r0.A02
        L_0x00ef:
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            X.3KQ r0 = r7.A0N()
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r2 = r0.A02
        L_0x00f9:
            int r0 = X.C05590Qh.A00(r1, r2)
            return r0
        L_0x00fe:
            r1 = r2
            goto L_0x00ef
        L_0x0100:
            X.3JW r6 = (X.AnonymousClass3JW) r6
            java.lang.String r1 = r6.A03
            X.3JW r7 = (X.AnonymousClass3JW) r7
            java.lang.String r0 = r7.A03
            goto L_0x0115
        L_0x0109:
            X.011 r6 = (X.AnonymousClass011) r6
            java.lang.Object r1 = r6.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.011 r7 = (X.AnonymousClass011) r7
            java.lang.Object r0 = r7.first
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x0115:
            int r0 = X.C05590Qh.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89834Yb.compare(java.lang.Object, java.lang.Object):int");
    }
}
