package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1z6  reason: invalid class name and case insensitive filesystem */
public abstract class C42611z6 extends AnonymousClass0D3 {
    public void A0B() {
    }

    public void A0C(Object obj) {
        C46482Xv r2 = (C46482Xv) this;
        if (r2 instanceof AnonymousClass2Xq) {
            AnonymousClass2Xq r22 = (AnonymousClass2Xq) r2;
            LayoutInflater A0C = C36351kA.A0C(r22.A00);
            ViewGroup A0O = C36411kG.A0O(r22.A0H, R.id.shimmer_items);
            A0O.removeAllViews();
            int i = 0;
            do {
                A0C.inflate(R.layout.f9nameremoved, A0O, true);
                i++;
            } while (i < 14);
        } else if (r2 instanceof AnonymousClass2Xs) {
            throw AnonymousClass001.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        } else if (r2 instanceof AnonymousClass2Xp) {
            AnonymousClass00C.A0D(obj, 0);
            C38901qQ r23 = ((AnonymousClass2Xp) r2).A00;
            r23.setSearchHint(C36381kD.A0s(r23.getResources(), R.string.f12nameremoved));
            C36361kB.A17(r23, obj, 17);
        } else if (r2 instanceof C46472Xu) {
            C46472Xu r24 = (C46472Xu) r2;
            C46442Xl r12 = (C46442Xl) obj;
            C40551vj r1 = r24.A04;
            r1.A00 = r12.A01;
            r1.A06();
            r24.A02.setAdapter(r1);
            C36361kB.A17(r24.A03, r12, 15);
            C36361kB.A17(r24.A00, r12, 16);
        } else if (r2 instanceof AnonymousClass2Xr) {
            AnonymousClass2Xr r25 = (AnonymousClass2Xr) r2;
            C62283Fo r122 = (C62283Fo) obj;
            C134986bw r3 = r122.A01;
            AppCompatCheckBox appCompatCheckBox = r25.A00;
            appCompatCheckBox.setText(r3.A01);
            appCompatCheckBox.setChecked(r122.A00);
            C67113Yo.A00(appCompatCheckBox, r25, r122, r3, 13);
        } else if (r2 instanceof AnonymousClass2Xo) {
            AnonymousClass2Xo r26 = (AnonymousClass2Xo) r2;
            ViewGroup viewGroup = r26.A00;
            Context context = viewGroup.getContext();
            Resources resources = context.getResources();
            LayoutInflater from = LayoutInflater.from(context);
            ViewGroup A0O2 = C36411kG.A0O(r26.A0H, R.id.shimmer_items);
            A0O2.removeAllViews();
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                i2 = C36431kI.A04(viewGroup.getChildAt(i3), i2);
            }
            int round = Math.round(((float) (viewGroup.getHeight() - i2)) / ((float) resources.getDimensionPixelSize(R.dimen.f7nameremoved)));
            for (int i4 = 0; i4 < round; i4++) {
                from.inflate(R.layout.f9nameremoved, A0O2, true);
            }
        } else if (r2 instanceof AnonymousClass2Xt) {
            AnonymousClass2Xt r27 = (AnonymousClass2Xt) r2;
            Uri parse = Uri.parse("https://faq.whatsapp.com/591394022726343");
            AnonymousClass00C.A08(parse);
            C20810yC r8 = r27.A04;
            AnonymousClass17Y r5 = r27.A01;
            String A0m = C36361kB.A0m(C36441kJ.A0F(r27), R.string.f12nameremoved);
            TextEmojiLabel textEmojiLabel = r27.A02;
            C24801Dv r4 = r27.A00;
            C21060yb r7 = r27.A03;
            AnonymousClass00C.A0D(textEmojiLabel, 5);
            AnonymousClass6YV.A0E(textEmojiLabel.getContext(), parse, r4, r5, textEmojiLabel, r7, r8, A0m, "learn-more");
        } else if (r2 instanceof C46462Xn) {
            AnonymousClass00C.A0D(obj, 0);
            C38901qQ r28 = ((C46462Xn) r2).A00;
            r28.setSearchHint(C36381kD.A0s(r28.getResources(), R.string.f12nameremoved));
            C36361kB.A18(r28, obj, 28);
        } else if (r2 instanceof C46452Xm) {
            View view = r2.A0H;
            LayoutInflater from2 = LayoutInflater.from(C36371kC.A0B(view));
            ViewGroup viewGroup2 = (ViewGroup) C36361kB.A0G(view, R.id.popular_biz_shimmer_items);
            viewGroup2.removeAllViews();
            int i5 = 0;
            do {
                from2.inflate(R.layout.f9nameremoved, viewGroup2, true);
                i5++;
            } while (i5 < 6);
        }
    }

    public C42611z6(View view) {
        super(view);
    }
}
