package X;

import android.content.Context;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: X.13k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C222313k implements Callable {
    public final /* synthetic */ C19730wQ A00;

    public /* synthetic */ C222313k(C19730wQ r1) {
        this.A00 = r1;
    }

    public final Object call() {
        C222413l r2;
        C19730wQ r5 = this.A00;
        try {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("MeManager/loadMe");
            C20000wr r4 = r5.A08;
            r4.A03();
            Log.i("memanager/load-me");
            Context context = r5.A09.A00;
            if (new File(context.getFilesDir(), "me").exists()) {
                try {
                    FileInputStream openFileInput = context.openFileInput("me");
                    try {
                        r2 = new C222413l(r5, openFileInput);
                        C19730wQ.A01((Me) r2.readObject(), r5);
                        r4.A01();
                        r2.close();
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                    } catch (Throwable th) {
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        throw th;
                    }
                } catch (ClassNotFoundException e) {
                    Log.w("memanager/read_me/serialization_error", e);
                } catch (IOException e2) {
                    Log.e("memanager/read_me/io_error", e2);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            if (r4.A06()) {
                r4.A02();
            }
            AnonymousClass00h.A00();
            return null;
            throw th;
        } catch (Throwable th3) {
            C20000wr r1 = r5.A08;
            if (r1.A06()) {
                r1.A02();
            }
            Method method2 = C000600g.A03;
            AnonymousClass00h.A00();
            throw th3;
        }
    }
}
