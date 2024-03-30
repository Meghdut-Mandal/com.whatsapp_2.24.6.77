package androidx.sharetarget;

import X.AnonymousClass001;
import X.AnonymousClass008;
import X.AnonymousClass0GE;
import X.AnonymousClass0X5;
import X.AnonymousClass0Y4;
import X.AnonymousClass75C;
import X.C06550Ua;
import X.C120725ry;
import X.C1503374w;
import X.C163727qf;
import X.C36361kB;
import X.C36441kJ;
import X.C90494aF;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ShortcutInfoCompatSaverImpl extends C06550Ua {
    public static final Object A07 = C36441kJ.A11();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final Map A03 = new AnonymousClass008();
    public final Map A04 = new AnonymousClass008();
    public final ExecutorService A05;
    public final ExecutorService A06;

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    A08 = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return A08;
    }

    public /* bridge */ /* synthetic */ Object A00() {
        AnonymousClass0GE r3 = new AnonymousClass0GE();
        this.A05.submit(new AnonymousClass75C((Object) this, (Object) r3, 7));
        return r3;
    }

    public List A02() {
        return (List) this.A05.submit(new C163727qf(this, 0)).get();
    }

    public void A03(AnonymousClass0GE r6) {
        AnonymousClass75C r4 = new AnonymousClass75C((Object) this, (Object) C90494aF.A0g(this.A04), 5);
        AnonymousClass0GE r3 = new AnonymousClass0GE();
        this.A06.submit(new C1503374w(this, r3, r4, 2));
        r3.B0P(new C1503374w(this, r3, r6, 0), this.A05);
    }

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File A0w = C36441kJ.A0w(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = C36441kJ.A0w(A0w, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = C36441kJ.A0w(A0w, "targets.xml");
        executorService.submit(new AnonymousClass75C((Object) this, (Object) A0w, 6));
    }

    public /* bridge */ /* synthetic */ Object A01(List list) {
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new AnonymousClass0Y4((AnonymousClass0X5) it.next()).A00());
        }
        AnonymousClass0GE r3 = new AnonymousClass0GE();
        this.A05.submit(new C1503374w(this, A0r, r3, 1));
        return r3;
    }

    public void A04(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C120725ry) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                A0I.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!A0I.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
