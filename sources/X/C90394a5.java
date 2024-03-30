package X;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesChanged$1;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageReplaced$1;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.StatusReplyActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4a5  reason: invalid class name and case insensitive filesystem */
public class C90394a5 implements AnonymousClass191 {
    public Object A00;
    public final int A01;

    public static Object A01(C90394a5 r1, Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return r1.A00;
    }

    public C90394a5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C90394a5 A00(Object obj, int i) {
        return new C90394a5(obj, i);
    }

    public static void A02(C62103Eu r0, C40061uh r1) {
        r1.A0z.A0D(r0.A00());
    }

    public static final boolean A03(C90394a5 r6, AnonymousClass3T1 r7) {
        if (!(r7 instanceof AnonymousClass2bT)) {
            return false;
        }
        C39911uC r4 = (C39911uC) r6.A00;
        C220412q r1 = r4.A02;
        AnonymousClass11F r3 = r4.A04;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
        AnonymousClass147 r2 = (AnonymousClass147) r3;
        if (r1.A05(r2) != 1) {
            return AnonymousClass00C.A0J(r7.A1J.A00, r3);
        }
        Iterator it = r4.A00.A04(r2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AnonymousClass00C.A0J(r7.A1J.A00, ((AnonymousClass3QK) next).A02)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void A04(AnonymousClass3T1 r5) {
        if (r5 != null) {
            C64933Qa r3 = r5.A1J;
            String str = r3.A01;
            MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
            if (!str.equals(messageDetailsActivity.A0P.A1J.A01)) {
                return;
            }
            if (r3.A02 || (r5 instanceof AnonymousClass2bS)) {
                MessageDetailsActivity.A01(messageDetailsActivity);
                messageDetailsActivity.A0H.A1Y();
            }
        }
    }

    public boolean A06(AnonymousClass3T1 r5) {
        AnonymousClass147 A012;
        if (r5.A1I == 92 && (A012 = C65533Sl.A01(r5.A1J.A00)) != null) {
            C40051uf r2 = (C40051uf) this.A00;
            AnonymousClass147 A02 = r2.A0M.A02(A012);
            if (A02 != null) {
                return r2.A0h.equals(A02);
            }
        }
        return false;
    }

    public final boolean A07(AnonymousClass3T1 r3) {
        String str;
        C64933Qa r0;
        if (r3 instanceof AnonymousClass2bT) {
            String str2 = r3.A1J.A01;
            AnonymousClass2bT A012 = C40071us.A01((C40071us) this.A00);
            if (A012 == null || (r0 = A012.A1J) == null) {
                str = null;
            } else {
                str = r0.A01;
            }
            if (!AnonymousClass00C.A0J(str2, str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r35, int i) {
        C600336f r1;
        int i2;
        AnonymousClass3T1 r12 = r35;
        switch (this.A01) {
            case 17:
                C40061uh r0 = (C40061uh) this.A00;
                C62103Eu r5 = new C62103Eu();
                AnonymousClass386 r2 = new AnonymousClass386();
                C64933Qa r7 = r12.A1J;
                AnonymousClass11F r13 = r7.A00;
                AnonymousClass11F r8 = r0.A0t;
                if (C1901797e.A00(r13, r8) && r7.A02 && !C40061uh.A0E(r12)) {
                    C62113Ev r6 = r0.A0f;
                    if (r0.A1H && (r12 instanceof AnonymousClass2bI) && ((i2 = ((AnonymousClass2bI) r12).A00) == 1 || i2 == 27 || i2 == 4 || i2 == 5 || i2 == 7 || C66013Ui.A0I(i2) || i2 == 13 || i2 == 14 || i2 == 17 || i2 == 31 || i2 == 32 || i2 == 56)) {
                        r2.A02 = true;
                    }
                    synchronized (r0) {
                        r1 = r0.A0C;
                    }
                    if (r6.A00(r1, r8, r12)) {
                        List list = r0.A1E;
                        list.add(r12);
                        r5.A00 = C23931Ak.copyOf((Collection) list);
                        r5.A06 = true;
                        C40061uh.A0A(r0);
                    }
                    if (r0.A07 != 0 && C66013Ui.A0S(r6.A00, r12)) {
                        C40061uh.A09(r0);
                        C40061uh.A07(r0);
                    }
                    AnonymousClass3T1 r4 = r0.A0F;
                    if (!(r12.A0D == 6 || i == 7)) {
                        r2.A00 = C36391kE.A0r();
                        r2.A01 = true;
                        if (r4 != null) {
                            r2.A03 = true;
                        }
                        r0.A0a((AnonymousClass3T1) null);
                    }
                    r5.A06 = true;
                    r5.A02 = true;
                    Intent intent = r0.A0P;
                    boolean z = r0.A1I;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    AnonymousClass1DT r11 = r6.A01;
                    int i3 = r12.A0B;
                    long j = uptimeMillis - r12.A1S;
                    long j2 = uptimeMillis - r12.A1d;
                    Boolean bool = null;
                    int i4 = 0;
                    r11.A0Q(r12, (Collection) null, 1, 0, 0, 0, 0, 0, 0, i3, j, j2, j2, false, false, false, false, false);
                    if (!(r12 instanceof AnonymousClass2bI)) {
                        C61023Ag r42 = r6.A02;
                        String stringExtra = intent.getStringExtra("extra_deep_link_session_id");
                        int intExtra = intent.getIntExtra("args_conversation_screen_entry_point", 0);
                        if (intExtra != 0) {
                            r42.A03.A03(r7, intExtra);
                        }
                        if (!TextUtils.isEmpty(stringExtra)) {
                            C62203Fe r112 = r42.A05;
                            AnonymousClass2OL r72 = new AnonymousClass2OL();
                            r72.A00 = 1;
                            r72.A01 = stringExtra;
                            r112.A00.Bly(r72);
                        }
                        if (r42.A01.A05() && z) {
                            C222713q r3 = AnonymousClass11F.A00;
                            AnonymousClass144 A002 = AnonymousClass6H4.A00(r8);
                            if (A002 != null) {
                                C80283v9.A00(r42.A07, r42, A002, 43);
                            }
                        }
                        if (intExtra == 6) {
                            Integer num = null;
                            if (intent.hasExtra("args_chat_search_result_type")) {
                                num = Integer.valueOf(intent.getIntExtra("args_chat_search_result_type", 0));
                            }
                            if (intent.hasExtra("args_chat_search_type")) {
                                int intExtra2 = intent.getIntExtra("args_chat_search_type", 0);
                                if (!(Integer.valueOf(intExtra2) == null || num == null || (intExtra2 != 0 ? intExtra2 != 98 : num.intValue() != 5))) {
                                    Integer num2 = null;
                                    if (intent.hasExtra("args_chat_search_result_type")) {
                                        num2 = Integer.valueOf(intent.getIntExtra("args_chat_search_result_type", 0));
                                    }
                                    if (intent.hasExtra("args_chat_search_type")) {
                                        int intExtra3 = intent.getIntExtra("args_chat_search_type", 0);
                                        if (!(Integer.valueOf(intExtra3) == null || num2 == null || !AnonymousClass6TR.A01(r42.A06))) {
                                            if (intExtra3 == 98) {
                                                i4 = 1;
                                            }
                                            C142626pB r43 = (C142626pB) r42.A08.get();
                                            int intValue = num2.intValue();
                                            if (AnonymousClass6TR.A01(r43.A01)) {
                                                AnonymousClass2RY r32 = new AnonymousClass2RY();
                                                r32.A00 = C36371kC.A0n();
                                                r32.A01 = Integer.valueOf(i4);
                                                r32.A02 = C142626pB.A00(Integer.valueOf(intValue));
                                                C142626pB.A01(r43, r32);
                                                r43.A02.Bly(r32);
                                            }
                                            r43.A03((Boolean) null, C142626pB.A00(Integer.valueOf(intValue)), (String) null, (String) null, (String) null, (String) null, 2, i4);
                                        }
                                    }
                                }
                            }
                        } else if (intExtra == 7) {
                            C194529Qc r73 = r42.A02;
                            Boolean bool2 = null;
                            if (intent.hasExtra("isPhoneNumberOwner")) {
                                bool = Boolean.valueOf(intent.getBooleanExtra("isPhoneNumberOwner", false));
                            }
                            if (intent.hasExtra("isWAAccount")) {
                                bool2 = Boolean.valueOf(intent.getBooleanExtra("isWAAccount", false));
                            }
                            r73.A00(bool, bool2, 9);
                        }
                    }
                }
                r0.A0y.A0D(new AnonymousClass387(r2.A00, r2.A02, r2.A01, r2.A03));
                A02(r5, r0);
                return;
            case 31:
                StatusReplyActivity statusReplyActivity = (StatusReplyActivity) A01(this, r12);
                HashMap hashMap = MessageReplyActivity.A1g;
                boolean z2 = !AnonymousClass000.A1Z(statusReplyActivity.A05, r12.A1I);
                C64933Qa r22 = r12.A1J;
                if (AnonymousClass00C.A0J(r22.A00, statusReplyActivity.A0k) && r22.A02 && z2) {
                    C27131Na r14 = statusReplyActivity.A00;
                    if (r14 != null) {
                        r14.A03(r22, 4);
                        return;
                    }
                    throw C36331k8.A0d("messageThreadAnalyticsTracker");
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BZj(AnonymousClass11F r4) {
        switch (this.A01) {
            case 14:
                C39961uN r1 = (C39961uN) this.A00;
                if (AnonymousClass00C.A0J(r1.A06, r4)) {
                    C39961uN.A01(r1);
                    return;
                }
                return;
            case 17:
                C40061uh r2 = (C40061uh) this.A00;
                if (r4 != null && r4.equals(r2.A0t)) {
                    r2.A0L = true;
                    C62103Eu r0 = new C62103Eu();
                    r0.A05 = true;
                    A02(r0, r2);
                    r2.A0U();
                    return;
                }
                return;
            case 29:
                if (r4 instanceof C177528dw) {
                    ((StatusesFragment) this.A00).A1a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ea, code lost:
        if (r6.A07 != 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02fb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02fc, code lost:
        com.whatsapp.util.Log.i("messagesViewModel/addreceived/staledata ", r1);
        r0 = r6.A1E;
        r0.add(r7);
        r5.A00 = X.C23931Ak.copyOf((java.util.Collection) r0);
        r5.A06 = true;
        X.C40061uh.A0A(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x034c, code lost:
        if (r1 == false) goto L_0x034e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bas(X.AnonymousClass3T1 r23, int r24) {
        /*
            r22 = this;
            r7 = r23
            r5 = r22
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x003e;
                case 2: goto L_0x006a;
                case 3: goto L_0x0093;
                case 4: goto L_0x00c3;
                case 7: goto L_0x00d7;
                case 8: goto L_0x00ef;
                case 9: goto L_0x0101;
                case 17: goto L_0x0156;
                case 18: goto L_0x0410;
                case 29: goto L_0x042c;
                case 30: goto L_0x045f;
                case 37: goto L_0x0473;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r3 = A01(r5, r7)
            X.3O5 r3 = (X.AnonymousClass3O5) r3
            X.00r r1 = r3.A02
            java.lang.Number r0 = X.C36441kJ.A0z(r1)
            if (r0 == 0) goto L_0x0009
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0009
            X.3Qa r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0009
            r0 = 8
            X.C36341k9.A17(r1, r0)
            X.11F r0 = r3.A00
            if (r0 == 0) goto L_0x0009
            X.3Cj r1 = r3.A05
            r0 = 6
            r1.A00(r0)
            X.11F r2 = r3.A00
            if (r2 == 0) goto L_0x0009
            X.0wU r1 = r3.A07
            r0 = 2
            X.C36391kE.A1R(r1, r3, r2, r0)
            return
        L_0x003e:
            X.3Qa r3 = X.AnonymousClass3T1.A06(r7)
            X.11F r2 = r3.A00
            java.lang.Object r1 = r5.A00
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r1 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r1
            com.whatsapp.jid.UserJid r0 = r1.A00
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x005e
            X.1hi r1 = r1.A05
            java.lang.Integer r0 = X.C36371kC.A0n()
            r1.A0E(r0)
            return
        L_0x005e:
            boolean r0 = r7 instanceof X.AnonymousClass2bD
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 != 0) goto L_0x0009
            r5.A05(r7)
            return
        L_0x006a:
            X.3Qa r3 = X.AnonymousClass3T1.A06(r7)
            X.11F r2 = r3.A00
            java.lang.Object r1 = r5.A00
            X.1uI r1 = (X.C39931uI) r1
            X.11F r0 = r1.A00
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.AnonymousClass2bD
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 != 0) goto L_0x0009
            r0 = 1
            r1.A03 = r0
            X.C39931uI.A01(r1)
            return
        L_0x0093:
            X.3Qa r1 = X.AnonymousClass3T1.A06(r7)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            X.11F r2 = r1.A00
            java.lang.Object r1 = r5.A00
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r1 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) r1
            X.11F r0 = r1.A00
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0009
            X.1hi r1 = r1.A05
            java.util.List r0 = X.C36401kF.A0w(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.AnonymousClass2bD
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 != 0) goto L_0x0009
            X.09w r0 = X.C023409w.A00
            r1.A0D(r0)
            return
        L_0x00c3:
            X.11F r2 = X.C64933Qa.A00(r7)
            java.lang.Object r1 = r5.A00
            X.1uG r1 = (X.C39921uG) r1
            X.11F r0 = r1.A0C
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0009
            X.C39921uG.A01(r1, r7)
            return
        L_0x00d7:
            java.lang.Object r1 = A01(r5, r7)
            X.3Sj r1 = (X.C65513Sj) r1
            boolean r0 = X.C65513Sj.A00(r1, r7)
            if (r0 == 0) goto L_0x0009
            X.040 r4 = r1.A07
            X.02l r3 = r1.A06
            r0 = 0
            com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1 r2 = new com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1
            r2.<init>(r1, r7, r0)
            goto L_0x0428
        L_0x00ef:
            boolean r0 = r5.A06(r7)
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r5.A00
            X.1uf r2 = (X.C40051uf) r2
            X.0wU r1 = r2.A0y
            r0 = 45
            X.C81323wp.A01(r1, r2, r0)
            return
        L_0x0101:
            boolean r0 = r7 instanceof X.C181728nw
            if (r0 == 0) goto L_0x0120
            r1 = r7
            X.8ny r1 = (X.C181748ny) r1
            r0 = 1
            com.whatsapp.jid.GroupJid r3 = r1.A1b(r0)
        L_0x010d:
            if (r3 == 0) goto L_0x012a
            java.lang.Object r0 = r5.A00
            X.1ub r0 = (X.C40021ub) r0
            X.0wk r2 = r0.A0M
            r0 = 11
            X.3v7 r1 = new X.3v7
            r1.<init>(r5, r3, r0)
        L_0x011c:
            r2.execute(r1)
            return
        L_0x0120:
            boolean r0 = r7 instanceof X.C181408nQ
            if (r0 == 0) goto L_0x012a
            r0 = r7
            X.8nQ r0 = (X.C181408nQ) r0
            com.whatsapp.jid.GroupJid r3 = r0.A01
            goto L_0x010d
        L_0x012a:
            boolean r0 = r7 instanceof X.AnonymousClass2cS
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r5.A00
            X.1ub r0 = (X.C40021ub) r0
            X.0wk r2 = r0.A0M
            r0 = 6
        L_0x0135:
            X.3wS r1 = new X.3wS
            r1.<init>((java.lang.Object) r5, (int) r0)
            goto L_0x011c
        L_0x013b:
            boolean r0 = r7 instanceof X.C181608nk
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r5.A00
            X.1ub r0 = (X.C40021ub) r0
            X.0wk r2 = r0.A0M
            r0 = 7
            goto L_0x0135
        L_0x0147:
            boolean r0 = X.C66013Ui.A0o(r7)
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r5.A00
            X.1ub r0 = (X.C40021ub) r0
            X.0wk r2 = r0.A0M
            r0 = 8
            goto L_0x0135
        L_0x0156:
            java.lang.Object r6 = r5.A00
            X.1uh r6 = (X.C40061uh) r6
            boolean r0 = X.C40061uh.A0E(r7)
            if (r0 != 0) goto L_0x0009
            X.3Qa r2 = r7.A1J
            X.11F r10 = r2.A00
            X.11F r13 = r6.A0t
            boolean r0 = X.C1901797e.A00(r10, r13)
            if (r0 == 0) goto L_0x0009
            X.3Eu r5 = new X.3Eu
            r5.<init>()
            X.3At r4 = new X.3At
            r4.<init>(r7)
            X.3Ev r9 = r6.A0f
            boolean r0 = X.C66013Ui.A0j(r7)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0188
            r0 = 1
            r4.A06 = r0     // Catch:{ Exception -> 0x0182 }
            goto L_0x0188
        L_0x0182:
            r1 = move-exception
            java.lang.String r0 = "messageObserverHelper/onMessageAddedHandleEphemeralMessageNux/consumed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0188:
            boolean r8 = r2.A02
            if (r8 == 0) goto L_0x01b1
            boolean r0 = r7.A1J()
            if (r0 != 0) goto L_0x01b1
            X.0wQ r0 = r6.A0a
            boolean r0 = X.C66013Ui.A0S(r0, r7)
            if (r0 != 0) goto L_0x027b
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x027b
            X.0yC r1 = r6.A0s
            r0 = 4546(0x11c2, float:6.37E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x01b1
            r0 = r7
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x027b
        L_0x01b1:
            long r0 = r7.A1N
            r11 = 1
            r14 = -1
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r2)
            java.lang.String r0 = "row id must be present"
            X.C18740tg.A0D(r1, r0)
            int r1 = X.C40061uh.A01(r6)     // Catch:{ StaleDataException -> 0x02fb }
            X.3T1 r0 = r6.A0S()     // Catch:{ StaleDataException -> 0x02fb }
            if (r1 <= 0) goto L_0x01ce
            if (r0 == 0) goto L_0x01ce
            goto L_0x0239
        L_0x01ce:
            monitor-enter(r6)     // Catch:{ StaleDataException -> 0x02fb }
            X.36f r0 = r6.A0C     // Catch:{ all -> 0x0278 }
            monitor-exit(r6)     // Catch:{ StaleDataException -> 0x02fb }
            boolean r0 = r9.A00(r0, r13, r7)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x0251
            X.1Ef r2 = r6.A0i     // Catch:{ StaleDataException -> 0x02fb }
            boolean r0 = r2.A00(r7)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x021d
            java.lang.Integer r0 = r7.A0e     // Catch:{ StaleDataException -> 0x02fb }
            boolean r0 = X.AnonymousClass000.A1V(r0)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 != 0) goto L_0x021d
            int r0 = r6.A07     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x01fe
        L_0x01ec:
            int r0 = r6.A07     // Catch:{ StaleDataException -> 0x02fb }
            int r0 = r0 + 1
            r6.A07 = r0     // Catch:{ StaleDataException -> 0x02fb }
            int r1 = r7.A1I     // Catch:{ StaleDataException -> 0x02fb }
            r0 = 10
            if (r1 != r0) goto L_0x0212
            int r0 = r6.A06     // Catch:{ StaleDataException -> 0x02fb }
            int r0 = r0 + 1
            r6.A06 = r0     // Catch:{ StaleDataException -> 0x02fb }
        L_0x01fe:
            X.C40061uh.A07(r6)     // Catch:{ StaleDataException -> 0x02fb }
            java.util.List r0 = r6.A1E     // Catch:{ StaleDataException -> 0x02fb }
            r0.add(r7)     // Catch:{ StaleDataException -> 0x02fb }
            X.1Ak r0 = X.C23931Ak.copyOf((java.util.Collection) r0)     // Catch:{ StaleDataException -> 0x02fb }
            r5.A00 = r0     // Catch:{ StaleDataException -> 0x02fb }
            r5.A06 = r11     // Catch:{ StaleDataException -> 0x02fb }
            X.C40061uh.A0A(r6)     // Catch:{ StaleDataException -> 0x02fb }
            goto L_0x0251
        L_0x0212:
            boolean r0 = r7 instanceof X.AnonymousClass2bI     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 != 0) goto L_0x01fe
            int r0 = r6.A05     // Catch:{ StaleDataException -> 0x02fb }
            int r0 = r0 + 1
            r6.A05 = r0     // Catch:{ StaleDataException -> 0x02fb }
            goto L_0x01fe
        L_0x021d:
            monitor-enter(r6)     // Catch:{ StaleDataException -> 0x02fb }
            X.3T1 r1 = r6.A0E     // Catch:{ all -> 0x0278 }
            monitor-exit(r6)     // Catch:{ StaleDataException -> 0x02fb }
            int r0 = r6.A07     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x01ec
            if (r1 == 0) goto L_0x01ec
            X.0wQ r0 = r6.A0a     // Catch:{ StaleDataException -> 0x02fb }
            boolean r0 = X.C66013Ui.A0S(r0, r1)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 != 0) goto L_0x0235
            boolean r0 = r2.A00(r1)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x01ec
        L_0x0235:
            X.C40061uh.A09(r6)     // Catch:{ StaleDataException -> 0x02fb }
            goto L_0x01ec
        L_0x0239:
            long r2 = r0.A1O     // Catch:{ StaleDataException -> 0x02fb }
            long r0 = r7.A1O     // Catch:{ StaleDataException -> 0x02fb }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x01ce
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ StaleDataException -> 0x02fb }
            java.lang.String r0 = "messagesViewModel/addreceived/skip/"
            r1.append(r0)     // Catch:{ StaleDataException -> 0x02fb }
            java.lang.String r0 = X.C66013Ui.A0F(r7)     // Catch:{ StaleDataException -> 0x02fb }
            X.C36321k7.A1a(r1, r0)     // Catch:{ StaleDataException -> 0x02fb }
        L_0x0251:
            X.11F r0 = r7.A0J()     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x025f
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x025f
            r4.A01 = r0     // Catch:{ StaleDataException -> 0x02fb }
        L_0x025f:
            boolean r0 = r7.A1J()     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 == 0) goto L_0x0311
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r7.A0A     // Catch:{ StaleDataException -> 0x02fb }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ StaleDataException -> 0x02fb }
            if (r0 != 0) goto L_0x0311
            r6.A0L = r11     // Catch:{ StaleDataException -> 0x02fb }
            r0 = 0
            r6.A0b(r0)     // Catch:{ StaleDataException -> 0x02fb }
            goto L_0x0311
        L_0x0278:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ StaleDataException -> 0x02fb }
            throw r0     // Catch:{ StaleDataException -> 0x02fb }
        L_0x027b:
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x028d
            r0 = r7
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r1 = r0.A00
            r0 = 28
            if (r1 != r0) goto L_0x028d
            r0 = 1
            r4.A08 = r0
            goto L_0x0316
        L_0x028d:
            int r13 = X.C40061uh.A01(r6)
            X.3T1 r12 = r6.A0S()
            java.util.List r11 = r6.A1E
            java.lang.String r15 = "messagesViewModel/addsent/skipped/"
            if (r13 != 0) goto L_0x029c
            goto L_0x02d7
        L_0x029c:
            if (r12 == 0) goto L_0x0316
            long r2 = r12.A1O     // Catch:{ StaleDataException -> 0x02f4 }
            long r0 = r7.A1O     // Catch:{ StaleDataException -> 0x02f4 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x0316
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r15)     // Catch:{ StaleDataException -> 0x02f4 }
            java.lang.String r0 = X.C66013Ui.A0F(r7)     // Catch:{ StaleDataException -> 0x02f4 }
            r2.append(r0)     // Catch:{ StaleDataException -> 0x02f4 }
            java.lang.String r0 = " adapter-count:"
            r2.append(r0)     // Catch:{ StaleDataException -> 0x02f4 }
            r2.append(r13)     // Catch:{ StaleDataException -> 0x02f4 }
            java.lang.String r0 = " las-row-id:"
            r2.append(r0)     // Catch:{ StaleDataException -> 0x02f4 }
            long r0 = r12.A1N     // Catch:{ StaleDataException -> 0x02f4 }
            r2.append(r0)     // Catch:{ StaleDataException -> 0x02f4 }
            java.lang.String r0 = " cur-row-id:"
            r2.append(r0)     // Catch:{ StaleDataException -> 0x02f4 }
            long r0 = r7.A1N     // Catch:{ StaleDataException -> 0x02f4 }
            X.C36351kA.A1S(r2, r0)     // Catch:{ StaleDataException -> 0x02f4 }
            r11.add(r7)     // Catch:{ StaleDataException -> 0x02f4 }
            X.1Ak r0 = X.C23931Ak.copyOf((java.util.Collection) r11)     // Catch:{ StaleDataException -> 0x02f4 }
            r5.A00 = r0     // Catch:{ StaleDataException -> 0x02f4 }
            goto L_0x02f0
        L_0x02d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r15)     // Catch:{ StaleDataException -> 0x02f4 }
            java.lang.String r0 = X.C66013Ui.A0F(r7)     // Catch:{ StaleDataException -> 0x02f4 }
            r1.append(r0)     // Catch:{ StaleDataException -> 0x02f4 }
            java.lang.String r0 = " adapter-count:0"
            X.C36321k7.A1a(r1, r0)     // Catch:{ StaleDataException -> 0x02f4 }
            r11.add(r7)     // Catch:{ StaleDataException -> 0x02f4 }
            X.1Ak r0 = X.C23931Ak.copyOf((java.util.Collection) r11)     // Catch:{ StaleDataException -> 0x02f4 }
            r5.A00 = r0     // Catch:{ StaleDataException -> 0x02f4 }
        L_0x02f0:
            r0 = 1
            r5.A06 = r0     // Catch:{ StaleDataException -> 0x02f4 }
            goto L_0x0316
        L_0x02f4:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addsent/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0316
        L_0x02fb:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addreceived/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            java.util.List r0 = r6.A1E
            r0.add(r7)
            X.1Ak r0 = X.C23931Ak.copyOf((java.util.Collection) r0)
            r5.A00 = r0
            r5.A06 = r11
            X.C40061uh.A0A(r6)
        L_0x0311:
            X.0wU r0 = r6.A19
            X.C81193wc.A01(r0, r6, r7, r11)
        L_0x0316:
            r2 = 1
            r5.A06 = r2
            int r0 = r6.A03
            if (r0 != 0) goto L_0x03d2
            boolean r0 = X.C66013Ui.A0n(r7)
            if (r0 != 0) goto L_0x03d2
            boolean r0 = r7.A1J()
            if (r0 != 0) goto L_0x03d2
            X.0wQ r1 = r6.A0a
            boolean r0 = X.C66013Ui.A0S(r1, r7)
            if (r0 != 0) goto L_0x03d2
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            r4.A00 = r0
            boolean r0 = X.C66013Ui.A0O(r1, r7)
            if (r0 == 0) goto L_0x0347
            java.util.ArrayList r0 = r6.A1D
            r0.add(r7)
            X.C40061uh.A08(r6)
        L_0x0347:
            boolean r1 = r6.A0J
            if (r8 != 0) goto L_0x034e
            r0 = 1
            if (r1 != 0) goto L_0x034f
        L_0x034e:
            r0 = 0
        L_0x034f:
            r4.A05 = r0
            X.0wQ r0 = r6.A0a
            boolean r0 = X.C66013Ui.A0Q(r0, r7)
            if (r0 == 0) goto L_0x035b
            r4.A07 = r2
        L_0x035b:
            boolean r0 = r6.A1H
            if (r0 == 0) goto L_0x037a
            X.1EV r1 = r9.A03
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x037a
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x037a
            X.2bI r7 = (X.AnonymousClass2bI) r7
            int r1 = r7.A00
            r0 = 32
            if (r1 == r0) goto L_0x0378
            r0 = 31
            if (r1 != r0) goto L_0x037a
        L_0x0378:
            r4.A02 = r2
        L_0x037a:
            X.1Rs r9 = r6.A11
            X.3T1 r13 = r4.A09
            boolean r15 = r4.A06
            boolean r7 = r4.A08
            boolean r3 = r4.A03
            boolean r2 = r4.A05
            boolean r1 = r4.A07
            boolean r0 = r4.A02
            int r14 = r4.A00
            com.whatsapp.jid.UserJid r12 = r4.A01
            boolean r4 = r4.A04
            X.3H4 r11 = new X.3H4
            r17 = r3
            r18 = r2
            r19 = r1
            r20 = r0
            r21 = r4
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r9.A0D(r11)
            A02(r5, r6)
            X.0v5 r1 = r6.A0Z
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x03b9
            X.1K3 r0 = X.C36441kJ.A0f(r1)
            boolean r0 = r0.BLB(r10)
            if (r0 != 0) goto L_0x03c1
        L_0x03b9:
            X.141 r0 = r6.A0p
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x03c9
        L_0x03c1:
            if (r8 != 0) goto L_0x03c9
            X.1Rs r1 = r6.A16
            r0 = 0
            X.C36341k9.A18(r1, r0)
        L_0x03c9:
            X.C40061uh.A0A(r6)
            if (r8 == 0) goto L_0x0009
            X.C40061uh.A06(r6)
            return
        L_0x03d2:
            int r0 = r6.A03
            if (r0 != 0) goto L_0x03f7
            X.0wQ r0 = r6.A0a
            boolean r0 = X.C66013Ui.A0S(r0, r7)
            if (r0 == 0) goto L_0x03f7
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x03f7
            X.0yC r1 = r6.A0s
            r0 = 4547(0x11c3, float:6.372E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0347
            r0 = r7
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x03f7
            goto L_0x0347
        L_0x03f7:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r6.A0e
            X.00s r0 = r0.A01
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x040a
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x040a
            goto L_0x0347
        L_0x040a:
            r4.A03 = r2
            r4.A04 = r2
            goto L_0x0347
        L_0x0410:
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x0009
            java.lang.Object r1 = r5.A00
            X.1uC r1 = (X.C39911uC) r1
            X.040 r4 = X.C109325Xd.A00(r1)
            X.02l r3 = r1.A05
            r0 = 0
            com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageAdded$1 r2 = new com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageAdded$1
            r2.<init>(r5, r1, r7, r0)
        L_0x0428:
            X.C36381kD.A1R(r3, r2, r4)
            return
        L_0x042c:
            X.3Qa r1 = r7.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            r2.A1a()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x049d
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0455
            android.content.Context r0 = r2.A1D()
            if (r0 == 0) goto L_0x0455
            X.0v0 r0 = r2.A0Y
            r0.A11()
            android.view.View r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x0455:
            X.1hp r1 = r2.A13
            android.content.Context r0 = r2.A0a()
            r1.A05(r0, r7)
            return
        L_0x045f:
            X.3Qa r1 = r7.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r5.A00
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A0v(r0)
            return
        L_0x0473:
            X.3Qa r4 = X.AnonymousClass3T1.A06(r7)
            X.11F r3 = r4.A00
            boolean r0 = r3 instanceof X.C28981Uw
            r2 = 0
            if (r0 == 0) goto L_0x0481
            r2 = r3
            X.1Uw r2 = (X.C28981Uw) r2
        L_0x0481:
            java.lang.Object r1 = r5.A00
            X.3OA r1 = (X.AnonymousClass3OA) r1
            boolean r0 = r3 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0493
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0493
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r1.A08
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A04(r0)
            return
        L_0x0493:
            if (r2 == 0) goto L_0x0009
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r1.A08
            X.2oP r0 = X.C51802oP.ADDED
            r1.A0U(r2, r7, r0)
            return
        L_0x049d:
            java.util.Set r1 = r2.A1U
            com.whatsapp.jid.UserJid r0 = r7.A0L()
            r1.remove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90394a5.Bas(X.3T1, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b7, code lost:
        X.C36381kD.A1R(r3, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0261, code lost:
        if ((r11 instanceof X.AnonymousClass2bO) == false) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0263, code lost:
        r3.getListView().post(new X.C80283v9(r3, r11, 20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0271, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0291, code lost:
        r3.A3l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0294, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04b6, code lost:
        if (r1.A00.isEmpty() != false) goto L_0x04bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Bau(X.AnonymousClass3T1 r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 5: goto L_0x0006;
                case 6: goto L_0x0038;
                case 7: goto L_0x0057;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0075;
                case 11: goto L_0x0272;
                case 12: goto L_0x04c8;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c3;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x00df;
                case 18: goto L_0x019f;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x01bb;
                case 23: goto L_0x01e6;
                case 24: goto L_0x0005;
                case 25: goto L_0x01f7;
                case 26: goto L_0x024d;
                case 27: goto L_0x0295;
                case 28: goto L_0x02b7;
                case 29: goto L_0x02e0;
                case 30: goto L_0x0344;
                case 31: goto L_0x0005;
                case 32: goto L_0x0368;
                case 33: goto L_0x03da;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x03ff;
                case 37: goto L_0x0468;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            if (r11 == 0) goto L_0x002d
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.141 r0 = r1.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = X.C64933Qa.A05(r11, r0)
            if (r0 == 0) goto L_0x002d
            int r0 = r11.A1I
            boolean r0 = X.C66013Ui.A0J(r0)
            if (r0 == 0) goto L_0x002d
            r0 = 3
            if (r12 == r0) goto L_0x0027
            r0 = 9
            if (r12 != r0) goto L_0x002d
        L_0x0027:
            X.2EI r0 = r1.A0h
        L_0x0029:
            r0.A0U()
            return
        L_0x002d:
            r0 = 30
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            X.2EI r0 = r0.A0h
            goto L_0x0029
        L_0x0038:
            if (r11 == 0) goto L_0x0005
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.8dx r0 = r1.A3t()
            boolean r0 = X.C64933Qa.A05(r11, r0)
            if (r0 == 0) goto L_0x0005
            int r0 = r11.A1I
            boolean r0 = X.C66013Ui.A0J(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            com.whatsapp.chatinfo.ListChatInfoActivity.A10(r1)
            return
        L_0x0057:
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            r0 = 24
            if (r12 != r0) goto L_0x0005
            java.lang.Object r1 = r10.A00
            X.3Sj r1 = (X.C65513Sj) r1
            boolean r0 = X.C65513Sj.A00(r1, r11)
            if (r0 == 0) goto L_0x0005
            X.040 r4 = r1.A07
            X.02l r3 = r1.A06
            r0 = 0
            com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageChanged$1 r2 = new com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageChanged$1
            r2.<init>(r1, r11, r0)
            goto L_0x01b7
        L_0x0075:
            java.lang.Object r4 = r10.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r4 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r4
            X.1nW r0 = r4.A0B
            X.3Qa r3 = r11.A1J
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r1 = r0.iterator()
        L_0x0085:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            X.3T1 r0 = X.C36391kE.A0l(r1)
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            android.widget.ListView r0 = r4.getListView()
            android.view.View r2 = r0.findViewWithTag(r3)
            if (r2 == 0) goto L_0x0513
            X.2IR r2 = (X.AnonymousClass2IR) r2
            boolean r0 = r2.A2C(r3)
            if (r0 == 0) goto L_0x050d
            r0 = 8
            if (r12 != r0) goto L_0x04cc
            X.3T1 r0 = r2.getFMessage()
            if (r0 != r11) goto L_0x04ff
            r2.A1d()
            return
        L_0x00b7:
            if (r11 == 0) goto L_0x0005
            boolean r0 = r11.A15
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r10.A00
            X.22g r3 = (X.AnonymousClass22g) r3
            goto L_0x0263
        L_0x00c3:
            java.lang.Object r2 = A01(r10, r11)
            X.1uN r2 = (X.C39961uN) r2
            X.147 r1 = r2.A06
            X.3Qa r0 = r11.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = X.C39961uN.A02(r2, r11)
            if (r0 == 0) goto L_0x0005
            X.C39961uN.A01(r2)
            return
        L_0x00df:
            java.lang.Object r3 = r10.A00
            X.1uh r3 = (X.C40061uh) r3
            X.3Qa r6 = r11.A1J
            X.11F r1 = r6.A00
            X.11F r0 = r3.A0t
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x0005
            int r1 = r11.A1I
            r0 = 8
            if (r1 == r0) goto L_0x0005
            X.1Rs r5 = r3.A12
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A00
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0188
            java.lang.Object r4 = r5.A04()
        L_0x0105:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0166
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
        L_0x010d:
            r6 = 24
            boolean r1 = X.AnonymousClass000.A1S(r12, r6)
            X.3GI r0 = new X.3GI
            r0.<init>(r11, r12, r1)
            r4.add(r0)
            r5.A0D(r4)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r9 = r4.iterator()
        L_0x0126:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r2 = r9.next()
            X.3GI r2 = (X.AnonymousClass3GI) r2
            int r1 = r2.A00
            r0 = 34
            if (r1 != r0) goto L_0x0126
            X.3T1 r8 = r2.A01
            X.3Qa r7 = r8.A1J
            X.5J2 r0 = r8.A1V
            if (r0 != 0) goto L_0x0163
            r4 = 0
        L_0x0141:
            r2 = 1
            java.util.Map r1 = r3.A1F
            boolean r0 = r1.containsKey(r7)
            if (r4 != r2) goto L_0x015b
            if (r0 != 0) goto L_0x0126
            r1.put(r7, r8)
            X.2oX r2 = X.C51882oX.ADDED
        L_0x0151:
            r1 = 0
            X.3JJ r0 = new X.3JJ
            r0.<init>(r2, r8, r1)
            r5.add(r0)
            goto L_0x0126
        L_0x015b:
            if (r0 == 0) goto L_0x0126
            r1.remove(r7)
            X.2oX r2 = X.C51882oX.DELETED
            goto L_0x0151
        L_0x0163:
            int r4 = r0.A00
            goto L_0x0141
        L_0x0166:
            java.util.Iterator r2 = r4.iterator()
        L_0x016a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r1 = r2.next()
            X.3GI r1 = (X.AnonymousClass3GI) r1
            X.3T1 r0 = r1.A01
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x016a
            int r0 = r1.A00
            if (r0 != r12) goto L_0x016a
            r2.remove()
            goto L_0x016a
        L_0x0188:
            r4 = 0
            goto L_0x0105
        L_0x018b:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0199
            r5.size()
            X.1Rs r0 = r3.A13
            r0.A0D(r5)
        L_0x0199:
            if (r12 != r6) goto L_0x0005
            X.C40061uh.A0D(r3, r11)
            return
        L_0x019f:
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            boolean r0 = r11 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r10.A00
            X.1uC r1 = (X.C39911uC) r1
            X.040 r4 = X.C109325Xd.A00(r1)
            X.02l r3 = r1.A05
            r0 = 0
            com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageChanged$1 r2 = new com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageChanged$1
            r2.<init>(r10, r1, r11, r0)
        L_0x01b7:
            X.C36381kD.A1R(r3, r2, r4)
            return
        L_0x01bb:
            java.lang.Object r1 = A01(r10, r11)
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r1 = (com.whatsapp.mediaview.MediaViewCurrentMessageViewModel) r1
            X.00s r0 = r1.A00
            java.lang.Object r0 = r0.A04()
            X.3IY r0 = (X.AnonymousClass3IY) r0
            if (r0 == 0) goto L_0x01e4
            X.2bU r0 = r0.A01
        L_0x01cd:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 27
            if (r12 == r0) goto L_0x0519
            r0 = 28
            if (r12 == r0) goto L_0x0519
            r0 = 39
            if (r12 == r0) goto L_0x0519
            r0 = 40
            if (r12 == r0) goto L_0x0519
            return
        L_0x01e4:
            r0 = 0
            goto L_0x01cd
        L_0x01e6:
            boolean r0 = r11 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.mediaview.MediaViewFragment r0 = (com.whatsapp.mediaview.MediaViewFragment) r0
            X.2bU r11 = (X.AnonymousClass2bU) r11
            com.whatsapp.mediaview.MediaViewFragment.A0O(r0, r11)
            return
        L_0x01f7:
            java.lang.Object r2 = r10.A00
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            com.whatsapp.notification.PopupNotificationViewPager r0 = r2.A10
            X.3Qa r4 = r11.A1J
            android.view.View r1 = r0.findViewWithTag(r4)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0223
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 0
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0223
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x0223
            X.2IR r1 = (X.AnonymousClass2IR) r1
            if (r1 == 0) goto L_0x0223
            r1.A1Y()
        L_0x0223:
            int r1 = r11.A1I
            r0 = 20
            if (r1 != r0) goto L_0x0005
            java.util.List r0 = r2.A1J
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            com.whatsapp.notification.PopupNotificationViewPager r0 = r2.A10
            android.view.View r1 = r0.findViewWithTag(r4)
            if (r1 == 0) goto L_0x0005
            r0 = 2131432844(0x7f0b158c, float:1.8487457E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x0005
            X.2bx r11 = (X.C46962bx) r11
            com.whatsapp.notification.PopupNotification.A0M(r2, r11, r0)
            return
        L_0x024d:
            java.lang.Object r3 = A01(r10, r11)
            X.2JG r3 = (X.AnonymousClass2JG) r3
            X.11F r1 = r3.A0F
            X.3Qa r0 = r11.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0291
            boolean r0 = r11 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x0291
        L_0x0263:
            android.widget.ListView r2 = r3.getListView()
            r1 = 20
            X.3v9 r0 = new X.3v9
            r0.<init>(r3, r11, r1)
            r2.post(r0)
            return
        L_0x0272:
            if (r11 == 0) goto L_0x0005
            r0 = 30
            if (r12 == r0) goto L_0x027f
            int r1 = r11.A0E()
            r0 = 1
            if (r1 != r0) goto L_0x0005
        L_0x027f:
            java.lang.Object r3 = r10.A00
            X.2JG r3 = (X.AnonymousClass2JG) r3
            android.widget.ListView r2 = r3.getListView()
            r1 = 20
            X.3v9 r0 = new X.3v9
            r0.<init>(r3, r11, r1)
            r2.post(r0)
        L_0x0291:
            r3.A3l()
            return
        L_0x0295:
            r0 = 8
            if (r12 == r0) goto L_0x0005
            X.3Qa r0 = r11.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177548dy
            if (r0 == 0) goto L_0x0005
            r0 = 3
            java.lang.Object r1 = r10.A00
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            if (r12 != r0) goto L_0x051d
            X.17Y r3 = r1.A05
            r0 = 35
            X.3wY r2 = new X.3wY
            r2.<init>((java.lang.Object) r10, (int) r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0I(r2, r0)
            return
        L_0x02b7:
            java.lang.Object r3 = r10.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r3 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r3
            X.1YR r0 = r3.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0005
            android.os.Handler r2 = r3.A07
            java.lang.Runnable r0 = r3.A0A
            r2.removeCallbacks(r0)
            android.app.job.JobParameters r1 = r3.A00
            if (r1 == 0) goto L_0x02d5
            r0 = 0
            r3.jobFinished(r1, r0)
            r0 = 0
            r3.A00 = r0
        L_0x02d5:
            r1 = 16
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.post(r0)
            return
        L_0x02e0:
            X.3Qa r1 = r11.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0005
            r0 = 8
            if (r12 == r0) goto L_0x0005
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0338
            java.lang.Object r5 = r10.A00
            com.whatsapp.status.StatusesFragment r5 = (com.whatsapp.status.StatusesFragment) r5
            X.3P0 r0 = r5.A0x
            X.3Sz r0 = r0.A00
            if (r0 == 0) goto L_0x0338
            X.2iY r0 = r5.A14
            X.C36331k8.A1E(r0)
            X.1HT r0 = r5.A0d
            X.2iY r1 = new X.2iY
            r1.<init>(r0, r5)
            r5.A14 = r1
            X.0wU r0 = r5.A17
            X.C36331k8.A1F(r1, r0)
            long r3 = r11.A0H
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x031f
            X.1hp r1 = r5.A13
            android.content.Context r0 = r5.A0a()
            r1.A06(r0, r11, r5)
            return
        L_0x031f:
            boolean r0 = r11 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0005
            r0 = r11
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r1 = r0.A01
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0005
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0005
            X.1hp r0 = r5.A13
            r0.A07(r11)
            return
        L_0x0338:
            r0 = 12
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            r0.A1a()
            return
        L_0x0344:
            if (r11 == 0) goto L_0x0005
            X.3Qa r1 = r11.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0005
            int r1 = r11.A0D
            r0 = 4
            int r0 = X.AnonymousClass3TJ.A00(r1, r0)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            java.lang.Object r1 = r10.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            if (r0 == 0) goto L_0x0528
            r0 = 1
            com.whatsapp.status.playback.MyStatusesActivity.A0u(r11, r1, r0)
            return
        L_0x0368:
            java.lang.Object r5 = A01(r10, r11)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r5 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r5
            java.util.List r0 = r5.A0n
            if (r0 == 0) goto L_0x0005
            com.whatsapp.jid.UserJid r1 = r5.A0R
            X.13z r0 = X.C223613z.A00
            if (r1 != r0) goto L_0x0005
            X.3Qa r4 = r11.A1J
            X.11F r0 = r4.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0005
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0005
            X.3BI r3 = r5.A04
            if (r3 == 0) goto L_0x0391
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0F
            if (r0 == 0) goto L_0x0391
            java.util.Set r0 = r0.A04
            r0.clear()
        L_0x0391:
            java.util.List r0 = r5.A0n
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r7 = r0.iterator()
            r2 = 0
        L_0x039a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0005
            X.3T1 r6 = X.C36391kE.A0l(r7)
            boolean r0 = r6 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x03c8
            r0 = r6
            X.2bU r0 = (X.AnonymousClass2bU) r0
            if (r0 == 0) goto L_0x03c8
            X.3Qj r1 = r0.A01
            if (r1 == 0) goto L_0x03c8
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x03c8
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x03c8
            if (r3 == 0) goto L_0x03c8
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0F
            if (r0 == 0) goto L_0x03c8
            java.util.Set r1 = r0.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.add(r0)
        L_0x03c8:
            int r0 = r5.A00
            if (r2 != r0) goto L_0x03d7
            X.3Qa r0 = r6.A1J
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 == 0) goto L_0x03d7
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0A(r11, r5)
        L_0x03d7:
            int r2 = r2 + 1
            goto L_0x039a
        L_0x03da:
            if (r11 == 0) goto L_0x0005
            X.3Qa r2 = r11.A1J
            java.lang.Object r1 = r10.A00
            X.2f9 r1 = (X.C47572f9) r1
            X.3T1 r0 = r1.A05
            X.3Qa r0 = r0.A1J
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0005
            X.17Y r2 = r1.A02
            r0 = 37
            X.3wq r1 = new X.3wq
            r1.<init>(r10, r12, r0, r11)
            android.os.Handler r0 = r2.A02
            r0.post(r1)
            return
        L_0x03ff:
            X.3Qa r4 = X.AnonymousClass3T1.A06(r11)
            X.11F r2 = r4.A00
            boolean r0 = r2 instanceof X.C28981Uw
            r5 = 0
            if (r0 != 0) goto L_0x0432
            if (r2 == 0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r0
            X.1Zi r0 = r0.A0Z
            r1 = 0
            X.12q r0 = r0.A0C
            X.3Qp r1 = r0.A09(r2, r1)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0430
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0430
            boolean r0 = r1.A0L()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0429:
            boolean r0 = X.C36341k9.A1Z(r0)
            if (r0 != 0) goto L_0x0432
            return
        L_0x0430:
            r0 = r5
            goto L_0x0429
        L_0x0432:
            int r1 = r11.A0D
            r0 = 4
            if (r1 < r0) goto L_0x0005
            java.lang.Object r3 = r10.A00
            com.whatsapp.updates.viewmodels.UpdatesViewModel r3 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r3
            X.00s r0 = r3.A0T
            java.util.List r0 = X.C36401kF.A0w(r0)
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r2 = r0.iterator()
        L_0x0447:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2go r0 = (X.C48162go) r0
            X.3T1 r0 = r0.A05
            if (r0 == 0) goto L_0x0466
            X.3Qa r0 = r0.A1J
        L_0x045a:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 == 0) goto L_0x0447
            if (r1 == 0) goto L_0x0005
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A05(r3)
            return
        L_0x0466:
            r0 = r5
            goto L_0x045a
        L_0x0468:
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            boolean r0 = X.C66013Ui.A0n(r11)
            if (r0 != 0) goto L_0x0005
            X.3Qa r2 = r11.A1J
            X.11F r1 = r2.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x04c6
            r3 = r1
            X.1Uw r3 = (X.C28981Uw) r3
        L_0x047d:
            java.lang.Object r4 = r10.A00
            X.3OA r4 = (X.AnonymousClass3OA) r4
            boolean r0 = r1 instanceof X.C177528dw
            if (r0 == 0) goto L_0x04bb
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x04bb
            com.whatsapp.updates.viewmodels.UpdatesViewModel r2 = r4.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            if (r1 == 0) goto L_0x04b8
            r0 = 8
            int r1 = r1.intValue()
            if (r1 == r0) goto L_0x04bb
            r0 = -1
            if (r1 > r0) goto L_0x04b8
            X.00r r0 = r2.A0M
            java.lang.Object r0 = r0.A04()
            X.3EL r0 = (X.AnonymousClass3EL) r0
            if (r0 == 0) goto L_0x04bb
            X.3EK r1 = r0.A02
            java.util.Set r0 = r1.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04b8
            java.util.Set r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04bb
        L_0x04b8:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A04(r2)
        L_0x04bb:
            if (r3 == 0) goto L_0x0005
            com.whatsapp.updates.viewmodels.UpdatesViewModel r2 = r4.A08
            r1 = 0
            X.2oP r0 = X.C51802oP.UPDATED
            r2.A0U(r3, r1, r0)
            return
        L_0x04c6:
            r3 = 0
            goto L_0x047d
        L_0x04c8:
            r10.A04(r11)
            return
        L_0x04cc:
            r0 = 12
            if (r12 != r0) goto L_0x04da
            X.3T1 r0 = r2.getFMessage()
            if (r0 != r11) goto L_0x04ff
            r2.A1Z()
            return
        L_0x04da:
            r0 = 27
            if (r12 == r0) goto L_0x0504
            r0 = 39
            if (r12 == r0) goto L_0x0504
            r0 = 30
            if (r12 != r0) goto L_0x04ef
            int r1 = r11.A0E()
            r0 = 0
            r2.A1j(r1, r0)
            return
        L_0x04ef:
            r0 = 34
            if (r12 != r0) goto L_0x04ff
            X.5J2 r0 = r11.A1V
            if (r0 != 0) goto L_0x04fc
            r0 = 0
        L_0x04f8:
            r2.A1h(r0)
            return
        L_0x04fc:
            int r0 = r0.A00
            goto L_0x04f8
        L_0x04ff:
            r0 = 1
            r2.A22(r11, r0)
            return
        L_0x0504:
            r2.A21(r11, r12)
            int r0 = r2.A01
            r2.A1g(r0)
            return
        L_0x050d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0513:
            java.util.HashSet r0 = r4.A0Y
            r0.add(r3)
            return
        L_0x0519:
            r1.A0S()
            return
        L_0x051d:
            X.2o7 r0 = X.C51622o7.ACCOUNT
            r1.Bn9(r0)
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            r1.Bn9(r0)
            return
        L_0x0528:
            X.1nO r0 = r1.A0X
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90394a5.Bau(X.3T1, int):void");
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r5) {
        AnonymousClass11F r0;
        C64933Qa r02;
        AnonymousClass11F r03;
        C64933Qa r04;
        switch (this.A01) {
            case 11:
                ((AnonymousClass2JG) this.A00).A3l();
                return;
            case 12:
                A04(r5);
                return;
            case 14:
                C39961uN r2 = (C39961uN) this.A00;
                AnonymousClass147 r1 = r2.A06;
                if (r5 == null || (r04 = r5.A1J) == null) {
                    r03 = null;
                } else {
                    r03 = r04.A00;
                }
                if (AnonymousClass00C.A0J(r1, r03) && C39961uN.A02(r2, r5)) {
                    C39961uN.A01(r2);
                    return;
                }
                return;
            case 26:
                AnonymousClass2JG r22 = (AnonymousClass2JG) this.A00;
                AnonymousClass11F r12 = r22.A0F;
                if (r5 == null || (r02 = r5.A1J) == null) {
                    r0 = null;
                } else {
                    r0 = r02.A00;
                }
                if (AnonymousClass00C.A0J(r12, r0)) {
                    r22.A3l();
                    return;
                }
                return;
            case 30:
                if (r5 != null) {
                    C64933Qa r13 = r5.A1J;
                    if ((r13.A00 instanceof C177528dw) && r13.A02) {
                        MyStatusesActivity.A0u(r5, (MyStatusesActivity) this.A00, true);
                        return;
                    }
                    return;
                }
                return;
            case 33:
                if (r5 != null) {
                    C64933Qa r3 = r5.A1J;
                    String str = r3.A01;
                    C47572f9 r14 = (C47572f9) this.A00;
                    AnonymousClass3T1 r05 = r14.A05;
                    C18740tg.A06(r05);
                    if (str.equals(r05.A1J.A01) && r3.A02) {
                        C47572f9.A00(r14);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r8, AnonymousClass3T1 r9) {
        Object value;
        AnonymousClass3QB r0;
        C51542nz r3;
        PlaceInfo placeInfo;
        switch (this.A01) {
            case 1:
                AnonymousClass00C.A0D(r9, 1);
                C64933Qa r2 = r9.A1J;
                if (AnonymousClass00C.A0J(r2.A00, ((BotEmbodimentViewModel) this.A00).A00) && !r2.A02 && !(r9 instanceof AnonymousClass2bD) && !(r9 instanceof AnonymousClass2bI)) {
                    A05(r9);
                    return;
                }
                return;
            case 4:
                AnonymousClass00C.A0D(r9, 1);
                AnonymousClass11F r22 = r9.A1J.A00;
                C39921uG r1 = (C39921uG) this.A00;
                if (AnonymousClass00C.A0J(r22, r1.A0C)) {
                    C39921uG.A01(r1, r9);
                    return;
                }
                return;
            case 8:
                if (A06(r9)) {
                    C40051uf r23 = (C40051uf) this.A00;
                    C81323wp.A01(r23.A0y, r23, 45);
                    return;
                }
                return;
            case 14:
                C36321k7.A0w(r8, r9);
                C39961uN r24 = (C39961uN) this.A00;
                if (AnonymousClass00C.A0J(r24.A06, r8.A1J.A00) && C39961uN.A02(r24, r8)) {
                    C39961uN.A01(r24);
                    return;
                }
                return;
            case 17:
                C40061uh r25 = (C40061uh) this.A00;
                if (C1901797e.A00(r8.A1J.A00, r25.A0t)) {
                    r25.A0X.A0D(C36441kJ.A0Q(r8, r9));
                    r25.A0U();
                    return;
                }
                return;
            case 18:
                C36321k7.A0w(r8, r9);
                if ((r8 instanceof AnonymousClass2bT) && (r9 instanceof AnonymousClass2bT)) {
                    C39911uC r4 = (C39911uC) this.A00;
                    C36381kD.A1R(r4.A05, new EventsViewModel$messageObserver$1$onMessageReplaced$1(this, r4, r9, (C023509x) null), C109325Xd.A00(r4));
                    return;
                }
                return;
            case 19:
                C36321k7.A0w(r8, r9);
                if (A07(r8)) {
                    AnonymousClass05L r6 = ((C40071us) this.A00).A0E;
                    do {
                        value = r6.getValue();
                        r0 = (AnonymousClass3QB) value;
                        r3 = C51542nz.EDITED;
                        placeInfo = r0.A03;
                    } while (!r6.B3B(value, new AnonymousClass3QB(r0.A01, (AnonymousClass2bT) r9, r3, placeInfo)));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r4) {
        if (29 - this.A01 == 0 && (r4.A1J.A00 instanceof C177528dw)) {
            StatusesFragment statusesFragment = (StatusesFragment) this.A00;
            statusesFragment.A1U.add(r4.A0L());
            statusesFragment.A1a();
        }
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        if (7 - this.A01 != 0) {
            C54122sR.A00(this, collection, i);
            return;
        }
        C65513Sj r3 = (C65513Sj) this.A00;
        C36331k8.A1T(new CommentListManager$messageObserver$1$onMessagesChanged$1(r3, collection, (C023509x) null), r3.A07);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r6) {
        C001600r r1;
        List list;
        AnonymousClass6E1 r0;
        switch (this.A01) {
            case 2:
                C39931uI r12 = (C39931uI) A01(this, r6);
                if (r6.equals(r12.A00)) {
                    C39931uI.A01(r12);
                    return;
                }
                return;
            case 3:
                BonsaiPromptsViewModel bonsaiPromptsViewModel = (BonsaiPromptsViewModel) A01(this, r6);
                if (r6.equals(bonsaiPromptsViewModel.A00) && (r0 = bonsaiPromptsViewModel.A08) != null) {
                    r1 = bonsaiPromptsViewModel.A05;
                    list = r0.A0A;
                    break;
                } else {
                    return;
                }
                break;
            case 4:
                C39921uG r13 = (C39921uG) A01(this, r6);
                if (r6.equals(r13.A0C)) {
                    r1 = r13.A00;
                    list = null;
                    break;
                } else {
                    return;
                }
            case 12:
                MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
                if (C64933Qa.A05(messageDetailsActivity.A0P, r6)) {
                    if (messageDetailsActivity.A0S.A03(messageDetailsActivity.A0P.A1J) == null) {
                        messageDetailsActivity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                C40061uh r4 = (C40061uh) this.A00;
                if (r6.equals(r4.A0t)) {
                    C40061uh.A09(r4);
                    r4.A0U();
                    Map map = r4.A1F;
                    if (!map.isEmpty()) {
                        r4.A13.A0D(C55012tv.A00(C51882oX.DELETED, map.values()));
                        map.clear();
                    }
                    C40061uh.A06(r4);
                    return;
                }
                return;
            case 29:
                if (r6 instanceof C177528dw) {
                    ((StatusesFragment) this.A00).A1a();
                    return;
                }
                return;
            default:
                return;
        }
        r1.A0D(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0268, code lost:
        if (r6.A06 <= 0) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0391, code lost:
        if (r1 == null) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0583, code lost:
        if (r10 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0585, code lost:
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r14.A00).A1c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x058c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0635, code lost:
        X.C36381kD.A1R(r3, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0638, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        ((X.AnonymousClass2JG) r14.A00).A3l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017a, code lost:
        r1.A0D((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017e, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:502:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Bb6(java.util.Collection r15, java.util.Map r16) {
        /*
            r14 = this;
            int r0 = r14.A01
            r10 = r15
            switch(r0) {
                case 4: goto L_0x0007;
                case 5: goto L_0x003e;
                case 6: goto L_0x006e;
                case 7: goto L_0x05c3;
                case 8: goto L_0x009a;
                case 9: goto L_0x0006;
                case 10: goto L_0x05d4;
                case 11: goto L_0x00ba;
                case 12: goto L_0x00d0;
                case 13: goto L_0x00f2;
                case 14: goto L_0x010c;
                case 15: goto L_0x013c;
                case 16: goto L_0x0168;
                case 17: goto L_0x017f;
                case 18: goto L_0x0623;
                case 19: goto L_0x02b6;
                case 20: goto L_0x02ef;
                case 21: goto L_0x030f;
                case 22: goto L_0x0006;
                case 23: goto L_0x0330;
                case 24: goto L_0x039a;
                case 25: goto L_0x0006;
                case 26: goto L_0x03bc;
                case 27: goto L_0x0006;
                case 28: goto L_0x0006;
                case 29: goto L_0x03e6;
                case 30: goto L_0x0427;
                case 31: goto L_0x0006;
                case 32: goto L_0x0449;
                case 33: goto L_0x0006;
                case 34: goto L_0x04e8;
                case 35: goto L_0x04fb;
                case 36: goto L_0x0006;
                case 37: goto L_0x058d;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            java.util.ArrayList r4 = X.C36321k7.A0J(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x0013:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001d
            X.AnonymousClass3T1.A0A(r4, r1)
            goto L_0x0013
        L_0x001d:
            java.lang.Object r3 = r14.A00
            X.1uG r3 = (X.C39921uG) r3
            X.00s r2 = r3.A00
            X.3T1 r0 = X.C36431kI.A0r(r2)
            r1 = 0
            if (r0 == 0) goto L_0x003c
            X.3Qa r0 = r0.A1J
        L_0x002c:
            boolean r0 = X.C007103b.A0j(r4, r0)
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36431kI.A0r(r2)
            r3.A01 = r0
            r2.A0D(r1)
            return
        L_0x003c:
            r0 = r1
            goto L_0x002c
        L_0x003e:
            java.util.Iterator r3 = r15.iterator()
        L_0x0042:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r2 = X.C36391kE.A0l(r3)
            java.lang.Object r1 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.141 r0 = r1.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = X.C64933Qa.A05(r2, r0)
            if (r0 == 0) goto L_0x0042
            int r0 = r2.A1I
            boolean r0 = X.C66013Ui.A0J(r0)
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x0042
        L_0x0068:
            X.2EI r0 = r1.A0h
            r0.A0U()
            return
        L_0x006e:
            java.util.Iterator r3 = r15.iterator()
        L_0x0072:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r2 = X.C36391kE.A0l(r3)
            java.lang.Object r1 = r14.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.8dx r0 = r1.A3t()
            boolean r0 = X.C64933Qa.A05(r2, r0)
            if (r0 == 0) goto L_0x0072
            int r0 = r2.A1I
            boolean r0 = X.C66013Ui.A0J(r0)
            if (r0 != 0) goto L_0x0096
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x0072
        L_0x0096:
            com.whatsapp.chatinfo.ListChatInfoActivity.A10(r1)
            return
        L_0x009a:
            java.util.Iterator r1 = r15.iterator()
        L_0x009e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r1)
            boolean r0 = r14.A06(r0)
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r14.A00
            X.1uf r2 = (X.C40051uf) r2
            X.0wU r1 = r2.A0y
            r0 = 45
            X.C81323wp.A01(r1, r2, r0)
            return
        L_0x00ba:
            java.util.Iterator r2 = r15.iterator()
        L_0x00be:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r2)
            int r1 = r0.A0E()
            r0 = 1
            if (r1 != r0) goto L_0x00be
            goto L_0x0104
        L_0x00d0:
            java.util.Iterator r3 = r15.iterator()
        L_0x00d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r3)
            X.3Qa r2 = r0.A1J
            java.lang.Object r1 = r14.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            X.3T1 r0 = r1.A0P
            X.3Qa r0 = r0.A1J
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d4
            r1.finish()
            return
        L_0x00f2:
            java.util.Iterator r1 = r15.iterator()
        L_0x00f6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r1)
            boolean r0 = r0.A15
            if (r0 == 0) goto L_0x00f6
        L_0x0104:
            java.lang.Object r0 = r14.A00
            X.2JG r0 = (X.AnonymousClass2JG) r0
            r0.A3l()
            return
        L_0x010c:
            java.lang.Object r4 = A01(r14, r15)
            X.1uN r4 = (X.C39961uN) r4
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0006
            java.util.Iterator r3 = r15.iterator()
        L_0x011c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r2 = X.C36391kE.A0l(r3)
            X.3Qa r0 = r2.A1J
            X.11F r1 = r0.A00
            X.147 r0 = r4.A06
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x011c
            boolean r0 = X.C39961uN.A02(r4, r2)
            if (r0 == 0) goto L_0x011c
            X.C39961uN.A01(r4)
            return
        L_0x013c:
            java.lang.Object r5 = A01(r14, r15)
            com.whatsapp.conversation.selection.SelectedImageAlbumViewModel r5 = (com.whatsapp.conversation.selection.SelectedImageAlbumViewModel) r5
            boolean r0 = r15.isEmpty()
            r4 = 1
            if (r0 != 0) goto L_0x0006
            java.util.Iterator r3 = r15.iterator()
        L_0x014d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            java.lang.Object r2 = r3.next()
            X.00s r1 = r5.A00
            java.lang.Object r0 = r1.A04()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x014d
            boolean r0 = X.C007103b.A0j(r0, r2)
            if (r0 != r4) goto L_0x014d
            goto L_0x017a
        L_0x0168:
            java.lang.Object r0 = A01(r14, r15)
            X.1tL r0 = (X.C39701tL) r0
            X.00s r1 = r0.A00
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.C007103b.A0j(r15, r0)
            if (r0 == 0) goto L_0x0006
        L_0x017a:
            r0 = 0
            r1.A0D(r0)
            return
        L_0x017f:
            java.lang.Object r6 = r14.A00
            X.1uh r6 = (X.C40061uh) r6
            java.util.Iterator r7 = r15.iterator()
            r5 = 0
            r9 = 0
            r8 = 0
        L_0x018a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0207
            X.3T1 r2 = X.C36391kE.A0l(r7)
            X.3Qa r4 = r2.A1J
            X.11F r1 = r4.A00
            X.11F r0 = r6.A0t
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x01da
            X.4Ut r1 = r6.A1A
            boolean r0 = r1.BCi()
            if (r0 == 0) goto L_0x01b3
            X.3Qa r0 = r1.BAa()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01b3
            r9 = 1
        L_0x01b3:
            X.1Ef r0 = r6.A0i
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x01d4
            int r0 = r6.A07
            if (r0 <= 0) goto L_0x01d4
            int r0 = r0 + -1
            r6.A07 = r0
            int r1 = r2.A1I
            r0 = 10
            if (r1 == r0) goto L_0x01d1
            int r0 = r6.A05
            if (r0 <= 0) goto L_0x01d1
            int r0 = r0 + -1
            r6.A05 = r0
        L_0x01d1:
            X.C40061uh.A07(r6)
        L_0x01d4:
            boolean r0 = r4.A02
            r5 = 1
            if (r0 == 0) goto L_0x01da
            r8 = 1
        L_0x01da:
            X.3Hc r0 = r6.A1B
            X.3O8 r0 = r0.A00
            java.util.List r0 = r0.A08
            java.util.Iterator r3 = r0.iterator()
        L_0x01e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r2 = r3.next()
            X.38r r2 = (X.AnonymousClass38r) r2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r4.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e4
            X.4SJ r0 = r2.A01
            if (r0 == 0) goto L_0x0201
            r0.BYI()
        L_0x0201:
            X.3Qq r0 = r2.A03
            r0.A0D()
            goto L_0x01e4
        L_0x0207:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagesViewModel/observer/delete/unseen/"
            r2.append(r0)
            int r0 = r6.A07
            r2.append(r0)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r0 = r6.A05
            r2.append(r0)
            r2.append(r1)
            int r0 = r6.A06
            X.C36321k7.A1Y(r2, r0)
            if (r5 == 0) goto L_0x0006
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0006
            java.util.Iterator r0 = r15.iterator()
            X.3T1 r0 = X.C36391kE.A0l(r0)
            boolean r0 = r0.A1X
            if (r0 != 0) goto L_0x026a
            long r3 = r6.A09
            r7 = 0
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x026d
            java.util.Iterator r5 = r15.iterator()
        L_0x0248:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x025d
            X.3T1 r0 = X.C36391kE.A0l(r5)
            long r3 = r6.A09
            long r1 = r0.A1O
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0248
            int r7 = r7 + 1
            goto L_0x0248
        L_0x025d:
            if (r7 <= 0) goto L_0x026d
            int r0 = r6.A05
            int r0 = r0 - r7
            r6.A05 = r0
            if (r0 > 0) goto L_0x026d
            int r0 = r6.A06
            if (r0 > 0) goto L_0x026d
        L_0x026a:
            X.C40061uh.A09(r6)
        L_0x026d:
            r6.A0U()
            if (r9 == 0) goto L_0x0277
            X.4Ut r0 = r6.A1A
            r0.B34()
        L_0x0277:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r15.iterator()
        L_0x027f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02a2
            X.3T1 r3 = X.C36391kE.A0l(r4)
            java.util.Map r2 = r6.A1F
            X.3Qa r1 = r3.A1J
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x027f
            r2.remove(r1)
            X.2oX r2 = X.C51882oX.DELETED
            r1 = 0
            X.3JJ r0 = new X.3JJ
            r0.<init>(r2, r3, r1)
            r5.add(r0)
            goto L_0x027f
        L_0x02a2:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x02b0
            r5.size()
            X.1Rs r0 = r6.A13
            r0.A0D(r5)
        L_0x02b0:
            if (r8 == 0) goto L_0x0006
            X.C40061uh.A06(r6)
            return
        L_0x02b6:
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            java.util.Iterator r1 = r15.iterator()
        L_0x02be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r1)
            boolean r0 = r14.A07(r0)
            if (r0 == 0) goto L_0x02be
            java.lang.Object r0 = r14.A00
            X.1us r0 = (X.C40071us) r0
            X.05L r6 = r0.A0E
        L_0x02d4:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.3QB r0 = (X.AnonymousClass3QB) r0
            X.2nz r4 = X.C51542nz.DELETED
            com.whatsapp.location.PlaceInfo r3 = r0.A03
            X.2bT r2 = r0.A01
            X.2bT r1 = r0.A00
            X.3QB r0 = new X.3QB
            r0.<init>(r2, r1, r4, r3)
            boolean r0 = r6.B3B(r5, r0)
            if (r0 == 0) goto L_0x02d4
            return
        L_0x02ef:
            java.util.Iterator r3 = r15.iterator()
        L_0x02f3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.11F r2 = X.C64933Qa.A02(r3)
            if (r2 == 0) goto L_0x02f3
            java.lang.Object r1 = r14.A00
            com.whatsapp.gallery.GalleryFragmentBase r1 = (com.whatsapp.gallery.GalleryFragmentBase) r1
            X.11F r0 = r1.A0D
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02f3
            com.whatsapp.gallery.GalleryFragmentBase.A05(r1)
            return
        L_0x030f:
            java.util.Iterator r3 = r15.iterator()
        L_0x0313:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.11F r2 = X.C64933Qa.A02(r3)
            if (r2 == 0) goto L_0x0313
            java.lang.Object r1 = r14.A00
            com.whatsapp.gallery.MediaGalleryFragment r1 = (com.whatsapp.gallery.MediaGalleryFragment) r1
            X.11F r0 = r1.A03
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0313
            r0 = 0
            r1.A1g(r0)
            return
        L_0x0330:
            java.lang.Object r4 = r14.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.util.Iterator r3 = r15.iterator()
        L_0x0338:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r2 = X.C36391kE.A0l(r3)
            X.3Qa r5 = r2.A1J
            X.11F r1 = r5.A00
            if (r1 == 0) goto L_0x0338
            X.11F r0 = r4.A13
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0338
            int r1 = r2.A1I
            boolean r0 = X.C66013Ui.A0J(r1)
            if (r0 != 0) goto L_0x035e
            boolean r0 = X.C66013Ui.A0K(r1)
            if (r0 == 0) goto L_0x0338
        L_0x035e:
            X.4Up r0 = r4.A1C
            if (r0 == 0) goto L_0x0393
            int r0 = r0.getCount()
            r2 = 1
            if (r0 == r2) goto L_0x0393
            X.1Rb r0 = r4.A1E
            if (r0 == 0) goto L_0x0393
            int r0 = r4.A03
            X.2bU r1 = com.whatsapp.mediaview.MediaViewFragment.A07(r4, r0)
            int r3 = r4.A03
            if (r1 == 0) goto L_0x0006
            X.3Qa r0 = r1.A1J
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0639
            int r1 = r4.A03
            X.4Up r0 = r4.A1C
            int r0 = r0.getCount()
            int r0 = r0 - r2
            int r3 = r4.A03
            if (r1 != r0) goto L_0x0397
            int r3 = r3 - r2
        L_0x038d:
            X.2bU r1 = com.whatsapp.mediaview.MediaViewFragment.A07(r4, r3)
            if (r1 != 0) goto L_0x0639
        L_0x0393:
            r4.A1g()
            return
        L_0x0397:
            int r3 = r3 + 1
            goto L_0x038d
        L_0x039a:
            java.util.Iterator r2 = r15.iterator()
        L_0x039e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r1 = X.C36391kE.A0l(r2)
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x039e
            int r0 = r1.A1I
            boolean r0 = X.C66013Ui.A0L(r0)
            if (r0 == 0) goto L_0x039e
            java.lang.Object r0 = r14.A00
            X.C36411kG.A1N(r0)
            goto L_0x039e
        L_0x03bc:
            java.lang.Object r3 = A01(r14, r15)
            X.2JG r3 = (X.AnonymousClass2JG) r3
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0006
            java.util.Iterator r2 = r15.iterator()
        L_0x03cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r2)
            X.11F r1 = r3.A0F
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x03cc
            r3.A3l()
            return
        L_0x03e6:
            java.util.Iterator r5 = r15.iterator()
            r4 = 0
        L_0x03eb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r3 = X.C36391kE.A0l(r5)
            X.3Qa r1 = r3.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x03eb
            if (r4 != 0) goto L_0x0407
            java.lang.Object r0 = r14.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            r0.A1a()
            r4 = 1
        L_0x0407:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x03eb
            java.lang.Object r1 = r14.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.1Xc r0 = r1.A0y
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x03eb
            boolean r0 = X.C66013Ui.A0n(r3)
            if (r0 != 0) goto L_0x03eb
            X.1Xt r0 = r1.A10
            X.1Xw r2 = r0.A0A
            r1 = 5
            r0 = 0
            X.C29761Xw.A02(r3, r2, r0, r0, r1)
            goto L_0x03eb
        L_0x0427:
            java.util.Iterator r2 = r15.iterator()
        L_0x042b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0006
            X.3T1 r0 = X.C36391kE.A0l(r2)
            X.3Qa r1 = r0.A1J
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x042b
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x042b
            java.lang.Object r0 = r14.A00
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A0v(r0)
            return
        L_0x0449:
            java.lang.Object r9 = A01(r14, r15)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r9 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r9
            java.util.List r11 = r9.A0n
            if (r11 == 0) goto L_0x0006
            int r12 = r9.A00
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r15.iterator()
        L_0x045d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x047a
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r1 = r0.A1J
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0476
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x045d
        L_0x0476:
            r5.add(r2)
            goto L_0x045d
        L_0x047a:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r5.iterator()
        L_0x0482:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x04b4
            X.3T1 r0 = X.C36391kE.A0l(r5)
            X.3Qa r3 = r0.A1J
            X.AnonymousClass00C.A07(r3)
            java.util.List r0 = r9.A0n
            if (r0 == 0) goto L_0x0482
            java.util.Iterator r2 = r0.iterator()
        L_0x0499:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0482
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)
            if (r0 == 0) goto L_0x0499
            if (r1 == 0) goto L_0x0482
            r4.add(r1)
            goto L_0x0482
        L_0x04b4:
            java.util.Iterator r2 = r4.iterator()
            r1 = 0
        L_0x04b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04d5
            java.lang.Object r0 = r2.next()
            int r1 = r11.indexOf(r0)
            if (r1 < 0) goto L_0x04d3
            r11.remove(r1)
            int r0 = r9.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            int r12 = r12 - r0
        L_0x04d3:
            r1 = 1
            goto L_0x04b9
        L_0x04d5:
            if (r1 == 0) goto L_0x0006
            X.17Y r0 = r9.A00
            if (r0 == 0) goto L_0x0662
            r13 = 21
            X.3vW r8 = new X.3vW
            r8.<init>(r9, r10, r11, r12, r13)
            android.os.Handler r0 = r0.A02
            r0.post(r8)
            return
        L_0x04e8:
            java.lang.Object r2 = r14.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r2 = (com.whatsapp.storage.StorageUsageGalleryActivity) r2
            android.os.Handler r1 = r2.A0V
            java.lang.Runnable r0 = r2.A0W
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A0R
            if (r0 == 0) goto L_0x0006
            r0.run()
            return
        L_0x04fb:
            java.util.Iterator r11 = r15.iterator()
            r10 = 0
        L_0x0500:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0583
            X.3T1 r9 = X.C36391kE.A0l(r11)
            java.lang.Object r4 = r14.A00
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r4 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r4
            X.11F r1 = r4.A07
            if (r1 == 0) goto L_0x051e
            X.3Qa r0 = r9.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x0500
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0500
        L_0x051e:
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x057f
            X.4Uo r5 = r4.A0G
            X.3mH r5 = (X.C74853mH) r5
            r8 = 1
            if (r5 == 0) goto L_0x0500
            monitor-enter(r5)
            int r6 = r5.getCount()     // Catch:{ all -> 0x0667 }
            r7 = 0
            r3 = 0
        L_0x0530:
            if (r3 >= r6) goto L_0x0572
            java.util.Map r2 = r5.A05     // Catch:{ all -> 0x0667 }
            java.lang.Object r1 = X.C36371kC.A0r(r2, r3)     // Catch:{ all -> 0x0667 }
            X.3mF r1 = (X.C74833mF) r1     // Catch:{ all -> 0x0667 }
            if (r1 == 0) goto L_0x0556
            X.2bU r0 = r1.A02     // Catch:{ all -> 0x0667 }
            if (r0 == 0) goto L_0x0556
            X.2bU r0 = r1.A02     // Catch:{ all -> 0x0667 }
            boolean r0 = X.AnonymousClass3T1.A0B(r0, r9)     // Catch:{ all -> 0x0667 }
            if (r0 == 0) goto L_0x0556
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0667 }
            r2.remove(r0)     // Catch:{ all -> 0x0667 }
            int r0 = r5.A00     // Catch:{ all -> 0x0667 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0667 }
            goto L_0x0559
        L_0x0556:
            int r3 = r3 + 1
            goto L_0x0530
        L_0x0559:
            r7 = 1
        L_0x055a:
            int r0 = r6 + -1
            if (r3 >= r0) goto L_0x0572
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0667 }
            int r3 = r3 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0667 }
            java.lang.Object r0 = r2.remove(r0)     // Catch:{ all -> 0x0667 }
            X.3mF r0 = (X.C74833mF) r0     // Catch:{ all -> 0x0667 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0667 }
            goto L_0x055a
        L_0x0572:
            monitor-exit(r5)     // Catch:{ all -> 0x0667 }
            if (r7 == 0) goto L_0x0500
            int r0 = r4.A01
            int r0 = r0 - r8
            r4.A01 = r0
            r4.A1b()
            r10 = 1
            goto L_0x0500
        L_0x057f:
            r0 = 0
            r4.A1g(r0)
        L_0x0583:
            if (r10 == 0) goto L_0x0006
            java.lang.Object r0 = r14.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1c()
            return
        L_0x058d:
            java.util.ArrayList r3 = X.C36341k9.A0l(r15)
            java.util.Iterator r2 = r15.iterator()
        L_0x0595:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05ac
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0595
            r3.add(r1)
            goto L_0x0595
        L_0x05ac:
            java.lang.Object r2 = r14.A00
            X.3OA r2 = (X.AnonymousClass3OA) r2
            java.util.Iterator r1 = r3.iterator()
        L_0x05b4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            r1.next()
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r2.A08
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A04(r0)
            goto L_0x05b4
        L_0x05c3:
            java.lang.Object r1 = A01(r14, r15)
            X.3Sj r1 = (X.C65513Sj) r1
            X.040 r4 = r1.A07
            X.02l r3 = r1.A06
            r0 = 0
            com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesDeleted$1 r2 = new com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesDeleted$1
            r2.<init>(r1, r15, r0)
            goto L_0x0635
        L_0x05d4:
            java.lang.Object r6 = r14.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r6
            X.1nW r7 = r6.A0B
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x0613
            java.util.Iterator r5 = r15.iterator()
            r4 = 0
        L_0x05e3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x060e
            X.3T1 r3 = X.C36391kE.A0l(r5)
            java.util.List r0 = r7.A00
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x05f4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05e3
            X.3T1 r0 = X.C36391kE.A0l(r2)
            boolean r0 = X.AnonymousClass3T1.A0B(r0, r3)
            if (r0 == 0) goto L_0x060b
            java.util.List r0 = r7.A00
            r0.remove(r1)
            r4 = 1
            goto L_0x05e3
        L_0x060b:
            int r1 = r1 + 1
            goto L_0x05f4
        L_0x060e:
            if (r4 == 0) goto L_0x0613
            r7.notifyDataSetChanged()
        L_0x0613:
            X.1nW r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x061f
            r6.finish()
            return
        L_0x061f:
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A0w(r6)
            return
        L_0x0623:
            java.lang.Object r1 = A01(r14, r15)
            X.1uC r1 = (X.C39911uC) r1
            X.040 r4 = X.C109325Xd.A00(r1)
            X.02l r3 = r1.A05
            r0 = 0
            com.whatsapp.event.EventsViewModel$messageObserver$1$onMessagesDeleted$1 r2 = new com.whatsapp.event.EventsViewModel$messageObserver$1$onMessagesDeleted$1
            r2.<init>(r14, r1, r15, r0)
        L_0x0635:
            X.C36381kD.A1R(r3, r2, r4)
            return
        L_0x0639:
            X.4Up r0 = r4.A1C
            if (r0 == 0) goto L_0x0640
            r0.close()
        L_0x0640:
            X.1Rb r0 = r4.A1E
            X.4Up r2 = r0.B4m(r1)
            r4.A1C = r2
            r1 = 49
            X.74t r0 = new X.74t
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.Bqj(r0)
            r2.Bwc(r3)
            boolean r0 = r4.A21
            if (r0 != 0) goto L_0x065e
            X.4Up r0 = r4.A1C
            r0.BuW()
        L_0x065e:
            r4.A1h()
            return
        L_0x0662:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0667:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0667 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90394a5.Bb6(java.util.Collection, java.util.Map):void");
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r3, Collection collection, boolean z) {
        if (26 - this.A01 == 0) {
            AnonymousClass2JG r1 = (AnonymousClass2JG) this.A00;
            if (AnonymousClass00C.A0J(r1.A0F, r3)) {
                r1.A3l();
            }
        }
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r10, Collection collection, boolean z) {
        AnonymousClass2EI r0;
        switch (this.A01) {
            case 5:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3T1 A0l = C36391kE.A0l(it);
                        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                        if (C64933Qa.A05(A0l, C36351kA.A0k(contactInfoActivity.A0z))) {
                            r0 = contactInfoActivity.A0h;
                        }
                    }
                    return;
                } else if (r10 == null || C36351kA.A0k(((ContactInfoActivity) this.A00).A0z).equals(r10)) {
                    r0 = ((ContactInfoActivity) this.A00).A0h;
                } else {
                    return;
                }
                r0.A0U();
                return;
            case 6:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3T1 A0l2 = C36391kE.A0l(it2);
                        ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                        if (C64933Qa.A05(A0l2, listChatInfoActivity.A3t())) {
                            ListChatInfoActivity.A10(listChatInfoActivity);
                            return;
                        }
                    }
                    return;
                } else if (r10 == null || r10.equals(((ListChatInfoActivity) this.A00).A3t())) {
                    ListChatInfoActivity.A10((ListChatInfoActivity) this.A00);
                    return;
                } else {
                    return;
                }
            case 10:
                if (collection != null) {
                    boolean z2 = false;
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass3T1 A0l3 = C36391kE.A0l(it3);
                        MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this.A00;
                        C37981nW r02 = mediaAlbumActivity.A0B;
                        C64933Qa r2 = A0l3.A1J;
                        List list = r02.A00;
                        if (list != null) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (C36391kE.A0l(it4).A1J.equals(r2)) {
                                        mediaAlbumActivity.A0Z.add(r2);
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z2) {
                        ((MediaAlbumActivity) this.A00).A0B.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                Iterator it5 = collection.iterator();
                while (it5.hasNext()) {
                    A04(C36391kE.A0l(it5));
                }
                return;
            case 13:
                if (collection == null || !collection.isEmpty()) {
                    ((AnonymousClass2JG) this.A00).A3l();
                    return;
                }
                return;
            case 17:
                C40061uh r22 = (C40061uh) this.A00;
                C62103Eu r1 = new C62103Eu();
                if (collection == null || collection.isEmpty()) {
                    r1.A05 = true;
                } else {
                    r1.A04 = collection;
                }
                A02(r1, r22);
                r22.A0U();
                return;
            case 20:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        AnonymousClass11F A02 = C64933Qa.A02(it6);
                        if (A02 != null) {
                            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A00;
                            if (A02.equals(galleryFragmentBase.A0D)) {
                                GalleryFragmentBase.A05(galleryFragmentBase);
                                return;
                            }
                        }
                    }
                    return;
                } else if (r10 == null || r10.equals(((GalleryFragmentBase) this.A00).A0D)) {
                    GalleryFragmentBase.A05((GalleryFragmentBase) this.A00);
                    return;
                } else {
                    return;
                }
            case 21:
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this.A00;
                if (mediaGalleryFragment.A06 == null || !mediaGalleryFragment.A0F.A0E(6509)) {
                    MediaGalleryFragment.A00(mediaGalleryFragment, (C74853mH) mediaGalleryFragment.A0G, r10, collection);
                    return;
                } else {
                    mediaGalleryFragment.A06.execute(new C80403vL(this, r10, collection, 39));
                    return;
                }
            case 35:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
                C74853mH r7 = (C74853mH) mediaGalleryFragmentBase.A0G;
                if (r7 != null && collection != null) {
                    int count = r7.getCount();
                    Iterator it7 = collection.iterator();
                    boolean z3 = false;
                    while (it7.hasNext()) {
                        AnonymousClass3T1 A0l4 = C36391kE.A0l(it7);
                        int i = 0;
                        while (true) {
                            if (i < count) {
                                C74833mF r12 = (C74833mF) C36371kC.A0r(r7.A05, i);
                                if (!(r12 == null || r12.A02 == null)) {
                                    AnonymousClass2bU r13 = r12.A02;
                                    if (AnonymousClass3T1.A0B(r13, A0l4)) {
                                        r13.A15 = z;
                                        z3 = true;
                                    }
                                }
                                i++;
                            }
                        }
                    }
                    if (z3) {
                        mediaGalleryFragmentBase.A1b();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bb9(Collection collection) {
        C64933Qa r0;
        switch (this.A01) {
            case 4:
                AnonymousClass00C.A0D(collection, 0);
                ArrayList A0J = C36321k7.A0J(collection);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1.A0A(A0J, it);
                }
                C39921uG r3 = (C39921uG) this.A00;
                AnonymousClass3T1 r02 = r3.A01;
                if (r02 != null) {
                    r0 = r02.A1J;
                } else {
                    r0 = null;
                }
                if (C007103b.A0j(A0J, r0)) {
                    r3.A00.A0D(r3.A01);
                    r3.A01 = null;
                    return;
                }
                return;
            case 17:
                C40061uh r6 = (C40061uh) this.A00;
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it2);
                    AnonymousClass5J2 r03 = A0l.A1V;
                    if (r03 != null && r03.A00 == 1) {
                        r6.A1F.put(A0l.A1J, A0l);
                        A0I.add(new AnonymousClass3JJ(C51882oX.UNDO_DELETED, A0l, (C64933Qa) null));
                    }
                }
                if (!A0I.isEmpty()) {
                    A0I.size();
                    r6.A13.A0D(A0I);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bbc(C28981Uw r4) {
        if (17 - this.A01 == 0) {
            C40061uh r2 = (C40061uh) this.A00;
            if (r4.equals(r2.A0t)) {
                C62103Eu r1 = new C62103Eu();
                r1.A05 = true;
                A02(r1, r2);
                r2.A0U();
                C40061uh.A0B(r2, r2.A0B);
            }
        }
    }

    public /* synthetic */ void Bbe(C28981Uw r8, boolean z) {
        switch (this.A01) {
            case 17:
                C40061uh r6 = (C40061uh) this.A00;
                if (r8.equals(r6.A0t)) {
                    r6.A0L = !z;
                    if (r6.A08 < 5) {
                        r6.A0b(true);
                        return;
                    }
                    return;
                }
                return;
            case 37:
                ((AnonymousClass3OA) A01(this, r8)).A08.A0U(r8, (AnonymousClass3T1) null, C51802oP.FULL_HISTORY_FETCHED);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bbf(C28981Uw r4) {
        if (17 - this.A01 == 0) {
            C40061uh r2 = (C40061uh) this.A00;
            if (r4.equals(r2.A0t)) {
                C62103Eu r1 = new C62103Eu();
                r1.A05 = true;
                A02(r1, r2);
                r2.A0U();
            }
        }
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r7, AnonymousClass3T1 r8) {
        if (17 - this.A01 == 0) {
            C40061uh r2 = (C40061uh) this.A00;
            Map map = r2.A1F;
            C64933Qa r5 = r7.A1J;
            if (map.containsKey(r5)) {
                map.remove(r5);
                map.put(r8.A1J, r8);
                r2.A13.A0D(AnonymousClass6XV.newArrayList(new AnonymousClass3JJ(C51882oX.EDITED, r8, r5)));
            }
        }
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public final void A05(AnonymousClass3T1 r8) {
        C51962of r6;
        AnonymousClass6D0 r0;
        C001700s r1;
        Object obj;
        C63483Kf A0M = r8.A0M();
        if (A0M != null) {
            r6 = A0M.A01;
        } else {
            r6 = null;
        }
        int i = 4;
        boolean z = false;
        C51962of[] r3 = {null, C51962of.LAST, C51962of.FULL, C51962of.TIMED_OUT};
        AnonymousClass00C.A0D(r3, 0);
        if (AnonymousClass02R.A0E(r3).contains(r6)) {
            i = 5;
        }
        BotEmbodimentViewModel botEmbodimentViewModel = (BotEmbodimentViewModel) this.A00;
        C34831hi r12 = botEmbodimentViewModel.A05;
        Number A0z = C36441kJ.A0z(r12);
        if (A0z == null || A0z.intValue() != i) {
            z = true;
        }
        C36341k9.A16(r12, i);
        Object obj2 = r8.A1M;
        synchronized (obj2) {
            r0 = r8.A0T;
        }
        if (r0 != null) {
            r1 = botEmbodimentViewModel.A01;
            synchronized (obj2) {
                obj = r8.A0T;
            }
        } else if (z) {
            r1 = botEmbodimentViewModel.A01;
            AnonymousClass00C.A0D(r1, 0);
            obj = r1.A04();
        } else {
            return;
        }
        r1.A0D(obj);
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }
}
