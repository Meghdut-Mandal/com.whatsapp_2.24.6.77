package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2Gz  reason: invalid class name */
public class AnonymousClass2Gz extends AnonymousClass28f {
    public final AnonymousClass13J A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Gz(X.AnonymousClass01L r36, X.C19460v5 r37, X.C19460v5 r38, X.C19460v5 r39, X.AnonymousClass3C4 r40, X.AnonymousClass3C5 r41, X.C58012zB r42, X.C225014r r43, X.AnonymousClass17Y r44, X.C19730wQ r45, X.C21100yf r46, X.AnonymousClass1X4 r47, X.AnonymousClass3CG r48, X.AnonymousClass1MK r49, X.C24361Cd r50, X.AnonymousClass1AO r51, X.AnonymousClass16I r52, X.AnonymousClass4V7 r53, X.AnonymousClass1NM r54, X.C19420v0 r55, X.C18820ts r56, X.C220412q r57, X.AnonymousClass1A5 r58, X.AnonymousClass141 r59, X.C236419g r60, X.C20810yC r61, X.C20500xf r62, X.C233117z r63, X.C177538dx r64, X.C32641dx r65, X.AnonymousClass1CR r66, X.C26371Jx r67, X.AnonymousClass13J r68, X.C19770wU r69) {
        /*
            r35 = this;
            r29 = r63
            r28 = r62
            r27 = r61
            r26 = r60
            r25 = r59
            r24 = r58
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r30 = r64
            r1 = r35
            r31 = r65
            r2 = r36
            r32 = r66
            r3 = r37
            r7 = r41
            r33 = r67
            r4 = r38
            r8 = r42
            r5 = r39
            r9 = r43
            r34 = r69
            r6 = r40
            r14 = r48
            r15 = r49
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r56
            r23 = r57
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r68
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Gz.<init>(X.01L, X.0v5, X.0v5, X.0v5, X.3C4, X.3C5, X.2zB, X.14r, X.17Y, X.0wQ, X.0yf, X.1X4, X.3CG, X.1MK, X.1Cd, X.1AO, X.16I, X.4V7, X.1NM, X.0v0, X.0ts, X.12q, X.1A5, X.141, X.19g, X.0yC, X.0xf, X.17z, X.8dx, X.1dx, X.1CR, X.1Jx, X.13J, X.0wU):void");
    }

    public void BUv(Menu menu) {
        if ((menu instanceof C016307a) && C36361kB.A1Y(this.A0F)) {
            ((C016307a) menu).A0C = true;
        }
        Log.i("listconversationmenu/oncreateoptionsmenu");
        A0D(menu, 21, R.string.f12nameremoved, R.drawable.vec_ic_receipt_24dp);
        A0D(menu, 6, R.string.f12nameremoved, R.drawable.ic_settings_media);
        A0D(menu, 7, R.string.f12nameremoved, R.drawable.ic_action_search);
        A0D(menu, 5, R.string.f12nameremoved, R.drawable.ic_settings_wallpaper);
        SubMenu addSubMenu = menu.addSubMenu(0, 1, 0, R.string.f12nameremoved);
        addSubMenu.clearHeader();
        A0G(addSubMenu);
        A0E(addSubMenu);
        A0F(addSubMenu);
    }

    public boolean Bbx(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 21) {
            AnonymousClass01L r3 = this.A05;
            C05290Pd.A00(r3, AnonymousClass190.A0p(r3, this.A00.A0H, true), AnonymousClass3CG.A00(r3, r3.findViewById(R.id.transition_start), this.A09));
        } else if (itemId != 22) {
            return super.Bbx(menuItem);
        } else {
            C19460v5 r1 = this.A01;
            if (r1.A05()) {
                r1.A02();
                this.A02.A02();
                throw AnonymousClass001.A0A("getLabelBroadcastList");
            }
        }
        return true;
    }

    public boolean BdM(Menu menu) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("listconversationmenu/onprepareoptionsmenu ");
        C36321k7.A1Y(A0u, menu.size());
        if (menu.size() == 0) {
            return false;
        }
        return super.BdM(menu);
    }
}
