package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AHu  reason: case insensitive filesystem */
public class C21342AHu implements C236119d {
    public final UserJid A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass777 A02 = new AnonymousClass777();

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9ty] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "merchant_info"
            X.9nx r3 = r14.A0c(r0)
            r12 = 0
            if (r3 == 0) goto L_0x00b1
            java.lang.String r0 = "entity_name"
            X.9nx r2 = r3.A0c(r0)
            java.lang.String r0 = "entity_type"
            X.9nx r1 = r3.A0c(r0)
            java.lang.String r0 = "entity_type_custom"
            X.9nx r0 = r3.A0c(r0)
            if (r2 == 0) goto L_0x00cb
            java.lang.String r10 = r2.A0e()
        L_0x0021:
            if (r1 == 0) goto L_0x00c8
            java.lang.String r11 = r1.A0e()
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            java.lang.String r12 = r0.A0e()
        L_0x002d:
            java.lang.String r0 = "is_registered"
            java.lang.String r0 = X.C36391kE.A0x(r3, r0)
            boolean r6 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "customer_care_details"
            X.9nx r2 = r3.A0c(r0)
            java.lang.String r0 = "grievance_officer_details"
            X.9nx r3 = r3.A0c(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00c6
            java.lang.String r0 = "email"
            X.9nx r1 = r2.A0c(r0)
            java.lang.String r0 = "landline_number"
            X.9nx r4 = r2.A0c(r0)
            java.lang.String r0 = "mobile_number"
            X.9nx r2 = r2.A0c(r0)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = r1.A0e()
        L_0x005e:
            if (r4 == 0) goto L_0x00c2
            java.lang.String r0 = r4.A0e()
        L_0x0064:
            if (r2 == 0) goto L_0x006a
            java.lang.String r5 = r2.A0e()
        L_0x006a:
            X.9tf r7 = new X.9tf
            r7.<init>(r1, r0, r5)
        L_0x006f:
            r5 = 0
            if (r3 == 0) goto L_0x00c0
            java.lang.String r0 = "name"
            X.9nx r2 = r3.A0c(r0)
            java.lang.String r0 = "email"
            X.9nx r1 = r3.A0c(r0)
            java.lang.String r0 = "landline_number"
            X.9nx r4 = r3.A0c(r0)
            java.lang.String r0 = "mobile_number"
            X.9nx r3 = r3.A0c(r0)
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = r2.A0e()
        L_0x0090:
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = r1.A0e()
        L_0x0096:
            if (r4 == 0) goto L_0x00ba
            java.lang.String r0 = r4.A0e()
        L_0x009c:
            if (r3 == 0) goto L_0x00a2
            java.lang.String r5 = r3.A0e()
        L_0x00a2:
            X.9tq r8 = new X.9tq
            r8.<init>(r2, r1, r0, r5)
        L_0x00a7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            X.9ty r6 = new X.9ty
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r12 = r6
        L_0x00b1:
            r3 = 0
            if (r12 == 0) goto L_0x00ce
            X.777 r0 = r13.A02
            X.AnonymousClass9HO.A00(r3, r0, r12)
            return
        L_0x00ba:
            r0 = r5
            goto L_0x009c
        L_0x00bc:
            r1 = r5
            goto L_0x0096
        L_0x00be:
            r2 = r5
            goto L_0x0090
        L_0x00c0:
            r8 = r5
            goto L_0x00a7
        L_0x00c2:
            r0 = r5
            goto L_0x0064
        L_0x00c4:
            r1 = r5
            goto L_0x005e
        L_0x00c6:
            r7 = r5
            goto L_0x006f
        L_0x00c8:
            r11 = r12
            goto L_0x0027
        L_0x00cb:
            r10 = r12
            goto L_0x0021
        L_0x00ce:
            X.777 r2 = r13.A02
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.String r0 = "Merchant Info is Null"
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            X.AnonymousClass9HO.A00(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21342AHu.BiM(X.9nx, java.lang.String):void");
    }

    public C21342AHu(UserJid userJid, AnonymousClass19A r3) {
        this.A01 = r3;
        this.A00 = userJid;
    }

    public void BVN(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GetBusinessComplianceDetailProtocol/delivery-error with iqId ");
        A0u.append(str);
        C36341k9.A1O(A0u, ">");
        this.A02.BVM(new C52812qD(str));
    }

    public void BWw(C203399nx r5, String str) {
        Pair A012 = AnonymousClass3ME.A01(r5);
        if (A012 != null) {
            AnonymousClass9HO.A00(A012, this.A02, (Object) null);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetBusinessComplianceDetailProtocol/response-error with iqId <");
            A0u.append(str);
            C36321k7.A1L(A012, "> and error ", A0u);
            return;
        }
        AnonymousClass9HO.A00(C36441kJ.A0Q(C36361kB.A0i(), "error code is null"), this.A02, (Object) null);
    }
}
