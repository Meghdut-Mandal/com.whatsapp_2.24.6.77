package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8vH  reason: invalid class name and case insensitive filesystem */
public class C186018vH extends C50502l1 {
    public C186018vH(C16420pD r4, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36351kA.A1I(C177578e1.A00, A0T, "to");
        C165567td.A1H(A0T, "w:g2");
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("leave");
        ConditionVariable conditionVariable = C18740tg.A00;
        C165597tg.A1D(A0q, r4);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(C16450pG r12, C16470pI r13, Long l, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C165567td.A1G(A0T, "newsletter");
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("messages");
        if (C203539oF.A0L(l, 1, 300, false)) {
            C36411kG.A1K(A0q, "count", l.longValue());
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        C165597tg.A1D(A0q, r13);
        if (r12 != null) {
            C165597tg.A1D(A0q, r12);
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(AnonymousClass147 r4, C16390pA r5, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1H(A0T, "w:g2");
        if (C203539oF.A0N(r4, "to")) {
            C36351kA.A1I(r4, A0T, "to");
        }
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("sub_group_suggestion");
        ConditionVariable conditionVariable = C18740tg.A00;
        C165597tg.A1D(A0q, r5);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(AnonymousClass147 r3, C185648uZ r4, C185648uZ r5, C185648uZ r6, C185648uZ r7, C185648uZ r8, C185648uZ r9, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1H(A0T, "w:g2");
        C36351kA.A1I(r3, A0T, "to");
        C203539oF.A0E(A0T, str);
        C165587tf.A1C(A0T, r4);
        C165587tf.A1C(A0T, r5);
        C165587tf.A1C(A0T, r6);
        C165587tf.A1C(A0T, r7);
        C165587tf.A1C(A0T, r8);
        C165587tf.A1C(A0T, r9);
        C592133b.A00(A0T, this);
    }

    public C186018vH(AnonymousClass147 r12, UserJid userJid, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1H(A0T, "w:g2");
        C36351kA.A1I(r12, A0T, "to");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("reports");
        AnonymousClass6QB A0q2 = C36441kJ.A0q("report");
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q2, "message_id", str2);
        }
        C36351kA.A1I(userJid, A0q2, "author_jid");
        C36361kB.A1H(A0q2, A0q);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(AnonymousClass147 r3, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1G(A0T, "w:g2");
        C36351kA.A1I(r3, A0T, "to");
        C203539oF.A0E(A0T, str);
        C165567td.A1F(C36441kJ.A0q("reports"), A0T, this);
    }

    public C186018vH(AnonymousClass147 r7, String str, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1H(A0T, "w:g2");
        if (C203539oF.A0N(r7, "to")) {
            C36351kA.A1I(r7, A0T, "to");
        }
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("remove");
        C36331k8.A1D(A0q, "linked_groups", "true");
        if (C203539oF.A0Y(list, 1, 1024)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(C28981Uw r12, C16460pH r13, Long l, Long l2, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1G(A0T, "newsletter");
        if (C203539oF.A0N(r12, "to")) {
            C36351kA.A1I(r12, A0T, "to");
        }
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("message_updates");
        if (C203539oF.A0L(l, 1, 300, false)) {
            C36411kG.A1K(A0q, "count", l.longValue());
        }
        if (l2 != null && C203539oF.A0M(l2, true)) {
            C36411kG.A1K(A0q, "since", l2.longValue());
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        C165597tg.A1D(A0q, r13);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(C28981Uw r12, Long l, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C165567td.A1G(A0T, "newsletter");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("my_addons");
        if (C203539oF.A0L(l, 0, 5000, false)) {
            C36411kG.A1K(A0q, "limit", l.longValue());
        }
        if (r12 != null) {
            C36351kA.A1I(r12, A0q, "jid");
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(C28981Uw r4, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1H(A0T, "newsletter");
        if (C203539oF.A0N(r4, "to")) {
            C36351kA.A1I(r4, A0T, "to");
        }
        C203539oF.A0E(A0T, str);
        C165567td.A1F(C36441kJ.A0q("live_updates"), A0T, this);
    }

    public C186018vH(C185648uZ r11, String str, String str2, String str3) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C165567td.A1G(A0T, "w:mex");
        C203539oF.A0E(A0T, str);
        C165587tf.A1C(A0T, r11);
        AnonymousClass6QB A0q = C36441kJ.A0q("query");
        String str4 = str2;
        if (str2 != null && C203539oF.A0P(str4, 1, 20, true)) {
            C36331k8.A1D(A0q, "query_id", str2);
        }
        if (C203539oF.A0P(str3, 1, 8448000, false)) {
            A0q.A07(str3);
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(C185648uZ r11, String str, String str2, String str3, String str4, int i) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        if (10 - i != 0) {
            C165567td.A1H(A0T, "phoenix");
        } else {
            C165567td.A1G(A0T, "phoenix");
        }
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("fds");
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "config", str2);
        }
        String str5 = str3;
        if (str3 != null && C203539oF.A0P(str5, 0, 9007199254740991L, true)) {
            C36331k8.A1D(A0q, "state", str3);
        }
        String str6 = str4;
        if (str4 != null && C203539oF.A0P(str6, 0, 10000, true)) {
            C36331k8.A1D(A0q, "parameters", str4);
        }
        A0q.A05(r11.A00);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(C185718ug r7, C16400pB r8, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        AnonymousClass6QB A0q = C36441kJ.A0q("pictures");
        if (C203539oF.A0Y(list, 1, 1000)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        C165577te.A1G(A0q, r7);
        C36361kB.A1H(A0q, A0T);
        ConditionVariable conditionVariable = C18740tg.A00;
        C165577te.A1H(A0T, (C592133b) r8, this);
    }

    public C186018vH(C185718ug r5, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "recover-account");
        C36361kB.A1H(C165577te.A0Y(r5, "pin"), A0a);
        C165567td.A1F(A0a, A0T, this);
    }

    public C186018vH(Jid jid, C185718ug r10, C185708uf r11, C50602lB r12, String str, List list, List list2, List list3) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("spam_list");
        if (jid != null) {
            Class[] clsArr = new Class[2];
            clsArr[0] = AnonymousClass148.class;
            if (C203539oF.A0J(jid, "spam_list->jid", C90524aI.A0p(UserJid.class, clsArr, 1), true)) {
                C36351kA.A1I(jid, A0q, "jid");
            }
        }
        if (C203539oF.A0Y(list, 0, 210)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        if (C203539oF.A0Y(list2, 0, 5)) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C592133b.A01(A0q, it2);
            }
        }
        List list4 = list3;
        if (C203539oF.A0Y(list4, 0, 5)) {
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                C592133b.A01(A0q, it3);
            }
        }
        C165577te.A1G(A0q, r10);
        C165577te.A1G(A0q, r11);
        C36361kB.A1H(A0q, A0T);
        ConditionVariable conditionVariable = C18740tg.A00;
        C165577te.A1H(A0T, r12, this);
    }

    public C186018vH(UserJid userJid, C185718ug r12, C185718ug r13, C185648uZ r14, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "fb:thrift_iq");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C203539oF.A0W(str, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("request");
        C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "report_product");
        if (C203539oF.A0N(userJid, "request->biz_jid")) {
            C36351kA.A1I(userJid, A0q, "biz_jid");
        }
        A0q.A05(r14.A00);
        AnonymousClass6QB A0q2 = C36441kJ.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String str3 = str2;
        if (C203539oF.A0P(str3, 1, 200, false)) {
            A0q2.A07(str3);
        }
        C36361kB.A1H(A0q2, A0q);
        A0q.A06(r12.A00);
        C165577te.A1G(A0q, r13);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(UserJid userJid, C185718ug r15, C185718ug r16, C185718ug r17, Long l, Long l2, String str, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "fb:thrift_iq");
        C165567td.A1C(new AnonymousClass1AL("smax_id", 11), A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("cart");
        C36331k8.A1D(A0q, "op", "refresh");
        if (C203539oF.A0N(userJid, "cart->biz_jid")) {
            C36351kA.A1I(userJid, A0q, "biz_jid");
        }
        List list2 = list;
        if (C203539oF.A0Y(list2, 1, Long.MAX_VALUE)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        AnonymousClass6QB A0q2 = C36441kJ.A0q("image_dimensions");
        AnonymousClass6QB A0q3 = C36441kJ.A0q("width");
        Long l3 = l;
        C165587tf.A1D(A0q3, l3, C203539oF.A0L(l3, 0, 10000, false) ? 1 : 0);
        C36361kB.A1H(A0q3, A0q2);
        AnonymousClass6QB A0q4 = C36441kJ.A0q("height");
        Long l4 = l2;
        C165587tf.A1D(A0q4, l4, C203539oF.A0L(l4, 0, 10000, false) ? 1 : 0);
        A0q.A05(C165567td.A0I(A0q4, A0q2));
        C165577te.A1G(A0q, r15);
        C165577te.A1G(A0q, r16);
        C165577te.A1G(A0q, r17);
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(UserJid userJid, C185718ug r6, C185718ug r7, C185718ug r8, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "br-get-merchant-config");
        C36351kA.A1I(userJid, A0a, "receiver");
        if (str2 != null && C203539oF.A0X(str2, true)) {
            C36331k8.A1D(A0a, "payment_config_id", str2);
        }
        A0a.A06(r6.A00);
        C165577te.A1G(A0a, r7);
        C165577te.A1G(A0a, r8);
        C165567td.A1F(A0a, A0T, this);
    }

    public C186018vH(UserJid userJid, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "avatars");
        C165567td.A1C(new AnonymousClass1AL("smax_id", 134), A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("contact");
        if (C203539oF.A0N(userJid, "contact->jid")) {
            C36351kA.A1I(userJid, A0q, "jid");
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(Long l, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1E(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "get-offer");
        if (C203539oF.A0L(l, 1, 9007199254740991L, false)) {
            C36411kG.A1K(A0a, "offer_id", l.longValue());
        }
        if (str2 != null && C203539oF.A0S(str2, 1, true)) {
            C36331k8.A1D(A0a, "device_locale", str2);
        }
        C165567td.A1F(A0a, A0T, this);
    }

    public C186018vH(Long l, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "avatars");
        C165567td.A1C(new AnonymousClass1AL("smax_id", 101), A0T);
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("encryption_metadata");
        C36331k8.A1D(A0q, "version", "1");
        C36331k8.A1D(A0q, "algorithm", "rsa2048");
        AnonymousClass6QB A0q2 = C36441kJ.A0q("encrypted_key");
        byte[] bArr5 = bArr;
        C203539oF.A0I(bArr5, 1, 2048);
        A0q2.A01 = bArr5;
        C36361kB.A1H(A0q2, A0q);
        AnonymousClass6QB A0q3 = C36441kJ.A0q("nonce");
        byte[] bArr6 = bArr2;
        C203539oF.A0I(bArr6, 1, 128);
        A0q3.A01 = bArr6;
        C36361kB.A1H(A0q3, A0q);
        AnonymousClass6QB A0q4 = C36441kJ.A0q("encrypted_data");
        byte[] bArr7 = bArr3;
        C203539oF.A0I(bArr7, 1, 8192);
        A0q4.A01 = bArr7;
        C36361kB.A1H(A0q4, A0q);
        AnonymousClass6QB A0q5 = C36441kJ.A0q("auth_tag");
        byte[] bArr8 = bArr4;
        C203539oF.A0I(bArr8, 1, 128);
        A0q5.A01 = bArr8;
        A0T.A05(C165567td.A0I(A0q5, A0q));
        AnonymousClass6QB A0q6 = C36441kJ.A0q("timestamp");
        C165587tf.A1D(A0q6, l, C203539oF.A0L(l, 1, 9007199254740991L, false) ? 1 : 0);
        C36361kB.A1H(A0q6, A0T);
        AnonymousClass6QB A0q7 = C36441kJ.A0q("fbid");
        if (C203539oF.A0P(str2, 1, 20, false)) {
            A0q7.A07(str2);
        }
        C165567td.A1F(A0q7, A0T, this);
    }

    public C186018vH(String str, int i) {
        C203399nx A0I;
        if (2 - i != 0) {
            AnonymousClass6QB A0T = C36421kH.A0T();
            C36351kA.A1I(C177578e1.A00, A0T, "to");
            C165567td.A1G(A0T, "w:g2");
            C203539oF.A0E(A0T, str);
            A0I = C165567td.A0I(C36441kJ.A0q("pre_reg_add_requests"), A0T);
        } else {
            AnonymousClass6QB A0T2 = C36421kH.A0T();
            C165567td.A1E(A0T2);
            C36331k8.A1D(A0T2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C203539oF.A0E(A0T2, str);
            AnonymousClass6QB A0a = C165587tf.A0a();
            C36331k8.A1D(A0a, "action", "br-get-info-for-income-collection");
            A0I = C165567td.A0I(A0a, A0T2);
        }
        this.A00 = A0I;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        X.C36331k8.A1D(r1, r2, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C186018vH(java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r13 = this;
            r7 = r15
            switch(r16) {
                case 4: goto L_0x009c;
                case 5: goto L_0x0004;
                case 6: goto L_0x0068;
                case 7: goto L_0x0004;
                case 8: goto L_0x0004;
                case 9: goto L_0x003b;
                default: goto L_0x0004;
            }
        L_0x0004:
            r13.<init>()
            X.6QB r0 = X.C36421kH.A0T()
            X.C36341k9.A1C(r0)
            java.lang.String r1 = "w:growth"
            X.C165567td.A1G(r0, r1)
            r8 = 0
            X.C36331k8.A1C(r0, r14)
            java.lang.String r1 = "invite"
            X.6QB r1 = X.C36441kJ.A0q(r1)
            java.lang.String r2 = "get_sender"
            X.6QB r3 = X.C36441kJ.A0q(r2)
            if (r15 == 0) goto L_0x0034
            r12 = 1
            r10 = 1024(0x400, double:5.06E-321)
            boolean r2 = X.C203539oF.A0P(r7, r8, r10, r12)
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = "code"
            X.C36331k8.A1D(r3, r2, r15)
        L_0x0034:
            X.C36361kB.A1H(r3, r1)
        L_0x0037:
            X.C165567td.A1F(r1, r0, r13)
            return
        L_0x003b:
            java.lang.String r7 = "cd7962b7"
            r13.<init>()
            X.6QB r0 = X.C36421kH.A0T()
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.C36331k8.A1D(r0, r2, r1)
            X.C165567td.A1E(r0)
            r6 = 0
            r2 = 0
            X.C36331k8.A1C(r0, r14)
            X.6QB r1 = X.C165587tf.A0a()
            java.lang.String r5 = "action"
            java.lang.String r4 = "get-purpose-limiting-key"
            X.C36331k8.A1D(r1, r5, r4)
            boolean r2 = X.C203539oF.A0S(r7, r2, r6)
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = "purpose"
            goto L_0x00c8
        L_0x0068:
            r13.<init>()
            X.6QB r0 = X.C36421kH.A0T()
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.C36331k8.A1D(r0, r2, r1)
            X.C165567td.A1E(r0)
            r12 = 0
            X.C203539oF.A0E(r0, r14)
            X.6QB r1 = X.C165587tf.A0a()
            java.lang.String r3 = "action"
            java.lang.String r2 = "remove-custom-payment-method"
            X.C36331k8.A1D(r1, r3, r2)
            java.lang.String r3 = "country"
            java.lang.String r2 = "BR"
            X.C36331k8.A1D(r1, r3, r2)
            r8 = 1
            r10 = 200(0xc8, double:9.9E-322)
            boolean r2 = X.C203539oF.A0P(r7, r8, r10, r12)
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = "credential_id"
            goto L_0x00c8
        L_0x009c:
            r13.<init>()
            X.6QB r0 = X.C36421kH.A0T()
            X.C165567td.A1E(r0)
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.C36331k8.A1D(r0, r2, r1)
            r12 = 0
            X.C203539oF.A0E(r0, r14)
            X.6QB r1 = X.C165587tf.A0a()
            java.lang.String r3 = "action"
            java.lang.String r2 = "br-get-payout-banks"
            X.C36331k8.A1D(r1, r3, r2)
            r8 = 1
            r10 = 200(0xc8, double:9.9E-322)
            boolean r2 = X.C203539oF.A0P(r7, r8, r10, r12)
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = "provider"
        L_0x00c8:
            X.C36331k8.A1D(r1, r2, r7)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186018vH.<init>(java.lang.String, java.lang.String, int):void");
    }

    public C186018vH(String str, String str2, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "fb:thrift_iq");
        C36411kG.A1K(A0T, "smax_id", 138);
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0W = C165597tg.A0W();
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0W, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        C36361kB.A1H(A0W, A0T);
        AnonymousClass6QB A0q = C36441kJ.A0q("feedback_list");
        if (C203539oF.A0Y(list, 1, 10)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186018vH(String str, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1C(new AnonymousClass1AL("xmlns", "key_transparency"), A0T);
        C203539oF.A0E(A0T, str);
        if (C203539oF.A0Y(list, 1, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0T, it);
            }
        }
        C165567td.A1F(C36441kJ.A0q("multi_serialized_lookup"), A0T, this);
    }
}
