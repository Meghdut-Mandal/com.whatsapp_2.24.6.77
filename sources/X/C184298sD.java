package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8sD  reason: invalid class name and case insensitive filesystem */
public class C184298sD extends C118095nK {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;

    public C184298sD(C203399nx r21, int i) {
        Object obj;
        C203399nx r5 = r21;
        switch (i) {
            case 0:
                C203399nx.A0A(r5, "image");
                Class<String> cls = String.class;
                Long A0Y = C90474aD.A0Y();
                C203539oF r4 = C203379ns.A00;
                this.A03 = (String) r4.A0Z(r5, cls, A0Y, 512L, (Object) null, new String[]{"request_image_url", "#elementValue"}, false);
                this.A02 = (String) r4.A0Z(r5, cls, A0Y, C165577te.A0a(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
                this.A00 = C203379ns.A02(r5, C21390AJq.A00, new String[]{"original_dimensions"});
                obj = C203379ns.A02(r5, C21391AJr.A00, new String[]{"original_image_url"});
                break;
            case 1:
                C203399nx.A0A(r5, "metadata");
                String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME, PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                Class<String> cls2 = String.class;
                Long A0Y2 = C90474aD.A0Y();
                Long A0e = C165597tg.A0e();
                C203539oF r42 = C203379ns.A00;
                this.A03 = (String) r42.A0Z(r5, cls2, A0Y2, A0e, (Object) null, strArr, false);
                C203539oF r12 = r42;
                C203399nx r13 = r5;
                this.A01 = r12.A0Z(r13, Long.class, C36411kG.A0t(), C165567td.A0Q(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "update_time"}, false);
                this.A02 = (String) r42.A0Z(r5, cls2, A0Y2, 2000L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"}, false);
                this.A00 = C203539oF.A05(r5, C21545APp.A00, C165607th.A1b(r5, this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                return;
            case 2:
                C203399nx.A0A(r5, "collection");
                String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"};
                Class<String> cls3 = String.class;
                Long A0Y3 = C90474aD.A0Y();
                Long A0a = C165577te.A0a();
                C203539oF r43 = C203379ns.A00;
                this.A02 = (String) r43.A0Z(r5, cls3, A0Y3, A0a, (Object) null, strArr2, false);
                this.A03 = (String) r43.A0Z(r5, cls3, A0Y3, A0a, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"}, false);
                this.A00 = C203379ns.A01(r5, AQO.A00);
                obj = C203539oF.A08(r5, AQP.A00, new String[]{"product"}, 0);
                break;
            default:
                C203399nx.A0A(r5, "item");
                this.A01 = C203539oF.A07(r5, Long.class, -1L, C165567td.A0Q(), (Object) null, new String[]{"mute"}, false);
                Class<String> cls4 = String.class;
                Long A0Y4 = C90474aD.A0Y();
                Long A0b = C165587tf.A0b();
                this.A03 = (String) C203539oF.A07(r5, cls4, A0Y4, A0b, (Object) null, new String[]{"notify"}, false);
                this.A02 = (String) C203539oF.A07(r5, cls4, A0Y4, A0b, (Object) null, new String[]{"call"}, false);
                Class[] clsArr = new Class[2];
                clsArr[0] = AnonymousClass147.class;
                this.A00 = C203379ns.A00(r5, C90524aI.A0p(UserJid.class, clsArr, 1), new String[]{"jid"});
                break;
        }
        this.A01 = obj;
        this.A00 = r5;
    }
}
