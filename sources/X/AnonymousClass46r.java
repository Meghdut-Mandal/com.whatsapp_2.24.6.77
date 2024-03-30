package X;

import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.46r  reason: invalid class name */
public final /* synthetic */ class AnonymousClass46r extends C12680iU implements C009003v {
    public AnonymousClass46r(Object obj) {
        super(2, obj, C61183Aw.class, "render", "render(Lcom/whatsapp/status/archive/entity/StatusArchiveSettingsViewState;)V", 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass3XI r10 = (AnonymousClass3XI) obj;
        C61183Aw r8 = (C61183Aw) this.receiver;
        AnonymousClass00C.A0D(r10, 0);
        TextView textView = r8.A01;
        C18820ts r5 = r8.A03;
        int i = r10.A00;
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, i, 0);
        textView.setText(r5.A0L(A0L, R.plurals.f10nameremoved, (long) i));
        r8.A02.setChecked(r10.A01);
        return AnonymousClass0AJ.A00;
    }
}
