package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1lo  reason: invalid class name and case insensitive filesystem */
public final class C37101lo extends Handler {
    public final Context A00;
    public final AnonymousClass1H2 A01;

    public void handleMessage(Message message) {
        long j;
        C37501mW r2;
        Message obtain;
        C603037i r0 = (C603037i) message.obj;
        AnonymousClass3PG r5 = null;
        if (r0 != null) {
            r2 = r0.A01;
            r5 = r0.A02;
            j = r0.A00;
        } else {
            j = -1;
            r2 = null;
        }
        AnonymousClass1H2 r3 = this.A01;
        Resources resources = this.A00.getResources();
        C18740tg.A06(r5);
        Drawable A06 = r3.A06(resources, r5, 0.6f, j);
        if (r2 != null) {
            r2.setTag(A06);
            obtain = Message.obtain(C65923Tz.A0X, 0, 0, 0, C36441kJ.A0Q(Long.valueOf(j), r2));
        } else {
            obtain = Message.obtain(C65923Tz.A0X, 1, 0, 0, C36441kJ.A0Q(Long.valueOf(j), A06));
        }
        obtain.sendToTarget();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37101lo(Context context, Looper looper, AnonymousClass1H2 r4) {
        super(looper);
        C18740tg.A06(looper);
        this.A00 = context.getApplicationContext();
        this.A01 = r4;
    }
}
