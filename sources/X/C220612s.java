package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.12s  reason: invalid class name and case insensitive filesystem */
public class C220612s {
    public final AnonymousClass12P A00;
    public final C19630wG A01;
    public final C21350z4 A02;

    public void A01() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore-manager/finish/db-is-ready ");
            AnonymousClass12P r1 = this.A00;
            r1.A06();
            sb.append(r1.A08);
            Log.i(sb.toString());
            r1.A06();
            if (!r1.A08) {
                Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
            } else {
                r1.A07 = true;
            }
        }
    }

    public C131006Ni A00() {
        C131006Ni r1;
        AnonymousClass12P r3 = this.A00;
        r3.A06();
        ReentrantReadWriteLock.WriteLock writeLock = r3.A04;
        writeLock.lock();
        try {
            Log.i("msgstore-manager/initialize");
            synchronized (r3) {
                if (!r3.A08) {
                    AnonymousClass12P.A00(r3);
                    AnonymousClass12P.A01(r3);
                    r1 = new C131006Ni(2);
                } else {
                    r1 = new C131006Ni(0);
                }
            }
            writeLock.unlock();
            return r1;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public void A02() {
        AnonymousClass12P r0 = this.A00;
        r0.A06();
        AnonymousClass12P.A00(r0);
    }

    public void A03() {
        AnonymousClass12P r0 = this.A00;
        r0.A06();
        r0.A02.A03 = true;
        A02();
        try {
            Context context = this.A01.A00;
            Intent intent = new Intent(context, Class.forName("com.whatsapp.Main"));
            intent.setFlags(268468224);
            context.startActivity(intent);
            this.A02.A03("MessageStoreLifecycleManager");
        } catch (ClassNotFoundException e) {
            Log.e((Throwable) e);
        }
    }

    public C220612s(C19630wG r1, C21350z4 r2, AnonymousClass12P r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
