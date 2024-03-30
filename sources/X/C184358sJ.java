package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8sJ  reason: invalid class name and case insensitive filesystem */
public class C184358sJ extends C118095nK {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;

    public C184358sJ(C203399nx r20, int i) {
        int i2;
        String[] A1b;
        C22993Azj azj;
        C203399nx r5 = r20;
        switch (i) {
            case 0:
                C203399nx.A0A(r5, "thumbnail_media");
                Class<Long> cls = Long.class;
                Long A0Y = C90474aD.A0Y();
                Long A0Q = C165567td.A0Q();
                i2 = 0;
                C203539oF r4 = C203379ns.A00;
                this.A00 = r4.A0Z(r5, cls, A0Y, A0Q, (Object) null, new String[]{"original_dimensions", "height"}, false);
                this.A02 = r4.A0Z(r5, cls, A0Y, A0Q, (Object) null, new String[]{"original_dimensions", "width"}, false);
                Class<String> cls2 = String.class;
                this.A05 = (String) r4.A0Z(r5, cls2, A0Y, A0Q, (Object) null, new String[]{"request_image_url", "#elementValue"}, false);
                this.A04 = (String) r4.A0Z(r5, cls2, A0Y, A0Q, (Object) null, new String[]{"original_image_url", "#elementValue"}, false);
                this.A03 = (String) r4.A0Z(r5, cls2, A0Y, C165577te.A0a(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
                A1b = C165607th.A1b(r5, this, "original_dimensions");
                azj = AKQ.A00;
                break;
            case 1:
                C203399nx.A0A(r5, "image");
                Class<Long> cls3 = Long.class;
                Long A0Y2 = C90474aD.A0Y();
                Long A0Q2 = C165567td.A0Q();
                i2 = 0;
                C203539oF r42 = C203379ns.A00;
                this.A00 = r42.A0Z(r5, cls3, A0Y2, A0Q2, (Object) null, new String[]{"original_dimensions", "height"}, false);
                this.A02 = r42.A0Z(r5, cls3, A0Y2, A0Q2, (Object) null, new String[]{"original_dimensions", "width"}, false);
                Class<String> cls4 = String.class;
                this.A05 = (String) r42.A0Z(r5, cls4, A0Y2, A0Q2, (Object) null, new String[]{"request_image_url", "#elementValue"}, false);
                this.A04 = (String) r42.A0Z(r5, cls4, A0Y2, A0Q2, (Object) null, new String[]{"original_image_url", "#elementValue"}, false);
                this.A03 = (String) r42.A0Z(r5, cls4, A0Y2, C165577te.A0a(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
                A1b = C165607th.A1b(r5, this, "original_dimensions");
                azj = C21560AQe.A00;
                break;
            default:
                C203399nx.A0A(r5, "thumbnail_media");
                Class<Long> cls5 = Long.class;
                Long A0Y3 = C90474aD.A0Y();
                Long A0Q3 = C165567td.A0Q();
                i2 = 0;
                C203539oF r43 = C203379ns.A00;
                this.A00 = r43.A0Z(r5, cls5, A0Y3, A0Q3, (Object) null, new String[]{"original_dimensions", "height"}, false);
                this.A02 = r43.A0Z(r5, cls5, A0Y3, A0Q3, (Object) null, new String[]{"original_dimensions", "width"}, false);
                Class<String> cls6 = String.class;
                this.A05 = (String) r43.A0Z(r5, cls6, A0Y3, A0Q3, (Object) null, new String[]{"request_image_url", "#elementValue"}, false);
                this.A04 = (String) r43.A0Z(r5, cls6, A0Y3, A0Q3, (Object) null, new String[]{"original_image_url", "#elementValue"}, false);
                this.A03 = (String) r43.A0Z(r5, cls6, A0Y3, C165577te.A0a(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
                A1b = C165607th.A1b(r5, this, "original_dimensions");
                azj = AR9.A00;
                break;
        }
        AnonymousClass00C.A0D(r5, i2);
        this.A01 = C203539oF.A09(r5, azj, A1b, 1, 1).get(i2);
    }
}
