package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.21M  reason: invalid class name */
public class AnonymousClass21M extends AnonymousClass0FL {
    public View A00;
    public AnonymousClass28U A01;
    public final C001700s A02 = C36431kI.A0S();
    public final C20050ww A03;
    public final AnonymousClass3FY A04;
    public final AnonymousClass3PE A05;
    public final C64553Ol A06;
    public final AnonymousClass31X A07;
    public final C61033Ah A08;
    public final C40511vf A09 = new C40511vf(new C89094Vf(1));
    public final AnonymousClass11F A0A;
    public final AnonymousClass1DU A0B;
    public final AnonymousClass1EM A0C;

    public AnonymousClass21M(Context context, C20050ww r4, AnonymousClass3FY r5, AnonymousClass3PE r6, C64553Ol r7, AnonymousClass31X r8, C61033Ah r9, AnonymousClass11F r10, AnonymousClass1DU r11, AnonymousClass1EM r12) {
        super(context, R.style.f13nameremoved);
        this.A0A = r10;
        this.A0B = r11;
        this.A03 = r4;
        this.A0C = r12;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f9nameremoved);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0PN.A00(this, R.id.questions_view);
        getContext();
        C36351kA.A1F(recyclerView, 1);
        C40511vf r7 = this.A09;
        recyclerView.setAdapter(r7);
        AnonymousClass8Hc r6 = new AnonymousClass8Hc();
        C61033Ah r2 = this.A08;
        for (C62363Fw r4 : r2.A08) {
            r6.add((Object) new C601136n(this.A02, r4));
        }
        C23931Ak build = r6.build();
        AnonymousClass397 r5 = r7.A00;
        int i = r5.A00 + 1;
        r5.A00 = i;
        C23931Ak r72 = r5.A01;
        if (build != r72) {
            if (build == null) {
                if (r72 != null) {
                    int size = r72.size();
                    r5.A01 = null;
                    r5.A03.Beb(0, size);
                }
            } else if (r72 == null) {
                r5.A01 = build;
                r5.A03.BZE(0, build.size());
            }
            r5.A02.A01.execute(new C80513vW(r5, build, r72, i, 10));
        }
        View A002 = AnonymousClass0PN.A00(this, R.id.send_button);
        this.A00 = A002;
        AnonymousClass3Y0.A01(A002, this, 14);
        AnonymousClass3Y0.A01(AnonymousClass0PN.A00(this, R.id.close), this, 13);
        this.A01 = new AnonymousClass28U(this.A03, this.A0B, this.A04.A01(this.A05, r2));
        WebPagePreviewView webPagePreviewView = (WebPagePreviewView) AnonymousClass0PN.A00(this, R.id.web_page_preview);
        webPagePreviewView.A0M(this.A01, (List) null, false, this.A0C.A01());
        View findViewById = webPagePreviewView.findViewById(R.id.link_preview_content);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.round_corner_icebreaker_link_preview_background);
        }
        Drawable A012 = AnonymousClass08I.A01(C36381kD.A0H(getContext(), R.drawable.balloon_incoming_frame).mutate());
        AnonymousClass076.A06(A012, C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        webPagePreviewView.setForeground(A012);
        this.A02.A0A(new C66033Uk(this, 37));
        View A003 = AnonymousClass0PN.A00(this, R.id.design_bottom_sheet);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(A003);
        A022.A0W(3);
        A022.A0h = true;
        A022.A0V(A003.getHeight());
        C64553Ol.A00(this.A06, this.A0A.getRawString(), 3, true);
    }
}
