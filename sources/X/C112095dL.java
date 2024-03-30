package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResetOnServerWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;

/* renamed from: X.5dL  reason: invalid class name and case insensitive filesystem */
public class C112095dL implements C16640pq {
    public Object A00;
    public final int A01;

    public C112095dL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object B1V(AnonymousClass0UQ r23) {
        int i;
        int length;
        int i2;
        AnonymousClass0UQ r0 = r23;
        switch (this.A01) {
            case 0:
                DisclosureGetStageByIdsWorker disclosureGetStageByIdsWorker = (DisclosureGetStageByIdsWorker) this.A00;
                int[] A04 = disclosureGetStageByIdsWorker.A01.A01.A04("disclosure_ids");
                if (A04 == null || (length = A04.length) == 0) {
                    return C97334ow.A00();
                }
                AnonymousClass19A r14 = disclosureGetStageByIdsWorker.A01;
                String A09 = r14.A09();
                long A092 = C36371kC.A09(disclosureGetStageByIdsWorker.A00);
                if (A092 > 2147483647L || A092 <= 0) {
                    i2 = 100;
                } else {
                    i2 = (int) A092;
                }
                C203399nx[] r7 = new C203399nx[length];
                for (int i3 = 0; i3 < length; i3++) {
                    AnonymousClass1AL[] r9 = new AnonymousClass1AL[2];
                    r9[0] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A04[i3]);
                    C36341k9.A1L("t", Integer.toString(i2), r9, 1);
                    r7[i3] = new C203399nx("get_disclosure_stage_by_id", r9);
                }
                AnonymousClass1AL[] r6 = new AnonymousClass1AL[4];
                C36341k9.A1L("to", "s.whatsapp.net", r6, 0);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r6, 1);
                C36341k9.A1L("xmlns", "tos", r6, 2);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09, r6, 3);
                r14.A0K(new C165337tG(r0, disclosureGetStageByIdsWorker, A04, 4), new C203399nx("iq", r6, r7), A09, 254, 32000);
                return "Get Disclosure Stage by Ids";
            case 1:
                DisclosureMetadataGetWorker disclosureMetadataGetWorker = (DisclosureMetadataGetWorker) this.A00;
                int A02 = disclosureMetadataGetWorker.A01.A01.A02("disclosure_id", -1);
                AnonymousClass19A r92 = disclosureMetadataGetWorker.A01;
                String A093 = r92.A09();
                long A094 = C36371kC.A09(disclosureMetadataGetWorker.A00);
                if (A094 > 2147483647L || A094 <= 0) {
                    i = 100;
                } else {
                    i = (int) A094;
                }
                AnonymousClass1AL[] r3 = new AnonymousClass1AL[1];
                boolean A1Y = C36371kC.A1Y("t", Integer.toString(i), r3);
                C203399nx r72 = new C203399nx("get_user_disclosures", r3);
                AnonymousClass1AL[] r32 = new AnonymousClass1AL[4];
                C36341k9.A1L("to", "s.whatsapp.net", r32, A1Y ? 1 : 0);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32, 1);
                C36351kA.A1N("xmlns", "tos", r32);
                C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A093, r32);
                r92.A0K(new C165517tY(r0, A02, A1Y, disclosureMetadataGetWorker), C36391kE.A0m(r72, r32), A093, 254, 32000);
                return "Get Disclosure Metadata";
            case 2:
                DisclosureResetOnServerWorker disclosureResetOnServerWorker = (DisclosureResetOnServerWorker) this.A00;
                int A022 = disclosureResetOnServerWorker.A01.A01.A02("disclosure_id", -1);
                if (A022 == -1) {
                    return C97334ow.A00();
                }
                C36321k7.A1T("DisclosureResetOnServertWorker/startwork/disclosureId: ", AnonymousClass000.A0u(), A022);
                AnonymousClass19A r10 = disclosureResetOnServerWorker.A00;
                String A095 = r10.A09();
                AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
                boolean A1Y2 = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(A022), r2);
                C203399nx r73 = new C203399nx("delete", r2);
                AnonymousClass1AL[] r33 = new AnonymousClass1AL[4];
                C36341k9.A1L("to", "s.whatsapp.net", r33, A1Y2 ? 1 : 0);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r33, 1);
                C36351kA.A1N("xmlns", "tos", r33);
                C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A095, r33);
                r10.A0K(new C165517tY(r0, A022, 1, disclosureResetOnServerWorker), C36391kE.A0m(r73, r33), A095, 254, 32000);
                return "Stage on server reset";
            case 3:
                DisclosureResultSendWorker disclosureResultSendWorker = (DisclosureResultSendWorker) this.A00;
                AnonymousClass6X2 r34 = disclosureResultSendWorker.A01.A01;
                int A023 = r34.A02("disclosure_id", -1);
                int A024 = r34.A02("result", -1);
                if (A023 == -1 || A024 == -1) {
                    return C97334ow.A00();
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("disclosuresendworker/startwork/disclosureId: ");
                A0u.append(A023);
                C36321k7.A1T(" result: ", A0u, A024);
                AnonymousClass19A r102 = disclosureResultSendWorker.A00;
                String A096 = r102.A09();
                AnonymousClass1AL[] r35 = new AnonymousClass1AL[2];
                boolean A1Y3 = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(A023), r35);
                r35[1] = new AnonymousClass1AL("result", Integer.toString(A024));
                C203399nx r5 = new C203399nx("trackable", r35);
                AnonymousClass1AL[] r36 = new AnonymousClass1AL[4];
                C36341k9.A1L("to", "s.whatsapp.net", r36, A1Y3 ? 1 : 0);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r36, 1);
                C36341k9.A1L("xmlns", "tos", r36, 2);
                C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A096, r36);
                r102.A0K(new C165487tV(r0, disclosureResultSendWorker, 5), C36391kE.A0m(r5, r36), A096, 254, 32000);
                return "Send Stage Update";
            case 4:
                UserNoticeStageUpdateWorker userNoticeStageUpdateWorker = (UserNoticeStageUpdateWorker) this.A00;
                AnonymousClass6X2 r37 = userNoticeStageUpdateWorker.A01.A01;
                int A025 = r37.A02("notice_id", -1);
                int A026 = r37.A02("stage", -1);
                int A027 = r37.A02("version", -1);
                if (A025 == -1 || A026 == -1 || A027 == -1) {
                    return C97334ow.A00();
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("UserNoticeStageUpdateWorker/startWork/noticeId: ");
                A0u2.append(A025);
                C36321k7.A1T(" stage: ", A0u2, A026);
                AnonymousClass19A r62 = userNoticeStageUpdateWorker.A00;
                String A097 = r62.A09();
                AnonymousClass1AL[] r22 = new AnonymousClass1AL[2];
                boolean A1Y4 = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(A025), r22);
                r22[1] = new AnonymousClass1AL("stage", Integer.toString(A026));
                C203399nx r4 = new C203399nx("notice", r22);
                AnonymousClass1AL[] r38 = new AnonymousClass1AL[4];
                C36341k9.A1L("to", "s.whatsapp.net", r38, A1Y4 ? 1 : 0);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r38, 1);
                C36341k9.A1L("xmlns", "tos", r38, 2);
                C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A097, r38);
                AnonymousClass19A r15 = r62;
                r15.A0K(new C76773pQ(r0, userNoticeStageUpdateWorker, A025, A027, A026), C36391kE.A0m(r4, r38), A097, 254, 32000);
                return "Send Stage Update";
            default:
                C122925ve r39 = (C122925ve) this.A00;
                AnonymousClass00C.A0D(r0, 1);
                C130856Mr r24 = r39.A01;
                AnonymousClass7OJ r1 = new AnonymousClass7OJ(r0, r39);
                synchronized (r24) {
                    r1.invoke();
                }
                return AnonymousClass0AJ.A00;
        }
    }
}
