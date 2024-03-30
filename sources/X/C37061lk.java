package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.SoftReference;

/* renamed from: X.1lk  reason: invalid class name and case insensitive filesystem */
public final class C37061lk extends Handler {
    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            Pair pair = (Pair) obj;
            Number number = (Number) pair.first;
            long longValue = number.longValue();
            Object obj2 = pair.second;
            if (obj2 instanceof Drawable) {
                C65923Tz.A0b.put(number, new SoftReference(obj2));
                return;
            }
            C37501mW r4 = (C37501mW) obj2;
            Drawable drawable = (Drawable) r4.getTag();
            C65923Tz.A0b.put(Long.valueOf(longValue), new SoftReference(drawable));
            if (r4.A00 == longValue) {
                r4.A01 = drawable;
                r4.invalidate();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37061lk(Looper looper) {
        super(looper);
        C18740tg.A06(looper);
    }
}
