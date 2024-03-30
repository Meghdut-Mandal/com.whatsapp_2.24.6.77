package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7Z5  reason: invalid class name */
public final class AnonymousClass7Z5 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C006302t $content;
    public final /* synthetic */ C156907b9 $contentPadding;
    public final /* synthetic */ C157497dd $flingBehavior;
    public final /* synthetic */ C157627dq $horizontalAlignment;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ C158767iC $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z5(C157497dd r2, C158767iC r3, C156907b9 r4, LazyListState lazyListState, C157627dq r6, C161267mT r7, C006302t r8, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$modifier = r7;
        this.$state = lazyListState;
        this.$contentPadding = r4;
        this.$reverseLayout = z;
        this.$verticalArrangement = r3;
        this.$horizontalAlignment = r6;
        this.$flingBehavior = r2;
        this.$userScrollEnabled = z2;
        this.$content = r8;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        C161267mT r7 = this.$modifier;
        LazyListState lazyListState = this.$state;
        C156907b9 r3 = this.$contentPadding;
        boolean z = this.$reverseLayout;
        C158767iC r2 = this.$verticalArrangement;
        C157627dq r6 = this.$horizontalAlignment;
        C109025Vz.A00(this.$flingBehavior, r2, r3, lazyListState, A0L, r6, r7, this.$content, AnonymousClass5WD.A00(this.$$changed), this.$$default, z, this.$userScrollEnabled);
        return AnonymousClass0AJ.A00;
    }
}
