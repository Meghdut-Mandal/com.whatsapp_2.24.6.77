package X;

/* renamed from: X.7VW  reason: invalid class name */
public final class AnonymousClass7VW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass62P $accessibilityScrollState;
    public final /* synthetic */ C118375nm $collectionInfo;
    public final /* synthetic */ C006302t $indexForKeyMapping;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C009003v $scrollByAction;
    public final /* synthetic */ C006302t $scrollToIndexAction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VW(C118375nm r2, AnonymousClass62P r3, C006302t r4, C006302t r5, C009003v r6, boolean z) {
        super(1);
        this.$indexForKeyMapping = r4;
        this.$isVertical = z;
        this.$accessibilityScrollState = r3;
        this.$scrollByAction = r6;
        this.$scrollToIndexAction = r5;
        this.$collectionInfo = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass62Q r0;
        AnonymousClass7e3 r4 = (AnonymousClass7e3) obj;
        r4.Bq1(C114205gq.A0C, true);
        r4.Bq1(C114205gq.A09, this.$indexForKeyMapping);
        boolean z = this.$isVertical;
        AnonymousClass62P r1 = this.$accessibilityScrollState;
        if (z) {
            r0 = C114205gq.A0R;
        } else {
            r0 = C114205gq.A08;
        }
        r4.Bq1(r0, r1);
        C009003v r12 = this.$scrollByAction;
        if (r12 != null) {
            AnonymousClass69I.A01(C114195gp.A0H, r4, (String) null, r12);
        }
        C006302t r13 = this.$scrollToIndexAction;
        if (r13 != null) {
            AnonymousClass69I.A01(C114195gp.A0I, r4, (String) null, r13);
        }
        r4.Bq1(C114205gq.A00, this.$collectionInfo);
        return AnonymousClass0AJ.A00;
    }
}
