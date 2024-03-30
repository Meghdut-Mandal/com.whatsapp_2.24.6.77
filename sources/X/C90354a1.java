package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4a1  reason: invalid class name and case insensitive filesystem */
public class C90354a1 implements View.OnCreateContextMenuListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C90354a1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        MenuItem menuItem;
        int i;
        MenuItem menuItem2;
        int i2;
        switch (this.A02) {
            case 0:
                C61013Af r4 = (C61013Af) this.A00;
                C62523Gm r1 = (C62523Gm) this.A01;
                List list = AnonymousClass0D3.A0I;
                int A04 = C36361kB.A04(r4, contextMenu, 0);
                UserJid userJid = r1.A03;
                int i3 = r1.A00;
                if (userJid != null && !r4.A02.A0M(userJid)) {
                    AnonymousClass141 A0D = r4.A06.A0D(userJid);
                    C65363Rt r12 = r4.A01;
                    AnonymousClass155 r0 = r4.A03;
                    r12.A01(contextMenu, r0, A0D);
                    C65363Rt.A00(contextMenu, r0, userJid);
                }
                if (r4.A00) {
                    if (i3 == 0) {
                        menuItem = contextMenu.add(R.string.f12nameremoved);
                        i = 4;
                        menuItem.setOnMenuItemClickListener(new AnonymousClass4YB((Object) r4, (Object) userJid, i));
                    } else if (i3 == 1) {
                        menuItem = contextMenu.add(R.string.f12nameremoved);
                        i = 5;
                        menuItem.setOnMenuItemClickListener(new AnonymousClass4YB((Object) r4, (Object) userJid, i));
                    } else if (i3 != A04) {
                        C36321k7.A1S("admin-context-menu/Unsupported community participant rank: ", AnonymousClass000.A0u(), i3);
                        if (i3 == A04) {
                            return;
                        }
                    } else if (r4.A02.A0M(userJid)) {
                        menuItem2 = contextMenu.add(R.string.f12nameremoved);
                        i2 = 6;
                        menuItem2.setOnMenuItemClickListener(new AnonymousClass4YB((Object) r4, (Object) userJid, i2));
                        return;
                    } else {
                        return;
                    }
                    if (!r4.A02.A0M(userJid)) {
                        String A0v = C36381kD.A0v(r4.A07, r4.A06.A0D(userJid));
                        AnonymousClass155 r5 = r4.A03;
                        menuItem2 = contextMenu.add(AnonymousClass3UG.A05(r5, r4.A08, C36411kG.A0w(r5.getResources(), A0v, AnonymousClass001.A0L(), 0, R.string.f12nameremoved)));
                        i2 = 3;
                        menuItem2.setOnMenuItemClickListener(new AnonymousClass4YB((Object) r4, (Object) userJid, i2));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C38811q8.setUpContextMenu$lambda$2$lambda$0((C38811q8) this.A00, (AnonymousClass2MU) this.A01, contextMenu, view, contextMenuInfo);
                return;
            case 2:
                C38021na r3 = (C38021na) this.A00;
                AnonymousClass378 r2 = (AnonymousClass378) this.A01;
                C62023Ek r13 = (C62023Ek) r3.A0F.getValue();
                if (r13 != null) {
                    C52382pL r02 = r3.A00;
                    AnonymousClass00C.A0B(contextMenu);
                    r13.A00(contextMenu, r02, r2);
                    return;
                }
                return;
            default:
                AnonymousClass141 r52 = (AnonymousClass141) this.A01;
                List list2 = AnonymousClass0D3.A0I;
                C62023Ek r32 = (C62023Ek) ((C40991wR) this.A00).A06.getValue();
                if (r32 != null) {
                    C52382pL r22 = C52382pL.OWNER;
                    AnonymousClass378 r03 = new AnonymousClass378(C52382pL.GUEST, r52, true);
                    AnonymousClass00C.A0B(contextMenu);
                    r32.A00(contextMenu, r22, r03);
                    return;
                }
                return;
        }
    }
}
