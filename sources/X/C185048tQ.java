package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8tQ  reason: invalid class name and case insensitive filesystem */
public final class C185048tQ extends C118095nK {
    public static final ArrayList A06 = C165567td.A0e("614665046147756", "994766073959253");
    public static final ArrayList A07 = C165567td.A0e("fbns", "gcm");
    public static final ArrayList A08 = C165567td.A0f("0", "1", "2");
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C185048tQ(C203399nx r18) {
        C203399nx r3 = r18;
        String[] A0M = C203399nx.A0M(r3, "config");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        this.A02 = (String) C203379ns.A00.A0Z(r3, cls, A0Y, C165607th.A0l(), (Object) null, A0M, false);
        Class<Long> cls2 = Long.class;
        Long A0t = C36411kG.A0t();
        C203399nx r10 = r3;
        this.A00 = (Long) C203539oF.A07(r10, cls2, A0t, C165567td.A0Q(), (Object) null, new String[]{"app_mute"}, false);
        this.A03 = (String) C203539oF.A07(r3, cls, A0Y, 64L, (Object) null, new String[]{"pkey"}, false);
        this.A01 = (Long) C203539oF.A07(r10, cls2, A0t, 5L, (Object) null, new String[]{"num_acc"}, false);
        this.A04 = C203379ns.A08(r3, "platform", A07);
        C203379ns.A0H(r3, PublicKeyCredentialControllerUtility.JSON_KEY_APPID, A06);
        this.A05 = C203379ns.A09(r3, A08, new String[]{"voip_payload_type"});
        this.A00 = r3;
    }
}
