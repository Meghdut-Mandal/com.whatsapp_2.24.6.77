package X;

import android.app.Activity;
import android.database.Cursor;
import android.text.Html;
import android.text.TextUtils;
import android.widget.TextSwitcher;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class B7W extends C132446Tt {
    public Object A00;
    public Object A01;
    public final int A02;

    public B7W(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long j;
        Cursor A09;
        C203399nx[] r7;
        switch (this.A02) {
            case 0:
                C175228a3 r2 = (C175228a3) this.A00;
                AnonymousClass147 A022 = r2.A08.A02((AnonymousClass147) this.A01);
                if (A022 != null) {
                    return r2.A04.A08(A022);
                }
                return null;
            case 1:
                ArrayList A0I = AnonymousClass001.A0I();
                C203399nx A03 = C203399nx.A03((C203399nx) this.A01);
                if (A03 == null || (r7 = A03.A02) == null) {
                    return A0I;
                }
                HashSet A16 = C36441kJ.A16();
                C199129ek r5 = (C199129ek) ((B7L) this.A00).A00;
                Iterator it = C165577te.A0o(r5.A0D).iterator();
                while (it.hasNext()) {
                    A16.add(C165607th.A0S(it).A0A);
                }
                for (C203399nx r9 : r7) {
                    if (r9 != null && "upi".equals(r9.A00)) {
                        C175818b6 r22 = new C175818b6();
                        r22.A04(r5.A07, r9, 3);
                        if (!TextUtils.isEmpty(r22.A06)) {
                            r22.A0I = A16.contains(r22.A06);
                        }
                        A0I.add(r22);
                    }
                }
                return A0I;
            case 2:
                AnonymousClass16S A0O = C165617ti.A0O(((C179148jG) this.A00).A0P);
                int[] iArr = {3};
                synchronized (A0O) {
                    j = 0;
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (char c = 0; c < 1; c = 1) {
                        A0I2.add(Long.toString((long) (iArr[c] << 12)));
                    }
                    AnonymousClass1M0 A032 = A0O.A00.get();
                    try {
                        C224114e r6 = A032.A02;
                        String str = C196709aP.A00;
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("SELECT COUNT(*) as count FROM contacts");
                        A09 = r6.A09(AnonymousClass000.A0q(C196709aP.A00(A0I2, 15 << 12, false), A0u), "getActivePaymentContactsCount/QUERY_SCHEMA_PAY_CONTACTS_COUNT", (String[]) null);
                        if (A09.moveToNext()) {
                            j = C36351kA.A07(A09, "count");
                        }
                        A09.close();
                        A032.close();
                    } catch (Throwable th) {
                        try {
                            A032.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return Long.valueOf(j);
            default:
                return C165577te.A0o(((C179148jG) this.A00).A0P);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C207249un A022;
        C175898bF r0;
        switch (this.A02) {
            case 0:
                AnonymousClass141 r6 = (AnonymousClass141) obj;
                if (r6 != null) {
                    C175228a3 r02 = (C175228a3) this.A00;
                    r02.A0A.A08(r02.A06.A07, r6);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                B1L b1l = ((C199129ek) ((B7L) this.A00).A00).A01;
                if (b1l != null) {
                    b1l.BS2((C202059ky) null, arrayList);
                    return;
                }
                return;
            case 2:
                Long l = (Long) obj;
                if (l.longValue() >= 10) {
                    Activity activity = (Activity) this.A00;
                    if (!activity.isFinishing()) {
                        Object[] A0L = AnonymousClass001.A0L();
                        C90514aH.A1Q(l, A0L, 0);
                        ((TextSwitcher) this.A01).setText(Html.fromHtml(activity.getString(R.string.f12nameremoved, A0L)));
                    }
                }
                ((C178818he) this.A00).A4B(l);
                return;
            default:
                List list = (List) obj;
                if (list != null && list.size() > 0) {
                    C179128jE r3 = (C179128jE) this.A00;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            A022 = C165607th.A0S(it);
                            if (!(A022 instanceof C175748az) || (r0 = A022.A08) == null || !((C175818b6) r0).A0G) {
                            }
                        } else {
                            A022 = AnonymousClass16S.A02(list);
                        }
                    }
                    r3.A0B = A022;
                }
                C194219Oo r4 = (C194219Oo) this.A01;
                String str = r4.A0L;
                IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A00;
                if (str == null) {
                    indiaUpiCheckOrderDetailsActivity.BgH(r4.A06);
                    return;
                } else {
                    indiaUpiCheckOrderDetailsActivity.A06.A04.A00(new AVb(this, r4, 45), str);
                    return;
                }
        }
    }
}
