package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass005;
import X.AnonymousClass07B;
import X.AnonymousClass17Z;
import X.AnonymousClass1X8;
import X.AnonymousClass5DB;
import X.AnonymousClass6NJ;
import X.AnonymousClass6NX;
import X.AnonymousClass6TQ;
import X.AnonymousClass7hB;
import X.C108415Tk;
import X.C117545mR;
import X.C124275xs;
import X.C131146Nx;
import X.C146996wV;
import X.C147006wW;
import X.C1497272n;
import X.C1502074j;
import X.C163027pX;
import X.C163127ph;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19630wG;
import X.C19770wU;
import X.C27111My;
import X.C33771fu;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36431kI;
import X.C36441kJ;
import X.C62623Gw;
import X.C87464Ox;
import X.C90464aC;
import X.C90484aE;
import X.C90504aG;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class ChatTransferActivity extends AnonymousClass5DB implements C87464Ox, AnonymousClass7hB {
    public C33771fu A00;
    public C19630wG A01;
    public AnonymousClass6TQ A02;
    public ChatTransferViewModel A03;
    public C131146Nx A04;
    public C62623Gw A05;
    public AnonymousClass1X8 A06;
    public AnonymousClass005 A07;
    public boolean A08;

    private void A01() {
        int A032 = this.A07.A03(true);
        ChatTransferViewModel chatTransferViewModel = this.A03;
        if (A032 == 0) {
            C36341k9.A16(chatTransferViewModel.A0D, 10);
            return;
        }
        C36341k9.A19(chatTransferViewModel.A0F, true);
        if (!chatTransferViewModel.A06 || chatTransferViewModel.A08) {
            C1497272n.A00(chatTransferViewModel.A0a, chatTransferViewModel, 38);
        }
        if (!chatTransferViewModel.A06) {
            return;
        }
        if (chatTransferViewModel.A09) {
            String str = chatTransferViewModel.A05;
            if (str != null) {
                chatTransferViewModel.A0a(str);
            } else {
                chatTransferViewModel.A0U();
            }
        } else {
            AnonymousClass6NX r5 = chatTransferViewModel.A0U;
            C117545mR r3 = new C117545mR(chatTransferViewModel);
            if (r5.A05.A2V("chat_transfer_intent_to_migrate_last_set_timestamp", 86400000)) {
                C1502074j r4 = new C1502074j(r5, r3, 18);
                C1497272n r0 = new C1497272n(r5, 26);
                C19770wU r32 = r5.A0L;
                new C147006wW(new C146996wV(r5, r4, r0, true), r5.A0J, r32, true).A00();
                return;
            }
            Log.i("fpm/ExportHelper/prepareForAuthentication()/skipping bc intent to migrate flag set in last 24 hours");
            AnonymousClass17Z r02 = AnonymousClass17Z.$redex_init_class;
            r5.A0K.A0G();
            r5.A0A.A04(false);
            Log.i("fpm/ExportHelper/disconnectFromServer()/success");
            r3.A00.A0U();
            Log.i("fpm/ExportHelper/prepareForAuthentication()/success");
        }
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A08 = C90484aE.A0Z(r1);
            this.A05 = C36351kA.A0X(r2);
            this.A04 = C90504aG.A0N(r1);
            this.A00 = C36351kA.A0P(r2);
            this.A01 = C36351kA.A0W(r2);
            this.A02 = (AnonymousClass6TQ) r1.A2b.get();
            this.A05 = C27111My.A38(A0L);
            this.A04 = (C131146Nx) r1.AA5.get();
            this.A06 = (AnonymousClass1X8) r2.AdX.get();
            this.A07 = C18840tu.A00(r1.A2p);
        }
    }

    public boolean Bge() {
        Log.i("fpm/ChatTransferActivity/logout received from the server");
        return false;
    }

    public void Biz(int i) {
        this.A04.Bp2(new C1497272n(this, 34), "fpm/ChatTransferActivity/lottie");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0D.A0E(3808)) {
            menu.add(0, 0, 0, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.A0D.A0E(3808) || menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A02("chat-transfer");
        this.A05.A01(this, this.A06, "chat-transfer");
        return true;
    }

    public ChatTransferActivity(int i) {
        this.A08 = false;
        C163027pX.A00(this, 40);
    }

    public void A3j(int i) {
        C124275xs r1;
        super.A3j(i);
        if (i != 2) {
            switch (i) {
                case 8:
                    this.A02.A03(0, 0, 0);
                    return;
                case 9:
                    A01();
                    return;
                case 10:
                    r1 = ChatTransferViewModel.A01();
                    break;
                default:
                    return;
            }
        } else {
            r1 = new C124275xs(new C163127ph(this.A03, 0), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, true, true);
        }
        A3k(r1);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass07B A0Q;
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(this).hasPermanentMenuKey() && (A0Q = C36431kI.A0Q(this, toolbar)) != null) {
            A0Q.A0U(false);
            A0Q.A0X(false);
        }
        C108415Tk r2 = C108415Tk.ANDROID_TO_ANDROID_LOTTIE_ANIMATION;
        int A012 = this.A04.A01(r2.id);
        if (A012 == 3 || A012 == 2) {
            this.A04.Bp2(new C1497272n(this, 34), "fpm/ChatTransferActivity/lottie");
        } else {
            ((AnonymousClass6NJ) this.A07.get()).A01(this, r2);
        }
    }

    public void onResume() {
        super.onResume();
        Number A0z = C36441kJ.A0z(this.A06.A0D);
        if (A0z != null && A0z.intValue() == 10) {
            A01();
        }
    }

    public ChatTransferActivity() {
        this(0);
    }
}
