package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.9pH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203989pH implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass155 A01;
    public final /* synthetic */ C199109ei A02;

    public /* synthetic */ C203989pH(AnonymousClass155 r1, C199109ei r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C199109ei r3 = this.A02;
        AnonymousClass155 r2 = this.A01;
        AnonymousClass3SJ.A00(r2, this.A00);
        r2.Bu1(R.string.f12nameremoved);
        r3.A0E.A00(new C23175B8j(r3, r2, 5));
    }
}
