package X;

import com.whatsapp.R;

/* renamed from: X.4MU  reason: invalid class name */
public final class AnonymousClass4MU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $defaultBotLoadedCallback;
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ AnonymousClass1K6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MU(C225314u r2, AnonymousClass1K6 r3, C006302t r4) {
        super(1);
        this.$defaultBotLoadedCallback = r4;
        this.$dialogActivity = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj != null) {
            this.$defaultBotLoadedCallback.invoke(obj);
        } else {
            C225314u r1 = this.$dialogActivity;
            r1.A3G(r1.getString(R.string.f12nameremoved));
            C132326Tc r3 = (C132326Tc) this.this$0.A06.get();
            C001700s A0S = C36431kI.A0S();
            AnonymousClass141 r0 = r3.A08;
            if (r0 != null) {
                A0S.A0D(r0);
            } else {
                r3.A04.Bp1(new C1501874h(r3, A0S, 6));
            }
            C225314u r32 = this.$dialogActivity;
            C55492ui.A01(r32, A0S, new AnonymousClass4MT(r32, this.this$0, this.$defaultBotLoadedCallback), 36);
        }
        return AnonymousClass0AJ.A00;
    }
}
