package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1fH  reason: invalid class name and case insensitive filesystem */
public class C33411fH {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1LV A02;
    public final C33391fF A03;
    public final C19970wo A04;
    public final C220712t A05;
    public final AnonymousClass1YR A06;
    public final C33051ed A07;
    public final C19770wU A08;
    public final AnonymousClass196 A09;
    public final AnonymousClass16D A0A;
    public final C20350xQ A0B;
    public final AnonymousClass1CR A0C;

    public static void A00(AnonymousClass01z r4, C33411fH r5, AnonymousClass11F r6, boolean z) {
        DialogFragment dialogFragment;
        AnonymousClass141 A0D = r5.A0A.A0D(r6);
        if (r4 != null) {
            if (A0D.A0G()) {
                StringBuilder sb = new StringBuilder();
                sb.append("conversations/delete/group:");
                sb.append(A0D);
                Log.i(sb.toString());
                if (r5.A0B.A0d.A02) {
                    r5.A01.A06(R.string.f12nameremoved, 0);
                    return;
                }
                dialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
            } else if (A0D.A0H instanceof C177618e5) {
                dialogFragment = new ConversationsFragment.DeleteBroadcastListDialogFragment();
            } else {
                r5.A08.Box(new C50272kU((DialogFragment) new ConversationsFragment.DeleteContactDialogFragment(), r4, r5.A06, A0D, z), new Object[0]);
                return;
            }
            AnonymousClass3TK.A02(dialogFragment, A0D);
            dialogFragment.A0b().putBoolean("chatContainsStarredMessages", z);
            dialogFragment.A1f(r4, (String) null);
        }
    }

    public void A01(AnonymousClass11F r4, long j) {
        if (!(r4 instanceof AnonymousClass146)) {
            AnonymousClass196 r2 = this.A09;
            Set A052 = r2.A05(r4, true);
            if (this.A0C.A0U(r4, j) != null) {
                r2.A0Q(A052);
            } else {
                r2.A0P(A052);
            }
        }
    }

    public C33411fH(Context context, AnonymousClass17Y r2, AnonymousClass1LV r3, AnonymousClass196 r4, AnonymousClass16D r5, C33391fF r6, C19970wo r7, C220712t r8, AnonymousClass1YR r9, C20350xQ r10, AnonymousClass1CR r11, C33051ed r12, C19770wU r13) {
        this.A00 = context;
        this.A04 = r7;
        this.A01 = r2;
        this.A08 = r13;
        this.A05 = r8;
        this.A09 = r4;
        this.A0A = r5;
        this.A0B = r10;
        this.A0C = r11;
        this.A06 = r9;
        this.A07 = r12;
        this.A02 = r3;
        this.A03 = r6;
    }
}
