package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.6xb  reason: invalid class name and case insensitive filesystem */
public final class C147676xb implements C159667jj {
    public final AnonymousClass171 A00;
    public final C27761Ps A01;
    public final C19630wG A02;
    public final AnonymousClass1EU A03;

    public Class B7I() {
        return AnonymousClass5UK.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        AnonymousClass141 r6 = (AnonymousClass141) obj;
        AnonymousClass5UK r5 = (AnonymousClass5UK) enumR;
        boolean A1a = C36341k9.A1a(r6, r5);
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            return this.A00.A0H(r6);
        }
        if (ordinal == A1a) {
            C27761Ps r3 = this.A01;
            Context context = this.A02.A00;
            Bitmap A05 = r3.A05(context, r6, C90494aF.A04(context), context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            if (A05 != null) {
                return AnonymousClass6Y8.A0B(A05);
            }
            return AnonymousClass6Y8.A0B(BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact));
        } else if (ordinal == 2) {
            UserJid A0l = C36351kA.A0l(r6);
            if (A0l == null) {
                return null;
            }
            AnonymousClass1EU r0 = this.A03;
            AnonymousClass1EU.A00(r0);
            return r0.A06.A05(A0l);
        } else {
            throw C36441kJ.A18();
        }
    }

    public C147676xb(AnonymousClass171 r1, C27761Ps r2, C19630wG r3, AnonymousClass1EU r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
