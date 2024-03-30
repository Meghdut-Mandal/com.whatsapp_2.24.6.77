package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mm  reason: invalid class name and case insensitive filesystem */
public final class C86844Mm extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $isMV;
    public final /* synthetic */ int $noticeId;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86844Mm(AnonymousClass3UC r2, WeakReference weakReference, int i, boolean z) {
        super(1);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
        this.$noticeId = i;
        this.$isMV = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C85534Hl r0;
        boolean A1X = AnonymousClass000.A1X(obj);
        C225314u A0W = C36411kG.A0W(this.$weakActivity);
        if (A1X) {
            if (A0W != null) {
                AnonymousClass3UC r5 = this.this$0;
                int i = this.$noticeId;
                boolean z = this.$isMV;
                WeakReference A0F = AnonymousClass001.A0F(A0W);
                if (i == C36341k9.A08(r5.A02, 3835)) {
                    r0 = null;
                } else {
                    r0 = new C85534Hl(r5, A0F, z);
                }
                AnonymousClass3UC.A04(A0W, r5, r0, i, z);
            }
        } else if (A0W != null) {
            A0W.BO5(R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
