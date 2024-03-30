package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1wC  reason: invalid class name and case insensitive filesystem */
public final class C40841wC extends AnonymousClass0CZ {
    public final C39721tO A00;
    public final Context A01;
    public final C88744Tw A02;
    public final C18820ts A03;

    public final void A0L(C88784Ua r8, C41971y4 r9, int i) {
        C36321k7.A0v(r9, 0, r8);
        String BIN = r8.BIN(this.A02);
        Context context = this.A01;
        C18820ts r4 = this.A03;
        Drawable BCW = r8.BCW(context, r4);
        AnonymousClass3YP r3 = new AnonymousClass3YP(r9, this, ((float) 175) * Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f), i);
        TextEmojiLabel textEmojiLabel = r9.A00;
        textEmojiLabel.A0I(BIN);
        if (BCW == null) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (C36401kF.A1X(r4)) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C100744vb(BCW, r4), (Drawable) null);
        } else {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(BCW, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        r9.A0H.setOnClickListener(r3);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        return new C41971y4((TextEmojiLabel) inflate, this);
    }

    public int A0J() {
        C62333Ft r0 = (C62333Ft) this.A00.A01.A04();
        if (r0 != null) {
            return r0.A00.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        C41971y4 r22 = (C41971y4) r2;
        AnonymousClass00C.A0D(r22, 0);
        C62333Ft r0 = (C62333Ft) this.A00.A01.A04();
        if (r0 != null) {
            Object obj = r0.A00.get(i);
            AnonymousClass00C.A08(obj);
            A0L((C88784Ua) obj, r22, i);
        }
    }

    public C40841wC(Context context, AnonymousClass012 r5, C88744Tw r6, C39721tO r7, C18820ts r8) {
        this.A01 = context;
        this.A03 = r8;
        this.A02 = r6;
        this.A00 = r7;
        C66033Uk.A00(r5, r7.A01, C53102qm.A02(this, 21), 19);
    }
}
