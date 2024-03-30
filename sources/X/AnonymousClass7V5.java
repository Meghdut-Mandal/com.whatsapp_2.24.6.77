package X;

import android.os.Looper;

/* renamed from: X.7V5  reason: invalid class name */
public final class AnonymousClass7V5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ C100674vP $bloksInterpreterEnvironment;
    public final /* synthetic */ C128756Dm $queryDef;
    public final /* synthetic */ AnonymousClass6SN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V5(AnonymousClass6SN r2, C100674vP r3, C128756Dm r4, String str) {
        super(1);
        this.this$0 = r2;
        this.$appId = str;
        this.$queryDef = r4;
        this.$bloksInterpreterEnvironment = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass6SN r6 = this.this$0;
        String str = this.$appId;
        C128756Dm r4 = this.$queryDef;
        C1502774q r2 = new C1502774q(this.$bloksInterpreterEnvironment, r4, obj, r6, str, 1);
        if (AnonymousClass00C.A0J(Looper.getMainLooper(), Looper.myLooper())) {
            r2.run();
        } else {
            AnonymousClass6SN.A07.post(r2);
        }
        return AnonymousClass0AJ.A00;
    }
}
