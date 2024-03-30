package X;

import android.os.LocaleList;
import java.util.ArrayList;

/* renamed from: X.6hO  reason: invalid class name and case insensitive filesystem */
public final class C138156hO implements AnonymousClass7e4 {
    public LocaleList A00;
    public AnonymousClass75Q A01;
    public final AnonymousClass5XY A02 = new AnonymousClass5XY();

    public AnonymousClass75Q BAX() {
        AnonymousClass75Q r1;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.A02) {
            r1 = this.A01;
            if (r1 == null || localeList != this.A00) {
                int size = localeList.size();
                ArrayList A14 = C36441kJ.A14(size);
                for (int i = 0; i < size; i++) {
                    A14.add(new AnonymousClass68T(new C138136hM(localeList.get(i))));
                }
                r1 = new AnonymousClass75Q(A14);
                this.A00 = localeList;
                this.A01 = r1;
            }
        }
        return r1;
    }
}
