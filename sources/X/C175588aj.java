package X;

/* renamed from: X.8aj  reason: invalid class name and case insensitive filesystem */
public class C175588aj extends C183388qi {
    public final /* synthetic */ AnonymousClass9YB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175588aj(AnonymousClass9YB r2) {
        super((Runnable) null);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        boolean z2;
        AnonymousClass16S r6 = this.A00.A01;
        boolean A0G = r6.A0G();
        AnonymousClass1M0 A04 = r6.A00.A04();
        try {
            int A03 = A04.A02.A03("contacts", (String) null, "PaymentStore/removeAllContacts/DELETE_SCHEMA_PAY_CONTACTS", (String[]) null);
            if (A03 >= 0) {
                C36321k7.A1T("PAY: PaymentStore removeAllContacts deleted num rows: ", AnonymousClass000.A0u(), A03);
                z = true;
            } else {
                C36321k7.A1U("PAY: PaymentStore removeAllContacts could not delete all rows: ", AnonymousClass000.A0u(), A03);
                z = false;
            }
            A04.close();
            boolean z3 = A0G & z;
            A04 = r6.A00.A04();
            int A032 = A04.A02.A03("tmp_transactions", (String) null, "removeAllPaymentTransactionTmpInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP", (String[]) null);
            if (A032 >= 0) {
                z2 = true;
            } else {
                C36321k7.A1U("PAY: PaymentStore removeAllPaymentTransactionTmpInfo could not delete all rows: ", AnonymousClass000.A0u(), A032);
                z2 = false;
            }
            A04.close();
            return Boolean.valueOf(z3 & z2);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
