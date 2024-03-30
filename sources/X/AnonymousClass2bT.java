package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2bT  reason: invalid class name */
public final class AnonymousClass2bT extends AnonymousClass3T1 implements AnonymousClass4RU {
    public long A00;
    public AnonymousClass3J7 A01;
    public C52192p2 A02 = C52192p2.VALID;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public Map A07;

    public AnonymousClass2bT(AnonymousClass2bT r9, C64933Qa r10, long j) {
        super(r9, r10, j, true);
        this.A05 = r9.A05;
        this.A00 = r9.A00;
        A1b(r9);
    }

    public final void A1Z(C19730wQ r4, C46762bd r5) {
        Object A0L;
        AnonymousClass00C.A0D(r5, 0);
        if (!AnonymousClass000.A1S(this.A08 & 32, 32)) {
            A0i(32);
        }
        if (r5.A1J.A02) {
            A0L = C36441kJ.A0n(r4);
        } else {
            A0L = r5.A0L();
        }
        Object obj = this.A1M;
        AnonymousClass00C.A07(obj);
        synchronized (obj) {
            Map map = this.A07;
            if (map == null) {
                map = C36431kI.A1G();
                this.A07 = map;
            }
            if (A0L == null) {
                Log.w("Event Response senderUserJid is null; Not adding to event message");
            } else {
                map.put(A0L, r5);
            }
        }
    }

    public final void A1a(C19730wQ r3, List list) {
        AnonymousClass00C.A0D(r3, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1Z(r3, (C46762bd) it.next());
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r4) {
        AnonymousClass00C.A0D(r4, 0);
        return new AnonymousClass2bT(this, r4, this.A0I);
    }

    public final List A1X() {
        List list;
        Collection values;
        Object obj = this.A1M;
        AnonymousClass00C.A07(obj);
        synchronized (obj) {
            Map map = this.A07;
            if (map == null || (values = map.values()) == null) {
                list = null;
            } else {
                list = C007103b.A0Y(values);
            }
        }
        return list;
    }

    public final Map A1Y() {
        Map map;
        Object obj = this.A1M;
        AnonymousClass00C.A07(obj);
        synchronized (obj) {
            Map map2 = this.A07;
            if (map2 != null) {
                map = C000400e.A0B(map2);
            } else {
                map = null;
            }
        }
        return map;
    }

    public final void A1b(AnonymousClass2bT r3) {
        this.A05 = r3.A05;
        this.A00 = r3.A00;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A04 = r3.A04;
        this.A06 = r3.A06;
        this.A02 = r3.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2bT(C64933Qa r2, String str, long j, long j2) {
        super(r2, 92, j);
        AnonymousClass00C.A0D(str, 3);
        this.A05 = str;
        this.A00 = j2;
    }
}
