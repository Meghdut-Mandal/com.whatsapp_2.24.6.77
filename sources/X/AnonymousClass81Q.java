package X;

import android.os.Looper;
import android.os.Message;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.81Q  reason: invalid class name */
public abstract class AnonymousClass81Q extends AnonymousClass9TM {
    public C006302t A00;
    public final AnonymousClass9UM A01 = new AnonymousClass9UM();
    public final AnonymousClass9UM A02 = new AnonymousClass9UM();
    public final HashMap A03 = AnonymousClass001.A0J();

    public static AnonymousClass88E A00(AnonymousClass81Q r1, Throwable th) {
        StringBuilder sb = new StringBuilder();
        r1.A05(sb);
        sb.toString();
        return new AnonymousClass88E(th);
    }

    public static void A01(AnonymousClass9QJ r1, AnonymousClass81Q r2, C17960sM[] r3, int i) {
        r2.A04(new AnonymousClass8AL(r1.A02(r2, r3[i])));
    }

    public static void A02(AnonymousClass84B r3, String str) {
        r3.A08(new C1695289r(str), (Throwable) null, true);
    }

    public final void A05(StringBuilder sb) {
        String str;
        ArrayList arrayList;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("State machine ");
        A0u.append("sup:MediaStreamState");
        printWriter.println(AnonymousClass000.A0t(A0u, ':'));
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Current state ");
        C195999Xe A032 = A03();
        if (A032 != null) {
            str = A032.A00();
        } else {
            str = null;
        }
        printWriter.println(AnonymousClass000.A0q(str, A0u2));
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        AnonymousClass9UM r0 = this.A02;
        if (r0 != null) {
            arrayList = r0.A00();
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            printWriter.println("State transition history:");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass9GT r4 = (AnonymousClass9GT) it.next();
                printWriter.printf("%s  %s", new Object[]{dateTimeInstance.format(new Date(r4.A00)), r4.A01});
                printWriter.println();
            }
        } else {
            printWriter.println("State transition history is disabled");
        }
        printWriter.println();
        printWriter.println("Event history:");
        Iterator it2 = this.A01.A00().iterator();
        while (it2.hasNext()) {
            AnonymousClass9GT r42 = (AnonymousClass9GT) it2.next();
            printWriter.printf("%s  %s", new Object[]{dateTimeInstance.format(new Date(r42.A00)), r42.A01});
            printWriter.println();
        }
        C36351kA.A1K(stringWriter, sb);
    }

    public AnonymousClass81Q(Looper looper) {
        super(looper);
    }

    public final void A04(C15880o9 r5) {
        int A0I;
        Class<?> cls = r5.getClass();
        synchronized (this) {
            AnonymousClass00C.A0D(cls, 0);
            HashMap hashMap = this.A03;
            Object obj = hashMap.get(cls);
            if (obj == null) {
                obj = Integer.valueOf(hashMap.size());
                hashMap.put(cls, obj);
            }
            A0I = AnonymousClass000.A0I(obj);
        }
        C166097v1 r1 = this.A00;
        if (r1 != null) {
            r1.sendMessage(Message.obtain(r1, A0I, r5));
        }
    }
}
