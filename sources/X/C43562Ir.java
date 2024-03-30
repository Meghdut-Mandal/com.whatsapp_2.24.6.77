package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.carousel.CarouselItemSelectionView;

/* renamed from: X.2Ir  reason: invalid class name and case insensitive filesystem */
public abstract class C43562Ir extends C38221o4 {
    public C32691e2 A00;
    public final C89004Uw A01;

    public void A01(AnonymousClass2bV r8) {
        AnonymousClass2bV r4 = r8;
        if (r8.A01 == 4 || r8.A06 == null) {
            getSelectionView().A03(8);
            setOnClickListener((View.OnClickListener) null);
            setOnLongClickListener((View.OnLongClickListener) null);
            return;
        }
        C89004Uw r3 = this.A01;
        if (r3 != null) {
            setOnLongClickListener(new AnonymousClass4Y7(this, r8, 7));
            if (r3.BK6()) {
                AnonymousClass1RJ selectionView = getSelectionView();
                C36391kE.A0L(selectionView, 0).setClickable(true);
                selectionView.A01().bringToFront();
                selectionView.A05(new AnonymousClass3YT(this, r3, r4, selectionView, 3));
                ((CarouselItemSelectionView) selectionView.A01()).setRowSelected(r3.BMT(r8));
                setOnClickListener(new AnonymousClass3YF(this, r8, 42));
            }
        }
        getSelectionView().A03(8);
        setOnClickListener(new AnonymousClass3YF(this, r8, 42));
    }

    public abstract AnonymousClass1RJ getSelectionView();

    public final void setLinkLauncher(C32691e2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final C32691e2 getLinkLauncher() {
        C32691e2 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkLauncher");
    }

    public C43562Ir(Context context, C89004Uw r2) {
        super(context);
        this.A01 = r2;
    }
}
