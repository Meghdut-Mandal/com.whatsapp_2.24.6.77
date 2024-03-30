package com.whatsapp.event;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass1JZ;
import X.AnonymousClass2MK;
import X.AnonymousClass2bT;
import X.C18820ts;
import X.C29541Xa;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C40211v8;
import X.C40521vg;
import X.C46762bd;
import X.C48902iF;
import X.C51522nx;
import X.C52292pC;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatInfoEventsCard extends InfoCard {
    public C18820ts A00;
    public C29541Xa A01;
    public boolean A02;
    public LinearLayout A03;
    public RecyclerView A04;
    public WaTextView A05;
    public C40521vg A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setEventMessageManager(C29541Xa r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setTitleRowClickListener(AnonymousClass11F r3) {
        AnonymousClass00C.A0D(r3, 0);
        C48902iF.A00(this.A03, r3, this, 4);
    }

    public final void setUpcomingEvents(List list) {
        C52292pC r1;
        AnonymousClass00C.A0D(list, 0);
        C40521vg r6 = this.A06;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2bT r3 = (AnonymousClass2bT) it.next();
            C51522nx r2 = C51522nx.UPCOMING;
            C46762bd A012 = getEventMessageManager().A01(r3);
            if (A012 != null) {
                r1 = A012.A01;
            } else {
                r1 = null;
            }
            A0J.add(new AnonymousClass2MK(r2, r3, r1));
        }
        List list2 = r6.A00;
        C36341k9.A1A(new C40211v8(list2, A0J), r6, A0J, list2);
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final C29541Xa getEventMessageManager() {
        C29541Xa r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventMessageManager");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void setInfoText(int i) {
        WaTextView waTextView = this.A05;
        Resources resources = getResources();
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, i);
        C36351kA.A16(resources, waTextView, A0L, R.plurals.f10nameremoved, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A06 = new C40521vg();
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A05 = C36341k9.A0Q(this, R.id.upcoming_events_info);
        this.A03 = (LinearLayout) C36361kB.A0G(this, R.id.upcoming_events_title_row);
        AnonymousClass1JZ.A0B(this.A05, getWhatsAppLocale(), R.drawable.chevron_right);
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(this, R.id.upcoming_events_list);
        this.A04 = recyclerView;
        recyclerView.setLayoutDirection(C36401kF.A1X(getWhatsAppLocale()) ? 1 : 0);
        C36351kA.A1F(this.A04, 0);
        this.A04.setAdapter(this.A06);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
