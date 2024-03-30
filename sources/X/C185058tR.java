package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8tR  reason: invalid class name and case insensitive filesystem */
public final class C185058tR extends C118095nK {
    public static final ArrayList A0G = C165567td.A0e("in stock", "out of stock");
    public static final ArrayList A0H = C165567td.A0e("false", "true");
    public final C183998rj A00;
    public final C183998rj A01;
    public final C183998rj A02;
    public final C183998rj A03;
    public final C184048ro A04;
    public final C184078rr A05;
    public final C184688sq A06;
    public final C184698sr A07;
    public final C185008tM A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final C184078rr A0F;

    public C185058tR(C203399nx r12) {
        C203399nx r4 = r12;
        C203399nx.A0A(r12, "product");
        Long A0Y = C90474aD.A0Y();
        Long A0Q = C165567td.A0Q();
        this.A09 = (Long) C203539oF.A07(r4, Long.class, A0Y, A0Q, (Object) null, new String[]{"max_available"}, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"};
        Class<String> cls = String.class;
        C203539oF r3 = C203379ns.A00;
        this.A0D = (String) r3.A0Z(r4, cls, A0Y, A0Q, (Object) null, strArr, false);
        this.A0B = (String) r3.A0Z(r4, cls, A0Y, C165577te.A0a(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
        this.A0C = C203379ns.A09(r12, A0H, new String[]{"is_hidden"});
        this.A0A = C203379ns.A09(r12, A0G, new String[]{"availability"});
        this.A08 = (C185008tM) C203379ns.A02(r12, AQT.A00, new String[]{"status_info"});
        this.A06 = (C184688sq) C203379ns.A02(r12, AQV.A00, new String[]{"belongs_to"});
        this.A07 = (C184698sr) C203379ns.A02(r12, AQX.A00, new String[]{"image_fetch_status"});
        this.A02 = (C183998rj) C203379ns.A02(r12, AQY.A00, new String[]{"price"});
        this.A00 = (C183998rj) C203379ns.A02(r12, AQZ.A00, new String[]{"currency"});
        this.A03 = (C183998rj) C203379ns.A02(r12, C21556AQa.A00, new String[]{"retailer_id"});
        this.A01 = (C183998rj) C203379ns.A02(r12, C21557AQb.A00, new String[]{"description"});
        this.A04 = (C184048ro) C203379ns.A02(r12, C21558AQc.A00, new String[]{"url"});
        this.A05 = (C184078rr) C203379ns.A02(r12, C21559AQd.A00, new String[]{"sale_price"});
        this.A0F = (C184078rr) C203379ns.A02(r12, AQU.A00, new String[]{"max_available"});
        AQW aqw = AQW.A00;
        AnonymousClass00C.A0D(r12, 0);
        this.A0E = C203539oF.A09(r4, aqw, new String[]{"media", "image"}, 1, 100);
        this.A00 = r12;
    }
}
