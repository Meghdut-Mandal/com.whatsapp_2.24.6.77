package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.4mt  reason: invalid class name and case insensitive filesystem */
public class C96164mt extends AnonymousClass0CZ implements C160717lT {
    public Context A00;
    public List A01 = AnonymousClass001.A0I();
    public List A02 = AnonymousClass001.A0I();

    public int A0J() {
        return this.A02.size();
    }

    public int BAF(int i) {
        return ((C1512678w) this.A01.get(i)).count;
    }

    public int BCL() {
        return this.A01.size();
    }

    public long BCM(int i) {
        return -((Calendar) this.A01.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void BSC(AnonymousClass0D3 r3, int i) {
        List list = AnonymousClass0D3.A0I;
        ((C96584nZ) r3).A00.setText(this.A01.get(i).toString());
    }

    public void BSE(AnonymousClass0D3 r3, int i) {
        AnonymousClass5Gr r32 = (AnonymousClass5Gr) r3;
        r32.A0B((AnonymousClass9FU) this.A02.get(i), i);
        if (!((AnonymousClass5H2) this.A02.get(i)).A02) {
            r32.A00.setVisibility(8);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUs(ViewGroup viewGroup) {
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup, false);
        inflate.setClickable(false);
        C36341k9.A0q(context, inflate, C36411kG.A01(context));
        return new C96584nZ(inflate);
    }

    public C96164mt(Context context) {
        this.A00 = context;
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new AnonymousClass5Gr(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
    }

    public /* bridge */ /* synthetic */ boolean Bhn(MotionEvent motionEvent, AnonymousClass0D3 r3, int i) {
        return false;
    }
}
