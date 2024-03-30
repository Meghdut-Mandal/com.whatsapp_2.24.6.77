package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.Set;

/* renamed from: X.1z5  reason: invalid class name and case insensitive filesystem */
public class C42601z5 extends AnonymousClass0D3 {
    public AnonymousClass3T1 A00;
    public String A01;
    public Set A02;
    public AnonymousClass2LD A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final WebPagePreviewView A08;
    public final LinearLayout A09;
    public final /* synthetic */ LinksGalleryFragment A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42601z5(View view, LinksGalleryFragment linksGalleryFragment) {
        super(view);
        this.A0A = linksGalleryFragment;
        this.A06 = C36391kE.A0P(view, R.id.message_text);
        View findViewById = view.findViewById(R.id.message_text_holder);
        this.A05 = view.findViewById(R.id.starred_status);
        this.A04 = view.findViewById(R.id.kept_status);
        this.A09 = C36441kJ.A0U(view, R.id.message_badge_container);
        this.A07 = C36391kE.A0P(view, R.id.suspicious_link_indicator);
        this.A08 = (WebPagePreviewView) C012005e.A02(view, R.id.link_preview_frame);
        AnonymousClass3Y2.A00(findViewById, this, 12);
        AnonymousClass3Y2.A00(view, this, 13);
        C89564Xa.A00(view, this, 9);
    }

    public void A0B(AnonymousClass3T1 r19, int i) {
        AnonymousClass3T1 r15 = r19;
        this.A00 = r15;
        C36351kA.A1H(this.A03);
        WebPagePreviewView webPagePreviewView = this.A08;
        webPagePreviewView.A0G();
        TextView textView = this.A06;
        C36391kE.A1K(textView);
        webPagePreviewView.setLinkTitle((CharSequence) null);
        webPagePreviewView.A0I.setVisibility(8);
        View view = this.A05;
        view.setVisibility(8);
        View view2 = this.A04;
        view2.setVisibility(8);
        webPagePreviewView.setLinkHostname((String) null);
        webPagePreviewView.setLinkGifSize(0);
        TextView textView2 = this.A07;
        textView2.setVisibility(8);
        LinksGalleryFragment linksGalleryFragment = this.A0A;
        boolean BMT = C36381kD.A0Y(linksGalleryFragment).BMT(r15);
        View view3 = this.A0H;
        if (BMT) {
            ((FrameLayout) view3).setForeground(new ColorDrawable(AnonymousClass00F.A00(linksGalleryFragment.A1D(), R.color.f6nameremoved)));
            view3.setSelected(true);
        } else {
            ((FrameLayout) view3).setForeground((Drawable) null);
            view3.setSelected(false);
        }
        textView2.setVisibility(C36411kG.A08(this.A02));
        AnonymousClass00C.A0D(r15, 0);
        boolean A032 = C65453Sc.A03(r15);
        boolean z = r15.A15;
        C36421kH.A0v(view2, A032 ? 1 : 0, 0, 8);
        C36421kH.A0v(view, z ? 1 : 0, 0, 8);
        if (A032 && z) {
            int dimensionPixelSize = C36341k9.A0G(linksGalleryFragment).getDimensionPixelSize(R.dimen.f7nameremoved);
            LinearLayout linearLayout = this.A09;
            linearLayout.setPadding(dimensionPixelSize, linearLayout.getPaddingTop(), 0, 0);
        }
        C33301f4 r1 = linksGalleryFragment.A01;
        Context A0a = linksGalleryFragment.A0a();
        AnonymousClass1DU r14 = linksGalleryFragment.A06;
        AnonymousClass2LD r8 = new AnonymousClass2LD(A0a, textView, linksGalleryFragment.A05, linksGalleryFragment.A04, linksGalleryFragment.A05, r14, r15, C36381kD.A0Y(linksGalleryFragment).getSearchTerms(), i);
        this.A03 = r8;
        r1.A00(new AnonymousClass4YN(this, 0), r8);
    }
}
