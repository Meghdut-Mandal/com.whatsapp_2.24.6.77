package X;

import android.database.Cursor;

/* renamed from: X.3qG  reason: invalid class name and case insensitive filesystem */
public class C77293qG implements AnonymousClass4TY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C62093Et A01;

    public String BDe() {
        return "is_starred";
    }

    public C77293qG(C62093Et r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public void B5q(C21820zr r9) {
        Cursor A09;
        AnonymousClass1NO r0 = this.A01.A04;
        long j = this.A00;
        AnonymousClass1M0 A04 = r0.A09.get();
        try {
            C224114e r7 = A04.A02;
            boolean z = true;
            String[] strArr = new String[1];
            C36421kH.A1Q(strArr, j);
            A09 = r7.A09("SELECT starred FROM message_view WHERE _id = ?", "IS_MESSAGE_STARRED_SQL", strArr);
            if (A09.moveToNext()) {
                if (C36351kA.A03(A09, "starred") != 1) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                A09.close();
                A04.close();
                if (valueOf != null) {
                    r9.A00(1, "is_starred", valueOf);
                    return;
                }
                return;
            }
            A09.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
