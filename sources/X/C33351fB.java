package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1fB  reason: invalid class name and case insensitive filesystem */
public class C33351fB extends C33341fA {
    public ViewGroup A00;
    public HorizontalScrollView A01;
    public ImageButton A02;
    public ImageView A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public AnonymousClass1RJ A08;
    public AnonymousClass1RJ A09;
    public Map A0A = new HashMap();
    public final AnonymousClass1RY A0B;
    public final C18820ts A0C;
    public final AnonymousClass171 A0D;

    public C33351fB(AnonymousClass1NG r9, AnonymousClass16D r10, AnonymousClass171 r11, AnonymousClass16K r12, AnonymousClass1RY r13, ConversationsFragment conversationsFragment, C18820ts r15, C21010yW r16, C19770wU r17) {
        super(r9, r10, r12, conversationsFragment, r16, r17);
        this.A0D = r11;
        this.A0C = r15;
        this.A0B = r13;
    }

    public static void A00(Configuration configuration, View view, boolean z) {
        int dimensionPixelSize;
        if (view != null) {
            View findViewById = view.findViewById(R.id.empty_illustration);
            int i = configuration.orientation;
            Resources resources = view.getResources();
            int i2 = R.dimen.f7nameremoved;
            if (i == 2) {
                i2 = R.dimen.f7nameremoved;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                findViewById.getLayoutParams().height = dimensionPixelSize2;
                findViewById.getLayoutParams().width = dimensionPixelSize2;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (z) {
                    dimensionPixelSize = 0;
                } else {
                    dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                }
                marginLayoutParams.topMargin = dimensionPixelSize;
            }
        }
    }

    public AnonymousClass2RI A09(AnonymousClass141 r3, Long l, int i) {
        AnonymousClass2RI r1 = new AnonymousClass2RI();
        r1.A04 = Integer.valueOf(i);
        if (l != null) {
            r1.A05 = l;
        }
        return r1;
    }

    public void A0A(ViewGroup viewGroup, AnonymousClass01I r12, ArrayList arrayList, int i) {
        if (this.A04 != null && arrayList.size() > 1) {
            A07(false);
            this.A04.removeAllViews();
            boolean z = this instanceof C33361fC;
            if (z) {
                this.A0A.clear();
            }
            LayoutInflater from = LayoutInflater.from(r12);
            if (from != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AnonymousClass141 r5 = (AnonymousClass141) arrayList.get(i2);
                    View inflate = from.inflate(R.layout.f9nameremoved, viewGroup, false);
                    if (i2 > 0) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(viewGroup.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                        inflate.setLayoutParams(layoutParams);
                    }
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.nux_item_contact_photo);
                    imageView.setImportantForAccessibility(2);
                    if (z && r5.A0H != null && !AnonymousClass14B.A0F(r5.A0H.user)) {
                        this.A0A.put(r5.A0H.user, imageView);
                    }
                    this.A0B.A08(imageView, r5);
                    String escapeHtml = Html.escapeHtml(this.A0D.A0Q(r5, -1));
                    if (escapeHtml != null) {
                        ((TextView) inflate.findViewById(R.id.nux_item_contact_name)).setText(Html.fromHtml(escapeHtml));
                    }
                    this.A04.addView(inflate);
                    inflate.setOnClickListener(new C48782i3(this, r5, (long) i2));
                }
                if (i > 15) {
                    View inflate2 = from.inflate(R.layout.f9nameremoved, viewGroup, false);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMarginStart(viewGroup.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                    inflate2.setLayoutParams(layoutParams2);
                    this.A04.addView(inflate2);
                    inflate2.setOnClickListener(new C35121iB(this, 1));
                    ImageButton imageButton = (ImageButton) inflate2.findViewById(R.id.view_more_arrow);
                    this.A02 = imageButton;
                    imageButton.setImportantForAccessibility(2);
                    if (this.A02 != null && C18820ts.A00(this.A0C).A06) {
                        this.A02.setRotationY(180.0f);
                    }
                }
            }
        }
    }

    public void A0B(AnonymousClass01I r8, ArrayList arrayList, int i) {
        Resources resources = r8.getResources();
        boolean z = true;
        int max = Math.max(i, 1);
        String quantityString = resources.getQuantityString(R.plurals.f10nameremoved, max, new Object[]{Integer.valueOf(max)});
        TextView textView = this.A06;
        if (textView != null) {
            textView.setText(quantityString);
        }
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView = this.A03;
        HorizontalScrollView horizontalScrollView = this.A01;
        if (arrayList.size() > 1) {
            z = false;
        }
        int i2 = 0;
        if (imageView != null) {
            int i3 = 8;
            if (z) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        }
        if (horizontalScrollView != null) {
            if (z) {
                i2 = 8;
            }
            horizontalScrollView.setVisibility(i2);
        }
    }
}
