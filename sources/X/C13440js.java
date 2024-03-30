package X;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.text.MatchNamedGroupCollection;

/* renamed from: X.0js  reason: invalid class name and case insensitive filesystem */
public final class C13440js extends C001000l<C06610Uh> implements MatchNamedGroupCollection, AnonymousClass00W {
    public final /* synthetic */ AnonymousClass0T4 A00;

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return new C12320hr(new C12790if(new C14620lv(this), new C18650tV(new C15020mZ(0, size() - 1), 0)));
    }

    public C13440js(AnonymousClass0T4 r1) {
        this.A00 = r1;
    }

    public int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    public C06610Uh A09(int i) {
        Matcher matcher = this.A00.A01;
        C15020mZ A05 = C15040mb.A05(matcher.start(i), matcher.end(i));
        if (A05.A00 < 0) {
            return null;
        }
        String group = matcher.group(i);
        AnonymousClass00C.A08(group);
        return new C06610Uh(group, A05);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C06610Uh)) {
            return super.contains(obj);
        }
        return false;
    }
}
