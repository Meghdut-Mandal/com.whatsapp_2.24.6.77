package X;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class A1o implements C159037ih {
    public List A00 = C90524aI.A0l();
    public List A01 = C90524aI.A0l();
    public List A02 = C90524aI.A0l();
    public List A03 = C90524aI.A0l();
    public Map A04 = AnonymousClass001.A0J();

    public List B8c(List list, List list2, List list3) {
        Objects.requireNonNull(list, "enabledEffectIds cannot be null");
        this.A01 = list2;
        this.A02 = list3;
        List list4 = this.A00;
        this.A00 = list;
        return list4;
    }

    public List B8d(List list) {
        Objects.requireNonNull(list, "enabledEffectTypes cannot be null");
        List list2 = this.A03;
        this.A03 = list;
        return list2;
    }
}
