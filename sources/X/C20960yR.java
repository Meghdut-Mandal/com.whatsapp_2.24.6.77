package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0yR  reason: invalid class name and case insensitive filesystem */
public final class C20960yR implements C20920yN {
    public final C20880yJ A00;
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final AnonymousClass005 A02;

    public C20960yR(C20880yJ r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A02 = r4;
        this.A00 = r3;
    }

    public void BqE(Object obj, int i, int i2) {
        C20880yJ r5 = this.A00;
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (r5.A00.A06 == Thread.currentThread().getId()) {
            A00(this, obj, i, i2);
        } else {
            r5.A01.execute(new C35271iQ(this, i3, obj2, i4, 2));
        }
    }

    public static final void A00(C20960yR r5, Object obj, int i, int i2) {
        long j;
        long j2;
        long j3;
        long j4;
        Object obj2;
        int i3;
        C219110w r1;
        if (i == 11) {
            r1 = (C219110w) r5.A02.get();
            j = (long) i;
            j4 = 62;
        } else if (obj == null) {
            JniBridge.jvidispatchIIIO(4, (long) i2, (long) i, ((JniBridge) ((C219110w) r5.A02.get())).wajContext.get());
            return;
        } else if (obj instanceof String) {
            JniBridge.jvidispatchIIIOO(1, (long) i2, (long) i, obj, ((JniBridge) ((C219110w) r5.A02.get())).wajContext.get());
            return;
        } else if (obj instanceof Integer) {
            r1 = (C219110w) r5.A02.get();
            j = (long) i;
            j4 = (long) ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            r1 = (C219110w) r5.A02.get();
            j = (long) i;
            j4 = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            JniBridge.jvidispatchIIIDO((long) i2, (long) i, ((Number) obj).doubleValue(), ((JniBridge) ((C219110w) r5.A02.get())).wajContext.get());
            return;
        } else if (obj instanceof Boolean) {
            j = (long) i;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            JniBridge jniBridge = (JniBridge) ((C219110w) r5.A02.get());
            j2 = (long) i2;
            if (booleanValue) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            obj2 = jniBridge.wajContext.get();
            i3 = 1;
            JniBridge.jvidispatchIIIIO(i3, j2, j, j4, obj2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported attribute type: ");
            sb.append(obj.getClass().getName());
            C18740tg.A0A(new IllegalArgumentException(sb.toString()));
            return;
        }
        j2 = (long) i2;
        obj2 = ((JniBridge) r1).wajContext.get();
        i3 = 0;
        JniBridge.jvidispatchIIIIO(i3, j2, j, j4, obj2);
    }

    public final void A01() {
        this.A00.A01.A01();
        try {
            this.A01.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(')');
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }
}
