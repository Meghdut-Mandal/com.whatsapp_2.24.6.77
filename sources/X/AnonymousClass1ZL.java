package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ZL  reason: invalid class name */
public final class AnonymousClass1ZL {
    public final AnonymousClass16I A00;
    public final C19970wo A01;
    public final C220412q A02;
    public final C26141Ja A03;
    public final AnonymousClass1ZJ A04;
    public final AnonymousClass1ZM A05;
    public final C19700wN A06;
    public final AnonymousClass17Y A07;
    public final AnonymousClass1DP A08;
    public final AnonymousClass12O A09;
    public final AnonymousClass1GQ A0A;
    public final AnonymousClass1ZK A0B;

    public AnonymousClass1ZL(C19700wN r2, AnonymousClass17Y r3, AnonymousClass16I r4, C19970wo r5, AnonymousClass1DP r6, C220412q r7, C26141Ja r8, AnonymousClass12O r9, AnonymousClass1GQ r10, AnonymousClass1ZK r11, AnonymousClass1ZJ r12, AnonymousClass1ZM r13) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass00C.A0D(r9, 10);
        AnonymousClass00C.A0D(r11, 12);
        this.A01 = r5;
        this.A07 = r3;
        this.A06 = r2;
        this.A02 = r7;
        this.A08 = r6;
        this.A03 = r8;
        this.A00 = r4;
        this.A0A = r10;
        this.A04 = r12;
        this.A09 = r9;
        this.A05 = r13;
        this.A0B = r11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3JG A05(X.C44072La r10, X.AnonymousClass3NQ r11, boolean r12) {
        /*
            r4 = 0
            if (r12 == 0) goto L_0x005e
            if (r10 == 0) goto L_0x0063
            long r0 = r10.A05
        L_0x0007:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x000b:
            r2 = -1
            if (r0 == 0) goto L_0x005b
            long r8 = r0.longValue()
        L_0x0013:
            if (r12 == 0) goto L_0x0054
            if (r10 == 0) goto L_0x0059
            java.lang.String r7 = r10.A0M
        L_0x0019:
            if (r11 != 0) goto L_0x0022
            r5 = r8
        L_0x001c:
            X.3JG r4 = new X.3JG
            r4.<init>(r5, r7, r8)
            return r4
        L_0x0022:
            java.lang.String r1 = r11.A00
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = r11.A01
            if (r0 != 0) goto L_0x002e
            r5 = r8
        L_0x002b:
            r7 = r4
            r8 = r2
            goto L_0x001c
        L_0x002e:
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x004e
            java.lang.Long r0 = X.AnonymousClass097.A04(r0)
            if (r0 == 0) goto L_0x004e
            long r5 = r0.longValue()
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            r1 = r7
        L_0x003f:
            r4 = r1
            if (r1 == 0) goto L_0x002b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002b
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
            r2 = r8
            goto L_0x002b
        L_0x004e:
            r5 = -1
            goto L_0x003c
        L_0x0051:
            r2 = 0
            goto L_0x002b
        L_0x0054:
            if (r10 == 0) goto L_0x0059
            java.lang.String r7 = r10.A0L
            goto L_0x0019
        L_0x0059:
            r7 = r4
            goto L_0x0019
        L_0x005b:
            r8 = -1
            goto L_0x0013
        L_0x005e:
            if (r10 == 0) goto L_0x0063
            long r0 = r10.A06
            goto L_0x0007
        L_0x0063:
            r0 = r4
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZL.A05(X.2La, X.3NQ, boolean):X.3JG");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c7, code lost:
        if (r11 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c1, code lost:
        if (r11 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C44072La A09(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r56) {
        /*
            r55 = this;
            r3 = 0
            android.os.Parcelable$Creator r0 = X.C28981Uw.CREATOR
            r1 = r56
            X.9Y8 r1 = (X.AnonymousClass9Y8) r1
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A07(r0)
            X.1Uw r9 = X.C65313Ro.A00(r0)
            r4 = r55
            X.12q r10 = r4.A02
            X.3Qp r0 = r10.A09(r9, r3)
            X.3Qp r2 = A00(r0, r4)
            boolean r0 = r2 instanceof X.C44072La
            if (r0 == 0) goto L_0x01fa
            X.2La r2 = (X.C44072La) r2
        L_0x0023:
            r6 = -1
            r20 = 0
            if (r2 == 0) goto L_0x01f6
            long r0 = r2.A02
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x01f6
        L_0x002f:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01f2
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r0 = r0.BFu()
        L_0x0039:
            r13 = 0
            r8 = 1
            X.3NQ r0 = A06(r0, r3)
            X.3JG r1 = A05(r2, r0, r8)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01ee
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r0 = r0.BG9()
        L_0x004d:
            X.3NQ r0 = A07(r0, r3)
            X.3JG r5 = A05(r2, r0, r3)
            X.1ZJ r0 = r4.A04
            r18 = r0
            r19 = r2
            r21 = r9
            r22 = r1
            r23 = r5
            r18.A05(r19, r20, r21, r22, r23)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01ea
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r14 = r0.BEQ()
        L_0x006e:
            if (r2 == 0) goto L_0x01d3
            X.3Qp r3 = r2.A0R
        L_0x0072:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01bd
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r11 = r0.BHP()
            if (r11 == 0) goto L_0x01bf
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r11.BGS()
            if (r0 == 0) goto L_0x01bf
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r18 = r0.BIn()
        L_0x0088:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r11.BGS()
            if (r0 == 0) goto L_0x01c5
            X.1Ak r19 = r0.B8q()
        L_0x0092:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r11.BGS()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = r0.BBV()
            if (r0 == 0) goto L_0x01cb
            long r16 = java.lang.Long.parseLong(r0)
        L_0x00a2:
            if (r2 == 0) goto L_0x01b9
            long r11 = r2.A02
        L_0x00a6:
            if (r14 == 0) goto L_0x01b3
            java.lang.String r29 = r14.BIF()
            java.lang.String r0 = r14.getId()
            if (r0 == 0) goto L_0x01b5
            long r40 = java.lang.Long.parseLong(r0)
        L_0x00b6:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01af
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r0.BB0()
            if (r0 == 0) goto L_0x01af
            java.lang.String r30 = r0.BIF()
        L_0x00c6:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01ab
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r0.BB0()
            if (r0 == 0) goto L_0x01ab
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x01ab
            long r42 = java.lang.Long.parseLong(r0)
        L_0x00dc:
            java.lang.String r0 = r1.A02
            r31 = r0
            long r0 = r1.A01
            r46 = r0
            java.lang.String r0 = r5.A02
            r21 = r0
            long r14 = r5.A01
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x01a3
            java.lang.String r0 = r0.BAQ()
            if (r0 == 0) goto L_0x01a3
            long r48 = java.lang.Long.parseLong(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r48 = r48 * r0
        L_0x00fe:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x019f
            java.lang.String r33 = r0.BCD()
        L_0x0108:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x019b
            java.lang.String r34 = r0.BCr()
        L_0x0112:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = r0.BI0()
            if (r0 == 0) goto L_0x0122
            long r6 = java.lang.Long.parseLong(r0)
        L_0x0122:
            if (r2 == 0) goto L_0x0198
            X.2pL r1 = r2.A09
        L_0x0126:
            X.2oz r25 = X.C52162oz.PUBLIC
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x0195
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = r0.BIy()
            if (r0 == 0) goto L_0x0195
            int r0 = r0.ordinal()
            if (r0 != r8) goto L_0x0195
            X.2p1 r27 = X.C52182p1.VERIFIED
        L_0x013c:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r56.BIH()
            if (r0 == 0) goto L_0x0146
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r20 = r0.BIz()
        L_0x0146:
            X.2pA r24 = A04(r20)
            X.2pB r26 = X.C52282pB.NOT_ENFORCED
            if (r2 == 0) goto L_0x0152
            boolean r8 = r2.A0O
            int r13 = r2.A01
        L_0x0152:
            X.2pM r23 = A03(r18)
            java.lang.Long r28 = java.lang.Long.valueOf(r16)
            java.util.ArrayList r35 = new java.util.ArrayList
            r35.<init>()
            X.2pS r22 = X.C52452pS.DEFAULT
            r37 = 1
            X.2La r0 = new X.2La
            r53 = 0
            r54 = 0
            r32 = r21
            r36 = r13
            r38 = r11
            r44 = r46
            r46 = r14
            r50 = r6
            r52 = r8
            r18 = r0
            r20 = r3
            r21 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54)
            r0.A0K(r2)
            r10.A0I(r0, r9)
            if (r2 == 0) goto L_0x0194
            X.1Ja r2 = r4.A03
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.AnonymousClass00C.A08(r1)
            r2.A0A(r1)
        L_0x0194:
            return r0
        L_0x0195:
            X.2p1 r27 = X.C52182p1.NOT_VERIFIED
            goto L_0x013c
        L_0x0198:
            X.2pL r1 = X.C52382pL.GUEST
            goto L_0x0126
        L_0x019b:
            r34 = r20
            goto L_0x0112
        L_0x019f:
            r33 = r20
            goto L_0x0108
        L_0x01a3:
            X.0wo r0 = r4.A01
            long r48 = X.C19970wo.A00(r0)
            goto L_0x00fe
        L_0x01ab:
            r42 = -1
            goto L_0x00dc
        L_0x01af:
            r30 = r20
            goto L_0x00c6
        L_0x01b3:
            r29 = r20
        L_0x01b5:
            r40 = -1
            goto L_0x00b6
        L_0x01b9:
            r11 = -1
            goto L_0x00a6
        L_0x01bd:
            r11 = r20
        L_0x01bf:
            r18 = r20
            if (r11 == 0) goto L_0x01c5
            goto L_0x0088
        L_0x01c5:
            r19 = r20
            if (r11 == 0) goto L_0x01cb
            goto L_0x0092
        L_0x01cb:
            X.0wo r0 = r4.A01
            long r16 = X.C19970wo.A00(r0)
            goto L_0x00a2
        L_0x01d3:
            if (r14 == 0) goto L_0x01e7
            java.lang.String r0 = r14.BIF()
        L_0x01d9:
            X.3Qp r3 = new X.3Qp
            r3.<init>((X.AnonymousClass11F) r9)
            r3.A0W = r6
            r3.A0h = r0
            r0 = 4
            r3.A02 = r0
            goto L_0x0072
        L_0x01e7:
            r0 = r20
            goto L_0x01d9
        L_0x01ea:
            r14 = r20
            goto L_0x006e
        L_0x01ee:
            r0 = r20
            goto L_0x004d
        L_0x01f2:
            r0 = r20
            goto L_0x0039
        L_0x01f6:
            r2 = r20
            goto L_0x002f
        L_0x01fa:
            r2 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZL.A09(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields):X.2La");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c8, code lost:
        if (r13 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ce, code lost:
        if (r13 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d4, code lost:
        if (r13 == null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01dd, code lost:
        if (r7 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e2, code lost:
        if (r7 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (((X.C44072La) r2).A0P == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C44072La A0B(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r51, X.C28981Uw r52, boolean r53) {
        /*
            r50 = this;
            r3 = 0
            r10 = r52
            X.AnonymousClass00C.A0D(r10, r3)
            r6 = r51
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r13 = r6.BIH()
            r0 = r50
            X.12q r8 = r0.A02
            X.3Qp r1 = r8.A09(r10, r3)
            X.3Qp r9 = A00(r1, r0)
            boolean r1 = r9 instanceof X.C44072La
            r7 = 0
            if (r1 == 0) goto L_0x0030
            X.2La r9 = (X.C44072La) r9
            if (r9 == 0) goto L_0x0031
            long r1 = r9.A02
            r11 = 0
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0031
            r1 = r53
            X.2La r13 = r0.A02(r9, r6, r10, r1)
            return r13
        L_0x0030:
            r9 = r7
        L_0x0031:
            X.1Ja r2 = r0.A03
            if (r13 == 0) goto L_0x01f4
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r1 = r13.BEQ()
            if (r1 == 0) goto L_0x01f4
            java.lang.String r1 = r1.BIF()
        L_0x003f:
            X.011 r1 = r2.A06(r10, r1)
            java.lang.Object r15 = r1.first
            X.3Qp r15 = (X.C65073Qp) r15
            java.lang.Object r1 = r1.second
            java.lang.Number r1 = (java.lang.Number) r1
            long r33 = r1.longValue()
            X.3Qp r2 = r8.A09(r10, r3)
            boolean r1 = r2 instanceof X.C44072La
            if (r1 == 0) goto L_0x005f
            X.2La r2 = (X.C44072La) r2
            boolean r1 = r2.A0P
            r48 = 1
            if (r1 != 0) goto L_0x0061
        L_0x005f:
            r48 = 0
        L_0x0061:
            if (r13 == 0) goto L_0x01f1
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r1 = r13.BFu()
        L_0x0067:
            X.3NQ r2 = A06(r1, r3)
            r1 = 1
            r5 = r7
            X.3JG r4 = A05(r7, r2, r1)
            if (r13 == 0) goto L_0x01ee
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r1 = r13.BG9()
        L_0x0077:
            X.3NQ r1 = A07(r1, r3)
            X.3JG r3 = A05(r7, r1, r3)
            X.1ZJ r1 = r0.A04
            r21 = r3
            r16 = r1
            r17 = r9
            r18 = r7
            r19 = r10
            r20 = r4
            r16.A05(r17, r18, r19, r20, r21)
            r45 = -1
            if (r9 == 0) goto L_0x00a1
            long r1 = r9.A02
            int r10 = (r1 > r45 ? 1 : (r1 == r45 ? 0 : -1))
            if (r10 != 0) goto L_0x00a1
            X.11F r1 = r9.A06()
            r8.A0J(r1)
        L_0x00a1:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r1 = r6.BIH()
            if (r1 == 0) goto L_0x01dc
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r7 = r1.BHP()
            if (r7 == 0) goto L_0x01dc
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r1 = r7.BGS()
            if (r1 == 0) goto L_0x01dc
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r12 = r1.BIn()
        L_0x00b7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r1 = r7.BGS()
            if (r1 == 0) goto L_0x01e1
            X.1Ak r14 = r1.B8q()
        L_0x00c1:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r1 = r7.BGS()
            if (r1 == 0) goto L_0x01e6
            java.lang.String r1 = r1.BBV()
            if (r1 == 0) goto L_0x01e6
            long r10 = java.lang.Long.parseLong(r1)
        L_0x00d1:
            if (r13 == 0) goto L_0x01c6
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r1 = r13.BEQ()
            if (r1 == 0) goto L_0x01c6
            java.lang.String r24 = r1.BIF()
        L_0x00dd:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r1 = r13.BEQ()
            if (r1 == 0) goto L_0x01cc
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L_0x01cc
            long r35 = java.lang.Long.parseLong(r1)
        L_0x00ed:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r1 = r13.BB0()
            if (r1 == 0) goto L_0x01d2
            java.lang.String r25 = r1.BIF()
        L_0x00f7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r1 = r13.BB0()
            if (r1 == 0) goto L_0x01d8
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L_0x01d8
            long r37 = java.lang.Long.parseLong(r1)
        L_0x0107:
            java.lang.String r9 = r4.A02
            long r7 = r4.A01
            java.lang.String r4 = r3.A02
            long r2 = r3.A01
            X.2oz r20 = X.C52162oz.PUBLIC
            if (r13 == 0) goto L_0x01b8
            java.lang.String r1 = r13.BAQ()
            if (r1 == 0) goto L_0x01b8
            long r43 = java.lang.Long.parseLong(r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r43 = r43 * r0
        L_0x0121:
            java.lang.String r28 = r13.BCD()
            java.lang.String r29 = r13.BCr()
            java.lang.String r0 = r13.BI0()
            if (r0 == 0) goto L_0x0133
            long r45 = java.lang.Long.parseLong(r0)
        L_0x0133:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r0 = r6.BJA()
            if (r0 == 0) goto L_0x01b6
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r0 = r0.BGr()
        L_0x013d:
            X.2pL r16 = A01(r0)
            if (r13 == 0) goto L_0x01b0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = r13.BIy()
            if (r0 == 0) goto L_0x01b0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x01b0
            X.2p1 r22 = X.C52182p1.VERIFIED
        L_0x0152:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r0 = r13.BIz()
        L_0x0156:
            X.2pA r19 = A04(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r0 = r6.BJA()
            if (r0 == 0) goto L_0x0164
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r5 = r0.BEO()
        L_0x0164:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            r47 = 0
            if (r5 != r0) goto L_0x016c
            r47 = 1
        L_0x016c:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r6.BHu()
            if (r0 == 0) goto L_0x01ad
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = r0.BIc()
            if (r0 == 0) goto L_0x01ad
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L_0x01ad
            r1 = 2
            if (r0 == r1) goto L_0x01aa
            r1 = 3
            if (r0 != r1) goto L_0x01ad
            X.2pB r21 = X.C52282pB.GEOSUSPENDED
        L_0x0187:
            X.2pM r18 = A03(r12)
            java.lang.Long r23 = java.lang.Long.valueOf(r10)
            java.util.ArrayList r30 = new java.util.ArrayList
            r30.<init>()
            X.2pS r17 = X.C52452pS.DEFAULT
            r32 = 1
            X.2La r13 = new X.2La
            r31 = 0
            r49 = 0
            r26 = r9
            r27 = r4
            r39 = r7
            r41 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r43, r45, r47, r48, r49)
            return r13
        L_0x01aa:
            X.2pB r21 = X.C52282pB.SUSPENDED
            goto L_0x0187
        L_0x01ad:
            X.2pB r21 = X.C52282pB.NOT_ENFORCED
            goto L_0x0187
        L_0x01b0:
            X.2p1 r22 = X.C52182p1.NOT_VERIFIED
            if (r13 != 0) goto L_0x0152
            r0 = r5
            goto L_0x0156
        L_0x01b6:
            r0 = r5
            goto L_0x013d
        L_0x01b8:
            X.0wo r0 = r0.A01
            long r43 = X.C19970wo.A00(r0)
            if (r13 != 0) goto L_0x0121
            r28 = r5
            r29 = r5
            goto L_0x0133
        L_0x01c6:
            r24 = r5
            if (r13 == 0) goto L_0x01cc
            goto L_0x00dd
        L_0x01cc:
            r35 = -1
            if (r13 == 0) goto L_0x01d2
            goto L_0x00ed
        L_0x01d2:
            r25 = r5
            if (r13 == 0) goto L_0x01d8
            goto L_0x00f7
        L_0x01d8:
            r37 = -1
            goto L_0x0107
        L_0x01dc:
            r12 = r5
            if (r7 == 0) goto L_0x01e1
            goto L_0x00b7
        L_0x01e1:
            r14 = r5
            if (r7 == 0) goto L_0x01e6
            goto L_0x00c1
        L_0x01e6:
            X.0wo r1 = r0.A01
            long r10 = X.C19970wo.A00(r1)
            goto L_0x00d1
        L_0x01ee:
            r1 = r7
            goto L_0x0077
        L_0x01f1:
            r1 = r7
            goto L_0x0067
        L_0x01f4:
            r1 = r7
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZL.A0B(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields, X.1Uw, boolean):X.2La");
    }

    public final NewsletterMetadataQueryImpl$Builder A0C(C44072La r5, XWA2NewsletterInput xWA2NewsletterInput, C198239d8 r7) {
        boolean z;
        AnonymousClass00C.A0D(r7, 1);
        boolean z2 = false;
        if (r5 != null) {
            z = r5.A0N();
        } else {
            z = false;
        }
        if (r7.A0B && !z) {
            z2 = true;
        }
        NewsletterMetadataQueryImpl$Builder A0D = A0D(xWA2NewsletterInput, r7);
        A0D.A00.A01("fetch_viewer_metadata", Boolean.valueOf(z2));
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x009d, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r5.A0A.A00, 4887) == false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder A0D(com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput r6, X.C198239d8 r7) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r4 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder
            r4.<init>()
            X.9VA r3 = r4.A00
            java.lang.String r0 = "input"
            r3.A00(r6, r0)
            r0 = 1
            r4.A01 = r0
            boolean r0 = r7.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_image"
            r3.A01(r0, r1)
            boolean r0 = r7.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_preview"
            r3.A01(r0, r1)
            boolean r0 = r7.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_viewer_metadata"
            r3.A01(r0, r1)
            boolean r0 = r7.A08
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_state"
            r3.A01(r0, r1)
            boolean r0 = r7.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_name"
            r3.A01(r0, r1)
            boolean r0 = r7.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_creation_time"
            r3.A01(r0, r1)
            boolean r0 = r7.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_description"
            r3.A01(r0, r1)
            boolean r0 = r7.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_invite"
            r3.A01(r0, r1)
            boolean r0 = r7.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_handle"
            r3.A01(r0, r1)
            boolean r0 = r7.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_subscribers_count"
            r3.A01(r0, r1)
            boolean r0 = r7.A0A
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_verification"
            r3.A01(r0, r1)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x009f
            X.1GQ r0 = r5.A0A
            X.0yC r2 = r0.A00
            r1 = 4887(0x1317, float:6.848E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_settings"
            r3.A01(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZL.A0D(com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput, X.9d8):com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder");
    }

    public final void A0F(AnonymousClass11F r4) {
        this.A08.A02(r4, false);
        this.A07.A0H(new C35741jB(this, r4, 33));
    }

    public static final C65073Qp A00(C65073Qp r4, AnonymousClass1ZL r5) {
        if (r4 == null) {
            return null;
        }
        if (!(r4 instanceof C44072La)) {
            C19700wN r3 = r5.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("Expected type NewsletterInfo but found type ");
            sb.append(r4.getClass().getName());
            r3.A0E("NewsletterGraphqlUtils/ChatsCache entry is not NewsletterInfo", sb.toString(), true);
        }
        return r4;
    }

    public static final C52382pL A01(GraphQLXWA2NewsletterRole graphQLXWA2NewsletterRole) {
        if (graphQLXWA2NewsletterRole != null) {
            int ordinal = graphQLXWA2NewsletterRole.ordinal();
            if (ordinal == 3) {
                return C52382pL.SUBSCRIBED;
            }
            if (ordinal == 2) {
                return C52382pL.ADMIN;
            }
            if (ordinal == 1) {
                return C52382pL.OWNER;
            }
        }
        return C52382pL.GUEST;
    }

    public static final C52392pM A03(GraphQLXWA2NewsletterReactionCodesSettingValue graphQLXWA2NewsletterReactionCodesSettingValue) {
        if (graphQLXWA2NewsletterReactionCodesSettingValue != null) {
            int ordinal = graphQLXWA2NewsletterReactionCodesSettingValue.ordinal();
            if (ordinal == 1) {
                return C52392pM.ALL;
            }
            if (ordinal != 2) {
                if (ordinal == 4) {
                    return C52392pM.NONE;
                }
                if (ordinal == 3) {
                    return C52392pM.BLOCKLIST;
                }
            }
        }
        return C52392pM.DEFAULT;
    }

    public static final C52272pA A04(GraphQLXWA2NewsletterVerifySource graphQLXWA2NewsletterVerifySource) {
        int ordinal;
        if (!(graphQLXWA2NewsletterVerifySource == null || (ordinal = graphQLXWA2NewsletterVerifySource.ordinal()) == 0)) {
            if (ordinal == 1) {
                return C52272pA.META_VERIFIED_SUBSCRIPTION;
            }
            if (ordinal == 2) {
                return C52272pA.LEGACY_MANUAL_REVIEW;
            }
        }
        return C52272pA.UNKNOWN_VERIFICATION_SOURCE;
    }

    public static final AnonymousClass3NQ A06(NewsletterMetadataFields.ThreadMetadata.Picture picture, boolean z) {
        if (picture != null) {
            String BB9 = picture.BB9();
            if (!(BB9 == null || BB9.length() == 0)) {
                String id = picture.getId();
                picture.BId();
                picture.BIk();
                return new AnonymousClass3NQ(id, picture.BB9());
            }
        } else if (!z) {
            return null;
        }
        return new AnonymousClass2YJ();
    }

    public static final AnonymousClass3NQ A07(NewsletterMetadataFields.ThreadMetadata.Preview preview, boolean z) {
        if (preview != null) {
            String BB9 = preview.BB9();
            if (!(BB9 == null || BB9.length() == 0)) {
                String id = preview.getId();
                preview.BId();
                preview.BIk();
                return new AnonymousClass3NQ(id, preview.BB9());
            }
        } else if (!z) {
            return null;
        }
        return new AnonymousClass2YJ();
    }

    public static final boolean A08(NewsletterMutationResponseFragmentImpl newsletterMutationResponseFragmentImpl) {
        Enum enumR;
        AnonymousClass9Y8 A032;
        if (newsletterMutationResponseFragmentImpl == null || (A032 = newsletterMutationResponseFragmentImpl.A03(NewsletterMutationResponseFragmentImpl.NewsletterState.class, "newsletter_state")) == null) {
            enumR = null;
        } else {
            enumR = A032.A06(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        if (enumR == GraphQLXWA2NewsletterStateType.ACTIVE) {
            return true;
        }
        return false;
    }

    public final C44072La A0A(NewsletterMetadataFields newsletterMetadataFields, C28981Uw r5) {
        C44072La r2;
        C65073Qp A002 = A00(this.A02.A09(r5, false), this);
        if (!(A002 instanceof C44072La) || (r2 = (C44072La) A002) == null) {
            return null;
        }
        return A02(r2, newsletterMetadataFields, r5, false);
    }

    public final UserJid A0E(UserJid userJid) {
        PhoneUserJid phoneUserJid;
        C223313w A092;
        if (!(userJid instanceof PhoneUserJid) || (phoneUserJid = (PhoneUserJid) userJid) == null || (A092 = this.A09.A09(phoneUserJid)) == null) {
            return userJid;
        }
        return A092;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016c, code lost:
        if (r5 == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.A01) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016e, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016f, code lost:
        if (r9 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0171, code lost:
        r11 = r9.BCr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0175, code lost:
        if (r11 != null) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0177, code lost:
        r11 = r8.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0179, code lost:
        if (r9 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x017b, code lost:
        r9 = r9.BCD();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x017f, code lost:
        if (r9 != null) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0181, code lost:
        r9 = r8.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0183, code lost:
        r32 = r10.A02;
        r36 = java.lang.Long.valueOf(r26);
        r34 = r8.A02;
        r30 = r8.A0Q;
        r29 = r8.A0S;
        r27 = r8.A0P;
        r5 = r8.A0A;
        X.AnonymousClass00C.A0D(r14, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e0, code lost:
        return new X.C44072La(r24, r8, r14, r5, r25, r16, r33, r12, r13, r36, r23, r15, r28, r32, r9, r11, r29, r6, r8.A00, r34, r21, r19, r0, r2, r30, r17, r7, r27, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e1, code lost:
        r7 = r8.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e4, code lost:
        r13 = X.C52182p1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e8, code lost:
        r13 = r8.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ea, code lost:
        if (r9 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ee, code lost:
        r16 = r8.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f4, code lost:
        r14 = r8.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f8, code lost:
        r19 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01fc, code lost:
        if (r9 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0200, code lost:
        r17 = r8.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x020a, code lost:
        if (r9 != null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x022e, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f6, code lost:
        if (r9 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0112, code lost:
        if (r15 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0116, code lost:
        if (r9 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0118, code lost:
        r4 = r9.BB0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011c, code lost:
        if (r4 == null) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011e, code lost:
        r4 = r4.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0122, code lost:
        if (r4 == null) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0124, code lost:
        r19 = java.lang.Long.parseLong(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0128, code lost:
        r4 = r9.BI0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012c, code lost:
        if (r4 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012e, code lost:
        r17 = java.lang.Long.parseLong(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0132, code lost:
        r33 = X.C52162oz.A03;
        r4 = r65.BJA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0138, code lost:
        if (r4 == null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013a, code lost:
        r4 = r4.BGr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013e, code lost:
        if (r4 == null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0140, code lost:
        r14 = A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0144, code lost:
        if (r9 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0146, code lost:
        r4 = r9.BIy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014a, code lost:
        if (r4 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0150, code lost:
        if (r4.ordinal() != 1) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0152, code lost:
        r13 = X.C52182p1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0154, code lost:
        r4 = r9.BIz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0158, code lost:
        if (r4 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015a, code lost:
        r16 = A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015e, code lost:
        r4 = r65.BJA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0162, code lost:
        if (r4 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0164, code lost:
        r5 = r4.BEO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0168, code lost:
        if (r5 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C44072La A02(X.C44072La r64, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r65, X.C28981Uw r66, boolean r67) {
        /*
            r63 = this;
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BIH()
            r28 = 0
            if (r0 == 0) goto L_0x0242
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r0 = r0.BFu()
        L_0x000c:
            r1 = r67
            X.3NQ r0 = A06(r0, r1)
            r7 = 1
            r8 = r64
            X.3JG r9 = A05(r8, r0, r7)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BIH()
            if (r0 == 0) goto L_0x023e
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r0 = r0.BG9()
        L_0x0023:
            X.3NQ r0 = A07(r0, r1)
            r6 = 0
            X.3JG r10 = A05(r8, r0, r6)
            r5 = r63
            X.1ZJ r0 = r5.A04
            r1 = r66
            r11 = r0
            r12 = r8
            r13 = r28
            r14 = r1
            r15 = r9
            r16 = r10
            r11.A05(r12, r13, r14, r15, r16)
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x0048
            r8.A0N = r6
            X.1ZK r0 = r5.A0B
            r0.A02(r1)
        L_0x0048:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BIH()
            if (r0 == 0) goto L_0x023a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r1 = r0.BHP()
            if (r1 == 0) goto L_0x023b
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BGS()
            if (r0 == 0) goto L_0x023b
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r0 = r0.BIn()
        L_0x005e:
            X.2pM r25 = A03(r0)
            if (r1 == 0) goto L_0x022c
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BGS()
            if (r0 == 0) goto L_0x022c
            X.1Ak r24 = r0.B8q()
        L_0x006e:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BGS()
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = r0.BBV()
            if (r0 == 0) goto L_0x0232
            long r26 = java.lang.Long.parseLong(r0)
        L_0x007e:
            java.lang.Long r0 = r8.A0G
            if (r0 == 0) goto L_0x0094
            long r1 = r0.longValue()
            int r0 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
            X.2pM r0 = r8.A0B
            r25 = r0
            X.1Ak r0 = r8.A08
            r24 = r0
            r26 = r1
        L_0x0094:
            long r2 = r10.A01
            long r0 = r9.A01
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00a0
            java.lang.String r4 = r9.A02
            r28 = r4
        L_0x00a0:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x00a6
            r0 = -1
        L_0x00a6:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r4 = r65.BHu()
            if (r4 == 0) goto L_0x0228
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r4 = r4.BIc()
            if (r4 == 0) goto L_0x0228
            int r9 = r4.ordinal()
            if (r9 == r7) goto L_0x0224
            r4 = 2
            if (r9 == r4) goto L_0x0220
            r4 = 3
            if (r9 != r4) goto L_0x0228
            X.2pB r12 = X.C52282pB.GEOSUSPENDED
        L_0x00c0:
            int r9 = r12.ordinal()
            if (r9 == r7) goto L_0x020e
            r4 = 2
            if (r9 == r4) goto L_0x0213
            if (r9 != r6) goto L_0x0246
            X.1ZM r9 = r5.A05
            X.2pQ r4 = X.C52432pQ.SUSPENSION
            int r5 = r8.A01
            int r4 = r4.bitPosition
            int r4 = r7 << r4
            int r6 = ~r4
            r6 = r6 & r5
        L_0x00d7:
            X.1Ja r5 = r9.A00
            X.1Uw r4 = r8.A0J()
            r5.A08(r4, r6)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r9 = r65.BIH()
            if (r9 == 0) goto L_0x00f2
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r4 = r9.BEQ()
            if (r4 == 0) goto L_0x00f2
            java.lang.String r23 = r4.BIF()
            if (r23 != 0) goto L_0x00f8
        L_0x00f2:
            java.lang.String r4 = r8.A0K
            r23 = r4
            if (r9 == 0) goto L_0x0206
        L_0x00f8:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r4 = r9.BEQ()
            if (r4 == 0) goto L_0x0206
            java.lang.String r4 = r4.getId()
            if (r4 == 0) goto L_0x0206
            long r21 = java.lang.Long.parseLong(r4)
        L_0x0108:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r4 = r9.BB0()
            if (r4 == 0) goto L_0x0114
            java.lang.String r15 = r4.BIF()
            if (r15 != 0) goto L_0x0118
        L_0x0114:
            java.lang.String r15 = r8.A0H
            if (r9 == 0) goto L_0x01f8
        L_0x0118:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r4 = r9.BB0()
            if (r4 == 0) goto L_0x01f8
            java.lang.String r4 = r4.getId()
            if (r4 == 0) goto L_0x01f8
            long r19 = java.lang.Long.parseLong(r4)
        L_0x0128:
            java.lang.String r4 = r9.BI0()
            if (r4 == 0) goto L_0x0200
            long r17 = java.lang.Long.parseLong(r4)
        L_0x0132:
            X.2oz r33 = X.C52162oz.PUBLIC
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r4 = r65.BJA()
            if (r4 == 0) goto L_0x01f4
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r4 = r4.BGr()
            if (r4 == 0) goto L_0x01f4
            X.2pL r14 = A01(r4)
        L_0x0144:
            if (r9 == 0) goto L_0x01e8
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r4 = r9.BIy()
            if (r4 == 0) goto L_0x01e8
            int r4 = r4.ordinal()
            if (r4 != r7) goto L_0x01e4
            X.2p1 r13 = X.C52182p1.VERIFIED
        L_0x0154:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r4 = r9.BIz()
            if (r4 == 0) goto L_0x01ee
            X.2pA r16 = A04(r4)
        L_0x015e:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r4 = r65.BJA()
            if (r4 == 0) goto L_0x01e1
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r5 = r4.BEO()
            if (r5 == 0) goto L_0x01e1
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r4 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            if (r5 == r4) goto L_0x016f
            r7 = 0
        L_0x016f:
            if (r9 == 0) goto L_0x0177
            java.lang.String r11 = r9.BCr()
            if (r11 != 0) goto L_0x017b
        L_0x0177:
            java.lang.String r11 = r8.A0J
            if (r9 == 0) goto L_0x0181
        L_0x017b:
            java.lang.String r9 = r9.BCD()
            if (r9 != 0) goto L_0x0183
        L_0x0181:
            java.lang.String r9 = r8.A0I
        L_0x0183:
            java.lang.String r4 = r10.A02
            r32 = r4
            java.lang.Long r36 = java.lang.Long.valueOf(r26)
            long r4 = r8.A02
            r34 = r4
            long r4 = r8.A0Q
            r30 = r4
            java.util.List r4 = r8.A0S
            r29 = r4
            boolean r4 = r8.A0P
            r27 = r4
            X.2pS r5 = r8.A0A
            int r4 = r8.A00
            r10 = r4
            r4 = 14
            X.AnonymousClass00C.A0D(r14, r4)
            X.2La r26 = new X.2La
            r62 = 0
            r37 = r23
            r38 = r15
            r39 = r28
            r40 = r32
            r41 = r9
            r42 = r11
            r43 = r29
            r44 = r6
            r45 = r10
            r46 = r34
            r48 = r21
            r50 = r19
            r52 = r0
            r54 = r2
            r56 = r30
            r58 = r17
            r60 = r7
            r61 = r27
            r27 = r24
            r28 = r8
            r29 = r14
            r30 = r5
            r31 = r25
            r32 = r16
            r34 = r12
            r35 = r13
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r50, r52, r54, r56, r58, r60, r61, r62)
            return r26
        L_0x01e1:
            boolean r7 = r8.A0O
            goto L_0x016f
        L_0x01e4:
            X.2p1 r13 = X.C52182p1.NOT_VERIFIED
            goto L_0x0154
        L_0x01e8:
            X.2p1 r13 = r8.A0F
            if (r9 == 0) goto L_0x01ee
            goto L_0x0154
        L_0x01ee:
            X.2pA r4 = r8.A0C
            r16 = r4
            goto L_0x015e
        L_0x01f4:
            X.2pL r14 = r8.A09
            goto L_0x0144
        L_0x01f8:
            long r4 = r8.A03
            r19 = r4
            if (r9 == 0) goto L_0x0200
            goto L_0x0128
        L_0x0200:
            long r4 = r8.A07
            r17 = r4
            goto L_0x0132
        L_0x0206:
            long r4 = r8.A04
            r21 = r4
            if (r9 == 0) goto L_0x0114
            goto L_0x0108
        L_0x020e:
            X.1ZM r9 = r5.A05
            X.2pQ r4 = X.C52432pQ.SUSPENSION
            goto L_0x0217
        L_0x0213:
            X.1ZM r9 = r5.A05
            X.2pQ r4 = X.C52432pQ.GEOSUSPENSION
        L_0x0217:
            int r5 = r8.A01
            int r4 = r4.bitPosition
            int r6 = r7 << r4
            r6 = r6 | r5
            goto L_0x00d7
        L_0x0220:
            X.2pB r12 = X.C52282pB.SUSPENDED
            goto L_0x00c0
        L_0x0224:
            X.2pB r12 = X.C52282pB.NOT_ENFORCED
            goto L_0x00c0
        L_0x0228:
            X.2pB r12 = r8.A0E
            goto L_0x00c0
        L_0x022c:
            r24 = r13
            if (r1 == 0) goto L_0x0232
            goto L_0x006e
        L_0x0232:
            X.0wo r0 = r5.A01
            long r26 = X.C19970wo.A00(r0)
            goto L_0x007e
        L_0x023a:
            r1 = r13
        L_0x023b:
            r0 = r13
            goto L_0x005e
        L_0x023e:
            r0 = r28
            goto L_0x0023
        L_0x0242:
            r0 = r28
            goto L_0x000c
        L_0x0246:
            X.0jS r0 = new X.0jS
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZL.A02(X.2La, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields, X.1Uw, boolean):X.2La");
    }

    public final void A0G(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A062 = ((C65073Qp) it.next()).A06();
            AnonymousClass00C.A08(A062);
            A0F(A062);
        }
    }
}
