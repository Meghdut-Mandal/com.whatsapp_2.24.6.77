package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Objects;

/* renamed from: X.3Ya  reason: invalid class name and case insensitive filesystem */
public class C66973Ya implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C66973Ya(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public final void onClick(View view) {
        String rawString;
        Jid A062;
        switch (this.A06) {
            case 0:
                C36541kT r7 = (C36541kT) this.A00;
                C21010yW r8 = (C21010yW) this.A02;
                C33771fu r6 = (C33771fu) this.A04;
                Integer A0m = C36381kD.A0m();
                long time = ((C21360z5) this.A03).A01().getTime();
                if (((C20800yB) this.A01).A0E(3299)) {
                    C45212Qm r1 = new C45212Qm();
                    r1.A02 = 1;
                    r1.A01 = A0m;
                    r1.A00 = 1;
                    r1.A03 = Long.valueOf(time);
                    r8.Blv(r1);
                }
                Intent A0G = C36391kE.A0G(r6.A00());
                Activity activity = r7.A00;
                activity.startActivity(A0G);
                activity.finish();
                return;
            case 1:
                ((C32901eN) this.A04).A00(7);
                AnonymousClass1NG r9 = (AnonymousClass1NG) this.A01;
                AnonymousClass141 r72 = (AnonymousClass141) this.A02;
                Class<UserJid> cls = UserJid.class;
                if (r9.A0O((UserJid) r72.A06(cls))) {
                    Context context = (Context) this.A00;
                    UnblockDialogFragment.A03(new C53472rN(context, C36381kD.A0e(r72, cls), r9, 0), C36391kE.A0v(context.getApplicationContext(), ((AnonymousClass171) this.A05).A0H(r72), AnonymousClass001.A0L(), 0, R.string.f12nameremoved), 0, false).A1f((AnonymousClass01z) this.A03, (String) null);
                    return;
                }
                AnonymousClass141 r12 = r72.A0G;
                if (!(r72.A0H instanceof C223313w) || r12 == null || (A062 = r12.A06(cls)) == null || (rawString = A062.getRawString()) == null) {
                    Jid A063 = r72.A06(cls);
                    Objects.requireNonNull(A063);
                    rawString = A063.getRawString();
                }
                Context context2 = (Context) this.A00;
                context2.startActivity(AnonymousClass190.A1O(context2.getApplicationContext(), Collections.singletonList(rawString), 7));
                return;
            case 2:
                AnonymousClass3RY.A00((Context) this.A01, (Drawable) this.A03, (TextEmojiLabel) this.A02, (C87184Nu) this.A05, (AnonymousClass3P8) this.A04);
                return;
            default:
                C81193wc.A01((C19770wU) this.A00, this.A04, this.A05, 36);
                C65453Sc.A01((Activity) this.A01, (View) this.A02, R.string.f12nameremoved);
                ((Dialog) this.A03).dismiss();
                return;
        }
    }
}
