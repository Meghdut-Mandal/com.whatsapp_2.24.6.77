package X;

import java.text.Collator;

/* renamed from: X.4NN  reason: invalid class name */
public final class AnonymousClass4NN extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ Collator $collator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NN(Collator collator) {
        super(2);
        this.$collator = collator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(this.$collator.compare(((C134806bd) obj).A02, ((C134806bd) obj2).A02));
    }
}
