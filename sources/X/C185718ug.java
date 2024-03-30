package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8ug  reason: invalid class name and case insensitive filesystem */
public class C185718ug extends C50492l0 {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        X.C36331k8.A1D(r2, r1, r0);
        r0 = r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        r0 = X.C165567td.A0I(X.C36441kJ.A0q(r0), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C185718ug(int r5) {
        /*
            r4 = this;
            switch(r5) {
                case 3: goto L_0x004e;
                case 4: goto L_0x0044;
                case 24: goto L_0x0031;
                case 26: goto L_0x0025;
                default: goto L_0x0003;
            }
        L_0x0003:
            r4.<init>()
            X.6QB r3 = X.C165597tg.A0W()
            java.lang.String r1 = "type"
            java.lang.String r0 = "poll"
            X.C36331k8.A1D(r3, r1, r0)
            java.lang.String r0 = "meta"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            java.lang.String r1 = "polltype"
            java.lang.String r0 = "creation"
            X.C36331k8.A1D(r2, r1, r0)
            X.9nx r0 = X.C165567td.A0I(r2, r3)
        L_0x0022:
            r4.A00 = r0
            return
        L_0x0025:
            r4.<init>()
            X.6QB r2 = X.C165597tg.A0W()
            java.lang.String r1 = "type"
            java.lang.String r0 = "pay"
            goto L_0x003c
        L_0x0031:
            r4.<init>()
            X.6QB r2 = X.C165597tg.A0W()
            java.lang.String r1 = "edit"
            java.lang.String r0 = "8"
        L_0x003c:
            X.C36331k8.A1D(r2, r1, r0)
            X.9nx r0 = r2.A03()
            goto L_0x0022
        L_0x0044:
            r4.<init>()
            X.6QB r1 = X.C165587tf.A0a()
            java.lang.String r0 = "merchant_status"
            goto L_0x0057
        L_0x004e:
            r4.<init>()
            X.6QB r1 = X.C165587tf.A0a()
            java.lang.String r0 = "merchant_account_settings"
        L_0x0057:
            X.6QB r0 = X.C36441kJ.A0q(r0)
            X.9nx r0 = X.C165567td.A0I(r0, r1)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185718ug.<init>(int):void");
    }

    public C185718ug(C16410pC r5) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        AnonymousClass6QB A0q = C36441kJ.A0q("member_add_mode");
        C18740tg.A0D(AnonymousClass000.A1V(r5), "Expected memberAddModeMixinGroup to be nonnull");
        C165597tg.A1D(A0q, r5);
        C165567td.A1F(A0q, A0X, this);
    }

    public C185718ug(C16430pE r4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("membership_approval_mode");
        AnonymousClass6QB A0q2 = C36441kJ.A0q("group_join");
        ConditionVariable conditionVariable = C18740tg.A00;
        C165597tg.A1D(A0q2, r4);
        C165567td.A1F(A0q2, A0q, this);
    }

    public C185718ug(AnonymousClass147 r3) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        C36351kA.A1I(r3, A0X, "linked_groups_membership_hint");
        C592133b.A00(A0X, this);
    }

    public C185718ug(C50552l6 r3) {
        AnonymousClass6QB A0q = C36441kJ.A0q("spam_list");
        A0q.A05(r3.A00);
        C592133b.A00(A0q, this);
    }

    public C185718ug(C185718ug r3) {
        C165567td.A1F(C165577te.A0Y(r3, "metadata_info"), C165597tg.A0X(), this);
    }

    public C185718ug(C185718ug r12, Long l, int i) {
        C203399nx A03;
        if (2 - i != 0) {
            A03 = C165567td.A0I(C165577te.A0Y(r12, "tctoken"), C165597tg.A0X());
        } else {
            AnonymousClass6QB A0a = C165587tf.A0a();
            AnonymousClass6QB A0q = C36441kJ.A0q("installment");
            if (C203539oF.A0L(l, 1, 50, false)) {
                C36411kG.A1K(A0q, "max_count", l.longValue());
            }
            A0a.A05(C165567td.A0I(C165577te.A0Y(r12, "amount"), A0q));
            A03 = A0a.A03();
        }
        this.A00 = A03;
    }

    public C185718ug(UserJid userJid) {
        AnonymousClass6QB A0q = C36441kJ.A0q("receipt");
        if (C203539oF.A0N(userJid, "to")) {
            C36351kA.A1I(userJid, A0q, "to");
        }
        C592133b.A00(A0q, this);
    }

    public C185718ug(Long l) {
        AnonymousClass6QB A0q = C36441kJ.A0q("clean");
        C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "syncd_app_state");
        if (C203539oF.A0M(l, false)) {
            C36411kG.A1K(A0q, "timestamp", l.longValue());
        }
        C592133b.A00(A0q, this);
    }

    public C185718ug(Long l, Long l2) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        AnonymousClass6QB A0q = C36441kJ.A0q("variant_thumbnail_width");
        C165587tf.A1D(A0q, l, C203539oF.A0L(l, 1, 2048, false) ? 1 : 0);
        C36361kB.A1H(A0q, A0X);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("variant_thumbnail_height");
        C165587tf.A1D(A0q2, l2, C203539oF.A0L(l2, 1, 2048, false) ? 1 : 0);
        C165567td.A1F(A0q2, A0X, this);
    }

    public C185718ug(Long l, String str, String str2, String str3, String str4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("extension_screen");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "extension_id", str);
        }
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "session_id", str2);
        }
        if (C203539oF.A0L(l, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0q, "t", l.longValue());
        }
        if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        AnonymousClass6QB A0q2 = C36441kJ.A0q("data");
        if (C203539oF.A0P(str4, 0, 9007199254740991L, false)) {
            A0q2.A07(str4);
        }
        C165567td.A1F(A0q2, A0q, this);
    }

    public C185718ug(Long l, String str, String str2, byte[] bArr) {
        AnonymousClass6QB A0q = C36441kJ.A0q("pin");
        if (C203539oF.A0P(str, 1, 200, false)) {
            C36331k8.A1D(A0q, "provider", str);
        }
        if (C203539oF.A0S(str2, 1, false)) {
            C36331k8.A1D(A0q, "key-type", str2);
        }
        if (C203539oF.A0L(l, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0q, "key-version", l.longValue());
        }
        C203539oF.A0I(bArr, 0, 9007199254740991L);
        A0q.A01 = bArr;
        C592133b.A00(A0q, this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        X.C36331k8.A1D(r1, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        r2 = X.C36441kJ.A0q(r0);
        r9 = false;
        r5 = 1;
        r7 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        if (X.C203539oF.A0P(r4, r5, r7, r9) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r2.A07(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        X.C36361kB.A1H(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r0 = r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r10.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C185718ug(java.lang.String r11, int r12) {
        /*
            r10 = this;
            r4 = r11
            switch(r12) {
                case 7: goto L_0x0078;
                case 8: goto L_0x006e;
                case 9: goto L_0x0004;
                case 10: goto L_0x0056;
                case 11: goto L_0x0004;
                case 12: goto L_0x0040;
                case 13: goto L_0x0004;
                case 14: goto L_0x0004;
                case 15: goto L_0x0029;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x0004;
                case 19: goto L_0x0004;
                case 20: goto L_0x0078;
                case 21: goto L_0x006e;
                default: goto L_0x0004;
            }
        L_0x0004:
            r10.<init>()
            X.6QB r1 = X.C165597tg.A0X()
            java.lang.String r0 = "catalog_session_id"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 40
        L_0x0016:
            boolean r0 = X.C203539oF.A0P(r4, r5, r7, r9)
            if (r0 == 0) goto L_0x001f
            r2.A07(r11)
        L_0x001f:
            X.C36361kB.A1H(r2, r1)
        L_0x0022:
            X.9nx r0 = r1.A03()
        L_0x0026:
            r10.A00 = r0
            return
        L_0x0029:
            r10.<init>()
            java.lang.String r0 = "picture"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 0
            r7 = 50
            boolean r0 = X.C203539oF.A0P(r4, r5, r7, r9)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "id"
            goto L_0x006a
        L_0x0040:
            r10.<init>()
            X.6QB r2 = X.C36421kH.A0T()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36331k8.A1D(r2, r1, r0)
            X.C203539oF.A0E(r2, r11)
            X.9nx r0 = r2.A03()
            goto L_0x0026
        L_0x0056:
            r10.<init>()
            java.lang.String r0 = "context"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r0 = 0
            r2 = 0
            boolean r0 = X.C203539oF.A0V(r11, r2, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "parameters"
        L_0x006a:
            X.C36331k8.A1D(r1, r0, r11)
            goto L_0x0022
        L_0x006e:
            r10.<init>()
            X.6QB r1 = X.C165597tg.A0X()
            java.lang.String r0 = "variant_info_fields"
            goto L_0x0081
        L_0x0078:
            r10.<init>()
            X.6QB r1 = X.C165597tg.A0X()
            java.lang.String r0 = "direct_connection_encrypted_info"
        L_0x0081:
            X.6QB r2 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 2000(0x7d0, double:9.88E-321)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185718ug.<init>(java.lang.String, int):void");
    }

    public C185718ug(String str, String str2, String str3) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        AnonymousClass6QB A0q = C36441kJ.A0q("money");
        if (C203539oF.A0P(str, 1, 100, false)) {
            C36331k8.A1D(A0q, "value", str);
        }
        if (C203539oF.A0P(str2, 1, 100, false)) {
            C36331k8.A1D(A0q, "offset", str2);
        }
        if (C203539oF.A0P(str3, 1, 100, false)) {
            C36331k8.A1D(A0q, "currency", str3);
        }
        C165567td.A1F(A0q, A0X, this);
    }

    public C185718ug(List list, int i) {
        AnonymousClass6QB r4;
        if (1 - i != 0) {
            r4 = C165597tg.A0W();
            if (C203539oF.A0Y(list, 1, 100)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C592133b.A01(r4, it);
                }
            }
        } else {
            r4 = C165597tg.A0X();
            if (C203539oF.A0Y(list, 1, 5)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C592133b.A01(r4, it2);
                }
            }
        }
        C592133b.A00(r4, this);
    }

    public C185718ug(byte[] bArr) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        C203539oF.A0I(bArr, 1, 120);
        A0X.A01 = bArr;
        C592133b.A00(A0X, this);
    }
}
