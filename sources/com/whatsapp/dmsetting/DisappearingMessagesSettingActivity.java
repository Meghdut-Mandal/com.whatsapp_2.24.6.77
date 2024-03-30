package com.whatsapp.dmsetting;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1A6;
import X.AnonymousClass1A7;
import X.AnonymousClass2ON;
import X.AnonymousClass3FC;
import X.AnonymousClass3GX;
import X.AnonymousClass3I6;
import X.AnonymousClass3PI;
import X.AnonymousClass3TD;
import X.AnonymousClass3Y0;
import X.AnonymousClass6YV;
import X.C18800tq;
import X.C18830tt;
import X.C20810yC;
import X.C21060yb;
import X.C220412q;
import X.C235518x;
import X.C238119y;
import X.C24801Dv;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C62383Fy;
import X.C89334Wd;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class DisappearingMessagesSettingActivity extends AnonymousClass155 {
    public int A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public AnonymousClass1A6 A03;
    public C235518x A04;
    public AnonymousClass3GX A05;
    public AnonymousClass3FC A06;
    public C62383Fy A07;
    public AnonymousClass3PI A08;
    public boolean A09;

    public void onCreate(Bundle bundle) {
        String A012;
        super.onCreate(bundle);
        int i = 1;
        this.A00 = C36431kI.A0F(this, R.layout.f9nameremoved).getIntExtra("entry_point", 1);
        this.A02 = (ListItemWithLeftIcon) findViewById(R.id.dm_setting_default_message_timer_row);
        this.A01 = (ListItemWithLeftIcon) findViewById(R.id.dm_setting_chat_picker_row);
        Toolbar toolbar = (Toolbar) C36361kB.A0D(this, R.id.toolbar);
        C36331k8.A0s(this, toolbar, this.A00, R.drawable.ic_back);
        toolbar.setTitle((CharSequence) getString(R.string.f12nameremoved));
        toolbar.setBackgroundResource(C36441kJ.A04(C36371kC.A0B(toolbar)));
        toolbar.setNavigationOnClickListener(new AnonymousClass3Y0(this, 20));
        toolbar.A0J(this, R.style.f13nameremoved);
        setSupportActionBar(toolbar);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C36361kB.A0D(this, R.id.dm_description);
        String A0m = C36361kB.A0m(this, R.string.f12nameremoved);
        C20810yC r10 = this.A0D;
        AnonymousClass17Y r7 = this.A05;
        C24801Dv r6 = this.A01;
        C21060yb r9 = this.A08;
        C62383Fy r0 = this.A07;
        if (r0 != null) {
            Uri A042 = r0.A01.A04("chats", "about-disappearing-messages");
            AnonymousClass00C.A08(A042);
            AnonymousClass6YV.A0E(this, A042, r6, r7, textEmojiLabel, r9, r10, A0m, "learn-more");
            C235518x r02 = this.A04;
            AnonymousClass00C.A0B(r02);
            Integer A043 = r02.A04();
            AnonymousClass00C.A08(A043);
            int intValue = A043.intValue();
            if (intValue == 0) {
                A012 = getString(R.string.f12nameremoved);
            } else {
                A012 = AnonymousClass3TD.A01(this, intValue, false, false);
            }
            AnonymousClass00C.A0B(A012);
            ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
            AnonymousClass00C.A0B(listItemWithLeftIcon);
            listItemWithLeftIcon.setDescription((CharSequence) A012);
            ListItemWithLeftIcon listItemWithLeftIcon2 = this.A02;
            if (listItemWithLeftIcon2 != null) {
                AnonymousClass3Y0.A01(listItemWithLeftIcon2, this, 19);
            }
            A01((List) null);
            ListItemWithLeftIcon listItemWithLeftIcon3 = this.A01;
            if (listItemWithLeftIcon3 != null) {
                AnonymousClass3Y0.A01(listItemWithLeftIcon3, this, 18);
            }
            if (this.A00 == 6) {
                i = 0;
            }
            AnonymousClass3GX r2 = this.A05;
            if (r2 != null) {
                AnonymousClass2ON r1 = new AnonymousClass2ON();
                r1.A00 = Integer.valueOf(i);
                r1.A01 = C36441kJ.A0y(C36431kI.A05(r2.A01));
                r2.A02.Bly(r1);
                AnonymousClass3PI r3 = this.A08;
                if (r3 != null) {
                    View view = this.A00;
                    AnonymousClass00C.A08(view);
                    r3.A02(view, "disappearing_messages_storage", C36381kD.A0q(this));
                    return;
                }
                throw C36331k8.A0d("settingsSearchUtil");
            }
            throw C36331k8.A0d("ephemeralSettingLogger");
        }
        throw C36331k8.A0d("userExperienceEphemeralMessageUtils");
    }

    private final void A01(List list) {
        int i;
        String quantityString;
        ListItemWithLeftIcon listItemWithLeftIcon = this.A01;
        if (listItemWithLeftIcon != null) {
            AnonymousClass1A6 r0 = this.A03;
            if (r0 != null) {
                C220412q r3 = r0.A02;
                C220412q.A00(r3);
                AnonymousClass1A7 r2 = r0.A01;
                synchronized (r2) {
                    Iterator it = r2.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += AnonymousClass000.A1R(r3.A03(((AnonymousClass3I6) it.next()).A01)) ? 1 : 0;
                    }
                }
                AnonymousClass3FC r5 = this.A06;
                AnonymousClass00C.A0B(r5);
                int i2 = 0;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass11F A0a = C36401kF.A0a(it2);
                        C220412q r1 = r5.A05;
                        AnonymousClass16D r02 = r5.A04;
                        AnonymousClass00C.A0B(A0a);
                        if (AnonymousClass3TD.A00(r02, r1, A0a) == 0) {
                            i2++;
                        }
                    }
                }
                int i3 = i + i2;
                if (i3 == 0) {
                    quantityString = getString(R.string.f12nameremoved);
                } else {
                    Resources resources = getResources();
                    Object[] A0L = AnonymousClass001.A0L();
                    C36331k8.A1W(A0L, i3);
                    quantityString = resources.getQuantityString(R.plurals.f10nameremoved, i3, A0L);
                }
                AnonymousClass00C.A0B(quantityString);
                listItemWithLeftIcon.setDescription((CharSequence) quantityString);
                return;
            }
            throw C36331k8.A0d("conversationsManager");
        }
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = C27111My.A25(A0L);
            this.A04 = (C235518x) r2.A2p.get();
            this.A03 = C36401kF.A0V(r2);
            this.A05 = C27111My.A24(A0L);
            this.A08 = C27111My.A3F(A0L);
            this.A07 = (C62383Fy) r1.ABQ.get();
        }
    }

    public DisappearingMessagesSettingActivity(int i) {
        this.A09 = false;
        C89334Wd.A00(this, 15);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String A012;
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            return;
        }
        if (i == 1) {
            int intExtra = intent.getIntExtra("all_contacts_count", 0);
            C235518x r0 = this.A04;
            AnonymousClass00C.A0B(r0);
            int i3 = C238119y.A00(r0.A03).getInt("disappearing_mode_duration_for_chat_picker_int", 0);
            ArrayList A0k = C36341k9.A0k(intent);
            C235518x r02 = this.A04;
            AnonymousClass00C.A0B(r02);
            Integer A042 = r02.A04();
            AnonymousClass00C.A08(A042);
            if (i2 == -1) {
                int intValue = A042.intValue();
                AnonymousClass3FC r6 = this.A06;
                AnonymousClass00C.A0B(r6);
                r6.A00(A0k, i3, intValue, intExtra, this.A00);
                AnonymousClass00C.A08(this.A00);
                if (A0k.size() > 0) {
                    A01(A0k);
                    return;
                }
                return;
            }
            int intValue2 = A042.intValue();
            AnonymousClass3GX r03 = this.A05;
            if (r03 != null) {
                r03.A01(A0k, 2, intValue2, 0, intExtra, this.A00);
                return;
            }
            throw C36331k8.A0d("ephemeralSettingLogger");
        } else if (i == 100 && i2 == -1) {
            int intExtra2 = intent.getIntExtra("duration", 0);
            if (intExtra2 == 0) {
                A012 = getString(R.string.f12nameremoved);
            } else {
                A012 = AnonymousClass3TD.A01(this, intExtra2, false, false);
            }
            AnonymousClass00C.A0B(A012);
            ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
            AnonymousClass00C.A0B(listItemWithLeftIcon);
            listItemWithLeftIcon.setDescription((CharSequence) A012);
        }
    }

    public DisappearingMessagesSettingActivity() {
        this(0);
    }
}
