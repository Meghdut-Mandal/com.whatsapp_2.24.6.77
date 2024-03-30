package X;

import com.whatsapp.R;

/* renamed from: X.4Mi  reason: invalid class name and case insensitive filesystem */
public final class C86804Mi extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass155 $activity;
    public final /* synthetic */ AnonymousClass4PZ $chatLockAuthCallback;
    public final /* synthetic */ C79593ty $result;
    public final /* synthetic */ C69923eJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86804Mi(AnonymousClass155 r2, C79593ty r3, AnonymousClass4PZ r4, C69923eJ r5) {
        super(1);
        this.$chatLockAuthCallback = r4;
        this.this$0 = r5;
        this.$activity = r2;
        this.$result = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        boolean z = obj instanceof AnonymousClass2Ec;
        AnonymousClass4PZ r0 = this.$chatLockAuthCallback;
        if (z) {
            ((C69873eE) r0).A01.Bf7(new C63093Is(C51832oS.SUCCESS, (Integer) null, (Integer) null));
            this.this$0.B2U();
        } else {
            r0.BXH();
            AnonymousClass21S A00 = AnonymousClass21S.A00(this.$activity);
            A00.A0e(R.string.f12nameremoved);
            A00.A0d(R.string.f12nameremoved);
            A00.A0g(C66193Va.A00, R.string.f12nameremoved);
            A00.create();
            A00.A0b();
        }
        this.$result.A0C(obj);
        return AnonymousClass0AJ.A00;
    }
}
