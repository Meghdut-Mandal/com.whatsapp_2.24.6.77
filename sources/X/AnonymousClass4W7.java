package X;

import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;

/* renamed from: X.4W7  reason: invalid class name */
public class AnonymousClass4W7 extends C70683fY {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4W7(X.AnonymousClass155 r12, X.AnonymousClass16D r13, X.AnonymousClass171 r14, X.AnonymousClass3PH r15, X.AnonymousClass4Q1 r16, X.AnonymousClass4Q2 r17, X.AnonymousClass3ID r18, X.C70803fk r19, X.C18820ts r20, X.AnonymousClass1H2 r21, X.C20810yC r22, java.lang.Integer r23) {
        /*
            r11 = this;
            r0 = 3
            r2 = r11
            r11.A01 = r0
            r0 = r19
            r11.A00 = r0
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r20
            X.C36321k7.A18(r12, r13, r14, r9)
            r6 = r15
            r8 = r18
            X.C36321k7.A10(r15, r8)
            r10 = r21
            r1 = r22
            X.C36361kB.A1K(r1, r10)
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r16
            r11.A00 = r0
            r0 = r23
            r11.A02 = r0
            r11.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4W7.<init>(X.155, X.16D, X.171, X.3PH, X.4Q1, X.4Q2, X.3ID, X.3fk, X.0ts, X.1H2, X.0yC, java.lang.Integer):void");
    }

    public Collection BHB() {
        C62473Gh r0;
        switch (this.A01) {
            case 2:
                r0 = ((AnonymousClass2IW) this.A00).A00.A04();
                break;
            case 3:
                C70803fk r1 = (C70803fk) this.A00;
                if (r1.A2l.getSelectedMessages() != null) {
                    r0 = r1.A2l.getSelectedMessages();
                    break;
                } else {
                    return null;
                }
            case 4:
                r0 = ((MediaGalleryActivity) this.A00).A0H;
                break;
            case 5:
                return ((MyStatusesActivity) this.A00).A0x.values();
            case 6:
                r0 = ((StorageUsageGalleryActivity) this.A00).A0D;
                break;
            default:
                AnonymousClass2IU r12 = (AnonymousClass2IU) this.A00;
                if (r12.A00.A04() != null) {
                    r0 = r12.A00.A04();
                    break;
                } else {
                    return null;
                }
        }
        if (r0 == null) {
            return null;
        }
        return r0.A01();
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r10) {
        if (3 - this.A01 == 0) {
            C70803fk r2 = (C70803fk) this.A00;
            if (r2.A2l.getSelectedMessages() == null || r2.A2l.getSelectedMessages().A03.size() == 0) {
                return true;
            }
            AnonymousClass3NY r5 = r2.A2V;
            int itemId = menuItem.getItemId();
            C45312Qw A002 = AnonymousClass3NY.A00(r2.A2l.getSelectedMessages(), r2.A45, 2);
            int i = 2;
            if (itemId != R.id.menuitem_overflow) {
                int i2 = 3;
                if (itemId != 8) {
                    i = 4;
                    if (itemId != 21) {
                        i = 5;
                        if (itemId != 1) {
                            if (itemId == 12) {
                                i = 6;
                            } else if (itemId == 2 || itemId == 3) {
                                i = 7;
                            } else {
                                i = 8;
                                if (itemId != 5) {
                                    i = 9;
                                    if (itemId != 15) {
                                        i2 = 11;
                                        if (itemId == 11) {
                                            i = 10;
                                        } else if (itemId != 4) {
                                            i = 1;
                                            if (itemId == 9) {
                                                i = 12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
            }
            A002.A04 = Integer.valueOf(i);
            r5.A00.Bly(A002);
        }
        return super.BQg(menuItem, r10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4W7(X.AnonymousClass16D r11, X.AnonymousClass171 r12, com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity r13, X.AnonymousClass2JQ r14, X.AnonymousClass3PH r15, X.C43672Jj r16, X.C18820ts r17, X.AnonymousClass1H2 r18) {
        /*
            r10 = this;
            r0 = 2
            r1 = r10
            r10.A01 = r0
            r2 = r13
            r10.A00 = r13
            r9 = r18
            X.AnonymousClass00C.A0B(r9)
            r3 = r11
            X.AnonymousClass00C.A0B(r11)
            r4 = r12
            X.AnonymousClass00C.A0B(r12)
            r8 = r17
            X.AnonymousClass00C.A0B(r8)
            r6 = r14
            r5 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4W7.<init>(X.16D, X.171, com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity, X.2JQ, X.3PH, X.2Jj, X.0ts, X.1H2):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4W7(AnonymousClass155 r1, AnonymousClass16D r2, AnonymousClass171 r3, AnonymousClass3PH r4, AnonymousClass4Q2 r5, AnonymousClass3ID r6, C18820ts r7, AnonymousClass1H2 r8, Object obj, int i) {
        super(r1, r2, r3, r4, r5, r6, r7, r8);
        this.A01 = i;
        this.A00 = obj;
    }
}
