package X;

import java.text.Collator;
import java.util.Locale;

/* renamed from: X.3yP  reason: invalid class name and case insensitive filesystem */
public class C82253yP extends ThreadLocal {
    public final /* synthetic */ Locale A00;

    public C82253yP(Locale locale) {
        this.A00 = locale;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        Collator instance = Collator.getInstance(this.A00);
        instance.setDecomposition(1);
        instance.setStrength(0);
        return instance;
    }
}
