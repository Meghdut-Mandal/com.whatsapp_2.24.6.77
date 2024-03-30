package X;

import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import java.util.List;

/* renamed from: X.4oA  reason: invalid class name and case insensitive filesystem */
public abstract class C96954oA extends AnonymousClass0D3 {
    public void A0B(AnonymousClass9FU r14, int i) {
        View r3;
        Object obj;
        View view;
        Button button;
        View.OnClickListener onClickListener;
        if (this instanceof AnonymousClass5Gn) {
            ((AnonymousClass5Gn) this).A00.setText(((AnonymousClass5H0) r14).A00);
        } else if (this instanceof AnonymousClass5Gq) {
            throw AnonymousClass001.A0A("title");
        } else {
            if (this instanceof AnonymousClass5Gs) {
                AnonymousClass5Gs r4 = (AnonymousClass5Gs) this;
                AnonymousClass5H5 r142 = (AnonymousClass5H5) r14;
                AnonymousClass3UF.A0B(C36441kJ.A0F(r4), r4.A01, r142.A00, r142.A01);
                r4.A02.setText(r142.A04);
                button = r4.A00;
                button.setText(r142.A03);
                onClickListener = r142.A02;
            } else if (this instanceof AnonymousClass5Gr) {
                AnonymousClass5Gr r2 = (AnonymousClass5Gr) this;
                AnonymousClass5H2 r143 = (AnonymousClass5H2) r14;
                r2.A01.setText(r143.A00);
                r2.A02.setText(r143.A01);
                r2.A00.setVisibility(0);
                return;
            } else if (this instanceof AnonymousClass5Gp) {
                AnonymousClass5Gp r32 = (AnonymousClass5Gp) this;
                r32.A01.setText(((AnonymousClass5H1) r14).A00);
                C90504aG.A11(C36441kJ.A0F(r32), r32.A00, R.color.f6nameremoved);
                return;
            } else if (this instanceof AnonymousClass5Gt) {
                AnonymousClass5Gt r7 = (AnonymousClass5Gt) this;
                AnonymousClass5H6 r144 = (AnonymousClass5H6) r14;
                byte[] bArr = r144.A09;
                if (bArr != null) {
                    r7.A01.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                }
                TextView textView = r7.A04;
                C135086c7 r0 = r144.A03;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.A00;
                }
                textView.setText((CharSequence) obj);
                String str = r144.A04;
                if (str != null) {
                    r7.A03.setText(str);
                }
                TextView textView2 = r7.A03;
                int i2 = 0;
                if (r144.A04 == null) {
                    i2 = 8;
                }
                textView2.setVisibility(i2);
                if (r144.A08) {
                    LinearLayout linearLayout = r7.A02;
                    linearLayout.setVisibility(0);
                    ImageView A0G = C36401kF.A0G(linearLayout, R.id.warning_icon);
                    TextView A0O = C36391kE.A0O(linearLayout, R.id.warning_message);
                    AnonymousClass3UF.A0B(C36441kJ.A0F(r7), A0G, r144.A00, r144.A01);
                    A0O.setText(r144.A06);
                    if (r144.A07) {
                        button = r7.A00;
                        button.setVisibility(0);
                        button.setText(r144.A05);
                        onClickListener = r144.A02;
                    } else {
                        view = r7.A00;
                    }
                } else {
                    view = r7.A02;
                }
                view.setVisibility(8);
                return;
            } else if (this instanceof C105785Gl) {
                AnonymousClass5Gu r33 = (AnonymousClass5Gu) this;
                AnonymousClass5H4 r145 = (AnonymousClass5H4) r14;
                ImageView imageView = r33.A03;
                View view2 = r33.A0H;
                C90504aG.A11(view2.getContext(), imageView, R.color.f6nameremoved);
                String str2 = r145.A02;
                String str3 = r145.A01;
                View.OnClickListener onClickListener2 = r145.A00;
                r33.A08 = str2;
                r33.A07 = str3;
                r33.A00 = onClickListener2;
                List list = r33.A09;
                list.clear();
                LinearLayout linearLayout2 = r33.A04;
                linearLayout2.removeAllViews();
                list.addAll(r145.A03);
                r33.A0C();
                for (int i3 = 0; i3 < Math.min(list.size(), 2); i3++) {
                    C202319lY r9 = (C202319lY) list.get(i3);
                    int size = list.size();
                    C92914ez r34 = new C92914ez(view2.getContext());
                    C18740tg.A06(r9);
                    long j = r9.A05;
                    if (j > 0) {
                        r34.A01.setText(C20040wv.A09(r34.A03, r34.A02.A08(j)));
                    }
                    r34.A00.setText(r34.A04.A0P(r9));
                    int i4 = size - 1;
                    View findViewById = r34.findViewById(R.id.divider);
                    int i5 = 8;
                    if (i3 < i4) {
                        i5 = 0;
                    }
                    findViewById.setVisibility(i5);
                    linearLayout2.addView(r34);
                }
                return;
            } else if (this instanceof C105795Gm) {
                C105795Gm r72 = (C105795Gm) this;
                AnonymousClass5Gx r146 = (AnonymousClass5Gx) r14;
                r72.A00 = r146.A01;
                String str4 = r146.A04;
                if (str4 != null) {
                    TextView textView3 = r72.A06;
                    textView3.setText(str4);
                    textView3.setVisibility(0);
                }
                ImageView imageView2 = r72.A03;
                View view3 = r72.A0H;
                C90504aG.A11(view3.getContext(), imageView2, R.color.f6nameremoved);
                String str5 = r146.A03;
                String str6 = r146.A02;
                View.OnClickListener onClickListener3 = r146.A00;
                r72.A08 = str5;
                r72.A07 = str6;
                r72.A00 = onClickListener3;
                List list2 = r72.A09;
                list2.clear();
                LinearLayout linearLayout3 = r72.A04;
                linearLayout3.removeAllViews();
                list2.addAll(r146.A05);
                r72.A0C();
                for (int i6 = 0; i6 < Math.min(list2.size(), 2); i6++) {
                    C202319lY r22 = (C202319lY) list2.get(i6);
                    int size2 = list2.size();
                    if (r22.A03 != 1000 || !r22.A0P) {
                        r3 = new C180388li(view3.getContext());
                    } else {
                        r3 = C36351kA.A0C(view3).inflate(R.layout.f9nameremoved, linearLayout3, false);
                    }
                    if (r3 instanceof C180388li) {
                        C180388li r1 = (C180388li) r3;
                        r1.A0Y = "mandate_payment_screen";
                        r1.A0S = r72.A00;
                        C18740tg.A06(r22);
                        r1.B1s(r22);
                    } else if (r3 instanceof PaymentInteropShimmerRow) {
                        C18740tg.A06(r22);
                        ((PaymentInteropShimmerRow) r3).B1s(r22);
                    }
                    int i7 = size2 - 1;
                    View findViewById2 = r3.findViewById(R.id.divider);
                    if (i6 < i7) {
                        findViewById2.setVisibility(0);
                    } else {
                        findViewById2.setVisibility(8);
                    }
                    linearLayout3.addView(r3);
                }
                return;
            } else {
                AnonymousClass5Go r5 = (AnonymousClass5Go) this;
                AnonymousClass5H3 r147 = (AnonymousClass5H3) r14;
                ImageView imageView3 = r5.A00;
                View view4 = r5.A0H;
                AnonymousClass3UF.A0B(view4.getContext(), imageView3, r147.A00, r147.A01);
                r5.A01.setText(r147.A02);
                view4.setOnClickListener(r147.A03);
                return;
            }
            button.setOnClickListener(onClickListener);
        }
    }

    public C96954oA(View view) {
        super(view);
    }
}
