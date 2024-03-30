package X;

import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4JM  reason: invalid class name */
public final class AnonymousClass4JM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C38821q9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JM(C38821q9 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C62833Hs r9 = (C62833Hs) obj;
        int i = r9.A00;
        if (i == 0) {
            this.this$0.A0U.A03(0);
        } else if (i == 1) {
            this.this$0.A0U.A03(8);
        }
        Integer num = r9.A01;
        C38821q9 r0 = this.this$0;
        if (num != null) {
            WaTextView waTextView = r0.A04;
            Object[] objArr = {num};
            C36351kA.A16(r0.getResources(), waTextView, objArr, R.plurals.f10nameremoved, num.intValue());
        } else {
            r0.A04.setText(R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
