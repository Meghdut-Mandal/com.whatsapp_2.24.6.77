package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.95Y  reason: invalid class name */
public abstract class AnonymousClass95Y {
    public static final ArrayList A00(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle A07 = AnonymousClass001.A07();
            AnonymousClass8FK r2 = (AnonymousClass8FK) ((AnonymousClass95Z) it.next());
            A07.putInt("event_type", r2.A00);
            A07.putLong("event_timestamp", r2.A01);
            A0I.add(A07);
        }
        return A0I;
    }
}
