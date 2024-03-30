package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mp  reason: invalid class name and case insensitive filesystem */
public final class C86874Mp extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $entryPoint;
    public final /* synthetic */ boolean $isOpenFromPrimarySurface = true;
    public final /* synthetic */ C28981Uw $jid;
    public final /* synthetic */ String $pcId;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86874Mp(C28981Uw r2, AnonymousClass3UC r3, String str, WeakReference weakReference, int i) {
        super(1);
        this.$weakActivity = weakReference;
        this.this$0 = r3;
        this.$jid = r2;
        this.$entryPoint = i;
        this.$pcId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0G = C36441kJ.A0G(this.$weakActivity);
        if (A0G != null) {
            AnonymousClass3UC r6 = this.this$0;
            C28981Uw r1 = this.$jid;
            int i = this.$entryPoint;
            boolean z = this.$isOpenFromPrimarySurface;
            String str = this.$pcId;
            Intent putExtra = C36361kB.A08(A0G, r1, i).putExtra("start_t", SystemClock.uptimeMillis());
            AnonymousClass00C.A08(putExtra);
            if (z) {
                putExtra.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
            }
            if (str != null) {
                putExtra.putExtra("wamo_pc_id", str);
            }
            AnonymousClass3M9.A00(putExtra, A0G);
            r6.A00.A06(A0G, putExtra);
        }
        return AnonymousClass0AJ.A00;
    }
}
