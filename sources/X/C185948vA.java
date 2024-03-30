package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.8vA  reason: invalid class name and case insensitive filesystem */
public final class C185948vA extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0e("false", "true");

    public C185948vA(UserJid userJid, C185718ug r13, C185718ug r14, C185718ug r15, C185718ug r16, C185648uZ r17, Long l, Long l2, Long l3, Long l4, String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "w:biz:catalog");
        C165567td.A1C(new AnonymousClass1AL("smax_id", 35), A0T);
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("collections");
        if (C203539oF.A0N(userJid, "collections->biz_jid")) {
            C36351kA.A1I(userJid, A0q, "biz_jid");
        }
        AnonymousClass00C.A0D(A00, 2);
        C165587tf.A1C(A0q, r17);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("collection_limit");
        Long l5 = l;
        C165587tf.A1D(A0q2, l5, C203539oF.A0L(l5, 0, 20, false) ? 1 : 0);
        C36361kB.A1H(A0q2, A0q);
        AnonymousClass6QB A0q3 = C36441kJ.A0q("item_limit");
        Long l6 = l2;
        C165587tf.A1D(A0q3, l6, C203539oF.A0L(l6, 0, 50, false) ? 1 : 0);
        C36361kB.A1H(A0q3, A0q);
        AnonymousClass6QB A0q4 = C36441kJ.A0q("width");
        Long l7 = l3;
        C165587tf.A1D(A0q4, l7, C203539oF.A0L(l7, 1, 2048, false) ? 1 : 0);
        C36361kB.A1H(A0q4, A0q);
        AnonymousClass6QB A0q5 = C36441kJ.A0q("height");
        Long l8 = l4;
        C165587tf.A1D(A0q5, l8, C203539oF.A0L(l8, 1, 2048, false) ? 1 : 0);
        C36361kB.A1H(A0q5, A0q);
        C165577te.A1G(A0q, r13);
        C165577te.A1G(A0q, r14);
        C165577te.A1G(A0q, r15);
        C165577te.A1G(A0q, r16);
        C165567td.A1F(A0q, A0T, this);
    }
}
