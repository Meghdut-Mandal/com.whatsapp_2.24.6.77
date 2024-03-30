package X;

import android.content.Context;
import android.database.Cursor;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.AWz  reason: case insensitive filesystem */
public class C21705AWz implements Runnable {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public final int A04 = 0;

    public C21705AWz(C167687yZ r2, int i, int i2) {
        this.A03 = r2;
        this.A00 = R.string.f12nameremoved;
        this.A01 = i;
        this.A02 = i2;
    }

    public final void run() {
        Cursor A09;
        AnonymousClass3T1 r3;
        AnonymousClass9OX r2;
        if (this.A04 != 0) {
            C167687yZ r6 = (C167687yZ) this.A03;
            int i = this.A01;
            int i2 = this.A02;
            AnonymousClass16S r22 = r6.A0C;
            C202319lY r1 = r6.A07;
            C207249un A07 = r22.A07(r1.A0H);
            r6.A05 = A07;
            if (A07 == null) {
                r2 = new AnonymousClass9OX(3);
                Context context = r6.A04.A00;
                r2.A08 = context.getString(R.string.f12nameremoved);
                r2.A07 = context.getString(i);
            } else {
                r2 = new AnonymousClass9OX(i2);
                r2.A03 = r1;
            }
            r6.A09.A0C(r2);
            return;
        }
        C70803fk r5 = (C70803fk) this.A03;
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = this.A02;
        Calendar instance = Calendar.getInstance(C36401kF.A0x(r5.A36));
        instance.clear();
        instance.set(i3, i4, i5);
        C20310xM r62 = r5.A3R;
        String[] strArr = new String[1];
        C36341k9.A1W(strArr, instance.getTimeInMillis());
        AnonymousClass1M0 A042 = r62.A0c.get();
        try {
            A09 = A042.A02.A09("SELECT * FROM available_message_view WHERE timestamp >= ?  ORDER BY timestamp LIMIT 1", "SELECT_FIRST_MESSAGE_AFTER_TIMESTAMP", strArr);
            if (!A09.moveToFirst()) {
                r3 = null;
            } else {
                r3 = r62.A1B.A00(A09);
            }
            A09.close();
            A042.close();
            if (r3 != null) {
                r5.A1U.A0H(new C80283v9(r5, r3, 39));
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C21705AWz(C70803fk r2, int i, int i2, int i3) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
