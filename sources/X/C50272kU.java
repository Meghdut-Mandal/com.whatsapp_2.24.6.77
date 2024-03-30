package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2kU  reason: invalid class name and case insensitive filesystem */
public class C50272kU extends C132446Tt {
    public AnonymousClass141 A00;
    public ProgressDialogFragment A01;
    public Set A02;
    public final DialogFragment A03;
    public final AnonymousClass1YR A04;
    public final WeakReference A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        AnonymousClass141 r0 = this.A00;
        if (r0 != null) {
            i = this.A04.A01(C36351kA.A0j(r0));
        } else {
            AnonymousClass1YR r02 = this.A04;
            Set set = this.A02;
            i = 0;
            if (set != null) {
                Iterator it = r02.A02().iterator();
                while (it.hasNext()) {
                    if (set.contains(C64933Qa.A02(it))) {
                        i++;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }

    public void A0A() {
        AnonymousClass01z r2 = (AnonymousClass01z) this.A05.get();
        if (r2 != null) {
            ProgressDialogFragment A032 = ProgressDialogFragment.A03(R.string.f12nameremoved, R.string.f12nameremoved);
            this.A01 = A032;
            A032.A1f(r2, "count_progress");
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        DialogFragment dialogFragment;
        Number number = (Number) obj;
        AnonymousClass01z r4 = (AnonymousClass01z) this.A05.get();
        if (r4 != null && !r4.A0E) {
            this.A01.A1k();
            AnonymousClass141 r0 = this.A00;
            if (r0 != null) {
                dialogFragment = this.A03;
                AnonymousClass3TK.A02(dialogFragment, r0);
            } else {
                Set set = this.A02;
                dialogFragment = this.A03;
                Bundle A07 = AnonymousClass001.A07();
                A07.putStringArrayList("selection_jids", AnonymousClass143.A07(set));
                dialogFragment.A17(A07);
            }
            Bundle bundle = dialogFragment.A0A;
            bundle.putInt("unsent_count", number.intValue());
            bundle.putBoolean("chatContainsStarredMessages", this.A06);
            C18740tg.A06(r4);
            AnonymousClass09Y r1 = new AnonymousClass09Y(r4);
            r1.A0D(dialogFragment, (String) null);
            r1.A02();
        }
    }

    public C50272kU(DialogFragment dialogFragment, AnonymousClass01z r3, AnonymousClass1YR r4, Set set, boolean z) {
        this.A05 = AnonymousClass001.A0F(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A02 = set;
        this.A06 = z;
    }

    public C50272kU(DialogFragment dialogFragment, AnonymousClass01z r3, AnonymousClass1YR r4, AnonymousClass141 r5, boolean z) {
        this.A05 = AnonymousClass001.A0F(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A00 = r5;
        this.A06 = z;
    }
}
