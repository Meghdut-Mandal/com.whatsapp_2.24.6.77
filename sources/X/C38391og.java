package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;

/* renamed from: X.1og  reason: invalid class name and case insensitive filesystem */
public class C38391og extends FrameLayout implements C18700tb {
    public C19730wQ A00;
    public AnonymousClass1Pp A01;
    public C19970wo A02;
    public AnonymousClass1A5 A03;
    public AnonymousClass1P5 A04;
    public AnonymousClass2XH A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public View A08;
    public FrameLayout A09;
    public ThumbnailButton A0A;
    public AnonymousClass1RY A0B;
    public final WaMapView A0C;

    private void setMessage(C46902br r8) {
        long A0I;
        AnonymousClass141 A012;
        this.A09.setVisibility(0);
        AnonymousClass1P5 r1 = this.A04;
        boolean z = r8.A1J.A02;
        if (z) {
            A0I = r1.A0J(r8);
        } else {
            A0I = r1.A0I(r8);
        }
        boolean A022 = AnonymousClass3ST.A02(this.A02, r8, A0I);
        WaMapView waMapView = this.A0C;
        AnonymousClass2XH r12 = this.A05;
        waMapView.A02(r12, r8, A022);
        Context context = getContext();
        C19730wQ r5 = this.A00;
        View.OnClickListener A002 = AnonymousClass3ST.A00(context, r5, r12, r8, A022);
        View view = this.A08;
        view.setOnClickListener(A002);
        C36331k8.A0q(getContext(), view, R.string.f12nameremoved);
        ThumbnailButton thumbnailButton = this.A0A;
        AnonymousClass1Pp r3 = this.A01;
        AnonymousClass1RY r2 = this.A0B;
        AnonymousClass1A5 r13 = this.A03;
        if (z) {
            A012 = C36381kD.A0T(r5);
        } else {
            UserJid A0L = r8.A0L();
            if (A0L != null) {
                A012 = r13.A01(A0L);
            } else {
                r3.A06(thumbnailButton, R.drawable.avatar_contact);
                return;
            }
        }
        r2.A08(thumbnailButton, A012);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public C38391og(Context context, AnonymousClass1RY r4) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36351kA.A0V(A0W);
            this.A00 = C36351kA.A0N(A0W);
            this.A05 = C36411kG.A0m(A0W);
            this.A01 = C36361kB.A0V(A0W);
            this.A04 = C36411kG.A0l(A0W);
            this.A03 = C36371kC.A0X(A0W);
        }
        this.A0B = r4;
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A0C = (WaMapView) C012005e.A02(this, R.id.search_map_preview_map);
        this.A08 = C012005e.A02(this, R.id.search_map_preview_thumb_button);
        this.A09 = C36441kJ.A0T(this, R.id.search_map_preview_avatar_container);
        this.A0A = (ThumbnailButton) C012005e.A02(this, R.id.search_map_preview_contact_thumbnail);
    }

    public void setMessage(AnonymousClass2bL r3) {
        this.A0C.setVisibility(0);
        if (r3 instanceof C46912bs) {
            setMessage((C46912bs) r3);
        } else {
            setMessage((C46902br) r3);
        }
    }

    private void setMessage(C46912bs r6) {
        this.A09.setVisibility(8);
        this.A0C.A03(this.A05, r6);
        if (r6.A01 != 0.0d || r6.A00 != 0.0d) {
            View view = this.A08;
            C48902iF.A00(view, this, r6, 24);
            C36331k8.A0q(getContext(), view, R.string.f12nameremoved);
        }
    }
}
