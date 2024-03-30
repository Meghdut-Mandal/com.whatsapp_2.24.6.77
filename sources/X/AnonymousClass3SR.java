package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3SR  reason: invalid class name */
public abstract class AnonymousClass3SR {
    public static final View A00(Activity activity, ViewGroup viewGroup, AnonymousClass1NC r16, C24801Dv r17, AnonymousClass00S r18) {
        AnonymousClass1NC r9 = r16;
        C24801Dv r11 = r17;
        C36321k7.A16(viewGroup, r9, r11, 1);
        Activity activity2 = activity;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        boolean z = C222013h.A07;
        int i = R.drawable.ic_business_directory;
        if (z) {
            i = R.drawable.ic_business_directory_filled_wds;
        }
        int A00 = C224514j.A00(viewGroup.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        AnonymousClass3YT r8 = new AnonymousClass3YT(r9, activity2, r11, r18, 1);
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C63713Lc.A01(A0E, i, A00, R.drawable.green_circle, R.string.f12nameremoved);
        A0E.setOnClickListener(r8);
        AnonymousClass3UF.A0E(C36341k9.A0L(A0E, R.id.contactpicker_row_photo), C36351kA.A02(viewGroup.getContext(), viewGroup.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        return A0E;
    }

    public static final View A02(Activity activity, ViewGroup viewGroup, AnonymousClass17Y r15, C20810yC r16, C32661dz r17, AnonymousClass00S r18, int i, int i2) {
        AnonymousClass17Y r8 = r15;
        C20810yC r9 = r16;
        C32661dz r10 = r17;
        C36321k7.A1A(viewGroup, r9, r15, r10, 1);
        Activity activity2 = activity;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        boolean z = C222013h.A07;
        int i3 = R.drawable.ic_action_add_person;
        if (z) {
            i3 = R.drawable.ic_action_add_person_filled_wds;
        }
        int A03 = C36391kE.A03(viewGroup.getContext());
        C66993Yc r6 = new C66993Yc(activity2, r8, r9, r10, r18, i, i2);
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C63713Lc.A01(A0E, i3, A03, R.drawable.green_circle, R.string.f12nameremoved);
        A0E.setOnClickListener(r6);
        return A0E;
    }

    public static final void A03(Context context, View view, C19460v5 r6, C18820ts r7, AnonymousClass00S r8) {
        C36321k7.A0z(r7, r6);
        AnonymousClass1JZ.A05(view.findViewById(R.id.buttons), r7, 0, context.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
        ImageView A0N = C36391kE.A0N(view, R.id.contactpicker_button_two);
        A0N.setVisibility(0);
        A0N.setImageResource(R.drawable.ic_scan_qr);
        C67113Yo.A00(A0N, context, r6, r8, 31);
        C36331k8.A0q(context, A0N, R.string.f12nameremoved);
        AnonymousClass06T.A00(C36431kI.A0G(context, R.color.f6nameremoved), A0N);
    }

    public static final View A01(Activity activity, ViewGroup viewGroup, AnonymousClass17Y r9, C19600wD r10) {
        C36321k7.A11(viewGroup, r9, r10);
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        int A03 = C36391kE.A03(viewGroup.getContext());
        C67113Yo r4 = new C67113Yo((Object) r10, (Object) activity, (Object) r9, 32);
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C63713Lc.A01(A0E, R.drawable.vec_ic_call_link, A03, R.drawable.green_circle, R.string.f12nameremoved);
        A0E.setOnClickListener(r4);
        return A0E;
    }
}
