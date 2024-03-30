package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2k5  reason: invalid class name and case insensitive filesystem */
public class C50032k5 extends C132446Tt {
    public final AnonymousClass1N4 A00;
    public final AnonymousClass1KK A01;
    public final AnonymousClass16D A02;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C18820ts A05;
    public final C230416y A06;
    public final AnonymousClass11F A07;
    public final C230116v A08;
    public final WeakReference A09;
    public final List A0A;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C225314u A0W = C36411kG.A0W(this.A09);
        if (A0W != null) {
            Intent intent = A0W.getIntent();
            A0W.BuO(AnonymousClass190.A0S(A0W, C66013Ui.A03(C66013Ui.A0A(intent.getBundleExtra("quoted_message"))), this.A07, C65533Sl.A00(intent, "quoted_group_jid"), arrayList, intent.getBooleanExtra("has_number_from_url", false)), 8);
            A0W.Bnv();
        }
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A09);
        if (A0W != null) {
            A0W.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public C50032k5(AnonymousClass1N4 r2, AnonymousClass1KK r3, AnonymousClass16D r4, PhoneContactsSelector phoneContactsSelector, C21060yb r6, C19630wG r7, C18820ts r8, C230416y r9, AnonymousClass11F r10, C230116v r11, List list) {
        this.A04 = r7;
        this.A02 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A08 = r11;
        this.A09 = AnonymousClass001.A0F(phoneContactsSelector);
        this.A07 = r10;
        this.A0A = list;
        this.A06 = r9;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("phonecontactsselector/onsubmit/convertcontactstask ");
        List<C62583Gs> list = this.A0A;
        A0u.append(list.size());
        C224214g r4 = new C224214g(AnonymousClass000.A0q(" selected contacts", A0u));
        for (C62583Gs r11 : list) {
            String str = r11.A02;
            if (str == null) {
                long j = r11.A04;
                SystemClock.uptimeMillis();
                C19630wG r13 = this.A04;
                AnonymousClass16D r10 = this.A02;
                C21060yb r12 = this.A03;
                C18820ts r14 = this.A05;
                str = PhoneContactsSelector.A0u(this.A00, this.A01, r10, r11, r12, r13, r14, this.A06, this.A08);
                r11.A02 = str;
                SystemClock.uptimeMillis();
                if (str == null) {
                    Log.w(C36381kD.A0z("phonecontactsselector/onsubmit/convertcontactstask/could not generate vcard for contact with id ", AnonymousClass000.A0u(), j));
                }
            }
            A0I.add(str);
        }
        r4.A01();
        return A0I;
    }
}
