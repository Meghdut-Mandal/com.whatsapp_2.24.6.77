package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

@Deprecated
/* renamed from: X.1yu  reason: invalid class name and case insensitive filesystem */
public class C42491yu extends AnonymousClass0D3 {
    public int A00 = R.string.f12nameremoved;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public UserJid A06;
    public final Context A07;
    public final Resources A08;
    public final FrameLayout A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final TextView A0D;
    public final C18800tq A0E;
    public final AnonymousClass17Y A0F;
    public final AnonymousClass3SF A0G;
    public final AnonymousClass1RY A0H;
    public final C79353ta A0I;
    public final C19770wU A0J;
    public final AnonymousClass6K4 A0K = new AnonymousClass5QH();
    public final boolean A0L;

    public C42491yu(Context context, View view, C18800tq r8, AnonymousClass1RY r9) {
        super(view);
        this.A07 = context;
        this.A08 = context.getResources();
        this.A0E = r8;
        this.A0F = C36351kA.A0M(r8);
        this.A0J = C36341k9.A0Z(r8);
        this.A0I = new C79353ta(context);
        this.A0H = r9;
        boolean A0E2 = r8.Azp().A0E(2429);
        this.A0L = C20800yB.A01(C21000yV.A01, r8.Azp(), 1875);
        ImageView A0G2 = C36401kF.A0G(view, R.id.contact_photo);
        ImageView A0G3 = C36401kF.A0G(view, R.id.wdsProfilePicture);
        if (A0E2) {
            A0G2.setVisibility(8);
            A0G3.setVisibility(0);
        } else {
            A0G2.setVisibility(0);
            A0G3.setVisibility(8);
            A0G3 = A0G2;
        }
        this.A0C = A0G3;
        A0G3.setClickable(false);
        A0G3.setImportantForAccessibility(2);
        C012005e.A02(view, R.id.contact_selector).setClickable(false);
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, C36361kB.A0S(r8), R.id.contact_name);
        this.A0G = A012;
        this.A0D = C36391kE.A0O(view, R.id.date_time);
        this.A09 = C36441kJ.A0T(view, R.id.action);
        this.A0A = C36401kF.A0G(view, R.id.action_icon);
        this.A0B = C36401kF.A0G(view, R.id.contact_mark);
        C33511fU.A03(A012.A01);
    }
}
