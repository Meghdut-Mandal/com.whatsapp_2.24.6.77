package X;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: X.0UY  reason: invalid class name */
public final class AnonymousClass0UY {
    public String A00;
    public String A01;
    public Looper A02;
    public C02610Bd A03 = C02610Bd.A00;
    public AnonymousClass0JC A04 = AnonymousClass0S3.A01;
    public final ArrayList A05 = AnonymousClass001.A0I();
    public final ArrayList A06 = AnonymousClass001.A0I();
    public final Map A07 = new AnonymousClass008();
    public final Map A08 = new AnonymousClass008();
    public final Set A09 = new HashSet();
    public final Context A0A;
    public final Set A0B = new HashSet();

    public AnonymousClass0JO A00() {
        Map map = this.A08;
        AnonymousClass006.A07(!map.isEmpty(), "must call addApi() to add at least one API");
        C10090dg r3 = C10090dg.A00;
        C06190Sq r1 = AnonymousClass0S3.A04;
        if (map.containsKey(r1)) {
            r3 = (C10090dg) map.get(r1);
        }
        Set set = this.A09;
        Map map2 = this.A07;
        AnonymousClass0TT r17 = new AnonymousClass0TT(r3, this.A00, this.A01, map2, set);
        Map map3 = r17.A04;
        AnonymousClass008 r4 = new AnonymousClass008();
        AnonymousClass008 r32 = new AnonymousClass008();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A10 = AnonymousClass000.A10(map);
        C06190Sq r8 = null;
        while (A10.hasNext()) {
            C06190Sq r7 = (C06190Sq) A10.next();
            Object obj = map.get(r7);
            boolean A1V = AnonymousClass000.A1V(map3.get(r7));
            r4.put(r7, Boolean.valueOf(A1V));
            C10140dl r14 = new C10140dl(r7, A1V);
            A0I.add(r14);
            AnonymousClass0JC r13 = r7.A00;
            AnonymousClass006.A01(r13);
            C17590rf A002 = r13.A00(this.A0A, this.A02, r14, r14, r17, obj);
            r32.put(r7.A01, A002);
            if (A002.BmV()) {
                if (r8 == null) {
                    r8 = r7;
                } else {
                    throw AnonymousClass001.A09(AnonymousClass000.A0p(" cannot be used with ", r8.A02, AnonymousClass000.A0v(r7.A02)));
                }
            }
        }
        if (r8 != null) {
            String str = r8.A02;
            Object[] objArr = {str};
            if (!set.equals(this.A0B)) {
                throw AnonymousClass001.A09(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
            }
        }
        for (C17590rf BoS : r32.values()) {
            BoS.BoS();
        }
        Context context = this.A0A;
        ReentrantLock reentrantLock = new ReentrantLock();
        AnonymousClass0TT r11 = r17;
        AnonymousClass0JO r6 = new AnonymousClass0JO(context, this.A02, this.A03, this.A04, r11, A0I, this.A05, this.A06, r4, r32, reentrantLock);
        Set set2 = AnonymousClass0XK.A00;
        synchronized (set2) {
            set2.add(r6);
        }
        return r6;
    }

    public void A01(C06190Sq r3) {
        AnonymousClass006.A02(r3, "Api must not be null");
        this.A08.put(r3, (Object) null);
        AnonymousClass006.A02(r3.A00, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        this.A0B.addAll(emptyList);
        this.A09.addAll(emptyList);
    }

    public AnonymousClass0UY(Context context) {
        this.A0A = context;
        this.A02 = context.getMainLooper();
        this.A00 = context.getPackageName();
        this.A01 = AnonymousClass000.A0k(context);
    }
}
