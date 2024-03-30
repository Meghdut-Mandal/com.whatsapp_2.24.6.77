package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8uP  reason: invalid class name and case insensitive filesystem */
public final class C185548uP extends C118095nK implements B0A {
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");
    public static final ArrayList A04 = C165567td.A0e("0", "1");
    public static final ArrayList A05 = C165567td.A0f("0", "1", "2");
    public static final ArrayList A06 = C36351kA.A10(new String[]{"apple", "apple_dev", "smbi", "smbi_dev"});
    public static final ArrayList A07 = C165567td.A0e("0", "1");
    public static final ArrayList A08 = C36351kA.A10(new String[]{"false", "true", "0", "1"});
    public static final ArrayList A09 = C165567td.A0f("0", "1", "2");
    public final List A00;

    public C185548uP(C203399nx r19) {
        C203399nx r4 = r19;
        C203399nx.A0A(r4, "config");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203539oF.A07(r4, cls, A0P, A0Q, "2", new String[]{"version"}, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Long A0Y = C90474aD.A0Y();
        Long A0l = C165607th.A0l();
        C203399nx r11 = r4;
        Class<String> cls2 = cls;
        C203539oF.A07(r11, cls2, A0Y, A0l, (Object) null, strArr, false);
        C203539oF.A07(r11, cls2, A0Y, A0l, (Object) null, new String[]{"voip"}, false);
        String[] strArr2 = {CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID};
        Long A0b = C165587tf.A0b();
        C203379ns.A03(r11, cls2, A0Y, A0b, (Object) null, strArr2, false);
        C203379ns.A03(r11, cls2, A0Y, A0b, (Object) null, new String[]{"groups"}, false);
        C203379ns.A03(r11, cls2, A0Y, A0b, (Object) null, new String[]{"call"}, false);
        Long A0k = C165607th.A0k();
        C203379ns.A03(r11, cls2, A0Y, A0k, (Object) null, new String[]{"lg"}, false);
        C203379ns.A03(r11, cls2, A0Y, A0k, (Object) null, new String[]{"lc"}, false);
        C203539oF.A07(r11, cls2, A0Y, 64L, (Object) null, new String[]{"pkey"}, false);
        C203539oF.A07(r4, Long.class, C36411kG.A0t(), A0Q, (Object) null, new String[]{"app_mute"}, false);
        C203379ns.A0G(r4, "platform", A06);
        C203379ns.A0G(r4, "preview", A07);
        C203379ns.A0H(r4, "background_location", A01);
        C203379ns.A0H(r4, "nse_ver", A05);
        C203379ns.A0H(r4, "nse_call", A02);
        C203379ns.A0H(r4, "nse_read", A03);
        C203379ns.A0H(r4, "nse_retry", A04);
        C203379ns.A0H(r4, "reg_push", A08);
        C203379ns.A0G(r4, "voip_payload_type", A09);
        ARE are = ARE.A00;
        AnonymousClass00C.A0D(r4, 0);
        this.A00 = C203539oF.A09(r4, are, new String[]{"item"}, 0, Long.MAX_VALUE);
        this.A00 = r4;
    }

    public void B06(C198169d1 r1) {
    }
}
