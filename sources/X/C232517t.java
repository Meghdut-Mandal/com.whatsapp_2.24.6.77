package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.17t  reason: invalid class name and case insensitive filesystem */
public class C232517t {
    public final List A00 = new CopyOnWriteArrayList();

    public void A01(Object obj) {
        for (C22910AyM BX5 : this.A00) {
            BX5.BX5(obj);
        }
    }

    public void A00(C22910AyM ayM) {
        C18740tg.A06(ayM);
        List list = this.A00;
        if (!list.contains(ayM)) {
            list.add(ayM);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Observer ");
        sb.append(ayM);
        sb.append(" is already registered.");
        throw new IllegalStateException(sb.toString());
    }
}
