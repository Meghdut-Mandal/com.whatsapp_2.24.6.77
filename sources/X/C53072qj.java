package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.mentions.MentionableEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2qj  reason: invalid class name and case insensitive filesystem */
public abstract class C53072qj {
    public static Intent A00(Activity activity, AnonymousClass1YL r6, MentionableEntry mentionableEntry, AnonymousClass3T1 r8, File file, List list) {
        Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(fromFile);
        String stringText = mentionableEntry.getStringText();
        AnonymousClass6QO r2 = new AnonymousClass6QO(fromFile);
        r2.A0H(stringText);
        r6.A01(r2.A0D(), mentionableEntry.getMentions());
        r2.A0J(r2.A0D());
        C132366Tg r3 = new C132366Tg(r2);
        AnonymousClass3FR r22 = new AnonymousClass3FR(activity);
        r22.A0H = A0I;
        r22.A02 = 9;
        r22.A0N = true;
        AnonymousClass3FR.A00(r3, r22);
        if (list.size() == 1) {
            r22.A0D = AnonymousClass143.A03((Jid) C36391kE.A0t(list));
        } else {
            r22.A0G = AnonymousClass143.A07(list);
        }
        if (r8 != null) {
            r22.A07 = r8.A1N;
            r22.A0E = AnonymousClass143.A03(C66013Ui.A06(r8));
        }
        r22.A04 = 19;
        return r22.A01();
    }
}
