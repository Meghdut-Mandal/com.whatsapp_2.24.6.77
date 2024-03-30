package X;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.8Hd  reason: invalid class name */
public class AnonymousClass8Hd extends C23931Ak<Map.Entry<K, V>> {
    public final /* synthetic */ AnonymousClass8Hl this$0;

    public boolean isPartialView() {
        return true;
    }

    public AnonymousClass8Hd(AnonymousClass8Hl r1) {
        this.this$0 = r1;
    }

    public Map.Entry get(int i) {
        C20740y5.A01(i, this.this$0.size);
        AnonymousClass8Hl r0 = this.this$0;
        int i2 = i * 2;
        Object obj = r0.alternatingKeysAndValues[AnonymousClass8Hl.access$200(r0) + i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.this$0.alternatingKeysAndValues[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public int size() {
        return this.this$0.size;
    }
}
