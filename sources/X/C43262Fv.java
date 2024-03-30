package X;

import android.util.Pair;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Fv  reason: invalid class name and case insensitive filesystem */
public class C43262Fv extends C49032iS {
    public final C19600wD A00;
    public final AnonymousClass16D A01;
    public final C21159AAt A02;
    public final AnonymousClass19A A03;
    public final List A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list = this.A04;
        list.size();
        C61143As r7 = new C61143As((AnonymousClass6O7) null, AnonymousClass001.A0I(), AnonymousClass001.A0I(), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Set) null);
        if (!this.A00.A09()) {
            return r7;
        }
        try {
            this.A03.A0B(32000);
            Pair A032 = this.A02.A03(C108515Tu.A0C, list);
            if (!((C131626Pu) A032.first).A01()) {
                return r7;
            }
            HashMap A0J = AnonymousClass001.A0J();
            ArrayList A0I = AnonymousClass001.A0I();
            for (C194169Oj r0 : (C194169Oj[]) A032.second) {
                UserJid userJid = r0.A0D;
                if (userJid != null) {
                    AnonymousClass141 A0D = this.A01.A0D(userJid);
                    if (A0D.A0H != null) {
                        A0J.put(A0D.A0H.getRawString(), A0D);
                    }
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                try {
                    UserJid userJid2 = PhoneUserJid.WHATSAPP_CAPS_SURVEY;
                    A0I.add(A0J.get(C222913s.A00(A0C).getRawString()));
                } catch (C19740wR unused) {
                    C36321k7.A1Q("PaymentMerchantListQueryContactsTask/doInBackground unable to get phone num jid for contact: ", A0C, AnonymousClass000.A0u());
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PaymentMerchantListQueryContactsTask/doInBackground query success merchants contacts: ");
            C36321k7.A1Y(A0u, A0I.size());
            return new C61143As((AnonymousClass6O7) null, AnonymousClass001.A0I(), A0I, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Set) null);
        } catch (C33111ej unused2) {
            return r7;
        }
    }

    public C43262Fv(C19600wD r1, AnonymousClass16D r2, ContactPickerFragment contactPickerFragment, C21159AAt aAt, AnonymousClass19A r5, List list) {
        super(contactPickerFragment);
        this.A04 = list;
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = aAt;
        this.A00 = r1;
    }
}
