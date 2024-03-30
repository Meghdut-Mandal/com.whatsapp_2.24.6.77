package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8sC  reason: invalid class name and case insensitive filesystem */
public class C184288sC extends C118095nK {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;

    public C184288sC(C203399nx r20, int i) {
        C203399nx r5 = r20;
        switch (i) {
            case 0:
                Long A0P = C165567td.A0P();
                Long A0Q = C165567td.A0Q();
                C203539oF r6 = C203379ns.A00;
                C203399nx r7 = r5;
                this.A01 = r6.A0Z(r7, Long.class, A0P, A0Q, (Object) null, new String[]{"hash", "epoch"}, false);
                Class<byte[]> cls = byte[].class;
                this.A00 = r6.A0Z(r7, cls, 32L, 32, (Object) null, new String[]{"hash", "#elementValue"}, false);
                this.A03 = r6.A0Z(r7, cls, 64L, 64, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, "#elementValue"}, false);
                this.A02 = C203539oF.A05(r5, C21511AOh.A00, C165607th.A1b(r5, this, "hash"));
                return;
            case 1:
                C203399nx.A09(r5);
                this.A00 = C203539oF.A02(r5, C21536APg.A00, 0);
                this.A02 = C203379ns.A01(r5, C21537APh.A00);
                this.A03 = C203379ns.A01(r5, C21538APi.A00);
                this.A01 = C203379ns.A01(r5, C21539APj.A00);
                this.A00 = r5;
                return;
            case 2:
                C203399nx.A0A(r5, "promotion_config");
                Class<Long> cls2 = Long.class;
                Long A0P2 = C165567td.A0P();
                Long A0Q2 = C165567td.A0Q();
                C203539oF r4 = C203379ns.A00;
                this.A01 = r4.A0Z(r5, cls2, A0P2, A0Q2, (Object) null, new String[]{"max_impressions"}, false);
                this.A02 = r4.A0Z(r5, cls2, A0P2, A0Q2, (Object) null, new String[]{"max_primary_clicks"}, false);
                this.A03 = r4.A0Z(r5, cls2, A0P2, A0Q2, (Object) null, new String[]{"max_secondary_clicks"}, false);
                this.A00 = r4.A0Z(r5, cls2, A0P2, A0Q2, (Object) null, new String[]{"max_dismisses"}, false);
                this.A00 = r5;
                return;
            case 3:
                C203399nx.A0A(r5, "user_info");
                Class<Long> cls3 = Long.class;
                Long A0P3 = C165567td.A0P();
                Long A0Q3 = C165567td.A0Q();
                C203539oF r42 = C203379ns.A00;
                this.A01 = r42.A0Z(r5, cls3, A0P3, A0Q3, (Object) null, new String[]{"impression_count"}, false);
                this.A02 = r42.A0Z(r5, cls3, A0P3, A0Q3, (Object) null, new String[]{"primary_click_count"}, false);
                this.A03 = r42.A0Z(r5, cls3, A0P3, A0Q3, (Object) null, new String[]{"secondary_click_count"}, false);
                this.A00 = r42.A0Z(r5, cls3, A0P3, A0Q3, (Object) null, new String[]{"dismiss_click_count"}, false);
                this.A00 = r5;
                return;
            default:
                C203399nx.A0A(r5, "notice");
                Class<Long> cls4 = Long.class;
                Long A0t = C36411kG.A0t();
                Long A0Q4 = C165567td.A0Q();
                this.A01 = C203379ns.A00.A0Z(r5, cls4, A0t, A0Q4, (Object) null, new String[]{"t"}, false);
                C203399nx r12 = r5;
                Class<Long> cls5 = cls4;
                this.A03 = C203539oF.A07(r12, cls5, C90474aD.A0Y(), A0Q4, (Object) null, new String[]{"version"}, false);
                this.A02 = C203539oF.A07(r5, cls4, A0t, A0Q4, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false);
                this.A00 = C203539oF.A02(r5, AST.A00, 0);
                this.A00 = r5;
                return;
        }
    }
}
