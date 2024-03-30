package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.1zG  reason: invalid class name and case insensitive filesystem */
public class C42711zG extends AnonymousClass0D3 implements View.OnClickListener, View.OnLongClickListener {
    public final int A00;
    public final ColorDrawable A01;
    public final AnonymousClass3K8 A02;
    public final AnonymousClass2UM A03;
    public final Set A04;
    public final AnonymousClass6YT A05;
    public final C1270866x A06;

    public void onClick(View view) {
        C41041wW r0;
        this.A06.A02(32, 1, 17);
        AnonymousClass6YT r2 = this.A05;
        AnonymousClass2UM r3 = this.A03;
        AnonymousClass6F9 r02 = r2.A0F;
        if (r02 != null && (r0 = r02.A04) != null && r0.A00 != null && !r2.A0S() && r2.A0F.A0B.A0J == 4) {
            if (!(!r2.A0g.A09.isEmpty())) {
                AnonymousClass6YT.A0G(r2, r3.A08, r3, false);
            } else {
                AnonymousClass6YT.A0F(r2, r3.A08);
            }
            C64953Qc r22 = r2.A0k;
            AnonymousClass2RC r1 = r22.A01;
            if (r1 != null) {
                r1.A02 = C36371kC.A0o();
                C64953Qc.A00(r22);
                r22.A01();
            }
        }
    }

    public boolean onLongClick(View view) {
        C41041wW r0;
        this.A06.A02(32, 4, 17);
        AnonymousClass6YT r2 = this.A05;
        AnonymousClass2UM r1 = this.A03;
        AnonymousClass6F9 r02 = r2.A0F;
        if (r02 == null || (r0 = r02.A04) == null || r0.A00 == null || r2.A0S() || r2.A0F.A0B.A0J != 4) {
            return true;
        }
        AnonymousClass6YT.A0F(r2, r1.A08);
        return true;
    }

    public C42711zG(AnonymousClass6YT r3, AnonymousClass3K8 r4, AnonymousClass2UM r5, C1270866x r6, Set set) {
        super(r5);
        this.A03 = r5;
        this.A04 = set;
        this.A02 = r4;
        r5.setOnClickListener(this);
        r5.setOnLongClickListener(this);
        this.A05 = r3;
        this.A06 = r6;
        int A002 = AnonymousClass00F.A00(r5.getContext(), R.color.f6nameremoved);
        this.A00 = A002;
        this.A01 = new ColorDrawable(A002);
    }
}
