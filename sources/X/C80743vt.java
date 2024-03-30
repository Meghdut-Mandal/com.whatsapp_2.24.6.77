package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.PowerManager;
import com.whatsapp.conversation.ConversationListView;
import java.io.IOException;

/* renamed from: X.3vt  reason: invalid class name and case insensitive filesystem */
public class C80743vt implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public C80743vt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.A06 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = obj5;
        this.A05 = z;
    }

    public void run() {
        switch (this.A06) {
            case 0:
                C202249lP r0 = (C202249lP) this.A00;
                ((C160837lf) this.A02).BZv(r0.A01, (C191069Bl) this.A03, (AnonymousClass9NR) this.A04, (IOException) this.A01, r0.A00, this.A05);
                return;
            case 1:
                C70803fk r5 = (C70803fk) this.A00;
                C148826zU r8 = (C148826zU) this.A01;
                AnonymousClass3T1 r3 = (AnonymousClass3T1) this.A02;
                AnonymousClass3T1 r7 = (AnonymousClass3T1) this.A03;
                boolean z = this.A05;
                C46812bi r4 = (C46812bi) this.A04;
                if (!r5.A2l.getMessageAudioPlayerProvider().A0B() && r5.A69) {
                    if (r5.A6a) {
                        boolean z2 = true;
                        r8.A0M = true;
                        PowerManager.WakeLock wakeLock = r8.A0b;
                        if (wakeLock == null || !wakeLock.isHeld()) {
                            z2 = false;
                        }
                        r8.A0U = z2;
                        C148826zU.A06(r8);
                    }
                    r8.A0C(C148826zU.A12, true, false);
                    r5.A4i = r3;
                    if (r5.A6E) {
                        C70803fk.A1G(r5, r7);
                    }
                    if (z) {
                        r5.A2S(r4, 0, false);
                    }
                    ConversationListView conversationListView = r5.A2U;
                    AnonymousClass757 r02 = new AnonymousClass757(conversationListView, r3);
                    conversationListView.A0J = r02;
                    conversationListView.post(r02);
                    return;
                }
                return;
            default:
                AnonymousClass3O2 r6 = (AnonymousClass3O2) this.A00;
                Context context = (Context) this.A02;
                boolean z3 = this.A05;
                Drawable drawable = (Drawable) this.A03;
                Object obj = this.A04;
                AnonymousClass00C.A0D(context, 2);
                C36861lQ A002 = AnonymousClass3O2.A00(context, drawable, (AnonymousClass2bV) this.A01, r6, z3);
                if (A002 != null) {
                    C81203wd.A00((AnonymousClass17Y) r6.A01.get(), obj, A002, 45);
                    return;
                }
                return;
        }
    }
}
