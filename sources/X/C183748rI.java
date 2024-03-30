package X;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.util.Pair;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import java.util.Iterator;

/* renamed from: X.8rI  reason: invalid class name and case insensitive filesystem */
public class C183748rI extends C132446Tt {
    public final C64933Qa A00;
    public final String A01;
    public final boolean A02 = true;
    public final /* synthetic */ C167797yq A03;

    public C183748rI(C167797yq r2, C64933Qa r3, String str) {
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        AnonymousClass1M0 A05;
        C24881Ed r7 = this.A03.A0R;
        String str = this.A00.A01;
        String str2 = this.A01;
        if (C24881Ed.A07(str, str2) == null) {
            z = false;
        } else {
            try {
                A05 = r7.A03.A05();
                Pair A08 = C24881Ed.A08(str, str2);
                z = false;
                if (A08 != null) {
                    if (A05.A02.A03("pay_transaction", (String) A08.first, "removeTransactionInfoByTransIdV2/DELETE_PAY_TRANSACTION", (String[]) A08.second) > 0) {
                        z = true;
                    }
                }
                A05.close();
            } catch (SQLiteDatabaseCorruptException e) {
                r7.A04.A0A("removeTransactionInfoByTransId", e);
                z = false;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return Boolean.valueOf(z);
        throw th;
    }

    public void A09() {
        if (this.A02) {
            this.A03.A0p(false);
        }
    }

    public void A0A() {
        if (this.A02) {
            this.A03.A0p(true);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Object r1;
        C167797yq r3 = this.A03;
        r3.A0p(false);
        if (((Boolean) obj).booleanValue()) {
            Iterator A0s = C36361kB.A0s(r3.A0W);
            while (A0s.hasNext()) {
                C203349np r12 = (C203349np) ((B2Z) A0s.next());
                switch (r12.A01) {
                    case 2:
                        IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = (IndiaUpiMandateHistoryActivity) r12.A00;
                        indiaUpiMandateHistoryActivity.A05.A04("payment transaction deleted");
                        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = indiaUpiMandateHistoryActivity.A02;
                        AVY.A00(indiaUpiMandateHistoryViewModel.A06, indiaUpiMandateHistoryViewModel, 48);
                        break;
                    case 3:
                        ((PaymentTransactionHistoryActivity) r12.A00).A3i();
                        break;
                    case 5:
                        ((C21243ADz) r12.A00).A00(false);
                        break;
                }
            }
            if (r3 instanceof C180338lb) {
                r1 = new C180268lU(116);
            } else {
                r1 = new C194139Og(2);
            }
            r3.A08.A0D(r1);
        }
    }
}
