package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.8gW  reason: invalid class name */
public class AnonymousClass8gW extends C178498gd {
    public C605038c A00;
    public C186008vG A01;
    public final C24611Dc A02 = C24611Dc.A00("GetContactsPaymentStatusIndiaUpiNetworkCallback", "network", "IN");

    public AnonymousClass8gW(Context context, AnonymousClass17Y r11, C605038c r12, C29221Vu r13, C186008vG r14) {
        super(context, r11, r13, (AnonymousClass9YX) null, "get-contacts-payment-status");
        this.A01 = r14;
        this.A00 = r12;
    }

    public void A07(C203399nx r18) {
        String A0l;
        try {
            C203399nx r10 = r18;
            C203399nx A0e = C90514aH.A0e(r10, this.A01);
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
            Class<String> cls = String.class;
            Long A0P = C165567td.A0P();
            Long A0Q = C165567td.A0Q();
            Long l = A0P;
            Long l2 = A0Q;
            C203379ns.A03(r10, cls, l, l2, "result", strArr, false);
            C203379ns.A03(r10, C177588e2.class, l, l2, C177588e2.A00, C165617ti.A0l(), false);
            Class<String> cls2 = cls;
            C203379ns.A03(r10, cls2, l, l2, "get-contacts-payment-status", new String[]{"account", "action"}, false);
            C203379ns.A03(r10, cls2, l, l2, C203379ns.A00.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
            C21597ARp aRp = C21597ARp.A00;
            AnonymousClass00C.A0D(r10, 0);
            ArrayList A09 = C203539oF.A09(r10, aRp, new String[]{"account", "contact"}, 0, Long.MAX_VALUE);
            AIB.A03(r10, C21598ARq.A00, new String[]{"account"});
            HashMap A0J = AnonymousClass001.A0J();
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                C184888tA r3 = (C184888tA) it.next();
                A0J.put(r3.A00.getRawString(), r3.A01);
            }
            C605038c r6 = this.A00;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it2 = r6.A03.iterator();
            while (it2.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it2);
                Jid A06 = A0f.A06(UserJid.class);
                if (!(A06 == null || (A0l = C90504aG.A0l(A06.getRawString(), A0J)) == null || 2 != C175728ax.A01(C90514aH.A0y(A0l)))) {
                    A0I.add(A0f);
                }
            }
            r6.A00.accept(A0I);
        } catch (C235919b unused) {
            this.A02.A05("sendGetContactsPaymentStatus/onResponseSuccess/CorruptStreamException");
            C605038c r2 = this.A00;
            r2.A02.accept(new C202059ky(500));
        }
    }

    public void A05(C202059ky r2) {
        super.A05(r2);
        this.A00.A01.accept(r2);
    }

    public void A06(C202059ky r2) {
        super.A06(r2);
        this.A00.A02.accept(r2);
    }
}
