package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6mT  reason: invalid class name and case insensitive filesystem */
public final class C140976mT implements C157937ew, C157957ey, C157917et, C159077il, C157947ex, AnonymousClass7ev {
    public Executor A00;
    public Executor A01;
    public Executor A02;
    public final Context A03;
    public final SharedPreferences A04;

    public synchronized Executor BBh(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            Executor executor = this.A00;
            if (executor == null) {
                executor = A00(num);
                this.A00 = executor;
            }
            Objects.requireNonNull(executor);
            return executor;
        } else if (intValue != 1) {
            Executor executor2 = this.A01;
            if (executor2 == null) {
                executor2 = A00(num);
                this.A01 = executor2;
            }
            Objects.requireNonNull(executor2);
            return executor2;
        } else {
            Executor executor3 = this.A02;
            if (executor3 == null) {
                executor3 = A00(num);
                this.A02 = executor3;
            }
            Objects.requireNonNull(executor3);
            return executor3;
        }
    }

    public C140976mT(Context context) {
        this.A03 = context.getApplicationContext();
        this.A04 = context.getSharedPreferences("default-cask-metadata", 0);
    }

    public static ExecutorService A00(Integer num) {
        ExecutorService newCachedThreadPool;
        AnonymousClass77Q r2 = new AnonymousClass77Q(num);
        int intValue = num.intValue();
        if (intValue == 0 || intValue != 1) {
            newCachedThreadPool = Executors.newCachedThreadPool(r2);
        } else {
            newCachedThreadPool = Executors.newSingleThreadExecutor(r2);
        }
        Objects.requireNonNull(newCachedThreadPool);
        return newCachedThreadPool;
    }

    public AnonymousClass6O6 B8f() {
        AnonymousClass6O6 r0;
        Context context = this.A03;
        synchronized (AnonymousClass6O6.class) {
            r0 = AnonymousClass6O6.A03;
            if (r0 == null) {
                r0 = new AnonymousClass6O6(context);
                AnonymousClass6O6.A03 = r0;
            }
        }
        return r0;
    }

    public AnonymousClass6EQ BHy(String str) {
        return new AnonymousClass6EQ(this.A04, str);
    }

    public boolean BMJ() {
        C132236St r0;
        synchronized (C132236St.class) {
            r0 = C132236St.A07;
            if (r0 == null) {
                r0 = new C132236St();
                C132236St.A07 = r0;
            }
        }
        return C36431kI.A1P((r0.A01() > 419430400 ? 1 : (r0.A01() == 419430400 ? 0 : -1)));
    }

    public boolean BNi() {
        C132236St r0;
        synchronized (C132236St.class) {
            r0 = C132236St.A07;
            if (r0 == null) {
                r0 = new C132236St();
                C132236St.A07 = r0;
            }
        }
        return C36431kI.A1P((r0.A01() > 104857600 ? 1 : (r0.A01() == 104857600 ? 0 : -1)));
    }

    public static void A01(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A01(file2);
                }
                file2.delete();
            }
        }
    }

    public boolean B5E(File file) {
        if (file.isDirectory()) {
            A01(file);
        }
        return file.delete();
    }

    public Context B8h() {
        return this.A03;
    }
}
