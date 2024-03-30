package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7Yl  reason: invalid class name and case insensitive filesystem */
public final class C156047Yl extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass1JI $scrollPerfLoggerManager;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ int $surface;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156047Yl(LazyListState lazyListState, AnonymousClass1JI r3, int i, int i2) {
        super(2);
        this.$state = lazyListState;
        this.$surface = i;
        this.$scrollPerfLoggerManager = r3;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        AnonymousClass6H0.A00(this.$state, A0L, this.$scrollPerfLoggerManager, this.$surface, AnonymousClass5WD.A00(this.$$changed));
        return AnonymousClass0AJ.A00;
    }
}
