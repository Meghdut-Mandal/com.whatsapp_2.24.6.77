package X;

import android.app.ProgressDialog;
import com.whatsapp.R;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity;

/* renamed from: X.4KO  reason: invalid class name */
public final class AnonymousClass4KO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InteropComposeEnterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KO(InteropComposeEnterInfoActivity interopComposeEnterInfoActivity) {
        super(1);
        this.this$0 = interopComposeEnterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0s;
        String string;
        AnonymousClass04S r4;
        String str;
        C67923b3 r1;
        AnonymousClass3JA r8 = (AnonymousClass3JA) obj;
        int ordinal = r8.A00.ordinal();
        if (ordinal == 1) {
            InteropComposeEnterInfoActivity interopComposeEnterInfoActivity = this.this$0;
            ProgressDialog progressDialog = interopComposeEnterInfoActivity.A00;
            if (progressDialog == null) {
                throw C36331k8.A0d("progressDialog");
            }
            C36331k8.A0p(progressDialog, interopComposeEnterInfoActivity.getString(R.string.f12nameremoved));
            progressDialog.show();
        } else if (ordinal == 3) {
            InteropComposeEnterInfoActivity.A01(this.this$0);
            InteropComposeEnterInfoActivity interopComposeEnterInfoActivity2 = this.this$0;
            Object obj2 = r8.A02;
            if (obj2 != null) {
                AnonymousClass11F r12 = (AnonymousClass11F) obj2;
                AnonymousClass190 r0 = interopComposeEnterInfoActivity2.A0B;
                if (r0 != null) {
                    interopComposeEnterInfoActivity2.startActivity(C36391kE.A0F(interopComposeEnterInfoActivity2, r0, r12));
                    interopComposeEnterInfoActivity2.finish();
                } else {
                    throw C36331k8.A0X();
                }
            } else {
                throw AnonymousClass001.A09("Required value was null.");
            }
        } else if (ordinal == 0) {
            InteropComposeEnterInfoActivity.A01(this.this$0);
            InteropComposeEnterInfoActivity interopComposeEnterInfoActivity3 = this.this$0;
            Long l = r8.A01;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue == 2) {
                    A0s = C36381kD.A0s(interopComposeEnterInfoActivity3.getResources(), R.string.f12nameremoved);
                    string = interopComposeEnterInfoActivity3.getResources().getString(R.string.f12nameremoved);
                    r4 = new C66023Uj(interopComposeEnterInfoActivity3, 30);
                    str = interopComposeEnterInfoActivity3.getResources().getString(R.string.f12nameremoved);
                    r1 = C67923b3.A00;
                } else if (longValue == 1 || longValue == 3) {
                    A0s = C36381kD.A0s(interopComposeEnterInfoActivity3.getResources(), R.string.f12nameremoved);
                    string = interopComposeEnterInfoActivity3.getResources().getString(R.string.f12nameremoved);
                    r4 = C67933b4.A00;
                    str = null;
                    r1 = null;
                }
                C39001qm A01 = C39001qm.A01(interopComposeEnterInfoActivity3, A0s);
                if (string != null) {
                    A01.A0o(interopComposeEnterInfoActivity3, r4, string);
                }
                if (str != null) {
                    A01.A0n(interopComposeEnterInfoActivity3, r1, str);
                }
                C36341k9.A11(A01);
            } else {
                throw AnonymousClass001.A09("Required value was null.");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
