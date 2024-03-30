package X;

import android.content.Context;
import android.text.Editable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2g9  reason: invalid class name */
public final class AnonymousClass2g9 extends C66803Xj {
    public int A00;
    public C37301m9[] A01 = new C37301m9[0];
    public final /* synthetic */ C69533dg A02;
    public final /* synthetic */ C39781tl A03;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        List<C80153uw> list;
        AnonymousClass00C.A0D(charSequence, 0);
        if (i2 > 0) {
            C69533dg r0 = this.A02;
            C37301m9[] r8 = this.A01;
            AnonymousClass00C.A0D(r8, 0);
            Editable text = r0.A06.getText();
            if (text != null) {
                for (C37301m9 r02 : r8) {
                    int spanStart = text.getSpanStart(r02);
                    int spanEnd = text.getSpanEnd(r02);
                    text.removeSpan(r02);
                    Integer[] numArr = new Integer[2];
                    AnonymousClass000.A1L(numArr, spanStart, 0);
                    AnonymousClass000.A1K(numArr, spanEnd);
                    AnonymousClass00C.A0D(numArr, 0);
                    if (!AnonymousClass000.A1Z(AnonymousClass02R.A0E(numArr), -1)) {
                        text.delete(spanStart, spanEnd);
                    }
                }
            }
        }
        C39781tl r7 = this.A03;
        MentionableEntry mentionableEntry = this.A02.A06;
        UserJid botMention = mentionableEntry.getBotMention();
        if (!AnonymousClass00C.A0J(botMention, r7.A01)) {
            r7.A01 = botMention;
            C19770wU r1 = r7.A06;
            Runnable runnable = r7.A07;
            r1.Bnx(runnable);
            r1.Boy(runnable);
        }
        String obj = charSequence.toString();
        List list2 = r7.A02;
        ArrayList arrayList2 = null;
        if (list2 != null) {
            arrayList = AnonymousClass001.A0I();
            for (Object next : list2) {
                String str = ((C80153uw) next).A01;
                AnonymousClass00C.A0D(obj, 0);
                int A08 = AnonymousClass099.A08(obj, '/', obj.length() - 1);
                if (A08 != -1) {
                    String substring = obj.substring(A08 + 1);
                    AnonymousClass00C.A08(substring);
                    if (!substring.equals(str) && AnonymousClass098.A07(str, substring, false)) {
                        arrayList.add(next);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        C34831hi r3 = r7.A05;
        AnonymousClass3Q4 r12 = (AnonymousClass3Q4) C36401kF.A0m(r3);
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        r3.A0D(new AnonymousClass3Q4(r12.A00, r12.A01, arrayList2));
        String obj2 = charSequence.toString();
        int A0C = AnonymousClass099.A0C(obj2, "/", 0, false);
        if (A0C != -1 && (list = r7.A02) != null) {
            for (C80153uw r03 : list) {
                String str2 = r03.A01;
                int length = str2.length();
                int i4 = length + A0C;
                AnonymousClass00C.A0D(obj2, 0);
                if (i4 <= obj2.length() - 1) {
                    String A16 = C36431kI.A16(A0C, i4 + 1, obj2);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append('/');
                    if (A16.equals(AnonymousClass000.A0q(str2, A0u))) {
                        if (charSequence.length() != this.A00) {
                            this.A00 = charSequence.length();
                            Context A0B = C36371kC.A0B(mentionableEntry);
                            int A002 = AnonymousClass00F.A00(A0B, C36341k9.A05(A0B));
                            Editable text2 = mentionableEntry.getText();
                            if (text2 != null) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append('/');
                                A0u2.append(str2);
                                int A0C2 = AnonymousClass099.A0C(text2, AnonymousClass000.A0t(A0u2, ' '), 0, false);
                                if (A0C2 != -1) {
                                    text2.setSpan(new C37301m9(A002), A0C2, length + A0C2 + 1, 33);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public AnonymousClass2g9(C69533dg r2, C39781tl r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.beforeTextChanged(charSequence, i, i2, i3);
        MentionableEntry mentionableEntry = this.A02.A06;
        Object[] spans = mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), C37301m9.class);
        AnonymousClass00C.A08(spans);
        this.A01 = (C37301m9[]) spans;
    }
}
