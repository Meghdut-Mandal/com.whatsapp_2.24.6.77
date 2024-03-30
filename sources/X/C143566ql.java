package X;

import com.whatsapp.R;

/* renamed from: X.6ql  reason: invalid class name and case insensitive filesystem */
public final class C143566ql implements C159337jC {
    public final /* synthetic */ AnonymousClass51F A00;

    public C143566ql(AnonymousClass51F r1) {
        this.A00 = r1;
    }

    public void BaF() {
        AnonymousClass51F r2 = this.A00;
        r2.A0A = true;
        AnonymousClass5DR r0 = r2.A03;
        if (r0 != null) {
            r0.A02(true);
            AnonymousClass3FM A0T = C90474aD.A0T(r2);
            A0T.A02 = R.string.f12nameremoved;
            r2.startActivityForResult(A0T.A02(), 34);
            return;
        }
        throw C36331k8.A0d("businessDirectorySharedPrefs");
    }

    public void BaG() {
        this.A00.A3i();
    }
}
