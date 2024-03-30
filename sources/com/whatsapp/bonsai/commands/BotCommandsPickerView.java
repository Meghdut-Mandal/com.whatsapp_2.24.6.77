package com.whatsapp.bonsai.commands;

import X.AnonymousClass00C;
import X.AnonymousClass1NM;
import X.AnonymousClass2H3;
import X.AnonymousClass4YA;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import X.C40571vl;
import X.C51912oa;
import X.C87054Nh;
import X.C87064Ni;
import X.C89114Vh;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class BotCommandsPickerView extends AnonymousClass2H3 {
    public C40571vl A00;
    public C87064Ni A01;
    public AnonymousClass1NM A02;
    public LinearLayoutManager A03;
    public RecyclerView A04;
    public C87054Nh A05;
    public UserJid A06;
    public List A07;
    public boolean A08 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setChatMessageCounts(AnonymousClass1NM r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setCommandList(List list, Bitmap bitmap) {
        AnonymousClass00C.A0D(list, 0);
        C40571vl r0 = this.A00;
        if (r0 != null) {
            r0.A01 = list;
            r0.A00 = bitmap;
            r0.A06();
        }
    }

    public final void setupView(List list, Bitmap bitmap, C87064Ni r6, View view, C87054Nh r8, UserJid userJid) {
        C36321k7.A0v(list, 0, r6);
        AnonymousClass00C.A0D(r8, 4);
        this.A07 = list;
        this.A06 = userJid;
        this.A01 = r6;
        this.A05 = r8;
        this.A04 = C36441kJ.A0c(this, R.id.bot_command_list);
        C40571vl r1 = new C40571vl(bitmap, r8, list);
        this.A00 = r1;
        r1.BnA(new C89114Vh(this, 0));
        getContext();
        LinearLayoutManager A0T = C36431kI.A0T();
        this.A03 = A0T;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(A0T);
        }
        RecyclerView recyclerView2 = this.A04;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A00);
        }
        setVisibility(8);
        if (view != null) {
            setAnchorWidthView(view);
            view.addOnLayoutChangeListener(new AnonymousClass4YA(view, this, 0));
        }
    }

    public final AnonymousClass1NM getChatMessageCounts() {
        AnonymousClass1NM r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatMessageCounts");
    }

    public View getContentView() {
        RecyclerView recyclerView = this.A04;
        AnonymousClass00C.A0E(recyclerView, "null cannot be cast to non-null type android.view.View");
        return recyclerView;
    }

    public final void A08(int i) {
        UserJid userJid;
        A06(i, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        if (i == 0) {
            this.A08 = true;
        } else if (this.A08 && (userJid = this.A06) != null) {
            this.A08 = false;
            getChatMessageCounts().A08(C51912oa.CMD_PICKER_SHOWN, userJid);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C36321k7.A0v(context, 1, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C36321k7.A0v(context, 1, attributeSet);
    }
}
