package X;

import android.util.Pair;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2kJ  reason: invalid class name and case insensitive filesystem */
public class C50162kJ extends C132446Tt {
    public final C19600wD A00;
    public final AnonymousClass16D A01;
    public final C21159AAt A02;
    public final AnonymousClass19A A03;
    public final WeakReference A04;
    public final List A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (!this.A00.A09()) {
            return C36441kJ.A0Q(C131626Pu.A04, (Object) null);
        }
        try {
            this.A03.A0B(32000);
            return this.A02.A03(C108515Tu.A0C, this.A05);
        } catch (C33111ej unused) {
            return C36441kJ.A0Q(C131626Pu.A04, (Object) null);
        }
    }

    public void A09() {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A04.get();
        if (indiaUpiPaymentSettingsFragment != null) {
            IndiaUpiPaymentSettingsFragment.A09(indiaUpiPaymentSettingsFragment, indiaUpiPaymentSettingsFragment.A0W);
        }
    }

    public void A0A() {
        this.A04.get();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        String str2;
        Pair pair = (Pair) obj;
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A04.get();
        if (indiaUpiPaymentSettingsFragment != null) {
            if (pair == null) {
                str2 = "handlecontactlesssync/fetchContactUsingNumbers/disconnected/";
            } else {
                C131626Pu r1 = (C131626Pu) pair.first;
                if (r1.A01()) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    HashMap A0J = AnonymousClass001.A0J();
                    for (C194169Oj r0 : (C194169Oj[]) pair.second) {
                        UserJid userJid = r0.A0D;
                        if (userJid != null) {
                            AnonymousClass141 A0D = this.A01.A0D(userJid);
                            if (A0D.A0H != null) {
                                A0J.put(A0D.A0H.getRawString(), A0D);
                            }
                        }
                    }
                    Iterator it = this.A05.iterator();
                    while (it.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it);
                        try {
                            UserJid userJid2 = PhoneUserJid.WHATSAPP_CAPS_SURVEY;
                            A0I.add(A0J.get(C222913s.A00(A0C).getRawString()));
                        } catch (C19740wR unused) {
                            C36321k7.A1Q("handlecontactlesssync/onPostExecute unable to get phone num jid for contact: ", A0C, AnonymousClass000.A0u());
                        }
                    }
                    if (!A0I.isEmpty()) {
                        List list = indiaUpiPaymentSettingsFragment.A0W;
                        if (list == null) {
                            list = AnonymousClass001.A0I();
                            indiaUpiPaymentSettingsFragment.A0W = list;
                        }
                        list.addAll(A0I);
                    }
                } else {
                    int i = r1.A00;
                    if (i == 0) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/network-unavailable/";
                    } else if (i == 5) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/rateLimited/try-again-later/";
                    } else if (i == 4) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/try-again/";
                    } else if (i == 1) {
                        str2 = "handlecontactlesssync/fetchContactUsingNumbers/existing request ongoing/";
                    } else if (i == 6) {
                        str = "handlecontactlesssync/fetchContactUsingNumbers/exception-occurred/";
                    } else {
                        return;
                    }
                    Log.w(str);
                }
                IndiaUpiPaymentSettingsFragment.A09(indiaUpiPaymentSettingsFragment, indiaUpiPaymentSettingsFragment.A0W);
                return;
            }
            Log.w(str2);
        }
    }

    public C50162kJ(C19600wD r2, AnonymousClass16D r3, C21159AAt aAt, AnonymousClass19A r5, IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, List list) {
        this.A04 = AnonymousClass001.A0F(indiaUpiPaymentSettingsFragment);
        this.A05 = list;
        this.A03 = r5;
        this.A02 = aAt;
        this.A01 = r3;
        this.A00 = r2;
    }
}
