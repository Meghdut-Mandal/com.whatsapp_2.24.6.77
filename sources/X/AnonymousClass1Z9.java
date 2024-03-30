package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.1Z9  reason: invalid class name */
public final class AnonymousClass1Z9 {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C19630wG A02;
    public final C18820ts A03;
    public final C29391Wl A04;
    public final C21570zS A05;
    public final AnonymousClass00T A06 = new AnonymousClass00U(new AnonymousClass1ZC(this));
    public final AnonymousClass00T A07 = new AnonymousClass00U(new AnonymousClass1ZB(this));
    public final AnonymousClass00T A08 = new AnonymousClass00U(new AnonymousClass1ZD(this));
    public final AnonymousClass00T A09 = new AnonymousClass00U(new AnonymousClass1ZA(this));

    public AnonymousClass1Z9(C19730wQ r3, C19970wo r4, C19630wG r5, C18820ts r6, C29391Wl r7, C21570zS r8) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r7, 6);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A05 = r8;
        this.A03 = r6;
        this.A04 = r7;
    }

    public final List A00() {
        Map map;
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : ((Map) this.A08.getValue()).entrySet()) {
            Object peek = ((PriorityQueue) value.getValue()).peek();
            if (!(peek == null || (map = (Map) this.A06.getValue()) == null || (obj = map.get(peek)) == null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A01() {
        C29391Wl r1 = this.A04;
        r1.A06(((Map) this.A09.getValue()).values());
        r1.A04(((Map) this.A06.getValue()).values());
        r1.A05(((Map) this.A07.getValue()).values());
    }

    public final void A02(int i) {
        String str;
        C128646Db r0 = (C128646Db) ((Map) this.A07.getValue()).get(Integer.valueOf(i));
        if (r0 != null) {
            str = r0.A06;
        } else {
            str = null;
        }
        A03(i, str);
    }

    public final void A03(int i, String str) {
        PriorityQueue priorityQueue;
        Number number;
        Integer valueOf = Integer.valueOf(i);
        ((Map) this.A09.getValue()).remove(valueOf);
        ((Map) this.A06.getValue()).remove(valueOf);
        ((Map) this.A07.getValue()).remove(valueOf);
        if (!(str == null || (priorityQueue = (PriorityQueue) ((Map) this.A08.getValue()).get(str)) == null || (number = (Number) priorityQueue.peek()) == null || i != number.intValue())) {
            priorityQueue.poll();
        }
        SharedPreferences.Editor A002 = C29391Wl.A00(this.A04);
        StringBuilder sb = new StringBuilder();
        sb.append("badged_notice_");
        sb.append(i);
        A002.remove(sb.toString()).apply();
    }

    public final void A04(C64683Pa r3) {
        ((Map) this.A06.getValue()).put(Integer.valueOf(r3.A05.A00), r3);
        A01();
    }
}
