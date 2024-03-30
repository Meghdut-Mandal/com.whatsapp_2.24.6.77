package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.B7x  reason: case insensitive filesystem */
public class C23163B7x implements DialogInterface.OnClickListener {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23163B7x(Object obj, Object obj2, int i, long j) {
        this.A03 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            C21302AGg aGg = (C21302AGg) this.A01;
            long j = this.A00;
            Intent A1Z = new AnonymousClass190().A1Z(aGg.A01, (AnonymousClass11F) this.A02, 0);
            A1Z.putExtra("extra_quoted_message_row_id", j);
            aGg.A01.startActivity(A1Z);
            return;
        }
        Context context = (Context) this.A01;
        long j2 = this.A00;
        Intent A1Z2 = new AnonymousClass190().A1Z(context, (AnonymousClass11F) this.A02, 0);
        A1Z2.putExtra("extra_quoted_message_row_id", j2);
        context.startActivity(A1Z2);
    }
}
