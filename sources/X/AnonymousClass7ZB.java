package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7ZB  reason: invalid class name */
public final class AnonymousClass7ZB extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $beyondBoundsItemCount;
    public final /* synthetic */ C006302t $content;
    public final /* synthetic */ C156907b9 $contentPadding;
    public final /* synthetic */ C157497dd $flingBehavior;
    public final /* synthetic */ C157627dq $horizontalAlignment;
    public final /* synthetic */ C158757iB $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ AnonymousClass7bO $verticalAlignment;
    public final /* synthetic */ C158767iC $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ZB(C157497dd r2, C158757iB r3, C158767iC r4, C156907b9 r5, LazyListState lazyListState, C157627dq r7, AnonymousClass7bO r8, C161267mT r9, C006302t r10, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$modifier = r9;
        this.$state = lazyListState;
        this.$contentPadding = r5;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = r2;
        this.$userScrollEnabled = z3;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = r7;
        this.$verticalArrangement = r4;
        this.$verticalAlignment = r8;
        this.$horizontalArrangement = r3;
        this.$content = r10;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        C161267mT r13 = this.$modifier;
        LazyListState lazyListState = this.$state;
        C156907b9 r8 = this.$contentPadding;
        boolean z = this.$reverseLayout;
        boolean z2 = this.$isVertical;
        C157497dd r5 = this.$flingBehavior;
        boolean z3 = this.$userScrollEnabled;
        int i = this.$beyondBoundsItemCount;
        C157627dq r11 = this.$horizontalAlignment;
        C158767iC r7 = this.$verticalArrangement;
        AnonymousClass7bO r12 = this.$verticalAlignment;
        AnonymousClass5W0.A00(r5, this.$horizontalArrangement, r7, r8, lazyListState, A0L, r11, r12, r13, this.$content, i, AnonymousClass5WD.A00(this.$$changed), AnonymousClass5WD.A01(this.$$changed1), this.$$default, z, z2, z3);
        return AnonymousClass0AJ.A00;
    }
}
