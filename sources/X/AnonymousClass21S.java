package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.whatsapp.R;

/* renamed from: X.21S  reason: invalid class name */
public final class AnonymousClass21S extends AnonymousClass0FI {
    public int A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass21S(Context context, int i) {
        super(context, i);
        AnonymousClass00C.A0D(context, 1);
        this.A01 = AnonymousClass1MI.A02(((C18800tq) C19570wA.A00(C18800tq.class, context.getApplicationContext())).Azp(), (C21000yV) null, 4496);
    }

    public static AnonymousClass21S A00(Context context) {
        return new AnonymousClass21S(context, R.style.f13nameremoved);
    }

    public AnonymousClass0FM create() {
        Window window;
        View decorView;
        AnonymousClass0FM create = super.create();
        if (!(!this.A01 || (window = create.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            C65723Tf.A04(new AnonymousClass4HQ(decorView, this), decorView);
        }
        return create;
    }
}
