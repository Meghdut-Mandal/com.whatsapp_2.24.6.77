package com.whatsapp.permissions;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass1N3;
import X.AnonymousClass3TX;
import X.AnonymousClass6YV;
import X.C16550pQ;
import X.C19420v0;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C48762i0;
import X.C48832i8;
import X.C48922iH;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public abstract class RequestPermissionsBottomSheet extends Hilt_RequestPermissionsBottomSheet implements C16550pQ {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1N3 A02;
    public C21060yb A03;
    public C19420v0 A04;
    public C20810yC A05;
    public AnonymousClass3TX A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        View.OnClickListener r0;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle A0b = A0b();
        String[] stringArray = A0b.getStringArray("permissions");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        int i = A0b.getInt("message_id");
        TextView A0M = C36341k9.A0M(view, R.id.permission_message);
        Context context = view.getContext();
        Object[] A0L = AnonymousClass001.A0L();
        C36421kH.A0k(view.getContext(), R.string.f12nameremoved, 0, A0L);
        C36341k9.A0s(context, A0M, A0L, i);
        int i2 = A0b.getInt("title_id");
        TextView A0O = C36391kE.A0O(view, R.id.permission_title);
        Context context2 = view.getContext();
        Object[] A0L2 = AnonymousClass001.A0L();
        C36421kH.A0k(view.getContext(), R.string.f12nameremoved, 0, A0L2);
        C36341k9.A0s(context2, A0O, A0L2, i2);
        int i3 = A0b.getInt("nth_details_id");
        if (i3 != 0) {
            C36361kB.A1P(A0n(i3), C36391kE.A0O(view, R.id.nth_time_request));
        }
        C36391kE.A1D(A0b, C36341k9.A0L(view, R.id.permission_image), "icon_id");
        C36391kE.A1D(A0b, C36341k9.A0L(view, R.id.line1_image), "line1_icon_id");
        C36391kE.A1D(A0b, C36341k9.A0L(view, R.id.line2_image), "line2_icon_id");
        C36391kE.A1D(A0b, C36341k9.A0L(view, R.id.line3_image), "line3_icon_id");
        int i4 = A0b.getInt("line1_message_id");
        TextEmojiLabel A0O2 = C36351kA.A0O(view, R.id.line1_message);
        if (i4 != 0) {
            Context A0a = A0a();
            C20810yC r10 = this.A05;
            if (r10 != null) {
                AnonymousClass17Y r7 = this.A01;
                if (r7 != null) {
                    C24801Dv r6 = this.A00;
                    if (r6 != null) {
                        C21060yb r9 = this.A03;
                        if (r9 != null) {
                            String A0n = A0n(i4);
                            AnonymousClass1N3 r2 = this.A02;
                            if (r2 != null) {
                                AnonymousClass6YV.A0E(A0a, r2.A00("https://www.whatsapp.com/security"), r6, r7, A0O2, r9, r10, A0n, "learn-more");
                            } else {
                                throw C36331k8.A0d("waLinkFactory");
                            }
                        } else {
                            throw C36331k8.A0W();
                        }
                    } else {
                        throw C36331k8.A0d("activityUtils");
                    }
                } else {
                    throw C36321k7.A06();
                }
            } else {
                throw C36321k7.A07();
            }
        }
        int i5 = A0b.getInt("line2_message_id");
        TextView A0M2 = C36341k9.A0M(view, R.id.line2_message);
        if (i5 != 0) {
            A0M2.setText(i5);
        }
        int i6 = A0b.getInt("line3_message_id");
        TextView A0M3 = C36341k9.A0M(view, R.id.line3_message);
        if (i6 != 0) {
            Context context3 = view.getContext();
            Object[] A0L3 = AnonymousClass001.A0L();
            C36421kH.A0k(view.getContext(), R.string.f12nameremoved, 0, A0L3);
            C36341k9.A0s(context3, A0M3, A0L3, i6);
            A0M3.setVisibility(0);
        }
        String string = A0b.getString("permission_requestor_screen_type");
        boolean z = A0b.getBoolean("is_first_time_request");
        boolean z2 = A0b.getBoolean("should_disable_cancel_on_outside_click");
        boolean z3 = A0b.getBoolean("should_hide_cancel_button_on_1st_time");
        View A0G = C36361kB.A0G(view, R.id.cancel);
        A0G.setOnClickListener(new C48922iH(5, string, this));
        if (z2) {
            A1g(false);
        }
        if (z && z3) {
            A0G.setVisibility(8);
        }
        View A0G2 = C36361kB.A0G(view, R.id.nth_time_request);
        TextView A0M4 = C36341k9.A0M(view, R.id.submit);
        if (z) {
            A0G2.setVisibility(8);
            r0 = new C48832i8(stringArray, this, string, 1);
        } else {
            A0G2.setVisibility(0);
            A0M4.setText(R.string.f12nameremoved);
            r0 = new C48762i0(this, 8);
        }
        A0M4.setOnClickListener(r0);
        if (A1o()) {
            C36361kB.A0F(view, R.id.permission_request_dialog).setBackground((Drawable) null);
        }
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
