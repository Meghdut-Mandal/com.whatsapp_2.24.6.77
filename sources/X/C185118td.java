package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8td  reason: invalid class name and case insensitive filesystem */
public final class C185118td extends C118095nK implements C23002Azs {
    public static final ArrayList A04 = C165567td.A0e("in stock", "out of stock");
    public final C23000Azq A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public void Azt(AnonymousClass9HP r12) {
        String str;
        int i;
        boolean equalsIgnoreCase = "out of stock".equalsIgnoreCase(this.A01);
        AnonymousClass9OJ r3 = r12.A01;
        r3.A06 = this.A02;
        r3.A00 = equalsIgnoreCase ? 1 : 0;
        ArrayList A0I = AnonymousClass001.A0I();
        for (C184298sD r1 : this.A03) {
            String str2 = r1.A02;
            C183998rj r0 = (C183998rj) r1.A01;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = null;
            }
            String str3 = r1.A03;
            C184818t3 r13 = (C184818t3) r1.A00;
            int i2 = 0;
            if (r13 != null) {
                i2 = AnonymousClass000.A0I(r13.A01);
                i = AnonymousClass000.A0I(r13.A00);
            } else {
                i = 0;
            }
            if (str == null) {
                str = str3;
            }
            A0I.add(new C206759tv(str2, str, str3, i2, i));
        }
        r3.A09 = A0I;
        this.A00.Azs(new AnonymousClass9EJ(r12));
    }

    public C185118td(C203399nx r12) {
        C203399nx r4 = r12;
        C203399nx.A0A(r12, "product");
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"};
        Long A0Y = C90474aD.A0Y();
        Long A0a = C165577te.A0a();
        C203539oF r3 = C203379ns.A00;
        this.A02 = (String) r3.A0Z(r4, String.class, A0Y, A0a, (Object) null, strArr, false);
        this.A01 = C203379ns.A09(r12, A04, new String[]{"availability"});
        C22993Azj[] azjArr = new C22993Azj[2];
        azjArr[0] = C21387AJn.A00;
        this.A00 = (C23000Azq) r3.A0a(r12, "ItemDetailsWithPriceAndSalePrice|ItemDetailsWithoutPrice", C165567td.A0c(C21388AJo.A00, azjArr), new String[0]);
        C21389AJp aJp = C21389AJp.A00;
        AnonymousClass00C.A0D(r12, 0);
        this.A03 = C203539oF.A09(r4, aJp, new String[]{"media", "image"}, 1, 10);
        this.A00 = r12;
    }
}
