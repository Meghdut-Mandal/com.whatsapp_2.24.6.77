package X;

import java.util.List;

/* renamed from: X.7Of  reason: invalid class name and case insensitive filesystem */
public final class C153407Of extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $name;
    public final /* synthetic */ C138776ig $operation;
    public final /* synthetic */ AnonymousClass6VR $this_enqueueUniquelyNamedPeriodic;
    public final /* synthetic */ C120745s0 $workRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153407Of(C120745s0 r2, C138776ig r3, AnonymousClass6VR r4, String str) {
        super(0);
        this.$workRequest = r2;
        this.$this_enqueueUniquelyNamedPeriodic = r4;
        this.$name = str;
        this.$operation = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A11 = C36371kC.A11(this.$workRequest);
        new AnonymousClass75C((Object) this.$operation, (Object) new AnonymousClass6WE(this.$this_enqueueUniquelyNamedPeriodic, C023109s.A01, this.$name, A11, (List) null), 16).run();
        return AnonymousClass0AJ.A00;
    }
}
