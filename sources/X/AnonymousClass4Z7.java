package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.4Z7  reason: invalid class name */
public class AnonymousClass4Z7 implements C25371Ga {
    public Object A00;
    public final int A01;

    public AnonymousClass4Z7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXx(File file, String str, byte[] bArr) {
        String str2;
        File file2 = file;
        switch (this.A01) {
            case 0:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) ((C48912iG) this.A00).A00;
                sharedTextPreviewDialogFragment.A09.setImageProgressBarVisibility(false);
                sharedTextPreviewDialogFragment.A09.A0O(true, false);
                if (file == null) {
                    str2 = "sharedtextpreviewdialogfragment/gif-preview/file is null";
                    break;
                } else {
                    sharedTextPreviewDialogFragment.startActivityForResult(C53072qj.A00(sharedTextPreviewDialogFragment.A0h(), sharedTextPreviewDialogFragment.A0F, sharedTextPreviewDialogFragment.A0G, (AnonymousClass3T1) null, file2, sharedTextPreviewDialogFragment.A0A), 27);
                    return;
                }
            case 1:
                AnonymousClass3AE r3 = (AnonymousClass3AE) this.A00;
                WebPagePreviewView webPagePreviewView = r3.A05;
                webPagePreviewView.setImageProgressBarVisibility(false);
                webPagePreviewView.A0O(true, r3.A06);
                if (file == null) {
                    str2 = "ConversationShellWebPagePreviewController/onFileReceived/gif is null";
                    break;
                } else {
                    C90284Zu r1 = (C90284Zu) r3.A02;
                    if (r1.A01 != 0) {
                        C70803fk r12 = (C70803fk) r1.A00;
                        AnonymousClass155 A0C = C70803fk.A0C(r12);
                        MentionableEntry mentionableEntry = r12.A4B;
                        r12.A2l.BuO(C53072qj.A00(A0C, r12.A4A, mentionableEntry, r12.A2x.A0F, file2, Collections.singletonList(r12.A45)), 27);
                        return;
                    }
                    return;
                }
            default:
                C48902iF r2 = (C48902iF) this.A00;
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r2.A00;
                textStatusComposerActivity.A0n.setImageProgressBarVisibility(false);
                ((View) r2.A01).setVisibility(0);
                if (file == null) {
                    str2 = "textstatus/gif-preview/file is null";
                    break;
                } else {
                    Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
                    ArrayList A0I = AnonymousClass001.A0I();
                    A0I.add(fromFile);
                    String stringText = textStatusComposerActivity.A0f.getStringText();
                    AnonymousClass6QO r13 = new AnonymousClass6QO(fromFile);
                    r13.A0H(stringText);
                    r13.A0G(C36421kH.A0V());
                    C132366Tg r32 = new C132366Tg(r13);
                    AnonymousClass3FR r22 = new AnonymousClass3FR(textStatusComposerActivity);
                    r22.A0H = A0I;
                    r22.A0D = C177528dw.A00.getRawString();
                    r22.A02 = 9;
                    r22.A0N = true;
                    r22.A04 = 33;
                    AnonymousClass3FR.A00(r32, r22);
                    textStatusComposerActivity.BuO(r22.A01(), 1);
                    return;
                }
        }
        Log.e(str2);
    }

    public void onFailure(Exception exc) {
        if (1 - this.A01 == 0) {
            AnonymousClass3AE r4 = (AnonymousClass3AE) this.A00;
            WebPagePreviewView webPagePreviewView = r4.A05;
            webPagePreviewView.setImageProgressBarVisibility(false);
            webPagePreviewView.A0O(true, r4.A06);
            C90284Zu r1 = (C90284Zu) r4.A02;
            if (r1.A01 != 0 && (exc instanceof IOException)) {
                C70803fk.A09((C70803fk) r1.A00).A07(R.string.f12nameremoved, 0);
            }
        }
    }
}
