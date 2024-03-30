package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;
import java.util.Set;

/* renamed from: X.1wW  reason: invalid class name and case insensitive filesystem */
public class C41041wW extends AnonymousClass0CZ {
    public C88924Uo A00;
    public final Context A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass6YT A03;
    public final AnonymousClass3K8 A04;
    public final C1270866x A05;
    public final C19930wk A06;
    public final AnonymousClass005 A07;
    public final List A08;
    public final Set A09;
    public final C20810yC A0A;

    private AnonymousClass4V2 A00(int i) {
        C88924Uo r1;
        if (this.A00 == null) {
            return null;
        }
        if (AnonymousClass000.A1X(this.A07.get())) {
            List list = this.A08;
            if (i < list.size()) {
                return (AnonymousClass4V2) list.get(i);
            }
            r1 = this.A00;
            i -= list.size();
        } else {
            r1 = this.A00;
        }
        return r1.BDy(i);
    }

    public int A0J() {
        int count;
        C88924Uo r0 = this.A00;
        int i = 0;
        if (r0 == null) {
            count = 0;
        } else {
            count = r0.getCount();
        }
        if (AnonymousClass000.A1X(this.A07.get())) {
            i = this.A08.size();
        }
        return count + i;
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        AnonymousClass2UM r1 = ((C42711zG) r3).A03;
        r1.setImageDrawable((Drawable) null);
        r1.A06 = null;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r7, int i) {
        boolean z;
        int i2;
        C42711zG r72 = (C42711zG) r7;
        AnonymousClass4V2 A002 = A00(i);
        AnonymousClass2UM r4 = r72.A03;
        r4.setMediaItem(A002);
        r4.A06 = null;
        r4.setId(R.id.thumb);
        AnonymousClass3K8 r3 = r72.A02;
        r3.A01((AnonymousClass4TB) r4.getTag());
        if (A002 != null) {
            C36411kG.A1D(r4);
            C011004s.A08(r4, A002.B7k().toString());
            C89544Wy r1 = new C89544Wy(r72, A002, 0);
            r4.setTag(r1);
            r3.A02(r1, new AnonymousClass4X1(r72, A002, r1, 0));
            z = r72.A04.contains(r4.getUri());
        } else {
            C36441kJ.A1D(r4);
            C011004s.A08(r4, (String) null);
            r4.setBackgroundColor(r72.A00);
            r4.setImageDrawable((Drawable) null);
            z = false;
        }
        r4.setChecked(z);
        if (A002 == null && this.A00 != null) {
            if (AnonymousClass000.A1X(this.A07.get())) {
                i2 = this.A08.size();
            } else {
                i2 = 0;
            }
            int i3 = i - i2;
            if (i3 >= 0) {
                this.A06.execute(new C81283wl((Object) this, i3, 19));
            }
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass2UL r3 = new AnonymousClass2UL(this.A01, this);
        r3.setSelector((Drawable) null);
        Set set = this.A09;
        return new C42711zG(this.A03, this.A04, r3, this.A05, set);
    }

    public C41041wW(Context context, AnonymousClass17Y r3, AnonymousClass6YT r4, C20810yC r5, AnonymousClass3K8 r6, C1270866x r7, C19770wU r8, AnonymousClass005 r9, List list, Set set) {
        this.A0A = r5;
        this.A02 = r3;
        this.A01 = context;
        this.A09 = set;
        this.A08 = list;
        this.A04 = r6;
        this.A07 = r9;
        this.A03 = r4;
        this.A06 = C36411kG.A0r(r8);
        this.A05 = r7;
        A0B(true);
    }

    public long A0E(int i) {
        AnonymousClass4V2 A002 = A00(i);
        if (A002 == null) {
            return 0;
        }
        return (long) AnonymousClass000.A0q("-gallery_thumb", C36381kD.A11(A002.B7k())).hashCode();
    }
}
